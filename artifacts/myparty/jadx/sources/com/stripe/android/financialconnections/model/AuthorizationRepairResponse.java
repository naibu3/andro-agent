package com.stripe.android.financialconnections.model;

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
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AuthorizationRepairResponse.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000212B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u000fHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\n\u0010\u001d¨\u00063"}, d2 = {"Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;", "", "id", "", "url", "flow", "institution", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "display", "Lcom/stripe/android/financialconnections/model/Display;", "isOAuth", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/Display;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Lcom/stripe/android/financialconnections/model/Display;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getUrl", "getFlow", "getInstitution", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;", "getDisplay", "()Lcom/stripe/android/financialconnections/model/Display;", "isOAuth$annotations", "()V", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class AuthorizationRepairResponse {
    private final Display display;
    private final String flow;
    private final String id;
    private final FinancialConnectionsInstitution institution;
    private final boolean isOAuth;
    private final String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ AuthorizationRepairResponse copy$default(AuthorizationRepairResponse authorizationRepairResponse, String str, String str2, String str3, FinancialConnectionsInstitution financialConnectionsInstitution, Display display, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizationRepairResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = authorizationRepairResponse.url;
        }
        if ((i & 4) != 0) {
            str3 = authorizationRepairResponse.flow;
        }
        if ((i & 8) != 0) {
            financialConnectionsInstitution = authorizationRepairResponse.institution;
        }
        if ((i & 16) != 0) {
            display = authorizationRepairResponse.display;
        }
        if ((i & 32) != 0) {
            z = authorizationRepairResponse.isOAuth;
        }
        Display display2 = display;
        boolean z2 = z;
        return authorizationRepairResponse.copy(str, str2, str3, financialConnectionsInstitution, display2, z2);
    }

    @SerialName("is_oauth")
    public static /* synthetic */ void isOAuth$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    /* renamed from: component4, reason: from getter */
    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    /* renamed from: component5, reason: from getter */
    public final Display getDisplay() {
        return this.display;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsOAuth() {
        return this.isOAuth;
    }

    public final AuthorizationRepairResponse copy(String id, String url, String flow, FinancialConnectionsInstitution institution, Display display, boolean isOAuth) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(display, "display");
        return new AuthorizationRepairResponse(id, url, flow, institution, display, isOAuth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthorizationRepairResponse)) {
            return false;
        }
        AuthorizationRepairResponse authorizationRepairResponse = (AuthorizationRepairResponse) other;
        return Intrinsics.areEqual(this.id, authorizationRepairResponse.id) && Intrinsics.areEqual(this.url, authorizationRepairResponse.url) && Intrinsics.areEqual(this.flow, authorizationRepairResponse.flow) && Intrinsics.areEqual(this.institution, authorizationRepairResponse.institution) && Intrinsics.areEqual(this.display, authorizationRepairResponse.display) && this.isOAuth == authorizationRepairResponse.isOAuth;
    }

    public int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.url.hashCode()) * 31) + this.flow.hashCode()) * 31) + this.institution.hashCode()) * 31) + this.display.hashCode()) * 31) + Boolean.hashCode(this.isOAuth);
    }

    public String toString() {
        return "AuthorizationRepairResponse(id=" + this.id + ", url=" + this.url + ", flow=" + this.flow + ", institution=" + this.institution + ", display=" + this.display + ", isOAuth=" + this.isOAuth + ")";
    }

    /* compiled from: AuthorizationRepairResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/AuthorizationRepairResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AuthorizationRepairResponse> serializer() {
            return AuthorizationRepairResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AuthorizationRepairResponse(int i, String str, String str2, String str3, FinancialConnectionsInstitution financialConnectionsInstitution, Display display, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, AuthorizationRepairResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.url = str2;
        this.flow = str3;
        this.institution = financialConnectionsInstitution;
        this.display = display;
        this.isOAuth = z;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(AuthorizationRepairResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.url);
        output.encodeStringElement(serialDesc, 2, self.flow);
        output.encodeSerializableElement(serialDesc, 3, FinancialConnectionsInstitution$$serializer.INSTANCE, self.institution);
        output.encodeSerializableElement(serialDesc, 4, Display$$serializer.INSTANCE, self.display);
        output.encodeBooleanElement(serialDesc, 5, self.isOAuth);
    }

    public AuthorizationRepairResponse(String id, String url, String flow, FinancialConnectionsInstitution institution, Display display, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(display, "display");
        this.id = id;
        this.url = url;
        this.flow = flow;
        this.institution = institution;
        this.display = display;
        this.isOAuth = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getFlow() {
        return this.flow;
    }

    public final FinancialConnectionsInstitution getInstitution() {
        return this.institution;
    }

    public final Display getDisplay() {
        return this.display;
    }

    public final boolean isOAuth() {
        return this.isOAuth;
    }
}
