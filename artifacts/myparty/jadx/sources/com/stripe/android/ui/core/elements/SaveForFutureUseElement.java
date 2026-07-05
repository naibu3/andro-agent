package com.stripe.android.ui.core.elements;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SaveForFutureUseElement.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001e0\u001d0\u001c0\u001bH\u0016J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u0017X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, d2 = {"Lcom/stripe/android/ui/core/elements/SaveForFutureUseElement;", "Lcom/stripe/android/uicore/elements/FormElement;", "initialValue", "", "merchantName", "", "<init>", "(ZLjava/lang/String;)V", "getInitialValue", "()Z", "getMerchantName", "()Ljava/lang/String;", "allowsUserInteraction", "getAllowsUserInteraction", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "controller", "Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", "getController", "()Lcom/stripe/android/ui/core/elements/SaveForFutureUseController;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getIdentifier", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getFormFieldValueFlow", "Lkotlinx/coroutines/flow/StateFlow;", "", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class SaveForFutureUseElement implements FormElement {
    public static final int $stable = 8;
    private final SaveForFutureUseController controller;
    private final boolean initialValue;
    private final ResolvableString mandateText;
    private final String merchantName;
    private final boolean allowsUserInteraction = true;
    private final IdentifierSpec identifier = IdentifierSpec.INSTANCE.getSaveForFutureUse();

    public static /* synthetic */ SaveForFutureUseElement copy$default(SaveForFutureUseElement saveForFutureUseElement, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = saveForFutureUseElement.initialValue;
        }
        if ((i & 2) != 0) {
            str = saveForFutureUseElement.merchantName;
        }
        return saveForFutureUseElement.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getInitialValue() {
        return this.initialValue;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    public final SaveForFutureUseElement copy(boolean initialValue, String merchantName) {
        return new SaveForFutureUseElement(initialValue, merchantName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaveForFutureUseElement)) {
            return false;
        }
        SaveForFutureUseElement saveForFutureUseElement = (SaveForFutureUseElement) other;
        return this.initialValue == saveForFutureUseElement.initialValue && Intrinsics.areEqual(this.merchantName, saveForFutureUseElement.merchantName);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.initialValue) * 31;
        String str = this.merchantName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "SaveForFutureUseElement(initialValue=" + this.initialValue + ", merchantName=" + this.merchantName + ")";
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        return FormElement.DefaultImpls.getTextFieldIdentifiers(this);
    }

    public SaveForFutureUseElement(boolean z, String str) {
        this.initialValue = z;
        this.merchantName = str;
        this.controller = new SaveForFutureUseController(str, z);
    }

    public final boolean getInitialValue() {
        return this.initialValue;
    }

    public final String getMerchantName() {
        return this.merchantName;
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
    public SaveForFutureUseController getController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public IdentifierSpec getIdentifier() {
        return this.identifier;
    }

    @Override // com.stripe.android.uicore.elements.FormElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        return StateFlowsKt.mapAsStateFlow(getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.SaveForFutureUseElement$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SaveForFutureUseElement.getFormFieldValueFlow$lambda$0(this.f$0, (FormFieldEntry) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getFormFieldValueFlow$lambda$0(SaveForFutureUseElement saveForFutureUseElement, FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(TuplesKt.to(saveForFutureUseElement.getIdentifier(), it));
    }
}
