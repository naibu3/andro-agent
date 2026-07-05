package com.stripe.android.shoppay;

import android.webkit.WebView;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayActivity.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ShopPayActivity$eceWebView$2$4 extends FunctionReferenceImpl implements Function2<WebView, String, Unit> {
    ShopPayActivity$eceWebView$2$4(Object obj) {
        super(2, obj, ShopPayViewModel.class, "onPageLoaded", "onPageLoaded(Landroid/webkit/WebView;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView, String str) throws IOException {
        invoke2(webView, str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView p0, String p1) throws IOException {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((ShopPayViewModel) this.receiver).onPageLoaded(p0, p1);
    }
}
