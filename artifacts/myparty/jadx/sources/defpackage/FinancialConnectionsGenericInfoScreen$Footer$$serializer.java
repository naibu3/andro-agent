package defpackage;

import com.stripe.android.financialconnections.model.serializer.MarkdownToHtmlSerializer;
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
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"FinancialConnectionsGenericInfoScreen.Footer.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "LFinancialConnectionsGenericInfoScreen$Footer;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes5.dex */
public /* synthetic */ class FinancialConnectionsGenericInfoScreen$Footer$$serializer implements GeneratedSerializer<FinancialConnectionsGenericInfoScreen.Footer> {
    public static final int $stable;
    public static final FinancialConnectionsGenericInfoScreen$Footer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private FinancialConnectionsGenericInfoScreen$Footer$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FinancialConnectionsGenericInfoScreen$Footer$$serializer financialConnectionsGenericInfoScreen$Footer$$serializer = new FinancialConnectionsGenericInfoScreen$Footer$$serializer();
        INSTANCE = financialConnectionsGenericInfoScreen$Footer$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("FinancialConnectionsGenericInfoScreen.Footer", financialConnectionsGenericInfoScreen$Footer$$serializer, 4);
        pluginGeneratedSerialDescriptor.addElement("disclaimer", true);
        pluginGeneratedSerialDescriptor.addElement("primary_cta", true);
        pluginGeneratedSerialDescriptor.addElement("secondary_cta", true);
        pluginGeneratedSerialDescriptor.addElement("below_cta", true);
        descriptor = pluginGeneratedSerialDescriptor;
        $stable = 8;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(MarkdownToHtmlSerializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final FinancialConnectionsGenericInfoScreen.Footer deserialize(Decoder decoder) {
        int i;
        String str;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction2;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String str3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, null);
            FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction3 = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, null);
            FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction4 = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, null);
            str = str4;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            genericInfoAction2 = genericInfoAction4;
            genericInfoAction = genericInfoAction3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction5 = null;
            FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction6 = null;
            String str5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, MarkdownToHtmlSerializer.INSTANCE, str3);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    genericInfoAction5 = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction5);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    genericInfoAction6 = (FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, FinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer.INSTANCE, genericInfoAction6);
                    i2 |= 4;
                } else {
                    if (iDecodeElementIndex != 3) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str5);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str3;
            genericInfoAction = genericInfoAction5;
            genericInfoAction2 = genericInfoAction6;
            str2 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FinancialConnectionsGenericInfoScreen.Footer(i, str, genericInfoAction, genericInfoAction2, str2, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, FinancialConnectionsGenericInfoScreen.Footer value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FinancialConnectionsGenericInfoScreen.Footer.write$Self$financial_connections_release(value, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
