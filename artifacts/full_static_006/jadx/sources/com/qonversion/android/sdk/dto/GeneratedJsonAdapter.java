package com.qonversion.android.sdk.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.offerings.QOfferings;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QFallbackObjectJsonAdapter.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\f\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\r\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/dto/QFallbackObjectJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/dto/QFallbackObject;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "mapOfStringQProductAdapter", "", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "nullableMapOfStringListOfStringAdapter", "", "nullableQOfferingsAdapter", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "nullableQRemoteConfigListAdapter", "Lcom/qonversion/android/sdk/dto/QRemoteConfigList;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.dto.QFallbackObjectJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<QFallbackObject> {
    private volatile Constructor<QFallbackObject> constructorRef;
    private final JsonAdapter<Map<String, QProduct>> mapOfStringQProductAdapter;
    private final JsonAdapter<Map<String, List<String>>> nullableMapOfStringListOfStringAdapter;
    private final JsonAdapter<QOfferings> nullableQOfferingsAdapter;
    private final JsonAdapter<QRemoteConfigList> nullableQRemoteConfigListAdapter;
    private final JsonReader.Options options;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("products", "offerings", "products_permissions", "remote_config_list");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<Map<String, QProduct>> jsonAdapterAdapter = moshi.adapter(Types.newParameterizedType(Map.class, String.class, QProduct.class), SetsKt.emptySet(), "products");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.mapOfStringQProductAdapter = jsonAdapterAdapter;
        JsonAdapter<QOfferings> jsonAdapterAdapter2 = moshi.adapter(QOfferings.class, SetsKt.emptySet(), "offerings");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableQOfferingsAdapter = jsonAdapterAdapter2;
        JsonAdapter<Map<String, List<String>>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Types.newParameterizedType(List.class, String.class)), SetsKt.emptySet(), "productPermissions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableMapOfStringListOfStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<QRemoteConfigList> jsonAdapterAdapter4 = moshi.adapter(QRemoteConfigList.class, SetsKt.emptySet(), "remoteConfigList");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableQRemoteConfigListAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(QFallbackObject)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public QFallbackObject fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Map<String, QProduct> mapFromJson = null;
        QOfferings qOfferingsFromJson = null;
        Map<String, List<String>> mapFromJson2 = null;
        QRemoteConfigList qRemoteConfigListFromJson = null;
        int i = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                mapFromJson = this.mapOfStringQProductAdapter.fromJson(reader);
                if (mapFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("products", "products", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                    throw jsonDataExceptionUnexpectedNull;
                }
                i = -2;
            } else if (iSelectName == 1) {
                qOfferingsFromJson = this.nullableQOfferingsAdapter.fromJson(reader);
            } else if (iSelectName == 2) {
                mapFromJson2 = this.nullableMapOfStringListOfStringAdapter.fromJson(reader);
            } else if (iSelectName == 3) {
                qRemoteConfigListFromJson = this.nullableQRemoteConfigListAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i == -2) {
            Intrinsics.checkNotNull(mapFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            return new QFallbackObject(mapFromJson, qOfferingsFromJson, mapFromJson2, qRemoteConfigListFromJson);
        }
        Constructor<QFallbackObject> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QFallbackObject.class.getDeclaredConstructor(Map.class, QOfferings.class, Map.class, QRemoteConfigList.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        QFallbackObject qFallbackObjectNewInstance = declaredConstructor.newInstance(mapFromJson, qOfferingsFromJson, mapFromJson2, qRemoteConfigListFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(qFallbackObjectNewInstance, "newInstance(...)");
        return qFallbackObjectNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, QFallbackObject value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("products");
        this.mapOfStringQProductAdapter.toJson(writer, (JsonWriter) value_.getProducts());
        writer.name("offerings");
        this.nullableQOfferingsAdapter.toJson(writer, (JsonWriter) value_.getOfferings());
        writer.name("products_permissions");
        this.nullableMapOfStringListOfStringAdapter.toJson(writer, (JsonWriter) value_.getProductPermissions());
        writer.name("remote_config_list");
        this.nullableQRemoteConfigListAdapter.toJson(writer, (JsonWriter) value_.getRemoteConfigList());
        writer.endObject();
    }
}
