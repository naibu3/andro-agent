package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.core.Logger;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.attestation.IntegrityRequestManager;
import com.stripe.attestation.IntegrityStandardRequestManager;
import com.stripe.attestation.RealStandardIntegrityManagerFactory;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSingletonSharedComponentHolder.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedModule;", "", "<init>", "()V", "providesIntegrityStandardRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "context", "Landroid/app/Application;", "providesIntegrityVerdictManager", "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public final class FinancialConnectionsSingletonSharedModule {
    public static final int $stable = 0;

    @Provides
    @Singleton
    public final IntegrityRequestManager providesIntegrityStandardRequestManager(Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new IntegrityStandardRequestManager(527113280969L, new Function2() { // from class: com.stripe.android.financialconnections.di.FinancialConnectionsSingletonSharedModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return FinancialConnectionsSingletonSharedModule.providesIntegrityStandardRequestManager$lambda$0((String) obj, (Throwable) obj2);
            }
        }, new RealStandardIntegrityManagerFactory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit providesIntegrityStandardRequestManager$lambda$0(String message, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.INSTANCE.getInstance(false).error(message, error);
        return Unit.INSTANCE;
    }

    @Provides
    @Singleton
    public final IntegrityVerdictManager providesIntegrityVerdictManager() {
        return new IntegrityVerdictManager();
    }
}
