package com.stripe.android.financialconnections.launcher;

import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsSheetLauncher.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "", "present", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsSheetLauncher {
    void present(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext);

    /* compiled from: FinancialConnectionsSheetLauncher.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void present$default(FinancialConnectionsSheetLauncher financialConnectionsSheetLauncher, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: present");
            }
            if ((i & 2) != 0) {
                elementsSessionContext = null;
            }
            financialConnectionsSheetLauncher.present(financialConnectionsSheetConfiguration, elementsSessionContext);
        }
    }
}
