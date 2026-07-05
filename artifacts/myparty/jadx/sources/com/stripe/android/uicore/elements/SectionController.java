package com.stripe.android.uicore.elements;

import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: SectionController.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/uicore/elements/SectionController;", "Lcom/stripe/android/uicore/elements/Controller;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "sectionFieldErrorControllers", "", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SectionController implements Controller {
    public static final int $stable = 8;
    private final StateFlow<FieldError> error;
    private final ResolvableString label;

    public SectionController(ResolvableString resolvableString, List<? extends SectionFieldErrorController> sectionFieldErrorControllers) {
        Flow<FieldError> flowStateFlowOf;
        FieldError fieldError;
        Intrinsics.checkNotNullParameter(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.label = resolvableString;
        List<? extends SectionFieldErrorController> list = sectionFieldErrorControllers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionFieldErrorController) it.next()).getError());
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            Iterator it2 = CollectionsKt.emptyList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    fieldError = null;
                    break;
                } else {
                    fieldError = (FieldError) it2.next();
                    if (fieldError != null) {
                        break;
                    }
                }
            }
            flowStateFlowOf = StateFlowsKt.stateFlowOf(fieldError);
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<FieldError>() { // from class: com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FieldError> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<FieldError[]>() { // from class: com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final FieldError[] invoke() {
                            return new FieldError[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$1$3", f = "SectionController.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super FieldError> flowCollector, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = fieldErrorArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        FieldError fieldError;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            AnonymousClass3 anonymousClass3 = this;
                            Iterator it = ArraysKt.toList((Object[]) this.L$1).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    fieldError = null;
                                    break;
                                }
                                fieldError = (FieldError) it.next();
                                if (fieldError != null) {
                                    break;
                                }
                            }
                            this.label = 1;
                            if (flowCollector.emit(fieldError, anonymousClass3) == coroutine_suspended) {
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
            };
        }
        this.error = new FlowToStateFlow(flowStateFlowOf, new Function0<FieldError>() { // from class: com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final FieldError invoke() {
                List list2 = arrayList2;
                ArrayList<FieldError> arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((StateFlow) it3.next()).getValue());
                }
                for (FieldError fieldError2 : arrayList3) {
                    if (fieldError2 != null) {
                        return fieldError2;
                    }
                }
                return null;
            }
        });
    }

    public final ResolvableString getLabel() {
        return this.label;
    }

    public final StateFlow<FieldError> getError() {
        return this.error;
    }
}
