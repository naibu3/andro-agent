package com.stripe.android.paymentsheet.addresselement;

import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;

/* compiled from: AutocompleteLauncher.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\bJ\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteLauncher;", "register", "", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AutocompleteActivityLauncher extends AutocompleteLauncher {

    /* compiled from: AutocompleteLauncher.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher$Factory;", "", "create", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteActivityLauncher;", "appearanceContext", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        AutocompleteActivityLauncher create(AutocompleteAppearanceContext appearanceContext);
    }

    void register(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner);
}
