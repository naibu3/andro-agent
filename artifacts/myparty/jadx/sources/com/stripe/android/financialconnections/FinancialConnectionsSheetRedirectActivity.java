package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.debug.DebugConfiguration;
import com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedComponentHolder;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: FinancialConnectionsSheetRedirectActivity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\f\u001a\u00020\n*\u00020\nH\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\nH\u0002¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "toIntent", "Landroid/content/Intent;", "Landroid/net/Uri;", "overrideWithDebugConfiguration", "overrideIfIntegrityFailed", "isFinancialConnectionsScheme", "", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetRedirectActivity extends AppCompatActivity {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final String HOST_AUTH_REDIRECT = "auth-redirect";
    private static final String HOST_LINK_ACCOUNTS = "link-accounts";
    private static final String HOST_NATIVE_LINK_ACCOUNTS = "link-native-accounts";
    private static final String HOST_NATIVE_REDIRECT = "native-redirect";

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Uri uriOverrideIfIntegrityFailed;
        Intent intent;
        Intent flags;
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data != null && (intent = toIntent((uriOverrideIfIntegrityFailed = overrideIfIntegrityFailed(overrideWithDebugConfiguration(data))))) != null && (flags = intent.setFlags(603979776)) != null) {
            flags.setData(uriOverrideIfIntegrityFailed);
            startActivity(flags);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Intent toIntent(Uri uri) {
        Class cls;
        if (isFinancialConnectionsScheme(uri)) {
            if (Intrinsics.areEqual(uri.getHost(), HOST_AUTH_REDIRECT) || Intrinsics.areEqual(uri.getHost(), HOST_NATIVE_LINK_ACCOUNTS)) {
                cls = FinancialConnectionsSheetNativeActivity.class;
            } else {
                cls = (Intrinsics.areEqual(uri.getHost(), HOST_LINK_ACCOUNTS) || Intrinsics.areEqual(uri.getHost(), HOST_NATIVE_REDIRECT)) ? FinancialConnectionsSheetActivity.class : null;
            }
        }
        if (cls != null) {
            return new Intent(this, (Class<?>) cls);
        }
        return null;
    }

    private final Uri overrideWithDebugConfiguration(Uri uri) {
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        Boolean overriddenNative$financial_connections_release = new DebugConfiguration(application).getOverriddenNative$financial_connections_release();
        if (Intrinsics.areEqual((Object) overriddenNative$financial_connections_release, (Object) true)) {
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Uri uri2 = Uri.parse(StringsKt.replace$default(string, HOST_LINK_ACCOUNTS, HOST_NATIVE_LINK_ACCOUNTS, false, 4, (Object) null));
            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
            return uri2;
        }
        if (!Intrinsics.areEqual((Object) overriddenNative$financial_connections_release, (Object) false)) {
            if (overriddenNative$financial_connections_release == null) {
                return uri;
            }
            throw new NoWhenBranchMatchedException();
        }
        String string2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Uri uri3 = Uri.parse(StringsKt.replace$default(string2, HOST_NATIVE_LINK_ACCOUNTS, HOST_LINK_ACCOUNTS, false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
        return uri3;
    }

    private final Uri overrideIfIntegrityFailed(Uri uri) {
        FinancialConnectionsSingletonSharedComponentHolder financialConnectionsSingletonSharedComponentHolder = FinancialConnectionsSingletonSharedComponentHolder.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        if (!financialConnectionsSingletonSharedComponentHolder.getComponent(application).integrityVerdictManager().getVerdictFailed()) {
            return uri;
        }
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Uri uri2 = Uri.parse(StringsKt.replace$default(string, HOST_NATIVE_LINK_ACCOUNTS, HOST_LINK_ACCOUNTS, false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        return uri2;
    }

    private final boolean isFinancialConnectionsScheme(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "stripe-auth") || Intrinsics.areEqual(uri.getScheme(), "stripe");
    }

    /* compiled from: FinancialConnectionsSheetRedirectActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity$Companion;", "", "<init>", "()V", "HOST_NATIVE_LINK_ACCOUNTS", "", "HOST_LINK_ACCOUNTS", "HOST_NATIVE_REDIRECT", "HOST_AUTH_REDIRECT", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
