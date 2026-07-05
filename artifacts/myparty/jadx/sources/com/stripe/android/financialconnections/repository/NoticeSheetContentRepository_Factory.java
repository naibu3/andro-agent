package com.stripe.android.financialconnections.repository;

import androidx.lifecycle.SavedStateHandle;
import dagger.internal.Factory;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class NoticeSheetContentRepository_Factory implements Factory<NoticeSheetContentRepository> {
    private final Provider<SavedStateHandle> savedStateHandleProvider;

    public NoticeSheetContentRepository_Factory(Provider<SavedStateHandle> provider) {
        this.savedStateHandleProvider = provider;
    }

    @Override // javax.inject.Provider
    public NoticeSheetContentRepository get() {
        return newInstance(this.savedStateHandleProvider.get());
    }

    public static NoticeSheetContentRepository_Factory create(javax.inject.Provider<SavedStateHandle> provider) {
        return new NoticeSheetContentRepository_Factory(Providers.asDaggerProvider(provider));
    }

    public static NoticeSheetContentRepository_Factory create(Provider<SavedStateHandle> provider) {
        return new NoticeSheetContentRepository_Factory(provider);
    }

    public static NoticeSheetContentRepository newInstance(SavedStateHandle savedStateHandle) {
        return new NoticeSheetContentRepository(savedStateHandle);
    }
}
