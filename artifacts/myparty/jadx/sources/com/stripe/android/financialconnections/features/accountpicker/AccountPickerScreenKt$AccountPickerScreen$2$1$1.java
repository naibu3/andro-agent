package com.stripe.android.financialconnections.features.accountpicker;

import androidx.compose.ui.platform.UriHandler;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountPickerScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.features.accountpicker.AccountPickerScreenKt$AccountPickerScreen$2$1$1", f = "AccountPickerScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class AccountPickerScreenKt$AccountPickerScreen$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UriHandler $uriHandler;
    final /* synthetic */ AccountPickerState.ViewEffect $viewEffect;
    final /* synthetic */ AccountPickerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountPickerScreenKt$AccountPickerScreen$2$1$1(AccountPickerState.ViewEffect viewEffect, UriHandler uriHandler, AccountPickerViewModel accountPickerViewModel, Continuation<? super AccountPickerScreenKt$AccountPickerScreen$2$1$1> continuation) {
        super(2, continuation);
        this.$viewEffect = viewEffect;
        this.$uriHandler = uriHandler;
        this.$viewModel = accountPickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountPickerScreenKt$AccountPickerScreen$2$1$1(this.$viewEffect, this.$uriHandler, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountPickerScreenKt$AccountPickerScreen$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AccountPickerState.ViewEffect viewEffect = this.$viewEffect;
        if (!(viewEffect instanceof AccountPickerState.ViewEffect.OpenUrl)) {
            throw new NoWhenBranchMatchedException();
        }
        this.$uriHandler.openUri(((AccountPickerState.ViewEffect.OpenUrl) viewEffect).getUrl());
        this.$viewModel.onViewEffectLaunched();
        return Unit.INSTANCE;
    }
}
