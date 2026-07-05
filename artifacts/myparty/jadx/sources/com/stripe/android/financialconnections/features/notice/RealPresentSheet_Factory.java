package com.stripe.android.financialconnections.features.notice;

import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class RealPresentSheet_Factory implements Factory<RealPresentSheet> {
    private final Provider<AccountUpdateRequiredContentRepository> accountUpdateRequiredContentRepositoryProvider;
    private final Provider<NavigationManager> navigationManagerProvider;
    private final Provider<NoticeSheetContentRepository> noticeSheetContentRepositoryProvider;

    public RealPresentSheet_Factory(Provider<NavigationManager> provider, Provider<NoticeSheetContentRepository> provider2, Provider<AccountUpdateRequiredContentRepository> provider3) {
        this.navigationManagerProvider = provider;
        this.noticeSheetContentRepositoryProvider = provider2;
        this.accountUpdateRequiredContentRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public RealPresentSheet get() {
        return newInstance(this.navigationManagerProvider.get(), this.noticeSheetContentRepositoryProvider.get(), this.accountUpdateRequiredContentRepositoryProvider.get());
    }

    public static RealPresentSheet_Factory create(javax.inject.Provider<NavigationManager> provider, javax.inject.Provider<NoticeSheetContentRepository> provider2, javax.inject.Provider<AccountUpdateRequiredContentRepository> provider3) {
        return new RealPresentSheet_Factory(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3));
    }

    public static RealPresentSheet_Factory create(Provider<NavigationManager> provider, Provider<NoticeSheetContentRepository> provider2, Provider<AccountUpdateRequiredContentRepository> provider3) {
        return new RealPresentSheet_Factory(provider, provider2, provider3);
    }

    public static RealPresentSheet newInstance(NavigationManager navigationManager, NoticeSheetContentRepository noticeSheetContentRepository, AccountUpdateRequiredContentRepository accountUpdateRequiredContentRepository) {
        return new RealPresentSheet(navigationManager, noticeSheetContentRepository, accountUpdateRequiredContentRepository);
    }
}
