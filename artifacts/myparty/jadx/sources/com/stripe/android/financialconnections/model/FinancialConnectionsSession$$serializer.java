package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import com.stripe.android.financialconnections.network.NetworkConstants;
import com.stripe.android.model.parsers.TokenJsonParser;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FinancialConnectionsSession.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsSession.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class FinancialConnectionsSession$$serializer implements GeneratedSerializer<FinancialConnectionsSession> {
    public static final FinancialConnectionsSession$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private FinancialConnectionsSession$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FinancialConnectionsSession$$serializer financialConnectionsSession$$serializer = new FinancialConnectionsSession$$serializer();
        INSTANCE = financialConnectionsSession$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.FinancialConnectionsSession", financialConnectionsSession$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("client_secret", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(NetworkConstants.PARAM_LINKED_ACCOUNTS, true);
        pluginGeneratedSerialDescriptor.addElement("accounts", true);
        pluginGeneratedSerialDescriptor.addElement(TokenJsonParser.FIELD_LIVEMODE, false);
        pluginGeneratedSerialDescriptor.addElement("payment_account", true);
        pluginGeneratedSerialDescriptor.addElement("return_url", true);
        pluginGeneratedSerialDescriptor.addElement("bank_account_token", true);
        pluginGeneratedSerialDescriptor.addElement("manual_entry", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("status_details", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FinancialConnectionsAccountList$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsAccountList$$serializer.INSTANCE), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(PaymentAccountSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(JsonAsStringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(ManualEntry$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSession.Status.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final FinancialConnectionsSession deserialize(Decoder decoder) {
        FinancialConnectionsAccountList financialConnectionsAccountList;
        String str;
        FinancialConnectionsSession.StatusDetails statusDetails;
        FinancialConnectionsSession.Status status;
        ManualEntry manualEntry;
        String str2;
        String str3;
        PaymentAccount paymentAccount;
        int i;
        FinancialConnectionsAccountList financialConnectionsAccountList2;
        String str4;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            FinancialConnectionsAccountList financialConnectionsAccountList3 = (FinancialConnectionsAccountList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, null);
            FinancialConnectionsAccountList financialConnectionsAccountList4 = (FinancialConnectionsAccountList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            PaymentAccount paymentAccount2 = (PaymentAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PaymentAccountSerializer.INSTANCE, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonAsStringSerializer.INSTANCE, null);
            ManualEntry manualEntry2 = (ManualEntry) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ManualEntry$$serializer.INSTANCE, null);
            FinancialConnectionsSession.Status status2 = (FinancialConnectionsSession.Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FinancialConnectionsSession.Status.Serializer.INSTANCE, null);
            statusDetails = (FinancialConnectionsSession.StatusDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, null);
            status = status2;
            str3 = str6;
            str2 = str5;
            paymentAccount = paymentAccount2;
            financialConnectionsAccountList = financialConnectionsAccountList4;
            manualEntry = manualEntry2;
            z = zDecodeBooleanElement;
            financialConnectionsAccountList2 = financialConnectionsAccountList3;
            i = 2047;
            str4 = strDecodeStringElement2;
            str = strDecodeStringElement;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            FinancialConnectionsSession.StatusDetails statusDetails2 = null;
            FinancialConnectionsSession.Status status3 = null;
            ManualEntry manualEntry3 = null;
            String str7 = null;
            String str8 = null;
            PaymentAccount paymentAccount3 = null;
            FinancialConnectionsAccountList financialConnectionsAccountList5 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i4 = 0;
            FinancialConnectionsAccountList financialConnectionsAccountList6 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 10;
                    case 0:
                        i4 |= 1;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 10;
                        i3 = 9;
                    case 1:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                    case 2:
                        financialConnectionsAccountList6 = (FinancialConnectionsAccountList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList6);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                    case 3:
                        financialConnectionsAccountList5 = (FinancialConnectionsAccountList) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, financialConnectionsAccountList5);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i4 |= 16;
                        i2 = 10;
                    case 5:
                        paymentAccount3 = (PaymentAccount) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, PaymentAccountSerializer.INSTANCE, paymentAccount3);
                        i4 |= 32;
                        i2 = 10;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str7);
                        i4 |= 64;
                        i2 = 10;
                    case 7:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, JsonAsStringSerializer.INSTANCE, str8);
                        i4 |= 128;
                        i2 = 10;
                    case 8:
                        manualEntry3 = (ManualEntry) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, ManualEntry$$serializer.INSTANCE, manualEntry3);
                        i4 |= 256;
                        i2 = 10;
                    case 9:
                        status3 = (FinancialConnectionsSession.Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FinancialConnectionsSession.Status.Serializer.INSTANCE, status3);
                        i4 |= 512;
                    case 10:
                        statusDetails2 = (FinancialConnectionsSession.StatusDetails) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, FinancialConnectionsSession$StatusDetails$$serializer.INSTANCE, statusDetails2);
                        i4 |= 1024;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str9 = strDecodeStringElement3;
            financialConnectionsAccountList = financialConnectionsAccountList5;
            str = str9;
            statusDetails = statusDetails2;
            status = status3;
            manualEntry = manualEntry3;
            str2 = str7;
            str3 = str8;
            paymentAccount = paymentAccount3;
            i = i4;
            financialConnectionsAccountList2 = financialConnectionsAccountList6;
            str4 = strDecodeStringElement4;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsSession(i, str, str4, financialConnectionsAccountList2, financialConnectionsAccountList, z, paymentAccount, str2, str3, manualEntry, status, statusDetails, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, FinancialConnectionsSession value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FinancialConnectionsSession.write$Self$financial_connections_core_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
