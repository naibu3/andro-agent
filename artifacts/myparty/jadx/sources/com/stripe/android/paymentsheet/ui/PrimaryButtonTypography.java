package com.stripe.android.paymentsheet.ui;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.TextUnit;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimaryButtonTheme.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ&\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;", "", ViewProps.FONT_FAMILY, "Landroidx/compose/ui/text/font/FontFamily;", ViewProps.FONT_SIZE, "Landroidx/compose/ui/unit/TextUnit;", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontSize-XSAIIZE", "()J", "J", "component1", "component2", "component2-XSAIIZE", "copy", "copy-mpE4wyQ", "(Landroidx/compose/ui/text/font/FontFamily;J)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonTypography;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonTypography {
    public static final int $stable = 0;
    private final FontFamily fontFamily;
    private final long fontSize;

    public /* synthetic */ PrimaryButtonTypography(FontFamily fontFamily, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontFamily, j);
    }

    /* renamed from: copy-mpE4wyQ$default, reason: not valid java name */
    public static /* synthetic */ PrimaryButtonTypography m8525copympE4wyQ$default(PrimaryButtonTypography primaryButtonTypography, FontFamily fontFamily, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            fontFamily = primaryButtonTypography.fontFamily;
        }
        if ((i & 2) != 0) {
            j = primaryButtonTypography.fontSize;
        }
        return primaryButtonTypography.m8527copympE4wyQ(fontFamily, j);
    }

    /* renamed from: component1, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    /* renamed from: component2-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: copy-mpE4wyQ, reason: not valid java name */
    public final PrimaryButtonTypography m8527copympE4wyQ(FontFamily fontFamily, long fontSize) {
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
        FontFamily fontFamily = this.fontFamily;
        return ((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + TextUnit.m6311hashCodeimpl(this.fontSize);
    }

    public String toString() {
        return "PrimaryButtonTypography(fontFamily=" + this.fontFamily + ", fontSize=" + TextUnit.m6317toStringimpl(this.fontSize) + ")";
    }

    private PrimaryButtonTypography(FontFamily fontFamily, long j) {
        this.fontFamily = fontFamily;
        this.fontSize = j;
    }

    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public /* synthetic */ PrimaryButtonTypography(FontFamily fontFamily, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fontFamily, (i & 2) != 0 ? TextUnit.INSTANCE.m6321getUnspecifiedXSAIIZE() : j, null);
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m8528getFontSizeXSAIIZE() {
        return this.fontSize;
    }
}
