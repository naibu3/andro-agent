package com.stripe.android.lpmfoundations.paymentmethod;

import com.stripe.android.model.ElementsSession;
import com.stripe.android.paymentsheet.state.LinkState;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WalletType.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "GooglePay", "Link", "ShopPay", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WalletType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WalletType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final WalletType GooglePay = new WalletType("GooglePay", 0, "google_pay");
    public static final WalletType Link = new WalletType("Link", 1, "link");
    public static final WalletType ShopPay = new WalletType("ShopPay", 2, "shop_pay");
    private final String code;

    private static final /* synthetic */ WalletType[] $values() {
        return new WalletType[]{GooglePay, Link, ShopPay};
    }

    public static EnumEntries<WalletType> getEntries() {
        return $ENTRIES;
    }

    private WalletType(String str, int i, String str2) {
        this.code = str2;
    }

    public final String getCode() {
        return this.code;
    }

    static {
        WalletType[] walletTypeArr$values = $values();
        $VALUES = walletTypeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(walletTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: WalletType.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType$Companion;", "", "<init>", "()V", "listFrom", "", "Lcom/stripe/android/lpmfoundations/paymentmethod/WalletType;", "elementsSession", "Lcom/stripe/android/model/ElementsSession;", "isGooglePayReady", "", "linkState", "Lcom/stripe/android/paymentsheet/state/LinkState;", "isShopPayAvailable", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: WalletType.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WalletType.values().length];
                try {
                    iArr[WalletType.GooglePay.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WalletType.Link.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WalletType.ShopPay.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<WalletType> listFrom(ElementsSession elementsSession, boolean isGooglePayReady, LinkState linkState, boolean isShopPayAvailable) {
            Integer numValueOf;
            Intrinsics.checkNotNullParameter(elementsSession, "elementsSession");
            EnumEntries<WalletType> entries = WalletType.getEntries();
            ArrayList arrayList = new ArrayList();
            for (WalletType walletType : entries) {
                WalletType walletType2 = walletType;
                boolean zContains = elementsSession.getOrderedPaymentMethodTypesAndWallets().contains(walletType2.getCode());
                int i = WhenMappings.$EnumSwitchMapping$0[walletType2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (isShopPayAvailable && zContains) {
                            arrayList.add(walletType);
                        }
                    } else if (linkState != null) {
                        arrayList.add(walletType);
                    }
                } else if (isGooglePayReady && zContains) {
                    arrayList.add(walletType);
                }
            }
            ArrayList arrayList2 = arrayList;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
            for (Object obj : arrayList2) {
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                WalletType walletType3 = (WalletType) obj;
                int iIndexOf = elementsSession.getOrderedPaymentMethodTypesAndWallets().indexOf(walletType3.getCode());
                if (walletType3 == WalletType.Link) {
                    numValueOf = -1;
                } else {
                    numValueOf = iIndexOf == -1 ? null : Integer.valueOf(iIndexOf);
                }
                linkedHashMap2.put(obj, numValueOf);
            }
            final LinkedHashMap linkedHashMap3 = linkedHashMap;
            final Comparator comparatorNullsLast = ComparisonsKt.nullsLast(ComparisonsKt.naturalOrder());
            return CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: com.stripe.android.lpmfoundations.paymentmethod.WalletType$Companion$listFrom$$inlined$compareBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return comparatorNullsLast.compare((Integer) linkedHashMap3.get((WalletType) t), (Integer) linkedHashMap3.get((WalletType) t2));
                }
            });
        }
    }

    public static WalletType valueOf(String str) {
        return (WalletType) Enum.valueOf(WalletType.class, str);
    }

    public static WalletType[] values() {
        return (WalletType[]) $VALUES.clone();
    }
}
