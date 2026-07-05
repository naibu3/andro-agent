package com.stripe.android.financialconnections.utils;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTracker;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsAnalyticsTrackerKt;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UriUtils.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bJ \u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u0013*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/utils/UriUtils;", "", "logger", "Lcom/stripe/android/core/Logger;", "tracker", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;", "<init>", "(Lcom/stripe/android/core/Logger;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsAnalyticsTracker;)V", "compareSchemeAuthorityAndPath", "", "uriString1", "", "uriString2", "getQueryParameter", ShareConstants.MEDIA_URI, SDKConstants.PARAM_KEY, "getQueryParameterFromFragment", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toUriOrNull", "Landroid/net/Uri;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UriUtils {
    public static final int $stable = 8;
    private final Logger logger;
    private final FinancialConnectionsAnalyticsTracker tracker;

    @Inject
    public UriUtils(Logger logger, FinancialConnectionsAnalyticsTracker tracker) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.logger = logger;
        this.tracker = tracker;
    }

    public final boolean compareSchemeAuthorityAndPath(String uriString1, String uriString2) {
        Intrinsics.checkNotNullParameter(uriString1, "uriString1");
        Intrinsics.checkNotNullParameter(uriString2, "uriString2");
        Uri uriOrNull = toUriOrNull(uriString1);
        Uri uriOrNull2 = toUriOrNull(uriString2);
        return uriOrNull != null && uriOrNull2 != null && StringsKt.equals$default(uriOrNull.getAuthority(), uriOrNull2.getAuthority(), false, 2, null) && StringsKt.equals$default(uriOrNull.getScheme(), uriOrNull2.getScheme(), false, 2, null) && StringsKt.equals$default(uriOrNull.getPath(), uriOrNull2.getPath(), false, 2, null);
    }

    public final String getQueryParameter(String uri, String key) {
        Object objM9118constructorimpl;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uriOrNull = toUriOrNull(uri);
            objM9118constructorimpl = Result.m9118constructorimpl(uriOrNull != null ? uriOrNull.getQueryParameter(key) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            FinancialConnectionsAnalyticsTrackerKt.logError(this.tracker, "Could not extract query param " + key + " from URI " + uri, thM9121exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
        }
        return (String) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
    }

    public final Object getQueryParameterFromFragment(String str, String str2, Continuation<? super String> continuation) {
        String fragment;
        List listSplit$default;
        try {
            Result.Companion companion = Result.INSTANCE;
            UriUtils uriUtils = this;
            Uri uriOrNull = toUriOrNull(str);
            if (uriOrNull != null && (fragment = uriOrNull.getFragment()) != null && (listSplit$default = StringsKt.split$default((CharSequence) fragment, new String[]{"&"}, false, 0, 6, (Object) null)) != null) {
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    List listSplit$default2 = StringsKt.split$default((CharSequence) it.next(), new String[]{"="}, false, 0, 6, (Object) null);
                    if (Intrinsics.areEqual(listSplit$default2.get(0), str2) && listSplit$default2.size() > 1) {
                        return listSplit$default2.get(1);
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsAnalyticsTrackerKt.logError(this.tracker, "Could not extract query param " + str2 + " from URI " + str, thM9121exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                return null;
            }
            return objM9118constructorimpl;
        }
    }

    private final Uri toUriOrNull(String str) {
        try {
            Result.Companion companion = Result.INSTANCE;
            return Uri.parse(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
            if (thM9121exceptionOrNullimpl != null) {
                FinancialConnectionsAnalyticsTrackerKt.logError(this.tracker, "Could not parse given URI " + str, thM9121exceptionOrNullimpl, this.logger, FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR);
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            return (Uri) objM9118constructorimpl;
        }
    }
}
