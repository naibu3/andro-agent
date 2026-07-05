package com.stripe.android.paymentelement.embedded.form;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import dagger.BindsInstance;
import dagger.Subcomponent;
import kotlin.Metadata;

/* compiled from: FormActivityViewModelComponent.kt */
@Subcomponent(modules = {FormActivityModule.class})
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent;", "", "inject", "", "activity", "Lcom/stripe/android/paymentelement/embedded/form/FormActivity;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@FormActivityScope
/* loaded from: classes5.dex */
public interface FormActivitySubcomponent {

    /* compiled from: FormActivityViewModelComponent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent$Factory;", "", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/paymentelement/embedded/form/FormActivitySubcomponent;", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Subcomponent.Factory
    public interface Factory {
        FormActivitySubcomponent build(@BindsInstance ActivityResultCaller activityResultCaller, @BindsInstance LifecycleOwner lifecycleOwner);
    }

    void inject(FormActivity activity);
}
