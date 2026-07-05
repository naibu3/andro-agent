package com.stripe.android.financialconnections.presentation;

import android.os.Bundle;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.ElementsSessionContext;
import com.stripe.android.financialconnections.FinancialConnectionsSheetConfiguration;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetNativeActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.WebAuthFlowState;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.ui.core.cardscan.CardScanActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetNativeViewModel.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u0000 F2\u00020\u0001:\u0001FBs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001dJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0010HÆ\u0003J\t\u0010;\u001a\u00020\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u0007HÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u008f\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010#R\u0011\u0010\u0014\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006G"}, d2 = {"Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeState;", "", "flowType", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", FinancialConnectionsSheetNativeState.KEY_WEB_AUTH_FLOW, "Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;", FinancialConnectionsSheetNativeState.KEY_FIRST_INIT, "", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "reducedBranding", "testMode", "viewEffect", "Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "completed", "initialPane", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "isLinkWithStripe", "manualEntryUsesMicrodeposits", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;ZLcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;ZZLcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;ZLcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;Lcom/stripe/android/financialconnections/ui/theme/Theme;ZZLcom/stripe/android/financialconnections/ElementsSessionContext;)V", CardScanActivity.ARGS, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;", "savedState", "Landroid/os/Bundle;", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetNativeActivityArgs;Landroid/os/Bundle;)V", "getFlowType", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "getWebAuthFlow", "()Lcom/stripe/android/financialconnections/presentation/WebAuthFlowState;", "getFirstInit", "()Z", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getReducedBranding", "getTestMode", "getViewEffect", "()Lcom/stripe/android/financialconnections/presentation/FinancialConnectionsSheetNativeViewEffect;", "getCompleted", "getInitialPane", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest$Pane;", "getTheme", "()Lcom/stripe/android/financialconnections/ui/theme/Theme;", "getManualEntryUsesMicrodeposits", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FinancialConnectionsSheetNativeState {
    public static final String KEY_FIRST_INIT = "firstInit";
    public static final String KEY_SAVED_STATE = "FinancialConnectionsSheetNativeState";
    public static final String KEY_WEB_AUTH_FLOW = "webAuthFlow";
    private final boolean completed;
    private final FinancialConnectionsSheetConfiguration configuration;
    private final ElementsSessionContext elementsSessionContext;
    private final boolean firstInit;
    private final FinancialConnectionsSheetFlowType flowType;
    private final FinancialConnectionsSessionManifest.Pane initialPane;
    private final boolean isLinkWithStripe;
    private final boolean manualEntryUsesMicrodeposits;
    private final boolean reducedBranding;
    private final boolean testMode;
    private final Theme theme;
    private final FinancialConnectionsSheetNativeViewEffect viewEffect;
    private final WebAuthFlowState webAuthFlow;
    public static final int $stable = 8;

    public static /* synthetic */ FinancialConnectionsSheetNativeState copy$default(FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState, FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, WebAuthFlowState webAuthFlowState, boolean z, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, boolean z4, FinancialConnectionsSessionManifest.Pane pane, Theme theme, boolean z5, boolean z6, ElementsSessionContext elementsSessionContext, int i, Object obj) {
        if ((i & 1) != 0) {
            financialConnectionsSheetFlowType = financialConnectionsSheetNativeState.flowType;
        }
        return financialConnectionsSheetNativeState.copy(financialConnectionsSheetFlowType, (i & 2) != 0 ? financialConnectionsSheetNativeState.webAuthFlow : webAuthFlowState, (i & 4) != 0 ? financialConnectionsSheetNativeState.firstInit : z, (i & 8) != 0 ? financialConnectionsSheetNativeState.configuration : financialConnectionsSheetConfiguration, (i & 16) != 0 ? financialConnectionsSheetNativeState.reducedBranding : z2, (i & 32) != 0 ? financialConnectionsSheetNativeState.testMode : z3, (i & 64) != 0 ? financialConnectionsSheetNativeState.viewEffect : financialConnectionsSheetNativeViewEffect, (i & 128) != 0 ? financialConnectionsSheetNativeState.completed : z4, (i & 256) != 0 ? financialConnectionsSheetNativeState.initialPane : pane, (i & 512) != 0 ? financialConnectionsSheetNativeState.theme : theme, (i & 1024) != 0 ? financialConnectionsSheetNativeState.isLinkWithStripe : z5, (i & 2048) != 0 ? financialConnectionsSheetNativeState.manualEntryUsesMicrodeposits : z6, (i & 4096) != 0 ? financialConnectionsSheetNativeState.elementsSessionContext : elementsSessionContext);
    }

    /* renamed from: component1, reason: from getter */
    public final FinancialConnectionsSheetFlowType getFlowType() {
        return this.flowType;
    }

    /* renamed from: component10, reason: from getter */
    public final Theme getTheme() {
        return this.theme;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    /* renamed from: component13, reason: from getter */
    public final ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    /* renamed from: component2, reason: from getter */
    public final WebAuthFlowState getWebAuthFlow() {
        return this.webAuthFlow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFirstInit() {
        return this.firstInit;
    }

    /* renamed from: component4, reason: from getter */
    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getTestMode() {
        return this.testMode;
    }

    /* renamed from: component7, reason: from getter */
    public final FinancialConnectionsSheetNativeViewEffect getViewEffect() {
        return this.viewEffect;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    /* renamed from: component9, reason: from getter */
    public final FinancialConnectionsSessionManifest.Pane getInitialPane() {
        return this.initialPane;
    }

    public final FinancialConnectionsSheetNativeState copy(FinancialConnectionsSheetFlowType flowType, WebAuthFlowState webAuthFlow, boolean firstInit, FinancialConnectionsSheetConfiguration configuration, boolean reducedBranding, boolean testMode, FinancialConnectionsSheetNativeViewEffect viewEffect, boolean completed, FinancialConnectionsSessionManifest.Pane initialPane, Theme theme, boolean isLinkWithStripe, boolean manualEntryUsesMicrodeposits, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(webAuthFlow, "webAuthFlow");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        Intrinsics.checkNotNullParameter(theme, "theme");
        return new FinancialConnectionsSheetNativeState(flowType, webAuthFlow, firstInit, configuration, reducedBranding, testMode, viewEffect, completed, initialPane, theme, isLinkWithStripe, manualEntryUsesMicrodeposits, elementsSessionContext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinancialConnectionsSheetNativeState)) {
            return false;
        }
        FinancialConnectionsSheetNativeState financialConnectionsSheetNativeState = (FinancialConnectionsSheetNativeState) other;
        return this.flowType == financialConnectionsSheetNativeState.flowType && Intrinsics.areEqual(this.webAuthFlow, financialConnectionsSheetNativeState.webAuthFlow) && this.firstInit == financialConnectionsSheetNativeState.firstInit && Intrinsics.areEqual(this.configuration, financialConnectionsSheetNativeState.configuration) && this.reducedBranding == financialConnectionsSheetNativeState.reducedBranding && this.testMode == financialConnectionsSheetNativeState.testMode && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetNativeState.viewEffect) && this.completed == financialConnectionsSheetNativeState.completed && this.initialPane == financialConnectionsSheetNativeState.initialPane && this.theme == financialConnectionsSheetNativeState.theme && this.isLinkWithStripe == financialConnectionsSheetNativeState.isLinkWithStripe && this.manualEntryUsesMicrodeposits == financialConnectionsSheetNativeState.manualEntryUsesMicrodeposits && Intrinsics.areEqual(this.elementsSessionContext, financialConnectionsSheetNativeState.elementsSessionContext);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.flowType.hashCode() * 31) + this.webAuthFlow.hashCode()) * 31) + Boolean.hashCode(this.firstInit)) * 31) + this.configuration.hashCode()) * 31) + Boolean.hashCode(this.reducedBranding)) * 31) + Boolean.hashCode(this.testMode)) * 31;
        FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect = this.viewEffect;
        int iHashCode2 = (((((((((((iHashCode + (financialConnectionsSheetNativeViewEffect == null ? 0 : financialConnectionsSheetNativeViewEffect.hashCode())) * 31) + Boolean.hashCode(this.completed)) * 31) + this.initialPane.hashCode()) * 31) + this.theme.hashCode()) * 31) + Boolean.hashCode(this.isLinkWithStripe)) * 31) + Boolean.hashCode(this.manualEntryUsesMicrodeposits)) * 31;
        ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
        return iHashCode2 + (elementsSessionContext != null ? elementsSessionContext.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsSheetNativeState(flowType=" + this.flowType + ", webAuthFlow=" + this.webAuthFlow + ", firstInit=" + this.firstInit + ", configuration=" + this.configuration + ", reducedBranding=" + this.reducedBranding + ", testMode=" + this.testMode + ", viewEffect=" + this.viewEffect + ", completed=" + this.completed + ", initialPane=" + this.initialPane + ", theme=" + this.theme + ", isLinkWithStripe=" + this.isLinkWithStripe + ", manualEntryUsesMicrodeposits=" + this.manualEntryUsesMicrodeposits + ", elementsSessionContext=" + this.elementsSessionContext + ")";
    }

    public FinancialConnectionsSheetNativeState(FinancialConnectionsSheetFlowType flowType, WebAuthFlowState webAuthFlow, boolean z, FinancialConnectionsSheetConfiguration configuration, boolean z2, boolean z3, FinancialConnectionsSheetNativeViewEffect financialConnectionsSheetNativeViewEffect, boolean z4, FinancialConnectionsSessionManifest.Pane initialPane, Theme theme, boolean z5, boolean z6, ElementsSessionContext elementsSessionContext) {
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        Intrinsics.checkNotNullParameter(webAuthFlow, "webAuthFlow");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(initialPane, "initialPane");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.flowType = flowType;
        this.webAuthFlow = webAuthFlow;
        this.firstInit = z;
        this.configuration = configuration;
        this.reducedBranding = z2;
        this.testMode = z3;
        this.viewEffect = financialConnectionsSheetNativeViewEffect;
        this.completed = z4;
        this.initialPane = initialPane;
        this.theme = theme;
        this.isLinkWithStripe = z5;
        this.manualEntryUsesMicrodeposits = z6;
        this.elementsSessionContext = elementsSessionContext;
    }

    public final FinancialConnectionsSheetFlowType getFlowType() {
        return this.flowType;
    }

    public final WebAuthFlowState getWebAuthFlow() {
        return this.webAuthFlow;
    }

    public final boolean getFirstInit() {
        return this.firstInit;
    }

    public final FinancialConnectionsSheetConfiguration getConfiguration() {
        return this.configuration;
    }

    public final boolean getReducedBranding() {
        return this.reducedBranding;
    }

    public final boolean getTestMode() {
        return this.testMode;
    }

    public final FinancialConnectionsSheetNativeViewEffect getViewEffect() {
        return this.viewEffect;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final FinancialConnectionsSessionManifest.Pane getInitialPane() {
        return this.initialPane;
    }

    public final Theme getTheme() {
        return this.theme;
    }

    public final boolean isLinkWithStripe() {
        return this.isLinkWithStripe;
    }

    public final boolean getManualEntryUsesMicrodeposits() {
        return this.manualEntryUsesMicrodeposits;
    }

    public final ElementsSessionContext getElementsSessionContext() {
        return this.elementsSessionContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FinancialConnectionsSheetNativeState(FinancialConnectionsSheetNativeActivityArgs args, Bundle bundle) {
        Theme localTheme;
        WebAuthFlowState.Uninitialized uninitialized;
        Intrinsics.checkNotNullParameter(args, "args");
        FinancialConnectionsSheetFlowType flowType = args.getFlowType();
        WebAuthFlowState webAuthFlowState = (bundle == null || (uninitialized = (WebAuthFlowState) bundle.getParcelable(KEY_WEB_AUTH_FLOW)) == null) ? WebAuthFlowState.Uninitialized.INSTANCE : uninitialized;
        boolean reducedBranding = args.getInitialSyncResponse().getVisual().getReducedBranding();
        boolean z = !args.getInitialSyncResponse().getManifest().getLivemode();
        boolean z2 = bundle != null ? bundle.getBoolean(KEY_FIRST_INIT, true) : true;
        FinancialConnectionsSessionManifest.Pane nextPane = args.getInitialSyncResponse().getManifest().getNextPane();
        FinancialConnectionsSheetConfiguration configuration = args.getConfiguration();
        FinancialConnectionsSessionManifest.Theme theme = args.getInitialSyncResponse().getManifest().getTheme();
        Theme theme2 = (theme == null || (localTheme = FinancialConnectionsSheetNativeActivityKt.toLocalTheme(theme)) == null) ? Theme.INSTANCE.getDefault() : localTheme;
        Boolean boolIsLinkWithStripe = args.getInitialSyncResponse().getManifest().isLinkWithStripe();
        this(flowType, webAuthFlowState, z2, configuration, reducedBranding, z, null, false, nextPane, theme2, boolIsLinkWithStripe != null ? boolIsLinkWithStripe.booleanValue() : false, args.getInitialSyncResponse().getManifest().getManualEntryUsesMicrodeposits(), args.getElementsSessionContext());
    }
}
