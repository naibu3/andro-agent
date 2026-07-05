package com.stripe.hcaptcha.config;

import com.stripe.hcaptcha.encode.DurationSerializer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
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

/* compiled from: HCaptchaConfig.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/hcaptcha/config/HCaptchaConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "hcaptcha_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes6.dex */
public /* synthetic */ class HCaptchaConfig$$serializer implements GeneratedSerializer<HCaptchaConfig> {
    public static final HCaptchaConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private HCaptchaConfig$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HCaptchaConfig$$serializer hCaptchaConfig$$serializer = new HCaptchaConfig$$serializer();
        INSTANCE = hCaptchaConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.hcaptcha.config.HCaptchaConfig", hCaptchaConfig$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("siteKey", false);
        pluginGeneratedSerialDescriptor.addElement("sentry", true);
        pluginGeneratedSerialDescriptor.addElement("loading", true);
        pluginGeneratedSerialDescriptor.addElement("hideDialog", true);
        pluginGeneratedSerialDescriptor.addElement("rqdata", true);
        pluginGeneratedSerialDescriptor.addElement("jsSrc", true);
        pluginGeneratedSerialDescriptor.addElement("endpoint", true);
        pluginGeneratedSerialDescriptor.addElement("reportapi", true);
        pluginGeneratedSerialDescriptor.addElement("assethost", true);
        pluginGeneratedSerialDescriptor.addElement("imghost", true);
        pluginGeneratedSerialDescriptor.addElement("locale", true);
        pluginGeneratedSerialDescriptor.addElement("size", true);
        pluginGeneratedSerialDescriptor.addElement("orientation", true);
        pluginGeneratedSerialDescriptor.addElement("theme", true);
        pluginGeneratedSerialDescriptor.addElement("host", true);
        pluginGeneratedSerialDescriptor.addElement("customTheme", true);
        pluginGeneratedSerialDescriptor.addElement("tokenExpiration", true);
        pluginGeneratedSerialDescriptor.addElement("disableHardwareAcceleration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HCaptchaConfig.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), StringSerializer.INSTANCE, kSerializerArr[11], kSerializerArr[12], kSerializerArr[13], BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), DurationSerializer.INSTANCE, BooleanSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final HCaptchaConfig deserialize(Decoder decoder) {
        String str;
        Duration duration;
        String str2;
        HCaptchaTheme hCaptchaTheme;
        HCaptchaOrientation hCaptchaOrientation;
        HCaptchaSize hCaptchaSize;
        String str3;
        String str4;
        String strDecodeStringElement;
        String str5;
        boolean zDecodeBooleanElement;
        boolean z;
        boolean z2;
        boolean z3;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        int i2;
        boolean z4;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HCaptchaConfig.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            HCaptchaSize hCaptchaSize2 = (HCaptchaSize) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            HCaptchaOrientation hCaptchaOrientation2 = (HCaptchaOrientation) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            hCaptchaTheme = (HCaptchaTheme) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, null);
            str9 = str12;
            z = zDecodeBooleanElement4;
            str8 = str11;
            str6 = str10;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, null);
            hCaptchaSize = hCaptchaSize2;
            str3 = str14;
            hCaptchaOrientation = hCaptchaOrientation2;
            duration = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, DurationSerializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            str5 = strDecodeStringElement3;
            str4 = strDecodeStringElement2;
            z2 = zDecodeBooleanElement2;
            i = 262143;
            str = str13;
            z3 = zDecodeBooleanElement3;
        } else {
            int i5 = 17;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            boolean zDecodeBooleanElement7 = false;
            int i6 = 0;
            String str15 = null;
            Duration duration2 = null;
            String str16 = null;
            HCaptchaTheme hCaptchaTheme2 = null;
            HCaptchaOrientation hCaptchaOrientation3 = null;
            HCaptchaSize hCaptchaSize3 = null;
            String str17 = null;
            String str18 = null;
            str = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean z5 = true;
            boolean zDecodeBooleanElement8 = false;
            String str19 = null;
            String str20 = null;
            while (true) {
                boolean z6 = zDecodeBooleanElement5;
                if (z5) {
                    int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                    switch (iDecodeElementIndex) {
                        case -1:
                            i2 = i6;
                            z5 = false;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 0:
                            int i7 = i6;
                            z4 = zDecodeBooleanElement8;
                            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                            i2 = i7 | 1;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 1:
                            i6 |= 2;
                            zDecodeBooleanElement8 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                            zDecodeBooleanElement5 = z6;
                            i5 = 17;
                        case 2:
                            i2 = i6 | 4;
                            zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 2);
                            zDecodeBooleanElement8 = zDecodeBooleanElement8;
                            i6 = i2;
                            i5 = 17;
                        case 3:
                            int i8 = i6;
                            z4 = zDecodeBooleanElement8;
                            zDecodeBooleanElement7 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                            i2 = i8 | 8;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 4:
                            int i9 = i6;
                            z4 = zDecodeBooleanElement8;
                            str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                            i2 = i9 | 16;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 5:
                            int i10 = i6;
                            z4 = zDecodeBooleanElement8;
                            strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                            i2 = i10 | 32;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 6:
                            int i11 = i6;
                            z4 = zDecodeBooleanElement8;
                            str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str20);
                            i2 = i11 | 64;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 7:
                            int i12 = i6;
                            z4 = zDecodeBooleanElement8;
                            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str15);
                            i2 = i12 | 128;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 8:
                            int i13 = i6;
                            z4 = zDecodeBooleanElement8;
                            str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str17);
                            i2 = i13 | 256;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 9:
                            int i14 = i6;
                            z4 = zDecodeBooleanElement8;
                            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str);
                            i2 = i14 | 512;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 10:
                            int i15 = i6;
                            z4 = zDecodeBooleanElement8;
                            strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                            i2 = i15 | 1024;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 11:
                            int i16 = i6;
                            z4 = zDecodeBooleanElement8;
                            hCaptchaSize3 = (HCaptchaSize) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], hCaptchaSize3);
                            i2 = i16 | 2048;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 12:
                            int i17 = i6;
                            z4 = zDecodeBooleanElement8;
                            hCaptchaOrientation3 = (HCaptchaOrientation) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], hCaptchaOrientation3);
                            i2 = i17 | 4096;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 13:
                            int i18 = i6;
                            z4 = zDecodeBooleanElement8;
                            hCaptchaTheme2 = (HCaptchaTheme) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], hCaptchaTheme2);
                            i2 = i18 | 8192;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 14:
                            int i19 = i6;
                            z4 = zDecodeBooleanElement8;
                            str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str18);
                            i2 = i19 | 16384;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 15:
                            i3 = i6;
                            z4 = zDecodeBooleanElement8;
                            str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str16);
                            i4 = 32768;
                            i2 = i3 | i4;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 16:
                            i3 = i6;
                            z4 = zDecodeBooleanElement8;
                            duration2 = (Duration) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, DurationSerializer.INSTANCE, duration2);
                            i4 = 65536;
                            i2 = i3 | i4;
                            zDecodeBooleanElement8 = z4;
                            zDecodeBooleanElement5 = z6;
                            i6 = i2;
                            i5 = 17;
                        case 17:
                            zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                            i6 |= 131072;
                            zDecodeBooleanElement5 = z6;
                            i5 = 17;
                        default:
                            throw new UnknownFieldException(iDecodeElementIndex);
                    }
                } else {
                    int i20 = i6;
                    boolean z7 = zDecodeBooleanElement8;
                    duration = duration2;
                    str2 = str16;
                    hCaptchaTheme = hCaptchaTheme2;
                    hCaptchaOrientation = hCaptchaOrientation3;
                    hCaptchaSize = hCaptchaSize3;
                    str3 = str18;
                    str4 = strDecodeStringElement4;
                    strDecodeStringElement = strDecodeStringElement5;
                    str5 = strDecodeStringElement6;
                    zDecodeBooleanElement = zDecodeBooleanElement6;
                    z = zDecodeBooleanElement7;
                    z2 = z7;
                    z3 = z6;
                    str6 = str19;
                    str7 = str17;
                    str8 = str20;
                    i = i20;
                    str9 = str15;
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HCaptchaConfig(i, str4, z2, z3, z, str6, strDecodeStringElement, str8, str9, str7, str, str5, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str3, str2, duration, zDecodeBooleanElement, (SerializationConstructorMarker) null, (DefaultConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, HCaptchaConfig value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HCaptchaConfig.write$Self$hcaptcha_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
