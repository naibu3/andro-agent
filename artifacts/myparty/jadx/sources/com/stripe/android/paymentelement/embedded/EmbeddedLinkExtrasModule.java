package com.stripe.android.paymentelement.embedded;

import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.RealLinkConfigurationCoordinator;
import com.stripe.android.link.gate.DefaultLinkGate;
import com.stripe.android.link.gate.LinkGate;
import com.stripe.android.link.injection.LinkAnalyticsComponent;
import com.stripe.android.link.injection.LinkCommonModule;
import com.stripe.android.link.injection.LinkComponent;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: EmbeddedLinkExtrasModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedLinkExtrasModule;", "", "bindLinkGateFactory", "Lcom/stripe/android/link/gate/LinkGate$Factory;", "linkGateFactory", "Lcom/stripe/android/link/gate/DefaultLinkGate$Factory;", "bindsLinkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "impl", "Lcom/stripe/android/link/RealLinkConfigurationCoordinator;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {LinkCommonModule.class}, subcomponents = {LinkAnalyticsComponent.class, LinkComponent.class})
/* loaded from: classes5.dex */
public interface EmbeddedLinkExtrasModule {
    @Binds
    LinkGate.Factory bindLinkGateFactory(DefaultLinkGate.Factory linkGateFactory);

    @Binds
    LinkConfigurationCoordinator bindsLinkConfigurationCoordinator(RealLinkConfigurationCoordinator impl);
}
