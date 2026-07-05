package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.material.ModalBottomSheetState;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: Emitters.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$transform$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1", f = "BottomSheetNavigation.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1 extends SuspendLambda implements Function2<FlowCollector<? super NavBackStackEntry>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Flow $this_transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BottomSheetNavigator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1(Flow flow, Continuation continuation, BottomSheetNavigator bottomSheetNavigator) {
        super(2, continuation);
        this.$this_transform = flow;
        this.this$0 = bottomSheetNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1 bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1 = new BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1(this.$this_transform, continuation, this.this$0);
        bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1.L$0 = obj;
        return bottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlowCollector<? super NavBackStackEntry> flowCollector, Continuation<? super Unit> continuation) {
        return ((BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            FlowCollector flowCollector = (FlowCollector) this.L$0;
            this.label = 1;
            if (this.$this_transform.collect(new AnonymousClass1(flowCollector, this.this$0), this) == coroutine_suspended) {
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

    /* compiled from: Emitters.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<NavBackStackEntry> $$this$flow;
        final /* synthetic */ BottomSheetNavigator this$0;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1", f = "BottomSheetNavigation.kt", i = {0, 0}, l = {40, 45, 45, 45}, m = "emit", n = {"backStackEntries", "$this$invokeSuspend_u24lambda_u240"}, s = {"L$0", "L$1"})
        /* renamed from: com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator$sheetContent$1$retainedEntry$2$1$invokeSuspend$$inlined$transform$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C01571 extends ContinuationImpl {
            Object L$0;
            Object L$1;
            int label;
            /* synthetic */ Object result;

            public C01571(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass1.this.emit(null, this);
            }
        }

        public AnonymousClass1(FlowCollector flowCollector, BottomSheetNavigator bottomSheetNavigator) {
            this.this$0 = bottomSheetNavigator;
            this.$$this$flow = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        
            if (r10.emit(r11, r0) != r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            if (r10.emit(r11, r0) == r1) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super Unit> continuation) throws Throwable {
            C01571 c01571;
            FlowCollector flowCollector;
            List list;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            Object objLastOrNull;
            if (continuation instanceof C01571) {
                c01571 = (C01571) continuation;
                if ((c01571.label & Integer.MIN_VALUE) != 0) {
                    c01571.label -= Integer.MIN_VALUE;
                } else {
                    c01571 = new C01571(continuation);
                }
            }
            Object obj = c01571.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = c01571.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = this.$$this$flow;
                list = (List) t;
                try {
                    ModalBottomSheetState sheetState = this.this$0.getSheetState();
                    c01571.L$0 = list;
                    c01571.L$1 = flowCollector;
                    c01571.label = 1;
                    if (sheetState.hide(c01571) != coroutine_suspended) {
                        flowCollector3 = flowCollector;
                        Object objLastOrNull2 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                        c01571.L$0 = null;
                        c01571.L$1 = null;
                        c01571.label = 2;
                    }
                } catch (CancellationException unused) {
                    flowCollector2 = flowCollector;
                    Object objLastOrNull3 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                    c01571.L$0 = null;
                    c01571.L$1 = null;
                    c01571.label = 3;
                } catch (Throwable th) {
                    th = th;
                    objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
                    c01571.L$0 = th;
                    c01571.L$1 = null;
                    c01571.label = 4;
                    if (flowCollector.emit(objLastOrNull, c01571) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Throwable th2 = (Throwable) c01571.L$0;
                ResultKt.throwOnFailure(obj);
                throw th2;
            }
            flowCollector2 = (FlowCollector) c01571.L$1;
            list = (List) c01571.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                flowCollector3 = flowCollector2;
                Object objLastOrNull22 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c01571.L$0 = null;
                c01571.L$1 = null;
                c01571.label = 2;
            } catch (CancellationException unused2) {
                Object objLastOrNull32 = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c01571.L$0 = null;
                c01571.L$1 = null;
                c01571.label = 3;
            } catch (Throwable th3) {
                flowCollector = flowCollector2;
                th = th3;
                objLastOrNull = CollectionsKt.lastOrNull((List<? extends Object>) list);
                c01571.L$0 = th;
                c01571.L$1 = null;
                c01571.label = 4;
                if (flowCollector.emit(objLastOrNull, c01571) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                throw th;
            }
        }
    }
}
