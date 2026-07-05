package com.stripe.android.core.injection;

import androidx.core.os.LocaleListCompat;
import com.stripe.android.core.Logger;
import dagger.Module;
import dagger.Provides;
import java.util.Locale;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CoreCommonModule.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/core/injection/CoreCommonModule;", "", "<init>", "()V", "provideLogger", "Lcom/stripe/android/core/Logger;", NamedConstantsKt.ENABLE_LOGGING, "", "provideLocale", "Ljava/util/Locale;", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class CoreCommonModule {
    @Provides
    @Singleton
    public final Logger provideLogger(@Named(NamedConstantsKt.ENABLE_LOGGING) boolean enableLogging) {
        return Logger.INSTANCE.getInstance(enableLogging);
    }

    @Provides
    @Singleton
    public final Locale provideLocale() {
        LocaleListCompat adjustedDefault = LocaleListCompat.getAdjustedDefault();
        if (adjustedDefault.isEmpty()) {
            adjustedDefault = null;
        }
        if (adjustedDefault != null) {
            return adjustedDefault.get(0);
        }
        return null;
    }
}
