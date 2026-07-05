package com.qonversion.android.sdk.automations.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.R;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationStyle;
import com.qonversion.android.sdk.automations.mvp.ScreenActivity;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: utils.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"getScreenTransactionAnimations", "Lkotlin/Pair;", "", ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UtilsKt {

    /* compiled from: utils.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QScreenPresentationStyle.values().length];
            try {
                iArr[QScreenPresentationStyle.FullScreen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QScreenPresentationStyle.NoAnimation.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Pair<Integer, Integer> getScreenTransactionAnimations(QScreenPresentationStyle qScreenPresentationStyle) {
        int i = qScreenPresentationStyle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[qScreenPresentationStyle.ordinal()];
        if (i == 1) {
            return new Pair<>(Integer.valueOf(R.anim.q_slide_in_from_bottom), Integer.valueOf(R.anim.q_slide_out_to_bottom));
        }
        if (i != 2) {
            return null;
        }
        return new Pair<>(0, 0);
    }
}
