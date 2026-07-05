package com.stripe.android.financialconnections.features.notice;

import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;

/* loaded from: classes5.dex */
public final class NoticeSheetViewModel_Factory_Impl implements NoticeSheetViewModel.Factory {
    private final C0950NoticeSheetViewModel_Factory delegateFactory;

    NoticeSheetViewModel_Factory_Impl(C0950NoticeSheetViewModel_Factory c0950NoticeSheetViewModel_Factory) {
        this.delegateFactory = c0950NoticeSheetViewModel_Factory;
    }

    @Override // com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel.Factory
    public NoticeSheetViewModel create(NoticeSheetState noticeSheetState) {
        return this.delegateFactory.get(noticeSheetState);
    }

    public static Provider<NoticeSheetViewModel.Factory> create(C0950NoticeSheetViewModel_Factory c0950NoticeSheetViewModel_Factory) {
        return InstanceFactory.create(new NoticeSheetViewModel_Factory_Impl(c0950NoticeSheetViewModel_Factory));
    }

    public static dagger.internal.Provider<NoticeSheetViewModel.Factory> createFactoryProvider(C0950NoticeSheetViewModel_Factory c0950NoticeSheetViewModel_Factory) {
        return InstanceFactory.create(new NoticeSheetViewModel_Factory_Impl(c0950NoticeSheetViewModel_Factory));
    }
}
