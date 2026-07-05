package com.stripe.android.googlepaylauncher;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.material.internal.ViewUtils;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GooglePayPaymentMethodLauncher.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 42\u00020\u0001:\u0007./01234B{\b\u0001\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aB)\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010\u001fB)\b\u0016\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u0019\u0010\"B?\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010#J$\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(H\u0007J2\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020,2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010(H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "skipReadyCheck", "", "context", "Landroid/content/Context;", "googlePayRepositoryFactory", "Lkotlin/Function1;", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Landroidx/activity/result/ActivityResultLauncher;ZLandroid/content/Context;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;)V", "activity", "Landroidx/activity/ComponentActivity;", "resultCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "(Landroidx/activity/ComponentActivity;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;)V", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineScope;Landroidx/activity/result/ActivityResultLauncher;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/CardBrandFilter;)V", "isReady", "present", "", "currencyCode", "", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "transactionId", "", "label", "Config", "BillingAddressConfig", "Result", "ReadyCallback", "ResultCallback", "ErrorCode", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GooglePayPaymentMethodLauncher {
    public static final int DEVELOPER_ERROR = 2;
    private static boolean HAS_SENT_INIT_ANALYTIC_EVENT = false;
    public static final int INTERNAL_ERROR = 1;
    public static final int NETWORK_ERROR = 3;
    public static final String PRODUCT_USAGE_TOKEN = "GooglePayPaymentMethodLauncher";
    private final ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher;
    private final CardBrandFilter cardBrandFilter;
    private final Config config;
    private final Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory;
    private boolean isReady;
    private final ReadyCallback readyCallback;
    private final boolean skipReadyCheck;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Target({ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ErrorCode;", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface ErrorCode {
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "", "onReady", "", "isReady", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReadyCallback {
        void onReady(boolean isReady);
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "", "onResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ResultCallback {
        void onResult(Result result);
    }

    public final void present(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, 0L, null, null, 14, null);
    }

    @Deprecated(message = "Use the present method that takes a Long as the amount instead.", replaceWith = @ReplaceWith(expression = "present(currencyCode, amount.toLong(), transactionId)", imports = {}))
    public final void present(String currencyCode, int i) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, i, null, 4, null);
    }

    public final void present(String currencyCode, long j) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, j, null, null, 12, null);
    }

    public final void present(String currencyCode, long j, String str) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, j, str, null, 8, null);
    }

    @AssistedInject
    public GooglePayPaymentMethodLauncher(@Assisted CoroutineScope lifecycleScope, @Assisted Config config, @Assisted ReadyCallback readyCallback, @Assisted ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, @Assisted boolean z, Context context, Function1<GooglePayEnvironment, GooglePayRepository> googlePayRepositoryFactory, @Assisted CardBrandFilter cardBrandFilter, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AnalyticsRequestExecutor analyticsRequestExecutor) {
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.config = config;
        this.readyCallback = readyCallback;
        this.activityResultLauncher = activityResultLauncher;
        this.skipReadyCheck = z;
        this.googlePayRepositoryFactory = googlePayRepositoryFactory;
        this.cardBrandFilter = cardBrandFilter;
        if (!HAS_SENT_INIT_ANALYTIC_EVENT) {
            HAS_SENT_INIT_ANALYTIC_EVENT = true;
            analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.GooglePayPaymentMethodLauncherInit, null, null, null, null, null, 62, null));
        }
        if (z) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(lifecycleScope, null, null, new AnonymousClass4(null), 3, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ GooglePayPaymentMethodLauncher(kotlinx.coroutines.CoroutineScope r12, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config r13, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.ReadyCallback r14, androidx.activity.result.ActivityResultLauncher r15, boolean r16, android.content.Context r17, kotlin.jvm.functions.Function1 r18, com.stripe.android.CardBrandFilter r19, com.stripe.android.networking.PaymentAnalyticsRequestFactory r20, com.stripe.android.core.networking.AnalyticsRequestExecutor r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r6 = r17
            r0 = r22
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L1f
            com.stripe.android.networking.PaymentAnalyticsRequestFactory r1 = new com.stripe.android.networking.PaymentAnalyticsRequestFactory
            com.stripe.android.PaymentConfiguration$Companion r2 = com.stripe.android.PaymentConfiguration.INSTANCE
            com.stripe.android.PaymentConfiguration r2 = r2.getInstance(r6)
            java.lang.String r2 = r2.getPublishableKey()
            java.lang.String r3 = "GooglePayPaymentMethodLauncher"
            java.util.Set r3 = kotlin.collections.SetsKt.setOf(r3)
            r1.<init>(r6, r2, r3)
            r9 = r1
            goto L21
        L1f:
            r9 = r20
        L21:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L39
            com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor r0 = new com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor
            r0.<init>()
            com.stripe.android.core.networking.AnalyticsRequestExecutor r0 = (com.stripe.android.core.networking.AnalyticsRequestExecutor) r0
            r10 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r0 = r11
            goto L46
        L39:
            r10 = r21
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
        L46:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.<init>(kotlinx.coroutines.CoroutineScope, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$Config, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$ReadyCallback, androidx.activity.result.ActivityResultLauncher, boolean, android.content.Context, kotlin.jvm.functions.Function1, com.stripe.android.CardBrandFilter, com.stripe.android.networking.PaymentAnalyticsRequestFactory, com.stripe.android.core.networking.AnalyticsRequestExecutor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncher(ComponentActivity activity, Config config, ReadyCallback readyCallback, final ResultCallback resultCallback) {
        this(activity, LifecycleOwnerKt.getLifecycleScope(activity), activity.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncher._init_$lambda$0(resultCallback, (GooglePayPaymentMethodLauncher.Result) obj);
            }
        }), config, readyCallback, DefaultCardBrandFilter.INSTANCE);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ResultCallback resultCallback, Result it) {
        Intrinsics.checkNotNullParameter(it, "it");
        resultCallback.onResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GooglePayPaymentMethodLauncher(Fragment fragment, Config config, ReadyCallback readyCallback, final ResultCallback resultCallback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
        Context contextRequireContext = fragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner);
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new GooglePayPaymentMethodLauncherContractV2(), new ActivityResultCallback() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                GooglePayPaymentMethodLauncher._init_$lambda$1(resultCallback, (GooglePayPaymentMethodLauncher.Result) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(contextRequireContext, lifecycleScope, activityResultLauncherRegisterForActivityResult, config, readyCallback, DefaultCardBrandFilter.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ResultCallback resultCallback, Result it) {
        Intrinsics.checkNotNullParameter(it, "it");
        resultCallback.onResult(it);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GooglePayPaymentMethodLauncher(final Context context, CoroutineScope lifecycleScope, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, final Config config, ReadyCallback readyCallback, CardBrandFilter cardBrandFilter) {
        this(lifecycleScope, config, readyCallback, activityResultLauncher, false, context, new Function1() { // from class: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GooglePayPaymentMethodLauncher._init_$lambda$2(context, config, (GooglePayEnvironment) obj);
            }
        }, cardBrandFilter, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GooglePayRepository _init_$lambda$2(Context context, Config config, GooglePayEnvironment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DefaultGooglePayRepository(context, config.getEnvironment(), ConvertKt.convert(config.getBillingAddressConfig()), config.getExistingPaymentMethodRequired(), config.getAllowCreditCards(), null, ErrorReporter.INSTANCE.createFallbackInstance(context, SetsKt.setOf(PRODUCT_USAGE_TOKEN)), null, null, 416, null);
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4", f = "GooglePayPaymentMethodLauncher.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass4(Continuation<AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GooglePayPaymentMethodLauncher.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation<Unit>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ReadyCallback readyCallback;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GooglePayRepository googlePayRepository = (GooglePayRepository) GooglePayPaymentMethodLauncher.this.googlePayRepositoryFactory.invoke(GooglePayPaymentMethodLauncher.this.config.getEnvironment());
                ReadyCallback readyCallback2 = GooglePayPaymentMethodLauncher.this.readyCallback;
                this.L$0 = readyCallback2;
                this.label = 1;
                obj = FlowKt.first(googlePayRepository.isReady(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                readyCallback = readyCallback2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                readyCallback = (ReadyCallback) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            Boolean bool = (Boolean) obj;
            GooglePayPaymentMethodLauncher.this.isReady = bool.booleanValue();
            readyCallback.onReady(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void present$default(GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        googlePayPaymentMethodLauncher.present(str, i, str2);
    }

    @Deprecated(message = "Use the present method that takes a Long as the amount instead.", replaceWith = @ReplaceWith(expression = "present(currencyCode, amount.toLong(), transactionId)", imports = {}))
    public final void present(String currencyCode, int amount, String transactionId) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        present$default(this, currencyCode, amount, transactionId, null, 8, null);
    }

    public static /* synthetic */ void present$default(GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncher, String str, long j, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        googlePayPaymentMethodLauncher.present(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public final void present(String currencyCode, long amount, String transactionId, String label) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        if (!this.skipReadyCheck && !this.isReady) {
            throw new IllegalStateException("present() may only be called when Google Pay is available on this device.".toString());
        }
        this.activityResultLauncher.launch(new GooglePayPaymentMethodLauncherContractV2.Args(this.config, currencyCode, amount, label, transactionId, this.cardBrandFilter));
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003JO\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020\b2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020*HÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001a\u0010\f\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0014\u0010\u001f\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0014¨\u00065"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "Landroid/os/Parcelable;", "environment", "Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "merchantCountryCode", "", "merchantName", "isEmailRequired", "", "billingAddressConfig", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "existingPaymentMethodRequired", "allowCreditCards", "<init>", "(Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;ZZ)V", "getEnvironment", "()Lcom/stripe/android/googlepaylauncher/GooglePayEnvironment;", "getMerchantCountryCode", "()Ljava/lang/String;", "getMerchantName", "()Z", "setEmailRequired", "(Z)V", "getBillingAddressConfig", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "setBillingAddressConfig", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;)V", "getExistingPaymentMethodRequired", "setExistingPaymentMethodRequired", "getAllowCreditCards", "setAllowCreditCards", "isJcbEnabled", "isJcbEnabled$payments_core_release", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {
        private boolean allowCreditCards;
        private BillingAddressConfig billingAddressConfig;
        private final GooglePayEnvironment environment;
        private boolean existingPaymentMethodRequired;
        private boolean isEmailRequired;
        private final String merchantCountryCode;
        private final String merchantName;
        public static final Parcelable.Creator<Config> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                BillingAddressConfig billingAddressConfig;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                GooglePayEnvironment googlePayEnvironmentValueOf = GooglePayEnvironment.valueOf(parcel.readString());
                String string = parcel.readString();
                String string2 = parcel.readString();
                boolean z4 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z4 = false;
                }
                BillingAddressConfig billingAddressConfigCreateFromParcel = BillingAddressConfig.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z2 = false;
                    billingAddressConfig = billingAddressConfigCreateFromParcel;
                    z3 = z;
                } else {
                    z2 = false;
                    billingAddressConfig = billingAddressConfigCreateFromParcel;
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = z;
                }
                return new Config(googlePayEnvironmentValueOf, string, string2, z4, billingAddressConfig, z3, z2);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Config[] newArray(int i) {
                return new Config[i];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName) {
            this(environment, merchantCountryCode, merchantName, false, null, false, false, 120, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z) {
            this(environment, merchantCountryCode, merchantName, z, null, false, false, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig) {
            this(environment, merchantCountryCode, merchantName, z, billingAddressConfig, false, false, 96, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2) {
            this(environment, merchantCountryCode, merchantName, z, billingAddressConfig, z2, false, 64, null);
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
        }

        public static /* synthetic */ Config copy$default(Config config, GooglePayEnvironment googlePayEnvironment, String str, String str2, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                googlePayEnvironment = config.environment;
            }
            if ((i & 2) != 0) {
                str = config.merchantCountryCode;
            }
            if ((i & 4) != 0) {
                str2 = config.merchantName;
            }
            if ((i & 8) != 0) {
                z = config.isEmailRequired;
            }
            if ((i & 16) != 0) {
                billingAddressConfig = config.billingAddressConfig;
            }
            if ((i & 32) != 0) {
                z2 = config.existingPaymentMethodRequired;
            }
            if ((i & 64) != 0) {
                z3 = config.allowCreditCards;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            BillingAddressConfig billingAddressConfig2 = billingAddressConfig;
            String str3 = str2;
            return config.copy(googlePayEnvironment, str, str3, z, billingAddressConfig2, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final GooglePayEnvironment getEnvironment() {
            return this.environment;
        }

        /* renamed from: component2, reason: from getter */
        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMerchantName() {
            return this.merchantName;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsEmailRequired() {
            return this.isEmailRequired;
        }

        /* renamed from: component5, reason: from getter */
        public final BillingAddressConfig getBillingAddressConfig() {
            return this.billingAddressConfig;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getExistingPaymentMethodRequired() {
            return this.existingPaymentMethodRequired;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        public final Config copy(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean isEmailRequired, BillingAddressConfig billingAddressConfig, boolean existingPaymentMethodRequired, boolean allowCreditCards) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
            return new Config(environment, merchantCountryCode, merchantName, isEmailRequired, billingAddressConfig, existingPaymentMethodRequired, allowCreditCards);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return this.environment == config.environment && Intrinsics.areEqual(this.merchantCountryCode, config.merchantCountryCode) && Intrinsics.areEqual(this.merchantName, config.merchantName) && this.isEmailRequired == config.isEmailRequired && Intrinsics.areEqual(this.billingAddressConfig, config.billingAddressConfig) && this.existingPaymentMethodRequired == config.existingPaymentMethodRequired && this.allowCreditCards == config.allowCreditCards;
        }

        public int hashCode() {
            return (((((((((((this.environment.hashCode() * 31) + this.merchantCountryCode.hashCode()) * 31) + this.merchantName.hashCode()) * 31) + Boolean.hashCode(this.isEmailRequired)) * 31) + this.billingAddressConfig.hashCode()) * 31) + Boolean.hashCode(this.existingPaymentMethodRequired)) * 31) + Boolean.hashCode(this.allowCreditCards);
        }

        public String toString() {
            return "Config(environment=" + this.environment + ", merchantCountryCode=" + this.merchantCountryCode + ", merchantName=" + this.merchantName + ", isEmailRequired=" + this.isEmailRequired + ", billingAddressConfig=" + this.billingAddressConfig + ", existingPaymentMethodRequired=" + this.existingPaymentMethodRequired + ", allowCreditCards=" + this.allowCreditCards + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.environment.name());
            dest.writeString(this.merchantCountryCode);
            dest.writeString(this.merchantName);
            dest.writeInt(this.isEmailRequired ? 1 : 0);
            this.billingAddressConfig.writeToParcel(dest, flags);
            dest.writeInt(this.existingPaymentMethodRequired ? 1 : 0);
            dest.writeInt(this.allowCreditCards ? 1 : 0);
        }

        public Config(GooglePayEnvironment environment, String merchantCountryCode, String merchantName, boolean z, BillingAddressConfig billingAddressConfig, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(environment, "environment");
            Intrinsics.checkNotNullParameter(merchantCountryCode, "merchantCountryCode");
            Intrinsics.checkNotNullParameter(merchantName, "merchantName");
            Intrinsics.checkNotNullParameter(billingAddressConfig, "billingAddressConfig");
            this.environment = environment;
            this.merchantCountryCode = merchantCountryCode;
            this.merchantName = merchantName;
            this.isEmailRequired = z;
            this.billingAddressConfig = billingAddressConfig;
            this.existingPaymentMethodRequired = z2;
            this.allowCreditCards = z3;
        }

        public final GooglePayEnvironment getEnvironment() {
            return this.environment;
        }

        public final String getMerchantCountryCode() {
            return this.merchantCountryCode;
        }

        public final String getMerchantName() {
            return this.merchantName;
        }

        public final boolean isEmailRequired() {
            return this.isEmailRequired;
        }

        public final void setEmailRequired(boolean z) {
            this.isEmailRequired = z;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Config(com.stripe.android.googlepaylauncher.GooglePayEnvironment r13, java.lang.String r14, java.lang.String r15, boolean r16, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.BillingAddressConfig r17, boolean r18, boolean r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r12 = this;
                r0 = r20 & 8
                if (r0 == 0) goto L7
                r0 = 0
                r5 = r0
                goto L9
            L7:
                r5 = r16
            L9:
                r0 = r20 & 16
                if (r0 == 0) goto L18
                com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig r6 = new com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig
                r10 = 7
                r11 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r6.<init>(r7, r8, r9, r10, r11)
                goto L1a
            L18:
                r6 = r17
            L1a:
                r0 = r20 & 32
                r1 = 1
                if (r0 == 0) goto L21
                r7 = r1
                goto L23
            L21:
                r7 = r18
            L23:
                r0 = r20 & 64
                if (r0 == 0) goto L2d
                r8 = r1
                r2 = r13
                r3 = r14
                r4 = r15
                r1 = r12
                goto L33
            L2d:
                r8 = r19
                r1 = r12
                r2 = r13
                r3 = r14
                r4 = r15
            L33:
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Config.<init>(com.stripe.android.googlepaylauncher.GooglePayEnvironment, java.lang.String, java.lang.String, boolean, com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final BillingAddressConfig getBillingAddressConfig() {
            return this.billingAddressConfig;
        }

        public final void setBillingAddressConfig(BillingAddressConfig billingAddressConfig) {
            Intrinsics.checkNotNullParameter(billingAddressConfig, "<set-?>");
            this.billingAddressConfig = billingAddressConfig;
        }

        public final boolean getExistingPaymentMethodRequired() {
            return this.existingPaymentMethodRequired;
        }

        public final void setExistingPaymentMethodRequired(boolean z) {
            this.existingPaymentMethodRequired = z;
        }

        public final boolean getAllowCreditCards() {
            return this.allowCreditCards;
        }

        public final void setAllowCreditCards(boolean z) {
            this.allowCreditCards = z;
        }

        public final boolean isJcbEnabled$payments_core_release() {
            return StringsKt.equals(this.merchantCountryCode, Locale.JAPAN.getCountry(), true);
        }
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig;", "Landroid/os/Parcelable;", "isRequired", "", "format", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "isPhoneNumberRequired", "<init>", "(ZLcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;Z)V", "()Z", "getFormat", "()Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "Format", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingAddressConfig implements Parcelable {
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;
        public static final Parcelable.Creator<BillingAddressConfig> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BillingAddressConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingAddressConfig(parcel.readInt() != 0, Format.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BillingAddressConfig[] newArray(int i) {
                return new BillingAddressConfig[i];
            }
        }

        public BillingAddressConfig() {
            this(false, null, false, 7, null);
        }

        public BillingAddressConfig(boolean z) {
            this(z, null, false, 6, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public BillingAddressConfig(boolean z, Format format) {
            this(z, format, false, 4, null);
            Intrinsics.checkNotNullParameter(format, "format");
        }

        public static /* synthetic */ BillingAddressConfig copy$default(BillingAddressConfig billingAddressConfig, boolean z, Format format, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = billingAddressConfig.isRequired;
            }
            if ((i & 2) != 0) {
                format = billingAddressConfig.format;
            }
            if ((i & 4) != 0) {
                z2 = billingAddressConfig.isPhoneNumberRequired;
            }
            return billingAddressConfig.copy(z, format, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        /* renamed from: component2, reason: from getter */
        public final Format getFormat() {
            return this.format;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressConfig copy(boolean isRequired, Format format, boolean isPhoneNumberRequired) {
            Intrinsics.checkNotNullParameter(format, "format");
            return new BillingAddressConfig(isRequired, format, isPhoneNumberRequired);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingAddressConfig)) {
                return false;
            }
            BillingAddressConfig billingAddressConfig = (BillingAddressConfig) other;
            return this.isRequired == billingAddressConfig.isRequired && this.format == billingAddressConfig.format && this.isPhoneNumberRequired == billingAddressConfig.isPhoneNumberRequired;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.isRequired) * 31) + this.format.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberRequired);
        }

        public String toString() {
            return "BillingAddressConfig(isRequired=" + this.isRequired + ", format=" + this.format + ", isPhoneNumberRequired=" + this.isPhoneNumberRequired + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.isRequired ? 1 : 0);
            dest.writeString(this.format.name());
            dest.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        public BillingAddressConfig(boolean z, Format format, boolean z2) {
            Intrinsics.checkNotNullParameter(format, "format");
            this.isRequired = z;
            this.format = format;
            this.isPhoneNumberRequired = z2;
        }

        public final boolean isRequired() {
            return this.isRequired;
        }

        public /* synthetic */ BillingAddressConfig(boolean z, Format format, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Format.Min : format, (i & 4) != 0 ? false : z2);
        }

        public final Format getFormat() {
            return this.format;
        }

        public final boolean isPhoneNumberRequired() {
            return this.isPhoneNumberRequired;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$BillingAddressConfig$Format;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode$payments_core_release", "()Ljava/lang/String;", "Min", "Full", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Format {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Format[] $VALUES;
            private final String code;
            public static final Format Min = new Format("Min", 0, "MIN");
            public static final Format Full = new Format("Full", 1, "FULL");

            private static final /* synthetic */ Format[] $values() {
                return new Format[]{Min, Full};
            }

            public static EnumEntries<Format> getEntries() {
                return $ENTRIES;
            }

            private Format(String str, int i, String str2) {
                this.code = str2;
            }

            /* renamed from: getCode$payments_core_release, reason: from getter */
            public final String getCode() {
                return this.code;
            }

            static {
                Format[] formatArr$values = $values();
                $VALUES = formatArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(formatArr$values);
            }

            public static Format valueOf(String str) {
                return (Format) Enum.valueOf(Format.class, str);
            }

            public static Format[] values() {
                return (Format[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "Landroid/os/Parcelable;", "<init>", "()V", AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_COMPLETED, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Canceled", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Result implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Result() {
        }

        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Completed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Completed extends Result {
            private final PaymentMethod paymentMethod;
            public static final Parcelable.Creator<Completed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: GooglePayPaymentMethodLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Completed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Completed(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Completed[] newArray(int i) {
                    return new Completed[i];
                }
            }

            public static /* synthetic */ Completed copy$default(Completed completed, PaymentMethod paymentMethod, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod = completed.paymentMethod;
                }
                return completed.copy(paymentMethod);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final Completed copy(PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                return new Completed(paymentMethod);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Completed) && Intrinsics.areEqual(this.paymentMethod, ((Completed) other).paymentMethod);
            }

            public int hashCode() {
                return this.paymentMethod.hashCode();
            }

            public String toString() {
                return "Completed(paymentMethod=" + this.paymentMethod + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.paymentMethod.writeToParcel(dest, flags);
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Completed(PaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
                this.paymentMethod = paymentMethod;
            }
        }

        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Failed;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "error", "", "errorCode", "", "<init>", "(Ljava/lang/Throwable;I)V", "getError", "()Ljava/lang/Throwable;", "getErrorCode", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Failed extends Result {
            private final Throwable error;
            private final int errorCode;
            public static final Parcelable.Creator<Failed> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: GooglePayPaymentMethodLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Failed> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Failed((Throwable) parcel.readSerializable(), parcel.readInt());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i) {
                    return new Failed[i];
                }
            }

            public static /* synthetic */ Failed copy$default(Failed failed, Throwable th, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    th = failed.error;
                }
                if ((i2 & 2) != 0) {
                    i = failed.errorCode;
                }
                return failed.copy(th, i);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            /* renamed from: component2, reason: from getter */
            public final int getErrorCode() {
                return this.errorCode;
            }

            public final Failed copy(Throwable error, @ErrorCode int errorCode) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Failed(error, errorCode);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Failed)) {
                    return false;
                }
                Failed failed = (Failed) other;
                return Intrinsics.areEqual(this.error, failed.error) && this.errorCode == failed.errorCode;
            }

            public int hashCode() {
                return (this.error.hashCode() * 31) + Integer.hashCode(this.errorCode);
            }

            public String toString() {
                return "Failed(error=" + this.error + ", errorCode=" + this.errorCode + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.error);
                dest.writeInt(this.errorCode);
            }

            public final Throwable getError() {
                return this.error;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(Throwable error, @ErrorCode int i) {
                super(null);
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
                this.errorCode = i;
            }
        }

        /* compiled from: GooglePayPaymentMethodLauncher.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result$Canceled;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Canceled extends Result {
            public static final Canceled INSTANCE = new Canceled();
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: GooglePayPaymentMethodLauncher.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Canceled> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Canceled.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
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
                if (!(other instanceof Canceled)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -299418266;
            }

            public String toString() {
                return "Canceled";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Canceled() {
                super(null);
            }
        }
    }

    /* compiled from: GooglePayPaymentMethodLauncher.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Companion;", "", "<init>", "()V", "PRODUCT_USAGE_TOKEN", "", "HAS_SENT_INIT_ANALYTIC_EVENT", "", "getHAS_SENT_INIT_ANALYTIC_EVENT$payments_core_release", "()Z", "setHAS_SENT_INIT_ANALYTIC_EVENT$payments_core_release", "(Z)V", "INTERNAL_ERROR", "", "DEVELOPER_ERROR", "NETWORK_ERROR", "rememberLauncher", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "resultCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;", "(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getHAS_SENT_INIT_ANALYTIC_EVENT$payments_core_release() {
            return GooglePayPaymentMethodLauncher.HAS_SENT_INIT_ANALYTIC_EVENT;
        }

        public final void setHAS_SENT_INIT_ANALYTIC_EVENT$payments_core_release(boolean z) {
            GooglePayPaymentMethodLauncher.HAS_SENT_INIT_ANALYTIC_EVENT = z;
        }

        @Deprecated(message = "Use rememberGooglePayPaymentMethodLauncher() instead", replaceWith = @ReplaceWith(expression = "rememberGooglePayPaymentMethodLauncher(config, readyCallback, resultCallback)", imports = {}))
        public final GooglePayPaymentMethodLauncher rememberLauncher(Config config, ReadyCallback readyCallback, ResultCallback resultCallback, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(readyCallback, "readyCallback");
            Intrinsics.checkNotNullParameter(resultCallback, "resultCallback");
            composer.startReplaceGroup(1407609479);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1407609479, i, -1, "com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher.Companion.rememberLauncher (GooglePayPaymentMethodLauncher.kt:382)");
            }
            GooglePayPaymentMethodLauncher googlePayPaymentMethodLauncherRememberGooglePayPaymentMethodLauncher = GooglePayPaymentMethodLauncherKt.rememberGooglePayPaymentMethodLauncher(config, readyCallback, resultCallback, composer, i & 1022);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return googlePayPaymentMethodLauncherRememberGooglePayPaymentMethodLauncher;
        }
    }
}
