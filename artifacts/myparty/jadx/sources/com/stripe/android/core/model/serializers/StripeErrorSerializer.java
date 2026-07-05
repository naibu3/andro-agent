package com.stripe.android.core.model.serializers;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.json.JSONObject;

/* compiled from: StripeErrorSerializer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/core/model/serializers/StripeErrorSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/core/StripeError;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StripeErrorSerializer implements KSerializer<StripeError> {
    public static final StripeErrorSerializer INSTANCE = new StripeErrorSerializer();
    private static final SerialDescriptor descriptor = JsonObject.INSTANCE.serializer().getDescriptor();

    private StripeErrorSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public StripeError deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalStateException("Check failed.");
        }
        return new StripeErrorJsonParser().parse(new JSONObject(((JsonDecoder) decoder).decodeJsonElement().toString()));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, StripeError value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof JsonEncoder)) {
            throw new IllegalStateException("Check failed.");
        }
        JsonEncoder jsonEncoder = (JsonEncoder) encoder;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        String code = value.getCode();
        if (code != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "code", code);
        }
        String message = value.getMessage();
        if (message != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "message", message);
        }
        String param = value.getParam();
        if (param != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, StripeErrorJsonParser.FIELD_PARAM, param);
        }
        String type = value.getType();
        if (type != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, "type", type);
        }
        String docUrl = value.getDocUrl();
        if (docUrl != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, StripeErrorJsonParser.FIELD_DOC_URL, docUrl);
        }
        String charge = value.getCharge();
        if (charge != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, StripeErrorJsonParser.FIELD_CHARGE, charge);
        }
        String declineCode = value.getDeclineCode();
        if (declineCode != null) {
            JsonElementBuildersKt.put(jsonObjectBuilder, StripeErrorJsonParser.FIELD_DECLINE_CODE, declineCode);
        }
        Map<String, String> extraFields = value.getExtraFields();
        if (extraFields != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(extraFields.size()));
            Iterator<T> it = extraFields.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), JsonElementKt.JsonPrimitive((String) entry.getValue()));
            }
            jsonObjectBuilder.put(StripeErrorJsonParser.FIELD_EXTRA_FIELDS, new JsonObject(MapsKt.toMap(linkedHashMap)));
        }
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
