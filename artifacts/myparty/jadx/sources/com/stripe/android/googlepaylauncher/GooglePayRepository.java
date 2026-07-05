package com.stripe.android.googlepaylauncher;

import com.stripe.android.googlepaylauncher.DefaultGooglePayAvailabilityClient;
import com.stripe.android.googlepaylauncher.GooglePayAvailabilityClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GooglePayRepository.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0002\u0005\u0006J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "", "isReady", "Lkotlinx/coroutines/flow/Flow;", "", "Disabled", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface GooglePayRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Flow<Boolean> isReady();

    /* compiled from: GooglePayRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Disabled;", "Lcom/stripe/android/googlepaylauncher/GooglePayRepository;", "<init>", "()V", "isReady", "Lkotlinx/coroutines/flow/Flow;", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Disabled implements GooglePayRepository {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
        }

        @Override // com.stripe.android.googlepaylauncher.GooglePayRepository
        public Flow<Boolean> isReady() {
            return FlowKt.flowOf(false);
        }
    }

    /* compiled from: GooglePayRepository.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;", "", "<init>", "()V", "defaultFactory", "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;", "googlePayAvailabilityClientFactory", "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "getGooglePayAvailabilityClientFactory", "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;", "setGooglePayAvailabilityClientFactory", "(Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;)V", "resetFactory", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final DefaultGooglePayAvailabilityClient.Factory defaultFactory;
        private static volatile GooglePayAvailabilityClient.Factory googlePayAvailabilityClientFactory;

        private Companion() {
        }

        static {
            DefaultGooglePayAvailabilityClient.Factory factory = new DefaultGooglePayAvailabilityClient.Factory();
            defaultFactory = factory;
            googlePayAvailabilityClientFactory = factory;
        }

        public final GooglePayAvailabilityClient.Factory getGooglePayAvailabilityClientFactory() {
            return googlePayAvailabilityClientFactory;
        }

        public final void setGooglePayAvailabilityClientFactory(GooglePayAvailabilityClient.Factory factory) {
            Intrinsics.checkNotNullParameter(factory, "<set-?>");
            googlePayAvailabilityClientFactory = factory;
        }

        public final void resetFactory() {
            googlePayAvailabilityClientFactory = defaultFactory;
        }
    }
}
