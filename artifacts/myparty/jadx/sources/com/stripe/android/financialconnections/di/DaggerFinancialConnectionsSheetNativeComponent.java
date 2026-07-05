package com.stripe.android.financialconnections.di;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.Logger;
import com.stripe.android.core.frauddetection.FraudDetectionDataRepository;
import com.stripe.android.core.networking.AnalyticsRequestV2Executor;
import com.stripe.android.core.networking.AnalyticsRequestV2Storage;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestV2Executor_Factory;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage;
import com.stripe.android.core.networking.RealAnalyticsRequestV2Storage_Factory;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.core.utils.IsWorkManagerAvailable;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsResponseEventEmitter_Factory;
import com.stripe.android.financialconnections.browser.BrowserManager;
import com.stripe.android.financialconnections.browser.BrowserManager_Factory;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.AcceptConsent;
import com.stripe.android.financialconnections.domain.AcceptConsent_Factory;
import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession;
import com.stripe.android.financialconnections.domain.CancelAuthorizationSession_Factory;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession;
import com.stripe.android.financialconnections.domain.CompleteAuthorizationSession_Factory;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession;
import com.stripe.android.financialconnections.domain.CompleteFinancialConnectionsSession_Factory;
import com.stripe.android.financialconnections.domain.ConfirmVerification;
import com.stripe.android.financialconnections.domain.ConfirmVerification_Factory;
import com.stripe.android.financialconnections.domain.CreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.DisableNetworking;
import com.stripe.android.financialconnections.domain.DisableNetworking_Factory;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions;
import com.stripe.android.financialconnections.domain.FeaturedInstitutions_Factory;
import com.stripe.android.financialconnections.domain.FetchNetworkedAccounts;
import com.stripe.android.financialconnections.domain.FetchNetworkedAccounts_Factory;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession;
import com.stripe.android.financialconnections.domain.FetchPaginatedAccountsForSession_Factory;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetCachedAccounts_Factory;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.GetOrFetchSync_Factory;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.IsLinkWithStripe;
import com.stripe.android.financialconnections.domain.IsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts;
import com.stripe.android.financialconnections.domain.LinkMoreAccounts_Factory;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.LookupAccount_Factory;
import com.stripe.android.financialconnections.domain.MarkLinkStepUpVerified;
import com.stripe.android.financialconnections.domain.MarkLinkStepUpVerified_Factory;
import com.stripe.android.financialconnections.domain.MarkLinkVerified;
import com.stripe.android.financialconnections.domain.MarkLinkVerified_Factory;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator_Factory;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount;
import com.stripe.android.financialconnections.domain.PollAttachPaymentAccount_Factory;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionAccounts_Factory;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults;
import com.stripe.android.financialconnections.domain.PollAuthorizationSessionOAuthResults_Factory;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent;
import com.stripe.android.financialconnections.domain.PostAuthSessionEvent_Factory;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession;
import com.stripe.android.financialconnections.domain.PostAuthorizationSession_Factory;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.RealAttachConsumerToLinkAccountSession_Factory;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult;
import com.stripe.android.financialconnections.domain.RealCreateInstantDebitsResult_Factory;
import com.stripe.android.financialconnections.domain.RealHandleError;
import com.stripe.android.financialconnections.domain.RealHandleError_Factory;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe;
import com.stripe.android.financialconnections.domain.RealIsLinkWithStripe_Factory;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession;
import com.stripe.android.financialconnections.domain.RealIsNetworkingRelinkSession_Factory;
import com.stripe.android.financialconnections.domain.RepairAuthorizationSession;
import com.stripe.android.financialconnections.domain.RepairAuthorizationSession_Factory;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken_Factory;
import com.stripe.android.financialconnections.domain.RetrieveAuthorizationSession;
import com.stripe.android.financialconnections.domain.RetrieveAuthorizationSession_Factory;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.domain.SaveAccountToLink_Factory;
import com.stripe.android.financialconnections.domain.SearchInstitutions;
import com.stripe.android.financialconnections.domain.SearchInstitutions_Factory;
import com.stripe.android.financialconnections.domain.SelectAccounts;
import com.stripe.android.financialconnections.domain.SelectAccounts_Factory;
import com.stripe.android.financialconnections.domain.SelectInstitution;
import com.stripe.android.financialconnections.domain.SelectInstitution_Factory;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts;
import com.stripe.android.financialconnections.domain.SelectNetworkedAccounts_Factory;
import com.stripe.android.financialconnections.domain.StartVerification;
import com.stripe.android.financialconnections.domain.StartVerification_Factory;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts;
import com.stripe.android.financialconnections.domain.UpdateCachedAccounts_Factory;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest;
import com.stripe.android.financialconnections.domain.UpdateLocalManifest_Factory;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.accountpicker.C0870AccountPickerViewModel_Factory;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.accountupdate.C0872AccountUpdateRequiredViewModel_Factory;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.attachpayment.C0874AttachPaymentViewModel_Factory;
import com.stripe.android.financialconnections.features.consent.C0890ConsentViewModel_Factory;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.error.C0893ErrorViewModel_Factory;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.exit.C0896ExitViewModel_Factory;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.institutionpicker.C0903InstitutionPickerViewModel_Factory;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.linkaccountpicker.C0912LinkAccountPickerViewModel_Factory;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.linkstepupverification.C0917LinkStepUpVerificationViewModel_Factory;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.manualentry.C0922ManualEntryViewModel_Factory;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.manualentrysuccess.C0924ManualEntrySuccessViewModel_Factory;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.C0929NetworkingLinkLoginWarmupViewModel_Factory;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinksignup.C0942NetworkingLinkSignupViewModel_Factory;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits_Factory;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking;
import com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking_Factory;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkinglinkverification.C0945NetworkingLinkVerificationViewModel_Factory;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.C0948NetworkingSaveToLinkVerificationViewModel_Factory;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.notice.C0950NoticeSheetViewModel_Factory;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet;
import com.stripe.android.financialconnections.features.notice.RealPresentSheet_Factory;
import com.stripe.android.financialconnections.features.partnerauth.C0964PartnerAuthViewModel_Factory;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.reset.C0966ResetViewModel_Factory;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.reset.ResetViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.streamlinedconsent.C0969IDConsentContentViewModel_Factory;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel_Factory_Impl;
import com.stripe.android.financialconnections.features.success.C0973SuccessViewModel_Factory;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.features.success.SuccessViewModel_Factory_Impl;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor;
import com.stripe.android.financialconnections.network.FinancialConnectionsRequestExecutor_Factory;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel_Factory;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository;
import com.stripe.android.financialconnections.repository.AccountUpdateRequiredContentRepository_Factory;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository;
import com.stripe.android.financialconnections.repository.AttachedPaymentAccountRepository_Factory;
import com.stripe.android.financialconnections.repository.ConsumerSessionProvider;
import com.stripe.android.financialconnections.repository.ConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository;
import com.stripe.android.financialconnections.repository.CoreAuthorizationPendingNetworkingRepairRepository_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsAccountsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsErrorRepository_Factory;
import com.stripe.android.financialconnections.repository.FinancialConnectionsInstitutionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsManifestRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepository;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl;
import com.stripe.android.financialconnections.repository.FinancialConnectionsRepositoryImpl_Factory;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository;
import com.stripe.android.financialconnections.repository.NoticeSheetContentRepository_Factory;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository;
import com.stripe.android.financialconnections.repository.RealConsumerSessionRepository_Factory;
import com.stripe.android.financialconnections.repository.SuccessContentRepository;
import com.stripe.android.financialconnections.repository.SuccessContentRepository_Factory;
import com.stripe.android.financialconnections.repository.api.FinancialConnectionsConsumersApiService;
import com.stripe.android.financialconnections.repository.api.ProvideApiRequestOptions;
import com.stripe.android.financialconnections.repository.api.RealProvideApiRequestOptions;
import com.stripe.android.financialconnections.repository.api.RealProvideApiRequestOptions_Factory;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity_MembersInjector;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.ui.HandleClickableUrl_Factory;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.financialconnections.utils.UriUtils_Factory;
import com.stripe.android.repository.ConsumersApiService;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.NavigationManagerImpl_Factory;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;
import kotlinx.serialization.json.Json;

