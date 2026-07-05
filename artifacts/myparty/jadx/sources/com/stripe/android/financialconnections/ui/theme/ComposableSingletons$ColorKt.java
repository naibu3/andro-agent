package com.stripe.android.financialconnections.ui.theme;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Color.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ComposableSingletons$ColorKt {
    public static final ComposableSingletons$ColorKt INSTANCE = new ComposableSingletons$ColorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f144lambda1 = ComposableLambdaKt.composableLambdaInstance(-47223258, false, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.theme.ComposableSingletons$ColorKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-47223258, i, -1, "com.stripe.android.financialconnections.ui.theme.ComposableSingletons$ColorKt.lambda-1.<anonymous> (Color.kt:85)");
                }
                Modifier modifierM575backgroundbw27NRU$default = BackgroundKt.m575backgroundbw27NRU$default(Modifier.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7630getBackground0d7_KjU(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM575backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ColorKt.m7597ColorPreviewRPmYEkk("background", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7630getBackground0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("backgroundSecondary", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7632getBackgroundSecondary0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("backgroundHighlighted", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7631getBackgroundHighlighted0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("textDefault", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("textSubdued", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7647getTextSubdued0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("textCritical", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7644getTextCritical0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk(PaymentSheetAppearanceKeys.ICON, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7635getIcon0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("borderNeutral", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7634getBorderNeutral0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("spinnerNeutral", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7642getSpinnerNeutral0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("warningLight", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7649getWarningLight0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("warning", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7648getWarning0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk(PaymentSheetAppearanceKeys.PRIMARY, FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7639getPrimary0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("primaryAccent", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7640getPrimaryAccent0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("textAction", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7643getTextAction0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("textFieldFocused", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7646getTextFieldFocused0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("logo", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7638getLogo0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("iconTint", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7637getIconTint0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("iconBackground", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7636getIconBackground0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("spinner", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7641getSpinner0d7_KjU(), composer, 6);
                ColorKt.m7597ColorPreviewRPmYEkk("border", FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7633getBorder0d7_KjU(), composer, 6);
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
    });

    /* renamed from: getLambda-1$financial_connections_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7599getLambda1$financial_connections_release() {
        return f144lambda1;
    }
}
