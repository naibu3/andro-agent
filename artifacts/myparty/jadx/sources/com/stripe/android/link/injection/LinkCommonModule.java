package com.stripe.android.link.injection;

import com.stripe.android.Stripe;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.Logger;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.core.networking.DefaultStripeNetworkClient;
import com.stripe.android.link.analytics.DefaultLinkEventsReporter;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.repositories.LinkApiRepository;
import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.repository.ConsumersApiServiceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkCommonModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/link/injection/LinkCommonModule;", "", "bindLinkRepository", "Lcom/stripe/android/link/repositories/LinkRepository;", "linkApiRepository", "Lcom/stripe/android/link/repositories/LinkApiRepository;", "bindLinkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/DefaultLinkEventsReporter;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface LinkCommonModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Singleton
    @Binds
    LinkEventsReporter bindLinkEventsReporter(DefaultLinkEventsReporter linkEventsReporter);

    @Singleton
    @Binds
    LinkRepository bindLinkRepository(LinkApiRepository linkApiRepository);

    /* compiled from: LinkCommonModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/injection/LinkCommonModule$Companion;", "", "<init>", "()V", "provideConsumersApiService", "Lcom/stripe/android/repository/ConsumersApiService;", "logger", "Lcom/stripe/android/core/Logger;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final ConsumersApiService provideConsumersApiService(Logger logger, @IOContext CoroutineContext workContext) {
            Intrinsics.checkNotNullParameter(logger, "logger");
            Intrinsics.checkNotNullParameter(workContext, "workContext");
            AppInfo appInfo = Stripe.INSTANCE.getAppInfo();
            return new ConsumersApiServiceImpl(new DefaultStripeNetworkClient(workContext, null, null, 0, logger, 14, null), Stripe.API_VERSION, "AndroidBindings/21.22.2", appInfo);
        }
    }
}
