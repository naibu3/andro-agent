package com.stripe.android.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ClassUtils.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u0001H\u0007J$\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0007J$\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/utils/ClassUtils;", "", "<init>", "()V", "getInternalObject", "clazz", "Ljava/lang/Class;", "allowedFields", "", "", "obj", "findField", "Ljava/lang/reflect/Field;", "", "findMethod", "Ljava/lang/reflect/Method;", "allowedMethods", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClassUtils {
    public static final int $stable = 0;
    public static final ClassUtils INSTANCE = new ClassUtils();

    private ClassUtils() {
    }

    @JvmStatic
    public static final Object getInternalObject(Class<?> clazz, Set<String> allowedFields, Object obj) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedFields, "allowedFields");
        Intrinsics.checkNotNullParameter(obj, "obj");
        Field fieldFindField = findField(clazz, allowedFields);
        if (fieldFindField == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(fieldFindField.get(obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
            return null;
        }
        return objM9118constructorimpl;
    }

    @JvmStatic
    public static final Field findField(Class<?> clazz, Collection<String> allowedFields) {
        Field field;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedFields, "allowedFields");
        Field[] declaredFields = clazz.getDeclaredFields();
        Intrinsics.checkNotNull(declaredFields);
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (allowedFields.contains(field.getName())) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @JvmStatic
    public static final Method findMethod(Class<?> clazz, Collection<String> allowedMethods) throws SecurityException {
        Method method;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(allowedMethods, "allowedMethods");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        Method[] methodArr = declaredMethods;
        int length = methodArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = methodArr[i];
            if (allowedMethods.contains(method.getName())) {
                break;
            }
            i++;
        }
        return method;
    }
}
