package com.stripe.android.paymentelement.embedded.manage;

import com.stripe.android.core.injection.ViewModelScope;
import com.stripe.android.core.utils.RealUserFacingLogger;
import com.stripe.android.core.utils.UserFacingLogger;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.SavedPaymentMethodMutator;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.utils.StateFlowsKt;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ManageComponent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u0000 \r2\u00020\u0001:\u0001\rJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageModule;", "", "bindsEmbeddedManageScreenInteractorFactory", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedManageScreenInteractorFactory;", "factory", "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedManageScreenInteractorFactory;", "bindsEmbeddedUpdateScreenInteractorFactory", "Lcom/stripe/android/paymentelement/embedded/manage/EmbeddedUpdateScreenInteractorFactory;", "Lcom/stripe/android/paymentelement/embedded/manage/DefaultEmbeddedUpdateScreenInteractorFactory;", "bindsUserFacingLogger", "Lcom/stripe/android/core/utils/UserFacingLogger;", "impl", "Lcom/stripe/android/core/utils/RealUserFacingLogger;", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface ManageModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Binds
    EmbeddedManageScreenInteractorFactory bindsEmbeddedManageScreenInteractorFactory(DefaultEmbeddedManageScreenInteractorFactory factory);

    @Binds
    EmbeddedUpdateScreenInteractorFactory bindsEmbeddedUpdateScreenInteractorFactory(DefaultEmbeddedUpdateScreenInteractorFactory factory);

    @Binds
    UserFacingLogger bindsUserFacingLogger(RealUserFacingLogger impl);

    /* compiled from: ManageComponent.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0014\u001a\u00020\tH\u0007¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/manage/ManageModule$Companion;", "", "<init>", "()V", "provideManageNavigator", "Lcom/stripe/android/paymentelement/embedded/manage/ManageNavigator;", "initialManageScreenFactory", "Lcom/stripe/android/paymentelement/embedded/manage/InitialManageScreenFactory;", "viewModelScope", "Lkotlinx/coroutines/CoroutineScope;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "provideSavedPaymentMethodMutator", "Lcom/stripe/android/paymentsheet/SavedPaymentMethodMutator;", "factory", "Lcom/stripe/android/paymentelement/embedded/manage/ManageSavedPaymentMethodMutatorFactory;", "providePaymentMethodMetadata", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "paymentMethodMetadata", "provideViewModelScope", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final ManageNavigator provideManageNavigator(InitialManageScreenFactory initialManageScreenFactory, @ViewModelScope CoroutineScope viewModelScope, EventReporter eventReporter) {
            Intrinsics.checkNotNullParameter(initialManageScreenFactory, "initialManageScreenFactory");
            Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
            Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
            return new ManageNavigator(viewModelScope, initialManageScreenFactory.createInitialScreen(), eventReporter);
        }

        @Provides
        @Singleton
        public final SavedPaymentMethodMutator provideSavedPaymentMethodMutator(ManageSavedPaymentMethodMutatorFactory factory) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            return factory.createSavedPaymentMethodMutator();
        }

        @Provides
        public final StateFlow<PaymentMethodMetadata> providePaymentMethodMetadata(PaymentMethodMetadata paymentMethodMetadata) {
            Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
            return StateFlowsKt.stateFlowOf(paymentMethodMetadata);
        }

        @Provides
        @Singleton
        @ViewModelScope
        public final CoroutineScope provideViewModelScope() {
            return CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        }
    }
}
