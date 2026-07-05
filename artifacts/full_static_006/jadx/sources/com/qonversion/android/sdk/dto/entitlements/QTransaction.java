package com.qonversion.android.sdk.dto.entitlements;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QTransaction.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Ji\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "", "originalTransactionId", "", "transactionId", "offerCode", "transactionDate", "Ljava/util/Date;", "expirationDate", "transactionRevocationDate", "ownershipType", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "type", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "environment", "Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;)V", "getEnvironment", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionEnvironment;", "getExpirationDate", "()Ljava/util/Date;", "getOfferCode", "()Ljava/lang/String;", "getOriginalTransactionId", "getOwnershipType", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionOwnershipType;", "getTransactionDate", "getTransactionId", "getTransactionRevocationDate", "getType", "()Lcom/qonversion/android/sdk/dto/entitlements/QTransactionType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QTransaction {
    private final QTransactionEnvironment environment;
    private final Date expirationDate;
    private final String offerCode;
    private final String originalTransactionId;
    private final QTransactionOwnershipType ownershipType;
    private final Date transactionDate;
    private final String transactionId;
    private final Date transactionRevocationDate;
    private final QTransactionType type;

    /* renamed from: component1, reason: from getter */
    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getOfferCode() {
        return this.offerCode;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getTransactionDate() {
        return this.transactionDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component6, reason: from getter */
    public final Date getTransactionRevocationDate() {
        return this.transactionRevocationDate;
    }

    /* renamed from: component7, reason: from getter */
    public final QTransactionOwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    /* renamed from: component8, reason: from getter */
    public final QTransactionType getType() {
        return this.type;
    }

    /* renamed from: component9, reason: from getter */
    public final QTransactionEnvironment getEnvironment() {
        return this.environment;
    }

    public final QTransaction copy(@Json(name = "original_transaction_id") String originalTransactionId, @Json(name = "transaction_id") String transactionId, @Json(name = "offer_code") String offerCode, @Json(name = "transaction_timestamp") Date transactionDate, @Json(name = "expiration_timestamp") Date expirationDate, @Json(name = "transaction_revoke_timestamp") Date transactionRevocationDate, @Json(name = "ownership_type") QTransactionOwnershipType ownershipType, @Json(name = "type") QTransactionType type, @Json(name = "environment") QTransactionEnvironment environment) {
        Intrinsics.checkNotNullParameter(originalTransactionId, "originalTransactionId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(environment, "environment");
        return new QTransaction(originalTransactionId, transactionId, offerCode, transactionDate, expirationDate, transactionRevocationDate, ownershipType, type, environment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QTransaction)) {
            return false;
        }
        QTransaction qTransaction = (QTransaction) other;
        return Intrinsics.areEqual(this.originalTransactionId, qTransaction.originalTransactionId) && Intrinsics.areEqual(this.transactionId, qTransaction.transactionId) && Intrinsics.areEqual(this.offerCode, qTransaction.offerCode) && Intrinsics.areEqual(this.transactionDate, qTransaction.transactionDate) && Intrinsics.areEqual(this.expirationDate, qTransaction.expirationDate) && Intrinsics.areEqual(this.transactionRevocationDate, qTransaction.transactionRevocationDate) && this.ownershipType == qTransaction.ownershipType && this.type == qTransaction.type && this.environment == qTransaction.environment;
    }

    public int hashCode() {
        int iHashCode = ((this.originalTransactionId.hashCode() * 31) + this.transactionId.hashCode()) * 31;
        String str = this.offerCode;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.transactionDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.transactionRevocationDate;
        return ((((((iHashCode3 + (date2 != null ? date2.hashCode() : 0)) * 31) + this.ownershipType.hashCode()) * 31) + this.type.hashCode()) * 31) + this.environment.hashCode();
    }

    public String toString() {
        return "QTransaction(originalTransactionId=" + this.originalTransactionId + ", transactionId=" + this.transactionId + ", offerCode=" + this.offerCode + ", transactionDate=" + this.transactionDate + ", expirationDate=" + this.expirationDate + ", transactionRevocationDate=" + this.transactionRevocationDate + ", ownershipType=" + this.ownershipType + ", type=" + this.type + ", environment=" + this.environment + ")";
    }

    public QTransaction(@Json(name = "original_transaction_id") String originalTransactionId, @Json(name = "transaction_id") String transactionId, @Json(name = "offer_code") String str, @Json(name = "transaction_timestamp") Date transactionDate, @Json(name = "expiration_timestamp") Date date, @Json(name = "transaction_revoke_timestamp") Date date2, @Json(name = "ownership_type") QTransactionOwnershipType ownershipType, @Json(name = "type") QTransactionType type, @Json(name = "environment") QTransactionEnvironment environment) {
        Intrinsics.checkNotNullParameter(originalTransactionId, "originalTransactionId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(transactionDate, "transactionDate");
        Intrinsics.checkNotNullParameter(ownershipType, "ownershipType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(environment, "environment");
        this.originalTransactionId = originalTransactionId;
        this.transactionId = transactionId;
        this.offerCode = str;
        this.transactionDate = transactionDate;
        this.expirationDate = date;
        this.transactionRevocationDate = date2;
        this.ownershipType = ownershipType;
        this.type = type;
        this.environment = environment;
    }

    public final String getOriginalTransactionId() {
        return this.originalTransactionId;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getOfferCode() {
        return this.offerCode;
    }

    public final Date getTransactionDate() {
        return this.transactionDate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public final Date getTransactionRevocationDate() {
        return this.transactionRevocationDate;
    }

    public final QTransactionOwnershipType getOwnershipType() {
        return this.ownershipType;
    }

    public final QTransactionType getType() {
        return this.type;
    }

    public final QTransactionEnvironment getEnvironment() {
        return this.environment;
    }
}
