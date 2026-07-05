package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkingLinkSignupViewModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toContent", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;", "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;", "Lcom/stripe/android/financialconnections/model/LinkLoginPane;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkSignupViewModelKt {
    public static final NetworkingLinkSignupState.Content toContent(NetworkingLinkSignupPane networkingLinkSignupPane) {
        Intrinsics.checkNotNullParameter(networkingLinkSignupPane, "<this>");
        return new NetworkingLinkSignupState.Content(networkingLinkSignupPane.getTitle(), null, networkingLinkSignupPane.getBody().getBullets(), networkingLinkSignupPane.getAboveCta(), networkingLinkSignupPane.getCta(), networkingLinkSignupPane.getSkipCta(), networkingLinkSignupPane.getLegalDetailsNotice());
    }

    public static final NetworkingLinkSignupState.Content toContent(LinkLoginPane linkLoginPane) {
        Intrinsics.checkNotNullParameter(linkLoginPane, "<this>");
        return new NetworkingLinkSignupState.Content(linkLoginPane.getTitle(), linkLoginPane.getBody(), CollectionsKt.emptyList(), linkLoginPane.getAboveCta(), linkLoginPane.getCta(), null, null);
    }
}
