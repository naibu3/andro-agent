package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: IncrementalDelayCalculator.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/qonversion/android/sdk/internal/IncrementalDelayCalculator;", "", "randomizer", "Ljava/util/Random;", "(Ljava/util/Random;)V", "countDelay", "", "minDelay", "retriesCount", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class IncrementalDelayCalculator {
    private static final float FACTOR = 2.4f;
    private static final float JITTER = 0.4f;
    private static final int MAX_DELAY = 1000;
    private final Random randomizer;

    public IncrementalDelayCalculator(Random randomizer) {
        Intrinsics.checkNotNullParameter(randomizer, "randomizer");
        this.randomizer = randomizer;
    }

    public final int countDelay(int minDelay, int retriesCount) throws IllegalArgumentException {
        float fPow = minDelay + ((float) Math.pow(FACTOR, retriesCount));
        int iRoundToInt = MathKt.roundToInt(JITTER * fPow);
        if (iRoundToInt != Integer.MAX_VALUE) {
            iRoundToInt++;
        }
        return Math.min(MathKt.roundToInt(fPow + this.randomizer.nextInt(iRoundToInt)), 1000);
    }
}
