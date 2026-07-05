package com.stripe.android.financialconnections.ui;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.navigation.NavHostController;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.topappbar.TopAppBarHost;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetNativeActivity.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0013\u001a\u00020\u000f*\u00020\u0014H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0004\"\u0018\u0010\u000e\u001a\u00020\u000f*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LocalNavHostController", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/navigation/NavHostController;", "getLocalNavHostController", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTestMode", "", "getLocalTestMode", "LocalImageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "getLocalImageLoader", "LocalTopAppBarHost", "Lcom/stripe/android/financialconnections/navigation/topappbar/TopAppBarHost;", "getLocalTopAppBarHost", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "getTheme", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;)Lcom/stripe/android/financialconnections/ui/theme/Theme;", "toLocalTheme", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Theme;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsSheetNativeActivityKt {
    private static final ProvidableCompositionLocal<NavHostController> LocalNavHostController = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinancialConnectionsSheetNativeActivityKt.LocalNavHostController$lambda$0();
        }
    });
    private static final ProvidableCompositionLocal<Boolean> LocalTestMode = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(FinancialConnectionsSheetNativeActivityKt.LocalTestMode$lambda$1());
        }
    });
    private static final ProvidableCompositionLocal<StripeImageLoader> LocalImageLoader = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinancialConnectionsSheetNativeActivityKt.LocalImageLoader$lambda$2();
        }
    });
    private static final ProvidableCompositionLocal<TopAppBarHost> LocalTopAppBarHost = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new Function0() { // from class: com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinancialConnectionsSheetNativeActivityKt.LocalTopAppBarHost$lambda$3();
        }
    });

    /* compiled from: FinancialConnectionsSheetNativeActivity.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Theme.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.DASHBOARD_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LINK_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ProvidableCompositionLocal<NavHostController> getLocalNavHostController() {
        return LocalNavHostController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavHostController LocalNavHostController$lambda$0() {
        throw new IllegalStateException("No NavHostController provided".toString());
    }

    public static final ProvidableCompositionLocal<Boolean> getLocalTestMode() {
        return LocalTestMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LocalTestMode$lambda$1() {
        throw new IllegalStateException("No TestMode provided".toString());
    }

    public static final ProvidableCompositionLocal<StripeImageLoader> getLocalImageLoader() {
        return LocalImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeImageLoader LocalImageLoader$lambda$2() {
        throw new IllegalStateException("No ImageLoader provided".toString());
    }

    public static final ProvidableCompositionLocal<TopAppBarHost> getLocalTopAppBarHost() {
        return LocalTopAppBarHost;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TopAppBarHost LocalTopAppBarHost$lambda$3() {
        throw new IllegalStateException("No TopAppBarHost provided".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Theme getTheme(FinancialConnectionsSheetNativeActivityArgs financialConnectionsSheetNativeActivityArgs) {
        Theme localTheme;
        FinancialConnectionsSessionManifest.Theme theme = financialConnectionsSheetNativeActivityArgs.getInitialSyncResponse().getManifest().getTheme();
        return (theme == null || (localTheme = toLocalTheme(theme)) == null) ? Theme.INSTANCE.getDefault() : localTheme;
    }

    public static final Theme toLocalTheme(FinancialConnectionsSessionManifest.Theme theme) {
        Intrinsics.checkNotNullParameter(theme, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1 || i == 2) {
            return Theme.DefaultLight;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return Theme.LinkLight;
    }
}
