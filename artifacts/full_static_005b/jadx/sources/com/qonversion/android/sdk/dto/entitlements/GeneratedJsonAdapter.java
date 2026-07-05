package com.qonversion.android.sdk.dto.entitlements;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.io.IOException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QTransactionJsonAdapter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransactionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "dateAdapter", "Ljava/util/Date;", "nullableDateAdapter", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "qTransactionEnvironmentAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "qTransactionOwnershipTypeAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "qTransactionTypeAdapter", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: com.qonversion.android.sdk.dto.entitlements.QTransactionJsonAdapter, reason: from toString */
/* loaded from: classes2.dex */
public final class GeneratedJsonAdapter extends JsonAdapter<QTransaction> {
    private final JsonAdapter<Date> dateAdapter;
    private final JsonAdapter<Date> nullableDateAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options;
    private final JsonAdapter<QTransactionEnvironment> qTransactionEnvironmentAdapter;
    private final JsonAdapter<QTransactionOwnershipType> qTransactionOwnershipTypeAdapter;
    private final JsonAdapter<QTransactionType> qTransactionTypeAdapter;
    private final JsonAdapter<String> stringAdapter;

    public GeneratedJsonAdapter(Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options optionsOf = JsonReader.Options.of("original_transaction_id", "transaction_id", "offer_code", "transaction_timestamp", "expiration_timestamp", "transaction_revoke_timestamp", "ownership_type", "type", "environment");
        Intrinsics.checkNotNullExpressionValue(optionsOf, "of(...)");
        this.options = optionsOf;
        JsonAdapter<String> jsonAdapterAdapter = moshi.adapter(String.class, SetsKt.emptySet(), "originalTransactionId");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.stringAdapter = jsonAdapterAdapter;
        JsonAdapter<String> jsonAdapterAdapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "offerCode");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter2, "adapter(...)");
        this.nullableStringAdapter = jsonAdapterAdapter2;
        JsonAdapter<Date> jsonAdapterAdapter3 = moshi.adapter(Date.class, SetsKt.emptySet(), "transactionDate");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter3, "adapter(...)");
        this.dateAdapter = jsonAdapterAdapter3;
        JsonAdapter<Date> jsonAdapterAdapter4 = moshi.adapter(Date.class, SetsKt.emptySet(), "expirationDate");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter4, "adapter(...)");
        this.nullableDateAdapter = jsonAdapterAdapter4;
        JsonAdapter<QTransactionOwnershipType> jsonAdapterAdapter5 = moshi.adapter(QTransactionOwnershipType.class, SetsKt.emptySet(), "ownershipType");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter5, "adapter(...)");
        this.qTransactionOwnershipTypeAdapter = jsonAdapterAdapter5;
        JsonAdapter<QTransactionType> jsonAdapterAdapter6 = moshi.adapter(QTransactionType.class, SetsKt.emptySet(), "type");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter6, "adapter(...)");
        this.qTransactionTypeAdapter = jsonAdapterAdapter6;
        JsonAdapter<QTransactionEnvironment> jsonAdapterAdapter7 = moshi.adapter(QTransactionEnvironment.class, SetsKt.emptySet(), "environment");
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter7, "adapter(...)");
        this.qTransactionEnvironmentAdapter = jsonAdapterAdapter7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(QTransaction)");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.JsonAdapter
    public QTransaction fromJson(JsonReader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Date date = null;
        Date dateFromJson = null;
        Date dateFromJson2 = null;
        QTransactionOwnershipType qTransactionOwnershipTypeFromJson = null;
        QTransactionType qTransactionTypeFromJson = null;
        QTransactionEnvironment qTransactionEnvironmentFromJson = null;
        while (true) {
            Date date2 = dateFromJson2;
            Date date3 = dateFromJson;
            String str = strFromJson3;
            QTransactionEnvironment qTransactionEnvironment = qTransactionEnvironmentFromJson;
            QTransactionType qTransactionType = qTransactionTypeFromJson;
            QTransactionOwnershipType qTransactionOwnershipType = qTransactionOwnershipTypeFromJson;
            if (reader.hasNext()) {
                Date date4 = date;
                switch (reader.selectName(this.options)) {
                    case -1:
                        reader.skipName();
                        reader.skipValue();
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 0:
                        strFromJson = this.stringAdapter.fromJson(reader);
                        if (strFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull = Util.unexpectedNull("originalTransactionId", "original_transaction_id", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull;
                        }
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 1:
                        strFromJson2 = this.stringAdapter.fromJson(reader);
                        if (strFromJson2 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull2 = Util.unexpectedNull("transactionId", "transaction_id", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull2, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull2;
                        }
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 2:
                        strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 3:
                        Date dateFromJson3 = this.dateAdapter.fromJson(reader);
                        if (dateFromJson3 == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull3 = Util.unexpectedNull("transactionDate", "transaction_timestamp", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull3, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull3;
                        }
                        date = dateFromJson3;
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                    case 4:
                        dateFromJson = this.nullableDateAdapter.fromJson(reader);
                        dateFromJson2 = date2;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 5:
                        dateFromJson2 = this.nullableDateAdapter.fromJson(reader);
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 6:
                        qTransactionOwnershipTypeFromJson = this.qTransactionOwnershipTypeAdapter.fromJson(reader);
                        if (qTransactionOwnershipTypeFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull4 = Util.unexpectedNull("ownershipType", "ownership_type", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull4, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull4;
                        }
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        date = date4;
                    case 7:
                        qTransactionTypeFromJson = this.qTransactionTypeAdapter.fromJson(reader);
                        if (qTransactionTypeFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull5 = Util.unexpectedNull("type", "type", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull5, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull5;
                        }
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    case 8:
                        qTransactionEnvironmentFromJson = this.qTransactionEnvironmentAdapter.fromJson(reader);
                        if (qTransactionEnvironmentFromJson == null) {
                            JsonDataException jsonDataExceptionUnexpectedNull6 = Util.unexpectedNull("environment", "environment", reader);
                            Intrinsics.checkNotNullExpressionValue(jsonDataExceptionUnexpectedNull6, "unexpectedNull(...)");
                            throw jsonDataExceptionUnexpectedNull6;
                        }
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                    default:
                        dateFromJson2 = date2;
                        dateFromJson = date3;
                        strFromJson3 = str;
                        qTransactionEnvironmentFromJson = qTransactionEnvironment;
                        qTransactionTypeFromJson = qTransactionType;
                        qTransactionOwnershipTypeFromJson = qTransactionOwnershipType;
                        date = date4;
                }
            } else {
                Date date5 = date;
                reader.endObject();
                if (strFromJson == null) {
                    JsonDataException jsonDataExceptionMissingProperty = Util.missingProperty("originalTransactionId", "original_transaction_id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty;
                }
                if (strFromJson2 == null) {
                    JsonDataException jsonDataExceptionMissingProperty2 = Util.missingProperty("transactionId", "transaction_id", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty2, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty2;
                }
                if (date5 == null) {
                    JsonDataException jsonDataExceptionMissingProperty3 = Util.missingProperty("transactionDate", "transaction_timestamp", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty3, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty3;
                }
                if (qTransactionOwnershipType == null) {
                    JsonDataException jsonDataExceptionMissingProperty4 = Util.missingProperty("ownershipType", "ownership_type", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty4, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty4;
                }
                if (qTransactionType == null) {
                    JsonDataException jsonDataExceptionMissingProperty5 = Util.missingProperty("type", "type", reader);
                    Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty5, "missingProperty(...)");
                    throw jsonDataExceptionMissingProperty5;
                }
                if (qTransactionEnvironment != null) {
                    return new QTransaction(strFromJson, strFromJson2, str, date5, date3, date2, qTransactionOwnershipType, qTransactionType, qTransactionEnvironment);
                }
                JsonDataException jsonDataExceptionMissingProperty6 = Util.missingProperty("environment", "environment", reader);
                Intrinsics.checkNotNullExpressionValue(jsonDataExceptionMissingProperty6, "missingProperty(...)");
                throw jsonDataExceptionMissingProperty6;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public void toJson(JsonWriter writer, QTransaction value_) throws IOException {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("original_transaction_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getOriginalTransactionId());
        writer.name("transaction_id");
        this.stringAdapter.toJson(writer, (JsonWriter) value_.getTransactionId());
        writer.name("offer_code");
        this.nullableStringAdapter.toJson(writer, (JsonWriter) value_.getOfferCode());
        writer.name("transaction_timestamp");
        this.dateAdapter.toJson(writer, (JsonWriter) value_.getTransactionDate());
        writer.name("expiration_timestamp");
        this.nullableDateAdapter.toJson(writer, (JsonWriter) value_.getExpirationDate());
        writer.name("transaction_revoke_timestamp");
        this.nullableDateAdapter.toJson(writer, (JsonWriter) value_.getTransactionRevocationDate());
        writer.name("ownership_type");
        this.qTransactionOwnershipTypeAdapter.toJson(writer, (JsonWriter) value_.getOwnershipType());
        writer.name("type");
        this.qTransactionTypeAdapter.toJson(writer, (JsonWriter) value_.getType());
        writer.name("environment");
        this.qTransactionEnvironmentAdapter.toJson(writer, (JsonWriter) value_.getEnvironment());
        writer.endObject();
    }
}
