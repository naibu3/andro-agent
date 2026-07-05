package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f2773a;

    /* renamed from: b, reason: collision with root package name */
    public int f2774b;

    /* renamed from: c, reason: collision with root package name */
    public float f2775c;

    /* renamed from: d, reason: collision with root package name */
    public float f2776d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f2803g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f2775c = typedArrayObtainStyledAttributes.getFloat(index, this.f2775c);
            } else if (index == 0) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.f2773a);
                this.f2773a = i3;
                this.f2773a = n.f2790d[i3];
            } else if (index == 4) {
                this.f2774b = typedArrayObtainStyledAttributes.getInt(index, this.f2774b);
            } else if (index == 3) {
                this.f2776d = typedArrayObtainStyledAttributes.getFloat(index, this.f2776d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
