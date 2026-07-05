package com.qonversion.android.sdk.automations.mvp;

import android.R;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QActionResultType;
import com.qonversion.android.sdk.automations.internal.QAutomationsManager;
import com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.databinding.QFragmentScreenBinding;
import com.qonversion.android.sdk.databinding.QProgressBarBinding;
import com.qonversion.android.sdk.dto.QPurchaseModel;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.QonversionErrorCode;
import com.qonversion.android.sdk.dto.entitlements.QEntitlement;
import com.qonversion.android.sdk.internal.di.QDependencyInjector;
import com.qonversion.android.sdk.internal.di.component.DaggerFragmentComponent;
import com.qonversion.android.sdk.internal.di.module.FragmentModule;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenFragment.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0001BB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020\u001bH\u0002J\u001c\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020#H\u0002J\"\u0010%\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010)\u001a\u00020\u001bH\u0002J\b\u0010*\u001a\u00020\u001bH\u0002J$\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001bH\u0016J\u0018\u00104\u001a\u00020\u001b2\u0006\u0010'\u001a\u00020(2\u0006\u00105\u001a\u000206H\u0016J\u001a\u00107\u001a\u00020\u001b2\u0006\u00108\u001a\u00020,2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0010\u00109\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020#H\u0016J\u0010\u0010;\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020#H\u0016J\u0018\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#H\u0016J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020#H\u0016J\b\u0010A\u001a\u00020\u001bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006C"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "()V", "automationsManager", "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "getAutomationsManager$sdk_release", "()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;", "setAutomationsManager$sdk_release", "(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V", "binding", "Lcom/qonversion/android/sdk/databinding/QFragmentScreenBinding;", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "presenter", "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "getPresenter$sdk_release", "()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "setPresenter$sdk_release", "(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V", "screenProcessor", "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "getScreenProcessor$sdk_release", "()Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "setScreenProcessor$sdk_release", "(Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V", "close", "", "actionResult", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "closeAll", "configureWebClient", "confirmScreenView", "getActionResultMap", "", "", "value", "handleOnErrorCallback", "functionName", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "injectDependencies", "loadWebView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onError", "shouldCloseScreen", "", "onViewCreated", "view", "openDeepLink", "url", "openLink", "openScreen", "screenId", "htmlPage", "purchase", "productId", "restore", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScreenFragment extends Fragment implements ScreenContract.View {
    private static final String ACTION_MAP_KEY = "value";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String ENCODING = "UTF-8";
    private static final String EX_HTML_PAGE = "htmlPage";
    private static final String EX_SCREEN_ID = "screenId";
    private static final String MIME_TYPE = "text/html";

    @Inject
    public QAutomationsManager automationsManager;
    private QFragmentScreenBinding binding;
    private final ConsoleLogger logger = new ConsoleLogger();

    @Inject
    public ScreenPresenter presenter;

    @Inject
    public ScreenProcessor screenProcessor;

    public final QAutomationsManager getAutomationsManager$sdk_release() {
        QAutomationsManager qAutomationsManager = this.automationsManager;
        if (qAutomationsManager != null) {
            return qAutomationsManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("automationsManager");
        return null;
    }

    public final void setAutomationsManager$sdk_release(QAutomationsManager qAutomationsManager) {
        Intrinsics.checkNotNullParameter(qAutomationsManager, "<set-?>");
        this.automationsManager = qAutomationsManager;
    }

    public final ScreenPresenter getPresenter$sdk_release() {
        ScreenPresenter screenPresenter = this.presenter;
        if (screenPresenter != null) {
            return screenPresenter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    public final void setPresenter$sdk_release(ScreenPresenter screenPresenter) {
        Intrinsics.checkNotNullParameter(screenPresenter, "<set-?>");
        this.presenter = screenPresenter;
    }

    public final ScreenProcessor getScreenProcessor$sdk_release() {
        ScreenProcessor screenProcessor = this.screenProcessor;
        if (screenProcessor != null) {
            return screenProcessor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screenProcessor");
        return null;
    }

    public final void setScreenProcessor$sdk_release(ScreenProcessor screenProcessor) {
        Intrinsics.checkNotNullParameter(screenProcessor, "<set-?>");
        this.screenProcessor = screenProcessor;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        QFragmentScreenBinding qFragmentScreenBindingInflate = QFragmentScreenBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(qFragmentScreenBindingInflate, "inflate(...)");
        this.binding = qFragmentScreenBindingInflate;
        RelativeLayout root = qFragmentScreenBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        injectDependencies();
        configureWebClient();
        loadWebView();
        confirmScreenView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openScreen(String screenId, String htmlPage) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        Intrinsics.checkNotNullParameter(htmlPage, "htmlPage");
        QActionResult qActionResult = new QActionResult(QActionResultType.Navigation, getActionResultMap(screenId));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.qonversion.android.sdk.automations.mvp.ScreenActivity");
            ScreenActivity.showScreen$sdk_release$default((ScreenActivity) activity, screenId, htmlPage, false, 4, null);
            getAutomationsManager$sdk_release().automationsDidFinishExecuting(qActionResult);
        } catch (Exception unused) {
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openLink(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        QActionResult qActionResult = new QActionResult(QActionResultType.Url, getActionResultMap(url));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            getAutomationsManager$sdk_release().automationsDidFinishExecuting(qActionResult);
        } catch (ActivityNotFoundException unused) {
            this.logger.error("Couldn't find any Activity to handle the Intent with url " + url);
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void openDeepLink(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        QActionResult qActionResult = new QActionResult(QActionResultType.DeepLink, getActionResultMap(url));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            close(new QActionResult(QActionResultType.DeepLink, getActionResultMap(url)));
        } catch (ActivityNotFoundException unused) {
            this.logger.error("Couldn't find any Activity to handle the Intent with deeplink " + url);
            getAutomationsManager$sdk_release().automationsDidFailExecuting(qActionResult);
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void purchase(String productId) {
        QProgressBarBinding qProgressBarBinding;
        Intrinsics.checkNotNullParameter(productId, "productId");
        final QActionResult qActionResult = new QActionResult(QActionResultType.Purchase, getActionResultMap(productId));
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Qonversion.INSTANCE.getSharedInstance().purchase(activity, new QPurchaseModel(productId, null, 2, null), new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$purchase$1$1
                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onSuccess(Map<String, QEntitlement> entitlements) {
                    Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                    this.this$0.close(qActionResult);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    ScreenFragment screenFragment = this.this$0;
                    Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$purchase$1$1$onError$1
                    }.getClass().getEnclosingMethod();
                    screenFragment.handleOnErrorCallback(enclosingMethod != null ? enclosingMethod.getName() : null, error, qActionResult);
                }
            });
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void restore() {
        QProgressBarBinding qProgressBarBinding;
        ProgressBar progressBar = null;
        final QActionResult qActionResult = new QActionResult(QActionResultType.Restore, null, 2, null);
        getAutomationsManager$sdk_release().automationsDidStartExecuting(qActionResult);
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        if (qFragmentScreenBinding != null && (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) != null) {
            progressBar = qProgressBarBinding.progressBar;
        }
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        Qonversion.INSTANCE.getSharedInstance().restore(new QonversionEntitlementsCallback() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment.restore.1
            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onSuccess(Map<String, QEntitlement> entitlements) {
                Intrinsics.checkNotNullParameter(entitlements, "entitlements");
                ScreenFragment.this.close(qActionResult);
            }

            @Override // com.qonversion.android.sdk.listeners.QonversionEntitlementsCallback
            public void onError(QonversionError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                ScreenFragment screenFragment = ScreenFragment.this;
                Method enclosingMethod = new Object() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$restore$1$onError$1
                }.getClass().getEnclosingMethod();
                screenFragment.handleOnErrorCallback(enclosingMethod != null ? enclosingMethod.getName() : null, error, qActionResult);
            }
        });
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void close(QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        ScreenActivity screenActivity = activity instanceof ScreenActivity ? (ScreenActivity) activity : null;
        boolean zGoBack$sdk_release = screenActivity != null ? screenActivity.goBack$sdk_release() : false;
        getAutomationsManager$sdk_release().automationsDidFinishExecuting(actionResult);
        if (zGoBack$sdk_release) {
            getAutomationsManager$sdk_release().automationsFinished();
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void closeAll(QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        Intrinsics.checkNotNullParameter(actionResult, "actionResult");
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        getAutomationsManager$sdk_release().automationsDidFinishExecuting(actionResult);
        getAutomationsManager$sdk_release().automationsFinished();
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.View
    public void onError(QonversionError error, final boolean shouldCloseScreen) {
        Intrinsics.checkNotNullParameter(error, "error");
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("Failed to show the in-app screen");
        builder.setMessage(error.getDescription());
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ScreenFragment.onError$lambda$1(shouldCloseScreen, this, dialogInterface, i);
            }
        });
        builder.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(boolean z, ScreenFragment this$0, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z) {
            ScreenContract.View.DefaultImpls.close$default(this$0, null, 1, null);
        }
    }

    private final void configureWebClient() {
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        WebView webView = qFragmentScreenBinding != null ? qFragmentScreenBinding.webView : null;
        if (webView == null) {
            return;
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment.configureWebClient.1
            @Override // android.webkit.WebViewClient
            @Deprecated(message = "Deprecated since API 24", replaceWith = @ReplaceWith(expression = "", imports = {}))
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                return ScreenFragment.this.getPresenter$sdk_release().shouldOverrideUrlLoading(url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                QProgressBarBinding qProgressBarBinding;
                QFragmentScreenBinding qFragmentScreenBinding2 = ScreenFragment.this.binding;
                ProgressBar progressBar = (qFragmentScreenBinding2 == null || (qProgressBarBinding = qFragmentScreenBinding2.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                super.onPageFinished(view, url);
            }
        });
    }

    private final void injectDependencies() {
        DaggerFragmentComponent.builder().appComponent(QDependencyInjector.INSTANCE.getAppComponent$sdk_release()).fragmentModule(new FragmentModule(this)).build().inject(this);
    }

    private final void loadWebView() {
        Bundle arguments = getArguments();
        Unit unit = null;
        String string = arguments != null ? arguments.getString("htmlPage") : null;
        if (string != null) {
            getScreenProcessor$sdk_release().processScreen(string, new Function1<String, Unit>() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$loadWebView$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String macrosHtml) {
                    WebView webView;
                    Intrinsics.checkNotNullParameter(macrosHtml, "macrosHtml");
                    QFragmentScreenBinding qFragmentScreenBinding = this.this$0.binding;
                    if (qFragmentScreenBinding == null || (webView = qFragmentScreenBinding.webView) == null) {
                        return;
                    }
                    webView.loadDataWithBaseURL(null, macrosHtml, "text/html", "UTF-8", null);
                }
            }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenFragment$loadWebView$1$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                    invoke2(qonversionError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    this.this$0.logger.error("loadWebView() -> Failed to process screen macros " + error.getDescription());
                    this.this$0.onError(error, true);
                }
            });
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.logger.error("loadWebView() -> Failed to fetch html page for the app screen");
            onError(new QonversionError(QonversionErrorCode.Unknown, null, null, 6, null), true);
        }
    }

    private final void confirmScreenView() {
        Bundle arguments = getArguments();
        Unit unit = null;
        String string = arguments != null ? arguments.getString("screenId") : null;
        if (string != null) {
            getAutomationsManager$sdk_release().automationsDidShowScreen(string);
            getPresenter$sdk_release().confirmScreenView(string);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            this.logger.debug("confirmScreenView() -> Failed to confirm screen view");
        }
    }

    private final Map<String, String> getActionResultMap(String value) {
        return MapsKt.mutableMapOf(TuplesKt.to("value", value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnErrorCallback(String functionName, QonversionError error, QActionResult actionResult) {
        QProgressBarBinding qProgressBarBinding;
        QFragmentScreenBinding qFragmentScreenBinding = this.binding;
        ProgressBar progressBar = (qFragmentScreenBinding == null || (qProgressBarBinding = qFragmentScreenBinding.progressBarLayout) == null) ? null : qProgressBarBinding.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        this.logger.error("ScreenActivity " + functionName + " -> " + error + ".description");
        actionResult.setError(error);
        getAutomationsManager$sdk_release().automationsDidFailExecuting(actionResult);
    }

    /* compiled from: ScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment$Companion;", "", "()V", "ACTION_MAP_KEY", "", "ENCODING", "EX_HTML_PAGE", "EX_SCREEN_ID", "MIME_TYPE", "getArguments", "Landroid/os/Bundle;", "screenId", "htmlPage", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Bundle getArguments(String screenId, String htmlPage) {
            Bundle bundle = new Bundle();
            bundle.putString("screenId", screenId);
            bundle.putString("htmlPage", htmlPage);
            return bundle;
        }
    }
}
