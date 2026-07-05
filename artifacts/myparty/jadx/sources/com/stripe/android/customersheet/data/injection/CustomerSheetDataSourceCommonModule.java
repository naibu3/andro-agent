package com.stripe.android.customersheet.data.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.paymentsheet.repositories.ElementsSessionRepository;
import com.stripe.android.paymentsheet.repositories.RealElementsSessionRepository;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: CustomerSheetDataSourceCommonModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/stripe/android/customersheet/data/injection/CustomerSheetDataSourceCommonModule;", "", "bindsElementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;", "elementsSessionRepository", "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;", "bindsApplicationContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface CustomerSheetDataSourceCommonModule {
    @Binds
    Context bindsApplicationContext(Application application);

    @Binds
    ElementsSessionRepository bindsElementsSessionRepository(RealElementsSessionRepository elementsSessionRepository);
}
