package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.financialconnections.model.PartnerAccount;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAccountPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkAccountPickerScreenKt$LinkAccountPickerScreen$7$1 extends FunctionReferenceImpl implements Function1<PartnerAccount, Unit> {
    LinkAccountPickerScreenKt$LinkAccountPickerScreen$7$1(Object obj) {
        super(1, obj, LinkAccountPickerViewModel.class, "onAccountClick", "onAccountClick(Lcom/stripe/android/financialconnections/model/PartnerAccount;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PartnerAccount partnerAccount) {
        invoke2(partnerAccount);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PartnerAccount p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LinkAccountPickerViewModel) this.receiver).onAccountClick(p0);
    }
}
