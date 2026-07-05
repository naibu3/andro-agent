package com.stripe.android.uicore;

import androidx.compose.ui.focus.FocusManager;
import com.stripe.android.core.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FocusManagerKt.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"moveFocusSafely", "", "Landroidx/compose/ui/focus/FocusManager;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocusSafely-Mxy_nc0", "(Landroidx/compose/ui/focus/FocusManager;I)Z", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusManagerKtKt {
    private static final void moveFocusSafely_Mxy_nc0$logError(Exception exc) {
        Logger.INSTANCE.getInstance(false).warning("Skipping moving focus due to exception: " + exc);
    }

    /* renamed from: moveFocusSafely-Mxy_nc0, reason: not valid java name */
    public static final boolean m8697moveFocusSafelyMxy_nc0(FocusManager moveFocusSafely, int i) {
        Intrinsics.checkNotNullParameter(moveFocusSafely, "$this$moveFocusSafely");
        try {
            return moveFocusSafely.mo3343moveFocus3ESFkO8(i);
        } catch (IllegalArgumentException e) {
            moveFocusSafely_Mxy_nc0$logError(e);
            return false;
        } catch (IllegalStateException e2) {
            moveFocusSafely_Mxy_nc0$logError(e2);
            return false;
        }
    }
}
