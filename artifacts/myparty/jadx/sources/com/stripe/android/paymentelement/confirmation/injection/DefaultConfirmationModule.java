package com.stripe.android.paymentelement.confirmation.injection;

import com.stripe.android.paymentelement.confirmation.challenge.PassiveChallengeConfirmationModule;
import com.stripe.android.paymentelement.confirmation.intent.IntentConfirmationModule;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: DefaultConfirmationModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module(includes = {IntentConfirmationModule.class, PassiveChallengeConfirmationModule.class, ConfirmationHandlerModule.class})
/* loaded from: classes5.dex */
public interface DefaultConfirmationModule {
}
