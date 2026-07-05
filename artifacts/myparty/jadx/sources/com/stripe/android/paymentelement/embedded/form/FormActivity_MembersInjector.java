package com.stripe.android.paymentelement.embedded.form;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import dagger.MembersInjector;
import dagger.internal.Provider;
import dagger.internal.Providers;

/* loaded from: classes5.dex */
public final class FormActivity_MembersInjector implements MembersInjector<FormActivity> {
    private final Provider<FormActivityConfirmationHelper> confirmationHelperProvider;
    private final Provider<EventReporter> eventReporterProvider;
    private final Provider<FormActivityStateHelper> formActivityStateHelperProvider;
    private final Provider<DefaultVerticalModeFormInteractor> formInteractorProvider;

    public FormActivity_MembersInjector(Provider<DefaultVerticalModeFormInteractor> provider, Provider<EventReporter> provider2, Provider<FormActivityStateHelper> provider3, Provider<FormActivityConfirmationHelper> provider4) {
        this.formInteractorProvider = provider;
        this.eventReporterProvider = provider2;
        this.formActivityStateHelperProvider = provider3;
        this.confirmationHelperProvider = provider4;
    }

    public static MembersInjector<FormActivity> create(Provider<DefaultVerticalModeFormInteractor> provider, Provider<EventReporter> provider2, Provider<FormActivityStateHelper> provider3, Provider<FormActivityConfirmationHelper> provider4) {
        return new FormActivity_MembersInjector(provider, provider2, provider3, provider4);
    }

    public static MembersInjector<FormActivity> create(javax.inject.Provider<DefaultVerticalModeFormInteractor> provider, javax.inject.Provider<EventReporter> provider2, javax.inject.Provider<FormActivityStateHelper> provider3, javax.inject.Provider<FormActivityConfirmationHelper> provider4) {
        return new FormActivity_MembersInjector(Providers.asDaggerProvider(provider), Providers.asDaggerProvider(provider2), Providers.asDaggerProvider(provider3), Providers.asDaggerProvider(provider4));
    }

    @Override // dagger.MembersInjector
    public void injectMembers(FormActivity formActivity) {
        injectFormInteractor(formActivity, this.formInteractorProvider.get());
        injectEventReporter(formActivity, this.eventReporterProvider.get());
        injectFormActivityStateHelper(formActivity, this.formActivityStateHelperProvider.get());
        injectConfirmationHelper(formActivity, this.confirmationHelperProvider.get());
    }

    public static void injectFormInteractor(FormActivity formActivity, DefaultVerticalModeFormInteractor defaultVerticalModeFormInteractor) {
        formActivity.formInteractor = defaultVerticalModeFormInteractor;
    }

    public static void injectEventReporter(FormActivity formActivity, EventReporter eventReporter) {
        formActivity.eventReporter = eventReporter;
    }

    public static void injectFormActivityStateHelper(FormActivity formActivity, FormActivityStateHelper formActivityStateHelper) {
        formActivity.formActivityStateHelper = formActivityStateHelper;
    }

    public static void injectConfirmationHelper(FormActivity formActivity, FormActivityConfirmationHelper formActivityConfirmationHelper) {
        formActivity.confirmationHelper = formActivityConfirmationHelper;
    }
}
