package com.stripe.android.model;

import kotlin.Metadata;

/* compiled from: CreateFinancialConnectionsSessionParams.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0004"}, d2 = {"valueForHostedSurface", "", "Lcom/stripe/android/model/LinkMode;", "hostedSurface", "payments-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CreateFinancialConnectionsSessionParamsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String valueForHostedSurface(LinkMode linkMode, String str) {
        String value;
        if (str != null) {
            return (linkMode == null || (value = linkMode.getValue()) == null) ? "LINK_DISABLED" : value;
        }
        return null;
    }
}
