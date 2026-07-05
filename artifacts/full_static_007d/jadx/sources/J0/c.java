package J0;

import A.m;
import java.io.Closeable;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.conscrypt.BuildConfig;
import org.conscrypt.ct.CTConstants;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f472b = Pattern.compile("-?(?:0|[1-9]\\d*)(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");

    /* renamed from: c, reason: collision with root package name */
    public static final m f473c = new m(3);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f474a;

    public c() {
        this.f474a = new HashMap();
    }

    public static Annotation b(Method method) {
        if (method != null) {
            if (method.isAnnotationPresent(e.class)) {
                return method.getAnnotation(e.class);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return null;
            }
            for (Class<?> cls : declaringClass.getInterfaces()) {
                try {
                    return b(cls.getMethod(method.getName(), method.getParameterTypes()));
                } catch (NoSuchMethodException | SecurityException unused) {
                }
            }
            try {
                return b(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()));
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return null;
    }

    public static int c(Method method, Class cls) {
        int iC;
        if (method != null) {
            if (method.isAnnotationPresent(cls)) {
                return 1;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            if (declaringClass.getSuperclass() == null) {
                return -1;
            }
            for (Class<?> cls2 : declaringClass.getInterfaces()) {
                try {
                    iC = c(cls2.getMethod(method.getName(), method.getParameterTypes()), cls);
                } catch (NoSuchMethodException | SecurityException unused) {
                }
                if (iC > 0) {
                    return iC + 1;
                }
            }
            try {
                int iC2 = c(declaringClass.getSuperclass().getMethod(method.getName(), method.getParameterTypes()), cls);
                if (iC2 > 0) {
                    return iC2 + 1;
                }
            } catch (NoSuchMethodException | SecurityException unused2) {
            }
        }
        return -1;
    }

    public static final void f(StringWriter stringWriter, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            stringWriter.write(32);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Writer i(String str, StringWriter stringWriter) throws IOException {
        if (str == null || str.isEmpty()) {
            stringWriter.write("\"\"");
            return stringWriter;
        }
        int length = str.length();
        stringWriter.write(34);
        int i2 = 0;
        char c2 = 0;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\f') {
                stringWriter.write("\\f");
            } else if (cCharAt == '\r') {
                stringWriter.write("\\r");
            } else if (cCharAt == '\"') {
                stringWriter.write(92);
                stringWriter.write(cCharAt);
            } else if (cCharAt == '/') {
                if (c2 == '<') {
                    stringWriter.write(92);
                }
                stringWriter.write(cCharAt);
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case CTConstants.TIMESTAMP_LENGTH /* 8 */:
                        stringWriter.write("\\b");
                        break;
                    case '\t':
                        stringWriter.write("\\t");
                        break;
                    case '\n':
                        stringWriter.write("\\n");
                        break;
                    default:
                        if (cCharAt >= ' ' && ((cCharAt < 128 || cCharAt >= 160) && (cCharAt < 8192 || cCharAt >= 8448))) {
                            stringWriter.write(cCharAt);
                            break;
                        } else {
                            stringWriter.write("\\u");
                            String hexString = Integer.toHexString(cCharAt);
                            stringWriter.write("0000", 0, 4 - hexString.length());
                            stringWriter.write(hexString);
                            break;
                        }
                }
            }
            i2++;
            c2 = cCharAt;
        }
        stringWriter.write(34);
        return stringWriter;
    }

    public static String j(String str) {
        String string;
        StringWriter stringWriter = new StringWriter();
        synchronized (stringWriter.getBuffer()) {
            try {
                try {
                    i(str, stringWriter);
                    string = stringWriter.toString();
                } catch (IOException unused) {
                    return BuildConfig.FLAVOR;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public static Number k(String str) throws NumberFormatException {
        char cCharAt = str.charAt(0);
        if ((cCharAt < '0' || cCharAt > '9') && cCharAt != '-') {
            throw new NumberFormatException(A.e.d("val [", str, "] is not a valid number."));
        }
        if (str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str)) {
            try {
                try {
                    BigDecimal bigDecimal = new BigDecimal(str);
                    return (cCharAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) ? Double.valueOf(-0.0d) : bigDecimal;
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(str);
                    if (!dValueOf.isNaN() && !dValueOf.isInfinite()) {
                        return dValueOf;
                    }
                    throw new NumberFormatException("val [" + str + "] is not a valid number.");
                }
            } catch (NumberFormatException unused2) {
                throw new NumberFormatException(A.e.d("val [", str, "] is not a valid number."));
            }
        }
        if (cCharAt == '0' && str.length() > 1) {
            char cCharAt2 = str.charAt(1);
            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                throw new NumberFormatException(A.e.d("val [", str, "] is not a valid number."));
            }
        } else if (cCharAt == '-' && str.length() > 2) {
            char cCharAt3 = str.charAt(1);
            char cCharAt4 = str.charAt(2);
            if (cCharAt3 == '0' && cCharAt4 >= '0' && cCharAt4 <= '9') {
                throw new NumberFormatException(A.e.d("val [", str, "] is not a valid number."));
            }
        }
        BigInteger bigInteger = new BigInteger(str);
        return bigInteger.bitLength() <= 31 ? Integer.valueOf(bigInteger.intValue()) : bigInteger.bitLength() <= 63 ? Long.valueOf(bigInteger.longValue()) : bigInteger;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l(Object obj) {
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Double) {
                Double d2 = (Double) number;
                if (!d2.isInfinite() && !d2.isNaN()) {
                    if (!(number instanceof Float)) {
                        return;
                    }
                    Float f2 = (Float) number;
                    if (!f2.isInfinite() && !f2.isNaN()) {
                        return;
                    }
                }
            }
            throw new b("JSON does not allow non-finite numbers.");
        }
    }

    public static Object m(Object obj) {
        try {
            m mVar = f473c;
            if (mVar.equals(obj)) {
                return mVar;
            }
            if (!(obj instanceof c) && !(obj instanceof a) && !mVar.equals(obj) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof BigInteger) && !(obj instanceof BigDecimal) && !(obj instanceof Enum)) {
                if (obj instanceof Collection) {
                    return new a((Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    return new a(obj);
                }
                if (obj instanceof Map) {
                    return new c((Map) obj);
                }
                Package r02 = obj.getClass().getPackage();
                String name = r02 != null ? r02.getName() : BuildConfig.FLAVOR;
                if (!name.startsWith("java.") && !name.startsWith("javax.") && obj.getClass().getClassLoader() != null) {
                    return new c(obj);
                }
                return obj.toString();
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final void o(StringWriter stringWriter, Object obj, int i2) {
        if (obj == null || obj.equals(null)) {
            stringWriter.write("null");
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            l(number);
            String string = number.toString();
            if (string.indexOf(46) > 0 && string.indexOf(101) < 0 && string.indexOf(69) < 0) {
                while (string.endsWith("0")) {
                    string = string.substring(0, string.length() - 1);
                }
                if (string.endsWith(".")) {
                    string = string.substring(0, string.length() - 1);
                }
            }
            if (f472b.matcher(string).matches()) {
                stringWriter.write(string);
                return;
            } else {
                i(string, stringWriter);
                return;
            }
        }
        if (obj instanceof Boolean) {
            stringWriter.write(obj.toString());
            return;
        }
        if (obj instanceof Enum) {
            stringWriter.write(j(((Enum) obj).name()));
            return;
        }
        if (obj instanceof c) {
            ((c) obj).n(stringWriter, i2);
            return;
        }
        if (obj instanceof a) {
            ((a) obj).c(stringWriter, i2);
            return;
        }
        if (obj instanceof Map) {
            new c((Map) obj).n(stringWriter, i2);
            return;
        }
        if (obj instanceof Collection) {
            new a((Collection) obj).c(stringWriter, i2);
        } else if (obj.getClass().isArray()) {
            new a(obj).c(stringWriter, i2);
        } else {
            i(obj.toString(), stringWriter);
        }
    }

    public static b p(String str, String str2) {
        return new b("JSONObject[" + j(str) + "] is not a " + str2 + ".", null);
    }

    public final Object a(String str) {
        Object obj = this.f474a.get(str);
        if (obj != null) {
            return obj;
        }
        throw new b("JSONObject[" + j(str) + "] not found.");
    }

    public final boolean d() {
        Object objA = a("success");
        if (objA.equals(Boolean.FALSE)) {
            return false;
        }
        boolean z2 = objA instanceof String;
        if (z2 && ((String) objA).equalsIgnoreCase("false")) {
            return false;
        }
        if (objA.equals(Boolean.TRUE)) {
            return true;
        }
        if (z2 && ((String) objA).equalsIgnoreCase("true")) {
            return true;
        }
        throw p("success", "Boolean");
    }

    public final String e(String str) {
        Object objA = a(str);
        if (objA instanceof String) {
            return (String) objA;
        }
        throw p(str, "string");
    }

    public final String g(String str) {
        Object obj = this.f474a.get("error");
        return f473c.equals(obj) ? str : obj.toString();
    }

    public final void h(Object obj, String str) {
        HashMap map = this.f474a;
        if (obj == null) {
            map.remove(str);
        } else {
            l(obj);
            map.put(str, obj);
        }
    }

    public final void n(StringWriter stringWriter, int i2) throws IOException {
        HashMap map = this.f474a;
        try {
            int size = map.size();
            stringWriter.write(123);
            if (size == 1) {
                Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                String str = (String) entry.getKey();
                stringWriter.write(j(str));
                stringWriter.write(58);
                try {
                    o(stringWriter, entry.getValue(), i2);
                } catch (Exception e2) {
                    throw new b("Unable to write JSONObject value for key: " + str, e2);
                }
            } else if (size != 0) {
                boolean z2 = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    if (z2) {
                        stringWriter.write(44);
                    }
                    f(stringWriter, i2);
                    String str2 = (String) entry2.getKey();
                    stringWriter.write(j(str2));
                    stringWriter.write(58);
                    try {
                        o(stringWriter, entry2.getValue(), i2);
                        z2 = true;
                    } catch (Exception e3) {
                        throw new b("Unable to write JSONObject value for key: " + str2, e3);
                    }
                }
                f(stringWriter, i2);
            }
            stringWriter.write(125);
        } catch (IOException e4) {
            throw new b(e4.getMessage(), e4);
        }
    }

    public final String toString() {
        String string;
        try {
            StringWriter stringWriter = new StringWriter();
            synchronized (stringWriter.getBuffer()) {
                n(stringWriter, 0);
                string = stringWriter.toString();
            }
            return string;
        } catch (Exception unused) {
            return null;
        }
    }

    public c(f fVar) throws IOException {
        this();
        if (fVar.c() != '{') {
            throw fVar.e("A JSONObject text must begin with '{'");
        }
        while (true) {
            char c2 = fVar.c();
            if (c2 == 0) {
                throw fVar.e("A JSONObject text must end with '}'");
            }
            if (c2 == '}') {
                return;
            }
            fVar.a();
            String string = fVar.d().toString();
            if (fVar.c() == ':') {
                if (string != null) {
                    if (this.f474a.get(string) == null) {
                        Object objD = fVar.d();
                        if (objD != null) {
                            h(objD, string);
                        }
                    } else {
                        throw fVar.e("Duplicate key \"" + string + "\"");
                    }
                }
                char c3 = fVar.c();
                if (c3 != ',' && c3 != ';') {
                    if (c3 != '}') {
                        throw fVar.e("Expected a ',' or '}'");
                    }
                    return;
                } else if (fVar.c() == '}') {
                    return;
                } else {
                    fVar.a();
                }
            } else {
                throw fVar.e("Expected a ':' after a key");
            }
        }
    }

    public c(Map map) {
        if (map == null) {
            this.f474a = new HashMap();
            return;
        }
        this.f474a = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Object value = entry.getValue();
                if (value != null) {
                    this.f474a.put(String.valueOf(entry.getKey()), m(value));
                }
            } else {
                throw new NullPointerException("Null key.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(Object obj) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String strSubstring;
        int iC;
        this();
        Class<?> cls = obj.getClass();
        for (Method method : cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods()) {
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && !Modifier.isStatic(modifiers) && method.getParameterTypes().length == 0 && !method.isBridge() && method.getReturnType() != Void.TYPE) {
                String name = method.getName();
                if (!"getClass".equals(name) && !"getDeclaringClass".equals(name)) {
                    int iC2 = c(method, d.class);
                    if (iC2 <= 0 || ((iC = c(method, e.class)) >= 0 && iC2 > iC)) {
                        e eVar = (e) b(method);
                        if (eVar != null && eVar.value() != null && !eVar.value().isEmpty()) {
                            strSubstring = eVar.value();
                        } else {
                            String name2 = method.getName();
                            if (name2.startsWith("get") && name2.length() > 3) {
                                strSubstring = name2.substring(3);
                            } else {
                                strSubstring = (name2.startsWith("is") && name2.length() > 2) ? name2.substring(2) : strSubstring;
                                strSubstring = null;
                            }
                            if (strSubstring.length() == 0 || Character.isLowerCase(strSubstring.charAt(0))) {
                                strSubstring = null;
                            } else if (strSubstring.length() == 1) {
                                strSubstring = strSubstring.toLowerCase(Locale.ROOT);
                            } else if (!Character.isUpperCase(strSubstring.charAt(1))) {
                                strSubstring = strSubstring.substring(0, 1).toLowerCase(Locale.ROOT) + strSubstring.substring(1);
                            }
                        }
                        if (strSubstring != null && !strSubstring.isEmpty()) {
                            try {
                                Object objInvoke = method.invoke(obj, null);
                                if (objInvoke != null) {
                                    this.f474a.put(strSubstring, m(objInvoke));
                                    if (objInvoke instanceof Closeable) {
                                        ((Closeable) objInvoke).close();
                                    }
                                }
                            } catch (IOException | IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    public c(String str) {
        this(new f(str));
    }
}
