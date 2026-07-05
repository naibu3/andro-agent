package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.payments.DefaultReturnUrl;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: PaymentAuthWebViewClient.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\bH\u0016J\b\u0010!\u001a\u00020\rH\u0002J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0013H\u0002J\u0014\u0010,\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006/"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "logger", "Lcom/stripe/android/core/Logger;", "isPageLoaded", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "clientSecret", "", "returnUrl", "activityStarter", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "activityFinisher", "", "<init>", "(Lcom/stripe/android/core/Logger;Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "userReturnUri", "Landroid/net/Uri;", "value", "completionUrlParam", "getCompletionUrlParam", "()Ljava/lang/String;", "hasLoadedBlank", "getHasLoadedBlank$payments_core_release", "()Z", "setHasLoadedBlank$payments_core_release", "(Z)V", "onPageFinished", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "hideProgressBar", "shouldOverrideUrlLoading", "request", "Landroid/webkit/WebResourceRequest;", "openIntentScheme", ShareConstants.MEDIA_URI, "openIntent", SDKConstants.PARAM_INTENT, "updateCompletionUrl", "isReturnUrl", "isPredefinedReturnUrl", "onAuthCompleted", "error", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentAuthWebViewClient extends WebViewClient {
    public static final String BLANK_PAGE = "about:blank";
    public static final String PARAM_PAYMENT_CLIENT_SECRET = "payment_intent_client_secret";
    private static final String PARAM_RETURN_URL = "return_url";
    public static final String PARAM_SETUP_CLIENT_SECRET = "setup_intent_client_secret";
    private final Function1<Throwable, Unit> activityFinisher;
    private final Function1<Intent, Unit> activityStarter;
    private final String clientSecret;
    private String completionUrlParam;
    private boolean hasLoadedBlank;
    private final MutableStateFlow<Boolean> isPageLoaded;
    private final Logger logger;
    private final Uri userReturnUri;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> AUTHENTICATE_URLS = SetsKt.setOf("https://hooks.stripe.com/three_d_secure/authenticate");
    private static final Set<String> COMPLETION_URLS = SetsKt.setOf((Object[]) new String[]{"https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/", "https://hooks.stripe.com/3d_secure_2/hosted/complete"});

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentAuthWebViewClient(Logger logger, MutableStateFlow<Boolean> isPageLoaded, String clientSecret, String str, Function1<? super Intent, Unit> activityStarter, Function1<? super Throwable, Unit> activityFinisher) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(isPageLoaded, "isPageLoaded");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(activityStarter, "activityStarter");
        Intrinsics.checkNotNullParameter(activityFinisher, "activityFinisher");
        this.logger = logger;
        this.isPageLoaded = isPageLoaded;
        this.clientSecret = clientSecret;
        this.activityStarter = activityStarter;
        this.activityFinisher = activityFinisher;
        this.userReturnUri = str != null ? Uri.parse(str) : null;
    }

    public final String getCompletionUrlParam() {
        return this.completionUrlParam;
    }

    /* renamed from: getHasLoadedBlank$payments_core_release, reason: from getter */
    public final boolean getHasLoadedBlank() {
        return this.hasLoadedBlank;
    }

    public final void setHasLoadedBlank$payments_core_release(boolean z) {
        this.hasLoadedBlank = z;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.logger.debug("PaymentAuthWebViewClient#onPageFinished() - " + url);
        super.onPageFinished(view, url);
        if (!this.hasLoadedBlank) {
            hideProgressBar();
        }
        if (url == null || !INSTANCE.isCompletionUrl$payments_core_release(url)) {
            return;
        }
        this.logger.debug(url + " is a completion URL");
        onAuthCompleted$default(this, null, 1, null);
    }

    private final void hideProgressBar() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(true);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        Uri url = request.getUrl();
        this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        Intrinsics.checkNotNull(url);
        updateCompletionUrl(url);
        if (isReturnUrl(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            onAuthCompleted$default(this, null, 1, null);
            return true;
        }
        if (StringsKt.equals(SDKConstants.PARAM_INTENT, url.getScheme(), true)) {
            openIntentScheme(url);
            return true;
        }
        if (!URLUtil.isNetworkUrl(url.toString())) {
            openIntent(new Intent("android.intent.action.VIEW", url));
            return true;
        }
        return super.shouldOverrideUrlLoading(view, request);
    }

    private final void openIntentScheme(Uri uri) {
        Object objM9118constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            Result.Companion companion = Result.INSTANCE;
            PaymentAuthWebViewClient paymentAuthWebViewClient = this;
            Intent uri2 = Intent.parseUri(uri.toString(), 1);
            Intrinsics.checkNotNullExpressionValue(uri2, "parseUri(...)");
            openIntent(uri2);
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", thM9121exceptionOrNullimpl);
            onAuthCompleted(thM9121exceptionOrNullimpl);
        }
    }

    private final void openIntent(Intent intent) {
        Object objM9118constructorimpl;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            Result.Companion companion = Result.INSTANCE;
            PaymentAuthWebViewClient paymentAuthWebViewClient = this;
            this.activityStarter.invoke(intent);
            objM9118constructorimpl = Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Failed to start Intent.", thM9121exceptionOrNullimpl);
            if (Intrinsics.areEqual(intent.getScheme(), "alipays")) {
                return;
            }
            onAuthCompleted(thM9121exceptionOrNullimpl);
        }
    }

    private final void updateCompletionUrl(Uri uri) {
        this.logger.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        Companion companion = INSTANCE;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String queryParameter = companion.isAuthenticateUrl(string) ? uri.getQueryParameter("return_url") : null;
        String str = queryParameter;
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        this.completionUrlParam = queryParameter;
    }

    private final boolean isReturnUrl(Uri uri) {
        String queryParameter;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (isPredefinedReturnUrl(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            return uri2.getScheme() != null && Intrinsics.areEqual(this.userReturnUri.getScheme(), uri.getScheme()) && this.userReturnUri.getHost() != null && Intrinsics.areEqual(this.userReturnUri.getHost(), uri.getHost());
        }
        if (uri.isOpaque()) {
            return false;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(PARAM_PAYMENT_CLIENT_SECRET)) {
            queryParameter = uri.getQueryParameter(PARAM_PAYMENT_CLIENT_SECRET);
        } else {
            queryParameter = queryParameterNames.contains(PARAM_SETUP_CLIENT_SECRET) ? uri.getQueryParameter(PARAM_SETUP_CLIENT_SECRET) : null;
        }
        return Intrinsics.areEqual(this.clientSecret, queryParameter);
    }

    private final boolean isPredefinedReturnUrl(Uri uri) {
        if (Intrinsics.areEqual("stripejs://use_stripe_sdk/return_url", uri.toString())) {
            return true;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return StringsKt.startsWith$default(string, DefaultReturnUrl.PREFIX, false, 2, (Object) null);
    }

    static /* synthetic */ void onAuthCompleted$default(PaymentAuthWebViewClient paymentAuthWebViewClient, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        paymentAuthWebViewClient.onAuthCompleted(th);
    }

    private final void onAuthCompleted(Throwable error) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(error);
    }

    /* compiled from: PaymentAuthWebViewClient.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient$Companion;", "", "<init>", "()V", "PARAM_PAYMENT_CLIENT_SECRET", "", "PARAM_SETUP_CLIENT_SECRET", "AUTHENTICATE_URLS", "", "COMPLETION_URLS", "PARAM_RETURN_URL", "BLANK_PAGE", "isCompletionUrl", "", "url", "isCompletionUrl$payments_core_release", "isAuthenticateUrl", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean isCompletionUrl$payments_core_release(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Set set = PaymentAuthWebViewClient.COMPLETION_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isAuthenticateUrl(String url) {
            Set set = PaymentAuthWebViewClient.AUTHENTICATE_URLS;
            if ((set instanceof Collection) && set.isEmpty()) {
                return false;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(url, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
            return false;
        }
    }
}
