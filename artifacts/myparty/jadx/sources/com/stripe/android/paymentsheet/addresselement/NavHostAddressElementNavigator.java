package com.stripe.android.paymentsheet.addresselement;

import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AddressElementNavigator.kt */
@Singleton
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J$\u0010\u001a\u001a\n\u0012\u0004\u0012\u0002H\u001c\u0018\u00010\u001b\"\n\b\u0000\u0010\u001c*\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\fH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "<init>", "()V", "navigationController", "Landroidx/navigation/NavHostController;", "getNavigationController", "()Landroidx/navigation/NavHostController;", "setNavigationController", "(Landroidx/navigation/NavHostController;)V", "onDismiss", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;", "", "getOnDismiss", "()Lkotlin/jvm/functions/Function1;", "setOnDismiss", "(Lkotlin/jvm/functions/Function1;)V", "navigateTo", TypedValues.AttributesType.S_TARGET, "Lcom/stripe/android/paymentsheet/addresselement/AddressElementScreen;", "setResult", SDKConstants.PARAM_KEY, "", "value", "", "getResultFlow", "Lkotlinx/coroutines/flow/Flow;", ExifInterface.GPS_DIRECTION_TRUE, "dismiss", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "onBack", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavHostAddressElementNavigator implements AddressElementNavigator {
    public static final int $stable = 8;
    private NavHostController navigationController;
    private Function1<? super AddressLauncherResult, Unit> onDismiss;

    @Inject
    public NavHostAddressElementNavigator() {
    }

    public final NavHostController getNavigationController() {
        return this.navigationController;
    }

    public final void setNavigationController(NavHostController navHostController) {
        this.navigationController = navHostController;
    }

    public final Function1<AddressLauncherResult, Unit> getOnDismiss() {
        return this.onDismiss;
    }

    public final void setOnDismiss(Function1<? super AddressLauncherResult, Unit> function1) {
        this.onDismiss = function1;
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator
    public void navigateTo(AddressElementScreen target) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(target, "target");
        NavHostController navHostController = this.navigationController;
        if (navHostController != null) {
            NavController.navigate$default((NavController) navHostController, target.getRoute(), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        }
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator
    public void setResult(String key, Object value) {
        NavBackStackEntry previousBackStackEntry;
        SavedStateHandle savedStateHandle;
        Intrinsics.checkNotNullParameter(key, "key");
        NavHostController navHostController = this.navigationController;
        if (navHostController == null || (previousBackStackEntry = navHostController.getPreviousBackStackEntry()) == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) {
            return;
        }
        savedStateHandle.set(key, value);
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator
    public <T> Flow<T> getResultFlow(String key) {
        NavBackStackEntry currentBackStackEntry;
        Intrinsics.checkNotNullParameter(key, "key");
        NavHostController navHostController = this.navigationController;
        if (navHostController == null || (currentBackStackEntry = navHostController.getCurrentBackStackEntry()) == null) {
            return null;
        }
        return FlowKt.filterNotNull(currentBackStackEntry.getSavedStateHandle().getStateFlow(key, null));
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator
    public void dismiss(AddressLauncherResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Function1<? super AddressLauncherResult, Unit> function1 = this.onDismiss;
        if (function1 != null) {
            function1.invoke(result);
        }
    }

    @Override // com.stripe.android.paymentsheet.addresselement.AddressElementNavigator
    public void onBack() {
        NavHostController navHostController = this.navigationController;
        if (navHostController == null || navHostController.popBackStack()) {
            return;
        }
        AddressElementNavigator.DefaultImpls.dismiss$default(this, null, 1, null);
    }
}
