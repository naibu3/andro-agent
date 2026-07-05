package com.stripe.android.financialconnections.model;

import com.facebook.GraphResponse;
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

/* compiled from: UserFacingEventResponse.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 42\u00020\u0001:\u000501234B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00065"}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;", "", "type", "", "institutionSelected", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;", "error", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;", GraphResponse.SUCCESS_KEY, "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getInstitutionSelected$annotations", "getInstitutionSelected", "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;", "getError$annotations", "getError", "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;", "getSuccess$annotations", "getSuccess", "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "InstitutionSelected", "Error", "Success", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes5.dex */
public final /* data */ class UserFacingEventResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Error error;
    private final InstitutionSelected institutionSelected;
    private final Success success;
    private final String type;

    public static /* synthetic */ UserFacingEventResponse copy$default(UserFacingEventResponse userFacingEventResponse, String str, InstitutionSelected institutionSelected, Error error, Success success, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userFacingEventResponse.type;
        }
        if ((i & 2) != 0) {
            institutionSelected = userFacingEventResponse.institutionSelected;
        }
        if ((i & 4) != 0) {
            error = userFacingEventResponse.error;
        }
        if ((i & 8) != 0) {
            success = userFacingEventResponse.success;
        }
        return userFacingEventResponse.copy(str, institutionSelected, error, success);
    }

    @SerialName("error")
    public static /* synthetic */ void getError$annotations() {
    }

    @SerialName("institution_selected")
    public static /* synthetic */ void getInstitutionSelected$annotations() {
    }

    @SerialName(GraphResponse.SUCCESS_KEY)
    public static /* synthetic */ void getSuccess$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final InstitutionSelected getInstitutionSelected() {
        return this.institutionSelected;
    }

    /* renamed from: component3, reason: from getter */
    public final Error getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final Success getSuccess() {
        return this.success;
    }

    public final UserFacingEventResponse copy(String type, InstitutionSelected institutionSelected, Error error, Success success) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new UserFacingEventResponse(type, institutionSelected, error, success);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFacingEventResponse)) {
            return false;
        }
        UserFacingEventResponse userFacingEventResponse = (UserFacingEventResponse) other;
        return Intrinsics.areEqual(this.type, userFacingEventResponse.type) && Intrinsics.areEqual(this.institutionSelected, userFacingEventResponse.institutionSelected) && Intrinsics.areEqual(this.error, userFacingEventResponse.error) && Intrinsics.areEqual(this.success, userFacingEventResponse.success);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        InstitutionSelected institutionSelected = this.institutionSelected;
        int iHashCode2 = (iHashCode + (institutionSelected == null ? 0 : institutionSelected.hashCode())) * 31;
        Error error = this.error;
        int iHashCode3 = (iHashCode2 + (error == null ? 0 : error.hashCode())) * 31;
        Success success = this.success;
        return iHashCode3 + (success != null ? success.hashCode() : 0);
    }

    public String toString() {
        return "UserFacingEventResponse(type=" + this.type + ", institutionSelected=" + this.institutionSelected + ", error=" + this.error + ", success=" + this.success + ")";
    }

    /* compiled from: UserFacingEventResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UserFacingEventResponse> serializer() {
            return UserFacingEventResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UserFacingEventResponse(int i, String str, InstitutionSelected institutionSelected, Error error, Success success, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, UserFacingEventResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        if ((i & 2) == 0) {
            this.institutionSelected = null;
        } else {
            this.institutionSelected = institutionSelected;
        }
        if ((i & 4) == 0) {
            this.error = null;
        } else {
            this.error = error;
        }
        if ((i & 8) == 0) {
            this.success = null;
        } else {
            this.success = success;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$financial_connections_release(UserFacingEventResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.institutionSelected != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE, self.institutionSelected);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.error != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, UserFacingEventResponse$Error$$serializer.INSTANCE, self.error);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.success == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, UserFacingEventResponse$Success$$serializer.INSTANCE, self.success);
    }

    public UserFacingEventResponse(String type, InstitutionSelected institutionSelected, Error error, Success success) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.institutionSelected = institutionSelected;
        this.error = error;
        this.success = success;
    }

    public /* synthetic */ UserFacingEventResponse(String str, InstitutionSelected institutionSelected, Error error, Success success, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : institutionSelected, (i & 4) != 0 ? null : error, (i & 8) != 0 ? null : success);
    }

    public final String getType() {
        return this.type;
    }

    public final InstitutionSelected getInstitutionSelected() {
        return this.institutionSelected;
    }

    public final Error getError() {
        return this.error;
    }

    public final Success getSuccess() {
        return this.success;
    }

    /* compiled from: UserFacingEventResponse.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;", "", "institutionName", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getInstitutionName$annotations", "()V", "getInstitutionName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class InstitutionSelected {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String institutionName;

        public static /* synthetic */ InstitutionSelected copy$default(InstitutionSelected institutionSelected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = institutionSelected.institutionName;
            }
            return institutionSelected.copy(str);
        }

        @SerialName("institution_name")
        public static /* synthetic */ void getInstitutionName$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        public final InstitutionSelected copy(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            return new InstitutionSelected(institutionName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InstitutionSelected) && Intrinsics.areEqual(this.institutionName, ((InstitutionSelected) other).institutionName);
        }

        public int hashCode() {
            return this.institutionName.hashCode();
        }

        public String toString() {
            return "InstitutionSelected(institutionName=" + this.institutionName + ")";
        }

        /* compiled from: UserFacingEventResponse.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InstitutionSelected> serializer() {
                return UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ InstitutionSelected(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, UserFacingEventResponse$InstitutionSelected$$serializer.INSTANCE.getDescriptor());
            }
            this.institutionName = str;
        }

        public InstitutionSelected(String institutionName) {
            Intrinsics.checkNotNullParameter(institutionName, "institutionName");
            this.institutionName = institutionName;
        }

        public final String getInstitutionName() {
            return this.institutionName;
        }
    }

    /* compiled from: UserFacingEventResponse.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;", "", "errorCode", "", "<init>", "(Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getErrorCode$annotations", "()V", "getErrorCode", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Error {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String errorCode;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.errorCode;
            }
            return error.copy(str);
        }

        @SerialName("error_code")
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Error copy(String errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            return new Error(errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.errorCode, ((Error) other).errorCode);
        }

        public int hashCode() {
            return this.errorCode.hashCode();
        }

        public String toString() {
            return "Error(errorCode=" + this.errorCode + ")";
        }

        /* compiled from: UserFacingEventResponse.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Error> serializer() {
                return UserFacingEventResponse$Error$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Error(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, UserFacingEventResponse$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.errorCode = str;
        }

        public Error(String errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.errorCode = errorCode;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }
    }

    /* compiled from: UserFacingEventResponse.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;", "", "manualEntry", "", "<init>", "(Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getManualEntry$annotations", "()V", "getManualEntry", "()Z", "component1", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$financial_connections_release", "$serializer", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Success {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean manualEntry;

        public static /* synthetic */ Success copy$default(Success success, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = success.manualEntry;
            }
            return success.copy(z);
        }

        @SerialName("manual_entry")
        public static /* synthetic */ void getManualEntry$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getManualEntry() {
            return this.manualEntry;
        }

        public final Success copy(boolean manualEntry) {
            return new Success(manualEntry);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && this.manualEntry == ((Success) other).manualEntry;
        }

        public int hashCode() {
            return Boolean.hashCode(this.manualEntry);
        }

        public String toString() {
            return "Success(manualEntry=" + this.manualEntry + ")";
        }

        /* compiled from: UserFacingEventResponse.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Success> serializer() {
                return UserFacingEventResponse$Success$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Success(int i, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, UserFacingEventResponse$Success$$serializer.INSTANCE.getDescriptor());
            }
            this.manualEntry = z;
        }

        public Success(boolean z) {
            this.manualEntry = z;
        }

        public final boolean getManualEntry() {
            return this.manualEntry;
        }
    }
}
