package com.stripe.android.uicore.navigation;

import android.app.Activity;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$3$1;
import com.stripe.android.uicore.navigation.NavigationIntent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: NavigationEffects.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$3$1", f = "NavigationEffects.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class NavigationEffectsKt$NavigationEffects$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ KeyboardController $keyboardController;
    final /* synthetic */ NavHostController $navHostController;
    final /* synthetic */ SharedFlow<NavigationIntent> $navigationChannel;
    final /* synthetic */ Function1<Boolean, Unit> $onPopBackStackResult;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavigationEffectsKt$NavigationEffects$3$1(SharedFlow<? extends NavigationIntent> sharedFlow, Activity activity, KeyboardController keyboardController, NavHostController navHostController, Function1<? super Boolean, Unit> function1, Continuation<? super NavigationEffectsKt$NavigationEffects$3$1> continuation) {
        super(2, continuation);
        this.$navigationChannel = sharedFlow;
        this.$activity = activity;
        this.$keyboardController = keyboardController;
        this.$navHostController = navHostController;
        this.$onPopBackStackResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NavigationEffectsKt$NavigationEffects$3$1 navigationEffectsKt$NavigationEffects$3$1 = new NavigationEffectsKt$NavigationEffects$3$1(this.$navigationChannel, this.$activity, this.$keyboardController, this.$navHostController, this.$onPopBackStackResult, continuation);
        navigationEffectsKt$NavigationEffects$3$1.L$0 = obj;
        return navigationEffectsKt$NavigationEffects$3$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NavigationEffectsKt$NavigationEffects$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: NavigationEffects.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", SDKConstants.PARAM_INTENT, "Lcom/stripe/android/uicore/navigation/NavigationIntent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$3$1$1", f = "NavigationEffects.kt", i = {0}, l = {43}, m = "invokeSuspend", n = {SDKConstants.PARAM_INTENT}, s = {"L$0"})
    /* renamed from: com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<NavigationIntent, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ KeyboardController $keyboardController;
        final /* synthetic */ NavHostController $navHostController;
        final /* synthetic */ Function1<Boolean, Unit> $onPopBackStackResult;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Activity activity, KeyboardController keyboardController, NavHostController navHostController, Function1<? super Boolean, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$keyboardController = keyboardController;
            this.$navHostController = navHostController;
            this.$onPopBackStackResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, this.$keyboardController, this.$navHostController, this.$onPopBackStackResult, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NavigationIntent navigationIntent, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(navigationIntent, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final NavigationIntent navigationIntent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                NavigationIntent navigationIntent2 = (NavigationIntent) this.L$0;
                Activity activity = this.$activity;
                if (activity != null && activity.isFinishing()) {
                    return Unit.INSTANCE;
                }
                this.L$0 = navigationIntent2;
                this.label = 1;
                if (this.$keyboardController.dismiss(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                navigationIntent = navigationIntent2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navigationIntent = (NavigationIntent) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (navigationIntent instanceof NavigationIntent.NavigateTo) {
                NavDestination currentDestination = this.$navHostController.getCurrentDestination();
                final String route = currentDestination != null ? currentDestination.getRoute() : null;
                String route2 = ((NavigationIntent.NavigateTo) navigationIntent).getRoute();
                if (route2.length() > 0 && !Intrinsics.areEqual(route2, route)) {
                    final NavHostController navHostController = this.$navHostController;
                    navHostController.navigate(route2, new Function1() { // from class: com.stripe.android.uicore.navigation.NavigationEffectsKt$NavigationEffects$3$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return NavigationEffectsKt$NavigationEffects$3$1.AnonymousClass1.invokeSuspend$lambda$0(navigationIntent, navHostController, route, (NavOptionsBuilder) obj2);
                        }
                    });
                }
            } else {
                if (!Intrinsics.areEqual(navigationIntent, NavigationIntent.NavigateBack.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.$onPopBackStackResult.invoke(Boxing.boxBoolean(this.$navHostController.popBackStack()));
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NavigationIntent navigationIntent, NavHostController navHostController, String str, NavOptionsBuilder navOptionsBuilder) {
            NavigationIntent.NavigateTo navigateTo = (NavigationIntent.NavigateTo) navigationIntent;
            navOptionsBuilder.setLaunchSingleTop(navigateTo.isSingleTop());
            if (navigateTo.getPopUpTo() != null) {
                NavigationEffectsKt.applyPop(navOptionsBuilder, navHostController, str, navigateTo.getPopUpTo());
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FlowKt.launchIn(FlowKt.onEach(this.$navigationChannel, new AnonymousClass1(this.$activity, this.$keyboardController, this.$navHostController, this.$onPopBackStackResult, null)), (CoroutineScope) this.L$0);
        return Unit.INSTANCE;
    }
}
