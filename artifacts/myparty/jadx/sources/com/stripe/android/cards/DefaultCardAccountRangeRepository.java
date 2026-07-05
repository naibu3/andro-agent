package com.stripe.android.cards;

import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultCardAccountRangeRepository.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "inMemorySource", "Lcom/stripe/android/cards/CardAccountRangeSource;", "remoteSource", "staticSource", "store", "Lcom/stripe/android/cards/CardAccountRangeStore;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeSource;Lcom/stripe/android/cards/CardAccountRangeStore;)V", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountRanges", "", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCardAccountRangeRepository implements CardAccountRangeRepository {
    public static final int $stable = 8;
    private final CardAccountRangeSource inMemorySource;
    private final StateFlow<Boolean> loading;
    private final CardAccountRangeSource remoteSource;
    private final CardAccountRangeSource staticSource;
    private final CardAccountRangeStore store;

    /* compiled from: DefaultCardAccountRangeRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.DefaultCardAccountRangeRepository", f = "DefaultCardAccountRangeRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {17, 18, 20, 23}, m = "getAccountRange", n = {"this", "cardNumber", "this", "cardNumber", "this", "cardNumber"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultCardAccountRangeRepository.this.getAccountRange(null, this);
        }
    }

    /* compiled from: DefaultCardAccountRangeRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.cards.DefaultCardAccountRangeRepository", f = "DefaultCardAccountRangeRepository.kt", i = {0, 0, 1, 1, 2, 2}, l = {31, 32, 34, 37}, m = "getAccountRanges", n = {"this", "cardNumber", "this", "cardNumber", "this", "cardNumber"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRanges$1, reason: invalid class name and case insensitive filesystem */
    static final class C08001 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C08001(Continuation<? super C08001> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultCardAccountRangeRepository.this.getAccountRanges(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean loading$lambda$3(boolean z, boolean z2, boolean z3) {
        return z || z2 || z3;
    }

    public DefaultCardAccountRangeRepository(CardAccountRangeSource inMemorySource, CardAccountRangeSource remoteSource, CardAccountRangeSource staticSource, CardAccountRangeStore store) {
        Intrinsics.checkNotNullParameter(inMemorySource, "inMemorySource");
        Intrinsics.checkNotNullParameter(remoteSource, "remoteSource");
        Intrinsics.checkNotNullParameter(staticSource, "staticSource");
        Intrinsics.checkNotNullParameter(store, "store");
        this.inMemorySource = inMemorySource;
        this.remoteSource = remoteSource;
        this.staticSource = staticSource;
        this.store = store;
        this.loading = StateFlowsKt.combineAsStateFlow(inMemorySource.getLoading(), remoteSource.getLoading(), staticSource.getLoading(), new Function3() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(DefaultCardAccountRangeRepository.loading$lambda$3(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue()));
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b3, code lost:
    
        if (r10 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        AnonymousClass1 anonymousClass1;
        DefaultCardAccountRangeRepository defaultCardAccountRangeRepository;
        AccountRange accountRange;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objContains = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objContains);
            Bin bin = unvalidated.getBin();
            if (bin == null) {
                return null;
            }
            CardAccountRangeStore cardAccountRangeStore = this.store;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = unvalidated;
            anonymousClass1.label = 1;
            objContains = cardAccountRangeStore.contains(bin, anonymousClass1);
            if (objContains != coroutine_suspended) {
                defaultCardAccountRangeRepository = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            unvalidated = (CardNumber.Unvalidated) anonymousClass1.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objContains);
        } else if (i == 2) {
            unvalidated = (CardNumber.Unvalidated) anonymousClass1.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objContains);
            accountRange = (AccountRange) objContains;
            if (accountRange == null) {
            }
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objContains);
                return (AccountRange) objContains;
            }
            unvalidated = (CardNumber.Unvalidated) anonymousClass1.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objContains);
            accountRange = (AccountRange) objContains;
            if (accountRange == null) {
                return accountRange;
            }
            CardAccountRangeSource cardAccountRangeSource = defaultCardAccountRangeRepository.staticSource;
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 4;
            objContains = cardAccountRangeSource.getAccountRange(unvalidated, anonymousClass1);
        }
        if (((Boolean) objContains).booleanValue()) {
            CardAccountRangeSource cardAccountRangeSource2 = defaultCardAccountRangeRepository.inMemorySource;
            anonymousClass1.L$0 = defaultCardAccountRangeRepository;
            anonymousClass1.L$1 = unvalidated;
            anonymousClass1.label = 2;
            objContains = cardAccountRangeSource2.getAccountRange(unvalidated, anonymousClass1);
        } else {
            CardAccountRangeSource cardAccountRangeSource3 = defaultCardAccountRangeRepository.remoteSource;
            anonymousClass1.L$0 = defaultCardAccountRangeRepository;
            anonymousClass1.L$1 = unvalidated;
            anonymousClass1.label = 3;
            objContains = cardAccountRangeSource3.getAccountRange(unvalidated, anonymousClass1);
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        if (r10 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
    
        if (r10 != r1) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        C08001 c08001;
        DefaultCardAccountRangeRepository defaultCardAccountRangeRepository;
        List list;
        if (continuation instanceof C08001) {
            c08001 = (C08001) continuation;
            if ((c08001.label & Integer.MIN_VALUE) != 0) {
                c08001.label -= Integer.MIN_VALUE;
            } else {
                c08001 = new C08001(continuation);
            }
        }
        Object objContains = c08001.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08001.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objContains);
            Bin bin = unvalidated.getBin();
            if (bin == null) {
                return null;
            }
            CardAccountRangeStore cardAccountRangeStore = this.store;
            c08001.L$0 = this;
            c08001.L$1 = unvalidated;
            c08001.label = 1;
            objContains = cardAccountRangeStore.contains(bin, c08001);
            if (objContains != coroutine_suspended) {
                defaultCardAccountRangeRepository = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            unvalidated = (CardNumber.Unvalidated) c08001.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c08001.L$0;
            ResultKt.throwOnFailure(objContains);
        } else if (i == 2) {
            unvalidated = (CardNumber.Unvalidated) c08001.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c08001.L$0;
            ResultKt.throwOnFailure(objContains);
            list = (List) objContains;
            if (list != null) {
            }
            CardAccountRangeSource cardAccountRangeSource = defaultCardAccountRangeRepository.staticSource;
            c08001.L$0 = null;
            c08001.L$1 = null;
            c08001.label = 4;
            objContains = cardAccountRangeSource.getAccountRanges(unvalidated, c08001);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objContains);
                return (List) objContains;
            }
            unvalidated = (CardNumber.Unvalidated) c08001.L$1;
            defaultCardAccountRangeRepository = (DefaultCardAccountRangeRepository) c08001.L$0;
            ResultKt.throwOnFailure(objContains);
            list = (List) objContains;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    return list;
                }
            }
            CardAccountRangeSource cardAccountRangeSource2 = defaultCardAccountRangeRepository.staticSource;
            c08001.L$0 = null;
            c08001.L$1 = null;
            c08001.label = 4;
            objContains = cardAccountRangeSource2.getAccountRanges(unvalidated, c08001);
        }
        if (((Boolean) objContains).booleanValue()) {
            CardAccountRangeSource cardAccountRangeSource3 = defaultCardAccountRangeRepository.inMemorySource;
            c08001.L$0 = defaultCardAccountRangeRepository;
            c08001.L$1 = unvalidated;
            c08001.label = 2;
            objContains = cardAccountRangeSource3.getAccountRanges(unvalidated, c08001);
        } else {
            CardAccountRangeSource cardAccountRangeSource4 = defaultCardAccountRangeRepository.remoteSource;
            c08001.L$0 = defaultCardAccountRangeRepository;
            c08001.L$1 = unvalidated;
            c08001.label = 3;
            objContains = cardAccountRangeSource4.getAccountRanges(unvalidated, c08001);
        }
        return coroutine_suspended;
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }
}
