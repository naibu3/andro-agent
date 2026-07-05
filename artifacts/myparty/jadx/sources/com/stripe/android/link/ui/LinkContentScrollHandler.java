package com.stripe.android.link.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkContentScrollHandler.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/ui/LinkContentScrollHandler;", "", "onCanScrollBackwardChanged", "Lkotlin/Function1;", "", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "handleCanScrollBackwardChanged", "canScrollBackward", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkContentScrollHandler {
    public static final int $stable = 0;
    private final Function1<Boolean, Unit> onCanScrollBackwardChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkContentScrollHandler(Function1<? super Boolean, Unit> onCanScrollBackwardChanged) {
        Intrinsics.checkNotNullParameter(onCanScrollBackwardChanged, "onCanScrollBackwardChanged");
        this.onCanScrollBackwardChanged = onCanScrollBackwardChanged;
    }

    public final void handleCanScrollBackwardChanged(boolean canScrollBackward) {
        this.onCanScrollBackwardChanged.invoke(Boolean.valueOf(canScrollBackward));
    }
}
