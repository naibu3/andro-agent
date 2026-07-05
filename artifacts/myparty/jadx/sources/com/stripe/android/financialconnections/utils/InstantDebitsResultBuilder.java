package com.stripe.android.financialconnections.utils;

import android.net.Uri;
import android.util.Base64;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: InstantDebitsResultBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002R\u000e\u0010\r\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/utils/InstantDebitsResultBuilder;", "", "<init>", "()V", "fromUri", "Lkotlin/Result;", "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "fromUri-IoAF18A", "(Landroid/net/Uri;)Ljava/lang/Object;", "getEncodedPaymentMethodOrThrow", "", "QUERY_PARAM_PAYMENT_METHOD", "QUERY_PARAM_LAST4", "QUERY_BANK_NAME", "QUERY_INCENTIVE_ELIGIBLE", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstantDebitsResultBuilder {
    public static final InstantDebitsResultBuilder INSTANCE = new InstantDebitsResultBuilder();
    public static final String QUERY_BANK_NAME = "bank_name";
    public static final String QUERY_INCENTIVE_ELIGIBLE = "incentive_eligible";
    public static final String QUERY_PARAM_LAST4 = "last4";
    public static final String QUERY_PARAM_PAYMENT_METHOD = "payment_method";

    private InstantDebitsResultBuilder() {
    }

    /* renamed from: fromUri-IoAF18A, reason: not valid java name */
    public final Object m7654fromUriIoAF18A(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            InstantDebitsResultBuilder instantDebitsResultBuilder = this;
            return Result.m9118constructorimpl(new InstantDebitsResult(getEncodedPaymentMethodOrThrow(uri), uri.getQueryParameter("last4"), uri.getQueryParameter("bank_name"), Boolean.parseBoolean(uri.getQueryParameter(QUERY_INCENTIVE_ELIGIBLE))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final String getEncodedPaymentMethodOrThrow(Uri uri) {
        String queryParameter = uri.getQueryParameter("payment_method");
        if (queryParameter == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        byte[] bArrDecode = Base64.decode(queryParameter, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return new String(bArrDecode, Charsets.UTF_8);
    }
}
