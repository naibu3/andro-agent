package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.conscrypt.ct.CTConstants;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0252b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2592a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f2593b;

    /* renamed from: c, reason: collision with root package name */
    public int f2594c;

    /* renamed from: d, reason: collision with root package name */
    public float f2595d;

    /* renamed from: e, reason: collision with root package name */
    public String f2596e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2597f;

    /* renamed from: g, reason: collision with root package name */
    public int f2598g;

    public C0252b(C0252b c0252b, Object obj) {
        c0252b.getClass();
        this.f2593b = c0252b.f2593b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f2800d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i2 = 0;
        boolean z2 = false;
        Object objValueOf = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i3);
            int i4 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                int i5 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i5 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i5 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i2 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i4 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i2 = i4;
                            }
                        }
                        i2 = 7;
                    }
                }
                i2 = i5;
            }
        }
        if (string != null && objValueOf != null) {
            C0252b c0252b = new C0252b();
            c0252b.f2593b = i2;
            c0252b.f2592a = z2;
            c0252b.b(objValueOf);
            map.put(string, c0252b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (q.f.a(this.f2593b)) {
            case 0:
            case 7:
                this.f2594c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f2595d = ((Float) obj).floatValue();
                break;
            case 2:
            case CTConstants.CERTIFICATE_LENGTH_BYTES /* 3 */:
                this.f2598g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f2596e = (String) obj;
                break;
            case 5:
                this.f2597f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f2595d = ((Float) obj).floatValue();
                break;
        }
    }
}
