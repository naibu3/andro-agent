package com.stripe.android.ui.core.forms;

import com.stripe.android.uicore.elements.IdentifierSpec;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConvertToFormValuesMap.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u001a,\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0007\u001a<\u0010\u0006\u001a\u00020\u00072\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00012\u0006\u0010\b\u001a\u00020\u00032\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nH\u0002\u001a\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¨\u0006\u000e"}, d2 = {"convertToFormValuesMap", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "paramMap", "", "addPath", "", "path", "output", "", "addPathKey", "original", "add", "payments-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConvertToFormValuesMapKt {
    public static final Map<IdentifierSpec, String> convertToFormValuesMap(Map<String, ? extends Object> paramMap) {
        Intrinsics.checkNotNullParameter(paramMap, "paramMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        addPath(paramMap, "", linkedHashMap);
        return linkedHashMap;
    }

    private static final void addPath(Map<String, ? extends Object> map, String str, Map<IdentifierSpec, String> map2) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                map2.put(IdentifierSpec.INSTANCE.get(addPathKey(str, entry.getKey())), null);
            } else if (value instanceof String) {
                IdentifierSpec identifierSpec = IdentifierSpec.INSTANCE.get(addPathKey(str, entry.getKey()));
                Object value2 = entry.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type kotlin.String");
                map2.put(identifierSpec, (String) value2);
            } else if (value instanceof Map) {
                Object value3 = entry.getValue();
                Intrinsics.checkNotNull(value3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                addPath((Map) value3, addPathKey(str, entry.getKey()), map2);
            }
        }
    }

    private static final String addPathKey(String str, String str2) {
        return str.length() == 0 ? str2 : str + "[" + str2 + "]";
    }
}
