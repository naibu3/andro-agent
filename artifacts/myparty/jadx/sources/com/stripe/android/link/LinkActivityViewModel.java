package com.stripe.android.link;

import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkAction;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.LinkLaunchMode;
import com.stripe.android.link.LinkPaymentMethod;
import com.stripe.android.link.LinkScreen;
import com.stripe.android.link.ScreenState;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.account.LinkAccountUtilKt;
import com.stripe.android.link.attestation.LinkAttestationCheck;
import com.stripe.android.link.confirmation.LinkConfirmationHandler;
import com.stripe.android.link.confirmation.Result;
import com.stripe.android.link.injection.DaggerNativeLinkComponent;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.LinkAppBarState;
import com.stripe.android.link.ui.signup.SignUpViewModel;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.uicore.navigation.NavBackStackEntryUpdate;
import com.stripe.android.uicore.navigation.NavigationIntent;
import com.stripe.android.uicore.navigation.NavigationManager;
import com.stripe.android.uicore.navigation.PopUpToBehavior;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: LinkActivityViewModel.kt */
@Metadata(d1 = {"\u0000\u0086\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0083\u00012\u00020\u00012\u00020\u0002:\u0002\u0083\u0001Bq\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020WJ\u0006\u0010X\u001a\u00020LJ\u0006\u0010Y\u001a\u00020LJ\u000e\u0010Z\u001a\u00020L2\u0006\u0010;\u001a\u00020:J\u0006\u0010[\u001a\u00020LJ\u000e\u0010\\\u001a\u00020L2\u0006\u0010]\u001a\u00020RJ\b\u0010^\u001a\u00020LH\u0002J\u000e\u0010_\u001a\u00020L2\u0006\u0010`\u001a\u00020aJ\u000e\u0010b\u001a\u00020L2\u0006\u0010c\u001a\u00020dJ\u0006\u0010e\u001a\u00020LJ\u0016\u0010f\u001a\u00020L2\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jJ \u0010k\u001a\u00020L2\u0006\u0010l\u001a\u00020m2\u0006\u0010n\u001a\u00020R2\b\b\u0002\u0010o\u001a\u00020RJ\u0006\u0010p\u001a\u00020LJ\u0006\u0010q\u001a\u00020LJ\u0006\u0010r\u001a\u00020LJ\u0010\u0010s\u001a\u00020L2\u0006\u0010t\u001a\u00020jH\u0016J\u000e\u0010u\u001a\u00020LH\u0082@¢\u0006\u0002\u0010vJ\u001e\u0010w\u001a\b\u0012\u0004\u0012\u00020y0x2\u0006\u0010z\u001a\u00020{H\u0082@¢\u0006\u0004\b|\u0010}J\u000e\u0010~\u001a\u00020LH\u0082@¢\u0006\u0002\u0010vJ\u000f\u0010\u007f\u001a\u00030\u0080\u0001H\u0082@¢\u0006\u0002\u0010vJ\u000f\u0010\u0081\u0001\u001a\u00020LH\u0082@¢\u0006\u0002\u0010vJ\u0011\u0010\u0082\u0001\u001a\u00020L2\u0006\u0010;\u001a\u00020:H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020305¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020:0<¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020@0<¢\u0006\b\n\u0000\u001a\u0004\bA\u0010>R\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020C02X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020C05¢\u0006\b\n\u0000\u001a\u0004\bE\u00107R\u0013\u0010F\u001a\u0004\u0018\u00010G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR(\u0010J\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020L\u0018\u00010KX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006\u0084\u0001"}, d2 = {"Lcom/stripe/android/link/LinkActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "activityRetainedComponent", "Lcom/stripe/android/link/injection/NativeLinkComponent;", "confirmationHandlerFactory", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;", "linkConfirmationHandlerFactory", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "linkConfiguration", "Lcom/stripe/android/link/LinkConfiguration;", "linkAttestationCheck", "Lcom/stripe/android/link/attestation/LinkAttestationCheck;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "linkExpressMode", "Lcom/stripe/android/link/LinkExpressMode;", "navigationManager", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "linkLaunchMode", "Lcom/stripe/android/link/LinkLaunchMode;", "autocompleteLauncher", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "<init>", "(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Factory;Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/account/LinkAccountHolder;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/attestation/LinkAttestationCheck;Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/uicore/navigation/NavigationManager;Lcom/stripe/android/link/LinkLaunchMode;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;)V", "getActivityRetainedComponent", "()Lcom/stripe/android/link/injection/NativeLinkComponent;", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getLinkConfiguration", "()Lcom/stripe/android/link/LinkConfiguration;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "getLinkLaunchMode", "()Lcom/stripe/android/link/LinkLaunchMode;", "confirmationHandler", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "getConfirmationHandler", "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;", "linkConfirmationHandler", "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "getLinkConfirmationHandler", "()Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;", "_linkAppBarState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/link/ui/LinkAppBarState;", "linkAppBarState", "Lkotlinx/coroutines/flow/StateFlow;", "getLinkAppBarState", "()Lkotlinx/coroutines/flow/StateFlow;", "_result", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/link/LinkActivityResult;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lkotlinx/coroutines/flow/SharedFlow;", "getResult", "()Lkotlinx/coroutines/flow/SharedFlow;", "navigationFlow", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "getNavigationFlow", "_linkScreenState", "Lcom/stripe/android/link/ScreenState;", "linkScreenState", "getLinkScreenState", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "getLinkAccount", "()Lcom/stripe/android/link/model/LinkAccount;", "launchWebFlow", "Lkotlin/Function1;", "", "getLaunchWebFlow", "()Lkotlin/jvm/functions/Function1;", "setLaunchWebFlow", "(Lkotlin/jvm/functions/Function1;)V", "canDismissSheet", "", "getCanDismissSheet", "()Z", "handleViewAction", "action", "Lcom/stripe/android/link/LinkAction;", "onVerificationSucceeded", "onDismissVerificationClicked", "handleResult", "dismissSheet", "onContentCanScrollBackwardChanged", "canScrollBackward", "handleLogoutClicked", "onNavEntryChanged", "entry", "Lcom/stripe/android/uicore/navigation/NavBackStackEntryUpdate;", "moveToWeb", "error", "", "handleBackPressed", "registerForActivityResult", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "navigate", "screen", "Lcom/stripe/android/link/LinkScreen;", "clearStack", "launchSingleTop", "goBack", "changeEmail", "unregisterActivity", "onCreate", "owner", "loadLink", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmLinkPayment", "Lkotlin/Result;", "Lcom/stripe/android/link/confirmation/Result;", "selectedPayment", "Lcom/stripe/android/link/LinkPaymentMethod;", "confirmLinkPayment-gIAlu-s", "(Lcom/stripe/android/link/LinkPaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateScreenState", "buildFullScreenState", "Lcom/stripe/android/link/ScreenState$FullScreen;", "handleAccountError", "dismissWithResult", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkActivityViewModel extends ViewModel implements DefaultLifecycleObserver {
    private final MutableStateFlow<LinkAppBarState> _linkAppBarState;
    private final MutableStateFlow<ScreenState> _linkScreenState;
    private final MutableSharedFlow<LinkActivityResult> _result;
    private final NativeLinkComponent activityRetainedComponent;
    private final AutocompleteActivityLauncher autocompleteLauncher;
    private final ConfirmationHandler confirmationHandler;
    private final EventReporter eventReporter;
    private Function1<? super LinkConfiguration, Unit> launchWebFlow;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkAccountManager linkAccountManager;
    private final StateFlow<LinkAppBarState> linkAppBarState;
    private final LinkAttestationCheck linkAttestationCheck;
    private final LinkConfiguration linkConfiguration;
    private final LinkConfirmationHandler linkConfirmationHandler;
    private final LinkExpressMode linkExpressMode;
    private final LinkLaunchMode linkLaunchMode;
    private final StateFlow<ScreenState> linkScreenState;
    private final SharedFlow<NavigationIntent> navigationFlow;
    private final NavigationManager navigationManager;
    private final SharedFlow<LinkActivityResult> result;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LinkExpressMode.values().length];
            try {
                iArr[LinkExpressMode.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkExpressMode.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LinkExpressMode.ENABLED_NO_WEB_FALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountStatus.values().length];
            try {
                iArr2[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AccountStatus.SignedOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AccountStatus.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AccountStatus.NeedsVerification.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AccountStatus.VerificationStarted.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {0, 1, 1}, l = {347, 351}, m = "buildFullScreenState", n = {"this", "this", "accountStatus"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$buildFullScreenState$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkActivityViewModel.this.buildFullScreenState(this);
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {0}, l = {376, 378}, m = "handleAccountError", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$handleAccountError$1, reason: invalid class name and case insensitive filesystem */
    static final class C10261 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10261(Continuation<? super C10261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkActivityViewModel.this.handleAccountError(this);
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {0}, l = {248, 254, 258, 262}, m = "loadLink", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$loadLink$1, reason: invalid class name and case insensitive filesystem */
    static final class C10281 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10281(Continuation<? super C10281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkActivityViewModel.this.loadLink(this);
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel", f = "LinkActivityViewModel.kt", i = {0}, l = {313, 333, 340}, m = "updateScreenState", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$updateScreenState$1, reason: invalid class name and case insensitive filesystem */
    static final class C10311 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10311(Continuation<? super C10311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkActivityViewModel.this.updateScreenState(this);
        }
    }

    public final NativeLinkComponent getActivityRetainedComponent() {
        return this.activityRetainedComponent;
    }

    public final EventReporter getEventReporter() {
        return this.eventReporter;
    }

    public final LinkConfiguration getLinkConfiguration() {
        return this.linkConfiguration;
    }

    public final SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    public final LinkLaunchMode getLinkLaunchMode() {
        return this.linkLaunchMode;
    }

    @Inject
    public LinkActivityViewModel(NativeLinkComponent activityRetainedComponent, ConfirmationHandler.Factory confirmationHandlerFactory, LinkConfirmationHandler.Factory linkConfirmationHandlerFactory, LinkAccountManager linkAccountManager, LinkAccountHolder linkAccountHolder, EventReporter eventReporter, LinkConfiguration linkConfiguration, LinkAttestationCheck linkAttestationCheck, SavedStateHandle savedStateHandle, LinkExpressMode linkExpressMode, NavigationManager navigationManager, LinkLaunchMode linkLaunchMode, AutocompleteActivityLauncher autocompleteLauncher) {
        Intrinsics.checkNotNullParameter(activityRetainedComponent, "activityRetainedComponent");
        Intrinsics.checkNotNullParameter(confirmationHandlerFactory, "confirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(linkConfirmationHandlerFactory, "linkConfirmationHandlerFactory");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(linkConfiguration, "linkConfiguration");
        Intrinsics.checkNotNullParameter(linkAttestationCheck, "linkAttestationCheck");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(linkExpressMode, "linkExpressMode");
        Intrinsics.checkNotNullParameter(navigationManager, "navigationManager");
        Intrinsics.checkNotNullParameter(linkLaunchMode, "linkLaunchMode");
        Intrinsics.checkNotNullParameter(autocompleteLauncher, "autocompleteLauncher");
        this.activityRetainedComponent = activityRetainedComponent;
        this.linkAccountManager = linkAccountManager;
        this.linkAccountHolder = linkAccountHolder;
        this.eventReporter = eventReporter;
        this.linkConfiguration = linkConfiguration;
        this.linkAttestationCheck = linkAttestationCheck;
        this.savedStateHandle = savedStateHandle;
        this.linkExpressMode = linkExpressMode;
        this.navigationManager = navigationManager;
        this.linkLaunchMode = linkLaunchMode;
        this.autocompleteLauncher = autocompleteLauncher;
        ConfirmationHandler confirmationHandlerCreate = confirmationHandlerFactory.create(ViewModelKt.getViewModelScope(this));
        this.confirmationHandler = confirmationHandlerCreate;
        this.linkConfirmationHandler = linkConfirmationHandlerFactory.create(confirmationHandlerCreate);
        MutableStateFlow<LinkAppBarState> MutableStateFlow = StateFlowKt.MutableStateFlow(LinkAppBarState.INSTANCE.initial());
        this._linkAppBarState = MutableStateFlow;
        this.linkAppBarState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<LinkActivityResult> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 1, null, 4, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.navigationFlow = navigationManager.getNavigationFlow();
        MutableStateFlow<ScreenState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(ScreenState.Loading.INSTANCE);
        this._linkScreenState = MutableStateFlow2;
        this.linkScreenState = MutableStateFlow2;
    }

    public final ConfirmationHandler getConfirmationHandler() {
        return this.confirmationHandler;
    }

    public final LinkConfirmationHandler getLinkConfirmationHandler() {
        return this.linkConfirmationHandler;
    }

    public final StateFlow<LinkAppBarState> getLinkAppBarState() {
        return this.linkAppBarState;
    }

    public final SharedFlow<LinkActivityResult> getResult() {
        return this.result;
    }

    public final SharedFlow<NavigationIntent> getNavigationFlow() {
        return this.navigationFlow;
    }

    public final StateFlow<ScreenState> getLinkScreenState() {
        return this.linkScreenState;
    }

    public final LinkAccount getLinkAccount() {
        return this.linkAccountManager.getLinkAccountInfo().getValue().getAccount();
    }

    public final Function1<LinkConfiguration, Unit> getLaunchWebFlow() {
        return this.launchWebFlow;
    }

    public final void setLaunchWebFlow(Function1<? super LinkConfiguration, Unit> function1) {
        this.launchWebFlow = function1;
    }

    public final boolean getCanDismissSheet() {
        return this.activityRetainedComponent.getDismissalCoordinator().get_canDismiss();
    }

    public final void handleViewAction(LinkAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(action, LinkAction.BackPressed.INSTANCE)) {
            handleBackPressed();
        } else {
            if (!Intrinsics.areEqual(action, LinkAction.LogoutClicked.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            handleLogoutClicked();
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel$onVerificationSucceeded$1", f = "LinkActivityViewModel.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$onVerificationSucceeded$1, reason: invalid class name and case insensitive filesystem */
    static final class C10301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C10301(Continuation<? super C10301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivityViewModel.this.new C10301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow2 = LinkActivityViewModel.this._linkScreenState;
                this.L$0 = mutableStateFlow2;
                this.label = 1;
                Object objBuildFullScreenState = LinkActivityViewModel.this.buildFullScreenState(this);
                if (objBuildFullScreenState == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = mutableStateFlow2;
                obj = objBuildFullScreenState;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableStateFlow.setValue(obj);
            return Unit.INSTANCE;
        }
    }

    public final void onVerificationSucceeded() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10301(null), 3, null);
    }

    public final void onDismissVerificationClicked() {
        dismissWithResult(new LinkActivityResult.Canceled(null, LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager), 1, null));
    }

    public final void handleResult(LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        dismissWithResult(result);
    }

    public final void dismissSheet() {
        if (getCanDismissSheet()) {
            dismissWithResult(new LinkActivityResult.Canceled(null, LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager), 1, null));
        }
    }

    public final void onContentCanScrollBackwardChanged(boolean canScrollBackward) {
        MutableStateFlow<LinkAppBarState> mutableStateFlow = this._linkAppBarState;
        while (true) {
            LinkAppBarState value = mutableStateFlow.getValue();
            boolean z = canScrollBackward;
            if (mutableStateFlow.compareAndSet(value, LinkAppBarState.copy$default(value, false, false, null, z, 7, null))) {
                return;
            } else {
                canScrollBackward = z;
            }
        }
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel$handleLogoutClicked$1", f = "LinkActivityViewModel.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$handleLogoutClicked$1, reason: invalid class name and case insensitive filesystem */
    static final class C10271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10271(Continuation<? super C10271> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivityViewModel.this.new C10271(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LinkActivityViewModel.this.linkAccountManager.mo7713logOutIoAF18A(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
            }
            return Unit.INSTANCE;
        }
    }

    private final void handleLogoutClicked() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C10271(null), 3, null);
        dismissWithResult(new LinkActivityResult.Canceled(LinkActivityResult.Canceled.Reason.LoggedOut, new LinkAccountUpdate.Value(null, LinkAccountUpdate.Value.UpdateReason.LoggedOut)));
    }

    public final void onNavEntryChanged(NavBackStackEntryUpdate entry) {
        LinkAppBarState value;
        LinkAppBarState.Companion companion;
        boolean z;
        NavDestination destination;
        Intrinsics.checkNotNullParameter(entry, "entry");
        NavBackStackEntry currentBackStackEntry = entry.getCurrentBackStackEntry();
        if (currentBackStackEntry == null) {
            return;
        }
        NavBackStackEntry previousBackStackEntry = entry.getPreviousBackStackEntry();
        String route = (previousBackStackEntry == null || (destination = previousBackStackEntry.getDestination()) == null) ? null : destination.getRoute();
        MutableStateFlow<LinkAppBarState> mutableStateFlow = this._linkAppBarState;
        do {
            value = mutableStateFlow.getValue();
            companion = LinkAppBarState.INSTANCE;
            LinkAccount linkAccount = getLinkAccount();
            z = false;
            if (linkAccount != null && linkAccount.getCompletedSignup()) {
                z = true;
            }
        } while (!mutableStateFlow.compareAndSet(value, companion.create(currentBackStackEntry, route, z)));
    }

    public final void moveToWeb(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        LinkLaunchMode linkLaunchMode = this.linkLaunchMode;
        if (linkLaunchMode instanceof LinkLaunchMode.Authentication) {
            dismissWithResult(new LinkActivityResult.Failed(error, LinkAccountUpdate.None.INSTANCE));
            return;
        }
        if (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) {
            dismissWithResult(new LinkActivityResult.Completed(LinkAccountUpdate.None.INSTANCE, null, null));
            return;
        }
        if (!(linkLaunchMode instanceof LinkLaunchMode.Confirmation) && !Intrinsics.areEqual(linkLaunchMode, LinkLaunchMode.Full.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        Function1<? super LinkConfiguration, Unit> function1 = this.launchWebFlow;
        if (function1 != null) {
            navigate$default(this, LinkScreen.Loading.INSTANCE, true, false, 4, null);
            function1.invoke(this.linkConfiguration);
        }
    }

    public final void handleBackPressed() {
        dismissWithResult(new LinkActivityResult.Canceled(null, LinkAccountUtilKt.getLinkAccountUpdate(this.linkAccountManager), 1, null));
    }

    public final void registerForActivityResult(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.autocompleteLauncher.register(activityResultCaller, lifecycleOwner);
        this.confirmationHandler.register(activityResultCaller, lifecycleOwner);
    }

    public static /* synthetic */ void navigate$default(LinkActivityViewModel linkActivityViewModel, LinkScreen linkScreen, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        linkActivityViewModel.navigate(linkScreen, z, z2);
    }

    public final void navigate(LinkScreen screen, boolean clearStack, boolean launchSingleTop) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.navigationManager.tryNavigateTo(screen.getRoute(), clearStack ? PopUpToBehavior.Start.INSTANCE : null, launchSingleTop);
    }

    public final void goBack() {
        if (getCanDismissSheet()) {
            this.navigationManager.tryNavigateBack();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void changeEmail() {
        this.savedStateHandle.set(SignUpViewModel.USE_LINK_CONFIGURATION_CUSTOMER_INFO, false);
        if (this.linkScreenState.getValue() instanceof ScreenState.VerificationDialog) {
            this.linkAccountHolder.set(new LinkAccountUpdate.Value(null, null == true ? 1 : 0, 2, null == true ? 1 : 0));
            this._linkScreenState.setValue(new ScreenState.FullScreen(LinkScreen.SignUp.INSTANCE));
            return;
        }
        navigate$default(this, LinkScreen.SignUp.INSTANCE, true, false, 4, null);
    }

    public final void unregisterActivity() {
        this.launchWebFlow = null;
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel$onCreate$1", f = "LinkActivityViewModel.kt", i = {}, l = {241, 242}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$onCreate$1, reason: invalid class name and case insensitive filesystem */
    static final class C10291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10291(Continuation<? super C10291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivityViewModel.this.new C10291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
        
            if (r5 == r0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        
            if (r4.this$0.loadLink(r4) == r0) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM7678confirmLinkPaymentgIAlus;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LinkLaunchMode linkLaunchMode = LinkActivityViewModel.this.getLinkLaunchMode();
                if ((linkLaunchMode instanceof LinkLaunchMode.Full) || (linkLaunchMode instanceof LinkLaunchMode.PaymentMethodSelection) || (linkLaunchMode instanceof LinkLaunchMode.Authentication)) {
                    this.label = 1;
                } else if (linkLaunchMode instanceof LinkLaunchMode.Confirmation) {
                    LinkActivityViewModel linkActivityViewModel = LinkActivityViewModel.this;
                    this.label = 2;
                    objM7678confirmLinkPaymentgIAlus = linkActivityViewModel.m7678confirmLinkPaymentgIAlus(((LinkLaunchMode.Confirmation) linkActivityViewModel.getLinkLaunchMode()).getSelectedPayment(), this);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objM7678confirmLinkPaymentgIAlus = ((Result) obj).getValue();
                Result.m9117boximpl(objM7678confirmLinkPaymentgIAlus);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onCreate(owner);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10291(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if (r2.updateScreenState(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a4, code lost:
    
        if (r2.updateScreenState(r0) == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
    
        if (r2.handleAccountError(r0) == r1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadLink(Continuation<? super Unit> continuation) {
        C10281 c10281;
        LinkActivityViewModel linkActivityViewModel;
        if (continuation instanceof C10281) {
            c10281 = (C10281) continuation;
            if ((c10281.label & Integer.MIN_VALUE) != 0) {
                c10281.label -= Integer.MIN_VALUE;
            } else {
                c10281 = new C10281(continuation);
            }
        }
        Object objInvoke = c10281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10281.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objInvoke);
            LinkAttestationCheck linkAttestationCheck = this.linkAttestationCheck;
            c10281.L$0 = this;
            c10281.label = 1;
            objInvoke = linkAttestationCheck.invoke(c10281);
            if (objInvoke != coroutine_suspended) {
                linkActivityViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i == 3) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objInvoke);
            return Unit.INSTANCE;
        }
        linkActivityViewModel = (LinkActivityViewModel) c10281.L$0;
        ResultKt.throwOnFailure(objInvoke);
        LinkAttestationCheck.Result result = (LinkAttestationCheck.Result) objInvoke;
        if (result instanceof LinkAttestationCheck.Result.AttestationFailed) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[linkActivityViewModel.linkExpressMode.ordinal()];
            if (i2 == 1 || i2 == 2) {
                linkActivityViewModel.moveToWeb(((LinkAttestationCheck.Result.AttestationFailed) result).getError());
                return Unit.INSTANCE;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c10281.L$0 = null;
            c10281.label = 2;
        } else if (Intrinsics.areEqual(result, LinkAttestationCheck.Result.Successful.INSTANCE)) {
            c10281.L$0 = null;
            c10281.label = 3;
        } else {
            if (!(result instanceof LinkAttestationCheck.Result.Error) && !(result instanceof LinkAttestationCheck.Result.AccountError)) {
                throw new NoWhenBranchMatchedException();
            }
            c10281.L$0 = null;
            c10281.label = 4;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* renamed from: confirmLinkPayment-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7678confirmLinkPaymentgIAlus(LinkPaymentMethod linkPaymentMethod, Continuation<? super Result<? extends com.stripe.android.link.confirmation.Result>> continuation) {
        LinkActivityViewModel$confirmLinkPayment$1 linkActivityViewModel$confirmLinkPayment$1;
        Throwable th;
        LinkActivityViewModel linkActivityViewModel;
        Object objM9118constructorimpl;
        LinkActivityViewModel linkActivityViewModel2;
        Throwable thM9121exceptionOrNullimpl;
        LinkActivityResult.Completed completed;
        LinkActivityViewModel linkActivityViewModel3;
        LinkActivityViewModel linkActivityViewModel4;
        com.stripe.android.link.confirmation.Result result;
        if (continuation instanceof LinkActivityViewModel$confirmLinkPayment$1) {
            linkActivityViewModel$confirmLinkPayment$1 = (LinkActivityViewModel$confirmLinkPayment$1) continuation;
            if ((linkActivityViewModel$confirmLinkPayment$1.label & Integer.MIN_VALUE) != 0) {
                linkActivityViewModel$confirmLinkPayment$1.label -= Integer.MIN_VALUE;
            } else {
                linkActivityViewModel$confirmLinkPayment$1 = new LinkActivityViewModel$confirmLinkPayment$1(this, continuation);
            }
        }
        LinkActivityViewModel$confirmLinkPayment$1 linkActivityViewModel$confirmLinkPayment$12 = linkActivityViewModel$confirmLinkPayment$1;
        Object objConfirm = linkActivityViewModel$confirmLinkPayment$12.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = linkActivityViewModel$confirmLinkPayment$12.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objConfirm);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    LinkActivityViewModel linkActivityViewModel5 = this;
                    if (!linkPaymentMethod.readyForConfirmation$paymentsheet_release()) {
                        throw new IllegalArgumentException("LinkPaymentMethod must be ready for confirmation".toString());
                    }
                    LinkAccount linkAccount = getLinkAccount();
                    if (linkAccount == null) {
                        throw new IllegalArgumentException("LinkAccount must not be null for confirmation".toString());
                    }
                    if (linkPaymentMethod instanceof LinkPaymentMethod.ConsumerPaymentDetails) {
                        LinkConfirmationHandler linkConfirmationHandler = this.linkConfirmationHandler;
                        ConsumerPaymentDetails.PaymentDetails details = ((LinkPaymentMethod.ConsumerPaymentDetails) linkPaymentMethod).getDetails();
                        String collectedCvc = ((LinkPaymentMethod.ConsumerPaymentDetails) linkPaymentMethod).getCollectedCvc();
                        String billingPhone = ((LinkPaymentMethod.ConsumerPaymentDetails) linkPaymentMethod).getBillingPhone();
                        linkActivityViewModel$confirmLinkPayment$12.L$0 = this;
                        linkActivityViewModel$confirmLinkPayment$12.label = 1;
                        objConfirm = linkConfirmationHandler.confirm(details, linkAccount, collectedCvc, billingPhone, linkActivityViewModel$confirmLinkPayment$12);
                        if (objConfirm != coroutine_suspended) {
                            linkActivityViewModel4 = this;
                            result = (com.stripe.android.link.confirmation.Result) objConfirm;
                            linkPaymentMethod = linkActivityViewModel4;
                        }
                    } else {
                        if (!(linkPaymentMethod instanceof LinkPaymentMethod.LinkPaymentDetails)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LinkConfirmationHandler linkConfirmationHandler2 = this.linkConfirmationHandler;
                        LinkPaymentDetails linkPaymentDetails = ((LinkPaymentMethod.LinkPaymentDetails) linkPaymentMethod).getLinkPaymentDetails();
                        String collectedCvc2 = ((LinkPaymentMethod.LinkPaymentDetails) linkPaymentMethod).getCollectedCvc();
                        String billingPhone2 = ((LinkPaymentMethod.LinkPaymentDetails) linkPaymentMethod).getBillingPhone();
                        linkActivityViewModel$confirmLinkPayment$12.L$0 = this;
                        linkActivityViewModel$confirmLinkPayment$12.label = 2;
                        objConfirm = linkConfirmationHandler2.confirm(linkPaymentDetails, linkAccount, collectedCvc2, billingPhone2, linkActivityViewModel$confirmLinkPayment$12);
                        if (objConfirm != coroutine_suspended) {
                            linkActivityViewModel3 = this;
                            result = (com.stripe.android.link.confirmation.Result) objConfirm;
                            linkPaymentMethod = linkActivityViewModel3;
                        }
                    }
                    return coroutine_suspended;
                } catch (Throwable th2) {
                    th = th2;
                    linkActivityViewModel = this;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                    linkActivityViewModel2 = linkActivityViewModel;
                    if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
                    }
                    thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                    if (thM9121exceptionOrNullimpl != null) {
                    }
                    return objM9118constructorimpl;
                }
            }
            if (i == 1) {
                LinkActivityViewModel linkActivityViewModel6 = (LinkActivityViewModel) linkActivityViewModel$confirmLinkPayment$12.L$0;
                ResultKt.throwOnFailure(objConfirm);
                linkActivityViewModel4 = linkActivityViewModel6;
                result = (com.stripe.android.link.confirmation.Result) objConfirm;
                linkPaymentMethod = linkActivityViewModel4;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                LinkActivityViewModel linkActivityViewModel7 = (LinkActivityViewModel) linkActivityViewModel$confirmLinkPayment$12.L$0;
                ResultKt.throwOnFailure(objConfirm);
                linkActivityViewModel3 = linkActivityViewModel7;
                result = (com.stripe.android.link.confirmation.Result) objConfirm;
                linkPaymentMethod = linkActivityViewModel3;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(result);
            linkActivityViewModel2 = linkPaymentMethod;
        } catch (Throwable th3) {
            th = th3;
            linkActivityViewModel = linkPaymentMethod;
        }
        if (Result.m9125isSuccessimpl(objM9118constructorimpl)) {
            com.stripe.android.link.confirmation.Result result2 = (com.stripe.android.link.confirmation.Result) objM9118constructorimpl;
            if (Intrinsics.areEqual(result2, Result.Canceled.INSTANCE)) {
                completed = new LinkActivityResult.Canceled(LinkActivityResult.Canceled.Reason.BackPressed, LinkAccountUpdate.None.INSTANCE);
            } else if (result2 instanceof Result.Failed) {
                completed = new LinkActivityResult.Failed(new IllegalStateException("Failed to confirm Link payment: " + ((Result.Failed) result2).getMessage()), LinkAccountUpdate.None.INSTANCE);
            } else {
                if (!Intrinsics.areEqual(result2, Result.Succeeded.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                completed = new LinkActivityResult.Completed(new LinkAccountUpdate.Value(null, LinkAccountUpdate.Value.UpdateReason.PaymentConfirmed), null, null, 6, null);
            }
            linkActivityViewModel2.dismissWithResult(completed);
        }
        thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            linkActivityViewModel2.dismissWithResult(new LinkActivityResult.Failed(thM9121exceptionOrNullimpl, LinkAccountUpdate.None.INSTANCE));
        }
        return objM9118constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateScreenState(Continuation<? super Unit> continuation) {
        C10311 c10311;
        LinkActivityViewModel linkActivityViewModel;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        if (continuation instanceof C10311) {
            c10311 = (C10311) continuation;
            if ((c10311.label & Integer.MIN_VALUE) != 0) {
                c10311.label -= Integer.MIN_VALUE;
            } else {
                c10311 = new C10311(continuation);
            }
        }
        Object objFirst = c10311.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10311.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<AccountStatus> accountStatus = this.linkAccountManager.getAccountStatus();
            c10311.L$0 = this;
            c10311.label = 1;
            objFirst = FlowKt.first(accountStatus, c10311);
            if (objFirst != coroutine_suspended) {
                linkActivityViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i == 2) {
                mutableStateFlow = (MutableStateFlow) c10311.L$0;
                ResultKt.throwOnFailure(objFirst);
                mutableStateFlow.setValue(objFirst);
                return Unit.INSTANCE;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableStateFlow2 = (MutableStateFlow) c10311.L$0;
            ResultKt.throwOnFailure(objFirst);
            mutableStateFlow2.setValue(objFirst);
            return Unit.INSTANCE;
        }
        linkActivityViewModel = (LinkActivityViewModel) c10311.L$0;
        ResultKt.throwOnFailure(objFirst);
        AccountStatus accountStatus2 = (AccountStatus) objFirst;
        LinkLaunchMode linkLaunchMode = linkActivityViewModel.linkLaunchMode;
        LinkLaunchMode.Authentication authentication = linkLaunchMode instanceof LinkLaunchMode.Authentication ? (LinkLaunchMode.Authentication) linkLaunchMode : null;
        boolean z = false;
        if (authentication != null && authentication.getExistingOnly()) {
            z = true;
        }
        boolean allowUserEmailEdits = linkActivityViewModel.linkConfiguration.getAllowUserEmailEdits();
        if ((accountStatus2 == AccountStatus.SignedOut || accountStatus2 == AccountStatus.Error) && (z || !allowUserEmailEdits)) {
            linkActivityViewModel.dismissWithResult(new LinkActivityResult.Failed(new NoLinkAccountFoundException(), LinkAccountUpdate.None.INSTANCE));
            return Unit.INSTANCE;
        }
        LinkAccount account = linkActivityViewModel.linkAccountManager.getLinkAccountInfo().getValue().getAccount();
        int i2 = WhenMappings.$EnumSwitchMapping$1[accountStatus2.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            MutableStateFlow<ScreenState> mutableStateFlow3 = linkActivityViewModel._linkScreenState;
            c10311.L$0 = mutableStateFlow3;
            c10311.label = 2;
            Object objBuildFullScreenState = linkActivityViewModel.buildFullScreenState(c10311);
            if (objBuildFullScreenState != coroutine_suspended) {
                mutableStateFlow = mutableStateFlow3;
                objFirst = objBuildFullScreenState;
                mutableStateFlow.setValue(objFirst);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (account != null && linkActivityViewModel.linkExpressMode != LinkExpressMode.DISABLED) {
                linkActivityViewModel._linkScreenState.setValue(new ScreenState.VerificationDialog(account));
                return Unit.INSTANCE;
            }
            MutableStateFlow<ScreenState> mutableStateFlow4 = linkActivityViewModel._linkScreenState;
            c10311.L$0 = mutableStateFlow4;
            c10311.label = 3;
            Object objBuildFullScreenState2 = linkActivityViewModel.buildFullScreenState(c10311);
            if (objBuildFullScreenState2 != coroutine_suspended) {
                mutableStateFlow2 = mutableStateFlow4;
                objFirst = objBuildFullScreenState2;
                mutableStateFlow2.setValue(objFirst);
                return Unit.INSTANCE;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildFullScreenState(Continuation<? super ScreenState.FullScreen> continuation) {
        AnonymousClass1 anonymousClass1;
        LinkActivityViewModel linkActivityViewModel;
        AccountStatus accountStatus;
        LinkActivityViewModel linkActivityViewModel2;
        int i;
        LinkScreen.Wallet wallet;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objFirst = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objFirst);
            Flow<AccountStatus> accountStatus2 = this.linkAccountManager.getAccountStatus();
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objFirst = FlowKt.first(accountStatus2, anonymousClass1);
            if (objFirst != coroutine_suspended) {
                linkActivityViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            accountStatus = (AccountStatus) anonymousClass1.L$1;
            linkActivityViewModel2 = (LinkActivityViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objFirst);
            i = WhenMappings.$EnumSwitchMapping$1[accountStatus.ordinal()];
            if (i != 1) {
                LinkAccount linkAccount = linkActivityViewModel2.getLinkAccount();
                if (linkAccount != null && linkAccount.getCompletedSignup() && linkActivityViewModel2.linkLaunchMode.selectedPayment() == null) {
                    wallet = LinkScreen.PaymentMethod.INSTANCE;
                } else {
                    wallet = LinkScreen.Wallet.INSTANCE;
                }
            } else if (i == 2 || i == 3) {
                wallet = LinkScreen.SignUp.INSTANCE;
            } else {
                if (i != 4 && i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                wallet = LinkScreen.Verification.INSTANCE;
            }
            return new ScreenState.FullScreen(wallet);
        }
        linkActivityViewModel = (LinkActivityViewModel) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objFirst);
        AccountStatus accountStatus3 = (AccountStatus) objFirst;
        anonymousClass1.L$0 = linkActivityViewModel;
        anonymousClass1.L$1 = accountStatus3;
        anonymousClass1.label = 2;
        if (DelayKt.delay(650L, anonymousClass1) != coroutine_suspended) {
            accountStatus = accountStatus3;
            linkActivityViewModel2 = linkActivityViewModel;
            i = WhenMappings.$EnumSwitchMapping$1[accountStatus.ordinal()];
            if (i != 1) {
            }
            return new ScreenState.FullScreen(wallet);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r2.updateScreenState(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleAccountError(Continuation<? super Unit> continuation) {
        C10261 c10261;
        LinkActivityViewModel linkActivityViewModel;
        if (continuation instanceof C10261) {
            c10261 = (C10261) continuation;
            if ((c10261.label & Integer.MIN_VALUE) != 0) {
                c10261.label -= Integer.MIN_VALUE;
            } else {
                c10261 = new C10261(continuation);
            }
        }
        Object obj = c10261.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10261.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LinkAccountManager linkAccountManager = this.linkAccountManager;
            c10261.L$0 = this;
            c10261.label = 1;
            if (linkAccountManager.mo7713logOutIoAF18A(c10261) != coroutine_suspended) {
                linkActivityViewModel = this;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        linkActivityViewModel = (LinkActivityViewModel) c10261.L$0;
        ResultKt.throwOnFailure(obj);
        ((kotlin.Result) obj).getValue();
        linkActivityViewModel.linkAccountHolder.set(new LinkAccountUpdate.Value(null, LinkAccountUpdate.Value.UpdateReason.LoggedOut));
        c10261.L$0 = null;
        c10261.label = 2;
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.LinkActivityViewModel$dismissWithResult$1", f = "LinkActivityViewModel.kt", i = {}, l = {383}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.LinkActivityViewModel$dismissWithResult$1, reason: invalid class name and case insensitive filesystem */
    static final class C10251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkActivityResult $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10251(LinkActivityResult linkActivityResult, Continuation<? super C10251> continuation) {
            super(2, continuation);
            this.$result = linkActivityResult;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LinkActivityViewModel.this.new C10251(this.$result, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (LinkActivityViewModel.this._result.emit(this.$result, this) == coroutine_suspended) {
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

    private final void dismissWithResult(LinkActivityResult result) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10251(result, null), 3, null);
    }

    /* compiled from: LinkActivityViewModel.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/LinkActivityViewModel$Companion;", "", "<init>", "()V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ViewModelProvider.Factory factory$default(Companion companion, SavedStateHandle savedStateHandle, int i, Object obj) {
            if ((i & 1) != 0) {
                savedStateHandle = null;
            }
            return companion.factory(savedStateHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final LinkActivityViewModel factory$lambda$3$lambda$2(SavedStateHandle savedStateHandle, CreationExtras initializer) {
            Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
            if (savedStateHandle == null) {
                savedStateHandle = SavedStateHandleSupport.createSavedStateHandle(initializer);
            }
            Object obj = initializer.get(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.app.Application");
            Application application = (Application) obj;
            final NativeLinkArgs args$paymentsheet_release = LinkActivity.INSTANCE.getArgs$paymentsheet_release(savedStateHandle);
            if (args$paymentsheet_release == null) {
                throw new NoArgsException();
            }
            return DaggerNativeLinkComponent.builder().configuration(args$paymentsheet_release.getConfiguration()).publishableKeyProvider(new Function0() { // from class: com.stripe.android.link.LinkActivityViewModel$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return args$paymentsheet_release.getPublishableKey();
                }
            }).stripeAccountIdProvider(new Function0() { // from class: com.stripe.android.link.LinkActivityViewModel$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return args$paymentsheet_release.getStripeAccountId();
                }
            }).paymentElementCallbackIdentifier(args$paymentsheet_release.getPaymentElementCallbackIdentifier()).savedStateHandle(savedStateHandle).context(application).application(application).linkExpressMode(args$paymentsheet_release.getLinkExpressMode()).linkLaunchMode(args$paymentsheet_release.getLaunchMode()).linkAccountUpdate(args$paymentsheet_release.getLinkAccountInfo()).build().getViewModel();
        }

        public final ViewModelProvider.Factory factory(final SavedStateHandle savedStateHandle) {
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(LinkActivityViewModel.class), new Function1() { // from class: com.stripe.android.link.LinkActivityViewModel$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LinkActivityViewModel.Companion.factory$lambda$3$lambda$2(savedStateHandle, (CreationExtras) obj);
                }
            });
            return initializerViewModelFactoryBuilder.build();
        }
    }
}
