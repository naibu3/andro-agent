package com.stripe.android.financialconnections.navigation;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavigator;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.navigation.Destination;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModel;
import com.stripe.android.financialconnections.presentation.FinancialConnectionsSheetNativeViewModelKt;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: Destination.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b1\u0018\u0000 <2\u00020\u0001:\u0018%&'()*+,-./0123456789:;<BB\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010 J)\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030$H\u0086\u0002R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R'\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rX\u0084\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0011\u0082\u0001\u0017=>?@ABCDEFGHIJKLMNOPQRS¨\u0006T²\u0006\n\u0010U\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination;", "", "route", "", "logPaneLaunched", "", "extraArgs", "", "Landroidx/navigation/NamedNavArgument;", ComposeNavigator.NAME, "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "<init>", "(Ljava/lang/String;ZLjava/util/List;Lkotlin/jvm/functions/Function3;)V", "getRoute", "()Ljava/lang/String;", "getLogPaneLaunched", "()Z", "getComposable", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "arguments", "getArguments", "()Ljava/util/List;", "fullRoute", "getFullRoute", "fullRoute$delegate", "Lkotlin/Lazy;", "Composable", "navBackStackEntry", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V", "invoke", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "", "InstitutionPicker", "Consent", "IDConsentContent", "PartnerAuthDrawer", "PartnerAuth", "AccountPicker", "Success", "ManualEntry", "AttachLinkedPaymentAccount", "NetworkingLinkSignup", "LinkLogin", "NetworkingLinkLoginWarmup", "NetworkingLinkVerification", "NetworkingSaveToLinkVerification", "LinkAccountPicker", "LinkStepUpVerification", "Reset", "Exit", "Notice", "AccountUpdateRequired", "Error", "BankAuthRepair", "ManualEntrySuccess", "Companion", "Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;", "Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;", "Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;", "Lcom/stripe/android/financialconnections/navigation/Destination$Consent;", "Lcom/stripe/android/financialconnections/navigation/Destination$Error;", "Lcom/stripe/android/financialconnections/navigation/Destination$Exit;", "Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;", "Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;", "Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;", "Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;", "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;", "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;", "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination$Notice;", "Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;", "Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;", "Lcom/stripe/android/financialconnections/navigation/Destination$Reset;", "Lcom/stripe/android/financialconnections/navigation/Destination$Success;", "financial-connections_release", "paneLaunchedTriggered"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class Destination {
    public static final String KEY_NEXT_PANE_ON_DISABLE_NETWORKING = "next_pane_on_disable_networking";
    public static final String KEY_REFERRER = "referrer";
    private final List<NamedNavArgument> arguments;
    private final Function3<NavBackStackEntry, Composer, Integer, Unit> composable;

    /* renamed from: fullRoute$delegate, reason: from kotlin metadata */
    private final Lazy fullRoute;
    private final boolean logPaneLaunched;
    private final String route;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ Destination(String str, boolean z, List list, Function3 function3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, list, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Composable$lambda$9(Destination destination, NavBackStackEntry navBackStackEntry, int i, Composer composer, int i2) {
        destination.Composable(navBackStackEntry, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Destination(String str, boolean z, List<NamedNavArgument> list, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
        this.route = str;
        this.logPaneLaunched = z;
        this.composable = function3;
        this.arguments = CollectionsKt.plus((Collection) CollectionsKt.listOf(NamedNavArgumentKt.navArgument(KEY_REFERRER, new Function1() { // from class: com.stripe.android.financialconnections.navigation.Destination$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Destination.arguments$lambda$0((NavArgumentBuilder) obj);
            }
        })), (Iterable) list);
        this.fullRoute = LazyKt.lazy(new Function0() { // from class: com.stripe.android.financialconnections.navigation.Destination$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Destination.fullRoute_delegate$lambda$3(this.f$0);
            }
        });
    }

    protected final String getRoute() {
        return this.route;
    }

    public final boolean getLogPaneLaunched() {
        return this.logPaneLaunched;
    }

    public /* synthetic */ Destination(String str, boolean z, List list, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? CollectionsKt.emptyList() : list, function3, null);
    }

    protected final Function3<NavBackStackEntry, Composer, Integer, Unit> getComposable() {
        return this.composable;
    }

    public final List<NamedNavArgument> getArguments() {
        return this.arguments;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit arguments$lambda$0(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        navArgument.setNullable(true);
        return Unit.INSTANCE;
    }

    public final String getFullRoute() {
        return (String) this.fullRoute.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String fullRoute_delegate$lambda$3(Destination destination) {
        List<NamedNavArgument> list = destination.arguments;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((NamedNavArgument) it.next()).getName());
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (Object obj : arrayList2) {
            linkedHashMap.put(obj, "{" + ((String) obj) + "}");
        }
        return DestinationKt.appendParamValues(destination.route, linkedHashMap);
    }

    public final void Composable(final NavBackStackEntry navBackStackEntry, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "navBackStackEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1572890450);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navBackStackEntry) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572890450, i2, -1, "com.stripe.android.financialconnections.navigation.Destination.Composable (Destination.kt:68)");
            }
            FinancialConnectionsSheetNativeViewModel financialConnectionsSheetNativeViewModelParentViewModel = FinancialConnectionsSheetNativeViewModelKt.parentViewModel(composerStartRestartGroup, 0);
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(2000779729);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.navigation.Destination$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Destination.Composable$lambda$5$lambda$4();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            composerStartRestartGroup.startReplaceGroup(2000781117);
            if (!Composable$lambda$6(mutableState)) {
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(2000783060);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(navBackStackEntry) | composerStartRestartGroup.changedInstance(financialConnectionsSheetNativeViewModelParentViewModel) | composerStartRestartGroup.changed(mutableState);
                Destination$Composable$1$1 destination$Composable$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || destination$Composable$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    destination$Composable$1$1RememberedValue = new Destination$Composable$1$1(navBackStackEntry, financialConnectionsSheetNativeViewModelParentViewModel, mutableState, null);
                    composerStartRestartGroup.updateRememberedValue(destination$Composable$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) destination$Composable$1$1RememberedValue, composerStartRestartGroup, 6);
            }
            composerStartRestartGroup.endReplaceGroup();
            this.composable.invoke(navBackStackEntry, composerStartRestartGroup, Integer.valueOf(i2 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.navigation.Destination$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Destination.Composable$lambda$9(this.f$0, navBackStackEntry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState Composable$lambda$5$lambda$4() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean Composable$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Composable$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String invoke$default(Destination destination, FinancialConnectionsSessionManifest.Pane pane, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        return destination.invoke(pane, map);
    }

    public final String invoke(FinancialConnectionsSessionManifest.Pane referrer, Map<String, String> extraArgs) {
        Intrinsics.checkNotNullParameter(referrer, "referrer");
        Intrinsics.checkNotNullParameter(extraArgs, "extraArgs");
        return DestinationKt.appendParamValues(this.route, MapsKt.plus(extraArgs, TuplesKt.to(KEY_REFERRER, referrer.getValue())));
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$InstitutionPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InstitutionPicker extends Destination {
        public static final int $stable = 0;
        public static final InstitutionPicker INSTANCE = new InstitutionPicker();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstitutionPicker)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1980129893;
        }

        public String toString() {
            return "InstitutionPicker";
        }

        private InstitutionPicker() {
            super(FinancialConnectionsSessionManifest.Pane.INSTITUTION_PICKER.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7509getLambda1$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Consent;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Consent extends Destination {
        public static final int $stable = 0;
        public static final Consent INSTANCE = new Consent();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Consent)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 170523535;
        }

        public String toString() {
            return "Consent";
        }

        private Consent() {
            super(FinancialConnectionsSessionManifest.Pane.CONSENT.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7520getLambda2$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$IDConsentContent;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IDConsentContent extends Destination {
        public static final int $stable = 0;
        public static final IDConsentContent INSTANCE = new IDConsentContent();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IDConsentContent)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1829603067;
        }

        public String toString() {
            return "IDConsentContent";
        }

        private IDConsentContent() {
            super(FinancialConnectionsSessionManifest.Pane.ID_CONSENT_CONTENT.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7525getLambda3$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuthDrawer;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PartnerAuthDrawer extends Destination {
        public static final int $stable = 0;
        public static final PartnerAuthDrawer INSTANCE = new PartnerAuthDrawer();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PartnerAuthDrawer)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1701540054;
        }

        public String toString() {
            return "PartnerAuthDrawer";
        }

        private PartnerAuthDrawer() {
            super(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH_DRAWER.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7526getLambda4$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$PartnerAuth;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PartnerAuth extends Destination {
        public static final int $stable = 0;
        public static final PartnerAuth INSTANCE = new PartnerAuth();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PartnerAuth)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1608450949;
        }

        public String toString() {
            return "PartnerAuth";
        }

        private PartnerAuth() {
            super(FinancialConnectionsSessionManifest.Pane.PARTNER_AUTH.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7527getLambda5$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$AccountPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountPicker extends Destination {
        public static final int $stable = 0;
        public static final AccountPicker INSTANCE = new AccountPicker();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountPicker)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1299547952;
        }

        public String toString() {
            return "AccountPicker";
        }

        private AccountPicker() {
            super(FinancialConnectionsSessionManifest.Pane.ACCOUNT_PICKER.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7528getLambda6$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Success;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends Destination {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1646820216;
        }

        public String toString() {
            return "Success";
        }

        private Success() {
            super(FinancialConnectionsSessionManifest.Pane.SUCCESS.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7529getLambda7$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntry;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ManualEntry extends Destination {
        public static final int $stable = 0;
        public static final ManualEntry INSTANCE = new ManualEntry();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualEntry)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 299603265;
        }

        public String toString() {
            return "ManualEntry";
        }

        private ManualEntry() {
            super(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7530getLambda8$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$AttachLinkedPaymentAccount;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AttachLinkedPaymentAccount extends Destination {
        public static final int $stable = 0;
        public static final AttachLinkedPaymentAccount INSTANCE = new AttachLinkedPaymentAccount();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AttachLinkedPaymentAccount)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1220396016;
        }

        public String toString() {
            return "AttachLinkedPaymentAccount";
        }

        private AttachLinkedPaymentAccount() {
            super(FinancialConnectionsSessionManifest.Pane.ATTACH_LINKED_PAYMENT_ACCOUNT.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7531getLambda9$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkSignup;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkingLinkSignup extends Destination {
        public static final int $stable = 0;
        public static final NetworkingLinkSignup INSTANCE = new NetworkingLinkSignup();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkingLinkSignup)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -498526607;
        }

        public String toString() {
            return "NetworkingLinkSignup";
        }

        private NetworkingLinkSignup() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_SIGNUP_PANE.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7510getLambda10$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$LinkLogin;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkLogin extends Destination {
        public static final int $stable = 0;
        public static final LinkLogin INSTANCE = new LinkLogin();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkLogin)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -541889084;
        }

        public String toString() {
            return "LinkLogin";
        }

        private LinkLogin() {
            super(FinancialConnectionsSessionManifest.Pane.LINK_LOGIN.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7511getLambda11$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkLoginWarmup;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkingLinkLoginWarmup extends Destination {
        public static final int $stable = 0;
        public static final NetworkingLinkLoginWarmup INSTANCE = new NetworkingLinkLoginWarmup();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkingLinkLoginWarmup)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2003945200;
        }

        public String toString() {
            return "NetworkingLinkLoginWarmup";
        }

        private NetworkingLinkLoginWarmup() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_LOGIN_WARMUP.getValue(), true, CollectionsKt.listOf(NamedNavArgumentKt.navArgument(Destination.KEY_NEXT_PANE_ON_DISABLE_NETWORKING, new Function1() { // from class: com.stripe.android.financialconnections.navigation.Destination$NetworkingLinkLoginWarmup$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Destination.NetworkingLinkLoginWarmup._init_$lambda$0((NavArgumentBuilder) obj);
                }
            })), ComposableSingletons$DestinationKt.INSTANCE.m7512getLambda12$financial_connections_release(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _init_$lambda$0(NavArgumentBuilder navArgument) {
            Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
            navArgument.setType(NavType.StringType);
            navArgument.setNullable(true);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingLinkVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkingLinkVerification extends Destination {
        public static final int $stable = 0;
        public static final NetworkingLinkVerification INSTANCE = new NetworkingLinkVerification();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkingLinkVerification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -309046092;
        }

        public String toString() {
            return "NetworkingLinkVerification";
        }

        private NetworkingLinkVerification() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_LINK_VERIFICATION.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7513getLambda13$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$NetworkingSaveToLinkVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkingSaveToLinkVerification extends Destination {
        public static final int $stable = 0;
        public static final NetworkingSaveToLinkVerification INSTANCE = new NetworkingSaveToLinkVerification();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NetworkingSaveToLinkVerification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -206442900;
        }

        public String toString() {
            return "NetworkingSaveToLinkVerification";
        }

        private NetworkingSaveToLinkVerification() {
            super(FinancialConnectionsSessionManifest.Pane.NETWORKING_SAVE_TO_LINK_VERIFICATION.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7514getLambda14$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$LinkAccountPicker;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAccountPicker extends Destination {
        public static final int $stable = 0;
        public static final LinkAccountPicker INSTANCE = new LinkAccountPicker();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkAccountPicker)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 637099126;
        }

        public String toString() {
            return "LinkAccountPicker";
        }

        private LinkAccountPicker() {
            super(FinancialConnectionsSessionManifest.Pane.LINK_ACCOUNT_PICKER.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7515getLambda15$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$LinkStepUpVerification;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkStepUpVerification extends Destination {
        public static final int $stable = 0;
        public static final LinkStepUpVerification INSTANCE = new LinkStepUpVerification();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LinkStepUpVerification)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 2029654983;
        }

        public String toString() {
            return "LinkStepUpVerification";
        }

        private LinkStepUpVerification() {
            super(FinancialConnectionsSessionManifest.Pane.LINK_STEP_UP_VERIFICATION.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7516getLambda16$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Reset;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Reset extends Destination {
        public static final int $stable = 0;
        public static final Reset INSTANCE = new Reset();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reset)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -486821372;
        }

        public String toString() {
            return "Reset";
        }

        private Reset() {
            super(FinancialConnectionsSessionManifest.Pane.RESET.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7517getLambda17$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Exit;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Exit extends Destination {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Exit)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1124451895;
        }

        public String toString() {
            return "Exit";
        }

        private Exit() {
            super(FinancialConnectionsSessionManifest.Pane.EXIT.getValue(), false, null, ComposableSingletons$DestinationKt.INSTANCE.m7518getLambda18$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Notice;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Notice extends Destination {
        public static final int $stable = 0;
        public static final Notice INSTANCE = new Notice();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Notice)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1983158467;
        }

        public String toString() {
            return "Notice";
        }

        private Notice() {
            super(FinancialConnectionsSessionManifest.Pane.NOTICE.getValue(), false, null, ComposableSingletons$DestinationKt.INSTANCE.m7519getLambda19$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$AccountUpdateRequired;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountUpdateRequired extends Destination {
        public static final int $stable = 0;
        public static final AccountUpdateRequired INSTANCE = new AccountUpdateRequired();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountUpdateRequired)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -283574838;
        }

        public String toString() {
            return "AccountUpdateRequired";
        }

        private AccountUpdateRequired() {
            super(FinancialConnectionsSessionManifest.Pane.ACCOUNT_UPDATE_REQUIRED.getValue(), false, null, ComposableSingletons$DestinationKt.INSTANCE.m7521getLambda20$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Error;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Error extends Destination {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -498440515;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(FinancialConnectionsSessionManifest.Pane.UNEXPECTED_ERROR.getValue(), false, null, ComposableSingletons$DestinationKt.INSTANCE.m7522getLambda21$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$BankAuthRepair;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BankAuthRepair extends Destination {
        public static final int $stable = 0;
        public static final BankAuthRepair INSTANCE = new BankAuthRepair();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BankAuthRepair)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -501991012;
        }

        public String toString() {
            return "BankAuthRepair";
        }

        private BankAuthRepair() {
            super(FinancialConnectionsSessionManifest.Pane.BANK_AUTH_REPAIR.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7523getLambda22$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$ManualEntrySuccess;", "Lcom/stripe/android/financialconnections/navigation/Destination;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ManualEntrySuccess extends Destination {
        public static final int $stable = 0;
        public static final ManualEntrySuccess INSTANCE = new ManualEntrySuccess();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ManualEntrySuccess)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1795356798;
        }

        public String toString() {
            return "ManualEntrySuccess";
        }

        private ManualEntrySuccess() {
            super(FinancialConnectionsSessionManifest.Pane.MANUAL_ENTRY_SUCCESS.getValue(), true, null, ComposableSingletons$DestinationKt.INSTANCE.m7524getLambda23$financial_connections_release(), 4, null);
        }
    }

    /* compiled from: Destination.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0002\b\bR\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/navigation/Destination$Companion;", "", "<init>", "()V", Destination.KEY_REFERRER, "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", CardScanActivity.ARGS, "Landroid/os/Bundle;", "referrer$financial_connections_release", "KEY_REFERRER", "", "KEY_NEXT_PANE_ON_DISABLE_NETWORKING", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FinancialConnectionsSessionManifest.Pane referrer$financial_connections_release(Bundle args) {
            String string;
            FinancialConnectionsSessionManifest.Pane pane = null;
            if (args == null || (string = args.getString(Destination.KEY_REFERRER)) == null) {
                return null;
            }
            Iterator<FinancialConnectionsSessionManifest.Pane> it = FinancialConnectionsSessionManifest.Pane.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                FinancialConnectionsSessionManifest.Pane next = it.next();
                if (Intrinsics.areEqual(next.getValue(), string)) {
                    pane = next;
                    break;
                }
            }
            return pane;
        }
    }
}
