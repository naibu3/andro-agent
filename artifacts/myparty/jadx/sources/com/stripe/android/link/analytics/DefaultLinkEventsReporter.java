package com.stripe.android.link.analytics;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.ExceptionUtilsKt;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.utils.DurationProvider;
import com.stripe.android.link.analytics.LinkEvent;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: DefaultLinkEventsReporter.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 82\u00020\u0001:\u00018B;\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\u0011H\u0016J\b\u0010$\u001a\u00020\u0011H\u0016J\b\u0010%\u001a\u00020\u0011H\u0016J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010'\u001a\u00020\u0011H\u0016J\b\u0010(\u001a\u00020\u0011H\u0016J%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0018\u00010*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0002\b/J(\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u0002022\u0016\b\u0002\u00103\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u000204\u0018\u00010*H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00105\u001a\u00020+*\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "errorReporter", "Lcom/stripe/android/payments/core/analytics/ErrorReporter;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/core/Logger;", "durationProvider", "Lcom/stripe/android/core/utils/DurationProvider;", "<init>", "(Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/payments/core/analytics/ErrorReporter;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/Logger;Lcom/stripe/android/core/utils/DurationProvider;)V", "onInvalidSessionState", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;", "onInlineSignupCheckboxChecked", "onSignupFlowPresented", "onSignupStarted", "isInline", "", "onSignupCompleted", "onSignupFailure", "error", "", "onAccountLookupFailure", "on2FAStart", "on2FAStartFailure", "on2FAComplete", "on2FAFailure", "on2FACancel", "onPopupShow", "onPopupSuccess", "onPopupCancel", "onPopupError", "onPopupLogout", "onPopupSkipped", "durationInSecondsFromStart", "", "", "", "duration", "Lkotlin/time/Duration;", "durationInSecondsFromStart-BwNAW2A", "fireEvent", "event", "Lcom/stripe/android/link/analytics/LinkEvent;", "additionalParams", "", "analyticsValue", "getAnalyticsValue", "(Lcom/stripe/android/link/analytics/LinkEventsReporter$SessionState;)Ljava/lang/String;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultLinkEventsReporter implements LinkEventsReporter {
    private static final String FIELD_ERROR_MESSAGE = "error_message";
    private static final String FIELD_SESSION_STATE = "sessionState";
    private static final String VALUE_REQUIRES_SIGN_UP = "requiresSignUp";
    private static final String VALUE_REQUIRES_VERIFICATION = "requiresVerification";
    private static final String VALUE_VERIFIED = "verified";
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final DurationProvider durationProvider;
    private final ErrorReporter errorReporter;
    private final Logger logger;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DefaultLinkEventsReporter.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkEventsReporter.SessionState.values().length];
            try {
                iArr[LinkEventsReporter.SessionState.RequiresSignUp.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkEventsReporter.SessionState.RequiresVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkEventsReporter.SessionState.Verified.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public DefaultLinkEventsReporter(AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ErrorReporter errorReporter, @IOContext CoroutineContext workContext, Logger logger, DurationProvider durationProvider) {
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(durationProvider, "durationProvider");
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
        this.logger = logger;
        this.durationProvider = durationProvider;
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onInvalidSessionState(LinkEventsReporter.SessionState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Map<String, ? extends Object> mapMapOf = MapsKt.mapOf(TuplesKt.to(FIELD_SESSION_STATE, getAnalyticsValue(state)));
        ErrorReporter.DefaultImpls.report$default(this.errorReporter, ErrorReporter.UnexpectedErrorEvent.LINK_INVALID_SESSION_STATE, null, null, 6, null);
        fireEvent(LinkEvent.SignUpFailureInvalidSessionState.INSTANCE, mapMapOf);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onInlineSignupCheckboxChecked() {
        fireEvent$default(this, LinkEvent.SignUpCheckboxChecked.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupFlowPresented() {
        fireEvent$default(this, LinkEvent.SignUpFlowPresented.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupStarted(boolean isInline) {
        DurationProvider.DefaultImpls.start$default(this.durationProvider, DurationProvider.Key.LinkSignup, false, 2, null);
        fireEvent$default(this, LinkEvent.SignUpStart.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupCompleted(boolean isInline) {
        fireEvent(LinkEvent.SignUpComplete.INSTANCE, m7729durationInSecondsFromStartBwNAW2A(this.durationProvider.mo7239endLV8wdWc(DurationProvider.Key.LinkSignup)));
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onSignupFailure(boolean isInline, Throwable error) {
        StripeError stripeError;
        String message;
        Intrinsics.checkNotNullParameter(error, "error");
        Map mapMapOf = null;
        if ((error instanceof APIException) && (stripeError = ((APIException) error).getStripeError()) != null && (message = stripeError.getMessage()) != null) {
            mapMapOf = MapsKt.mapOf(TuplesKt.to("error_message", message));
        }
        if (mapMapOf == null) {
            mapMapOf = MapsKt.mapOf(TuplesKt.to("error_message", ExceptionUtilsKt.getSafeAnalyticsMessage(error)));
        }
        fireEvent(LinkEvent.SignUpFailure.INSTANCE, MapsKt.plus(mapMapOf, ErrorReporter.INSTANCE.getAdditionalParamsFromError(error)));
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onAccountLookupFailure(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(LinkEvent.AccountLookupFailure.INSTANCE, MapsKt.plus(MapsKt.mapOf(TuplesKt.to("error_message", ExceptionUtilsKt.getSafeAnalyticsMessage(error))), ErrorReporter.INSTANCE.getAdditionalParamsFromError(error)));
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAStart() {
        fireEvent$default(this, LinkEvent.TwoFAStart.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAStartFailure() {
        fireEvent$default(this, LinkEvent.TwoFAStartFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAComplete() {
        fireEvent$default(this, LinkEvent.TwoFAComplete.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FAFailure() {
        fireEvent$default(this, LinkEvent.TwoFAFailure.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void on2FACancel() {
        fireEvent$default(this, LinkEvent.TwoFACancel.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupShow() {
        fireEvent$default(this, LinkEvent.PopupShow.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupSuccess() {
        fireEvent$default(this, LinkEvent.PopupSuccess.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupCancel() {
        fireEvent$default(this, LinkEvent.PopupCancel.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupError(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        fireEvent(LinkEvent.PopupError.INSTANCE, MapsKt.mapOf(TuplesKt.to("error_message", ExceptionUtilsKt.getSafeAnalyticsMessage(error))));
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupLogout() {
        fireEvent$default(this, LinkEvent.PopupLogout.INSTANCE, null, 2, null);
    }

    @Override // com.stripe.android.link.analytics.LinkEventsReporter
    public void onPopupSkipped() {
        fireEvent$default(this, LinkEvent.PopupSkipped.INSTANCE, null, 2, null);
    }

    /* renamed from: durationInSecondsFromStart-BwNAW2A, reason: not valid java name */
    private final Map<String, Float> m7729durationInSecondsFromStartBwNAW2A(Duration duration) {
        if (duration != null) {
            return MapsKt.mapOf(TuplesKt.to("duration", Float.valueOf((float) Duration.m10518toDoubleimpl(duration.getRawValue(), DurationUnit.SECONDS))));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void fireEvent$default(DefaultLinkEventsReporter defaultLinkEventsReporter, LinkEvent linkEvent, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        defaultLinkEventsReporter.fireEvent(linkEvent, map);
    }

    /* compiled from: DefaultLinkEventsReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.analytics.DefaultLinkEventsReporter$fireEvent$1", f = "DefaultLinkEventsReporter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.analytics.DefaultLinkEventsReporter$fireEvent$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Map<String, Object> $additionalParams;
        final /* synthetic */ LinkEvent $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LinkEvent linkEvent, Map<String, ? extends Object> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$event = linkEvent;
            this.$additionalParams = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultLinkEventsReporter.this.new AnonymousClass1(this.$event, this.$additionalParams, continuation);
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
                AnalyticsRequestExecutor analyticsRequestExecutor = DefaultLinkEventsReporter.this.analyticsRequestExecutor;
                PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = DefaultLinkEventsReporter.this.paymentAnalyticsRequestFactory;
                LinkEvent linkEvent = this.$event;
                Map<String, ? extends Object> mapEmptyMap = this.$additionalParams;
                if (mapEmptyMap == null) {
                    mapEmptyMap = MapsKt.emptyMap();
                }
                analyticsRequestExecutor.executeAsync(paymentAnalyticsRequestFactory.createRequest(linkEvent, mapEmptyMap));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void fireEvent(LinkEvent event, Map<String, ? extends Object> additionalParams) {
        this.logger.debug("Link event: " + event.getEventName() + " " + additionalParams);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(event, additionalParams, null), 3, null);
    }

    private final String getAnalyticsValue(LinkEventsReporter.SessionState sessionState) {
        int i = WhenMappings.$EnumSwitchMapping$0[sessionState.ordinal()];
        if (i == 1) {
            return VALUE_REQUIRES_SIGN_UP;
        }
        if (i == 2) {
            return VALUE_REQUIRES_VERIFICATION;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return VALUE_VERIFIED;
    }

    /* compiled from: DefaultLinkEventsReporter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter$Companion;", "", "<init>", "()V", "FIELD_SESSION_STATE", "", "VALUE_REQUIRES_SIGN_UP", "VALUE_REQUIRES_VERIFICATION", "VALUE_VERIFIED", "FIELD_ERROR_MESSAGE", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