/* loaded from: classes5.dex */
public final class DaggerFinancialConnectionsSheetNativeComponent {
    private DaggerFinancialConnectionsSheetNativeComponent() {
    }

    public static FinancialConnectionsSheetNativeComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements FinancialConnectionsSheetNativeComponent.Builder {
        private Application application;
        private FinancialConnectionsSheetConfiguration configuration;
        private FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent;
        private FinancialConnectionsSheetNativeState initialState;
        private SynchronizeSessionResponse initialSyncResponse;
        private SavedStateHandle savedStateHandle;

        private Builder() {
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder initialSyncResponse(SynchronizeSessionResponse synchronizeSessionResponse) {
            this.initialSyncResponse = synchronizeSessionResponse;
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder savedStateHandle(SavedStateHandle savedStateHandle) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder application(Application application) {
            this.application = (Application) Preconditions.checkNotNull(application);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder initialState(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState) {
            this.initialState = (FinancialConnectionsSheetNativeState) Preconditions.checkNotNull(financialConnectionsSheetNativeState);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder configuration(FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.configuration = (FinancialConnectionsSheetConfiguration) Preconditions.checkNotNull(financialConnectionsSheetConfiguration);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public Builder sharedComponent(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent) {
            this.financialConnectionsSingletonSharedComponent = (FinancialConnectionsSingletonSharedComponent) Preconditions.checkNotNull(financialConnectionsSingletonSharedComponent);
            return this;
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent.Builder
        public FinancialConnectionsSheetNativeComponent build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            Preconditions.checkBuilderRequirement(this.application, Application.class);
            Preconditions.checkBuilderRequirement(this.initialState, FinancialConnectionsSheetNativeState.class);
            Preconditions.checkBuilderRequirement(this.configuration, FinancialConnectionsSheetConfiguration.class);
            Preconditions.checkBuilderRequirement(this.financialConnectionsSingletonSharedComponent, FinancialConnectionsSingletonSharedComponent.class);
            return new FinancialConnectionsSheetNativeComponentImpl(this.financialConnectionsSingletonSharedComponent, this.initialSyncResponse, this.savedStateHandle, this.application, this.initialState, this.configuration);
        }
    }

    private static final class FinancialConnectionsSheetNativeComponentImpl implements FinancialConnectionsSheetNativeComponent {
        private Provider<AcceptConsent> acceptConsentProvider;
        private C0870AccountPickerViewModel_Factory accountPickerViewModelProvider;
        private Provider<AccountUpdateRequiredContentRepository> accountUpdateRequiredContentRepositoryProvider;
        private C0872AccountUpdateRequiredViewModel_Factory accountUpdateRequiredViewModelProvider;
        private final Application application;
        private Provider<Application> applicationProvider;
        private C0874AttachPaymentViewModel_Factory attachPaymentViewModelProvider;
        private Provider<AttachedPaymentAccountRepository> attachedPaymentAccountRepositoryProvider;
        private Provider<AnalyticsRequestV2Executor> bindsAnalyticsRequestV2ExecutorProvider;
        private Provider<AnalyticsRequestV2Storage> bindsAnalyticsRequestV2StorageProvider;
        private Provider<ConsumerSessionProvider> bindsConsumerSessionProvider;
        private Provider<ConsumerSessionRepository> bindsConsumerSessionRepositoryProvider;
        private Provider<NavigationManager> bindsNavigationManagerProvider;
        private Provider<ProvideApiRequestOptions> bindsProvideApiRequestOptionsProvider;
        private Provider<BrowserManager> browserManagerProvider;
        private Provider<CancelAuthorizationSession> cancelAuthorizationSessionProvider;
        private Provider<CompleteAuthorizationSession> completeAuthorizationSessionProvider;
        private Provider<CompleteFinancialConnectionsSession> completeFinancialConnectionsSessionProvider;
        private Provider<FinancialConnectionsSheetConfiguration> configurationProvider;
        private Provider<ConfirmVerification> confirmVerificationProvider;
        private C0890ConsentViewModel_Factory consentViewModelProvider;
        private Provider<CoreAuthorizationPendingNetworkingRepairRepository> coreAuthorizationPendingNetworkingRepairRepositoryProvider;
        private Provider<DefaultAnalyticsRequestV2Executor> defaultAnalyticsRequestV2ExecutorProvider;
        private Provider<DisableNetworking> disableNetworkingProvider;
        private C0893ErrorViewModel_Factory errorViewModelProvider;
        private C0896ExitViewModel_Factory exitViewModelProvider;
        private Provider<ConsentViewModel.Factory> factoryProvider;
        private Provider<ResetViewModel.Factory> factoryProvider10;
        private Provider<ErrorViewModel.Factory> factoryProvider11;
        private Provider<ExitViewModel.Factory> factoryProvider12;
        private Provider<NoticeSheetViewModel.Factory> factoryProvider13;
        private Provider<NetworkingLinkSignupViewModel.Factory> factoryProvider14;
        private Provider<NetworkingLinkLoginWarmupViewModel.Factory> factoryProvider15;
        private Provider<NetworkingLinkVerificationViewModel.Factory> factoryProvider16;
        private Provider<NetworkingSaveToLinkVerificationViewModel.Factory> factoryProvider17;
        private Provider<LinkAccountPickerViewModel.Factory> factoryProvider18;
        private Provider<LinkStepUpVerificationViewModel.Factory> factoryProvider19;
        private Provider<IDConsentContentViewModel.Factory> factoryProvider2;
        private Provider<AccountUpdateRequiredViewModel.Factory> factoryProvider20;
        private Provider<InstitutionPickerViewModel.Factory> factoryProvider3;
        private Provider<AccountPickerViewModel.Factory> factoryProvider4;
        private Provider<ManualEntryViewModel.Factory> factoryProvider5;
        private Provider<ManualEntrySuccessViewModel.Factory> factoryProvider6;
        private Provider<PartnerAuthViewModel.Factory> factoryProvider7;
        private Provider<SuccessViewModel.Factory> factoryProvider8;
        private Provider<AttachPaymentViewModel.Factory> factoryProvider9;
        private Provider<FeaturedInstitutions> featuredInstitutionsProvider;
        private Provider<FetchNetworkedAccounts> fetchNetworkedAccountsProvider;
        private Provider<FetchPaginatedAccountsForSession> fetchPaginatedAccountsForSessionProvider;
        private Provider<FinancialConnectionsErrorRepository> financialConnectionsErrorRepositoryProvider;
        private Provider<FinancialConnectionsRepositoryImpl> financialConnectionsRepositoryImplProvider;
        private Provider<FinancialConnectionsRequestExecutor> financialConnectionsRequestExecutorProvider;
        private Provider<FinancialConnectionsResponseEventEmitter> financialConnectionsResponseEventEmitterProvider;
        private final FinancialConnectionsSheetNativeComponentImpl financialConnectionsSheetNativeComponentImpl;
        private Provider<FinancialConnectionsSheetNativeComponent> financialConnectionsSheetNativeComponentProvider;
        private Provider<FinancialConnectionsSheetNativeViewModel> financialConnectionsSheetNativeViewModelProvider;
        private Provider<GetCachedAccounts> getCachedAccountsProvider;
        private Provider<GetOrFetchSync> getOrFetchSyncProvider;
        private Provider<HandleClickableUrl> handleClickableUrlProvider;
        private C0969IDConsentContentViewModel_Factory iDConsentContentViewModelProvider;
        private Provider<FinancialConnectionsSheetNativeState> initialStateProvider;
        private Provider<SynchronizeSessionResponse> initialSyncResponseProvider;
        private C0903InstitutionPickerViewModel_Factory institutionPickerViewModelProvider;
        private Provider<IntegrityRequestManager> integrityRequestManagerProvider;
        private C0912LinkAccountPickerViewModel_Factory linkAccountPickerViewModelProvider;
        private Provider<LinkMoreAccounts> linkMoreAccountsProvider;
        private Provider<LinkSignupHandlerForInstantDebits> linkSignupHandlerForInstantDebitsProvider;
        private Provider<LinkSignupHandlerForNetworking> linkSignupHandlerForNetworkingProvider;
        private C0917LinkStepUpVerificationViewModel_Factory linkStepUpVerificationViewModelProvider;
        private Provider<LookupAccount> lookupAccountProvider;
        private C0924ManualEntrySuccessViewModel_Factory manualEntrySuccessViewModelProvider;
        private C0922ManualEntryViewModel_Factory manualEntryViewModelProvider;
        private Provider<MarkLinkStepUpVerified> markLinkStepUpVerifiedProvider;
        private Provider<MarkLinkVerified> markLinkVerifiedProvider;
        private Provider<NativeAuthFlowCoordinator> nativeAuthFlowCoordinatorProvider;
        private C0929NetworkingLinkLoginWarmupViewModel_Factory networkingLinkLoginWarmupViewModelProvider;
        private C0942NetworkingLinkSignupViewModel_Factory networkingLinkSignupViewModelProvider;
        private C0945NetworkingLinkVerificationViewModel_Factory networkingLinkVerificationViewModelProvider;
        private C0948NetworkingSaveToLinkVerificationViewModel_Factory networkingSaveToLinkVerificationViewModelProvider;
        private Provider<NoticeSheetContentRepository> noticeSheetContentRepositoryProvider;
        private C0950NoticeSheetViewModel_Factory noticeSheetViewModelProvider;
        private C0964PartnerAuthViewModel_Factory partnerAuthViewModelProvider;
        private Provider<PollAttachPaymentAccount> pollAttachPaymentAccountProvider;
        private Provider<PollAuthorizationSessionAccounts> pollAuthorizationSessionAccountsProvider;
        private Provider<PollAuthorizationSessionOAuthResults> pollAuthorizationSessionOAuthResultsProvider;
        private Provider<PostAuthSessionEvent> postAuthSessionEventProvider;
        private Provider<PostAuthorizationSession> postAuthorizationSessionProvider;
        private Provider<FinancialConnectionsRepository> provideConnectionsRepositoryProvider;
        private Provider<ConsumersApiService> provideConsumersApiServiceProvider;
        private Provider<ElementsSessionContext> provideElementsSessionContext$financial_connections_releaseProvider;
        private Provider<FinancialConnectionsConsumersApiService> provideFinancialConnectionsConsumersApiService$financial_connections_releaseProvider;
        private Provider<FraudDetectionDataRepository> provideFraudDetectionDataRepository$financial_connections_releaseProvider;
        private Provider<LinkSignupHandler> provideLinkSignupHandler$financial_connections_releaseProvider;
        private Provider<Locale> provideLocale$financial_connections_releaseProvider;
        private Provider<Logger> provideLogger$financial_connections_releaseProvider;
        private Provider<ElementsSessionContext.PrefillDetails> providePrefillDetails$financial_connections_releaseProvider;
        private Provider<StripeNetworkClient> provideStripeNetworkClientProvider;
        private Provider<CoroutineContext> provideWorkContextProvider;
        private Provider<FinancialConnectionsAnalyticsTracker> providesAnalyticsTrackerProvider;
        private Provider<ApiRequest.Options> providesApiOptions$financial_connections_releaseProvider;
        private Provider<ApiRequest.Factory> providesApiRequestFactoryProvider;
        private Provider<ApiVersion> providesApiVersionProvider;
        private Provider<String> providesApplicationIdProvider;
        private Provider<Boolean> providesEnableLoggingProvider;
        private Provider<FinancialConnectionsAccountsRepository> providesFinancialConnectionsAccountsRepositoryProvider;
        private Provider<FinancialConnectionsConsumerSessionRepository> providesFinancialConnectionsConsumerSessionRepositoryProvider;
        private Provider<FinancialConnectionsInstitutionsRepository> providesFinancialConnectionsInstitutionsRepositoryProvider;
        private Provider<FinancialConnectionsManifestRepository> providesFinancialConnectionsManifestRepositoryProvider;
        private Provider<StripeImageLoader> providesImageLoaderProvider;
        private Provider<IsWorkManagerAvailable> providesIsWorkManagerAvailable$financial_connections_releaseProvider;
        private Provider<Json> providesJson$financial_connections_releaseProvider;
        private Provider<String> providesPublishableKeyProvider;
        private Provider<String> providesStripeAccountIdProvider;
        private Provider<RealAnalyticsRequestV2Storage> realAnalyticsRequestV2StorageProvider;
        private Provider<RealAttachConsumerToLinkAccountSession> realAttachConsumerToLinkAccountSessionProvider;
        private Provider<RealConsumerSessionRepository> realConsumerSessionRepositoryProvider;
        private Provider<RealCreateInstantDebitsResult> realCreateInstantDebitsResultProvider;
        private Provider<RealHandleError> realHandleErrorProvider;
        private Provider<RealIsLinkWithStripe> realIsLinkWithStripeProvider;
        private Provider<RealIsNetworkingRelinkSession> realIsNetworkingRelinkSessionProvider;
        private Provider<RealPresentSheet> realPresentSheetProvider;
        private Provider<RealProvideApiRequestOptions> realProvideApiRequestOptionsProvider;
        private Provider<RepairAuthorizationSession> repairAuthorizationSessionProvider;
        private Provider<RequestIntegrityToken> requestIntegrityTokenProvider;
        private C0966ResetViewModel_Factory resetViewModelProvider;
        private Provider<RetrieveAuthorizationSession> retrieveAuthorizationSessionProvider;
        private Provider<SaveAccountToLink> saveAccountToLinkProvider;
        private Provider<SavedStateHandle> savedStateHandleProvider;
        private Provider<SearchInstitutions> searchInstitutionsProvider;
        private Provider<SelectAccounts> selectAccountsProvider;
        private Provider<SelectInstitution> selectInstitutionProvider;
        private Provider<SelectNetworkedAccounts> selectNetworkedAccountsProvider;
        private Provider<StartVerification> startVerificationProvider;
        private Provider<SuccessContentRepository> successContentRepositoryProvider;
        private C0973SuccessViewModel_Factory successViewModelProvider;
        private Provider<UpdateCachedAccounts> updateCachedAccountsProvider;
        private Provider<UpdateLocalManifest> updateLocalManifestProvider;
        private Provider<UriUtils> uriUtilsProvider;

        private FinancialConnectionsSheetNativeComponentImpl(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.financialConnectionsSheetNativeComponentImpl = this;
            this.application = application;
            initialize(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
            initialize2(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
            initialize3(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
            initialize4(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
            initialize5(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
            initialize6(financialConnectionsSingletonSharedComponent, synchronizeSessionResponse, savedStateHandle, application, financialConnectionsSheetNativeState, financialConnectionsSheetConfiguration);
        }

        private BrowserManager browserManager() {
            return new BrowserManager(this.application);
        }

        private void initialize(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            Provider<Boolean> provider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesEnableLoggingFactory.create());
            this.providesEnableLoggingProvider = provider;
            this.provideLogger$financial_connections_releaseProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideLogger$financial_connections_releaseFactory.create(provider));
            Factory factoryCreate = InstanceFactory.create(application);
            this.applicationProvider = factoryCreate;
            this.providesImageLoaderProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvidesImageLoaderFactory.create((Provider<Application>) factoryCreate));
            this.financialConnectionsSheetNativeComponentProvider = InstanceFactory.create(this.financialConnectionsSheetNativeComponentImpl);
            this.savedStateHandleProvider = InstanceFactory.create(savedStateHandle);
            this.nativeAuthFlowCoordinatorProvider = DoubleCheck.provider((Provider) NativeAuthFlowCoordinator_Factory.create());
            Provider<CoroutineContext> provider2 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideWorkContextFactory.create());
            this.provideWorkContextProvider = provider2;
            this.provideStripeNetworkClientProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideStripeNetworkClientFactory.create(provider2, this.provideLogger$financial_connections_releaseProvider));
            Provider<Json> provider3 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesJson$financial_connections_releaseFactory.create());
            this.providesJson$financial_connections_releaseProvider = provider3;
            FinancialConnectionsResponseEventEmitter_Factory financialConnectionsResponseEventEmitter_FactoryCreate = FinancialConnectionsResponseEventEmitter_Factory.create(provider3, this.provideLogger$financial_connections_releaseProvider);
            this.financialConnectionsResponseEventEmitterProvider = financialConnectionsResponseEventEmitter_FactoryCreate;
            this.financialConnectionsRequestExecutorProvider = FinancialConnectionsRequestExecutor_Factory.create(this.provideStripeNetworkClientProvider, (Provider<FinancialConnectionsResponseEventEmitter>) financialConnectionsResponseEventEmitter_FactoryCreate, this.providesJson$financial_connections_releaseProvider, this.provideLogger$financial_connections_releaseProvider);
            Provider<ApiVersion> provider4 = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesApiVersionFactory.create());
            this.providesApiVersionProvider = provider4;
            this.providesApiRequestFactoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesApiRequestFactoryFactory.create(provider4));
            RealConsumerSessionRepository_Factory realConsumerSessionRepository_FactoryCreate = RealConsumerSessionRepository_Factory.create(this.savedStateHandleProvider);
            this.realConsumerSessionRepositoryProvider = realConsumerSessionRepository_FactoryCreate;
            this.bindsConsumerSessionProvider = DoubleCheck.provider((Provider) realConsumerSessionRepository_FactoryCreate);
            Factory factoryCreate2 = InstanceFactory.create(financialConnectionsSheetNativeState);
            this.initialStateProvider = factoryCreate2;
            this.realIsLinkWithStripeProvider = RealIsLinkWithStripe_Factory.create((Provider<FinancialConnectionsSheetNativeState>) factoryCreate2);
            Factory factoryCreate3 = InstanceFactory.create(financialConnectionsSheetConfiguration);
            this.configurationProvider = factoryCreate3;
            this.providesPublishableKeyProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesPublishableKeyFactory.create((Provider<FinancialConnectionsSheetConfiguration>) factoryCreate3));
            Provider<String> provider5 = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesStripeAccountIdFactory.create(this.configurationProvider));
            this.providesStripeAccountIdProvider = provider5;
            Provider<ApiRequest.Options> provider6 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesApiOptions$financial_connections_releaseFactory.create(this.providesPublishableKeyProvider, provider5));
            this.providesApiOptions$financial_connections_releaseProvider = provider6;
            RealProvideApiRequestOptions_Factory realProvideApiRequestOptions_FactoryCreate = RealProvideApiRequestOptions_Factory.create(this.bindsConsumerSessionProvider, (Provider<IsLinkWithStripe>) this.realIsLinkWithStripeProvider, provider6);
            this.realProvideApiRequestOptionsProvider = realProvideApiRequestOptions_FactoryCreate;
            this.bindsProvideApiRequestOptionsProvider = DoubleCheck.provider((Provider) realProvideApiRequestOptions_FactoryCreate);
            this.provideLocale$financial_connections_releaseProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideLocale$financial_connections_releaseFactory.create());
        }

        private void initialize2(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            Factory factoryCreateNullable = InstanceFactory.createNullable(synchronizeSessionResponse);
            this.initialSyncResponseProvider = factoryCreateNullable;
            this.providesFinancialConnectionsManifestRepositoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsManifestRepositoryFactory.create(this.financialConnectionsRequestExecutorProvider, this.providesApiRequestFactoryProvider, this.bindsProvideApiRequestOptionsProvider, this.provideLocale$financial_connections_releaseProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<SynchronizeSessionResponse>) factoryCreateNullable));
            Provider<String> provider = DoubleCheck.provider((Provider) FinancialConnectionsSheetConfigurationModule_ProvidesApplicationIdFactory.create(this.applicationProvider));
            this.providesApplicationIdProvider = provider;
            this.getOrFetchSyncProvider = GetOrFetchSync_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, provider);
            RealAnalyticsRequestV2Storage_Factory realAnalyticsRequestV2Storage_FactoryCreate = RealAnalyticsRequestV2Storage_Factory.create((Provider<Context>) this.applicationProvider);
            this.realAnalyticsRequestV2StorageProvider = realAnalyticsRequestV2Storage_FactoryCreate;
            this.bindsAnalyticsRequestV2StorageProvider = DoubleCheck.provider((Provider) realAnalyticsRequestV2Storage_FactoryCreate);
            Provider<IsWorkManagerAvailable> provider2 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesIsWorkManagerAvailable$financial_connections_releaseFactory.create(this.getOrFetchSyncProvider));
            this.providesIsWorkManagerAvailable$financial_connections_releaseProvider = provider2;
            DefaultAnalyticsRequestV2Executor_Factory defaultAnalyticsRequestV2Executor_FactoryCreate = DefaultAnalyticsRequestV2Executor_Factory.create((Provider<Context>) this.applicationProvider, this.provideStripeNetworkClientProvider, this.provideLogger$financial_connections_releaseProvider, this.bindsAnalyticsRequestV2StorageProvider, provider2);
            this.defaultAnalyticsRequestV2ExecutorProvider = defaultAnalyticsRequestV2Executor_FactoryCreate;
            Provider<AnalyticsRequestV2Executor> provider3 = DoubleCheck.provider((Provider) defaultAnalyticsRequestV2Executor_FactoryCreate);
            this.bindsAnalyticsRequestV2ExecutorProvider = provider3;
            Provider<FinancialConnectionsAnalyticsTracker> provider4 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvidesAnalyticsTrackerFactory.create(this.applicationProvider, this.getOrFetchSyncProvider, this.provideLocale$financial_connections_releaseProvider, this.configurationProvider, provider3));
            this.providesAnalyticsTrackerProvider = provider4;
            this.uriUtilsProvider = UriUtils_Factory.create(this.provideLogger$financial_connections_releaseProvider, provider4);
            FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate = FinancialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactory.create(this.applicationProvider);
            this.provideFraudDetectionDataRepository$financial_connections_releaseProvider = financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate;
            FinancialConnectionsRepositoryImpl_Factory financialConnectionsRepositoryImpl_FactoryCreate = FinancialConnectionsRepositoryImpl_Factory.create(this.financialConnectionsRequestExecutorProvider, this.bindsProvideApiRequestOptionsProvider, (Provider<FraudDetectionDataRepository>) financialConnectionsSheetSharedModule_Companion_ProvideFraudDetectionDataRepository$financial_connections_releaseFactoryCreate, this.providesApiRequestFactoryProvider);
            this.financialConnectionsRepositoryImplProvider = financialConnectionsRepositoryImpl_FactoryCreate;
            Provider<FinancialConnectionsRepository> provider5 = DoubleCheck.provider((Provider) FinancialConnectionsSheetSharedModule_Companion_ProvideConnectionsRepositoryFactory.create((Provider<FinancialConnectionsRepositoryImpl>) financialConnectionsRepositoryImpl_FactoryCreate));
            this.provideConnectionsRepositoryProvider = provider5;
            FetchPaginatedAccountsForSession_Factory fetchPaginatedAccountsForSession_FactoryCreate = FetchPaginatedAccountsForSession_Factory.create(provider5);
            this.fetchPaginatedAccountsForSessionProvider = fetchPaginatedAccountsForSession_FactoryCreate;
            this.completeFinancialConnectionsSessionProvider = CompleteFinancialConnectionsSession_Factory.create(this.provideConnectionsRepositoryProvider, (Provider<FetchPaginatedAccountsForSession>) fetchPaginatedAccountsForSession_FactoryCreate, this.configurationProvider);
            this.provideConsumersApiServiceProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvideConsumersApiServiceFactory.create(this.providesApiVersionProvider, this.provideStripeNetworkClientProvider));
            this.provideFinancialConnectionsConsumersApiService$financial_connections_releaseProvider = FinancialConnectionsSheetNativeModule_Companion_ProvideFinancialConnectionsConsumersApiService$financial_connections_releaseFactory.create(this.financialConnectionsRequestExecutorProvider, this.providesApiOptions$financial_connections_releaseProvider, this.providesApiRequestFactoryProvider);
            this.bindsConsumerSessionRepositoryProvider = DoubleCheck.provider((Provider) this.realConsumerSessionRepositoryProvider);
            FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory financialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactoryCreate = FinancialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactory.create(this.initialStateProvider);
            this.provideElementsSessionContext$financial_connections_releaseProvider = financialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactoryCreate;
            Provider<FinancialConnectionsConsumerSessionRepository> provider6 = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsConsumerSessionRepositoryFactory.create(this.provideConsumersApiServiceProvider, this.bindsProvideApiRequestOptionsProvider, this.provideFinancialConnectionsConsumersApiService$financial_connections_releaseProvider, this.bindsConsumerSessionRepositoryProvider, this.provideLocale$financial_connections_releaseProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<IsLinkWithStripe>) this.realIsLinkWithStripeProvider, this.provideFraudDetectionDataRepository$financial_connections_releaseProvider, (Provider<ElementsSessionContext>) financialConnectionsSheetNativeModule_Companion_ProvideElementsSessionContext$financial_connections_releaseFactoryCreate));
            this.providesFinancialConnectionsConsumerSessionRepositoryProvider = provider6;
            this.realCreateInstantDebitsResultProvider = RealCreateInstantDebitsResult_Factory.create(provider6, this.provideConnectionsRepositoryProvider, this.bindsConsumerSessionProvider, this.provideElementsSessionContext$financial_connections_releaseProvider);
            Provider<NavigationManager> provider7 = DoubleCheck.provider((Provider) NavigationManagerImpl_Factory.create());
            this.bindsNavigationManagerProvider = provider7;
            this.financialConnectionsSheetNativeViewModelProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeViewModel_Factory.create(this.financialConnectionsSheetNativeComponentProvider, this.savedStateHandleProvider, this.nativeAuthFlowCoordinatorProvider, this.uriUtilsProvider, this.completeFinancialConnectionsSessionProvider, (Provider<CreateInstantDebitsResult>) this.realCreateInstantDebitsResultProvider, this.providesAnalyticsTrackerProvider, this.provideLogger$financial_connections_releaseProvider, provider7, this.providesApplicationIdProvider, this.initialStateProvider));
            this.acceptConsentProvider = AcceptConsent_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
        }

        private void initialize3(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            this.handleClickableUrlProvider = HandleClickableUrl_Factory.create(this.uriUtilsProvider, this.providesAnalyticsTrackerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.noticeSheetContentRepositoryProvider = DoubleCheck.provider((Provider) NoticeSheetContentRepository_Factory.create(this.savedStateHandleProvider));
            Provider<AccountUpdateRequiredContentRepository> provider = DoubleCheck.provider((Provider) AccountUpdateRequiredContentRepository_Factory.create(this.savedStateHandleProvider));
            this.accountUpdateRequiredContentRepositoryProvider = provider;
            this.realPresentSheetProvider = RealPresentSheet_Factory.create(this.bindsNavigationManagerProvider, this.noticeSheetContentRepositoryProvider, provider);
            IntegrityRequestManagerProvider integrityRequestManagerProvider = new IntegrityRequestManagerProvider(financialConnectionsSingletonSharedComponent);
            this.integrityRequestManagerProvider = integrityRequestManagerProvider;
            RequestIntegrityToken_Factory requestIntegrityToken_FactoryCreate = RequestIntegrityToken_Factory.create((Provider<IntegrityRequestManager>) integrityRequestManagerProvider, this.providesAnalyticsTrackerProvider);
            this.requestIntegrityTokenProvider = requestIntegrityToken_FactoryCreate;
            this.lookupAccountProvider = LookupAccount_Factory.create(this.applicationProvider, (Provider<RequestIntegrityToken>) requestIntegrityToken_FactoryCreate, this.providesFinancialConnectionsConsumerSessionRepositoryProvider, this.configurationProvider);
            FinancialConnectionsSheetNativeModule_Companion_ProvidePrefillDetails$financial_connections_releaseFactory financialConnectionsSheetNativeModule_Companion_ProvidePrefillDetails$financial_connections_releaseFactoryCreate = FinancialConnectionsSheetNativeModule_Companion_ProvidePrefillDetails$financial_connections_releaseFactory.create(this.initialStateProvider);
            this.providePrefillDetails$financial_connections_releaseProvider = financialConnectionsSheetNativeModule_Companion_ProvidePrefillDetails$financial_connections_releaseFactoryCreate;
            C0890ConsentViewModel_Factory c0890ConsentViewModel_FactoryCreate = C0890ConsentViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.acceptConsentProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.providesAnalyticsTrackerProvider, this.handleClickableUrlProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<PresentSheet>) this.realPresentSheetProvider, this.lookupAccountProvider, (Provider<IsLinkWithStripe>) this.realIsLinkWithStripeProvider, (Provider<ElementsSessionContext.PrefillDetails>) financialConnectionsSheetNativeModule_Companion_ProvidePrefillDetails$financial_connections_releaseFactoryCreate);
            this.consentViewModelProvider = c0890ConsentViewModel_FactoryCreate;
            this.factoryProvider = ConsentViewModel_Factory_Impl.createFactoryProvider(c0890ConsentViewModel_FactoryCreate);
            C0969IDConsentContentViewModel_Factory c0969IDConsentContentViewModel_FactoryCreate = C0969IDConsentContentViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.acceptConsentProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.providesAnalyticsTrackerProvider, this.handleClickableUrlProvider, (Provider<PresentSheet>) this.realPresentSheetProvider);
            this.iDConsentContentViewModelProvider = c0969IDConsentContentViewModel_FactoryCreate;
            this.factoryProvider2 = IDConsentContentViewModel_Factory_Impl.createFactoryProvider(c0969IDConsentContentViewModel_FactoryCreate);
            this.postAuthorizationSessionProvider = PostAuthorizationSession_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, this.providesApplicationIdProvider);
            this.selectInstitutionProvider = SelectInstitution_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
            Provider<FinancialConnectionsInstitutionsRepository> provider2 = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsInstitutionsRepositoryFactory.create(this.financialConnectionsRequestExecutorProvider, this.bindsProvideApiRequestOptionsProvider, this.providesApiRequestFactoryProvider));
            this.providesFinancialConnectionsInstitutionsRepositoryProvider = provider2;
            this.searchInstitutionsProvider = SearchInstitutions_Factory.create(provider2);
            this.featuredInstitutionsProvider = FeaturedInstitutions_Factory.create(this.providesFinancialConnectionsInstitutionsRepositoryProvider);
            Provider<FinancialConnectionsErrorRepository> provider3 = DoubleCheck.provider((Provider) FinancialConnectionsErrorRepository_Factory.create(this.savedStateHandleProvider));
            this.financialConnectionsErrorRepositoryProvider = provider3;
            this.realHandleErrorProvider = RealHandleError_Factory.create(provider3, this.providesAnalyticsTrackerProvider, this.nativeAuthFlowCoordinatorProvider, this.provideLogger$financial_connections_releaseProvider, this.bindsNavigationManagerProvider);
            UpdateLocalManifest_Factory updateLocalManifest_FactoryCreate = UpdateLocalManifest_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider);
            this.updateLocalManifestProvider = updateLocalManifest_FactoryCreate;
            C0903InstitutionPickerViewModel_Factory c0903InstitutionPickerViewModel_FactoryCreate = C0903InstitutionPickerViewModel_Factory.create(this.configurationProvider, this.postAuthorizationSessionProvider, this.selectInstitutionProvider, this.getOrFetchSyncProvider, this.searchInstitutionsProvider, this.featuredInstitutionsProvider, this.providesAnalyticsTrackerProvider, (Provider<HandleError>) this.realHandleErrorProvider, this.bindsNavigationManagerProvider, (Provider<UpdateLocalManifest>) updateLocalManifest_FactoryCreate, this.provideLogger$financial_connections_releaseProvider, this.nativeAuthFlowCoordinatorProvider);
            this.institutionPickerViewModelProvider = c0903InstitutionPickerViewModel_FactoryCreate;
            this.factoryProvider3 = InstitutionPickerViewModel_Factory_Impl.createFactoryProvider(c0903InstitutionPickerViewModel_FactoryCreate);
            this.attachedPaymentAccountRepositoryProvider = DoubleCheck.provider((Provider) AttachedPaymentAccountRepository_Factory.create(this.savedStateHandleProvider, this.provideLogger$financial_connections_releaseProvider));
            this.successContentRepositoryProvider = DoubleCheck.provider((Provider) SuccessContentRepository_Factory.create(this.savedStateHandleProvider));
            this.providesFinancialConnectionsAccountsRepositoryProvider = DoubleCheck.provider((Provider) FinancialConnectionsSheetNativeModule_Companion_ProvidesFinancialConnectionsAccountsRepositoryFactory.create(this.financialConnectionsRequestExecutorProvider, this.bindsProvideApiRequestOptionsProvider, this.providesApiRequestFactoryProvider, this.provideLogger$financial_connections_releaseProvider, this.savedStateHandleProvider));
        }

        private void initialize4(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            Provider<CoreAuthorizationPendingNetworkingRepairRepository> provider = DoubleCheck.provider((Provider) CoreAuthorizationPendingNetworkingRepairRepository_Factory.create(this.savedStateHandleProvider, this.provideLogger$financial_connections_releaseProvider));
            this.coreAuthorizationPendingNetworkingRepairRepositoryProvider = provider;
            RealIsNetworkingRelinkSession_Factory realIsNetworkingRelinkSession_FactoryCreate = RealIsNetworkingRelinkSession_Factory.create(provider);
            this.realIsNetworkingRelinkSessionProvider = realIsNetworkingRelinkSession_FactoryCreate;
            this.saveAccountToLinkProvider = SaveAccountToLink_Factory.create(this.provideLocale$financial_connections_releaseProvider, this.configurationProvider, this.attachedPaymentAccountRepositoryProvider, this.successContentRepositoryProvider, this.providesFinancialConnectionsManifestRepositoryProvider, this.providesFinancialConnectionsAccountsRepositoryProvider, (Provider<IsNetworkingRelinkSession>) realIsNetworkingRelinkSession_FactoryCreate);
            this.selectAccountsProvider = SelectAccounts_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider, this.configurationProvider);
            PollAuthorizationSessionAccounts_Factory pollAuthorizationSessionAccounts_FactoryCreate = PollAuthorizationSessionAccounts_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider, this.configurationProvider);
            this.pollAuthorizationSessionAccountsProvider = pollAuthorizationSessionAccounts_FactoryCreate;
            C0870AccountPickerViewModel_Factory c0870AccountPickerViewModel_FactoryCreate = C0870AccountPickerViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, this.bindsConsumerSessionProvider, this.saveAccountToLinkProvider, this.selectAccountsProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.handleClickableUrlProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<PollAuthorizationSessionAccounts>) pollAuthorizationSessionAccounts_FactoryCreate, (Provider<PresentSheet>) this.realPresentSheetProvider);
            this.accountPickerViewModelProvider = c0870AccountPickerViewModel_FactoryCreate;
            this.factoryProvider4 = AccountPickerViewModel_Factory_Impl.createFactoryProvider(c0870AccountPickerViewModel_FactoryCreate);
            this.pollAttachPaymentAccountProvider = PollAttachPaymentAccount_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider, this.bindsConsumerSessionProvider, this.attachedPaymentAccountRepositoryProvider, this.configurationProvider);
            UpdateCachedAccounts_Factory updateCachedAccounts_FactoryCreate = UpdateCachedAccounts_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider);
            this.updateCachedAccountsProvider = updateCachedAccounts_FactoryCreate;
            C0922ManualEntryViewModel_Factory c0922ManualEntryViewModel_FactoryCreate = C0922ManualEntryViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.pollAttachPaymentAccountProvider, this.successContentRepositoryProvider, (Provider<UpdateCachedAccounts>) updateCachedAccounts_FactoryCreate, this.providesAnalyticsTrackerProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.manualEntryViewModelProvider = c0922ManualEntryViewModel_FactoryCreate;
            this.factoryProvider5 = ManualEntryViewModel_Factory_Impl.createFactoryProvider(c0922ManualEntryViewModel_FactoryCreate);
            C0924ManualEntrySuccessViewModel_Factory c0924ManualEntrySuccessViewModel_FactoryCreate = C0924ManualEntrySuccessViewModel_Factory.create(this.getOrFetchSyncProvider, this.successContentRepositoryProvider, this.providesAnalyticsTrackerProvider, this.nativeAuthFlowCoordinatorProvider);
            this.manualEntrySuccessViewModelProvider = c0924ManualEntrySuccessViewModel_FactoryCreate;
            this.factoryProvider6 = ManualEntrySuccessViewModel_Factory_Impl.createFactoryProvider(c0924ManualEntrySuccessViewModel_FactoryCreate);
            this.completeAuthorizationSessionProvider = CompleteAuthorizationSession_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
            this.cancelAuthorizationSessionProvider = CancelAuthorizationSession_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
            this.retrieveAuthorizationSessionProvider = RetrieveAuthorizationSession_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
            this.postAuthSessionEventProvider = PostAuthSessionEvent_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.provideLogger$financial_connections_releaseProvider, this.configurationProvider);
            this.browserManagerProvider = BrowserManager_Factory.create(this.applicationProvider);
            this.pollAuthorizationSessionOAuthResultsProvider = PollAuthorizationSessionOAuthResults_Factory.create(this.provideConnectionsRepositoryProvider, this.configurationProvider);
            RepairAuthorizationSession_Factory repairAuthorizationSession_FactoryCreate = RepairAuthorizationSession_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider, this.providesApplicationIdProvider);
            this.repairAuthorizationSessionProvider = repairAuthorizationSession_FactoryCreate;
            C0964PartnerAuthViewModel_Factory c0964PartnerAuthViewModel_FactoryCreate = C0964PartnerAuthViewModel_Factory.create(this.completeAuthorizationSessionProvider, this.postAuthorizationSessionProvider, this.cancelAuthorizationSessionProvider, this.retrieveAuthorizationSessionProvider, this.providesAnalyticsTrackerProvider, this.providesApplicationIdProvider, this.uriUtilsProvider, this.postAuthSessionEventProvider, this.getOrFetchSyncProvider, this.browserManagerProvider, (Provider<HandleError>) this.realHandleErrorProvider, this.bindsNavigationManagerProvider, this.pollAuthorizationSessionOAuthResultsProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<PresentSheet>) this.realPresentSheetProvider, this.coreAuthorizationPendingNetworkingRepairRepositoryProvider, (Provider<RepairAuthorizationSession>) repairAuthorizationSession_FactoryCreate, this.nativeAuthFlowCoordinatorProvider);
            this.partnerAuthViewModelProvider = c0964PartnerAuthViewModel_FactoryCreate;
            this.factoryProvider7 = PartnerAuthViewModel_Factory_Impl.createFactoryProvider(c0964PartnerAuthViewModel_FactoryCreate);
            GetCachedAccounts_Factory getCachedAccounts_FactoryCreate = GetCachedAccounts_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider, this.configurationProvider);
            this.getCachedAccountsProvider = getCachedAccounts_FactoryCreate;
            C0973SuccessViewModel_Factory c0973SuccessViewModel_FactoryCreate = C0973SuccessViewModel_Factory.create((Provider<GetCachedAccounts>) getCachedAccounts_FactoryCreate, this.getOrFetchSyncProvider, this.successContentRepositoryProvider, this.providesAnalyticsTrackerProvider, this.provideLogger$financial_connections_releaseProvider, this.nativeAuthFlowCoordinatorProvider);
            this.successViewModelProvider = c0973SuccessViewModel_FactoryCreate;
            this.factoryProvider8 = SuccessViewModel_Factory_Impl.createFactoryProvider(c0973SuccessViewModel_FactoryCreate);
        }

        private void initialize5(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            C0874AttachPaymentViewModel_Factory c0874AttachPaymentViewModel_FactoryCreate = C0874AttachPaymentViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.successContentRepositoryProvider, this.pollAttachPaymentAccountProvider, this.providesAnalyticsTrackerProvider, this.getCachedAccountsProvider, this.bindsNavigationManagerProvider, this.getOrFetchSyncProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<IsNetworkingRelinkSession>) this.realIsNetworkingRelinkSessionProvider);
            this.attachPaymentViewModelProvider = c0874AttachPaymentViewModel_FactoryCreate;
            this.factoryProvider9 = AttachPaymentViewModel_Factory_Impl.createFactoryProvider(c0874AttachPaymentViewModel_FactoryCreate);
            LinkMoreAccounts_Factory linkMoreAccounts_FactoryCreate = LinkMoreAccounts_Factory.create(this.providesFinancialConnectionsManifestRepositoryProvider, this.configurationProvider);
            this.linkMoreAccountsProvider = linkMoreAccounts_FactoryCreate;
            C0966ResetViewModel_Factory c0966ResetViewModel_FactoryCreate = C0966ResetViewModel_Factory.create((Provider<LinkMoreAccounts>) linkMoreAccounts_FactoryCreate, this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.resetViewModelProvider = c0966ResetViewModel_FactoryCreate;
            this.factoryProvider10 = ResetViewModel_Factory_Impl.createFactoryProvider(c0966ResetViewModel_FactoryCreate);
            C0893ErrorViewModel_Factory c0893ErrorViewModel_FactoryCreate = C0893ErrorViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.getOrFetchSyncProvider, this.financialConnectionsErrorRepositoryProvider, this.providesAnalyticsTrackerProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.errorViewModelProvider = c0893ErrorViewModel_FactoryCreate;
            this.factoryProvider11 = ErrorViewModel_Factory_Impl.createFactoryProvider(c0893ErrorViewModel_FactoryCreate);
            Provider<NativeAuthFlowCoordinator> provider = this.nativeAuthFlowCoordinatorProvider;
            C0896ExitViewModel_Factory c0896ExitViewModel_FactoryCreate = C0896ExitViewModel_Factory.create(provider, this.getOrFetchSyncProvider, provider, this.providesAnalyticsTrackerProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.exitViewModelProvider = c0896ExitViewModel_FactoryCreate;
            this.factoryProvider12 = ExitViewModel_Factory_Impl.createFactoryProvider(c0896ExitViewModel_FactoryCreate);
            C0950NoticeSheetViewModel_Factory c0950NoticeSheetViewModel_FactoryCreate = C0950NoticeSheetViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.bindsNavigationManagerProvider, this.noticeSheetContentRepositoryProvider, this.handleClickableUrlProvider);
            this.noticeSheetViewModelProvider = c0950NoticeSheetViewModel_FactoryCreate;
            this.factoryProvider13 = NoticeSheetViewModel_Factory_Impl.createFactoryProvider(c0950NoticeSheetViewModel_FactoryCreate);
            RealAttachConsumerToLinkAccountSession_Factory realAttachConsumerToLinkAccountSession_FactoryCreate = RealAttachConsumerToLinkAccountSession_Factory.create(this.configurationProvider, this.providesFinancialConnectionsConsumerSessionRepositoryProvider);
            this.realAttachConsumerToLinkAccountSessionProvider = realAttachConsumerToLinkAccountSession_FactoryCreate;
            this.linkSignupHandlerForInstantDebitsProvider = LinkSignupHandlerForInstantDebits_Factory.create(this.providesFinancialConnectionsConsumerSessionRepositoryProvider, (Provider<AttachConsumerToLinkAccountSession>) realAttachConsumerToLinkAccountSession_FactoryCreate, this.requestIntegrityTokenProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.providesApplicationIdProvider, (Provider<HandleError>) this.realHandleErrorProvider);
            LinkSignupHandlerForNetworking_Factory linkSignupHandlerForNetworking_FactoryCreate = LinkSignupHandlerForNetworking_Factory.create(this.providesFinancialConnectionsConsumerSessionRepositoryProvider, this.getOrFetchSyncProvider, this.getCachedAccountsProvider, this.requestIntegrityTokenProvider, this.saveAccountToLinkProvider, this.providesAnalyticsTrackerProvider, this.bindsNavigationManagerProvider, this.providesApplicationIdProvider, this.provideLogger$financial_connections_releaseProvider);
            this.linkSignupHandlerForNetworkingProvider = linkSignupHandlerForNetworking_FactoryCreate;
            FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory financialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactoryCreate = FinancialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactory.create((Provider<IsLinkWithStripe>) this.realIsLinkWithStripeProvider, this.linkSignupHandlerForInstantDebitsProvider, (Provider<LinkSignupHandlerForNetworking>) linkSignupHandlerForNetworking_FactoryCreate);
            this.provideLinkSignupHandler$financial_connections_releaseProvider = financialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactoryCreate;
            C0942NetworkingLinkSignupViewModel_Factory c0942NetworkingLinkSignupViewModel_FactoryCreate = C0942NetworkingLinkSignupViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.lookupAccountProvider, this.uriUtilsProvider, this.providesAnalyticsTrackerProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider, (Provider<PresentSheet>) this.realPresentSheetProvider, (Provider<LinkSignupHandler>) financialConnectionsSheetNativeModule_Companion_ProvideLinkSignupHandler$financial_connections_releaseFactoryCreate, this.provideElementsSessionContext$financial_connections_releaseProvider, (Provider<HandleError>) this.realHandleErrorProvider);
            this.networkingLinkSignupViewModelProvider = c0942NetworkingLinkSignupViewModel_FactoryCreate;
            this.factoryProvider14 = NetworkingLinkSignupViewModel_Factory_Impl.createFactoryProvider(c0942NetworkingLinkSignupViewModel_FactoryCreate);
            DisableNetworking_Factory disableNetworking_FactoryCreate = DisableNetworking_Factory.create(this.configurationProvider, this.providesFinancialConnectionsManifestRepositoryProvider);
            this.disableNetworkingProvider = disableNetworking_FactoryCreate;
            C0929NetworkingLinkLoginWarmupViewModel_Factory c0929NetworkingLinkLoginWarmupViewModel_FactoryCreate = C0929NetworkingLinkLoginWarmupViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, (Provider<HandleError>) this.realHandleErrorProvider, this.getOrFetchSyncProvider, (Provider<DisableNetworking>) disableNetworking_FactoryCreate, this.bindsNavigationManagerProvider, this.lookupAccountProvider, this.providePrefillDetails$financial_connections_releaseProvider, this.bindsConsumerSessionProvider);
            this.networkingLinkLoginWarmupViewModelProvider = c0929NetworkingLinkLoginWarmupViewModel_FactoryCreate;
            this.factoryProvider15 = NetworkingLinkLoginWarmupViewModel_Factory_Impl.createFactoryProvider(c0929NetworkingLinkLoginWarmupViewModel_FactoryCreate);
            this.confirmVerificationProvider = ConfirmVerification_Factory.create(this.providesFinancialConnectionsConsumerSessionRepositoryProvider);
            this.markLinkVerifiedProvider = MarkLinkVerified_Factory.create(this.configurationProvider, this.providesFinancialConnectionsManifestRepositoryProvider);
            StartVerification_Factory startVerification_FactoryCreate = StartVerification_Factory.create(this.providesFinancialConnectionsConsumerSessionRepositoryProvider);
            this.startVerificationProvider = startVerification_FactoryCreate;
            C0945NetworkingLinkVerificationViewModel_Factory c0945NetworkingLinkVerificationViewModel_FactoryCreate = C0945NetworkingLinkVerificationViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.getOrFetchSyncProvider, this.confirmVerificationProvider, this.markLinkVerifiedProvider, this.bindsNavigationManagerProvider, this.providesAnalyticsTrackerProvider, (Provider<StartVerification>) startVerification_FactoryCreate, this.provideLogger$financial_connections_releaseProvider, (Provider<IsLinkWithStripe>) this.realIsLinkWithStripeProvider, (Provider<AttachConsumerToLinkAccountSession>) this.realAttachConsumerToLinkAccountSessionProvider, this.bindsConsumerSessionProvider, (Provider<HandleError>) this.realHandleErrorProvider);
            this.networkingLinkVerificationViewModelProvider = c0945NetworkingLinkVerificationViewModel_FactoryCreate;
            this.factoryProvider16 = NetworkingLinkVerificationViewModel_Factory_Impl.createFactoryProvider(c0945NetworkingLinkVerificationViewModel_FactoryCreate);
        }

        private void initialize6(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent, SynchronizeSessionResponse synchronizeSessionResponse, SavedStateHandle savedStateHandle, Application application, FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration) {
            C0948NetworkingSaveToLinkVerificationViewModel_Factory c0948NetworkingSaveToLinkVerificationViewModel_FactoryCreate = C0948NetworkingSaveToLinkVerificationViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, this.bindsConsumerSessionProvider, this.startVerificationProvider, this.getOrFetchSyncProvider, this.confirmVerificationProvider, this.attachedPaymentAccountRepositoryProvider, this.markLinkVerifiedProvider, this.getCachedAccountsProvider, this.saveAccountToLinkProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.networkingSaveToLinkVerificationViewModelProvider = c0948NetworkingSaveToLinkVerificationViewModel_FactoryCreate;
            this.factoryProvider17 = NetworkingSaveToLinkVerificationViewModel_Factory_Impl.createFactoryProvider(c0948NetworkingSaveToLinkVerificationViewModel_FactoryCreate);
            this.fetchNetworkedAccountsProvider = FetchNetworkedAccounts_Factory.create(this.providesFinancialConnectionsAccountsRepositoryProvider, this.configurationProvider);
            SelectNetworkedAccounts_Factory selectNetworkedAccounts_FactoryCreate = SelectNetworkedAccounts_Factory.create(this.configurationProvider, this.successContentRepositoryProvider, this.providesFinancialConnectionsAccountsRepositoryProvider);
            this.selectNetworkedAccountsProvider = selectNetworkedAccounts_FactoryCreate;
            C0912LinkAccountPickerViewModel_Factory c0912LinkAccountPickerViewModel_FactoryCreate = C0912LinkAccountPickerViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, this.bindsConsumerSessionProvider, this.handleClickableUrlProvider, this.fetchNetworkedAccountsProvider, (Provider<SelectNetworkedAccounts>) selectNetworkedAccounts_FactoryCreate, this.updateCachedAccountsProvider, this.getOrFetchSyncProvider, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider, this.acceptConsentProvider, (Provider<PresentSheet>) this.realPresentSheetProvider);
            this.linkAccountPickerViewModelProvider = c0912LinkAccountPickerViewModel_FactoryCreate;
            this.factoryProvider18 = LinkAccountPickerViewModel_Factory_Impl.createFactoryProvider(c0912LinkAccountPickerViewModel_FactoryCreate);
            MarkLinkStepUpVerified_Factory markLinkStepUpVerified_FactoryCreate = MarkLinkStepUpVerified_Factory.create(this.configurationProvider, this.providesFinancialConnectionsManifestRepositoryProvider);
            this.markLinkStepUpVerifiedProvider = markLinkStepUpVerified_FactoryCreate;
            C0917LinkStepUpVerificationViewModel_Factory c0917LinkStepUpVerificationViewModel_FactoryCreate = C0917LinkStepUpVerificationViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.providesAnalyticsTrackerProvider, this.getOrFetchSyncProvider, this.startVerificationProvider, this.bindsConsumerSessionProvider, this.confirmVerificationProvider, this.selectNetworkedAccountsProvider, this.getCachedAccountsProvider, (Provider<MarkLinkStepUpVerified>) markLinkStepUpVerified_FactoryCreate, this.bindsNavigationManagerProvider, this.provideLogger$financial_connections_releaseProvider);
            this.linkStepUpVerificationViewModelProvider = c0917LinkStepUpVerificationViewModel_FactoryCreate;
            this.factoryProvider19 = LinkStepUpVerificationViewModel_Factory_Impl.createFactoryProvider(c0917LinkStepUpVerificationViewModel_FactoryCreate);
            C0872AccountUpdateRequiredViewModel_Factory c0872AccountUpdateRequiredViewModel_FactoryCreate = C0872AccountUpdateRequiredViewModel_Factory.create(this.nativeAuthFlowCoordinatorProvider, this.accountUpdateRequiredContentRepositoryProvider, this.coreAuthorizationPendingNetworkingRepairRepositoryProvider, this.bindsNavigationManagerProvider, this.providesAnalyticsTrackerProvider, this.updateLocalManifestProvider, this.provideLogger$financial_connections_releaseProvider);
            this.accountUpdateRequiredViewModelProvider = c0872AccountUpdateRequiredViewModel_FactoryCreate;
            this.factoryProvider20 = AccountUpdateRequiredViewModel_Factory_Impl.createFactoryProvider(c0872AccountUpdateRequiredViewModel_FactoryCreate);
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public void inject(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
            injectFinancialConnectionsSheetNativeActivity(financialConnectionsSheetNativeActivity);
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public FinancialConnectionsSheetNativeViewModel getViewModel() {
            return this.financialConnectionsSheetNativeViewModelProvider.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ConsentViewModel.Factory getConsentViewModelFactory() {
            return this.factoryProvider.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public IDConsentContentViewModel.Factory getIdConsentContentViewModelFactory() {
            return this.factoryProvider2.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public InstitutionPickerViewModel.Factory getInstitutionPickerViewModelFactory() {
            return this.factoryProvider3.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public AccountPickerViewModel.Factory getAccountPickerViewModelFactory() {
            return this.factoryProvider4.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ManualEntryViewModel.Factory getManualEntryViewModelFactory() {
            return this.factoryProvider5.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ManualEntrySuccessViewModel.Factory getManualEntrySuccessViewModelFactory() {
            return this.factoryProvider6.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public PartnerAuthViewModel.Factory getPartnerAuthViewModelFactory() {
            return this.factoryProvider7.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public SuccessViewModel.Factory getSuccessViewModelFactory() {
            return this.factoryProvider8.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public AttachPaymentViewModel.Factory getAttachPaymentViewModelFactory() {
            return this.factoryProvider9.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ResetViewModel.Factory getResetViewModelFactory() {
            return this.factoryProvider10.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ErrorViewModel.Factory getErrorViewModelFactory() {
            return this.factoryProvider11.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public ExitViewModel.Factory getExitViewModelFactory() {
            return this.factoryProvider12.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public NoticeSheetViewModel.Factory getNoticeSheetViewModelFactory() {
            return this.factoryProvider13.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public NetworkingLinkSignupViewModel.Factory getNetworkingLinkSignupViewModelFactory() {
            return this.factoryProvider14.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public NetworkingLinkLoginWarmupViewModel.Factory getNetworkingLinkLoginWarmupViewModelFactory() {
            return this.factoryProvider15.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public NetworkingLinkVerificationViewModel.Factory getNetworkingLinkVerificationViewModelFactory() {
            return this.factoryProvider16.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public NetworkingSaveToLinkVerificationViewModel.Factory getNetworkingSaveToLinkVerificationViewModelFactory() {
            return this.factoryProvider17.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public LinkAccountPickerViewModel.Factory getLinkAccountPickerViewModelFactory() {
            return this.factoryProvider18.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public LinkStepUpVerificationViewModel.Factory getLinkStepUpVerificationViewModelFactory() {
            return this.factoryProvider19.get();
        }

        @Override // com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent
        public AccountUpdateRequiredViewModel.Factory getAccountUpdateRequiredViewModelFactory() {
            return this.factoryProvider20.get();
        }

        private FinancialConnectionsSheetNativeActivity injectFinancialConnectionsSheetNativeActivity(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity) {
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectLogger(financialConnectionsSheetNativeActivity, this.provideLogger$financial_connections_releaseProvider.get());
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectImageLoader(financialConnectionsSheetNativeActivity, this.providesImageLoaderProvider.get());
            FinancialConnectionsSheetNativeActivity_MembersInjector.injectBrowserManager(financialConnectionsSheetNativeActivity, browserManager());
            return financialConnectionsSheetNativeActivity;
        }

        private static final class IntegrityRequestManagerProvider implements Provider<IntegrityRequestManager> {
            private final FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent;

            IntegrityRequestManagerProvider(FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent) {
                this.financialConnectionsSingletonSharedComponent = financialConnectionsSingletonSharedComponent;
            }

            @Override // javax.inject.Provider
            public IntegrityRequestManager get() {
                return (IntegrityRequestManager) Preconditions.checkNotNullFromComponent(this.financialConnectionsSingletonSharedComponent.integrityRequestManager());
            }
        }
    }
}
