package com.stripe.android.paymentsheet;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.PaymentElementComposeKt;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.utils.ComposeUtilsKt;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: PaymentSheetCompose.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\u0016\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u008a\u0084\u0002"}, d2 = {"rememberPaymentSheet", "Lcom/stripe/android/paymentsheet/PaymentSheet;", "paymentResultCallback", "Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;", "(Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;", "createIntentCallback", "Lcom/stripe/android/paymentsheet/CreateIntentCallback;", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;", "externalPaymentMethodConfirmHandler", "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;", "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;II)Lcom/stripe/android/paymentsheet/PaymentSheet;", "internalRememberPaymentSheet", "callbacks", "Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;", "(Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbacks;Lcom/stripe/android/paymentsheet/PaymentSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentsheet/PaymentSheet;", "paymentsheet_release", "onResult", "Lkotlin/reflect/KFunction1;", "Lcom/stripe/android/paymentsheet/PaymentSheetResult;", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentSheetComposeKt {
    @Deprecated(message = "This will be removed in a future release. Use PaymentSheet.Builder instead.", replaceWith = @ReplaceWith(expression = "remember(paymentResultCallback) { PaymentSheet.Builder(paymentResultCallback) }.build()", imports = {}))
    public static final PaymentSheet rememberPaymentSheet(PaymentSheetResultCallback paymentResultCallback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        composer.startReplaceGroup(881058831);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(881058831, i, -1, "com.stripe.android.paymentsheet.rememberPaymentSheet (PaymentSheetCompose.kt:32)");
        }
        composer.startReplaceGroup(-743830185);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PaymentElementCallbacks.Builder().build();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PaymentSheet paymentSheetInternalRememberPaymentSheet = internalRememberPaymentSheet((PaymentElementCallbacks) objRememberedValue, paymentResultCallback, composer, (i << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paymentSheetInternalRememberPaymentSheet;
    }

    @Deprecated(message = "This will be removed in a future release. Use PaymentSheet.Builder instead.", replaceWith = @ReplaceWith(expression = "remember(createIntentCallback, paymentResultCallback) { PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback) }.build()", imports = {}))
    public static final PaymentSheet rememberPaymentSheet(CreateIntentCallback createIntentCallback, PaymentSheetResultCallback paymentResultCallback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(createIntentCallback, "createIntentCallback");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        composer.startReplaceGroup(-76394744);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-76394744, i, -1, "com.stripe.android.paymentsheet.rememberPaymentSheet (PaymentSheetCompose.kt:66)");
        }
        composer.startReplaceGroup(-743790395);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(createIntentCallback)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).build();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PaymentSheet paymentSheetInternalRememberPaymentSheet = internalRememberPaymentSheet((PaymentElementCallbacks) objRememberedValue, paymentResultCallback, composer, i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paymentSheetInternalRememberPaymentSheet;
    }

    @Deprecated(message = "This will be removed in a future release. Use PaymentSheet.Builder instead.", replaceWith = @ReplaceWith(expression = "remember(createIntentCallback, externalPaymentMethodConfirmHandler, paymentResultCallback) { PaymentSheet.Builder(paymentResultCallback).createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler) }.build()", imports = {}))
    public static final PaymentSheet rememberPaymentSheet(CreateIntentCallback createIntentCallback, ExternalPaymentMethodConfirmHandler externalPaymentMethodConfirmHandler, PaymentSheetResultCallback paymentResultCallback, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(externalPaymentMethodConfirmHandler, "externalPaymentMethodConfirmHandler");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        composer.startReplaceGroup(-1553300286);
        boolean z = true;
        if ((i2 & 1) != 0) {
            createIntentCallback = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1553300286, i, -1, "com.stripe.android.paymentsheet.rememberPaymentSheet (PaymentSheetCompose.kt:107)");
        }
        composer.startReplaceGroup(-743732256);
        boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(createIntentCallback)) || (i & 6) == 4;
        if ((((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) <= 32 || !composer.changed(externalPaymentMethodConfirmHandler)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objRememberedValue = composer.rememberedValue();
        if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PaymentElementCallbacks.Builder().createIntentCallback(createIntentCallback).externalPaymentMethodConfirmHandler(externalPaymentMethodConfirmHandler).build();
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        PaymentSheet paymentSheetInternalRememberPaymentSheet = internalRememberPaymentSheet((PaymentElementCallbacks) objRememberedValue, paymentResultCallback, composer, (i >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paymentSheetInternalRememberPaymentSheet;
    }

    public static final PaymentSheet internalRememberPaymentSheet(PaymentElementCallbacks callbacks, PaymentSheetResultCallback paymentResultCallback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(paymentResultCallback, "paymentResultCallback");
        composer.startReplaceGroup(750973432);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(750973432, i, -1, "com.stripe.android.paymentsheet.internalRememberPaymentSheet (PaymentSheetCompose.kt:125)");
        }
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(-501681967);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentSheetComposeKt.internalRememberPaymentSheet$lambda$4$lambda$3();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Object objM3243rememberSaveable = RememberSaveableKt.m3243rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composer, 3072, 6);
        Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable, "rememberSaveable(...)");
        String str = (String) objM3243rememberSaveable;
        PaymentElementComposeKt.UpdateCallbacks(str, callbacks, composer, (i << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        composer.startReplaceGroup(-501676720);
        int i2 = (i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48;
        boolean z = (i2 > 32 && composer.changedInstance(paymentResultCallback)) || (i & 48) == 32;
        PaymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1 paymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1RememberedValue = composer.rememberedValue();
        if (z || paymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            paymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1RememberedValue = new PaymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1(paymentResultCallback);
            composer.updateRememberedValue(paymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1RememberedValue);
        }
        composer.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new PaymentSheetContractV2(), (Function1) internalRememberPaymentSheet$lambda$6(SnapshotStateKt.rememberUpdatedState((KFunction) paymentSheetComposeKt$internalRememberPaymentSheet$onResult$2$1RememberedValue, composer, 0)), composer, 0);
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) objConsume;
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume2;
        composer.startReplaceGroup(-501666319);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.PaymentSheetComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PaymentSheetComposeKt.internalRememberPaymentSheet$lambda$8$lambda$7();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Activity activityRememberActivity = ComposeUtilsKt.rememberActivity((Function0) objRememberedValue2, composer, 6);
        composer.startReplaceGroup(-501663038);
        boolean z2 = (i2 > 32 && composer.changed(paymentResultCallback)) || (i & 48) == 32;
        Object objRememberedValue3 = composer.rememberedValue();
        if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            PaymentSheet paymentSheet = new PaymentSheet(new DefaultPaymentSheetLauncher(managedActivityResultLauncherRememberLauncherForActivityResult, activityRememberActivity, lifecycleOwner, (Application) applicationContext, paymentResultCallback, str, true));
            composer.updateRememberedValue(paymentSheet);
            objRememberedValue3 = paymentSheet;
        }
        PaymentSheet paymentSheet2 = (PaymentSheet) objRememberedValue3;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return paymentSheet2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String internalRememberPaymentSheet$lambda$4$lambda$3() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String internalRememberPaymentSheet$lambda$8$lambda$7() {
        return "PaymentSheet must be created in the context of an Activity";
    }

    private static final KFunction<Unit> internalRememberPaymentSheet$lambda$6(State<? extends KFunction<Unit>> state) {
        return state.getValue();
    }
}
