package com.stripe.android.paymentsheet.addresselement;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressLauncher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1 extends FunctionReferenceImpl implements Function1<AddressLauncherResult, Unit> {
    AddressLauncherKt$rememberAddressLauncher$activityResultLauncher$1$1(Object obj) {
        super(1, obj, AddressLauncherResultCallback.class, "onAddressLauncherResult", "onAddressLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressLauncherResult addressLauncherResult) {
        invoke2(addressLauncherResult);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressLauncherResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AddressLauncherResultCallback) this.receiver).onAddressLauncherResult(p0);
    }
}
