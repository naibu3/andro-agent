package com.stripe.android.financialconnections.launcher;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.Fragment;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetForInstantDebitsLauncher.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B9\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0005\u0010\u0010BA\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\n¢\u0006\u0004\b\u0005\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016R\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038G¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetForInstantDebitsLauncher;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetLauncher;", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs$ForInstantDebits;", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "activity", "Landroidx/activity/ComponentActivity;", "intentBuilder", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityArgs;", "Landroid/content/Intent;", "callback", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;", "", "(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "fragment", "Landroidx/fragment/app/Fragment;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/fragment/app/Fragment;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getActivityResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "present", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "financial-connections-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetForInstantDebitsLauncher implements FinancialConnectionsSheetLauncher {
    private final ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForInstantDebits> activityResultLauncher;

    public FinancialConnectionsSheetForInstantDebitsLauncher(ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForInstantDebits> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    public final ActivityResultLauncher<FinancialConnectionsSheetActivityArgs.ForInstantDebits> getActivityResultLauncher() {
        return this.activityResultLauncher;
    }

    /* compiled from: FinancialConnectionsSheetForInstantDebitsLauncher.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 implements ActivityResultCallback, FunctionAdapter {
        final /* synthetic */ Function1<FinancialConnectionsSheetInstantDebitsResult, Unit> $tmp0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> function1) {
            this.$tmp0 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.$tmp0, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(FinancialConnectionsSheetInstantDebitsResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.$tmp0.invoke(p0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinancialConnectionsSheetForInstantDebitsLauncher(ComponentActivity activity, Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder, Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> callback) {
        this(activity.registerForActivityResult(new FinancialConnectionsSheetForInstantDebitsContract(intentBuilder), new AnonymousClass1(callback)));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetForInstantDebitsLauncher(Fragment fragment, ActivityResultRegistry registry, Function1<? super FinancialConnectionsSheetActivityArgs, ? extends Intent> intentBuilder, Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(intentBuilder, "intentBuilder");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new FinancialConnectionsSheetForInstantDebitsContract(intentBuilder), registry, new AnonymousClass2(callback));
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }

    /* compiled from: FinancialConnectionsSheetForInstantDebitsLauncher.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 implements ActivityResultCallback, FunctionAdapter {
        final /* synthetic */ Function1<FinancialConnectionsSheetInstantDebitsResult, Unit> $tmp0;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super FinancialConnectionsSheetInstantDebitsResult, Unit> function1) {
            this.$tmp0 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.$tmp0, Function1.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(FinancialConnectionsSheetInstantDebitsResult p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            this.$tmp0.invoke(p0);
        }
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheetConfiguration configuration, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.activityResultLauncher.launch(new FinancialConnectionsSheetActivityArgs.ForInstantDebits(configuration, elementsSessionContext));
    }
}
