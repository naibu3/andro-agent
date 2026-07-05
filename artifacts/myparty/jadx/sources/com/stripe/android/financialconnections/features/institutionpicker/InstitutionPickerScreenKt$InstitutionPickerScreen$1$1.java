package com.stripe.android.financialconnections.features.institutionpicker;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class InstitutionPickerScreenKt$InstitutionPickerScreen$1$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    InstitutionPickerScreenKt$InstitutionPickerScreen$1$1(Object obj) {
        super(1, obj, InstitutionPickerViewModel.class, "onQueryChanged", "onQueryChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((InstitutionPickerViewModel) this.receiver).onQueryChanged(p0);
    }
}
