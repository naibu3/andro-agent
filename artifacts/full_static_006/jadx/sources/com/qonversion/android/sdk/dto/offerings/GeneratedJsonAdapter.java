package com.qonversion.android.sdk.dto.offerings;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QOfferingJsonAdapter.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/dto/offerings/QOfferingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/dto/offerings/QOffering;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "listOfQProductAdapter", "", "Lcom/qonversion/android/sdk/dto/products/QProduct;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "qOfferingTagAdapter", "Lcom/qonversion/android/sdk/dto/offerings/QOfferingTag;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.dto.offerings.QOfferingJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<QOffering> {
    private volatile Constructor<QOffering> constructorRef;
    private final JsonAdapter<List<QProduct>> listOfQProductAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<QOfferingTag> qOfferingTagAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("id", "tag", "products");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "offeringID");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<QOfferingTag> jsonAdapterAdapter2 = moshi.adapter(QOfferingTag.class, SetsKt.emptySet(), "tag");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.qOfferingTagAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<QProduct>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, QProduct.class), SetsKt.emptySet(), "products");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.listOfQProductAdapter = jsonAdapterAdapter3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(QOffering)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public QOffering fromJson(JsonReader reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        QOfferingTag qOfferingTagFromJson = null;
        List<QProduct> listFromJson = null;
        int i = -1;
        while (reader.hasNext()) {
            int iSelectName = reader.selectName(this.options);
            if (iSelectName == -1) {
                reader.skipName();
                reader.skipValue();
            } else if (iSelectName == 0) {
                strFromJson = this.stringAdapter.fromJson(reader);
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("offeringID", "id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                    throw jsonDataExceptionUnexpectedNull;
                }
            } else if (iSelectName == 1) {
                qOfferingTagFromJson = this.qOfferingTagAdapter.fromJson(reader);
                if (qOfferingTagFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("tag", "tag", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "unexpectedNull(...)");
                    throw jsonDataExceptionUnexpectedNull2;
                }
            } else if (iSelectName == 2) {
                listFromJson = this.listOfQProductAdapter.fromJson(reader);
                if (listFromJson == null) {
                    JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("products", "products", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "unexpectedNull(...)");
                    throw jsonDataExceptionUnexpectedNull3;
                }
                i = -5;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i == -5) {
            if (strFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("offeringID", "id", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty;
            }
            if (qOfferingTagFromJson == null) {
                JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("tag", "tag", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty2;
            }
            Intrinsics.checkNotNull(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.qonversion.android.sdk.dto.products.QProduct>");
            return new QOffering(strFromJson, qOfferingTagFromJson, listFromJson);
        }
        Constructor<QOffering> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = QOffering.class.getDeclaredConstructor(String.class, QOfferingTag.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
        }
        if (strFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("offeringID", "id", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "missingProperty(...)");
            throw jsonDataExceptionMissingProperty3;
        }
        if (qOfferingTagFromJson == null) {
            JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("tag", "tag", reader);
            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "missingProperty(...)");
            throw jsonDataExceptionMissingProperty4;
        }
        QOffering qOfferingNewInstance = declaredConstructor.newInstance(strFromJson, qOfferingTagFromJson, listFromJson, Integer.valueOf(i), null);
        Intrinsics.checkNotNullExpressionValue(qOfferingNewInstance, "newInstance(...)");
        return qOfferingNewInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, QOffering value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getOfferingID());
        writer.name("tag");
        this.qOfferingTagAdapter.toJson(writer, (JsonWriter) value_.getTag());
        writer.name("products");
        this.listOfQProductAdapter.toJson(writer, (JsonWriter) value_.getProducts());
        writer.endObject();
    }
}
