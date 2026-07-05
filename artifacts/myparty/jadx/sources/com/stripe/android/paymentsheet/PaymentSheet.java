package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.webkit.Profile;
import com.caverock.androidsvg.SVGParser;
import com.facebook.GraphResponse;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.common.analytics.AnalyticsKtxKt;
import com.stripe.android.common.configuration.ConfigurationDefaults;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.AnalyticEventCallback;
import com.stripe.android.paymentelement.ConfirmCustomPaymentMethodCallback;
import com.stripe.android.paymentelement.PreparePaymentMethodHandler;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbackReferences;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.paymentsheet.addresselement.AddressDetails;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.paymentsheet.state.PaymentElementLoader;
import com.stripe.android.uicore.StripeThemeDefaults;
import com.stripe.android.uicore.StripeThemeKt;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Utf8;

/* compiled from: PaymentSheet.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 @2\u00020\u0001:\u001d$%&'()*+,-./0123456789:;<=>?@B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nB!\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\rB!\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0011B)\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0012B\u0019\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0015B!\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0016B!\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0017B)\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u001c\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet;", "", "paymentSheetLauncher", "Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetLauncher;)V", "activity", "Landroidx/activity/ComponentActivity;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "externalPaymentMethodConfirmHandler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "paymentResultCallback", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "presentWithPaymentIntent", "", "paymentIntentClientSecret", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "presentWithSetupIntent", "setupIntentClientSecret", "presentWithIntentConfiguration", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "Builder", "IntentConfiguration", "TermsDisplay", "Configuration", "PaymentMethodLayout", "Appearance", "Colors", "Shapes", "Typography", "Spacing", "IconStyle", "PrimaryButton", "PrimaryButtonColors", "PrimaryButtonShape", "PrimaryButtonTypography", "Insets", "Address", "BillingDetails", "BillingDetailsCollectionConfiguration", "CardBrandAcceptance", "CustomPaymentMethod", "CustomerAccessType", "CustomerConfiguration", "GooglePayConfiguration", "LinkConfiguration", "WalletButtonsConfiguration", "ShopPayConfiguration", PaymentSheetConstantsKt.FLOW_CONTROLLER_DEFAULT_CALLBACK_IDENTIFIER, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheet {
    private final PaymentSheetLauncher paymentSheetLauncher;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final void presentWithIntentConfiguration(IntentConfiguration intentConfiguration) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        presentWithIntentConfiguration$default(this, intentConfiguration, null, 2, null);
    }

    public final void presentWithPaymentIntent(String paymentIntentClientSecret) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        presentWithPaymentIntent$default(this, paymentIntentClientSecret, null, 2, null);
    }

    public final void presentWithSetupIntent(String setupIntentClientSecret) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        presentWithSetupIntent$default(this, setupIntentClientSecret, null, 2, null);
    }

    public PaymentSheet(PaymentSheetLauncher paymentSheetLauncher) {
        Intrinsics.checkNotNullParameter(paymentSheetLauncher, "paymentSheetLauncher");
        this.paymentSheetLauncher = paymentSheetLauncher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(callback).build(activity)", imports = {}))
    public PaymentSheet(ComponentActivity activity, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(activity, callback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(callback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
    public PaymentSheet(ComponentActivity activity, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(activity, callback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback).build(activity)", imports = {}))
    public PaymentSheet(ComponentActivity activity, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(activity, paymentResultCallback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
    public PaymentSheet(ComponentActivity activity, CreateIntentCallback createIntentCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(activity, paymentResultCallback));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(callback).build(fragment)", imports = {}))
    public PaymentSheet(Fragment fragment, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(fragment, callback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(callback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
    public PaymentSheet(Fragment fragment, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(fragment, callback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
        Intrinsics.checkNotNullParameter(callback, "callback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback).build(fragment)", imports = {}))
    public PaymentSheet(Fragment fragment, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(fragment, paymentResultCallback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).build());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
    public PaymentSheet(Fragment fragment, CreateIntentCallback createIntentCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback paymentResultCallback) {
        this(new DefaultPaymentSheetLauncher(fragment, paymentResultCallback));
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        INSTANCE.setPaymentSheetCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0013H\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\r\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Builder;", "", "resultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;)V", "getResultCallback$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "callbacksBuilder", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;", "externalPaymentMethodConfirmHandler", "handler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "confirmCustomPaymentMethodCallback", "callback", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "analyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet;", "activity", "Landroidx/activity/ComponentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;", "initializeCallbacks", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private final PaymentElementCallbacks.Builder callbacksBuilder;
        private final PaymentSheetResultCallback resultCallback;

        public Builder(PaymentSheetResultCallback resultCallback) {
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            this.resultCallback = resultCallback;
            this.callbacksBuilder = new PaymentElementCallbacks.Builder();
        }

        /* renamed from: getResultCallback$paymentsheet_release, reason: from getter */
        public final PaymentSheetResultCallback getResultCallback() {
            return this.resultCallback;
        }

        public final Builder externalPaymentMethodConfirmHandler(ExternalPaymentMethodConfirmHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.callbacksBuilder.externalPaymentMethodConfirmHandler(handler);
            return this;
        }

        public final Builder confirmCustomPaymentMethodCallback(ConfirmCustomPaymentMethodCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacksBuilder.confirmCustomPaymentMethodCallback(callback);
            return this;
        }

        public final Builder createIntentCallback(CreateIntentCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacksBuilder.createIntentCallback(callback);
            return this;
        }

        public final Builder analyticEventCallback(AnalyticEventCallback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacksBuilder.analyticEventCallback(callback);
            return this;
        }

        public final Builder preparePaymentMethodHandler(PreparePaymentMethodHandler handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            this.callbacksBuilder.preparePaymentMethodHandler(handler);
            return this;
        }

        public final PaymentSheet build(ComponentActivity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            initializeCallbacks();
            return new PaymentSheet(new DefaultPaymentSheetLauncher(activity, this.resultCallback));
        }

        public final PaymentSheet build(Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            initializeCallbacks();
            return new PaymentSheet(new DefaultPaymentSheetLauncher(fragment, this.resultCallback));
        }

        public final PaymentSheet build(Composer composer, int i) {
            composer.startReplaceGroup(-1013366796);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013366796, i, -1, "com.stripe.android.paymentsheet.PaymentSheet.Builder.build (PaymentSheet.kt:363)");
            }
            PaymentSheet paymentSheetInternalRememberPaymentSheet = PaymentSheetComposeKt.internalRememberPaymentSheet(this.callbacksBuilder.build(), this.resultCallback, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return paymentSheetInternalRememberPaymentSheet;
        }

        private final void initializeCallbacks() {
            PaymentSheet.INSTANCE.setPaymentSheetCallbacks(this.callbacksBuilder.build());
        }
    }

    public static /* synthetic */ void presentWithPaymentIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithPaymentIntent(str, configuration);
    }

    public final void presentWithPaymentIntent(String paymentIntentClientSecret, Configuration configuration) {
        Intrinsics.checkNotNullParameter(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.paymentSheetLauncher.present(new PaymentElementLoader.InitializationMode.PaymentIntent(paymentIntentClientSecret), configuration);
    }

    public static /* synthetic */ void presentWithSetupIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithSetupIntent(str, configuration);
    }

    public final void presentWithSetupIntent(String setupIntentClientSecret, Configuration configuration) {
        Intrinsics.checkNotNullParameter(setupIntentClientSecret, "setupIntentClientSecret");
        this.paymentSheetLauncher.present(new PaymentElementLoader.InitializationMode.SetupIntent(setupIntentClientSecret), configuration);
    }

    public static /* synthetic */ void presentWithIntentConfiguration$default(PaymentSheet paymentSheet, IntentConfiguration intentConfiguration, Configuration configuration, int i, Object obj) {
        if ((i & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithIntentConfiguration(intentConfiguration, configuration);
    }

    public final void presentWithIntentConfiguration(IntentConfiguration intentConfiguration, Configuration configuration) {
        Intrinsics.checkNotNullParameter(intentConfiguration, "intentConfiguration");
        this.paymentSheetLauncher.present(new PaymentElementLoader.InitializationMode.DeferredIntent(intentConfiguration), configuration);
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0006&'()*+BM\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eBC\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fBM\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u0013J\u0006\u0010\u001f\u001a\u00020 J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "Landroid/os/Parcelable;", "mode", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "paymentMethodTypes", "", "", "paymentMethodConfigurationId", "onBehalfOf", "requireCvcRecollection", "", "intentBehavior", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;)V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "sharedPaymentTokenSessionWithMode", "sellerDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V", "getMode", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "getPaymentMethodTypes", "()Ljava/util/List;", "getPaymentMethodConfigurationId", "()Ljava/lang/String;", "getOnBehalfOf", "getRequireCvcRecollection$paymentsheet_release", "()Z", "getIntentBehavior$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Mode", "SetupFutureUse", "CaptureMethod", "SellerDetails", "IntentBehavior", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IntentConfiguration implements Parcelable {
        public static final String COMPLETE_WITHOUT_CONFIRMING_INTENT = "COMPLETE_WITHOUT_CONFIRMING_INTENT";
        private final IntentBehavior intentBehavior;
        private final Mode mode;
        private final String onBehalfOf;
        private final String paymentMethodConfigurationId;
        private final List<String> paymentMethodTypes;
        private final boolean requireCvcRecollection;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<IntentConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<IntentConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntentConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IntentConfiguration((Mode) parcel.readParcelable(IntentConfiguration.class.getClassLoader()), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (IntentBehavior) parcel.readParcelable(IntentConfiguration.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IntentConfiguration[] newArray(int i) {
                return new IntentConfiguration[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode mode) {
            this(mode, null, null, null, false, 30, null);
            Intrinsics.checkNotNullParameter(mode, "mode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode sharedPaymentTokenSessionWithMode, SellerDetails sellerDetails) {
            this(sharedPaymentTokenSessionWithMode, sellerDetails, (List) null, (String) null, (String) null, false, 60, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(sharedPaymentTokenSessionWithMode, "sharedPaymentTokenSessionWithMode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode sharedPaymentTokenSessionWithMode, SellerDetails sellerDetails, List<String> paymentMethodTypes) {
            this(sharedPaymentTokenSessionWithMode, sellerDetails, (List) paymentMethodTypes, (String) null, (String) null, false, 56, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(sharedPaymentTokenSessionWithMode, "sharedPaymentTokenSessionWithMode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode sharedPaymentTokenSessionWithMode, SellerDetails sellerDetails, List<String> paymentMethodTypes, String str) {
            this(sharedPaymentTokenSessionWithMode, sellerDetails, (List) paymentMethodTypes, str, (String) null, false, 48, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(sharedPaymentTokenSessionWithMode, "sharedPaymentTokenSessionWithMode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode sharedPaymentTokenSessionWithMode, SellerDetails sellerDetails, List<String> paymentMethodTypes, String str, String str2) {
            this(sharedPaymentTokenSessionWithMode, sellerDetails, (List) paymentMethodTypes, str, str2, false, 32, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(sharedPaymentTokenSessionWithMode, "sharedPaymentTokenSessionWithMode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes) {
            this(mode, paymentMethodTypes, null, null, false, 28, null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes, String str) {
            this(mode, paymentMethodTypes, str, null, false, 24, null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes, String str, String str2) {
            this(mode, paymentMethodTypes, str, str2, false, 16, null);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IntentConfiguration)) {
                return false;
            }
            IntentConfiguration intentConfiguration = (IntentConfiguration) obj;
            return Intrinsics.areEqual(this.mode, intentConfiguration.mode) && Intrinsics.areEqual(this.paymentMethodTypes, intentConfiguration.paymentMethodTypes) && Intrinsics.areEqual(this.paymentMethodConfigurationId, intentConfiguration.paymentMethodConfigurationId) && Intrinsics.areEqual(this.onBehalfOf, intentConfiguration.onBehalfOf) && this.requireCvcRecollection == intentConfiguration.requireCvcRecollection && Intrinsics.areEqual(this.intentBehavior, intentConfiguration.intentBehavior);
        }

        public int hashCode() {
            int iHashCode = ((this.mode.hashCode() * 31) + this.paymentMethodTypes.hashCode()) * 31;
            String str = this.paymentMethodConfigurationId;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.onBehalfOf;
            return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.requireCvcRecollection)) * 31) + this.intentBehavior.hashCode();
        }

        public String toString() {
            return "IntentConfiguration(mode=" + this.mode + ", paymentMethodTypes=" + this.paymentMethodTypes + ", paymentMethodConfigurationId=" + this.paymentMethodConfigurationId + ", onBehalfOf=" + this.onBehalfOf + ", requireCvcRecollection=" + this.requireCvcRecollection + ", intentBehavior=" + this.intentBehavior + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.mode, flags);
            dest.writeStringList(this.paymentMethodTypes);
            dest.writeString(this.paymentMethodConfigurationId);
            dest.writeString(this.onBehalfOf);
            dest.writeInt(this.requireCvcRecollection ? 1 : 0);
            dest.writeParcelable(this.intentBehavior, flags);
        }

        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes, String str, String str2, boolean z, IntentBehavior intentBehavior) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
            Intrinsics.checkNotNullParameter(intentBehavior, "intentBehavior");
            this.mode = mode;
            this.paymentMethodTypes = paymentMethodTypes;
            this.paymentMethodConfigurationId = str;
            this.onBehalfOf = str2;
            this.requireCvcRecollection = z;
            this.intentBehavior = intentBehavior;
        }

        public final Mode getMode() {
            return this.mode;
        }

        public /* synthetic */ IntentConfiguration(Mode mode, List list, String str, String str2, boolean z, IntentBehavior.Default r13, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, (List<String>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? IntentBehavior.Default.INSTANCE : r13);
        }

        public final List<String> getPaymentMethodTypes() {
            return this.paymentMethodTypes;
        }

        public final String getPaymentMethodConfigurationId() {
            return this.paymentMethodConfigurationId;
        }

        public final String getOnBehalfOf() {
            return this.onBehalfOf;
        }

        /* renamed from: getRequireCvcRecollection$paymentsheet_release, reason: from getter */
        public final boolean getRequireCvcRecollection() {
            return this.requireCvcRecollection;
        }

        /* renamed from: getIntentBehavior$paymentsheet_release, reason: from getter */
        public final IntentBehavior getIntentBehavior() {
            return this.intentBehavior;
        }

        public /* synthetic */ IntentConfiguration(Mode mode, List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, (List<String>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list), (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode mode, List<String> paymentMethodTypes, String str, String str2, boolean z) {
            this(mode, paymentMethodTypes, str, str2, z, IntentBehavior.Default.INSTANCE);
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        public /* synthetic */ IntentConfiguration(Mode mode, SellerDetails sellerDetails, List list, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(mode, sellerDetails, (List<String>) ((i & 4) != 0 ? CollectionsKt.emptyList() : list), (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public IntentConfiguration(Mode sharedPaymentTokenSessionWithMode, SellerDetails sellerDetails, List<String> paymentMethodTypes, String str, String str2, boolean z) {
            this(sharedPaymentTokenSessionWithMode, paymentMethodTypes, str, str2, z, new IntentBehavior.SharedPaymentToken(sellerDetails));
            Intrinsics.checkNotNullParameter(sharedPaymentTokenSessionWithMode, "sharedPaymentTokenSessionWithMode");
            Intrinsics.checkNotNullParameter(paymentMethodTypes, "paymentMethodTypes");
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X \u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX \u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "Landroid/os/Parcelable;", "<init>", "()V", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "Payment", "Setup", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Mode implements Parcelable {
            public static final int $stable = 0;

            public /* synthetic */ Mode(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getCaptureMethod$paymentsheet_release */
            public abstract CaptureMethod getCaptureMethod();

            /* renamed from: getSetupFutureUse$paymentsheet_release */
            public abstract SetupFutureUse getSetupFutureUse();

            private Mode() {
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001 B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rB/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "paymentMethodOptions", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;", "<init>", "(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;)V", "(JLjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;)V", "getAmount", "()J", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getPaymentMethodOptions$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "PaymentMethodOptions", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Payment extends Mode {
                private final long amount;
                private final CaptureMethod captureMethod;
                private final String currency;
                private final PaymentMethodOptions paymentMethodOptions;
                private final SetupFutureUse setupFutureUse;
                public static final Parcelable.Creator<Payment> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Payment> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Payment createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Payment(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : SetupFutureUse.valueOf(parcel.readString()), CaptureMethod.valueOf(parcel.readString()), parcel.readInt() != 0 ? PaymentMethodOptions.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Payment[] newArray(int i) {
                        return new Payment[i];
                    }
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public Payment(long j, String currency, PaymentMethodOptions paymentMethodOptions) {
                    this(j, currency, null, null, paymentMethodOptions, 12, null);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public Payment(long j, String currency, SetupFutureUse setupFutureUse, PaymentMethodOptions paymentMethodOptions) {
                    this(j, currency, setupFutureUse, null, paymentMethodOptions, 8, null);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Payment)) {
                        return false;
                    }
                    Payment payment = (Payment) obj;
                    return this.amount == payment.amount && Intrinsics.areEqual(this.currency, payment.currency) && this.setupFutureUse == payment.setupFutureUse && this.captureMethod == payment.captureMethod && Intrinsics.areEqual(this.paymentMethodOptions, payment.paymentMethodOptions);
                }

                public int hashCode() {
                    int iHashCode = ((Long.hashCode(this.amount) * 31) + this.currency.hashCode()) * 31;
                    SetupFutureUse setupFutureUse = this.setupFutureUse;
                    int iHashCode2 = (((iHashCode + (setupFutureUse == null ? 0 : setupFutureUse.hashCode())) * 31) + this.captureMethod.hashCode()) * 31;
                    PaymentMethodOptions paymentMethodOptions = this.paymentMethodOptions;
                    return iHashCode2 + (paymentMethodOptions != null ? paymentMethodOptions.hashCode() : 0);
                }

                public String toString() {
                    return "Payment(amount=" + this.amount + ", currency=" + this.currency + ", setupFutureUse=" + this.setupFutureUse + ", captureMethod=" + this.captureMethod + ", paymentMethodOptions=" + this.paymentMethodOptions + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeLong(this.amount);
                    dest.writeString(this.currency);
                    SetupFutureUse setupFutureUse = this.setupFutureUse;
                    if (setupFutureUse == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeString(setupFutureUse.name());
                    }
                    dest.writeString(this.captureMethod.name());
                    PaymentMethodOptions paymentMethodOptions = this.paymentMethodOptions;
                    if (paymentMethodOptions == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        paymentMethodOptions.writeToParcel(dest, flags);
                    }
                }

                public final long getAmount() {
                    return this.amount;
                }

                public final String getCurrency() {
                    return this.currency;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                /* renamed from: getSetupFutureUse$paymentsheet_release, reason: from getter */
                public SetupFutureUse getSetupFutureUse() {
                    return this.setupFutureUse;
                }

                public /* synthetic */ Payment(long j, String str, SetupFutureUse setupFutureUse, CaptureMethod captureMethod, PaymentMethodOptions paymentMethodOptions, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, str, (i & 4) != 0 ? null : setupFutureUse, (i & 8) != 0 ? CaptureMethod.Automatic : captureMethod, paymentMethodOptions);
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                /* renamed from: getCaptureMethod$paymentsheet_release, reason: from getter */
                public CaptureMethod getCaptureMethod() {
                    return this.captureMethod;
                }

                /* renamed from: getPaymentMethodOptions$paymentsheet_release, reason: from getter */
                public final PaymentMethodOptions getPaymentMethodOptions() {
                    return this.paymentMethodOptions;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Payment(long j, String currency, SetupFutureUse setupFutureUse, CaptureMethod captureMethod, PaymentMethodOptions paymentMethodOptions) {
                    super(null);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
                    this.amount = j;
                    this.currency = currency;
                    this.setupFutureUse = setupFutureUse;
                    this.captureMethod = captureMethod;
                    this.paymentMethodOptions = paymentMethodOptions;
                }

                public /* synthetic */ Payment(long j, String str, SetupFutureUse setupFutureUse, CaptureMethod captureMethod, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(j, str, (i & 4) != 0 ? null : setupFutureUse, (i & 8) != 0 ? CaptureMethod.Automatic : captureMethod);
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                public Payment(long j, String currency, SetupFutureUse setupFutureUse, CaptureMethod captureMethod) {
                    this(j, currency, setupFutureUse, captureMethod, null);
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    Intrinsics.checkNotNullParameter(captureMethod, "captureMethod");
                }

                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Payment$PaymentMethodOptions;", "Landroid/os/Parcelable;", "setupFutureUsageValues", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "<init>", "(Ljava/util/Map;)V", "getSetupFutureUsageValues$paymentsheet_release", "()Ljava/util/Map;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class PaymentMethodOptions implements Parcelable {
                    private final Map<PaymentMethod.Type, SetupFutureUse> setupFutureUsageValues;
                    public static final Parcelable.Creator<PaymentMethodOptions> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<PaymentMethodOptions> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PaymentMethodOptions createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            int i = parcel.readInt();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                            for (int i2 = 0; i2 != i; i2++) {
                                linkedHashMap.put(parcel.readParcelable(PaymentMethodOptions.class.getClassLoader()), SetupFutureUse.valueOf(parcel.readString()));
                            }
                            return new PaymentMethodOptions(linkedHashMap);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final PaymentMethodOptions[] newArray(int i) {
                            return new PaymentMethodOptions[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof PaymentMethodOptions) && Intrinsics.areEqual(this.setupFutureUsageValues, ((PaymentMethodOptions) obj).setupFutureUsageValues);
                    }

                    public int hashCode() {
                        return this.setupFutureUsageValues.hashCode();
                    }

                    public String toString() {
                        return "PaymentMethodOptions(setupFutureUsageValues=" + this.setupFutureUsageValues + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        Map<PaymentMethod.Type, SetupFutureUse> map = this.setupFutureUsageValues;
                        dest.writeInt(map.size());
                        for (Map.Entry<PaymentMethod.Type, SetupFutureUse> entry : map.entrySet()) {
                            dest.writeParcelable(entry.getKey(), flags);
                            dest.writeString(entry.getValue().name());
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public PaymentMethodOptions(Map<PaymentMethod.Type, ? extends SetupFutureUse> setupFutureUsageValues) {
                        Intrinsics.checkNotNullParameter(setupFutureUsageValues, "setupFutureUsageValues");
                        this.setupFutureUsageValues = setupFutureUsageValues;
                    }

                    public final Map<PaymentMethod.Type, SetupFutureUse> getSetupFutureUsageValues$paymentsheet_release() {
                        return this.setupFutureUsageValues;
                    }
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\r8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode$Setup;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Mode;", "currency", "", "setupFutureUse", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;)V", "getCurrency", "()Ljava/lang/String;", "getSetupFutureUse$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "captureMethod", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "getCaptureMethod$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Setup extends Mode {
                private final String currency;
                private final SetupFutureUse setupFutureUse;
                public static final Parcelable.Creator<Setup> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Setup> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Setup createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Setup(parcel.readString(), SetupFutureUse.valueOf(parcel.readString()));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Setup[] newArray(int i) {
                        return new Setup[i];
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Setup() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public Setup(String str) {
                    this(str, null, 2, 0 == true ? 1 : 0);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Setup)) {
                        return false;
                    }
                    Setup setup = (Setup) obj;
                    return Intrinsics.areEqual(this.currency, setup.currency) && this.setupFutureUse == setup.setupFutureUse;
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                /* renamed from: getCaptureMethod$paymentsheet_release */
                public CaptureMethod getCaptureMethod() {
                    return null;
                }

                public int hashCode() {
                    String str = this.currency;
                    return ((str == null ? 0 : str.hashCode()) * 31) + this.setupFutureUse.hashCode();
                }

                public String toString() {
                    return "Setup(currency=" + this.currency + ", setupFutureUse=" + this.setupFutureUse + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.currency);
                    dest.writeString(this.setupFutureUse.name());
                }

                public final String getCurrency() {
                    return this.currency;
                }

                public /* synthetic */ Setup(String str, SetupFutureUse setupFutureUse, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? SetupFutureUse.OffSession : setupFutureUse);
                }

                @Override // com.stripe.android.paymentsheet.PaymentSheet.IntentConfiguration.Mode
                /* renamed from: getSetupFutureUse$paymentsheet_release, reason: from getter */
                public SetupFutureUse getSetupFutureUse() {
                    return this.setupFutureUse;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Setup(String str, SetupFutureUse setupFutureUse) {
                    super(null);
                    Intrinsics.checkNotNullParameter(setupFutureUse, "setupFutureUse");
                    this.currency = str;
                    this.setupFutureUse = setupFutureUse;
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SetupFutureUse;", "", "<init>", "(Ljava/lang/String;I)V", "OnSession", "OffSession", "None", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SetupFutureUse {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SetupFutureUse[] $VALUES;
            public static final SetupFutureUse OnSession = new SetupFutureUse("OnSession", 0);
            public static final SetupFutureUse OffSession = new SetupFutureUse("OffSession", 1);
            public static final SetupFutureUse None = new SetupFutureUse("None", 2);

            private static final /* synthetic */ SetupFutureUse[] $values() {
                return new SetupFutureUse[]{OnSession, OffSession, None};
            }

            public static EnumEntries<SetupFutureUse> getEntries() {
                return $ENTRIES;
            }

            private SetupFutureUse(String str, int i) {
            }

            static {
                SetupFutureUse[] setupFutureUseArr$values = $values();
                $VALUES = setupFutureUseArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(setupFutureUseArr$values);
            }

            public static SetupFutureUse valueOf(String str) {
                return (SetupFutureUse) Enum.valueOf(SetupFutureUse.class, str);
            }

            public static SetupFutureUse[] values() {
                return (SetupFutureUse[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$CaptureMethod;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "AutomaticAsync", "Manual", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CaptureMethod {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CaptureMethod[] $VALUES;
            public static final CaptureMethod Automatic = new CaptureMethod("Automatic", 0);
            public static final CaptureMethod AutomaticAsync = new CaptureMethod("AutomaticAsync", 1);
            public static final CaptureMethod Manual = new CaptureMethod("Manual", 2);

            private static final /* synthetic */ CaptureMethod[] $values() {
                return new CaptureMethod[]{Automatic, AutomaticAsync, Manual};
            }

            public static EnumEntries<CaptureMethod> getEntries() {
                return $ENTRIES;
            }

            private CaptureMethod(String str, int i) {
            }

            static {
                CaptureMethod[] captureMethodArr$values = $values();
                $VALUES = captureMethodArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(captureMethodArr$values);
            }

            public static CaptureMethod valueOf(String str) {
                return (CaptureMethod) Enum.valueOf(CaptureMethod.class, str);
            }

            public static CaptureMethod[] values() {
                return (CaptureMethod[]) $VALUES.clone();
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;", "Landroid/os/Parcelable;", "networkId", "", "externalId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getNetworkId", "()Ljava/lang/String;", "getExternalId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SellerDetails implements Parcelable {
            private final String externalId;
            private final String networkId;
            public static final Parcelable.Creator<SellerDetails> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<SellerDetails> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SellerDetails createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SellerDetails(parcel.readString(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SellerDetails[] newArray(int i) {
                    return new SellerDetails[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SellerDetails)) {
                    return false;
                }
                SellerDetails sellerDetails = (SellerDetails) obj;
                return Intrinsics.areEqual(this.networkId, sellerDetails.networkId) && Intrinsics.areEqual(this.externalId, sellerDetails.externalId);
            }

            public int hashCode() {
                return (this.networkId.hashCode() * 31) + this.externalId.hashCode();
            }

            public String toString() {
                return "SellerDetails(networkId=" + this.networkId + ", externalId=" + this.externalId + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.networkId);
                dest.writeString(this.externalId);
            }

            public SellerDetails(String networkId, String externalId) {
                Intrinsics.checkNotNullParameter(networkId, "networkId");
                Intrinsics.checkNotNullParameter(externalId, "externalId");
                this.networkId = networkId;
                this.externalId = externalId;
            }

            public final String getNetworkId() {
                return this.networkId;
            }

            public final String getExternalId() {
                return this.externalId;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;", "Landroid/os/Parcelable;", Profile.DEFAULT_PROFILE_NAME, "SharedPaymentToken", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$Default;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface IntentBehavior extends Parcelable {

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$Default;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Default implements IntentBehavior {
                public static final Default INSTANCE = new Default();
                public static final Parcelable.Creator<Default> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Default> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Default createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Default.INSTANCE;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Default[] newArray(int i) {
                        return new Default[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Default)) {
                        return false;
                    }
                    return true;
                }

                public int hashCode() {
                    return -131175288;
                }

                public String toString() {
                    return Profile.DEFAULT_PROFILE_NAME;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeInt(1);
                }

                private Default() {
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior$SharedPaymentToken;", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$IntentBehavior;", "sellerDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;)V", "getSellerDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$SellerDetails;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SharedPaymentToken implements IntentBehavior {
                public static final int $stable = 0;
                public static final Parcelable.Creator<SharedPaymentToken> CREATOR = new Creator();
                private final SellerDetails sellerDetails;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SharedPaymentToken> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SharedPaymentToken createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new SharedPaymentToken(parcel.readInt() == 0 ? null : SellerDetails.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final SharedPaymentToken[] newArray(int i) {
                        return new SharedPaymentToken[i];
                    }
                }

                public static /* synthetic */ SharedPaymentToken copy$default(SharedPaymentToken sharedPaymentToken, SellerDetails sellerDetails, int i, Object obj) {
                    if ((i & 1) != 0) {
                        sellerDetails = sharedPaymentToken.sellerDetails;
                    }
                    return sharedPaymentToken.copy(sellerDetails);
                }

                /* renamed from: component1, reason: from getter */
                public final SellerDetails getSellerDetails() {
                    return this.sellerDetails;
                }

                public final SharedPaymentToken copy(SellerDetails sellerDetails) {
                    return new SharedPaymentToken(sellerDetails);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SharedPaymentToken) && Intrinsics.areEqual(this.sellerDetails, ((SharedPaymentToken) other).sellerDetails);
                }

                public int hashCode() {
                    SellerDetails sellerDetails = this.sellerDetails;
                    if (sellerDetails == null) {
                        return 0;
                    }
                    return sellerDetails.hashCode();
                }

                public String toString() {
                    return "SharedPaymentToken(sellerDetails=" + this.sellerDetails + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    SellerDetails sellerDetails = this.sellerDetails;
                    if (sellerDetails == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        sellerDetails.writeToParcel(dest, flags);
                    }
                }

                public SharedPaymentToken(SellerDetails sellerDetails) {
                    this.sellerDetails = sellerDetails;
                }

                public final SellerDetails getSellerDetails() {
                    return this.sellerDetails;
                }
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration$Companion;", "", "<init>", "()V", "COMPLETE_WITHOUT_CONFIRMING_INTENT", "", "getCOMPLETE_WITHOUT_CONFIRMING_INTENT$annotations", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getCOMPLETE_WITHOUT_CONFIRMING_INTENT$annotations() {
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "NEVER", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsDisplay {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TermsDisplay[] $VALUES;
        public static final TermsDisplay AUTOMATIC = new TermsDisplay("AUTOMATIC", 0);
        public static final TermsDisplay NEVER = new TermsDisplay("NEVER", 1);

        private static final /* synthetic */ TermsDisplay[] $values() {
            return new TermsDisplay[]{AUTOMATIC, NEVER};
        }

        public static EnumEntries<TermsDisplay> getEntries() {
            return $ENTRIES;
        }

        private TermsDisplay(String str, int i) {
        }

        static {
            TermsDisplay[] termsDisplayArr$values = $values();
            $VALUES = termsDisplayArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(termsDisplayArr$values);
        }

        public static TermsDisplay valueOf(String str) {
            return (TermsDisplay) Enum.valueOf(TermsDisplay.class, str);
        }

        public static TermsDisplay[] values() {
            return (TermsDisplay[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u008d\u00012\u00020\u0001:\u0004\u008c\u0001\u008d\u0001B¡\u0002\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0017\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0004\b-\u0010.B\u0091\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b-\u0010/J\r\u0010Y\u001a\u00020ZH\u0000¢\u0006\u0002\b[J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010b\u001a\u00020\u000fHÆ\u0003J\t\u0010c\u001a\u00020\u000fHÆ\u0003J\t\u0010d\u001a\u00020\u0012HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010f\u001a\u00020\u0015HÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\u000e\u0010h\u001a\u00020\u000fHÀ\u0003¢\u0006\u0002\biJ\u0014\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017HÀ\u0003¢\u0006\u0002\bkJ\u0014\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017HÀ\u0003¢\u0006\u0002\bmJ\u000e\u0010n\u001a\u00020\u001dHÀ\u0003¢\u0006\u0002\boJ\u000e\u0010p\u001a\u00020\u001fHÀ\u0003¢\u0006\u0002\bqJ\u0014\u0010r\u001a\b\u0012\u0004\u0012\u00020!0\u0017HÀ\u0003¢\u0006\u0002\bsJ\u000e\u0010t\u001a\u00020#HÀ\u0003¢\u0006\u0002\buJ\u000e\u0010v\u001a\u00020%HÀ\u0003¢\u0006\u0002\bwJ\u0010\u0010x\u001a\u0004\u0018\u00010'HÀ\u0003¢\u0006\u0002\byJ\u0010\u0010z\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0002\b{J\u001a\u0010|\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*HÀ\u0003¢\u0006\u0002\b}J¨\u0002\u0010~\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00172\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*HÀ\u0001¢\u0006\u0002\b\u007fJ\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u00020\u000f2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001HÖ\u0003J\u000b\u0010\u0085\u0001\u001a\u00030\u0081\u0001HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001J\u001c\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u0081\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010?R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010?R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010GR\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0014\u0010\u001e\u001a\u00020\u001fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010GR\u0014\u0010\"\u001a\u00020#X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0014\u0010$\u001a\u00020%X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0016\u0010&\u001a\u0004\u0018\u00010'X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0016\u0010(\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bV\u00101R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010X¨\u0006\u008e\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "Landroid/os/Parcelable;", "merchantDisplayName", "", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonLabel", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "externalPaymentMethods", "paymentMethodLayout", "Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "customPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "link", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "walletButtons", "Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "googlePlacesApiKey", "termsDisplay", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;Ljava/util/List;Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;Landroid/content/res/ColorStateList;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;ZZLcom/stripe/android/paymentsheet/PaymentSheet$Appearance;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;Ljava/util/List;)V", "getMerchantDisplayName", "()Ljava/lang/String;", "getCustomer", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "getGooglePay", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "getPrimaryButtonColor$annotations", "()V", "getPrimaryButtonColor", "()Landroid/content/res/ColorStateList;", "getDefaultBillingDetails", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getAllowsDelayedPaymentMethods", "()Z", "getAllowsPaymentMethodsRequiringShippingAddress", "getAppearance", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "getPrimaryButtonLabel", "getBillingDetailsCollectionConfiguration", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "getPreferredNetworks", "()Ljava/util/List;", "getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release", "getPaymentMethodOrder$paymentsheet_release", "getExternalPaymentMethods$paymentsheet_release", "getPaymentMethodLayout$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "getCardBrandAcceptance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "getCustomPaymentMethods$paymentsheet_release", "getLink$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "getWalletButtons$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "getShopPayConfiguration$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "getGooglePlacesApiKey$paymentsheet_release", "getTermsDisplay$paymentsheet_release", "()Ljava/util/Map;", InAppPurchaseConstants.METHOD_NEW_BUILDER, "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;", "newBuilder$paymentsheet_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component13$paymentsheet_release", "component14", "component14$paymentsheet_release", "component15", "component15$paymentsheet_release", "component16", "component16$paymentsheet_release", "component17", "component17$paymentsheet_release", "component18", "component18$paymentsheet_release", "component19", "component19$paymentsheet_release", "component20", "component20$paymentsheet_release", "component21", "component21$paymentsheet_release", "component22", "component22$paymentsheet_release", "component23", "component23$paymentsheet_release", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {
        private final boolean allowsDelayedPaymentMethods;
        private final boolean allowsPaymentMethodsRequiringShippingAddress;
        private final boolean allowsRemovalOfLastSavedPaymentMethod;
        private final Appearance appearance;
        private final BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
        private final CardBrandAcceptance cardBrandAcceptance;
        private final List<CustomPaymentMethod> customPaymentMethods;
        private final CustomerConfiguration customer;
        private final BillingDetails defaultBillingDetails;
        private final List<String> externalPaymentMethods;
        private final GooglePayConfiguration googlePay;
        private final String googlePlacesApiKey;
        private final LinkConfiguration link;
        private final String merchantDisplayName;
        private final PaymentMethodLayout paymentMethodLayout;
        private final List<String> paymentMethodOrder;
        private final List<CardBrand> preferredNetworks;
        private final ColorStateList primaryButtonColor;
        private final String primaryButtonLabel;
        private final AddressDetails shippingDetails;
        private final ShopPayConfiguration shopPayConfiguration;
        private final Map<PaymentMethod.Type, TermsDisplay> termsDisplay;
        private final WalletButtonsConfiguration walletButtons;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Configuration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                boolean z;
                int i;
                Parcel parcel2 = parcel;
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                String string = parcel2.readString();
                CustomerConfiguration customerConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : CustomerConfiguration.CREATOR.createFromParcel(parcel2);
                GooglePayConfiguration googlePayConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : GooglePayConfiguration.CREATOR.createFromParcel(parcel2);
                ColorStateList colorStateList = (ColorStateList) parcel2.readParcelable(Configuration.class.getClassLoader());
                BillingDetails billingDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel2);
                AddressDetails addressDetailsCreateFromParcel = parcel2.readInt() == 0 ? null : AddressDetails.CREATOR.createFromParcel(parcel2);
                boolean z2 = true;
                boolean z3 = false;
                if (parcel2.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                if (parcel2.readInt() != 0) {
                    i = 0;
                    z3 = z;
                } else {
                    i = 0;
                }
                Appearance appearanceCreateFromParcel = Appearance.CREATOR.createFromParcel(parcel2);
                String string2 = parcel2.readString();
                BillingDetailsCollectionConfiguration billingDetailsCollectionConfigurationCreateFromParcel = BillingDetailsCollectionConfiguration.CREATOR.createFromParcel(parcel2);
                int i2 = parcel2.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = i; i3 != i2; i3++) {
                    arrayList.add(CardBrand.valueOf(parcel2.readString()));
                }
                ArrayList arrayList2 = arrayList;
                boolean z4 = parcel2.readInt() != 0;
                ArrayList<String> arrayListCreateStringArrayList = parcel2.createStringArrayList();
                ArrayList<String> arrayListCreateStringArrayList2 = parcel2.createStringArrayList();
                PaymentMethodLayout paymentMethodLayoutValueOf = PaymentMethodLayout.valueOf(parcel2.readString());
                CardBrandAcceptance cardBrandAcceptance = (CardBrandAcceptance) parcel2.readParcelable(Configuration.class.getClassLoader());
                int i4 = parcel2.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int i5 = 0;
                while (i5 != i4) {
                    arrayList3.add(CustomPaymentMethod.CREATOR.createFromParcel(parcel2));
                    i5++;
                    i4 = i4;
                }
                ArrayList arrayList4 = arrayList3;
                LinkConfiguration linkConfigurationCreateFromParcel = LinkConfiguration.CREATOR.createFromParcel(parcel2);
                WalletButtonsConfiguration walletButtonsConfigurationCreateFromParcel = WalletButtonsConfiguration.CREATOR.createFromParcel(parcel2);
                ShopPayConfiguration shopPayConfigurationCreateFromParcel = parcel2.readInt() == 0 ? null : ShopPayConfiguration.CREATOR.createFromParcel(parcel2);
                String string3 = parcel2.readString();
                int i6 = parcel2.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                int i7 = 0;
                while (i7 != i6) {
                    linkedHashMap.put(parcel2.readParcelable(Configuration.class.getClassLoader()), TermsDisplay.valueOf(parcel2.readString()));
                    i7++;
                    parcel2 = parcel;
                    i6 = i6;
                }
                return new Configuration(string, customerConfigurationCreateFromParcel, googlePayConfigurationCreateFromParcel, colorStateList, billingDetailsCreateFromParcel, addressDetailsCreateFromParcel, z2, z3, appearanceCreateFromParcel, string2, billingDetailsCollectionConfigurationCreateFromParcel, arrayList2, z4, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, paymentMethodLayoutValueOf, cardBrandAcceptance, arrayList4, linkConfigurationCreateFromParcel, walletButtonsConfigurationCreateFromParcel, shopPayConfigurationCreateFromParcel, string3, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i) {
                return new Configuration[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName) {
            this(merchantDisplayName, null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration) {
            this(merchantDisplayName, customerConfiguration, null, null, null, null, false, false, null, null, null, null, 4092, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, null, null, null, false, false, null, null, null, null, 4088, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, null, null, false, false, null, null, null, null, 4080, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, null, false, false, null, null, null, null, 4064, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, false, false, null, null, null, null, 4032, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, false, null, null, null, null, Utf8.MASK_2BYTES, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, null, null, null, null, 3840, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, null, null, null, 3584, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, str, null, null, 3072, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, str, billingDetailsCollectionConfiguration, null, 2048, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        }

        public static /* synthetic */ Configuration copy$paymentsheet_release$default(Configuration configuration, String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str2, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, boolean z3, List list2, List list3, PaymentMethodLayout paymentMethodLayout, CardBrandAcceptance cardBrandAcceptance, List list4, LinkConfiguration linkConfiguration, WalletButtonsConfiguration walletButtonsConfiguration, ShopPayConfiguration shopPayConfiguration, String str3, Map map, int i, Object obj) {
            Map map2;
            String str4;
            String str5 = (i & 1) != 0 ? configuration.merchantDisplayName : str;
            CustomerConfiguration customerConfiguration2 = (i & 2) != 0 ? configuration.customer : customerConfiguration;
            GooglePayConfiguration googlePayConfiguration2 = (i & 4) != 0 ? configuration.googlePay : googlePayConfiguration;
            ColorStateList colorStateList2 = (i & 8) != 0 ? configuration.primaryButtonColor : colorStateList;
            BillingDetails billingDetails2 = (i & 16) != 0 ? configuration.defaultBillingDetails : billingDetails;
            AddressDetails addressDetails2 = (i & 32) != 0 ? configuration.shippingDetails : addressDetails;
            boolean z4 = (i & 64) != 0 ? configuration.allowsDelayedPaymentMethods : z;
            boolean z5 = (i & 128) != 0 ? configuration.allowsPaymentMethodsRequiringShippingAddress : z2;
            Appearance appearance2 = (i & 256) != 0 ? configuration.appearance : appearance;
            String str6 = (i & 512) != 0 ? configuration.primaryButtonLabel : str2;
            BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration2 = (i & 1024) != 0 ? configuration.billingDetailsCollectionConfiguration : billingDetailsCollectionConfiguration;
            List list5 = (i & 2048) != 0 ? configuration.preferredNetworks : list;
            boolean z6 = (i & 4096) != 0 ? configuration.allowsRemovalOfLastSavedPaymentMethod : z3;
            List list6 = (i & 8192) != 0 ? configuration.paymentMethodOrder : list2;
            String str7 = str5;
            List list7 = (i & 16384) != 0 ? configuration.externalPaymentMethods : list3;
            PaymentMethodLayout paymentMethodLayout2 = (i & 32768) != 0 ? configuration.paymentMethodLayout : paymentMethodLayout;
            CardBrandAcceptance cardBrandAcceptance2 = (i & 65536) != 0 ? configuration.cardBrandAcceptance : cardBrandAcceptance;
            List list8 = (i & 131072) != 0 ? configuration.customPaymentMethods : list4;
            LinkConfiguration linkConfiguration2 = (i & 262144) != 0 ? configuration.link : linkConfiguration;
            WalletButtonsConfiguration walletButtonsConfiguration2 = (i & 524288) != 0 ? configuration.walletButtons : walletButtonsConfiguration;
            ShopPayConfiguration shopPayConfiguration2 = (i & 1048576) != 0 ? configuration.shopPayConfiguration : shopPayConfiguration;
            String str8 = (i & 2097152) != 0 ? configuration.googlePlacesApiKey : str3;
            if ((i & 4194304) != 0) {
                str4 = str8;
                map2 = configuration.termsDisplay;
            } else {
                map2 = map;
                str4 = str8;
            }
            return configuration.copy$paymentsheet_release(str7, customerConfiguration2, googlePayConfiguration2, colorStateList2, billingDetails2, addressDetails2, z4, z5, appearance2, str6, billingDetailsCollectionConfiguration2, list5, z6, list6, list7, paymentMethodLayout2, cardBrandAcceptance2, list8, linkConfiguration2, walletButtonsConfiguration2, shopPayConfiguration2, str4, map2);
        }

        @Deprecated(message = "Use Appearance parameter to customize primary button color", replaceWith = @ReplaceWith(expression = "Appearance.colorsLight/colorsDark.primary or PrimaryButton.colorsLight/colorsDark.background", imports = {}))
        public static /* synthetic */ void getPrimaryButtonColor$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        /* renamed from: component10, reason: from getter */
        public final String getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        /* renamed from: component11, reason: from getter */
        public final BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final List<CardBrand> component12() {
            return this.preferredNetworks;
        }

        /* renamed from: component13$paymentsheet_release, reason: from getter */
        public final boolean getAllowsRemovalOfLastSavedPaymentMethod() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        public final List<String> component14$paymentsheet_release() {
            return this.paymentMethodOrder;
        }

        public final List<String> component15$paymentsheet_release() {
            return this.externalPaymentMethods;
        }

        /* renamed from: component16$paymentsheet_release, reason: from getter */
        public final PaymentMethodLayout getPaymentMethodLayout() {
            return this.paymentMethodLayout;
        }

        /* renamed from: component17$paymentsheet_release, reason: from getter */
        public final CardBrandAcceptance getCardBrandAcceptance() {
            return this.cardBrandAcceptance;
        }

        public final List<CustomPaymentMethod> component18$paymentsheet_release() {
            return this.customPaymentMethods;
        }

        /* renamed from: component19$paymentsheet_release, reason: from getter */
        public final LinkConfiguration getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final CustomerConfiguration getCustomer() {
            return this.customer;
        }

        /* renamed from: component20$paymentsheet_release, reason: from getter */
        public final WalletButtonsConfiguration getWalletButtons() {
            return this.walletButtons;
        }

        /* renamed from: component21$paymentsheet_release, reason: from getter */
        public final ShopPayConfiguration getShopPayConfiguration() {
            return this.shopPayConfiguration;
        }

        /* renamed from: component22$paymentsheet_release, reason: from getter */
        public final String getGooglePlacesApiKey() {
            return this.googlePlacesApiKey;
        }

        public final Map<PaymentMethod.Type, TermsDisplay> component23$paymentsheet_release() {
            return this.termsDisplay;
        }

        /* renamed from: component3, reason: from getter */
        public final GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        /* renamed from: component4, reason: from getter */
        public final ColorStateList getPrimaryButtonColor() {
            return this.primaryButtonColor;
        }

        /* renamed from: component5, reason: from getter */
        public final BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        /* renamed from: component6, reason: from getter */
        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        /* renamed from: component9, reason: from getter */
        public final Appearance getAppearance() {
            return this.appearance;
        }

        public final Configuration copy$paymentsheet_release(String merchantDisplayName, CustomerConfiguration customer, GooglePayConfiguration googlePay, ColorStateList primaryButtonColor, BillingDetails defaultBillingDetails, AddressDetails shippingDetails, boolean allowsDelayedPaymentMethods, boolean allowsPaymentMethodsRequiringShippingAddress, Appearance appearance, String primaryButtonLabel, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends CardBrand> preferredNetworks, boolean allowsRemovalOfLastSavedPaymentMethod, List<String> paymentMethodOrder, List<String> externalPaymentMethods, PaymentMethodLayout paymentMethodLayout, CardBrandAcceptance cardBrandAcceptance, List<CustomPaymentMethod> customPaymentMethods, LinkConfiguration link, WalletButtonsConfiguration walletButtons, ShopPayConfiguration shopPayConfiguration, String googlePlacesApiKey, Map<PaymentMethod.Type, ? extends TermsDisplay> termsDisplay) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(paymentMethodLayout, "paymentMethodLayout");
            Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(walletButtons, "walletButtons");
            Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
            return new Configuration(merchantDisplayName, customer, googlePay, primaryButtonColor, defaultBillingDetails, shippingDetails, allowsDelayedPaymentMethods, allowsPaymentMethodsRequiringShippingAddress, appearance, primaryButtonLabel, billingDetailsCollectionConfiguration, preferredNetworks, allowsRemovalOfLastSavedPaymentMethod, paymentMethodOrder, externalPaymentMethods, paymentMethodLayout, cardBrandAcceptance, customPaymentMethods, link, walletButtons, shopPayConfiguration, googlePlacesApiKey, termsDisplay);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return Intrinsics.areEqual(this.merchantDisplayName, configuration.merchantDisplayName) && Intrinsics.areEqual(this.customer, configuration.customer) && Intrinsics.areEqual(this.googlePay, configuration.googlePay) && Intrinsics.areEqual(this.primaryButtonColor, configuration.primaryButtonColor) && Intrinsics.areEqual(this.defaultBillingDetails, configuration.defaultBillingDetails) && Intrinsics.areEqual(this.shippingDetails, configuration.shippingDetails) && this.allowsDelayedPaymentMethods == configuration.allowsDelayedPaymentMethods && this.allowsPaymentMethodsRequiringShippingAddress == configuration.allowsPaymentMethodsRequiringShippingAddress && Intrinsics.areEqual(this.appearance, configuration.appearance) && Intrinsics.areEqual(this.primaryButtonLabel, configuration.primaryButtonLabel) && Intrinsics.areEqual(this.billingDetailsCollectionConfiguration, configuration.billingDetailsCollectionConfiguration) && Intrinsics.areEqual(this.preferredNetworks, configuration.preferredNetworks) && this.allowsRemovalOfLastSavedPaymentMethod == configuration.allowsRemovalOfLastSavedPaymentMethod && Intrinsics.areEqual(this.paymentMethodOrder, configuration.paymentMethodOrder) && Intrinsics.areEqual(this.externalPaymentMethods, configuration.externalPaymentMethods) && this.paymentMethodLayout == configuration.paymentMethodLayout && Intrinsics.areEqual(this.cardBrandAcceptance, configuration.cardBrandAcceptance) && Intrinsics.areEqual(this.customPaymentMethods, configuration.customPaymentMethods) && Intrinsics.areEqual(this.link, configuration.link) && Intrinsics.areEqual(this.walletButtons, configuration.walletButtons) && Intrinsics.areEqual(this.shopPayConfiguration, configuration.shopPayConfiguration) && Intrinsics.areEqual(this.googlePlacesApiKey, configuration.googlePlacesApiKey) && Intrinsics.areEqual(this.termsDisplay, configuration.termsDisplay);
        }

        public int hashCode() {
            int iHashCode = this.merchantDisplayName.hashCode() * 31;
            CustomerConfiguration customerConfiguration = this.customer;
            int iHashCode2 = (iHashCode + (customerConfiguration == null ? 0 : customerConfiguration.hashCode())) * 31;
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            int iHashCode3 = (iHashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
            ColorStateList colorStateList = this.primaryButtonColor;
            int iHashCode4 = (iHashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            BillingDetails billingDetails = this.defaultBillingDetails;
            int iHashCode5 = (iHashCode4 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
            AddressDetails addressDetails = this.shippingDetails;
            int iHashCode6 = (((((((iHashCode5 + (addressDetails == null ? 0 : addressDetails.hashCode())) * 31) + Boolean.hashCode(this.allowsDelayedPaymentMethods)) * 31) + Boolean.hashCode(this.allowsPaymentMethodsRequiringShippingAddress)) * 31) + this.appearance.hashCode()) * 31;
            String str = this.primaryButtonLabel;
            int iHashCode7 = (((((((((((((((((((((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + this.billingDetailsCollectionConfiguration.hashCode()) * 31) + this.preferredNetworks.hashCode()) * 31) + Boolean.hashCode(this.allowsRemovalOfLastSavedPaymentMethod)) * 31) + this.paymentMethodOrder.hashCode()) * 31) + this.externalPaymentMethods.hashCode()) * 31) + this.paymentMethodLayout.hashCode()) * 31) + this.cardBrandAcceptance.hashCode()) * 31) + this.customPaymentMethods.hashCode()) * 31) + this.link.hashCode()) * 31) + this.walletButtons.hashCode()) * 31;
            ShopPayConfiguration shopPayConfiguration = this.shopPayConfiguration;
            int iHashCode8 = (iHashCode7 + (shopPayConfiguration == null ? 0 : shopPayConfiguration.hashCode())) * 31;
            String str2 = this.googlePlacesApiKey;
            return ((iHashCode8 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.termsDisplay.hashCode();
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.merchantDisplayName + ", customer=" + this.customer + ", googlePay=" + this.googlePay + ", primaryButtonColor=" + this.primaryButtonColor + ", defaultBillingDetails=" + this.defaultBillingDetails + ", shippingDetails=" + this.shippingDetails + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", allowsPaymentMethodsRequiringShippingAddress=" + this.allowsPaymentMethodsRequiringShippingAddress + ", appearance=" + this.appearance + ", primaryButtonLabel=" + this.primaryButtonLabel + ", billingDetailsCollectionConfiguration=" + this.billingDetailsCollectionConfiguration + ", preferredNetworks=" + this.preferredNetworks + ", allowsRemovalOfLastSavedPaymentMethod=" + this.allowsRemovalOfLastSavedPaymentMethod + ", paymentMethodOrder=" + this.paymentMethodOrder + ", externalPaymentMethods=" + this.externalPaymentMethods + ", paymentMethodLayout=" + this.paymentMethodLayout + ", cardBrandAcceptance=" + this.cardBrandAcceptance + ", customPaymentMethods=" + this.customPaymentMethods + ", link=" + this.link + ", walletButtons=" + this.walletButtons + ", shopPayConfiguration=" + this.shopPayConfiguration + ", googlePlacesApiKey=" + this.googlePlacesApiKey + ", termsDisplay=" + this.termsDisplay + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.merchantDisplayName);
            CustomerConfiguration customerConfiguration = this.customer;
            if (customerConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                customerConfiguration.writeToParcel(dest, flags);
            }
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            if (googlePayConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                googlePayConfiguration.writeToParcel(dest, flags);
            }
            dest.writeParcelable(this.primaryButtonColor, flags);
            BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                billingDetails.writeToParcel(dest, flags);
            }
            AddressDetails addressDetails = this.shippingDetails;
            if (addressDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                addressDetails.writeToParcel(dest, flags);
            }
            dest.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
            dest.writeInt(this.allowsPaymentMethodsRequiringShippingAddress ? 1 : 0);
            this.appearance.writeToParcel(dest, flags);
            dest.writeString(this.primaryButtonLabel);
            this.billingDetailsCollectionConfiguration.writeToParcel(dest, flags);
            List<CardBrand> list = this.preferredNetworks;
            dest.writeInt(list.size());
            Iterator<CardBrand> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            dest.writeInt(this.allowsRemovalOfLastSavedPaymentMethod ? 1 : 0);
            dest.writeStringList(this.paymentMethodOrder);
            dest.writeStringList(this.externalPaymentMethods);
            dest.writeString(this.paymentMethodLayout.name());
            dest.writeParcelable(this.cardBrandAcceptance, flags);
            List<CustomPaymentMethod> list2 = this.customPaymentMethods;
            dest.writeInt(list2.size());
            Iterator<CustomPaymentMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
            this.link.writeToParcel(dest, flags);
            this.walletButtons.writeToParcel(dest, flags);
            ShopPayConfiguration shopPayConfiguration = this.shopPayConfiguration;
            if (shopPayConfiguration == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                shopPayConfiguration.writeToParcel(dest, flags);
            }
            dest.writeString(this.googlePlacesApiKey);
            Map<PaymentMethod.Type, TermsDisplay> map = this.termsDisplay;
            dest.writeInt(map.size());
            for (Map.Entry<PaymentMethod.Type, TermsDisplay> entry : map.entrySet()) {
                dest.writeParcelable(entry.getKey(), flags);
                dest.writeString(entry.getValue().name());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends CardBrand> preferredNetworks, boolean z3, List<String> paymentMethodOrder, List<String> externalPaymentMethods, PaymentMethodLayout paymentMethodLayout, CardBrandAcceptance cardBrandAcceptance, List<CustomPaymentMethod> customPaymentMethods, LinkConfiguration link, WalletButtonsConfiguration walletButtons, ShopPayConfiguration shopPayConfiguration, String str2, Map<PaymentMethod.Type, ? extends TermsDisplay> termsDisplay) {
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
            Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
            Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
            Intrinsics.checkNotNullParameter(paymentMethodLayout, "paymentMethodLayout");
            Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
            Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(walletButtons, "walletButtons");
            Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
            this.merchantDisplayName = merchantDisplayName;
            this.customer = customerConfiguration;
            this.googlePay = googlePayConfiguration;
            this.primaryButtonColor = colorStateList;
            this.defaultBillingDetails = billingDetails;
            this.shippingDetails = addressDetails;
            this.allowsDelayedPaymentMethods = z;
            this.allowsPaymentMethodsRequiringShippingAddress = z2;
            this.appearance = appearance;
            this.primaryButtonLabel = str;
            this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
            this.preferredNetworks = preferredNetworks;
            this.allowsRemovalOfLastSavedPaymentMethod = z3;
            this.paymentMethodOrder = paymentMethodOrder;
            this.externalPaymentMethods = externalPaymentMethods;
            this.paymentMethodLayout = paymentMethodLayout;
            this.cardBrandAcceptance = cardBrandAcceptance;
            this.customPaymentMethods = customPaymentMethods;
            this.link = link;
            this.walletButtons = walletButtons;
            this.shopPayConfiguration = shopPayConfiguration;
            this.googlePlacesApiKey = str2;
            this.termsDisplay = termsDisplay;
        }

        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str2, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, boolean z3, List list2, List list3, PaymentMethodLayout paymentMethodLayout, CardBrandAcceptance cardBrandAcceptance, List list4, LinkConfiguration linkConfiguration, WalletButtonsConfiguration walletButtonsConfiguration, ShopPayConfiguration shopPayConfiguration, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ConfigurationDefaults.INSTANCE.getCustomer() : customerConfiguration, (i & 4) != 0 ? ConfigurationDefaults.INSTANCE.getGooglePay() : googlePayConfiguration, (i & 8) != 0 ? ConfigurationDefaults.INSTANCE.getPrimaryButtonColor() : colorStateList, (i & 16) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetails() : billingDetails, (i & 32) != 0 ? ConfigurationDefaults.INSTANCE.getShippingDetails() : addressDetails, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? ConfigurationDefaults.INSTANCE.getAppearance() : appearance, (i & 512) != 0 ? ConfigurationDefaults.INSTANCE.getPrimaryButtonLabel() : str2, (i & 1024) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration() : billingDetailsCollectionConfiguration, (i & 2048) != 0 ? ConfigurationDefaults.INSTANCE.getPreferredNetworks() : list, (i & 4096) != 0 ? true : z3, (i & 8192) != 0 ? ConfigurationDefaults.INSTANCE.getPaymentMethodOrder() : list2, (i & 16384) != 0 ? ConfigurationDefaults.INSTANCE.getExternalPaymentMethods() : list3, (32768 & i) != 0 ? ConfigurationDefaults.INSTANCE.getPaymentMethodLayout() : paymentMethodLayout, (i & 65536) != 0 ? ConfigurationDefaults.INSTANCE.getCardBrandAcceptance() : cardBrandAcceptance, (i & 131072) != 0 ? ConfigurationDefaults.INSTANCE.getCustomPaymentMethods() : list4, (i & 262144) != 0 ? ConfigurationDefaults.INSTANCE.getLink() : linkConfiguration, (i & 524288) != 0 ? ConfigurationDefaults.INSTANCE.getWalletButtons() : walletButtonsConfiguration, (i & 1048576) != 0 ? ConfigurationDefaults.INSTANCE.getShopPayConfiguration() : shopPayConfiguration, (i & 2097152) != 0 ? ConfigurationDefaults.INSTANCE.getGooglePlacesApiKey() : str3, (i & 4194304) != 0 ? MapsKt.emptyMap() : map);
        }

        public final CustomerConfiguration getCustomer() {
            return this.customer;
        }

        public final GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        public final ColorStateList getPrimaryButtonColor() {
            return this.primaryButtonColor;
        }

        public final BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public final AddressDetails getShippingDetails() {
            return this.shippingDetails;
        }

        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        public final boolean getAllowsPaymentMethodsRequiringShippingAddress() {
            return this.allowsPaymentMethodsRequiringShippingAddress;
        }

        public final Appearance getAppearance() {
            return this.appearance;
        }

        public final String getPrimaryButtonLabel() {
            return this.primaryButtonLabel;
        }

        public final BillingDetailsCollectionConfiguration getBillingDetailsCollectionConfiguration() {
            return this.billingDetailsCollectionConfiguration;
        }

        public final List<CardBrand> getPreferredNetworks() {
            return this.preferredNetworks;
        }

        public final boolean getAllowsRemovalOfLastSavedPaymentMethod$paymentsheet_release() {
            return this.allowsRemovalOfLastSavedPaymentMethod;
        }

        public final List<String> getPaymentMethodOrder$paymentsheet_release() {
            return this.paymentMethodOrder;
        }

        public final List<String> getExternalPaymentMethods$paymentsheet_release() {
            return this.externalPaymentMethods;
        }

        public final PaymentMethodLayout getPaymentMethodLayout$paymentsheet_release() {
            return this.paymentMethodLayout;
        }

        public final CardBrandAcceptance getCardBrandAcceptance$paymentsheet_release() {
            return this.cardBrandAcceptance;
        }

        public final List<CustomPaymentMethod> getCustomPaymentMethods$paymentsheet_release() {
            return this.customPaymentMethods;
        }

        public final LinkConfiguration getLink$paymentsheet_release() {
            return this.link;
        }

        public final WalletButtonsConfiguration getWalletButtons$paymentsheet_release() {
            return this.walletButtons;
        }

        public final ShopPayConfiguration getShopPayConfiguration$paymentsheet_release() {
            return this.shopPayConfiguration;
        }

        public final String getGooglePlacesApiKey$paymentsheet_release() {
            return this.googlePlacesApiKey;
        }

        public final Map<PaymentMethod.Type, TermsDisplay> getTermsDisplay$paymentsheet_release() {
            return this.termsDisplay;
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str2, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? ConfigurationDefaults.INSTANCE.getCustomer() : customerConfiguration, (i & 4) != 0 ? ConfigurationDefaults.INSTANCE.getGooglePay() : googlePayConfiguration, (i & 8) != 0 ? ConfigurationDefaults.INSTANCE.getPrimaryButtonColor() : colorStateList, (i & 16) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetails() : billingDetails, (i & 32) != 0 ? ConfigurationDefaults.INSTANCE.getShippingDetails() : addressDetails, (i & 64) != 0 ? false : z, (i & 128) == 0 ? z2 : false, (i & 256) != 0 ? ConfigurationDefaults.INSTANCE.getAppearance() : appearance, (i & 512) != 0 ? ConfigurationDefaults.INSTANCE.getPrimaryButtonLabel() : str2, (i & 1024) != 0 ? ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration() : billingDetailsCollectionConfiguration, (i & 2048) != 0 ? ConfigurationDefaults.INSTANCE.getPreferredNetworks() : list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, AddressDetails addressDetails, boolean z, boolean z2, Appearance appearance, String str, BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, List<? extends CardBrand> preferredNetworks) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, addressDetails, z, z2, appearance, str, billingDetailsCollectionConfiguration, preferredNetworks, true, null, ConfigurationDefaults.INSTANCE.getExternalPaymentMethods(), null, null, ConfigurationDefaults.INSTANCE.getCustomPaymentMethods(), null, null, null, null, null, 8232960, null);
            Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
            Intrinsics.checkNotNullParameter(appearance, "appearance");
            Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
            Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0011H\u0007J\u0014\u0010\u001c\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020!J\u0016\u0010-\u001a\u00020\u00002\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0019H\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%H\u0007J\u0010\u0010&\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H\u0007J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0003H\u0007J\u001a\u0010)\u001a\u00020\u00002\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*J\u0006\u0010/\u001a\u000200R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Builder;", "", "merchantDisplayName", "", "<init>", "(Ljava/lang/String;)V", "customer", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "googlePay", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "primaryButtonColor", "Landroid/content/res/ColorStateList;", "defaultBillingDetails", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "allowsDelayedPaymentMethods", "", "allowsPaymentMethodsRequiringShippingAddress", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "primaryButtonLabel", "billingDetailsCollectionConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "preferredNetworks", "", "Lcom/stripe/android/model/CardBrand;", "allowsRemovalOfLastSavedPaymentMethod", "paymentMethodOrder", "externalPaymentMethods", "paymentMethodLayout", "Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "cardBrandAcceptance", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "link", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "walletButtons", "Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "shopPayConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "googlePlacesApiKey", "termsDisplay", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/paymentsheet/PaymentSheet$TermsDisplay;", "customPaymentMethods", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowsDelayedPaymentMethods;
            private boolean allowsPaymentMethodsRequiringShippingAddress;
            private boolean allowsRemovalOfLastSavedPaymentMethod;
            private Appearance appearance;
            private BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration;
            private CardBrandAcceptance cardBrandAcceptance;
            private List<CustomPaymentMethod> customPaymentMethods;
            private CustomerConfiguration customer;
            private BillingDetails defaultBillingDetails;
            private List<String> externalPaymentMethods;
            private GooglePayConfiguration googlePay;
            private String googlePlacesApiKey;
            private LinkConfiguration link;
            private String merchantDisplayName;
            private PaymentMethodLayout paymentMethodLayout;
            private List<String> paymentMethodOrder;
            private List<? extends CardBrand> preferredNetworks;
            private ColorStateList primaryButtonColor;
            private String primaryButtonLabel;
            private AddressDetails shippingDetails;
            private ShopPayConfiguration shopPayConfiguration;
            private Map<PaymentMethod.Type, ? extends TermsDisplay> termsDisplay;
            private WalletButtonsConfiguration walletButtons;

            public Builder(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.customer = ConfigurationDefaults.INSTANCE.getCustomer();
                this.googlePay = ConfigurationDefaults.INSTANCE.getGooglePay();
                this.primaryButtonColor = ConfigurationDefaults.INSTANCE.getPrimaryButtonColor();
                this.defaultBillingDetails = ConfigurationDefaults.INSTANCE.getBillingDetails();
                this.shippingDetails = ConfigurationDefaults.INSTANCE.getShippingDetails();
                this.appearance = ConfigurationDefaults.INSTANCE.getAppearance();
                this.primaryButtonLabel = ConfigurationDefaults.INSTANCE.getPrimaryButtonLabel();
                this.billingDetailsCollectionConfiguration = ConfigurationDefaults.INSTANCE.getBillingDetailsCollectionConfiguration();
                this.preferredNetworks = ConfigurationDefaults.INSTANCE.getPreferredNetworks();
                this.allowsRemovalOfLastSavedPaymentMethod = true;
                this.paymentMethodOrder = ConfigurationDefaults.INSTANCE.getPaymentMethodOrder();
                this.externalPaymentMethods = ConfigurationDefaults.INSTANCE.getExternalPaymentMethods();
                this.paymentMethodLayout = ConfigurationDefaults.INSTANCE.getPaymentMethodLayout();
                this.cardBrandAcceptance = ConfigurationDefaults.INSTANCE.getCardBrandAcceptance();
                this.link = ConfigurationDefaults.INSTANCE.getLink();
                this.walletButtons = ConfigurationDefaults.INSTANCE.getWalletButtons();
                this.shopPayConfiguration = ConfigurationDefaults.INSTANCE.getShopPayConfiguration();
                this.googlePlacesApiKey = ConfigurationDefaults.INSTANCE.getGooglePlacesApiKey();
                this.termsDisplay = MapsKt.emptyMap();
                this.customPaymentMethods = ConfigurationDefaults.INSTANCE.getCustomPaymentMethods();
            }

            public final Builder merchantDisplayName(String merchantDisplayName) {
                Intrinsics.checkNotNullParameter(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                return this;
            }

            public final Builder customer(CustomerConfiguration customer) {
                this.customer = customer;
                return this;
            }

            public final Builder googlePay(GooglePayConfiguration googlePay) {
                this.googlePay = googlePay;
                return this;
            }

            @Deprecated(message = "Use Appearance parameter to customize primary button color", replaceWith = @ReplaceWith(expression = "Appearance.colorsLight/colorsDark.primary or PrimaryButton.colorsLight/colorsDark.background", imports = {}))
            public final Builder primaryButtonColor(ColorStateList primaryButtonColor) {
                this.primaryButtonColor = primaryButtonColor;
                return this;
            }

            public final Builder defaultBillingDetails(BillingDetails defaultBillingDetails) {
                this.defaultBillingDetails = defaultBillingDetails;
                return this;
            }

            public final Builder shippingDetails(AddressDetails shippingDetails) {
                this.shippingDetails = shippingDetails;
                return this;
            }

            public final Builder allowsDelayedPaymentMethods(boolean allowsDelayedPaymentMethods) {
                this.allowsDelayedPaymentMethods = allowsDelayedPaymentMethods;
                return this;
            }

            public final Builder allowsPaymentMethodsRequiringShippingAddress(boolean allowsPaymentMethodsRequiringShippingAddress) {
                this.allowsPaymentMethodsRequiringShippingAddress = allowsPaymentMethodsRequiringShippingAddress;
                return this;
            }

            public final Builder appearance(Appearance appearance) {
                Intrinsics.checkNotNullParameter(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Builder primaryButtonLabel(String primaryButtonLabel) {
                Intrinsics.checkNotNullParameter(primaryButtonLabel, "primaryButtonLabel");
                this.primaryButtonLabel = primaryButtonLabel;
                return this;
            }

            public final Builder billingDetailsCollectionConfiguration(BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration) {
                Intrinsics.checkNotNullParameter(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
                this.billingDetailsCollectionConfiguration = billingDetailsCollectionConfiguration;
                return this;
            }

            public final Builder preferredNetworks(List<? extends CardBrand> preferredNetworks) {
                Intrinsics.checkNotNullParameter(preferredNetworks, "preferredNetworks");
                this.preferredNetworks = preferredNetworks;
                return this;
            }

            public final Builder allowsRemovalOfLastSavedPaymentMethod(boolean allowsRemovalOfLastSavedPaymentMethod) {
                this.allowsRemovalOfLastSavedPaymentMethod = allowsRemovalOfLastSavedPaymentMethod;
                return this;
            }

            public final Builder paymentMethodOrder(List<String> paymentMethodOrder) {
                Intrinsics.checkNotNullParameter(paymentMethodOrder, "paymentMethodOrder");
                this.paymentMethodOrder = paymentMethodOrder;
                return this;
            }

            public final Builder externalPaymentMethods(List<String> externalPaymentMethods) {
                Intrinsics.checkNotNullParameter(externalPaymentMethods, "externalPaymentMethods");
                this.externalPaymentMethods = externalPaymentMethods;
                return this;
            }

            public final Builder paymentMethodLayout(PaymentMethodLayout paymentMethodLayout) {
                Intrinsics.checkNotNullParameter(paymentMethodLayout, "paymentMethodLayout");
                this.paymentMethodLayout = paymentMethodLayout;
                return this;
            }

            public final Builder cardBrandAcceptance(CardBrandAcceptance cardBrandAcceptance) {
                Intrinsics.checkNotNullParameter(cardBrandAcceptance, "cardBrandAcceptance");
                this.cardBrandAcceptance = cardBrandAcceptance;
                return this;
            }

            public final Builder customPaymentMethods(List<CustomPaymentMethod> customPaymentMethods) {
                Intrinsics.checkNotNullParameter(customPaymentMethods, "customPaymentMethods");
                this.customPaymentMethods = customPaymentMethods;
                return this;
            }

            public final Builder link(LinkConfiguration link) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                return this;
            }

            public final Builder walletButtons(WalletButtonsConfiguration walletButtons) {
                Intrinsics.checkNotNullParameter(walletButtons, "walletButtons");
                this.walletButtons = walletButtons;
                return this;
            }

            public final Builder shopPayConfiguration(ShopPayConfiguration shopPayConfiguration) {
                Intrinsics.checkNotNullParameter(shopPayConfiguration, "shopPayConfiguration");
                this.shopPayConfiguration = shopPayConfiguration;
                return this;
            }

            public final Builder googlePlacesApiKey(String googlePlacesApiKey) {
                Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
                this.googlePlacesApiKey = googlePlacesApiKey;
                return this;
            }

            public final Builder termsDisplay(Map<PaymentMethod.Type, ? extends TermsDisplay> termsDisplay) {
                Intrinsics.checkNotNullParameter(termsDisplay, "termsDisplay");
                this.termsDisplay = termsDisplay;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.merchantDisplayName, this.customer, this.googlePay, this.primaryButtonColor, this.defaultBillingDetails, this.shippingDetails, this.allowsDelayedPaymentMethods, this.allowsPaymentMethodsRequiringShippingAddress, this.appearance, this.primaryButtonLabel, this.billingDetailsCollectionConfiguration, this.preferredNetworks, this.allowsRemovalOfLastSavedPaymentMethod, this.paymentMethodOrder, this.externalPaymentMethods, this.paymentMethodLayout, this.cardBrandAcceptance, this.customPaymentMethods, this.link, this.walletButtons, this.shopPayConfiguration, this.googlePlacesApiKey, this.termsDisplay);
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "context", "Landroid/content/Context;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: default, reason: not valid java name */
            public final Configuration m8222default(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new Configuration(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), null, null, null, null, null, false, false, null, null, null, null, 4094, null);
            }
        }

        public final Builder newBuilder$paymentsheet_release() {
            Builder builderWalletButtons = new Builder(this.merchantDisplayName).customer(this.customer).googlePay(this.googlePay).primaryButtonColor(this.primaryButtonColor).defaultBillingDetails(this.defaultBillingDetails).shippingDetails(this.shippingDetails).allowsDelayedPaymentMethods(this.allowsDelayedPaymentMethods).allowsPaymentMethodsRequiringShippingAddress(this.allowsPaymentMethodsRequiringShippingAddress).appearance(this.appearance).billingDetailsCollectionConfiguration(this.billingDetailsCollectionConfiguration).preferredNetworks(this.preferredNetworks).allowsRemovalOfLastSavedPaymentMethod(this.allowsRemovalOfLastSavedPaymentMethod).paymentMethodOrder(this.paymentMethodOrder).externalPaymentMethods(this.externalPaymentMethods).paymentMethodLayout(this.paymentMethodLayout).cardBrandAcceptance(this.cardBrandAcceptance).customPaymentMethods(this.customPaymentMethods).link(this.link).walletButtons(this.walletButtons);
            String str = this.primaryButtonLabel;
            if (str != null) {
                builderWalletButtons.primaryButtonLabel(str);
            }
            ShopPayConfiguration shopPayConfiguration = this.shopPayConfiguration;
            if (shopPayConfiguration != null) {
                builderWalletButtons.shopPayConfiguration(shopPayConfiguration);
            }
            return builderWalletButtons;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PaymentMethodLayout;", "", "<init>", "(Ljava/lang/String;I)V", "Horizontal", "Vertical", "Automatic", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentMethodLayout {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentMethodLayout[] $VALUES;
        public static final PaymentMethodLayout Horizontal = new PaymentMethodLayout("Horizontal", 0);
        public static final PaymentMethodLayout Vertical = new PaymentMethodLayout("Vertical", 1);
        public static final PaymentMethodLayout Automatic = new PaymentMethodLayout("Automatic", 2);

        private static final /* synthetic */ PaymentMethodLayout[] $values() {
            return new PaymentMethodLayout[]{Horizontal, Vertical, Automatic};
        }

        public static EnumEntries<PaymentMethodLayout> getEntries() {
            return $ENTRIES;
        }

        private PaymentMethodLayout(String str, int i) {
        }

        static {
            PaymentMethodLayout[] paymentMethodLayoutArr$values = $values();
            $VALUES = paymentMethodLayoutArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(paymentMethodLayoutArr$values);
        }

        public static PaymentMethodLayout valueOf(String str) {
            return (PaymentMethodLayout) Enum.valueOf(PaymentMethodLayout.class, str);
        }

        public static PaymentMethodLayout[] values() {
            return (PaymentMethodLayout[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002QRBw\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017B\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0018B;\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0019BO\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u001aJ\u000e\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u000201J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0006HÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\u000e\u00107\u001a\u00020\fHÀ\u0003¢\u0006\u0002\b8J\u000e\u00109\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b:J\u000e\u0010;\u001a\u00020\u0010HÀ\u0003¢\u0006\u0002\b<J\u000e\u0010=\u001a\u00020\u000eHÀ\u0003¢\u0006\u0002\b>J\u000e\u0010?\u001a\u00020\u0013HÀ\u0003¢\u0006\u0002\b@J\u000e\u0010A\u001a\u00020\u0015HÀ\u0003¢\u0006\u0002\bBJw\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0006\u0010D\u001a\u00020EJ\u0013\u0010F\u001a\u0002012\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020EHÖ\u0001J\t\u0010J\u001a\u00020KHÖ\u0001J\u0016\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020ER\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u0010X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0014\u0010\u0012\u001a\u00020\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010\u0014\u001a\u00020\u0015X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.¨\u0006S"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "Landroid/os/Parcelable;", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, PaymentSheetAppearanceKeys.SHAPES, "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", PaymentSheetAppearanceKeys.PRIMARY_BUTTON, "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "embeddedAppearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", PaymentSheetAppearanceKeys.FORM_INSETS, "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "sectionSpacing", "Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "textFieldInsets", "iconStyle", "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "verticalModeRowPadding", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;F)V", "()V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;)V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;)V", "getColorsLight", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "getColorsDark", "getShapes", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "getTypography", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "getPrimaryButton", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "getEmbeddedAppearance$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "getFormInsetValues$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "getSectionSpacing$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "getTextFieldInsets$paymentsheet_release", "getIconStyle$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "getVerticalModeRowPadding$paymentsheet_release", "()F", "getColors", "isDark", "", "component1", "component2", "component3", "component4", "component5", "component6", "component6$paymentsheet_release", "component7", "component7$paymentsheet_release", "component8", "component8$paymentsheet_release", "component9", "component9$paymentsheet_release", "component10", "component10$paymentsheet_release", "component11", "component11$paymentsheet_release", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Embedded", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Appearance implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Appearance> CREATOR = new Creator();
        private final Colors colorsDark;
        private final Colors colorsLight;
        private final Embedded embeddedAppearance;
        private final Insets formInsetValues;
        private final IconStyle iconStyle;
        private final PrimaryButton primaryButton;
        private final Spacing sectionSpacing;
        private final Shapes shapes;
        private final Insets textFieldInsets;
        private final Typography typography;
        private final float verticalModeRowPadding;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Appearance> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Appearance createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Appearance(Colors.CREATOR.createFromParcel(parcel), Colors.CREATOR.createFromParcel(parcel), Shapes.CREATOR.createFromParcel(parcel), Typography.CREATOR.createFromParcel(parcel), PrimaryButton.CREATOR.createFromParcel(parcel), Embedded.CREATOR.createFromParcel(parcel), Insets.CREATOR.createFromParcel(parcel), Spacing.CREATOR.createFromParcel(parcel), Insets.CREATOR.createFromParcel(parcel), IconStyle.valueOf(parcel.readString()), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Appearance[] newArray(int i) {
                return new Appearance[i];
            }
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embedded, Insets insets, Spacing spacing, Insets insets2, IconStyle iconStyle, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                colors = appearance.colorsLight;
            }
            if ((i & 2) != 0) {
                colors2 = appearance.colorsDark;
            }
            if ((i & 4) != 0) {
                shapes = appearance.shapes;
            }
            if ((i & 8) != 0) {
                typography = appearance.typography;
            }
            if ((i & 16) != 0) {
                primaryButton = appearance.primaryButton;
            }
            if ((i & 32) != 0) {
                embedded = appearance.embeddedAppearance;
            }
            if ((i & 64) != 0) {
                insets = appearance.formInsetValues;
            }
            if ((i & 128) != 0) {
                spacing = appearance.sectionSpacing;
            }
            if ((i & 256) != 0) {
                insets2 = appearance.textFieldInsets;
            }
            if ((i & 512) != 0) {
                iconStyle = appearance.iconStyle;
            }
            if ((i & 1024) != 0) {
                f = appearance.verticalModeRowPadding;
            }
            IconStyle iconStyle2 = iconStyle;
            float f2 = f;
            Spacing spacing2 = spacing;
            Insets insets3 = insets2;
            Embedded embedded2 = embedded;
            Insets insets4 = insets;
            PrimaryButton primaryButton2 = primaryButton;
            Shapes shapes2 = shapes;
            return appearance.copy(colors, colors2, shapes2, typography, primaryButton2, embedded2, insets4, spacing2, insets3, iconStyle2, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final Colors getColorsLight() {
            return this.colorsLight;
        }

        /* renamed from: component10$paymentsheet_release, reason: from getter */
        public final IconStyle getIconStyle() {
            return this.iconStyle;
        }

        /* renamed from: component11$paymentsheet_release, reason: from getter */
        public final float getVerticalModeRowPadding() {
            return this.verticalModeRowPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Colors getColorsDark() {
            return this.colorsDark;
        }

        /* renamed from: component3, reason: from getter */
        public final Shapes getShapes() {
            return this.shapes;
        }

        /* renamed from: component4, reason: from getter */
        public final Typography getTypography() {
            return this.typography;
        }

        /* renamed from: component5, reason: from getter */
        public final PrimaryButton getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component6$paymentsheet_release, reason: from getter */
        public final Embedded getEmbeddedAppearance() {
            return this.embeddedAppearance;
        }

        /* renamed from: component7$paymentsheet_release, reason: from getter */
        public final Insets getFormInsetValues() {
            return this.formInsetValues;
        }

        /* renamed from: component8$paymentsheet_release, reason: from getter */
        public final Spacing getSectionSpacing() {
            return this.sectionSpacing;
        }

        /* renamed from: component9$paymentsheet_release, reason: from getter */
        public final Insets getTextFieldInsets() {
            return this.textFieldInsets;
        }

        public final Appearance copy(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embeddedAppearance, Insets formInsetValues, Spacing sectionSpacing, Insets textFieldInsets, IconStyle iconStyle, float verticalModeRowPadding) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(embeddedAppearance, "embeddedAppearance");
            Intrinsics.checkNotNullParameter(formInsetValues, "formInsetValues");
            Intrinsics.checkNotNullParameter(sectionSpacing, "sectionSpacing");
            Intrinsics.checkNotNullParameter(textFieldInsets, "textFieldInsets");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            return new Appearance(colorsLight, colorsDark, shapes, typography, primaryButton, embeddedAppearance, formInsetValues, sectionSpacing, textFieldInsets, iconStyle, verticalModeRowPadding);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Appearance)) {
                return false;
            }
            Appearance appearance = (Appearance) other;
            return Intrinsics.areEqual(this.colorsLight, appearance.colorsLight) && Intrinsics.areEqual(this.colorsDark, appearance.colorsDark) && Intrinsics.areEqual(this.shapes, appearance.shapes) && Intrinsics.areEqual(this.typography, appearance.typography) && Intrinsics.areEqual(this.primaryButton, appearance.primaryButton) && Intrinsics.areEqual(this.embeddedAppearance, appearance.embeddedAppearance) && Intrinsics.areEqual(this.formInsetValues, appearance.formInsetValues) && Intrinsics.areEqual(this.sectionSpacing, appearance.sectionSpacing) && Intrinsics.areEqual(this.textFieldInsets, appearance.textFieldInsets) && this.iconStyle == appearance.iconStyle && Float.compare(this.verticalModeRowPadding, appearance.verticalModeRowPadding) == 0;
        }

        public int hashCode() {
            return (((((((((((((((((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.primaryButton.hashCode()) * 31) + this.embeddedAppearance.hashCode()) * 31) + this.formInsetValues.hashCode()) * 31) + this.sectionSpacing.hashCode()) * 31) + this.textFieldInsets.hashCode()) * 31) + this.iconStyle.hashCode()) * 31) + Float.hashCode(this.verticalModeRowPadding);
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shapes=" + this.shapes + ", typography=" + this.typography + ", primaryButton=" + this.primaryButton + ", embeddedAppearance=" + this.embeddedAppearance + ", formInsetValues=" + this.formInsetValues + ", sectionSpacing=" + this.sectionSpacing + ", textFieldInsets=" + this.textFieldInsets + ", iconStyle=" + this.iconStyle + ", verticalModeRowPadding=" + this.verticalModeRowPadding + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.colorsLight.writeToParcel(dest, flags);
            this.colorsDark.writeToParcel(dest, flags);
            this.shapes.writeToParcel(dest, flags);
            this.typography.writeToParcel(dest, flags);
            this.primaryButton.writeToParcel(dest, flags);
            this.embeddedAppearance.writeToParcel(dest, flags);
            this.formInsetValues.writeToParcel(dest, flags);
            this.sectionSpacing.writeToParcel(dest, flags);
            this.textFieldInsets.writeToParcel(dest, flags);
            dest.writeString(this.iconStyle.name());
            dest.writeFloat(this.verticalModeRowPadding);
        }

        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embeddedAppearance, Insets formInsetValues, Spacing sectionSpacing, Insets textFieldInsets, IconStyle iconStyle, float f) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(embeddedAppearance, "embeddedAppearance");
            Intrinsics.checkNotNullParameter(formInsetValues, "formInsetValues");
            Intrinsics.checkNotNullParameter(sectionSpacing, "sectionSpacing");
            Intrinsics.checkNotNullParameter(textFieldInsets, "textFieldInsets");
            Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shapes = shapes;
            this.typography = typography;
            this.primaryButton = primaryButton;
            this.embeddedAppearance = embeddedAppearance;
            this.formInsetValues = formInsetValues;
            this.sectionSpacing = sectionSpacing;
            this.textFieldInsets = textFieldInsets;
            this.iconStyle = iconStyle;
            this.verticalModeRowPadding = f;
        }

        public /* synthetic */ Appearance(Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embedded, Insets insets, Spacing spacing, Insets insets2, IconStyle iconStyle, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Colors.INSTANCE.getDefaultLight() : colors, (i & 2) != 0 ? Colors.INSTANCE.getDefaultDark() : colors2, (i & 4) != 0 ? Shapes.INSTANCE.getDefault() : shapes, (i & 8) != 0 ? Typography.INSTANCE.getDefault() : typography, (i & 16) != 0 ? new PrimaryButton(null, null, null, null, 15, null) : primaryButton, (i & 32) != 0 ? Embedded.INSTANCE.getDefault() : embedded, (i & 64) != 0 ? Insets.INSTANCE.getDefaultFormInsetValues$paymentsheet_release() : insets, (i & 128) != 0 ? Spacing.INSTANCE.getDefaultSectionSpacing() : spacing, (i & 256) != 0 ? Insets.INSTANCE.getDefaultTextFieldInsets$paymentsheet_release() : insets2, (i & 512) != 0 ? IconStyle.INSTANCE.getDefault() : iconStyle, (i & 1024) != 0 ? StripeThemeDefaults.INSTANCE.getVerticalModeRowPadding() : f);
        }

        public final Colors getColorsLight() {
            return this.colorsLight;
        }

        public final Colors getColorsDark() {
            return this.colorsDark;
        }

        public final Shapes getShapes() {
            return this.shapes;
        }

        public final Typography getTypography() {
            return this.typography;
        }

        public final PrimaryButton getPrimaryButton() {
            return this.primaryButton;
        }

        public final Embedded getEmbeddedAppearance$paymentsheet_release() {
            return this.embeddedAppearance;
        }

        public final Insets getFormInsetValues$paymentsheet_release() {
            return this.formInsetValues;
        }

        public final Spacing getSectionSpacing$paymentsheet_release() {
            return this.sectionSpacing;
        }

        public final Insets getTextFieldInsets$paymentsheet_release() {
            return this.textFieldInsets;
        }

        public final IconStyle getIconStyle$paymentsheet_release() {
            return this.iconStyle;
        }

        public final float getVerticalModeRowPadding$paymentsheet_release() {
            return this.verticalModeRowPadding;
        }

        public Appearance() {
            this(Colors.INSTANCE.getDefaultLight(), Colors.INSTANCE.getDefaultDark(), Shapes.INSTANCE.getDefault(), Typography.INSTANCE.getDefault(), new PrimaryButton(null, null, null, null, 15, null));
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Appearance(com.stripe.android.paymentsheet.PaymentSheet.Colors r8, com.stripe.android.paymentsheet.PaymentSheet.Colors r9, com.stripe.android.paymentsheet.PaymentSheet.Shapes r10, com.stripe.android.paymentsheet.PaymentSheet.Typography r11, com.stripe.android.paymentsheet.PaymentSheet.PrimaryButton r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            /*
                r7 = this;
                r14 = r13 & 1
                if (r14 == 0) goto La
                com.stripe.android.paymentsheet.PaymentSheet$Colors$Companion r8 = com.stripe.android.paymentsheet.PaymentSheet.Colors.INSTANCE
                com.stripe.android.paymentsheet.PaymentSheet$Colors r8 = r8.getDefaultLight()
            La:
                r14 = r13 & 2
                if (r14 == 0) goto L14
                com.stripe.android.paymentsheet.PaymentSheet$Colors$Companion r9 = com.stripe.android.paymentsheet.PaymentSheet.Colors.INSTANCE
                com.stripe.android.paymentsheet.PaymentSheet$Colors r9 = r9.getDefaultDark()
            L14:
                r14 = r13 & 4
                if (r14 == 0) goto L1e
                com.stripe.android.paymentsheet.PaymentSheet$Shapes$Companion r10 = com.stripe.android.paymentsheet.PaymentSheet.Shapes.INSTANCE
                com.stripe.android.paymentsheet.PaymentSheet$Shapes r10 = r10.getDefault()
            L1e:
                r14 = r13 & 8
                if (r14 == 0) goto L28
                com.stripe.android.paymentsheet.PaymentSheet$Typography$Companion r11 = com.stripe.android.paymentsheet.PaymentSheet.Typography.INSTANCE
                com.stripe.android.paymentsheet.PaymentSheet$Typography r11 = r11.getDefault()
            L28:
                r13 = r13 & 16
                if (r13 == 0) goto L3f
                com.stripe.android.paymentsheet.PaymentSheet$PrimaryButton r0 = new com.stripe.android.paymentsheet.PaymentSheet$PrimaryButton
                r5 = 15
                r6 = 0
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r14 = r0
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r9 = r7
                goto L45
            L3f:
                r14 = r12
                r13 = r11
                r11 = r9
                r12 = r10
                r9 = r7
                r10 = r8
            L45:
                r9.<init>(r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentSheet.Appearance.<init>(com.stripe.android.paymentsheet.PaymentSheet$Colors, com.stripe.android.paymentsheet.PaymentSheet$Colors, com.stripe.android.paymentsheet.PaymentSheet$Shapes, com.stripe.android.paymentsheet.PaymentSheet$Typography, com.stripe.android.paymentsheet.PaymentSheet$PrimaryButton, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            this(colorsLight, colorsDark, shapes, typography, primaryButton, Embedded.INSTANCE.getDefault(), null, 64, null);
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        }

        public /* synthetic */ Appearance(Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embedded, Insets insets, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Colors.INSTANCE.getDefaultLight() : colors, (i & 2) != 0 ? Colors.INSTANCE.getDefaultDark() : colors2, (i & 4) != 0 ? Shapes.INSTANCE.getDefault() : shapes, (i & 8) != 0 ? Typography.INSTANCE.getDefault() : typography, (i & 16) != 0 ? new PrimaryButton(null, null, null, null, 15, null) : primaryButton, (i & 32) != 0 ? Embedded.INSTANCE.getDefault() : embedded, (i & 64) != 0 ? Insets.INSTANCE.getDefaultFormInsetValues$paymentsheet_release() : insets);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton, Embedded embeddedAppearance, Insets formInsetValues) {
            this(colorsLight, colorsDark, shapes, typography, primaryButton, embeddedAppearance, formInsetValues, Spacing.INSTANCE.getDefaultSectionSpacing(), null, null, 0.0f, 1792, null);
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shapes, "shapes");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            Intrinsics.checkNotNullParameter(embeddedAppearance, "embeddedAppearance");
            Intrinsics.checkNotNullParameter(formInsetValues, "formInsetValues");
        }

        public final Colors getColors(boolean isDark) {
            return isDark ? this.colorsDark : this.colorsLight;
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB/\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "Landroid/os/Parcelable;", "style", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "paymentMethodIconMargins", "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "titleFont", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "subtitleFont", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;)V", "getStyle$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "getPaymentMethodIconMargins$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "getTitleFont$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "getSubtitleFont$paymentsheet_release", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "RowStyle", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Embedded implements Parcelable {
            public static final int $stable = 0;
            private final Insets paymentMethodIconMargins;
            private final RowStyle style;
            private final Typography.Font subtitleFont;
            private final Typography.Font titleFont;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final Parcelable.Creator<Embedded> CREATOR = new Creator();

            /* renamed from: default, reason: not valid java name */
            private static final Embedded f201default = new Embedded(RowStyle.FlatWithRadio.INSTANCE.getDefault());

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Embedded> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Embedded createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Embedded((RowStyle) parcel.readParcelable(Embedded.class.getClassLoader()), parcel.readInt() == 0 ? null : Insets.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Typography.Font.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Typography.Font.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Embedded[] newArray(int i) {
                    return new Embedded[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Embedded)) {
                    return false;
                }
                Embedded embedded = (Embedded) obj;
                return Intrinsics.areEqual(this.style, embedded.style) && Intrinsics.areEqual(this.paymentMethodIconMargins, embedded.paymentMethodIconMargins) && Intrinsics.areEqual(this.titleFont, embedded.titleFont) && Intrinsics.areEqual(this.subtitleFont, embedded.subtitleFont);
            }

            public int hashCode() {
                int iHashCode = this.style.hashCode() * 31;
                Insets insets = this.paymentMethodIconMargins;
                int iHashCode2 = (iHashCode + (insets == null ? 0 : insets.hashCode())) * 31;
                Typography.Font font = this.titleFont;
                int iHashCode3 = (iHashCode2 + (font == null ? 0 : font.hashCode())) * 31;
                Typography.Font font2 = this.subtitleFont;
                return iHashCode3 + (font2 != null ? font2.hashCode() : 0);
            }

            public String toString() {
                return "Embedded(style=" + this.style + ", paymentMethodIconMargins=" + this.paymentMethodIconMargins + ", titleFont=" + this.titleFont + ", subtitleFont=" + this.subtitleFont + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.style, flags);
                Insets insets = this.paymentMethodIconMargins;
                if (insets == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    insets.writeToParcel(dest, flags);
                }
                Typography.Font font = this.titleFont;
                if (font == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    font.writeToParcel(dest, flags);
                }
                Typography.Font font2 = this.subtitleFont;
                if (font2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    font2.writeToParcel(dest, flags);
                }
            }

            public Embedded(RowStyle style, Insets insets, Typography.Font font, Typography.Font font2) {
                Intrinsics.checkNotNullParameter(style, "style");
                this.style = style;
                this.paymentMethodIconMargins = insets;
                this.titleFont = font;
                this.subtitleFont = font2;
            }

            /* renamed from: getStyle$paymentsheet_release, reason: from getter */
            public final RowStyle getStyle() {
                return this.style;
            }

            /* renamed from: getPaymentMethodIconMargins$paymentsheet_release, reason: from getter */
            public final Insets getPaymentMethodIconMargins() {
                return this.paymentMethodIconMargins;
            }

            /* renamed from: getTitleFont$paymentsheet_release, reason: from getter */
            public final Typography.Font getTitleFont() {
                return this.titleFont;
            }

            /* renamed from: getSubtitleFont$paymentsheet_release, reason: from getter */
            public final Typography.Font getSubtitleFont() {
                return this.subtitleFont;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Embedded(RowStyle style) {
                this(style, null, null, null);
                Intrinsics.checkNotNullParameter(style, "style");
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final Embedded getDefault() {
                    return Embedded.f201default;
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H ¢\u0006\u0002\b\u0006J\r\u0010\u0007\u001a\u00020\u0005H ¢\u0006\u0002\b\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "Landroid/os/Parcelable;", "<init>", "()V", "hasSeparators", "", "hasSeparators$paymentsheet_release", "startSeparatorHasDefaultInset", "startSeparatorHasDefaultInset$paymentsheet_release", "FlatWithRadio", "FlatWithCheckmark", "FloatingButton", "FlatWithDisclosure", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static abstract class RowStyle implements Parcelable {
                public static final int $stable = 0;

                public /* synthetic */ RowStyle(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public abstract boolean hasSeparators$paymentsheet_release();

                public abstract boolean startSeparatorHasDefaultInset$paymentsheet_release();

                private RowStyle() {
                }

                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u0003234BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBc\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0013\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0018J\r\u0010%\u001a\u00020\u0007H\u0010¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\u0007H\u0010¢\u0006\u0002\b(J\u0015\u0010)\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u0007H\u0000¢\u0006\u0002\b+J\u0006\u0010,\u001a\u00020\u0013J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#¨\u00065"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "additionalVerticalInsetsDp", "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "<init>", "(FFFZZFFLcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;)V", "context", "Landroid/content/Context;", "separatorThicknessRes", "", "startSeparatorInsetRes", "endSeparatorInsetRes", "additionalVerticalInsetsRes", "horizontalInsetsRes", "(Landroid/content/Context;IIIZZIILcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;)V", "getSeparatorThicknessDp$paymentsheet_release", "()F", "getStartSeparatorInsetDp$paymentsheet_release", "getEndSeparatorInsetDp$paymentsheet_release", "getTopSeparatorEnabled$paymentsheet_release", "()Z", "getBottomSeparatorEnabled$paymentsheet_release", "getAdditionalVerticalInsetsDp$paymentsheet_release", "getHorizontalInsetsDp$paymentsheet_release", "getColorsLight$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;", "getColorsDark$paymentsheet_release", "hasSeparators", "hasSeparators$paymentsheet_release", "startSeparatorHasDefaultInset", "startSeparatorHasDefaultInset$paymentsheet_release", "getColors", "isDark", "getColors$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Colors", "Companion", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class FlatWithRadio extends RowStyle {
                    public static final int $stable = 0;
                    private final float additionalVerticalInsetsDp;
                    private final boolean bottomSeparatorEnabled;
                    private final Colors colorsDark;
                    private final Colors colorsLight;
                    private final float endSeparatorInsetDp;
                    private final float horizontalInsetsDp;
                    private final float separatorThicknessDp;
                    private final float startSeparatorInsetDp;
                    private final boolean topSeparatorEnabled;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<FlatWithRadio> CREATOR = new Creator();

                    /* renamed from: default, reason: not valid java name */
                    private static final FlatWithRadio f204default = new FlatWithRadio(StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp(), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8695getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8694getSelectedColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8696getUnselectedColor0d7_KjU())), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8695getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8694getSelectedColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8696getUnselectedColor0d7_KjU())));

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<FlatWithRadio> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithRadio createFromParcel(Parcel parcel) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            float f = parcel.readFloat();
                            float f2 = parcel.readFloat();
                            float f3 = parcel.readFloat();
                            boolean z2 = true;
                            if (parcel.readInt() != 0) {
                                z = true;
                            } else {
                                z = true;
                                z2 = false;
                            }
                            return new FlatWithRadio(f, f2, f3, z2, parcel.readInt() != 0 ? z : false, parcel.readFloat(), parcel.readFloat(), Colors.CREATOR.createFromParcel(parcel), Colors.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithRadio[] newArray(int i) {
                            return new FlatWithRadio[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof FlatWithRadio)) {
                            return false;
                        }
                        FlatWithRadio flatWithRadio = (FlatWithRadio) obj;
                        return Float.compare(this.separatorThicknessDp, flatWithRadio.separatorThicknessDp) == 0 && Float.compare(this.startSeparatorInsetDp, flatWithRadio.startSeparatorInsetDp) == 0 && Float.compare(this.endSeparatorInsetDp, flatWithRadio.endSeparatorInsetDp) == 0 && this.topSeparatorEnabled == flatWithRadio.topSeparatorEnabled && this.bottomSeparatorEnabled == flatWithRadio.bottomSeparatorEnabled && Float.compare(this.additionalVerticalInsetsDp, flatWithRadio.additionalVerticalInsetsDp) == 0 && Float.compare(this.horizontalInsetsDp, flatWithRadio.horizontalInsetsDp) == 0 && Intrinsics.areEqual(this.colorsLight, flatWithRadio.colorsLight) && Intrinsics.areEqual(this.colorsDark, flatWithRadio.colorsDark);
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean hasSeparators$paymentsheet_release() {
                        return true;
                    }

                    public int hashCode() {
                        return (((((((((((((((Float.hashCode(this.separatorThicknessDp) * 31) + Float.hashCode(this.startSeparatorInsetDp)) * 31) + Float.hashCode(this.endSeparatorInsetDp)) * 31) + Boolean.hashCode(this.topSeparatorEnabled)) * 31) + Boolean.hashCode(this.bottomSeparatorEnabled)) * 31) + Float.hashCode(this.additionalVerticalInsetsDp)) * 31) + Float.hashCode(this.horizontalInsetsDp)) * 31) + this.colorsLight.hashCode()) * 31) + this.colorsDark.hashCode();
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean startSeparatorHasDefaultInset$paymentsheet_release() {
                        return true;
                    }

                    public String toString() {
                        return "FlatWithRadio(separatorThicknessDp=" + this.separatorThicknessDp + ", startSeparatorInsetDp=" + this.startSeparatorInsetDp + ", endSeparatorInsetDp=" + this.endSeparatorInsetDp + ", topSeparatorEnabled=" + this.topSeparatorEnabled + ", bottomSeparatorEnabled=" + this.bottomSeparatorEnabled + ", additionalVerticalInsetsDp=" + this.additionalVerticalInsetsDp + ", horizontalInsetsDp=" + this.horizontalInsetsDp + ", colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeFloat(this.separatorThicknessDp);
                        dest.writeFloat(this.startSeparatorInsetDp);
                        dest.writeFloat(this.endSeparatorInsetDp);
                        dest.writeInt(this.topSeparatorEnabled ? 1 : 0);
                        dest.writeInt(this.bottomSeparatorEnabled ? 1 : 0);
                        dest.writeFloat(this.additionalVerticalInsetsDp);
                        dest.writeFloat(this.horizontalInsetsDp);
                        this.colorsLight.writeToParcel(dest, flags);
                        this.colorsDark.writeToParcel(dest, flags);
                    }

                    /* renamed from: getSeparatorThicknessDp$paymentsheet_release, reason: from getter */
                    public final float getSeparatorThicknessDp() {
                        return this.separatorThicknessDp;
                    }

                    /* renamed from: getStartSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getStartSeparatorInsetDp() {
                        return this.startSeparatorInsetDp;
                    }

                    /* renamed from: getEndSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getEndSeparatorInsetDp() {
                        return this.endSeparatorInsetDp;
                    }

                    /* renamed from: getTopSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getTopSeparatorEnabled() {
                        return this.topSeparatorEnabled;
                    }

                    /* renamed from: getBottomSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getBottomSeparatorEnabled() {
                        return this.bottomSeparatorEnabled;
                    }

                    /* renamed from: getAdditionalVerticalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getAdditionalVerticalInsetsDp() {
                        return this.additionalVerticalInsetsDp;
                    }

                    /* renamed from: getHorizontalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getHorizontalInsetsDp() {
                        return this.horizontalInsetsDp;
                    }

                    /* renamed from: getColorsLight$paymentsheet_release, reason: from getter */
                    public final Colors getColorsLight() {
                        return this.colorsLight;
                    }

                    /* renamed from: getColorsDark$paymentsheet_release, reason: from getter */
                    public final Colors getColorsDark() {
                        return this.colorsDark;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public FlatWithRadio(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, Colors colorsLight, Colors colorsDark) {
                        super(null);
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                        this.separatorThicknessDp = f;
                        this.startSeparatorInsetDp = f2;
                        this.endSeparatorInsetDp = f3;
                        this.topSeparatorEnabled = z;
                        this.bottomSeparatorEnabled = z2;
                        this.additionalVerticalInsetsDp = f4;
                        this.horizontalInsetsDp = f5;
                        this.colorsLight = colorsLight;
                        this.colorsDark = colorsDark;
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public FlatWithRadio(Context context, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, Colors colorsLight, Colors colorsDark) {
                        this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i3), z, z2, StripeThemeKt.getRawValueFromDimenResource(context, i4), StripeThemeKt.getRawValueFromDimenResource(context, i5), colorsLight, colorsDark);
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                    }

                    public final Colors getColors$paymentsheet_release(boolean isDark) {
                        return isDark ? this.colorsDark : this.colorsLight;
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "", PaymentSheetAppearanceKeys.SELECTED_COLOR, PaymentSheetAppearanceKeys.UNSELECTED_COLOR, "<init>", "(III)V", "getSeparatorColor$paymentsheet_release", "()I", "getSelectedColor$paymentsheet_release", "getUnselectedColor$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Colors implements Parcelable {
                        private final int selectedColor;
                        private final int separatorColor;
                        private final int unselectedColor;
                        public static final Parcelable.Creator<Colors> CREATOR = new Creator();
                        public static final int $stable = 8;

                        /* compiled from: PaymentSheet.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public static final class Creator implements Parcelable.Creator<Colors> {
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors createFromParcel(Parcel parcel) {
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return new Colors(parcel.readInt(), parcel.readInt(), parcel.readInt());
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors[] newArray(int i) {
                                return new Colors[i];
                            }
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Colors)) {
                                return false;
                            }
                            Colors colors = (Colors) obj;
                            return this.separatorColor == colors.separatorColor && this.selectedColor == colors.selectedColor && this.unselectedColor == colors.unselectedColor;
                        }

                        public int hashCode() {
                            return (((this.separatorColor * 31) + this.selectedColor) * 31) + this.unselectedColor;
                        }

                        public String toString() {
                            return "Colors(separatorColor=" + this.separatorColor + ", selectedColor=" + this.selectedColor + ", unselectedColor=" + this.unselectedColor + ")";
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel dest, int flags) {
                            Intrinsics.checkNotNullParameter(dest, "dest");
                            dest.writeInt(this.separatorColor);
                            dest.writeInt(this.selectedColor);
                            dest.writeInt(this.unselectedColor);
                        }

                        public Colors(int i, int i2, int i3) {
                            this.separatorColor = i;
                            this.selectedColor = i2;
                            this.unselectedColor = i3;
                        }

                        /* renamed from: getSeparatorColor$paymentsheet_release, reason: from getter */
                        public final int getSeparatorColor() {
                            return this.separatorColor;
                        }

                        /* renamed from: getSelectedColor$paymentsheet_release, reason: from getter */
                        public final int getSelectedColor() {
                            return this.selectedColor;
                        }

                        /* renamed from: getUnselectedColor$paymentsheet_release, reason: from getter */
                        public final int getUnselectedColor() {
                            return this.unselectedColor;
                        }
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final FlatWithRadio getDefault() {
                            return FlatWithRadio.f204default;
                        }
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Builder;", "", "<init>", "()V", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "additionalVerticalInsetsDp", "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "thickness", PaymentSheetAppearanceKeys.CHECKMARK_INSET, ViewProps.ENABLED, "insets", PaymentSheetAppearanceKeys.COLORS, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithRadio;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Builder {
                        public static final int $stable = 8;
                        private float separatorThicknessDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness();
                        private float startSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private float endSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private boolean topSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled();
                        private boolean bottomSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled();
                        private float additionalVerticalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp();
                        private float horizontalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp();
                        private Colors colorsLight = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8695getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8694getSelectedColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsLight().m8696getUnselectedColor0d7_KjU()));
                        private Colors colorsDark = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8695getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8694getSelectedColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getRadioColorsDark().m8696getUnselectedColor0d7_KjU()));

                        public final Builder separatorThicknessDp(float thickness) {
                            this.separatorThicknessDp = thickness;
                            return this;
                        }

                        public final Builder startSeparatorInsetDp(float inset) {
                            this.startSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder endSeparatorInsetDp(float inset) {
                            this.endSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder topSeparatorEnabled(boolean enabled) {
                            this.topSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder bottomSeparatorEnabled(boolean enabled) {
                            this.bottomSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder additionalVerticalInsetsDp(float insets) {
                            this.additionalVerticalInsetsDp = insets;
                            return this;
                        }

                        public final Builder horizontalInsetsDp(float insets) {
                            this.horizontalInsetsDp = insets;
                            return this;
                        }

                        public final Builder colorsLight(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsLight = colors;
                            return this;
                        }

                        public final Builder colorsDark(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsDark = colors;
                            return this;
                        }

                        public final FlatWithRadio build() {
                            return new FlatWithRadio(this.separatorThicknessDp, this.startSeparatorInsetDp, this.endSeparatorInsetDp, this.topSeparatorEnabled, this.bottomSeparatorEnabled, this.additionalVerticalInsetsDp, this.horizontalInsetsDp, this.colorsLight, this.colorsDark);
                        }
                    }
                }

                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u0003567BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Bm\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u001aJ\r\u0010(\u001a\u00020\u0007H\u0010¢\u0006\u0002\b)J\r\u0010*\u001a\u00020\u0007H\u0010¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u0014J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0014\u0010\t\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0014\u0010\f\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u000e\u001a\u00020\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&¨\u00068"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "checkmarkInsetDp", "additionalVerticalInsetsDp", "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "<init>", "(FFFZZFFFLcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;)V", "context", "Landroid/content/Context;", "separatorThicknessRes", "", "startSeparatorInsetRes", "endSeparatorInsetRes", "checkmarkInsetRes", "additionalVerticalInsetsRes", "horizontalInsetsRes", "(Landroid/content/Context;IIIZZIIILcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;)V", "getSeparatorThicknessDp$paymentsheet_release", "()F", "getStartSeparatorInsetDp$paymentsheet_release", "getEndSeparatorInsetDp$paymentsheet_release", "getTopSeparatorEnabled$paymentsheet_release", "()Z", "getBottomSeparatorEnabled$paymentsheet_release", "getCheckmarkInsetDp$paymentsheet_release", "getAdditionalVerticalInsetsDp$paymentsheet_release", "getHorizontalInsetsDp$paymentsheet_release", "getColorsLight$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;", "getColorsDark$paymentsheet_release", "hasSeparators", "hasSeparators$paymentsheet_release", "startSeparatorHasDefaultInset", "startSeparatorHasDefaultInset$paymentsheet_release", "getColors", "isDark", "getColors$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Colors", "Companion", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class FlatWithCheckmark extends RowStyle {
                    public static final int $stable = 0;
                    private final float additionalVerticalInsetsDp;
                    private final boolean bottomSeparatorEnabled;
                    private final float checkmarkInsetDp;
                    private final Colors colorsDark;
                    private final Colors colorsLight;
                    private final float endSeparatorInsetDp;
                    private final float horizontalInsetsDp;
                    private final float separatorThicknessDp;
                    private final float startSeparatorInsetDp;
                    private final boolean topSeparatorEnabled;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<FlatWithCheckmark> CREATOR = new Creator();

                    /* renamed from: default, reason: not valid java name */
                    private static final FlatWithCheckmark f202default = new FlatWithCheckmark(StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getCheckmarkInsetDp(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp(), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsLight().m8682getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsLight().m8681getCheckmarkColor0d7_KjU())), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsDark().m8682getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsDark().m8681getCheckmarkColor0d7_KjU())));

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<FlatWithCheckmark> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithCheckmark createFromParcel(Parcel parcel) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            float f = parcel.readFloat();
                            float f2 = parcel.readFloat();
                            float f3 = parcel.readFloat();
                            boolean z2 = true;
                            if (parcel.readInt() != 0) {
                                z = true;
                            } else {
                                z = true;
                                z2 = false;
                            }
                            return new FlatWithCheckmark(f, f2, f3, z2, parcel.readInt() != 0 ? z : false, parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), Colors.CREATOR.createFromParcel(parcel), Colors.CREATOR.createFromParcel(parcel));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithCheckmark[] newArray(int i) {
                            return new FlatWithCheckmark[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof FlatWithCheckmark)) {
                            return false;
                        }
                        FlatWithCheckmark flatWithCheckmark = (FlatWithCheckmark) obj;
                        return Float.compare(this.separatorThicknessDp, flatWithCheckmark.separatorThicknessDp) == 0 && Float.compare(this.startSeparatorInsetDp, flatWithCheckmark.startSeparatorInsetDp) == 0 && Float.compare(this.endSeparatorInsetDp, flatWithCheckmark.endSeparatorInsetDp) == 0 && this.topSeparatorEnabled == flatWithCheckmark.topSeparatorEnabled && this.bottomSeparatorEnabled == flatWithCheckmark.bottomSeparatorEnabled && Float.compare(this.checkmarkInsetDp, flatWithCheckmark.checkmarkInsetDp) == 0 && Float.compare(this.additionalVerticalInsetsDp, flatWithCheckmark.additionalVerticalInsetsDp) == 0 && Float.compare(this.horizontalInsetsDp, flatWithCheckmark.horizontalInsetsDp) == 0 && Intrinsics.areEqual(this.colorsLight, flatWithCheckmark.colorsLight) && Intrinsics.areEqual(this.colorsDark, flatWithCheckmark.colorsDark);
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean hasSeparators$paymentsheet_release() {
                        return true;
                    }

                    public int hashCode() {
                        return (((((((((((((((((Float.hashCode(this.separatorThicknessDp) * 31) + Float.hashCode(this.startSeparatorInsetDp)) * 31) + Float.hashCode(this.endSeparatorInsetDp)) * 31) + Boolean.hashCode(this.topSeparatorEnabled)) * 31) + Boolean.hashCode(this.bottomSeparatorEnabled)) * 31) + Float.hashCode(this.checkmarkInsetDp)) * 31) + Float.hashCode(this.additionalVerticalInsetsDp)) * 31) + Float.hashCode(this.horizontalInsetsDp)) * 31) + this.colorsLight.hashCode()) * 31) + this.colorsDark.hashCode();
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean startSeparatorHasDefaultInset$paymentsheet_release() {
                        return false;
                    }

                    public String toString() {
                        return "FlatWithCheckmark(separatorThicknessDp=" + this.separatorThicknessDp + ", startSeparatorInsetDp=" + this.startSeparatorInsetDp + ", endSeparatorInsetDp=" + this.endSeparatorInsetDp + ", topSeparatorEnabled=" + this.topSeparatorEnabled + ", bottomSeparatorEnabled=" + this.bottomSeparatorEnabled + ", checkmarkInsetDp=" + this.checkmarkInsetDp + ", additionalVerticalInsetsDp=" + this.additionalVerticalInsetsDp + ", horizontalInsetsDp=" + this.horizontalInsetsDp + ", colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeFloat(this.separatorThicknessDp);
                        dest.writeFloat(this.startSeparatorInsetDp);
                        dest.writeFloat(this.endSeparatorInsetDp);
                        dest.writeInt(this.topSeparatorEnabled ? 1 : 0);
                        dest.writeInt(this.bottomSeparatorEnabled ? 1 : 0);
                        dest.writeFloat(this.checkmarkInsetDp);
                        dest.writeFloat(this.additionalVerticalInsetsDp);
                        dest.writeFloat(this.horizontalInsetsDp);
                        this.colorsLight.writeToParcel(dest, flags);
                        this.colorsDark.writeToParcel(dest, flags);
                    }

                    /* renamed from: getSeparatorThicknessDp$paymentsheet_release, reason: from getter */
                    public final float getSeparatorThicknessDp() {
                        return this.separatorThicknessDp;
                    }

                    /* renamed from: getStartSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getStartSeparatorInsetDp() {
                        return this.startSeparatorInsetDp;
                    }

                    /* renamed from: getEndSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getEndSeparatorInsetDp() {
                        return this.endSeparatorInsetDp;
                    }

                    /* renamed from: getTopSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getTopSeparatorEnabled() {
                        return this.topSeparatorEnabled;
                    }

                    /* renamed from: getBottomSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getBottomSeparatorEnabled() {
                        return this.bottomSeparatorEnabled;
                    }

                    /* renamed from: getCheckmarkInsetDp$paymentsheet_release, reason: from getter */
                    public final float getCheckmarkInsetDp() {
                        return this.checkmarkInsetDp;
                    }

                    /* renamed from: getAdditionalVerticalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getAdditionalVerticalInsetsDp() {
                        return this.additionalVerticalInsetsDp;
                    }

                    /* renamed from: getHorizontalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getHorizontalInsetsDp() {
                        return this.horizontalInsetsDp;
                    }

                    /* renamed from: getColorsLight$paymentsheet_release, reason: from getter */
                    public final Colors getColorsLight() {
                        return this.colorsLight;
                    }

                    /* renamed from: getColorsDark$paymentsheet_release, reason: from getter */
                    public final Colors getColorsDark() {
                        return this.colorsDark;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public FlatWithCheckmark(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5, float f6, Colors colorsLight, Colors colorsDark) {
                        super(null);
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                        this.separatorThicknessDp = f;
                        this.startSeparatorInsetDp = f2;
                        this.endSeparatorInsetDp = f3;
                        this.topSeparatorEnabled = z;
                        this.bottomSeparatorEnabled = z2;
                        this.checkmarkInsetDp = f4;
                        this.additionalVerticalInsetsDp = f5;
                        this.horizontalInsetsDp = f6;
                        this.colorsLight = colorsLight;
                        this.colorsDark = colorsDark;
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public FlatWithCheckmark(Context context, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, int i6, Colors colorsLight, Colors colorsDark) {
                        this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i3), z, z2, StripeThemeKt.getRawValueFromDimenResource(context, i4), StripeThemeKt.getRawValueFromDimenResource(context, i5), StripeThemeKt.getRawValueFromDimenResource(context, i6), colorsLight, colorsDark);
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "", "checkmarkColor", "<init>", "(II)V", "getSeparatorColor$paymentsheet_release", "()I", "getCheckmarkColor$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Colors implements Parcelable {
                        private final int checkmarkColor;
                        private final int separatorColor;
                        public static final Parcelable.Creator<Colors> CREATOR = new Creator();
                        public static final int $stable = 8;

                        /* compiled from: PaymentSheet.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public static final class Creator implements Parcelable.Creator<Colors> {
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors createFromParcel(Parcel parcel) {
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return new Colors(parcel.readInt(), parcel.readInt());
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors[] newArray(int i) {
                                return new Colors[i];
                            }
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Colors)) {
                                return false;
                            }
                            Colors colors = (Colors) obj;
                            return this.separatorColor == colors.separatorColor && this.checkmarkColor == colors.checkmarkColor;
                        }

                        public int hashCode() {
                            return (this.separatorColor * 31) + this.checkmarkColor;
                        }

                        public String toString() {
                            return "Colors(separatorColor=" + this.separatorColor + ", checkmarkColor=" + this.checkmarkColor + ")";
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel dest, int flags) {
                            Intrinsics.checkNotNullParameter(dest, "dest");
                            dest.writeInt(this.separatorColor);
                            dest.writeInt(this.checkmarkColor);
                        }

                        public Colors(int i, int i2) {
                            this.separatorColor = i;
                            this.checkmarkColor = i2;
                        }

                        /* renamed from: getSeparatorColor$paymentsheet_release, reason: from getter */
                        public final int getSeparatorColor() {
                            return this.separatorColor;
                        }

                        /* renamed from: getCheckmarkColor$paymentsheet_release, reason: from getter */
                        public final int getCheckmarkColor() {
                            return this.checkmarkColor;
                        }
                    }

                    public final Colors getColors$paymentsheet_release(boolean isDark) {
                        return isDark ? this.colorsDark : this.colorsLight;
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final FlatWithCheckmark getDefault() {
                            return FlatWithCheckmark.f202default;
                        }
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Builder;", "", "<init>", "()V", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "checkmarkInsetDp", "additionalVerticalInsetsDp", "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "thickness", PaymentSheetAppearanceKeys.CHECKMARK_INSET, ViewProps.ENABLED, "insets", PaymentSheetAppearanceKeys.COLORS, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithCheckmark;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Builder {
                        public static final int $stable = 8;
                        private float separatorThicknessDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness();
                        private float startSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private float endSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private boolean topSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled();
                        private boolean bottomSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled();
                        private float checkmarkInsetDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getCheckmarkInsetDp();
                        private float additionalVerticalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp();
                        private float horizontalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp();
                        private Colors colorsLight = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsLight().m8682getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsLight().m8681getCheckmarkColor0d7_KjU()));
                        private Colors colorsDark = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsDark().m8682getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getCheckmarkColorsDark().m8681getCheckmarkColor0d7_KjU()));

                        public final Builder separatorThicknessDp(float thickness) {
                            this.separatorThicknessDp = thickness;
                            return this;
                        }

                        public final Builder startSeparatorInsetDp(float inset) {
                            this.startSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder endSeparatorInsetDp(float inset) {
                            this.endSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder topSeparatorEnabled(boolean enabled) {
                            this.topSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder bottomSeparatorEnabled(boolean enabled) {
                            this.bottomSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder checkmarkInsetDp(float insets) {
                            this.checkmarkInsetDp = insets;
                            return this;
                        }

                        public final Builder additionalVerticalInsetsDp(float insets) {
                            this.additionalVerticalInsetsDp = insets;
                            return this;
                        }

                        public final Builder horizontalInsetsDp(float insets) {
                            this.horizontalInsetsDp = insets;
                            return this;
                        }

                        public final Builder colorsLight(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsLight = colors;
                            return this;
                        }

                        public final Builder colorsDark(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsDark = colors;
                            return this;
                        }

                        public final FlatWithCheckmark build() {
                            return new FlatWithCheckmark(this.separatorThicknessDp, this.startSeparatorInsetDp, this.endSeparatorInsetDp, this.topSeparatorEnabled, this.bottomSeparatorEnabled, this.checkmarkInsetDp, this.additionalVerticalInsetsDp, this.horizontalInsetsDp, this.colorsLight, this.colorsDark);
                        }
                    }
                }

                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fJ\r\u0010\u0010\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0012J\r\u0010\u0013\u001a\u00020\u0011H\u0010¢\u0006\u0002\b\u0014J\u0006\u0010\u0015\u001a\u00020\nJ\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "spacingDp", "", "additionalInsetsDp", "<init>", "(FF)V", "context", "Landroid/content/Context;", "spacingRes", "", "additionalInsetsRes", "(Landroid/content/Context;II)V", "getSpacingDp$paymentsheet_release", "()F", "getAdditionalInsetsDp$paymentsheet_release", "hasSeparators", "", "hasSeparators$paymentsheet_release", "startSeparatorHasDefaultInset", "startSeparatorHasDefaultInset$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class FloatingButton extends RowStyle {
                    private final float additionalInsetsDp;
                    private final float spacingDp;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<FloatingButton> CREATOR = new Creator();
                    public static final int $stable = 8;

                    /* renamed from: default, reason: not valid java name */
                    private static final FloatingButton f205default = new FloatingButton(StripeThemeDefaults.INSTANCE.getFloating().getSpacing(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp());

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<FloatingButton> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FloatingButton createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new FloatingButton(parcel.readFloat(), parcel.readFloat());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FloatingButton[] newArray(int i) {
                            return new FloatingButton[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof FloatingButton)) {
                            return false;
                        }
                        FloatingButton floatingButton = (FloatingButton) obj;
                        return Float.compare(this.spacingDp, floatingButton.spacingDp) == 0 && Float.compare(this.additionalInsetsDp, floatingButton.additionalInsetsDp) == 0;
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean hasSeparators$paymentsheet_release() {
                        return false;
                    }

                    public int hashCode() {
                        return (Float.hashCode(this.spacingDp) * 31) + Float.hashCode(this.additionalInsetsDp);
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean startSeparatorHasDefaultInset$paymentsheet_release() {
                        return false;
                    }

                    public String toString() {
                        return "FloatingButton(spacingDp=" + this.spacingDp + ", additionalInsetsDp=" + this.additionalInsetsDp + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeFloat(this.spacingDp);
                        dest.writeFloat(this.additionalInsetsDp);
                    }

                    /* renamed from: getSpacingDp$paymentsheet_release, reason: from getter */
                    public final float getSpacingDp() {
                        return this.spacingDp;
                    }

                    /* renamed from: getAdditionalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getAdditionalInsetsDp() {
                        return this.additionalInsetsDp;
                    }

                    public FloatingButton(float f, float f2) {
                        super(null);
                        this.spacingDp = f;
                        this.additionalInsetsDp = f2;
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public FloatingButton(Context context, int i, int i2) {
                        this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2));
                        Intrinsics.checkNotNullParameter(context, "context");
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final FloatingButton getDefault() {
                            return FloatingButton.f205default;
                        }
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton$Builder;", "", "<init>", "()V", "spacingDp", "", "additionalInsetsDp", PaymentSheetAppearanceKeys.SPACING, "insets", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FloatingButton;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Builder {
                        public static final int $stable = 8;
                        private float spacingDp = StripeThemeDefaults.INSTANCE.getFloating().getSpacing();
                        private float additionalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp();

                        public final Builder spacingDp(float spacing) {
                            this.spacingDp = spacing;
                            return this;
                        }

                        public final Builder additionalInsetsDp(float insets) {
                            this.additionalInsetsDp = insets;
                            return this;
                        }

                        public final FloatingButton build() {
                            return new FloatingButton(this.spacingDp, this.additionalInsetsDp);
                        }
                    }
                }

                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 62\u00020\u0001:\u0003567B[\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011Bc\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0019J\r\u0010(\u001a\u00020\u0007H\u0010¢\u0006\u0002\b)J\r\u0010*\u001a\u00020\u0007H\u0010¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\u0007H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u000fJ\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0014\u0010\t\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0014\u0010\n\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\r\u001a\u00020\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00068"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", "additionalVerticalInsetsDp", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "disclosureIconRes", "", "<init>", "(FFFZFZFLcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;I)V", "context", "Landroid/content/Context;", "separatorThicknessRes", "startSeparatorInsetRes", "endSeparatorInsetRes", "additionalVerticalInsetsRes", "horizontalInsetsRes", "(Landroid/content/Context;IIIZZIILcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;)V", "getSeparatorThicknessDp$paymentsheet_release", "()F", "getStartSeparatorInsetDp$paymentsheet_release", "getEndSeparatorInsetDp$paymentsheet_release", "getTopSeparatorEnabled$paymentsheet_release", "()Z", "getAdditionalVerticalInsetsDp$paymentsheet_release", "getBottomSeparatorEnabled$paymentsheet_release", "getHorizontalInsetsDp$paymentsheet_release", "getColorsLight$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;", "getColorsDark$paymentsheet_release", "getDisclosureIconRes$paymentsheet_release", "()I", "hasSeparators", "hasSeparators$paymentsheet_release", "startSeparatorHasDefaultInset", "startSeparatorHasDefaultInset$paymentsheet_release", "getColors", "isDark", "getColors$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Colors", "Companion", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class FlatWithDisclosure extends RowStyle {
                    public static final int $stable = 0;
                    private final float additionalVerticalInsetsDp;
                    private final boolean bottomSeparatorEnabled;
                    private final Colors colorsDark;
                    private final Colors colorsLight;
                    private final int disclosureIconRes;
                    private final float endSeparatorInsetDp;
                    private final float horizontalInsetsDp;
                    private final float separatorThicknessDp;
                    private final float startSeparatorInsetDp;
                    private final boolean topSeparatorEnabled;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final Companion INSTANCE = new Companion(null);
                    public static final Parcelable.Creator<FlatWithDisclosure> CREATOR = new Creator();

                    /* renamed from: default, reason: not valid java name */
                    private static final FlatWithDisclosure f203default = new FlatWithDisclosure(StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets(), StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp(), StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled(), StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp(), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsLight().m8688getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsLight().m8687getDisclosureColor0d7_KjU())), new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsDark().m8688getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsDark().m8687getDisclosureColor0d7_KjU())), R.drawable.stripe_ic_chevron_right);

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    public static final class Creator implements Parcelable.Creator<FlatWithDisclosure> {
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithDisclosure createFromParcel(Parcel parcel) {
                            boolean z;
                            boolean z2;
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            float f = parcel.readFloat();
                            float f2 = parcel.readFloat();
                            float f3 = parcel.readFloat();
                            boolean z3 = true;
                            if (parcel.readInt() != 0) {
                                z = true;
                                z2 = false;
                            } else {
                                z = true;
                                z3 = false;
                                z2 = false;
                            }
                            float f4 = parcel.readFloat();
                            if (parcel.readInt() != 0) {
                                z2 = z;
                            }
                            return new FlatWithDisclosure(f, f2, f3, z3, f4, z2, parcel.readFloat(), Colors.CREATOR.createFromParcel(parcel), Colors.CREATOR.createFromParcel(parcel), parcel.readInt());
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // android.os.Parcelable.Creator
                        public final FlatWithDisclosure[] newArray(int i) {
                            return new FlatWithDisclosure[i];
                        }
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof FlatWithDisclosure)) {
                            return false;
                        }
                        FlatWithDisclosure flatWithDisclosure = (FlatWithDisclosure) obj;
                        return Float.compare(this.separatorThicknessDp, flatWithDisclosure.separatorThicknessDp) == 0 && Float.compare(this.startSeparatorInsetDp, flatWithDisclosure.startSeparatorInsetDp) == 0 && Float.compare(this.endSeparatorInsetDp, flatWithDisclosure.endSeparatorInsetDp) == 0 && this.topSeparatorEnabled == flatWithDisclosure.topSeparatorEnabled && Float.compare(this.additionalVerticalInsetsDp, flatWithDisclosure.additionalVerticalInsetsDp) == 0 && this.bottomSeparatorEnabled == flatWithDisclosure.bottomSeparatorEnabled && Float.compare(this.horizontalInsetsDp, flatWithDisclosure.horizontalInsetsDp) == 0 && Intrinsics.areEqual(this.colorsLight, flatWithDisclosure.colorsLight) && Intrinsics.areEqual(this.colorsDark, flatWithDisclosure.colorsDark) && this.disclosureIconRes == flatWithDisclosure.disclosureIconRes;
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean hasSeparators$paymentsheet_release() {
                        return true;
                    }

                    public int hashCode() {
                        return (((((((((((((((((Float.hashCode(this.separatorThicknessDp) * 31) + Float.hashCode(this.startSeparatorInsetDp)) * 31) + Float.hashCode(this.endSeparatorInsetDp)) * 31) + Boolean.hashCode(this.topSeparatorEnabled)) * 31) + Float.hashCode(this.additionalVerticalInsetsDp)) * 31) + Boolean.hashCode(this.bottomSeparatorEnabled)) * 31) + Float.hashCode(this.horizontalInsetsDp)) * 31) + this.colorsLight.hashCode()) * 31) + this.colorsDark.hashCode()) * 31) + this.disclosureIconRes;
                    }

                    @Override // com.stripe.android.paymentsheet.PaymentSheet.Appearance.Embedded.RowStyle
                    public boolean startSeparatorHasDefaultInset$paymentsheet_release() {
                        return false;
                    }

                    public String toString() {
                        return "FlatWithDisclosure(separatorThicknessDp=" + this.separatorThicknessDp + ", startSeparatorInsetDp=" + this.startSeparatorInsetDp + ", endSeparatorInsetDp=" + this.endSeparatorInsetDp + ", topSeparatorEnabled=" + this.topSeparatorEnabled + ", additionalVerticalInsetsDp=" + this.additionalVerticalInsetsDp + ", bottomSeparatorEnabled=" + this.bottomSeparatorEnabled + ", horizontalInsetsDp=" + this.horizontalInsetsDp + ", colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", disclosureIconRes=" + this.disclosureIconRes + ")";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int flags) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeFloat(this.separatorThicknessDp);
                        dest.writeFloat(this.startSeparatorInsetDp);
                        dest.writeFloat(this.endSeparatorInsetDp);
                        dest.writeInt(this.topSeparatorEnabled ? 1 : 0);
                        dest.writeFloat(this.additionalVerticalInsetsDp);
                        dest.writeInt(this.bottomSeparatorEnabled ? 1 : 0);
                        dest.writeFloat(this.horizontalInsetsDp);
                        this.colorsLight.writeToParcel(dest, flags);
                        this.colorsDark.writeToParcel(dest, flags);
                        dest.writeInt(this.disclosureIconRes);
                    }

                    /* renamed from: getSeparatorThicknessDp$paymentsheet_release, reason: from getter */
                    public final float getSeparatorThicknessDp() {
                        return this.separatorThicknessDp;
                    }

                    /* renamed from: getStartSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getStartSeparatorInsetDp() {
                        return this.startSeparatorInsetDp;
                    }

                    /* renamed from: getEndSeparatorInsetDp$paymentsheet_release, reason: from getter */
                    public final float getEndSeparatorInsetDp() {
                        return this.endSeparatorInsetDp;
                    }

                    /* renamed from: getTopSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getTopSeparatorEnabled() {
                        return this.topSeparatorEnabled;
                    }

                    /* renamed from: getAdditionalVerticalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getAdditionalVerticalInsetsDp() {
                        return this.additionalVerticalInsetsDp;
                    }

                    /* renamed from: getBottomSeparatorEnabled$paymentsheet_release, reason: from getter */
                    public final boolean getBottomSeparatorEnabled() {
                        return this.bottomSeparatorEnabled;
                    }

                    /* renamed from: getHorizontalInsetsDp$paymentsheet_release, reason: from getter */
                    public final float getHorizontalInsetsDp() {
                        return this.horizontalInsetsDp;
                    }

                    /* renamed from: getColorsLight$paymentsheet_release, reason: from getter */
                    public final Colors getColorsLight() {
                        return this.colorsLight;
                    }

                    /* renamed from: getColorsDark$paymentsheet_release, reason: from getter */
                    public final Colors getColorsDark() {
                        return this.colorsDark;
                    }

                    /* renamed from: getDisclosureIconRes$paymentsheet_release, reason: from getter */
                    public final int getDisclosureIconRes() {
                        return this.disclosureIconRes;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public FlatWithDisclosure(float f, float f2, float f3, boolean z, float f4, boolean z2, float f5, Colors colorsLight, Colors colorsDark, int i) {
                        super(null);
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                        this.separatorThicknessDp = f;
                        this.startSeparatorInsetDp = f2;
                        this.endSeparatorInsetDp = f3;
                        this.topSeparatorEnabled = z;
                        this.additionalVerticalInsetsDp = f4;
                        this.bottomSeparatorEnabled = z2;
                        this.horizontalInsetsDp = f5;
                        this.colorsLight = colorsLight;
                        this.colorsDark = colorsDark;
                        this.disclosureIconRes = i;
                    }

                    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
                    public FlatWithDisclosure(Context context, int i, int i2, int i3, boolean z, boolean z2, int i4, int i5, Colors colorsLight, Colors colorsDark) {
                        this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i3), z, StripeThemeKt.getRawValueFromDimenResource(context, i4), z2, StripeThemeKt.getRawValueFromDimenResource(context, i5), colorsLight, colorsDark, R.drawable.stripe_ic_chevron_right);
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
                        Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.SEPARATOR_COLOR, "", "disclosureColor", "<init>", "(II)V", "getSeparatorColor$paymentsheet_release", "()I", "getDisclosureColor$paymentsheet_release", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Colors implements Parcelable {
                        private final int disclosureColor;
                        private final int separatorColor;
                        public static final Parcelable.Creator<Colors> CREATOR = new Creator();
                        public static final int $stable = 8;

                        /* compiled from: PaymentSheet.kt */
                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        public static final class Creator implements Parcelable.Creator<Colors> {
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors createFromParcel(Parcel parcel) {
                                Intrinsics.checkNotNullParameter(parcel, "parcel");
                                return new Colors(parcel.readInt(), parcel.readInt());
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // android.os.Parcelable.Creator
                            public final Colors[] newArray(int i) {
                                return new Colors[i];
                            }
                        }

                        @Override // android.os.Parcelable
                        public final int describeContents() {
                            return 0;
                        }

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof Colors)) {
                                return false;
                            }
                            Colors colors = (Colors) obj;
                            return this.separatorColor == colors.separatorColor && this.disclosureColor == colors.disclosureColor;
                        }

                        public int hashCode() {
                            return (this.separatorColor * 31) + this.disclosureColor;
                        }

                        public String toString() {
                            return "Colors(separatorColor=" + this.separatorColor + ", disclosureColor=" + this.disclosureColor + ")";
                        }

                        @Override // android.os.Parcelable
                        public final void writeToParcel(Parcel dest, int flags) {
                            Intrinsics.checkNotNullParameter(dest, "dest");
                            dest.writeInt(this.separatorColor);
                            dest.writeInt(this.disclosureColor);
                        }

                        public Colors(int i, int i2) {
                            this.separatorColor = i;
                            this.disclosureColor = i2;
                        }

                        /* renamed from: getSeparatorColor$paymentsheet_release, reason: from getter */
                        public final int getSeparatorColor() {
                            return this.separatorColor;
                        }

                        /* renamed from: getDisclosureColor$paymentsheet_release, reason: from getter */
                        public final int getDisclosureColor() {
                            return this.disclosureColor;
                        }
                    }

                    public final Colors getColors$paymentsheet_release(boolean isDark) {
                        return isDark ? this.colorsDark : this.colorsLight;
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Companion {
                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        private Companion() {
                        }

                        public final FlatWithDisclosure getDefault() {
                            return FlatWithDisclosure.f203default;
                        }
                    }

                    /* compiled from: PaymentSheet.kt */
                    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u000eJ\u0012\u0010\u0010\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\u0011H\u0007J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Builder;", "", "<init>", "()V", "separatorThicknessDp", "", "startSeparatorInsetDp", "endSeparatorInsetDp", PaymentSheetAppearanceKeys.TOP_SEPARATOR_ENABLED, "", PaymentSheetAppearanceKeys.BOTTOM_SEPARATOR_ENABLED, "additionalVerticalInsetsDp", "horizontalInsetsDp", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "disclosureIconRes", "", "thickness", PaymentSheetAppearanceKeys.CHECKMARK_INSET, ViewProps.ENABLED, "insets", PaymentSheetAppearanceKeys.COLORS, "iconRes", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle$FlatWithDisclosure;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                    public static final class Builder {
                        public static final int $stable = 8;
                        private float separatorThicknessDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorThickness();
                        private float startSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private float endSeparatorInsetDp = StripeThemeDefaults.INSTANCE.getFlat().getSeparatorInsets();
                        private boolean topSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getTopSeparatorEnabled();
                        private boolean bottomSeparatorEnabled = StripeThemeDefaults.INSTANCE.getFlat().getBottomSeparatorEnabled();
                        private float additionalVerticalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getAdditionalVerticalInsetsDp();
                        private float horizontalInsetsDp = StripeThemeDefaults.INSTANCE.getEmbeddedCommon().getHorizontalInsetsDp();
                        private Colors colorsLight = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsLight().m8688getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsLight().m8687getDisclosureColor0d7_KjU()));
                        private Colors colorsDark = new Colors(ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsDark().m8688getSeparatorColor0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getDisclosureColorsDark().m8687getDisclosureColor0d7_KjU()));
                        private int disclosureIconRes = R.drawable.stripe_ic_chevron_right;

                        public final Builder separatorThicknessDp(float thickness) {
                            this.separatorThicknessDp = thickness;
                            return this;
                        }

                        public final Builder startSeparatorInsetDp(float inset) {
                            this.startSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder endSeparatorInsetDp(float inset) {
                            this.endSeparatorInsetDp = inset;
                            return this;
                        }

                        public final Builder topSeparatorEnabled(boolean enabled) {
                            this.topSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder bottomSeparatorEnabled(boolean enabled) {
                            this.bottomSeparatorEnabled = enabled;
                            return this;
                        }

                        public final Builder additionalVerticalInsetsDp(float insets) {
                            this.additionalVerticalInsetsDp = insets;
                            return this;
                        }

                        public final Builder horizontalInsetsDp(float insets) {
                            this.horizontalInsetsDp = insets;
                            return this;
                        }

                        public final Builder colorsLight(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsLight = colors;
                            return this;
                        }

                        public final Builder colorsDark(Colors colors) {
                            Intrinsics.checkNotNullParameter(colors, "colors");
                            this.colorsDark = colors;
                            return this;
                        }

                        public final Builder disclosureIconRes(int iconRes) {
                            this.disclosureIconRes = iconRes;
                            return this;
                        }

                        public final FlatWithDisclosure build() {
                            return new FlatWithDisclosure(this.separatorThicknessDp, this.startSeparatorInsetDp, this.endSeparatorInsetDp, this.topSeparatorEnabled, this.additionalVerticalInsetsDp, this.bottomSeparatorEnabled, this.horizontalInsetsDp, this.colorsLight, this.colorsDark, this.disclosureIconRes);
                        }
                    }
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$Builder;", "", "<init>", "()V", "rowStyle", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded$RowStyle;", "paymentMethodIconMargins", "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "titleFont", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "subtitleFont", "margins", "font", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Builder {
                public static final int $stable = 8;
                private Insets paymentMethodIconMargins;
                private RowStyle rowStyle = Embedded.INSTANCE.getDefault().getStyle();
                private Typography.Font subtitleFont;
                private Typography.Font titleFont;

                public final Builder rowStyle(RowStyle rowStyle) {
                    Intrinsics.checkNotNullParameter(rowStyle, "rowStyle");
                    this.rowStyle = rowStyle;
                    return this;
                }

                public final Builder paymentMethodIconMargins(Insets margins) {
                    this.paymentMethodIconMargins = margins;
                    return this;
                }

                public final Builder titleFont(Typography.Font font) {
                    this.titleFont = font;
                    return this;
                }

                public final Builder subtitleFont(Typography.Font font) {
                    this.subtitleFont = font;
                    return this;
                }

                public final Embedded build() {
                    return new Embedded(this.rowStyle, this.paymentMethodIconMargins, this.titleFont, this.subtitleFont);
                }
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0017H\u0007J\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0003R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Builder;", "", "<init>", "()V", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", AnalyticsKtxKt.FIELD_COLORS_DARK, PaymentSheetAppearanceKeys.SHAPES, "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", PaymentSheetAppearanceKeys.PRIMARY_BUTTON, "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", PaymentSheetAppearanceKeys.FORM_INSETS, "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "sectionSpacing", "Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "getSectionSpacing$annotations", "textFieldInsets", "iconStyle", "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "getIconStyle$annotations", "verticalModeRowPadding", "", "embeddedAppearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", PaymentSheetAppearanceKeys.COLORS, "insets", "verticalModeRowPaddingDp", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Colors colorsLight = Colors.INSTANCE.getDefaultLight();
            private Colors colorsDark = Colors.INSTANCE.getDefaultDark();
            private Shapes shapes = Shapes.INSTANCE.getDefault();
            private Typography typography = Typography.INSTANCE.getDefault();
            private PrimaryButton primaryButton = new PrimaryButton(null, null, null, null, 15, null);
            private Insets formInsetValues = Insets.INSTANCE.getDefaultFormInsetValues$paymentsheet_release();
            private Spacing sectionSpacing = Spacing.INSTANCE.getDefaultSectionSpacing();
            private Insets textFieldInsets = Insets.INSTANCE.getDefaultTextFieldInsets$paymentsheet_release();
            private IconStyle iconStyle = IconStyle.INSTANCE.getDefault();
            private float verticalModeRowPadding = StripeThemeDefaults.INSTANCE.getVerticalModeRowPadding();
            private Embedded embeddedAppearance = Embedded.INSTANCE.getDefault();

            private static /* synthetic */ void getIconStyle$annotations() {
            }

            private static /* synthetic */ void getSectionSpacing$annotations() {
            }

            public final Builder colorsLight(Colors colors) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colorsLight = colors;
                return this;
            }

            public final Builder colorsDark(Colors colors) {
                Intrinsics.checkNotNullParameter(colors, "colors");
                this.colorsDark = colors;
                return this;
            }

            public final Builder shapes(Shapes shapes) {
                Intrinsics.checkNotNullParameter(shapes, "shapes");
                this.shapes = shapes;
                return this;
            }

            public final Builder typography(Typography typography) {
                Intrinsics.checkNotNullParameter(typography, "typography");
                this.typography = typography;
                return this;
            }

            public final Builder primaryButton(PrimaryButton primaryButton) {
                Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
                this.primaryButton = primaryButton;
                return this;
            }

            public final Builder embeddedAppearance(Embedded embeddedAppearance) {
                Intrinsics.checkNotNullParameter(embeddedAppearance, "embeddedAppearance");
                this.embeddedAppearance = embeddedAppearance;
                return this;
            }

            public final Builder formInsetValues(Insets insets) {
                Intrinsics.checkNotNullParameter(insets, "insets");
                this.formInsetValues = insets;
                return this;
            }

            public final Builder sectionSpacing(Spacing sectionSpacing) {
                Intrinsics.checkNotNullParameter(sectionSpacing, "sectionSpacing");
                this.sectionSpacing = sectionSpacing;
                return this;
            }

            public final Builder textFieldInsets(Insets textFieldInsets) {
                Intrinsics.checkNotNullParameter(textFieldInsets, "textFieldInsets");
                this.textFieldInsets = textFieldInsets;
                return this;
            }

            public final Builder iconStyle(IconStyle iconStyle) {
                Intrinsics.checkNotNullParameter(iconStyle, "iconStyle");
                this.iconStyle = iconStyle;
                return this;
            }

            public final Builder verticalModeRowPadding(float verticalModeRowPaddingDp) {
                this.verticalModeRowPadding = verticalModeRowPaddingDp;
                return this;
            }

            public final Appearance build() {
                return new Appearance(this.colorsLight, this.colorsDark, this.shapes, this.typography, this.primaryButton, this.embeddedAppearance, this.formInsetValues, this.sectionSpacing, this.textFieldInsets, this.iconStyle, this.verticalModeRowPadding);
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017Bu\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fBa\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0010\u0012\u0006\u0010\b\u001a\u00020\u0010\u0012\u0006\u0010\n\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\u0010\u0012\u0006\u0010\f\u001a\u00020\u0010\u0012\u0006\u0010\r\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0006\u0010*\u001a\u00020\u0003J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013¨\u00068"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "Landroid/os/Parcelable;", PaymentSheetAppearanceKeys.PRIMARY, "", "surface", "component", PaymentSheetAppearanceKeys.COMPONENT_BORDER, PaymentSheetAppearanceKeys.COMPONENT_DIVIDER, "onComponent", "onSurface", "subtitle", PaymentSheetAppearanceKeys.PLACEHOLDER_TEXT, "appBarIcon", "error", "<init>", "(IIIIIIIIIII)V", "Landroidx/compose/ui/graphics/Color;", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPrimary", "()I", "getSurface", "getComponent", "getComponentBorder", "getComponentDivider", "getOnComponent", "getOnSurface", "getSubtitle", "getPlaceholderText", "getAppBarIcon", "getError", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Colors implements Parcelable {
        public static final int $stable;
        public static final Parcelable.Creator<Colors> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Colors defaultDark;
        private static final Colors defaultLight;
        private final int appBarIcon;
        private final int component;
        private final int componentBorder;
        private final int componentDivider;
        private final int error;
        private final int onComponent;
        private final int onSurface;
        private final int placeholderText;
        private final int primary;
        private final int subtitle;
        private final int surface;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Colors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Colors(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Colors[] newArray(int i) {
                return new Colors[i];
            }
        }

        public /* synthetic */ Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
        }

        public static /* synthetic */ Colors copy$default(Colors colors, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i = colors.primary;
            }
            if ((i12 & 2) != 0) {
                i2 = colors.surface;
            }
            if ((i12 & 4) != 0) {
                i3 = colors.component;
            }
            if ((i12 & 8) != 0) {
                i4 = colors.componentBorder;
            }
            if ((i12 & 16) != 0) {
                i5 = colors.componentDivider;
            }
            if ((i12 & 32) != 0) {
                i6 = colors.onComponent;
            }
            if ((i12 & 64) != 0) {
                i7 = colors.onSurface;
            }
            if ((i12 & 128) != 0) {
                i8 = colors.subtitle;
            }
            if ((i12 & 256) != 0) {
                i9 = colors.placeholderText;
            }
            if ((i12 & 512) != 0) {
                i10 = colors.appBarIcon;
            }
            if ((i12 & 1024) != 0) {
                i11 = colors.error;
            }
            int i13 = i10;
            int i14 = i11;
            int i15 = i8;
            int i16 = i9;
            int i17 = i6;
            int i18 = i7;
            int i19 = i5;
            int i20 = i3;
            return colors.copy(i, i2, i20, i4, i19, i17, i18, i15, i16, i13, i14);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPrimary() {
            return this.primary;
        }

        /* renamed from: component10, reason: from getter */
        public final int getAppBarIcon() {
            return this.appBarIcon;
        }

        /* renamed from: component11, reason: from getter */
        public final int getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final int getSurface() {
            return this.surface;
        }

        /* renamed from: component3, reason: from getter */
        public final int getComponent() {
            return this.component;
        }

        /* renamed from: component4, reason: from getter */
        public final int getComponentBorder() {
            return this.componentBorder;
        }

        /* renamed from: component5, reason: from getter */
        public final int getComponentDivider() {
            return this.componentDivider;
        }

        /* renamed from: component6, reason: from getter */
        public final int getOnComponent() {
            return this.onComponent;
        }

        /* renamed from: component7, reason: from getter */
        public final int getOnSurface() {
            return this.onSurface;
        }

        /* renamed from: component8, reason: from getter */
        public final int getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component9, reason: from getter */
        public final int getPlaceholderText() {
            return this.placeholderText;
        }

        public final Colors copy(int primary, int surface, int component, int componentBorder, int componentDivider, int onComponent, int onSurface, int subtitle, int placeholderText, int appBarIcon, int error) {
            return new Colors(primary, surface, component, componentBorder, componentDivider, onComponent, onSurface, subtitle, placeholderText, appBarIcon, error);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Colors)) {
                return false;
            }
            Colors colors = (Colors) other;
            return this.primary == colors.primary && this.surface == colors.surface && this.component == colors.component && this.componentBorder == colors.componentBorder && this.componentDivider == colors.componentDivider && this.onComponent == colors.onComponent && this.onSurface == colors.onSurface && this.subtitle == colors.subtitle && this.placeholderText == colors.placeholderText && this.appBarIcon == colors.appBarIcon && this.error == colors.error;
        }

        public int hashCode() {
            return (((((((((((((((((((Integer.hashCode(this.primary) * 31) + Integer.hashCode(this.surface)) * 31) + Integer.hashCode(this.component)) * 31) + Integer.hashCode(this.componentBorder)) * 31) + Integer.hashCode(this.componentDivider)) * 31) + Integer.hashCode(this.onComponent)) * 31) + Integer.hashCode(this.onSurface)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Integer.hashCode(this.placeholderText)) * 31) + Integer.hashCode(this.appBarIcon)) * 31) + Integer.hashCode(this.error);
        }

        public String toString() {
            return "Colors(primary=" + this.primary + ", surface=" + this.surface + ", component=" + this.component + ", componentBorder=" + this.componentBorder + ", componentDivider=" + this.componentDivider + ", onComponent=" + this.onComponent + ", onSurface=" + this.onSurface + ", subtitle=" + this.subtitle + ", placeholderText=" + this.placeholderText + ", appBarIcon=" + this.appBarIcon + ", error=" + this.error + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.primary);
            dest.writeInt(this.surface);
            dest.writeInt(this.component);
            dest.writeInt(this.componentBorder);
            dest.writeInt(this.componentDivider);
            dest.writeInt(this.onComponent);
            dest.writeInt(this.onSurface);
            dest.writeInt(this.subtitle);
            dest.writeInt(this.placeholderText);
            dest.writeInt(this.appBarIcon);
            dest.writeInt(this.error);
        }

        public Colors(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.primary = i;
            this.surface = i2;
            this.component = i3;
            this.componentBorder = i4;
            this.componentDivider = i5;
            this.onComponent = i6;
            this.onSurface = i7;
            this.subtitle = i8;
            this.placeholderText = i9;
            this.appBarIcon = i10;
            this.error = i11;
        }

        public final int getPrimary() {
            return this.primary;
        }

        public final int getSurface() {
            return this.surface;
        }

        public final int getComponent() {
            return this.component;
        }

        public final int getComponentBorder() {
            return this.componentBorder;
        }

        public final int getComponentDivider() {
            return this.componentDivider;
        }

        public final int getOnComponent() {
            return this.onComponent;
        }

        public final int getOnSurface() {
            return this.onSurface;
        }

        public final int getSubtitle() {
            return this.subtitle;
        }

        public final int getPlaceholderText() {
            return this.placeholderText;
        }

        public final int getAppBarIcon() {
            return this.appBarIcon;
        }

        public final int getError() {
            return this.error;
        }

        private Colors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
            this(ColorKt.m3711toArgb8_81llA(j), ColorKt.m3711toArgb8_81llA(j2), ColorKt.m3711toArgb8_81llA(j3), ColorKt.m3711toArgb8_81llA(j4), ColorKt.m3711toArgb8_81llA(j5), ColorKt.m3711toArgb8_81llA(j6), ColorKt.m3711toArgb8_81llA(j9), ColorKt.m3711toArgb8_81llA(j7), ColorKt.m3711toArgb8_81llA(j8), ColorKt.m3711toArgb8_81llA(j10), ColorKt.m3711toArgb8_81llA(j11));
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000f\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Colors$Companion;", "", "<init>", "()V", "configureDefaultLight", "Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", PaymentSheetAppearanceKeys.PRIMARY, "Landroidx/compose/ui/graphics/Color;", "surface", "configureDefaultLight--OWjLjI$paymentsheet_release", "(JJ)Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "defaultLight", "getDefaultLight", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Colors;", "configureDefaultDark", "configureDefaultDark--OWjLjI$paymentsheet_release", "defaultDark", "getDefaultDark", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: configureDefaultLight--OWjLjI$paymentsheet_release$default, reason: not valid java name */
            public static /* synthetic */ Colors m8219configureDefaultLightOWjLjI$paymentsheet_release$default(Companion companion, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = StripeThemeDefaults.INSTANCE.getColorsLight().getMaterialColors().m1833getPrimary0d7_KjU();
                }
                if ((i & 2) != 0) {
                    j2 = StripeThemeDefaults.INSTANCE.getColorsLight().getMaterialColors().m1837getSurface0d7_KjU();
                }
                return companion.m8221configureDefaultLightOWjLjI$paymentsheet_release(j, j2);
            }

            /* renamed from: configureDefaultLight--OWjLjI$paymentsheet_release, reason: not valid java name */
            public final Colors m8221configureDefaultLightOWjLjI$paymentsheet_release(long primary, long surface) {
                return new Colors(primary, surface, StripeThemeDefaults.INSTANCE.getColorsLight().m8725getComponent0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8726getComponentBorder0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8727getComponentDivider0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8728getOnComponent0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8730getSubtitle0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8729getPlaceholderText0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().getMaterialColors().m1832getOnSurface0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().m8724getAppBarIcon0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsLight().getMaterialColors().m1827getError0d7_KjU(), null);
            }

            public final Colors getDefaultLight() {
                return Colors.defaultLight;
            }

            /* renamed from: configureDefaultDark--OWjLjI$paymentsheet_release$default, reason: not valid java name */
            public static /* synthetic */ Colors m8218configureDefaultDarkOWjLjI$paymentsheet_release$default(Companion companion, long j, long j2, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = StripeThemeDefaults.INSTANCE.getColorsDark().getMaterialColors().m1833getPrimary0d7_KjU();
                }
                if ((i & 2) != 0) {
                    j2 = StripeThemeDefaults.INSTANCE.getColorsDark().getMaterialColors().m1837getSurface0d7_KjU();
                }
                return companion.m8220configureDefaultDarkOWjLjI$paymentsheet_release(j, j2);
            }

            /* renamed from: configureDefaultDark--OWjLjI$paymentsheet_release, reason: not valid java name */
            public final Colors m8220configureDefaultDarkOWjLjI$paymentsheet_release(long primary, long surface) {
                return new Colors(primary, surface, StripeThemeDefaults.INSTANCE.getColorsDark().m8725getComponent0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8726getComponentBorder0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8727getComponentDivider0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8728getOnComponent0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8730getSubtitle0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8729getPlaceholderText0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().getMaterialColors().m1832getOnSurface0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().m8724getAppBarIcon0d7_KjU(), StripeThemeDefaults.INSTANCE.getColorsDark().getMaterialColors().m1827getError0d7_KjU(), null);
            }

            public final Colors getDefaultDark() {
                return Colors.defaultDark;
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            CREATOR = new Creator();
            $stable = 8;
            defaultLight = Companion.m8219configureDefaultLightOWjLjI$paymentsheet_release$default(companion, 0L, 0L, 3, null);
            defaultDark = Companion.m8218configureDefaultDarkOWjLjI$paymentsheet_release$default(companion, 0L, 0L, 3, null);
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u0002\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u000bJ\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "Landroid/os/Parcelable;", "cornerRadiusDp", "", "borderStrokeWidthDp", "bottomSheetCornerRadiusDp", "<init>", "(FFF)V", "(FF)V", "context", "Landroid/content/Context;", "", "(Landroid/content/Context;II)V", "getCornerRadiusDp", "()F", "getBorderStrokeWidthDp", "getBottomSheetCornerRadiusDp", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Shapes implements Parcelable {
        private final float borderStrokeWidthDp;
        private final float bottomSheetCornerRadiusDp;
        private final float cornerRadiusDp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Shapes> CREATOR = new Creator();
        public static final int $stable = 8;

        /* renamed from: default, reason: not valid java name */
        private static final Shapes f207default = new Shapes(StripeThemeDefaults.INSTANCE.getShapes().getCornerRadius(), StripeThemeDefaults.INSTANCE.getShapes().getBorderStrokeWidth());

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Shapes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shapes createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Shapes(parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shapes[] newArray(int i) {
                return new Shapes[i];
            }
        }

        public static /* synthetic */ Shapes copy$default(Shapes shapes, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = shapes.cornerRadiusDp;
            }
            if ((i & 2) != 0) {
                f2 = shapes.borderStrokeWidthDp;
            }
            if ((i & 4) != 0) {
                f3 = shapes.bottomSheetCornerRadiusDp;
            }
            return shapes.copy(f, f2, f3);
        }

        /* renamed from: component1, reason: from getter */
        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        /* renamed from: component2, reason: from getter */
        public final float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        /* renamed from: component3, reason: from getter */
        public final float getBottomSheetCornerRadiusDp() {
            return this.bottomSheetCornerRadiusDp;
        }

        public final Shapes copy(float cornerRadiusDp, float borderStrokeWidthDp, float bottomSheetCornerRadiusDp) {
            return new Shapes(cornerRadiusDp, borderStrokeWidthDp, bottomSheetCornerRadiusDp);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Shapes)) {
                return false;
            }
            Shapes shapes = (Shapes) other;
            return Float.compare(this.cornerRadiusDp, shapes.cornerRadiusDp) == 0 && Float.compare(this.borderStrokeWidthDp, shapes.borderStrokeWidthDp) == 0 && Float.compare(this.bottomSheetCornerRadiusDp, shapes.bottomSheetCornerRadiusDp) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.cornerRadiusDp) * 31) + Float.hashCode(this.borderStrokeWidthDp)) * 31) + Float.hashCode(this.bottomSheetCornerRadiusDp);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + ", bottomSheetCornerRadiusDp=" + this.bottomSheetCornerRadiusDp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.cornerRadiusDp);
            dest.writeFloat(this.borderStrokeWidthDp);
            dest.writeFloat(this.bottomSheetCornerRadiusDp);
        }

        public Shapes(float f, float f2, float f3) {
            this.cornerRadiusDp = f;
            this.borderStrokeWidthDp = f2;
            this.bottomSheetCornerRadiusDp = f3;
        }

        public /* synthetic */ Shapes(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, (i & 4) != 0 ? f : f3);
        }

        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public final float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final float getBottomSheetCornerRadiusDp() {
            return this.bottomSheetCornerRadiusDp;
        }

        public Shapes(float f, float f2) {
            this(f, f2, f);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shapes(Context context, int i, int i2) {
            this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Shapes;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Shapes getDefault() {
                return Shapes.f207default;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0003$%&B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0005J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "Landroid/os/Parcelable;", "sizeScaleFactor", "", "fontResId", "", "custom", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;", "<init>", "(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)V", "(FLjava/lang/Integer;)V", "getSizeScaleFactor", "()F", "getFontResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCustom", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;", "component1", "component2", "component3", "copy", "(FLjava/lang/Integer;Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, TypedValues.Custom.NAME, "Font", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Typography implements Parcelable {
        public static final int $stable = 0;
        private final Custom custom;
        private final Integer fontResId;
        private final float sizeScaleFactor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Typography> CREATOR = new Creator();

        /* renamed from: default, reason: not valid java name */
        private static final Typography f208default = new Typography(StripeThemeDefaults.INSTANCE.getTypography().getFontSizeMultiplier(), StripeThemeDefaults.INSTANCE.getTypography().getFontFamily());

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Typography> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Typography createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Typography(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Custom.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Typography[] newArray(int i) {
                return new Typography[i];
            }
        }

        public static /* synthetic */ Typography copy$default(Typography typography, float f, Integer num, Custom custom, int i, Object obj) {
            if ((i & 1) != 0) {
                f = typography.sizeScaleFactor;
            }
            if ((i & 2) != 0) {
                num = typography.fontResId;
            }
            if ((i & 4) != 0) {
                custom = typography.custom;
            }
            return typography.copy(f, num, custom);
        }

        /* renamed from: component1, reason: from getter */
        public final float getSizeScaleFactor() {
            return this.sizeScaleFactor;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getFontResId() {
            return this.fontResId;
        }

        /* renamed from: component3, reason: from getter */
        public final Custom getCustom() {
            return this.custom;
        }

        public final Typography copy(float sizeScaleFactor, Integer fontResId, Custom custom) {
            Intrinsics.checkNotNullParameter(custom, "custom");
            return new Typography(sizeScaleFactor, fontResId, custom);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Typography)) {
                return false;
            }
            Typography typography = (Typography) other;
            return Float.compare(this.sizeScaleFactor, typography.sizeScaleFactor) == 0 && Intrinsics.areEqual(this.fontResId, typography.fontResId) && Intrinsics.areEqual(this.custom, typography.custom);
        }

        public int hashCode() {
            int iHashCode = Float.hashCode(this.sizeScaleFactor) * 31;
            Integer num = this.fontResId;
            return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.custom.hashCode();
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.sizeScaleFactor + ", fontResId=" + this.fontResId + ", custom=" + this.custom + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.sizeScaleFactor);
            Integer num = this.fontResId;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            this.custom.writeToParcel(dest, flags);
        }

        public Typography(float f, Integer num, Custom custom) {
            Intrinsics.checkNotNullParameter(custom, "custom");
            this.sizeScaleFactor = f;
            this.fontResId = num;
            this.custom = custom;
        }

        public final float getSizeScaleFactor() {
            return this.sizeScaleFactor;
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final Custom getCustom() {
            return this.custom;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Typography(float f, Integer num) {
            this(f, num, new Custom(null, 1, 0 == true ? 1 : 0));
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Custom;", "Landroid/os/Parcelable;", "h1", "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;)V", "getH1", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Custom implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<Custom> CREATOR = new Creator();
            private final Font h1;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Custom> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Custom createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom(parcel.readInt() == 0 ? null : Font.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Custom[] newArray(int i) {
                    return new Custom[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Custom() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public static /* synthetic */ Custom copy$default(Custom custom, Font font, int i, Object obj) {
                if ((i & 1) != 0) {
                    font = custom.h1;
                }
                return custom.copy(font);
            }

            /* renamed from: component1, reason: from getter */
            public final Font getH1() {
                return this.h1;
            }

            public final Custom copy(Font h1) {
                return new Custom(h1);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Custom) && Intrinsics.areEqual(this.h1, ((Custom) other).h1);
            }

            public int hashCode() {
                Font font = this.h1;
                if (font == null) {
                    return 0;
                }
                return font.hashCode();
            }

            public String toString() {
                return "Custom(h1=" + this.h1 + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Font font = this.h1;
                if (font == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    font.writeToParcel(dest, flags);
                }
            }

            public Custom(Font font) {
                this.h1 = font;
            }

            public /* synthetic */ Custom(Font font, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : font);
            }

            public final Font getH1() {
                return this.h1;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0003J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000e¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "Landroid/os/Parcelable;", ViewProps.FONT_FAMILY, "", "fontSizeSp", "", ViewProps.FONT_WEIGHT, "letterSpacingSp", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;)V", "getFontFamily", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontSizeSp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getFontWeight", "getLetterSpacingSp", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;)Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Font;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Font implements Parcelable {
            private final Integer fontFamily;
            private final Float fontSizeSp;
            private final Integer fontWeight;
            private final Float letterSpacingSp;
            public static final Parcelable.Creator<Font> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Font> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Font createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Font(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Font[] newArray(int i) {
                    return new Font[i];
                }
            }

            public Font() {
                this(null, null, null, null, 15, null);
            }

            public static /* synthetic */ Font copy$default(Font font, Integer num, Float f, Integer num2, Float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    num = font.fontFamily;
                }
                if ((i & 2) != 0) {
                    f = font.fontSizeSp;
                }
                if ((i & 4) != 0) {
                    num2 = font.fontWeight;
                }
                if ((i & 8) != 0) {
                    f2 = font.letterSpacingSp;
                }
                return font.copy(num, f, num2, f2);
            }

            /* renamed from: component1, reason: from getter */
            public final Integer getFontFamily() {
                return this.fontFamily;
            }

            /* renamed from: component2, reason: from getter */
            public final Float getFontSizeSp() {
                return this.fontSizeSp;
            }

            /* renamed from: component3, reason: from getter */
            public final Integer getFontWeight() {
                return this.fontWeight;
            }

            /* renamed from: component4, reason: from getter */
            public final Float getLetterSpacingSp() {
                return this.letterSpacingSp;
            }

            public final Font copy(Integer fontFamily, Float fontSizeSp, Integer fontWeight, Float letterSpacingSp) {
                return new Font(fontFamily, fontSizeSp, fontWeight, letterSpacingSp);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Font)) {
                    return false;
                }
                Font font = (Font) other;
                return Intrinsics.areEqual(this.fontFamily, font.fontFamily) && Intrinsics.areEqual((Object) this.fontSizeSp, (Object) font.fontSizeSp) && Intrinsics.areEqual(this.fontWeight, font.fontWeight) && Intrinsics.areEqual((Object) this.letterSpacingSp, (Object) font.letterSpacingSp);
            }

            public int hashCode() {
                Integer num = this.fontFamily;
                int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
                Float f = this.fontSizeSp;
                int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
                Integer num2 = this.fontWeight;
                int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                Float f2 = this.letterSpacingSp;
                return iHashCode3 + (f2 != null ? f2.hashCode() : 0);
            }

            public String toString() {
                return "Font(fontFamily=" + this.fontFamily + ", fontSizeSp=" + this.fontSizeSp + ", fontWeight=" + this.fontWeight + ", letterSpacingSp=" + this.letterSpacingSp + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                Integer num = this.fontFamily;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
                Float f = this.fontSizeSp;
                if (f == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeFloat(f.floatValue());
                }
                Integer num2 = this.fontWeight;
                if (num2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num2.intValue());
                }
                Float f2 = this.letterSpacingSp;
                if (f2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeFloat(f2.floatValue());
                }
            }

            public Font(Integer num, Float f, Integer num2, Float f2) {
                this.fontFamily = num;
                this.fontSizeSp = f;
                this.fontWeight = num2;
                this.letterSpacingSp = f2;
            }

            public /* synthetic */ Font(Integer num, Float f, Integer num2, Float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : f2);
            }

            public final Integer getFontFamily() {
                return this.fontFamily;
            }

            public final Float getFontSizeSp() {
                return this.fontSizeSp;
            }

            public final Integer getFontWeight() {
                return this.fontWeight;
            }

            public final Float getLetterSpacingSp() {
                return this.letterSpacingSp;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Typography$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Typography;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Typography getDefault() {
                return Typography.f208default;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "Landroid/os/Parcelable;", "spacingDp", "", "<init>", "(F)V", "getSpacingDp$paymentsheet_release", "()F", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Spacing implements Parcelable {
        private final float spacingDp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Spacing> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final Spacing defaultSectionSpacing = new Spacing(-1.0f);

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Spacing> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Spacing createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Spacing(parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Spacing[] newArray(int i) {
                return new Spacing[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Spacing) && Float.compare(this.spacingDp, ((Spacing) obj).spacingDp) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.spacingDp);
        }

        public String toString() {
            return "Spacing(spacingDp=" + this.spacingDp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.spacingDp);
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing$Companion;", "", "<init>", "()V", "defaultSectionSpacing", "Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "getDefaultSectionSpacing", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Spacing;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Spacing getDefaultSectionSpacing() {
                return Spacing.defaultSectionSpacing;
            }
        }

        public Spacing(float f) {
            this.spacingDp = f;
        }

        /* renamed from: getSpacingDp$paymentsheet_release, reason: from getter */
        public final float getSpacingDp() {
            return this.spacingDp;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Filled", "Outlined", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IconStyle {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ IconStyle[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final IconStyle Filled;
        public static final IconStyle Outlined;

        /* renamed from: default, reason: not valid java name */
        private static final IconStyle f206default;

        private static final /* synthetic */ IconStyle[] $values() {
            return new IconStyle[]{Filled, Outlined};
        }

        public static EnumEntries<IconStyle> getEntries() {
            return $ENTRIES;
        }

        private IconStyle(String str, int i) {
        }

        static {
            IconStyle iconStyle = new IconStyle("Filled", 0);
            Filled = iconStyle;
            Outlined = new IconStyle("Outlined", 1);
            IconStyle[] iconStyleArr$values = $values();
            $VALUES = iconStyleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(iconStyleArr$values);
            INSTANCE = new Companion(null);
            f206default = iconStyle;
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle$Companion;", "", "<init>", "()V", Constants.COLLATION_DEFAULT, "Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "getDefault", "()Lcom/stripe/android/paymentsheet/PaymentSheet$IconStyle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final IconStyle getDefault() {
                return IconStyle.f206default;
            }
        }

        public static IconStyle valueOf(String str) {
            return (IconStyle) Enum.valueOf(IconStyle.class, str);
        }

        public static IconStyle[] values() {
            return (IconStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButton;", "Landroid/os/Parcelable;", AnalyticsKtxKt.FIELD_COLORS_LIGHT, "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", AnalyticsKtxKt.FIELD_COLORS_DARK, "shape", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "typography", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;)V", "getColorsLight", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "getColorsDark", "getShape", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "getTypography", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButton implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
        private final PrimaryButtonColors colorsDark;
        private final PrimaryButtonColors colorsLight;
        private final PrimaryButtonShape shape;
        private final PrimaryButtonTypography typography;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButton(PrimaryButtonColors.CREATOR.createFromParcel(parcel), PrimaryButtonColors.CREATOR.createFromParcel(parcel), PrimaryButtonShape.CREATOR.createFromParcel(parcel), PrimaryButtonTypography.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton[] newArray(int i) {
                return new PrimaryButton[i];
            }
        }

        public PrimaryButton() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PrimaryButton copy$default(PrimaryButton primaryButton, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, Object obj) {
            if ((i & 1) != 0) {
                primaryButtonColors = primaryButton.colorsLight;
            }
            if ((i & 2) != 0) {
                primaryButtonColors2 = primaryButton.colorsDark;
            }
            if ((i & 4) != 0) {
                primaryButtonShape = primaryButton.shape;
            }
            if ((i & 8) != 0) {
                primaryButtonTypography = primaryButton.typography;
            }
            return primaryButton.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
        }

        /* renamed from: component1, reason: from getter */
        public final PrimaryButtonColors getColorsLight() {
            return this.colorsLight;
        }

        /* renamed from: component2, reason: from getter */
        public final PrimaryButtonColors getColorsDark() {
            return this.colorsDark;
        }

        /* renamed from: component3, reason: from getter */
        public final PrimaryButtonShape getShape() {
            return this.shape;
        }

        /* renamed from: component4, reason: from getter */
        public final PrimaryButtonTypography getTypography() {
            return this.typography;
        }

        public final PrimaryButton copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(typography, "typography");
            return new PrimaryButton(colorsLight, colorsDark, shape, typography);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) other;
            return Intrinsics.areEqual(this.colorsLight, primaryButton.colorsLight) && Intrinsics.areEqual(this.colorsDark, primaryButton.colorsDark) && Intrinsics.areEqual(this.shape, primaryButton.shape) && Intrinsics.areEqual(this.typography, primaryButton.typography);
        }

        public int hashCode() {
            return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.colorsLight.writeToParcel(dest, flags);
            this.colorsDark.writeToParcel(dest, flags);
            this.shape.writeToParcel(dest, flags);
            this.typography.writeToParcel(dest, flags);
        }

        public PrimaryButton(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            Intrinsics.checkNotNullParameter(colorsLight, "colorsLight");
            Intrinsics.checkNotNullParameter(colorsDark, "colorsDark");
            Intrinsics.checkNotNullParameter(shape, "shape");
            Intrinsics.checkNotNullParameter(typography, "typography");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shape = shape;
            this.typography = typography;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ PrimaryButton(PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? PrimaryButtonColors.INSTANCE.getDefaultLight() : primaryButtonColors, (i & 2) != 0 ? PrimaryButtonColors.INSTANCE.getDefaultDark() : primaryButtonColors2, (i & 4) != 0 ? new PrimaryButtonShape((Float) null, (Float) null, (Float) null, 7, (DefaultConstructorMarker) null) : primaryButtonShape, (i & 8) != 0 ? new PrimaryButtonTypography(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : primaryButtonTypography);
        }

        public final PrimaryButtonColors getColorsLight() {
            return this.colorsLight;
        }

        public final PrimaryButtonColors getColorsDark() {
            return this.colorsDark;
        }

        public final PrimaryButtonShape getShape() {
            return this.shape;
        }

        public final PrimaryButtonTypography getTypography() {
            return this.typography;
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0001*B;\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fB7\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JB\u0010\u001b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0003J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006+"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "Landroid/os/Parcelable;", "background", "", "onBackground", "border", PaymentSheetAppearanceKeys.SUCCESS_BACKGROUND, "onSuccessBackgroundColor", "<init>", "(Ljava/lang/Integer;IIII)V", "(Ljava/lang/Integer;II)V", "Landroidx/compose/ui/graphics/Color;", "(Landroidx/compose/ui/graphics/Color;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/Color;JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBackground", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOnBackground", "()I", "getBorder", "getSuccessBackgroundColor", "getOnSuccessBackgroundColor", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;IIII)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonColors implements Parcelable {
        private final Integer background;
        private final int border;
        private final int onBackground;
        private final int onSuccessBackgroundColor;
        private final int successBackgroundColor;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<PrimaryButtonColors> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final PrimaryButtonColors defaultLight = new PrimaryButtonColors((Integer) null, ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsLight().m8707getOnBackground0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsLight().m8706getBorder0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsLight().m8709getSuccessBackground0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsLight().m8707getOnBackground0d7_KjU()));
        private static final PrimaryButtonColors defaultDark = new PrimaryButtonColors((Integer) null, ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsDark().m8707getOnBackground0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsDark().m8706getBorder0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsDark().m8709getSuccessBackground0d7_KjU()), ColorKt.m3711toArgb8_81llA(StripeThemeDefaults.INSTANCE.getPrimaryButtonStyle().getColorsDark().m8707getOnBackground0d7_KjU()));

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButtonColors> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonColors(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors[] newArray(int i) {
                return new PrimaryButtonColors[i];
            }
        }

        public /* synthetic */ PrimaryButtonColors(Color color, long j, long j2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(color, j, j2, j3, j4);
        }

        public /* synthetic */ PrimaryButtonColors(Color color, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(color, j, j2);
        }

        public static /* synthetic */ PrimaryButtonColors copy$default(PrimaryButtonColors primaryButtonColors, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                num = primaryButtonColors.background;
            }
            if ((i5 & 2) != 0) {
                i = primaryButtonColors.onBackground;
            }
            if ((i5 & 4) != 0) {
                i2 = primaryButtonColors.border;
            }
            if ((i5 & 8) != 0) {
                i3 = primaryButtonColors.successBackgroundColor;
            }
            if ((i5 & 16) != 0) {
                i4 = primaryButtonColors.onSuccessBackgroundColor;
            }
            int i6 = i4;
            int i7 = i2;
            return primaryButtonColors.copy(num, i, i7, i3, i6);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getBackground() {
            return this.background;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOnBackground() {
            return this.onBackground;
        }

        /* renamed from: component3, reason: from getter */
        public final int getBorder() {
            return this.border;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSuccessBackgroundColor() {
            return this.successBackgroundColor;
        }

        /* renamed from: component5, reason: from getter */
        public final int getOnSuccessBackgroundColor() {
            return this.onSuccessBackgroundColor;
        }

        public final PrimaryButtonColors copy(Integer background, int onBackground, int border, int successBackgroundColor, int onSuccessBackgroundColor) {
            return new PrimaryButtonColors(background, onBackground, border, successBackgroundColor, onSuccessBackgroundColor);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonColors)) {
                return false;
            }
            PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) other;
            return Intrinsics.areEqual(this.background, primaryButtonColors.background) && this.onBackground == primaryButtonColors.onBackground && this.border == primaryButtonColors.border && this.successBackgroundColor == primaryButtonColors.successBackgroundColor && this.onSuccessBackgroundColor == primaryButtonColors.onSuccessBackgroundColor;
        }

        public int hashCode() {
            Integer num = this.background;
            return ((((((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.onBackground)) * 31) + Integer.hashCode(this.border)) * 31) + Integer.hashCode(this.successBackgroundColor)) * 31) + Integer.hashCode(this.onSuccessBackgroundColor);
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.background + ", onBackground=" + this.onBackground + ", border=" + this.border + ", successBackgroundColor=" + this.successBackgroundColor + ", onSuccessBackgroundColor=" + this.onSuccessBackgroundColor + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.background;
            if (num == null) {
                iIntValue = 0;
            } else {
                dest.writeInt(1);
                iIntValue = num.intValue();
            }
            dest.writeInt(iIntValue);
            dest.writeInt(this.onBackground);
            dest.writeInt(this.border);
            dest.writeInt(this.successBackgroundColor);
            dest.writeInt(this.onSuccessBackgroundColor);
        }

        public PrimaryButtonColors(Integer num, int i, int i2, int i3, int i4) {
            this.background = num;
            this.onBackground = i;
            this.border = i2;
            this.successBackgroundColor = i3;
            this.onSuccessBackgroundColor = i4;
        }

        public final Integer getBackground() {
            return this.background;
        }

        public final int getOnBackground() {
            return this.onBackground;
        }

        public final int getBorder() {
            return this.border;
        }

        public final int getSuccessBackgroundColor() {
            return this.successBackgroundColor;
        }

        public /* synthetic */ PrimaryButtonColors(Integer num, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, i, i2, (i5 & 8) != 0 ? ColorKt.m3711toArgb8_81llA(StripeThemeKt.getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR()) : i3, (i5 & 16) != 0 ? i : i4);
        }

        public final int getOnSuccessBackgroundColor() {
            return this.onSuccessBackgroundColor;
        }

        public PrimaryButtonColors(Integer num, int i, int i2) {
            this(num, i, i2, ColorKt.m3711toArgb8_81llA(StripeThemeKt.getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR()), i);
        }

        private PrimaryButtonColors(Color color, long j, long j2) {
            this(color != null ? Integer.valueOf(ColorKt.m3711toArgb8_81llA(color.m3667unboximpl())) : null, ColorKt.m3711toArgb8_81llA(j), ColorKt.m3711toArgb8_81llA(j2));
        }

        public /* synthetic */ PrimaryButtonColors(Color color, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(color, j, j2, (i & 8) != 0 ? StripeThemeKt.getPRIMARY_BUTTON_SUCCESS_BACKGROUND_COLOR() : j3, (i & 16) != 0 ? j : j4, null);
        }

        private PrimaryButtonColors(Color color, long j, long j2, long j3, long j4) {
            this(color != null ? Integer.valueOf(ColorKt.m3711toArgb8_81llA(color.m3667unboximpl())) : null, ColorKt.m3711toArgb8_81llA(j), ColorKt.m3711toArgb8_81llA(j2), ColorKt.m3711toArgb8_81llA(j3), ColorKt.m3711toArgb8_81llA(j4));
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors$Companion;", "", "<init>", "()V", "defaultLight", "Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "getDefaultLight", "()Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonColors;", "defaultDark", "getDefaultDark", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final PrimaryButtonColors getDefaultLight() {
                return PrimaryButtonColors.defaultLight;
            }

            public final PrimaryButtonColors getDefaultDark() {
                return PrimaryButtonColors.defaultDark;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0017\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000bB5\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J2\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\nJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\nR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "Landroid/os/Parcelable;", "cornerRadiusDp", "", "borderStrokeWidthDp", "heightDp", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "context", "Landroid/content/Context;", "", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;)V", "cornerRadiusRes", "borderStrokeWidthRes", "heightRes", "(Landroid/content/Context;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getCornerRadiusDp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBorderStrokeWidthDp", "getHeightDp", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonShape;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonShape implements Parcelable {
        private final Float borderStrokeWidthDp;
        private final Float cornerRadiusDp;
        private final Float heightDp;
        public static final Parcelable.Creator<PrimaryButtonShape> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButtonShape> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonShape(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape[] newArray(int i) {
                return new PrimaryButtonShape[i];
            }
        }

        public PrimaryButtonShape() {
            this((Float) null, (Float) null, (Float) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, Float f, Float f2, Float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = primaryButtonShape.cornerRadiusDp;
            }
            if ((i & 2) != 0) {
                f2 = primaryButtonShape.borderStrokeWidthDp;
            }
            if ((i & 4) != 0) {
                f3 = primaryButtonShape.heightDp;
            }
            return primaryButtonShape.copy(f, f2, f3);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        /* renamed from: component3, reason: from getter */
        public final Float getHeightDp() {
            return this.heightDp;
        }

        public final PrimaryButtonShape copy(Float cornerRadiusDp, Float borderStrokeWidthDp, Float heightDp) {
            return new PrimaryButtonShape(cornerRadiusDp, borderStrokeWidthDp, heightDp);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonShape)) {
                return false;
            }
            PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) other;
            return Intrinsics.areEqual((Object) this.cornerRadiusDp, (Object) primaryButtonShape.cornerRadiusDp) && Intrinsics.areEqual((Object) this.borderStrokeWidthDp, (Object) primaryButtonShape.borderStrokeWidthDp) && Intrinsics.areEqual((Object) this.heightDp, (Object) primaryButtonShape.heightDp);
        }

        public int hashCode() {
            Float f = this.cornerRadiusDp;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.borderStrokeWidthDp;
            int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
            Float f3 = this.heightDp;
            return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + ", heightDp=" + this.heightDp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Float f = this.cornerRadiusDp;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
            Float f2 = this.borderStrokeWidthDp;
            if (f2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f2.floatValue());
            }
            Float f3 = this.heightDp;
            if (f3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f3.floatValue());
            }
        }

        public PrimaryButtonShape(Float f, Float f2, Float f3) {
            this.cornerRadiusDp = f;
            this.borderStrokeWidthDp = f2;
            this.heightDp = f3;
        }

        public /* synthetic */ PrimaryButtonShape(Float f, Float f2, Float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3);
        }

        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public final Float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final Float getHeightDp() {
            return this.heightDp;
        }

        public /* synthetic */ PrimaryButtonShape(Context context, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @Deprecated(message = "Use @DimenRes constructor")
        public PrimaryButtonShape(Context context, Integer num, Integer num2) {
            this(num != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num.intValue())) : null, num2 != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num2.intValue())) : null, (Float) null, 4, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public /* synthetic */ PrimaryButtonShape(Context context, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonShape(Context context, Integer num, Integer num2, Integer num3) {
            this(num != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num.intValue())) : null, num2 != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num2.intValue())) : null, num3 != null ? Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, num3.intValue())) : null);
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0003J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "Landroid/os/Parcelable;", "fontResId", "", "fontSizeSp", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/Integer;I)V", "getFontResId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontSizeSp", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Float;)Lcom/stripe/android/paymentsheet/PaymentSheet$PrimaryButtonTypography;", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButtonTypography implements Parcelable {
        private final Integer fontResId;
        private final Float fontSizeSp;
        public static final Parcelable.Creator<PrimaryButtonTypography> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PrimaryButtonTypography> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryButtonTypography(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography[] newArray(int i) {
                return new PrimaryButtonTypography[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public PrimaryButtonTypography() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PrimaryButtonTypography copy$default(PrimaryButtonTypography primaryButtonTypography, Integer num, Float f, int i, Object obj) {
            if ((i & 1) != 0) {
                num = primaryButtonTypography.fontResId;
            }
            if ((i & 2) != 0) {
                f = primaryButtonTypography.fontSizeSp;
            }
            return primaryButtonTypography.copy(num, f);
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getFontResId() {
            return this.fontResId;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getFontSizeSp() {
            return this.fontSizeSp;
        }

        public final PrimaryButtonTypography copy(Integer fontResId, Float fontSizeSp) {
            return new PrimaryButtonTypography(fontResId, fontSizeSp);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrimaryButtonTypography)) {
                return false;
            }
            PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) other;
            return Intrinsics.areEqual(this.fontResId, primaryButtonTypography.fontResId) && Intrinsics.areEqual((Object) this.fontSizeSp, (Object) primaryButtonTypography.fontSizeSp);
        }

        public int hashCode() {
            Integer num = this.fontResId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f = this.fontSizeSp;
            return iHashCode + (f != null ? f.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.fontResId + ", fontSizeSp=" + this.fontSizeSp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Integer num = this.fontResId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Float f = this.fontSizeSp;
            if (f == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeFloat(f.floatValue());
            }
        }

        public PrimaryButtonTypography(Integer num, Float f) {
            this.fontResId = num;
            this.fontSizeSp = f;
        }

        public /* synthetic */ PrimaryButtonTypography(Integer num, Float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : f);
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final Float getFontSizeSp() {
            return this.fontSizeSp;
        }

        public /* synthetic */ PrimaryButtonTypography(Context context, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i2 & 2) != 0 ? null : num, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonTypography(Context context, Integer num, int i) {
            this(num, Float.valueOf(StripeThemeKt.getRawValueFromDimenResource(context, i)));
            Intrinsics.checkNotNullParameter(context, "context");
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB9\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000e\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\u0013B%\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u0014\u001a\u00020\f\u0012\b\b\u0001\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u0016J\u0006\u0010\u001c\u001a\u00020\fJ\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "Landroid/os/Parcelable;", "startDp", "", "topDp", "endDp", "bottomDp", "<init>", "(FFFF)V", "context", "Landroid/content/Context;", "startRes", "", "topRes", "endRes", "bottomRes", "(Landroid/content/Context;IIII)V", "horizontalDp", "verticalDp", "(FF)V", "horizontalRes", "verticalRes", "(Landroid/content/Context;II)V", "getStartDp", "()F", "getTopDp", "getEndDp", "getBottomDp", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Insets implements Parcelable {
        private final float bottomDp;
        private final float endDp;
        private final float startDp;
        private final float topDp;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Insets> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final Insets defaultFormInsetValues = new Insets(20.0f, 0.0f, 20.0f, 40.0f);
        private static final Insets defaultTextFieldInsets = new Insets(StripeThemeDefaults.INSTANCE.getTextFieldInsets().getStart(), StripeThemeDefaults.INSTANCE.getTextFieldInsets().getTop(), StripeThemeDefaults.INSTANCE.getTextFieldInsets().getEnd(), StripeThemeDefaults.INSTANCE.getTextFieldInsets().getBottom());

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Insets> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Insets createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Insets(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Insets[] newArray(int i) {
                return new Insets[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Insets)) {
                return false;
            }
            Insets insets = (Insets) obj;
            return Float.compare(this.startDp, insets.startDp) == 0 && Float.compare(this.topDp, insets.topDp) == 0 && Float.compare(this.endDp, insets.endDp) == 0 && Float.compare(this.bottomDp, insets.bottomDp) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.startDp) * 31) + Float.hashCode(this.topDp)) * 31) + Float.hashCode(this.endDp)) * 31) + Float.hashCode(this.bottomDp);
        }

        public String toString() {
            return "Insets(startDp=" + this.startDp + ", topDp=" + this.topDp + ", endDp=" + this.endDp + ", bottomDp=" + this.bottomDp + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeFloat(this.startDp);
            dest.writeFloat(this.topDp);
            dest.writeFloat(this.endDp);
            dest.writeFloat(this.bottomDp);
        }

        public Insets(float f, float f2, float f3, float f4) {
            this.startDp = f;
            this.topDp = f2;
            this.endDp = f3;
            this.bottomDp = f4;
        }

        public final float getStartDp() {
            return this.startDp;
        }

        public final float getTopDp() {
            return this.topDp;
        }

        public final float getEndDp() {
            return this.endDp;
        }

        public final float getBottomDp() {
            return this.bottomDp;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Insets(Context context, int i, int i2, int i3, int i4) {
            this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i3), StripeThemeKt.getRawValueFromDimenResource(context, i4));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        public Insets(float f, float f2) {
            this(f, f2, f, f2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Insets(Context context, int i, int i2) {
            this(StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2), StripeThemeKt.getRawValueFromDimenResource(context, i), StripeThemeKt.getRawValueFromDimenResource(context, i2));
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Insets$Companion;", "", "<init>", "()V", "defaultFormInsetValues", "Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "getDefaultFormInsetValues$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Insets;", "defaultTextFieldInsets", "getDefaultTextFieldInsets$paymentsheet_release", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Insets getDefaultFormInsetValues$paymentsheet_release() {
                return Insets.defaultFormInsetValues;
            }

            public final Insets getDefaultTextFieldInsets$paymentsheet_release() {
                return Insets.defaultTextFieldInsets;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "Landroid/os/Parcelable;", "city", "", "country", "line1", "line2", HintConstants.AUTOFILL_HINT_POSTAL_CODE, ServerProtocol.DIALOG_PARAM_STATE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCity", "()Ljava/lang/String;", "getCountry", "getLine1", "getLine2", "getPostalCode", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Address implements Parcelable {
        private final String city;
        private final String country;
        private final String line1;
        private final String line2;
        private final String postalCode;
        private final String state;
        public static final Parcelable.Creator<Address> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Address> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i) {
                return new Address[i];
            }
        }

        public Address() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = address.city;
            }
            if ((i & 2) != 0) {
                str2 = address.country;
            }
            if ((i & 4) != 0) {
                str3 = address.line1;
            }
            if ((i & 8) != 0) {
                str4 = address.line2;
            }
            if ((i & 16) != 0) {
                str5 = address.postalCode;
            }
            if ((i & 32) != 0) {
                str6 = address.state;
            }
            String str7 = str5;
            String str8 = str6;
            return address.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLine1() {
            return this.line1;
        }

        /* renamed from: component4, reason: from getter */
        public final String getLine2() {
            return this.line2;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getState() {
            return this.state;
        }

        public final Address copy(String city, String country, String line1, String line2, String postalCode, String state) {
            return new Address(city, country, line1, line2, postalCode, state);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Address)) {
                return false;
            }
            Address address = (Address) other;
            return Intrinsics.areEqual(this.city, address.city) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.line1, address.line1) && Intrinsics.areEqual(this.line2, address.line2) && Intrinsics.areEqual(this.postalCode, address.postalCode) && Intrinsics.areEqual(this.state, address.state);
        }

        public int hashCode() {
            String str = this.city;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line1;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.line2;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postalCode;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.state;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Address(city=" + this.city + ", country=" + this.country + ", line1=" + this.line1 + ", line2=" + this.line2 + ", postalCode=" + this.postalCode + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.city);
            dest.writeString(this.country);
            dest.writeString(this.line1);
            dest.writeString(this.line2);
            dest.writeString(this.postalCode);
            dest.writeString(this.state);
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            this.city = str;
            this.country = str2;
            this.line1 = str3;
            this.line2 = str4;
            this.postalCode = str5;
            this.state = str6;
        }

        public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public final String getCity() {
            return this.city;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getLine1() {
            return this.line1;
        }

        public final String getLine2() {
            return this.line2;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getState() {
            return this.state;
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000b\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", "", "<init>", "()V", "city", "", "country", "line1", "line2", HintConstants.AUTOFILL_HINT_POSTAL_CODE, ServerProtocol.DIALOG_PARAM_STATE, InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private String city;
            private String country;
            private String line1;
            private String line2;
            private String postalCode;
            private String state;

            public final Builder city(String city) {
                this.city = city;
                return this;
            }

            public final Builder country(String country) {
                this.country = country;
                return this;
            }

            public final Builder line1(String line1) {
                this.line1 = line1;
                return this;
            }

            public final Builder line2(String line2) {
                this.line2 = line2;
                return this;
            }

            public final Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            public final Builder state(String state) {
                this.state = state;
                return this;
            }

            public final Address build() {
                return new Address(this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0019J\u0013\u0010\u001a\u001a\u00020\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "Landroid/os/Parcelable;", "address", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", "phone", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddress", "()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "getEmail", "()Ljava/lang/String;", "getName", "getPhone", "isFilledOut", "", "isFilledOut$paymentsheet_release", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingDetails implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final Address getAddress() {
            return this.address;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String email, String name, String phone) {
            return new BillingDetails(address, email, name, phone);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) other;
            return Intrinsics.areEqual(this.address, billingDetails.address) && Intrinsics.areEqual(this.email, billingDetails.email) && Intrinsics.areEqual(this.name, billingDetails.name) && Intrinsics.areEqual(this.phone, billingDetails.phone);
        }

        public int hashCode() {
            Address address = this.address;
            int iHashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + this.email + ", name=" + this.name + ", phone=" + this.phone + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Address address = this.address;
            if (address == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                address.writeToParcel(dest, flags);
            }
            dest.writeString(this.email);
            dest.writeString(this.name);
            dest.writeString(this.phone);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : address, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final boolean isFilledOut$paymentsheet_release() {
            return (this.address == null && this.email == null && this.name == null && this.phone == null) ? false : true;
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;", "", "<init>", "()V", "address", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;", "email", "", "name", "phone", "addressBuilder", "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder address(Address address) {
                this.address = address;
                return this;
            }

            public final Builder address(Address.Builder addressBuilder) {
                Intrinsics.checkNotNullParameter(addressBuilder, "addressBuilder");
                this.address = addressBuilder.build();
                return this;
            }

            public final Builder email(String email) {
                this.email = email;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }

            public final Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public final BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000278B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J\r\u0010!\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J;\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010*\u001a\u00020+J\u0013\u0010,\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020+HÖ\u0001J\t\u00100\u001a\u000201HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0013R\u0014\u0010\u001c\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0013¨\u00069"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration;", "Landroid/os/Parcelable;", "name", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;", "phone", "email", "address", "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "attachDefaultsToPaymentMethod", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;Z)V", "getName", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;", "getPhone", "getEmail", "getAddress", "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "getAttachDefaultsToPaymentMethod", "()Z", "collectsName", "getCollectsName$paymentsheet_release", "collectsEmail", "getCollectsEmail$paymentsheet_release", "collectsPhone", "getCollectsPhone$paymentsheet_release", "collectsAnything", "getCollectsAnything$paymentsheet_release", "collectsFullAddress", "getCollectsFullAddress", "toBillingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "toBillingAddressParameters$paymentsheet_release", "toBillingAddressConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "toBillingAddressConfig$paymentsheet_release", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "CollectionMode", "AddressCollectionMode", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingDetailsCollectionConfiguration implements Parcelable {
        private final AddressCollectionMode address;
        private final boolean attachDefaultsToPaymentMethod;
        private final CollectionMode email;
        private final CollectionMode name;
        private final CollectionMode phone;
        public static final Parcelable.Creator<BillingDetailsCollectionConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingDetailsCollectionConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetailsCollectionConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingDetailsCollectionConfiguration(CollectionMode.valueOf(parcel.readString()), CollectionMode.valueOf(parcel.readString()), CollectionMode.valueOf(parcel.readString()), AddressCollectionMode.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingDetailsCollectionConfiguration[] newArray(int i) {
                return new BillingDetailsCollectionConfiguration[i];
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AddressCollectionMode.values().length];
                try {
                    iArr[AddressCollectionMode.Never.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AddressCollectionMode.Automatic.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AddressCollectionMode.Full.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public BillingDetailsCollectionConfiguration() {
            this(null, null, null, null, false, 31, null);
        }

        public static /* synthetic */ BillingDetailsCollectionConfiguration copy$default(BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration, CollectionMode collectionMode, CollectionMode collectionMode2, CollectionMode collectionMode3, AddressCollectionMode addressCollectionMode, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                collectionMode = billingDetailsCollectionConfiguration.name;
            }
            if ((i & 2) != 0) {
                collectionMode2 = billingDetailsCollectionConfiguration.phone;
            }
            if ((i & 4) != 0) {
                collectionMode3 = billingDetailsCollectionConfiguration.email;
            }
            if ((i & 8) != 0) {
                addressCollectionMode = billingDetailsCollectionConfiguration.address;
            }
            if ((i & 16) != 0) {
                z = billingDetailsCollectionConfiguration.attachDefaultsToPaymentMethod;
            }
            boolean z2 = z;
            CollectionMode collectionMode4 = collectionMode3;
            return billingDetailsCollectionConfiguration.copy(collectionMode, collectionMode2, collectionMode4, addressCollectionMode, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final CollectionMode getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final CollectionMode getPhone() {
            return this.phone;
        }

        /* renamed from: component3, reason: from getter */
        public final CollectionMode getEmail() {
            return this.email;
        }

        /* renamed from: component4, reason: from getter */
        public final AddressCollectionMode getAddress() {
            return this.address;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAttachDefaultsToPaymentMethod() {
            return this.attachDefaultsToPaymentMethod;
        }

        public final BillingDetailsCollectionConfiguration copy(CollectionMode name, CollectionMode phone, CollectionMode email, AddressCollectionMode address, boolean attachDefaultsToPaymentMethod) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(address, "address");
            return new BillingDetailsCollectionConfiguration(name, phone, email, address, attachDefaultsToPaymentMethod);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingDetailsCollectionConfiguration)) {
                return false;
            }
            BillingDetailsCollectionConfiguration billingDetailsCollectionConfiguration = (BillingDetailsCollectionConfiguration) other;
            return this.name == billingDetailsCollectionConfiguration.name && this.phone == billingDetailsCollectionConfiguration.phone && this.email == billingDetailsCollectionConfiguration.email && this.address == billingDetailsCollectionConfiguration.address && this.attachDefaultsToPaymentMethod == billingDetailsCollectionConfiguration.attachDefaultsToPaymentMethod;
        }

        public int hashCode() {
            return (((((((this.name.hashCode() * 31) + this.phone.hashCode()) * 31) + this.email.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.attachDefaultsToPaymentMethod);
        }

        public String toString() {
            return "BillingDetailsCollectionConfiguration(name=" + this.name + ", phone=" + this.phone + ", email=" + this.email + ", address=" + this.address + ", attachDefaultsToPaymentMethod=" + this.attachDefaultsToPaymentMethod + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.name.name());
            dest.writeString(this.phone.name());
            dest.writeString(this.email.name());
            dest.writeString(this.address.name());
            dest.writeInt(this.attachDefaultsToPaymentMethod ? 1 : 0);
        }

        public BillingDetailsCollectionConfiguration(CollectionMode name, CollectionMode phone, CollectionMode email, AddressCollectionMode address, boolean z) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(phone, "phone");
            Intrinsics.checkNotNullParameter(email, "email");
            Intrinsics.checkNotNullParameter(address, "address");
            this.name = name;
            this.phone = phone;
            this.email = email;
            this.address = address;
            this.attachDefaultsToPaymentMethod = z;
        }

        public /* synthetic */ BillingDetailsCollectionConfiguration(CollectionMode collectionMode, CollectionMode collectionMode2, CollectionMode collectionMode3, AddressCollectionMode addressCollectionMode, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionMode.Automatic : collectionMode, (i & 2) != 0 ? CollectionMode.Automatic : collectionMode2, (i & 4) != 0 ? CollectionMode.Automatic : collectionMode3, (i & 8) != 0 ? AddressCollectionMode.Automatic : addressCollectionMode, (i & 16) != 0 ? false : z);
        }

        public final CollectionMode getName() {
            return this.name;
        }

        public final CollectionMode getPhone() {
            return this.phone;
        }

        public final CollectionMode getEmail() {
            return this.email;
        }

        public final AddressCollectionMode getAddress() {
            return this.address;
        }

        public final boolean getAttachDefaultsToPaymentMethod() {
            return this.attachDefaultsToPaymentMethod;
        }

        public final boolean getCollectsName$paymentsheet_release() {
            return this.name == CollectionMode.Always;
        }

        public final boolean getCollectsEmail$paymentsheet_release() {
            return this.email == CollectionMode.Always;
        }

        public final boolean getCollectsPhone$paymentsheet_release() {
            return this.phone == CollectionMode.Always;
        }

        public final boolean getCollectsAnything$paymentsheet_release() {
            return this.name == CollectionMode.Always || this.phone == CollectionMode.Always || this.email == CollectionMode.Always || this.address == AddressCollectionMode.Full;
        }

        private final boolean getCollectsFullAddress() {
            return this.address == AddressCollectionMode.Full;
        }

        public final GooglePayJsonFactory.BillingAddressParameters toBillingAddressParameters$paymentsheet_release() {
            GooglePayJsonFactory.BillingAddressParameters.Format format;
            int i = WhenMappings.$EnumSwitchMapping$0[this.address.ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                format = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                format = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
            }
            if (!getCollectsFullAddress() && !getCollectsPhone$paymentsheet_release()) {
                z = false;
            }
            return new GooglePayJsonFactory.BillingAddressParameters(z, format, getCollectsPhone$paymentsheet_release());
        }

        public final GooglePayPaymentMethodLauncher.BillingAddressConfig toBillingAddressConfig$paymentsheet_release() {
            GooglePayPaymentMethodLauncher.BillingAddressConfig.Format format;
            int i = WhenMappings.$EnumSwitchMapping$0[this.address.ordinal()];
            boolean z = true;
            if (i == 1 || i == 2) {
                format = GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Min;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                format = GooglePayPaymentMethodLauncher.BillingAddressConfig.Format.Full;
            }
            if (!getCollectsFullAddress() && !getCollectsPhone$paymentsheet_release()) {
                z = false;
            }
            return new GooglePayPaymentMethodLauncher.BillingAddressConfig(z, format, getCollectsPhone$paymentsheet_release());
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$CollectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "Always", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CollectionMode {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ CollectionMode[] $VALUES;
            public static final CollectionMode Automatic = new CollectionMode("Automatic", 0);
            public static final CollectionMode Never = new CollectionMode("Never", 1);
            public static final CollectionMode Always = new CollectionMode("Always", 2);

            private static final /* synthetic */ CollectionMode[] $values() {
                return new CollectionMode[]{Automatic, Never, Always};
            }

            public static EnumEntries<CollectionMode> getEntries() {
                return $ENTRIES;
            }

            private CollectionMode(String str, int i) {
            }

            static {
                CollectionMode[] collectionModeArr$values = $values();
                $VALUES = collectionModeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(collectionModeArr$values);
            }

            public static CollectionMode valueOf(String str) {
                return (CollectionMode) Enum.valueOf(CollectionMode.class, str);
            }

            public static CollectionMode[] values() {
                return (CollectionMode[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "Full", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AddressCollectionMode {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ AddressCollectionMode[] $VALUES;
            public static final AddressCollectionMode Automatic = new AddressCollectionMode("Automatic", 0);
            public static final AddressCollectionMode Never = new AddressCollectionMode("Never", 1);
            public static final AddressCollectionMode Full = new AddressCollectionMode("Full", 2);

            private static final /* synthetic */ AddressCollectionMode[] $values() {
                return new AddressCollectionMode[]{Automatic, Never, Full};
            }

            public static EnumEntries<AddressCollectionMode> getEntries() {
                return $ENTRIES;
            }

            private AddressCollectionMode(String str, int i) {
            }

            static {
                AddressCollectionMode[] addressCollectionModeArr$values = $values();
                $VALUES = addressCollectionModeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(addressCollectionModeArr$values);
            }

            public static AddressCollectionMode valueOf(String str) {
                return (AddressCollectionMode) Enum.valueOf(AddressCollectionMode.class, str);
            }

            public static AddressCollectionMode[] values() {
                return (AddressCollectionMode[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00052\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "Landroid/os/Parcelable;", "<init>", "()V", "BrandCategory", "Companion", "All", "Allowed", "Disallowed", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class CardBrandAcceptance implements Parcelable {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ CardBrandAcceptance(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static final CardBrandAcceptance all() {
            return INSTANCE.all();
        }

        @JvmStatic
        public static final CardBrandAcceptance allowed(List<? extends BrandCategory> list) {
            return INSTANCE.allowed(list);
        }

        @JvmStatic
        public static final CardBrandAcceptance disallowed(List<? extends BrandCategory> list) {
            return INSTANCE.disallowed(list);
        }

        private CardBrandAcceptance() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Visa", "Mastercard", "Amex", "Discover", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class BrandCategory implements Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ BrandCategory[] $VALUES;
            public static final Parcelable.Creator<BrandCategory> CREATOR;
            public static final BrandCategory Visa = new BrandCategory("Visa", 0);
            public static final BrandCategory Mastercard = new BrandCategory("Mastercard", 1);
            public static final BrandCategory Amex = new BrandCategory("Amex", 2);
            public static final BrandCategory Discover = new BrandCategory("Discover", 3);

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<BrandCategory> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrandCategory createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return BrandCategory.valueOf(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BrandCategory[] newArray(int i) {
                    return new BrandCategory[i];
                }
            }

            private static final /* synthetic */ BrandCategory[] $values() {
                return new BrandCategory[]{Visa, Mastercard, Amex, Discover};
            }

            public static EnumEntries<BrandCategory> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(name());
            }

            private BrandCategory(String str, int i) {
            }

            static {
                BrandCategory[] brandCategoryArr$values = $values();
                $VALUES = brandCategoryArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(brandCategoryArr$values);
                CREATOR = new Creator();
            }

            public static BrandCategory valueOf(String str) {
                return (BrandCategory) Enum.valueOf(BrandCategory.class, str);
            }

            public static BrandCategory[] values() {
                return (BrandCategory[]) $VALUES.clone();
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;", "", "<init>", "()V", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "allowed", "brands", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "disallowed", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CardBrandAcceptance all() {
                return All.INSTANCE;
            }

            @JvmStatic
            public final CardBrandAcceptance allowed(List<? extends BrandCategory> brands) {
                Intrinsics.checkNotNullParameter(brands, "brands");
                return new Allowed(brands);
            }

            @JvmStatic
            public final CardBrandAcceptance disallowed(List<? extends BrandCategory> brands) {
                Intrinsics.checkNotNullParameter(brands, "brands");
                return new Disallowed(brands);
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class All extends CardBrandAcceptance {
            public static final All INSTANCE = new All();
            public static final Parcelable.Creator<All> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<All> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final All createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return All.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final All[] newArray(int i) {
                    return new All[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof All)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1733345294;
            }

            public String toString() {
                return "All";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private All() {
                super(null);
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "brands", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "<init>", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Allowed extends CardBrandAcceptance {
            private final List<BrandCategory> brands;
            public static final Parcelable.Creator<Allowed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Allowed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Allowed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(BrandCategory.CREATOR.createFromParcel(parcel));
                    }
                    return new Allowed(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Allowed[] newArray(int i) {
                    return new Allowed[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Allowed copy$default(Allowed allowed, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = allowed.brands;
                }
                return allowed.copy(list);
            }

            public final List<BrandCategory> component1() {
                return this.brands;
            }

            public final Allowed copy(List<? extends BrandCategory> brands) {
                Intrinsics.checkNotNullParameter(brands, "brands");
                return new Allowed(brands);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Allowed) && Intrinsics.areEqual(this.brands, ((Allowed) other).brands);
            }

            public int hashCode() {
                return this.brands.hashCode();
            }

            public String toString() {
                return "Allowed(brands=" + this.brands + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<BrandCategory> list = this.brands;
                dest.writeInt(list.size());
                Iterator<BrandCategory> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }

            public final List<BrandCategory> getBrands() {
                return this.brands;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Allowed(List<? extends BrandCategory> brands) {
                super(null);
                Intrinsics.checkNotNullParameter(brands, "brands");
                this.brands = brands;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;", "brands", "", "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;", "<init>", "(Ljava/util/List;)V", "getBrands", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Disallowed extends CardBrandAcceptance {
            private final List<BrandCategory> brands;
            public static final Parcelable.Creator<Disallowed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Disallowed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disallowed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(BrandCategory.CREATOR.createFromParcel(parcel));
                    }
                    return new Disallowed(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Disallowed[] newArray(int i) {
                    return new Disallowed[i];
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Disallowed copy$default(Disallowed disallowed, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = disallowed.brands;
                }
                return disallowed.copy(list);
            }

            public final List<BrandCategory> component1() {
                return this.brands;
            }

            public final Disallowed copy(List<? extends BrandCategory> brands) {
                Intrinsics.checkNotNullParameter(brands, "brands");
                return new Disallowed(brands);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Disallowed) && Intrinsics.areEqual(this.brands, ((Disallowed) other).brands);
            }

            public int hashCode() {
                return this.brands.hashCode();
            }

            public String toString() {
                return "Disallowed(brands=" + this.brands + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<BrandCategory> list = this.brands;
                dest.writeInt(list.size());
                Iterator<BrandCategory> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(dest, flags);
                }
            }

            public final List<BrandCategory> getBrands() {
                return this.brands;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Disallowed(List<? extends BrandCategory> brands) {
                super(null);
                Intrinsics.checkNotNullParameter(brands, "brands");
                this.brands = brands;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000bB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\fJ\u0006\u0010\u0013\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomPaymentMethod;", "Landroid/os/Parcelable;", "id", "", "subtitle", "Lcom/stripe/android/core/strings/ResolvableString;", "disableBillingDetailCollection", "", "<init>", "(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Z)V", "", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getSubtitle$paymentsheet_release", "()Lcom/stripe/android/core/strings/ResolvableString;", "getDisableBillingDetailCollection$paymentsheet_release", "()Z", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomPaymentMethod implements Parcelable {
        private final boolean disableBillingDetailCollection;
        private final String id;
        private final ResolvableString subtitle;
        public static final Parcelable.Creator<CustomPaymentMethod> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomPaymentMethod> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomPaymentMethod createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomPaymentMethod(parcel.readString(), (ResolvableString) parcel.readParcelable(CustomPaymentMethod.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomPaymentMethod[] newArray(int i) {
                return new CustomPaymentMethod[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomPaymentMethod)) {
                return false;
            }
            CustomPaymentMethod customPaymentMethod = (CustomPaymentMethod) obj;
            return Intrinsics.areEqual(this.id, customPaymentMethod.id) && Intrinsics.areEqual(this.subtitle, customPaymentMethod.subtitle) && this.disableBillingDetailCollection == customPaymentMethod.disableBillingDetailCollection;
        }

        public int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            ResolvableString resolvableString = this.subtitle;
            return ((iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode())) * 31) + Boolean.hashCode(this.disableBillingDetailCollection);
        }

        public String toString() {
            return "CustomPaymentMethod(id=" + this.id + ", subtitle=" + this.subtitle + ", disableBillingDetailCollection=" + this.disableBillingDetailCollection + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeParcelable(this.subtitle, flags);
            dest.writeInt(this.disableBillingDetailCollection ? 1 : 0);
        }

        public CustomPaymentMethod(String id, ResolvableString resolvableString, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.subtitle = resolvableString;
            this.disableBillingDetailCollection = z;
        }

        public final String getId() {
            return this.id;
        }

        /* renamed from: getSubtitle$paymentsheet_release, reason: from getter */
        public final ResolvableString getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: getDisableBillingDetailCollection$paymentsheet_release, reason: from getter */
        public final boolean getDisableBillingDetailCollection() {
            return this.disableBillingDetailCollection;
        }

        public /* synthetic */ CustomPaymentMethod(String str, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, num, (i & 4) != 0 ? true : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CustomPaymentMethod(String id, Integer num, boolean z) {
            this(id, num != null ? ResolvableStringUtilsKt.getResolvableString(num.intValue()) : null, z);
            Intrinsics.checkNotNullParameter(id, "id");
        }

        public /* synthetic */ CustomPaymentMethod(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? true : z);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CustomPaymentMethod(String id, String str, boolean z) {
            this(id, str != null ? ResolvableStringUtilsKt.getResolvableString(str) : null, z);
            Intrinsics.checkNotNullParameter(id, "id");
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;", "Landroid/os/Parcelable;", "analyticsValue", "", "getAnalyticsValue", "()Ljava/lang/String;", "LegacyCustomerEphemeralKey", "CustomerSession", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CustomerAccessType extends Parcelable {
        String getAnalyticsValue();

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$LegacyCustomerEphemeralKey;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;", "ephemeralKeySecret", "", "<init>", "(Ljava/lang/String;)V", "getEphemeralKeySecret", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue$annotations", "()V", "getAnalyticsValue", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LegacyCustomerEphemeralKey implements CustomerAccessType {
            private final String analyticsValue;
            private final String ephemeralKeySecret;
            public static final Parcelable.Creator<LegacyCustomerEphemeralKey> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LegacyCustomerEphemeralKey> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegacyCustomerEphemeralKey createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LegacyCustomerEphemeralKey(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LegacyCustomerEphemeralKey[] newArray(int i) {
                    return new LegacyCustomerEphemeralKey[i];
                }
            }

            public static /* synthetic */ LegacyCustomerEphemeralKey copy$default(LegacyCustomerEphemeralKey legacyCustomerEphemeralKey, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = legacyCustomerEphemeralKey.ephemeralKeySecret;
                }
                return legacyCustomerEphemeralKey.copy(str);
            }

            public static /* synthetic */ void getAnalyticsValue$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }

            public final LegacyCustomerEphemeralKey copy(String ephemeralKeySecret) {
                Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
                return new LegacyCustomerEphemeralKey(ephemeralKeySecret);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LegacyCustomerEphemeralKey) && Intrinsics.areEqual(this.ephemeralKeySecret, ((LegacyCustomerEphemeralKey) other).ephemeralKeySecret);
            }

            public int hashCode() {
                return this.ephemeralKeySecret.hashCode();
            }

            public String toString() {
                return "LegacyCustomerEphemeralKey(ephemeralKeySecret=" + this.ephemeralKeySecret + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.ephemeralKeySecret);
            }

            public LegacyCustomerEphemeralKey(String ephemeralKeySecret) {
                Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
                this.ephemeralKeySecret = ephemeralKeySecret;
                this.analyticsValue = "legacy";
            }

            public final String getEphemeralKeySecret() {
                return this.ephemeralKeySecret;
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheet.CustomerAccessType
            public String getAnalyticsValue() {
                return this.analyticsValue;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0096D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType$CustomerSession;", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;", "customerSessionClientSecret", "", "<init>", "(Ljava/lang/String;)V", "getCustomerSessionClientSecret", "()Ljava/lang/String;", "analyticsValue", "getAnalyticsValue$annotations", "()V", "getAnalyticsValue", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CustomerSession implements CustomerAccessType {
            private final String analyticsValue;
            private final String customerSessionClientSecret;
            public static final Parcelable.Creator<CustomerSession> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CustomerSession> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomerSession createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustomerSession(parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CustomerSession[] newArray(int i) {
                    return new CustomerSession[i];
                }
            }

            public static /* synthetic */ CustomerSession copy$default(CustomerSession customerSession, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = customerSession.customerSessionClientSecret;
                }
                return customerSession.copy(str);
            }

            public static /* synthetic */ void getAnalyticsValue$annotations() {
            }

            /* renamed from: component1, reason: from getter */
            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            public final CustomerSession copy(String customerSessionClientSecret) {
                Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
                return new CustomerSession(customerSessionClientSecret);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof CustomerSession) && Intrinsics.areEqual(this.customerSessionClientSecret, ((CustomerSession) other).customerSessionClientSecret);
            }

            public int hashCode() {
                return this.customerSessionClientSecret.hashCode();
            }

            public String toString() {
                return "CustomerSession(customerSessionClientSecret=" + this.customerSessionClientSecret + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.customerSessionClientSecret);
            }

            public CustomerSession(String customerSessionClientSecret) {
                Intrinsics.checkNotNullParameter(customerSessionClientSecret, "customerSessionClientSecret");
                this.customerSessionClientSecret = customerSessionClientSecret;
                this.analyticsValue = "customer_session";
            }

            public final String getCustomerSessionClientSecret() {
                return this.customerSessionClientSecret;
            }

            @Override // com.stripe.android.paymentsheet.PaymentSheet.CustomerAccessType
            public String getAnalyticsValue() {
                return this.analyticsValue;
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000e\u0010\u0011\u001a\u00020\u0006HÀ\u0003¢\u0006\u0002\b\u0012J,\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÀ\u0001¢\u0006\u0002\b\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006#"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "Landroid/os/Parcelable;", "id", "", "ephemeralKeySecret", "accessType", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getEphemeralKeySecret", "getAccessType$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerAccessType;", "component1", "component2", "component3", "component3$paymentsheet_release", "copy", "copy$paymentsheet_release", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomerConfiguration implements Parcelable {
        public static final int $stable = 0;
        private final CustomerAccessType accessType;
        private final String ephemeralKeySecret;
        private final String id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<CustomerConfiguration> CREATOR = new Creator();

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<CustomerConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomerConfiguration(parcel.readString(), parcel.readString(), (CustomerAccessType) parcel.readParcelable(CustomerConfiguration.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration[] newArray(int i) {
                return new CustomerConfiguration[i];
            }
        }

        public static /* synthetic */ CustomerConfiguration copy$paymentsheet_release$default(CustomerConfiguration customerConfiguration, String str, String str2, CustomerAccessType customerAccessType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customerConfiguration.id;
            }
            if ((i & 2) != 0) {
                str2 = customerConfiguration.ephemeralKeySecret;
            }
            if ((i & 4) != 0) {
                customerAccessType = customerConfiguration.accessType;
            }
            return customerConfiguration.copy$paymentsheet_release(str, str2, customerAccessType);
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        /* renamed from: component3$paymentsheet_release, reason: from getter */
        public final CustomerAccessType getAccessType() {
            return this.accessType;
        }

        public final CustomerConfiguration copy$paymentsheet_release(String id, String ephemeralKeySecret, CustomerAccessType accessType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            Intrinsics.checkNotNullParameter(accessType, "accessType");
            return new CustomerConfiguration(id, ephemeralKeySecret, accessType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerConfiguration)) {
                return false;
            }
            CustomerConfiguration customerConfiguration = (CustomerConfiguration) other;
            return Intrinsics.areEqual(this.id, customerConfiguration.id) && Intrinsics.areEqual(this.ephemeralKeySecret, customerConfiguration.ephemeralKeySecret) && Intrinsics.areEqual(this.accessType, customerConfiguration.accessType);
        }

        public int hashCode() {
            return (((this.id.hashCode() * 31) + this.ephemeralKeySecret.hashCode()) * 31) + this.accessType.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + ", accessType=" + this.accessType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.id);
            dest.writeString(this.ephemeralKeySecret);
            dest.writeParcelable(this.accessType, flags);
        }

        public CustomerConfiguration(String id, String ephemeralKeySecret, CustomerAccessType accessType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
            Intrinsics.checkNotNullParameter(accessType, "accessType");
            this.id = id;
            this.ephemeralKeySecret = ephemeralKeySecret;
            this.accessType = accessType;
        }

        public final String getId() {
            return this.id;
        }

        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        public final CustomerAccessType getAccessType$paymentsheet_release() {
            return this.accessType;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public CustomerConfiguration(String id, String ephemeralKeySecret) {
            this(id, ephemeralKeySecret, new CustomerAccessType.LegacyCustomerEphemeralKey(ephemeralKeySecret));
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(ephemeralKeySecret, "ephemeralKeySecret");
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration$Companion;", "", "<init>", "()V", "createWithCustomerSession", "Lcom/stripe/android/paymentsheet/PaymentSheet$CustomerConfiguration;", "id", "", "clientSecret", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final CustomerConfiguration createWithCustomerSession(String id, String clientSecret) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
                return new CustomerConfiguration(id, "", new CustomerAccessType.CustomerSession(clientSecret));
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002./BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0006\u0010!\u001a\u00020\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\"HÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u00060"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "countryCode", "", "currencyCode", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "label", "buttonType", "Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)V", "getEnvironment", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "getCountryCode", "()Ljava/lang/String;", "getCurrencyCode", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLabel", "getButtonType", "()Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;)Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration;", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Environment", "ButtonType", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GooglePayConfiguration implements Parcelable {
        private final Long amount;
        private final ButtonType buttonType;
        private final String countryCode;
        private final String currencyCode;
        private final Environment environment;
        private final String label;
        public static final Parcelable.Creator<GooglePayConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<GooglePayConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GooglePayConfiguration(Environment.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), ButtonType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration[] newArray(int i) {
                return new GooglePayConfiguration[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode) {
            this(environment, countryCode, null, null, null, null, 60, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode, String str) {
            this(environment, countryCode, str, null, null, null, 56, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode, String str, Long l) {
            this(environment, countryCode, str, l, null, null, 48, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode, String str, Long l, String str2) {
            this(environment, countryCode, str, l, str2, null, 32, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        }

        public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, Environment environment, String str, String str2, Long l, String str3, ButtonType buttonType, int i, Object obj) {
            if ((i & 1) != 0) {
                environment = googlePayConfiguration.environment;
            }
            if ((i & 2) != 0) {
                str = googlePayConfiguration.countryCode;
            }
            if ((i & 4) != 0) {
                str2 = googlePayConfiguration.currencyCode;
            }
            if ((i & 8) != 0) {
                l = googlePayConfiguration.amount;
            }
            if ((i & 16) != 0) {
                str3 = googlePayConfiguration.label;
            }
            if ((i & 32) != 0) {
                buttonType = googlePayConfiguration.buttonType;
            }
            String str4 = str3;
            ButtonType buttonType2 = buttonType;
            return googlePayConfiguration.copy(environment, str, str2, l, str4, buttonType2);
        }

        /* renamed from: component1, reason: from getter */
        public final Environment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getAmount() {
            return this.amount;
        }

        /* renamed from: component5, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component6, reason: from getter */
        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        public final GooglePayConfiguration copy(Environment environment, String countryCode, String currencyCode, Long amount, String label, ButtonType buttonType) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            return new GooglePayConfiguration(environment, countryCode, currencyCode, amount, label, buttonType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GooglePayConfiguration)) {
                return false;
            }
            GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) other;
            return this.environment == googlePayConfiguration.environment && Intrinsics.areEqual(this.countryCode, googlePayConfiguration.countryCode) && Intrinsics.areEqual(this.currencyCode, googlePayConfiguration.currencyCode) && Intrinsics.areEqual(this.amount, googlePayConfiguration.amount) && Intrinsics.areEqual(this.label, googlePayConfiguration.label) && this.buttonType == googlePayConfiguration.buttonType;
        }

        public int hashCode() {
            int iHashCode = ((this.environment.hashCode() * 31) + this.countryCode.hashCode()) * 31;
            String str = this.currencyCode;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.amount;
            int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.label;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.buttonType.hashCode();
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.environment + ", countryCode=" + this.countryCode + ", currencyCode=" + this.currencyCode + ", amount=" + this.amount + ", label=" + this.label + ", buttonType=" + this.buttonType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.environment.name());
            dest.writeString(this.countryCode);
            dest.writeString(this.currencyCode);
            Long l = this.amount;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
            dest.writeString(this.label);
            dest.writeString(this.buttonType.name());
        }

        public GooglePayConfiguration(Environment environment, String countryCode, String str, Long l, String str2, ButtonType buttonType) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(buttonType, "buttonType");
            this.environment = environment;
            this.countryCode = countryCode;
            this.currencyCode = str;
            this.amount = l;
            this.label = str2;
            this.buttonType = buttonType;
        }

        public final Environment getEnvironment() {
            return this.environment;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final Long getAmount() {
            return this.amount;
        }

        public final String getLabel() {
            return this.label;
        }

        public /* synthetic */ GooglePayConfiguration(Environment environment, String str, String str2, Long l, String str3, ButtonType buttonType, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(environment, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? ButtonType.Pay : buttonType);
        }

        public final ButtonType getButtonType() {
            return this.buttonType;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$Environment;", "", "<init>", "(Ljava/lang/String;I)V", "Production", "Test", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Environment {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Environment[] $VALUES;
            public static final Environment Production = new Environment("Production", 0);
            public static final Environment Test = new Environment("Test", 1);

            private static final /* synthetic */ Environment[] $values() {
                return new Environment[]{Production, Test};
            }

            public static EnumEntries<Environment> getEntries() {
                return $ENTRIES;
            }

            private Environment(String str, int i) {
            }

            static {
                Environment[] environmentArr$values = $values();
                $VALUES = environmentArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(environmentArr$values);
            }

            public static Environment valueOf(String str) {
                return (Environment) Enum.valueOf(Environment.class, str);
            }

            public static Environment[] values() {
                return (Environment[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$GooglePayConfiguration$ButtonType;", "", "<init>", "(Ljava/lang/String;I)V", "Buy", "Book", "Checkout", AppEventsConstants.EVENT_NAME_DONATE, "Order", "Pay", AppEventsConstants.EVENT_NAME_SUBSCRIBE, "Plain", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ButtonType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ButtonType[] $VALUES;
            public static final ButtonType Buy = new ButtonType("Buy", 0);
            public static final ButtonType Book = new ButtonType("Book", 1);
            public static final ButtonType Checkout = new ButtonType("Checkout", 2);
            public static final ButtonType Donate = new ButtonType(AppEventsConstants.EVENT_NAME_DONATE, 3);
            public static final ButtonType Order = new ButtonType("Order", 4);
            public static final ButtonType Pay = new ButtonType("Pay", 5);
            public static final ButtonType Subscribe = new ButtonType(AppEventsConstants.EVENT_NAME_SUBSCRIBE, 6);
            public static final ButtonType Plain = new ButtonType("Plain", 7);

            private static final /* synthetic */ ButtonType[] $values() {
                return new ButtonType[]{Buy, Book, Checkout, Donate, Order, Pay, Subscribe, Plain};
            }

            public static EnumEntries<ButtonType> getEntries() {
                return $ENTRIES;
            }

            private ButtonType(String str, int i) {
            }

            static {
                ButtonType[] buttonTypeArr$values = $values();
                $VALUES = buttonTypeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(buttonTypeArr$values);
            }

            public static ButtonType valueOf(String str) {
                return (ButtonType) Enum.valueOf(ButtonType.class, str);
            }

            public static ButtonType[] values() {
                return (ButtonType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "Landroid/os/Parcelable;", "display", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "collectMissingBillingDetailsForExistingPaymentMethods", "", "allowUserEmailEdits", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;ZZ)V", "(Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;)V", "getDisplay$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "getCollectMissingBillingDetailsForExistingPaymentMethods$paymentsheet_release", "()Z", "getAllowUserEmailEdits$paymentsheet_release", "shouldDisplay", "getShouldDisplay$paymentsheet_release", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Builder", "Display", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkConfiguration implements Parcelable {
        private final boolean allowUserEmailEdits;
        private final boolean collectMissingBillingDetailsForExistingPaymentMethods;
        private final Display display;
        public static final Parcelable.Creator<LinkConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkConfiguration(Display.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LinkConfiguration[] newArray(int i) {
                return new LinkConfiguration[i];
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Display.values().length];
                try {
                    iArr[Display.Automatic.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Display.Never.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LinkConfiguration() {
            this((Display) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkConfiguration)) {
                return false;
            }
            LinkConfiguration linkConfiguration = (LinkConfiguration) obj;
            return this.display == linkConfiguration.display && this.collectMissingBillingDetailsForExistingPaymentMethods == linkConfiguration.collectMissingBillingDetailsForExistingPaymentMethods && this.allowUserEmailEdits == linkConfiguration.allowUserEmailEdits;
        }

        public int hashCode() {
            return (((this.display.hashCode() * 31) + Boolean.hashCode(this.collectMissingBillingDetailsForExistingPaymentMethods)) * 31) + Boolean.hashCode(this.allowUserEmailEdits);
        }

        public String toString() {
            return "LinkConfiguration(display=" + this.display + ", collectMissingBillingDetailsForExistingPaymentMethods=" + this.collectMissingBillingDetailsForExistingPaymentMethods + ", allowUserEmailEdits=" + this.allowUserEmailEdits + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.display.name());
            dest.writeInt(this.collectMissingBillingDetailsForExistingPaymentMethods ? 1 : 0);
            dest.writeInt(this.allowUserEmailEdits ? 1 : 0);
        }

        public LinkConfiguration(Display display, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(display, "display");
            this.display = display;
            this.collectMissingBillingDetailsForExistingPaymentMethods = z;
            this.allowUserEmailEdits = z2;
        }

        /* renamed from: getDisplay$paymentsheet_release, reason: from getter */
        public final Display getDisplay() {
            return this.display;
        }

        /* renamed from: getCollectMissingBillingDetailsForExistingPaymentMethods$paymentsheet_release, reason: from getter */
        public final boolean getCollectMissingBillingDetailsForExistingPaymentMethods() {
            return this.collectMissingBillingDetailsForExistingPaymentMethods;
        }

        /* renamed from: getAllowUserEmailEdits$paymentsheet_release, reason: from getter */
        public final boolean getAllowUserEmailEdits() {
            return this.allowUserEmailEdits;
        }

        public /* synthetic */ LinkConfiguration(Display display, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Display.Automatic : display);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public LinkConfiguration(Display display) {
            this(display, true, true);
            Intrinsics.checkNotNullParameter(display, "display");
        }

        public final boolean getShouldDisplay$paymentsheet_release() {
            int i = WhenMappings.$EnumSwitchMapping$0[this.display.ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Builder;", "", "<init>", "()V", "display", "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "collectMissingBillingDetailsForExistingPaymentMethods", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private Display display = Display.Automatic;
            private boolean collectMissingBillingDetailsForExistingPaymentMethods = true;

            public final Builder display(Display display) {
                Intrinsics.checkNotNullParameter(display, "display");
                this.display = display;
                return this;
            }

            public final Builder collectMissingBillingDetailsForExistingPaymentMethods(boolean collectMissingBillingDetailsForExistingPaymentMethods) {
                this.collectMissingBillingDetailsForExistingPaymentMethods = collectMissingBillingDetailsForExistingPaymentMethods;
                return this;
            }

            public final LinkConfiguration build() {
                return new LinkConfiguration(this.display, this.collectMissingBillingDetailsForExistingPaymentMethods, true);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0006\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$LinkConfiguration$Display;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Never", "analyticsValue", "", "getAnalyticsValue$paymentsheet_release", "()Ljava/lang/String;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Display {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Display[] $VALUES;
            public static final Display Automatic = new Display("Automatic", 0);
            public static final Display Never = new Display("Never", 1);

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Display.values().length];
                    try {
                        iArr[Display.Automatic.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Display.Never.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            private static final /* synthetic */ Display[] $values() {
                return new Display[]{Automatic, Never};
            }

            public static EnumEntries<Display> getEntries() {
                return $ENTRIES;
            }

            private Display(String str, int i) {
            }

            static {
                Display[] displayArr$values = $values();
                $VALUES = displayArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(displayArr$values);
            }

            public final String getAnalyticsValue$paymentsheet_release() {
                int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
                if (i == 1) {
                    return AnalyticsEvents.PARAMETER_SHARE_DIALOG_SHOW_AUTOMATIC;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return "never";
            }

            public static Display valueOf(String str) {
                return (Display) Enum.valueOf(Display.class, str);
            }

            public static Display[] values() {
                return (Display[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$WalletButtonsConfiguration;", "Landroid/os/Parcelable;", "willDisplayExternally", "", "walletsToShow", "", "", "<init>", "(ZLjava/util/List;)V", "getWillDisplayExternally", "()Z", "getWalletsToShow", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WalletButtonsConfiguration implements Parcelable {
        private final List<String> walletsToShow;
        private final boolean willDisplayExternally;
        public static final Parcelable.Creator<WalletButtonsConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<WalletButtonsConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletButtonsConfiguration createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WalletButtonsConfiguration(parcel.readInt() != 0, parcel.createStringArrayList());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WalletButtonsConfiguration[] newArray(int i) {
                return new WalletButtonsConfiguration[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public WalletButtonsConfiguration() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WalletButtonsConfiguration)) {
                return false;
            }
            WalletButtonsConfiguration walletButtonsConfiguration = (WalletButtonsConfiguration) obj;
            return this.willDisplayExternally == walletButtonsConfiguration.willDisplayExternally && Intrinsics.areEqual(this.walletsToShow, walletButtonsConfiguration.walletsToShow);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.willDisplayExternally) * 31) + this.walletsToShow.hashCode();
        }

        public String toString() {
            return "WalletButtonsConfiguration(willDisplayExternally=" + this.willDisplayExternally + ", walletsToShow=" + this.walletsToShow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.willDisplayExternally ? 1 : 0);
            dest.writeStringList(this.walletsToShow);
        }

        public WalletButtonsConfiguration(boolean z, List<String> walletsToShow) {
            Intrinsics.checkNotNullParameter(walletsToShow, "walletsToShow");
            this.willDisplayExternally = z;
            this.walletsToShow = walletsToShow;
        }

        public final boolean getWillDisplayExternally() {
            return this.willDisplayExternally;
        }

        public /* synthetic */ WalletButtonsConfiguration(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<String> getWalletsToShow() {
            return this.walletsToShow;
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0003!\"#BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;", "Landroid/os/Parcelable;", "shopId", "", "billingAddressRequired", "", "emailRequired", "shippingAddressRequired", "allowedShippingCountries", "", "lineItems", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;", "shippingRates", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "<init>", "(Ljava/lang/String;ZZZLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "getShopId", "()Ljava/lang/String;", "getBillingAddressRequired", "()Z", "getEmailRequired", "getShippingAddressRequired", "getAllowedShippingCountries", "()Ljava/util/List;", "getLineItems", "getShippingRates", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "LineItem", "ShippingRate", "DeliveryEstimate", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopPayConfiguration implements Parcelable {
        private final List<String> allowedShippingCountries;
        private final boolean billingAddressRequired;
        private final boolean emailRequired;
        private final List<LineItem> lineItems;
        private final boolean shippingAddressRequired;
        private final List<ShippingRate> shippingRates;
        private final String shopId;
        public static final Parcelable.Creator<ShopPayConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ShopPayConfiguration> {
            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final ShopPayConfiguration createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    i = 0;
                    z = true;
                } else {
                    i = 0;
                }
                boolean z2 = parcel.readInt() != 0 ? 1 : i;
                boolean z3 = parcel.readInt() != 0 ? 1 : i;
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                for (int i3 = i; i3 != i2; i3++) {
                    arrayList.add(LineItem.CREATOR.createFromParcel(parcel));
                }
                ArrayList arrayList2 = arrayList;
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (i != i4) {
                    arrayList3.add(ShippingRate.CREATOR.createFromParcel(parcel));
                    i++;
                }
                return new ShopPayConfiguration(string, z, z2, z3, arrayListCreateStringArrayList, arrayList2, arrayList3);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ShopPayConfiguration[] newArray(int i) {
                return new ShopPayConfiguration[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShopPayConfiguration)) {
                return false;
            }
            ShopPayConfiguration shopPayConfiguration = (ShopPayConfiguration) obj;
            return Intrinsics.areEqual(this.shopId, shopPayConfiguration.shopId) && this.billingAddressRequired == shopPayConfiguration.billingAddressRequired && this.emailRequired == shopPayConfiguration.emailRequired && this.shippingAddressRequired == shopPayConfiguration.shippingAddressRequired && Intrinsics.areEqual(this.allowedShippingCountries, shopPayConfiguration.allowedShippingCountries) && Intrinsics.areEqual(this.lineItems, shopPayConfiguration.lineItems) && Intrinsics.areEqual(this.shippingRates, shopPayConfiguration.shippingRates);
        }

        public int hashCode() {
            return (((((((((((this.shopId.hashCode() * 31) + Boolean.hashCode(this.billingAddressRequired)) * 31) + Boolean.hashCode(this.emailRequired)) * 31) + Boolean.hashCode(this.shippingAddressRequired)) * 31) + this.allowedShippingCountries.hashCode()) * 31) + this.lineItems.hashCode()) * 31) + this.shippingRates.hashCode();
        }

        public String toString() {
            return "ShopPayConfiguration(shopId=" + this.shopId + ", billingAddressRequired=" + this.billingAddressRequired + ", emailRequired=" + this.emailRequired + ", shippingAddressRequired=" + this.shippingAddressRequired + ", allowedShippingCountries=" + this.allowedShippingCountries + ", lineItems=" + this.lineItems + ", shippingRates=" + this.shippingRates + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.shopId);
            dest.writeInt(this.billingAddressRequired ? 1 : 0);
            dest.writeInt(this.emailRequired ? 1 : 0);
            dest.writeInt(this.shippingAddressRequired ? 1 : 0);
            dest.writeStringList(this.allowedShippingCountries);
            List<LineItem> list = this.lineItems;
            dest.writeInt(list.size());
            Iterator<LineItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
            List<ShippingRate> list2 = this.shippingRates;
            dest.writeInt(list2.size());
            Iterator<ShippingRate> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }

        public ShopPayConfiguration(String shopId, boolean z, boolean z2, boolean z3, List<String> allowedShippingCountries, List<LineItem> lineItems, List<ShippingRate> shippingRates) {
            Intrinsics.checkNotNullParameter(shopId, "shopId");
            Intrinsics.checkNotNullParameter(allowedShippingCountries, "allowedShippingCountries");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            Intrinsics.checkNotNullParameter(shippingRates, "shippingRates");
            this.shopId = shopId;
            this.billingAddressRequired = z;
            this.emailRequired = z2;
            this.shippingAddressRequired = z3;
            this.allowedShippingCountries = allowedShippingCountries;
            this.lineItems = lineItems;
            this.shippingRates = shippingRates;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ShopPayConfiguration(String str, boolean z, boolean z2, boolean z3, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            List list4;
            List list5;
            List list6;
            boolean z4;
            boolean z5;
            z = (i & 2) != 0 ? true : z;
            if ((i & 4) != 0) {
                list4 = list3;
                list5 = list2;
                list6 = list;
                z4 = z3;
                z5 = true;
            } else {
                list4 = list3;
                list5 = list2;
                list6 = list;
                z4 = z3;
                z5 = z2;
            }
            this(str, z, z5, z4, list6, list5, list4);
        }

        public final String getShopId() {
            return this.shopId;
        }

        public final boolean getBillingAddressRequired() {
            return this.billingAddressRequired;
        }

        public final boolean getEmailRequired() {
            return this.emailRequired;
        }

        public final boolean getShippingAddressRequired() {
            return this.shippingAddressRequired;
        }

        public final List<String> getAllowedShippingCountries() {
            return this.allowedShippingCountries;
        }

        public final List<LineItem> getLineItems() {
            return this.lineItems;
        }

        public final List<ShippingRate> getShippingRates() {
            return this.shippingRates;
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$LineItem;", "Landroid/os/Parcelable;", "name", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getAmount", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LineItem implements Parcelable {
            private final int amount;
            private final String name;
            public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<LineItem> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LineItem createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new LineItem(parcel.readString(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LineItem[] newArray(int i) {
                    return new LineItem[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LineItem)) {
                    return false;
                }
                LineItem lineItem = (LineItem) obj;
                return Intrinsics.areEqual(this.name, lineItem.name) && this.amount == lineItem.amount;
            }

            public int hashCode() {
                return (this.name.hashCode() * 31) + this.amount;
            }

            public String toString() {
                return "LineItem(name=" + this.name + ", amount=" + this.amount + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.name);
                dest.writeInt(this.amount);
            }

            public LineItem(String name, int i) {
                Intrinsics.checkNotNullParameter(name, "name");
                this.name = name;
                this.amount = i;
            }

            public final String getName() {
                return this.name;
            }

            public final int getAmount() {
                return this.amount;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$ShippingRate;", "Landroid/os/Parcelable;", "id", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "displayName", "deliveryEstimate", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;)V", "getId", "()Ljava/lang/String;", "getAmount", "()I", "getDisplayName", "getDeliveryEstimate", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShippingRate implements Parcelable {
            public static final int $stable = 0;
            public static final Parcelable.Creator<ShippingRate> CREATOR = new Creator();
            private final int amount;
            private final DeliveryEstimate deliveryEstimate;
            private final String displayName;
            private final String id;

            /* compiled from: PaymentSheet.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ShippingRate> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShippingRate createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShippingRate(parcel.readString(), parcel.readInt(), parcel.readString(), (DeliveryEstimate) parcel.readParcelable(ShippingRate.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ShippingRate[] newArray(int i) {
                    return new ShippingRate[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShippingRate)) {
                    return false;
                }
                ShippingRate shippingRate = (ShippingRate) obj;
                return Intrinsics.areEqual(this.id, shippingRate.id) && this.amount == shippingRate.amount && Intrinsics.areEqual(this.displayName, shippingRate.displayName) && Intrinsics.areEqual(this.deliveryEstimate, shippingRate.deliveryEstimate);
            }

            public int hashCode() {
                int iHashCode = ((((this.id.hashCode() * 31) + this.amount) * 31) + this.displayName.hashCode()) * 31;
                DeliveryEstimate deliveryEstimate = this.deliveryEstimate;
                return iHashCode + (deliveryEstimate == null ? 0 : deliveryEstimate.hashCode());
            }

            public String toString() {
                return "ShippingRate(id=" + this.id + ", amount=" + this.amount + ", displayName=" + this.displayName + ", deliveryEstimate=" + this.deliveryEstimate + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.id);
                dest.writeInt(this.amount);
                dest.writeString(this.displayName);
                dest.writeParcelable(this.deliveryEstimate, flags);
            }

            public ShippingRate(String id, int i, String displayName, DeliveryEstimate deliveryEstimate) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(displayName, "displayName");
                this.id = id;
                this.amount = i;
                this.displayName = displayName;
                this.deliveryEstimate = deliveryEstimate;
            }

            public final String getId() {
                return this.id;
            }

            public final int getAmount() {
                return this.amount;
            }

            public final String getDisplayName() {
                return this.displayName;
            }

            public final DeliveryEstimate getDeliveryEstimate() {
                return this.deliveryEstimate;
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "Landroid/os/Parcelable;", "Range", "Text", "DeliveryEstimateUnit", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface DeliveryEstimate extends Parcelable {

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Range;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "maximum", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;", "minimum", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;)V", "getMaximum", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;", "getMinimum", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Range implements DeliveryEstimate {
                public static final int $stable = 0;
                public static final Parcelable.Creator<Range> CREATOR = new Creator();
                private final DeliveryEstimateUnit maximum;
                private final DeliveryEstimateUnit minimum;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Range> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Range createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Range(parcel.readInt() == 0 ? null : DeliveryEstimateUnit.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DeliveryEstimateUnit.CREATOR.createFromParcel(parcel) : null);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Range[] newArray(int i) {
                        return new Range[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Range)) {
                        return false;
                    }
                    Range range = (Range) obj;
                    return Intrinsics.areEqual(this.maximum, range.maximum) && Intrinsics.areEqual(this.minimum, range.minimum);
                }

                public int hashCode() {
                    DeliveryEstimateUnit deliveryEstimateUnit = this.maximum;
                    int iHashCode = (deliveryEstimateUnit == null ? 0 : deliveryEstimateUnit.hashCode()) * 31;
                    DeliveryEstimateUnit deliveryEstimateUnit2 = this.minimum;
                    return iHashCode + (deliveryEstimateUnit2 != null ? deliveryEstimateUnit2.hashCode() : 0);
                }

                public String toString() {
                    return "Range(maximum=" + this.maximum + ", minimum=" + this.minimum + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    DeliveryEstimateUnit deliveryEstimateUnit = this.maximum;
                    if (deliveryEstimateUnit == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        deliveryEstimateUnit.writeToParcel(dest, flags);
                    }
                    DeliveryEstimateUnit deliveryEstimateUnit2 = this.minimum;
                    if (deliveryEstimateUnit2 == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        deliveryEstimateUnit2.writeToParcel(dest, flags);
                    }
                }

                public Range(DeliveryEstimateUnit deliveryEstimateUnit, DeliveryEstimateUnit deliveryEstimateUnit2) {
                    this.maximum = deliveryEstimateUnit;
                    this.minimum = deliveryEstimateUnit2;
                }

                public final DeliveryEstimateUnit getMaximum() {
                    return this.maximum;
                }

                public final DeliveryEstimateUnit getMinimum() {
                    return this.minimum;
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$Text;", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Text implements DeliveryEstimate {
                private final String value;
                public static final Parcelable.Creator<Text> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Text> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Text createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new Text(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Text[] newArray(int i) {
                        return new Text[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Text(value=" + this.value + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.value);
                }

                public Text(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.value = value;
                }

                public final String getValue() {
                    return this.value;
                }
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit;", "Landroid/os/Parcelable;", "unit", "Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;", "value", "", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;I)V", "getUnit", "()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;", "getValue", "()I", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "TimeUnit", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DeliveryEstimateUnit implements Parcelable {
                private final TimeUnit unit;
                private final int value;
                public static final Parcelable.Creator<DeliveryEstimateUnit> CREATOR = new Creator();
                public static final int $stable = 8;

                /* compiled from: PaymentSheet.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<DeliveryEstimateUnit> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DeliveryEstimateUnit createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        return new DeliveryEstimateUnit(TimeUnit.valueOf(parcel.readString()), parcel.readInt());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final DeliveryEstimateUnit[] newArray(int i) {
                        return new DeliveryEstimateUnit[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DeliveryEstimateUnit)) {
                        return false;
                    }
                    DeliveryEstimateUnit deliveryEstimateUnit = (DeliveryEstimateUnit) obj;
                    return this.unit == deliveryEstimateUnit.unit && this.value == deliveryEstimateUnit.value;
                }

                public int hashCode() {
                    return (this.unit.hashCode() * 31) + this.value;
                }

                public String toString() {
                    return "DeliveryEstimateUnit(unit=" + this.unit + ", value=" + this.value + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int flags) {
                    Intrinsics.checkNotNullParameter(dest, "dest");
                    dest.writeString(this.unit.name());
                    dest.writeInt(this.value);
                }

                public DeliveryEstimateUnit(TimeUnit unit, int i) {
                    Intrinsics.checkNotNullParameter(unit, "unit");
                    this.unit = unit;
                    this.value = i;
                }

                public final TimeUnit getUnit() {
                    return this.unit;
                }

                public final int getValue() {
                    return this.value;
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: PaymentSheet.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration$DeliveryEstimate$DeliveryEstimateUnit$TimeUnit;", "", "<init>", "(Ljava/lang/String;I)V", "HOUR", "DAY", "BUSINESS_DAY", "WEEK", "MONTH", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class TimeUnit {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ TimeUnit[] $VALUES;
                    public static final TimeUnit HOUR = new TimeUnit("HOUR", 0);
                    public static final TimeUnit DAY = new TimeUnit("DAY", 1);
                    public static final TimeUnit BUSINESS_DAY = new TimeUnit("BUSINESS_DAY", 2);
                    public static final TimeUnit WEEK = new TimeUnit("WEEK", 3);
                    public static final TimeUnit MONTH = new TimeUnit("MONTH", 4);

                    private static final /* synthetic */ TimeUnit[] $values() {
                        return new TimeUnit[]{HOUR, DAY, BUSINESS_DAY, WEEK, MONTH};
                    }

                    public static EnumEntries<TimeUnit> getEntries() {
                        return $ENTRIES;
                    }

                    private TimeUnit(String str, int i) {
                    }

                    static {
                        TimeUnit[] timeUnitArr$values = $values();
                        $VALUES = timeUnitArr$values;
                        $ENTRIES = EnumEntriesKt.enumEntries(timeUnitArr$values);
                    }

                    public static TimeUnit valueOf(String str) {
                        return (TimeUnit) Enum.valueOf(TimeUnit.class, str);
                    }

                    public static TimeUnit[] values() {
                        return (TimeUnit[]) $VALUES.clone();
                    }
                }
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u0000 \u001e2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eJ\r\u0010\b\u001a\u00020\tH'¢\u0006\u0002\u0010\nJ$\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J$\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J$\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&J\b\u0010\u0019\u001a\u00020\tH&J\b\u0010\u001a\u001a\u00020\tH&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "", "shippingDetails", "Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "getShippingDetails", "()Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;", "setShippingDetails", "(Lcom/stripe/android/paymentsheet/addresselement/AddressDetails;)V", "WalletButtons", "", "(Landroidx/compose/runtime/Composer;I)V", "configureWithPaymentIntent", "paymentIntentClientSecret", "", "configuration", "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;", "callback", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "configureWithSetupIntent", "setupIntentClientSecret", "configureWithIntentConfiguration", "intentConfiguration", "Lcom/stripe/android/paymentsheet/PaymentSheet$IntentConfiguration;", "getPaymentOption", "Lcom/stripe/android/paymentsheet/model/PaymentOption;", "presentPaymentOptions", "confirm", "Builder", "Result", "ConfigCallback", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FlowController {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$ConfigCallback;", "", "onConfigured", "", GraphResponse.SUCCESS_KEY, "", "error", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ConfigCallback {
            void onConfigured(boolean success, Throwable error);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(componentActivity, externalPaymentMethodConfirmHandler, paymentOptionCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).build(activity)", imports = {}))
        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(componentActivity, paymentOptionCallback, createIntentCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(componentActivity, paymentOptionCallback, externalPaymentMethodConfirmHandler, createIntentCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).build(activity)", imports = {}))
        @JvmStatic
        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(componentActivity, paymentOptionCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
        @JvmStatic
        static FlowController create(Fragment fragment, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(fragment, externalPaymentMethodConfirmHandler, paymentOptionCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(fragment, paymentOptionCallback, createIntentCallback, externalPaymentMethodConfirmHandler, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).build(fragment)", imports = {}))
        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(fragment, paymentOptionCallback, createIntentCallback, paymentSheetResultCallback);
        }

        @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).build(fragment)", imports = {}))
        @JvmStatic
        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return INSTANCE.create(fragment, paymentOptionCallback, paymentSheetResultCallback);
        }

        void WalletButtons(Composer composer, int i);

        void configureWithIntentConfiguration(IntentConfiguration intentConfiguration, Configuration configuration, ConfigCallback callback);

        void configureWithPaymentIntent(String paymentIntentClientSecret, Configuration configuration, ConfigCallback callback);

        void configureWithSetupIntent(String setupIntentClientSecret, Configuration configuration, ConfigCallback callback);

        void confirm();

        PaymentOption getPaymentOption();

        AddressDetails getShippingDetails();

        void presentPaymentOptions();

        void setShippingDetails(AddressDetails addressDetails);

        /* compiled from: PaymentSheet.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void configureWithPaymentIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithPaymentIntent");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithPaymentIntent(str, configuration, configCallback);
            }

            public static /* synthetic */ void configureWithSetupIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithSetupIntent");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithSetupIntent(str, configuration, configCallback);
            }

            public static /* synthetic */ void configureWithIntentConfiguration$default(FlowController flowController, IntentConfiguration intentConfiguration, Configuration configuration, ConfigCallback configCallback, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithIntentConfiguration");
                }
                if ((i & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithIntentConfiguration(intentConfiguration, configuration, configCallback);
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u001aH\u0007J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001fH\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u000e\u0010 \u001a\u00020!2\u0006\u0010$\u001a\u00020%J\r\u0010 \u001a\u00020!H\u0007¢\u0006\u0002\u0010&J\b\u0010'\u001a\u00020(H\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Builder;", "", "resultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "paymentOptionResultCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "<init>", "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;)V", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Lcom/stripe/android/paymentsheet/PaymentOptionCallback;)V", "getResultCallback$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "getPaymentOptionResultCallback$paymentsheet_release", "()Lcom/stripe/android/paymentsheet/PaymentOptionResultCallback;", "callbacksBuilder", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks$Builder;", "externalPaymentMethodConfirmHandler", "handler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "confirmCustomPaymentMethodCallback", "callback", "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "analyticEventCallback", "Lcom/stripe/android/paymentelement/AnalyticEventCallback;", "shopPayHandlers", "handlers", "Lcom/stripe/android/paymentsheet/ShopPayHandlers;", "preparePaymentMethodHandler", "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "activity", "Landroidx/activity/ComponentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "initializeCallbacks", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Builder {
            public static final int $stable = 8;
            private final PaymentElementCallbacks.Builder callbacksBuilder;
            private final PaymentOptionResultCallback paymentOptionResultCallback;
            private final PaymentSheetResultCallback resultCallback;

            public Builder(PaymentSheetResultCallback resultCallback, PaymentOptionResultCallback paymentOptionResultCallback) {
                Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
                Intrinsics.checkNotNullParameter(paymentOptionResultCallback, "paymentOptionResultCallback");
                this.resultCallback = resultCallback;
                this.paymentOptionResultCallback = paymentOptionResultCallback;
                this.callbacksBuilder = new PaymentElementCallbacks.Builder();
            }

            /* renamed from: getResultCallback$paymentsheet_release, reason: from getter */
            public final PaymentSheetResultCallback getResultCallback() {
                return this.resultCallback;
            }

            /* renamed from: getPaymentOptionResultCallback$paymentsheet_release, reason: from getter */
            public final PaymentOptionResultCallback getPaymentOptionResultCallback() {
                return this.paymentOptionResultCallback;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Builder(PaymentSheetResultCallback resultCallback, PaymentOptionCallback paymentOptionCallback) {
                this(resultCallback, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback));
                Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
            }

            public final Builder externalPaymentMethodConfirmHandler(ExternalPaymentMethodConfirmHandler handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                this.callbacksBuilder.externalPaymentMethodConfirmHandler(handler);
                return this;
            }

            public final Builder confirmCustomPaymentMethodCallback(ConfirmCustomPaymentMethodCallback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callbacksBuilder.confirmCustomPaymentMethodCallback(callback);
                return this;
            }

            public final Builder createIntentCallback(CreateIntentCallback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callbacksBuilder.createIntentCallback(callback);
                return this;
            }

            public final Builder analyticEventCallback(AnalyticEventCallback callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.callbacksBuilder.analyticEventCallback(callback);
                return this;
            }

            public final Builder shopPayHandlers(ShopPayHandlers handlers) {
                Intrinsics.checkNotNullParameter(handlers, "handlers");
                this.callbacksBuilder.shopPayHandlers(handlers);
                return this;
            }

            public final Builder preparePaymentMethodHandler(PreparePaymentMethodHandler handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                this.callbacksBuilder.preparePaymentMethodHandler(handler);
                return this;
            }

            public final FlowController build(ComponentActivity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                initializeCallbacks();
                return new FlowControllerFactory(activity, this.paymentOptionResultCallback, this.resultCallback).create();
            }

            public final FlowController build(Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                initializeCallbacks();
                return new FlowControllerFactory(fragment, this.paymentOptionResultCallback, this.resultCallback).create();
            }

            public final FlowController build(Composer composer, int i) {
                composer.startReplaceGroup(1831213391);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1831213391, i, -1, "com.stripe.android.paymentsheet.PaymentSheet.FlowController.Builder.build (PaymentSheet.kt:3491)");
                }
                FlowController flowControllerInternalRememberPaymentSheetFlowController = FlowControllerComposeKt.internalRememberPaymentSheetFlowController(this.callbacksBuilder.build(), this.paymentOptionResultCallback, this.resultCallback, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return flowControllerInternalRememberPaymentSheetFlowController;
            }

            private final void initializeCallbacks() {
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(this.callbacksBuilder.build());
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "", "<init>", "()V", "Success", "Failure", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Result {
            public static final int $stable = 0;

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Success;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "<init>", "()V", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Success extends Result {
                public static final int $stable = 0;
                public static final Success INSTANCE = new Success();

                private Success() {
                    super(null);
                }
            }

            private Result() {
            }

            /* compiled from: PaymentSheet.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result$Failure;", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Result;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Failure extends Result {
                public static final int $stable = 8;
                private final Throwable error;

                public final Throwable getError() {
                    return this.error;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Failure(Throwable error) {
                    super(null);
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.error = error;
                }
            }
        }

        /* compiled from: PaymentSheet.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/PaymentSheet$FlowController;", "activity", "Landroidx/activity/ComponentActivity;", "paymentOptionCallback", "Lcom/stripe/android/paymentsheet/PaymentOptionCallback;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "externalPaymentMethodConfirmHandler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "fragment", "Landroidx/fragment/app/Fragment;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).build(activity)", imports = {}))
            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(activity, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
            @JvmStatic
            public final FlowController create(ComponentActivity activity, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
                return new FlowControllerFactory(activity, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).build(activity)", imports = {}))
            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).build());
                return new FlowControllerFactory(activity, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(activity)", imports = {}))
            @JvmStatic
            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
                return new FlowControllerFactory(activity, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).build(fragment)", imports = {}))
            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(fragment, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
            @JvmStatic
            public final FlowController create(Fragment fragment, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
                return new FlowControllerFactory(fragment, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).build(fragment)", imports = {}))
            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).build());
                return new FlowControllerFactory(fragment, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }

            @Deprecated(message = "This will be removed in a future release.", replaceWith = @ReplaceWith(expression = "FlowController.Builder(paymentResultCallback, paymentOptionCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build(fragment)", imports = {}))
            @JvmStatic
            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, CreateIntentCallback createIntentCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback paymentResultCallback) {
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                Intrinsics.checkNotNullParameter(paymentOptionCallback, "paymentOptionCallback");
                Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
                Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
                Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
                PaymentSheet.INSTANCE.setFlowControllerCallbacks(new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build());
                return new FlowControllerFactory(fragment, PaymentOptionCallbackKt.toResultCallback(paymentOptionCallback), paymentResultCallback).create();
            }
        }
    }

    /* compiled from: PaymentSheet.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheet$Companion;", "", "<init>", "()V", "setPaymentSheetCallbacks", "", "callbacks", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "setFlowControllerCallbacks", "resetCustomer", "context", "Landroid/content/Context;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setPaymentSheetCallbacks(PaymentElementCallbacks callbacks) {
            PaymentElementCallbackReferences.INSTANCE.set(PaymentSheetConstantsKt.PAYMENT_SHEET_DEFAULT_CALLBACK_IDENTIFIER, callbacks);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setFlowControllerCallbacks(PaymentElementCallbacks callbacks) {
            PaymentElementCallbackReferences.INSTANCE.set(PaymentSheetConstantsKt.FLOW_CONTROLLER_DEFAULT_CALLBACK_IDENTIFIER, callbacks);
        }

        public final void resetCustomer(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            new LinkStore(context).clear();
        }
    }
}
