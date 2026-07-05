package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.Stripe;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.networking.AnalyticsRequest;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.core.networking.StripeClientUserAgentHeaderFactory;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PaymentAuthWebViewActivityViewModel.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002)*B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\u0006\u0010%\u001a\u00020#J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "Landroidx/lifecycle/ViewModel;", CardScanActivity.ARGS, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders$delegate", "Lkotlin/Lazy;", "buttonText", "getButtonText$payments_core_release", "()Ljava/lang/String;", "toolbarTitle", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "getToolbarTitle$payments_core_release", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toolbarBackgroundColor", "getToolbarBackgroundColor$payments_core_release", "paymentResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getPaymentResult$payments_core_release", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "cancellationResult", "Landroid/content/Intent;", "getCancellationResult$payments_core_release", "()Landroid/content/Intent;", "logStart", "", "logError", "logComplete", "fireAnalytics", "request", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "ToolbarTitleData", "Factory", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivityViewModel extends ViewModel {
    public static final int $stable = 8;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentBrowserAuthContract.Args args;
    private final /* synthetic */ String buttonText;

    /* renamed from: extraHeaders$delegate, reason: from kotlin metadata */
    private final Lazy extraHeaders;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final /* synthetic */ String toolbarBackgroundColor;
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PaymentAuthWebViewActivityViewModel(PaymentBrowserAuthContract.Args args, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory) {
        String buttonText;
        ToolbarTitleData toolbarTitleData;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        this.args = args;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.extraHeaders = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivityViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentAuthWebViewActivityViewModel.extraHeaders_delegate$lambda$1(this.f$0);
            }
        });
        StripeToolbarCustomization toolbarCustomization = args.getToolbarCustomization();
        if (toolbarCustomization != null) {
            buttonText = toolbarCustomization.getButtonText();
            String str = buttonText;
            buttonText = (str == null || StringsKt.isBlank(str)) ? null : buttonText;
        }
        this.buttonText = buttonText;
        StripeToolbarCustomization toolbarCustomization2 = args.getToolbarCustomization();
        if (toolbarCustomization2 != null) {
            String headerText = toolbarCustomization2.getHeaderText();
            String str2 = headerText;
            headerText = (str2 == null || StringsKt.isBlank(str2)) ? null : headerText;
            toolbarTitleData = headerText != null ? new ToolbarTitleData(headerText, toolbarCustomization2) : null;
        }
        this.toolbarTitle = toolbarTitleData;
        StripeToolbarCustomization toolbarCustomization3 = args.getToolbarCustomization();
        this.toolbarBackgroundColor = toolbarCustomization3 != null ? toolbarCustomization3.getBackgroundColor() : null;
    }

    public final Map<String, String> getExtraHeaders() {
        return (Map) this.extraHeaders.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map extraHeaders_delegate$lambda$1(PaymentAuthWebViewActivityViewModel paymentAuthWebViewActivityViewModel) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        if (paymentAuthWebViewActivityViewModel.args.getReferrer() != null) {
            mapCreateMapBuilder.put("Referer", paymentAuthWebViewActivityViewModel.args.getReferrer());
        }
        return MapsKt.plus(new StripeClientUserAgentHeaderFactory(null, 1, null).create(Stripe.INSTANCE.getAppInfo()), MapsKt.build(mapCreateMapBuilder));
    }

    /* renamed from: getButtonText$payments_core_release, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: getToolbarTitle$payments_core_release, reason: from getter */
    public final ToolbarTitleData getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: getToolbarBackgroundColor$payments_core_release, reason: from getter */
    public final String getToolbarBackgroundColor() {
        return this.toolbarBackgroundColor;
    }

    public final /* synthetic */ PaymentFlowResult.Unvalidated getPaymentResult$payments_core_release() {
        String clientSecret = this.args.getClientSecret();
        String lastPathSegment = Uri.parse(this.args.getUrl()).getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new PaymentFlowResult.Unvalidated(clientSecret, 0, null, false, lastPathSegment, null, this.args.getStripeAccountId(), 46, null);
    }

    public final /* synthetic */ Intent getCancellationResult$payments_core_release() {
        Intent intentPutExtras = new Intent().putExtras(PaymentFlowResult.Unvalidated.copy$default(getPaymentResult$payments_core_release(), null, this.args.getShouldCancelIntentOnUserNavigation() ? 3 : 1, null, this.args.getShouldCancelSource(), null, null, null, 117, null).toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }

    public final void logStart() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeStart, null, null, null, null, null, 62, null));
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthWithWebView, null, null, null, null, null, 62, null));
    }

    public final void logError() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeError, null, null, null, null, null, 62, null));
    }

    public final void logComplete() {
        fireAnalytics(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.Auth3ds1ChallengeComplete, null, null, null, null, null, 62, null));
    }

    private final void fireAnalytics(AnalyticsRequest request) {
        this.analyticsRequestExecutor.executeAsync(request);
    }

    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u000e\u0010\u000e\u001a\u00020\u0005HÀ\u0003¢\u0006\u0002\b\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "", "text", "", "toolbarCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V", "getText$payments_core_release", "()Ljava/lang/String;", "getToolbarCustomization$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component1", "component1$payments_core_release", "component2", "component2$payments_core_release", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToolbarTitleData {
        public static final int $stable = 8;
        private final String text;
        private final StripeToolbarCustomization toolbarCustomization;

        public static /* synthetic */ ToolbarTitleData copy$default(ToolbarTitleData toolbarTitleData, String str, StripeToolbarCustomization stripeToolbarCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolbarTitleData.text;
            }
            if ((i & 2) != 0) {
                stripeToolbarCustomization = toolbarTitleData.toolbarCustomization;
            }
            return toolbarTitleData.copy(str, stripeToolbarCustomization);
        }

        /* renamed from: component1$payments_core_release, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2$payments_core_release, reason: from getter */
        public final StripeToolbarCustomization getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        public final ToolbarTitleData copy(String text, StripeToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            return new ToolbarTitleData(text, toolbarCustomization);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToolbarTitleData)) {
                return false;
            }
            ToolbarTitleData toolbarTitleData = (ToolbarTitleData) other;
            return Intrinsics.areEqual(this.text, toolbarTitleData.text) && Intrinsics.areEqual(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "ToolbarTitleData(text=" + this.text + ", toolbarCustomization=" + this.toolbarCustomization + ")";
        }

        public ToolbarTitleData(String text, StripeToolbarCustomization toolbarCustomization) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(toolbarCustomization, "toolbarCustomization");
            this.text = text;
            this.toolbarCustomization = toolbarCustomization;
        }

        public final String getText$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }
    }

    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "logger", "Lcom/stripe/android/core/Logger;", CardScanActivity.ARGS, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/core/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final Application application;
        private final PaymentBrowserAuthContract.Args args;
        private final Logger logger;

        public Factory(Application application, Logger logger, PaymentBrowserAuthContract.Args args) {
            Intrinsics.checkNotNullParameter(application, "application");
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(args, "args");
            this.application = application;
            this.logger = logger;
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new PaymentAuthWebViewActivityViewModel(this.args, new DefaultAnalyticsRequestExecutor(this.logger, Dispatchers.getIO()), new PaymentAnalyticsRequestFactory(this.application, this.args.getPublishableKey(), (Set<String>) SetsKt.setOf("PaymentAuthWebViewActivity")));
        }
    }
}
