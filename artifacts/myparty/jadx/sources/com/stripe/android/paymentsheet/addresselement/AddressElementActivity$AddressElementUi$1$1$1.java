package com.stripe.android.paymentsheet.addresselement;

import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: AddressElementActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AddressElementActivity$AddressElementUi$1$1$1 extends AdaptedFunctionReference implements Function0<Unit> {
    AddressElementActivity$AddressElementUi$1$1$1(Object obj) {
        super(0, obj, NavHostAddressElementNavigator.class, "dismiss", "dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AddressElementNavigator.DefaultImpls.dismiss$default((NavHostAddressElementNavigator) this.receiver, null, 1, null);
    }
}
