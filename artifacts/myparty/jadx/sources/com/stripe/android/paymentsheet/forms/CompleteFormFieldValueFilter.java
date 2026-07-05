package com.stripe.android.paymentsheet.forms;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CompleteFormFieldValueFilter.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001BW\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0003JH\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004H\u0002R \u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;", "", "currentFieldValueMap", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "hiddenIdentifiers", "", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;", "defaultValues", "", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Ljava/util/Map;)V", "filterFlow", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "idFieldSnapshotMap", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompleteFormFieldValueFilter {
    public static final int $stable = 8;
    private final Flow<Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap;
    private final Map<IdentifierSpec, String> defaultValues;
    private final Flow<Set<IdentifierSpec>> hiddenIdentifiers;
    private final Flow<PaymentSelection.CustomerRequestedSave> userRequestedReuse;

    /* JADX WARN: Multi-variable type inference failed */
    public CompleteFormFieldValueFilter(Flow<? extends Map<IdentifierSpec, FormFieldEntry>> currentFieldValueMap, Flow<? extends Set<IdentifierSpec>> hiddenIdentifiers, Flow<? extends PaymentSelection.CustomerRequestedSave> userRequestedReuse, Map<IdentifierSpec, String> defaultValues) {
        Intrinsics.checkNotNullParameter(currentFieldValueMap, "currentFieldValueMap");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        Intrinsics.checkNotNullParameter(userRequestedReuse, "userRequestedReuse");
        Intrinsics.checkNotNullParameter(defaultValues, "defaultValues");
        this.currentFieldValueMap = currentFieldValueMap;
        this.hiddenIdentifiers = hiddenIdentifiers;
        this.userRequestedReuse = userRequestedReuse;
        this.defaultValues = defaultValues;
    }

    public final Flow<FormFieldValues> filterFlow() {
        return FlowKt.combine(this.currentFieldValueMap, this.hiddenIdentifiers, this.userRequestedReuse, new AnonymousClass1(null));
    }

    /* compiled from: CompleteFormFieldValueFilter.kt */
    @Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\b\u001a\u00020\tH\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "idFieldSnapshotMap", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "hiddenIdentifiers", "", "userRequestedReuse", "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1", f = "CompleteFormFieldValueFilter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.forms.CompleteFormFieldValueFilter$filterFlow$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function4<Map<IdentifierSpec, ? extends FormFieldEntry>, Set<? extends IdentifierSpec>, PaymentSelection.CustomerRequestedSave, Continuation<? super FormFieldValues>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(4, continuation);
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Object invoke(Map<IdentifierSpec, ? extends FormFieldEntry> map, Set<? extends IdentifierSpec> set, PaymentSelection.CustomerRequestedSave customerRequestedSave, Continuation<? super FormFieldValues> continuation) {
            return invoke2((Map<IdentifierSpec, FormFieldEntry>) map, (Set<IdentifierSpec>) set, customerRequestedSave, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Map<IdentifierSpec, FormFieldEntry> map, Set<IdentifierSpec> set, PaymentSelection.CustomerRequestedSave customerRequestedSave, Continuation<? super FormFieldValues> continuation) {
            AnonymousClass1 anonymousClass1 = CompleteFormFieldValueFilter.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = map;
            anonymousClass1.L$1 = set;
            anonymousClass1.L$2 = customerRequestedSave;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Map map = (Map) this.L$0;
            Set set = (Set) this.L$1;
            PaymentSelection.CustomerRequestedSave customerRequestedSave = (PaymentSelection.CustomerRequestedSave) this.L$2;
            CompleteFormFieldValueFilter completeFormFieldValueFilter = CompleteFormFieldValueFilter.this;
            return completeFormFieldValueFilter.filterFlow(map, set, customerRequestedSave, completeFormFieldValueFilter.defaultValues);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FormFieldValues filterFlow(Map<IdentifierSpec, FormFieldEntry> idFieldSnapshotMap, Set<IdentifierSpec> hiddenIdentifiers, PaymentSelection.CustomerRequestedSave userRequestedReuse, Map<IdentifierSpec, String> defaultValues) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : idFieldSnapshotMap.entrySet()) {
            if (!hiddenIdentifiers.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        Iterator<Map.Entry<IdentifierSpec, String>> it = defaultValues.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<IdentifierSpec, String> next = it.next();
            FormFieldEntry formFieldEntry = (FormFieldEntry) mutableMap.get(next.getKey());
            String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
            if (value == null || StringsKt.isBlank(value)) {
                String value2 = next.getValue();
                if (value2 != null && !StringsKt.isBlank(value2)) {
                    mutableMap.put(next.getKey(), new FormFieldEntry(next.getValue(), true));
                }
            }
        }
        FormFieldValues formFieldValues = new FormFieldValues(mutableMap, userRequestedReuse);
        Collection collectionValues = mutableMap.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((FormFieldEntry) it2.next()).isComplete()));
        }
        ArrayList arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return formFieldValues;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (!((Boolean) it3.next()).booleanValue()) {
                return null;
            }
        }
        return formFieldValues;
    }
}
