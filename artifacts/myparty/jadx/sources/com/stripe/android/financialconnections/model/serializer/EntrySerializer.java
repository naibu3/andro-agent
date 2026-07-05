package com.stripe.android.financialconnections.model.serializer;

import com.stripe.android.financialconnections.model.Entry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: EntrySerializer.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/model/serializer/EntrySerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/stripe/android/financialconnections/model/Entry;", "<init>", "()V", "selectDeserializer", "Lkotlinx/serialization/KSerializer;", "element", "Lkotlinx/serialization/json/JsonElement;", "typeValue", "", "getTypeValue", "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EntrySerializer extends JsonContentPolymorphicSerializer<Entry> {
    public static final int $stable = 0;
    public static final EntrySerializer INSTANCE = new EntrySerializer();

    private EntrySerializer() {
        super(Reflection.getOrCreateKotlinClass(Entry.class));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<Entry> selectDeserializer(JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        String typeValue = getTypeValue(element);
        if (Intrinsics.areEqual(typeValue, "text")) {
            return Entry.Text.INSTANCE.serializer();
        }
        if (Intrinsics.areEqual(typeValue, "image")) {
            return Entry.Image.INSTANCE.serializer();
        }
        throw new IllegalArgumentException("Unknown type! " + getTypeValue(element));
    }

    private final String getTypeValue(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((Object) "type");
        if (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) {
            return null;
        }
        return jsonPrimitive.getContent();
    }
}
