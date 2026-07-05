package com.stripe.android.paymentelement.embedded.content;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodEmbeddedLayoutUIKt;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import com.stripe.android.uicore.StripeThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmbeddedContent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u0003HÂ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÂ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/content/EmbeddedContent;", "", "interactor", "Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;", "embeddedViewDisplaysMandateText", "", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "isImmediateAction", "<init>", "(Lcom/stripe/android/paymentsheet/verticalmode/PaymentMethodVerticalLayoutInteractor;ZLcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Z)V", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EmbeddedContent {
    public static final int $stable = 0;
    private final PaymentSheet.Appearance.Embedded appearance;
    private final boolean embeddedViewDisplaysMandateText;
    private final PaymentMethodVerticalLayoutInteractor interactor;
    private final boolean isImmediateAction;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(EmbeddedContent embeddedContent, int i, Composer composer, int i2) {
        embeddedContent.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: component1, reason: from getter */
    private final PaymentMethodVerticalLayoutInteractor getInteractor() {
        return this.interactor;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getEmbeddedViewDisplaysMandateText() {
        return this.embeddedViewDisplaysMandateText;
    }

    /* renamed from: component3, reason: from getter */
    private final PaymentSheet.Appearance.Embedded getAppearance() {
        return this.appearance;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsImmediateAction() {
        return this.isImmediateAction;
    }

    public static /* synthetic */ EmbeddedContent copy$default(EmbeddedContent embeddedContent, PaymentMethodVerticalLayoutInteractor paymentMethodVerticalLayoutInteractor, boolean z, PaymentSheet.Appearance.Embedded embedded, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentMethodVerticalLayoutInteractor = embeddedContent.interactor;
        }
        if ((i & 2) != 0) {
            z = embeddedContent.embeddedViewDisplaysMandateText;
        }
        if ((i & 4) != 0) {
            embedded = embeddedContent.appearance;
        }
        if ((i & 8) != 0) {
            z2 = embeddedContent.isImmediateAction;
        }
        return embeddedContent.copy(paymentMethodVerticalLayoutInteractor, z, embedded, z2);
    }

    public final EmbeddedContent copy(PaymentMethodVerticalLayoutInteractor interactor, boolean embeddedViewDisplaysMandateText, PaymentSheet.Appearance.Embedded appearance, boolean isImmediateAction) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        return new EmbeddedContent(interactor, embeddedViewDisplaysMandateText, appearance, isImmediateAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmbeddedContent)) {
            return false;
        }
        EmbeddedContent embeddedContent = (EmbeddedContent) other;
        return Intrinsics.areEqual(this.interactor, embeddedContent.interactor) && this.embeddedViewDisplaysMandateText == embeddedContent.embeddedViewDisplaysMandateText && Intrinsics.areEqual(this.appearance, embeddedContent.appearance) && this.isImmediateAction == embeddedContent.isImmediateAction;
    }

    public int hashCode() {
        return (((((this.interactor.hashCode() * 31) + Boolean.hashCode(this.embeddedViewDisplaysMandateText)) * 31) + this.appearance.hashCode()) * 31) + Boolean.hashCode(this.isImmediateAction);
    }

    public String toString() {
        return "EmbeddedContent(interactor=" + this.interactor + ", embeddedViewDisplaysMandateText=" + this.embeddedViewDisplaysMandateText + ", appearance=" + this.appearance + ", isImmediateAction=" + this.isImmediateAction + ")";
    }

    public EmbeddedContent(PaymentMethodVerticalLayoutInteractor interactor, boolean z, PaymentSheet.Appearance.Embedded appearance, boolean z2) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.interactor = interactor;
        this.embeddedViewDisplaysMandateText = z;
        this.appearance = appearance;
        this.isImmediateAction = z2;
    }

    public final void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-455665703);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-455665703, i2, -1, "com.stripe.android.paymentelement.embedded.content.EmbeddedContent.Content (EmbeddedContent.kt:21)");
            }
            PaymentSheet.Appearance.Embedded.RowStyle style = this.appearance.getStyle();
            Boolean boolValueOf = Boolean.valueOf(this.isImmediateAction);
            composerStartRestartGroup.startReplaceGroup(-1141939659);
            boolean z = (i2 & 14) == 4;
            EmbeddedContent$Content$1$1 embeddedContent$Content$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || embeddedContent$Content$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                embeddedContent$Content$1$1RememberedValue = new EmbeddedContent$Content$1$1(this, null);
                composerStartRestartGroup.updateRememberedValue(embeddedContent$Content$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(style, boolValueOf, (Function2) embeddedContent$Content$1$1RememberedValue, composerStartRestartGroup, 0);
            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1473488529, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentelement.embedded.content.EmbeddedContent.Content.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473488529, i3, -1, "com.stripe.android.paymentelement.embedded.content.EmbeddedContent.Content.<anonymous> (EmbeddedContent.kt:43)");
                        }
                        Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                        EmbeddedContent embeddedContent = EmbeddedContent.this;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        PaymentMethodEmbeddedLayoutUIKt.PaymentMethodEmbeddedLayoutUI(ColumnScopeInstance.INSTANCE, embeddedContent.interactor, embeddedContent.embeddedViewDisplaysMandateText, null, embeddedContent.appearance, composer2, 6, 4);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentelement.embedded.content.EmbeddedContent$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmbeddedContent.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
