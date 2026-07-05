package com.stripe.android.paymentsheet.ui;

import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.LinkHandler;
import com.stripe.android.paymentsheet.utils.EdgeToEdgeKt;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.uicore.utils.AnimationConstantsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSheetActivity.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0016J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0014H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "ResultType", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewModel", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "linkHandler", "Lcom/stripe/android/paymentsheet/LinkHandler;", "getLinkHandler", "()Lcom/stripe/android/paymentsheet/LinkHandler;", "earlyExitDueToIllegalState", "", "getEarlyExitDueToIllegalState", "()Z", "setEarlyExitDueToIllegalState", "(Z)V", "setActivityResult", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "(Ljava/lang/Object;)V", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "finish", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseSheetActivity<ResultType> extends AppCompatActivity {
    public static final int $stable = 8;
    private boolean earlyExitDueToIllegalState;

    public abstract BaseSheetViewModel getViewModel();

    public abstract void setActivityResult(ResultType result);

    public final LinkHandler getLinkHandler() {
        return getViewModel().getLinkHandler();
    }

    protected final boolean getEarlyExitDueToIllegalState() {
        return this.earlyExitDueToIllegalState;
    }

    protected final void setEarlyExitDueToIllegalState(boolean z) {
        this.earlyExitDueToIllegalState = z;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (this.earlyExitDueToIllegalState) {
            return;
        }
        EdgeToEdgeKt.renderEdgeToEdge(this);
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.paymentsheet.ui.BaseSheetActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSheetActivity.onCreate$lambda$0(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(BaseSheetActivity baseSheetActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        baseSheetActivity.getViewModel().handleBackPressed();
        return Unit.INSTANCE;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        AnimationConstantsKt.fadeOut(this);
    }
}
