package com.stripe.android.uicore.elements;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OTPElementUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class OTPElementUIKt$OTPElementUI$2$1$1$1$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    OTPElementUIKt$OTPElementUI$2$1$1$1$1(Object obj) {
        super(1, obj, OTPController.class, "onAutofillDigit", "onAutofillDigit(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) throws IOException {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OTPController) this.receiver).onAutofillDigit(p0);
    }
}
