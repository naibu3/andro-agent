package com.stripe.android.financialconnections.features.common;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.core.os.ConfigurationCompat;
import androidx.core.view.PointerIconCompat;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.NetworkedAccount;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.components.MultipleEventsCutterKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.format.CurrencyFormatter;
import com.stripe.android.uicore.text.MiddleEllipsisTextKt;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AccountItem.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0010\u001a)\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0012*\u00020\u0007H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0016\u001a\u00020\u0017X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"AccountItem", "", "selected", "", "showInstitutionIcon", "onAccountClicked", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/model/PartnerAccount;", "account", "networkedAccount", "Lcom/stripe/android/financialconnections/model/NetworkedAccount;", "(ZZLkotlin/jvm/functions/Function1;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;Landroidx/compose/runtime/Composer;II)V", "getVisibilityState", "Lcom/stripe/android/financialconnections/features/common/AccountSelectionState;", "AccountSubtitle", "accountSelectionState", "(Lcom/stripe/android/financialconnections/features/common/AccountSelectionState;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;Landroidx/compose/runtime/Composer;I)V", "getSubtitle", "", "(Lcom/stripe/android/financialconnections/features/common/AccountSelectionState;Lcom/stripe/android/financialconnections/model/PartnerAccount;Lcom/stripe/android/financialconnections/model/NetworkedAccount;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "getFormattedBalance", "(Lcom/stripe/android/financialconnections/model/PartnerAccount;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "VISUALLY_DISABLED_ALPHA", "", "AccountItemPreview", "(Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountItemKt {
    private static final float VISUALLY_DISABLED_ALPHA = 0.6f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountItem$lambda$9(boolean z, boolean z2, Function1 function1, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, int i, int i2, Composer composer, int i3) {
        AccountItem(z, z2, function1, partnerAccount, networkedAccount, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountItemPreview$lambda$14(int i, Composer composer, int i2) {
        AccountItemPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSubtitle$lambda$13(AccountSelectionState accountSelectionState, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, int i, Composer composer, int i2) {
        AccountSubtitle(accountSelectionState, partnerAccount, networkedAccount, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountItem(final boolean z, boolean z2, final Function1<? super PartnerAccount, Unit> onAccountClicked, final PartnerAccount account, NetworkedAccount networkedAccount, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        NetworkedAccount networkedAccount2;
        final View view;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        NetworkedAccount networkedAccount3;
        long jM7634getBorderNeutral0d7_KjU;
        boolean zChangedInstance;
        Object objRememberedValue3;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM3150constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Image icon;
        String str;
        String str2;
        int i5;
        int currentCompositeKeyHash3;
        Composer composerM3150constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        final NetworkedAccount networkedAccount4;
        final boolean z4;
        String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onAccountClicked, "onAccountClicked");
        Intrinsics.checkNotNullParameter(account, "account");
        Composer composerStartRestartGroup = composer.startRestartGroup(-710651219);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z3 = z2;
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAccountClicked) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(account) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    networkedAccount2 = networkedAccount;
                    i3 |= composerStartRestartGroup.changedInstance(networkedAccount2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    boolean z5 = i6 == 0 ? true : z3;
                    if (i4 != 0) {
                        networkedAccount2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-710651219, i3, -1, "com.stripe.android.financialconnections.features.common.AccountItem (AccountItem.kt:66)");
                    }
                    ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume = composerStartRestartGroup.consume(localView);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    view = (View) objConsume;
                    composerStartRestartGroup.startReplaceGroup(1921026932);
                    zChanged = composerStartRestartGroup.changed(account) | composerStartRestartGroup.changed(networkedAccount2);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = getVisibilityState(account, networkedAccount2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    AccountSelectionState accountSelectionState = (AccountSelectionState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1921030181);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12));
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    networkedAccount3 = networkedAccount2;
                    RoundedCornerShape roundedCornerShape = (RoundedCornerShape) objRememberedValue2;
                    Modifier modifierClip = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape);
                    float fM6117constructorimpl = Dp.m6117constructorimpl(!z ? 2 : 1);
                    if (!z) {
                        composerStartRestartGroup.startReplaceGroup(1921038918);
                        jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7639getPrimary0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1921040300);
                        jM7634getBorderNeutral0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7634getBorderNeutral0d7_KjU();
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    Modifier modifierM586borderxT4_qwU = BorderKt.m586borderxT4_qwU(modifierClip, fM6117constructorimpl, jM7634getBorderNeutral0d7_KjU, roundedCornerShape);
                    boolean z6 = accountSelectionState == AccountSelectionState.Disabled;
                    composerStartRestartGroup.startReplaceGroup(1921044868);
                    zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(account);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.AccountItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountItemKt.AccountItem$lambda$3$lambda$2(view, onAccountClicked, account);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(AlphaKt.alpha(MultipleEventsCutterKt.m7582clickableSingleXHw0xAI$default(modifierM586borderxT4_qwU, z6, null, null, (Function0) objRememberedValue3, 6, null), accountSelectionState.getAlpha()), Dp.m6117constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    if (networkedAccount3 != null || (icon = networkedAccount3.getAccountIcon()) == null) {
                        FinancialConnectionsInstitution institution = account.getInstitution();
                        icon = institution == null ? institution.getIcon() : null;
                    }
                    str = (icon == null && (str3 = icon.getDefault()) != null && z5) ? str3 : null;
                    composerStartRestartGroup.startReplaceGroup(-274923314);
                    if (str != null) {
                        str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        i5 = -692256719;
                    } else {
                        str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                        i5 = -692256719;
                        InstitutionIconKt.InstitutionIcon(str, null, false, composerStartRestartGroup, 0, 6);
                        Unit unit = Unit.INSTANCE;
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, str2);
                    currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, i5, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    networkedAccount4 = networkedAccount3;
                    TextKt.m2076Text4IGK_g(account.getName(), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLargeEmphasized(), composerStartRestartGroup, 0, 3120, 55290);
                    AccountSubtitle(accountSelectionState, account, networkedAccount4, composerStartRestartGroup, (i3 >> 6) & PointerIconCompat.TYPE_TEXT);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Selected", AlphaKt.alpha(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), !z ? 1.0f : 0.0f), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7639getPrimary0d7_KjU(), composerStartRestartGroup, 48, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z4 = z5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z4 = z3;
                    networkedAccount4 = networkedAccount2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.AccountItemKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountItemKt.AccountItem$lambda$9(z, z4, onAccountClicked, account, networkedAccount4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            networkedAccount2 = networkedAccount;
            if ((i3 & 9363) != 9362) {
                if (i6 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localView2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                view = (View) objConsume2;
                composerStartRestartGroup.startReplaceGroup(1921026932);
                zChanged = composerStartRestartGroup.changed(account) | composerStartRestartGroup.changed(networkedAccount2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = getVisibilityState(account, networkedAccount2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    AccountSelectionState accountSelectionState2 = (AccountSelectionState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1921030181);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    networkedAccount3 = networkedAccount2;
                    RoundedCornerShape roundedCornerShape2 = (RoundedCornerShape) objRememberedValue2;
                    Modifier modifierClip2 = ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), roundedCornerShape2);
                    float fM6117constructorimpl2 = Dp.m6117constructorimpl(!z ? 2 : 1);
                    if (!z) {
                    }
                    Modifier modifierM586borderxT4_qwU2 = BorderKt.m586borderxT4_qwU(modifierClip2, fM6117constructorimpl2, jM7634getBorderNeutral0d7_KjU, roundedCornerShape2);
                    if (accountSelectionState2 == AccountSelectionState.Disabled) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1921044868);
                    zChangedInstance = composerStartRestartGroup.changedInstance(view) | ((i3 & 896) != 256) | composerStartRestartGroup.changedInstance(account);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue3 = new Function0() { // from class: com.stripe.android.financialconnections.features.common.AccountItemKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AccountItemKt.AccountItem$lambda$3$lambda$2(view, onAccountClicked, account);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM1020padding3ABfNKs2 = PaddingKt.m1020padding3ABfNKs(AlphaKt.alpha(MultipleEventsCutterKt.m7582clickableSingleXHw0xAI$default(modifierM586borderxT4_qwU2, z6, null, null, (Function0) objRememberedValue3, 6, null), accountSelectionState2.getAlpha()), Dp.m6117constructorimpl(16));
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs2);
                        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting()) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, centerVertically2, composerStartRestartGroup, 54);
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                            }
                            composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (!composerM3150constructorimpl2.getInserting()) {
                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                                if (networkedAccount3 != null) {
                                    FinancialConnectionsInstitution institution2 = account.getInstitution();
                                    if (institution2 == null) {
                                    }
                                    if (icon == null) {
                                        composerStartRestartGroup.startReplaceGroup(-274923314);
                                        if (str != null) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, str2);
                                        currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier32 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWeight$default2);
                                        Function0<ComposeUiNode> constructor32 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, i5, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                                        Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap32, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (!composerM3150constructorimpl3.getInserting()) {
                                            composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier32, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            networkedAccount4 = networkedAccount3;
                                            TextKt.m2076Text4IGK_g(account.getName(), (Modifier) null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelLargeEmphasized(), composerStartRestartGroup, 0, 3120, 55290);
                                            AccountSubtitle(accountSelectionState2, account, networkedAccount4, composerStartRestartGroup, (i3 >> 6) & PointerIconCompat.TYPE_TEXT);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            composerStartRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            IconKt.m1926Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "Selected", AlphaKt.alpha(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(24)), !z ? 1.0f : 0.0f), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7639getPrimary0d7_KjU(), composerStartRestartGroup, 48, 0);
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            composerStartRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            composerStartRestartGroup.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z4 = z5;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        networkedAccount2 = networkedAccount;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountItem$lambda$3$lambda$2(View view, Function1 function1, PartnerAccount partnerAccount) {
        view.performHapticFeedback(6);
        function1.invoke(partnerAccount);
        return Unit.INSTANCE;
    }

    private static final AccountSelectionState getVisibilityState(PartnerAccount partnerAccount, NetworkedAccount networkedAccount) {
        if (networkedAccount != null ? networkedAccount.getAllowSelection() : partnerAccount.getAllowSelection$financial_connections_release()) {
            return AccountSelectionState.Enabled;
        }
        return (networkedAccount != null ? networkedAccount.getDrawerOnSelection() : null) != null ? AccountSelectionState.VisuallyDisabled : AccountSelectionState.Disabled;
    }

    private static final void AccountSubtitle(final AccountSelectionState accountSelectionState, final PartnerAccount partnerAccount, final NetworkedAccount networkedAccount, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(242390471);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(accountSelectionState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(partnerAccount) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(networkedAccount) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(242390471, i2, -1, "com.stripe.android.financialconnections.features.common.AccountSubtitle (AccountItem.kt:139)");
            }
            String subtitle = getSubtitle(accountSelectionState, partnerAccount, networkedAccount, composerStartRestartGroup, i2 & 1022);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String str = null;
            MiddleEllipsisTextKt.m8903MiddleEllipsisTextoiE5lR0(subtitle == null ? partnerAccount.getRedactedAccountNumbers$financial_connections_release() : subtitle, null, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7647getTextSubdued0d7_KjU(), 0L, null, null, null, 0L, (accountSelectionState == AccountSelectionState.Disabled || subtitle == null) ? null : TextDecoration.INSTANCE.getUnderline(), null, 0L, false, null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelMedium(), (char) 0, 0, composerStartRestartGroup, 0, 0, 57082);
            String formattedBalance = getFormattedBalance(partnerAccount, composerStartRestartGroup, (i2 >> 3) & 14);
            if (formattedBalance != null && subtitle == null) {
                str = formattedBalance;
            }
            composerStartRestartGroup.startReplaceGroup(940206977);
            if (str != null) {
                SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composerStartRestartGroup, 6);
                float f = 4;
                TextKt.m2076Text4IGK_g(str, PaddingKt.m1021paddingVpY3zN4(BackgroundKt.m574backgroundbw27NRU(Modifier.INSTANCE, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(f))), Dp.m6117constructorimpl(6), Dp.m6117constructorimpl(f)), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7647getTextSubdued0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), composerStartRestartGroup, 0, 0, 65528);
                composer2 = composerStartRestartGroup;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.AccountItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountItemKt.AccountSubtitle$lambda$13(accountSelectionState, partnerAccount, networkedAccount, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String getSubtitle(AccountSelectionState accountSelectionState, PartnerAccount partnerAccount, NetworkedAccount networkedAccount, Composer composer, int i) {
        String allowSelectionMessage;
        composer.startReplaceGroup(179217515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(179217515, i, -1, "com.stripe.android.financialconnections.features.common.getSubtitle (AccountItem.kt:185)");
        }
        String allowSelectionMessage2 = null;
        if ((networkedAccount != null ? networkedAccount.getCaption() : null) != null) {
            allowSelectionMessage2 = networkedAccount.getCaption();
        } else if (accountSelectionState != AccountSelectionState.Enabled && (allowSelectionMessage = partnerAccount.getAllowSelectionMessage()) != null && (!StringsKt.isBlank(allowSelectionMessage))) {
            allowSelectionMessage2 = partnerAccount.getAllowSelectionMessage();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return allowSelectionMessage2;
    }

    private static final String getFormattedBalance(PartnerAccount partnerAccount, Composer composer, int i) {
        String str;
        composer.startReplaceGroup(131376579);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(131376579, i, -1, "com.stripe.android.financialconnections.features.common.getFormattedBalance (AccountItem.kt:193)");
        }
        ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localConfiguration);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Locale locale = ConfigurationCompat.getLocales((Configuration) objConsume).get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localInspectionMode);
        ComposerKt.sourceInformationMarkerEnd(composer);
        boolean zBooleanValue = ((Boolean) objConsume2).booleanValue();
        if (partnerAccount.getBalanceAmount() == null || partnerAccount.getCurrency() == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return null;
        }
        if (zBooleanValue) {
            str = partnerAccount.getCurrency() + partnerAccount.getBalanceAmount();
        } else {
            CurrencyFormatter currencyFormatter = CurrencyFormatter.INSTANCE;
            long jIntValue = partnerAccount.getBalanceAmount().intValue();
            String currency = partnerAccount.getCurrency();
            Intrinsics.checkNotNull(locale);
            str = currencyFormatter.format(jIntValue, currency, locale);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return str;
    }

    public static final void AccountItemPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-412820495);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-412820495, i, -1, "com.stripe.android.financialconnections.features.common.AccountItemPreview (AccountItem.kt:221)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableSingletons$AccountItemKt.INSTANCE.m7319getLambda3$financial_connections_release(), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.AccountItemKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountItemKt.AccountItemPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
