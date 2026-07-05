package com.stripe.android.view;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LifecycleOwnerDelegate.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/LifecycleOwnerDelegate;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/savedstate/SavedStateRegistryOwner;", "<init>", "()V", "initLifecycle", "", "owner", "Landroid/view/View;", "destroyLifecycle", "attachToParent", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "store", "Landroidx/lifecycle/ViewModelStore;", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "viewModelStore", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LifecycleOwnerDelegate implements LifecycleOwner, ViewModelStoreOwner, SavedStateRegistryOwner {
    public static final int $stable = 8;
    private final LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    private final ViewModelStore store = new ViewModelStore();
    private final SavedStateRegistryController savedStateRegistryController = SavedStateRegistryController.INSTANCE.create(this);

    public final void initLifecycle(View owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (ViewTreeLifecycleOwner.get(owner) == null) {
            this.savedStateRegistryController.performRestore(null);
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            SavedStateHandleSupport.enableSavedStateHandles(this);
            attachToParent(owner);
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void destroyLifecycle(View owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (ViewTreeLifecycleOwner.get(owner) == null) {
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
            this.store.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void attachToParent(View owner) {
        ViewTreeLifecycleOwner.set(owner, this);
        ViewTreeViewModelStoreOwner.set(owner, this);
        ViewTreeSavedStateRegistryOwner.set(owner, this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    /* renamed from: getViewModelStore, reason: from getter */
    public ViewModelStore getStore() {
        return this.store;
    }
}
