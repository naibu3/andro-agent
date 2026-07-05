package com.stripe.android.paymentsheet.state;

import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.model.AccountStatus;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: LinkAccountStatusProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦B¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/state/LinkAccountStatusProvider;", "", "invoke", "Lcom/stripe/android/link/model/AccountStatus;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "(Lcom/stripe/android/link/LinkConfiguration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface LinkAccountStatusProvider {
    Object invoke(LinkConfiguration linkConfiguration, Continuation<? super AccountStatus> continuation);
}
