package com.stripe.android.core.networking;

import com.facebook.internal.NativeProtocol;
import com.stripe.android.core.networking.StripeRequest;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* compiled from: AnalyticsRequestV2.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/core/networking/AnalyticsRequestV2.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class AnalyticsRequestV2$$serializer implements GeneratedSerializer<AnalyticsRequestV2> {
    public static final AnalyticsRequestV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private AnalyticsRequestV2$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AnalyticsRequestV2$$serializer analyticsRequestV2$$serializer = new AnalyticsRequestV2$$serializer();
        INSTANCE = analyticsRequestV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.core.networking.AnalyticsRequestV2", analyticsRequestV2$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement(HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, false);
        pluginGeneratedSerialDescriptor.addElement("clientId", false);
        pluginGeneratedSerialDescriptor.addElement("origin", false);
        pluginGeneratedSerialDescriptor.addElement("created", false);
        pluginGeneratedSerialDescriptor.addElement(NativeProtocol.WEB_DIALOG_PARAMS, false);
        pluginGeneratedSerialDescriptor.addElement("postParameters", true);
        pluginGeneratedSerialDescriptor.addElement("headers", true);
        pluginGeneratedSerialDescriptor.addElement("method", true);
        pluginGeneratedSerialDescriptor.addElement("mimeType", true);
        pluginGeneratedSerialDescriptor.addElement("retryResponseCodes", true);
        pluginGeneratedSerialDescriptor.addElement("url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AnalyticsRequestV2.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, StringSerializer.INSTANCE, DoubleSerializer.INSTANCE, JsonElementSerializer.INSTANCE, StringSerializer.INSTANCE, kSerializerArr[6], kSerializerArr[7], kSerializerArr[8], kSerializerArr[9], StringSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final AnalyticsRequestV2 deserialize(Decoder decoder) {
        String str;
        String str2;
        String strDecodeStringElement;
        double d;
        StripeRequest.MimeType mimeType;
        StripeRequest.Method method;
        String str3;
        Map map;
        JsonElement jsonElement;
        String str4;
        Iterable iterable;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AnalyticsRequestV2.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
            JsonElement jsonElement2 = (JsonElement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonElementSerializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            Map map2 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            StripeRequest.Method method2 = (StripeRequest.Method) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            mimeType = (StripeRequest.MimeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            d = dDecodeDoubleElement;
            iterable = (Iterable) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str4 = strDecodeStringElement6;
            map = map2;
            i = 2047;
            method = method2;
            str = strDecodeStringElement4;
            jsonElement = jsonElement2;
            str2 = strDecodeStringElement5;
            str3 = strDecodeStringElement3;
        } else {
            boolean z = true;
            int i4 = 0;
            StripeRequest.MimeType mimeType2 = null;
            Iterable iterable2 = null;
            StripeRequest.Method method3 = null;
            Map map3 = null;
            JsonElement jsonElement3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            double dDecodeDoubleElement2 = 0.0d;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 10;
                    case 0:
                        i4 |= 1;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 10;
                        i3 = 9;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 10;
                        i3 = 9;
                    case 2:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i2 = 10;
                        i3 = 9;
                    case 3:
                        dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i4 |= 8;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        jsonElement3 = (JsonElement) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, JsonElementSerializer.INSTANCE, jsonElement3);
                        i4 |= 16;
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                    case 6:
                        map3 = (Map) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], map3);
                        i4 |= 64;
                    case 7:
                        method3 = (StripeRequest.Method) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], method3);
                        i4 |= 128;
                    case 8:
                        mimeType2 = (StripeRequest.MimeType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], mimeType2);
                        i4 |= 256;
                    case 9:
                        iterable2 = (Iterable) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, kSerializerArr[i3], iterable2);
                        i4 |= 512;
                    case 10:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i4 |= 1024;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement10;
            strDecodeStringElement = strDecodeStringElement8;
            d = dDecodeDoubleElement2;
            mimeType = mimeType2;
            method = method3;
            str3 = strDecodeStringElement2;
            map = map3;
            jsonElement = jsonElement3;
            str4 = strDecodeStringElement7;
            iterable = iterable2;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AnalyticsRequestV2(i, str3, str, str2, d, jsonElement, str4, map, method, mimeType, iterable, strDecodeStringElement, null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, AnalyticsRequestV2 value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AnalyticsRequestV2.write$Self$stripe_core_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
