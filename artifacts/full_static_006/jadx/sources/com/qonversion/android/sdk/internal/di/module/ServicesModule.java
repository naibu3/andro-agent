package com.qonversion.android.sdk.internal.di.module;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.internal.di.scope.ApplicationScope;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import com.qonversion.android.sdk.internal.storage.SharedPreferencesCache;
import com.qonversion.android.sdk.internal.storage.TokenStorage;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServicesModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/internal/di/module/ServicesModule;", "", "()V", "provideUserInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "cacheStorage", "Lcom/qonversion/android/sdk/internal/storage/SharedPreferencesCache;", "tokenStorage", "Lcom/qonversion/android/sdk/internal/storage/TokenStorage;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Module
/* loaded from: classes2.dex */
public final class ServicesModule {
    @Provides
    @ApplicationScope
    public final QUserInfoService provideUserInfoService(SharedPreferencesCache cacheStorage, TokenStorage tokenStorage) {
        Intrinsics.checkNotNullParameter(cacheStorage, "cacheStorage");
        Intrinsics.checkNotNullParameter(tokenStorage, "tokenStorage");
        return new QUserInfoService(cacheStorage, tokenStorage);
    }
}
