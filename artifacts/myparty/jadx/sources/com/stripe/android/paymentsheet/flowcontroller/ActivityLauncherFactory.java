package com.stripe.android.paymentsheet.flowcontroller;

import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ActivityLauncherFactory.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000bH&\u0082\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "", "<init>", "()V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "ActivityHost", "FragmentHost", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ActivityLauncherFactory {
    public static final int $stable = 0;

    public /* synthetic */ ActivityLauncherFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract <I, O> ActivityResultLauncher<I> create(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback);

    private ActivityLauncherFactory() {
    }

    /* compiled from: ActivityLauncherFactory.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$ActivityHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "activity", "Landroidx/activity/ComponentActivity;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityHost extends ActivityLauncherFactory {
        public static final int $stable = 8;
        private final ComponentActivity activity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityHost(ComponentActivity activity) {
            super(null);
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.activity = activity;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> ActivityResultLauncher<I> create(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
            Intrinsics.checkNotNullParameter(contract, "contract");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return this.activity.registerForActivityResult(contract, callback);
        }
    }

    /* compiled from: ActivityLauncherFactory.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\t0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\t0\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory$FragmentHost;", "Lcom/stripe/android/paymentsheet/flowcontroller/ActivityLauncherFactory;", "fragment", "Landroidx/fragment/app/Fragment;", "<init>", "(Landroidx/fragment/app/Fragment;)V", "create", "Landroidx/activity/result/ActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "callback", "Landroidx/activity/result/ActivityResultCallback;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FragmentHost extends ActivityLauncherFactory {
        public static final int $stable = 8;
        private final Fragment fragment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FragmentHost(Fragment fragment) {
            super(null);
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            this.fragment = fragment;
        }

        @Override // com.stripe.android.paymentsheet.flowcontroller.ActivityLauncherFactory
        public <I, O> ActivityResultLauncher<I> create(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
            Intrinsics.checkNotNullParameter(contract, "contract");
            Intrinsics.checkNotNullParameter(callback, "callback");
            ActivityResultLauncher<I> activityResultLauncherRegisterForActivityResult = this.fragment.registerForActivityResult(contract, callback);
            Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
            return activityResultLauncherRegisterForActivityResult;
        }
    }
}
