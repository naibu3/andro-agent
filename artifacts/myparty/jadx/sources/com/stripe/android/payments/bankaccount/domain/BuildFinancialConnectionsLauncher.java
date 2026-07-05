package com.stripe.android.payments.bankaccount.domain;

import androidx.activity.ComponentActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher;
import com.stripe.android.payments.bankaccount.CollectBankAccountConfiguration;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailability;
import com.stripe.android.payments.financialconnections.FinancialConnectionsAvailabilityKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildFinancialConnectionsLauncher.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\rH\u0086\u0002¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/payments/bankaccount/domain/BuildFinancialConnectionsLauncher;", "", "<init>", "()V", "invoke", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "activity", "Landroidx/activity/ComponentActivity;", "configuration", "Lcom/stripe/android/payments/bankaccount/CollectBankAccountConfiguration;", "financialConnectionsAvailability", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "onConnectionsForInstantDebitsResult", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;", "", "onConnectionsForACHResult", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuildFinancialConnectionsLauncher {
    public static final int $stable = 0;
    public static final BuildFinancialConnectionsLauncher INSTANCE = new BuildFinancialConnectionsLauncher();

    private BuildFinancialConnectionsLauncher() {
    }

    public final FinancialConnectionsSheetLauncher invoke(ComponentActivity activity, CollectBankAccountConfiguration configuration, FinancialConnectionsAvailability financialConnectionsAvailability, Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> onConnectionsForInstantDebitsResult, Function1<? super FinancialConnectionsSheetResult, Unit> onConnectionsForACHResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(financialConnectionsAvailability, "financialConnectionsAvailability");
        Intrinsics.checkNotNullParameter(onConnectionsForInstantDebitsResult, "onConnectionsForInstantDebitsResult");
        Intrinsics.checkNotNullParameter(onConnectionsForACHResult, "onConnectionsForACHResult");
        if (configuration instanceof CollectBankAccountConfiguration.InstantDebits) {
            return new FinancialConnectionsSheetForInstantDebitsLauncher(activity, FinancialConnectionsAvailabilityKt.getIntentBuilder(financialConnectionsAvailability, activity), onConnectionsForInstantDebitsResult);
        }
        if (!(configuration instanceof CollectBankAccountConfiguration.USBankAccount) && !(configuration instanceof CollectBankAccountConfiguration.USBankAccountInternal)) {
            throw new NoWhenBranchMatchedException();
        }
        return new FinancialConnectionsSheetForDataLauncher(activity, FinancialConnectionsAvailabilityKt.getIntentBuilder(financialConnectionsAvailability, activity), new BuildFinancialConnectionsLauncher$sam$com_stripe_android_financialconnections_FinancialConnectionsSheetResultCallback$0(onConnectionsForACHResult));
    }
}
