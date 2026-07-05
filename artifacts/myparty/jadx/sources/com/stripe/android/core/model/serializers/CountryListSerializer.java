package com.stripe.android.core.model.serializers;

import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: CountryListSerializer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/core/model/serializers/CountryListSerializer;", "Lkotlinx/serialization/KSerializer;", "", "Lcom/stripe/android/core/model/Country;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor$annotations", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CountryListSerializer implements KSerializer<List<? extends Country>> {
    public static final CountryListSerializer INSTANCE = new CountryListSerializer();
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.mapSerialDescriptor(StringSerializer.INSTANCE.getDescriptor(), StringSerializer.INSTANCE.getDescriptor());

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    private CountryListSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public List<Country> deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        ArrayList arrayList = new ArrayList();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        while (true) {
            int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
            if (iDecodeElementIndex != -1) {
                String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                arrayList.add(new Country(new CountryCode(strDecodeStringElement), compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), compositeDecoderBeginStructure.decodeElementIndex(getDescriptor()))));
            } else {
                compositeDecoderBeginStructure.endStructure(getDescriptor());
                return arrayList;
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, List<Country> value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor2, value.size());
        int i = 0;
        for (Country country : value) {
            CountryCode code = country.getCode();
            String name = country.getName();
            CountryListSerializer countryListSerializer = INSTANCE;
            int i2 = i + 1;
            compositeEncoderBeginCollection.encodeStringElement(countryListSerializer.getDescriptor(), i, code.getValue());
            i += 2;
            compositeEncoderBeginCollection.encodeStringElement(countryListSerializer.getDescriptor(), i2, name);
        }
        compositeEncoderBeginCollection.endStructure(descriptor2);
    }
}
