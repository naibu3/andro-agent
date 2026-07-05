package com.stripe.android.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0014\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0001<B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010)J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0011HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016¨\u0006="}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "", "uniqueId", "", "initialInstitution", "manualEntryOnly", "", "searchSession", "verificationMethod", "Lcom/stripe/android/model/VerificationMethodParam;", "hostedSurface", "customer", "onBehalfOf", "linkMode", "Lcom/stripe/android/model/LinkMode;", "product", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getUniqueId", "()Ljava/lang/String;", "getInitialInstitution", "getManualEntryOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSearchSession", "getVerificationMethod", "()Lcom/stripe/android/model/VerificationMethodParam;", "getHostedSurface", "getCustomer", "getOnBehalfOf", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "getProduct", "getAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrency", "toMap", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/VerificationMethodParam;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams;", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CreateFinancialConnectionsSessionForDeferredPaymentParams {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String PARAM_AMOUNT = "amount";

    @Deprecated
    public static final String PARAM_CURRENCY = "currency";

    @Deprecated
    public static final String PARAM_CUSTOMER = "customer";

    @Deprecated
    public static final String PARAM_HOSTED_SURFACE = "hosted_surface";

    @Deprecated
    public static final String PARAM_INITIAL_INSTITUTION = "initial_institution";

    @Deprecated
    public static final String PARAM_LINK_MODE = "link_mode";

    @Deprecated
    public static final String PARAM_MANUAL_ENTRY_ONLY = "manual_entry_only";

    @Deprecated
    public static final String PARAM_ON_BEHALF_OF = "on_behalf_of";

    @Deprecated
    public static final String PARAM_PRODUCT = "product";

    @Deprecated
    public static final String PARAM_SEARCH_SESSION = "search_session";

    @Deprecated
    public static final String PARAM_UNIQUE_ID = "unique_id";

    @Deprecated
    public static final String PARAM_VERIFICATION_METHOD = "verification_method";
    private final Integer amount;
    private final String currency;
    private final String customer;
    private final String hostedSurface;
    private final String initialInstitution;
    private final LinkMode linkMode;
    private final Boolean manualEntryOnly;
    private final String onBehalfOf;
    private final String product;
    private final String searchSession;
    private final String uniqueId;
    private final VerificationMethodParam verificationMethod;

    public static /* synthetic */ CreateFinancialConnectionsSessionForDeferredPaymentParams copy$default(CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams, String str, String str2, Boolean bool, String str3, VerificationMethodParam verificationMethodParam, String str4, String str5, String str6, LinkMode linkMode, String str7, Integer num, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId;
        }
        if ((i & 2) != 0) {
            str2 = createFinancialConnectionsSessionForDeferredPaymentParams.initialInstitution;
        }
        if ((i & 4) != 0) {
            bool = createFinancialConnectionsSessionForDeferredPaymentParams.manualEntryOnly;
        }
        if ((i & 8) != 0) {
            str3 = createFinancialConnectionsSessionForDeferredPaymentParams.searchSession;
        }
        if ((i & 16) != 0) {
            verificationMethodParam = createFinancialConnectionsSessionForDeferredPaymentParams.verificationMethod;
        }
        if ((i & 32) != 0) {
            str4 = createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface;
        }
        if ((i & 64) != 0) {
            str5 = createFinancialConnectionsSessionForDeferredPaymentParams.customer;
        }
        if ((i & 128) != 0) {
            str6 = createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf;
        }
        if ((i & 256) != 0) {
            linkMode = createFinancialConnectionsSessionForDeferredPaymentParams.linkMode;
        }
        if ((i & 512) != 0) {
            str7 = createFinancialConnectionsSessionForDeferredPaymentParams.product;
        }
        if ((i & 1024) != 0) {
            num = createFinancialConnectionsSessionForDeferredPaymentParams.amount;
        }
        if ((i & 2048) != 0) {
            str8 = createFinancialConnectionsSessionForDeferredPaymentParams.currency;
        }
        Integer num2 = num;
        String str9 = str8;
        LinkMode linkMode2 = linkMode;
        String str10 = str7;
        String str11 = str5;
        String str12 = str6;
        VerificationMethodParam verificationMethodParam2 = verificationMethodParam;
        String str13 = str4;
        return createFinancialConnectionsSessionForDeferredPaymentParams.copy(str, str2, bool, str3, verificationMethodParam2, str13, str11, str12, linkMode2, str10, num2, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getProduct() {
        return this.product;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getAmount() {
        return this.amount;
    }

    /* renamed from: component12, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component2, reason: from getter */
    public final String getInitialInstitution() {
        return this.initialInstitution;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getManualEntryOnly() {
        return this.manualEntryOnly;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSearchSession() {
        return this.searchSession;
    }

    /* renamed from: component5, reason: from getter */
    public final VerificationMethodParam getVerificationMethod() {
        return this.verificationMethod;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHostedSurface() {
        return this.hostedSurface;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCustomer() {
        return this.customer;
    }

    /* renamed from: component8, reason: from getter */
    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    /* renamed from: component9, reason: from getter */
    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    public final CreateFinancialConnectionsSessionForDeferredPaymentParams copy(String uniqueId, String initialInstitution, Boolean manualEntryOnly, String searchSession, VerificationMethodParam verificationMethod, String hostedSurface, String customer, String onBehalfOf, LinkMode linkMode, String product, Integer amount, String currency) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        return new CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId, initialInstitution, manualEntryOnly, searchSession, verificationMethod, hostedSurface, customer, onBehalfOf, linkMode, product, amount, currency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFinancialConnectionsSessionForDeferredPaymentParams)) {
            return false;
        }
        CreateFinancialConnectionsSessionForDeferredPaymentParams createFinancialConnectionsSessionForDeferredPaymentParams = (CreateFinancialConnectionsSessionForDeferredPaymentParams) other;
        return Intrinsics.areEqual(this.uniqueId, createFinancialConnectionsSessionForDeferredPaymentParams.uniqueId) && Intrinsics.areEqual(this.initialInstitution, createFinancialConnectionsSessionForDeferredPaymentParams.initialInstitution) && Intrinsics.areEqual(this.manualEntryOnly, createFinancialConnectionsSessionForDeferredPaymentParams.manualEntryOnly) && Intrinsics.areEqual(this.searchSession, createFinancialConnectionsSessionForDeferredPaymentParams.searchSession) && this.verificationMethod == createFinancialConnectionsSessionForDeferredPaymentParams.verificationMethod && Intrinsics.areEqual(this.hostedSurface, createFinancialConnectionsSessionForDeferredPaymentParams.hostedSurface) && Intrinsics.areEqual(this.customer, createFinancialConnectionsSessionForDeferredPaymentParams.customer) && Intrinsics.areEqual(this.onBehalfOf, createFinancialConnectionsSessionForDeferredPaymentParams.onBehalfOf) && this.linkMode == createFinancialConnectionsSessionForDeferredPaymentParams.linkMode && Intrinsics.areEqual(this.product, createFinancialConnectionsSessionForDeferredPaymentParams.product) && Intrinsics.areEqual(this.amount, createFinancialConnectionsSessionForDeferredPaymentParams.amount) && Intrinsics.areEqual(this.currency, createFinancialConnectionsSessionForDeferredPaymentParams.currency);
    }

    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode() * 31;
        String str = this.initialInstitution;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.manualEntryOnly;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.searchSession;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VerificationMethodParam verificationMethodParam = this.verificationMethod;
        int iHashCode5 = (iHashCode4 + (verificationMethodParam == null ? 0 : verificationMethodParam.hashCode())) * 31;
        String str3 = this.hostedSurface;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customer;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onBehalfOf;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        LinkMode linkMode = this.linkMode;
        int iHashCode9 = (iHashCode8 + (linkMode == null ? 0 : linkMode.hashCode())) * 31;
        String str6 = this.product;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.amount;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.currency;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.uniqueId + ", initialInstitution=" + this.initialInstitution + ", manualEntryOnly=" + this.manualEntryOnly + ", searchSession=" + this.searchSession + ", verificationMethod=" + this.verificationMethod + ", hostedSurface=" + this.hostedSurface + ", customer=" + this.customer + ", onBehalfOf=" + this.onBehalfOf + ", linkMode=" + this.linkMode + ", product=" + this.product + ", amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    public CreateFinancialConnectionsSessionForDeferredPaymentParams(String uniqueId, String str, Boolean bool, String str2, VerificationMethodParam verificationMethodParam, String str3, String str4, String str5, LinkMode linkMode, String str6, Integer num, String str7) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        this.uniqueId = uniqueId;
        this.initialInstitution = str;
        this.manualEntryOnly = bool;
        this.searchSession = str2;
        this.verificationMethod = verificationMethodParam;
        this.hostedSurface = str3;
        this.customer = str4;
        this.onBehalfOf = str5;
        this.linkMode = linkMode;
        this.product = str6;
        this.amount = num;
        this.currency = str7;
    }

    public final String getUniqueId() {
        return this.uniqueId;
    }

    public final String getInitialInstitution() {
        return this.initialInstitution;
    }

    public final Boolean getManualEntryOnly() {
        return this.manualEntryOnly;
    }

    public final String getSearchSession() {
        return this.searchSession;
    }

    public final VerificationMethodParam getVerificationMethod() {
        return this.verificationMethod;
    }

    public final String getHostedSurface() {
        return this.hostedSurface;
    }

    public final String getCustomer() {
        return this.customer;
    }

    public final String getOnBehalfOf() {
        return this.onBehalfOf;
    }

    public final LinkMode getLinkMode() {
        return this.linkMode;
    }

    public final String getProduct() {
        return this.product;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Map<String, Object> toMap() {
        String value;
        Pair[] pairArr = new Pair[12];
        pairArr[0] = TuplesKt.to(PARAM_UNIQUE_ID, this.uniqueId);
        pairArr[1] = TuplesKt.to(PARAM_INITIAL_INSTITUTION, this.initialInstitution);
        pairArr[2] = TuplesKt.to(PARAM_MANUAL_ENTRY_ONLY, this.manualEntryOnly);
        pairArr[3] = TuplesKt.to(PARAM_SEARCH_SESSION, this.searchSession);
        VerificationMethodParam verificationMethodParam = this.verificationMethod;
        pairArr[4] = TuplesKt.to(PARAM_VERIFICATION_METHOD, verificationMethodParam != null ? verificationMethodParam.getValue() : null);
        pairArr[5] = TuplesKt.to("customer", this.customer);
        pairArr[6] = TuplesKt.to(PARAM_ON_BEHALF_OF, this.onBehalfOf);
        pairArr[7] = TuplesKt.to("hosted_surface", this.hostedSurface);
        LinkMode linkMode = this.linkMode;
        if (linkMode == null || (value = linkMode.getValue()) == null) {
            value = "LINK_DISABLED";
        }
        pairArr[8] = TuplesKt.to("link_mode", value);
        pairArr[9] = TuplesKt.to(PARAM_AMOUNT, this.amount);
        pairArr[10] = TuplesKt.to("currency", this.currency);
        pairArr[11] = TuplesKt.to("product", this.product);
        return MapsKt.mapOf(pairArr);
    }

    /* compiled from: CreateFinancialConnectionsSessionForDeferredPaymentParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionForDeferredPaymentParams$Companion;", "", "<init>", "()V", "PARAM_UNIQUE_ID", "", "PARAM_INITIAL_INSTITUTION", "PARAM_MANUAL_ENTRY_ONLY", "PARAM_SEARCH_SESSION", "PARAM_HOSTED_SURFACE", "PARAM_VERIFICATION_METHOD", "PARAM_CUSTOMER", "PARAM_ON_BEHALF_OF", "PARAM_LINK_MODE", "PARAM_AMOUNT", "PARAM_CURRENCY", "PARAM_PRODUCT", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
