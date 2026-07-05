package com.stripe.android.financialconnections.lite;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgsKt;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.lite.FinancialConnectionsLiteViewModel;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: FinancialConnectionsSheetLiteActivity.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0015J\b\u0010\u0012\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0003J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "webView", "Landroid/webkit/WebView;", "progressBar", "Landroid/widget/ProgressBar;", "viewModel", "Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;", "getViewModel", "()Lcom/stripe/android/financialconnections/lite/FinancialConnectionsLiteViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupBackButtonHandling", "setupProgressBar", "setupWebView", "openCustomTab", ShareConstants.MEDIA_URI, "", "handleUrl", "", "Landroid/net/Uri;", "finishWithResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "Companion", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetLiteActivity extends ComponentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ProgressBar progressBar;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private WebView webView;

    /* compiled from: FinancialConnectionsSheetLiteActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSheetFlowType.values().length];
            try {
                iArr[FinancialConnectionsSheetFlowType.ForData.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForToken.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSheetFlowType.ForInstantDebits.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FinancialConnectionsSheetLiteActivity() {
        super(R.layout.stripe_activity_lite);
        final FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = this;
        final Function0 function0 = null;
        this.viewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(FinancialConnectionsLiteViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return financialConnectionsSheetLiteActivity.getViewModelStore();
            }
        }, new Function0() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FinancialConnectionsSheetLiteActivity.viewModel_delegate$lambda$0();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? financialConnectionsSheetLiteActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FinancialConnectionsLiteViewModel getViewModel() {
        return (FinancialConnectionsLiteViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$0() {
        return new FinancialConnectionsLiteViewModel.Factory();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stripe_activity_lite);
        this.webView = (WebView) findViewById(R.id.webView);
        this.progressBar = (ProgressBar) findViewById(R.id.progressBar);
        setupProgressBar();
        setupWebView();
        setupBackButtonHandling();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* compiled from: FinancialConnectionsSheetLiteActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$onCreate$1", f = "FinancialConnectionsSheetLiteActivity.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$onCreate$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FinancialConnectionsSheetLiteActivity.this.new AnonymousClass1(continuation);
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
                SharedFlow<FinancialConnectionsLiteViewModel.ViewEffect> viewEffects = FinancialConnectionsSheetLiteActivity.this.getViewModel().getViewEffects();
                final FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = FinancialConnectionsSheetLiteActivity.this;
                this.label = 1;
                if (viewEffects.collect(new FlowCollector() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity.onCreate.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((FinancialConnectionsLiteViewModel.ViewEffect) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(FinancialConnectionsLiteViewModel.ViewEffect viewEffect, Continuation<? super Unit> continuation) {
                        if (viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl) {
                            WebView webView = financialConnectionsSheetLiteActivity.webView;
                            if (webView == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("webView");
                                webView = null;
                            }
                            webView.loadUrl(((FinancialConnectionsLiteViewModel.ViewEffect.OpenAuthFlowWithUrl) viewEffect).getUrl());
                        } else if (viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult) {
                            financialConnectionsSheetLiteActivity.finishWithResult(((FinancialConnectionsLiteViewModel.ViewEffect.FinishWithResult) viewEffect).getResult());
                        } else if (viewEffect instanceof FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab) {
                            financialConnectionsSheetLiteActivity.openCustomTab(((FinancialConnectionsLiteViewModel.ViewEffect.OpenCustomTab) viewEffect).getUrl());
                        } else {
                            throw new NoWhenBranchMatchedException();
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

    private final void setupBackButtonHandling() {
        getOnBackPressedDispatcher().addCallback(this, new C09801());
    }

    /* compiled from: FinancialConnectionsSheetLiteActivity.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1", "Landroidx/activity/OnBackPressedCallback;", "handleOnBackPressed", "", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1, reason: invalid class name and case insensitive filesystem */
    public static final class C09801 extends OnBackPressedCallback {
        C09801() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            AlertDialog.Builder cancelable = new AlertDialog.Builder(FinancialConnectionsSheetLiteActivity.this).setTitle(R.string.stripe_fc_lite_exit_title).setMessage(R.string.stripe_fc_lite_exit_message).setCancelable(true);
            int i = R.string.stripe_fc_lite_exit_confirm;
            final FinancialConnectionsSheetLiteActivity financialConnectionsSheetLiteActivity = FinancialConnectionsSheetLiteActivity.this;
            cancelable.setPositiveButton(i, new DialogInterface.OnClickListener() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    financialConnectionsSheetLiteActivity.finish();
                }
            }).setNegativeButton(R.string.stripe_fc_lite_exit_cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$setupBackButtonHandling$1$$ExternalSyntheticLambda1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            }).create().show();
        }
    }

    private final void setupProgressBar() {
        int i;
        Companion companion = INSTANCE;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        FinancialConnectionsSheetActivityArgs args = companion.getArgs(intent);
        ProgressBar progressBar = null;
        FinancialConnectionsSheetFlowType flowType = args != null ? FinancialConnectionsSheetActivityArgsKt.getFlowType(args) : null;
        int i2 = flowType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[flowType.ordinal()];
        if (i2 == -1 || i2 == 1 || i2 == 2) {
            i = R.color.stripe_financial_connections;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.color.stripe_link;
        }
        int color = ContextCompat.getColor(this, i);
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar2 = null;
        }
        progressBar2.getProgressDrawable().setTint(color);
        ProgressBar progressBar3 = this.progressBar;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
            progressBar3 = null;
        }
        progressBar3.getIndeterminateDrawable().setTint(color);
        ProgressBar progressBar4 = this.progressBar;
        if (progressBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressBar");
        } else {
            progressBar = progressBar4;
        }
        progressBar.setVisibility(0);
    }

    private final WebView setupWebView() {
        WebView webView = this.webView;
        if (webView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webView");
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$setupWebView$1$1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                ProgressBar progressBar = this.this$0.progressBar;
                ProgressBar progressBar2 = null;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                    progressBar = null;
                }
                progressBar.setVisibility(newProgress < 100 ? 0 : 8);
                ProgressBar progressBar3 = this.this$0.progressBar;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressBar");
                } else {
                    progressBar2 = progressBar3;
                }
                progressBar2.setProgress(newProgress);
            }
        });
        webView.setWebViewClient(new WebViewClient() { // from class: com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity$setupWebView$1$2
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return this.this$0.handleUrl(request != null ? request.getUrl() : null);
            }
        });
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCustomTab(String uri) {
        new CustomTabsIntent.Builder().setShowTitle(true).setShareState(2).setBookmarksButtonEnabled(false).build().launchUrl(this, Uri.parse(uri));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleUrl(Uri uri) {
        if (uri == null) {
            return false;
        }
        FinancialConnectionsLiteViewModel viewModel = getViewModel();
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        viewModel.m7499handleUrlIoAF18A(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(FinancialConnectionsSheetActivityResult result) {
        setResult(-1, new Intent().putExtras(result.toBundle()));
        finish();
    }

    /* compiled from: FinancialConnectionsSheetLiteActivity.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteActivity$Companion;", "", "<init>", "()V", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "context", "Landroid/content/Context;", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "getArgs", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent intent(Context context, FinancialConnectionsSheetActivityArgs args) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(args, "args");
            Intent intent = new Intent(context, (Class<?>) FinancialConnectionsSheetLiteActivity.class);
            intent.addFlags(65536);
            intent.putExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS, args);
            return intent;
        }

        public final FinancialConnectionsSheetActivityArgs getArgs(Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return (FinancialConnectionsSheetActivityArgs) intent.getParcelableExtra(FinancialConnectionsSheetActivityArgs.EXTRA_ARGS);
        }
    }
}
