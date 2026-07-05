package com.stripe.android.link.analytics;

import com.facebook.internal.ServerProtocol;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: LinkEventsReporter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001:\u0001\u001bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0012\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH&J\u001a\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0003H&J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEventsReporter;", "", "onInvalidSessionState", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;", "onInlineSignupCheckboxChecked", "onSignupFlowPresented", "onSignupStarted", "isInline", "", "onSignupCompleted", "onSignupFailure", "error", "", "onAccountLookupFailure", "on2FAStart", "on2FAStartFailure", "on2FAComplete", "on2FAFailure", "on2FACancel", "onPopupShow", "onPopupSuccess", "onPopupCancel", "onPopupError", "onPopupLogout", "onPopupSkipped", "SessionState", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkEventsReporter {
    void on2FACancel();

    void on2FAComplete();

    void on2FAFailure();

    void on2FAStart();

    void on2FAStartFailure();

    void onAccountLookupFailure(Throwable error);

    void onInlineSignupCheckboxChecked();

    void onInvalidSessionState(SessionState state);

    void onPopupCancel();

    void onPopupError(Throwable error);

    void onPopupLogout();

    void onPopupShow();

    void onPopupSkipped();

    void onPopupSuccess();

    void onSignupCompleted(boolean isInline);

    void onSignupFailure(boolean isInline, Throwable error);

    void onSignupFlowPresented();

    void onSignupStarted(boolean isInline);

    /* compiled from: LinkEventsReporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onSignupStarted$default(LinkEventsReporter linkEventsReporter, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupStarted");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupStarted(z);
        }

        public static /* synthetic */ void onSignupCompleted$default(LinkEventsReporter linkEventsReporter, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupCompleted");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupCompleted(z);
        }

        public static /* synthetic */ void onSignupFailure$default(LinkEventsReporter linkEventsReporter, boolean z, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSignupFailure");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            linkEventsReporter.onSignupFailure(z, th);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LinkEventsReporter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;", "", "<init>", "(Ljava/lang/String;I)V", "RequiresSignUp", "RequiresVerification", "Verified", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SessionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SessionState[] $VALUES;
        public static final SessionState RequiresSignUp = new SessionState("RequiresSignUp", 0);
        public static final SessionState RequiresVerification = new SessionState("RequiresVerification", 1);
        public static final SessionState Verified = new SessionState("Verified", 2);

        private static final /* synthetic */ SessionState[] $values() {
            return new SessionState[]{RequiresSignUp, RequiresVerification, Verified};
        }

        public static EnumEntries<SessionState> getEntries() {
            return $ENTRIES;
        }

        private SessionState(String str, int i) {
        }

        static {
            SessionState[] sessionStateArr$values = $values();
            $VALUES = sessionStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(sessionStateArr$values);
        }

        public static SessionState valueOf(String str) {
            return (SessionState) Enum.valueOf(SessionState.class, str);
        }

        public static SessionState[] values() {
            return (SessionState[]) $VALUES.clone();
        }
    }
}
