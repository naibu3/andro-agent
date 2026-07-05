package com.stripe.android.financialconnections.model.serializer;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonTransformingSerializer;

/* compiled from: JsonAsStringSerializer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/model/serializer/JsonAsStringSerializer;", "Lkotlinx/serialization/json/JsonTransformingSerializer;", "", "<init>", "()V", "transformDeserialize", "Lkotlinx/serialization/json/JsonElement;", "element", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class JsonAsStringSerializer extends JsonTransformingSerializer<String> {
    public static final JsonAsStringSerializer INSTANCE = new JsonAsStringSerializer();

    private JsonAsStringSerializer() {
        super(BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
    }

    @Override // kotlinx.serialization.json.JsonTransformingSerializer
    protected JsonElement transformDeserialize(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return JsonElementKt.JsonPrimitive(element.toString());
    }
}
