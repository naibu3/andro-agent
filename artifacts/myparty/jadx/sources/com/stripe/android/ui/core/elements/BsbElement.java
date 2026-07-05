package com.stripe.android.ui.core.elements;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.Controller;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import com.stripe.android.view.BecsDebitBanks;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: BsbElement.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020$0#0\u00050\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/stripe/android/ui/core/elements/BsbElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "identifierSpec", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "banks", "", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "initialValue", "", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/List;Ljava/lang/String;)V", "controller", "Lcom/stripe/android/uicore/elements/Controller;", "getController", "()Lcom/stripe/android/uicore/elements/Controller;", NotificationsService.IDENTIFIER_KEY, "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "allowsUserInteraction", "", "getAllowsUserInteraction", "()Z", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "textElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "getTextElement$payments_ui_core_release", "()Lcom/stripe/android/uicore/elements/SimpleTextElement;", "bankName", "Lkotlinx/coroutines/flow/StateFlow;", "getBankName", "()Lkotlinx/coroutines/flow/StateFlow;", "getFormFieldValueFlow", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BsbElement implements FormElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final StateFlow<String> bankName;
    private final List<BecsDebitBanks.Bank> banks;
    private final IdentifierSpec identifierSpec;
    private final ResolvableString mandateText;
    private final SimpleTextElement textElement;

    @Override // com.stripe.android.uicore.elements.FormElement
    public Controller getController() {
        return null;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public BsbElement(IdentifierSpec identifierSpec, List<BecsDebitBanks.Bank> banks, String str) {
        Intrinsics.checkNotNullParameter(identifierSpec, "identifierSpec");
        Intrinsics.checkNotNullParameter(banks, "banks");
        this.identifierSpec = identifierSpec;
        this.banks = banks;
        this.allowsUserInteraction = true;
        SimpleTextElement simpleTextElement = new SimpleTextElement(IdentifierSpec.INSTANCE.Generic("au_becs_debit[bsb_number]"), new SimpleTextFieldController(new BsbConfig(banks), false, str, null, 10, null));
        this.textElement = simpleTextElement;
        this.bankName = StateFlowsKt.mapAsStateFlow(simpleTextElement.getController().getFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.BsbElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BsbElement.bankName$lambda$2(this.f$0, (String) obj);
            }
        });
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    /* renamed from: getIdentifier, reason: from getter */
    public IdentifierSpec getIdentifierSpec() {
        return this.identifierSpec;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    /* renamed from: getTextElement$payments_ui_core_release, reason: from getter */
    public final SimpleTextElement getTextElement() {
        return this.textElement;
    }

    public final StateFlow<String> getBankName() {
        return this.bankName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String bankName$lambda$2(BsbElement bsbElement, String textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        List<BecsDebitBanks.Bank> list = bsbElement.banks;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.startsWith$default(textFieldValue, ((BecsDebitBanks.Bank) obj).getPrefix(), false, 2, (Object) null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((BecsDebitBanks.Bank) it.next()).getName());
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList3);
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return StateFlowsKt.combineAsStateFlow(this.textElement.getController().isComplete(), this.textElement.getController().getFieldValue(), new Function2() { // from class: com.stripe.android.ui.core.elements.BsbElement$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BsbElement.getFormFieldValueFlow$lambda$3(this.f$0, ((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFormFieldValueFlow$lambda$3(BsbElement bsbElement, boolean z, String fieldValue) {
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        return CollectionsKt.listOf(TuplesKt.to(bsbElement.getIdentifierSpec(), new FormFieldEntry(fieldValue, z)));
    }
}
