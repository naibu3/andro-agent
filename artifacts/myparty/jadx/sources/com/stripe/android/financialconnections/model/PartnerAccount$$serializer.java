package com.stripe.android.financialconnections.model;

import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.model.parsers.BankAccountJsonParser;
import java.util.List;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PartnerAccountsList.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/PartnerAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class PartnerAccount$$serializer implements GeneratedSerializer<PartnerAccount> {
    public static final int $stable;
    public static final PartnerAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private PartnerAccount$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PartnerAccount$$serializer partnerAccount$$serializer = new PartnerAccount$$serializer();
        INSTANCE = partnerAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.PartnerAccount", partnerAccount$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("authorization", false);
        pluginGeneratedSerialDescriptor.addElement("category", false);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("subcategory", false);
        pluginGeneratedSerialDescriptor.addElement("supported_payment_method_types", false);
        pluginGeneratedSerialDescriptor.addElement("balance_amount", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("institution", true);
        pluginGeneratedSerialDescriptor.addElement("displayable_account_numbers", true);
        pluginGeneratedSerialDescriptor.addElement("initial_balance_amount", true);
        pluginGeneratedSerialDescriptor.addElement("institution_name", true);
        pluginGeneratedSerialDescriptor.addElement("allow_selection", true);
        pluginGeneratedSerialDescriptor.addElement("allow_selection_message", true);
        pluginGeneratedSerialDescriptor.addElement("next_pane_on_selection", true);
        pluginGeneratedSerialDescriptor.addElement("institution_url", true);
        pluginGeneratedSerialDescriptor.addElement("linked_account_id", true);
        pluginGeneratedSerialDescriptor.addElement(BankAccountJsonParser.FIELD_ROUTING_NUMBER, true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Category.Serializer.INSTANCE), StringSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE), PartnerAccount.$childSerializers[5], BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsInstitution$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsAccount.Status.Serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final PartnerAccount deserialize(Decoder decoder) {
        int i;
        FinancialConnectionsSessionManifest.Pane pane;
        FinancialConnectionsInstitution financialConnectionsInstitution;
        Integer num;
        String str;
        FinancialConnectionsAccount.Status status;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        List list;
        FinancialConnectionsAccount.Subcategory subcategory;
        FinancialConnectionsAccount.Category category;
        Boolean bool;
        Integer num2;
        String str8;
        String str9;
        String str10;
        FinancialConnectionsAccount.Status status2;
        String str11;
        String str12;
        FinancialConnectionsAccount.Status status3;
        FinancialConnectionsAccount.Category category2;
        FinancialConnectionsAccount.Status status4;
        FinancialConnectionsAccount.Category category3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PartnerAccount.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            FinancialConnectionsAccount.Category category4 = (FinancialConnectionsAccount.Category) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            FinancialConnectionsAccount.Subcategory subcategory2 = (FinancialConnectionsAccount.Subcategory) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            FinancialConnectionsInstitution financialConnectionsInstitution2 = (FinancialConnectionsInstitution) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsInstitution$$serializer.INSTANCE, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, null);
            Boolean bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, null);
            FinancialConnectionsSessionManifest.Pane pane2 = (FinancialConnectionsSessionManifest.Pane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, null);
            i = 524287;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, null);
            status = (FinancialConnectionsAccount.Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsAccount.Status.Serializer.INSTANCE, null);
            str7 = str16;
            str8 = strDecodeStringElement2;
            str3 = str19;
            str4 = str18;
            pane = pane2;
            str10 = str17;
            bool = bool2;
            list = list2;
            subcategory = subcategory2;
            financialConnectionsInstitution = financialConnectionsInstitution2;
            str6 = strDecodeStringElement;
            num2 = num3;
            num = num4;
            str = str15;
            str5 = str14;
            str9 = str13;
            category = category4;
        } else {
            int i2 = 5;
            boolean z = true;
            FinancialConnectionsAccount.Status status5 = null;
            String str20 = null;
            String str21 = null;
            List list3 = null;
            FinancialConnectionsInstitution financialConnectionsInstitution3 = null;
            FinancialConnectionsAccount.Subcategory subcategory3 = null;
            String str22 = null;
            Boolean bool3 = null;
            Integer num5 = null;
            String str23 = null;
            Integer num6 = null;
            String str24 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            FinancialConnectionsSessionManifest.Pane pane3 = null;
            String str25 = null;
            String str26 = null;
            String str27 = null;
            i = 0;
            FinancialConnectionsAccount.Category category5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        status2 = status5;
                        str11 = str24;
                        str12 = str20;
                        z = false;
                        str20 = str12;
                        i2 = 5;
                        str24 = str11;
                        status5 = status2;
                    case 0:
                        status2 = status5;
                        String str28 = str24;
                        str12 = str20;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str28);
                        i |= 1;
                        category5 = category5;
                        str20 = str12;
                        i2 = 5;
                        str24 = str11;
                        status5 = status2;
                    case 1:
                        category5 = (FinancialConnectionsAccount.Category) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsAccount.Category.Serializer.INSTANCE, category5);
                        i |= 2;
                        status5 = status5;
                        pane3 = pane3;
                        i2 = 5;
                    case 2:
                        status3 = status5;
                        category2 = category5;
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        status5 = status3;
                        category5 = category2;
                        i2 = 5;
                    case 3:
                        status3 = status5;
                        category2 = category5;
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        status5 = status3;
                        category5 = category2;
                        i2 = 5;
                    case 4:
                        status3 = status5;
                        category2 = category5;
                        subcategory3 = (FinancialConnectionsAccount.Subcategory) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsAccount.Subcategory.Serializer.INSTANCE, subcategory3);
                        i |= 16;
                        status5 = status3;
                        category5 = category2;
                        i2 = 5;
                    case 5:
                        status4 = status5;
                        category3 = category5;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, kSerializerArr[i2], list3);
                        i |= 32;
                        status5 = status4;
                        category5 = category3;
                    case 6:
                        status4 = status5;
                        category3 = category5;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, num6);
                        i |= 64;
                        status5 = status4;
                        category5 = category3;
                    case 7:
                        status4 = status5;
                        category3 = category5;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str20);
                        i |= 128;
                        status5 = status4;
                        category5 = category3;
                    case 8:
                        status4 = status5;
                        category3 = category5;
                        financialConnectionsInstitution3 = (FinancialConnectionsInstitution) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsInstitution$$serializer.INSTANCE, financialConnectionsInstitution3);
                        i |= 256;
                        status5 = status4;
                        category5 = category3;
                    case 9:
                        status4 = status5;
                        category3 = category5;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str23);
                        i |= 512;
                        status5 = status4;
                        category5 = category3;
                    case 10:
                        status4 = status5;
                        category3 = category5;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, IntSerializer.INSTANCE, num5);
                        i |= 1024;
                        status5 = status4;
                        category5 = category3;
                    case 11:
                        status4 = status5;
                        category3 = category5;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str21);
                        i |= 2048;
                        status5 = status4;
                        category5 = category3;
                    case 12:
                        status4 = status5;
                        category3 = category5;
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, BooleanSerializer.INSTANCE, bool3);
                        i |= 4096;
                        status5 = status4;
                        category5 = category3;
                    case 13:
                        status4 = status5;
                        category3 = category5;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str22);
                        i |= 8192;
                        status5 = status4;
                        category5 = category3;
                    case 14:
                        category3 = category5;
                        pane3 = (FinancialConnectionsSessionManifest.Pane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FinancialConnectionsSessionManifest.Pane.Serializer.INSTANCE, pane3);
                        i |= 16384;
                        status5 = status5;
                        str25 = str25;
                        category5 = category3;
                    case 15:
                        category3 = category5;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str25);
                        i |= 32768;
                        status5 = status5;
                        str26 = str26;
                        category5 = category3;
                    case 16:
                        category3 = category5;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str26);
                        i |= 65536;
                        status5 = status5;
                        str27 = str27;
                        category5 = category3;
                    case 17:
                        category3 = category5;
                        status4 = status5;
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str27);
                        i |= 131072;
                        status5 = status4;
                        category5 = category3;
                    case 18:
                        status5 = (FinancialConnectionsAccount.Status) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, FinancialConnectionsAccount.Status.Serializer.INSTANCE, status5);
                        i |= 262144;
                        category5 = category5;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            FinancialConnectionsAccount.Status status6 = status5;
            String str29 = str24;
            pane = pane3;
            financialConnectionsInstitution = financialConnectionsInstitution3;
            num = num5;
            str = str23;
            status = status6;
            str2 = str27;
            str3 = str26;
            str4 = str25;
            str5 = str20;
            str6 = strDecodeStringElement3;
            str7 = str21;
            list = list3;
            subcategory = subcategory3;
            category = category5;
            bool = bool3;
            num2 = num6;
            str8 = strDecodeStringElement4;
            str9 = str29;
            str10 = str22;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PartnerAccount(i, str9, category, str6, str8, subcategory, list, num2, str5, financialConnectionsInstitution, str, num, str7, bool, str10, pane, str4, str3, str2, status, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, PartnerAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PartnerAccount.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
