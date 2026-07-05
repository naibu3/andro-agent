package com.stripe.android.paymentelement.embedded.form;

import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;

/* compiled from: FormActivityViewModelComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivityModule;", "", "bindsFormConfirmationHelper", "Lcom/stripe/android/paymentelement/embedded/form/FormActivityConfirmationHelper;", "confirmationHandler", "Lcom/stripe/android/paymentelement/embedded/form/DefaultFormActivityConfirmationHelper;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes5.dex */
public interface FormActivityModule {
    @Binds
    FormActivityConfirmationHelper bindsFormConfirmationHelper(DefaultFormActivityConfirmationHelper confirmationHandler);
}
