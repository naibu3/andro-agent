package com.stripe.android.financialconnections.analytics;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.actions.SearchIntents;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.exception.FinancialConnectionsError;
import com.stripe.android.financialconnections.exception.WebAuthFlowFailedException;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import com.stripe.attestation.AttestationError;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:'\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>B3\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\u0003*\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001&?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcd¨\u0006e"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "", "name", "", NativeProtocol.WEB_DIALOG_PARAMS, "", "includePrefix", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Z)V", "getParams", "()Ljava/util/Map;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "analyticsValue", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getAnalyticsValue$financial_connections_release", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)Ljava/lang/String;", InAppPurchaseConstants.METHOD_TO_STRING, "equals", "other", "hashCode", "", "PaneLaunched", "AppBackgrounded", "PaneLoaded", "ClickNavBarBack", "ClickNavBarClose", "Complete", "ClickLearnMoreDataAccess", "Click", "FeaturedInstitutionsLoaded", "SearchScroll", "InstitutionSelected", "SearchSucceeded", "PollAccountsSucceeded", "AccountSelected", "AccountsSubmitted", "AccountsAutoSelected", "PollAttachPaymentsSucceeded", "ClickLinkAccounts", "NetworkingNewConsumer", "NetworkingReturningConsumer", "VerificationSuccess", "VerificationError", "VerificationStepUpSuccess", "VerificationStepUpError", "ClickDone", "Error", "Exposure", "AuthSessionUrlReceived", "AuthSessionRetrieved", "ConsentAgree", "PrepaneClickContinue", "PrepaneClickCancel", "PrepaneClickChooseAnotherBank", "AuthSessionOpened", "AttestationInitSkipped", "AttestationInitFailed", "AttestationRequestSucceeded", "AttestationRequestFailed", "AttestationEndpoint", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsAutoSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitFailed;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitSkipped;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickDone;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLinkAccounts;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarBack;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarClose;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Complete;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Exposure;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$FeaturedInstitutionsLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$InstitutionSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingNewConsumer;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingReturningConsumer;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLaunched;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchScroll;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsAnalyticsEvent {
    public static final int $stable = 8;
    private final String eventName;
    private final boolean includePrefix;
    private final String name;
    private final Map<String, String> params;

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Pane.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FinancialConnectionsAnalyticsEvent(String str, Map map, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, z);
    }

    private FinancialConnectionsAnalyticsEvent(String str, Map<String, String> map, boolean z) {
        this.name = str;
        this.params = map;
        this.includePrefix = z;
        this.eventName = z ? "linked_accounts." + str : str;
    }

    public /* synthetic */ FinancialConnectionsAnalyticsEvent(String str, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? true : z, null);
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final String getEventName() {
        return this.eventName;
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLaunched;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", Destination.KEY_REFERRER, "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaneLaunched extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public PaneLaunched(FinancialConnectionsSessionManifest.Pane pane, FinancialConnectionsSessionManifest.Pane pane2) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("referrer_pane", pane2 != null ? pane2.getValue() : null);
            pairArr[1] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            super("pane.launched", CollectionsKt.filterNotNullValues(MapsKt.mapOf(pairArr)), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AppBackgrounded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "backgrounded", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Z)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppBackgrounded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppBackgrounded(FinancialConnectionsSessionManifest.Pane pane, boolean z) {
            super(z ? "mobile.app_entered_background" : "mobile.app_entered_foreground", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PaneLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaneLoaded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaneLoaded(FinancialConnectionsSessionManifest.Pane pane) {
            super("pane.loaded", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarBack;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickNavBarBack extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickNavBarBack(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.back", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickNavBarClose;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickNavBarClose extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickNavBarClose(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.nav_bar.close", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Complete;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", NotificationsService.EXCEPTION_KEY, "", "exceptionExtraMessage", "", "connectedAccounts", "", "status", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Complete extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public Complete(FinancialConnectionsSessionManifest.Pane pane, Throwable th, String str, Integer num, String status) {
            Map<String, String> eventParams;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(status, "status");
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            pairArr[1] = TuplesKt.to("num_linked_accounts", num != null ? num.toString() : null);
            pairArr[2] = TuplesKt.to("type", th == null ? "object" : "error");
            pairArr[3] = TuplesKt.to("status", status);
            super("complete", CollectionsKt.filterNotNullValues(MapsKt.plus(MapsKt.mapOf(pairArr), (th == null || (eventParams = AnalyticsMappersKt.toEventParams(th, str)) == null) ? MapsKt.emptyMap() : eventParams)), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLearnMoreDataAccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickLearnMoreDataAccess extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickLearnMoreDataAccess(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.data_access.learn_more", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Click;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Click extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(String eventName, FinancialConnectionsSessionManifest.Pane pane) {
            super(eventName, CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$FeaturedInstitutionsLoaded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "institutionIds", "", "", "duration", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ljava/util/Set;JLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeaturedInstitutionsLoaded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        public FeaturedInstitutionsLoaded(Set<String> institutionIds, long j, FinancialConnectionsSessionManifest.Pane pane) {
            Intrinsics.checkNotNullParameter(institutionIds, "institutionIds");
            Intrinsics.checkNotNullParameter(pane, "pane");
            Set<String> set = institutionIds;
            ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            int i = 0;
            for (Object obj : set) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TuplesKt.to("institutions[" + i + "]", (String) obj));
                i = i2;
            }
            super("search.feature_institutions_loaded", CollectionsKt.filterNotNullValues(MapsKt.plus(MapsKt.toMap(arrayList), MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("result_count", String.valueOf(institutionIds.size())), TuplesKt.to("duration", String.valueOf(j))))), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchScroll;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "institutionIds", "", "", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Ljava/util/Set;Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchScroll extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        public SearchScroll(Set<String> institutionIds, FinancialConnectionsSessionManifest.Pane pane) {
            Intrinsics.checkNotNullParameter(institutionIds, "institutionIds");
            Intrinsics.checkNotNullParameter(pane, "pane");
            Set<String> set = institutionIds;
            ArrayList arrayList = new ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10));
            int i = 0;
            for (Object obj : set) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(TuplesKt.to("institution_ids[" + i + "]", (String) obj));
                i = i2;
            }
            super("search.scroll", CollectionsKt.filterNotNullValues(MapsKt.plus(MapsKt.toMap(arrayList), MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane))))), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$InstitutionSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "fromFeatured", "", "institutionId", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZLjava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstitutionSelected extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstitutionSelected(FinancialConnectionsSessionManifest.Pane pane, boolean z, String institutionId) {
            super(z ? "search.featured_institution_selected" : "search.search_result_selected", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("institution_id", institutionId))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$SearchSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", SearchIntents.EXTRA_QUERY, "", "duration", "", "resultCount", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;JI)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchSucceeded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchSucceeded(FinancialConnectionsSessionManifest.Pane pane, String query, long j, int i) {
            super("search.succeeded", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to(SearchIntents.EXTRA_QUERY, query), TuplesKt.to("duration", String.valueOf(j)), TuplesKt.to("result_count", String.valueOf(i)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(query, "query");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAccountsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "authSessionId", "", "duration", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PollAccountsSucceeded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollAccountsSucceeded(FinancialConnectionsSessionManifest.Pane pane, String authSessionId, long j) {
            super("polling.accounts.success", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("authSessionId", authSessionId), TuplesKt.to("duration", String.valueOf(j)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(authSessionId, "authSessionId");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "selected", "", "isSingleAccount", "accountId", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;ZZLjava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountSelected extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public AccountSelected(FinancialConnectionsSessionManifest.Pane pane, boolean z, boolean z2, String accountId) {
            String str;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            if (z) {
                str = "click.account_picker.account_selected";
            } else {
                str = "click.account_picker.account_unselected";
            }
            super(str, CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("is_single_account", String.valueOf(z2)), TuplesKt.to("account", accountId))), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsSubmitted;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "accountIds", "", "", "isSkipAccountSelection", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Set;Z)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountsSubmitted extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountsSubmitted(FinancialConnectionsSessionManifest.Pane pane, Set<String> accountIds, boolean z) {
            super("account_picker.accounts_submitted", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("account_ids", kotlin.collections.CollectionsKt.joinToString$default(accountIds, " ", null, null, 0, null, null, 62, null)), TuplesKt.to("is_skip_account_selection", String.valueOf(z)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AccountsAutoSelected;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "accountIds", "", "", "isSingleAccount", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/util/Set;Z)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountsAutoSelected extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountsAutoSelected(FinancialConnectionsSessionManifest.Pane pane, Set<String> accountIds, boolean z) {
            super("account_picker.accounts_auto_selected", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("account_ids", kotlin.collections.CollectionsKt.joinToString$default(accountIds, " ", null, null, 0, null, null, 62, null)), TuplesKt.to("is_single_account", String.valueOf(z)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PollAttachPaymentsSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "authSessionId", "", "duration", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;J)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PollAttachPaymentsSucceeded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PollAttachPaymentsSucceeded(FinancialConnectionsSessionManifest.Pane pane, String authSessionId, long j) {
            super("polling.attachPayment.success", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("authSessionId", authSessionId), TuplesKt.to("duration", String.valueOf(j)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(authSessionId, "authSessionId");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickLinkAccounts;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickLinkAccounts extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickLinkAccounts(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.link_accounts", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingNewConsumer;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkingNewConsumer extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkingNewConsumer(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.new_consumer", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$NetworkingReturningConsumer;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkingReturningConsumer extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkingReturningConsumer(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.returning_consumer", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationSuccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerificationSuccess extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationSuccess(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.verification.success", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "error", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;)V", "Error", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerificationError extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationError(FinancialConnectionsSessionManifest.Pane pane, Error error) {
            super("networking.verification.error", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("error", error.getValue()))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(error, "error");
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationError$Error;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ConsumerNotFoundError", "LookupConsumerSession", "StartVerificationSessionError", "ConfirmVerificationSessionError", "MarkLinkVerifiedError", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Error {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Error[] $VALUES;
            private final String value;
            public static final Error ConsumerNotFoundError = new Error("ConsumerNotFoundError", 0, "ConsumerNotFoundError");
            public static final Error LookupConsumerSession = new Error("LookupConsumerSession", 1, "LookupConsumerSession");
            public static final Error StartVerificationSessionError = new Error("StartVerificationSessionError", 2, "StartVerificationSessionError");
            public static final Error ConfirmVerificationSessionError = new Error("ConfirmVerificationSessionError", 3, "ConfirmVerificationSessionError");
            public static final Error MarkLinkVerifiedError = new Error("MarkLinkVerifiedError", 4, "MarkLinkVerifiedError");

            private static final /* synthetic */ Error[] $values() {
                return new Error[]{ConsumerNotFoundError, LookupConsumerSession, StartVerificationSessionError, ConfirmVerificationSessionError, MarkLinkVerifiedError};
            }

            public static EnumEntries<Error> getEntries() {
                return $ENTRIES;
            }

            private Error(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                Error[] errorArr$values = $values();
                $VALUES = errorArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(errorArr$values);
            }

            public static Error valueOf(String str) {
                return (Error) Enum.valueOf(Error.class, str);
            }

            public static Error[] values() {
                return (Error[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpSuccess;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerificationStepUpSuccess extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationStepUpSuccess(FinancialConnectionsSessionManifest.Pane pane) {
            super("networking.verification.step_up.success", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "error", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;)V", "Error", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VerificationStepUpError extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerificationStepUpError(FinancialConnectionsSessionManifest.Pane pane, Error error) {
            super("networking.verification.step_up.error", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("error", error.getValue()))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(error, "error");
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$VerificationStepUpError$Error;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ConsumerNotFoundError", "LookupConsumerSession", "StartVerificationError", "MarkLinkVerifiedError", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Error {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Error[] $VALUES;
            private final String value;
            public static final Error ConsumerNotFoundError = new Error("ConsumerNotFoundError", 0, "ConsumerNotFoundError");
            public static final Error LookupConsumerSession = new Error("LookupConsumerSession", 1, "LookupConsumerSession");
            public static final Error StartVerificationError = new Error("StartVerificationError", 2, "StartVerificationSessionError");
            public static final Error MarkLinkVerifiedError = new Error("MarkLinkVerifiedError", 3, "MarkLinkStepUpAuthenticationVerifiedError");

            private static final /* synthetic */ Error[] $values() {
                return new Error[]{ConsumerNotFoundError, LookupConsumerSession, StartVerificationError, MarkLinkVerifiedError};
            }

            public static EnumEntries<Error> getEntries() {
                return $ENTRIES;
            }

            private Error(String str, int i, String str2) {
                this.value = str2;
            }

            public final String getValue() {
                return this.value;
            }

            static {
                Error[] errorArr$values = $values();
                $VALUES = errorArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(errorArr$values);
            }

            public static Error valueOf(String str) {
                return (Error) Enum.valueOf(Error.class, str);
            }

            public static Error[] values() {
                return (Error[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ClickDone;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickDone extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClickDone(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.done", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Error;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", NotificationsService.EXCEPTION_KEY, "", "extraMessage", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Error extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        public /* synthetic */ Error(FinancialConnectionsSessionManifest.Pane pane, Throwable th, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pane, th, (i & 4) != 0 ? null : str);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Error(FinancialConnectionsSessionManifest.Pane pane, Throwable exception, String str) {
            String str2;
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(exception, "exception");
            if ((exception instanceof FinancialConnectionsError) || (exception instanceof WebAuthFlowFailedException) || (exception instanceof ConfirmVerification.OTPError)) {
                str2 = "error.expected";
            } else {
                str2 = "error.unexpected";
            }
            super(str2, CollectionsKt.filterNotNullValues(MapsKt.plus(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane))), AnalyticsMappersKt.toEventParams(exception, str))), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$Exposure;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "experimentName", "", "assignmentEventId", "accountHolderId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Exposure extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exposure(String experimentName, String assignmentEventId, String accountHolderId) {
            super("preloaded_experiment_retrieved", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("experiment_retrieved", experimentName), TuplesKt.to("arb_id", assignmentEventId), TuplesKt.to("account_holder_id", accountHolderId))), false, null);
            Intrinsics.checkNotNullParameter(experimentName, "experimentName");
            Intrinsics.checkNotNullParameter(assignmentEventId, "assignmentEventId");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionUrlReceived;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "url", "", "status", "authSessionId", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthSessionUrlReceived extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public AuthSessionUrlReceived(FinancialConnectionsSessionManifest.Pane pane, String url, String status, String str) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(status, "status");
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            pairArr[1] = TuplesKt.to("status", status);
            pairArr[2] = TuplesKt.to("url", url);
            pairArr[3] = TuplesKt.to("auth_session_id", str == null ? "" : str);
            super("auth_session.url_received", CollectionsKt.filterNotNullValues(MapsKt.mapOf(pairArr)), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionRetrieved;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "authSessionId", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthSessionRetrieved extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthSessionRetrieved(FinancialConnectionsSessionManifest.Pane nextPane, String authSessionId) {
            super("auth_session.retrieved", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("next_pane", nextPane.getValue()), TuplesKt.to("auth_session_id", authSessionId))), false, 4, null);
            Intrinsics.checkNotNullParameter(nextPane, "nextPane");
            Intrinsics.checkNotNullParameter(authSessionId, "authSessionId");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$ConsentAgree;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConsentAgree extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;
        public static final ConsentAgree INSTANCE = new ConsentAgree();

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConsentAgree)) {
                return false;
            }
            return true;
        }

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public int hashCode() {
            return 772248265;
        }

        @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent
        public String toString() {
            return "ConsentAgree";
        }

        private ConsentAgree() {
            super("click.agree", MapsKt.mapOf(TuplesKt.to("pane", FinancialConnectionsSessionManifest.Pane.CONSENT.getValue())), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickContinue;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaneClickContinue extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrepaneClickContinue(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.prepane.continue", MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickCancel;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaneClickCancel extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrepaneClickCancel(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.prepane.cancel", MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$PrepaneClickChooseAnotherBank;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrepaneClickChooseAnotherBank extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrepaneClickChooseAnotherBank(FinancialConnectionsSessionManifest.Pane pane) {
            super("click.prepane.choose_another_bank", MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AuthSessionOpened;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "flow", "", "defaultBrowser", "id", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthSessionOpened extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public AuthSessionOpened(FinancialConnectionsSessionManifest.Pane pane, String str, String str2, String id) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(id, "id");
            Pair[] pairArr = new Pair[4];
            pairArr[0] = TuplesKt.to("auth_session_id", id);
            pairArr[1] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            pairArr[2] = TuplesKt.to("flow", str == null ? "unknown" : str);
            pairArr[3] = TuplesKt.to("browser", str2 == null ? "unknown" : str2);
            super("auth_session.opened", CollectionsKt.filterNotNullValues(MapsKt.mapOf(pairArr)), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitSkipped;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttestationInitSkipped extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttestationInitSkipped(FinancialConnectionsSessionManifest.Pane pane) {
            super("attestation.init_skipped", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationInitFailed;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "error", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/Throwable;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttestationInitFailed extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public AttestationInitFailed(FinancialConnectionsSessionManifest.Pane pane, Throwable error) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(error, "error");
            Pair[] pairArr = new Pair[2];
            pairArr[0] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            pairArr[1] = TuplesKt.to("error_reason", error instanceof AttestationError ? ((AttestationError) error).getErrorType().name() : "unknown");
            super("attestation.init_failed", CollectionsKt.filterNotNullValues(MapsKt.mapOf(pairArr)), false, 4, null);
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestSucceeded;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "endpoint", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttestationRequestSucceeded extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AttestationRequestSucceeded(FinancialConnectionsSessionManifest.Pane pane, AttestationEndpoint endpoint) {
            super("attestation.request_token_succeeded", CollectionsKt.filterNotNullValues(MapsKt.mapOf(TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane)), TuplesKt.to("api", endpoint.getAnalyticsValue()))), false, 4, null);
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        }
    }

    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationRequestFailed;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "endpoint", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;", "error", "", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;Ljava/lang/Throwable;)V", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttestationRequestFailed extends FinancialConnectionsAnalyticsEvent {
        public static final int $stable = 0;

        /* JADX WARN: Illegal instructions before constructor call */
        public AttestationRequestFailed(FinancialConnectionsSessionManifest.Pane pane, AttestationEndpoint endpoint, Throwable error) {
            Intrinsics.checkNotNullParameter(pane, "pane");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(error, "error");
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.to("pane", ConsentAgree.INSTANCE.getAnalyticsValue$financial_connections_release(pane));
            pairArr[1] = TuplesKt.to("api", endpoint.getAnalyticsValue());
            pairArr[2] = TuplesKt.to("error_reason", error instanceof AttestationError ? ((AttestationError) error).getErrorType().name() : "unknown");
            super("attestation.request_token_failed", MapsKt.mapOf(pairArr), false, 4, null);
        }
    }

    public final String getAnalyticsValue$financial_connections_release(FinancialConnectionsSessionManifest.Pane pane) {
        Intrinsics.checkNotNullParameter(pane, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[pane.ordinal()];
        if (i == 1 || i == 2) {
            return FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue();
        }
        return pane.getValue();
    }

    public String toString() {
        return "FinancialConnectionsEvent(name='" + this.name + "', params=" + this.params + ")";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent");
        FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent = (FinancialConnectionsAnalyticsEvent) other;
        return Intrinsics.areEqual(this.name, financialConnectionsAnalyticsEvent.name) && Intrinsics.areEqual(this.params, financialConnectionsAnalyticsEvent.params) && this.includePrefix == financialConnectionsAnalyticsEvent.includePrefix && Intrinsics.areEqual(this.eventName, financialConnectionsAnalyticsEvent.eventName);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Map<String, String> map = this.params;
        return ((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + Boolean.hashCode(this.includePrefix)) * 31) + this.eventName.hashCode();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FinancialConnectionsAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent$AttestationEndpoint;", "", "analyticsValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getAnalyticsValue", "()Ljava/lang/String;", "LOOKUP", "SIGNUP", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AttestationEndpoint {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AttestationEndpoint[] $VALUES;
        public static final AttestationEndpoint LOOKUP = new AttestationEndpoint("LOOKUP", 0, "consumer_session_lookup");
        public static final AttestationEndpoint SIGNUP = new AttestationEndpoint("SIGNUP", 1, "link_sign_up");
        private final String analyticsValue;

        private static final /* synthetic */ AttestationEndpoint[] $values() {
            return new AttestationEndpoint[]{LOOKUP, SIGNUP};
        }

        public static EnumEntries<AttestationEndpoint> getEntries() {
            return $ENTRIES;
        }

        private AttestationEndpoint(String str, int i, String str2) {
            this.analyticsValue = str2;
        }

        public final String getAnalyticsValue() {
            return this.analyticsValue;
        }

        static {
            AttestationEndpoint[] attestationEndpointArr$values = $values();
            $VALUES = attestationEndpointArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(attestationEndpointArr$values);
        }

        public static AttestationEndpoint valueOf(String str) {
            return (AttestationEndpoint) Enum.valueOf(AttestationEndpoint.class, str);
        }

        public static AttestationEndpoint[] values() {
            return (AttestationEndpoint[]) $VALUES.clone();
        }
    }
}
