package com.stripe.android.model.parsers;

import com.stripe.android.model.Token;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.json.JSONObject;

/* compiled from: TokenJsonParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/TokenSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/Token;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TokenSerializer implements KSerializer<Token> {
    public static final TokenSerializer INSTANCE = new TokenSerializer();
    private static final SerialDescriptor descriptor = JsonObject.INSTANCE.serializer().getDescriptor();

    private TokenSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Token deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalStateException("Check failed.");
        }
        return new TokenJsonParser().parse(new JSONObject(((JsonDecoder) decoder).decodeJsonElement().toString()));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Token value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (!(encoder instanceof JsonEncoder)) {
            throw new IllegalStateException("Check failed.");
        }
        if (value == null) {
            encoder.encodeNull();
            return;
        }
        JsonEncoder jsonEncoder = (JsonEncoder) encoder;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("object", JsonElementKt.JsonPrimitive("token"));
        jsonObjectBuilder.put("created", JsonElementKt.JsonPrimitive(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(value.getCreated().getTime()))));
        jsonObjectBuilder.put("id", JsonElementKt.JsonPrimitive(value.getId()));
        jsonObjectBuilder.put(TokenJsonParser.FIELD_LIVEMODE, JsonElementKt.JsonPrimitive(Boolean.valueOf(value.getLivemode())));
        jsonObjectBuilder.put("type", JsonElementKt.JsonPrimitive(value.getType().getCode()));
        jsonObjectBuilder.put(TokenJsonParser.FIELD_USED, JsonElementKt.JsonPrimitive(Boolean.valueOf(value.getUsed())));
        if (value.getBankAccount() != null) {
            jsonObjectBuilder.put("bank_account", jsonEncoder.getJson().encodeToJsonElement(BankAccountSerializer.INSTANCE, value.getBankAccount()));
        }
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
