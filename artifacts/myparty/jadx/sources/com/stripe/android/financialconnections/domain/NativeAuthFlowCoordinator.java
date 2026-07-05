package com.stripe.android.financialconnections.domain;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.di.ActivityRetainedScope;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: NativeAuthFlowCoordinator.kt */
@ActivityRetainedScope
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0086\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "", "<init>", "()V", "flow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "invoke", "Message", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NativeAuthFlowCoordinator {
    public static final int $stable = 8;
    private final MutableSharedFlow<Message> flow = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Inject
    public NativeAuthFlowCoordinator() {
    }

    public final MutableSharedFlow<Message> invoke() {
        return this.flow;
    }

    /* compiled from: NativeAuthFlowCoordinator.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "", "ClearPartnerWebAuth", "Complete", "CloseWithError", "UpdateTopAppBar", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$CloseWithError;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$UpdateTopAppBar;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Message {

        /* compiled from: NativeAuthFlowCoordinator.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$ClearPartnerWebAuth;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ClearPartnerWebAuth implements Message {
            public static final int $stable = 0;
            public static final ClearPartnerWebAuth INSTANCE = new ClearPartnerWebAuth();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ClearPartnerWebAuth)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1111515148;
            }

            public String toString() {
                return "ClearPartnerWebAuth";
            }

            private ClearPartnerWebAuth() {
            }
        }

        /* compiled from: NativeAuthFlowCoordinator.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "cause", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;", "<init>", "(Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;)V", "getCause", "()Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "EarlyTerminationCause", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Complete implements Message {
            public static final int $stable = 0;
            private final EarlyTerminationCause cause;

            /* JADX WARN: Multi-variable type inference failed */
            public Complete() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Complete copy$default(Complete complete, EarlyTerminationCause earlyTerminationCause, int i, Object obj) {
                if ((i & 1) != 0) {
                    earlyTerminationCause = complete.cause;
                }
                return complete.copy(earlyTerminationCause);
            }

            /* renamed from: component1, reason: from getter */
            public final EarlyTerminationCause getCause() {
                return this.cause;
            }

            public final Complete copy(EarlyTerminationCause cause) {
                return new Complete(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Complete) && this.cause == ((Complete) other).cause;
            }

            public int hashCode() {
                EarlyTerminationCause earlyTerminationCause = this.cause;
                if (earlyTerminationCause == null) {
                    return 0;
                }
                return earlyTerminationCause.hashCode();
            }

            public String toString() {
                return "Complete(cause=" + this.cause + ")";
            }

            public Complete(EarlyTerminationCause earlyTerminationCause) {
                this.cause = earlyTerminationCause;
            }

            public /* synthetic */ Complete(EarlyTerminationCause earlyTerminationCause, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : earlyTerminationCause);
            }

            public final EarlyTerminationCause getCause() {
                return this.cause;
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: NativeAuthFlowCoordinator.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$Complete$EarlyTerminationCause;", "", "value", "", "analyticsValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getAnalyticsValue", "USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class EarlyTerminationCause {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EarlyTerminationCause[] $VALUES;
                public static final EarlyTerminationCause USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY = new EarlyTerminationCause("USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY", 0, "user_initiated_with_custom_manual_entry", "custom_manual_entry");
                private final String analyticsValue;
                private final String value;

                private static final /* synthetic */ EarlyTerminationCause[] $values() {
                    return new EarlyTerminationCause[]{USER_INITIATED_WITH_CUSTOM_MANUAL_ENTRY};
                }

                public static EnumEntries<EarlyTerminationCause> getEntries() {
                    return $ENTRIES;
                }

                private EarlyTerminationCause(String str, int i, String str2, String str3) {
                    this.value = str2;
                    this.analyticsValue = str3;
                }

                public final String getValue() {
                    return this.value;
                }

                public final String getAnalyticsValue() {
                    return this.analyticsValue;
                }

                static {
                    EarlyTerminationCause[] earlyTerminationCauseArr$values = $values();
                    $VALUES = earlyTerminationCauseArr$values;
                    $ENTRIES = EnumEntriesKt.enumEntries(earlyTerminationCauseArr$values);
                }

                public static EarlyTerminationCause valueOf(String str) {
                    return (EarlyTerminationCause) Enum.valueOf(EarlyTerminationCause.class, str);
                }

                public static EarlyTerminationCause[] values() {
                    return (EarlyTerminationCause[]) $VALUES.clone();
                }
            }
        }

        /* compiled from: NativeAuthFlowCoordinator.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$CloseWithError;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseWithError implements Message {
            public static final int $stable = 8;
            private final Throwable cause;

            public static /* synthetic */ CloseWithError copy$default(CloseWithError closeWithError, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = closeWithError.cause;
                }
                return closeWithError.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getCause() {
                return this.cause;
            }

            public final CloseWithError copy(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                return new CloseWithError(cause);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CloseWithError) && Intrinsics.areEqual(this.cause, ((CloseWithError) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "CloseWithError(cause=" + this.cause + ")";
            }

            public CloseWithError(Throwable cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.cause = cause;
            }

            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* compiled from: NativeAuthFlowCoordinator.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message$UpdateTopAppBar;", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator$Message;", "update", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "<init>", "(Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;)V", "getUpdate", "()Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateTopAppBar implements Message {
            public static final int $stable = 8;
            private final TopAppBarStateUpdate update;

            public static /* synthetic */ UpdateTopAppBar copy$default(UpdateTopAppBar updateTopAppBar, TopAppBarStateUpdate topAppBarStateUpdate, int i, Object obj) {
                if ((i & 1) != 0) {
                    topAppBarStateUpdate = updateTopAppBar.update;
                }
                return updateTopAppBar.copy(topAppBarStateUpdate);
            }

            /* renamed from: component1, reason: from getter */
            public final TopAppBarStateUpdate getUpdate() {
                return this.update;
            }

            public final UpdateTopAppBar copy(TopAppBarStateUpdate update) {
                Intrinsics.checkNotNullParameter(update, "update");
                return new UpdateTopAppBar(update);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UpdateTopAppBar) && Intrinsics.areEqual(this.update, ((UpdateTopAppBar) other).update);
            }

            public int hashCode() {
                return this.update.hashCode();
            }

            public String toString() {
                return "UpdateTopAppBar(update=" + this.update + ")";
            }

            public UpdateTopAppBar(TopAppBarStateUpdate update) {
                Intrinsics.checkNotNullParameter(update, "update");
                this.update = update;
            }

            public final TopAppBarStateUpdate getUpdate() {
                return this.update;
            }
        }
    }
}
