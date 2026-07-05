package com.stripe.android.link;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkForegroundActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0014J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0014J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/LinkForegroundActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "hasLaunchedPopup", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "onNewIntent", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "onResume", "handleRedirectIfAvailable", "launchPopup", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkForegroundActivity extends AppCompatActivity {
    public static final String ACTION_REDIRECT = "LinkForegroundActivity.redirect";
    public static final String EXTRA_FAILURE = "LinkFailure";
    public static final String EXTRA_POPUP_URL = "LinkPopupUrl";
    public static final int RESULT_COMPLETE = 49871;
    public static final int RESULT_FAILURE = 91367;
    private static final String SAVED_STATE_HAS_LAUNCHED_POPUP = "LinkHasLaunchedPopup";
    private boolean hasLaunchedPopup;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: LinkForegroundActivity.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/link/LinkForegroundActivity$Companion;", "", "<init>", "()V", "ACTION_REDIRECT", "", "EXTRA_POPUP_URL", "EXTRA_FAILURE", "RESULT_COMPLETE", "", "RESULT_FAILURE", "SAVED_STATE_HAS_LAUNCHED_POPUP", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "popupUrl", "redirectIntent", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, String popupUrl) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(popupUrl, "popupUrl");
            Intent intentPutExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra(LinkForegroundActivity.EXTRA_POPUP_URL, popupUrl);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final Intent redirectIntent(Context context, Uri uri) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) LinkForegroundActivity.class);
            intent.setAction(LinkForegroundActivity.ACTION_REDIRECT);
            intent.setData(uri);
            intent.addFlags(603979776);
            return intent;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.hasLaunchedPopup = savedInstanceState != null ? savedInstanceState.getBoolean(SAVED_STATE_HAS_LAUNCHED_POPUP) : false;
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        handleRedirectIfAvailable(intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(SAVED_STATE_HAS_LAUNCHED_POPUP, this.hasLaunchedPopup);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        handleRedirectIfAvailable(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        if (this.hasLaunchedPopup) {
            setResult(0);
            finish();
        } else {
            launchPopup();
        }
    }

    private final void handleRedirectIfAvailable(Intent intent) {
        if (Intrinsics.areEqual(intent.getAction(), ACTION_REDIRECT)) {
            setResult(RESULT_COMPLETE, intent);
            finish();
        }
    }

    private final void launchPopup() {
        String string;
        this.hasLaunchedPopup = true;
        Bundle extras = getIntent().getExtras();
        Uri uri = (extras == null || (string = extras.getString(EXTRA_POPUP_URL)) == null) ? null : Uri.parse(string);
        if (uri == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            new CustomTabsIntent.Builder().setShareState(2).build().launchUrl(this, uri);
        } catch (ActivityNotFoundException e) {
            setResult(RESULT_FAILURE, new Intent().putExtra(EXTRA_FAILURE, e));
            finish();
        }
    }
}
