package com.stripe.android.cards;

import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.BinRange;
import com.stripe.android.model.CardBrand;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardAccountRangeService.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u00013BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020+2\u0006\u0010,\u001a\u00020-J\u0006\u0010/\u001a\u00020+J\u0014\u00100\u001a\u00020+2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0016\u00101\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0010\u00102\u001a\u00020\r2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b \u0010!R&\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00064"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeService;", "", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "accountRangeResultListener", "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "isCbcEligible", "Lkotlin/Function0;", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V", "getStaticCardAccountRanges", "()Lcom/stripe/android/cards/StaticCardAccountRanges;", "isLoading", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", "lastBin", "Lcom/stripe/android/cards/Bin;", "value", "", "Lcom/stripe/android/model/AccountRange;", "accountRanges", "getAccountRanges", "()Ljava/util/List;", "accountRange", "getAccountRange", "()Lcom/stripe/android/model/AccountRange;", "accountRangeRepositoryJob", "Lkotlinx/coroutines/Job;", "getAccountRangeRepositoryJob$annotations", "()V", "getAccountRangeRepositoryJob", "()Lkotlinx/coroutines/Job;", "setAccountRangeRepositoryJob", "(Lkotlinx/coroutines/Job;)V", "onCardNumberChanged", "", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "queryAccountRangeRepository", "cancelAccountRangeRepositoryJob", "updateAccountRangesResult", "shouldQueryRepository", "shouldQueryAccountRange", "AccountRangeResultListener", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CardAccountRangeService {
    public static final int $stable = 8;
    private Job accountRangeRepositoryJob;
    private final AccountRangeResultListener accountRangeResultListener;
    private List<AccountRange> accountRanges;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private final CardBrandFilter cardBrandFilter;
    private final Function0<Boolean> isCbcEligible;
    private final StateFlow<Boolean> isLoading;
    private Bin lastBin;
    private final StaticCardAccountRanges staticCardAccountRanges;
    private final CoroutineContext uiContext;
    private final CoroutineContext workContext;

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;", "", "onAccountRangesResult", "", "accountRanges", "", "Lcom/stripe/android/model/AccountRange;", "unfilteredAccountRanges", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AccountRangeResultListener {
        void onAccountRangesResult(List<AccountRange> accountRanges, List<AccountRange> unfilteredAccountRanges);
    }

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardBrand.UnionPay.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getAccountRangeRepositoryJob$annotations() {
    }

    public CardAccountRangeService(CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext uiContext, CoroutineContext workContext, StaticCardAccountRanges staticCardAccountRanges, AccountRangeResultListener accountRangeResultListener, Function0<Boolean> isCbcEligible, CardBrandFilter cardBrandFilter) {
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(accountRangeResultListener, "accountRangeResultListener");
        Intrinsics.checkNotNullParameter(isCbcEligible, "isCbcEligible");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.uiContext = uiContext;
        this.workContext = workContext;
        this.staticCardAccountRanges = staticCardAccountRanges;
        this.accountRangeResultListener = accountRangeResultListener;
        this.isCbcEligible = isCbcEligible;
        this.cardBrandFilter = cardBrandFilter;
        this.isLoading = cardAccountRangeRepository.getLoading();
        this.accountRanges = CollectionsKt.emptyList();
    }

    public final StaticCardAccountRanges getStaticCardAccountRanges() {
        return this.staticCardAccountRanges;
    }

    public /* synthetic */ CardAccountRangeService(CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, StaticCardAccountRanges staticCardAccountRanges, AccountRangeResultListener accountRangeResultListener, Function0 function0, CardBrandFilter cardBrandFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardAccountRangeRepository, coroutineContext, coroutineContext2, staticCardAccountRanges, accountRangeResultListener, function0, (i & 64) != 0 ? DefaultCardBrandFilter.INSTANCE : cardBrandFilter);
    }

    public final StateFlow<Boolean> isLoading() {
        return this.isLoading;
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }

    public final AccountRange getAccountRange() {
        return (AccountRange) CollectionsKt.firstOrNull((List) this.accountRanges);
    }

    public final Job getAccountRangeRepositoryJob() {
        return this.accountRangeRepositoryJob;
    }

    public final void setAccountRangeRepositoryJob(Job job) {
        this.accountRangeRepositoryJob = job;
    }

    public final void onCardNumberChanged(CardNumber.Unvalidated cardNumber) {
        List<AccountRange> listEmptyList;
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        boolean zBooleanValue = this.isCbcEligible.invoke().booleanValue();
        if (zBooleanValue && cardNumber.getLength() < 8) {
            updateAccountRangesResult(CollectionsKt.emptyList());
            return;
        }
        if (this.isCbcEligible.invoke().booleanValue()) {
            listEmptyList = CbcTestCardDelegate.INSTANCE.onCardNumberChanged(cardNumber);
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.isEmpty()) {
            updateAccountRangesResult(listEmptyList);
            return;
        }
        List<AccountRange> listFilter = this.staticCardAccountRanges.filter(cardNumber);
        if (zBooleanValue) {
            queryAccountRangeRepository(cardNumber);
        } else if (listFilter.isEmpty() || shouldQueryRepository(listFilter)) {
            queryAccountRangeRepository(cardNumber);
        } else {
            updateAccountRangesResult(listFilter);
        }
    }

    public final /* synthetic */ void queryAccountRangeRepository(CardNumber.Unvalidated cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        if (shouldQueryAccountRange(cardNumber)) {
            cancelAccountRangeRepositoryJob();
            this.accountRanges = CollectionsKt.emptyList();
            this.accountRangeRepositoryJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(cardNumber, this, null), 3, null);
        }
    }

    /* compiled from: CardAccountRangeService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1", f = "CardAccountRangeService.kt", i = {}, l = {89, 94}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CardNumber.Unvalidated $cardNumber;
        int label;
        final /* synthetic */ CardAccountRangeService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CardNumber.Unvalidated unvalidated, CardAccountRangeService cardAccountRangeService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$cardNumber = unvalidated;
            this.this$0 = cardAccountRangeService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$cardNumber, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
        
            if (r7 == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r6.this$0.uiContext, new com.stripe.android.cards.CardAccountRangeService.AnonymousClass1.C01441(r6.this$0, r7, null), r6) != r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$cardNumber.getBin() != null) {
                    this.label = 1;
                    obj = this.this$0.cardAccountRangeRepository.getAccountRanges(this.$cardNumber, this);
                } else {
                    list = null;
                    this.label = 2;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            list = (List) obj;
            this.label = 2;
        }

        /* compiled from: CardAccountRangeService.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1", f = "CardAccountRangeService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.cards.CardAccountRangeService$queryAccountRangeRepository$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<AccountRange> $accountRanges;
            int label;
            final /* synthetic */ CardAccountRangeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01441(CardAccountRangeService cardAccountRangeService, List<AccountRange> list, Continuation<? super C01441> continuation) {
                super(2, continuation);
                this.this$0 = cardAccountRangeService;
                this.$accountRanges = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01441(this.this$0, this.$accountRanges, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CardAccountRangeService cardAccountRangeService = this.this$0;
                List<AccountRange> listEmptyList = this.$accountRanges;
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt.emptyList();
                }
                cardAccountRangeService.updateAccountRangesResult(listEmptyList);
                return Unit.INSTANCE;
            }
        }
    }

    public final void cancelAccountRangeRepositoryJob() {
        Job job = this.accountRangeRepositoryJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.accountRangeRepositoryJob = null;
    }

    public final void updateAccountRangesResult(List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        ArrayList arrayList = new ArrayList();
        for (Object obj : accountRanges) {
            if (this.cardBrandFilter.isAccepted(((AccountRange) obj).getBrand())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.accountRanges = arrayList2;
        this.accountRangeResultListener.onAccountRangesResult(arrayList2, accountRanges);
    }

    private final boolean shouldQueryRepository(List<AccountRange> accountRanges) {
        AccountRange accountRange = (AccountRange) CollectionsKt.firstOrNull((List) accountRanges);
        CardBrand brand = accountRange != null ? accountRange.getBrand() : null;
        int i = brand == null ? -1 : WhenMappings.$EnumSwitchMapping$0[brand.ordinal()];
        return i == 1 || i == 2;
    }

    private final boolean shouldQueryAccountRange(CardNumber.Unvalidated cardNumber) {
        AccountRange accountRange;
        BinRange binRange;
        boolean z = getAccountRange() == null || cardNumber.getBin() == null || !(((accountRange = getAccountRange()) == null || (binRange = accountRange.getBinRange()) == null || binRange.matches(cardNumber)) && Intrinsics.areEqual(cardNumber.getBin(), this.lastBin));
        this.lastBin = cardNumber.getBin();
        return z;
    }
}
