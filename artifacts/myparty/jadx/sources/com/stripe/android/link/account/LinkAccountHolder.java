package com.stripe.android.link.account;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.LinkAccountUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LinkAccountHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/link/account/LinkAccountHolder;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "linkAccountInfo", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/LinkAccountUpdate$Value;", "getLinkAccountInfo", "()Lkotlinx/coroutines/flow/StateFlow;", "set", "", "info", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountHolder {
    private static final String LINK_ACCOUNT_HOLDER_STATE = "LINK_ACCOUNT_HOLDER_STATE";
    private final StateFlow<LinkAccountUpdate.Value> linkAccountInfo;
    private final SavedStateHandle savedStateHandle;
    public static final int $stable = 8;

    public LinkAccountHolder(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.linkAccountInfo = savedStateHandle.getStateFlow(LINK_ACCOUNT_HOLDER_STATE, new LinkAccountUpdate.Value(null, null));
    }

    public final StateFlow<LinkAccountUpdate.Value> getLinkAccountInfo() {
        return this.linkAccountInfo;
    }

    public final void set(LinkAccountUpdate.Value info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.savedStateHandle.set(LINK_ACCOUNT_HOLDER_STATE, info);
    }
}
