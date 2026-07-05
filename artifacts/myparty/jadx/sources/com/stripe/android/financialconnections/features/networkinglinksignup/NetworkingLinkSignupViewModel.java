package com.stripe.android.financialconnections.features.networkinglinksignup;

import android.webkit.URLUtil;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.facebook.imageutils.JfifUtil;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import com.nimbusds.jose.crypto.impl.AESGCM;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.PermissionException;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsEvent;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.di.FinancialConnectionsSheetNativeComponent;
import com.stripe.android.financialconnections.domain.GetOrFetchSync;
import com.stripe.android.financialconnections.domain.HandleError;
import com.stripe.android.financialconnections.domain.LookupAccount;
import com.stripe.android.financialconnections.domain.NativeAuthFlowCoordinator;
import com.stripe.android.financialconnections.features.common.ManifestExtensionsKt;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel;
import com.stripe.android.financialconnections.features.notice.NoticeSheetState;
import com.stripe.android.financialconnections.features.notice.PresentSheet;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.model.TextUpdate;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.navigation.DestinationMappersKt;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarStateUpdate;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel;
import com.stripe.android.financialconnections.ui.HandleClickableUrl;
import com.stripe.android.financialconnections.utils.ConflatedJob;
import com.stripe.android.financialconnections.utils.MavericksExtensionsKt;
import com.stripe.android.financialconnections.utils.UriUtils;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.EmailSource;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.navigation.NavigationManager;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedFactory;
import dagger.assisted.AssistedInject;
import java.util.Date;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: NetworkingLinkSignupViewModel.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002;<Bm\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J\u0012\u0010*\u001a\u00020&2\b\u0010+\u001a\u0004\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020.2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020&J\b\u00102\u001a\u00020&H\u0002J\b\u00103\u001a\u00020&H\u0002J\u000e\u00104\u001a\u0002002\u0006\u00105\u001a\u00020,J\b\u00106\u001a\u00020&H\u0002J\u0014\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,08*\u000209H\u0002J\u0006\u0010:\u001a\u00020&R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsViewModel;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "initialState", "nativeAuthFlowCoordinator", "Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;", "lookupAccount", "Lcom/stripe/android/financialconnections/domain/LookupAccount;", "uriUtils", "Lcom/stripe/android/financialconnections/utils/UriUtils;", "eventTracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "getOrFetchSync", "Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "logger", "Lcom/stripe/android/core/Logger;", "presentSheet", "Lcom/stripe/android/financialconnections/features/notice/PresentSheet;", "linkSignupHandler", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "handleError", "Lcom/stripe/android/financialconnections/domain/HandleError;", "<init>", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lcom/stripe/android/financialconnections/domain/NativeAuthFlowCoordinator;Lcom/stripe/android/financialconnections/domain/LookupAccount;Lcom/stripe/android/financialconnections/utils/UriUtils;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;Lcom/stripe/android/financialconnections/domain/GetOrFetchSync;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/features/notice/PresentSheet;Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;Lcom/stripe/android/financialconnections/ElementsSessionContext;Lcom/stripe/android/financialconnections/domain/HandleError;)V", "pane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "searchJob", "Lcom/stripe/android/financialconnections/utils/ConflatedJob;", "updateTopAppBar", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarStateUpdate;", ServerProtocol.DIALOG_PARAM_STATE, "observeAsyncs", "", "observeLookupAccountResult", "observeSaveAccountResult", "observePayloadResult", "onEmailEntered", "validEmail", "", "getLookupDelayMs", "", "onSkipClick", "Lkotlinx/coroutines/Job;", "onSaveAccount", "saveNewAccount", "navigateToLinkVerification", "onClickableTextClick", ShareConstants.MEDIA_URI, "presentLegalDetailsBottomSheet", "validFormFieldState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/InputController;", "onViewEffectLaunched", "Factory", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkSignupViewModel extends FinancialConnectionsViewModel<NetworkingLinkSignupState> {
    private static final long SEARCH_DEBOUNCE_FINISHED_EMAIL_MS = 300;
    private static final long SEARCH_DEBOUNCE_MS = 1000;
    private final ElementsSessionContext elementsSessionContext;
    private final FinancialConnectionsAnalyticsTracker eventTracker;
    private final GetOrFetchSync getOrFetchSync;
    private final HandleError handleError;
    private final LinkSignupHandler linkSignupHandler;
    private final Logger logger;
    private final LookupAccount lookupAccount;
    private final NavigationManager navigationManager;
    private final PresentSheet presentSheet;
    private ConflatedJob searchJob;
    private final UriUtils uriUtils;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @AssistedFactory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Factory;", "", "create", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel;", "initialState", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        NetworkingLinkSignupViewModel create(NetworkingLinkSignupState initialState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public NetworkingLinkSignupViewModel(@Assisted NetworkingLinkSignupState initialState, NativeAuthFlowCoordinator nativeAuthFlowCoordinator, LookupAccount lookupAccount, UriUtils uriUtils, FinancialConnectionsAnalyticsTracker eventTracker, GetOrFetchSync getOrFetchSync, NavigationManager navigationManager, Logger logger, PresentSheet presentSheet, LinkSignupHandler linkSignupHandler, ElementsSessionContext elementsSessionContext, HandleError handleError) {
        super(initialState, nativeAuthFlowCoordinator);
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(nativeAuthFlowCoordinator, "nativeAuthFlowCoordinator");
        Intrinsics.checkNotNullParameter(lookupAccount, "lookupAccount");
        Intrinsics.checkNotNullParameter(uriUtils, "uriUtils");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(getOrFetchSync, "getOrFetchSync");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(presentSheet, "presentSheet");
        Intrinsics.checkNotNullParameter(linkSignupHandler, "linkSignupHandler");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        this.lookupAccount = lookupAccount;
        this.uriUtils = uriUtils;
        this.eventTracker = eventTracker;
        this.getOrFetchSync = getOrFetchSync;
        this.navigationManager = navigationManager;
        this.logger = logger;
        this.presentSheet = presentSheet;
        this.linkSignupHandler = linkSignupHandler;
        this.elementsSessionContext = elementsSessionContext;
        this.handleError = handleError;
        this.searchJob = new ConflatedJob();
        observeAsyncs();
        FinancialConnectionsViewModel.execute$default(this, new AnonymousClass1(initialState, this, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkSignupViewModel._init_$lambda$0((NetworkingLinkSignupState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FinancialConnectionsSessionManifest.Pane getPane() {
        return getStateFlow().getValue().getPane();
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {AESGCM.IV_BIT_LENGTH}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super NetworkingLinkSignupState.Payload>, Object> {
        final /* synthetic */ NetworkingLinkSignupState $initialState;
        int label;
        final /* synthetic */ NetworkingLinkSignupViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetworkingLinkSignupState networkingLinkSignupState, NetworkingLinkSignupViewModel networkingLinkSignupViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.$initialState = networkingLinkSignupState;
            this.this$0 = networkingLinkSignupViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.$initialState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super NetworkingLinkSignupState.Payload> continuation) {
            return ((AnonymousClass1) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GetOrFetchSync.RefetchCondition.Always always;
            Object objInvoke$default;
            NetworkingLinkSignupState.Content content;
            NetworkingLinkSignupState.Content content2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$initialState.isInstantDebits()) {
                    always = GetOrFetchSync.RefetchCondition.None.INSTANCE;
                } else {
                    always = GetOrFetchSync.RefetchCondition.Always.INSTANCE;
                }
                this.label = 1;
                objInvoke$default = GetOrFetchSync.invoke$default(this.this$0.getOrFetchSync, always, false, this, 2, null);
                if (objInvoke$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objInvoke$default = obj;
            }
            SynchronizeSessionResponse synchronizeSessionResponse = (SynchronizeSessionResponse) objInvoke$default;
            TextUpdate text = synchronizeSessionResponse.getText();
            if (text != null) {
                LinkLoginPane linkLoginPane = text.getLinkLoginPane();
                if (linkLoginPane == null || (content2 = NetworkingLinkSignupViewModelKt.toContent(linkLoginPane)) == null) {
                    NetworkingLinkSignupPane networkingLinkSignupPane = text.getNetworkingLinkSignupPane();
                    content2 = networkingLinkSignupPane != null ? NetworkingLinkSignupViewModelKt.toContent(networkingLinkSignupPane) : null;
                }
                content = content2;
            } else {
                content = null;
            }
            this.this$0.eventTracker.track(new FinancialConnectionsAnalyticsEvent.PaneLoaded(this.this$0.getPane()));
            ElementsSessionContext elementsSessionContext = this.this$0.elementsSessionContext;
            ElementsSessionContext.PrefillDetails prefillDetails = elementsSessionContext != null ? elementsSessionContext.getPrefillDetails() : null;
            String accountholderCustomerEmailAddress = synchronizeSessionResponse.getManifest().getAccountholderCustomerEmailAddress();
            if (accountholderCustomerEmailAddress == null) {
                accountholderCustomerEmailAddress = prefillDetails != null ? prefillDetails.getEmail() : null;
            }
            String str = (accountholderCustomerEmailAddress == null || StringsKt.isBlank(accountholderCustomerEmailAddress)) ? null : accountholderCustomerEmailAddress;
            if (content == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            String businessName = ManifestExtensionsKt.getBusinessName(synchronizeSessionResponse.getManifest());
            String id = synchronizeSessionResponse.getManifest().getId();
            boolean appVerificationEnabled = synchronizeSessionResponse.getManifest().getAppVerificationEnabled();
            SimpleTextFieldController simpleTextFieldController = new SimpleTextFieldController(new EmailConfig(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_networking_signup_email_label, new Object[0], null, 4, null)), false, str, null, 8, null);
            PhoneNumberController.Companion companion = PhoneNumberController.INSTANCE;
            String accountholderPhoneNumber = synchronizeSessionResponse.getManifest().getAccountholderPhoneNumber();
            if (accountholderPhoneNumber == null) {
                accountholderPhoneNumber = prefillDetails != null ? prefillDetails.getPhone() : null;
                if (accountholderPhoneNumber == null) {
                    accountholderPhoneNumber = "";
                }
            }
            return new NetworkingLinkSignupState.Payload(businessName, simpleTextFieldController, appVerificationEnabled, str, PhoneNumberController.Companion.createPhoneNumberController$default(companion, accountholderPhoneNumber, prefillDetails != null ? prefillDetails.getPhoneCountryCode() : null, null, false, false, 28, null), this.$initialState.isInstantDebits(), content, id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState _init_$lambda$0(NetworkingLinkSignupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkSignupState.copy$default(execute, it, null, null, null, null, null, false, WebSocketProtocol.PAYLOAD_SHORT, null);
    }

    @Override // com.stripe.android.financialconnections.presentation.FinancialConnectionsViewModel
    public TopAppBarStateUpdate updateTopAppBar(NetworkingLinkSignupState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TopAppBarStateUpdate(getPane(), state.isInstantDebits(), MavericksExtensionsKt.getError(state.getPayload()), false, null, false, 56, null);
    }

    private final void observeAsyncs() {
        observePayloadResult();
        observeSaveAccountResult();
        observeLookupAccountResult();
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "consumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<ConsumerSessionLookup, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = NetworkingLinkSignupViewModel.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ConsumerSessionLookup consumerSessionLookup, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(consumerSessionLookup, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((ConsumerSessionLookup) this.L$0).getExists()) {
                NetworkingLinkSignupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.NetworkingReturningConsumer(NetworkingLinkSignupViewModel.this.getPane()));
                NetworkingLinkSignupViewModel.this.navigateToLinkVerification();
            } else {
                NetworkingLinkSignupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.NetworkingNewConsumer(NetworkingLinkSignupViewModel.this.getPane()));
            }
            return Unit.INSTANCE;
        }
    }

    private final void observeLookupAccountResult() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel.observeLookupAccountResult.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).getLookupAccount();
            }
        }, new AnonymousClass2(null), new AnonymousClass3(null));
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeLookupAccountResult$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass3 anonymousClass3 = NetworkingLinkSignupViewModel.this.new AnonymousClass3(continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Throwable th = (Throwable) this.L$0;
            NetworkingLinkSignupViewModel.this.handleError.invoke("Error looking up account", th, NetworkingLinkSignupViewModel.this.getPane(), NetworkingLinkSignupViewModel.this.getStateFlow().getValue().isInstantDebits() && (th instanceof PermissionException));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "nextPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeSaveAccountResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeSaveAccountResult$2, reason: invalid class name and case insensitive filesystem */
    static final class C09362 extends SuspendLambda implements Function2<FinancialConnectionsSessionManifest.Pane, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C09362(Continuation<? super C09362> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09362 c09362 = NetworkingLinkSignupViewModel.this.new C09362(continuation);
            c09362.L$0 = obj;
            return c09362;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FinancialConnectionsSessionManifest.Pane pane, Continuation<? super Unit> continuation) {
            return ((C09362) create(pane, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NavigationManager.DefaultImpls.tryNavigateTo$default(NetworkingLinkSignupViewModel.this.navigationManager, Destination.invoke$default(DestinationMappersKt.getDestination((FinancialConnectionsSessionManifest.Pane) this.L$0), NetworkingLinkSignupViewModel.this.getPane(), null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final void observeSaveAccountResult() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel.observeSaveAccountResult.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).getSaveAccountToLink();
            }
        }, new C09362(null), new C09373(null));
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeSaveAccountResult$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observeSaveAccountResult$3, reason: invalid class name and case insensitive filesystem */
    static final class C09373 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C09373(Continuation<? super C09373> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09373 c09373 = NetworkingLinkSignupViewModel.this.new C09373(continuation);
            c09373.L$0 = obj;
            return c09373;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((C09373) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            NetworkingLinkSignupViewModel.this.linkSignupHandler.handleSignupFailure(NetworkingLinkSignupViewModel.this.getStateFlow().getValue(), (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "payload", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Payload;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2, reason: invalid class name and case insensitive filesystem */
    static final class C09332 extends SuspendLambda implements Function2<NetworkingLinkSignupState.Payload, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C09332(Continuation<? super C09332> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09332 c09332 = NetworkingLinkSignupViewModel.this.new C09332(continuation);
            c09332.L$0 = obj;
            return c09332;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(NetworkingLinkSignupState.Payload payload, Continuation<? super Unit> continuation) {
            return ((C09332) create(payload, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingLinkSignupState.Payload payload = (NetworkingLinkSignupState.Payload) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(NetworkingLinkSignupViewModel.this), null, null, new AnonymousClass1(NetworkingLinkSignupViewModel.this, payload, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(NetworkingLinkSignupViewModel.this), null, null, new C01522(NetworkingLinkSignupViewModel.this, payload, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: NetworkingLinkSignupViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {187}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NetworkingLinkSignupState.Payload $payload;
            int label;
            final /* synthetic */ NetworkingLinkSignupViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, NetworkingLinkSignupState.Payload payload, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = networkingLinkSignupViewModel;
                this.$payload = payload;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$payload, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (FlowKt.collectLatest(this.this$0.validFormFieldState(this.$payload.getEmailController()), new C01511(this.this$0), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: NetworkingLinkSignupViewModel.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C01511 extends AdaptedFunctionReference implements Function2<String, Continuation<? super Unit>, Object>, SuspendFunction {
                C01511(Object obj) {
                    super(2, obj, NetworkingLinkSignupViewModel.class, "onEmailEntered", "onEmailEntered(Ljava/lang/String;)V", 4);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return AnonymousClass1.invokeSuspend$onEmailEntered((NetworkingLinkSignupViewModel) this.receiver, str, continuation);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$onEmailEntered(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, String str, Continuation continuation) {
                networkingLinkSignupViewModel.onEmailEntered(str);
                return Unit.INSTANCE;
            }
        }

        /* compiled from: NetworkingLinkSignupViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {FacebookRequestErrorClassification.EC_INVALID_TOKEN}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2, reason: invalid class name and collision with other inner class name */
        static final class C01522 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ NetworkingLinkSignupState.Payload $payload;
            int label;
            final /* synthetic */ NetworkingLinkSignupViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01522(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, NetworkingLinkSignupState.Payload payload, Continuation<? super C01522> continuation) {
                super(2, continuation);
                this.this$0 = networkingLinkSignupViewModel;
                this.$payload = payload;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01522(this.this$0, this.$payload, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C01522) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: NetworkingLinkSignupViewModel.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ NetworkingLinkSignupViewModel this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = networkingLinkSignupViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(String str, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        final String str = (String) this.L$0;
                        this.this$0.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$2$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return NetworkingLinkSignupViewModel.C09332.C01522.AnonymousClass1.invokeSuspend$lambda$0(str, (NetworkingLinkSignupState) obj2);
                            }
                        });
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final NetworkingLinkSignupState invokeSuspend$lambda$0(String str, NetworkingLinkSignupState networkingLinkSignupState) {
                    return NetworkingLinkSignupState.copy$default(networkingLinkSignupState, null, null, str, null, null, null, false, 123, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (FlowKt.collectLatest(this.this$0.validFormFieldState(this.$payload.getPhoneController()), new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    private final void observePayloadResult() {
        onAsync(new PropertyReference1Impl() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel.observePayloadResult.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            public Object get(Object obj) {
                return ((NetworkingLinkSignupState) obj).getPayload();
            }
        }, new C09332(null), new C09343(null));
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "error", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$3", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$observePayloadResult$3, reason: invalid class name and case insensitive filesystem */
    static final class C09343 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C09343(Continuation<? super C09343> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C09343 c09343 = NetworkingLinkSignupViewModel.this.new C09343(continuation);
            c09343.L$0 = obj;
            return c09343;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
            return ((C09343) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FinancialConnectionsAnalyticsTrackerKt.logError(NetworkingLinkSignupViewModel.this.eventTracker, "Error fetching payload", (Throwable) this.L$0, NetworkingLinkSignupViewModel.this.logger, NetworkingLinkSignupViewModel.this.getPane());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEmailEntered(final String validEmail) {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkingLinkSignupViewModel.onEmailEntered$lambda$1(validEmail, (NetworkingLinkSignupState) obj);
            }
        });
        if (validEmail != null) {
            this.logger.debug("VALID EMAIL ADDRESS " + validEmail + ".");
            this.searchJob.plusAssign(FinancialConnectionsViewModel.execute$default(this, new C09392(validEmail, null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetworkingLinkSignupViewModel.onEmailEntered$lambda$2((NetworkingLinkSignupState) obj, (Async) obj2);
                }
            }, 1, null));
        } else {
            setState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkingLinkSignupViewModel.onEmailEntered$lambda$3((NetworkingLinkSignupState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState onEmailEntered$lambda$1(String str, NetworkingLinkSignupState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return NetworkingLinkSignupState.copy$default(setState, null, str, null, null, null, null, false, 125, null);
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/model/ConsumerSessionLookup;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onEmailEntered$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {JfifUtil.MARKER_SOI, JfifUtil.MARKER_SOS}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onEmailEntered$2, reason: invalid class name and case insensitive filesystem */
    static final class C09392 extends SuspendLambda implements Function1<Continuation<? super ConsumerSessionLookup>, Object> {
        final /* synthetic */ String $validEmail;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09392(String str, Continuation<? super C09392> continuation) {
            super(1, continuation);
            this.$validEmail = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkSignupViewModel.this.new C09392(this.$validEmail, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ConsumerSessionLookup> continuation) {
            return ((C09392) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String sessionId;
            PhoneNumberController phoneController;
            PhoneNumberController phoneController2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.delay(NetworkingLinkSignupViewModel.this.getLookupDelayMs(this.$validEmail), this) != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            NetworkingLinkSignupState.Payload payloadInvoke = NetworkingLinkSignupViewModel.this.getStateFlow().getValue().getPayload().invoke();
            LookupAccount lookupAccount = NetworkingLinkSignupViewModel.this.lookupAccount;
            FinancialConnectionsSessionManifest.Pane pane = NetworkingLinkSignupViewModel.this.getPane();
            String localNumber = (payloadInvoke == null || (phoneController2 = payloadInvoke.getPhoneController()) == null) ? null : phoneController2.getLocalNumber();
            String countryCode = (payloadInvoke == null || (phoneController = payloadInvoke.getPhoneController()) == null) ? null : phoneController.getCountryCode();
            EmailSource emailSource = Intrinsics.areEqual(payloadInvoke != null ? payloadInvoke.getPrefilledEmail() : null, this.$validEmail) ? EmailSource.CUSTOMER_OBJECT : EmailSource.USER_ACTION;
            if (payloadInvoke == null || (sessionId = payloadInvoke.getSessionId()) == null) {
                sessionId = "";
            }
            String str = sessionId;
            boolean z = payloadInvoke != null && payloadInvoke.getAppVerificationEnabled();
            this.label = 2;
            Object objInvoke = lookupAccount.invoke(this.$validEmail, localNumber, countryCode, emailSource, z, str, pane, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState onEmailEntered$lambda$2(NetworkingLinkSignupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        if (MavericksExtensionsKt.isCancellationError(it)) {
            it = Async.Uninitialized.INSTANCE;
        }
        return NetworkingLinkSignupState.copy$default(execute, null, null, null, null, it, null, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState onEmailEntered$lambda$3(NetworkingLinkSignupState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return NetworkingLinkSignupState.copy$default(setState, null, null, null, null, Async.Uninitialized.INSTANCE, null, false, 111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getLookupDelayMs(String validEmail) {
        if (StringsKt.endsWith$default(validEmail, ".com", false, 2, (Object) null)) {
            return SEARCH_DEBOUNCE_FINISHED_EMAIL_MS;
        }
        return 1000L;
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onSkipClick$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onSkipClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C09401(Continuation<? super C09401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkingLinkSignupViewModel.this.new C09401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                NetworkingLinkSignupViewModel.this.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.not_now", NetworkingLinkSignupViewModel.this.getPane()));
                NavigationManager.DefaultImpls.tryNavigateTo$default(NetworkingLinkSignupViewModel.this.navigationManager, Destination.invoke$default(Destination.Success.INSTANCE, NetworkingLinkSignupViewModel.this.getPane(), null, 2, null), null, false, 6, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Job onSkipClick() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09401(null), 3, null);
    }

    public final void onSaveAccount() {
        withState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkingLinkSignupViewModel.onSaveAccount$lambda$4(this.f$0, (NetworkingLinkSignupState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSaveAccount$lambda$4(NetworkingLinkSignupViewModel networkingLinkSignupViewModel, NetworkingLinkSignupState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click("click.save_to_link", networkingLinkSignupViewModel.getPane()));
        ConsumerSessionLookup consumerSessionLookupInvoke = state.getLookupAccount().invoke();
        if (consumerSessionLookupInvoke != null && consumerSessionLookupInvoke.getExists()) {
            networkingLinkSignupViewModel.navigateToLinkVerification();
        } else {
            networkingLinkSignupViewModel.saveNewAccount();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$saveNewAccount$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$saveNewAccount$1, reason: invalid class name and case insensitive filesystem */
    static final class C09411 extends SuspendLambda implements Function1<Continuation<? super FinancialConnectionsSessionManifest.Pane>, Object> {
        int label;

        C09411(Continuation<? super C09411> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return NetworkingLinkSignupViewModel.this.new C09411(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation) {
            return ((C09411) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            NetworkingLinkSignupState value = NetworkingLinkSignupViewModel.this.getStateFlow().getValue();
            this.label = 1;
            Object objPerformSignup = NetworkingLinkSignupViewModel.this.linkSignupHandler.performSignup(value, this);
            return objPerformSignup == coroutine_suspended ? coroutine_suspended : objPerformSignup;
        }
    }

    private final void saveNewAccount() {
        FinancialConnectionsViewModel.execute$default(this, new C09411(null), null, new Function2() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NetworkingLinkSignupViewModel.saveNewAccount$lambda$5((NetworkingLinkSignupState) obj, (Async) obj2);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState saveNewAccount$lambda$5(NetworkingLinkSignupState execute, Async it) {
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        Intrinsics.checkNotNullParameter(it, "it");
        return NetworkingLinkSignupState.copy$default(execute, null, null, null, it, null, null, false, 119, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToLinkVerification() {
        this.linkSignupHandler.navigateToVerification();
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1, reason: invalid class name and case insensitive filesystem */
    static final class C09381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $uri;
        int label;

        /* compiled from: NetworkingLinkSignupViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkingLinkSignupClickableText.values().length];
                try {
                    iArr[NetworkingLinkSignupClickableText.LEGAL_DETAILS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C09381(String str, Continuation<? super C09381> continuation) {
            super(2, continuation);
            this.$uri = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return NetworkingLinkSignupViewModel.this.new C09381(this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C09381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NetworkingLinkSignupClickableText next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String queryParameter = NetworkingLinkSignupViewModel.this.uriUtils.getQueryParameter(this.$uri, HandleClickableUrl.ClickableLinkParameters.EVENT_NAME);
                if (queryParameter != null) {
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel = NetworkingLinkSignupViewModel.this;
                    networkingLinkSignupViewModel.eventTracker.track(new FinancialConnectionsAnalyticsEvent.Click(queryParameter, networkingLinkSignupViewModel.getPane()));
                }
                final Date date = new Date();
                if (URLUtil.isNetworkUrl(this.$uri)) {
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel2 = NetworkingLinkSignupViewModel.this;
                    final String str = this.$uri;
                    networkingLinkSignupViewModel2.setState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$onClickableTextClick$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return NetworkingLinkSignupViewModel.C09381.invokeSuspend$lambda$1(str, date, (NetworkingLinkSignupState) obj2);
                        }
                    });
                } else {
                    EnumEntries<NetworkingLinkSignupClickableText> entries = NetworkingLinkSignupClickableText.getEntries();
                    NetworkingLinkSignupViewModel networkingLinkSignupViewModel3 = NetworkingLinkSignupViewModel.this;
                    String str2 = this.$uri;
                    Iterator<NetworkingLinkSignupClickableText> it = entries.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (networkingLinkSignupViewModel3.uriUtils.compareSchemeAuthorityAndPath(next.getValue(), str2)) {
                            break;
                        }
                    }
                    NetworkingLinkSignupClickableText networkingLinkSignupClickableText = next;
                    int i = networkingLinkSignupClickableText == null ? -1 : WhenMappings.$EnumSwitchMapping$0[networkingLinkSignupClickableText.ordinal()];
                    if (i == -1) {
                        Logger.DefaultImpls.error$default(NetworkingLinkSignupViewModel.this.logger, "Unrecognized clickable text: " + this.$uri, null, 2, null);
                    } else if (i == 1) {
                        NetworkingLinkSignupViewModel.this.presentLegalDetailsBottomSheet();
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NetworkingLinkSignupState invokeSuspend$lambda$1(String str, Date date, NetworkingLinkSignupState networkingLinkSignupState) {
            return NetworkingLinkSignupState.copy$default(networkingLinkSignupState, null, null, null, null, null, new NetworkingLinkSignupState.ViewEffect.OpenUrl(str, date.getTime()), false, 95, null);
        }
    }

    public final Job onClickableTextClick(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C09381(uri, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void presentLegalDetailsBottomSheet() {
        NetworkingLinkSignupState.Content content;
        LegalDetailsNotice legalDetailsNotice;
        NetworkingLinkSignupState.Payload payloadInvoke = getStateFlow().getValue().getPayload().invoke();
        if (payloadInvoke == null || (content = payloadInvoke.getContent()) == null || (legalDetailsNotice = content.getLegalDetailsNotice()) == null) {
            return;
        }
        this.presentSheet.invoke(new NoticeSheetState.NoticeSheetContent.Legal(legalDetailsNotice), getPane());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow<String> validFormFieldState(InputController inputController) {
        final StateFlow<FormFieldEntry> formFieldValue = inputController.getFormFieldValue();
        return FlowKt.stateIn(new Flow<String>() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2", f = "NetworkingLinkSignupViewModel.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
                /* renamed from: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$validFormFieldState$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = anonymousClass1.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        FormFieldEntry formFieldEntry = (FormFieldEntry) obj;
                        if (!formFieldEntry.isComplete()) {
                            formFieldEntry = null;
                        }
                        String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                Object objCollect = formFieldValue.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkingLinkSignupState onViewEffectLaunched$lambda$8(NetworkingLinkSignupState setState) {
        Intrinsics.checkNotNullParameter(setState, "$this$setState");
        return NetworkingLinkSignupState.copy$default(setState, null, null, null, null, null, null, false, 95, null);
    }

    public final void onViewEffectLaunched() {
        setState(new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkingLinkSignupViewModel.onViewEffectLaunched$lambda$8((NetworkingLinkSignupState) obj);
            }
        });
    }

    /* compiled from: NetworkingLinkSignupViewModel.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "parentComponent", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSheetNativeComponent;", "SEARCH_DEBOUNCE_MS", "", "SEARCH_DEBOUNCE_FINISHED_EMAIL_MS", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final NetworkingLinkSignupViewModel factory$lambda$1$lambda$0(FinancialConnectionsSheetNativeComponent financialConnectionsSheetNativeComponent, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            return financialConnectionsSheetNativeComponent.getNetworkingLinkSignupViewModelFactory().create(new NetworkingLinkSignupState(financialConnectionsSheetNativeComponent.getViewModel().getStateFlow().getValue()));
        }

        public final ViewModelProvider.Factory factory(final FinancialConnectionsSheetNativeComponent parentComponent) {
            Intrinsics.checkNotNullParameter(parentComponent, "parentComponent");
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(NetworkingLinkSignupViewModel.class), new Function1() { // from class: com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NetworkingLinkSignupViewModel.Companion.factory$lambda$1$lambda$0(parentComponent, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
