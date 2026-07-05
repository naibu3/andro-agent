package com.stripe.android.uicore;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/uicore/FormInsets;", "", ViewProps.START, "", "top", ViewProps.END, "bottom", "<init>", "(FFFF)V", "getStart", "()F", "getTop", "getEnd", "getBottom", "asPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FormInsets {
    public static final int $stable = 0;
    private final float bottom;
    private final float end;
    private final float start;
    private final float top;

    public static /* synthetic */ FormInsets copy$default(FormInsets formInsets, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = formInsets.start;
        }
        if ((i & 2) != 0) {
            f2 = formInsets.top;
        }
        if ((i & 4) != 0) {
            f3 = formInsets.end;
        }
        if ((i & 8) != 0) {
            f4 = formInsets.bottom;
        }
        return formInsets.copy(f, f2, f3, f4);
    }

    /* renamed from: component1, reason: from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: component3, reason: from getter */
    public final float getEnd() {
        return this.end;
    }

    /* renamed from: component4, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final FormInsets copy(float start, float top, float end, float bottom) {
        return new FormInsets(start, top, end, bottom);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormInsets)) {
            return false;
        }
        FormInsets formInsets = (FormInsets) other;
        return Float.compare(this.start, formInsets.start) == 0 && Float.compare(this.top, formInsets.top) == 0 && Float.compare(this.end, formInsets.end) == 0 && Float.compare(this.bottom, formInsets.bottom) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.start) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.end)) * 31) + Float.hashCode(this.bottom);
    }

    public String toString() {
        return "FormInsets(start=" + this.start + ", top=" + this.top + ", end=" + this.end + ", bottom=" + this.bottom + ")";
    }

    public FormInsets(float f, float f2, float f3, float f4) {
        this.start = f;
        this.top = f2;
        this.end = f3;
        this.bottom = f4;
    }

    public final float getStart() {
        return this.start;
    }

    public final float getTop() {
        return this.top;
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final PaddingValues asPaddingValues() {
        return PaddingKt.m1016PaddingValuesa9UjIt4(Dp.m6117constructorimpl(this.start), Dp.m6117constructorimpl(this.top), Dp.m6117constructorimpl(this.end), Dp.m6117constructorimpl(this.bottom));
    }
}
