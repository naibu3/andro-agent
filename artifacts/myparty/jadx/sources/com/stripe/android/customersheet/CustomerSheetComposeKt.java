package com.stripe.android.customersheet;

import android.app.Activity;
import android.app.Application;
import android.view.Window;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.customersheet.CustomerSheet;
import com.stripe.android.customersheet.CustomerSheetIntegration;
import com.stripe.android.utils.ComposeUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomerSheetCompose.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\t\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"rememberCustomerSheet", "Lcom/stripe/android/customersheet/CustomerSheet;", "customerAdapter", "Lcom/stripe/android/customersheet/CustomerAdapter;", "callback", "Lcom/stripe/android/customersheet/CustomerSheetResultCallback;", "(Lcom/stripe/android/customersheet/CustomerAdapter;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/customersheet/CustomerSheet;", "customerSessionProvider", "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;", "(Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionProvider;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/customersheet/CustomerSheet;", "integration", "Lcom/stripe/android/customersheet/CustomerSheetIntegration;", "(Lcom/stripe/android/customersheet/CustomerSheetIntegration;Lcom/stripe/android/customersheet/CustomerSheetResultCallback;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/customersheet/CustomerSheet;", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetComposeKt {
    public static final CustomerSheet rememberCustomerSheet(CustomerAdapter customerAdapter, CustomerSheetResultCallback callback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(customerAdapter, "customerAdapter");
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(418924164);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(418924164, i, -1, "com.stripe.android.customersheet.rememberCustomerSheet (CustomerSheetCompose.kt:22)");
        }
        composer.startReplaceGroup(-2004489513);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(customerAdapter)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CustomerSheetIntegration.Adapter(customerAdapter);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CustomerSheet customerSheetRememberCustomerSheet = rememberCustomerSheet((CustomerSheetIntegration.Adapter) objRememberedValue, callback, composer, i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return customerSheetRememberCustomerSheet;
    }

    public static final CustomerSheet rememberCustomerSheet(CustomerSheet.CustomerSessionProvider customerSessionProvider, CustomerSheetResultCallback callback, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(customerSessionProvider, "customerSessionProvider");
        Intrinsics.checkNotNullParameter(callback, "callback");
        composer.startReplaceGroup(549942748);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(549942748, i, -1, "com.stripe.android.customersheet.rememberCustomerSheet (CustomerSheetCompose.kt:44)");
        }
        composer.startReplaceGroup(-2004465233);
        boolean z = (((i & 14) ^ 6) > 4 && composer.changed(customerSessionProvider)) || (i & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new CustomerSheetIntegration.CustomerSession(customerSessionProvider);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CustomerSheet customerSheetRememberCustomerSheet = rememberCustomerSheet((CustomerSheetIntegration.CustomerSession) objRememberedValue, callback, composer, i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return customerSheetRememberCustomerSheet;
    }

    private static final CustomerSheet rememberCustomerSheet(CustomerSheetIntegration customerSheetIntegration, CustomerSheetResultCallback customerSheetResultCallback, Composer composer, int i) {
        composer.startReplaceGroup(-1258416726);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1258416726, i, -1, "com.stripe.android.customersheet.rememberCustomerSheet (CustomerSheetCompose.kt:57)");
        }
        ActivityResultRegistryOwner current = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer, LocalActivityResultRegistryOwner.$stable);
        if (current == null) {
            throw new IllegalArgumentException("CustomerSheet must be created with access to an ActivityResultRegistryOwner".toString());
        }
        ProvidableCompositionLocal<LifecycleOwner> localLifecycleOwner = LocalLifecycleOwnerKt.getLocalLifecycleOwner();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localLifecycleOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) objConsume;
        composer.startReplaceGroup(-2004446271);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetComposeKt.rememberCustomerSheet$lambda$4$lambda$3();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        final Activity activityRememberActivity = ComposeUtilsKt.rememberActivity((Function0) objRememberedValue, composer, 6);
        ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
        if (current2 == null) {
            throw new IllegalArgumentException("CustomerSheet must be created with access to a ViewModelStoreOwner".toString());
        }
        composer.startReplaceGroup(-2004437724);
        boolean z = (((6 ^ (i & 14)) > 4 && composer.changed(customerSheetIntegration)) || (i & 6) == 4) | ((((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) ^ 48) > 32 && composer.changed(customerSheetResultCallback)) || (i & 48) == 32);
        Object objRememberedValue2 = composer.rememberedValue();
        if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            CustomerSheet.Companion companion = CustomerSheet.INSTANCE;
            Application application = activityRememberActivity.getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            objRememberedValue2 = companion.getInstance$paymentsheet_release(application, current2, lifecycleOwner, current, new Function0() { // from class: com.stripe.android.customersheet.CustomerSheetComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomerSheetComposeKt.rememberCustomerSheet$lambda$7$lambda$6(activityRememberActivity);
                }
            }, customerSheetIntegration, customerSheetResultCallback);
            composer.updateRememberedValue(objRememberedValue2);
        }
        CustomerSheet customerSheet = (CustomerSheet) objRememberedValue2;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return customerSheet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rememberCustomerSheet$lambda$4$lambda$3() {
        return "CustomerSheet must be created in the context of an Activity";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer rememberCustomerSheet$lambda$7$lambda$6(Activity activity) {
        Window window = activity.getWindow();
        if (window != null) {
            return Integer.valueOf(window.getStatusBarColor());
        }
        return null;
    }
}
