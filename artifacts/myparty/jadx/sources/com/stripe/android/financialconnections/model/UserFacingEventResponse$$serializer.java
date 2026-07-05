package com.stripe.android.financialconnections.model;

import com.facebook.GraphResponse;
import com.stripe.android.financialconnections.model.UserFacingEventResponse;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: UserFacingEventResponse.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/UserFacingEventResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class UserFacingEventResponse$$serializer implements GeneratedSerializer<UserFacingEventResponse> {
    public static final int $stable;
    public static final UserFacingEventResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private UserFacingEventResponse$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UserFacingEventResponse$$serializer userFacingEventResponse$$serializer = new UserFacingEventResponse$$serializer();
        INSTANCE = userFacingEventResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.UserFacingEventResponse", userFacingEventResponse$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("type", false);
        pluginGeneratedSerialDescriptor.addElement("institution_selected", true);
        pluginGeneratedSerialDescriptor.addElement("error", true);
        pluginGeneratedSerialDescriptor.addElement(GraphResponse.SUCCESS_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserFacingEventResponse$Error$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(UserFacingEventResponse$Success$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final UserFacingEventResponse deserialize(Decoder decoder) {
        int i;
        String str;
        UserFacingEventResponse.InstitutionSelected institutionSelected;
        UserFacingEventResponse.Error error;
        UserFacingEventResponse.Success success;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            UserFacingEventResponse.InstitutionSelected institutionSelected2 = (UserFacingEventResponse.InstitutionSelected) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE, null);
            UserFacingEventResponse.Error error2 = (UserFacingEventResponse.Error) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, UserFacingEventResponse$Error$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            success = (UserFacingEventResponse.Success) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UserFacingEventResponse$Success$$serializer.INSTANCE, null);
            error = error2;
            institutionSelected = institutionSelected2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            UserFacingEventResponse.InstitutionSelected institutionSelected3 = null;
            UserFacingEventResponse.Error error3 = null;
            UserFacingEventResponse.Success success2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    institutionSelected3 = (UserFacingEventResponse.InstitutionSelected) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE, institutionSelected3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    error3 = (UserFacingEventResponse.Error) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, UserFacingEventResponse$Error$$serializer.INSTANCE, error3);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    success2 = (UserFacingEventResponse.Success) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, UserFacingEventResponse$Success$$serializer.INSTANCE, success2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            institutionSelected = institutionSelected3;
            error = error3;
            success = success2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserFacingEventResponse(i, str, institutionSelected, error, success, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, UserFacingEventResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserFacingEventResponse.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
