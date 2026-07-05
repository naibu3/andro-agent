package com.stripe.android.financialconnections.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: Flows.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\u0000\u001a>\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00040\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\nH\u0000\u001aK\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00020\u00040\b2\u0006\u0010\u000b\u001a\u0002H\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00020\rH\u0000¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"get", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "K", "", "keyFlow", "updateWithNewEntry", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "entry", "Lkotlin/Pair;", SDKConstants.PARAM_KEY, ViewProps.TRANSFORM, "Lkotlin/Function1;", "(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FlowsKt {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* compiled from: Flows.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\f\u0012\b\u0012\u0006\b\u0002\u0018\u0001H\u00030\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\u0007\u001a\u0002H\u0002H\n"}, d2 = {"<anonymous>", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/flow/FlowCollector;", "map", "", SDKConstants.PARAM_KEY}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.utils.FlowsKt$get$1", f = "Flows.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.utils.FlowsKt$get$1, reason: invalid class name */
    static final class AnonymousClass1<K, V> extends SuspendLambda implements Function4<FlowCollector<? super V>, Map<K, ? extends V>, K, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Continuation<? super Unit> continuation) {
            return invoke((FlowCollector) obj, (Map<Map<K, ? extends V>, ? extends V>) obj2, (Map<K, ? extends V>) obj3, continuation);
        }

        public final Object invoke(FlowCollector<? super V> flowCollector, Map<K, ? extends V> map, K k, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = map;
            anonymousClass1.L$2 = k;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Object obj2 = ((Map) this.L$1).get(this.L$2);
                if (obj2 != null) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (flowCollector.emit(obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final <K, V> Flow<V> get(Flow<? extends Map<K, ? extends V>> flow, Flow<? extends K> keyFlow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(keyFlow, "keyFlow");
        return FlowKt.distinctUntilChanged(FlowKt.flowCombineTransform(flow, keyFlow, new AnonymousClass1(null)));
    }

    public static final <K, V> void updateWithNewEntry(MutableStateFlow<Map<K, V>> mutableStateFlow, Pair<? extends K, ? extends V> entry) {
        Map<K, V> value;
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<this>");
        Intrinsics.checkNotNullParameter(entry, "entry");
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, MapsKt.plus(value, MapsKt.mapOf(entry))));
    }

    public static final <K, V> void updateWithNewEntry(MutableStateFlow<Map<K, V>> mutableStateFlow, K k, Function1<? super V, ? extends V> transform) {
        Map<K, V> value;
        Map<K, V> mapPlus;
        Intrinsics.checkNotNullParameter(mutableStateFlow, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        do {
            value = mutableStateFlow.getValue();
            mapPlus = value;
            V v = mapPlus.get(k);
            if (v != null) {
                mapPlus = MapsKt.plus(mapPlus, MapsKt.mapOf(TuplesKt.to(k, transform.invoke(v))));
            }
        } while (!mutableStateFlow.compareAndSet(value, mapPlus));
    }
}
