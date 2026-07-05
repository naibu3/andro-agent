package com.stripe.android.financialconnections.features.common;

import com.stripe.android.uicore.elements.OTPElement;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: VerificationSection.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class VerificationSectionKt$VerificationSection$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    VerificationSectionKt$VerificationSection$1$1$1$1(Object obj) {
        super(0, obj, VerificationSectionKt.class, "populateTestCode", "populateTestCode(Lcom/stripe/android/uicore/elements/OTPElement;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws IOException {
        VerificationSectionKt.populateTestCode((OTPElement) this.receiver);
    }
}
