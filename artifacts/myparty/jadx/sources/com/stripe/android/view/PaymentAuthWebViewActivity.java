package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.StripePaymentAuthWebViewActivityBinding;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.core.analytics.ErrorReporter;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: PaymentAuthWebViewActivity.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\u0017\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u001aH\u0014J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\u001aH\u0002J\b\u0010*\u001a\u00020\u001aH\u0002J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017¨\u0006/"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewBinding", "Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripePaymentAuthWebViewActivityBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "_args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "get_args", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args$delegate", "logger", "Lcom/stripe/android/core/Logger;", "getLogger", "()Lcom/stripe/android/core/Logger;", "logger$delegate", "viewModel", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "getViewModel", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onAuthComplete", "error", "", "onAuthComplete$payments_core_release", "onDestroy", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "cancelIntentSource", "customizeToolbar", "createResultIntent", "Landroid/content/Intent;", "paymentFlowResult", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentAuthWebViewActivity extends AppCompatActivity {
    public static final int $stable = 8;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentAuthWebViewActivity.viewBinding_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: _args$delegate, reason: from kotlin metadata */
    private final Lazy _args = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentAuthWebViewActivity._args_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final Lazy logger = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PaymentAuthWebViewActivity.logger_delegate$lambda$2(this.f$0);
        }
    });

    public PaymentAuthWebViewActivity() {
        final PaymentAuthWebViewActivity paymentAuthWebViewActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PaymentAuthWebViewActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return paymentAuthWebViewActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentAuthWebViewActivity.viewModel_delegate$lambda$3(this.f$0);
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? paymentAuthWebViewActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StripePaymentAuthWebViewActivityBinding getViewBinding() {
        return (StripePaymentAuthWebViewActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripePaymentAuthWebViewActivityBinding viewBinding_delegate$lambda$0(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        StripePaymentAuthWebViewActivityBinding stripePaymentAuthWebViewActivityBindingInflate = StripePaymentAuthWebViewActivityBinding.inflate(paymentAuthWebViewActivity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(stripePaymentAuthWebViewActivityBindingInflate, "inflate(...)");
        return stripePaymentAuthWebViewActivityBindingInflate;
    }

    private final PaymentBrowserAuthContract.Args get_args() {
        return (PaymentBrowserAuthContract.Args) this._args.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentBrowserAuthContract.Args _args_delegate$lambda$1(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.INSTANCE;
        Intent intent = paymentAuthWebViewActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        return companion.parseArgs$payments_core_release(intent);
    }

    private final Logger getLogger() {
        return (Logger) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Logger logger_delegate$lambda$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        Logger.Companion companion = Logger.INSTANCE;
        PaymentBrowserAuthContract.Args args = paymentAuthWebViewActivity.get_args();
        boolean z = false;
        if (args != null && args.getEnableLogging()) {
            z = true;
        }
        return companion.getInstance(z);
    }

    private final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$3(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        Application application = paymentAuthWebViewActivity.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        Logger logger = paymentAuthWebViewActivity.getLogger();
        PaymentBrowserAuthContract.Args args = paymentAuthWebViewActivity.get_args();
        if (args != null) {
            return new PaymentAuthWebViewActivityViewModel.Factory(application, logger, args);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PaymentBrowserAuthContract.Args args = get_args();
        if (args == null) {
            setResult(0);
            finish();
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.AUTH_WEB_VIEW_NULL_ARGS, null, null, 6, null);
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        customizeToolbar();
        OnBackPressedDispatcherKt.addCallback$default(getOnBackPressedDispatcher(), null, false, new Function1() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentAuthWebViewActivity.onCreate$lambda$4(this.f$0, (OnBackPressedCallback) obj);
            }
        }, 3, null);
        String clientSecret = args.getClientSecret();
        setResult(-1, createResultIntent(getViewModel().getPaymentResult$payments_core_release()));
        if (StringsKt.isBlank(clientSecret)) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            ErrorReporter.Companion companion2 = ErrorReporter.INSTANCE;
            Context applicationContext2 = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion2, applicationContext2, null, 2, null), ErrorReporter.UnexpectedErrorEvent.AUTH_WEB_VIEW_BLANK_CLIENT_SECRET, null, null, 6, null);
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(false);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(MutableStateFlow, this, null), 3, null);
        final PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), MutableStateFlow, clientSecret, args.getReturnUrl(), new PaymentAuthWebViewActivity$onCreate$webViewClient$1(this), new PaymentAuthWebViewActivity$onCreate$webViewClient$2(this));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new Function0() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentAuthWebViewActivity.onCreate$lambda$5(paymentAuthWebViewClient);
            }
        });
        getViewBinding().webView.setWebViewClient(paymentAuthWebViewClient);
        getViewBinding().webView.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        getViewModel().logStart();
        getViewBinding().webView.loadUrl(args.getUrl(), getViewModel().getExtraHeaders());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(PaymentAuthWebViewActivity paymentAuthWebViewActivity, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        if (paymentAuthWebViewActivity.getViewBinding().webView.canGoBack()) {
            paymentAuthWebViewActivity.getViewBinding().webView.goBack();
        } else {
            paymentAuthWebViewActivity.cancelIntentSource();
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PaymentAuthWebViewActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$2", f = "PaymentAuthWebViewActivity.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.view.PaymentAuthWebViewActivity$onCreate$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableStateFlow<Boolean> $isPagedLoaded;
        int label;
        final /* synthetic */ PaymentAuthWebViewActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MutableStateFlow<Boolean> mutableStateFlow, PaymentAuthWebViewActivity paymentAuthWebViewActivity, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isPagedLoaded = mutableStateFlow;
            this.this$0 = paymentAuthWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$isPagedLoaded, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableStateFlow<Boolean> mutableStateFlow = this.$isPagedLoaded;
                final PaymentAuthWebViewActivity paymentAuthWebViewActivity = this.this$0;
                this.label = 1;
                if (mutableStateFlow.collect(new FlowCollector() { // from class: com.stripe.android.view.PaymentAuthWebViewActivity.onCreate.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        if (z) {
                            CircularProgressIndicator progressBar = paymentAuthWebViewActivity.getViewBinding().progressBar;
                            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                            progressBar.setVisibility(8);
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(PaymentAuthWebViewClient paymentAuthWebViewClient) {
        paymentAuthWebViewClient.setHasLoadedBlank$payments_core_release(true);
        return Unit.INSTANCE;
    }

    public final void onAuthComplete$payments_core_release(Throwable error) {
        if (error != null) {
            ErrorReporter.Companion companion = ErrorReporter.INSTANCE;
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ErrorReporter.DefaultImpls.report$default(ErrorReporter.Companion.createFallbackInstance$default(companion, applicationContext, null, 2, null), ErrorReporter.ExpectedErrorEvent.AUTH_WEB_VIEW_FAILURE, StripeException.INSTANCE.create(error), null, 4, null);
            getViewModel().logError();
            setResult(-1, createResultIntent(PaymentFlowResult.Unvalidated.copy$default(getViewModel().getPaymentResult$payments_core_release(), null, 2, StripeException.INSTANCE.create(error), true, null, null, null, 113, null)));
        } else {
            getViewModel().logComplete();
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.stripe_payment_auth_web_view_menu, menu);
        String buttonText$payments_core_release = getViewModel().getButtonText();
        if (buttonText$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            menu.findItem(R.id.action_close).setTitle(buttonText$payments_core_release);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (item.getItemId() == R.id.action_close) {
            cancelIntentSource();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private final void cancelIntentSource() {
        setResult(-1, getViewModel().getCancellationResult$payments_core_release());
        finish();
    }

    private final void customizeToolbar() {
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitle$payments_core_release = getViewModel().getToolbarTitle();
        if (toolbarTitle$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            getViewBinding().toolbar.setTitle(CustomizeUtils.INSTANCE.buildStyledText(this, toolbarTitle$payments_core_release.getText$payments_core_release(), toolbarTitle$payments_core_release.getToolbarCustomization$payments_core_release()));
        }
        String toolbarBackgroundColor$payments_core_release = getViewModel().getToolbarBackgroundColor();
        if (toolbarBackgroundColor$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int color = Color.parseColor(toolbarBackgroundColor$payments_core_release);
            getViewBinding().toolbar.setBackgroundColor(color);
            CustomizeUtils.INSTANCE.setStatusBarColor(this, color);
        }
    }

    private final Intent createResultIntent(PaymentFlowResult.Unvalidated paymentFlowResult) {
        Intent intentPutExtras = new Intent().putExtras(paymentFlowResult.toBundle());
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        return intentPutExtras;
    }
}
