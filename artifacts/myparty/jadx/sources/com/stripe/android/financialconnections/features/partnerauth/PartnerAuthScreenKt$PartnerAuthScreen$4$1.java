package com.stripe.android.financialconnections.features.partnerauth;

import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PartnerAuthScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class PartnerAuthScreenKt$PartnerAuthScreen$4$1 extends FunctionReferenceImpl implements Function1<WebAuthFlowState, Unit> {
    PartnerAuthScreenKt$PartnerAuthScreen$4$1(Object obj) {
        super(1, obj, PartnerAuthViewModel.class, "onWebAuthFlowFinished", "onWebAuthFlowFinished(Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WebAuthFlowState webAuthFlowState) {
        invoke2(webAuthFlowState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebAuthFlowState p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PartnerAuthViewModel) this.receiver).onWebAuthFlowFinished(p0);
    }
}
