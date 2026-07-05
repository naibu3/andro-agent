package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Args.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/Args;", "", "lastFour", "", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "cvc", "isTestMode", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Z)V", "getLastFour", "()Ljava/lang/String;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "getCvc", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Args {
    public static final int $stable = 0;
    private final CardBrand cardBrand;
    private final String cvc;
    private final boolean isTestMode;
    private final String lastFour;

    public static /* synthetic */ Args copy$default(Args args, String str, CardBrand cardBrand, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = args.lastFour;
        }
        if ((i & 2) != 0) {
            cardBrand = args.cardBrand;
        }
        if ((i & 4) != 0) {
            str2 = args.cvc;
        }
        if ((i & 8) != 0) {
            z = args.isTestMode;
        }
        return args.copy(str, cardBrand, str2, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* renamed from: component2, reason: from getter */
    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCvc() {
        return this.cvc;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    public final Args copy(String lastFour, CardBrand cardBrand, String cvc, boolean isTestMode) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        return new Args(lastFour, cardBrand, cvc, isTestMode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Args)) {
            return false;
        }
        Args args = (Args) other;
        return Intrinsics.areEqual(this.lastFour, args.lastFour) && this.cardBrand == args.cardBrand && Intrinsics.areEqual(this.cvc, args.cvc) && this.isTestMode == args.isTestMode;
    }

    public int hashCode() {
        return (((((this.lastFour.hashCode() * 31) + this.cardBrand.hashCode()) * 31) + this.cvc.hashCode()) * 31) + Boolean.hashCode(this.isTestMode);
    }

    public String toString() {
        return "Args(lastFour=" + this.lastFour + ", cardBrand=" + this.cardBrand + ", cvc=" + this.cvc + ", isTestMode=" + this.isTestMode + ")";
    }

    public Args(String lastFour, CardBrand cardBrand, String cvc, boolean z) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        Intrinsics.checkNotNullParameter(cvc, "cvc");
        this.lastFour = lastFour;
        this.cardBrand = cardBrand;
        this.cvc = cvc;
        this.isTestMode = z;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final String getCvc() {
        return this.cvc;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }
}
