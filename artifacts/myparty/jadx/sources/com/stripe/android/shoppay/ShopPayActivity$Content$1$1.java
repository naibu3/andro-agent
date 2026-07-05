package com.stripe.android.shoppay;

import androidx.appcompat.app.AppCompatDelegate;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ShopPayActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.shoppay.ShopPayActivity$Content$1$1", f = "ShopPayActivity.kt", i = {}, l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ShopPayActivity$Content$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetState $bottomSheetState;
    final /* synthetic */ CoroutineScope $scope;
    int label;
    final /* synthetic */ ShopPayActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShopPayActivity$Content$1$1(ShopPayActivity shopPayActivity, CoroutineScope coroutineScope, StripeBottomSheetState stripeBottomSheetState, Continuation<? super ShopPayActivity$Content$1$1> continuation) {
        super(2, continuation);
        this.this$0 = shopPayActivity;
        this.$scope = coroutineScope;
        this.$bottomSheetState = stripeBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShopPayActivity$Content$1$1(this.this$0, this.$scope, this.$bottomSheetState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShopPayActivity$Content$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<ShopPayActivityResult> paymentResult = this.this$0.getViewModel().getPaymentResult();
            final CoroutineScope coroutineScope = this.$scope;
            final StripeBottomSheetState stripeBottomSheetState = this.$bottomSheetState;
            final ShopPayActivity shopPayActivity = this.this$0;
            this.label = 1;
            if (paymentResult.collect(new FlowCollector() { // from class: com.stripe.android.shoppay.ShopPayActivity$Content$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((ShopPayActivityResult) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(ShopPayActivityResult shopPayActivityResult, Continuation<? super Unit> continuation) {
                    ShopPayActivity.Content$dismiss(coroutineScope, stripeBottomSheetState, shopPayActivity, shopPayActivityResult);
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
