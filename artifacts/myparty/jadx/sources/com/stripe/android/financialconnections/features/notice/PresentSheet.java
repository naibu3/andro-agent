package com.stripe.android.financialconnections.features.notice;

import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import kotlin.Metadata;

/* compiled from: PresentSheet.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002¨\u0006\b"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "", "invoke", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PresentSheet {
    void invoke(NoticeSheetState.NoticeSheetContent content, FinancialConnectionsSessionManifest.Pane referrer);
}
