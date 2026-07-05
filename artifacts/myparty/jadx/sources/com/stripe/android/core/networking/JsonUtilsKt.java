package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: JsonUtils.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\u0003H\u0007\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0006*\u00020\u0007H\u0007\u001a\u0016\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u0001*\u00020\bH\u0007¨\u0006\t"}, d2 = {"toMap", "", "", "Lkotlinx/serialization/json/JsonElement;", "toPrimitives", "", "", "Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonObject;", "stripe-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonUtilsKt {
    public static final Map<String, ?> toMap(JsonElement jsonElement) throws InvalidSerializationException {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        String simpleName = jsonElement.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        throw new InvalidSerializationException(simpleName);
    }

    public static final Object toPrimitives(JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "<this>");
        if (Intrinsics.areEqual(jsonElement, JsonNull.INSTANCE)) {
            return null;
        }
        if (jsonElement instanceof JsonArray) {
            return toPrimitives((JsonArray) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            throw new NoWhenBranchMatchedException();
        }
        return new Regex("^\"|\"$").replace(((JsonPrimitive) jsonElement).getContent(), "");
    }

    public static final List<?> toPrimitives(JsonArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "<this>");
        JsonArray jsonArray2 = jsonArray;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(jsonArray2, 10));
        Iterator<JsonElement> it = jsonArray2.iterator();
        while (it.hasNext()) {
            arrayList.add(toPrimitives(it.next()));
        }
        return arrayList;
    }

    public static final Map<String, ?> toMap(JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        JsonObject jsonObject2 = jsonObject;
        ArrayList arrayList = new ArrayList(jsonObject2.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject2.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), toPrimitives(entry.getValue())));
        }
        return MapsKt.toMap(arrayList);
    }
}
