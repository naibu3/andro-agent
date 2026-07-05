package com.stripe.android.financialconnections.features.linkaccountpicker;

import com.stripe.android.financialconnections.model.Image;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;

/* compiled from: LinkAccountPickerViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, d2 = {"withIcon", "LFinancialConnectionsGenericInfoScreen;", "iconUrl", "", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountPickerViewModelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FinancialConnectionsGenericInfoScreen withIcon(FinancialConnectionsGenericInfoScreen financialConnectionsGenericInfoScreen, String str) {
        FinancialConnectionsGenericInfoScreen.Header header = financialConnectionsGenericInfoScreen.getHeader();
        return FinancialConnectionsGenericInfoScreen.copy$default(financialConnectionsGenericInfoScreen, null, header != null ? FinancialConnectionsGenericInfoScreen.Header.copy$default(header, null, null, new Image(str), null, 11, null) : null, null, null, null, 29, null);
    }
}
