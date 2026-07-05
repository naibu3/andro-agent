package com.stripe.android.paymentsheet.utils;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.stripe.android.paymentsheet.utils.UiUtilsKt;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: UiUtils.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001aD\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\tH\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"launchAndCollectIn", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "action", "Lkotlin/Function1;", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiUtilsKt {
    public static /* synthetic */ Job launchAndCollectIn$default(Flow flow, LifecycleOwner owner, Lifecycle.State state, Function1 action, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State minActiveState = state;
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(owner), null, null, new AnonymousClass1(owner, minActiveState, flow, action, null), 3, null);
    }

    /* compiled from: UiUtils.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1", f = "UiUtils.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<T, Unit> $action;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ LifecycleOwner $owner;
        final /* synthetic */ Flow<T> $this_launchAndCollectIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$owner = lifecycleOwner;
            this.$minActiveState = state;
            this.$this_launchAndCollectIn = flow;
            this.$action = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$owner, this.$minActiveState, this.$this_launchAndCollectIn, this.$action, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: UiUtils.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
        @DebugMetadata(c = "com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1", f = "UiUtils.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<T, Unit> $action;
            final /* synthetic */ Flow<T> $this_launchAndCollectIn;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C02191(Flow<? extends T> flow, Function1<? super T, Unit> function1, Continuation<? super C02191> continuation) {
                super(2, continuation);
                this.$this_launchAndCollectIn = flow;
                this.$action = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C02191(this.$this_launchAndCollectIn, this.$action, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C02191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$this_launchAndCollectIn.collect(new C02201(this.$action), this) == coroutine_suspended) {
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

            /* compiled from: UiUtils.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
            /* renamed from: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C02201<T> implements FlowCollector {
                final /* synthetic */ Function1<T, Unit> $action;

                /* JADX WARN: Multi-variable type inference failed */
                public C02201(Function1<? super T, Unit> function1) {
                    this.$action = function1;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, Continuation<? super Unit> continuation) {
                    this.$action.invoke(t);
                    return Unit.INSTANCE;
                }

                public final Object emit$$forInline(T t, final Continuation<? super Unit> continuation) {
                    new ContinuationImpl(this, continuation) { // from class: com.stripe.android.paymentsheet.utils.UiUtilsKt$launchAndCollectIn$1$1$1$emit$1
                        int label;
                        /* synthetic */ Object result;
                        final /* synthetic */ UiUtilsKt.AnonymousClass1.C02191.C02201<T> this$0;

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
                this.$this_launchAndCollectIn.collect(new C02201(this.$action), this);
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
                if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$owner, this.$minActiveState, new C02191(this.$this_launchAndCollectIn, this.$action, null), this) == coroutine_suspended) {
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
            RepeatOnLifecycleKt.repeatOnLifecycle(this.$owner, this.$minActiveState, new C02191(this.$this_launchAndCollectIn, this.$action, null), this);
            return Unit.INSTANCE;
        }
    }

    public static final <T> Job launchAndCollectIn(Flow<? extends T> flow, LifecycleOwner owner, Lifecycle.State minActiveState, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        Intrinsics.checkNotNullParameter(action, "action");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(owner), null, null, new AnonymousClass1(owner, minActiveState, flow, action, null), 3, null);
    }
}
