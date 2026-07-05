package com.stripe.android.link.injection;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkExpressMode;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.DefaultConfirmationHandler;
import com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.Module;
import dagger.Provides;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkViewModelModule.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\u0007¨\u0006 "}, d2 = {"Lcom/stripe/android/link/injection/LinkViewModelModule;", "", "<init>", "()V", "provideLinkActivityViewModel", "Lcom/stripe/android/link/LinkActivityViewModel;", "component", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "defaultConfirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/DefaultConfirmationHandler$Factory;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "linkConfirmationHandlerFactory", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "autocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;", "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class LinkViewModelModule {
    public static final int $stable = 0;
    public static final LinkViewModelModule INSTANCE = new LinkViewModelModule();

    private LinkViewModelModule() {
    }

    @NativeLinkScope
    @Provides
    public final LinkActivityViewModel provideLinkActivityViewModel(NativeLinkComponent component, DefaultConfirmationHandler.Factory defaultConfirmationHandlerFactory, LinkAccountManager linkAccountManager, LinkAccountHolder linkAccountHolder, EventReporter eventReporter, LinkConfiguration linkConfiguration, LinkAttestationCheck linkAttestationCheck, LinkConfirmationHandler.Factory linkConfirmationHandlerFactory, NavigationManager navigationManager, SavedStateHandle savedStateHandle, LinkLaunchMode linkLaunchMode, DefaultAutocompleteLauncher autocompleteLauncher, @Named(NativeLinkDIConstsKt.LINK_EXPRESS_MODE) LinkExpressMode linkExpressMode) {
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(defaultConfirmationHandlerFactory, "defaultConfirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(linkAttestationCheck, "linkAttestationCheck");
        Intrinsics.checkNotNullParameter(linkConfirmationHandlerFactory, "linkConfirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(autocompleteLauncher, "autocompleteLauncher");
        Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
        return new LinkActivityViewModel(component, defaultConfirmationHandlerFactory, linkConfirmationHandlerFactory, linkAccountManager, linkAccountHolder, eventReporter, linkConfiguration, linkAttestationCheck, savedStateHandle, linkExpressMode, navigationManager, linkLaunchMode, autocompleteLauncher);
    }
}
