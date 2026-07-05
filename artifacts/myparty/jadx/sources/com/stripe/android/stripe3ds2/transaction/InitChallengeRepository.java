package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: InitChallengeRepository.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "", "startChallenge", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeResult;", CardScanActivity.ARGS, "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;", "(Lcom/stripe/android/stripe3ds2/transaction/InitChallengeArgs;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InitChallengeRepository {
    Object startChallenge(InitChallengeArgs initChallengeArgs, Continuation<? super InitChallengeResult> continuation);
}
