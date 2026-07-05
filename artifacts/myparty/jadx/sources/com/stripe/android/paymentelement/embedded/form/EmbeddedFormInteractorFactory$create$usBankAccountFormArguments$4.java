package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: EmbeddedFormInteractorFactory.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$4 extends FunctionReferenceImpl implements Function1<ResolvableString, Unit> {
    EmbeddedFormInteractorFactory$create$usBankAccountFormArguments$4(Object obj) {
        super(1, obj, FormActivityStateHelper.class, "updateError", "updateError(Lcom/stripe/android/core/strings/ResolvableString;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ResolvableString resolvableString) {
        invoke2(resolvableString);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ResolvableString resolvableString) {
        ((FormActivityStateHelper) this.receiver).updateError(resolvableString);
    }
}
