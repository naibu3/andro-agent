package com.stripe.android.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.R;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentAuthWebChromeClient.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebChromeClient;", "Landroid/webkit/WebChromeClient;", "activity", "Landroid/app/Activity;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Landroid/app/Activity;Lcom/stripe/android/core/Logger;)V", "onConsoleMessage", "", "consoleMessage", "Landroid/webkit/ConsoleMessage;", "onJsConfirm", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "message", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Landroid/webkit/JsResult;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentAuthWebChromeClient extends WebChromeClient {
    public static final int $stable = 8;
    private final Activity activity;
    private final Logger logger;

    public PaymentAuthWebChromeClient(Activity activity, Logger logger) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.activity = activity;
        this.logger = logger;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage != null && (strMessage = consoleMessage.message()) != null) {
            this.logger.debug(strMessage);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        new AlertDialog.Builder(this.activity, R.style.StripeAlertDialogStyle).setMessage(message).setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.PaymentAuthWebChromeClient$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PaymentAuthWebChromeClient.onJsConfirm$lambda$0(result, dialogInterface, i);
            }
        }).setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.stripe.android.view.PaymentAuthWebChromeClient$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PaymentAuthWebChromeClient.onJsConfirm$lambda$1(result, dialogInterface, i);
            }
        }).create().show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$0(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onJsConfirm$lambda$1(JsResult jsResult, DialogInterface dialogInterface, int i) {
        if (jsResult != null) {
            jsResult.cancel();
        }
    }
}
