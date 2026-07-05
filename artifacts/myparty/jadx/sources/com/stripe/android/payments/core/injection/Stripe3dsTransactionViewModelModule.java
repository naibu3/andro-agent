package com.stripe.android.payments.core.injection;

import android.app.Application;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepository;
import com.stripe.android.stripe3ds2.transaction.InitChallengeRepositoryFactory;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Stripe3dsTransactionViewModelModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/payments/core/injection/Stripe3dsTransactionViewModelModule;", "", "<init>", "()V", "providesInitChallengeRepository", "Lcom/stripe/android/stripe3ds2/transaction/InitChallengeRepository;", "application", "Landroid/app/Application;", CardScanActivity.ARGS, "Lcom/stripe/android/payments/core/authentication/threeds2/Stripe3ds2TransactionContract$Args;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class Stripe3dsTransactionViewModelModule {
    public static final int $stable = 0;

    @Provides
    public final InitChallengeRepository providesInitChallengeRepository(Application application, Stripe3ds2TransactionContract.Args args, @IOContext CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        return new InitChallengeRepositoryFactory(application, args.getStripeIntent().isLiveMode(), args.getSdkTransactionId(), args.getConfig().getUiCustomization$payments_core_release().getUiCustomization(), args.getFingerprint().getDirectoryServerEncryption().getRootCerts(), args.getEnableLogging(), workContext).create();
    }
}
