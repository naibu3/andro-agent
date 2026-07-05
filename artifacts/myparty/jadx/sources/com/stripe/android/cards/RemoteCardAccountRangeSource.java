package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardMetadata;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: RemoteCardAccountRangeSource.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J6\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u001e0 H\u0082H¢\u0006\u0004\b!\u0010\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/stripe/android/cards/RemoteCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "cardAccountRangeStore", "Lcom/stripe/android/cards/CardAccountRangeStore;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/cards/CardAccountRangeStore;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "_loading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "getAccountRanges", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCardMetadataMissingRange", "", "withLoading", "Lkotlin/Result;", "block", "Lkotlin/Function0;", "withLoading-gIAlu-s", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RemoteCardAccountRangeSource implements CardAccountRangeSource {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _loading;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final CardAccountRangeStore cardAccountRangeStore;
    private final StateFlow<Boolean> loading;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final ApiRequest.Options requestOptions;
    private final StripeRepository stripeRepository;

    /* compiled from: RemoteCardAccountRangeSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.RemoteCardAccountRangeSource", f = "RemoteCardAccountRangeSource.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {75, 32, 79}, m = "getAccountRanges", n = {"this", "cardNumber", "bin", "this_$iv", "$completion$iv", "this", "cardNumber", "bin", "this_$iv", "$completion$iv", "this", "cardNumber", "bin", "accountRanges$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.stripe.android.cards.RemoteCardAccountRangeSource$getAccountRanges$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RemoteCardAccountRangeSource.this.getAccountRanges(null, this);
        }
    }

    public RemoteCardAccountRangeSource(StripeRepository stripeRepository, ApiRequest.Options requestOptions, CardAccountRangeStore cardAccountRangeStore, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(requestOptions, "requestOptions");
        Intrinsics.checkNotNullParameter(cardAccountRangeStore, "cardAccountRangeStore");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.stripeRepository = stripeRepository;
        this.requestOptions = requestOptions;
        this.cardAccountRangeStore = cardAccountRangeStore;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        this._loading = MutableStateFlow;
        this.loading = FlowKt.asStateFlow(MutableStateFlow);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.cards.CardAccountRangeSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        AnonymousClass1 anonymousClass1;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource2;
        Bin bin;
        AnonymousClass1 anonymousClass12;
        CardNumber.Unvalidated unvalidated2;
        AnonymousClass1 anonymousClass13;
        Object accountRanges;
        Bin bin2;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource3;
        MainCoroutineDispatcher main;
        RemoteCardAccountRangeSource$withLoading$3 remoteCardAccountRangeSource$withLoading$3;
        Object obj;
        Bin bin3;
        CardNumber.Unvalidated unvalidated3;
        RemoteCardAccountRangeSource remoteCardAccountRangeSource4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj2);
            Bin bin4 = unvalidated.getBin();
            if (bin4 == null) {
                return null;
            }
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            RemoteCardAccountRangeSource$withLoading$2 remoteCardAccountRangeSource$withLoading$2 = new RemoteCardAccountRangeSource$withLoading$2(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = unvalidated;
            anonymousClass1.L$2 = bin4;
            anonymousClass1.L$3 = this;
            anonymousClass1.L$4 = anonymousClass1;
            anonymousClass1.label = 1;
            if (BuildersKt.withContext(main2, remoteCardAccountRangeSource$withLoading$2, anonymousClass1) != coroutine_suspended) {
                remoteCardAccountRangeSource = this;
                remoteCardAccountRangeSource2 = remoteCardAccountRangeSource;
                bin = bin4;
                anonymousClass12 = anonymousClass1;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = anonymousClass1.L$3;
                bin3 = (Bin) anonymousClass1.L$2;
                unvalidated3 = (CardNumber.Unvalidated) anonymousClass1.L$1;
                remoteCardAccountRangeSource4 = (RemoteCardAccountRangeSource) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj2);
                if (Result.m9125isSuccessimpl(obj)) {
                    List<AccountRange> list = (List) obj;
                    remoteCardAccountRangeSource4.cardAccountRangeStore.save(bin3, list);
                    if (!list.isEmpty()) {
                        List<AccountRange> list2 = list;
                        if ((list2 instanceof Collection) && list2.isEmpty()) {
                            if (unvalidated3.getIsValidLuhn()) {
                            }
                        } else {
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                if (((AccountRange) it.next()).getBinRange().matches(unvalidated3)) {
                                    break;
                                }
                            }
                            if (unvalidated3.getIsValidLuhn()) {
                                remoteCardAccountRangeSource4.onCardMetadataMissingRange();
                            }
                        }
                    }
                }
                return (List) (Result.m9124isFailureimpl(obj) ? null : obj);
            }
            anonymousClass13 = (AnonymousClass1) anonymousClass1.L$4;
            remoteCardAccountRangeSource = (RemoteCardAccountRangeSource) anonymousClass1.L$3;
            bin2 = (Bin) anonymousClass1.L$2;
            unvalidated2 = (CardNumber.Unvalidated) anonymousClass1.L$1;
            remoteCardAccountRangeSource3 = (RemoteCardAccountRangeSource) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj2);
            accountRanges = ((Result) obj2).getValue();
            if (Result.m9125isSuccessimpl(accountRanges)) {
                Result.Companion companion = Result.INSTANCE;
                accountRanges = ((CardMetadata) accountRanges).getAccountRanges();
            }
            Object objM9118constructorimpl = Result.m9118constructorimpl(accountRanges);
            main = Dispatchers.getMain();
            remoteCardAccountRangeSource$withLoading$3 = new RemoteCardAccountRangeSource$withLoading$3(remoteCardAccountRangeSource, null);
            anonymousClass1.L$0 = remoteCardAccountRangeSource3;
            anonymousClass1.L$1 = unvalidated2;
            anonymousClass1.L$2 = bin2;
            anonymousClass1.L$3 = objM9118constructorimpl;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 3;
            if (BuildersKt.withContext(main, remoteCardAccountRangeSource$withLoading$3, anonymousClass13) != coroutine_suspended) {
                obj = objM9118constructorimpl;
                bin3 = bin2;
                unvalidated3 = unvalidated2;
                remoteCardAccountRangeSource4 = remoteCardAccountRangeSource3;
                if (Result.m9125isSuccessimpl(obj)) {
                }
                return (List) (Result.m9124isFailureimpl(obj) ? null : obj);
            }
            return coroutine_suspended;
        }
        AnonymousClass1 anonymousClass14 = (AnonymousClass1) anonymousClass1.L$4;
        remoteCardAccountRangeSource = (RemoteCardAccountRangeSource) anonymousClass1.L$3;
        bin = (Bin) anonymousClass1.L$2;
        CardNumber.Unvalidated unvalidated4 = (CardNumber.Unvalidated) anonymousClass1.L$1;
        remoteCardAccountRangeSource2 = (RemoteCardAccountRangeSource) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj2);
        anonymousClass12 = anonymousClass14;
        unvalidated = unvalidated4;
        StripeRepository stripeRepository = remoteCardAccountRangeSource2.stripeRepository;
        ApiRequest.Options options = remoteCardAccountRangeSource2.requestOptions;
        anonymousClass1.L$0 = remoteCardAccountRangeSource2;
        anonymousClass1.L$1 = unvalidated;
        anonymousClass1.L$2 = bin;
        anonymousClass1.L$3 = remoteCardAccountRangeSource;
        anonymousClass1.L$4 = anonymousClass12;
        anonymousClass1.label = 2;
        Object objMo8035getCardMetadata0E7RQCE = stripeRepository.mo8035getCardMetadata0E7RQCE(bin, options, anonymousClass1);
        if (objMo8035getCardMetadata0E7RQCE != coroutine_suspended) {
            Bin bin5 = bin;
            unvalidated2 = unvalidated;
            anonymousClass13 = anonymousClass12;
            accountRanges = objMo8035getCardMetadata0E7RQCE;
            bin2 = bin5;
            remoteCardAccountRangeSource3 = remoteCardAccountRangeSource2;
            if (Result.m9125isSuccessimpl(accountRanges)) {
            }
            Object objM9118constructorimpl2 = Result.m9118constructorimpl(accountRanges);
            main = Dispatchers.getMain();
            remoteCardAccountRangeSource$withLoading$3 = new RemoteCardAccountRangeSource$withLoading$3(remoteCardAccountRangeSource, null);
            anonymousClass1.L$0 = remoteCardAccountRangeSource3;
            anonymousClass1.L$1 = unvalidated2;
            anonymousClass1.L$2 = bin2;
            anonymousClass1.L$3 = objM9118constructorimpl2;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 3;
            if (BuildersKt.withContext(main, remoteCardAccountRangeSource$withLoading$3, anonymousClass13) != coroutine_suspended) {
            }
        }
        return coroutine_suspended;
    }

    private final void onCardMetadataMissingRange() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, null, 62, null));
    }

    /* renamed from: withLoading-gIAlu-s, reason: not valid java name */
    private final Object m7212withLoadinggIAlus(Function0<? extends Result<? extends List<AccountRange>>> function0, Continuation<? super Result<? extends List<AccountRange>>> continuation) {
        BuildersKt.withContext(Dispatchers.getMain(), new RemoteCardAccountRangeSource$withLoading$2(this, null), continuation);
        Object value = function0.invoke().getValue();
        BuildersKt.withContext(Dispatchers.getMain(), new RemoteCardAccountRangeSource$withLoading$3(this, null), continuation);
        return value;
    }
}
