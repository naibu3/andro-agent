package com.stripe.android.financialconnections.features.linkstepupverification;

import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkStepUpVerificationScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    LinkStepUpVerificationScreenKt$LinkStepUpVerificationScreen$2$1(Object obj) {
        super(1, obj, FinancialConnectionsSheetNativeViewModel.class, "onCloseFromErrorClick", "onCloseFromErrorClick(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FinancialConnectionsSheetNativeViewModel) this.receiver).onCloseFromErrorClick(p0);
    }
}
