package com.stripe.android.uicore.navigation;

import com.stripe.android.uicore.navigation.NavigationIntent;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* compiled from: NavigationManager.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavigationManagerImpl;", "Lcom/stripe/android/uicore/navigation/NavigationManager;", "<init>", "()V", "_navigationFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "navigationFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getNavigationFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "tryNavigateTo", "", "route", "", "popUpTo", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "isSingleTop", "", "tryNavigateBack", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationManagerImpl implements NavigationManager {
    public static final int $stable = 8;
    private final MutableSharedFlow<NavigationIntent> _navigationFlow;
    private final SharedFlow<NavigationIntent> navigationFlow;

    @Inject
    public NavigationManagerImpl() {
        MutableSharedFlow<NavigationIntent> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this._navigationFlow = mutableSharedFlowMutableSharedFlow$default;
        this.navigationFlow = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    @Override // com.stripe.android.uicore.navigation.NavigationManager
    public SharedFlow<NavigationIntent> getNavigationFlow() {
        return this.navigationFlow;
    }

    @Override // com.stripe.android.uicore.navigation.NavigationManager
    public void tryNavigateTo(String route, PopUpToBehavior popUpTo, boolean isSingleTop) {
        Intrinsics.checkNotNullParameter(route, "route");
        this._navigationFlow.tryEmit(new NavigationIntent.NavigateTo(route, popUpTo, isSingleTop));
    }

    @Override // com.stripe.android.uicore.navigation.NavigationManager
    public void tryNavigateBack() {
        this._navigationFlow.tryEmit(NavigationIntent.NavigateBack.INSTANCE);
    }
}
