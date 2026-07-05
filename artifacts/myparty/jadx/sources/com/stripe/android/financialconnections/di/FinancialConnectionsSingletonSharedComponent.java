package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.financialconnections.domain.IntegrityVerdictManager;
import com.stripe.attestation.IntegrityRequestManager;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: FinancialConnectionsSingletonSharedComponentHolder.kt */
@Component(modules = {FinancialConnectionsSingletonSharedModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;", "", "integrityRequestManager", "Lcom/stripe/attestation/IntegrityRequestManager;", "integrityVerdictManager", "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;", "Factory", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface FinancialConnectionsSingletonSharedComponent {

    /* compiled from: FinancialConnectionsSingletonSharedComponentHolder.kt */
    @Component.Factory
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent$Factory;", "", "create", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;", "application", "Landroid/app/Application;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        FinancialConnectionsSingletonSharedComponent create(@BindsInstance Application application);
    }

    IntegrityRequestManager integrityRequestManager();

    IntegrityVerdictManager integrityVerdictManager();
}
