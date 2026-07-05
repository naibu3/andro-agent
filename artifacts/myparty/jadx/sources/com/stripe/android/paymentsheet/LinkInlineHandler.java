package com.stripe.android.paymentsheet;

import com.stripe.android.link.ui.inline.InlineSignupViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: LinkInlineHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "", "<init>", "()V", "_linkInlineState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "linkInlineState", "Lkotlinx/coroutines/flow/StateFlow;", "getLinkInlineState", "()Lkotlinx/coroutines/flow/StateFlow;", "onStateUpdated", "", "viewState", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkInlineHandler {
    private final MutableStateFlow<InlineSignupViewState> _linkInlineState;
    private final StateFlow<InlineSignupViewState> linkInlineState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ LinkInlineHandler(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private LinkInlineHandler() {
        MutableStateFlow<InlineSignupViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._linkInlineState = MutableStateFlow;
        this.linkInlineState = MutableStateFlow;
    }

    public final StateFlow<InlineSignupViewState> getLinkInlineState() {
        return this.linkInlineState;
    }

    public final void onStateUpdated(InlineSignupViewState viewState) {
        this._linkInlineState.setValue(viewState);
    }

    /* compiled from: LinkInlineHandler.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/LinkInlineHandler$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/LinkInlineHandler;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LinkInlineHandler create() {
            return new LinkInlineHandler(null);
        }
    }
}
