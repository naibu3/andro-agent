package com.stripe.android.financialconnections.features.networkinglinksignup;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: NetworkingLinkSignupScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1 extends AdaptedFunctionReference implements Function0<Unit> {
    NetworkingLinkSignupScreenKt$NetworkingLinkSignupScreen$6$1(Object obj) {
        super(0, obj, NetworkingLinkSignupViewModel.class, "onSkipClick", "onSkipClick()Lkotlinx/coroutines/Job;", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((NetworkingLinkSignupViewModel) this.receiver).onSkipClick();
    }
}
