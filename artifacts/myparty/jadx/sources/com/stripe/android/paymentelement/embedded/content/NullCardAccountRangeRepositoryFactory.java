package com.stripe.android.paymentelement.embedded.content;

import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: NullUiDefinitionFactoryHelper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory;", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "createWithStripeRepository", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "publishableKey", "", "NullCardAccountRangeRepository", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class NullCardAccountRangeRepositoryFactory implements CardAccountRangeRepository.Factory {
    public static final NullCardAccountRangeRepositoryFactory INSTANCE = new NullCardAccountRangeRepositoryFactory();

    private NullCardAccountRangeRepositoryFactory() {
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository create() {
        return NullCardAccountRangeRepository.INSTANCE;
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository.Factory
    public CardAccountRangeRepository createWithStripeRepository(StripeRepository stripeRepository, String publishableKey) {
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        return NullCardAccountRangeRepository.INSTANCE;
    }

    /* compiled from: NullUiDefinitionFactoryHelper.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/NullCardAccountRangeRepositoryFactory$NullCardAccountRangeRepository;", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "<init>", "()V", "getAccountRange", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccountRanges", "", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NullCardAccountRangeRepository implements CardAccountRangeRepository {
        public static final NullCardAccountRangeRepository INSTANCE = new NullCardAccountRangeRepository();
        private static final StateFlow<Boolean> loading = StateFlowsKt.stateFlowOf(false);

        @Override // com.stripe.android.cards.CardAccountRangeRepository
        public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
            return null;
        }

        @Override // com.stripe.android.cards.CardAccountRangeRepository
        public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
            return null;
        }

        private NullCardAccountRangeRepository() {
        }

        @Override // com.stripe.android.cards.CardAccountRangeRepository
        public StateFlow<Boolean> getLoading() {
            return loading;
        }
    }
}
