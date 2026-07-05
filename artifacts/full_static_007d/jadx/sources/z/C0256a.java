package z;

import android.graphics.Color;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256a {

    /* renamed from: a, reason: collision with root package name */
    public final float f2924a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2925b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2926c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2927d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2928e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2929f;

    public C0256a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f2924a = f2;
        this.f2925b = f3;
        this.f2926c = f4;
        this.f2927d = f5;
        this.f2928e = f6;
        this.f2929f = f7;
    }

    public static C0256a a(int i2) {
        C0267l c0267l = C0267l.f2958k;
        float fB = AbstractC0257b.b(Color.red(i2));
        float fB2 = AbstractC0257b.b(Color.green(i2));
        float fB3 = AbstractC0257b.b(Color.blue(i2));
        float[][] fArr = AbstractC0257b.f2933d;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * fB3) + (fArr2[1] * fB2) + (fArr2[0] * fB);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * fB3) + (fArr3[1] * fB2) + (fArr3[0] * fB);
        float[] fArr4 = fArr[2];
        float f4 = (fB3 * fArr4[2]) + (fB2 * fArr4[1]) + (fB * fArr4[0]);
        float[][] fArr5 = AbstractC0257b.f2930a;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c0267l.f2965g;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float fAbs = Math.abs(f8);
        float f11 = c0267l.h;
        float fPow = (float) Math.pow((fAbs * f11) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f9) * f11) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f10) * f11) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f8) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f9) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f10) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d2 = fSignum3;
        float f12 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d2)) / 11.0f;
        float f13 = ((float) ((fSignum + fSignum2) - (d2 * 2.0d))) / 9.0f;
        float f14 = fSignum2 * 20.0f;
        float f15 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f14)) / 20.0f;
        float f16 = (((fSignum * 40.0f) + f14) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f13, f12)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f17 = fAtan2;
        float f18 = (3.1415927f * f17) / 180.0f;
        float f19 = f16 * c0267l.f2960b;
        float f20 = c0267l.f2959a;
        float f21 = c0267l.f2962d;
        float fPow4 = ((float) Math.pow(f19 / f20, c0267l.f2967j * f21)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f22 = f20 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c0267l.f2964f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f17) < 20.14d ? 360.0f + f17 : f17) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c0267l.f2963e) * c0267l.f2961c) * ((float) Math.sqrt((f13 * f13) + (f12 * f12)))) / (f15 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f23 = c0267l.f2966i * fPow5;
        Math.sqrt((r3 * f21) / f22);
        float f24 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f23 * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f18;
        return new C0256a(f17, fPow5, fPow4, f24, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    public static C0256a b(float f2, float f3, float f4) {
        C0267l c0267l = C0267l.f2958k;
        float f5 = c0267l.f2962d;
        Math.sqrt(f2 / 100.0d);
        float f6 = c0267l.f2959a + 4.0f;
        float f7 = c0267l.f2966i * f3;
        Math.sqrt(((f3 / ((float) Math.sqrt(r1))) * c0267l.f2962d) / f6);
        float f8 = (1.7f * f2) / ((0.007f * f2) + 1.0f);
        float fLog = ((float) Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f4) / 180.0f;
        return new C0256a(f4, f3, f2, f8, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(C0267l c0267l) {
        float fSqrt;
        float f2 = this.f2925b;
        double d2 = f2;
        float f3 = this.f2926c;
        if (d2 != 0.0d) {
            double d3 = f3;
            fSqrt = d3 == 0.0d ? 0.0f : f2 / ((float) Math.sqrt(d3 / 100.0d));
        }
        float fPow = (float) Math.pow(fSqrt / Math.pow(1.64d - Math.pow(0.29d, c0267l.f2964f), 0.73d), 1.1111111111111112d);
        double d4 = (this.f2924a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d4) + 3.8d)) * 0.25f;
        float fPow2 = c0267l.f2959a * ((float) Math.pow(f3 / 100.0d, (1.0d / c0267l.f2962d) / c0267l.f2967j));
        float f4 = fCos * 3846.1538f * c0267l.f2963e * c0267l.f2961c;
        float f5 = fPow2 / c0267l.f2960b;
        float fSin = (float) Math.sin(d4);
        float fCos2 = (float) Math.cos(d4);
        float f6 = (((0.305f + f5) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f4 * 23.0f)));
        float f7 = fCos2 * f6;
        float f8 = f6 * fSin;
        float f9 = f5 * 460.0f;
        float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
        float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
        float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10)));
        float fSignum = Math.signum(f10);
        float f13 = 100.0f / c0267l.h;
        float fPow3 = fSignum * f13 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f11) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float fSignum3 = Math.signum(f12) * f13 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float[] fArr = c0267l.f2965g;
        float f14 = fPow3 / fArr[0];
        float f15 = fSignum2 / fArr[1];
        float f16 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0257b.f2931b;
        float[] fArr3 = fArr2[0];
        float f17 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f15) + (fArr4[0] * f14);
        float[] fArr5 = fArr2[2];
        return A.a.a(f17, f18, (f16 * fArr5[2]) + (f15 * fArr5[1]) + (f14 * fArr5[0]));
    }
}
