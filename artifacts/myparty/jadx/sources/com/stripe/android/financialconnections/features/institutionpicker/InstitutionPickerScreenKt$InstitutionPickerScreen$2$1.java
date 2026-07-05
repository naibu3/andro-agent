package com.stripe.android.financialconnections.features.institutionpicker;

import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class InstitutionPickerScreenKt$InstitutionPickerScreen$2$1 extends FunctionReferenceImpl implements Function2<FinancialConnectionsInstitution, Boolean, Unit> {
    InstitutionPickerScreenKt$InstitutionPickerScreen$2$1(Object obj) {
        super(2, obj, InstitutionPickerViewModel.class, "onInstitutionSelected", "onInstitutionSelected(Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(FinancialConnectionsInstitution financialConnectionsInstitution, Boolean bool) {
        invoke(financialConnectionsInstitution, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FinancialConnectionsInstitution p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InstitutionPickerViewModel) this.receiver).onInstitutionSelected(p0, z);
    }
}
