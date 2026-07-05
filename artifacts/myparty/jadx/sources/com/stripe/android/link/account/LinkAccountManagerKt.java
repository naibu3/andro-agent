package com.stripe.android.link.account;

import com.stripe.android.link.model.LinkAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkAccountManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"consumerPublishableKey", "", "Lcom/stripe/android/link/account/LinkAccountManager;", "getConsumerPublishableKey", "(Lcom/stripe/android/link/account/LinkAccountManager;)Ljava/lang/String;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkAccountManagerKt {
    public static final String getConsumerPublishableKey(LinkAccountManager linkAccountManager) {
        Intrinsics.checkNotNullParameter(linkAccountManager, "<this>");
        LinkAccount account = linkAccountManager.getLinkAccountInfo().getValue().getAccount();
        if (account != null) {
            return account.getConsumerPublishableKey();
        }
        return null;
    }
}
