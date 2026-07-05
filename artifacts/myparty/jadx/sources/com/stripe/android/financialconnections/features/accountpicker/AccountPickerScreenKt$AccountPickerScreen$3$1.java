package com.stripe.android.financialconnections.features.accountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AccountPickerScreenKt$AccountPickerScreen$3$1 extends FunctionReferenceImpl implements Function1<PartnerAccount, Unit> {
    AccountPickerScreenKt$AccountPickerScreen$3$1(Object obj) {
        super(1, obj, AccountPickerViewModel.class, "onAccountClicked", "onAccountClicked(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PartnerAccount partnerAccount) {
        invoke2(partnerAccount);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PartnerAccount p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AccountPickerViewModel) this.receiver).onAccountClicked(p0);
    }
}
