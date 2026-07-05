package com.stripe.android.common.ui;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ElementsBottomSheetLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1", f = "ElementsBottomSheetLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ StripeBottomSheetLayoutInfo $layoutInfo;
    final /* synthetic */ State<Float> $statusBarColorAlpha$delegate;
    final /* synthetic */ SystemUiController $systemUiController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1(SystemUiController systemUiController, StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, State<Float> state, Continuation<? super ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1> continuation) {
        super(2, continuation);
        this.$systemUiController = systemUiController;
        this.$layoutInfo = stripeBottomSheetLayoutInfo;
        this.$statusBarColorAlpha$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1(this.$systemUiController, this.$layoutInfo, this.$statusBarColorAlpha$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SystemUiController.m6995setStatusBarColorek8zF_U$default(this.$systemUiController, Color.m3656copywmQWz5c$default(this.$layoutInfo.m8855getScrimColor0d7_KjU(), ElementsBottomSheetLayoutKt.ElementsBottomSheetLayout_TN_CM5M$lambda$1(this.$statusBarColorAlpha$delegate), 0.0f, 0.0f, 0.0f, 14, null), false, null, 4, null);
        return Unit.INSTANCE;
    }
}
