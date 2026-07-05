package com.stripe.android.financialconnections.model.serializer;

import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: BodyEntrySerializer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "LFinancialConnectionsGenericInfoScreen$Body$Entry;", "<init>", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BodyEntrySerializer extends JsonContentPolymorphicSerializer<FinancialConnectionsGenericInfoScreen.Body.Entry> {
    public static final int $stable = 0;
    public static final BodyEntrySerializer INSTANCE = new BodyEntrySerializer();

    private BodyEntrySerializer() {
        super(Reflection.getOrCreateKotlinClass(FinancialConnectionsGenericInfoScreen.Body.Entry.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    protected DeserializationStrategy<FinancialConnectionsGenericInfoScreen.Body.Entry> selectDeserializer(JsonElement element) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(element).get((Object) "type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != 3556653) {
                if (iHashCode != 100313435) {
                    if (iHashCode == 233716657 && content.equals("bullets")) {
                        return FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.INSTANCE.serializer();
                    }
                } else if (content.equals("image")) {
                    return FinancialConnectionsGenericInfoScreen.Body.Entry.Image.INSTANCE.serializer();
                }
            } else if (content.equals("text")) {
                return FinancialConnectionsGenericInfoScreen.Body.Entry.Text.INSTANCE.serializer();
            }
        }
        return FinancialConnectionsGenericInfoScreen.Body.Entry.Unknown.INSTANCE.serializer();
    }
}
