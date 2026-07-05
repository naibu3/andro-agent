package com.stripe.android.financialconnections.navigation.bottomsheet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorState;
import com.facebook.common.util.UriUtil;
import com.facebook.internal.ServerProtocol;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BottomSheetNavigation.kt */
@Navigator.Name("BottomSheetNavigator")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016J*\u0010,\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0017J\u0018\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00190\u00138@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u001cX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR.\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0002\b#¢\u0006\u0002\b$8\u0000X\u0081\u0004¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&¨\u00066²\u0006\u0010\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019X\u008a\u0084\u0002²\u0006\f\u00108\u001a\u0004\u0018\u00010\u0015X\u008a\u0084\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", "Landroidx/navigation/Navigator;", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$Destination;", "sheetState", "Landroidx/compose/material/ModalBottomSheetState;", "<init>", "(Landroidx/compose/material/ModalBottomSheetState;)V", "getSheetState$financial_connections_release", "()Landroidx/compose/material/ModalBottomSheetState;", "<set-?>", "", "attached", "getAttached", "()Z", "setAttached", "(Z)V", "attached$delegate", "Landroidx/compose/runtime/MutableState;", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "transitionsInProgress", "", "getTransitionsInProgress$financial_connections_release", "navigatorSheetState", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;", "getNavigatorSheetState$financial_connections_release", "()Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigatorSheetState;", "sheetContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "getSheetContent$financial_connections_release", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "onAttach", ServerProtocol.DIALOG_PARAM_STATE, "Landroidx/navigation/NavigatorState;", "createDestination", "navigate", "entries", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "popUpTo", "savedState", "Destination", "financial-connections_release", "transitionsInProgressEntries", "retainedEntry"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BottomSheetNavigator extends Navigator<Destination> {
    public static final int $stable = ModalBottomSheetState.$stable;

    /* renamed from: attached$delegate, reason: from kotlin metadata */
    private final MutableState attached;
    private final BottomSheetNavigatorSheetState navigatorSheetState;
    private final Function3<ColumnScope, Composer, Integer, Unit> sheetContent;
    private final ModalBottomSheetState sheetState;

    /* renamed from: getSheetState$financial_connections_release, reason: from getter */
    public final ModalBottomSheetState getSheetState() {
        return this.sheetState;
    }

    public BottomSheetNavigator(ModalBottomSheetState sheetState) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        this.sheetState = sheetState;
        this.attached = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.navigatorSheetState = new BottomSheetNavigatorSheetState(sheetState);
        this.sheetContent = ComposableLambdaKt.composableLambdaInstance(-1706159018, true, new BottomSheetNavigator$sheetContent$1(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAttached() {
        return ((Boolean) this.attached.getValue()).booleanValue();
    }

    private final void setAttached(boolean z) {
        this.attached.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        if (getAttached()) {
            return getState().getBackStack();
        }
        return StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    }

    public final StateFlow<Set<NavBackStackEntry>> getTransitionsInProgress$financial_connections_release() {
        if (getAttached()) {
            return getState().getTransitionsInProgress();
        }
        return StateFlowKt.MutableStateFlow(SetsKt.emptySet());
    }

    /* renamed from: getNavigatorSheetState$financial_connections_release, reason: from getter */
    public final BottomSheetNavigatorSheetState getNavigatorSheetState() {
        return this.navigatorSheetState;
    }

    public final Function3<ColumnScope, Composer, Integer, Unit> getSheetContent$financial_connections_release() {
        return this.sheetContent;
    }

    @Override // androidx.navigation.Navigator
    public void onAttach(NavigatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onAttach(state);
        setAttached(true);
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, ComposableSingletons$BottomSheetNavigationKt.INSTANCE.m7538getLambda1$financial_connections_release());
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            getState().pushWithTransition((NavBackStackEntry) it.next());
        }
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry popUpTo, boolean savedState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        getState().popWithTransition(popUpTo, savedState);
    }

    /* compiled from: BottomSheetNavigation.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000b¢\u0006\u0004\b\f\u0010\rR2\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "navigator", "Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "<init>", "(Lcom/stripe/android/financialconnections/navigation/bottomsheet/BottomSheetNavigator;Lkotlin/jvm/functions/Function4;)V", "getContent$financial_connections_release", "()Lkotlin/jvm/functions/Function4;", "Lkotlin/jvm/functions/Function4;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 0;
        private final Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit> content;

        public final Function4<ColumnScope, NavBackStackEntry, Composer, Integer, Unit> getContent$financial_connections_release() {
            return this.content;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Destination(BottomSheetNavigator navigator, Function4<? super ColumnScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> content) {
            super(navigator);
            Intrinsics.checkNotNullParameter(navigator, "navigator");
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }
    }
}
