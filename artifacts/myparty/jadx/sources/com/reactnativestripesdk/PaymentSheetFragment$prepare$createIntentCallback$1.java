package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
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

/* compiled from: PaymentSheetFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class PaymentSheetFragment$prepare$createIntentCallback$1 implements CreateIntentCallback {
    final /* synthetic */ PaymentSheetFragment this$0;

    PaymentSheetFragment$prepare$createIntentCallback$1(PaymentSheetFragment paymentSheetFragment) {
        this.this$0 = paymentSheetFragment;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentsheet.CreateIntentCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCreateIntent(PaymentMethod paymentMethod, boolean z, Continuation<? super CreateIntentResult> continuation) {
        PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1 paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1;
        if (continuation instanceof PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1) {
            paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1 = (PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1) continuation;
            if ((paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1.label & Integer.MIN_VALUE) != 0) {
                paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1.label -= Integer.MIN_VALUE;
            } else {
                paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1 = new PaymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1(this, continuation);
            }
        }
        Object objAwait = paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objAwait);
            ReactApplicationContext reactApplicationContext = this.this$0.context;
            if (reactApplicationContext == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                reactApplicationContext = null;
            }
            StripeSdkModule stripeSdkModule = (StripeSdkModule) reactApplicationContext.getNativeModule(StripeSdkModule.class);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putMap("paymentMethod", MappersKt.mapFromPaymentMethod(paymentMethod));
            writableMapCreateMap.putBoolean("shouldSavePaymentMethod", z);
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
            if (stripeSdkModule != null) {
                stripeSdkModule.emitOnConfirmHandlerCallback(writableMapCreateMap);
            }
            CompletableDeferred<ReadableMap> paymentSheetIntentCreationCallback$stripe_stripe_react_native_release = this.this$0.getPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release();
            paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1.label = 1;
            objAwait = paymentSheetIntentCreationCallback$stripe_stripe_react_native_release.await(paymentSheetFragment$prepare$createIntentCallback$1$onCreateIntent$1);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
        }
        ReadableMap readableMap = (ReadableMap) objAwait;
        this.this$0.setPaymentSheetIntentCreationCallback$stripe_stripe_react_native_release(CompletableDeferredKt.CompletableDeferred$default(null, 1, null));
        String string = readableMap.getString("clientSecret");
        if (string != null) {
            return new CreateIntentResult.Success(string);
        }
        ReadableMap map = readableMap.getMap("error");
        return new CreateIntentResult.Failure(new Exception(map != null ? map.getString("message") : null), map != null ? map.getString("localizedMessage") : null);
    }
}
