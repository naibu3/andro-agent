package com.stripe.android.payments.paymentlauncher;

import android.app.Activity;
import android.view.Window;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.payments.paymentlauncher.PaymentLauncher;
import com.stripe.android.utils.ComposeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: PaymentLauncher.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"rememberPaymentLauncher", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "publishableKey", "", NamedConstantsKt.STRIPE_ACCOUNT_ID, "callback", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentLauncherKt {
    public static final PaymentLauncher rememberPaymentLauncher(String publishableKey, String str, PaymentLauncher.PaymentResultCallback callback, Composer composer, int i, int i2) {
        Window window;
        Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(-2089379101);
        Integer numValueOf = null;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2089379101, i, -1, "com.stripe.android.payments.paymentlauncher.rememberPaymentLauncher (PaymentLauncher.kt:159)");
        }
        Activity activityRememberActivityOrNull = ComposeUtilsKt.rememberActivityOrNull(composer, 0);
        composer.startReplaceGroup(1706894441);
        boolean z = (((i & 896) ^ BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) > 256 && composer.changed(callback)) || (i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 256;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = PaymentLauncherUtilsKt.toInternalResultCallback(callback);
            composer.updateRememberedValue(objRememberedValue);
        }
        PaymentLauncher.InternalPaymentResultCallback internalPaymentResultCallback = (PaymentLauncher.InternalPaymentResultCallback) objRememberedValue;
        composer.endReplaceGroup();
        PaymentLauncherContract paymentLauncherContract = new PaymentLauncherContract();
        composer.startReplaceGroup(1706900260);
        boolean zChangedInstance = composer.changedInstance(internalPaymentResultCallback);
        PaymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1 paymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || paymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            paymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1RememberedValue = new PaymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1(internalPaymentResultCallback);
            composer.updateRememberedValue(paymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1RememberedValue);
        }
        composer.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(paymentLauncherContract, (Function1) ((KFunction) paymentLauncherKt$rememberPaymentLauncher$activityResultLauncher$1$1RememberedValue), composer, 0);
        composer.startReplaceGroup(1706902144);
        boolean z2 = ((((i & 14) ^ 6) > 4 && composer.changed(publishableKey)) || (i & 6) == 4) | ((((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer.changed(str)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            ManagedActivityResultLauncher managedActivityResultLauncher = managedActivityResultLauncherRememberLauncherForActivityResult;
            if (activityRememberActivityOrNull != null && (window = activityRememberActivityOrNull.getWindow()) != null) {
                numValueOf = Integer.valueOf(window.getStatusBarColor());
            }
            objRememberedValue2 = new PaymentLauncherFactory(managedActivityResultLauncher, numValueOf).create(publishableKey, str);
            composer.updateRememberedValue(objRememberedValue2);
        }
        PaymentLauncher paymentLauncher = (PaymentLauncher) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paymentLauncher;
    }
}
