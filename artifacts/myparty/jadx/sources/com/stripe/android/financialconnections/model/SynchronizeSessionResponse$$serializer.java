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

/* compiled from: SynchronizeSessionResponse.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/stripe/android/financialconnections/model/SynchronizeSessionResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class SynchronizeSessionResponse$$serializer implements GeneratedSerializer<SynchronizeSessionResponse> {
    public static final int $stable;
    public static final SynchronizeSessionResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SynchronizeSessionResponse$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SynchronizeSessionResponse$$serializer synchronizeSessionResponse$$serializer = new SynchronizeSessionResponse$$serializer();
        INSTANCE = synchronizeSessionResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.stripe.android.financialconnections.model.SynchronizeSessionResponse", synchronizeSessionResponse$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("manifest", false);
        pluginGeneratedSerialDescriptor.addElement("text", true);
        pluginGeneratedSerialDescriptor.addElement("visual", false);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{FinancialConnectionsSessionManifest$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(TextUpdate$$serializer.INSTANCE), VisualUpdate$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SynchronizeSessionResponse deserialize(Decoder decoder) {
        int i;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        TextUpdate textUpdate;
        VisualUpdate visualUpdate;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = (FinancialConnectionsSessionManifest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FinancialConnectionsSessionManifest$$serializer.INSTANCE, null);
            TextUpdate textUpdate2 = (TextUpdate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TextUpdate$$serializer.INSTANCE, null);
            financialConnectionsSessionManifest = financialConnectionsSessionManifest3;
            visualUpdate = (VisualUpdate) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, VisualUpdate$$serializer.INSTANCE, null);
            textUpdate = textUpdate2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            TextUpdate textUpdate3 = null;
            VisualUpdate visualUpdate2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, FinancialConnectionsSessionManifest$$serializer.INSTANCE, financialConnectionsSessionManifest2);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    textUpdate3 = (TextUpdate) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, TextUpdate$$serializer.INSTANCE, textUpdate3);
                    i2 |= 2;
                } else {
                    if (iDecodeElementIndex != 2) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    visualUpdate2 = (VisualUpdate) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, VisualUpdate$$serializer.INSTANCE, visualUpdate2);
                    i2 |= 4;
                }
            }
            i = i2;
            financialConnectionsSessionManifest = financialConnectionsSessionManifest2;
            textUpdate = textUpdate3;
            visualUpdate = visualUpdate2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SynchronizeSessionResponse(i, financialConnectionsSessionManifest, textUpdate, visualUpdate, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, SynchronizeSessionResponse value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SynchronizeSessionResponse.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
