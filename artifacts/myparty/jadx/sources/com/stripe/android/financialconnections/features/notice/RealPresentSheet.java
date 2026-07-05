package com.stripe.android.financialconnections.features.notice;

import com.facebook.common.util.UriUtil;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PresentSheet.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/features/notice/RealPresentSheet;", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "noticeSheetContentRepository", "Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;", "accountUpdateRequiredContentRepository", "Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;", "<init>", "(Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/financialconnections/repository/NoticeSheetContentRepository;Lcom/stripe/android/financialconnections/repository/AccountUpdateRequiredContentRepository;)V", "invoke", "", UriUtil.LOCAL_CONTENT_SCHEME, "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetState$NoticeSheetContent;", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealPresentSheet implements PresentSheet {
    public static final int $stable = 8;
    private final AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository;
    private final NavigationManager navigationManager;
    private final NoticeSheetContentRepository noticeSheetContentRepository;

    @Inject
    public RealPresentSheet(NavigationManager navigationManager, NoticeSheetContentRepository noticeSheetContentRepository, AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository) {
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(noticeSheetContentRepository, "noticeSheetContentRepository");
        Intrinsics.checkNotNullParameter(accountUpdateRequiredContentRepository, "accountUpdateRequiredContentRepository");
        this.navigationManager = navigationManager;
        this.noticeSheetContentRepository = noticeSheetContentRepository;
        this.accountUpdateRequiredContentRepository = accountUpdateRequiredContentRepository;
    }

    @Override // com.stripe.android.financialconnections.features.notice.PresentSheet
    public void invoke(NoticeSheetState.NoticeSheetContent content, FinancialConnectionsSessionManifest.Pane referrer) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        if (content instanceof NoticeSheetState.NoticeSheetContent.UpdateRequired) {
            this.accountUpdateRequiredContentRepository.set((NoticeSheetState.NoticeSheetContent.UpdateRequired) content);
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.AccountUpdateRequired.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        } else {
            this.noticeSheetContentRepository.set(content);
            NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Notice.INSTANCE, referrer, null, 2, null), null, false, 6, null);
        }
    }
}
