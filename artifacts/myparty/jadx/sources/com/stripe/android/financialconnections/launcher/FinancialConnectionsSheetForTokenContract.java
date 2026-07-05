package com.stripe.android.financialconnections.launcher;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetForTokenContract.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016J\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0013H\u0002R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForTokenContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForToken;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;", "intentBuilder", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/content/Intent;", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", SDKConstants.PARAM_INTENT, "toExposedResult", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetForTokenContract extends ActivityResultContract<FinancialConnectionsSheetActivityArgs.ForToken, FinancialConnectionsSheetForTokenResult> {
    private final Function1<FinancialConnectionsSheetActivityArgs, Intent> intentBuilder;

    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsSheetForTokenContract(Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder) {
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        this.intentBuilder = intentBuilder;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context, FinancialConnectionsSheetActivityArgs.ForToken input) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return this.intentBuilder.invoke(input);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.activity.result.contract.ActivityResultContract
    public FinancialConnectionsSheetForTokenResult parseResult(int resultCode, Intent intent) {
        FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult;
        FinancialConnectionsSheetForTokenResult exposedResult;
        return (intent == null || (financialConnectionsSheetActivityResult = (FinancialConnectionsSheetActivityResult) intent.getParcelableExtra(FinancialConnectionsSheetActivityResult.EXTRA_RESULT)) == null || (exposedResult = toExposedResult(financialConnectionsSheetActivityResult)) == null) ? new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("Failed to retrieve a ConnectionsSheetResult.")) : exposedResult;
    }

    private final FinancialConnectionsSheetForTokenResult toExposedResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult) {
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Canceled) {
            return FinancialConnectionsSheetForTokenResult.Canceled.INSTANCE;
        }
        if (financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Failed) {
            return new FinancialConnectionsSheetForTokenResult.Failed(((FinancialConnectionsSheetActivityResult.Failed) financialConnectionsSheetActivityResult).getError());
        }
        if (!(financialConnectionsSheetActivityResult instanceof FinancialConnectionsSheetActivityResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        FinancialConnectionsSheetActivityResult.Completed completed = (FinancialConnectionsSheetActivityResult.Completed) financialConnectionsSheetActivityResult;
        if (completed.getFinancialConnectionsSession() == null) {
            return new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("FinancialConnectionsSession is not set"));
        }
        if (completed.getToken() == null) {
            return new FinancialConnectionsSheetForTokenResult.Failed(new IllegalArgumentException("PaymentAccount is not set on FinancialConnectionsSession"));
        }
        return new FinancialConnectionsSheetForTokenResult.Completed(completed.getFinancialConnectionsSession(), completed.getToken());
    }
}
