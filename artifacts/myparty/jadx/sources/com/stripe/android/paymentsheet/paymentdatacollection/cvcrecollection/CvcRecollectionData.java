package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;", "", "lastFour", "", "brand", "Lcom/stripe/android/model/CardBrand;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;)V", "getLastFour", "()Ljava/lang/String;", "getBrand", "()Lcom/stripe/android/model/CardBrand;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CvcRecollectionData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CardBrand brand;
    private final String lastFour;

    public static /* synthetic */ CvcRecollectionData copy$default(CvcRecollectionData cvcRecollectionData, String str, CardBrand cardBrand, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cvcRecollectionData.lastFour;
        }
        if ((i & 2) != 0) {
            cardBrand = cvcRecollectionData.brand;
        }
        return cvcRecollectionData.copy(str, cardBrand);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* renamed from: component2, reason: from getter */
    public final CardBrand getBrand() {
        return this.brand;
    }

    public final CvcRecollectionData copy(String lastFour, CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new CvcRecollectionData(lastFour, brand);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvcRecollectionData)) {
            return false;
        }
        CvcRecollectionData cvcRecollectionData = (CvcRecollectionData) other;
        return Intrinsics.areEqual(this.lastFour, cvcRecollectionData.lastFour) && this.brand == cvcRecollectionData.brand;
    }

    public int hashCode() {
        String str = this.lastFour;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.brand.hashCode();
    }

    public String toString() {
        return "CvcRecollectionData(lastFour=" + this.lastFour + ", brand=" + this.brand + ")";
    }

    public CvcRecollectionData(String str, CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.lastFour = str;
        this.brand = brand;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    /* compiled from: CvcRecollectionData.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData$Companion;", "", "<init>", "()V", "fromPaymentSelection", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionData;", "paymentSelection", "Lcom/stripe/android/model/PaymentMethod$Card;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CvcRecollectionData fromPaymentSelection(PaymentMethod.Card paymentSelection) {
            if (paymentSelection != null) {
                return new CvcRecollectionData(paymentSelection.last4, paymentSelection.brand);
            }
            return null;
        }
    }
}
