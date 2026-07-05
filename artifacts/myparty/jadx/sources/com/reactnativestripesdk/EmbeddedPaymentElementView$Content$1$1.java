package com.reactnativestripesdk;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.reactnativestripesdk.EmbeddedPaymentElementView;
import com.stripe.android.paymentelement.EmbeddedPaymentElement;
import com.stripe.android.paymentsheet.PaymentSheet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: EmbeddedPaymentElementView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.reactnativestripesdk.EmbeddedPaymentElementView$Content$1$1", f = "EmbeddedPaymentElementView.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class EmbeddedPaymentElementView$Content$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EmbeddedPaymentElement $embedded;
    int label;
    final /* synthetic */ EmbeddedPaymentElementView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmbeddedPaymentElementView$Content$1$1(EmbeddedPaymentElementView embeddedPaymentElementView, EmbeddedPaymentElement embeddedPaymentElement, Continuation<? super EmbeddedPaymentElementView$Content$1$1> continuation) {
        super(2, continuation);
        this.this$0 = embeddedPaymentElementView;
        this.$embedded = embeddedPaymentElement;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmbeddedPaymentElementView$Content$1$1(this.this$0, this.$embedded, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmbeddedPaymentElementView$Content$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: EmbeddedPaymentElementView.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.reactnativestripesdk.EmbeddedPaymentElementView$Content$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ EmbeddedPaymentElement $embedded;
        final /* synthetic */ EmbeddedPaymentElementView this$0;

        AnonymousClass1(EmbeddedPaymentElement embeddedPaymentElement, EmbeddedPaymentElementView embeddedPaymentElementView) {
            this.$embedded = embeddedPaymentElement;
            this.this$0 = embeddedPaymentElementView;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(EmbeddedPaymentElementView.Event event, Continuation<? super Unit> continuation) {
            EmbeddedPaymentElementView$Content$1$1$1$emit$1 embeddedPaymentElementView$Content$1$1$1$emit$1;
            if (continuation instanceof EmbeddedPaymentElementView$Content$1$1$1$emit$1) {
                embeddedPaymentElementView$Content$1$1$1$emit$1 = (EmbeddedPaymentElementView$Content$1$1$1$emit$1) continuation;
                if ((embeddedPaymentElementView$Content$1$1$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                    embeddedPaymentElementView$Content$1$1$1$emit$1.label -= Integer.MIN_VALUE;
                } else {
                    embeddedPaymentElementView$Content$1$1$1$emit$1 = new EmbeddedPaymentElementView$Content$1$1$1$emit$1(this, continuation);
                }
            }
            Object objConfigure = embeddedPaymentElementView$Content$1$1$1$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = embeddedPaymentElementView$Content$1$1$1$emit$1.label;
            if (i == 0) {
                ResultKt.throwOnFailure(objConfigure);
                if (event instanceof EmbeddedPaymentElementView.Event.Configure) {
                    EmbeddedPaymentElement embeddedPaymentElement = this.$embedded;
                    EmbeddedPaymentElementView.Event.Configure configure = (EmbeddedPaymentElementView.Event.Configure) event;
                    PaymentSheet.IntentConfiguration intentConfiguration = configure.getIntentConfiguration();
                    EmbeddedPaymentElement.Configuration configuration = configure.getConfiguration();
                    embeddedPaymentElementView$Content$1$1$1$emit$1.label = 1;
                    objConfigure = embeddedPaymentElement.configure(intentConfiguration, configuration, embeddedPaymentElementView$Content$1$1$1$emit$1);
                    if (objConfigure == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (event instanceof EmbeddedPaymentElementView.Event.Confirm) {
                        this.$embedded.confirm();
                    } else {
                        if (!(event instanceof EmbeddedPaymentElementView.Event.ClearPaymentOption)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.$embedded.clearPaymentOption();
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConfigure);
            }
            EmbeddedPaymentElement.ConfigureResult configureResult = (EmbeddedPaymentElement.ConfigureResult) objConfigure;
            if (configureResult instanceof EmbeddedPaymentElement.ConfigureResult.Succeeded) {
                this.this$0.reportHeightChange(1.0f);
            } else {
                if (!(configureResult instanceof EmbeddedPaymentElement.ConfigureResult.Failed)) {
                    throw new NoWhenBranchMatchedException();
                }
                Throwable error = ((EmbeddedPaymentElement.ConfigureResult.Failed) configureResult).getError();
                String localizedMessage = error.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = error.toString();
                }
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("message", localizedMessage);
                Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "apply(...)");
                this.this$0.requireStripeSdkModule().emitEmbeddedPaymentElementLoadingFailed(writableMapCreateMap);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((EmbeddedPaymentElementView.Event) obj, (Continuation<? super Unit>) continuation);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (FlowKt.consumeAsFlow(this.this$0.events).collect(new AnonymousClass1(this.$embedded, this.this$0), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
