package com.stripe.android.googlepaylauncher.injection;

import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherContractV2;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GooglePayPaymentMethodLauncherFactory.kt */
@AssistedFactory
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/googlepaylauncher/injection/GooglePayPaymentMethodLauncherFactory;", "", "create", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher;", "lifecycleScope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$Config;", "readyCallback", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncher$ReadyCallback;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/googlepaylauncher/GooglePayPaymentMethodLauncherContractV2$Args;", "skipReadyCheck", "", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface GooglePayPaymentMethodLauncherFactory {
    GooglePayPaymentMethodLauncher create(CoroutineScope lifecycleScope, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, ActivityResultLauncher<GooglePayPaymentMethodLauncherContractV2.Args> activityResultLauncher, boolean skipReadyCheck, CardBrandFilter cardBrandFilter);

    /* compiled from: GooglePayPaymentMethodLauncherFactory.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ GooglePayPaymentMethodLauncher create$default(GooglePayPaymentMethodLauncherFactory googlePayPaymentMethodLauncherFactory, CoroutineScope coroutineScope, GooglePayPaymentMethodLauncher.Config config, GooglePayPaymentMethodLauncher.ReadyCallback readyCallback, ActivityResultLauncher activityResultLauncher, boolean z, CardBrandFilter cardBrandFilter, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 16) != 0) {
                z = false;
            }
            return googlePayPaymentMethodLauncherFactory.create(coroutineScope, config, readyCallback, activityResultLauncher, z, cardBrandFilter);
        }
    }
}
