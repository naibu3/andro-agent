package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SectionSingleFieldElement.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000fH\u0016J\u001e\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016H\u0016J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00100\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "controller", "Lcom/stripe/android/uicore/elements/InputController;", "getController", "()Lcom/stripe/android/uicore/elements/InputController;", "sectionFieldErrorController", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "setRawValue", "", "rawValuesMap", "", "", "getTextFieldIdentifiers", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SectionSingleFieldElement implements SectionFieldElement {
    public static final int $stable = 0;
    private final IdentifierSpec identifier;

    public abstract InputController getController();

    public SectionSingleFieldElement(IdentifierSpec identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return getController();
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return StateFlowsKt.mapAsStateFlow(getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.uicore.elements.SectionSingleFieldElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SectionSingleFieldElement.getFormFieldValueFlow$lambda$0(this.f$0, (FormFieldEntry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFormFieldValueFlow$lambda$0(SectionSingleFieldElement sectionSingleFieldElement, FormFieldEntry formFieldEntry) {
        Intrinsics.checkNotNullParameter(formFieldEntry, "formFieldEntry");
        return CollectionsKt.listOf(TuplesKt.to(sectionSingleFieldElement.getIdentifier(), formFieldEntry));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
        String str = rawValuesMap.get(getIdentifier());
        if (str != null) {
            getController().onRawValueChange(str);
        }
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        List listListOf = CollectionsKt.listOf(getIdentifier());
        if (!(getController() instanceof TextFieldController)) {
            listListOf = null;
        }
        if (listListOf == null) {
            listListOf = CollectionsKt.emptyList();
        }
        return StateFlowKt.MutableStateFlow(listListOf);
    }
}
