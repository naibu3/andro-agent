package com.stripe.android.financialconnections.features.manualentry;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: ManualEntryViewModel.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class ManualEntryViewModel$form$6 extends AdaptedFunctionReference implements Function4<String, String, String, Continuation<? super ManualEntryFormState>, Object>, SuspendFunction {
    public static final ManualEntryViewModel$form$6 INSTANCE = new ManualEntryViewModel$form$6();

    ManualEntryViewModel$form$6() {
        super(4, ManualEntryFormState.class, "<init>", "<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(String str, String str2, String str3, Continuation<? super ManualEntryFormState> continuation) {
        return ManualEntryViewModel.form$lambda$3(str, str2, str3, continuation);
    }
}
