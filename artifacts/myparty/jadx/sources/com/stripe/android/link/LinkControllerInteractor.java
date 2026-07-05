package com.stripe.android.link;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkController;
import com.stripe.android.link.LinkControllerInteractor;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAuth;
import com.stripe.android.link.account.LinkAuthResult;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.DefaultLinkConfirmationHandlerKt;
import com.stripe.android.link.exceptions.AppAttestationException;
import com.stripe.android.link.exceptions.MissingConfigurationException;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.model.AccountStatusKt;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.link.ui.wallet.PaymentDetailsNicknameKt;
import com.stripe.android.model.EmailSource;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.SharePaymentDetails;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.state.LinkState;
import com.stripe.android.uicore.utils.StateFlowsKt;
import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.json.JSONObject;

/* compiled from: LinkControllerInteractor.kt */
@Singleton
@Metadata(d1 = {"\u0000\u008e\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001mB/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00102\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J*\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\b\u00100\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u000eJ\u001e\u00102\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\b\u00100\u001a\u0004\u0018\u00010\u000eJ\u001c\u00103\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020\u000eJ(\u00104\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\b\u00100\u001a\u0004\u0018\u00010\u000e2\u0006\u00105\u001a\u000206H\u0002J:\u00107\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010\u000e2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,092\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020,09H\u0002J\u000e\u0010=\u001a\u00020,2\u0006\u0010>\u001a\u00020?J\u0012\u0010@\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010A\u001a\u00020,2\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0010\u0010D\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010E\u001a\u00020,2\u0006\u0010>\u001a\u00020?H\u0002J\u0016\u0010F\u001a\u00020G2\u0006\u00100\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010HJ\u000e\u0010I\u001a\u00020JH\u0086@¢\u0006\u0002\u0010KJ0\u0010L\u001a\u00020M2\u0006\u00100\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u000e2\b\u0010P\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0002\u0010QJ\u001f\u0010R\u001a\b\u0012\u0004\u0012\u00020T0S2\b\b\u0002\u0010\"\u001a\u00020\u0016H\u0002¢\u0006\u0004\bU\u0010VJp\u0010W\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\b\u00100\u001a\u0004\u0018\u00010\u000e2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020,092:\u0010Y\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b[\u0012\b\bP\u0012\u0004\b\b(\\\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b[\u0012\b\bP\u0012\u0004\b\b(\"\u0012\u0006\u0012\u0004\u0018\u00010]0ZH\u0002J\u0016\u0010^\u001a\b\u0012\u0004\u0012\u00020_0SH\u0082@¢\u0006\u0004\b`\u0010KJ\u0014\u0010a\u001a\u00020b*\u00020c2\u0006\u0010$\u001a\u00020%H\u0002J\u0019\u0010d\u001a\b\u0012\u0004\u0012\u00020,0S*\u00020eH\u0002¢\u0006\u0004\bf\u0010gJ\u001b\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110S*\u00020hH\u0002¢\u0006\u0004\bf\u0010iJ!\u0010j\u001a\u00020,2\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001609H\u0001¢\u0006\u0002\blR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001d¨\u0006n"}, d2 = {"Lcom/stripe/android/link/LinkControllerInteractor;", "", "logger", "Lcom/stripe/android/core/Logger;", "linkConfigurationLoader", "Lcom/stripe/android/link/LinkConfigurationLoader;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "linkComponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/link/injection/LinkComponent$Builder;", "<init>", "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/link/LinkConfigurationLoader;Lcom/stripe/android/link/account/LinkAccountHolder;Ljavax/inject/Provider;)V", "tag", "", "_account", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/link/model/LinkAccount;", "_internalLinkAccount", "Lcom/stripe/android/link/LinkController$LinkAccount;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/LinkControllerInteractor$State;", "_presentPaymentMethodsResultFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/link/LinkController$PresentPaymentMethodsResult;", "presentPaymentMethodsResultFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getPresentPaymentMethodsResultFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "_authenticationResultFlow", "Lcom/stripe/android/link/LinkController$AuthenticationResult;", "authenticationResultFlow", "getAuthenticationResultFlow", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/LinkController$State;", "context", "Landroid/content/Context;", "configure", "Lcom/stripe/android/link/LinkController$ConfigureResult;", "configuration", "Lcom/stripe/android/link/LinkController$Configuration;", "(Lcom/stripe/android/link/LinkController$Configuration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentPaymentMethods", "", "launcher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/link/LinkActivityContract$Args;", "email", ViewHierarchyConstants.HINT_KEY, "authenticate", "authenticateExistingConsumer", "performAuthentication", "existingOnly", "", "withConfiguration", "onError", "Lkotlin/Function1;", "", "onSuccess", "Lcom/stripe/android/link/LinkConfiguration;", "onLinkActivityResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/link/LinkActivityResult;", "updateStateOnNewEmail", "updateStateOnAccountUpdate", "update", "Lcom/stripe/android/link/LinkAccountUpdate;", "handlePaymentMethodSelectionResult", "handleAuthenticationResult", "lookupConsumer", "Lcom/stripe/android/link/LinkController$LookupConsumerResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createPaymentMethod", "Lcom/stripe/android/link/LinkController$CreatePaymentMethodResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerConsumer", "Lcom/stripe/android/link/LinkController$RegisterConsumerResult;", "phone", "country", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireLinkComponent", "Lkotlin/Result;", "Lcom/stripe/android/link/injection/LinkComponent;", "requireLinkComponent-IoAF18A", "(Lcom/stripe/android/link/LinkControllerInteractor$State;)Ljava/lang/Object;", "present", "onConfigurationError", "getLaunchMode", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "linkAccount", "Lcom/stripe/android/link/LinkLaunchMode;", "performCreatePaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "performCreatePaymentMethod-IoAF18A", "toPreview", "Lcom/stripe/android/link/LinkController$PaymentMethodPreview;", "Lcom/stripe/android/link/LinkPaymentMethod;", "toResult", "Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;", "toResult-IoAF18A", "(Lcom/stripe/android/link/attestation/LinkAttestationCheck$Result;)Ljava/lang/Object;", "Lcom/stripe/android/link/account/LinkAuthResult;", "(Lcom/stripe/android/link/account/LinkAuthResult;)Ljava/lang/Object;", "updateState", "block", "updateState$paymentsheet_release", "State", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkControllerInteractor {
    public static final int $stable = 8;
    private final StateFlow<LinkAccount> _account;
    private final MutableSharedFlow<LinkController.AuthenticationResult> _authenticationResultFlow;
    private final StateFlow<LinkController.LinkAccount> _internalLinkAccount;
    private final MutableSharedFlow<LinkController.PresentPaymentMethodsResult> _presentPaymentMethodsResultFlow;
    private final MutableStateFlow<State> _state;
    private final SharedFlow<LinkController.AuthenticationResult> authenticationResultFlow;
    private final LinkAccountHolder linkAccountHolder;
    private final Provider<LinkComponent.Builder> linkComponentBuilderProvider;
    private final LinkConfigurationLoader linkConfigurationLoader;
    private final Logger logger;
    private final SharedFlow<LinkController.PresentPaymentMethodsResult> presentPaymentMethodsResultFlow;
    private final String tag;

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkState.LoginState.values().length];
            try {
                iArr[LinkState.LoginState.LoggedOut.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkState.LoginState.NeedsVerification.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkState.LoginState.LoggedIn.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkControllerInteractor", f = "LinkControllerInteractor.kt", i = {0, 1, 1}, l = {90, 95}, m = "configure", n = {"this", "this", "component"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.stripe.android.link.LinkControllerInteractor$configure$1, reason: invalid class name */
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
            return LinkControllerInteractor.this.configure(null, this);
        }
    }

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkControllerInteractor", f = "LinkControllerInteractor.kt", i = {0}, l = {TypedValues.AttributesType.TYPE_EASING}, m = "createPaymentMethod", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkControllerInteractor$createPaymentMethod$1, reason: invalid class name and case insensitive filesystem */
    static final class C10321 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10321(Continuation<? super C10321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkControllerInteractor.this.createPaymentMethod(this);
        }
    }

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkControllerInteractor", f = "LinkControllerInteractor.kt", i = {0}, l = {301}, m = "lookupConsumer", n = {"email"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkControllerInteractor$lookupConsumer$1, reason: invalid class name and case insensitive filesystem */
    static final class C10331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10331(Continuation<? super C10331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkControllerInteractor.this.lookupConsumer(null, this);
        }
    }

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkControllerInteractor", f = "LinkControllerInteractor.kt", i = {0}, l = {333}, m = "registerConsumer", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkControllerInteractor$registerConsumer$1, reason: invalid class name and case insensitive filesystem */
    static final class C10341 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C10341(Continuation<? super C10341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkControllerInteractor.this.registerConsumer(null, null, null, null, this);
        }
    }

    @Inject
    public LinkControllerInteractor(Logger logger, LinkConfigurationLoader linkConfigurationLoader, LinkAccountHolder linkAccountHolder, Provider<LinkComponent.Builder> linkComponentBuilderProvider) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(linkConfigurationLoader, "linkConfigurationLoader");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(linkComponentBuilderProvider, "linkComponentBuilderProvider");
        this.logger = logger;
        this.linkConfigurationLoader = linkConfigurationLoader;
        this.linkAccountHolder = linkAccountHolder;
        this.linkComponentBuilderProvider = linkComponentBuilderProvider;
        this.tag = "LinkControllerViewInteractor";
        StateFlow<LinkAccount> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(linkAccountHolder.getLinkAccountInfo(), new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor._account$lambda$0((LinkAccountUpdate.Value) obj);
            }
        });
        this._account = stateFlowMapAsStateFlow;
        this._internalLinkAccount = StateFlowsKt.mapAsStateFlow(stateFlowMapAsStateFlow, new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor._internalLinkAccount$lambda$2((LinkAccount) obj);
            }
        });
        this._state = StateFlowKt.MutableStateFlow(new State(null, null, null, null, null, 31, null));
        MutableSharedFlow<LinkController.PresentPaymentMethodsResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._presentPaymentMethodsResultFlow = mutableSharedFlowMutableSharedFlow$default;
        this.presentPaymentMethodsResultFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<LinkController.AuthenticationResult> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this._authenticationResultFlow = mutableSharedFlowMutableSharedFlow$default2;
        this.authenticationResultFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkAccount _account$lambda$0(LinkAccountUpdate.Value it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getAccount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkController.LinkAccount _internalLinkAccount$lambda$2(LinkAccount linkAccount) {
        LinkController.SessionState sessionState;
        if (linkAccount == null) {
            return null;
        }
        String email = linkAccount.getEmail();
        String redactedPhoneNumber = linkAccount.getRedactedPhoneNumber();
        int i = WhenMappings.$EnumSwitchMapping$0[AccountStatusKt.toLoginState(linkAccount.getAccountStatus()).ordinal()];
        if (i == 1) {
            sessionState = LinkController.SessionState.LoggedOut;
        } else if (i == 2) {
            sessionState = LinkController.SessionState.NeedsVerification;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sessionState = LinkController.SessionState.LoggedIn;
        }
        return new LinkController.LinkAccount(email, redactedPhoneNumber, sessionState, linkAccount.getClientSecret());
    }

    public final SharedFlow<LinkController.PresentPaymentMethodsResult> getPresentPaymentMethodsResultFlow() {
        return this.presentPaymentMethodsResultFlow;
    }

    public final SharedFlow<LinkController.AuthenticationResult> getAuthenticationResultFlow() {
        return this.authenticationResultFlow;
    }

    public final StateFlow<LinkController.State> state(final Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StateFlowsKt.combineAsStateFlow(this._internalLinkAccount, this._state, new Function2() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkControllerInteractor.state$lambda$3(this.f$0, context, (LinkController.LinkAccount) obj, (LinkControllerInteractor.State) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkController.State state$lambda$3(LinkControllerInteractor linkControllerInteractor, Context context, LinkController.LinkAccount linkAccount, State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LinkPaymentMethod selectedPaymentMethod = state.getSelectedPaymentMethod();
        return new LinkController.State(linkAccount, selectedPaymentMethod != null ? linkControllerInteractor.toPreview(selectedPaymentMethod, context) : null, state.getCreatedPaymentMethod());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c2 A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:30:0x00b6, B:32:0x00c2, B:34:0x00cf, B:33:0x00cb), top: B:47:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb A[Catch: all -> 0x003a, TryCatch #1 {all -> 0x003a, blocks: (B:13:0x0035, B:30:0x00b6, B:32:0x00c2, B:34:0x00cf, B:33:0x00cb), top: B:47:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object configure(LinkController.Configuration configuration, Continuation<? super LinkController.ConfigureResult> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo7675loadgIAlus;
        LinkControllerInteractor linkControllerInteractor;
        LinkControllerInteractor linkControllerInteractor2;
        Throwable th;
        LinkComponent linkComponentBuild;
        Object objInvoke;
        LinkComponent linkComponent;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        Object objM7694toResultIoAF18A;
        Object objM9118constructorimpl2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.logger.debug(this.tag + ": updating configuration");
            updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return LinkControllerInteractor.configure$lambda$4((LinkControllerInteractor.State) obj2);
                }
            });
            LinkConfigurationLoader linkConfigurationLoader = this.linkConfigurationLoader;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objMo7675loadgIAlus = linkConfigurationLoader.mo7675loadgIAlus(configuration, anonymousClass1);
            if (objMo7675loadgIAlus != coroutine_suspended) {
                linkControllerInteractor = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkControllerInteractor = (LinkControllerInteractor) anonymousClass1.L$2;
            linkComponent = (LinkComponent) anonymousClass1.L$1;
            linkControllerInteractor2 = (LinkControllerInteractor) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                objM7694toResultIoAF18A = linkControllerInteractor.m7694toResultIoAF18A((LinkAttestationCheck.Result) obj);
                if (Result.m9125isSuccessimpl(objM7694toResultIoAF18A)) {
                    objM9118constructorimpl2 = Result.m9118constructorimpl(objM7694toResultIoAF18A);
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    objM9118constructorimpl2 = Result.m9118constructorimpl(linkComponent);
                }
                ResultKt.throwOnFailure(objM9118constructorimpl2);
                objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl == null) {
                final LinkComponent linkComponent2 = (LinkComponent) objM9118constructorimpl;
                linkControllerInteractor2.updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LinkControllerInteractor.configure$lambda$8$lambda$7(linkComponent2, (LinkControllerInteractor.State) obj2);
                    }
                });
                return LinkController.ConfigureResult.Success.INSTANCE;
            }
            return new LinkController.ConfigureResult.Failed(thM9121exceptionOrNullimpl);
        }
        linkControllerInteractor = (LinkControllerInteractor) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj);
        objMo7675loadgIAlus = ((Result) obj).getValue();
        if (Result.m9125isSuccessimpl(objMo7675loadgIAlus)) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                linkComponentBuild = linkControllerInteractor.linkComponentBuilderProvider.get().configuration((LinkConfiguration) objMo7675loadgIAlus).build();
                LinkAttestationCheck linkAttestationCheck$paymentsheet_release = linkComponentBuild.getLinkAttestationCheck$paymentsheet_release();
                anonymousClass1.L$0 = linkControllerInteractor;
                anonymousClass1.L$1 = linkComponentBuild;
                anonymousClass1.L$2 = linkControllerInteractor;
                anonymousClass1.label = 2;
                objInvoke = linkAttestationCheck$paymentsheet_release.invoke(anonymousClass1);
            } catch (Throwable th3) {
                linkControllerInteractor2 = linkControllerInteractor;
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            if (objInvoke != coroutine_suspended) {
                linkComponent = linkComponentBuild;
                obj = objInvoke;
                linkControllerInteractor2 = linkControllerInteractor;
                objM7694toResultIoAF18A = linkControllerInteractor.m7694toResultIoAF18A((LinkAttestationCheck.Result) obj);
                if (Result.m9125isSuccessimpl(objM7694toResultIoAF18A)) {
                }
                ResultKt.throwOnFailure(objM9118constructorimpl2);
                objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
            return coroutine_suspended;
        }
        linkControllerInteractor2 = linkControllerInteractor;
        objM9118constructorimpl = Result.m9118constructorimpl(objMo7675loadgIAlus);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State configure$lambda$4(State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new State(null, null, null, null, null, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State configure$lambda$8$lambda$7(LinkComponent linkComponent, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, linkComponent, null, null, null, null, 30, null);
    }

    public static /* synthetic */ void presentPaymentMethods$default(LinkControllerInteractor linkControllerInteractor, ActivityResultLauncher activityResultLauncher, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        linkControllerInteractor.presentPaymentMethods(activityResultLauncher, str, str2);
    }

    public final void presentPaymentMethods(ActivityResultLauncher<LinkActivityContract.Args> launcher, String email, final String hint) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        present(launcher, email, new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.presentPaymentMethods$lambda$10(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkControllerInteractor.presentPaymentMethods$lambda$11(hint, (LinkAccount) obj, (LinkControllerInteractor.State) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit presentPaymentMethods$lambda$10(LinkControllerInteractor linkControllerInteractor, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        linkControllerInteractor._presentPaymentMethodsResultFlow.tryEmit(new LinkController.PresentPaymentMethodsResult.Failed(error));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkLaunchMode presentPaymentMethods$lambda$11(String str, LinkAccount linkAccount, State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        LinkPaymentMethod selectedPaymentMethod = state.getSelectedPaymentMethod();
        return new LinkLaunchMode.PaymentMethodSelection(selectedPaymentMethod != null ? selectedPaymentMethod.getDetails() : null, false, str);
    }

    public final void authenticate(ActivityResultLauncher<LinkActivityContract.Args> launcher, String email) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        performAuthentication(launcher, email, false);
    }

    public final void authenticateExistingConsumer(ActivityResultLauncher<LinkActivityContract.Args> launcher, String email) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(email, "email");
        performAuthentication(launcher, email, true);
    }

    private final void performAuthentication(ActivityResultLauncher<LinkActivityContract.Args> launcher, String email, final boolean existingOnly) {
        present(launcher, email, new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.performAuthentication$lambda$12(this.f$0, (Throwable) obj);
            }
        }, new Function2() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return LinkControllerInteractor.performAuthentication$lambda$13(this.f$0, existingOnly, (LinkAccount) obj, (LinkControllerInteractor.State) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performAuthentication$lambda$12(LinkControllerInteractor linkControllerInteractor, Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        linkControllerInteractor._authenticationResultFlow.tryEmit(new LinkController.AuthenticationResult.Failed(error));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkLaunchMode performAuthentication$lambda$13(LinkControllerInteractor linkControllerInteractor, boolean z, LinkAccount linkAccount, State state) {
        Intrinsics.checkNotNullParameter(state, "<unused var>");
        if (linkAccount != null && linkAccount.getIsVerified()) {
            linkControllerInteractor.logger.debug(linkControllerInteractor.tag + ": account is already verified, skipping authentication");
            linkControllerInteractor._authenticationResultFlow.tryEmit(LinkController.AuthenticationResult.Success.INSTANCE);
            return null;
        }
        return new LinkLaunchMode.Authentication(z);
    }

    private final void withConfiguration(String email, Function1<? super Throwable, Unit> onError, Function1<? super LinkConfiguration, Unit> onSuccess) {
        Object objM9118constructorimpl;
        LinkConfiguration linkConfigurationCopy$default;
        Object objM7692requireLinkComponentIoAF18A$default = m7692requireLinkComponentIoAF18A$default(this, null, 1, null);
        if (Result.m9125isSuccessimpl(objM7692requireLinkComponentIoAF18A$default)) {
            Result.Companion companion = Result.INSTANCE;
            objM7692requireLinkComponentIoAF18A$default = ((LinkComponent) objM7692requireLinkComponentIoAF18A$default).getConfiguration$paymentsheet_release();
        }
        Object objM9118constructorimpl2 = Result.m9118constructorimpl(objM7692requireLinkComponentIoAF18A$default);
        if (Result.m9125isSuccessimpl(objM9118constructorimpl2)) {
            Result.Companion companion2 = Result.INSTANCE;
            LinkConfiguration linkConfiguration = (LinkConfiguration) objM9118constructorimpl2;
            if (email != null && (linkConfigurationCopy$default = LinkConfiguration.copy$default(linkConfiguration, null, null, null, LinkConfiguration.CustomerInfo.copy$default(linkConfiguration.getCustomerInfo(), null, email, null, null, 13, null), null, false, null, null, null, null, null, null, false, false, false, null, null, null, false, null, false, false, false, false, null, false, false, null, 268435447, null)) != null) {
                linkConfiguration = linkConfigurationCopy$default;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(linkConfiguration);
        } else {
            objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            onSuccess.invoke((LinkConfiguration) objM9118constructorimpl);
        } else {
            onError.invoke(thM9121exceptionOrNullimpl);
        }
    }

    public final void onLinkActivityResult(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        LinkLaunchMode currentLaunchMode = this._state.getValue().getCurrentLaunchMode();
        updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.onLinkActivityResult$lambda$19((LinkControllerInteractor.State) obj);
            }
        });
        updateStateOnAccountUpdate(result.getLinkAccountUpdate());
        if (currentLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) {
            handlePaymentMethodSelectionResult(result);
        } else {
            if (currentLaunchMode instanceof LinkLaunchMode.Authentication) {
                handleAuthenticationResult(result);
                return;
            }
            this.logger.warning(this.tag + ": unexpected result for launch mode: " + currentLaunchMode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State onLinkActivityResult$lambda$19(State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, null, null, null, null, null, 15, null);
    }

    private final void updateStateOnNewEmail(final String email) {
        LinkAccount value = this._account.getValue();
        String email2 = value != null ? value.getEmail() : null;
        final boolean z = Intrinsics.areEqual(email, this._state.getValue().getEmailInput()) || email2 == null || Intrinsics.areEqual(email, email2);
        if (!z) {
            this.linkAccountHolder.set(new LinkAccountUpdate.Value(null, null, 2, null));
        }
        updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.updateStateOnNewEmail$lambda$22(email, z, (LinkControllerInteractor.State) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State updateStateOnNewEmail$lambda$22(String str, boolean z, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, null, str, z ? it.getSelectedPaymentMethod() : null, z ? it.getCreatedPaymentMethod() : null, null, 17, null);
    }

    private final void updateStateOnAccountUpdate(LinkAccountUpdate update) {
        if (update instanceof LinkAccountUpdate.Value) {
            LinkAccount value = this._account.getValue();
            String email = value != null ? value.getEmail() : null;
            LinkAccountUpdate.Value value2 = (LinkAccountUpdate.Value) update;
            LinkAccount account = value2.getAccount();
            final boolean z = email == null || Intrinsics.areEqual(account != null ? account.getEmail() : null, email);
            this.linkAccountHolder.set(value2);
            updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkControllerInteractor.updateStateOnAccountUpdate$lambda$25(z, (LinkControllerInteractor.State) obj);
                }
            });
            return;
        }
        if (!(update instanceof LinkAccountUpdate.None) && update != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State updateStateOnAccountUpdate$lambda$25(boolean z, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, null, null, z ? it.getSelectedPaymentMethod() : null, z ? it.getCreatedPaymentMethod() : null, null, 19, null);
    }

    private final void handlePaymentMethodSelectionResult(final LinkActivityResult result) {
        if (result instanceof LinkActivityResult.Canceled) {
            this.logger.debug(this.tag + ": presentPaymentMethods canceled");
            this._presentPaymentMethodsResultFlow.tryEmit(LinkController.PresentPaymentMethodsResult.Canceled.INSTANCE);
            return;
        }
        if (result instanceof LinkActivityResult.Completed) {
            Logger logger = this.logger;
            String str = this.tag;
            LinkPaymentMethod selectedPayment = ((LinkActivityResult.Completed) result).getSelectedPayment();
            logger.debug(str + ": presentPaymentMethods completed: details=" + (selectedPayment != null ? selectedPayment.getDetails() : null));
            updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkControllerInteractor.handlePaymentMethodSelectionResult$lambda$26(result, (LinkControllerInteractor.State) obj);
                }
            });
            this._presentPaymentMethodsResultFlow.tryEmit(LinkController.PresentPaymentMethodsResult.Success.INSTANCE);
            return;
        }
        if (result instanceof LinkActivityResult.Failed) {
            this.logger.debug(this.tag + ": presentPaymentMethods failed");
            this._presentPaymentMethodsResultFlow.tryEmit(new LinkController.PresentPaymentMethodsResult.Failed(((LinkActivityResult.Failed) result).getError()));
        } else {
            if (!(result instanceof LinkActivityResult.PaymentMethodObtained)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.warning(this.tag + ": presentPaymentMethods unexpected result: " + result);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State handlePaymentMethodSelectionResult$lambda$26(LinkActivityResult linkActivityResult, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, null, null, ((LinkActivityResult.Completed) linkActivityResult).getSelectedPayment(), null, null, 27, null);
    }

    private final void handleAuthenticationResult(LinkActivityResult result) {
        if (result instanceof LinkActivityResult.Canceled) {
            this.logger.debug(this.tag + ": authentication canceled");
            this._authenticationResultFlow.tryEmit(LinkController.AuthenticationResult.Canceled.INSTANCE);
            return;
        }
        if (result instanceof LinkActivityResult.Completed) {
            this.logger.debug(this.tag + ": authentication completed");
            this._authenticationResultFlow.tryEmit(LinkController.AuthenticationResult.Success.INSTANCE);
            return;
        }
        if (result instanceof LinkActivityResult.Failed) {
            this.logger.debug(this.tag + ": authentication failed");
            this._authenticationResultFlow.tryEmit(new LinkController.AuthenticationResult.Failed(((LinkActivityResult.Failed) result).getError()));
            return;
        }
        if (!(result instanceof LinkActivityResult.PaymentMethodObtained)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.warning(this.tag + ": authentication unexpected result: " + result);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lookupConsumer(String str, Continuation<? super LinkController.LookupConsumerResult> continuation) {
        C10331 c10331;
        String str2;
        Throwable th;
        String str3;
        LinkControllerInteractor linkControllerInteractor;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C10331) {
            c10331 = (C10331) continuation;
            if ((c10331.label & Integer.MIN_VALUE) != 0) {
                c10331.label -= Integer.MIN_VALUE;
            } else {
                c10331 = new C10331(continuation);
            }
        }
        C10331 c103312 = c10331;
        Object objLookUp = c103312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c103312.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(objLookUp);
            Object objM7692requireLinkComponentIoAF18A$default = m7692requireLinkComponentIoAF18A$default(this, null, 1, null);
            if (Result.m9125isSuccessimpl(objM7692requireLinkComponentIoAF18A$default)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LinkAuth linkAuth$paymentsheet_release = ((LinkComponent) objM7692requireLinkComponentIoAF18A$default).getLinkAuth$paymentsheet_release();
                    EmailSource emailSource = EmailSource.USER_ACTION;
                    c103312.L$0 = str;
                    c103312.L$1 = this;
                    c103312.label = 1;
                    str2 = str;
                    try {
                        objLookUp = linkAuth$paymentsheet_release.lookUp(str2, emailSource, false, null, c103312);
                        if (objLookUp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        linkControllerInteractor = this;
                        str3 = str2;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        str3 = str2;
                        Result.Companion companion2 = Result.INSTANCE;
                        objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                        if (thM9121exceptionOrNullimpl != null) {
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str;
                }
            } else {
                objM9118constructorimpl = Result.m9118constructorimpl(objM7692requireLinkComponentIoAF18A$default);
                str3 = str;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    return new LinkController.LookupConsumerResult.Success(str3, ((Boolean) objM9118constructorimpl).booleanValue());
                }
                return new LinkController.LookupConsumerResult.Failed(str3, thM9121exceptionOrNullimpl);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkControllerInteractor = (LinkControllerInteractor) c103312.L$1;
            str3 = (String) c103312.L$0;
            try {
                ResultKt.throwOnFailure(objLookUp);
            } catch (Throwable th4) {
                th = th4;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
            }
        }
        Object objM7693toResultIoAF18A = linkControllerInteractor.m7693toResultIoAF18A((LinkAuthResult) objLookUp);
        if (Result.m9125isSuccessimpl(objM7693toResultIoAF18A)) {
            Result.Companion companion3 = Result.INSTANCE;
            if (((LinkAccount) objM7693toResultIoAF18A) == null) {
                z = false;
            }
            objM7693toResultIoAF18A = Boxing.boxBoolean(z);
        }
        Object objM9118constructorimpl2 = Result.m9118constructorimpl(objM7693toResultIoAF18A);
        ResultKt.throwOnFailure(objM9118constructorimpl2);
        objM9118constructorimpl = Result.m9118constructorimpl(objM9118constructorimpl2);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethod(Continuation<? super LinkController.CreatePaymentMethodResult> continuation) {
        C10321 c10321;
        final Object objM7690performCreatePaymentMethodIoAF18A;
        LinkControllerInteractor linkControllerInteractor;
        if (continuation instanceof C10321) {
            c10321 = (C10321) continuation;
            if ((c10321.label & Integer.MIN_VALUE) != 0) {
                c10321.label -= Integer.MIN_VALUE;
            } else {
                c10321 = new C10321(continuation);
            }
        }
        Object obj = c10321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10321.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            c10321.L$0 = this;
            c10321.label = 1;
            objM7690performCreatePaymentMethodIoAF18A = m7690performCreatePaymentMethodIoAF18A(c10321);
            if (objM7690performCreatePaymentMethodIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            linkControllerInteractor = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkControllerInteractor = (LinkControllerInteractor) c10321.L$0;
            ResultKt.throwOnFailure(obj);
            objM7690performCreatePaymentMethodIoAF18A = ((Result) obj).getValue();
        }
        linkControllerInteractor.updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return LinkControllerInteractor.createPaymentMethod$lambda$31(objM7690performCreatePaymentMethodIoAF18A, (LinkControllerInteractor.State) obj2);
            }
        });
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7690performCreatePaymentMethodIoAF18A);
        if (thM9121exceptionOrNullimpl == null) {
            return LinkController.CreatePaymentMethodResult.Success.INSTANCE;
        }
        return new LinkController.CreatePaymentMethodResult.Failed(thM9121exceptionOrNullimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State createPaymentMethod$lambda$31(Object obj, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (Result.m9124isFailureimpl(obj)) {
            obj = null;
        }
        return State.copy$default(it, null, null, null, (PaymentMethod) obj, null, 23, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object registerConsumer(String str, String str2, String str3, String str4, Continuation<? super LinkController.RegisterConsumerResult> continuation) {
        C10341 c10341;
        Throwable th;
        LinkControllerInteractor linkControllerInteractor;
        LinkControllerInteractor linkControllerInteractor2;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C10341) {
            c10341 = (C10341) continuation;
            if ((c10341.label & Integer.MIN_VALUE) != 0) {
                c10341.label -= Integer.MIN_VALUE;
            } else {
                c10341 = new C10341(continuation);
            }
        }
        C10341 c103412 = c10341;
        Object objSignUp = c103412.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c103412.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objSignUp);
            Object objM7692requireLinkComponentIoAF18A$default = m7692requireLinkComponentIoAF18A$default(this, null, 1, null);
            if (Result.m9125isSuccessimpl(objM7692requireLinkComponentIoAF18A$default)) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LinkAuth linkAuth$paymentsheet_release = ((LinkComponent) objM7692requireLinkComponentIoAF18A$default).getLinkAuth$paymentsheet_release();
                    SignUpConsentAction signUpConsentAction = SignUpConsentAction.Implied;
                    c103412.L$0 = this;
                    c103412.L$1 = this;
                    c103412.label = 1;
                    objSignUp = linkAuth$paymentsheet_release.signUp(str, str2, str3, str4, signUpConsentAction, c103412);
                    if (objSignUp == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    linkControllerInteractor2 = this;
                    linkControllerInteractor = linkControllerInteractor2;
                } catch (Throwable th2) {
                    th = th2;
                    linkControllerInteractor = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                }
            } else {
                objM9118constructorimpl = Result.m9118constructorimpl(objM7692requireLinkComponentIoAF18A$default);
                linkControllerInteractor = this;
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    linkControllerInteractor.updateStateOnAccountUpdate(new LinkAccountUpdate.Value((LinkAccount) objM9118constructorimpl, null, 2, null));
                    return LinkController.RegisterConsumerResult.Success.INSTANCE;
                }
                linkControllerInteractor.updateStateOnAccountUpdate(new LinkAccountUpdate.Value(null, null, 2, null));
                return new LinkController.RegisterConsumerResult.Failed(thM9121exceptionOrNullimpl);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkControllerInteractor2 = (LinkControllerInteractor) c103412.L$1;
            linkControllerInteractor = (LinkControllerInteractor) c103412.L$0;
            try {
                ResultKt.throwOnFailure(objSignUp);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                }
            }
        }
        Object objM7693toResultIoAF18A = linkControllerInteractor2.m7693toResultIoAF18A((LinkAuthResult) objSignUp);
        ResultKt.throwOnFailure(objM7693toResultIoAF18A);
        objM9118constructorimpl = Result.m9118constructorimpl(objM7693toResultIoAF18A);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
        }
    }

    /* renamed from: requireLinkComponent-IoAF18A$default, reason: not valid java name */
    static /* synthetic */ Object m7692requireLinkComponentIoAF18A$default(LinkControllerInteractor linkControllerInteractor, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            state = linkControllerInteractor._state.getValue();
        }
        return linkControllerInteractor.m7691requireLinkComponentIoAF18A(state);
    }

    /* renamed from: requireLinkComponent-IoAF18A, reason: not valid java name */
    private final Object m7691requireLinkComponentIoAF18A(State state) {
        LinkComponent linkComponent = state.getLinkComponent();
        if (linkComponent != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(linkComponent);
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m9118constructorimpl(ResultKt.createFailure(new MissingConfigurationException()));
    }

    private final void present(final ActivityResultLauncher<LinkActivityContract.Args> launcher, final String email, Function1<? super Throwable, Unit> onConfigurationError, final Function2<? super LinkAccount, ? super State, ? extends LinkLaunchMode> getLaunchMode) {
        this.logger.debug(this.tag + ": presenting");
        withConfiguration(email, onConfigurationError, new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.present$lambda$39(this.f$0, email, getLaunchMode, launcher, (LinkConfiguration) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit present$lambda$39(LinkControllerInteractor linkControllerInteractor, final String str, Function2 function2, ActivityResultLauncher activityResultLauncher, LinkConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        linkControllerInteractor.updateStateOnNewEmail(str);
        final LinkLaunchMode linkLaunchMode = (LinkLaunchMode) function2.invoke(linkControllerInteractor._account.getValue(), linkControllerInteractor._state.getValue());
        if (linkLaunchMode == null) {
            return Unit.INSTANCE;
        }
        linkControllerInteractor.updateState$paymentsheet_release(new Function1() { // from class: com.stripe.android.link.LinkControllerInteractor$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LinkControllerInteractor.present$lambda$39$lambda$38(str, linkLaunchMode, (LinkControllerInteractor.State) obj);
            }
        });
        activityResultLauncher.launch(new LinkActivityContract.Args(configuration, LinkExpressMode.ENABLED, linkControllerInteractor.linkAccountHolder.getLinkAccountInfo().getValue(), linkLaunchMode));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State present$lambda$39$lambda$38(String str, LinkLaunchMode linkLaunchMode, State it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return State.copy$default(it, null, str, null, null, linkLaunchMode, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
    
        if (r8 == r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: performCreatePaymentMethod-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7690performCreatePaymentMethodIoAF18A(Continuation<? super Result<PaymentMethod>> continuation) {
        LinkControllerInteractor$performCreatePaymentMethod$1 linkControllerInteractor$performCreatePaymentMethod$1;
        Object objMo7718sharePaymentDetailsyxL6bBk;
        if (continuation instanceof LinkControllerInteractor$performCreatePaymentMethod$1) {
            linkControllerInteractor$performCreatePaymentMethod$1 = (LinkControllerInteractor$performCreatePaymentMethod$1) continuation;
            if ((linkControllerInteractor$performCreatePaymentMethod$1.label & Integer.MIN_VALUE) != 0) {
                linkControllerInteractor$performCreatePaymentMethod$1.label -= Integer.MIN_VALUE;
            } else {
                linkControllerInteractor$performCreatePaymentMethod$1 = new LinkControllerInteractor$performCreatePaymentMethod$1(this, continuation);
            }
        }
        LinkControllerInteractor$performCreatePaymentMethod$1 linkControllerInteractor$performCreatePaymentMethod$12 = linkControllerInteractor$performCreatePaymentMethod$1;
        Object obj = linkControllerInteractor$performCreatePaymentMethod$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkControllerInteractor$performCreatePaymentMethod$12.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            State value = this._state.getValue();
            Object objM7691requireLinkComponentIoAF18A = m7691requireLinkComponentIoAF18A(value);
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM7691requireLinkComponentIoAF18A);
            if (thM9121exceptionOrNullimpl != null) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(thM9121exceptionOrNullimpl));
            }
            LinkComponent linkComponent = (LinkComponent) objM7691requireLinkComponentIoAF18A;
            LinkConfiguration configuration$paymentsheet_release = linkComponent.getConfiguration$paymentsheet_release();
            LinkPaymentMethod selectedPaymentMethod = value.getSelectedPaymentMethod();
            if (selectedPaymentMethod == null) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m9118constructorimpl(ResultKt.createFailure(new IllegalStateException("No selected payment method")));
            }
            if (configuration$paymentsheet_release.getPassthroughModeEnabled()) {
                LinkAccountManager linkAccountManager$paymentsheet_release = linkComponent.getLinkAccountManager$paymentsheet_release();
                String id = selectedPaymentMethod.getDetails().getId();
                String strComputeExpectedPaymentMethodType = DefaultLinkConfirmationHandlerKt.computeExpectedPaymentMethodType(configuration$paymentsheet_release, selectedPaymentMethod.getDetails());
                String collectedCvc = selectedPaymentMethod.getCollectedCvc();
                linkControllerInteractor$performCreatePaymentMethod$12.label = 1;
                objMo7718sharePaymentDetailsyxL6bBk = linkAccountManager$paymentsheet_release.mo7718sharePaymentDetailsyxL6bBk(id, strComputeExpectedPaymentMethodType, null, collectedCvc, linkControllerInteractor$performCreatePaymentMethod$12);
            } else {
                LinkAccountManager linkAccountManager$paymentsheet_release2 = linkComponent.getLinkAccountManager$paymentsheet_release();
                linkControllerInteractor$performCreatePaymentMethod$12.label = 2;
                Object objMo7709createPaymentMethodgIAlus = linkAccountManager$paymentsheet_release2.mo7709createPaymentMethodgIAlus(selectedPaymentMethod, linkControllerInteractor$performCreatePaymentMethod$12);
                if (objMo7709createPaymentMethodgIAlus != coroutine_suspended) {
                    return objMo7709createPaymentMethodgIAlus;
                }
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        objMo7718sharePaymentDetailsyxL6bBk = ((Result) obj).getValue();
        if (!Result.m9125isSuccessimpl(objMo7718sharePaymentDetailsyxL6bBk)) {
            return Result.m9118constructorimpl(objMo7718sharePaymentDetailsyxL6bBk);
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m9118constructorimpl(new PaymentMethodJsonParser().parse(new JSONObject(((SharePaymentDetails) objMo7718sharePaymentDetailsyxL6bBk).getEncodedPaymentMethod())));
    }

    private final LinkController.PaymentMethodPreview toPreview(LinkPaymentMethod linkPaymentMethod, Context context) {
        String str = PaymentDetailsNicknameKt.getDisplayName(linkPaymentMethod.getDetails()).resolve(context) + " •••• " + linkPaymentMethod.getDetails().getLast4();
        int i = R.drawable.stripe_ic_paymentsheet_link_arrow;
        String string = context.getString(com.stripe.android.R.string.stripe_link);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new LinkController.PaymentMethodPreview(i, string, str);
    }

    /* renamed from: toResult-IoAF18A, reason: not valid java name */
    private final Object m7694toResultIoAF18A(LinkAttestationCheck.Result result) {
        if (result instanceof LinkAttestationCheck.Result.AccountError) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(((LinkAttestationCheck.Result.AccountError) result).getError()));
        }
        if (result instanceof LinkAttestationCheck.Result.AttestationFailed) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new AppAttestationException(((LinkAttestationCheck.Result.AttestationFailed) result).getError())));
        }
        if (result instanceof LinkAttestationCheck.Result.Error) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(((LinkAttestationCheck.Result.Error) result).getError()));
        }
        if (!Intrinsics.areEqual(result, LinkAttestationCheck.Result.Successful.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion4 = Result.INSTANCE;
        return Result.m9118constructorimpl(Unit.INSTANCE);
    }

    /* renamed from: toResult-IoAF18A, reason: not valid java name */
    private final Object m7693toResultIoAF18A(LinkAuthResult linkAuthResult) {
        if (linkAuthResult instanceof LinkAuthResult.AccountError) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(((LinkAuthResult.AccountError) linkAuthResult).getError()));
        }
        if (linkAuthResult instanceof LinkAuthResult.AttestationFailed) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(new AppAttestationException(((LinkAuthResult.AttestationFailed) linkAuthResult).getError())));
        }
        if (linkAuthResult instanceof LinkAuthResult.Error) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(((LinkAuthResult.Error) linkAuthResult).getError()));
        }
        if (Intrinsics.areEqual(linkAuthResult, LinkAuthResult.NoLinkAccountFound.INSTANCE)) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m9118constructorimpl(null);
        }
        if (!(linkAuthResult instanceof LinkAuthResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        Result.Companion companion5 = Result.INSTANCE;
        return Result.m9118constructorimpl(((LinkAuthResult.Success) linkAuthResult).getAccount());
    }

    public final void updateState$paymentsheet_release(Function1<? super State, State> block) {
        State value;
        Intrinsics.checkNotNullParameter(block, "block");
        MutableStateFlow<State> mutableStateFlow = this._state;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, block.invoke(value)));
    }

    /* compiled from: LinkControllerInteractor.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/stripe/android/link/LinkControllerInteractor$State;", "", "linkComponent", "Lcom/stripe/android/link/injection/LinkComponent;", "emailInput", "", "selectedPaymentMethod", "Lcom/stripe/android/link/LinkPaymentMethod;", "createdPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "currentLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "<init>", "(Lcom/stripe/android/link/injection/LinkComponent;Ljava/lang/String;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/link/LinkLaunchMode;)V", "getLinkComponent", "()Lcom/stripe/android/link/injection/LinkComponent;", "getEmailInput", "()Ljava/lang/String;", "getSelectedPaymentMethod", "()Lcom/stripe/android/link/LinkPaymentMethod;", "getCreatedPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "getCurrentLaunchMode", "()Lcom/stripe/android/link/LinkLaunchMode;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {
        public static final int $stable = 8;
        private final PaymentMethod createdPaymentMethod;
        private final LinkLaunchMode currentLaunchMode;
        private final String emailInput;
        private final LinkComponent linkComponent;
        private final LinkPaymentMethod selectedPaymentMethod;

        public State() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ State copy$default(State state, LinkComponent linkComponent, String str, LinkPaymentMethod linkPaymentMethod, PaymentMethod paymentMethod, LinkLaunchMode linkLaunchMode, int i, Object obj) {
            if ((i & 1) != 0) {
                linkComponent = state.linkComponent;
            }
            if ((i & 2) != 0) {
                str = state.emailInput;
            }
            if ((i & 4) != 0) {
                linkPaymentMethod = state.selectedPaymentMethod;
            }
            if ((i & 8) != 0) {
                paymentMethod = state.createdPaymentMethod;
            }
            if ((i & 16) != 0) {
                linkLaunchMode = state.currentLaunchMode;
            }
            LinkLaunchMode linkLaunchMode2 = linkLaunchMode;
            LinkPaymentMethod linkPaymentMethod2 = linkPaymentMethod;
            return state.copy(linkComponent, str, linkPaymentMethod2, paymentMethod, linkLaunchMode2);
        }

        /* renamed from: component1, reason: from getter */
        public final LinkComponent getLinkComponent() {
            return this.linkComponent;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEmailInput() {
            return this.emailInput;
        }

        /* renamed from: component3, reason: from getter */
        public final LinkPaymentMethod getSelectedPaymentMethod() {
            return this.selectedPaymentMethod;
        }

        /* renamed from: component4, reason: from getter */
        public final PaymentMethod getCreatedPaymentMethod() {
            return this.createdPaymentMethod;
        }

        /* renamed from: component5, reason: from getter */
        public final LinkLaunchMode getCurrentLaunchMode() {
            return this.currentLaunchMode;
        }

        public final State copy(LinkComponent linkComponent, String emailInput, LinkPaymentMethod selectedPaymentMethod, PaymentMethod createdPaymentMethod, LinkLaunchMode currentLaunchMode) {
            return new State(linkComponent, emailInput, selectedPaymentMethod, createdPaymentMethod, currentLaunchMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return Intrinsics.areEqual(this.linkComponent, state.linkComponent) && Intrinsics.areEqual(this.emailInput, state.emailInput) && Intrinsics.areEqual(this.selectedPaymentMethod, state.selectedPaymentMethod) && Intrinsics.areEqual(this.createdPaymentMethod, state.createdPaymentMethod) && Intrinsics.areEqual(this.currentLaunchMode, state.currentLaunchMode);
        }

        public int hashCode() {
            LinkComponent linkComponent = this.linkComponent;
            int iHashCode = (linkComponent == null ? 0 : linkComponent.hashCode()) * 31;
            String str = this.emailInput;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            LinkPaymentMethod linkPaymentMethod = this.selectedPaymentMethod;
            int iHashCode3 = (iHashCode2 + (linkPaymentMethod == null ? 0 : linkPaymentMethod.hashCode())) * 31;
            PaymentMethod paymentMethod = this.createdPaymentMethod;
            int iHashCode4 = (iHashCode3 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            LinkLaunchMode linkLaunchMode = this.currentLaunchMode;
            return iHashCode4 + (linkLaunchMode != null ? linkLaunchMode.hashCode() : 0);
        }

        public String toString() {
            return "State(linkComponent=" + this.linkComponent + ", emailInput=" + this.emailInput + ", selectedPaymentMethod=" + this.selectedPaymentMethod + ", createdPaymentMethod=" + this.createdPaymentMethod + ", currentLaunchMode=" + this.currentLaunchMode + ")";
        }

        public State(LinkComponent linkComponent, String str, LinkPaymentMethod linkPaymentMethod, PaymentMethod paymentMethod, LinkLaunchMode linkLaunchMode) {
            this.linkComponent = linkComponent;
            this.emailInput = str;
            this.selectedPaymentMethod = linkPaymentMethod;
            this.createdPaymentMethod = paymentMethod;
            this.currentLaunchMode = linkLaunchMode;
        }

        public /* synthetic */ State(LinkComponent linkComponent, String str, LinkPaymentMethod linkPaymentMethod, PaymentMethod paymentMethod, LinkLaunchMode linkLaunchMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : linkComponent, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : linkPaymentMethod, (i & 8) != 0 ? null : paymentMethod, (i & 16) != 0 ? null : linkLaunchMode);
        }

        public final LinkComponent getLinkComponent() {
            return this.linkComponent;
        }

        public final String getEmailInput() {
            return this.emailInput;
        }

        public final LinkPaymentMethod getSelectedPaymentMethod() {
            return this.selectedPaymentMethod;
        }

        public final PaymentMethod getCreatedPaymentMethod() {
            return this.createdPaymentMethod;
        }

        public final LinkLaunchMode getCurrentLaunchMode() {
            return this.currentLaunchMode;
        }

        public final LinkConfiguration getLinkConfiguration() {
            LinkComponent linkComponent = this.linkComponent;
            if (linkComponent != null) {
                return linkComponent.getConfiguration$paymentsheet_release();
            }
            return null;
        }
    }
}
