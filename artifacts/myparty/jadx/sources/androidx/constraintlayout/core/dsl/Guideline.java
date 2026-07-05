package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;
import com.facebook.react.uimanager.ViewProps;

/* loaded from: classes3.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setStart(int i) {
        this.mStart = i;
        this.configMap.put(ViewProps.START, String.valueOf(this.mStart));
    }

    public int getEnd() {
        return this.mEnd;
    }

    public void setEnd(int i) {
        this.mEnd = i;
        this.configMap.put(ViewProps.END, String.valueOf(this.mEnd));
    }

    public float getPercent() {
        return this.mPercent;
    }

    public void setPercent(float f) {
        this.mPercent = f;
        this.configMap.put("percent", String.valueOf(this.mPercent));
    }
}
