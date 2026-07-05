package com.stripe.android.link.analytics;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LinkEvent.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0012\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0012\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "<init>", "()V", "SignUpCheckboxChecked", "SignUpFlowPresented", "SignUpStart", "SignUpComplete", "SignUpFailure", "SignUpFailureInvalidSessionState", "AccountLookupFailure", "TwoFAStart", "TwoFAStartFailure", "TwoFAComplete", "TwoFAFailure", "TwoFACancel", "PopupShow", "PopupSuccess", "PopupCancel", "PopupError", "PopupLogout", "PopupSkipped", "Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupError;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;", "Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;", "Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;", "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class LinkEvent implements AnalyticsEvent {
    public static final int $stable = 0;

    public /* synthetic */ LinkEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LinkEvent() {
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpCheckboxChecked;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpCheckboxChecked extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpCheckboxChecked INSTANCE = new SignUpCheckboxChecked();
        private static final String eventName = "link.signup.checkbox_checked";

        private SignUpCheckboxChecked() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SignUpFlowPresented extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpFlowPresented INSTANCE = new SignUpFlowPresented();
        private static final String eventName = "link.signup.flow_presented";

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SignUpFlowPresented)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1731570403;
        }

        public String toString() {
            return "SignUpFlowPresented";
        }

        private SignUpFlowPresented() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpStart;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpStart extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpStart INSTANCE = new SignUpStart();
        private static final String eventName = "link.signup.start";

        private SignUpStart() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpComplete;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpComplete extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpComplete INSTANCE = new SignUpComplete();
        private static final String eventName = "link.signup.complete";

        private SignUpComplete() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpFailure INSTANCE = new SignUpFailure();
        private static final String eventName = "link.signup.failure";

        private SignUpFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$SignUpFailureInvalidSessionState;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SignUpFailureInvalidSessionState extends LinkEvent {
        public static final int $stable = 0;
        public static final SignUpFailureInvalidSessionState INSTANCE = new SignUpFailureInvalidSessionState();
        private static final String eventName = "link.signup.failure.invalidSessionState";

        private SignUpFailureInvalidSessionState() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$AccountLookupFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountLookupFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final AccountLookupFailure INSTANCE = new AccountLookupFailure();
        private static final String eventName = "link.account_lookup.failure";

        private AccountLookupFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStart;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFAStart extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAStart INSTANCE = new TwoFAStart();
        private static final String eventName = "link.2fa.start";

        private TwoFAStart() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFAStartFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAStartFailure INSTANCE = new TwoFAStartFailure();
        private static final String eventName = "link.2fa.start_failure";

        private TwoFAStartFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAComplete;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFAComplete extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAComplete INSTANCE = new TwoFAComplete();
        private static final String eventName = "link.2fa.complete";

        private TwoFAComplete() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFAFailure;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFAFailure extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFAFailure INSTANCE = new TwoFAFailure();
        private static final String eventName = "link.2fa.failure";

        private TwoFAFailure() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$TwoFACancel;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TwoFACancel extends LinkEvent {
        public static final int $stable = 0;
        public static final TwoFACancel INSTANCE = new TwoFACancel();
        private static final String eventName = "link.2fa.cancel";

        private TwoFACancel() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupShow;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupShow extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupShow INSTANCE = new PopupShow();
        private static final String eventName = "link.popup.show";

        private PopupShow() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupSuccess;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupSuccess extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupSuccess INSTANCE = new PopupSuccess();
        private static final String eventName = "link.popup.success";

        private PopupSuccess() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupCancel;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupCancel extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupCancel INSTANCE = new PopupCancel();
        private static final String eventName = "link.popup.cancel";

        private PopupCancel() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupError;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupError extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupError INSTANCE = new PopupError();
        private static final String eventName = "link.popup.error";

        private PopupError() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupLogout;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupLogout extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupLogout INSTANCE = new PopupLogout();
        private static final String eventName = "link.popup.logout";

        private PopupLogout() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }

    /* compiled from: LinkEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/analytics/LinkEvent$PopupSkipped;", "Lcom/stripe/android/link/analytics/LinkEvent;", "<init>", "()V", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "getEventName", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PopupSkipped extends LinkEvent {
        public static final int $stable = 0;
        public static final PopupSkipped INSTANCE = new PopupSkipped();
        private static final String eventName = "link.popup.skipped";

        private PopupSkipped() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return eventName;
        }
    }
}
