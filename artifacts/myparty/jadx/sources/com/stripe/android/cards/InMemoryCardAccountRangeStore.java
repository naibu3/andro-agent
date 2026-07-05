package com.stripe.android.cards;

import com.stripe.android.model.AccountRange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InMemoryCardAccountRangeStore.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u000bR \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/cards/InMemoryCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "<init>", "()V", "store", "", "Lcom/stripe/android/cards/Bin;", "", "Lcom/stripe/android/model/AccountRange;", "get", "bin", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "accountRanges", "contains", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InMemoryCardAccountRangeStore implements CardAccountRangeStore {
    public static final int $stable = 8;
    private final Map<Bin, List<AccountRange>> store = new LinkedHashMap();

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object get(Bin bin, Continuation<? super List<AccountRange>> continuation) {
        List<AccountRange> list = this.store.get(bin);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public void save(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        this.store.put(bin, accountRanges);
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object contains(Bin bin, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(this.store.containsKey(bin));
    }
}
