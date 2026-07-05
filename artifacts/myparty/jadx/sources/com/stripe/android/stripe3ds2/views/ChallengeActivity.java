package com.stripe.android.stripe3ds2.views;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeActivityBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.observability.Stripe3ds2ErrorReporterConfig;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.StripeErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.utils.AnalyticsDelegate;
import com.stripe.android.stripe3ds2.utils.AnalyticsProvider;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import com.stripe.android.stripe3ds2.views.ChallengeViewArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ChallengeActivity.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 R2\u00020\u0001:\u0001RB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010B\u001a\u00020C2\b\u0010D\u001a\u0004\u0018\u00010EH\u0014J\u0010\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020?H\u0002J\b\u0010H\u001a\u00020CH\u0016J\u0010\u0010I\u001a\u00020C2\u0006\u0010J\u001a\u00020KH\u0016J\b\u0010L\u001a\u00020CH\u0002J\b\u0010M\u001a\u00020CH\u0014J\b\u0010N\u001a\u00020CH\u0014J\b\u0010O\u001a\u00020CH\u0002J\b\u0010P\u001a\u00020CH\u0014J\b\u0010Q\u001a\u00020CH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\t\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\t\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\t\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006S"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "getTransactionTimer", "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "transactionTimer$delegate", "Lkotlin/Lazy;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "getErrorReporter", "()Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter$delegate", "fragment", "Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "getFragment$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "fragment$delegate", "fragmentViewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "getFragmentViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "fragmentViewBinding$delegate", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeActivityBinding;", "viewBinding$delegate", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "getChallengeActionHandler", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "challengeActionHandler$delegate", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "getErrorRequestExecutor", "()Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor$delegate", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "viewArgs", "Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "getViewArgs", "()Lcom/stripe/android/stripe3ds2/views/ChallengeViewArgs;", "viewArgs$delegate", "keyboardController", "Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "getKeyboardController", "()Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "keyboardController$delegate", "progressDialogFactory", "Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "getProgressDialogFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "progressDialogFactory$delegate", "progressDialog", "Landroid/app/Dialog;", "currentChallengeResponseData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "analyticsDelegate", "Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "startFragment", "cres", "onLowMemory", "onTrimMemory", "level", "", "dismissKeyboard", "onPause", "onResume", "configureHeaderZone", "onDestroy", "dismissDialog", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeActivity extends AppCompatActivity {
    private static final Companion Companion = new Companion(null);
    private static final CoroutineDispatcher WORK_CONTEXT = Dispatchers.getIO();
    private ChallengeResponseData currentChallengeResponseData;
    private Dialog progressDialog;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: transactionTimer$delegate, reason: from kotlin metadata */
    private final Lazy transactionTimer = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.transactionTimer_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: errorReporter$delegate, reason: from kotlin metadata */
    private final Lazy errorReporter = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.errorReporter_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: fragment$delegate, reason: from kotlin metadata */
    private final Lazy fragment = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.fragment_delegate$lambda$2(this.f$0);
        }
    });

    /* renamed from: fragmentViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy fragmentViewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.fragmentViewBinding_delegate$lambda$3(this.f$0);
        }
    });

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.viewBinding_delegate$lambda$4(this.f$0);
        }
    });

    /* renamed from: challengeActionHandler$delegate, reason: from kotlin metadata */
    private final Lazy challengeActionHandler = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.challengeActionHandler_delegate$lambda$5(this.f$0);
        }
    });

    /* renamed from: errorRequestExecutor$delegate, reason: from kotlin metadata */
    private final Lazy errorRequestExecutor = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.errorRequestExecutor_delegate$lambda$6(this.f$0);
        }
    });

    /* renamed from: viewArgs$delegate, reason: from kotlin metadata */
    private final Lazy viewArgs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.viewArgs_delegate$lambda$8(this.f$0);
        }
    });

    /* renamed from: keyboardController$delegate, reason: from kotlin metadata */
    private final Lazy keyboardController = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.keyboardController_delegate$lambda$9(this.f$0);
        }
    });

    /* renamed from: progressDialogFactory$delegate, reason: from kotlin metadata */
    private final Lazy progressDialogFactory = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ChallengeActivity.progressDialogFactory_delegate$lambda$10(this.f$0);
        }
    });
    private final AnalyticsDelegate analyticsDelegate = AnalyticsProvider.INSTANCE.getInstance().serviceImpl();

    public ChallengeActivity() {
        final ChallengeActivity challengeActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return challengeActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeActivity.viewModel_delegate$lambda$7(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? challengeActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    private final TransactionTimer getTransactionTimer() {
        return (TransactionTimer) this.transactionTimer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultTransactionTimer transactionTimer_delegate$lambda$0(ChallengeActivity challengeActivity) {
        return new DefaultTransactionTimer(challengeActivity.getViewArgs().getTimeoutMins$3ds2sdk_release(), challengeActivity.getErrorRequestExecutor(), challengeActivity.getViewArgs().getCreqData$3ds2sdk_release());
    }

    private final ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.errorReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultErrorReporter errorReporter_delegate$lambda$1(ChallengeActivity challengeActivity) {
        Context applicationContext = challengeActivity.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new DefaultErrorReporter(applicationContext, new Stripe3ds2ErrorReporterConfig(challengeActivity.getViewArgs().getSdkTransactionId$3ds2sdk_release()), null, null, null, null, null, 0, 252, null);
    }

    public final ChallengeFragment getFragment$3ds2sdk_release() {
        return (ChallengeFragment) this.fragment.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeFragment fragment_delegate$lambda$2(ChallengeActivity challengeActivity) {
        return (ChallengeFragment) challengeActivity.getViewBinding$3ds2sdk_release().fragmentContainer.getFragment();
    }

    public final StripeChallengeFragmentBinding getFragmentViewBinding$3ds2sdk_release() {
        return (StripeChallengeFragmentBinding) this.fragmentViewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeChallengeFragmentBinding fragmentViewBinding_delegate$lambda$3(ChallengeActivity challengeActivity) {
        return challengeActivity.getFragment$3ds2sdk_release().getViewBinding$3ds2sdk_release();
    }

    public final StripeChallengeActivityBinding getViewBinding$3ds2sdk_release() {
        return (StripeChallengeActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeChallengeActivityBinding viewBinding_delegate$lambda$4(ChallengeActivity challengeActivity) {
        StripeChallengeActivityBinding stripeChallengeActivityBindingInflate = StripeChallengeActivityBinding.inflate(challengeActivity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(stripeChallengeActivityBindingInflate, "inflate(...)");
        return stripeChallengeActivityBindingInflate;
    }

    private final ChallengeActionHandler getChallengeActionHandler() {
        return (ChallengeActionHandler) this.challengeActionHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeActionHandler.Default challengeActionHandler_delegate$lambda$5(ChallengeActivity challengeActivity) {
        return new ChallengeActionHandler.Default(challengeActivity.getViewArgs().getCreqData$3ds2sdk_release(), challengeActivity.getErrorReporter(), challengeActivity.getViewArgs().getCreqExecutorFactory$3ds2sdk_release(), WORK_CONTEXT);
    }

    private final ErrorRequestExecutor getErrorRequestExecutor() {
        return (ErrorRequestExecutor) this.errorRequestExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ErrorRequestExecutor errorRequestExecutor_delegate$lambda$6(ChallengeActivity challengeActivity) {
        return new StripeErrorRequestExecutor.Factory(WORK_CONTEXT).create(challengeActivity.getViewArgs().getCreqExecutorConfig$3ds2sdk_release().getAcsUrl$3ds2sdk_release(), challengeActivity.getErrorReporter());
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$7(ChallengeActivity challengeActivity) {
        return new ChallengeActivityViewModel.Factory(challengeActivity.getChallengeActionHandler(), challengeActivity.getTransactionTimer(), challengeActivity.getErrorReporter(), WORK_CONTEXT);
    }

    private final ChallengeViewArgs getViewArgs() {
        return (ChallengeViewArgs) this.viewArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeViewArgs viewArgs_delegate$lambda$8(ChallengeActivity challengeActivity) {
        ChallengeViewArgs.Companion companion = ChallengeViewArgs.INSTANCE;
        Bundle extras = challengeActivity.getIntent().getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        Intrinsics.checkNotNull(extras);
        return companion.create(extras);
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardController keyboardController_delegate$lambda$9(ChallengeActivity challengeActivity) {
        return new KeyboardController(challengeActivity);
    }

    private final ChallengeSubmitDialogFactory getProgressDialogFactory() {
        return (ChallengeSubmitDialogFactory) this.progressDialogFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeSubmitDialogFactory progressDialogFactory_delegate$lambda$10(ChallengeActivity challengeActivity) {
        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().getUiCustomization$3ds2sdk_release());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        getSupportFragmentManager().setFragmentFactory(new ChallengeFragmentFactory(getViewArgs().getUiCustomization$3ds2sdk_release(), this.analyticsDelegate, getTransactionTimer(), getErrorRequestExecutor(), getErrorReporter(), getChallengeActionHandler(), getViewArgs().getCresData$3ds2sdk_release().getUiType(), getViewArgs().getIntentData$3ds2sdk_release(), WORK_CONTEXT));
        super.onCreate(savedInstanceState);
        getOnBackPressedDispatcher().addCallback(new OnBackPressedCallback() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity.onCreate.1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                ChallengeActivity.this.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
            }
        });
        getWindow().setFlags(8192, 8192);
        setContentView(getViewBinding$3ds2sdk_release().getRoot());
        ChallengeActivity challengeActivity = this;
        getViewModel$3ds2sdk_release().getSubmitClicked().observe(challengeActivity, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeActivity.onCreate$lambda$12(this.f$0, (ChallengeAction) obj);
            }
        }));
        getViewModel$3ds2sdk_release().getShouldFinish().observe(challengeActivity, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeActivity.onCreate$lambda$13(this.f$0, (ChallengeResult) obj);
            }
        }));
        configureHeaderZone();
        getViewModel$3ds2sdk_release().getNextScreen().observe(challengeActivity, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeActivity.onCreate$lambda$14(this.f$0, (ChallengeResponseData) obj);
            }
        }));
        if (savedInstanceState == null) {
            getViewModel$3ds2sdk_release().onNextScreen(getViewArgs().getCresData$3ds2sdk_release());
        }
        getViewModel$3ds2sdk_release().getTimeout().observe(challengeActivity, new ChallengeActivity$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeActivity.onCreate$lambda$15(this.f$0, (Boolean) obj);
            }
        }));
        this.currentChallengeResponseData = getViewArgs().getCresData$3ds2sdk_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(ChallengeActivity challengeActivity, ChallengeAction challengeAction) {
        if (!challengeActivity.isFinishing()) {
            challengeActivity.dismissKeyboard();
            Dialog dialogCreate = challengeActivity.getProgressDialogFactory().create();
            dialogCreate.show();
            challengeActivity.progressDialog = dialogCreate;
            ChallengeActivityViewModel viewModel$3ds2sdk_release = challengeActivity.getViewModel$3ds2sdk_release();
            Intrinsics.checkNotNull(challengeAction);
            viewModel$3ds2sdk_release.submit(challengeAction);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$13(ChallengeActivity challengeActivity, ChallengeResult challengeResult) {
        challengeActivity.setResult(-1, new Intent().putExtras(challengeResult.toBundle$3ds2sdk_release()));
        if (!challengeActivity.isFinishing()) {
            challengeActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$14(ChallengeActivity challengeActivity, ChallengeResponseData challengeResponseData) {
        challengeActivity.dismissDialog();
        if (challengeResponseData != null) {
            challengeActivity.startFragment(challengeResponseData);
            challengeActivity.currentChallengeResponseData = challengeResponseData;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(ChallengeActivity challengeActivity, Boolean bool) {
        UiType uiType;
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            ChallengeActivityViewModel viewModel$3ds2sdk_release = challengeActivity.getViewModel$3ds2sdk_release();
            ChallengeResponseData challengeResponseData = challengeActivity.currentChallengeResponseData;
            String code = (challengeResponseData == null || (uiType = challengeResponseData.getUiType()) == null) ? null : uiType.getCode();
            if (code == null) {
                code = "";
            }
            viewModel$3ds2sdk_release.onFinish(new ChallengeResult.Timeout(code, challengeActivity.getViewArgs().getCresData$3ds2sdk_release().getUiType(), challengeActivity.getViewArgs().getIntentData$3ds2sdk_release()));
        }
        return Unit.INSTANCE;
    }

    private final void startFragment(ChallengeResponseData cres) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction();
        fragmentTransactionBeginTransaction.setCustomAnimations(AnimationConstants.INSTANCE.getSLIDE_IN(), AnimationConstants.INSTANCE.getSLIDE_OUT(), AnimationConstants.INSTANCE.getSLIDE_IN(), AnimationConstants.INSTANCE.getSLIDE_OUT());
        fragmentTransactionBeginTransaction.replace(getViewBinding$3ds2sdk_release().fragmentContainer.getId(), ChallengeFragment.class, BundleKt.bundleOf(TuplesKt.to(ChallengeFragment.ARG_CRES, cres)));
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        getViewModel$3ds2sdk_release().onMemoryEvent();
    }

    private final void dismissKeyboard() {
        getKeyboardController().hide();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        UiType uiType;
        super.onPause();
        getViewModel$3ds2sdk_release().setShouldRefreshUi(true);
        UiType.Companion companion = UiType.INSTANCE;
        ChallengeResponseData challengeResponseData = this.currentChallengeResponseData;
        String code = (challengeResponseData == null || (uiType = challengeResponseData.getUiType()) == null) ? null : uiType.getCode();
        if (code == null) {
            code = "";
        }
        getViewModel$3ds2sdk_release().setShouldAutoSubmitOOB(companion.fromCode$3ds2sdk_release(code) == UiType.OutOfBand);
        dismissKeyboard();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getViewModel$3ds2sdk_release().getShouldAutoSubmitOOB()) {
            List<Fragment> fragments = getSupportFragmentManager().getFragments();
            Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
            Object objFirst = CollectionsKt.first((List<? extends Object>) fragments);
            Intrinsics.checkNotNull(objFirst, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.views.ChallengeFragment");
            getViewModel$3ds2sdk_release().submit(new ChallengeAction.Oob(Boolean.valueOf(((ChallengeFragment) objFirst).getChallengeZoneView().getWhitelistingSelection$3ds2sdk_release())));
            return;
        }
        if (getViewModel$3ds2sdk_release().getShouldRefreshUi()) {
            getViewModel$3ds2sdk_release().onRefreshUi();
        }
    }

    private final void configureHeaderZone() {
        final ThreeDS2Button threeDS2ButtonCustomize = new HeaderZoneCustomizer(this).customize(getViewArgs().getUiCustomization$3ds2sdk_release().getToolbarCustomization(), getViewArgs().getUiCustomization$3ds2sdk_release().getButtonCustomization(UiCustomization.ButtonType.CANCEL));
        if (threeDS2ButtonCustomize != null) {
            threeDS2ButtonCustomize.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeActivity$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeActivity.configureHeaderZone$lambda$18(threeDS2ButtonCustomize, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureHeaderZone$lambda$18(ThreeDS2Button threeDS2Button, ChallengeActivity challengeActivity, View view) {
        AnalyticsDelegate analyticsDelegate;
        threeDS2Button.setClickable(false);
        challengeActivity.getViewModel$3ds2sdk_release().submit(ChallengeAction.Cancel.INSTANCE);
        ChallengeResponseData challengeResponseData = challengeActivity.currentChallengeResponseData;
        if (challengeResponseData == null || (analyticsDelegate = challengeActivity.analyticsDelegate) == null) {
            return;
        }
        analyticsDelegate.cancelButtonTappedWithTransactionId(challengeResponseData.getServerTransId());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        dismissDialog();
    }

    private final void dismissDialog() {
        Dialog dialog = this.progressDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        this.progressDialog = null;
    }

    /* compiled from: ChallengeActivity.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$Companion;", "", "<init>", "()V", "WORK_CONTEXT", "Lkotlinx/coroutines/CoroutineDispatcher;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
