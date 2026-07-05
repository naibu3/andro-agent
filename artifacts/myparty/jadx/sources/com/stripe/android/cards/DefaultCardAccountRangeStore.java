package com.stripe.android.cards;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DefaultCardAccountRangeStore.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore;", "Lcom/stripe/android/cards/CardAccountRangeStore;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "accountRangeJsonParser", "Lcom/stripe/android/model/parsers/AccountRangeJsonParser;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "get", "", "Lcom/stripe/android/model/AccountRange;", "bin", "Lcom/stripe/android/cards/Bin;", "(Lcom/stripe/android/cards/Bin;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "accountRanges", "contains", "", "createPrefKey", "", "createPrefKey$payments_core_release", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultCardAccountRangeStore implements CardAccountRangeStore {
    private static final String PREF_FILE = "InMemoryCardAccountRangeSource.Store.2";
    private static final String PREF_KEY_ACCOUNT_RANGES = "key_account_ranges";
    private static final int VERSION = 2;
    private final AccountRangeJsonParser accountRangeJsonParser;
    private final Context context;

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public DefaultCardAccountRangeStore(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.accountRangeJsonParser = new AccountRangeJsonParser();
        this.prefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.cards.DefaultCardAccountRangeStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultCardAccountRangeStore.prefs_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(DefaultCardAccountRangeStore defaultCardAccountRangeStore) {
        return defaultCardAccountRangeStore.context.getSharedPreferences(PREF_FILE, 0);
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object get(Bin bin, Continuation<? super List<AccountRange>> continuation) {
        Set<String> stringSet = getPrefs().getStringSet(createPrefKey$payments_core_release(bin), null);
        if (stringSet == null) {
            stringSet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = stringSet.iterator();
        while (it.hasNext()) {
            AccountRange accountRange = this.accountRangeJsonParser.parse(new JSONObject((String) it.next()));
            if (accountRange != null) {
                arrayList.add(accountRange);
            }
        }
        return arrayList;
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public void save(Bin bin, List<AccountRange> accountRanges) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
        List<AccountRange> list = accountRanges;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.accountRangeJsonParser.serialize((AccountRange) it.next()).toString());
        }
        getPrefs().edit().putStringSet(createPrefKey$payments_core_release(bin), CollectionsKt.toSet(arrayList)).apply();
    }

    @Override // com.stripe.android.cards.CardAccountRangeStore
    public Object contains(Bin bin, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(getPrefs().contains(createPrefKey$payments_core_release(bin)));
    }

    public final String createPrefKey$payments_core_release(Bin bin) {
        Intrinsics.checkNotNullParameter(bin, "bin");
        return "key_account_ranges:" + bin;
    }

    /* compiled from: DefaultCardAccountRangeStore.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/cards/DefaultCardAccountRangeStore$Companion;", "", "<init>", "()V", "VERSION", "", "PREF_FILE", "", "PREF_KEY_ACCOUNT_RANGES", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
