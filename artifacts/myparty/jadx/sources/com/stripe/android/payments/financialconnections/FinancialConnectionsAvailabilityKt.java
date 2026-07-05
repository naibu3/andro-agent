package com.stripe.android.payments.financialconnections;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.FinancialConnectionsSheetKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivityKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsAvailability.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"getIntentBuilder", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/content/Intent;", "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;", "context", "Landroid/content/Context;", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FinancialConnectionsAvailabilityKt {

    /* compiled from: FinancialConnectionsAvailability.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsAvailability.values().length];
            try {
                iArr[FinancialConnectionsAvailability.Full.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsAvailability.Lite.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Function1<FinancialConnectionsSheetActivityArgs, Intent> getIntentBuilder(FinancialConnectionsAvailability financialConnectionsAvailability, Context context) {
        Intrinsics.checkNotNullParameter(financialConnectionsAvailability, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int i = WhenMappings.$EnumSwitchMapping$0[financialConnectionsAvailability.ordinal()];
        if (i == 1) {
            return FinancialConnectionsSheetKt.intentBuilder(context);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return FinancialConnectionsSheetLiteActivityKt.intentBuilder(context);
    }
}
