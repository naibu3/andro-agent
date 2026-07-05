package com.stripe.android.financialconnections.launcher;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetForDataLauncher.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B-\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u000fB-\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0012B5\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForDataLauncher;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForData;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "activity", "Landroidx/activity/ComponentActivity;", "intentBuilder", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/content/Intent;", "callback", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResultCallback;)V", "getActivityResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "present", "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetForDataLauncher implements FinancialConnectionsSheetLauncher {
    private final ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher;

    public FinancialConnectionsSheetForDataLauncher(ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    public final ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForData> getActivityResultLauncher() {
        return this.activityResultLauncher;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetForDataLauncher(ComponentActivity activity, Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder, final FinancialConnectionsSheetResultCallback callback) {
        this(activity.registerForActivityResult(new FinancialConnectionsSheetForDataContract(intentBuilder), new ActivityResultCallback() { // from class: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$0(callback, (FinancialConnectionsSheetResult) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        financialConnectionsSheetResultCallback.onFinancialConnectionsSheetResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetForDataLauncher(Fragment fragment, Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder, final FinancialConnectionsSheetResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForDataContract(intentBuilder), new ActivityResultCallback() { // from class: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda1
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$1(callback, (FinancialConnectionsSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        financialConnectionsSheetResultCallback.onFinancialConnectionsSheetResult(it);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetForDataLauncher(Fragment fragment, ActivityResultRegistry registry, Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder, final FinancialConnectionsSheetResultCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForDataContract(intentBuilder), registry, new ActivityResultCallback() { // from class: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher$$ExternalSyntheticLambda0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                FinancialConnectionsSheetForDataLauncher._init_$lambda$2(callback, (FinancialConnectionsSheetResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        financialConnectionsSheetResultCallback.onFinancialConnectionsSheetResult(it);
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.activityResultLauncher.launch(new FinancialConnectionsSheetActivityArgs.ForData(configuration, elementsSessionContext));
    }
}
