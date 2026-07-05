package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthActivityStarterHost.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/FragmentHost;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "fragment", "Landroidx/fragment/app/Fragment;", "statusBarColor", "", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/lang/Integer;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getStatusBarColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "application", "Landroid/app/Application;", "getApplication", "()Landroid/app/Application;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "startActivityForResult", "", TypedValues.AttributesType.S_TARGET, "Ljava/lang/Class;", "extras", "Landroid/os/Bundle;", "requestCode", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FragmentHost implements AuthActivityStarterHost {
    public static final int $stable = 8;
    private final Fragment fragment;
    private final LifecycleOwner lifecycleOwner;
    private final Integer statusBarColor;

    public FragmentHost(Fragment fragment, Integer num) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
        this.statusBarColor = num;
        this.lifecycleOwner = fragment;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public Application getApplication() {
        Application application = this.fragment.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return application;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.stripe.android.view.AuthActivityStarterHost
    public void startActivityForResult(Class<?> target, Bundle extras, int requestCode) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intent intentPutExtras = new Intent(this.fragment.getActivity(), target).putExtras(extras);
        Intrinsics.checkNotNullExpressionValue(intentPutExtras, "putExtras(...)");
        if (this.fragment.isAdded()) {
            this.fragment.startActivityForResult(intentPutExtras, requestCode);
        }
    }
}
