package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.MandateHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: USBankAccountFormArguments.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class USBankAccountFormArguments$Companion$create$1 extends FunctionReferenceImpl implements Function2<ResolvableString, Boolean, Unit> {
    USBankAccountFormArguments$Companion$create$1(Object obj) {
        super(2, obj, MandateHandler.class, "updateMandateText", "updateMandateText(Lcom/stripe/android/core/strings/ResolvableString;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(ResolvableString resolvableString, Boolean bool) {
        invoke(resolvableString, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ResolvableString resolvableString, boolean z) {
        ((MandateHandler) this.receiver).updateMandateText(resolvableString, z);
    }
}
