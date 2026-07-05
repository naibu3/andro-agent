package com.stripe.android.link;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LinkScreenContent.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class LinkScreenContentKt$LinkScreenContent$linkContentScrollHandler$1$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    LinkScreenContentKt$LinkScreenContent$linkContentScrollHandler$1$1(Object obj) {
        super(1, obj, LinkActivityViewModel.class, "onContentCanScrollBackwardChanged", "onContentCanScrollBackwardChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((LinkActivityViewModel) this.receiver).onContentCanScrollBackwardChanged(z);
    }
}
