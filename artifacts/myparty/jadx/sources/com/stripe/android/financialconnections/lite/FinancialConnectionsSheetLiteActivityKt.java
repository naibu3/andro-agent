package com.stripe.android.financialconnections.lite;

import android.content.Context;
import android.content.Intent;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetLiteActivity.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"intentBuilder", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "financial-connections-lite_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetLiteActivityKt {
    public static final Function1<FinancialConnectionsSheetActivityArgs, Intent> intentBuilder(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Function1() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivityKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FinancialConnectionsSheetLiteActivityKt.intentBuilder$lambda$0(context, (FinancialConnectionsSheetActivityArgs) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent intentBuilder$lambda$0(Context context, FinancialConnectionsSheetActivityArgs args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return FinancialConnectionsSheetLiteActivity.INSTANCE.intent(context, args);
    }
}
