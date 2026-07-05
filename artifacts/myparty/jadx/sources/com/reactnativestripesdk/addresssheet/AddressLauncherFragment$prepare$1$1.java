package com.reactnativestripesdk.addresssheet;

import com.stripe.android.paymentsheet.addresselement.AddressLauncherResult;
import com.stripe.android.paymentsheet.addresselement.AddressLauncherResultCallback;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressLauncherFragment.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class AddressLauncherFragment$prepare$1$1 implements AddressLauncherResultCallback, FunctionAdapter {
    final /* synthetic */ AddressLauncherFragment $tmp0;

    AddressLauncherFragment$prepare$1$1(AddressLauncherFragment addressLauncherFragment) {
        this.$tmp0 = addressLauncherFragment;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof AddressLauncherResultCallback) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, AddressLauncherFragment.class, "onAddressLauncherResult", "onAddressLauncherResult(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressLauncherResultCallback
    public final void onAddressLauncherResult(AddressLauncherResult p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        this.$tmp0.onAddressLauncherResult(p0);
    }
}
