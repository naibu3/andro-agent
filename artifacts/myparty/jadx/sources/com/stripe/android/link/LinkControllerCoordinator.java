package com.stripe.android.link;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkController;
import com.stripe.android.link.injection.LinkControllerPresenterScope;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LinkControllerCoordinator.kt */
@LinkControllerPresenterScope
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/link/LinkControllerCoordinator;", "", "interactor", "Lcom/stripe/android/link/LinkControllerInteractor;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "linkActivityContract", "Lcom/stripe/android/link/NativeLinkActivityContract;", "selectedPaymentMethodCallback", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;", "authenticationCallback", "Lcom/stripe/android/link/LinkController$AuthenticationCallback;", "<init>", "(Lcom/stripe/android/link/LinkControllerInteractor;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/ActivityResultRegistryOwner;Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/LinkController$PresentPaymentMethodsCallback;Lcom/stripe/android/link/LinkController$AuthenticationCallback;)V", "linkActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "getLinkActivityResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkControllerCoordinator {
    public static final int $stable = 8;
    private final LinkController.AuthenticationCallback authenticationCallback;
    private final LinkControllerInteractor interactor;
    private final LifecycleOwner lifecycleOwner;
    private final ActivityResultLauncher<LinkActivityContract.Args> linkActivityResultLauncher;
    private final LinkController.PresentPaymentMethodsCallback selectedPaymentMethodCallback;

    @Inject
    public LinkControllerCoordinator(LinkControllerInteractor interactor, LifecycleOwner lifecycleOwner, ActivityResultRegistryOwner activityResultRegistryOwner, NativeLinkActivityContract linkActivityContract, LinkController.PresentPaymentMethodsCallback selectedPaymentMethodCallback, LinkController.AuthenticationCallback authenticationCallback) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(activityResultRegistryOwner, "activityResultRegistryOwner");
        Intrinsics.checkNotNullParameter(linkActivityContract, "linkActivityContract");
        Intrinsics.checkNotNullParameter(selectedPaymentMethodCallback, "selectedPaymentMethodCallback");
        Intrinsics.checkNotNullParameter(authenticationCallback, "authenticationCallback");
        this.interactor = interactor;
        this.lifecycleOwner = lifecycleOwner;
        this.selectedPaymentMethodCallback = selectedPaymentMethodCallback;
        this.authenticationCallback = authenticationCallback;
        if (!lifecycleOwner.getLifecycle().getState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("Check failed.");
        }
        this.linkActivityResultLauncher = activityResultRegistryOwner.getActivityResultRegistry().register("LinkController_LinkActivityResultLauncher", linkActivityContract, new ActivityResultCallback() { // from class: com.stripe.android.link.LinkControllerCoordinator$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                LinkControllerCoordinator._init_$lambda$0(this.f$0, (LinkActivityResult) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass2(null), 3, null);
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.link.LinkControllerCoordinator.3
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                LinkControllerCoordinator.this.getLinkActivityResultLauncher().unregister();
            }
        });
    }

    public final ActivityResultLauncher<LinkActivityContract.Args> getLinkActivityResultLauncher() {
        return this.linkActivityResultLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(LinkControllerCoordinator linkControllerCoordinator, LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        linkControllerCoordinator.interactor.onLinkActivityResult(result);
    }

    /* compiled from: LinkControllerCoordinator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkControllerCoordinator$2", f = "LinkControllerCoordinator.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkControllerCoordinator.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LinkControllerCoordinator.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.link.LinkControllerCoordinator$2$1", f = "LinkControllerCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ LinkControllerCoordinator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(LinkControllerCoordinator linkControllerCoordinator, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = linkControllerCoordinator;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: LinkControllerCoordinator.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.link.LinkControllerCoordinator$2$1$1", f = "LinkControllerCoordinator.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C01671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ LinkControllerCoordinator this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01671(LinkControllerCoordinator linkControllerCoordinator, Continuation<? super C01671> continuation) {
                    super(2, continuation);
                    this.this$0 = linkControllerCoordinator;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01671(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.interactor.getPresentPaymentMethodsResultFlow().collect(new C01681(this.this$0.selectedPaymentMethodCallback), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }

                /* compiled from: LinkControllerCoordinator.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2$1$1$1, reason: invalid class name and collision with other inner class name */
                /* synthetic */ class C01681 implements FlowCollector, FunctionAdapter {
                    final /* synthetic */ LinkController.PresentPaymentMethodsCallback $tmp0;

                    C01681(LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback) {
                        this.$tmp0 = presentPaymentMethodsCallback;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.FunctionAdapter
                    public final Function<?> getFunctionDelegate() {
                        return new AdaptedFunctionReference(2, this.$tmp0, LinkController.PresentPaymentMethodsCallback.class, "onPresentPaymentMethodsResult", "onPresentPaymentMethodsResult(Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }

                    public final Object emit(LinkController.PresentPaymentMethodsResult presentPaymentMethodsResult, Continuation<? super Unit> continuation) {
                        Object objInvokeSuspend$onPresentPaymentMethodsResult = C01671.invokeSuspend$onPresentPaymentMethodsResult(this.$tmp0, presentPaymentMethodsResult, continuation);
                        return objInvokeSuspend$onPresentPaymentMethodsResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onPresentPaymentMethodsResult : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return emit((LinkController.PresentPaymentMethodsResult) obj, (Continuation<? super Unit>) continuation);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object invokeSuspend$onPresentPaymentMethodsResult(LinkController.PresentPaymentMethodsCallback presentPaymentMethodsCallback, LinkController.PresentPaymentMethodsResult presentPaymentMethodsResult, Continuation continuation) {
                    presentPaymentMethodsCallback.onPresentPaymentMethodsResult(presentPaymentMethodsResult);
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01671(this.this$0, null), 3, null);
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C01692(this.this$0, null), 3, null);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: LinkControllerCoordinator.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.link.LinkControllerCoordinator$2$1$2", f = "LinkControllerCoordinator.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2$1$2, reason: invalid class name and collision with other inner class name */
            static final class C01692 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                int label;
                final /* synthetic */ LinkControllerCoordinator this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01692(LinkControllerCoordinator linkControllerCoordinator, Continuation<? super C01692> continuation) {
                    super(2, continuation);
                    this.this$0 = linkControllerCoordinator;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C01692(this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C01692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.label = 1;
                        if (this.this$0.interactor.getAuthenticationResultFlow().collect(new C01701(this.this$0.authenticationCallback), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }

                /* compiled from: LinkControllerCoordinator.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.link.LinkControllerCoordinator$2$1$2$1, reason: invalid class name and collision with other inner class name */
                /* synthetic */ class C01701 implements FlowCollector, FunctionAdapter {
                    final /* synthetic */ LinkController.AuthenticationCallback $tmp0;

                    C01701(LinkController.AuthenticationCallback authenticationCallback) {
                        this.$tmp0 = authenticationCallback;
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.FunctionAdapter
                    public final Function<?> getFunctionDelegate() {
                        return new AdaptedFunctionReference(2, this.$tmp0, LinkController.AuthenticationCallback.class, "onAuthenticationResult", "onAuthenticationResult(Lcom/stripe/android/link/LinkController$AuthenticationResult;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }

                    public final Object emit(LinkController.AuthenticationResult authenticationResult, Continuation<? super Unit> continuation) {
                        Object objInvokeSuspend$onAuthenticationResult = C01692.invokeSuspend$onAuthenticationResult(this.$tmp0, authenticationResult, continuation);
                        return objInvokeSuspend$onAuthenticationResult == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$onAuthenticationResult : Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                        return emit((LinkController.AuthenticationResult) obj, (Continuation<? super Unit>) continuation);
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object invokeSuspend$onAuthenticationResult(LinkController.AuthenticationCallback authenticationCallback, LinkController.AuthenticationResult authenticationResult, Continuation continuation) {
                    authenticationCallback.onAuthenticationResult(authenticationResult);
                    return Unit.INSTANCE;
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(LinkControllerCoordinator.this.lifecycleOwner.getLifecycle(), Lifecycle.State.STARTED, new AnonymousClass1(LinkControllerCoordinator.this, null), this) == coroutine_suspended) {
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
}
