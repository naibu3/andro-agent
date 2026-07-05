package com.stripe.android.link.utils;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

/* compiled from: Animations.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LINK_SCREEN_SIZE_ANIMATION_DURATION_MILLIS", "", "LINK_IME_ANIMATION_DURATION_MILLIS", "LINK_DEFAULT_ANIMATION_DELAY_MILLIS", "", "LinkScreenTransition", "Landroidx/compose/animation/ContentTransform;", "getLinkScreenTransition", "()Landroidx/compose/animation/ContentTransform;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AnimationsKt {
    public static final long LINK_DEFAULT_ANIMATION_DELAY_MILLIS = 650;
    private static final int LINK_IME_ANIMATION_DURATION_MILLIS = 350;
    public static final int LINK_SCREEN_SIZE_ANIMATION_DURATION_MILLIS = 300;
    private static final ContentTransform LinkScreenTransition = new ContentTransform(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null), 0.0f, AnimatedContentKt.SizeTransform$default(false, new Function2() { // from class: com.stripe.android.link.utils.AnimationsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return AnimationsKt.LinkScreenTransition$lambda$0((IntSize) obj, (IntSize) obj2);
        }
    }, 1, null), 4, null);

    public static final ContentTransform getLinkScreenTransition() {
        return LinkScreenTransition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec LinkScreenTransition$lambda$0(IntSize intSize, IntSize intSize2) {
        return AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    }
}
