package v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f2678a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2679b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2680c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2681d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2682e;

    public g(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        this.f2678a = Float.NaN;
        this.f2679b = Float.NaN;
        this.f2680c = Float.NaN;
        this.f2681d = Float.NaN;
        this.f2682e = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f2805j);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f2682e);
                this.f2682e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().a(context, resourceId);
                }
            } else if (index == 1) {
                this.f2681d = typedArrayObtainStyledAttributes.getDimension(index, this.f2681d);
            } else if (index == 2) {
                this.f2679b = typedArrayObtainStyledAttributes.getDimension(index, this.f2679b);
            } else if (index == 3) {
                this.f2680c = typedArrayObtainStyledAttributes.getDimension(index, this.f2680c);
            } else if (index == 4) {
                this.f2678a = typedArrayObtainStyledAttributes.getDimension(index, this.f2678a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
