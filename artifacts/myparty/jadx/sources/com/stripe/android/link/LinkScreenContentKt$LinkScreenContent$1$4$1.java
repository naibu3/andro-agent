package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkScreenContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkScreenContentKt$LinkScreenContent$1$4$1 extends AdaptedFunctionReference implements Function2<LinkScreen, Boolean, Unit> {
    LinkScreenContentKt$LinkScreenContent$1$4$1(Object obj) {
        super(2, obj, LinkActivityViewModel.class, "navigate", "navigate(Lcom/stripe/android/link/LinkScreen;ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(LinkScreen linkScreen, Boolean bool) {
        invoke(linkScreen, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LinkScreen p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        LinkActivityViewModel.navigate$default((LinkActivityViewModel) this.receiver, p0, z, false, 4, null);
    }
}
