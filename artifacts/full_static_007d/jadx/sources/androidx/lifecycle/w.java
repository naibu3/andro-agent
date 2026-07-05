package androidx.lifecycle;

import j0.AbstractC0150d;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1213a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1214b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0071s interfaceC0071s) {
        try {
            AbstractC0150d.d(constructor.newInstance(interfaceC0071s), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Class cls) throws NoSuchMethodException, SecurityException {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i2;
        HashMap map = f1213a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i3 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r3 != null ? r3.getName() : BuildConfig.FLAVOR;
                AbstractC0150d.d(name, "fullPackage");
                if (name.length() != 0) {
                    AbstractC0150d.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    AbstractC0150d.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                AbstractC0150d.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = q0.k.z(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            HashMap map2 = f1214b;
            if (declaredConstructor != null) {
                map2.put(cls, C0.d.y(declaredConstructor));
            } else {
                C0057d c0057d = C0057d.f1188c;
                HashMap map3 = c0057d.f1190b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((x) declaredMethods[i4].getAnnotation(x.class)) != null) {
                                c0057d.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i4++;
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC0071s.class.isAssignableFrom(superclass)) {
                        AbstractC0150d.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            AbstractC0150d.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            AbstractC0150d.d(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    Class<?> cls2 = interfaces[i2];
                                    if (cls2 != null && InterfaceC0071s.class.isAssignableFrom(cls2)) {
                                        AbstractC0150d.d(cls2, "intrface");
                                        if (b(cls2) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        AbstractC0150d.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i2++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        AbstractC0150d.d(interfaces2, "klass.interfaces");
                        length = interfaces2.length;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                            }
                            i2++;
                        }
                    }
                }
            }
            i3 = 2;
        }
        map.put(cls, Integer.valueOf(i3));
        return i3;
    }
}
