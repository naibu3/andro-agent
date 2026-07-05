package com.stripe.android.paymentsheet.paymentdatacollection.polling;

import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* compiled from: PollingScreen.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;", "", "<init>", "()V", "extended", "Landroidx/compose/ui/unit/Dp;", "getExtended-D9Ej5fM", "()F", "F", "normal", "getNormal-D9Ej5fM", "lineHeightMultiplier", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Spacing {
    public static final float lineHeightMultiplier = 1.3f;
    public static final Spacing INSTANCE = new Spacing();
    private static final float extended = Dp.m6117constructorimpl(12);
    private static final float normal = Dp.m6117constructorimpl(8);

    private Spacing() {
    }

    /* renamed from: getExtended-D9Ej5fM, reason: not valid java name */
    public final float m8409getExtendedD9Ej5fM() {
        return extended;
    }

    /* renamed from: getNormal-D9Ej5fM, reason: not valid java name */
    public final float m8410getNormalD9Ej5fM() {
        return normal;
    }
}
