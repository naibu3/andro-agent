package com.stripe.android.paymentsheet.ui;

import android.R;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PrimaryButtonAnimator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0000¢\u0006\u0002\b\u0010J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u001e\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0002J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "slideAnimationDuration", "", "fadeIn", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "parentWidth", "", "onAnimationEnd", "Lkotlin/Function0;", "fadeIn$paymentsheet_release", "slideToCenter", "delay", "fadeOut", "fadeOut$paymentsheet_release", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PrimaryButtonAnimator {
    public static final long HOLD_ANIMATION_ON_SLIDE_IN_COMPLETION = 1500;
    private final Context context;
    private final long slideAnimationDuration;
    public static final int $stable = 8;

    public PrimaryButtonAnimator(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.slideAnimationDuration = context.getResources().getInteger(R.integer.config_shortAnimTime);
    }

    public final void fadeIn$paymentsheet_release(final View view, final int parentWidth, final Function0<Unit> onAnimationEnd) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onAnimationEnd, "onAnimationEnd");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.context, com.stripe.android.uicore.R.anim.stripe_transition_fade_in);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeIn$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation p0) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation p0) {
                view.setVisibility(0);
                this.slideToCenter(view, parentWidth, onAnimationEnd);
            }
        });
        view.startAnimation(animationLoadAnimation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void slideToCenter(final View view, int parentWidth, final Function0<Unit> onAnimationEnd) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, -((view.getLeft() + ((view.getRight() - view.getLeft()) / 2.0f)) - (parentWidth / 2.0f)));
        objectAnimatorOfFloat.setDuration(this.slideAnimationDuration);
        Intrinsics.checkNotNull(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$slideToCenter$lambda$2$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.delay(view, onAnimationEnd);
            }
        });
        objectAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delay(View view, final Function0<Unit> onAnimationEnd) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "rotation", 0.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(1500L);
        Intrinsics.checkNotNull(objectAnimatorOfFloat);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$delay$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                onAnimationEnd.invoke();
            }
        });
        objectAnimatorOfFloat.start();
    }

    public final void fadeOut$paymentsheet_release(final View view) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "view");
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.context, com.stripe.android.uicore.R.anim.stripe_transition_fade_out);
        animationLoadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.stripe.android.paymentsheet.ui.PrimaryButtonAnimator$fadeOut$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation p0) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation p0) {
                view.setVisibility(0);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation p0) {
                view.setVisibility(4);
            }
        });
        view.startAnimation(animationLoadAnimation);
    }
}
