package com.stripe.android.financialconnections.model;

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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/TextUpdate.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/TextUpdate;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class TextUpdate$$serializer implements GeneratedSerializer<TextUpdate> {
    public static final int $stable;
    public static final TextUpdate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private TextUpdate$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TextUpdate$$serializer textUpdate$$serializer = new TextUpdate$$serializer();
        INSTANCE = textUpdate$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.TextUpdate", textUpdate$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("account_picker_pane", true);
        pluginGeneratedSerialDescriptor.addElement("consent_pane", true);
        pluginGeneratedSerialDescriptor.addElement("link_login_pane", true);
        pluginGeneratedSerialDescriptor.addElement("networking_link_signup_pane", true);
        pluginGeneratedSerialDescriptor.addElement("oauth_prepane", true);
        pluginGeneratedSerialDescriptor.addElement("returning_networking_user_account_picker", true);
        pluginGeneratedSerialDescriptor.addElement("success_pane", true);
        pluginGeneratedSerialDescriptor.addElement("id_consent_content_pane", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(AccountPickerPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ConsentPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LinkLoginPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(NetworkingLinkSignupPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(OauthPrepane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(ReturningNetworkingUserAccountPicker$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SuccessPane$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(IDConsentContentPane$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final TextUpdate deserialize(Decoder decoder) {
        SuccessPane successPane;
        AccountPickerPane accountPickerPane;
        LinkLoginPane linkLoginPane;
        OauthPrepane oauthPrepane;
        ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker;
        ConsentPane consentPane;
        NetworkingLinkSignupPane networkingLinkSignupPane;
        IDConsentContentPane iDConsentContentPane;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 7;
        AccountPickerPane accountPickerPane2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AccountPickerPane accountPickerPane3 = (AccountPickerPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AccountPickerPane$$serializer.INSTANCE, null);
            ConsentPane consentPane2 = (ConsentPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConsentPane$$serializer.INSTANCE, null);
            LinkLoginPane linkLoginPane2 = (LinkLoginPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LinkLoginPane$$serializer.INSTANCE, null);
            NetworkingLinkSignupPane networkingLinkSignupPane2 = (NetworkingLinkSignupPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, NetworkingLinkSignupPane$$serializer.INSTANCE, null);
            OauthPrepane oauthPrepane2 = (OauthPrepane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OauthPrepane$$serializer.INSTANCE, null);
            ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker2 = (ReturningNetworkingUserAccountPicker) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE, null);
            SuccessPane successPane2 = (SuccessPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SuccessPane$$serializer.INSTANCE, null);
            iDConsentContentPane = (IDConsentContentPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IDConsentContentPane$$serializer.INSTANCE, null);
            successPane = successPane2;
            returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker2;
            networkingLinkSignupPane = networkingLinkSignupPane2;
            oauthPrepane = oauthPrepane2;
            linkLoginPane = linkLoginPane2;
            i = 255;
            consentPane = consentPane2;
            accountPickerPane = accountPickerPane3;
        } else {
            boolean z = true;
            int i3 = 0;
            IDConsentContentPane iDConsentContentPane2 = null;
            SuccessPane successPane3 = null;
            ReturningNetworkingUserAccountPicker returningNetworkingUserAccountPicker3 = null;
            ConsentPane consentPane3 = null;
            LinkLoginPane linkLoginPane3 = null;
            NetworkingLinkSignupPane networkingLinkSignupPane3 = null;
            OauthPrepane oauthPrepane3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        accountPickerPane2 = (AccountPickerPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, AccountPickerPane$$serializer.INSTANCE, accountPickerPane2);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        consentPane3 = (ConsentPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, ConsentPane$$serializer.INSTANCE, consentPane3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        linkLoginPane3 = (LinkLoginPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LinkLoginPane$$serializer.INSTANCE, linkLoginPane3);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        networkingLinkSignupPane3 = (NetworkingLinkSignupPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, NetworkingLinkSignupPane$$serializer.INSTANCE, networkingLinkSignupPane3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        oauthPrepane3 = (OauthPrepane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, OauthPrepane$$serializer.INSTANCE, oauthPrepane3);
                        i3 |= 16;
                    case 5:
                        returningNetworkingUserAccountPicker3 = (ReturningNetworkingUserAccountPicker) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, ReturningNetworkingUserAccountPicker$$serializer.INSTANCE, returningNetworkingUserAccountPicker3);
                        i3 |= 32;
                    case 6:
                        successPane3 = (SuccessPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, SuccessPane$$serializer.INSTANCE, successPane3);
                        i3 |= 64;
                    case 7:
                        iDConsentContentPane2 = (IDConsentContentPane) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IDConsentContentPane$$serializer.INSTANCE, iDConsentContentPane2);
                        i3 |= 128;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            OauthPrepane oauthPrepane4 = oauthPrepane3;
            successPane = successPane3;
            accountPickerPane = accountPickerPane2;
            linkLoginPane = linkLoginPane3;
            oauthPrepane = oauthPrepane4;
            NetworkingLinkSignupPane networkingLinkSignupPane4 = networkingLinkSignupPane3;
            returningNetworkingUserAccountPicker = returningNetworkingUserAccountPicker3;
            consentPane = consentPane3;
            networkingLinkSignupPane = networkingLinkSignupPane4;
            iDConsentContentPane = iDConsentContentPane2;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TextUpdate(i, accountPickerPane, consentPane, linkLoginPane, networkingLinkSignupPane, oauthPrepane, returningNetworkingUserAccountPicker, successPane, iDConsentContentPane, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, TextUpdate value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TextUpdate.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
