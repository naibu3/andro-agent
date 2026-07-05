package com.stripe.android.financialconnections.analytics;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.login.LoginLogger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.CollectionsKt;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: DefaultFinancialConnectionsEventReporter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEventReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/core/networking/AnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;)V", "onPresented", "", "onResult", "sessionId", "", "financialConnectionsSheetResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "fireEvent", "event", "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;", "Event", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFinancialConnectionsEventReporter implements FinancialConnectionsEventReporter {
    public static final String PARAM_SESSION_ID = "las_id";
    public static final String PARAM_SESSION_RESULT = "session_result";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final CoroutineContext workContext;
    public static final int $stable = 8;

    @Inject
    public DefaultFinancialConnectionsEventReporter(AnalyticsRequestExecutor analyticsRequestExecutor, AnalyticsRequestFactory analyticsRequestFactory, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(analyticsRequestFactory, "analyticsRequestFactory");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.analyticsRequestFactory = analyticsRequestFactory;
        this.workContext = workContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onPresented() {
        fireEvent(new Event(Event.Code.SheetPresented, null, 2, 0 == true ? 1 : 0));
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsEventReporter
    public void onResult(String sessionId, FinancialConnectionsSheetActivityResult financialConnectionsSheetResult) {
        Event event;
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(financialConnectionsSheetResult, "financialConnectionsSheetResult");
        if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Completed) {
            event = new Event(Event.Code.SheetClosed, MapsKt.mapOf(TuplesKt.to(PARAM_SESSION_ID, sessionId), TuplesKt.to(PARAM_SESSION_RESULT, "completed")));
        } else if (financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            event = new Event(Event.Code.SheetClosed, MapsKt.mapOf(TuplesKt.to(PARAM_SESSION_ID, sessionId), TuplesKt.to(PARAM_SESSION_RESULT, AnalyticsEvents.PARAMETER_SHARE_OUTCOME_CANCELLED)));
        } else {
            if (!(financialConnectionsSheetResult instanceof FinancialConnectionsSheetActivityResult.Failed)) {
                throw new NoWhenBranchMatchedException();
            }
            event = new Event(Event.Code.SheetFailed, MapsKt.plus(MapsKt.mapOf(TuplesKt.to(PARAM_SESSION_ID, sessionId), TuplesKt.to(PARAM_SESSION_RESULT, LoginLogger.EVENT_EXTRAS_FAILURE)), CollectionsKt.filterNotNullValues(AnalyticsMappersKt.toEventParams(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetResult).getError(), null))));
        }
        fireEvent(event);
    }

    /* compiled from: DefaultFinancialConnectionsEventReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1", f = "DefaultFinancialConnectionsEventReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.analytics.DefaultFinancialConnectionsEventReporter$fireEvent$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Event $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Event event, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = event;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultFinancialConnectionsEventReporter.this.new AnonymousClass1(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                AnalyticsRequestExecutor analyticsRequestExecutor = DefaultFinancialConnectionsEventReporter.this.analyticsRequestExecutor;
                AnalyticsRequestFactory analyticsRequestFactory = DefaultFinancialConnectionsEventReporter.this.analyticsRequestFactory;
                Event event = this.$event;
                analyticsRequestExecutor.executeAsync(analyticsRequestFactory.createRequest(event, event.getAdditionalParams()));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireEvent(Event event) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(event, null), 3, null);
    }

    /* compiled from: DefaultFinancialConnectionsEventReporter.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001:\u0001\u001aB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event;", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "eventCode", "Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;", "additionalParams", "", "", "<init>", "(Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;Ljava/util/Map;)V", "getEventCode", "()Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;", "getAdditionalParams", "()Ljava/util/Map;", HandleClickableUrl.ClickableLinkParameters.EVENT_NAME, "getEventName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Code", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final /* data */ class Event implements AnalyticsEvent {
        private final Map<String, String> additionalParams;
        private final Code eventCode;
        private final String eventName;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, Code code, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                code = event.eventCode;
            }
            if ((i & 2) != 0) {
                map = event.additionalParams;
            }
            return event.copy(code, map);
        }

        /* renamed from: component1, reason: from getter */
        public final Code getEventCode() {
            return this.eventCode;
        }

        public final Map<String, String> component2() {
            return this.additionalParams;
        }

        public final Event copy(Code eventCode, Map<String, String> additionalParams) {
            Intrinsics.checkNotNullParameter(eventCode, "eventCode");
            Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
            return new Event(eventCode, additionalParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Event)) {
                return false;
            }
            Event event = (Event) other;
            return this.eventCode == event.eventCode && Intrinsics.areEqual(this.additionalParams, event.additionalParams);
        }

        public int hashCode() {
            return (this.eventCode.hashCode() * 31) + this.additionalParams.hashCode();
        }

        public String toString() {
            return "Event(eventCode=" + this.eventCode + ", additionalParams=" + this.additionalParams + ")";
        }

        public Event(Code eventCode, Map<String, String> additionalParams) {
            Intrinsics.checkNotNullParameter(eventCode, "eventCode");
            Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
            this.eventCode = eventCode;
            this.additionalParams = additionalParams;
            this.eventName = eventCode.toString();
        }

        public final Code getEventCode() {
            return this.eventCode;
        }

        public /* synthetic */ Event(Code code, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(code, (i & 2) != 0 ? MapsKt.emptyMap() : map);
        }

        public final Map<String, String> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: DefaultFinancialConnectionsEventReporter.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\u0003H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$financial_connections_release", "()Ljava/lang/String;", "SheetPresented", "SheetClosed", "SheetFailed", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Code {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Code[] $VALUES;
            private static final Companion Companion;
            private static final String PREFIX = "stripe_android.connections";
            private final String code;
            public static final Code SheetPresented = new Code("SheetPresented", 0, "sheet.presented");
            public static final Code SheetClosed = new Code("SheetClosed", 1, "sheet.closed");
            public static final Code SheetFailed = new Code("SheetFailed", 2, "sheet.failed");

            private static final /* synthetic */ Code[] $values() {
                return new Code[]{SheetPresented, SheetClosed, SheetFailed};
            }

            public static EnumEntries<Code> getEntries() {
                return $ENTRIES;
            }

            private Code(String str, int i, String str2) {
                this.code = str2;
            }

            /* renamed from: getCode$financial_connections_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            static {
                Code[] codeArr$values = $values();
                $VALUES = codeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(codeArr$values);
                Companion = new Companion(null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "stripe_android.connections." + this.code;
            }

            /* compiled from: DefaultFinancialConnectionsEventReporter.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/DefaultFinancialConnectionsEventReporter$Event$Code$Companion;", "", "<init>", "()V", "PREFIX", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }

            public static Code valueOf(String str) {
                return (Code) Enum.valueOf(Code.class, str);
            }

            public static Code[] values() {
                return (Code[]) $VALUES.clone();
            }
        }
    }
}
