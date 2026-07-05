package com.stripe.android.financialconnections.analytics;

import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsEvent.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\"\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÀ\u0001¢\u0006\u0002\b\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "", "name", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;", "metadata", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;", "<init>", "(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)V", "getName", "()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;", "getMetadata", "()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;", "component1", "component2", "copy", "copy$financial_connections_release", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Metadata", "Name", "ErrorCode", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsEvent {
    public static final int $stable = 0;
    private final Metadata metadata;
    private final Name name;

    public static /* synthetic */ FinancialConnectionsEvent copy$financial_connections_release$default(FinancialConnectionsEvent financialConnectionsEvent, Name name, Metadata metadata, int i, Object obj) {
        if ((i & 1) != 0) {
            name = financialConnectionsEvent.name;
        }
        if ((i & 2) != 0) {
            metadata = financialConnectionsEvent.metadata;
        }
        return financialConnectionsEvent.copy$financial_connections_release(name, metadata);
    }

    /* renamed from: component1, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final Metadata getMetadata() {
        return this.metadata;
    }

    public final FinancialConnectionsEvent copy$financial_connections_release(Name name, Metadata metadata) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return new FinancialConnectionsEvent(name, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsEvent)) {
            return false;
        }
        FinancialConnectionsEvent financialConnectionsEvent = (FinancialConnectionsEvent) other;
        return this.name == financialConnectionsEvent.name && Intrinsics.areEqual(this.metadata, financialConnectionsEvent.metadata);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.metadata.hashCode();
    }

    public String toString() {
        return "FinancialConnectionsEvent(name=" + this.name + ", metadata=" + this.metadata + ")";
    }

    public FinancialConnectionsEvent(Name name, Metadata metadata) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.name = name;
        this.metadata = metadata;
    }

    public final Name getName() {
        return this.name;
    }

    public final Metadata getMetadata() {
        return this.metadata;
    }

    /* compiled from: FinancialConnectionsEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J4\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÀ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;", "", "institutionName", "", "manualEntry", "", "errorCode", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V", "getInstitutionName", "()Ljava/lang/String;", "getManualEntry", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getErrorCode", "()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;", "toMap", "", "component1", "component2", "component3", "copy", "copy$financial_connections_release", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Metadata {
        public static final int $stable = 0;
        private final ErrorCode errorCode;
        private final String institutionName;
        private final Boolean manualEntry;

        public Metadata() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Metadata copy$financial_connections_release$default(Metadata metadata, String str, Boolean bool, ErrorCode errorCode, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metadata.institutionName;
            }
            if ((i & 2) != 0) {
                bool = metadata.manualEntry;
            }
            if ((i & 4) != 0) {
                errorCode = metadata.errorCode;
            }
            return metadata.copy$financial_connections_release(str, bool, errorCode);
        }

        /* renamed from: component1, reason: from getter */
        public final String getInstitutionName() {
            return this.institutionName;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getManualEntry() {
            return this.manualEntry;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final Metadata copy$financial_connections_release(String institutionName, Boolean manualEntry, ErrorCode errorCode) {
            return new Metadata(institutionName, manualEntry, errorCode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.areEqual(this.institutionName, metadata.institutionName) && Intrinsics.areEqual(this.manualEntry, metadata.manualEntry) && this.errorCode == metadata.errorCode;
        }

        public int hashCode() {
            String str = this.institutionName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.manualEntry;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ErrorCode errorCode = this.errorCode;
            return iHashCode2 + (errorCode != null ? errorCode.hashCode() : 0);
        }

        public String toString() {
            return "Metadata(institutionName=" + this.institutionName + ", manualEntry=" + this.manualEntry + ", errorCode=" + this.errorCode + ")";
        }

        public Metadata(String str, Boolean bool, ErrorCode errorCode) {
            this.institutionName = str;
            this.manualEntry = bool;
            this.errorCode = errorCode;
        }

        public /* synthetic */ Metadata(String str, Boolean bool, ErrorCode errorCode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : errorCode);
        }

        public final String getInstitutionName() {
            return this.institutionName;
        }

        public final Boolean getManualEntry() {
            return this.manualEntry;
        }

        public final ErrorCode getErrorCode() {
            return this.errorCode;
        }

        public final Map<String, Object> toMap() {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("institution_name", this.institutionName);
            ErrorCode errorCode = this.errorCode;
            pairArr[1] = TuplesKt.to("error_code", errorCode != null ? errorCode.getValue() : null);
            pairArr[2] = TuplesKt.to("manual_entry", this.manualEntry);
            return MapsKt.mapOf(pairArr);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OPEN", "FLOW_LAUNCHED_IN_BROWSER", "MANUAL_ENTRY_INITIATED", "CONSENT_ACQUIRED", "SEARCH_INITIATED", "INSTITUTION_SELECTED", "INSTITUTION_AUTHORIZED", "ACCOUNTS_SELECTED", "SUCCESS", "ERROR", "CANCEL", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Name {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;
        private final String value;
        public static final Name OPEN = new Name("OPEN", 0, "open");
        public static final Name FLOW_LAUNCHED_IN_BROWSER = new Name("FLOW_LAUNCHED_IN_BROWSER", 1, "flow_launched_in_browser");
        public static final Name MANUAL_ENTRY_INITIATED = new Name("MANUAL_ENTRY_INITIATED", 2, "manual_entry_initiated");
        public static final Name CONSENT_ACQUIRED = new Name("CONSENT_ACQUIRED", 3, "consent_acquired");
        public static final Name SEARCH_INITIATED = new Name("SEARCH_INITIATED", 4, "search_initiated");
        public static final Name INSTITUTION_SELECTED = new Name("INSTITUTION_SELECTED", 5, "institution_selected");
        public static final Name INSTITUTION_AUTHORIZED = new Name("INSTITUTION_AUTHORIZED", 6, "institution_authorized");
        public static final Name ACCOUNTS_SELECTED = new Name("ACCOUNTS_SELECTED", 7, "accounts_selected");
        public static final Name SUCCESS = new Name("SUCCESS", 8, GraphResponse.SUCCESS_KEY);
        public static final Name ERROR = new Name("ERROR", 9, "error");
        public static final Name CANCEL = new Name("CANCEL", 10, "cancel");

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{OPEN, FLOW_LAUNCHED_IN_BROWSER, MANUAL_ENTRY_INITIATED, CONSENT_ACQUIRED, SEARCH_INITIATED, INSTITUTION_SELECTED, INSTITUTION_AUTHORIZED, ACCOUNTS_SELECTED, SUCCESS, ERROR, CANCEL};
        }

        public static EnumEntries<Name> getEntries() {
            return $ENTRIES;
        }

        private Name(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            Name[] nameArr$values = $values();
            $VALUES = nameArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(nameArr$values);
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT_NUMBERS_UNAVAILABLE", "ACCOUNTS_UNAVAILABLE", "NO_DEBITABLE_ACCOUNT", "AUTHORIZATION_FAILED", "INSTITUTION_UNAVAILABLE_PLANNED", "INSTITUTION_UNAVAILABLE_UNPLANNED", "INSTITUTION_TIMEOUT", "UNEXPECTED_ERROR", "SESSION_EXPIRED", "FAILED_BOT_DETECTION", "WEB_BROWSER_UNAVAILABLE", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorCode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorCode[] $VALUES;
        private final String value;
        public static final ErrorCode ACCOUNT_NUMBERS_UNAVAILABLE = new ErrorCode("ACCOUNT_NUMBERS_UNAVAILABLE", 0, "account_numbers_unavailable");
        public static final ErrorCode ACCOUNTS_UNAVAILABLE = new ErrorCode("ACCOUNTS_UNAVAILABLE", 1, "accounts_unavailable");
        public static final ErrorCode NO_DEBITABLE_ACCOUNT = new ErrorCode("NO_DEBITABLE_ACCOUNT", 2, "no_debitable_account");
        public static final ErrorCode AUTHORIZATION_FAILED = new ErrorCode("AUTHORIZATION_FAILED", 3, "authorization_failed");
        public static final ErrorCode INSTITUTION_UNAVAILABLE_PLANNED = new ErrorCode("INSTITUTION_UNAVAILABLE_PLANNED", 4, "institution_unavailable_planned");
        public static final ErrorCode INSTITUTION_UNAVAILABLE_UNPLANNED = new ErrorCode("INSTITUTION_UNAVAILABLE_UNPLANNED", 5, "institution_unavailable_unplanned");
        public static final ErrorCode INSTITUTION_TIMEOUT = new ErrorCode("INSTITUTION_TIMEOUT", 6, "institution_timeout");
        public static final ErrorCode UNEXPECTED_ERROR = new ErrorCode("UNEXPECTED_ERROR", 7, "unexpected_error");
        public static final ErrorCode SESSION_EXPIRED = new ErrorCode("SESSION_EXPIRED", 8, "session_expired");
        public static final ErrorCode FAILED_BOT_DETECTION = new ErrorCode("FAILED_BOT_DETECTION", 9, "failed_bot_detection");
        public static final ErrorCode WEB_BROWSER_UNAVAILABLE = new ErrorCode("WEB_BROWSER_UNAVAILABLE", 10, "web_browser_unavailable");

        private static final /* synthetic */ ErrorCode[] $values() {
            return new ErrorCode[]{ACCOUNT_NUMBERS_UNAVAILABLE, ACCOUNTS_UNAVAILABLE, NO_DEBITABLE_ACCOUNT, AUTHORIZATION_FAILED, INSTITUTION_UNAVAILABLE_PLANNED, INSTITUTION_UNAVAILABLE_UNPLANNED, INSTITUTION_TIMEOUT, UNEXPECTED_ERROR, SESSION_EXPIRED, FAILED_BOT_DETECTION, WEB_BROWSER_UNAVAILABLE};
        }

        public static EnumEntries<ErrorCode> getEntries() {
            return $ENTRIES;
        }

        private ErrorCode(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            ErrorCode[] errorCodeArr$values = $values();
            $VALUES = errorCodeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(errorCodeArr$values);
        }

        public static ErrorCode valueOf(String str) {
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }

        public static ErrorCode[] values() {
            return (ErrorCode[]) $VALUES.clone();
        }
    }
}
