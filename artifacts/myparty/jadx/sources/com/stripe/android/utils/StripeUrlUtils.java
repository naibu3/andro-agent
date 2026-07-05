package com.stripe.android.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StripeUrlUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/utils/StripeUrlUtils;", "", "<init>", "()V", "isStripeUrl", "", "url", "", "isStripeUrl$payments_core_release", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StripeUrlUtils {
    public static final int $stable = 0;
    public static final StripeUrlUtils INSTANCE = new StripeUrlUtils();

    private StripeUrlUtils() {
    }

    public final boolean isStripeUrl$payments_core_release(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Uri uri = Uri.parse(url);
        if (!Intrinsics.areEqual(uri.getScheme(), "https")) {
            return false;
        }
        String host = uri.getHost();
        if (Intrinsics.areEqual(host, "stripe.com")) {
            return true;
        }
        return host != null ? StringsKt.endsWith$default(host, ".stripe.com", false, 2, (Object) null) : false;
    }
}
