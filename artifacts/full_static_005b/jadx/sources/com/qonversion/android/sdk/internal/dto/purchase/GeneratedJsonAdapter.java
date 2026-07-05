package com.qonversion.android.sdk.internal.dto.purchase;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PurchaseDetailsJsonAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetailsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/internal/dto/purchase/PurchaseDetails;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "longAdapter", "", "nullableListOfStringAdapter", "", "", "nullableStringAdapter", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.internal.dto.purchase.PurchaseDetailsJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<PurchaseDetails> {
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<List<String>> nullableListOfStringAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("purchase_token", "purchase_time", "transaction_id", "original_transaction_id", "product", "product_id", "context_keys", "screen_uid");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "purchaseToken");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<Long> jsonAdapterAdapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "purchaseTime");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.longAdapter = jsonAdapterAdapter2;
        JsonAdapter<List<String>> jsonAdapterAdapter3 = moshi.adapter(Types.newParameterizedType(List.class, String.class), SetsKt.emptySet(), "contextKeys");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.nullableListOfStringAdapter = jsonAdapterAdapter3;
        JsonAdapter<String> jsonAdapterAdapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "screenUid");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(PurchaseDetails)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public PurchaseDetails fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long lFromJson = null;
        String str = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        List<String> listFromJson = null;
        String strFromJson5 = null;
        while (true) {
            String str2 = strFromJson5;
            List<String> list = listFromJson;
            String str3 = strFromJson4;
            String str4 = strFromJson3;
            String str5 = strFromJson2;
            String str6 = strFromJson;
            Long l = lFromJson;
            if (reader.hasNext()) {
                String str7 = str;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    case 0:
                        String strFromJson6 = this.stringAdapter.fromJson(reader);
                        if (strFromJson6 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("purchaseToken", "purchase_token", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        str = strFromJson6;
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                    case 1:
                        lFromJson = this.longAdapter.fromJson(reader);
                        if (lFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("purchaseTime", "purchase_time", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        str = str7;
                    case 2:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("transactionId", "transaction_id", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        lFromJson = l;
                        str = str7;
                    case 3:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("originalTransactionId", "original_transaction_id", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    case 4:
                        strFromJson3 = this.stringAdapter.fromJson(reader);
                        if (strFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("storeProductId", "product", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    case 5:
                        strFromJson4 = this.stringAdapter.fromJson(reader);
                        if (strFromJson4 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("qProductId", "product_id", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    case 6:
                        listFromJson = this.nullableListOfStringAdapter.fromJson(reader);
                        strFromJson5 = str2;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    case 7:
                        strFromJson5 = this.nullableStringAdapter.fromJson(reader);
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                    default:
                        strFromJson5 = str2;
                        listFromJson = list;
                        strFromJson4 = str3;
                        strFromJson3 = str4;
                        strFromJson2 = str5;
                        strFromJson = str6;
                        lFromJson = l;
                        str = str7;
                }
            } else {
                String str8 = str;
                reader.endObject();
                if (str8 == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("purchaseToken", "purchase_token", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty;
                }
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (str6 == null) {
                        JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("transactionId", "transaction_id", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty2;
                    }
                    if (str5 == null) {
                        JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("originalTransactionId", "original_transaction_id", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty3;
                    }
                    if (str4 == null) {
                        JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("storeProductId", "product", reader);
                        Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "missingProperty(...)");
                        throw jsonDataExceptionMissingProperty4;
                    }
                    if (str3 != null) {
                        return new PurchaseDetails(str8, jLongValue, str6, str5, str4, str3, list, str2);
                    }
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("qProductId", "product_id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty5;
                }
                JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("purchaseTime", "purchase_time", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, PurchaseDetails value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("purchase_token");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getPurchaseToken());
        writer.name("purchase_time");
        this.longAdapter.toJson(writer, (JsonWriter) Long.valueOf(value_.getPurchaseTime()));
        writer.name("transaction_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTransactionId());
        writer.name("original_transaction_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getOriginalTransactionId());
        writer.name("product");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getStoreProductId());
        writer.name("product_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getQProductId());
        writer.name("context_keys");
        this.nullableListOfStringAdapter.toJson(writer, (JsonWriter) value_.getContextKeys());
        writer.name("screen_uid");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getScreenUid());
        writer.endObject();
    }
}
