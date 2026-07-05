package com.stripe.android.paymentsheet.addresselement;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher;
import com.stripe.android.paymentsheet.addresselement.AutocompleteContract;
import com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutocompleteLauncher.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "appearanceContext", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "<init>", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;)V", "activityLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Args;", "registeredAutocompleteListeners", "", "", "Ljava/lang/ref/WeakReference;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncherResultHandler;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "launch", "country", "googlePlacesApiKey", "resultHandler", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultAutocompleteLauncher implements AutocompleteActivityLauncher {
    public static final int $stable = 8;
    private ActivityResultLauncher<AutocompleteContract.Args> activityLauncher;
    private final AutocompleteAppearanceContext appearanceContext;
    private final Map<String, WeakReference<AutocompleteLauncherResultHandler>> registeredAutocompleteListeners;

    public DefaultAutocompleteLauncher(AutocompleteAppearanceContext appearanceContext) {
        Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
        this.appearanceContext = appearanceContext;
        this.registeredAutocompleteListeners = new LinkedHashMap();
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher
    public void register(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.activityLauncher = activityResultCaller.registerForActivityResult(AutocompleteContract.INSTANCE, new ActivityResultCallback() { // from class: com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                DefaultAutocompleteLauncher.register$lambda$0(this.f$0, (AutocompleteContract.Result) obj);
            }
        });
        lifecycleOwner.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.stripe.android.paymentsheet.addresselement.DefaultAutocompleteLauncher.register.2
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(LifecycleOwner owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                ActivityResultLauncher activityResultLauncher = DefaultAutocompleteLauncher.this.activityLauncher;
                if (activityResultLauncher != null) {
                    activityResultLauncher.unregister();
                }
                DefaultAutocompleteLauncher.this.activityLauncher = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$0(DefaultAutocompleteLauncher defaultAutocompleteLauncher, AutocompleteContract.Result result) {
        AutocompleteLauncherResultHandler autocompleteLauncherResultHandler;
        AutocompleteLauncher.Result.OnBack onBack;
        Intrinsics.checkNotNullParameter(result, "result");
        WeakReference<AutocompleteLauncherResultHandler> weakReference = defaultAutocompleteLauncher.registeredAutocompleteListeners.get(result.getId());
        if (weakReference != null && (autocompleteLauncherResultHandler = weakReference.get()) != null) {
            if (result instanceof AutocompleteContract.Result.EnterManually) {
                onBack = new AutocompleteLauncher.Result.EnterManually(((AutocompleteContract.Result.EnterManually) result).getAddressDetails());
            } else {
                if (!(result instanceof AutocompleteContract.Result.Address)) {
                    throw new NoWhenBranchMatchedException();
                }
                onBack = new AutocompleteLauncher.Result.OnBack(((AutocompleteContract.Result.Address) result).getAddressDetails());
            }
            autocompleteLauncherResultHandler.onAutocompleteLauncherResult(onBack);
        }
        defaultAutocompleteLauncher.registeredAutocompleteListeners.remove(result.getId());
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteLauncher
    public void launch(String country, String googlePlacesApiKey, AutocompleteLauncherResultHandler resultHandler) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(googlePlacesApiKey, "googlePlacesApiKey");
        Intrinsics.checkNotNullParameter(resultHandler, "resultHandler");
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.registeredAutocompleteListeners.put(string, new WeakReference<>(resultHandler));
        ActivityResultLauncher<AutocompleteContract.Args> activityResultLauncher = this.activityLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(new AutocompleteContract.Args(string, country, googlePlacesApiKey, this.appearanceContext));
        }
    }

    /* compiled from: AutocompleteLauncher.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$Factory;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher$Factory;", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "appearanceContext", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements AutocompleteActivityLauncher.Factory {
        public static final int $stable = 0;

        @Inject
        public Factory() {
        }

        @Override // com.stripe.android.paymentsheet.addresselement.AutocompleteActivityLauncher.Factory
        public AutocompleteActivityLauncher create(AutocompleteAppearanceContext appearanceContext) {
            Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
            return new DefaultAutocompleteLauncher(appearanceContext);
        }
    }
}
