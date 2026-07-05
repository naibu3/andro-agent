package com.stripe.android.financialconnections.di;

import android.app.Application;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSingletonSharedComponentHolder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponentHolder;", "", "<init>", "()V", "component", "Lcom/stripe/android/financialconnections/di/FinancialConnectionsSingletonSharedComponent;", "getComponent", "application", "Landroid/app/Application;", "buildComponent", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSingletonSharedComponentHolder {
    private static volatile FinancialConnectionsSingletonSharedComponent component;
    public static final FinancialConnectionsSingletonSharedComponentHolder INSTANCE = new FinancialConnectionsSingletonSharedComponentHolder();
    public static final int $stable = 8;

    private FinancialConnectionsSingletonSharedComponentHolder() {
    }

    public final FinancialConnectionsSingletonSharedComponent getComponent(Application application) {
        FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponentBuildComponent;
        Intrinsics.checkNotNullParameter(application, "application");
        FinancialConnectionsSingletonSharedComponent financialConnectionsSingletonSharedComponent = component;
        if (financialConnectionsSingletonSharedComponent != null) {
            return financialConnectionsSingletonSharedComponent;
        }
        synchronized (this) {
            financialConnectionsSingletonSharedComponentBuildComponent = component;
            if (financialConnectionsSingletonSharedComponentBuildComponent == null) {
                financialConnectionsSingletonSharedComponentBuildComponent = INSTANCE.buildComponent(application);
                component = financialConnectionsSingletonSharedComponentBuildComponent;
            }
        }
        return financialConnectionsSingletonSharedComponentBuildComponent;
    }

    private final FinancialConnectionsSingletonSharedComponent buildComponent(Application application) {
        return DaggerFinancialConnectionsSingletonSharedComponent.factory().create(application);
    }
}
