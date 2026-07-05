package com.stripe.android.financialconnections.ui;

import android.webkit.URLUtil;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.utils.UriUtils;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HandleClickableUrl.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJb\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b0\u00112.\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u000f\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00140\u0013H\u0086B¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/ui/HandleClickableUrl;", "", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/core/Logger;)V", "invoke", "", "currentPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", ShareConstants.MEDIA_URI, "", "onNetworkUrlClicked", "Lkotlin/Function1;", "knownDeeplinkActions", "", "Lkotlin/Function2;", "Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;", "Lkotlin/coroutines/Continuation;", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildPayload", "internalLinkToPaneId", "DeeplinkPayload", "ClickableLinkParameters", "InternalLink", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleClickableUrl {
    public static final int $stable = 8;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final Map<String, String> internalLinkToPaneId;
    private final Logger logger;
    private final UriUtils uriUtils;

    /* compiled from: HandleClickableUrl.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.ui.HandleClickableUrl", f = "HandleClickableUrl.kt", i = {0, 0}, l = {32}, m = "invoke", n = {"this", ShareConstants.MEDIA_URI}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.financialconnections.ui.HandleClickableUrl$invoke$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HandleClickableUrl.this.invoke(null, null, null, null, this);
        }
    }

    @Inject
    public HandleClickableUrl(UriUtils uriUtils, FinancialConnectionsAnalyticsTracker eventTracker, Logger logger) {
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.uriUtils = uriUtils;
        this.eventTracker = eventTracker;
        this.logger = logger;
        this.internalLinkToPaneId = MapsKt.mapOf(TuplesKt.to(InternalLink.MANUAL_ENTRY, FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(FinancialConnectionsSessionManifest.Pane pane, String str, Function1<? super String, Unit> function1, Map<String, ? extends Function2<? super DeeplinkPayload, ? super Continuation<? super Unit>, ? extends Object>> map, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object next;
        Function2 function2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String queryParameter = this.uriUtils.getQueryParameter(str, ClickableLinkParameters.EVENT_NAME);
            if (queryParameter != null) {
                this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter, pane));
            }
            if (URLUtil.isNetworkUrl(str)) {
                function1.invoke(str);
            } else {
                Iterator<T> it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (this.uriUtils.compareSchemeAuthorityAndPath((String) ((Map.Entry) next).getKey(), str)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null || (function2 = (Function2) entry.getValue()) == null) {
                    Logger.DefaultImpls.error$default(this.logger, "Unrecognized clickable text: " + str, null, 2, null);
                } else {
                    DeeplinkPayload deeplinkPayloadBuildPayload = buildPayload(str);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = str;
                    anonymousClass1.label = 1;
                    if (function2.invoke(deeplinkPayloadBuildPayload, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final DeeplinkPayload buildPayload(String uri) {
        String queryParameter = this.uriUtils.getQueryParameter(uri, ClickableLinkParameters.NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA);
        return new DeeplinkPayload(queryParameter != null ? this.internalLinkToPaneId.get(queryParameter) : null);
    }

    /* compiled from: HandleClickableUrl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$DeeplinkPayload;", "", ClickableLinkParameters.NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA, "", "<init>", "(Ljava/lang/String;)V", "getNextPaneOrDrawerOnSecondaryCta", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeeplinkPayload {
        public static final int $stable = 0;
        private final String nextPaneOrDrawerOnSecondaryCta;

        public static /* synthetic */ DeeplinkPayload copy$default(DeeplinkPayload deeplinkPayload, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = deeplinkPayload.nextPaneOrDrawerOnSecondaryCta;
            }
            return deeplinkPayload.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getNextPaneOrDrawerOnSecondaryCta() {
            return this.nextPaneOrDrawerOnSecondaryCta;
        }

        public final DeeplinkPayload copy(String nextPaneOrDrawerOnSecondaryCta) {
            return new DeeplinkPayload(nextPaneOrDrawerOnSecondaryCta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DeeplinkPayload) && Intrinsics.areEqual(this.nextPaneOrDrawerOnSecondaryCta, ((DeeplinkPayload) other).nextPaneOrDrawerOnSecondaryCta);
        }

        public int hashCode() {
            String str = this.nextPaneOrDrawerOnSecondaryCta;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "DeeplinkPayload(nextPaneOrDrawerOnSecondaryCta=" + this.nextPaneOrDrawerOnSecondaryCta + ")";
        }

        public DeeplinkPayload(String str) {
            this.nextPaneOrDrawerOnSecondaryCta = str;
        }

        public final String getNextPaneOrDrawerOnSecondaryCta() {
            return this.nextPaneOrDrawerOnSecondaryCta;
        }
    }

    /* compiled from: HandleClickableUrl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$ClickableLinkParameters;", "", "<init>", "()V", "EVENT_NAME", "", "NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ClickableLinkParameters {
        public static final int $stable = 0;
        public static final String EVENT_NAME = "eventName";
        public static final ClickableLinkParameters INSTANCE = new ClickableLinkParameters();
        public static final String NEXT_PANE_OR_DRAWER_ON_SECONDARY_CTA = "nextPaneOrDrawerOnSecondaryCta";

        private ClickableLinkParameters() {
        }
    }

    /* compiled from: HandleClickableUrl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/ui/HandleClickableUrl$InternalLink;", "", "<init>", "()V", "MANUAL_ENTRY", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InternalLink {
        public static final int $stable = 0;
        public static final InternalLink INSTANCE = new InternalLink();
        public static final String MANUAL_ENTRY = "manual-entry";

        private InternalLink() {
        }
    }
}
