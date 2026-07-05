package com.stripe.android.uicore.elements;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.GraphRequest;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: SectionElement.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\fJ \u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u001d0\u00050\u001cH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u001cH\u0016J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J-\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00142\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006,"}, d2 = {"Lcom/stripe/android/uicore/elements/SectionElement;", "Lcom/stripe/android/uicore/elements/FormElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", GraphRequest.FIELDS_PARAM, "", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "controller", "Lcom/stripe/android/uicore/elements/SectionController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Lcom/stripe/android/uicore/elements/SectionController;)V", "field", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/SectionFieldElement;Lcom/stripe/android/uicore/elements/SectionController;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getFields", "()Ljava/util/List;", "getController", "()Lcom/stripe/android/uicore/elements/SectionController;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getTextFieldIdentifiers", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SectionElement implements FormElement {
    private final boolean allowsUserInteraction;
    private final SectionController controller;
    private final List<SectionFieldElement> fields;
    private final IdentifierSpec identifier;
    private final ResolvableString mandateText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SectionElement copy$default(SectionElement sectionElement, IdentifierSpec identifierSpec, List list, SectionController sectionController, int i, Object obj) {
        if ((i & 1) != 0) {
            identifierSpec = sectionElement.identifier;
        }
        if ((i & 2) != 0) {
            list = sectionElement.fields;
        }
        if ((i & 4) != 0) {
            sectionController = sectionElement.controller;
        }
        return sectionElement.copy(identifierSpec, list, sectionController);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final List<SectionFieldElement> component2() {
        return this.fields;
    }

    /* renamed from: component3, reason: from getter */
    public final SectionController getController() {
        return this.controller;
    }

    public final SectionElement copy(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new SectionElement(identifier, fields, controller);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SectionElement)) {
            return false;
        }
        SectionElement sectionElement = (SectionElement) other;
        return Intrinsics.areEqual(this.identifier, sectionElement.identifier) && Intrinsics.areEqual(this.fields, sectionElement.fields) && Intrinsics.areEqual(this.controller, sectionElement.controller);
    }

    public int hashCode() {
        return (((this.identifier.hashCode() * 31) + this.fields.hashCode()) * 31) + this.controller.hashCode();
    }

    public String toString() {
        return "SectionElement(identifier=" + this.identifier + ", fields=" + this.fields + ", controller=" + this.controller + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SectionElement(IdentifierSpec identifier, List<? extends SectionFieldElement> fields, SectionController controller) {
        ResolvableString mandateText;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.identifier = identifier;
        this.fields = fields;
        this.controller = controller;
        List<? extends SectionFieldElement> list = fields;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((SectionFieldElement) it.next()).getAllowsUserInteraction()) {
                    z = true;
                    break;
                }
            }
        }
        this.allowsUserInteraction = z;
        Iterator<T> it2 = this.fields.iterator();
        while (true) {
            if (!it2.hasNext()) {
                mandateText = null;
                break;
            } else {
                mandateText = ((SectionFieldElement) it2.next()).getMandateText();
                if (mandateText != null) {
                    break;
                }
            }
        }
        this.mandateText = mandateText;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public SectionController getController() {
        return this.controller;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectionElement(IdentifierSpec identifier, SectionFieldElement field, SectionController controller) {
        this(identifier, (List<? extends SectionFieldElement>) CollectionsKt.listOf(field), controller);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(controller, "controller");
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowStateFlowOf;
        List<SectionFieldElement> list = this.fields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionFieldElement) it.next()).getFormFieldValueFlow());
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf(CollectionsKt.flatten(CollectionsKt.toList(CollectionsKt.emptyList())));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]>() { // from class: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                            return new List[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3", f = "SectionElement.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] listArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = listArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List listFlatten = CollectionsKt.flatten(CollectionsKt.toList(ArraysKt.toList((Object[]) this.L$1)));
                            this.label = 1;
                            if (flowCollector.emit(listFlatten, this) == coroutine_suspended) {
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
        return new FlowToStateFlow(flowStateFlowOf, new Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
                List list2 = arrayList2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StateFlow) it2.next()).getValue());
                }
                return CollectionsKt.flatten(CollectionsKt.toList(arrayList3));
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        Flow<List<? extends IdentifierSpec>> flowStateFlowOf;
        List<SectionFieldElement> list = this.fields;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionFieldElement) it.next()).getTextFieldIdentifiers());
        }
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf(CollectionsKt.flatten(CollectionsKt.toList(CollectionsKt.emptyList())));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<List<? extends IdentifierSpec>[]>() { // from class: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends IdentifierSpec>[] invoke() {
                            return new List[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$1$3", f = "SectionElement.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends IdentifierSpec>>, List<? extends IdentifierSpec>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, List<? extends IdentifierSpec>[] listArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = listArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List listFlatten = CollectionsKt.flatten(CollectionsKt.toList(ArraysKt.toList((Object[]) this.L$1)));
                            this.label = 1;
                            if (flowCollector.emit(listFlatten, this) == coroutine_suspended) {
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
        return new FlowToStateFlow(flowStateFlowOf, new Function0<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.uicore.elements.SectionElement$getTextFieldIdentifiers$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends IdentifierSpec> invoke() {
                List list2 = arrayList2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StateFlow) it2.next()).getValue());
                }
                return CollectionsKt.flatten(CollectionsKt.toList(arrayList3));
            }
        });
    }

    /* compiled from: SectionElement.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ \u0010\u0004\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/elements/SectionElement$Companion;", "", "<init>", "()V", "wrap", "Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElement", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "sectionFieldElements", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ SectionElement wrap$default(Companion companion, SectionFieldElement sectionFieldElement, ResolvableString resolvableString, int i, Object obj) {
            if ((i & 2) != 0) {
                resolvableString = null;
            }
            return companion.wrap(sectionFieldElement, resolvableString);
        }

        public final SectionElement wrap(SectionFieldElement sectionFieldElement, ResolvableString label) {
            Intrinsics.checkNotNullParameter(sectionFieldElement, "sectionFieldElement");
            return wrap(CollectionsKt.listOf(sectionFieldElement), label);
        }

        public static /* synthetic */ SectionElement wrap$default(Companion companion, List list, ResolvableString resolvableString, int i, Object obj) {
            if ((i & 2) != 0) {
                resolvableString = null;
            }
            return companion.wrap((List<? extends SectionFieldElement>) list, resolvableString);
        }

        public final SectionElement wrap(List<? extends SectionFieldElement> sectionFieldElements, ResolvableString label) {
            Intrinsics.checkNotNullParameter(sectionFieldElements, "sectionFieldElements");
            List<? extends SectionFieldElement> list = sectionFieldElements;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((SectionFieldElement) it.next()).sectionFieldErrorController());
            }
            return new SectionElement(IdentifierSpec.INSTANCE.Generic(((SectionFieldElement) CollectionsKt.first((List) sectionFieldElements)).getIdentifier().getV1() + "_section"), sectionFieldElements, new SectionController(label, arrayList));
        }
    }
}
