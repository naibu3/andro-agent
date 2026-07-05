package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GooglePayPaymentMethodLauncher.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class GooglePayPaymentMethodLauncherKt$rememberGooglePayPaymentMethodLauncher$activityResultLauncher$1$1 extends FunctionReferenceImpl implements Function1<GooglePayPaymentMethodLauncher.Result, Unit> {
    GooglePayPaymentMethodLauncherKt$rememberGooglePayPaymentMethodLauncher$activityResultLauncher$1$1(Object obj) {
        super(1, obj, GooglePayPaymentMethodLauncher.ResultCallback.class, "onResult", "onResult(Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Result;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GooglePayPaymentMethodLauncher.Result result) {
        invoke2(result);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GooglePayPaymentMethodLauncher.Result p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GooglePayPaymentMethodLauncher.ResultCallback) this.receiver).onResult(p0);
    }
}
