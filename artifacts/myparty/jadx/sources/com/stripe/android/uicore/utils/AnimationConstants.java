package com.stripe.android.uicore.utils;

import com.stripe.android.uicore.R;
import kotlin.Metadata;

/* compiled from: AnimationConstants.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/uicore/utils/AnimationConstants;", "", "<init>", "()V", "FADE_IN", "", "getFADE_IN", "()I", "FADE_OUT", "getFADE_OUT", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnimationConstants {
    public static final int $stable = 0;
    public static final AnimationConstants INSTANCE = new AnimationConstants();
    private static final int FADE_IN = R.anim.stripe_transition_fade_in;
    private static final int FADE_OUT = R.anim.stripe_transition_fade_out;

    private AnimationConstants() {
    }

    public final int getFADE_IN() {
        return FADE_IN;
    }

    public final int getFADE_OUT() {
        return FADE_OUT;
    }
}
