package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.imagepipeline.transcoder.JpegTranscoderUtils;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.di.NamedConstantsKt;
import com.stripe.android.financialconnections.domain.AttachConsumerToLinkAccountSession;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.RequestIntegrityToken;
import com.stripe.android.financialconnections.features.error.ErrorExtKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.model.ConsumerSessionSignup;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.navigation.NavigationManager;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: LinkSignupHandler.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandlerForInstantDebits;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;", "consumerRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "attachConsumerToLinkAccountSession", "Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;", "requestIntegrityToken", "Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", NamedConstantsKt.APPLICATION_ID, "", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;Lcom/stripe/android/financialconnections/domain/AttachConsumerToLinkAccountSession;Lcom/stripe/android/financialconnections/domain/RequestIntegrityToken;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/HandleError;)V", "performSignup", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToVerification", "", "handleSignupFailure", "error", "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkSignupHandlerForInstantDebits implements LinkSignupHandler {
    public static final int $stable = 8;
    private final String applicationId;
    private final AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession;
    private final FinancialConnectionsConsumerSessionRepository consumerRepository;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final NavigationManager navigationManager;
    private final RequestIntegrityToken requestIntegrityToken;

    /* compiled from: LinkSignupHandler.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits", f = "LinkSignupHandler.kt", i = {0, 0, 0, 1, 1, 1, 2, 3, 4}, l = {59, LockFreeTaskQueueCore.CLOSED_SHIFT, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT, 73, 80, JpegTranscoderUtils.DEFAULT_JPEG_QUALITY}, m = "performSignup", n = {"this", ServerProtocol.DIALOG_PARAM_STATE, "phoneController", "this", ServerProtocol.DIALOG_PARAM_STATE, "phoneController", "this", "this", "this"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$0"})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits$performSignup$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkSignupHandlerForInstantDebits.this.performSignup(null, this);
        }
    }

    @Inject
    public LinkSignupHandlerForInstantDebits(FinancialConnectionsConsumerSessionRepository consumerRepository, AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession, RequestIntegrityToken requestIntegrityToken, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, @Named(NamedConstantsKt.APPLICATION_ID) String applicationId, HandleError handleError) {
        Intrinsics.checkNotNullParameter(consumerRepository, "consumerRepository");
        Intrinsics.checkNotNullParameter(attachConsumerToLinkAccountSession, "attachConsumerToLinkAccountSession");
        Intrinsics.checkNotNullParameter(requestIntegrityToken, "requestIntegrityToken");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        this.consumerRepository = consumerRepository;
        this.attachConsumerToLinkAccountSession = attachConsumerToLinkAccountSession;
        this.requestIntegrityToken = requestIntegrityToken;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.applicationId = applicationId;
        this.handleError = handleError;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f2, code lost:
    
        if (r12 != r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0119, code lost:
    
        if (r12 == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
    
        if (r12 != r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134 A[PHI: r4 r11
      0x0134: PHI (r4v5 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits$performSignup$1) = 
      (r4v4 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits$performSignup$1)
      (r4v0 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits$performSignup$1)
     binds: [B:36:0x0131, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0134: PHI (r11v17 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits) = 
      (r11v13 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits)
      (r11v21 com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandlerForInstantDebits)
     binds: [B:36:0x0131, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object performSignup(NetworkingLinkSignupState networkingLinkSignupState, Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation) {
        AnonymousClass1 anonymousClass1;
        PhoneNumberController phoneController;
        Object obj;
        NetworkingLinkSignupState networkingLinkSignupState2;
        LinkSignupHandlerForInstantDebits linkSignupHandlerForInstantDebits;
        Object objInvoke;
        ConsumerSessionSignup consumerSessionSignup;
        AttachConsumerToLinkAccountSession attachConsumerToLinkAccountSession;
        String clientSecret;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objSignUp = anonymousClass12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (anonymousClass12.label) {
            case 0:
                ResultKt.throwOnFailure(objSignUp);
                NetworkingLinkSignupState.Payload payloadInvoke = networkingLinkSignupState.getPayload().invoke();
                Intrinsics.checkNotNull(payloadInvoke);
                phoneController = payloadInvoke.getPhoneController();
                GetOrFetchSync getOrFetchSync = this.getOrFetchSync;
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = networkingLinkSignupState;
                anonymousClass12.L$2 = phoneController;
                anonymousClass12.label = 1;
                Object objInvoke$default = GetOrFetchSync.invoke$default(getOrFetchSync, null, false, anonymousClass12, 3, null);
                if (objInvoke$default != coroutine_suspended) {
                    obj = objInvoke$default;
                    networkingLinkSignupState2 = networkingLinkSignupState;
                    linkSignupHandlerForInstantDebits = this;
                    if (!((SynchronizeSessionResponse) obj).getManifest().getAppVerificationEnabled()) {
                        RequestIntegrityToken requestIntegrityToken = linkSignupHandlerForInstantDebits.requestIntegrityToken;
                        FinancialConnectionsAnalyticsEvent.AttestationEndpoint attestationEndpoint = FinancialConnectionsAnalyticsEvent.AttestationEndpoint.SIGNUP;
                        FinancialConnectionsSessionManifest.Pane pane = FinancialConnectionsSessionManifest.Pane.LINK_LOGIN;
                        anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                        anonymousClass12.L$1 = networkingLinkSignupState2;
                        anonymousClass12.L$2 = phoneController;
                        anonymousClass12.label = 2;
                        objInvoke = requestIntegrityToken.invoke(attestationEndpoint, pane, anonymousClass12);
                        if (objInvoke != coroutine_suspended) {
                            String str = (String) objInvoke;
                            NetworkingLinkSignupState networkingLinkSignupState3 = networkingLinkSignupState2;
                            FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = linkSignupHandlerForInstantDebits.consumerRepository;
                            String validEmail = networkingLinkSignupState3.getValidEmail();
                            Intrinsics.checkNotNull(validEmail);
                            String validPhone = networkingLinkSignupState3.getValidPhone();
                            Intrinsics.checkNotNull(validPhone);
                            String countryCode = phoneController.getCountryCode();
                            String str2 = linkSignupHandlerForInstantDebits.applicationId;
                            anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                            anonymousClass12.L$1 = null;
                            anonymousClass12.L$2 = null;
                            anonymousClass12.label = 3;
                            objSignUp = financialConnectionsConsumerSessionRepository.mobileSignUp(validEmail, validPhone, countryCode, str, str2, anonymousClass12);
                            anonymousClass12 = anonymousClass12;
                            break;
                        }
                    } else {
                        FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository2 = linkSignupHandlerForInstantDebits.consumerRepository;
                        String validEmail2 = networkingLinkSignupState2.getValidEmail();
                        Intrinsics.checkNotNull(validEmail2);
                        String validPhone2 = networkingLinkSignupState2.getValidPhone();
                        Intrinsics.checkNotNull(validPhone2);
                        String countryCode2 = phoneController.getCountryCode();
                        anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                        anonymousClass12.L$1 = null;
                        anonymousClass12.L$2 = null;
                        anonymousClass12.label = 4;
                        objSignUp = financialConnectionsConsumerSessionRepository2.signUp(validEmail2, validPhone2, countryCode2, anonymousClass12);
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                PhoneNumberController phoneNumberController = (PhoneNumberController) anonymousClass12.L$2;
                networkingLinkSignupState2 = (NetworkingLinkSignupState) anonymousClass12.L$1;
                LinkSignupHandlerForInstantDebits linkSignupHandlerForInstantDebits2 = (LinkSignupHandlerForInstantDebits) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objSignUp);
                phoneController = phoneNumberController;
                linkSignupHandlerForInstantDebits = linkSignupHandlerForInstantDebits2;
                obj = objSignUp;
                if (!((SynchronizeSessionResponse) obj).getManifest().getAppVerificationEnabled()) {
                }
                return coroutine_suspended;
            case 2:
                PhoneNumberController phoneNumberController2 = (PhoneNumberController) anonymousClass12.L$2;
                networkingLinkSignupState2 = (NetworkingLinkSignupState) anonymousClass12.L$1;
                LinkSignupHandlerForInstantDebits linkSignupHandlerForInstantDebits3 = (LinkSignupHandlerForInstantDebits) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objSignUp);
                phoneController = phoneNumberController2;
                linkSignupHandlerForInstantDebits = linkSignupHandlerForInstantDebits3;
                objInvoke = objSignUp;
                String str3 = (String) objInvoke;
                NetworkingLinkSignupState networkingLinkSignupState32 = networkingLinkSignupState2;
                FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository3 = linkSignupHandlerForInstantDebits.consumerRepository;
                String validEmail3 = networkingLinkSignupState32.getValidEmail();
                Intrinsics.checkNotNull(validEmail3);
                String validPhone3 = networkingLinkSignupState32.getValidPhone();
                Intrinsics.checkNotNull(validPhone3);
                String countryCode3 = phoneController.getCountryCode();
                String str22 = linkSignupHandlerForInstantDebits.applicationId;
                anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                anonymousClass12.L$1 = null;
                anonymousClass12.L$2 = null;
                anonymousClass12.label = 3;
                objSignUp = financialConnectionsConsumerSessionRepository3.mobileSignUp(validEmail3, validPhone3, countryCode3, str3, str22, anonymousClass12);
                anonymousClass12 = anonymousClass12;
                break;
            case 3:
                linkSignupHandlerForInstantDebits = (LinkSignupHandlerForInstantDebits) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objSignUp);
                consumerSessionSignup = (ConsumerSessionSignup) objSignUp;
                attachConsumerToLinkAccountSession = linkSignupHandlerForInstantDebits.attachConsumerToLinkAccountSession;
                clientSecret = consumerSessionSignup.getConsumerSession().getClientSecret();
                anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                anonymousClass12.label = 5;
                if (attachConsumerToLinkAccountSession.invoke(clientSecret, anonymousClass12) != coroutine_suspended) {
                    GetOrFetchSync getOrFetchSync2 = linkSignupHandlerForInstantDebits.getOrFetchSync;
                    GetOrFetchSync.RefetchCondition.Always always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                    anonymousClass12.L$0 = null;
                    anonymousClass12.label = 6;
                    objSignUp = GetOrFetchSync.invoke$default(getOrFetchSync2, always, false, anonymousClass12, 2, null);
                    break;
                }
                return coroutine_suspended;
            case 4:
                linkSignupHandlerForInstantDebits = (LinkSignupHandlerForInstantDebits) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objSignUp);
                consumerSessionSignup = (ConsumerSessionSignup) objSignUp;
                attachConsumerToLinkAccountSession = linkSignupHandlerForInstantDebits.attachConsumerToLinkAccountSession;
                clientSecret = consumerSessionSignup.getConsumerSession().getClientSecret();
                anonymousClass12.L$0 = linkSignupHandlerForInstantDebits;
                anonymousClass12.label = 5;
                if (attachConsumerToLinkAccountSession.invoke(clientSecret, anonymousClass12) != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 5:
                linkSignupHandlerForInstantDebits = (LinkSignupHandlerForInstantDebits) anonymousClass12.L$0;
                ResultKt.throwOnFailure(objSignUp);
                GetOrFetchSync getOrFetchSync22 = linkSignupHandlerForInstantDebits.getOrFetchSync;
                GetOrFetchSync.RefetchCondition.Always always2 = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                anonymousClass12.L$0 = null;
                anonymousClass12.label = 6;
                objSignUp = GetOrFetchSync.invoke$default(getOrFetchSync22, always2, false, anonymousClass12, 2, null);
                break;
            case 6:
                ResultKt.throwOnFailure(objSignUp);
                return ((SynchronizeSessionResponse) objSignUp).getManifest().getNextPane();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void navigateToVerification() {
        NavigationManager.DefaultImpls.tryNavigateTo$default(this.navigationManager, Destination.invoke$default(Destination.NetworkingLinkVerification.INSTANCE, FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, null, 2, null), null, false, 6, null);
    }

    @Override // com.stripe.android.financialconnections.features.networkinglinksignup.LinkSignupHandler
    public void handleSignupFailure(NetworkingLinkSignupState state, Throwable error) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(error, "error");
        HandleError handleError = this.handleError;
        String validEmail = state.getValidEmail();
        Intrinsics.checkNotNull(validEmail);
        String validPhone = state.getValidPhone();
        NetworkingLinkSignupState.Payload payloadInvoke = state.getPayload().invoke();
        Intrinsics.checkNotNull(payloadInvoke);
        handleError.invoke("Error creating a Link account", ErrorExtKt.toAttestationErrorIfApplicable(error, new ElementsSessionContext.PrefillDetails(validEmail, validPhone, payloadInvoke.getPhoneController().getCountryCode())), FinancialConnectionsSessionManifest.Pane.LINK_LOGIN, true);
    }
}
