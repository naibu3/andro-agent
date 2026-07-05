package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.launcher.InstantDebitsResult;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CreateInstantDebitsResult.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bà\u0080\u0001\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦B¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/domain/CreateInstantDebitsResult;", "", "invoke", "Lcom/stripe/android/financialconnections/launcher/InstantDebitsResult;", "bankAccountId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface CreateInstantDebitsResult {
    Object invoke(String str, Continuation<? super InstantDebitsResult> continuation);
}
