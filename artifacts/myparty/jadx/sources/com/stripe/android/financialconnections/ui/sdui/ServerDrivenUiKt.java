package com.stripe.android.financialconnections.ui.sdui;

import android.text.Html;
import android.text.Spanned;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerDrivenUi.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"fromHtml", "Landroid/text/Spanned;", "source", "", "rememberHtml", "Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "html", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServerDrivenUiKt {
    public static final Spanned fromHtml(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Spanned spannedFromHtml = Html.fromHtml(source, 0);
        Intrinsics.checkNotNull(spannedFromHtml);
        return spannedFromHtml;
    }

    public static final TextResource.Text rememberHtml(String html, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(html, "html");
        composer.startReplaceGroup(1858689687);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1858689687, i, -1, "com.stripe.android.financialconnections.ui.sdui.rememberHtml (ServerDrivenUi.kt:45)");
        }
        composer.startReplaceGroup(-482641686);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(html)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new TextResource.Text(fromHtml(html));
            composer.updateRememberedValue(objRememberedValue);
        }
        TextResource.Text text = (TextResource.Text) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return text;
    }
}
