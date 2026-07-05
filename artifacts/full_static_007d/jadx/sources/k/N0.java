package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o.AbstractC0228a;
import org.conscrypt.R;

/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: g, reason: collision with root package name */
    public static N0 f1810g;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f1812b = new WeakHashMap(0);

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1813c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1814d;

    /* renamed from: e, reason: collision with root package name */
    public B0.h f1815e;

    /* renamed from: f, reason: collision with root package name */
    public static final PorterDuff.Mode f1809f = PorterDuff.Mode.SRC_IN;
    public static final M0 h = new M0(6);

    public static synchronized N0 b() {
        try {
            if (f1810g == null) {
                f1810g = new N0();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f1810g;
    }

    public static synchronized PorterDuffColorFilter e(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        M0 m02 = h;
        m02.getClass();
        int i3 = (31 + i2) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) m02.a(Integer.valueOf(mode.hashCode() + i3));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
        }
        return porterDuffColorFilter;
    }

    public final Drawable a(Context context, int i2) throws Resources.NotFoundException {
        Drawable drawableNewDrawable;
        Object obj;
        int i3;
        if (this.f1813c == null) {
            this.f1813c = new TypedValue();
        }
        TypedValue typedValue = this.f1813c;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        synchronized (this) {
            n.h hVar = (n.h) this.f1812b.get(context);
            drawableNewDrawable = null;
            if (hVar != null) {
                int iB = AbstractC0228a.b(hVar.f2114b, hVar.f2116d, j2);
                if (iB < 0 || (obj = hVar.f2115c[iB]) == n.i.f2117a) {
                    obj = null;
                }
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference != null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                    if (constantState != null) {
                        drawableNewDrawable = constantState.newDrawable(context.getResources());
                    } else {
                        int iB2 = AbstractC0228a.b(hVar.f2114b, hVar.f2116d, j2);
                        if (iB2 >= 0) {
                            Object[] objArr = hVar.f2115c;
                            Object obj2 = objArr[iB2];
                            Object obj3 = n.i.f2117a;
                            if (obj2 != obj3) {
                                objArr[iB2] = obj3;
                                hVar.f2113a = true;
                            }
                        }
                    }
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        LayerDrawable layerDrawableC = null;
        if (this.f1815e != null) {
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawableC = new LayerDrawable(new Drawable[]{c(context, R.drawable.abc_cab_background_internal_bg), c(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i2 == R.drawable.abc_ratingbar_material) {
                layerDrawableC = B0.h.c(this, context, R.dimen.abc_star_big);
            } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableC = B0.h.c(this, context, R.dimen.abc_star_medium);
            } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableC = B0.h.c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableC != null) {
            layerDrawableC.setChangingConfigurations(typedValue.changingConfigurations);
            synchronized (this) {
                try {
                    Drawable.ConstantState constantState2 = layerDrawableC.getConstantState();
                    if (constantState2 != null) {
                        n.h hVar2 = (n.h) this.f1812b.get(context);
                        if (hVar2 == null) {
                            hVar2 = new n.h();
                            int i4 = 4;
                            while (true) {
                                i3 = 80;
                                if (i4 >= 32) {
                                    break;
                                }
                                int i5 = (1 << i4) - 12;
                                if (80 <= i5) {
                                    i3 = i5;
                                    break;
                                }
                                i4++;
                            }
                            int i6 = i3 / 8;
                            hVar2.f2114b = new long[i6];
                            hVar2.f2115c = new Object[i6];
                            this.f1812b.put(context, hVar2);
                        }
                        hVar2.a(j2, new WeakReference(constantState2));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return layerDrawableC;
    }

    public final synchronized Drawable c(Context context, int i2) {
        return d(context, i2, false);
    }

    public final synchronized Drawable d(Context context, int i2, boolean z2) {
        Drawable drawableA;
        try {
            if (!this.f1814d) {
                this.f1814d = true;
                Drawable drawableC = c(context, R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof X.a) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f1814d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i2);
            if (drawableA == null) {
                drawableA = context.getDrawable(i2);
            }
            if (drawableA != null) {
                drawableA = g(context, i2, z2, drawableA);
            }
            if (drawableA != null) {
                AbstractC0191n0.a(drawableA);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized ColorStateList f(Context context, int i2) {
        ColorStateList colorStateList;
        n.l lVar;
        Object obj;
        WeakHashMap weakHashMap = this.f1811a;
        ColorStateList colorStateListD = null;
        if (weakHashMap == null || (lVar = (n.l) weakHashMap.get(context)) == null) {
            colorStateList = null;
        } else {
            int iA = AbstractC0228a.a(lVar.f2130c, i2, lVar.f2128a);
            if (iA < 0 || (obj = lVar.f2129b[iA]) == n.i.f2118b) {
                obj = null;
            }
            colorStateList = (ColorStateList) obj;
        }
        if (colorStateList == null) {
            B0.h hVar = this.f1815e;
            if (hVar != null) {
                colorStateListD = hVar.d(context, i2);
            }
            if (colorStateListD != null) {
                if (this.f1811a == null) {
                    this.f1811a = new WeakHashMap();
                }
                n.l lVar2 = (n.l) this.f1811a.get(context);
                if (lVar2 == null) {
                    lVar2 = new n.l();
                    this.f1811a.put(context, lVar2);
                }
                lVar2.a(i2, colorStateListD);
            }
            colorStateList = colorStateListD;
        }
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable g(Context context, int i2, boolean z2, Drawable drawable) {
        int i3;
        boolean z3;
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterE;
        ColorStateList colorStateListF = f(context, i2);
        PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListF);
            if (this.f1815e != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawableMutate;
            }
            drawableMutate.setTintMode(mode);
            return drawableMutate;
        }
        if (this.f1815e != null) {
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = S0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = C0203u.f2029b;
                B0.h.f(drawableFindDrawableByLayerId, iC, mode2);
                B0.h.f(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlNormal), mode2);
                B0.h.f(layerDrawable.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = S0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = C0203u.f2029b;
                B0.h.f(drawableFindDrawableByLayerId2, iB, mode3);
                B0.h.f(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), S0.c(context, R.attr.colorControlActivated), mode3);
                B0.h.f(layerDrawable2.findDrawableByLayerId(android.R.id.progress), S0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        B0.h hVar = this.f1815e;
        boolean z4 = false;
        if (hVar != null) {
            PorterDuff.Mode mode4 = C0203u.f2029b;
            if (B0.h.a((int[]) hVar.f118b, i2)) {
                i3 = R.attr.colorControlNormal;
            } else if (B0.h.a((int[]) hVar.f120d, i2)) {
                i3 = R.attr.colorControlActivated;
            } else {
                if (B0.h.a((int[]) hVar.f121e, i2)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else if (i2 == R.drawable.abc_list_divider_mtrl_alpha) {
                    z3 = true;
                    iRound = Math.round(40.8f);
                    i3 = 16842800;
                    if (z3) {
                        Drawable drawableMutate2 = drawable.mutate();
                        int iC2 = S0.c(context, i3);
                        synchronized (C0203u.class) {
                            porterDuffColorFilterE = e(iC2, mode4);
                        }
                        drawableMutate2.setColorFilter(porterDuffColorFilterE);
                        if (iRound != -1) {
                            drawableMutate2.setAlpha(iRound);
                        }
                        z4 = true;
                    }
                } else if (i2 != R.drawable.abc_dialog_material_background) {
                    i3 = 0;
                    z3 = false;
                    iRound = -1;
                    if (z3) {
                    }
                }
                i3 = 16842801;
            }
            z3 = true;
            iRound = -1;
            if (z3) {
            }
        }
        if (z4 || !z2) {
            return drawable;
        }
        return null;
    }
}
