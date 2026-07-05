package com.stripe.android.uicore.navigation;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: NavigationManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\bH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/uicore/navigation/NavigationManager;", "", "navigationFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/stripe/android/uicore/navigation/NavigationIntent;", "getNavigationFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "tryNavigateTo", "", "route", "", "popUpTo", "Lcom/stripe/android/uicore/navigation/PopUpToBehavior;", "isSingleTop", "", "tryNavigateBack", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface NavigationManager {
    SharedFlow<NavigationIntent> getNavigationFlow();

    void tryNavigateBack();

    void tryNavigateTo(String route, PopUpToBehavior popUpTo, boolean isSingleTop);

    /* compiled from: NavigationManager.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void tryNavigateTo$default(NavigationManager navigationManager, String str, PopUpToBehavior popUpToBehavior, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryNavigateTo");
            }
            if ((i & 2) != 0) {
                popUpToBehavior = null;
            }
            if ((i & 4) != 0) {
                z = true;
            }
            navigationManager.tryNavigateTo(str, popUpToBehavior, z);
        }
    }
}
