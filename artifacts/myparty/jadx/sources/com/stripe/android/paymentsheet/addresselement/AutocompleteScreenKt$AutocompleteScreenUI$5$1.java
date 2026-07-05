package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.ui.core.elements.autocomplete.model.AutocompletePrediction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AutocompleteScreenKt$AutocompleteScreenUI$5$1 extends FunctionReferenceImpl implements Function1<AutocompletePrediction, Unit> {
    AutocompleteScreenKt$AutocompleteScreenUI$5$1(Object obj) {
        super(1, obj, AutocompleteViewModel.class, "selectPrediction", "selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AutocompletePrediction autocompletePrediction) {
        invoke2(autocompletePrediction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AutocompletePrediction p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AutocompleteViewModel) this.receiver).selectPrediction(p0);
    }
}
