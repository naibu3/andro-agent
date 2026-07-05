package com.stripe.android.financialconnections.features.networkinglinksignup;

import com.facebook.internal.ServerProtocol;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LinkSignupHandler.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/LinkSignupHandler;", "", "performSignup", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "(Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleSignupFailure", "", "error", "", "navigateToVerification", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkSignupHandler {
    void handleSignupFailure(NetworkingLinkSignupState state, Throwable error);

    void navigateToVerification();

    Object performSignup(NetworkingLinkSignupState networkingLinkSignupState, Continuation<? super FinancialConnectionsSessionManifest.Pane> continuation);
}
