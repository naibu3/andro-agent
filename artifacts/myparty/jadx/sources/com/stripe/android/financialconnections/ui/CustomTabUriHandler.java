package com.stripe.android.financialconnections.ui;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.platform.UriHandler;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.browser.BrowserManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomTabUriHandler.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/ui/CustomTabUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "context", "Landroid/content/Context;", "browserManager", "Lcom/stripe/android/financialconnections/browser/BrowserManager;", "<init>", "(Landroid/content/Context;Lcom/stripe/android/financialconnections/browser/BrowserManager;)V", "openUri", "", ShareConstants.MEDIA_URI, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomTabUriHandler implements UriHandler {
    public static final int $stable = 8;
    private final BrowserManager browserManager;
    private final Context context;

    public CustomTabUriHandler(Context context, BrowserManager browserManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(browserManager, "browserManager");
        this.context = context;
        this.browserManager = browserManager;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public void openUri(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Context context = this.context;
        BrowserManager browserManager = this.browserManager;
        Uri uri2 = Uri.parse(uri);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        context.startActivity(browserManager.createBrowserIntentForUrl(uri2));
    }
}
