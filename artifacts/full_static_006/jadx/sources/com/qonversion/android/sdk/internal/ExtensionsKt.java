package com.qonversion.android.sdk.internal;

import android.app.Application;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.internal.dto.QPermission;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import retrofit2.Call;

/* compiled from: extensions.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a7\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u001d\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\u000e\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000fH\u0000\u001a'\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0011H\u0080\u0004\u001a\f\u0010\u0013\u001a\u00020\u0006*\u00020\u0014H\u0000\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0016H\u0000\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0016H\u0000\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0006H\u0000\u001a\f\u0010\u001a\u001a\u00020\u0006*\u00020\u0014H\u0000\u001a\u000e\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u0019H\u0000\u001a$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u001c*\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001e0\u001cH\u0000\u001a\f\u0010\u001f\u001a\u00020\u0014*\u00020\u0006H\u0000\u001a\u0014\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u0011*\u00020\"H\u0000\u001a\u001a\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010!0\u001c*\u00020$H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006%"}, d2 = {"application", "Landroid/app/Application;", "Landroid/content/Context;", "getApplication", "(Landroid/content/Context;)Landroid/app/Application;", "isDebuggable", "", "(Landroid/content/Context;)Z", "enqueue", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lretrofit2/Call;", "callback", "Lkotlin/Function1;", "Lcom/qonversion/android/sdk/internal/CallBackKt;", "Lkotlin/ExtensionFunctionType;", "equalsIgnoreOrder", "", "other", "isInternalServerError", "", "milliSecondsToSeconds", "", "secondsToMilliSeconds", "stringValue", "", "toBoolean", "toEntitlementsMap", "", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlement;", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "toInt", "toList", "", "Lorg/json/JSONArray;", "toMap", "Lorg/json/JSONObject;", "sdk_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final boolean isInternalServerError(int i) {
        return 500 <= i && i < 600;
    }

    public static final long secondsToMilliSeconds(long j) {
        return j * 1000;
    }

    public static final boolean toBoolean(int i) {
        return i != 0;
    }

    public static final int toInt(boolean z) {
        return z ? 1 : 0;
    }

    public static final <T> void enqueue(Call<T> call, Function1<? super CallBackKt<T>, Unit> callback) {
        Intrinsics.checkNotNullParameter(call, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CallBackKt callBackKt = new CallBackKt();
        callback.invoke(callBackKt);
        call.enqueue(callBackKt);
    }

    public static final Map<String, Object> toMap(JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object map = jSONObject.get(next);
            if (jSONObject.isNull(next)) {
                map = null;
            } else if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            Intrinsics.checkNotNull(next);
            linkedHashMap.put(next, map);
        }
        return linkedHashMap;
    }

    public static final List<Object> toList(JSONArray jSONArray) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object map = jSONArray.get(i);
            if (jSONArray.isNull(i)) {
                map = null;
            } else if (map instanceof JSONArray) {
                map = toList((JSONArray) map);
            } else if (map instanceof JSONObject) {
                map = toMap((JSONObject) map);
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public static final boolean isDebuggable(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final Application getApplication(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        return (Application) applicationContext;
    }

    public static final boolean toBoolean(String str) {
        return Intrinsics.areEqual(str, "1");
    }

    public static final String stringValue(boolean z) {
        return z ? "1" : "0";
    }

    public static final long milliSecondsToSeconds(long j) {
        return j / 1000;
    }

    public static final Map<String, QEntitlement> toEntitlementsMap(Map<String, QPermission> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, QPermission> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new QEntitlement(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final <T> boolean equalsIgnoreOrder(List<? extends T> list, List<? extends T> other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return list.size() == other.size() && Intrinsics.areEqual(CollectionsKt.toSet(list), CollectionsKt.toSet(other));
    }
}
