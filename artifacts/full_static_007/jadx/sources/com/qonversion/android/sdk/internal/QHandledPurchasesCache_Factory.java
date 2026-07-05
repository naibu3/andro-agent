package com.qonversion.android.sdk.internal;

import dagger.internal.Factory;

/* loaded from: classes2.dex */
public final class QHandledPurchasesCache_Factory implements Factory<QHandledPurchasesCache> {
    private static final QHandledPurchasesCache_Factory INSTANCE = new QHandledPurchasesCache_Factory();

    @Override // javax.inject.Provider
    public QHandledPurchasesCache get() {
        return new QHandledPurchasesCache();
    }

    public static QHandledPurchasesCache_Factory create() {
        return INSTANCE;
    }

    public static QHandledPurchasesCache newInstance() {
        return new QHandledPurchasesCache();
    }
}
