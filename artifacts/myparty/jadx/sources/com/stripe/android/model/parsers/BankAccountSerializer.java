package com.stripe.android.model.parsers;

import com.stripe.android.model.BankAccount;
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

/* compiled from: BankAccountJsonParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/parsers/BankAccountSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/BankAccount;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BankAccountSerializer implements KSerializer<BankAccount> {
    public static final BankAccountSerializer INSTANCE = new BankAccountSerializer();
    private static final SerialDescriptor descriptor = JsonObject.INSTANCE.serializer().getDescriptor();

    private BankAccountSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public BankAccount deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (!(decoder instanceof JsonDecoder)) {
            throw new IllegalStateException("Check failed.");
        }
        return new BankAccountJsonParser().parse(new JSONObject(((JsonDecoder) decoder).decodeJsonElement().toString()));
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, BankAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!(encoder instanceof JsonEncoder)) {
            throw new IllegalStateException("Check failed.");
        }
        JsonEncoder jsonEncoder = (JsonEncoder) encoder;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        jsonObjectBuilder.put("object", JsonElementKt.JsonPrimitive("bank_account"));
        jsonObjectBuilder.put("id", JsonElementKt.JsonPrimitive(value.getId()));
        jsonObjectBuilder.put(BankAccountJsonParser.FIELD_ACCOUNT_HOLDER_NAME, JsonElementKt.JsonPrimitive(value.getAccountHolderName()));
        BankAccount.Type accountHolderType = value.getAccountHolderType();
        jsonObjectBuilder.put(BankAccountJsonParser.FIELD_ACCOUNT_HOLDER_TYPE, JsonElementKt.JsonPrimitive(accountHolderType != null ? accountHolderType.getCode() : null));
        jsonObjectBuilder.put("bank_name", JsonElementKt.JsonPrimitive(value.getBankName()));
        jsonObjectBuilder.put("country", JsonElementKt.JsonPrimitive(value.getCountryCode()));
        jsonObjectBuilder.put("currency", JsonElementKt.JsonPrimitive(value.getCurrency()));
        jsonObjectBuilder.put(BankAccountJsonParser.FIELD_FINGERPRINT, JsonElementKt.JsonPrimitive(value.getFingerprint()));
        jsonObjectBuilder.put("last4", JsonElementKt.JsonPrimitive(value.getLast4()));
        jsonObjectBuilder.put(BankAccountJsonParser.FIELD_ROUTING_NUMBER, JsonElementKt.JsonPrimitive(value.getRoutingNumber()));
        BankAccount.Status status = value.getStatus();
        jsonObjectBuilder.put("status", JsonElementKt.JsonPrimitive(status != null ? status.getCode() : null));
        jsonEncoder.encodeJsonElement(jsonObjectBuilder.build());
    }
}
