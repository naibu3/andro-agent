package com.stripe.android.financialconnections.di;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.features.accountpicker.AccountPickerViewModel;
import com.stripe.android.financialconnections.features.accountupdate.AccountUpdateRequiredViewModel;
import com.stripe.android.financialconnections.features.attachpayment.AttachPaymentViewModel;
import com.stripe.android.financialconnections.features.consent.ConsentViewModel;
import com.stripe.android.financialconnections.features.error.ErrorViewModel;
import com.stripe.android.financialconnections.features.exit.ExitViewModel;
import com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerViewModel;
import com.stripe.android.financialconnections.features.linkaccountpicker.LinkAccountPickerViewModel;
import com.stripe.android.financialconnections.features.linkstepupverification.LinkStepUpVerificationViewModel;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryViewModel;
import com.stripe.android.financialconnections.features.manualentrysuccess.ManualEntrySuccessViewModel;
import com.stripe.android.financialconnections.features.networkinglinkloginwarmup.NetworkingLinkLoginWarmupViewModel;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.networkinglinkverification.NetworkingLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.networkingsavetolinkverification.NetworkingSaveToLinkVerificationViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetViewModel;
import com.stripe.android.financialconnections.features.partnerauth.PartnerAuthViewModel;
import com.stripe.android.financialconnections.features.reset.ResetViewModel;
import com.stripe.android.financialconnections.features.streamlinedconsent.IDConsentContentViewModel;
import com.stripe.android.financialconnections.features.success.SuccessViewModel;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeState;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsSheetNativeComponent.kt */
@Component(dependencies = {FinancialConnectionsSingletonSharedComponent.class}, modules = {FinancialConnectionsSheetNativeModule.class, FinancialConnectionsSheetSharedModule.class})
@ActivityRetainedScope
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001ZJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0012\u0010\"\u001a\u00020#X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0012\u0010&\u001a\u00020'X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0012\u0010*\u001a\u00020+X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0012\u0010.\u001a\u00020/X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0012\u00102\u001a\u000203X¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0012\u00106\u001a\u000207X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0012\u0010:\u001a\u00020;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020?X¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0012\u0010B\u001a\u00020CX¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0012\u0010F\u001a\u00020GX¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0012\u0010J\u001a\u00020KX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0012\u0010N\u001a\u00020OX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0012\u0010R\u001a\u00020SX¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0012\u0010V\u001a\u00020WX¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006["}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "", "inject", "", "financialConnectionsSheetNativeActivity", "Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "viewModel", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewModel;", "consentViewModelFactory", "Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;", "getConsentViewModelFactory", "()Lcom/stripe/android/financialconnections/features/consent/ConsentViewModel$Factory;", "idConsentContentViewModelFactory", "Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;", "getIdConsentContentViewModelFactory", "()Lcom/stripe/android/financialconnections/features/streamlinedconsent/IDConsentContentViewModel$Factory;", "institutionPickerViewModelFactory", "Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Factory;", "getInstitutionPickerViewModelFactory", "()Lcom/stripe/android/financialconnections/features/institutionpicker/InstitutionPickerViewModel$Factory;", "accountPickerViewModelFactory", "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Factory;", "getAccountPickerViewModelFactory", "()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerViewModel$Factory;", "manualEntryViewModelFactory", "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Factory;", "getManualEntryViewModelFactory", "()Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryViewModel$Factory;", "manualEntrySuccessViewModelFactory", "Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Factory;", "getManualEntrySuccessViewModelFactory", "()Lcom/stripe/android/financialconnections/features/manualentrysuccess/ManualEntrySuccessViewModel$Factory;", "partnerAuthViewModelFactory", "Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Factory;", "getPartnerAuthViewModelFactory", "()Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$Factory;", "successViewModelFactory", "Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Factory;", "getSuccessViewModelFactory", "()Lcom/stripe/android/financialconnections/features/success/SuccessViewModel$Factory;", "attachPaymentViewModelFactory", "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Factory;", "getAttachPaymentViewModelFactory", "()Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentViewModel$Factory;", "resetViewModelFactory", "Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Factory;", "getResetViewModelFactory", "()Lcom/stripe/android/financialconnections/features/reset/ResetViewModel$Factory;", "errorViewModelFactory", "Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Factory;", "getErrorViewModelFactory", "()Lcom/stripe/android/financialconnections/features/error/ErrorViewModel$Factory;", "exitViewModelFactory", "Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Factory;", "getExitViewModelFactory", "()Lcom/stripe/android/financialconnections/features/exit/ExitViewModel$Factory;", "noticeSheetViewModelFactory", "Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;", "getNoticeSheetViewModelFactory", "()Lcom/stripe/android/financialconnections/features/notice/NoticeSheetViewModel$Factory;", "networkingLinkSignupViewModelFactory", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Factory;", "getNetworkingLinkSignupViewModelFactory", "()Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Factory;", "networkingLinkLoginWarmupViewModelFactory", "Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Factory;", "getNetworkingLinkLoginWarmupViewModelFactory", "()Lcom/stripe/android/financialconnections/features/networkinglinkloginwarmup/NetworkingLinkLoginWarmupViewModel$Factory;", "networkingLinkVerificationViewModelFactory", "Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;", "getNetworkingLinkVerificationViewModelFactory", "()Lcom/stripe/android/financialconnections/features/networkinglinkverification/NetworkingLinkVerificationViewModel$Factory;", "networkingSaveToLinkVerificationViewModelFactory", "Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;", "getNetworkingSaveToLinkVerificationViewModelFactory", "()Lcom/stripe/android/financialconnections/features/networkingsavetolinkverification/NetworkingSaveToLinkVerificationViewModel$Factory;", "linkAccountPickerViewModelFactory", "Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;", "getLinkAccountPickerViewModelFactory", "()Lcom/stripe/android/financialconnections/features/linkaccountpicker/LinkAccountPickerViewModel$Factory;", "linkStepUpVerificationViewModelFactory", "Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Factory;", "getLinkStepUpVerificationViewModelFactory", "()Lcom/stripe/android/financialconnections/features/linkstepupverification/LinkStepUpVerificationViewModel$Factory;", "accountUpdateRequiredViewModelFactory", "Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Factory;", "getAccountUpdateRequiredViewModelFactory", "()Lcom/stripe/android/financialconnections/features/accountupdate/AccountUpdateRequiredViewModel$Factory;", "Builder", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsSheetNativeComponent {

    /* compiled from: FinancialConnectionsSheetNativeComponent.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00002\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003H'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent$Builder;", "", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "application", "Landroid/app/Application;", "initialState", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "sharedComponent", "component", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        @BindsInstance
        Builder application(Application application);

        FinancialConnectionsSheetNativeComponent build();

        @BindsInstance
        Builder configuration(FinancialConnectionsSheetConfiguration configuration);

        @BindsInstance
        Builder initialState(FinancialConnectionsSheetNativeState initialState);

        @BindsInstance
        Builder initialSyncResponse(@Named(NamedConstantsKt.INITIAL_SYNC_RESPONSE) SynchronizeSessionResponse initialSyncResponse);

        @BindsInstance
        Builder savedStateHandle(SavedStateHandle savedStateHandle);

        Builder sharedComponent(FinancialConnectionsSingletonSharedComponent component);
    }

    AccountPickerViewModel.Factory getAccountPickerViewModelFactory();

    AccountUpdateRequiredViewModel.Factory getAccountUpdateRequiredViewModelFactory();

    AttachPaymentViewModel.Factory getAttachPaymentViewModelFactory();

    ConsentViewModel.Factory getConsentViewModelFactory();

    ErrorViewModel.Factory getErrorViewModelFactory();

    ExitViewModel.Factory getExitViewModelFactory();

    IDConsentContentViewModel.Factory getIdConsentContentViewModelFactory();

    InstitutionPickerViewModel.Factory getInstitutionPickerViewModelFactory();

    LinkAccountPickerViewModel.Factory getLinkAccountPickerViewModelFactory();

    LinkStepUpVerificationViewModel.Factory getLinkStepUpVerificationViewModelFactory();

    ManualEntrySuccessViewModel.Factory getManualEntrySuccessViewModelFactory();

    ManualEntryViewModel.Factory getManualEntryViewModelFactory();

    NetworkingLinkLoginWarmupViewModel.Factory getNetworkingLinkLoginWarmupViewModelFactory();

    NetworkingLinkSignupViewModel.Factory getNetworkingLinkSignupViewModelFactory();

    NetworkingLinkVerificationViewModel.Factory getNetworkingLinkVerificationViewModelFactory();

    NetworkingSaveToLinkVerificationViewModel.Factory getNetworkingSaveToLinkVerificationViewModelFactory();

    NoticeSheetViewModel.Factory getNoticeSheetViewModelFactory();

    PartnerAuthViewModel.Factory getPartnerAuthViewModelFactory();

    ResetViewModel.Factory getResetViewModelFactory();

    SuccessViewModel.Factory getSuccessViewModelFactory();

    FinancialConnectionsSheetNativeViewModel getViewModel();

    void inject(FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity);
}
