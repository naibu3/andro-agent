package com.stripe.android.uicore.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: StateFlows.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\u001a8\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u0005H\u0007\u001a>\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00030\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0005H\u0007\u001aV\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\u00020\fH\u0007\u001ap\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\u001e\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007\u001a\u008a\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012$\u0010\u0004\u001a \u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u00020\u0012H\u0007\u001a¤\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00012*\u0010\u0004\u001a&\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u00020\u0015H\u0007\u001a¾\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\r\"\u0004\b\u0003\u0010\u0010\"\u0004\b\u0004\u0010\u0013\"\u0004\b\u0005\u0010\u0016\"\u0004\b\u0006\u0010\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00160\u000120\u0010\u0004\u001a,\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00020\u0018H\u0007\u001aP\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0003\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00010\u001a2\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u001a\u0012\u0004\u0012\u0002H\u00020\u0005H\u0087\bø\u0001\u0000\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u001c\u001a\u0002H\u0003H\u0007¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"mapAsStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "R", ExifInterface.GPS_DIRECTION_TRUE, ViewProps.TRANSFORM, "Lkotlin/Function1;", "flatMapLatestAsStateFlow", "combineAsStateFlow", "T1", "T2", "flow1", "flow2", "Lkotlin/Function2;", "T3", "flow3", "Lkotlin/Function3;", "T4", "flow4", "Lkotlin/Function4;", "T5", "flow5", "Lkotlin/Function5;", "T6", "flow6", "Lkotlin/Function6;", "flows", "", "stateFlowOf", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StateFlowsKt {
    public static final <T, R> StateFlow<R> mapAsStateFlow(final StateFlow<? extends T> stateFlow, final Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final StateFlow<? extends T> stateFlow2 = stateFlow;
        return new FlowToStateFlow(new Flow<R>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Function1 $callee$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1$2", f = "StateFlows.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$mapAsStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$callee$inlined = function1;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object objInvoke = this.$callee$inlined.invoke(obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(objInvoke, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, transform), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.mapAsStateFlow$lambda$0(transform, stateFlow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mapAsStateFlow$lambda$0(Function1 function1, StateFlow stateFlow) {
        return function1.invoke(stateFlow.getValue());
    }

    public static final <T, R> StateFlow<R> flatMapLatestAsStateFlow(final StateFlow<? extends T> stateFlow, final Function1<? super T, ? extends StateFlow<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlowToStateFlow(FlowKt.transformLatest(stateFlow, new StateFlowsKt$flatMapLatestAsStateFlow$$inlined$flatMapLatest$1(null, transform)), new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.flatMapLatestAsStateFlow$lambda$2(transform, stateFlow);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object flatMapLatestAsStateFlow$lambda$2(Function1 function1, StateFlow stateFlow) {
        return ((StateFlow) function1.invoke(stateFlow.getValue())).getValue();
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2] */
    /* compiled from: StateFlows.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1<R, T1, T2> extends FunctionReferenceImpl implements Function3<T1, T2, Continuation<? super R>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(3, obj, Intrinsics.Kotlin.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$3(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((AnonymousClass1<R, T1, T2>) obj, obj2, (Continuation) obj3);
        }

        public final Object invoke(T1 t1, T2 t2, Continuation<? super R> continuation) {
            return StateFlowsKt.combineAsStateFlow$suspendConversion0$3((Function2) this.receiver, t1, t2, continuation);
        }
    }

    public static final <T1, T2, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final Function2<? super T1, ? super T2, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlowToStateFlow(FlowKt.combine(flow1, flow2, new AnonymousClass1(transform)), new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.combineAsStateFlow$lambda$4(transform, flow1, flow2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combineAsStateFlow$suspendConversion0$3(Function2 function2, Object obj, Object obj2, Continuation continuation) {
        return function2.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineAsStateFlow$lambda$4(Function2 function2, StateFlow stateFlow, StateFlow stateFlow2) {
        return function2.invoke(stateFlow.getValue(), stateFlow2.getValue());
    }

    /* JADX INFO: Add missing generic type declarations: [R, T1, T2, T3] */
    /* compiled from: StateFlows.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$3, reason: invalid class name */
    /* synthetic */ class AnonymousClass3<R, T1, T2, T3> extends FunctionReferenceImpl implements Function4<T1, T2, T3, Continuation<? super R>, Object>, SuspendFunction {
        AnonymousClass3(Object obj) {
            super(4, obj, Intrinsics.Kotlin.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$5(Lkotlin/jvm/functions/Function3;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return invoke((AnonymousClass3<R, T1, T2, T3>) obj, obj2, obj3, (Continuation) obj4);
        }

        public final Object invoke(T1 t1, T2 t2, T3 t3, Continuation<? super R> continuation) {
            return StateFlowsKt.combineAsStateFlow$suspendConversion0$5((Function3) this.receiver, t1, t2, t3, continuation);
        }
    }

    public static final <T1, T2, T3, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final StateFlow<? extends T3> flow3, final Function3<? super T1, ? super T2, ? super T3, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlowToStateFlow(FlowKt.combine(flow1, flow2, flow3, new AnonymousClass3(transform)), new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.combineAsStateFlow$lambda$6(transform, flow1, flow2, flow3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combineAsStateFlow$suspendConversion0$5(Function3 function3, Object obj, Object obj2, Object obj3, Continuation continuation) {
        return function3.invoke(obj, obj2, obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineAsStateFlow$lambda$6(Function3 function3, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3) {
        return function3.invoke(stateFlow.getValue(), stateFlow2.getValue(), stateFlow3.getValue());
    }

    /* JADX INFO: Add missing generic type declarations: [T4, R, T1, T2, T3] */
    /* compiled from: StateFlows.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$5, reason: invalid class name */
    /* synthetic */ class AnonymousClass5<R, T1, T2, T3, T4> extends FunctionReferenceImpl implements Function5<T1, T2, T3, T4, Continuation<? super R>, Object>, SuspendFunction {
        AnonymousClass5(Object obj) {
            super(5, obj, Intrinsics.Kotlin.class, "suspendConversion0", "combineAsStateFlow$suspendConversion0$7(Lkotlin/jvm/functions/Function4;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function5
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return invoke((AnonymousClass5<R, T1, T2, T3, T4>) obj, obj2, obj3, obj4, (Continuation) obj5);
        }

        public final Object invoke(T1 t1, T2 t2, T3 t3, T4 t4, Continuation<? super R> continuation) {
            return StateFlowsKt.combineAsStateFlow$suspendConversion0$7((Function4) this.receiver, t1, t2, t3, t4, continuation);
        }
    }

    public static final <T1, T2, T3, T4, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final StateFlow<? extends T3> flow3, final StateFlow<? extends T4> flow4, final Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new FlowToStateFlow(FlowKt.combine(flow1, flow2, flow3, flow4, new AnonymousClass5(transform)), new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.combineAsStateFlow$lambda$8(transform, flow1, flow2, flow3, flow4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object combineAsStateFlow$suspendConversion0$7(Function4 function4, Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation) {
        return function4.invoke(obj, obj2, obj3, obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineAsStateFlow$lambda$8(Function4 function4, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4) {
        return function4.invoke(stateFlow.getValue(), stateFlow2.getValue(), stateFlow3.getValue(), stateFlow4.getValue());
    }

    public static final <T1, T2, T3, T4, T5, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final StateFlow<? extends T3> flow3, final StateFlow<? extends T4> flow4, final StateFlow<? extends T5> flow5, final Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(CollectionsKt.listOf((Object[]) new StateFlow[]{flow1, flow2, flow3, flow4, flow5})).toArray(new Flow[0]);
        return new FlowToStateFlow(new Flow<R>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Flow[] flowArr2 = flowArr;
                final Flow[] flowArr3 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$2.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object[] invoke() {
                        return new Object[flowArr3.length];
                    }
                }, new AnonymousClass3(null, transform), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$2$3", f = "StateFlows.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$2$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function5 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function5 function5) {
                    super(3, continuation);
                    this.$transform$inlined = function5;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.$transform$inlined);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Object objInvoke = this.$transform$inlined.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
                        this.label = 1;
                        if (flowCollector.emit(objInvoke, this) == coroutine_suspended) {
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
        }, new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.combineAsStateFlow$lambda$10(transform, flow1, flow2, flow3, flow4, flow5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineAsStateFlow$lambda$10(Function5 function5, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5) {
        return function5.invoke(stateFlow.getValue(), stateFlow2.getValue(), stateFlow3.getValue(), stateFlow4.getValue(), stateFlow5.getValue());
    }

    public static final <T1, T2, T3, T4, T5, T6, R> StateFlow<R> combineAsStateFlow(final StateFlow<? extends T1> flow1, final StateFlow<? extends T2> flow2, final StateFlow<? extends T3> flow3, final StateFlow<? extends T4> flow4, final StateFlow<? extends T5> flow5, final StateFlow<? extends T6> flow6, final Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(flow5, "flow5");
        Intrinsics.checkNotNullParameter(flow6, "flow6");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(CollectionsKt.listOf((Object[]) new StateFlow[]{flow1, flow2, flow3, flow4, flow5, flow6})).toArray(new Flow[0]);
        return new FlowToStateFlow(new Flow<R>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$3
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Flow[] flowArr2 = flowArr;
                final Flow[] flowArr3 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<Object[]>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$3.2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object[] invoke() {
                        return new Object[flowArr3.length];
                    }
                }, new AnonymousClass3(null, transform), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$3$3", f = "StateFlows.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.uicore.utils.StateFlowsKt$combineAsStateFlow$$inlined$combine$3$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super R>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function6 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Continuation continuation, Function6 function6) {
                    super(3, continuation);
                    this.$transform$inlined = function6;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, Continuation<? super Unit> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation, this.$transform$inlined);
                    anonymousClass3.L$0 = flowCollector;
                    anonymousClass3.L$1 = objArr;
                    return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = (FlowCollector) this.L$0;
                        Object[] objArr = (Object[]) this.L$1;
                        Object objInvoke = this.$transform$inlined.invoke(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
                        this.label = 1;
                        if (flowCollector.emit(objInvoke, this) == coroutine_suspended) {
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
        }, new Function0() { // from class: com.stripe.android.uicore.utils.StateFlowsKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StateFlowsKt.combineAsStateFlow$lambda$12(transform, flow1, flow2, flow3, flow4, flow5, flow6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object combineAsStateFlow$lambda$12(Function6 function6, StateFlow stateFlow, StateFlow stateFlow2, StateFlow stateFlow3, StateFlow stateFlow4, StateFlow stateFlow5, StateFlow stateFlow6) {
        return function6.invoke(stateFlow.getValue(), stateFlow2.getValue(), stateFlow3.getValue(), stateFlow4.getValue(), stateFlow5.getValue(), stateFlow6.getValue());
    }

    public static final /* synthetic */ <T, R> StateFlow<R> combineAsStateFlow(final List<? extends StateFlow<? extends T>> flows, final Function1<? super List<? extends T>, ? extends R> transform) {
        StateFlowsKt$combineAsStateFlow$$inlined$combine$1 stateFlowsKt$combineAsStateFlow$$inlined$combine$1;
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (flows.isEmpty()) {
            stateFlowsKt$combineAsStateFlow$$inlined$combine$1 = stateFlowOf(transform.invoke(CollectionsKt.emptyList()));
        } else {
            Flow[] flowArr = (Flow[]) CollectionsKt.toList(flows).toArray(new Flow[0]);
            Intrinsics.needClassReification();
            stateFlowsKt$combineAsStateFlow$$inlined$combine$1 = new StateFlowsKt$combineAsStateFlow$$inlined$combine$1(flowArr, transform);
        }
        Intrinsics.needClassReification();
        return new FlowToStateFlow(stateFlowsKt$combineAsStateFlow$$inlined$combine$1, new Function0<R>() { // from class: com.stripe.android.uicore.utils.StateFlowsKt.combineAsStateFlow.12
            @Override // kotlin.jvm.functions.Function0
            public final R invoke() {
                Function1<List<? extends T>, R> function1 = transform;
                Iterable iterable = flows;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return function1.invoke(arrayList);
            }
        });
    }

    public static final <T> StateFlow<T> stateFlowOf(T t) {
        return FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(t));
    }
}
