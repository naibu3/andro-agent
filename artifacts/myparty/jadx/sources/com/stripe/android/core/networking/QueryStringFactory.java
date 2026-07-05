package com.stripe.android.core.networking;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.QueryStringFactory;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;

/* compiled from: QueryStringFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0007J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\u0014\u0010\u0010\u001a\u00020\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0002J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0005H\u0002¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory;", "", "<init>", "()V", "create", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "createFromParamsWithEmptyValues", "compactParams", "flattenParams", "", "Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "isPrimitive", "", "value", "isPrimitiveList", "l", "flattenParamsList", "keyPrefix", "flattenParamsMap", "flattenParamsValue", "Parameter", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class QueryStringFactory {
    public static final QueryStringFactory INSTANCE = new QueryStringFactory();

    private QueryStringFactory() {
    }

    public final String create(Map<String, ?> params) {
        return CollectionsKt.joinToString$default(flattenParams(params), "&", null, null, 0, null, new Function1() { // from class: com.stripe.android.core.networking.QueryStringFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return QueryStringFactory.create$lambda$0((QueryStringFactory.Parameter) obj);
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence create$lambda$0(Parameter it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }

    public final String createFromParamsWithEmptyValues(Map<String, ?> params) {
        QueryStringFactory queryStringFactory;
        Map<String, Object> mapCompactParams;
        String strCreate;
        return (params == null || (mapCompactParams = (queryStringFactory = INSTANCE).compactParams(params)) == null || (strCreate = queryStringFactory.create(mapCompactParams)) == null) ? "" : strCreate;
    }

    public final Map<String, Object> compactParams(Map<String, ?> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        HashMap map = new HashMap(params);
        Iterator it = new HashSet(map.keySet()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            String str = (String) it.next();
            Object obj = map.get(str);
            if (obj instanceof Map) {
                map.put(str, compactParams((Map) obj));
            } else if (obj == null) {
                map.remove(str);
            }
        }
        return map;
    }

    private final List<Parameter> flattenParams(Map<String, ?> params) throws InvalidRequestException {
        return flattenParamsMap$default(this, params, null, 2, null);
    }

    private final boolean isPrimitive(Object value) {
        return (value instanceof String) || (value instanceof Number) || (value instanceof Boolean) || (value instanceof Character);
    }

    private final boolean isPrimitiveList(List<?> l) {
        List<?> list = l;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!INSTANCE.isPrimitive(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final List<Parameter> flattenParamsList(List<?> params, String keyPrefix) throws InvalidRequestException {
        if (params.isEmpty()) {
            return CollectionsKt.listOf(new Parameter(keyPrefix, ""));
        }
        if (isPrimitiveList(params)) {
            String str = keyPrefix + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = params.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(it.next(), str));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : params) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            CollectionsKt.addAll(arrayList2, INSTANCE.flattenParamsValue(obj, keyPrefix + "[" + i + "]"));
            i = i2;
        }
        return arrayList2;
    }

    static /* synthetic */ List flattenParamsMap$default(QueryStringFactory queryStringFactory, Map map, String str, int i, Object obj) throws InvalidRequestException {
        if ((i & 2) != 0) {
            str = null;
        }
        return queryStringFactory.flattenParamsMap(map, str);
    }

    private final List<Parameter> flattenParamsValue(Object value, String keyPrefix) throws InvalidRequestException {
        if (value instanceof Map) {
            return flattenParamsMap((Map) value, keyPrefix);
        }
        if (value instanceof List) {
            return flattenParamsList((List) value, keyPrefix);
        }
        if (value == null) {
            return CollectionsKt.listOf(new Parameter(keyPrefix, ""));
        }
        return CollectionsKt.listOf(new Parameter(keyPrefix, value.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: QueryStringFactory.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0002J\t\u0010\n\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/core/networking/QueryStringFactory$Parameter;", "", SDKConstants.PARAM_KEY, "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", InAppPurchaseConstants.METHOD_TO_STRING, "urlEncode", "str", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final /* data */ class Parameter {
        private final String key;
        private final String value;

        /* renamed from: component1, reason: from getter */
        private final String getKey() {
            return this.key;
        }

        /* renamed from: component2, reason: from getter */
        private final String getValue() {
            return this.value;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameter.key;
            }
            if ((i & 2) != 0) {
                str2 = parameter.value;
            }
            return parameter.copy(str, str2);
        }

        public final Parameter copy(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Parameter(key, value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Parameter)) {
                return false;
            }
            Parameter parameter = (Parameter) other;
            return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public Parameter(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        public String toString() throws UnsupportedEncodingException {
            return urlEncode(this.key) + "=" + urlEncode(this.value);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String strEncode = URLEncoder.encode(str, Charsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(strEncode, "encode(...)");
            return strEncode;
        }
    }

    private final List<Parameter> flattenParamsMap(Map<String, ?> params, String keyPrefix) throws InvalidRequestException {
        String str;
        if (params == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : params.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (keyPrefix != null && (str = keyPrefix + "[" + key + "]") != null) {
                key = str;
            }
            CollectionsKt.addAll(arrayList, INSTANCE.flattenParamsValue(value, key));
        }
        return arrayList;
    }
}
