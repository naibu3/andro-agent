package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import defpackage.FinancialConnectionsGenericInfoScreen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountItem.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$AccountItemKt$lambda2$1 implements Function3<PaddingValues, Composer, Integer, Unit> {
    public static final ComposableSingletons$AccountItemKt$lambda2$1 INSTANCE = new ComposableSingletons$AccountItemKt$lambda2$1();

    ComposableSingletons$AccountItemKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(23054037, i, -1, "com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt.lambda-2.<anonymous> (AccountItem.kt:224)");
            }
            float f = 16;
            Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1020padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composer.startReplaceGroup(-631642272);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$1$lambda$0((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            AccountItemKt.AccountItem(false, false, (Function1) objRememberedValue, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Regular Checking", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) null, "allowSelectionMessage", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 515584, (DefaultConstructorMarker) null), new NetworkedAccount("id", true, "With some caption", null, new Image("www.image.com"), null, null, null, (FinancialConnectionsGenericInfoScreen) null, 488, (DefaultConstructorMarker) null), composer, 390, 2);
            composer.startReplaceGroup(-631598624);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$3$lambda$2((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AccountItemKt.AccountItem(false, false, (Function1) objRememberedValue2, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Regular Checking", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) null, "allowSelectionMessage", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 515584, (DefaultConstructorMarker) null), null, composer, 390, 18);
            composer.startReplaceGroup(-631563968);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$5$lambda$4((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            AccountItemKt.AccountItem(true, false, (Function1) objRememberedValue3, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Regular Checking (Selected)", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) null, "allowSelectionMessage", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 515584, (DefaultConstructorMarker) null), new NetworkedAccount("id", true, null, null, new Image("www.image.com"), null, null, null, null, 492, (DefaultConstructorMarker) null), composer, 390, 2);
            composer.startReplaceGroup(-631521728);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$7$lambda$6((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            AccountItemKt.AccountItem(false, false, (Function1) objRememberedValue4, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Regular Checking (Disabled)", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) false, (String) null, (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511488, (DefaultConstructorMarker) null), new NetworkedAccount("id", false, null, null, new Image("www.image.com"), null, null, null, null, 492, (DefaultConstructorMarker) null), composer, 390, 2);
            composer.startReplaceGroup(-631478496);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$9$lambda$8((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            AccountItemKt.AccountItem(false, false, (Function1) objRememberedValue5, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Regular Checking (Disabled)", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) false, "Unselectable with custom message", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511488, (DefaultConstructorMarker) null), new NetworkedAccount("id", false, null, null, new Image("www.image.com"), null, null, null, null, 492, (DefaultConstructorMarker) null), composer, 390, 2);
            composer.startReplaceGroup(-631434304);
            Object objRememberedValue6 = composer.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ComposableSingletons$AccountItemKt$lambda-2$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$AccountItemKt$lambda2$1.invoke$lambda$12$lambda$11$lambda$10((PartnerAccount) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue6);
            }
            composer.endReplaceGroup();
            String str = "id";
            boolean z = false;
            AccountItemKt.AccountItem(false, false, (Function1) objRememberedValue6, new PartnerAccount("", FinancialConnectionsAccount.Category.CASH, "id", "Manually entered (Disabled)", FinancialConnectionsAccount.Subcategory.CHECKING, CollectionsKt.emptyList(), (Integer) 100, "USD", new FinancialConnectionsInstitution(false, "id", false, "Bank of America", new Image("www.image.com"), (Image) null, (Integer) null, (String) null, 224, (DefaultConstructorMarker) null), (String) null, (Integer) null, (String) null, (Boolean) false, "Visually disabled but clickable", (FinancialConnectionsSessionManifest.Pane) null, (String) null, (String) null, (String) null, (FinancialConnectionsAccount.Status) null, 511488, (DefaultConstructorMarker) null), new NetworkedAccount(str, z, null, null, new Image("www.image.com"), null, (Image) null, null, new FinancialConnectionsGenericInfoScreen("id", (FinancialConnectionsGenericInfoScreen.Header) null, (FinancialConnectionsGenericInfoScreen.Body) null, (FinancialConnectionsGenericInfoScreen.Footer) null, (FinancialConnectionsGenericInfoScreen.Options) null, 30, (DefaultConstructorMarker) null), 236, (DefaultConstructorMarker) null), composer, 390, 2);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$1$lambda$0(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$3$lambda$2(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$5$lambda$4(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$7$lambda$6(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$9$lambda$8(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10(PartnerAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
