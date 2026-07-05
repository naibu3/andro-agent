package com.stripe.android.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.utils.MapUtilsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateFinancialConnectionsSessionParams.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00072\u00020\u0001:\u0003\u0005\u0006\u0007J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H&\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "", "toMap", "", "", "InstantDebits", "USBankAccount", "Companion", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CreateFinancialConnectionsSessionParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final /* synthetic */ Companion INSTANCE = Companion.$$INSTANCE;

    @Deprecated
    public static final String PARAM_ATTACH_REQUIRED = "attach_required";

    @Deprecated
    public static final String PARAM_CLIENT_SECRET = "client_secret";

    @Deprecated
    public static final String PARAM_HOSTED_SURFACE = "hosted_surface";

    @Deprecated
    public static final String PARAM_LINK_MODE = "link_mode";

    @Deprecated
    public static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";

    @Deprecated
    public static final String PARAM_PRODUCT = "product";

    Map<String, Object> toMap();

    /* compiled from: CreateFinancialConnectionsSessionParams.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "clientSecret", "", "customerEmailAddress", "hostedSurface", "linkMode", "Lcom/stripe/android/model/LinkMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V", "getClientSecret", "()Ljava/lang/String;", "getCustomerEmailAddress", "getHostedSurface", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "toMap", "", "", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstantDebits implements CreateFinancialConnectionsSessionParams {
        public static final int $stable = 0;
        private final String clientSecret;
        private final String customerEmailAddress;
        private final String hostedSurface;
        private final LinkMode linkMode;

        public static /* synthetic */ InstantDebits copy$default(InstantDebits instantDebits, String str, String str2, String str3, LinkMode linkMode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instantDebits.clientSecret;
            }
            if ((i & 2) != 0) {
                str2 = instantDebits.customerEmailAddress;
            }
            if ((i & 4) != 0) {
                str3 = instantDebits.hostedSurface;
            }
            if ((i & 8) != 0) {
                linkMode = instantDebits.linkMode;
            }
            return instantDebits.copy(str, str2, str3, linkMode);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCustomerEmailAddress() {
            return this.customerEmailAddress;
        }

        /* renamed from: component3, reason: from getter */
        public final String getHostedSurface() {
            return this.hostedSurface;
        }

        /* renamed from: component4, reason: from getter */
        public final LinkMode getLinkMode() {
            return this.linkMode;
        }

        public final InstantDebits copy(String clientSecret, String customerEmailAddress, String hostedSurface, LinkMode linkMode) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            return new InstantDebits(clientSecret, customerEmailAddress, hostedSurface, linkMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebits)) {
                return false;
            }
            InstantDebits instantDebits = (InstantDebits) other;
            return Intrinsics.areEqual(this.clientSecret, instantDebits.clientSecret) && Intrinsics.areEqual(this.customerEmailAddress, instantDebits.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, instantDebits.hostedSurface) && this.linkMode == instantDebits.linkMode;
        }

        public int hashCode() {
            int iHashCode = this.clientSecret.hashCode() * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LinkMode linkMode = this.linkMode;
            return iHashCode3 + (linkMode != null ? linkMode.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.clientSecret + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ", linkMode=" + this.linkMode + ")";
        }

        public InstantDebits(String clientSecret, String str, String str2, LinkMode linkMode) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            this.clientSecret = clientSecret;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
            this.linkMode = linkMode;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final String getCustomerEmailAddress() {
            return this.customerEmailAddress;
        }

        public final String getHostedSurface() {
            return this.hostedSurface;
        }

        public final LinkMode getLinkMode() {
            return this.linkMode;
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public Map<String, Object> toMap() {
            return MapUtilsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", this.clientSecret), TuplesKt.to("hosted_surface", this.hostedSurface), TuplesKt.to("product", "instant_debits"), TuplesKt.to("attach_required", true), TuplesKt.to("link_mode", CreateFinancialConnectionsSessionParamsKt.valueForHostedSurface(this.linkMode, this.hostedSurface)), TuplesKt.to("payment_method_data", new PaymentMethodCreateParams(PaymentMethod.Type.Link, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, null, null, 13, null), null, null, null, null, null, 2064382, null).toParamMap())));
        }
    }

    /* compiled from: CreateFinancialConnectionsSessionParams.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006!"}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;", "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;", "clientSecret", "", "customerName", "customerEmailAddress", "hostedSurface", "linkMode", "Lcom/stripe/android/model/LinkMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V", "getClientSecret", "()Ljava/lang/String;", "getCustomerName", "getCustomerEmailAddress", "getHostedSurface", "getLinkMode", "()Lcom/stripe/android/model/LinkMode;", "toMap", "", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class USBankAccount implements CreateFinancialConnectionsSessionParams {
        public static final int $stable = 0;
        private final String clientSecret;
        private final String customerEmailAddress;
        private final String customerName;
        private final String hostedSurface;
        private final LinkMode linkMode;

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, String str, String str2, String str3, String str4, LinkMode linkMode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uSBankAccount.clientSecret;
            }
            if ((i & 2) != 0) {
                str2 = uSBankAccount.customerName;
            }
            if ((i & 4) != 0) {
                str3 = uSBankAccount.customerEmailAddress;
            }
            if ((i & 8) != 0) {
                str4 = uSBankAccount.hostedSurface;
            }
            if ((i & 16) != 0) {
                linkMode = uSBankAccount.linkMode;
            }
            LinkMode linkMode2 = linkMode;
            String str5 = str3;
            return uSBankAccount.copy(str, str2, str5, str4, linkMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCustomerName() {
            return this.customerName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCustomerEmailAddress() {
            return this.customerEmailAddress;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHostedSurface() {
            return this.hostedSurface;
        }

        /* renamed from: component5, reason: from getter */
        public final LinkMode getLinkMode() {
            return this.linkMode;
        }

        public final USBankAccount copy(String clientSecret, String customerName, String customerEmailAddress, String hostedSurface, LinkMode linkMode) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customerName, "customerName");
            return new USBankAccount(clientSecret, customerName, customerEmailAddress, hostedSurface, linkMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof USBankAccount)) {
                return false;
            }
            USBankAccount uSBankAccount = (USBankAccount) other;
            return Intrinsics.areEqual(this.clientSecret, uSBankAccount.clientSecret) && Intrinsics.areEqual(this.customerName, uSBankAccount.customerName) && Intrinsics.areEqual(this.customerEmailAddress, uSBankAccount.customerEmailAddress) && Intrinsics.areEqual(this.hostedSurface, uSBankAccount.hostedSurface) && this.linkMode == uSBankAccount.linkMode;
        }

        public int hashCode() {
            int iHashCode = ((this.clientSecret.hashCode() * 31) + this.customerName.hashCode()) * 31;
            String str = this.customerEmailAddress;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.hostedSurface;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LinkMode linkMode = this.linkMode;
            return iHashCode3 + (linkMode != null ? linkMode.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.clientSecret + ", customerName=" + this.customerName + ", customerEmailAddress=" + this.customerEmailAddress + ", hostedSurface=" + this.hostedSurface + ", linkMode=" + this.linkMode + ")";
        }

        public USBankAccount(String clientSecret, String customerName, String str, String str2, LinkMode linkMode) {
            Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
            Intrinsics.checkNotNullParameter(customerName, "customerName");
            this.clientSecret = clientSecret;
            this.customerName = customerName;
            this.customerEmailAddress = str;
            this.hostedSurface = str2;
            this.linkMode = linkMode;
        }

        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final String getCustomerName() {
            return this.customerName;
        }

        public final String getCustomerEmailAddress() {
            return this.customerEmailAddress;
        }

        public final String getHostedSurface() {
            return this.hostedSurface;
        }

        public final LinkMode getLinkMode() {
            return this.linkMode;
        }

        @Override // com.stripe.android.model.CreateFinancialConnectionsSessionParams
        public Map<String, Object> toMap() {
            return MapUtilsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("client_secret", this.clientSecret), TuplesKt.to("hosted_surface", this.hostedSurface), TuplesKt.to("link_mode", CreateFinancialConnectionsSessionParamsKt.valueForHostedSurface(this.linkMode, this.hostedSurface)), TuplesKt.to("payment_method_data", PaymentMethodCreateParams.Companion.createUSBankAccount$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethod.BillingDetails(null, this.customerEmailAddress, this.customerName, null, 9, null), null, null, 6, null).toParamMap())));
        }
    }

    /* compiled from: CreateFinancialConnectionsSessionParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$Companion;", "", "<init>", "()V", "PARAM_CLIENT_SECRET", "", "PARAM_HOSTED_SURFACE", "PARAM_ATTACH_REQUIRED", "PARAM_PRODUCT", "PARAM_PAYMENT_METHOD_DATA", "PARAM_LINK_MODE", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String PARAM_ATTACH_REQUIRED = "attach_required";
        public static final String PARAM_CLIENT_SECRET = "client_secret";
        public static final String PARAM_HOSTED_SURFACE = "hosted_surface";
        public static final String PARAM_LINK_MODE = "link_mode";
        public static final String PARAM_PAYMENT_METHOD_DATA = "payment_method_data";
        public static final String PARAM_PRODUCT = "product";

        private Companion() {
        }
    }
}
