package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.domain.CachedPartnerAccount;
import com.stripe.android.financialconnections.domain.GetCachedAccounts;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.domain.SaveAccountToLink;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.error.ErrorExtKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.navigation.NavigationManager;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkSignupHandler.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForNetworking;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;", "consumerRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "getCachedAccounts", "Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;", "requestIntegrityToken", "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;", "saveAccountToLink", "Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", NamedConstantsKt.APPLICATION_ID, "", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/financialconnections/domain/GetCachedAccounts;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/SaveAccountToLink;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/core/Logger;)V", "performSignup", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToVerification", "", "handleSignupFailure", "error", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkSignupHandlerForNetworking implements LinkSignupHandler {
    public static final int $stable = 8;
    private final String applicationId;
    private final FinancialConnectionsConsumerSessionRepository consumerRepository;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetCachedAccounts getCachedAccounts;
    private final GetOrFetchSync getOrFetchSync;
    private final Logger logger;
    private final NavigationManager navigationManager;
    private final RequestIntegrityToken requestIntegrityToken;
    private final SaveAccountToLink saveAccountToLink;

    /* compiled from: LinkSignupHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking", f = "LinkSignupHandler.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}, l = {127, 128, 136, 140, 147, 156}, m = "performSignup", n = {"this", ServerProtocol.DIALOG_PARAM_STATE, "this", ServerProtocol.DIALOG_PARAM_STATE, "selectedAccounts", "this", ServerProtocol.DIALOG_PARAM_STATE, "selectedAccounts", "manifest", "phoneController", "this", "selectedAccounts", "manifest"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForNetworking$performSignup$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkSignupHandlerForNetworking.this.performSignup(null, this);
        }
    }

    @Inject
    public LinkSignupHandlerForNetworking(FinancialConnectionsConsumerSessionRepository consumerRepository, GetOrFetchSync getOrFetchSync, GetCachedAccounts getCachedAccounts, RequestIntegrityToken requestIntegrityToken, SaveAccountToLink saveAccountToLink, FinancialConnectionsAnalyticsTracker eventTracker, NavigationManager navigationManager, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId, Logger logger) {
        Intrinsics.checkNotNullParameter(consumerRepository, "consumerRepository");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(getCachedAccounts, "getCachedAccounts");
        Intrinsics.checkNotNullParameter(requestIntegrityToken, "requestIntegrityToken");
        Intrinsics.checkNotNullParameter(saveAccountToLink, "saveAccountToLink");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.consumerRepository = consumerRepository;
        this.getOrFetchSync = getOrFetchSync;
        this.getCachedAccounts = getCachedAccounts;
        this.requestIntegrityToken = requestIntegrityToken;
        this.saveAccountToLink = saveAccountToLink;
        this.eventTracker = eventTracker;
        this.navigationManager = navigationManager;
        this.applicationId = applicationId;
        this.logger = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x015b, code lost:
    
        if (r13 != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0186, code lost:
    
        if (r13 == r0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performSignup(NetworkingLinkSignupState networkingLinkSignupState, Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation) {
        AnonymousClass1 anonymousClass1;
        LinkSignupHandlerForNetworking linkSignupHandlerForNetworking;
        Object objInvoke$default;
        NetworkingLinkSignupState networkingLinkSignupState2;
        List<CachedPartnerAccount> list;
        LinkSignupHandlerForNetworking linkSignupHandlerForNetworking2;
        Object objInvoke;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest;
        PhoneNumberController phoneNumberController;
        LinkSignupHandlerForNetworking linkSignupHandlerForNetworking3;
        List<CachedPartnerAccount> list2;
        Object objMobileSignUp;
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest2;
        List<CachedPartnerAccount> list3;
        LinkSignupHandlerForNetworking linkSignupHandlerForNetworking4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objInvoke2 = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass12.label) {
            case 0:
                ResultKt.throwOnFailure(objInvoke2);
                this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.save_to_link", FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE));
                GetCachedAccounts getCachedAccounts = this.getCachedAccounts;
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = networkingLinkSignupState;
                anonymousClass12.label = 1;
                objInvoke2 = getCachedAccounts.invoke(anonymousClass12);
                if (objInvoke2 != coroutine_suspended) {
                    linkSignupHandlerForNetworking = this;
                    List<CachedPartnerAccount> list4 = (List) objInvoke2;
                    GetOrFetchSync getOrFetchSync = linkSignupHandlerForNetworking.getOrFetchSync;
                    anonymousClass12.L$0 = linkSignupHandlerForNetworking;
                    anonymousClass12.L$1 = networkingLinkSignupState;
                    anonymousClass12.L$2 = list4;
                    anonymousClass12.label = 2;
                    objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, anonymousClass12, 3, null);
                    if (objInvoke$default != coroutine_suspended) {
                        networkingLinkSignupState2 = networkingLinkSignupState;
                        list = list4;
                        objInvoke2 = objInvoke$default;
                        linkSignupHandlerForNetworking2 = linkSignupHandlerForNetworking;
                        FinancialConnectionsSessionManifest manifest = ((SynchronizeSessionResponse) objInvoke2).getManifest();
                        NetworkingLinkSignupState.Payload payloadInvoke = networkingLinkSignupState2.getPayload().invoke();
                        Intrinsics.checkNotNull(payloadInvoke);
                        PhoneNumberController phoneController = payloadInvoke.getPhoneController();
                        if (!networkingLinkSignupState2.getValid()) {
                            if (!manifest.getAppVerificationEnabled()) {
                                SaveAccountToLink saveAccountToLink = linkSignupHandlerForNetworking2.saveAccountToLink;
                                String countryCode = phoneController.getCountryCode();
                                String validEmail = networkingLinkSignupState2.getValidEmail();
                                Intrinsics.checkNotNull(validEmail);
                                String validPhone = networkingLinkSignupState2.getValidPhone();
                                Intrinsics.checkNotNull(validPhone);
                                boolean zIsDataFlow = ManifestExtensionsKt.isDataFlow(manifest);
                                anonymousClass12.L$0 = null;
                                anonymousClass12.L$1 = null;
                                anonymousClass12.L$2 = null;
                                anonymousClass12.label = 6;
                                objInvoke2 = saveAccountToLink.m7289new(validEmail, validPhone, list, countryCode, zIsDataFlow, anonymousClass12);
                                break;
                            } else {
                                RequestIntegrityToken requestIntegrityToken = linkSignupHandlerForNetworking2.requestIntegrityToken;
                                FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.SIGNUP;
                                FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE;
                                anonymousClass12.L$0 = linkSignupHandlerForNetworking2;
                                anonymousClass12.L$1 = networkingLinkSignupState2;
                                anonymousClass12.L$2 = list;
                                anonymousClass12.L$3 = manifest;
                                anonymousClass12.L$4 = phoneController;
                                anonymousClass12.label = 3;
                                objInvoke = requestIntegrityToken.invoke(attestationEndpoint, pane, anonymousClass12);
                                if (objInvoke != coroutine_suspended) {
                                    financialConnectionsSessionManifest = manifest;
                                    phoneNumberController = phoneController;
                                    linkSignupHandlerForNetworking3 = linkSignupHandlerForNetworking2;
                                    list2 = list;
                                    String str = (String) objInvoke;
                                    FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = linkSignupHandlerForNetworking3.consumerRepository;
                                    String validEmail2 = networkingLinkSignupState2.getValidEmail();
                                    Intrinsics.checkNotNull(validEmail2);
                                    String validPhone2 = networkingLinkSignupState2.getValidPhone();
                                    Intrinsics.checkNotNull(validPhone2);
                                    String countryCode2 = phoneNumberController.getCountryCode();
                                    String str2 = linkSignupHandlerForNetworking3.applicationId;
                                    anonymousClass12.L$0 = linkSignupHandlerForNetworking3;
                                    anonymousClass12.L$1 = list2;
                                    anonymousClass12.L$2 = financialConnectionsSessionManifest;
                                    anonymousClass12.L$3 = null;
                                    anonymousClass12.L$4 = null;
                                    anonymousClass12.label = 4;
                                    objMobileSignUp = financialConnectionsConsumerSessionRepository.mobileSignUp(validEmail2, validPhone2, countryCode2, str, str2, anonymousClass12);
                                    if (objMobileSignUp != coroutine_suspended) {
                                        FinancialConnectionsSessionManifest financialConnectionsSessionManifest3 = financialConnectionsSessionManifest;
                                        objInvoke2 = objMobileSignUp;
                                        financialConnectionsSessionManifest2 = financialConnectionsSessionManifest3;
                                        list3 = list2;
                                        linkSignupHandlerForNetworking4 = linkSignupHandlerForNetworking3;
                                        SaveAccountToLink saveAccountToLink2 = linkSignupHandlerForNetworking4.saveAccountToLink;
                                        String clientSecret = ((ConsumerSessionSignup) objInvoke2).getConsumerSession().getClientSecret();
                                        boolean zIsDataFlow2 = ManifestExtensionsKt.isDataFlow(financialConnectionsSessionManifest2);
                                        anonymousClass12.L$0 = null;
                                        anonymousClass12.L$1 = null;
                                        anonymousClass12.L$2 = null;
                                        anonymousClass12.label = 5;
                                        objInvoke2 = saveAccountToLink2.existing(clientSecret, list3, zIsDataFlow2, anonymousClass12);
                                        break;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException(("Form invalid! " + networkingLinkSignupState2.getValidEmail() + " " + networkingLinkSignupState2.getValidPhone()).toString());
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                networkingLinkSignupState = (NetworkingLinkSignupState) anonymousClass12.L$1;
                LinkSignupHandlerForNetworking linkSignupHandlerForNetworking5 = (LinkSignupHandlerForNetworking) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                linkSignupHandlerForNetworking = linkSignupHandlerForNetworking5;
                List<CachedPartnerAccount> list42 = (List) objInvoke2;
                GetOrFetchSync getOrFetchSync2 = linkSignupHandlerForNetworking.getOrFetchSync;
                anonymousClass12.L$0 = linkSignupHandlerForNetworking;
                anonymousClass12.L$1 = networkingLinkSignupState;
                anonymousClass12.L$2 = list42;
                anonymousClass12.label = 2;
                objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync2, null, false, anonymousClass12, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 2:
                List<CachedPartnerAccount> list5 = (List) anonymousClass12.L$2;
                NetworkingLinkSignupState networkingLinkSignupState3 = (NetworkingLinkSignupState) anonymousClass12.L$1;
                linkSignupHandlerForNetworking2 = (LinkSignupHandlerForNetworking) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                list = list5;
                networkingLinkSignupState2 = networkingLinkSignupState3;
                FinancialConnectionsSessionManifest manifest2 = ((SynchronizeSessionResponse) objInvoke2).getManifest();
                NetworkingLinkSignupState.Payload payloadInvoke2 = networkingLinkSignupState2.getPayload().invoke();
                Intrinsics.checkNotNull(payloadInvoke2);
                PhoneNumberController phoneController2 = payloadInvoke2.getPhoneController();
                if (!networkingLinkSignupState2.getValid()) {
                }
                break;
            case 3:
                phoneNumberController = (PhoneNumberController) anonymousClass12.L$4;
                FinancialConnectionsSessionManifest financialConnectionsSessionManifest4 = (FinancialConnectionsSessionManifest) anonymousClass12.L$3;
                List<CachedPartnerAccount> list6 = (List) anonymousClass12.L$2;
                networkingLinkSignupState2 = (NetworkingLinkSignupState) anonymousClass12.L$1;
                LinkSignupHandlerForNetworking linkSignupHandlerForNetworking6 = (LinkSignupHandlerForNetworking) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                objInvoke = objInvoke2;
                financialConnectionsSessionManifest = financialConnectionsSessionManifest4;
                list2 = list6;
                linkSignupHandlerForNetworking3 = linkSignupHandlerForNetworking6;
                String str3 = (String) objInvoke;
                FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository2 = linkSignupHandlerForNetworking3.consumerRepository;
                String validEmail22 = networkingLinkSignupState2.getValidEmail();
                Intrinsics.checkNotNull(validEmail22);
                String validPhone22 = networkingLinkSignupState2.getValidPhone();
                Intrinsics.checkNotNull(validPhone22);
                String countryCode22 = phoneNumberController.getCountryCode();
                String str22 = linkSignupHandlerForNetworking3.applicationId;
                anonymousClass12.L$0 = linkSignupHandlerForNetworking3;
                anonymousClass12.L$1 = list2;
                anonymousClass12.L$2 = financialConnectionsSessionManifest;
                anonymousClass12.L$3 = null;
                anonymousClass12.L$4 = null;
                anonymousClass12.label = 4;
                objMobileSignUp = financialConnectionsConsumerSessionRepository2.mobileSignUp(validEmail22, validPhone22, countryCode22, str3, str22, anonymousClass12);
                if (objMobileSignUp != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 4:
                financialConnectionsSessionManifest2 = (FinancialConnectionsSessionManifest) anonymousClass12.L$2;
                list3 = (List) anonymousClass12.L$1;
                linkSignupHandlerForNetworking4 = (LinkSignupHandlerForNetworking) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objInvoke2);
                SaveAccountToLink saveAccountToLink22 = linkSignupHandlerForNetworking4.saveAccountToLink;
                String clientSecret2 = ((ConsumerSessionSignup) objInvoke2).getConsumerSession().getClientSecret();
                boolean zIsDataFlow22 = ManifestExtensionsKt.isDataFlow(financialConnectionsSessionManifest2);
                anonymousClass12.L$0 = null;
                anonymousClass12.L$1 = null;
                anonymousClass12.L$2 = null;
                anonymousClass12.label = 5;
                objInvoke2 = saveAccountToLink22.existing(clientSecret2, list3, zIsDataFlow22, anonymousClass12);
                break;
            case 5:
                ResultKt.throwOnFailure(objInvoke2);
                return FinancialConnectionsSessionManifest.Pane.SUCCESS;
            case 6:
                ResultKt.throwOnFailure(objInvoke2);
                return FinancialConnectionsSessionManifest.Pane.SUCCESS;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void navigateToVerification() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.NetworkingSaveToLinkVerification.INSTANCE, FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE, null, 2, null), null, false, 6, null);
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void handleSignupFailure(NetworkingLinkSignupState state, Throwable error) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(error, "error");
        FinancialConnectionsAnalyticsTracker financialConnectionsAnalyticsTracker = this.eventTracker;
        String validEmail = state.getValidEmail();
        Intrinsics.checkNotNull(validEmail);
        String validPhone = state.getValidPhone();
        NetworkingLinkSignupState.Payload payloadInvoke = state.getPayload().invoke();
        Intrinsics.checkNotNull(payloadInvoke);
        FinancialConnectionsAnalyticsTrackerKt.logError(financialConnectionsAnalyticsTracker, "Error saving account to Link", ErrorExtKt.toAttestationErrorIfApplicable(error, new ElementsSessionContext.PrefillDetails(validEmail, validPhone, payloadInvoke.getPhoneController().getCountryCode())), this.logger, FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE);
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE, null, 2, null), null, false, 6, null);
    }
}
