package com.stripe.hcaptcha.webview;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.stripe.hcaptcha.encode.EncodeKt;
import dalvik.system.DexFile;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import okhttp3.HttpUrl;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* compiled from: HCaptchaDebugInfo.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\u00078GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/stripe/hcaptcha/webview/HCaptchaDebugInfo;", "Ljava/io/Serializable;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "debugInfo", "", "getDebugInfo", "()Ljava/lang/String;", "debugInfo$delegate", "Lkotlin/Lazy;", "sysDebug", "getSysDebug", "sysDebug$delegate", "", "packageName", "packageCode", "roBuildProps", "", "Companion", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HCaptchaDebugInfo implements Serializable {
    private static final String CHARSET_NAME = "UTF-8";
    private static final String GET_PROP_BIN = "/system/bin/getprop";
    public static final String JS_INTERFACE_TAG = "JSDI";
    private static final long serialVersionUID = -2969617621043154137L;
    private final Context context;

    /* renamed from: debugInfo$delegate, reason: from kotlin metadata */
    private final Lazy debugInfo;

    /* renamed from: sysDebug$delegate, reason: from kotlin metadata */
    private final Lazy sysDebug;

    public HCaptchaDebugInfo(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.debugInfo = LazyKt.lazy(new Function0() { // from class: com.stripe.hcaptcha.webview.HCaptchaDebugInfo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HCaptchaDebugInfo.debugInfo_delegate$lambda$0(this.f$0);
            }
        });
        this.sysDebug = LazyKt.lazy(new Function0() { // from class: com.stripe.hcaptcha.webview.HCaptchaDebugInfo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HCaptchaDebugInfo.sysDebug_delegate$lambda$1(this.f$0);
            }
        });
    }

    @JavascriptInterface
    public final String getDebugInfo() {
        return (String) this.debugInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String debugInfo_delegate$lambda$0(HCaptchaDebugInfo hCaptchaDebugInfo) {
        try {
            return EncodeKt.encodeToJson(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), hCaptchaDebugInfo.debugInfo(hCaptchaDebugInfo.context.getPackageName(), hCaptchaDebugInfo.context.getPackageCodePath()));
        } catch (IOException unused) {
            Log.d(JS_INTERFACE_TAG, "Cannot build debugInfo");
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    @JavascriptInterface
    public final String getSysDebug() {
        return (String) this.sysDebug.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String sysDebug_delegate$lambda$1(HCaptchaDebugInfo hCaptchaDebugInfo) {
        try {
            return EncodeKt.encodeToJson(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE)), hCaptchaDebugInfo.roBuildProps());
        } catch (IOException unused) {
            Log.d(JS_INTERFACE_TAG, "Cannot build sysDebug");
            return "{}";
        }
    }

    private final List<String> debugInfo(String packageName, String packageCode) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList = new ArrayList(512);
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        MessageDigest messageDigest2 = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        MessageDigest messageDigest3 = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
        DexFile dexFile = new DexFile(packageCode);
        try {
            Enumeration<String> enumerationEntries = dexFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                String strNextElement = enumerationEntries.nextElement();
                Intrinsics.checkNotNull(strNextElement);
                if (StringsKt.startsWith$default(strNextElement, "com.google.android.", false, 2, (Object) null) || StringsKt.startsWith$default(strNextElement, "android.", false, 2, (Object) null)) {
                    Charset charsetForName = Charset.forName("UTF-8");
                    Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(...)");
                    byte[] bytes = strNextElement.getBytes(charsetForName);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    messageDigest.update(bytes);
                } else {
                    Intrinsics.checkNotNull(packageName);
                    if (StringsKt.startsWith$default(strNextElement, packageName, false, 2, (Object) null)) {
                        Charset charsetForName2 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName2, "forName(...)");
                        byte[] bytes2 = strNextElement.getBytes(charsetForName2);
                        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                        messageDigest2.update(bytes2);
                    } else {
                        Charset charsetForName3 = Charset.forName("UTF-8");
                        Intrinsics.checkNotNullExpressionValue(charsetForName3, "forName(...)");
                        byte[] bytes3 = strNextElement.getBytes(charsetForName3);
                        Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
                        messageDigest3.update(bytes3);
                    }
                }
            }
            dexFile.close();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest.digest())}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            arrayList.add("sys_" + str);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest3.digest())}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            arrayList.add("deps_" + str2);
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%032x", Arrays.copyOf(new Object[]{new BigInteger(1, messageDigest2.digest())}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            arrayList.add("app_" + str3);
            arrayList.add("aver_" + Build.VERSION.RELEASE);
            return arrayList;
        } catch (Throwable th) {
            dexFile.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0037 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Map<String, String> roBuildProps() throws Throwable {
        List listEmptyList;
        String strSubstring;
        HashMap map = new HashMap();
        Process process = null;
        try {
            Process processStart = new ProcessBuilder(GET_PROP_BIN).start();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream(), "UTF-8"));
                try {
                    BufferedReader bufferedReader2 = bufferedReader;
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (StringsKt.endsWith$default(line, "]", false, 2, (Object) null)) {
                            sb.replace(0, sb.length() == 0 ? 0 : sb.length() - 1, line);
                            String string = sb.toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            List<String> listSplit = new Regex("]: \\[").split(string, 0);
                            if (!listSplit.isEmpty()) {
                                ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                                while (listIterator.hasPrevious()) {
                                    if (listIterator.previous().length() != 0) {
                                        listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                                        break;
                                    }
                                }
                                listEmptyList = CollectionsKt.emptyList();
                                String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
                                strSubstring = strArr[0].substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                if (!StringsKt.startsWith$default(strSubstring, "ro", false, 2, (Object) null)) {
                                    String str = strArr[1];
                                    String strSubstring2 = str.substring(0, str.length() - 2);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    map.put(strSubstring, strSubstring2);
                                }
                            } else {
                                listEmptyList = CollectionsKt.emptyList();
                                String[] strArr2 = (String[]) listEmptyList.toArray(new String[0]);
                                strSubstring = strArr2[0].substring(1);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                if (!StringsKt.startsWith$default(strSubstring, "ro", false, 2, (Object) null)) {
                                }
                            }
                        } else {
                            sb.append(line);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(bufferedReader, null);
                    if (processStart != null) {
                        processStart.destroy();
                    }
                    return map;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                process = processStart;
                if (process != null) {
                    process.destroy();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
