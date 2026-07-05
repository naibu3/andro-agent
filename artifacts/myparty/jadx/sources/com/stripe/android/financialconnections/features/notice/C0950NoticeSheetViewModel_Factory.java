package com.stripe.android.financialconnections.features.notice;

import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* renamed from: com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0950NoticeSheetViewModel_Factory {
    private final Provider<HandleClickableUrl> handleClickableUrlProvider;
    private final Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<NoticeSheetContentRepository> noticeSheetContentRepositoryProvider;

    public C0950NoticeSheetViewModel_Factory(Provider<NativeAuthFlowCoordinator> provider, Provider<NavigationManager> provider2, Provider<NoticeSheetContentRepository> provider3, Provider<HandleClickableUrl> provider4) {
        this.nativeAuthFlowCoordinatorProvider = provider;
        this.navigationManagerProvider = provider2;
        this.noticeSheetContentRepositoryProvider = provider3;
        this.handleClickableUrlProvider = provider4;
    }

    public NoticeSheetViewModel get(NoticeSheetState noticeSheetState) {
        return newInstance(noticeSheetState, this.nativeAuthFlowCoordinatorProvider.get(), this.navigationManagerProvider.get(), this.noticeSheetContentRepositoryProvider.get(), this.handleClickableUrlProvider.get());
    }

    public static C0950NoticeSheetViewModel_Factory create(javax.inject.Provider<NativeAuthFlowCoordinator> provider, javax.inject.Provider<NavigationManager> provider2, javax.inject.Provider<NoticeSheetContentRepository> provider3, javax.inject.Provider<HandleClickableUrl> provider4) {
        return new C0950NoticeSheetViewModel_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    public static C0950NoticeSheetViewModel_Factory create(Provider<NativeAuthFlowCoordinator> provider, Provider<NavigationManager> provider2, Provider<NoticeSheetContentRepository> provider3, Provider<HandleClickableUrl> provider4) {
        return new C0950NoticeSheetViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static NoticeSheetViewModel newInstance(NoticeSheetState noticeSheetState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, NavigationManager navigationManager, NoticeSheetContentRepository noticeSheetContentRepository, HandleClickableUrl handleClickableUrl) {
        return new NoticeSheetViewModel(noticeSheetState, nativeAuthFlowCoordinator, navigationManager, noticeSheetContentRepository, handleClickableUrl);
    }
}
