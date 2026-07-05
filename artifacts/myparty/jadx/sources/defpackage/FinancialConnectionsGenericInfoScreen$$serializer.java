package defpackage;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import defpackage.FinancialConnectionsGenericInfoScreen;
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

/* compiled from: FinancialConnectionsGenericInfoScreen.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"FinancialConnectionsGenericInfoScreen.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes4.dex */
public /* synthetic */ class FinancialConnectionsGenericInfoScreen$$serializer implements GeneratedSerializer<FinancialConnectionsGenericInfoScreen> {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private FinancialConnectionsGenericInfoScreen$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FinancialConnectionsGenericInfoScreen$$serializer financialConnectionsGenericInfoScreen$$serializer = new FinancialConnectionsGenericInfoScreen$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen", financialConnectionsGenericInfoScreen$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("header", true);
        pluginGeneratedSerialDescriptor.addElement("body", true);
        pluginGeneratedSerialDescriptor.addElement("footer", true);
        pluginGeneratedSerialDescriptor.addElement(SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final FinancialConnectionsGenericInfoScreen deserialize(Decoder decoder) {
        int i;
        String str;
        FinancialConnectionsGenericInfoScreen.Header header;
        FinancialConnectionsGenericInfoScreen.Body body;
        FinancialConnectionsGenericInfoScreen.Footer footer;
        FinancialConnectionsGenericInfoScreen.Options options;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            FinancialConnectionsGenericInfoScreen.Header header2 = (FinancialConnectionsGenericInfoScreen.Header) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE, null);
            FinancialConnectionsGenericInfoScreen.Body body2 = (FinancialConnectionsGenericInfoScreen.Body) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE, null);
            str = strDecodeStringElement2;
            footer = (FinancialConnectionsGenericInfoScreen.Footer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE, null);
            options = (FinancialConnectionsGenericInfoScreen.Options) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE, null);
            body = body2;
            header = header2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            FinancialConnectionsGenericInfoScreen.Header header3 = null;
            FinancialConnectionsGenericInfoScreen.Body body3 = null;
            FinancialConnectionsGenericInfoScreen.Footer footer2 = null;
            FinancialConnectionsGenericInfoScreen.Options options2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    header3 = (FinancialConnectionsGenericInfoScreen.Header) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Header$$serializer.INSTANCE, header3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    body3 = (FinancialConnectionsGenericInfoScreen.Body) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Body$$serializer.INSTANCE, body3);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    footer2 = (FinancialConnectionsGenericInfoScreen.Footer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, FinancialConnectionsGenericInfoScreen$Footer$$serializer.INSTANCE, footer2);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    options2 = (FinancialConnectionsGenericInfoScreen.Options) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, FinancialConnectionsGenericInfoScreen$Options$$serializer.INSTANCE, options2);
                    i2 |= 16;
                }
            }
            i = i2;
            str = strDecodeStringElement;
            header = header3;
            body = body3;
            footer = footer2;
            options = options2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen(i, str, header, body, footer, options, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FinancialConnectionsGenericInfoScreen.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
