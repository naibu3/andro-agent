package com.stripe.android.uicore.navigation;

import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NavigationEffects.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$2$1", f = "NavigationEffects.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class NavigationEffectsKt$NavigationEffects$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<NavBackStackEntry> $backStackEntry$delegate;
    final /* synthetic */ NavHostController $navHostController;
    final /* synthetic */ Function1<NavBackStackEntryUpdate, Unit> $onBackStackEntryUpdated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationEffectsKt$NavigationEffects$2$1(NavHostController navHostController, Function1<? super NavBackStackEntryUpdate, Unit> function1, State<NavBackStackEntry> state, Continuation<? super NavigationEffectsKt$NavigationEffects$2$1> continuation) {
        super(2, continuation);
        this.$navHostController = navHostController;
        this.$onBackStackEntryUpdated = function1;
        this.$backStackEntry$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NavigationEffectsKt$NavigationEffects$2$1(this.$navHostController, this.$onBackStackEntryUpdated, this.$backStackEntry$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NavigationEffectsKt$NavigationEffects$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$onBackStackEntryUpdated.invoke(new NavBackStackEntryUpdate(this.$navHostController.getPreviousBackStackEntry(), NavigationEffectsKt.NavigationEffects$lambda$2(this.$backStackEntry$delegate)));
        return Unit.INSTANCE;
    }
}
