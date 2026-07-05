package com.stripe.android.financialconnections.model;

import com.facebook.share.internal.ShareConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.FinancialConnectionsGenericInfoScreen$$serializer;
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

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/NetworkedAccount.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class NetworkedAccount$$serializer implements GeneratedSerializer<NetworkedAccount> {
    public static final int $stable;
    public static final NetworkedAccount$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private NetworkedAccount$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NetworkedAccount$$serializer networkedAccount$$serializer = new NetworkedAccount$$serializer();
        INSTANCE = networkedAccount$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.NetworkedAccount", networkedAccount$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("allow_selection", false);
        pluginGeneratedSerialDescriptor.addElement(ShareConstants.FEED_CAPTION_PARAM, true);
        pluginGeneratedSerialDescriptor.addElement("selection_cta", true);
        pluginGeneratedSerialDescriptor.addElement(PaymentSheetAppearanceKeys.ICON, true);
        pluginGeneratedSerialDescriptor.addElement("selection_cta_icon", true);
        pluginGeneratedSerialDescriptor.addElement("account_icon", true);
        pluginGeneratedSerialDescriptor.addElement("data_access_notice", true);
        pluginGeneratedSerialDescriptor.addElement("drawer_on_selection", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final NetworkedAccount deserialize(Decoder decoder) {
        FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen;
        int i;
        String str;
        Image image;
        Image image2;
        String str2;
        String str3;
        DataAccessNotice dataAccessNotice;
        Image image3;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            Image image4 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Image$$serializer.INSTANCE, null);
            Image image5 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Image$$serializer.INSTANCE, null);
            Image image6 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Image$$serializer.INSTANCE, null);
            str2 = str4;
            z = zDecodeBooleanElement;
            dataAccessNotice = (DataAccessNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, DataAccessNotice$$serializer.INSTANCE, null);
            image3 = image6;
            image = image5;
            financialConnectionsGenericInfoScreen = (FinancialConnectionsGenericInfoScreen) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, null);
            image2 = image4;
            i = 511;
            str = strDecodeStringElement;
            str3 = str5;
        } else {
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            DataAccessNotice dataAccessNotice2 = null;
            FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen2 = null;
            Image image7 = null;
            Image image8 = null;
            String strDecodeStringElement2 = null;
            String str6 = null;
            String str7 = null;
            int i3 = 0;
            Image image9 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                    case 0:
                        i3 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 7;
                    case 1:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str6);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str7);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        image9 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Image$$serializer.INSTANCE, image9);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        image8 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Image$$serializer.INSTANCE, image8);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        image7 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Image$$serializer.INSTANCE, image7);
                        i3 |= 64;
                    case 7:
                        dataAccessNotice2 = (DataAccessNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice2);
                        i3 |= 128;
                    case 8:
                        financialConnectionsGenericInfoScreen2 = (FinancialConnectionsGenericInfoScreen) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FinancialConnectionsGenericInfoScreen$$serializer.INSTANCE, financialConnectionsGenericInfoScreen2);
                        i3 |= 256;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            financialConnectionsGenericInfoScreen = financialConnectionsGenericInfoScreen2;
            i = i3;
            str = strDecodeStringElement2;
            image = image8;
            image2 = image9;
            str2 = str6;
            str3 = str7;
            dataAccessNotice = dataAccessNotice2;
            image3 = image7;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NetworkedAccount(i, str, z, str2, str3, image2, image, image3, dataAccessNotice, financialConnectionsGenericInfoScreen, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, NetworkedAccount value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NetworkedAccount.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
