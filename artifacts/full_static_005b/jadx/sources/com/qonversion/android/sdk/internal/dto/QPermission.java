package com.qonversion.android.sdk.internal.dto;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.window.embedding.EmbeddingCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementGrantType;
import com.qonversion.android.sdk.dto.entitlements.QEntitlementSource;
import com.qonversion.android.sdk.dto.entitlements.QTransaction;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QPermission.kt */
@JsonClass(generateAdapter = EmbeddingCompat.DEBUG)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0014HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010;\u001a\u00020\u000bHÆ\u0003J\u000e\u0010<\u001a\u00020\rHÀ\u0003¢\u0006\u0002\b=J\t\u0010>\u001a\u00020\rHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003J±\u0001\u0010@\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\r2\b\b\u0003\u0010\u000e\u001a\u00020\r2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00142\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\b2\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\rHÖ\u0001J\u0006\u0010E\u001a\u00020BJ\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001d¨\u0006G"}, d2 = {"Lcom/qonversion/android/sdk/internal/dto/QPermission;", "", "permissionID", "", "productID", "renewState", "Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "startedDate", "Ljava/util/Date;", "expirationDate", Constants.ScionAnalytics.PARAM_SOURCE, "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "renewsCount", "trialStartDate", "firstPurchaseDate", "lastPurchaseDate", "lastActivatedOfferCode", "grantType", "Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "autoRenewDisableDate", "transactions", "", "Lcom/qonversion/android/sdk/dto/entitlements/QTransaction;", "(Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;Ljava/util/Date;Ljava/util/Date;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;IILjava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;Ljava/util/Date;Ljava/util/List;)V", "getActive$sdk_release", "()I", "getAutoRenewDisableDate", "()Ljava/util/Date;", "getExpirationDate", "getFirstPurchaseDate", "getGrantType", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementGrantType;", "getLastActivatedOfferCode", "()Ljava/lang/String;", "getLastPurchaseDate", "getPermissionID", "getProductID", "getRenewState", "()Lcom/qonversion/android/sdk/internal/dto/QProductRenewState;", "getRenewsCount", "getSource", "()Lcom/qonversion/android/sdk/dto/entitlements/QEntitlementSource;", "getStartedDate", "getTransactions", "()Ljava/util/List;", "getTrialStartDate", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component7$sdk_release", "component8", "component9", "copy", "equals", "", "other", "hashCode", "isActive", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QPermission {
    private final int active;
    private final Date autoRenewDisableDate;
    private final Date expirationDate;
    private final Date firstPurchaseDate;
    private final QEntitlementGrantType grantType;
    private final String lastActivatedOfferCode;
    private final Date lastPurchaseDate;
    private final String permissionID;
    private final String productID;
    private final QProductRenewState renewState;
    private final int renewsCount;
    private final QEntitlementSource source;
    private final Date startedDate;
    private final List<QTransaction> transactions;
    private final Date trialStartDate;

    /* renamed from: component1, reason: from getter */
    public final String getPermissionID() {
        return this.permissionID;
    }

    /* renamed from: component10, reason: from getter */
    public final Date getFirstPurchaseDate() {
        return this.firstPurchaseDate;
    }

    /* renamed from: component11, reason: from getter */
    public final Date getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLastActivatedOfferCode() {
        return this.lastActivatedOfferCode;
    }

    /* renamed from: component13, reason: from getter */
    public final QEntitlementGrantType getGrantType() {
        return this.grantType;
    }

    /* renamed from: component14, reason: from getter */
    public final Date getAutoRenewDisableDate() {
        return this.autoRenewDisableDate;
    }

    public final List<QTransaction> component15() {
        return this.transactions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getProductID() {
        return this.productID;
    }

    /* renamed from: component3, reason: from getter */
    public final QProductRenewState getRenewState() {
        return this.renewState;
    }

    /* renamed from: component4, reason: from getter */
    public final Date getStartedDate() {
        return this.startedDate;
    }

    /* renamed from: component5, reason: from getter */
    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component6, reason: from getter */
    public final QEntitlementSource getSource() {
        return this.source;
    }

    /* renamed from: component7$sdk_release, reason: from getter */
    public final int getActive() {
        return this.active;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRenewsCount() {
        return this.renewsCount;
    }

    /* renamed from: component9, reason: from getter */
    public final Date getTrialStartDate() {
        return this.trialStartDate;
    }

    public final QPermission copy(@Json(name = "id") String permissionID, @Json(name = "associated_product") String productID, @Json(name = "renew_state") QProductRenewState renewState, @Json(name = "started_timestamp") Date startedDate, @Json(name = "expiration_timestamp") Date expirationDate, @Json(name = Constants.ScionAnalytics.PARAM_SOURCE) QEntitlementSource source, @Json(name = AppMeasurementSdk.ConditionalUserProperty.ACTIVE) int active, @Json(name = "renews_count") int renewsCount, @Json(name = "trial_start_timestamp") Date trialStartDate, @Json(name = "first_purchase_timestamp") Date firstPurchaseDate, @Json(name = "last_purchase_timestamp") Date lastPurchaseDate, @Json(name = "last_activated_offer_code") String lastActivatedOfferCode, @Json(name = "grant_type") QEntitlementGrantType grantType, @Json(name = "auto_renew_disable_timestamp") Date autoRenewDisableDate, @Json(name = "store_transactions") List<QTransaction> transactions) {
        Intrinsics.checkNotNullParameter(permissionID, "permissionID");
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(renewState, "renewState");
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new QPermission(permissionID, productID, renewState, startedDate, expirationDate, source, active, renewsCount, trialStartDate, firstPurchaseDate, lastPurchaseDate, lastActivatedOfferCode, grantType, autoRenewDisableDate, transactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QPermission)) {
            return false;
        }
        QPermission qPermission = (QPermission) other;
        return Intrinsics.areEqual(this.permissionID, qPermission.permissionID) && Intrinsics.areEqual(this.productID, qPermission.productID) && this.renewState == qPermission.renewState && Intrinsics.areEqual(this.startedDate, qPermission.startedDate) && Intrinsics.areEqual(this.expirationDate, qPermission.expirationDate) && this.source == qPermission.source && this.active == qPermission.active && this.renewsCount == qPermission.renewsCount && Intrinsics.areEqual(this.trialStartDate, qPermission.trialStartDate) && Intrinsics.areEqual(this.firstPurchaseDate, qPermission.firstPurchaseDate) && Intrinsics.areEqual(this.lastPurchaseDate, qPermission.lastPurchaseDate) && Intrinsics.areEqual(this.lastActivatedOfferCode, qPermission.lastActivatedOfferCode) && this.grantType == qPermission.grantType && Intrinsics.areEqual(this.autoRenewDisableDate, qPermission.autoRenewDisableDate) && Intrinsics.areEqual(this.transactions, qPermission.transactions);
    }

    public int hashCode() {
        int iHashCode = ((((((this.permissionID.hashCode() * 31) + this.productID.hashCode()) * 31) + this.renewState.hashCode()) * 31) + this.startedDate.hashCode()) * 31;
        Date date = this.expirationDate;
        int iHashCode2 = (((((((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + this.source.hashCode()) * 31) + Integer.hashCode(this.active)) * 31) + Integer.hashCode(this.renewsCount)) * 31;
        Date date2 = this.trialStartDate;
        int iHashCode3 = (iHashCode2 + (date2 == null ? 0 : date2.hashCode())) * 31;
        Date date3 = this.firstPurchaseDate;
        int iHashCode4 = (iHashCode3 + (date3 == null ? 0 : date3.hashCode())) * 31;
        Date date4 = this.lastPurchaseDate;
        int iHashCode5 = (iHashCode4 + (date4 == null ? 0 : date4.hashCode())) * 31;
        String str = this.lastActivatedOfferCode;
        int iHashCode6 = (((iHashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.grantType.hashCode()) * 31;
        Date date5 = this.autoRenewDisableDate;
        return ((iHashCode6 + (date5 != null ? date5.hashCode() : 0)) * 31) + this.transactions.hashCode();
    }

    public String toString() {
        return "QPermission(permissionID=" + this.permissionID + ", productID=" + this.productID + ", renewState=" + this.renewState + ", startedDate=" + this.startedDate + ", expirationDate=" + this.expirationDate + ", source=" + this.source + ", active=" + this.active + ", renewsCount=" + this.renewsCount + ", trialStartDate=" + this.trialStartDate + ", firstPurchaseDate=" + this.firstPurchaseDate + ", lastPurchaseDate=" + this.lastPurchaseDate + ", lastActivatedOfferCode=" + this.lastActivatedOfferCode + ", grantType=" + this.grantType + ", autoRenewDisableDate=" + this.autoRenewDisableDate + ", transactions=" + this.transactions + ")";
    }

    public QPermission(@Json(name = "id") String permissionID, @Json(name = "associated_product") String productID, @Json(name = "renew_state") QProductRenewState renewState, @Json(name = "started_timestamp") Date startedDate, @Json(name = "expiration_timestamp") Date date, @Json(name = Constants.ScionAnalytics.PARAM_SOURCE) QEntitlementSource source, @Json(name = AppMeasurementSdk.ConditionalUserProperty.ACTIVE) int i, @Json(name = "renews_count") int i2, @Json(name = "trial_start_timestamp") Date date2, @Json(name = "first_purchase_timestamp") Date date3, @Json(name = "last_purchase_timestamp") Date date4, @Json(name = "last_activated_offer_code") String str, @Json(name = "grant_type") QEntitlementGrantType grantType, @Json(name = "auto_renew_disable_timestamp") Date date5, @Json(name = "store_transactions") List<QTransaction> transactions) {
        Intrinsics.checkNotNullParameter(permissionID, "permissionID");
        Intrinsics.checkNotNullParameter(productID, "productID");
        Intrinsics.checkNotNullParameter(renewState, "renewState");
        Intrinsics.checkNotNullParameter(startedDate, "startedDate");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(grantType, "grantType");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.permissionID = permissionID;
        this.productID = productID;
        this.renewState = renewState;
        this.startedDate = startedDate;
        this.expirationDate = date;
        this.source = source;
        this.active = i;
        this.renewsCount = i2;
        this.trialStartDate = date2;
        this.firstPurchaseDate = date3;
        this.lastPurchaseDate = date4;
        this.lastActivatedOfferCode = str;
        this.grantType = grantType;
        this.autoRenewDisableDate = date5;
        this.transactions = transactions;
    }

    public final String getPermissionID() {
        return this.permissionID;
    }

    public final String getProductID() {
        return this.productID;
    }

    public final QProductRenewState getRenewState() {
        return this.renewState;
    }

    public final Date getStartedDate() {
        return this.startedDate;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    public /* synthetic */ QPermission(String str, String str2, QProductRenewState qProductRenewState, Date date, Date date2, QEntitlementSource qEntitlementSource, int i, int i2, Date date3, Date date4, Date date5, String str3, QEntitlementGrantType qEntitlementGrantType, Date date6, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, qProductRenewState, date, date2, (i3 & 32) != 0 ? QEntitlementSource.Unknown : qEntitlementSource, i, (i3 & 128) != 0 ? 0 : i2, date3, date4, date5, str3, (i3 & 4096) != 0 ? QEntitlementGrantType.Purchase : qEntitlementGrantType, date6, (i3 & 16384) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final QEntitlementSource getSource() {
        return this.source;
    }

    public final int getActive$sdk_release() {
        return this.active;
    }

    public final int getRenewsCount() {
        return this.renewsCount;
    }

    public final Date getTrialStartDate() {
        return this.trialStartDate;
    }

    public final Date getFirstPurchaseDate() {
        return this.firstPurchaseDate;
    }

    public final Date getLastPurchaseDate() {
        return this.lastPurchaseDate;
    }

    public final String getLastActivatedOfferCode() {
        return this.lastActivatedOfferCode;
    }

    public final QEntitlementGrantType getGrantType() {
        return this.grantType;
    }

    public final Date getAutoRenewDisableDate() {
        return this.autoRenewDisableDate;
    }

    public final List<QTransaction> getTransactions() {
        return this.transactions;
    }

    public final boolean isActive() {
        return ExtensionsKt.toBoolean(this.active);
    }
}
