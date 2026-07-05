package com.stripe.android.uicore;

import androidx.compose.ui.unit.TextUnit;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ&\u0010\u0011\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/uicore/PrimaryButtonTypography;", "", ViewProps.FONT_FAMILY, "", ViewProps.FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", "<init>", "(Ljava/lang/Integer;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontSize-XSAIIZE", "()J", "J", "component1", "component2", "component2-XSAIIZE", "copy", "copy-mpE4wyQ", "(Ljava/lang/Integer;J)Lcom/stripe/android/uicore/PrimaryButtonTypography;", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonTypography {
    public static final int $stable = 0;
    private final Integer fontFamily;
    private final long fontSize;

    public /* synthetic */ PrimaryButtonTypography(Integer num, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, j);
    }

    /* renamed from: copy-mpE4wyQ$default, reason: not valid java name */
    public static /* synthetic */ PrimaryButtonTypography m8710copympE4wyQ$default(PrimaryButtonTypography primaryButtonTypography, Integer num, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            num = primaryButtonTypography.fontFamily;
        }
        if ((i & 2) != 0) {
            j = primaryButtonTypography.fontSize;
        }
        return primaryButtonTypography.m8712copympE4wyQ(num, j);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component2-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: copy-mpE4wyQ, reason: not valid java name */
    public final PrimaryButtonTypography m8712copympE4wyQ(Integer fontFamily, long fontSize) {
        return new PrimaryButtonTypography(fontFamily, fontSize, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonTypography)) {
            return false;
        }
        PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) other;
        return Intrinsics.areEqual(this.fontFamily, primaryButtonTypography.fontFamily) && TextUnit.m6307equalsimpl0(this.fontSize, primaryButtonTypography.fontSize);
    }

    public int hashCode() {
        Integer num = this.fontFamily;
        return ((num == null ? 0 : num.hashCode()) * 31) + TextUnit.m6311hashCodeimpl(this.fontSize);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.fontFamily + ", fontSize=" + TextUnit.m6317toStringimpl(this.fontSize) + ")";
    }

    private PrimaryButtonTypography(Integer num, long j) {
        this.fontFamily = num;
        this.fontSize = j;
    }

    public final Integer getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m8713getFontSizeXSAIIZE() {
        return this.fontSize;
    }
}
