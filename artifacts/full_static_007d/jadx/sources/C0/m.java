package C0;

import B0.z;
import H.InterfaceC0017k;
import H.M;
import H.N;
import M.s;
import M.t;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.C0095a;
import j0.AbstractC0150d;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.conscrypt.R;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f230a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f231b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f232c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Field f233d;

    public static void a(StringBuilder sb, Object obj, a.o oVar) {
        if (oVar != null) {
            sb.append((CharSequence) oVar.c(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static final void b(H0.g gVar, Throwable th) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (gVar != null) {
            if (th == null) {
                gVar.close();
                return;
            }
            try {
                gVar.close();
            } catch (Throwable th2) {
                d.e(th, th2);
            }
        }
    }

    public static final void c(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + i3 + ").");
    }

    public static t d(Context context) {
        ProviderInfo providerInfo;
        E.g gVar;
        ApplicationInfo applicationInfo;
        A.m cVar = Build.VERSION.SDK_INT >= 28 ? new M.c(4) : new A.m(4);
        PackageManager packageManager = context.getPackageManager();
        d.j(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            gVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrF = cVar.f(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrF) {
                    arrayList.add(signature.toByteArray());
                }
                gVar = new E.g(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (gVar == null) {
            return null;
        }
        return new t(new s(context, gVar));
    }

    public static int e(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z2)) {
                return i2;
            }
            i2 = i4;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d6, code lost:
    
        if (r7 == r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d8, code lost:
    
        if (r8 != (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00da, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00db, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00ed, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a2 A[EDGE_INSN: B:86:0x00a2->B:54:0x00a2 BREAK  A[LOOP:2: B:25:0x004c->B:50:0x008e], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress f(String str, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z2 = false;
        int i9 = i2;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i9 >= i3) {
                i4 = i8;
                break;
            }
            if (i10 != i8) {
                int i13 = i9 + 2;
                if (i13 <= i3 && q0.k.A(str, "::", i9, z2)) {
                    if (i11 == -1) {
                        i10 += 2;
                        if (i13 != i3) {
                            i11 = i10;
                            i12 = i13;
                            i9 = i12;
                            int i14 = 0;
                            while (i9 < i3) {
                            }
                            i7 = i9 - i12;
                            if (i7 == 0) {
                                break;
                            }
                            break;
                            break;
                        }
                        i4 = i8;
                        i11 = i10;
                        break;
                    }
                    return null;
                }
                if (i10 != 0) {
                    if (!q0.k.A(str, ":", i9, z2)) {
                        if (q0.k.A(str, ".", i9, z2)) {
                            int i15 = i10 - 2;
                            int i16 = i15;
                            loop2: while (true) {
                                if (i12 < i3) {
                                    if (i16 == i8) {
                                        break;
                                    }
                                    if (i16 == i15) {
                                        ?? r14 = z2;
                                        i5 = i12;
                                        while (i5 < i3) {
                                            char cCharAt = str.charAt(i5);
                                            if (AbstractC0150d.f(cCharAt, 48) >= 0 && AbstractC0150d.f(cCharAt, 57) <= 0) {
                                                if ((r14 == 0 && i12 != i5) || (i6 = ((r14 * 10) + cCharAt) - 48) > 255) {
                                                    break loop2;
                                                }
                                                i5++;
                                                r14 = i6;
                                            } else {
                                                break;
                                            }
                                        }
                                        if (i5 - i12 != 0) {
                                            break;
                                        }
                                        bArr[i16] = (byte) r14;
                                        i16++;
                                        i12 = i5;
                                        i8 = 16;
                                        z2 = false;
                                    } else {
                                        if (str.charAt(i12) != '.') {
                                            break;
                                        }
                                        i12++;
                                        ?? r142 = z2;
                                        i5 = i12;
                                        while (i5 < i3) {
                                        }
                                        if (i5 - i12 != 0) {
                                        }
                                    }
                                } else if (i16 == i10 + 2) {
                                    i10 += 2;
                                    i4 = 16;
                                }
                            }
                        }
                        return null;
                    }
                    i9++;
                }
                i12 = i9;
                i9 = i12;
                int i142 = 0;
                while (i9 < i3) {
                    int iQ = v0.b.q(str.charAt(i9));
                    if (iQ == -1) {
                        break;
                    }
                    i142 = (i142 << 4) + iQ;
                    i9++;
                }
                i7 = i9 - i12;
                if (i7 == 0 || i7 > 4) {
                    break;
                }
                int i17 = i10 + 1;
                bArr[i10] = (byte) ((i142 >>> 8) & 255);
                i10 += 2;
                bArr[i17] = (byte) (i142 & 255);
                i8 = 16;
                z2 = false;
            } else {
                return null;
            }
        }
        return null;
    }

    public static boolean g(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = N.f327a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = M.f323d;
        M m2 = (M) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (m2 == null) {
            m2 = new M();
            m2.f324a = null;
            m2.f325b = null;
            m2.f326c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, m2);
        }
        WeakReference weakReference2 = m2.f326c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        m2.f326c = new WeakReference(keyEvent);
        if (m2.f325b == null) {
            m2.f325b = new SparseArray();
        }
        SparseArray sparseArray = m2.f325b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static boolean h(InterfaceC0017k interfaceC0017k, View view, Window.Callback callback, KeyEvent keyEvent) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException, InvocationTargetException {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0017k == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC0017k.superDispatchKeyEvent(keyEvent);
        }
        if (!(callback instanceof Activity)) {
            if (!(callback instanceof Dialog)) {
                return (view != null && N.b(view, keyEvent)) || interfaceC0017k.superDispatchKeyEvent(keyEvent);
            }
            Dialog dialog = (Dialog) callback;
            if (!f232c) {
                try {
                    Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                    f233d = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused) {
                }
                f232c = true;
            }
            Field field = f233d;
            if (field != null) {
                try {
                    onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                } catch (IllegalAccessException unused2) {
                }
            } else {
                onKeyListener = null;
            }
            if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                return true;
            }
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (N.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        Activity activity = (Activity) callback;
        activity.onUserInteraction();
        Window window2 = activity.getWindow();
        if (window2.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!f230a) {
                    try {
                        f231b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused3) {
                    }
                    f230a = true;
                }
                Method method = f231b;
                if (method != null) {
                    try {
                        Object objInvoke = method.invoke(actionBar, keyEvent);
                        if (objInvoke != null) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        }
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (N.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView2 != null ? decorView2.getKeyDispatcherState() : null, activity);
    }

    public static u0.o i(String str) {
        AbstractC0150d.e(str, "<this>");
        Matcher matcher = u0.o.f2491c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }
        String strGroup = matcher.group(1);
        AbstractC0150d.d(strGroup, "typeSubtype.group(1)");
        Locale locale = Locale.US;
        AbstractC0150d.d(locale, "US");
        AbstractC0150d.d(strGroup.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        String strGroup2 = matcher.group(2);
        AbstractC0150d.d(strGroup2, "typeSubtype.group(2)");
        AbstractC0150d.d(strGroup2.toLowerCase(locale), "this as java.lang.String).toLowerCase(locale)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = u0.o.f2492d.matcher(str);
        int iEnd = matcher.end();
        while (iEnd < str.length()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(iEnd);
                AbstractC0150d.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            String strGroup3 = matcher2.group(1);
            if (strGroup3 == null) {
                iEnd = matcher2.end();
            } else {
                String strGroup4 = matcher2.group(2);
                if (strGroup4 == null) {
                    strGroup4 = matcher2.group(3);
                } else if (q0.k.B(strGroup4, false, "'") && strGroup4.endsWith("'") && strGroup4.length() > 2) {
                    strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                    AbstractC0150d.d(strGroup4, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(strGroup3);
                arrayList.add(strGroup4);
                iEnd = matcher2.end();
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return new u0.o((String[]) array, str);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static Object j(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return D.c.b(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0095a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static final int k(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static final boolean l(AssertionError assertionError) {
        Logger logger = H0.l.f427a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message == null ? false : q0.d.D(message, "getsockname failed");
    }

    public static void m(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static u0.o n(String str) {
        AbstractC0150d.e(str, "<this>");
        try {
            return i(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long o(String str, int i2) throws NumberFormatException {
        int iE = e(str, 0, i2, false);
        Matcher matcher = u0.i.f2461m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iH = -1;
        int i6 = -1;
        int i7 = -1;
        while (iE < i2) {
            int iE2 = e(str, iE + 1, i2, true);
            matcher.region(iE, iE2);
            if (i4 == -1 && matcher.usePattern(u0.i.f2461m).matches()) {
                String strGroup = matcher.group(1);
                AbstractC0150d.d(strGroup, "matcher.group(1)");
                i4 = Integer.parseInt(strGroup);
                String strGroup2 = matcher.group(2);
                AbstractC0150d.d(strGroup2, "matcher.group(2)");
                i6 = Integer.parseInt(strGroup2);
                String strGroup3 = matcher.group(3);
                AbstractC0150d.d(strGroup3, "matcher.group(3)");
                i7 = Integer.parseInt(strGroup3);
            } else if (i5 == -1 && matcher.usePattern(u0.i.f2460l).matches()) {
                String strGroup4 = matcher.group(1);
                AbstractC0150d.d(strGroup4, "matcher.group(1)");
                i5 = Integer.parseInt(strGroup4);
            } else if (iH == -1) {
                Pattern pattern = u0.i.f2459k;
                if (matcher.usePattern(pattern).matches()) {
                    String strGroup5 = matcher.group(1);
                    AbstractC0150d.d(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    AbstractC0150d.d(locale, "US");
                    String lowerCase = strGroup5.toLowerCase(locale);
                    AbstractC0150d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String strPattern = pattern.pattern();
                    AbstractC0150d.d(strPattern, "MONTH_PATTERN.pattern()");
                    iH = q0.d.H(strPattern, lowerCase, 0, 6) / 4;
                } else if (i3 == -1 && matcher.usePattern(u0.i.f2458j).matches()) {
                    String strGroup6 = matcher.group(1);
                    AbstractC0150d.d(strGroup6, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup6);
                }
            }
            iE = e(str, iE2 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iH == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i5 || i5 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i4 < 0 || i4 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(v0.b.f2813f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, iH - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final boolean p(String str) {
        AbstractC0150d.e(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static N.b q(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & 65535;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    N.b bVar = new N.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f319d = byteBufferDuplicate;
                    bVar.f316a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f317b = i7;
                    bVar.f318c = ((ByteBuffer) bVar.f319d).getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final H0.b r(Socket socket) throws IOException {
        Logger logger = H0.l.f427a;
        z zVar = new z(1, socket);
        OutputStream outputStream = socket.getOutputStream();
        AbstractC0150d.d(outputStream, "getOutputStream()");
        return new H0.b(zVar, new H0.b(outputStream, zVar));
    }

    public static final H0.c s(Socket socket) throws IOException {
        int i2 = 1;
        Logger logger = H0.l.f427a;
        z zVar = new z(i2, socket);
        InputStream inputStream = socket.getInputStream();
        AbstractC0150d.d(inputStream, "getInputStream()");
        return new H0.c(zVar, new H0.c(inputStream, zVar, i2), 0);
    }

    public static n0.a t(n0.c cVar, int i2) {
        AbstractC0150d.e(cVar, "<this>");
        boolean z2 = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        if (z2) {
            if (cVar.f2133c <= 0) {
                i2 = -i2;
            }
            return new n0.a(cVar.f2131a, cVar.f2132b, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static final String u(String str) {
        AbstractC0150d.e(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!q0.d.D(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC0150d.d(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC0150d.d(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC0150d.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    char cCharAt = lowerCase.charAt(i4);
                    if (AbstractC0150d.f(cCharAt, 31) <= 0 || AbstractC0150d.f(cCharAt, 127) >= 0 || q0.d.G(" #%/:?@[\\]", cCharAt, 0, 6) != -1) {
                        return null;
                    }
                    i4 = i5;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressF = (q0.k.B(str, false, "[") && str.endsWith("]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (inetAddressF == null) {
            return null;
        }
        byte[] address = inetAddressF.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressF.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i6 = 0;
        int i7 = 0;
        while (i6 < address.length) {
            int i8 = i6;
            while (i8 < 16 && address[i8] == 0 && address[i8 + 1] == 0) {
                i8 += 2;
            }
            int i9 = i8 - i6;
            if (i9 > i7 && i9 >= 4) {
                i3 = i6;
                i7 = i9;
            }
            i6 = i8 + 2;
        }
        H0.e eVar = new H0.e();
        while (i2 < address.length) {
            if (i2 == i3) {
                eVar.u(58);
                i2 += i7;
                if (i2 == 16) {
                    eVar.u(58);
                }
            } else {
                if (i2 > 0) {
                    eVar.u(58);
                }
                byte b2 = address[i2];
                byte[] bArr = v0.b.f2808a;
                eVar.v(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return eVar.n(eVar.f412b, q0.a.f2219a);
    }

    public static n0.c v(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new n0.c(i2, i3 - 1, 1);
        }
        n0.c cVar = n0.c.f2138d;
        return n0.c.f2138d;
    }
}
