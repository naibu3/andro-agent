package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneWebViewBinding;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: ChallengeZoneWebView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u001cJ\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002J\u0010\u0010\u001f\u001a\u00020 2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0010J\u0012\u0010!\u001a\u00020 2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "webView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "getWebView", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "value", "", "userEntry", "getUserEntry", "()Ljava/lang/String;", "onClickListener", "Landroid/view/View$OnClickListener;", "getOnClickListener$3ds2sdk_release", "()Landroid/view/View$OnClickListener;", "setOnClickListener$3ds2sdk_release", "(Landroid/view/View$OnClickListener;)V", "transformHtml", "html", "transformHtml$3ds2sdk_release", "transformFormMethod", "transformFormActionUrl", "loadHtml", "", "setOnClickListener", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeZoneWebView extends FrameLayout implements FormField {
    private static final String ENCODING = "UTF-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private static final String METHOD_GET = "method=\"get\"";
    private View.OnClickListener onClickListener;
    private String userEntry;
    private final ThreeDS2WebView webView;
    private static final Companion Companion = new Companion(null);
    private static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    private static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.userEntry = "";
        StripeChallengeZoneWebViewBinding stripeChallengeZoneWebViewBindingInflate = StripeChallengeZoneWebViewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(stripeChallengeZoneWebViewBindingInflate, "inflate(...)");
        ThreeDS2WebView threeDS2WebView = stripeChallengeZoneWebViewBindingInflate.webView;
        this.webView = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new ThreeDS2WebViewClient.OnHtmlSubmitListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeZoneWebView$$ExternalSyntheticLambda0
            @Override // com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient.OnHtmlSubmitListener
            public final void onHtmlSubmit(String str) {
                ChallengeZoneWebView._init_$lambda$0(this.f$0, str);
            }
        });
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        return this.userEntry;
    }

    /* renamed from: getOnClickListener$3ds2sdk_release, reason: from getter */
    public final View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ChallengeZoneWebView challengeZoneWebView, String str) {
        if (str == null) {
            str = "";
        }
        challengeZoneWebView.userEntry = str;
        View.OnClickListener onClickListener = challengeZoneWebView.onClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(challengeZoneWebView);
        }
    }

    public final String transformHtml$3ds2sdk_release(String html) {
        Intrinsics.checkNotNullParameter(html, "html");
        return transformFormActionUrl(transformFormMethod(html));
    }

    private final String transformFormMethod(String html) {
        String strReplaceAll = PATTERN_METHOD_POST.matcher(html).replaceAll(METHOD_GET);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    private final String transformFormActionUrl(String html) {
        String strGroup;
        String str = html;
        Matcher matcher = PATTERN_FORM_ACTION.matcher(str);
        return (!matcher.find() || (strGroup = matcher.group(1)) == null || Intrinsics.areEqual(ThreeDS2WebViewClient.CHALLENGE_URL, strGroup)) ? html : new Regex(strGroup).replace(str, ThreeDS2WebViewClient.CHALLENGE_URL);
    }

    public final void loadHtml(String html) {
        if (html == null) {
            return;
        }
        this.webView.loadDataWithBaseURL(null, transformHtml$3ds2sdk_release(html), HTML_MIME_TYPE, "UTF-8", null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    /* compiled from: ChallengeZoneWebView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0018\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;", "", "<init>", "()V", "PATTERN_METHOD_POST", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "PATTERN_FORM_ACTION", "HTML_MIME_TYPE", "", "ENCODING", "METHOD_GET", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
