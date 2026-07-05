package com.stripe.android.financialconnections.presentation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarState;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"parentViewModel", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "toTopAppBarState", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarState;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "forceHideStripeLogo", "", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeViewModelKt {
    public static final FinancialConnectionsSheetNativeViewModel parentViewModel(Composer composer, int i) {
        composer.startReplaceGroup(688516201);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(688516201, i, -1, "com.stripe.android.financialconnections.presentation.parentViewModel (FinancialConnectionsSheetNativeViewModel.kt:617)");
        }
        FinancialConnectionsSheetNativeViewModel viewModel = ComposeExtensionsKt.parentActivity(composer, 0).getViewModel();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return viewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarState toTopAppBarState(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, boolean z) {
        return new TopAppBarState(financialConnectionsSheetNativeState.getReducedBranding(), z, false, financialConnectionsSheetNativeState.getTheme(), financialConnectionsSheetNativeState.getTestMode(), false, false, null, false, 484, null);
    }
}
