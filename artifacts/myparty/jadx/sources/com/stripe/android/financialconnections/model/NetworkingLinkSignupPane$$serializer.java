package com.stripe.android.financialconnections.model;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: TextUpdate.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/NetworkingLinkSignupPane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class NetworkingLinkSignupPane$$serializer implements GeneratedSerializer<NetworkingLinkSignupPane> {
    public static final int $stable;
    public static final NetworkingLinkSignupPane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private NetworkingLinkSignupPane$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NetworkingLinkSignupPane$$serializer networkingLinkSignupPane$$serializer = new NetworkingLinkSignupPane$$serializer();
        INSTANCE = networkingLinkSignupPane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.NetworkingLinkSignupPane", networkingLinkSignupPane$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement("above_cta", false);
        pluginGeneratedSerialDescriptor.addElement(SDKConstants.PARAM_GAME_REQUESTS_CTA, false);
        pluginGeneratedSerialDescriptor.addElement("skip_cta", false);
        pluginGeneratedSerialDescriptor.addElement("legal_details_notice", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{MarkdownToHtmlSerializer.INSTANCE, NetworkingLinkSignupBody$$serializer.INSTANCE, MarkdownToHtmlSerializer.INSTANCE, MarkdownToHtmlSerializer.INSTANCE, MarkdownToHtmlSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LegalDetailsNotice$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final NetworkingLinkSignupPane deserialize(Decoder decoder) {
        String str;
        LegalDetailsNotice legalDetailsNotice;
        String str2;
        String str3;
        String str4;
        NetworkingLinkSignupBody networkingLinkSignupBody;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 5;
        String str5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str6 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, null);
            NetworkingLinkSignupBody networkingLinkSignupBody2 = (NetworkingLinkSignupBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NetworkingLinkSignupBody$$serializer.INSTANCE, null);
            String str7 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MarkdownToHtmlSerializer.INSTANCE, null);
            str4 = str6;
            legalDetailsNotice = (LegalDetailsNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LegalDetailsNotice$$serializer.INSTANCE, null);
            str3 = str8;
            str = str9;
            str2 = str7;
            networkingLinkSignupBody = networkingLinkSignupBody2;
            i = 63;
        } else {
            boolean z = true;
            int i3 = 0;
            NetworkingLinkSignupBody networkingLinkSignupBody3 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            LegalDetailsNotice legalDetailsNotice2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str5 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, str5);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        networkingLinkSignupBody3 = (NetworkingLinkSignupBody) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, NetworkingLinkSignupBody$$serializer.INSTANCE, networkingLinkSignupBody3);
                        i3 |= 2;
                    case 2:
                        str10 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, MarkdownToHtmlSerializer.INSTANCE, str10);
                        i3 |= 4;
                    case 3:
                        str11 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, MarkdownToHtmlSerializer.INSTANCE, str11);
                        i3 |= 8;
                    case 4:
                        str12 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, MarkdownToHtmlSerializer.INSTANCE, str12);
                        i3 |= 16;
                    case 5:
                        legalDetailsNotice2 = (LegalDetailsNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LegalDetailsNotice$$serializer.INSTANCE, legalDetailsNotice2);
                        i3 |= 32;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str12;
            legalDetailsNotice = legalDetailsNotice2;
            str2 = str10;
            str3 = str11;
            str4 = str5;
            networkingLinkSignupBody = networkingLinkSignupBody3;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NetworkingLinkSignupPane(i, str4, networkingLinkSignupBody, str2, str3, str, legalDetailsNotice, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, NetworkingLinkSignupPane value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NetworkingLinkSignupPane.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
