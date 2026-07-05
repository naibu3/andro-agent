package com.stripe.android.paymentsheet.forms;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.ui.core.elements.CardBillingAddressElement;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: FormViewModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001(B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0001¢\u0006\u0002\b\u0016J \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020$0#0\u00030\u001cH\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u0006)"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel;", "Landroidx/lifecycle/ViewModel;", "elements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "formArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V", "getElements", "()Ljava/util/List;", "getFormArguments", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "cardBillingElement", "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;", "externalHiddenIdentifiers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "addHiddenIdentifiers", "", "identifierSpecs", "addHiddenIdentifiers$paymentsheet_release", "hiddenIdentifiers", "Lkotlinx/coroutines/flow/StateFlow;", "getHiddenIdentifiers$paymentsheet_release", "()Lkotlinx/coroutines/flow/StateFlow;", "userRequestedReuse", "Lkotlinx/coroutines/flow/Flow;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "completeFormValues", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "getCompleteFormValues", "()Lkotlinx/coroutines/flow/Flow;", "currentFieldValues", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "textFieldControllerIdsFlow", "lastTextFieldIdentifier", "getLastTextFieldIdentifier", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormViewModel extends ViewModel {
    public static final int $stable = 8;
    private final CardBillingAddressElement cardBillingElement;
    private final Flow<FormFieldValues> completeFormValues;
    private final List<FormElement> elements;
    private MutableStateFlow<Set<IdentifierSpec>> externalHiddenIdentifiers;
    private final FormArguments formArguments;
    private final StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;
    private final StateFlow<IdentifierSpec> lastTextFieldIdentifier;
    private final StateFlow<List<IdentifierSpec>> textFieldControllerIdsFlow;
    private final Flow<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    public final List<FormElement> getElements() {
        return this.elements;
    }

    public final FormArguments getFormArguments() {
        return this.formArguments;
    }

    /* compiled from: FormViewModel.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0016¢\u0006\u0002\u0010\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "formElements", "", "Lcom/stripe/android/uicore/elements/FormElement;", "formArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "<init>", "(Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V", "getFormElements", "()Ljava/util/List;", "getFormArguments", "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 8;
        private final FormArguments formArguments;
        private final List<FormElement> formElements;

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(List<? extends FormElement> formElements, FormArguments formArguments) {
            Intrinsics.checkNotNullParameter(formElements, "formElements");
            Intrinsics.checkNotNullParameter(formArguments, "formArguments");
            this.formElements = formElements;
            this.formArguments = formArguments;
        }

        public final List<FormElement> getFormElements() {
            return this.formElements;
        }

        public final FormArguments getFormArguments() {
            return this.formArguments;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new FormViewModel(this.formElements, this.formArguments);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FormViewModel(List<? extends FormElement> elements, FormArguments formArguments) {
        Flow<List<? extends IdentifierSpec>> flowStateFlowOf;
        StateFlow<Set<IdentifierSpec>> hiddenIdentifiers;
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        this.elements = elements;
        this.formArguments = formArguments;
        ArrayList arrayList = new ArrayList();
        for (Object obj : elements) {
            if (obj instanceof SectionElement) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((SectionElement) it.next()).getFields());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (obj2 instanceof CardBillingAddressElement) {
                arrayList3.add(obj2);
            }
        }
        CardBillingAddressElement cardBillingAddressElement = (CardBillingAddressElement) CollectionsKt.firstOrNull((List) arrayList3);
        this.cardBillingElement = cardBillingAddressElement;
        this.externalHiddenIdentifiers = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
        StateFlow<Set<IdentifierSpec>> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow((cardBillingAddressElement == null || (hiddenIdentifiers = cardBillingAddressElement.getHiddenIdentifiers()) == null) ? StateFlowsKt.stateFlowOf(SetsKt.emptySet()) : hiddenIdentifiers, this.externalHiddenIdentifiers, new Function2() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                return FormViewModel.hiddenIdentifiers$lambda$1((Set) obj3, (Set) obj4);
            }
        });
        this.hiddenIdentifiers = stateFlowCombineAsStateFlow;
        final Flow<List<Pair<IdentifierSpec, FormFieldEntry>>> flowCurrentFieldValues = currentFieldValues();
        Flow<PaymentSelection.CustomerRequestedSave> flow = new Flow<PaymentSelection.CustomerRequestedSave>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2", f = "FormViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

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
                        ArrayList arrayList = new ArrayList();
                        for (T t : (List) obj) {
                            if (Intrinsics.areEqual(((Pair) t).getFirst(), IdentifierSpec.INSTANCE.getSaveForFutureUse())) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        Iterator<T> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(Boxing.boxBoolean(Boolean.parseBoolean(((FormFieldEntry) ((Pair) it.next()).getSecond()).getValue())));
                        }
                        ArrayList arrayList4 = arrayList3;
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                        Iterator<T> it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            arrayList5.add(((Boolean) it2.next()).booleanValue() ? PaymentSelection.CustomerRequestedSave.RequestReuse : PaymentSelection.CustomerRequestedSave.RequestNoReuse);
                        }
                        PaymentSelection.CustomerRequestedSave customerRequestedSave = (PaymentSelection.CustomerRequestedSave) CollectionsKt.firstOrNull((List) arrayList5);
                        if (customerRequestedSave == null) {
                            customerRequestedSave = PaymentSelection.CustomerRequestedSave.NoRequest;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(customerRequestedSave, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super PaymentSelection.CustomerRequestedSave> flowCollector, Continuation continuation) {
                Object objCollect = flowCurrentFieldValues.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        this.userRequestedReuse = flow;
        final Flow<List<Pair<IdentifierSpec, FormFieldEntry>>> flowCurrentFieldValues2 = currentFieldValues();
        this.completeFormValues = new CompleteFormFieldValueFilter(new Flow<Map<IdentifierSpec, ? extends FormFieldEntry>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2", f = "FormViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

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
                        Map map = MapsKt.toMap((List) obj);
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(map, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(FlowCollector<? super Map<IdentifierSpec, ? extends FormFieldEntry>> flowCollector, Continuation continuation) {
                Object objCollect = flowCurrentFieldValues2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, stateFlowCombineAsStateFlow, flow, this.formArguments.getDefaultFormValues()).filterFlow();
        List<FormElement> list = this.elements;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((FormElement) it2.next()).getTextFieldIdentifiers());
        }
        final ArrayList arrayList5 = arrayList4;
        if (arrayList5.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf(CollectionsKt.flatten(CollectionsKt.toList(CollectionsKt.emptyList())));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList5).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends IdentifierSpec>> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<List<? extends IdentifierSpec>[]>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final List<? extends IdentifierSpec>[] invoke() {
                            return new List[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$1$3", f = "FormViewModel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
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
        FlowToStateFlow flowToStateFlow = new FlowToStateFlow(flowStateFlowOf, new Function0<List<? extends IdentifierSpec>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$special$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends IdentifierSpec> invoke() {
                List list2 = arrayList5;
                ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(((StateFlow) it3.next()).getValue());
                }
                return CollectionsKt.flatten(CollectionsKt.toList(arrayList6));
            }
        });
        this.textFieldControllerIdsFlow = flowToStateFlow;
        this.lastTextFieldIdentifier = StateFlowsKt.combineAsStateFlow(this.hiddenIdentifiers, flowToStateFlow, new Function2() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                return FormViewModel.lastTextFieldIdentifier$lambda$12((Set) obj3, (List) obj4);
            }
        });
    }

    /* compiled from: FormViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$1", f = "FormViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FormViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (PlaceholderHelper.INSTANCE.connectBillingDetailsFields$paymentsheet_release(FormViewModel.this.getElements(), this) == coroutine_suspended) {
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

    public final void addHiddenIdentifiers$paymentsheet_release(Set<IdentifierSpec> identifierSpecs) {
        Intrinsics.checkNotNullParameter(identifierSpecs, "identifierSpecs");
        this.externalHiddenIdentifiers.setValue(identifierSpecs);
    }

    public final StateFlow<Set<IdentifierSpec>> getHiddenIdentifiers$paymentsheet_release() {
        return this.hiddenIdentifiers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set hiddenIdentifiers$lambda$1(Set cardBillingIdentifiers, Set externalHiddenIdentifiers) {
        Intrinsics.checkNotNullParameter(cardBillingIdentifiers, "cardBillingIdentifiers");
        Intrinsics.checkNotNullParameter(externalHiddenIdentifiers, "externalHiddenIdentifiers");
        return SetsKt.plus(externalHiddenIdentifiers, (Iterable) cardBillingIdentifiers);
    }

    public final Flow<FormFieldValues> getCompleteFormValues() {
        return this.completeFormValues;
    }

    private final Flow<List<Pair<IdentifierSpec, FormFieldEntry>>> currentFieldValues() {
        if (this.elements.isEmpty()) {
            return FlowKt.flowOf(CollectionsKt.emptyList());
        }
        List<FormElement> list = this.elements;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((FormElement) it.next()).getFormFieldValueFlow());
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList).toArray(new Flow[0]);
        return (Flow) new Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$currentFieldValues$$inlined$combine$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
                Flow[] flowArr2 = flowArr;
                final Flow[] flowArr3 = flowArr;
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[]>() { // from class: com.stripe.android.paymentsheet.forms.FormViewModel$currentFieldValues$$inlined$combine$1.2
                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>[] invoke() {
                        return new List[flowArr3.length];
                    }
                }, new AnonymousClass3(null), continuation);
                return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
            }

            /* compiled from: Zip.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.FormViewModel$currentFieldValues$$inlined$combine$1$3", f = "FormViewModel.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.paymentsheet.forms.FormViewModel$currentFieldValues$$inlined$combine$1$3, reason: invalid class name */
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
                        List listFlatten = CollectionsKt.flatten(ArraysKt.toList((List[]) ((Object[]) this.L$1)));
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

    public final StateFlow<IdentifierSpec> getLastTextFieldIdentifier() {
        return this.lastTextFieldIdentifier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdentifierSpec lastTextFieldIdentifier$lambda$12(Set hiddenIds, List textFieldControllerIds) {
        Object objPrevious;
        Intrinsics.checkNotNullParameter(hiddenIds, "hiddenIds");
        Intrinsics.checkNotNullParameter(textFieldControllerIds, "textFieldControllerIds");
        ListIterator listIterator = textFieldControllerIds.listIterator(textFieldControllerIds.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (!hiddenIds.contains((IdentifierSpec) objPrevious)) {
                break;
            }
        }
        return (IdentifierSpec) objPrevious;
    }
}
