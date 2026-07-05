package com.stripe.android.link;

import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkScreenContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkScreenContentKt$LinkScreenContent$1$11$1 extends FunctionReferenceImpl implements Function1<NavBackStackEntryUpdate, Unit> {
    LinkScreenContentKt$LinkScreenContent$1$11$1(Object obj) {
        super(1, obj, LinkActivityViewModel.class, "onNavEntryChanged", "onNavEntryChanged(Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntryUpdate navBackStackEntryUpdate) {
        invoke2(navBackStackEntryUpdate);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(NavBackStackEntryUpdate p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((LinkActivityViewModel) this.receiver).onNavEntryChanged(p0);
    }
}
