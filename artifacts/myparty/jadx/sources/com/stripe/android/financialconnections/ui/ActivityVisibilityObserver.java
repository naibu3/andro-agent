package com.stripe.android.financialconnections.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetNativeActivity.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/financialconnections/ui/ActivityVisibilityObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onBackgrounded", "Lkotlin/Function0;", "", "onForegrounded", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnBackgrounded", "()Lkotlin/jvm/functions/Function0;", "getOnForegrounded", "isFirstStart", "", "isInBackground", "onStart", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ActivityVisibilityObserver implements DefaultLifecycleObserver {
    private boolean isFirstStart;
    private boolean isInBackground;
    private final Function0<Unit> onBackgrounded;
    private final Function0<Unit> onForegrounded;

    public ActivityVisibilityObserver(Function0<Unit> onBackgrounded, Function0<Unit> onForegrounded) {
        Intrinsics.checkNotNullParameter(onBackgrounded, "onBackgrounded");
        Intrinsics.checkNotNullParameter(onForegrounded, "onForegrounded");
        this.onBackgrounded = onBackgrounded;
        this.onForegrounded = onForegrounded;
        this.isFirstStart = true;
    }

    public final Function0<Unit> getOnBackgrounded() {
        return this.onBackgrounded;
    }

    public final Function0<Unit> getOnForegrounded() {
        return this.onForegrounded;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        if (!this.isFirstStart && this.isInBackground) {
            this.onForegrounded.invoke();
        }
        this.isFirstStart = false;
        this.isInBackground = false;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        AppCompatActivity appCompatActivity = owner instanceof AppCompatActivity ? (AppCompatActivity) owner : null;
        if (appCompatActivity != null ? appCompatActivity.isChangingConfigurations() : false) {
            return;
        }
        this.isInBackground = true;
        this.onBackgrounded.invoke();
    }
}
