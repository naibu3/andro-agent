package com.stripe.android.financialconnections;

import android.content.Context;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetCompose.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0003H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\t"}, d2 = {"rememberFinancialConnectionsSheet", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "callback", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;", "", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/FinancialConnectionsSheet;", "rememberFinancialConnectionsSheetForToken", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetForTokenResult;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetComposeKt {
    public static final FinancialConnectionsSheet rememberFinancialConnectionsSheet(final Function1<? super FinancialConnectionsSheetResult, Unit> callback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(-1667305132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1667305132, i, -1, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheet (FinancialConnectionsSheetCompose.kt:25)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FinancialConnectionsSheetForDataContract financialConnectionsSheetForDataContract = new FinancialConnectionsSheetForDataContract(FinancialConnectionsSheetKt.intentBuilder((Context) objConsume));
        composer.startReplaceGroup(-512218585);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(callback)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetComposeKt.rememberFinancialConnectionsSheet$lambda$1$lambda$0(callback, (FinancialConnectionsSheetResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(financialConnectionsSheetForDataContract, (Function1) objRememberedValue, composer, 0);
        composer.startReplaceGroup(-512217537);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new FinancialConnectionsSheet(new FinancialConnectionsSheetForDataLauncher(managedActivityResultLauncherRememberLauncherForActivityResult));
            composer.updateRememberedValue(objRememberedValue2);
        }
        FinancialConnectionsSheet financialConnectionsSheet = (FinancialConnectionsSheet) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberFinancialConnectionsSheet$lambda$1$lambda$0(Function1 function1, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    public static final FinancialConnectionsSheet rememberFinancialConnectionsSheetForToken(final Function1<? super FinancialConnectionsSheetForTokenResult, Unit> callback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(1097997444);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1097997444, i, -1, "com.stripe.android.financialconnections.rememberFinancialConnectionsSheetForToken (FinancialConnectionsSheetCompose.kt:53)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        FinancialConnectionsSheetForTokenContract financialConnectionsSheetForTokenContract = new FinancialConnectionsSheetForTokenContract(FinancialConnectionsSheetKt.intentBuilder((Context) objConsume));
        composer.startReplaceGroup(2024631063);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(callback)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.FinancialConnectionsSheetComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FinancialConnectionsSheetComposeKt.rememberFinancialConnectionsSheetForToken$lambda$4$lambda$3(callback, (FinancialConnectionsSheetForTokenResult) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        ManagedActivityResultLauncher managedActivityResultLauncherRememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(financialConnectionsSheetForTokenContract, (Function1) objRememberedValue, composer, 0);
        composer.startReplaceGroup(2024632112);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new FinancialConnectionsSheet(new FinancialConnectionsSheetForTokenLauncher(managedActivityResultLauncherRememberLauncherForActivityResult));
            composer.updateRememberedValue(objRememberedValue2);
        }
        FinancialConnectionsSheet financialConnectionsSheet = (FinancialConnectionsSheet) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return financialConnectionsSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit rememberFinancialConnectionsSheetForToken$lambda$4$lambda$3(Function1 function1, FinancialConnectionsSheetForTokenResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
