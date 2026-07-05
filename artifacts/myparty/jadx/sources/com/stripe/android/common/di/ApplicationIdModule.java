package com.stripe.android.common.di;

import android.app.Application;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApplicationIdModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/common/di/ApplicationIdModule;", "", "<init>", "()V", "provideApplicationId", "", "application", "Landroid/app/Application;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class ApplicationIdModule {
    public static final int $stable = 0;
    public static final ApplicationIdModule INSTANCE = new ApplicationIdModule();

    private ApplicationIdModule() {
    }

    @Provides
    @Named("application_id")
    public final String provideApplicationId(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }
}
