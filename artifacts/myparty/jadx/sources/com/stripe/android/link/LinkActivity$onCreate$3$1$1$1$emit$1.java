package com.stripe.android.link;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkActivity$onCreate$3$1$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LinkActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.stripe.android.link.LinkActivity$onCreate$3$1$1$1", f = "LinkActivity.kt", i = {0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "emit", n = {"this", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class LinkActivity$onCreate$3$1$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkActivity$onCreate$3$1$1.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LinkActivity$onCreate$3$1$1$1$emit$1(LinkActivity$onCreate$3$1$1.AnonymousClass1<? super T> anonymousClass1, Continuation<? super LinkActivity$onCreate$3$1$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((LinkActivityResult) null, (Continuation<? super Unit>) this);
    }
}
