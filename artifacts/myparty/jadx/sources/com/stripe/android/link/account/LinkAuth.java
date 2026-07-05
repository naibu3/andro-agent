package com.stripe.android.link.account;

import androidx.autofill.HintConstants;
import com.stripe.android.link.ui.inline.SignUpConsentAction;
import com.stripe.android.model.EmailSource;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LinkAuth.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH¦@¢\u0006\u0002\u0010\u000bJ0\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/account/LinkAuth;", "", "signUp", "Lcom/stripe/android/link/account/LinkAuthResult;", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "name", "consentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookUp", "emailSource", "Lcom/stripe/android/model/EmailSource;", "startSession", "", "customerId", "(Ljava/lang/String;Lcom/stripe/android/model/EmailSource;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkAuth {
    Object lookUp(String str, EmailSource emailSource, boolean z, String str2, Continuation<? super LinkAuthResult> continuation);

    Object signUp(String str, String str2, String str3, String str4, SignUpConsentAction signUpConsentAction, Continuation<? super LinkAuthResult> continuation);
}
