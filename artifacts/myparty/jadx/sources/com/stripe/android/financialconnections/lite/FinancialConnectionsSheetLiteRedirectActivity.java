package com.stripe.android.financialconnections.lite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetLiteRedirectActivity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u000e\u0010\b\u001a\u0004\u0018\u00010\t*\u00020\nH\u0002J\f\u0010\u000b\u001a\u00020\f*\u00020\nH\u0002¨\u0006\r"}, d2 = {"Lcom/stripe/android/financialconnections/lite/FinancialConnectionsSheetLiteRedirectActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "toIntent", "Landroid/content/Intent;", "Landroid/net/Uri;", "isFinancialConnectionsScheme", "", "financial-connections-lite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetLiteRedirectActivity extends ComponentActivity {
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Intent intent;
        Intent flags;
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data == null || (intent = toIntent(data)) == null || (flags = intent.setFlags(603979776)) == null) {
            return;
        }
        flags.setData(data);
        startActivity(flags);
    }

    private final Intent toIntent(Uri uri) {
        Class cls = !isFinancialConnectionsScheme(uri) ? null : FinancialConnectionsSheetLiteActivity.class;
        if (cls != null) {
            return new Intent(this, cls);
        }
        return null;
    }

    private final boolean isFinancialConnectionsScheme(Uri uri) {
        return Intrinsics.areEqual(uri.getScheme(), "stripe");
    }
}
