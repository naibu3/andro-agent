package A;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import z.C0260e;
import z.C0261f;

/* loaded from: classes.dex */
public final class i extends C0.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f16a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor f17b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f18c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f19d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f17b = constructor;
        f16a = cls;
        f18c = method2;
        f19d = method;
    }

    public static boolean I(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z2) {
        try {
            return ((Boolean) f18c.invoke(obj, byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface J(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f16a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f19d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005b A[SYNTHETIC] */
    @Override // C0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Typeface k(Context context, C0260e c0260e, Resources resources, int i2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f17b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C0261f c0261f : c0260e.f2938a) {
            int i3 = c0261f.f2944f;
            File fileS = C0.f.s(context);
            if (fileS != null) {
                try {
                    if (C0.f.l(fileS, resources, i3)) {
                        try {
                            fileInputStream = new FileInputStream(fileS);
                        } catch (IOException unused2) {
                            map = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (map != null) {
                                return null;
                            }
                            if (!I(objNewInstance, map, c0261f.f2943e, c0261f.f2940b, c0261f.f2941c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    fileS.delete();
                }
            }
            map = null;
            if (map != null) {
            }
        }
        return J(objNewInstance);
    }

    @Override // C0.d
    public final Typeface l(Context context, E.l[] lVarArr, int i2) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f17b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        n.k kVar = new n.k(0);
        for (E.l lVar : lVarArr) {
            Uri uri = lVar.f296a;
            ByteBuffer byteBufferV = (ByteBuffer) kVar.get(uri);
            if (byteBufferV == null) {
                byteBufferV = C0.f.v(context, uri);
                kVar.put(uri, byteBufferV);
            }
            if (byteBufferV == null) {
                return null;
            }
            if (!I(objNewInstance, byteBufferV, lVar.f297b, lVar.f298c, lVar.f299d)) {
                return null;
            }
        }
        Typeface typefaceJ = J(objNewInstance);
        if (typefaceJ == null) {
            return null;
        }
        return Typeface.create(typefaceJ, i2);
    }
}
