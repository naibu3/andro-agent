package com.stripe.android.financialconnections.analytics;

import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.AnalyticsRequestV2Factory;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: FinancialConnectionsAnalyticsTracker.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTrackerImpl;", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "locale", "Ljava/util/Locale;", "context", "Landroid/content/Context;", "requestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;", "<init>", "(Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Ljava/util/Locale;Landroid/content/Context;Lcom/stripe/android/core/networking/AnalyticsRequestV2Executor;)V", "requestFactory", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;", "track", "", "event", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsEvent;", "commonParams", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsAnalyticsTrackerImpl implements FinancialConnectionsAnalyticsTracker {
    public static final String CLIENT_ID = "mobile-clients-linked-accounts";
    public static final String ORIGIN = "stripe-linked-accounts-android";
    private final FinancialConnectionsSheetConfiguration configuration;
    private final GetOrFetchSync getOrFetchSync;
    private final Locale locale;
    private final AnalyticsRequestV2Executor requestExecutor;
    private final AnalyticsRequestV2Factory requestFactory;
    public static final int $stable = 8;

    /* compiled from: FinancialConnectionsAnalyticsTracker.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl", f = "FinancialConnectionsAnalyticsTracker.kt", i = {0}, l = {110}, m = "commonParams", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl$commonParams$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinancialConnectionsAnalyticsTrackerImpl.this.commonParams(this);
        }
    }

    public FinancialConnectionsAnalyticsTrackerImpl(GetOrFetchSync getOrFetchSync, FinancialConnectionsSheetConfiguration configuration, Locale locale, Context context, AnalyticsRequestV2Executor requestExecutor) {
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.getOrFetchSync = getOrFetchSync;
        this.configuration = configuration;
        this.locale = locale;
        this.requestExecutor = requestExecutor;
        this.requestFactory = new AnalyticsRequestV2Factory(context, CLIENT_ID, ORIGIN, null, 8, null);
    }

    /* compiled from: FinancialConnectionsAnalyticsTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl$track$1", f = "FinancialConnectionsAnalyticsTracker.kt", i = {}, l = {102, 105}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerImpl$track$1, reason: invalid class name and case insensitive filesystem */
    static final class C08571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FinancialConnectionsAnalyticsEvent $event;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08571(FinancialConnectionsAnalyticsEvent financialConnectionsAnalyticsEvent, Continuation<? super C08571> continuation) {
            super(2, continuation);
            this.$event = financialConnectionsAnalyticsEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsAnalyticsTrackerImpl.this.new C08571(this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C08571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
        
            if (r7.this$0.requestExecutor.enqueue(r8, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnalyticsRequestV2Factory analyticsRequestV2Factory;
            String eventName;
            Map<String, String> map;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                analyticsRequestV2Factory = FinancialConnectionsAnalyticsTrackerImpl.this.requestFactory;
                eventName = this.$event.getEventName();
                Map<String, String> params = this.$event.getParams();
                if (params == null) {
                    params = MapsKt.emptyMap();
                }
                map = params;
                this.L$0 = analyticsRequestV2Factory;
                this.L$1 = eventName;
                this.L$2 = map;
                this.label = 1;
                obj = FinancialConnectionsAnalyticsTrackerImpl.this.commonParams(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            map = (Map) this.L$2;
            eventName = (String) this.L$1;
            analyticsRequestV2Factory = (AnalyticsRequestV2Factory) this.L$0;
            ResultKt.throwOnFailure(obj);
            AnalyticsRequestV2 analyticsRequestV2CreateRequest = analyticsRequestV2Factory.createRequest(eventName, MapsKt.plus(map, (Map) obj), true);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        }
    }

    @Override // com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker
    public void track(FinancialConnectionsAnalyticsEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new C08571(event, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object commonParams(Continuation<? super Map<String, String>> continuation) {
        AnonymousClass1 anonymousClass1;
        FinancialConnectionsAnalyticsTrackerImpl financialConnectionsAnalyticsTrackerImpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objInvoke$default = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke$default);
            GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
            anonymousClass12.L$0 = this;
            anonymousClass12.label = 1;
            objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, anonymousClass12, 3, null);
            if (objInvoke$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            financialConnectionsAnalyticsTrackerImpl = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            financialConnectionsAnalyticsTrackerImpl = (FinancialConnectionsAnalyticsTrackerImpl) anonymousClass12.L$0;
            ResultKt.throwOnFailure(objInvoke$default);
        }
        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objInvoke$default).getManifest();
        return MapsKt.mapOf(TuplesKt.to(DefaultFinancialConnectionsEventReporter.PARAM_SESSION_ID, manifest.getId()), TuplesKt.to(SDKConstants.PARAM_KEY, financialConnectionsAnalyticsTrackerImpl.configuration.getPublishableKey()), TuplesKt.to("stripe_account", financialConnectionsAnalyticsTrackerImpl.configuration.getStripeAccountId()), TuplesKt.to("navigator_language", financialConnectionsAnalyticsTrackerImpl.locale.toLanguageTag()), TuplesKt.to("is_webview", Constants.CASEFIRST_FALSE), TuplesKt.to(TokenJsonParser.FIELD_LIVEMODE, String.valueOf(manifest.getLivemode())), TuplesKt.to("product", manifest.getProduct().getValue()), TuplesKt.to("is_stripe_direct", String.valueOf(manifest.isStripeDirect())), TuplesKt.to("single_account", String.valueOf(manifest.getSingleAccount())), TuplesKt.to("allow_manual_entry", String.valueOf(manifest.getAllowManualEntry())), TuplesKt.to("app_verification_enabled", String.valueOf(manifest.getAppVerificationEnabled())), TuplesKt.to("account_holder_id", manifest.getAccountholderToken()));
    }
}
