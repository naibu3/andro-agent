package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.stripe.android.view.CardWidgetViewModel;
import com.stripe.android.view.CardWidgetViewModelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CardWidgetViewModel.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u0005\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\tH\u0000\u001aE\u0010\n\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00010\u000fH\u0080\bR\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"doWithCardWidgetViewModel", "", "Landroid/view/View;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "action", "Lkotlin/Function2;", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/stripe/android/view/CardWidgetViewModel;", "Lkotlin/ExtensionFunctionType;", "launchAndCollect", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "Lkotlin/Function1;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/Flow;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function1;)V", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardWidgetViewModelKt {
    public static /* synthetic */ void doWithCardWidgetViewModel$default(View view, ViewModelStoreOwner viewModelStoreOwner, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            viewModelStoreOwner = null;
        }
        doWithCardWidgetViewModel(view, viewModelStoreOwner, function2);
    }

    public static final void doWithCardWidgetViewModel(View view, ViewModelStoreOwner viewModelStoreOwner, Function2<? super LifecycleOwner, ? super CardWidgetViewModel, Unit> action) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get(view);
        }
        if (lifecycleOwner == null || viewModelStoreOwner == null) {
            return;
        }
        Context applicationContext = view.getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        action.invoke(lifecycleOwner, (CardWidgetViewModel) new ViewModelProvider(viewModelStoreOwner, new CardWidgetViewModel.Factory(applicationContext)).get(CardWidgetViewModel.class));
    }

    public static /* synthetic */ void launchAndCollect$default(LifecycleOwner context_receiver_0, Flow flow, Lifecycle.State state, Function1 action, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State minActiveState = state;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(context_receiver_0), null, null, new AnonymousClass1(context_receiver_0, minActiveState, flow, action, null), 3, null);
    }

    /* compiled from: CardWidgetViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1", f = "CardWidgetViewModel.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LifecycleOwner $$context_receiver_0;
        final /* synthetic */ Function1<T, Unit> $action;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ Flow<T> $this_launchAndCollect;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$context_receiver_0 = lifecycleOwner;
            this.$minActiveState = state;
            this.$this_launchAndCollect = flow;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$$context_receiver_0, this.$minActiveState, this.$this_launchAndCollect, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CardWidgetViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
        @DebugMetadata(c = "com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1$1", f = "CardWidgetViewModel.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02341 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<T, Unit> $action;
            final /* synthetic */ Flow<T> $this_launchAndCollect;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02341(Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super C02341> continuation) {
                super(2, continuation);
                this.$this_launchAndCollect = flow;
                this.$action = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02341(this.$this_launchAndCollect, this.$action, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$this_launchAndCollect.collect(new C02351(this.$action), this) == coroutine_suspended) {
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

            /* compiled from: CardWidgetViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
            /* renamed from: com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C02351<T> implements FlowCollector {
                final /* synthetic */ Function1<T, Unit> $action;

                /* JADX WARN: Multi-variable type inference failed */
                public C02351(Function1<? super T, Unit> function1) {
                    this.$action = function1;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    this.$action.invoke(t);
                    return Unit.INSTANCE;
                }

                public final Object emit$$forInline(T t, final Continuation<? super Unit> continuation) {
                    new ContinuationImpl(this, continuation) { // from class: com.stripe.android.view.CardWidgetViewModelKt$launchAndCollect$1$1$1$emit$1
                        int label;
                        /* synthetic */ Object result;
                        final /* synthetic */ CardWidgetViewModelKt.AnonymousClass1.C02341.C02351<T> this$0;

                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            this.this$0 = this;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, this);
                        }
                    };
                    this.$action.invoke(t);
                    return Unit.INSTANCE;
                }
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$this_launchAndCollect.collect(new C02351(this.$action), this);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$$context_receiver_0, this.$minActiveState, new C02341(this.$this_launchAndCollect, this.$action, null), this) == coroutine_suspended) {
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

        public final Object invokeSuspend$$forInline(Object obj) {
            RepeatOnLifecycleKt.repeatOnLifecycle(this.$$context_receiver_0, this.$minActiveState, new C02341(this.$this_launchAndCollect, this.$action, null), this);
            return Unit.INSTANCE;
        }
    }

    public static final <T> void launchAndCollect(LifecycleOwner context_receiver_0, Flow<? extends T> flow, Lifecycle.State minActiveState, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(context_receiver_0), null, null, new AnonymousClass1(context_receiver_0, minActiveState, flow, action, null), 3, null);
    }
}
