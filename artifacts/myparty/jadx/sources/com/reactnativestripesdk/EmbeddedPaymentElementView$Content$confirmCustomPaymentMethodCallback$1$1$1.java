package com.reactnativestripesdk;

import com.facebook.react.bridge.ReadableMap;
import com.reactnativestripesdk.utils.KeepJsAwakeTask;
import com.reactnativestripesdk.utils.MappersKt;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentelement.CustomPaymentMethodResult;
import com.stripe.android.paymentelement.CustomPaymentMethodResultHandler;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1", f = "EmbeddedPaymentElementView.kt", i = {}, l = {111, 119}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethod.BillingDetails $billingDetails;
    final /* synthetic */ PaymentSheet.CustomPaymentMethod $customPaymentMethod;
    final /* synthetic */ KeepJsAwakeTask $keepJsAwakeTask;
    final /* synthetic */ StripeSdkModule $stripeSdkModule;
    int label;
    final /* synthetic */ EmbeddedPaymentElementView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1(StripeSdkModule stripeSdkModule, PaymentSheet.CustomPaymentMethod customPaymentMethod, PaymentMethod.BillingDetails billingDetails, KeepJsAwakeTask keepJsAwakeTask, EmbeddedPaymentElementView embeddedPaymentElementView, Continuation<? super EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1> continuation) {
        super(2, continuation);
        this.$stripeSdkModule = stripeSdkModule;
        this.$customPaymentMethod = customPaymentMethod;
        this.$billingDetails = billingDetails;
        this.$keepJsAwakeTask = keepJsAwakeTask;
        this.this$0 = embeddedPaymentElementView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1(this.$stripeSdkModule, this.$customPaymentMethod, this.$billingDetails, this.$keepJsAwakeTask, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmbeddedPaymentElementView$Content$confirmCustomPaymentMethodCallback$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r6 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CustomPaymentMethodResult customPaymentMethodResultFailed;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ReadableMap readableMap = (ReadableMap) obj;
                this.$keepJsAwakeTask.stop();
                String string = readableMap.getString("status");
                if (string != null) {
                    int iHashCode = string.hashCode();
                    if (iHashCode != -1402931637) {
                        if (iHashCode != -1281977283) {
                            if (iHashCode == -123173735 && string.equals("canceled")) {
                                customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.canceled();
                            } else {
                                customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                            }
                        } else if (string.equals("failed")) {
                            String string2 = readableMap.getString("error");
                            if (string2 == null) {
                                string2 = "Custom payment failed";
                            }
                            customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed(string2);
                        } else {
                            customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                        }
                    } else if (string.equals("completed")) {
                        customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.completed();
                    } else {
                        customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                    }
                } else {
                    customPaymentMethodResultFailed = CustomPaymentMethodResult.INSTANCE.failed("Unknown status");
                }
                CustomPaymentMethodResultHandler.handleCustomPaymentMethodResult(this.this$0.getReactContext(), customPaymentMethodResultFailed);
                CustomPaymentMethodActivity.INSTANCE.finishCurrent();
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.$stripeSdkModule.emitOnCustomPaymentMethodConfirmHandlerCallback(MappersKt.mapFromCustomPaymentMethod(this.$customPaymentMethod, this.$billingDetails));
            this.label = 2;
            obj = this.$stripeSdkModule.getCustomPaymentMethodResultCallback$stripe_stripe_react_native_release().await(this);
        } catch (Throwable th) {
            CustomPaymentMethodActivity.INSTANCE.finishCurrent();
            throw th;
        }
    }
}
