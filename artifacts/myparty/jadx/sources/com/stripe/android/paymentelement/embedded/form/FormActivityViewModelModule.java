package com.stripe.android.paymentelement.embedded.form;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.verticalmode.DefaultVerticalModeFormInteractor;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FormActivityViewModelComponent.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule;", "", "bindsCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "defaultCardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/DefaultCardAccountRangeRepositoryFactory;", "bindsUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "impl", "Lcom/stripe/android/core/utils/RealUserFacingLogger;", "bindsFormActivityStateHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityStateHelper;", "helper", "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityStateHelper;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(subcomponents = {FormActivitySubcomponent.class})
/* loaded from: classes5.dex */
public interface FormActivityViewModelModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    CardAccountRangeRepository.Factory bindsCardAccountRangeRepositoryFactory(DefaultCardAccountRangeRepositoryFactory defaultCardAccountRangeRepositoryFactory);

    @Binds
    FormActivityStateHelper bindsFormActivityStateHelper(DefaultFormActivityStateHelper helper);

    @Binds
    UserFacingLogger bindsUserFacingLogger(RealUserFacingLogger impl);

    /* compiled from: FormActivityViewModelComponent.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0016\u001a\u00020\rH\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0007¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivityViewModelModule$Companion;", "", "<init>", "()V", "providesContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "providesLinkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "provideViewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "provideFormInteractor", "Lcom/stripe/android/paymentsheet/verticalmode/DefaultVerticalModeFormInteractor;", "interactorFactory", "Lcom/stripe/android/paymentelement/embedded/form/EmbeddedFormInteractorFactory;", "provideConfirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "confirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "coroutineScope", "provideOnClickOverrideDelegate", "Lcom/stripe/android/paymentelement/embedded/form/OnClickOverrideDelegate;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        public final Context providesContext(Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            return application;
        }

        @Provides
        @Singleton
        public final LinkAccountHolder providesLinkAccountHolder(SavedStateHandle savedStateHandle) {
            Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
            return new LinkAccountHolder(savedStateHandle);
        }

        @Provides
        @Singleton
        @ViewModelScope
        public final CoroutineScope provideViewModelScope() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }

        @Provides
        @Singleton
        public final DefaultVerticalModeFormInteractor provideFormInteractor(EmbeddedFormInteractorFactory interactorFactory) {
            Intrinsics.checkNotNullParameter(interactorFactory, "interactorFactory");
            return interactorFactory.create();
        }

        @Provides
        @Singleton
        public final ConfirmationHandler provideConfirmationHandler(ConfirmationHandler.Factory confirmationHandlerFactory, @ViewModelScope CoroutineScope coroutineScope) {
            Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            return confirmationHandlerFactory.create(coroutineScope);
        }

        @Provides
        @Singleton
        public final OnClickOverrideDelegate provideOnClickOverrideDelegate() {
            return new OnClickDelegateOverrideImpl();
        }
    }
}
