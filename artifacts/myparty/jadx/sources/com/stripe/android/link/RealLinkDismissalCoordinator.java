package com.stripe.android.link;

import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LinkDismissalCoordinator.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/stripe/android/link/RealLinkDismissalCoordinator;", "Lcom/stripe/android/link/LinkDismissalCoordinator;", "<init>", "()V", "_canDismiss", "", "canDismiss", "getCanDismiss", "()Z", "setDismissible", "", "dismissible", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealLinkDismissalCoordinator implements LinkDismissalCoordinator {
    public static final int $stable = 8;
    private boolean _canDismiss = true;

    @Inject
    public RealLinkDismissalCoordinator() {
    }

    @Override // com.stripe.android.link.LinkDismissalCoordinator
    /* renamed from: getCanDismiss, reason: from getter */
    public boolean get_canDismiss() {
        return this._canDismiss;
    }

    @Override // com.stripe.android.link.LinkDismissalCoordinator
    public void setDismissible(boolean dismissible) {
        this._canDismiss = dismissible;
    }
}
