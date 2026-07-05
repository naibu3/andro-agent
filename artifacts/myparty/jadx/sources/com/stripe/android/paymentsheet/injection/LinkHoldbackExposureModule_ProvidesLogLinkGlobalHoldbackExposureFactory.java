package com.stripe.android.paymentsheet.injection;

import com.stripe.android.common.analytics.experiment.DefaultLogLinkHoldbackExperiment;
import com.stripe.android.common.analytics.experiment.LogLinkHoldbackExperiment;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes6.dex */
public final class LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory implements Factory<LogLinkHoldbackExperiment> {
    private final Provider<DefaultLogLinkHoldbackExperiment> defaultProvider;
    private final LinkHoldbackExposureModule module;

    public LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory(LinkHoldbackExposureModule linkHoldbackExposureModule, Provider<DefaultLogLinkHoldbackExperiment> provider) {
        this.module = linkHoldbackExposureModule;
        this.defaultProvider = provider;
    }

    @Override // javax.inject.Provider
    public LogLinkHoldbackExperiment get() {
        return providesLogLinkGlobalHoldbackExposure(this.module, this.defaultProvider.get());
    }

    public static LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory create(LinkHoldbackExposureModule linkHoldbackExposureModule, javax.inject.Provider<DefaultLogLinkHoldbackExperiment> provider) {
        return new LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory(linkHoldbackExposureModule, Providers.asDaggerProvider(provider));
    }

    public static LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory create(LinkHoldbackExposureModule linkHoldbackExposureModule, Provider<DefaultLogLinkHoldbackExperiment> provider) {
        return new LinkHoldbackExposureModule_ProvidesLogLinkGlobalHoldbackExposureFactory(linkHoldbackExposureModule, provider);
    }

    public static LogLinkHoldbackExperiment providesLogLinkGlobalHoldbackExposure(LinkHoldbackExposureModule linkHoldbackExposureModule, DefaultLogLinkHoldbackExperiment defaultLogLinkHoldbackExperiment) {
        return (LogLinkHoldbackExperiment) Preconditions.checkNotNullFromProvides(linkHoldbackExposureModule.providesLogLinkGlobalHoldbackExposure(defaultLogLinkHoldbackExperiment));
    }
}
