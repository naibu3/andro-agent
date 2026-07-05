package com.stripe.android.uicore;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/uicore/EmbeddedFloatingStyle;", "", PaymentSheetAppearanceKeys.SPACING, "", "<init>", "(F)V", "getSpacing", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class EmbeddedFloatingStyle {
    public static final int $stable = 0;
    private final float spacing;

    public static /* synthetic */ EmbeddedFloatingStyle copy$default(EmbeddedFloatingStyle embeddedFloatingStyle, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = embeddedFloatingStyle.spacing;
        }
        return embeddedFloatingStyle.copy(f);
    }

    /* renamed from: component1, reason: from getter */
    public final float getSpacing() {
        return this.spacing;
    }

    public final EmbeddedFloatingStyle copy(float spacing) {
        return new EmbeddedFloatingStyle(spacing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EmbeddedFloatingStyle) && Float.compare(this.spacing, ((EmbeddedFloatingStyle) other).spacing) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.spacing);
    }

    public String toString() {
        return "EmbeddedFloatingStyle(spacing=" + this.spacing + ")";
    }

    public EmbeddedFloatingStyle(float f) {
        this.spacing = f;
    }

    public final float getSpacing() {
        return this.spacing;
    }
}
