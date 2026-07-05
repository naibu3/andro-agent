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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/OauthPrepane.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/OauthPrepane;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class OauthPrepane$$serializer implements GeneratedSerializer<OauthPrepane> {
    public static final int $stable;
    public static final OauthPrepane$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private OauthPrepane$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OauthPrepane$$serializer oauthPrepane$$serializer = new OauthPrepane$$serializer();
        INSTANCE = oauthPrepane$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.OauthPrepane", oauthPrepane$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("body", false);
        pluginGeneratedSerialDescriptor.addElement(SDKConstants.PARAM_GAME_REQUESTS_CTA, false);
        pluginGeneratedSerialDescriptor.addElement("institution_icon", true);
        pluginGeneratedSerialDescriptor.addElement("partner_notice", true);
        pluginGeneratedSerialDescriptor.addElement("data_access_notice", true);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{Body$$serializer.INSTANCE, Cta$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(Image$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(PartnerNotice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(DataAccessNotice$$serializer.INSTANCE), MarkdownToHtmlSerializer.INSTANCE, MarkdownToHtmlSerializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final OauthPrepane deserialize(Decoder decoder) {
        String str;
        String str2;
        DataAccessNotice dataAccessNotice;
        PartnerNotice partnerNotice;
        Image image;
        Cta cta;
        Body body;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 6;
        Body body2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Body body3 = (Body) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, Body$$serializer.INSTANCE, null);
            Cta cta2 = (Cta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, null);
            Image image2 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, null);
            PartnerNotice partnerNotice2 = (PartnerNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PartnerNotice$$serializer.INSTANCE, null);
            DataAccessNotice dataAccessNotice2 = (DataAccessNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, null);
            String str3 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, MarkdownToHtmlSerializer.INSTANCE, null);
            body = body3;
            str = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 6, MarkdownToHtmlSerializer.INSTANCE, null);
            str2 = str3;
            partnerNotice = partnerNotice2;
            dataAccessNotice = dataAccessNotice2;
            image = image2;
            cta = cta2;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            String str4 = null;
            Cta cta3 = null;
            Image image3 = null;
            PartnerNotice partnerNotice3 = null;
            DataAccessNotice dataAccessNotice3 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                    case 0:
                        body2 = (Body) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, Body$$serializer.INSTANCE, body2);
                        i3 |= 1;
                        i2 = 6;
                    case 1:
                        cta3 = (Cta) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta3);
                        i3 |= 2;
                        i2 = 6;
                    case 2:
                        image3 = (Image) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Image$$serializer.INSTANCE, image3);
                        i3 |= 4;
                    case 3:
                        partnerNotice3 = (PartnerNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, PartnerNotice$$serializer.INSTANCE, partnerNotice3);
                        i3 |= 8;
                    case 4:
                        dataAccessNotice3 = (DataAccessNotice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, DataAccessNotice$$serializer.INSTANCE, dataAccessNotice3);
                        i3 |= 16;
                    case 5:
                        str5 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, MarkdownToHtmlSerializer.INSTANCE, str5);
                        i3 |= 32;
                    case 6:
                        str4 = (String) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, MarkdownToHtmlSerializer.INSTANCE, str4);
                        i3 |= 64;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str4;
            str2 = str5;
            dataAccessNotice = dataAccessNotice3;
            partnerNotice = partnerNotice3;
            image = image3;
            cta = cta3;
            body = body2;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OauthPrepane(i, body, cta, image, partnerNotice, dataAccessNotice, str2, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, OauthPrepane value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OauthPrepane.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
