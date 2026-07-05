package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.utils.KeepJsAwakeTask;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.CreateIntentCallback;
import com.stripe.android.paymentsheet.CreateIntentResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$builder$1$1 implements CreateIntentCallback {
    final /* synthetic */ EmbeddedPaymentElementView this$0;

    EmbeddedPaymentElementView$Content$builder$1$1(EmbeddedPaymentElementView embeddedPaymentElementView) {
        this.this$0 = embeddedPaymentElementView;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.CreateIntentCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCreateIntent(PaymentMethod paymentMethod, boolean z, Continuation<? super CreateIntentResult> continuation) {
        EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1 embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1;
        StripeSdkModule stripeSdkModule;
        KeepJsAwakeTask keepJsAwakeTask;
        if (continuation instanceof EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1) {
            embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1 = (EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1) continuation;
            if ((embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.label & Integer.MIN_VALUE) != 0) {
                embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.label -= Integer.MIN_VALUE;
            } else {
                embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1 = new EmbeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1(this, continuation);
            }
        }
        Object obj = embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                StripeSdkModule stripeSdkModuleRequireStripeSdkModule = this.this$0.requireStripeSdkModule();
                KeepJsAwakeTask keepJsAwakeTask2 = new KeepJsAwakeTask(this.this$0.getReactContext().getReactApplicationContext());
                keepJsAwakeTask2.start();
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putMap("paymentMethod", MappersKt.mapFromPaymentMethod(paymentMethod));
                writableMapCreateMap.putBoolean("shouldSavePaymentMethod", z);
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
                stripeSdkModuleRequireStripeSdkModule.emitOnConfirmHandlerCallback(writableMapCreateMap);
                CompletableDeferred<ReadableMap> embeddedIntentCreationCallback$stripe_stripe_react_native_release = stripeSdkModuleRequireStripeSdkModule.getEmbeddedIntentCreationCallback$stripe_stripe_react_native_release();
                embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.L$0 = stripeSdkModuleRequireStripeSdkModule;
                embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.L$1 = keepJsAwakeTask2;
                embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.label = 1;
                Object objAwait = embeddedIntentCreationCallback$stripe_stripe_react_native_release.await(embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                stripeSdkModule = stripeSdkModuleRequireStripeSdkModule;
                obj = objAwait;
                keepJsAwakeTask = keepJsAwakeTask2;
            } catch (IllegalArgumentException unused) {
                return new CreateIntentResult.Failure(new Exception("Tried to call confirmHandler, but no callback was found. Please file an issue: https://github.com/stripe/stripe-react-native/issues"), "An unexpected error occurred");
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            keepJsAwakeTask = (KeepJsAwakeTask) embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.L$1;
            stripeSdkModule = (StripeSdkModule) embeddedPaymentElementView$Content$builder$1$1$onCreateIntent$1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        ReadableMap readableMap = (ReadableMap) obj;
        stripeSdkModule.setEmbeddedIntentCreationCallback$stripe_stripe_react_native_release(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        keepJsAwakeTask.stop();
        String string = readableMap.getString("clientSecret");
        if (string != null) {
            return new CreateIntentResult.Success(string);
        }
        ReadableMap map = readableMap.getMap("error");
        return new CreateIntentResult.Failure(new Exception(map != null ? map.getString("message") : null), map != null ? map.getString("localizedMessage") : null);
    }
}
