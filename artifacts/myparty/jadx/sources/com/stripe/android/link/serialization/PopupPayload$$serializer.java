package com.stripe.android.link.serialization;

import com.stripe.android.link.serialization.PopupPayload;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.List;
import java.util.Map;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: PopupPayload.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/link/serialization/PopupPayload.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/link/serialization/PopupPayload;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class PopupPayload$$serializer implements GeneratedSerializer<PopupPayload> {
    public static final int $stable;
    public static final PopupPayload$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private PopupPayload$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PopupPayload$$serializer popupPayload$$serializer = new PopupPayload$$serializer();
        INSTANCE = popupPayload$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.link.serialization.PopupPayload", popupPayload$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("publishableKey", false);
        pluginGeneratedSerialDescriptor.addElement("stripeAccount", false);
        pluginGeneratedSerialDescriptor.addElement("merchantInfo", false);
        pluginGeneratedSerialDescriptor.addElement("customerInfo", false);
        pluginGeneratedSerialDescriptor.addElement("paymentInfo", false);
        pluginGeneratedSerialDescriptor.addElement("appId", false);
        pluginGeneratedSerialDescriptor.addElement("locale", false);
        pluginGeneratedSerialDescriptor.addElement("paymentUserAgent", false);
        pluginGeneratedSerialDescriptor.addElement("paymentObject", false);
        pluginGeneratedSerialDescriptor.addElement("intentMode", false);
        pluginGeneratedSerialDescriptor.addElement("setupFutureUsage", false);
        pluginGeneratedSerialDescriptor.addElement("cardBrandChoice", false);
        pluginGeneratedSerialDescriptor.addElement(NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, false);
        pluginGeneratedSerialDescriptor.addElement("linkFundingSources", false);
        pluginGeneratedSerialDescriptor.addElement("path", true);
        pluginGeneratedSerialDescriptor.addElement("integrationType", true);
        pluginGeneratedSerialDescriptor.addElement("loggerMetadata", true);
        pluginGeneratedSerialDescriptor.addElement("experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = PopupPayload.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), PopupPayload$MerchantInfo$$serializer.INSTANCE, PopupPayload$CustomerInfo$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(PopupPayload$PaymentInfo$$serializer.INSTANCE), StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(PopupPayload$CardBrandChoice$$serializer.INSTANCE), kSerializerArr[12], kSerializerArr[13], StringSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[16], kSerializerArr[17]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final PopupPayload deserialize(Decoder decoder) {
        List list;
        Map map;
        PopupPayload.CardBrandChoice cardBrandChoice;
        PopupPayload.CustomerInfo customerInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        int i;
        String str8;
        Map map2;
        PopupPayload.PaymentInfo paymentInfo;
        Map map3;
        PopupPayload.MerchantInfo merchantInfo;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = PopupPayload.$childSerializers;
        int i2 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            PopupPayload.MerchantInfo merchantInfo2 = (PopupPayload.MerchantInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PopupPayload$MerchantInfo$$serializer.INSTANCE, null);
            PopupPayload.CustomerInfo customerInfo2 = (PopupPayload.CustomerInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE, null);
            PopupPayload.PaymentInfo paymentInfo2 = (PopupPayload.PaymentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PopupPayload$PaymentInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            PopupPayload.CardBrandChoice cardBrandChoice2 = (PopupPayload.CardBrandChoice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, PopupPayload$CardBrandChoice$$serializer.INSTANCE, null);
            Map map4 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            list = list2;
            map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], null);
            str7 = strDecodeStringElement8;
            str = strDecodeStringElement2;
            str6 = strDecodeStringElement7;
            str8 = strDecodeStringElement;
            map = map4;
            cardBrandChoice = cardBrandChoice2;
            z = zDecodeBooleanElement;
            str5 = strDecodeStringElement6;
            str2 = strDecodeStringElement3;
            paymentInfo = paymentInfo2;
            i = 262143;
            customerInfo = customerInfo2;
            str9 = str10;
            str4 = strDecodeStringElement5;
            merchantInfo = merchantInfo2;
            str3 = strDecodeStringElement4;
        } else {
            int i3 = 17;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            PopupPayload.MerchantInfo merchantInfo3 = null;
            String strDecodeStringElement9 = null;
            Map map5 = null;
            List list3 = null;
            Map map6 = null;
            PopupPayload.PaymentInfo paymentInfo3 = null;
            Map map7 = null;
            PopupPayload.CardBrandChoice cardBrandChoice3 = null;
            PopupPayload.CustomerInfo customerInfo3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int i4 = 0;
            String str11 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 17;
                    case 0:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 17;
                        i2 = 10;
                    case 1:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str11);
                        i4 |= 2;
                        i3 = 17;
                        i2 = 10;
                    case 2:
                        merchantInfo3 = (PopupPayload.MerchantInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, PopupPayload$MerchantInfo$$serializer.INSTANCE, merchantInfo3);
                        i4 |= 4;
                        i3 = 17;
                        i2 = 10;
                    case 3:
                        customerInfo3 = (PopupPayload.CustomerInfo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE, customerInfo3);
                        i4 |= 8;
                        i3 = 17;
                        i2 = 10;
                    case 4:
                        paymentInfo3 = (PopupPayload.PaymentInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, PopupPayload$PaymentInfo$$serializer.INSTANCE, paymentInfo3);
                        i4 |= 16;
                        i3 = 17;
                        i2 = 10;
                    case 5:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 17;
                        i2 = 10;
                    case 6:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 17;
                        i2 = 10;
                    case 7:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 17;
                        i2 = 10;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i3 = 17;
                        i2 = 10;
                    case 9:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        i3 = 17;
                        i2 = 10;
                    case 10:
                        int i5 = i2;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i4 |= 1024;
                        i2 = i5;
                        i3 = 17;
                    case 11:
                        cardBrandChoice3 = (PopupPayload.CardBrandChoice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, PopupPayload$CardBrandChoice$$serializer.INSTANCE, cardBrandChoice3);
                        i4 |= 2048;
                        i3 = 17;
                        i2 = 10;
                    case 12:
                        map6 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], map6);
                        i4 |= 4096;
                        i3 = 17;
                    case 13:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], list3);
                        i4 |= 8192;
                        i3 = 17;
                    case 14:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i4 |= 16384;
                        i3 = 17;
                    case 15:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i4 |= 32768;
                        i3 = 17;
                    case 16:
                        map5 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], map5);
                        i4 |= 65536;
                        i3 = 17;
                    case 17:
                        map7 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], map7);
                        i4 |= 131072;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            map = map6;
            cardBrandChoice = cardBrandChoice3;
            customerInfo = customerInfo3;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement11;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement16;
            z = zDecodeBooleanElement2;
            i = i4;
            str8 = strDecodeStringElement9;
            map2 = map5;
            paymentInfo = paymentInfo3;
            map3 = map7;
            merchantInfo = merchantInfo3;
            str9 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PopupPayload(i, str8, str9, merchantInfo, customerInfo, paymentInfo, str, str2, str3, str4, str5, z, cardBrandChoice, map, list, str6, str7, map2, map3, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, PopupPayload value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PopupPayload.write$Self$paymentsheet_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
