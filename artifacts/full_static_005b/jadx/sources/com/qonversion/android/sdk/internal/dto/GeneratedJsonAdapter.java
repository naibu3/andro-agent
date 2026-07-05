package com.qonversion.android.sdk.internal.dto;

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
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QLaunchResultJsonAdapter.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001f\u001a\u00020\fH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f0\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0011\u0018\u00010\u000b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QLaunchResultJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/internal/dto/QLaunchResult;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "dateAdapter", "Ljava/util/Date;", "mapOfStringQPermissionAdapter", "", "", "Lcom/qonversion/android/sdk/internal/dto/QPermission;", "mapOfStringQProductAdapter", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "nullableMapOfStringListOfStringAdapter", "", "nullableQOfferingsAdapter", "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.internal.dto.QLaunchResultJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<QLaunchResult> {
    private volatile Constructor<QLaunchResult> constructorRef;
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Map<String, QPermission>> mapOfStringQPermissionAdapter;
    private final JsonAdapter<Map<String, QProduct>> mapOfStringQProductAdapter;
    private final JsonAdapter<Map<String, List<String>>> nullableMapOfStringListOfStringAdapter;
    private final JsonAdapter<QOfferings> nullableQOfferingsAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("uid", "timestamp", "products", "permissions", "user_products", "offerings", "products_permissions");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "uid");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Date> jsonAdapterAdapter2 = moshi.adapter(Date.class, SetsKt.emptySet(), "date");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.dateAdapter = jsonAdapterAdapter2;
        JsonAdapter<Map<String, QProduct>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, QProduct.class), SetsKt.emptySet(), "products");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.mapOfStringQProductAdapter = jsonAdapterAdapter3;
        JsonAdapter<Map<String, QPermission>> jsonAdapterAdapter4 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, QPermission.class), SetsKt.emptySet(), "permissions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.mapOfStringQPermissionAdapter = jsonAdapterAdapter4;
        JsonAdapter<QOfferings> jsonAdapterAdapter5 = moshi.adapter(QOfferings.class, SetsKt.emptySet(), "offerings");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.nullableQOfferingsAdapter = jsonAdapterAdapter5;
        JsonAdapter<Map<String, List<String>>> jsonAdapterAdapter6 = moshi.adapter(Types.newParameterizedType(Map.class, String.class, Types.newParameterizedType(List.class, String.class)), SetsKt.emptySet(), "productPermissions");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.nullableMapOfStringListOfStringAdapter = jsonAdapterAdapter6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(QLaunchResult)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public QLaunchResult fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        int i = -1;
        Date dateFromJson = null;
        Map<String, QProduct> mapFromJson = null;
        Map<String, QPermission> mapFromJson2 = null;
        Map<String, QProduct> mapFromJson3 = null;
        QOfferings qOfferingsFromJson = null;
        Map<String, List<String>> mapFromJson4 = null;
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("uid", "uid", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                        throw jsonDataExceptionUnexpectedNull;
                    }
                    break;
                case 1:
                    dateFromJson = this.dateAdapter.fromJson(reader);
                    if (dateFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("date", "timestamp", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "unexpectedNull(...)");
                        throw jsonDataExceptionUnexpectedNull2;
                    }
                    break;
                case 2:
                    mapFromJson = this.mapOfStringQProductAdapter.fromJson(reader);
                    if (mapFromJson == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("products", "products", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "unexpectedNull(...)");
                        throw jsonDataExceptionUnexpectedNull3;
                    }
                    i &= -5;
                    break;
                case 3:
                    mapFromJson2 = this.mapOfStringQPermissionAdapter.fromJson(reader);
                    if (mapFromJson2 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("permissions", "permissions", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "unexpectedNull(...)");
                        throw jsonDataExceptionUnexpectedNull4;
                    }
                    i &= -9;
                    break;
                case 4:
                    mapFromJson3 = this.mapOfStringQProductAdapter.fromJson(reader);
                    if (mapFromJson3 == null) {
                        JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("userProducts", "user_products", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "unexpectedNull(...)");
                        throw jsonDataExceptionUnexpectedNull5;
                    }
                    i &= -17;
                    break;
                case 5:
                    qOfferingsFromJson = this.nullableQOfferingsAdapter.fromJson(reader);
                    break;
                case 6:
                    mapFromJson4 = this.nullableMapOfStringListOfStringAdapter.fromJson(reader);
                    i &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i == -93) {
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("uid", "uid", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty;
            }
            if (dateFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("date", "timestamp", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty2;
            }
            Intrinsics.checkNotNull(mapFromJson, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            Intrinsics.checkNotNull(mapFromJson2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.internal.dto.QPermission>");
            Intrinsics.checkNotNull(mapFromJson3, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.qonversion.android.sdk.dto.products.QProduct>");
            return new QLaunchResult(strFromJson, dateFromJson, mapFromJson, mapFromJson2, mapFromJson3, qOfferingsFromJson, mapFromJson4);
        }
        Constructor<QLaunchResult> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QLaunchResult.class.getDeclaredConstructor(String.class, Date.class, Map.class, Map.class, Map.class, QOfferings.class, Map.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        Constructor<QLaunchResult> constructor = declaredConstructor;
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("uid", "uid", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "missingProperty(...)");
            throw jsonDataExceptionMissingProperty3;
        }
        if (dateFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("date", "timestamp", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "missingProperty(...)");
            throw jsonDataExceptionMissingProperty4;
        }
        QLaunchResult qLaunchResultNewInstance = constructor.newInstance(strFromJson, dateFromJson, mapFromJson, mapFromJson2, mapFromJson3, qOfferingsFromJson, mapFromJson4, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(qLaunchResultNewInstance, "newInstance(...)");
        return qLaunchResultNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, QLaunchResult value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("uid");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getUid());
        writer.name("timestamp");
        this.dateAdapter.toJson(writer, (JsonWriter) value_.getDate());
        writer.name("products");
        this.mapOfStringQProductAdapter.toJson(writer, (JsonWriter) value_.getProducts());
        writer.name("permissions");
        this.mapOfStringQPermissionAdapter.toJson(writer, (JsonWriter) value_.getPermissions$sdk_release());
        writer.name("user_products");
        this.mapOfStringQProductAdapter.toJson(writer, (JsonWriter) value_.getUserProducts());
        writer.name("offerings");
        this.nullableQOfferingsAdapter.toJson(writer, (JsonWriter) value_.getOfferings());
        writer.name("products_permissions");
        this.nullableMapOfStringListOfStringAdapter.toJson(writer, (JsonWriter) value_.getProductPermissions$sdk_release());
        writer.endObject();
    }
}
