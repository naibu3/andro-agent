package com.stripe.android.financialconnections.analytics;

import com.facebook.GraphResponse;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.login.LoginLogger;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: AuthSessionEvent.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B/\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "", "name", "", "timestamp", "Ljava/util/Date;", "rawEventDetails", "", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getTimestamp", "()Ljava/util/Date;", "getRawEventDetails", "()Ljava/util/Map;", "toMap", "Launched", "OAuthLaunched", "Loaded", "Success", "Failure", "Cancel", "Retry", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AuthSessionEvent {
    public static final int $stable = 8;
    private final String name;
    private final Map<String, String> rawEventDetails;
    private final Date timestamp;

    public /* synthetic */ AuthSessionEvent(String str, Date date, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, map);
    }

    private AuthSessionEvent(String str, Date date, Map<String, String> map) {
        this.name = str;
        this.timestamp = date;
        this.rawEventDetails = map;
    }

    public final String getName() {
        return this.name;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public /* synthetic */ AuthSessionEvent(String str, Date date, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, date, (i & 4) != 0 ? MapsKt.emptyMap() : map, null);
    }

    public Map<String, String> getRawEventDetails() {
        return this.rawEventDetails;
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Launched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Launched extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ Launched copy$default(Launched launched, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = launched.timestamp;
            }
            return launched.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Launched copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Launched(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Launched) && Intrinsics.areEqual(this.timestamp, ((Launched) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Launched(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Launched(Date timestamp) {
            super("launched", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$OAuthLaunched;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OAuthLaunched extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ OAuthLaunched copy$default(OAuthLaunched oAuthLaunched, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = oAuthLaunched.timestamp;
            }
            return oAuthLaunched.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final OAuthLaunched copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new OAuthLaunched(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OAuthLaunched) && Intrinsics.areEqual(this.timestamp, ((OAuthLaunched) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "OAuthLaunched(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OAuthLaunched(Date timestamp) {
            super("oauth-launched", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Loaded;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Loaded extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = loaded.timestamp;
            }
            return loaded.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Loaded copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Loaded(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.timestamp, ((Loaded) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Loaded(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(Date timestamp) {
            super("loaded", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Success;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ Success copy$default(Success success, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = success.timestamp;
            }
            return success.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Success copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Success(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.timestamp, ((Success) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Success(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(Date timestamp) {
            super(GraphResponse.SUCCESS_KEY, timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Failure;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "error", "", "<init>", "(Ljava/util/Date;Ljava/lang/Throwable;)V", "getTimestamp", "()Ljava/util/Date;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Throwable error;
        private final Date timestamp;

        public static /* synthetic */ Failure copy$default(Failure failure, Date date, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                date = failure.timestamp;
            }
            if ((i & 2) != 0) {
                th = failure.error;
            }
            return failure.copy(date, th);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component2, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final Failure copy(Date timestamp, Throwable error) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(error, "error");
            return new Failure(timestamp, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Failure)) {
                return false;
            }
            Failure failure = (Failure) other;
            return Intrinsics.areEqual(this.timestamp, failure.timestamp) && Intrinsics.areEqual(this.error, failure.error);
        }

        public int hashCode() {
            return (this.timestamp.hashCode() * 31) + this.error.hashCode();
        }

        public String toString() {
            return "Failure(timestamp=" + this.timestamp + ", error=" + this.error + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        public final Throwable getError() {
            return this.error;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Failure(Date timestamp, Throwable error) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            Intrinsics.checkNotNullParameter(error, "error");
            Map mapFilterNotNullValues = CollectionsKt.filterNotNullValues(AnalyticsMappersKt.toEventParams(error, null));
            super(LoginLogger.EVENT_EXTRAS_FAILURE, timestamp, mapFilterNotNullValues, null);
            this.timestamp = timestamp;
            this.error = error;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Cancel;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cancel extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ Cancel copy$default(Cancel cancel, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = cancel.timestamp;
            }
            return cancel.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Cancel copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Cancel(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cancel) && Intrinsics.areEqual(this.timestamp, ((Cancel) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Cancel(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(Date timestamp) {
            super("cancel", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    /* compiled from: AuthSessionEvent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent$Retry;", "Lcom/stripe/android/financialconnections/analytics/AuthSessionEvent;", "timestamp", "Ljava/util/Date;", "<init>", "(Ljava/util/Date;)V", "getTimestamp", "()Ljava/util/Date;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Retry extends AuthSessionEvent {
        public static final int $stable = 8;
        private final Date timestamp;

        public static /* synthetic */ Retry copy$default(Retry retry, Date date, int i, Object obj) {
            if ((i & 1) != 0) {
                date = retry.timestamp;
            }
            return retry.copy(date);
        }

        /* renamed from: component1, reason: from getter */
        public final Date getTimestamp() {
            return this.timestamp;
        }

        public final Retry copy(Date timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new Retry(timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Retry) && Intrinsics.areEqual(this.timestamp, ((Retry) other).timestamp);
        }

        public int hashCode() {
            return this.timestamp.hashCode();
        }

        public String toString() {
            return "Retry(timestamp=" + this.timestamp + ")";
        }

        @Override // com.stripe.android.financialconnections.analytics.AuthSessionEvent
        public Date getTimestamp() {
            return this.timestamp;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(Date timestamp) {
            super("retry", timestamp, null, 4, null);
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            this.timestamp = timestamp;
        }
    }

    public final Map<String, Object> toMap() {
        return MapsKt.mapOf(TuplesKt.to("event_namespace", "partner-auth-lifecycle"), TuplesKt.to(AnalyticsRequestV2.PARAM_EVENT_NAME, this.name), TuplesKt.to("client_timestamp", String.valueOf(getTimestamp().getTime())), TuplesKt.to("raw_event_details", new JSONObject(getRawEventDetails()).toString()));
    }
}
