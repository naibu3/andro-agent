package com.stripe.android.paymentelement;

import android.app.Activity;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.stripe.android.common.ui.PaymentElementActivityResultCaller;
import com.stripe.android.common.ui.PaymentElementComposeKt;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentelement.callbacks.PaymentElementCallbacks;
import com.stripe.android.utils.ComposeUtilsKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: EmbeddedPaymentElementKtx.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\u0016\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u008a\u0084\u0002"}, d2 = {"rememberEmbeddedPaymentElement", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "builder", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;", "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;", "paymentsheet_release", "onResult", "Lkotlin/reflect/KFunction1;", "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedPaymentElementKtxKt {
    public static final EmbeddedPaymentElement rememberEmbeddedPaymentElement(EmbeddedPaymentElement.Builder builder, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        composer.startReplaceGroup(-1817466434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1817466434, i, -1, "com.stripe.android.paymentelement.rememberEmbeddedPaymentElement (EmbeddedPaymentElementKtx.kt:25)");
        }
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalArgumentException("EmbeddedPaymentElement must have a ViewModelStoreOwner.".toString());
        }
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(-2107239426);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmbeddedPaymentElementKtxKt.rememberEmbeddedPaymentElement$lambda$2$lambda$1();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        Object objM3243rememberSaveable = RememberSaveableKt.m3243rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composer, 3072, 6);
        Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable, "rememberSaveable(...)");
        String str = (String) objM3243rememberSaveable;
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
        ActivityResultRegistryOwner current2 = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, LocalActivityResultRegistryOwner.$stable);
        if (current2 == null) {
            throw new IllegalArgumentException("EmbeddedPaymentElement must have an ActivityResultRegistryOwner.".toString());
        }
        EmbeddedPaymentElement.ResultCallback resultCallback = builder.getResultCallback();
        composer.startReplaceGroup(-2107228878);
        boolean zChangedInstance = composer.changedInstance(resultCallback);
        EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1 embeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1RememberedValue = composer.rememberedValue();
        if (zChangedInstance || embeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
            embeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1RememberedValue = new EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1(resultCallback);
            composer.updateRememberedValue(embeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1RememberedValue);
        }
        composer.endReplaceGroup();
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState((KFunction) embeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1RememberedValue, composer, 0);
        composer.startReplaceGroup(-2107226551);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentelement.EmbeddedPaymentElementKtxKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EmbeddedPaymentElementKtxKt.rememberEmbeddedPaymentElement$lambda$7$lambda$6();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        Activity activityRememberActivity = ComposeUtilsKt.rememberActivity((Function0) objRememberedValue2, composer, 6);
        composer.startReplaceGroup(-2107222175);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = EmbeddedPaymentElement.INSTANCE.create(activityRememberActivity, new PaymentElementActivityResultCaller("EmbeddedPaymentElement(instance = " + str + ")", current2), current, lifecycleOwner, str, new EmbeddedPaymentElementKtxKt$sam$com_stripe_android_paymentelement_EmbeddedPaymentElement_ResultCallback$0((Function1) rememberEmbeddedPaymentElement$lambda$5(stateRememberUpdatedState)));
            composer.updateRememberedValue(objRememberedValue3);
        }
        EmbeddedPaymentElement embeddedPaymentElement = (EmbeddedPaymentElement) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-2107202984);
        boolean zChanged = composer.changed(builder);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            PaymentElementCallbacks.Builder builder2 = new PaymentElementCallbacks.Builder();
            EmbeddedPaymentElement.Builder.DeferredHandler deferredHandler = builder.getDeferredHandler();
            if (deferredHandler instanceof EmbeddedPaymentElement.Builder.DeferredHandler.Intent) {
                builder2.createIntentCallback(((EmbeddedPaymentElement.Builder.DeferredHandler.Intent) deferredHandler).getCreateIntentCallback());
            } else {
                if (!(deferredHandler instanceof EmbeddedPaymentElement.Builder.DeferredHandler.SharedPaymentToken)) {
                    throw new NoWhenBranchMatchedException();
                }
                builder2.preparePaymentMethodHandler(((EmbeddedPaymentElement.Builder.DeferredHandler.SharedPaymentToken) deferredHandler).getPreparePaymentMethodHandler());
            }
            objRememberedValue4 = builder2.confirmCustomPaymentMethodCallback(builder.getConfirmCustomPaymentMethodCallback()).externalPaymentMethodConfirmHandler(builder.getExternalPaymentMethodConfirmHandler()).analyticEventCallback(builder.getAnalyticEventCallback()).rowSelectionImmediateActionCallback(builder.getRowSelectionBehavior(), embeddedPaymentElement).build();
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        PaymentElementComposeKt.UpdateCallbacks(str, (PaymentElementCallbacks) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return embeddedPaymentElement;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberEmbeddedPaymentElement$lambda$2$lambda$1() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberEmbeddedPaymentElement$lambda$7$lambda$6() {
        return "EmbeddedPaymentElement must be created in the context of an Activity.";
    }

    private static final KFunction<Unit> rememberEmbeddedPaymentElement$lambda$5(State<? extends KFunction<Unit>> state) {
        return state.getValue();
    }
}
