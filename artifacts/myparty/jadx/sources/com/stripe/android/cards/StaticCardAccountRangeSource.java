package com.stripe.android.cards;

import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.model.AccountRange;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: StaticCardAccountRangeSource.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/StaticCardAccountRangeSource;", "Lcom/stripe/android/cards/CardAccountRangeSource;", "accountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "<init>", "(Lcom/stripe/android/cards/StaticCardAccountRanges;)V", "loading", "Lkotlinx/coroutines/flow/StateFlow;", "", "getLoading", "()Lkotlinx/coroutines/flow/StateFlow;", "getAccountRanges", "", "Lcom/stripe/android/model/AccountRange;", "cardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "(Lcom/stripe/android/cards/CardNumber$Unvalidated;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StaticCardAccountRangeSource implements CardAccountRangeSource {
    public static final int $stable = 8;
    private final StaticCardAccountRanges accountRanges;
    private final StateFlow<Boolean> loading;

    /* JADX WARN: Multi-variable type inference failed */
    public StaticCardAccountRangeSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRange(CardNumber.Unvalidated unvalidated, Continuation<? super AccountRange> continuation) {
        return CardAccountRangeSource.DefaultImpls.getAccountRange(this, unvalidated, continuation);
    }

    public StaticCardAccountRangeSource(StaticCardAccountRanges accountRanges) {
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.accountRanges = accountRanges;
        this.loading = StateFlowsKt.stateFlowOf(false);
    }

    public /* synthetic */ StaticCardAccountRangeSource(DefaultStaticCardAccountRanges defaultStaticCardAccountRanges, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new DefaultStaticCardAccountRanges() : defaultStaticCardAccountRanges);
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.cards.CardAccountRangeSource
    public Object getAccountRanges(CardNumber.Unvalidated unvalidated, Continuation<? super List<AccountRange>> continuation) {
        return this.accountRanges.filter(unvalidated);
    }
}
