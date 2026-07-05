package com.stripe.android.financialconnections.lite.repository.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SynchronizeSessionResponse.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002&'B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J%\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0001¢\u0006\u0002\b%R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "", "cancelUrl", "", "hostedAuthUrl", "successUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCancelUrl$annotations", "()V", "getCancelUrl", "()Ljava/lang/String;", "getHostedAuthUrl$annotations", "getHostedAuthUrl", "getSuccessUrl$annotations", "getSuccessUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_lite_release", "$serializer", "Companion", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSessionManifest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cancelUrl;
    private final String hostedAuthUrl;
    private final String successUrl;

    public FinancialConnectionsSessionManifest() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FinancialConnectionsSessionManifest copy$default(FinancialConnectionsSessionManifest financialConnectionsSessionManifest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = financialConnectionsSessionManifest.cancelUrl;
        }
        if ((i & 2) != 0) {
            str2 = financialConnectionsSessionManifest.hostedAuthUrl;
        }
        if ((i & 4) != 0) {
            str3 = financialConnectionsSessionManifest.successUrl;
        }
        return financialConnectionsSessionManifest.copy(str, str2, str3);
    }

    @SerialName("cancel_url")
    public static /* synthetic */ void getCancelUrl$annotations() {
    }

    @SerialName("hosted_auth_url")
    public static /* synthetic */ void getHostedAuthUrl$annotations() {
    }

    @SerialName("success_url")
    public static /* synthetic */ void getSuccessUrl$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuccessUrl() {
        return this.successUrl;
    }

    public final FinancialConnectionsSessionManifest copy(String cancelUrl, String hostedAuthUrl, String successUrl) {
        return new FinancialConnectionsSessionManifest(cancelUrl, hostedAuthUrl, successUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSessionManifest)) {
            return false;
        }
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = (FinancialConnectionsSessionManifest) other;
        return Intrinsics.areEqual(this.cancelUrl, financialConnectionsSessionManifest.cancelUrl) && Intrinsics.areEqual(this.hostedAuthUrl, financialConnectionsSessionManifest.hostedAuthUrl) && Intrinsics.areEqual(this.successUrl, financialConnectionsSessionManifest.successUrl);
    }

    public int hashCode() {
        String str = this.cancelUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hostedAuthUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.successUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSessionManifest(cancelUrl=" + this.cancelUrl + ", hostedAuthUrl=" + this.hostedAuthUrl + ", successUrl=" + this.successUrl + ")";
    }

    /* compiled from: SynchronizeSessionResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinancialConnectionsSessionManifest> serializer() {
            return FinancialConnectionsSessionManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.cancelUrl = null;
        } else {
            this.cancelUrl = str;
        }
        if ((i & 2) == 0) {
            this.hostedAuthUrl = null;
        } else {
            this.hostedAuthUrl = str2;
        }
        if ((i & 4) == 0) {
            this.successUrl = null;
        } else {
            this.successUrl = str3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_lite_release(FinancialConnectionsSessionManifest self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.cancelUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.cancelUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.hostedAuthUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.hostedAuthUrl);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.successUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.successUrl);
    }

    public FinancialConnectionsSessionManifest(String str, String str2, String str3) {
        this.cancelUrl = str;
        this.hostedAuthUrl = str2;
        this.successUrl = str3;
    }

    public /* synthetic */ FinancialConnectionsSessionManifest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getCancelUrl() {
        return this.cancelUrl;
    }

    public final String getHostedAuthUrl() {
        return this.hostedAuthUrl;
    }

    public final String getSuccessUrl() {
        return this.successUrl;
    }
}
