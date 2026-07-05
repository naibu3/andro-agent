package com.stripe.android.paymentsheet.ui;

import androidx.compose.ui.graphics.Color;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PrimaryButtonTheme.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;", "", "background", "Landroidx/compose/ui/graphics/Color;", "onBackground", "successBackground", "onSuccessBackground", "border", "<init>", "(JJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground-0d7_KjU", "()J", "J", "getOnBackground-0d7_KjU", "getSuccessBackground-0d7_KjU", "getOnSuccessBackground-0d7_KjU", "getBorder-0d7_KjU", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "copy", "copy-t635Npw", "(JJJJJ)Lcom/stripe/android/paymentsheet/ui/PrimaryButtonColors;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class PrimaryButtonColors {
    public static final int $stable = 0;
    private final long background;
    private final long border;
    private final long onBackground;
    private final long onSuccessBackground;
    private final long successBackground;

    public /* synthetic */ PrimaryButtonColors(long j, long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5);
    }

    /* renamed from: copy-t635Npw$default, reason: not valid java name */
    public static /* synthetic */ PrimaryButtonColors m8496copyt635Npw$default(PrimaryButtonColors primaryButtonColors, long j, long j2, long j3, long j4, long j5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = primaryButtonColors.background;
        }
        long j6 = j;
        if ((i & 2) != 0) {
            j2 = primaryButtonColors.onBackground;
        }
        return primaryButtonColors.m8502copyt635Npw(j6, j2, (i & 4) != 0 ? primaryButtonColors.successBackground : j3, (i & 8) != 0 ? primaryButtonColors.onSuccessBackground : j4, (i & 16) != 0 ? primaryButtonColors.border : j5);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getSuccessBackground() {
        return this.successBackground;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnSuccessBackground() {
        return this.onSuccessBackground;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: copy-t635Npw, reason: not valid java name */
    public final PrimaryButtonColors m8502copyt635Npw(long background, long onBackground, long successBackground, long onSuccessBackground, long border) {
        return new PrimaryButtonColors(background, onBackground, successBackground, onSuccessBackground, border, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimaryButtonColors)) {
            return false;
        }
        PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) other;
        return Color.m3658equalsimpl0(this.background, primaryButtonColors.background) && Color.m3658equalsimpl0(this.onBackground, primaryButtonColors.onBackground) && Color.m3658equalsimpl0(this.successBackground, primaryButtonColors.successBackground) && Color.m3658equalsimpl0(this.onSuccessBackground, primaryButtonColors.onSuccessBackground) && Color.m3658equalsimpl0(this.border, primaryButtonColors.border);
    }

    public int hashCode() {
        return (((((((Color.m3664hashCodeimpl(this.background) * 31) + Color.m3664hashCodeimpl(this.onBackground)) * 31) + Color.m3664hashCodeimpl(this.successBackground)) * 31) + Color.m3664hashCodeimpl(this.onSuccessBackground)) * 31) + Color.m3664hashCodeimpl(this.border);
    }

    public String toString() {
        return "PrimaryButtonColors(background=" + Color.m3665toStringimpl(this.background) + ", onBackground=" + Color.m3665toStringimpl(this.onBackground) + ", successBackground=" + Color.m3665toStringimpl(this.successBackground) + ", onSuccessBackground=" + Color.m3665toStringimpl(this.onSuccessBackground) + ", border=" + Color.m3665toStringimpl(this.border) + ")";
    }

    private PrimaryButtonColors(long j, long j2, long j3, long j4, long j5) {
        this.background = j;
        this.onBackground = j2;
        this.successBackground = j3;
        this.onSuccessBackground = j4;
        this.border = j5;
    }

    public /* synthetic */ PrimaryButtonColors(long j, long j2, long j3, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j, (i & 2) != 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j2, (i & 4) != 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j3, (i & 8) != 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j4, (i & 16) != 0 ? Color.INSTANCE.m3693getUnspecified0d7_KjU() : j5, null);
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m8503getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m8505getOnBackground0d7_KjU() {
        return this.onBackground;
    }

    /* renamed from: getSuccessBackground-0d7_KjU, reason: not valid java name */
    public final long m8507getSuccessBackground0d7_KjU() {
        return this.successBackground;
    }

    /* renamed from: getOnSuccessBackground-0d7_KjU, reason: not valid java name */
    public final long m8506getOnSuccessBackground0d7_KjU() {
        return this.onSuccessBackground;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m8504getBorder0d7_KjU() {
        return this.border;
    }
}
