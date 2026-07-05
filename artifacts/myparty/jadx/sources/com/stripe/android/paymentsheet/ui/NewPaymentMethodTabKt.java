package com.stripe.android.paymentsheet.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewPaymentMethodTab.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"NewPaymentMethodTab", "", "minViewWidth", "Landroidx/compose/ui/unit/Dp;", "iconRes", "", "iconUrl", "", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "title", "isSelected", "", "isEnabled", "iconRequiresTinting", "promoBadge", "modifier", "Landroidx/compose/ui/Modifier;", "onItemSelectedListener", "Lkotlin/Function0;", "NewPaymentMethodTab-jFuDa88", "(FILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;ZZZLjava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewPaymentMethodTabKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewPaymentMethodTab_jFuDa88$lambda$0(float f, int i, String str, StripeImageLoader stripeImageLoader, String str2, boolean z, boolean z2, boolean z3, String str3, Modifier modifier, Function0 function0, int i2, int i3, int i4, Composer composer, int i5) {
        m8469NewPaymentMethodTabjFuDa88(f, i, str, stripeImageLoader, str2, z, z2, z3, str3, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* renamed from: NewPaymentMethodTab-jFuDa88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8469NewPaymentMethodTabjFuDa88(final float f, final int i, final String str, final StripeImageLoader imageLoader, final String title, final boolean z, final boolean z2, final boolean z3, final String str2, Modifier modifier, final Function0<Unit> onItemSelectedListener, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        String str3;
        boolean z4;
        boolean z5;
        String str4;
        int i7;
        Modifier modifier2;
        int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(-654699572);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i6 = i;
                i5 |= composerStartRestartGroup.changed(i6) ? 32 : 16;
            }
            if ((i4 & 4) == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    str3 = str;
                    i5 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i5 |= (i2 & 4096) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
                }
                if ((i4 & 16) != 0) {
                    i5 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i5 |= composerStartRestartGroup.changed(title) ? 16384 : 8192;
                }
                if ((i4 & 32) != 0) {
                    i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((i2 & 1572864) == 0) {
                            z4 = z2;
                            i5 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                z5 = z3;
                                i5 |= composerStartRestartGroup.changed(z5) ? 8388608 : 4194304;
                            }
                            if ((i4 & 256) != 0) {
                                if ((i2 & 100663296) == 0) {
                                    str4 = str2;
                                    i5 |= composerStartRestartGroup.changed(str4) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i7 = i4 & 512;
                                if (i7 != 0) {
                                    i5 |= 805306368;
                                    modifier2 = modifier;
                                } else {
                                    modifier2 = modifier;
                                    if ((i2 & 805306368) == 0) {
                                        i5 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                                    }
                                }
                                if ((i4 & 1024) != 0) {
                                    i8 = i3 | 6;
                                } else if ((i3 & 6) == 0) {
                                    i8 = i3 | (composerStartRestartGroup.changedInstance(onItemSelectedListener) ? 4 : 2);
                                } else {
                                    i8 = i3;
                                }
                                if ((i5 & 306783379) != 306783378 || (i8 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-654699572, i5, i8, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab (NewPaymentMethodTab.kt:36)");
                                    }
                                    Modifier modifier3 = companion;
                                    final String str5 = str3;
                                    final String str6 = str4;
                                    final boolean z6 = z4;
                                    int i9 = i5;
                                    final int i10 = i6;
                                    final boolean z7 = z5;
                                    RowButtonKt.RowButton(z2, z, false, onItemSelectedListener, PaddingKt.m1017PaddingValuesa9UjIt4$default(PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), 0.0f, 8, null), Arrangement.INSTANCE.getTop(), SizeKt.m1072widthInVpY3zN4$default(SizeKt.m1053heightInVpY3zN4$default(companion, Dp.m6117constructorimpl(60), 0.0f, 2, null), f, 0.0f, 2, null), ComposableLambdaKt.rememberComposableLambda(-1428691454, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabKt$NewPaymentMethodTab$1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                            invoke(columnScope, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(ColumnScope RowButton, Composer composer2, int i11) {
                                            Intrinsics.checkNotNullParameter(RowButton, "$this$RowButton");
                                            if ((i11 & 17) != 16 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1428691454, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:51)");
                                                }
                                                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                                int i12 = i10;
                                                String str7 = str5;
                                                StripeImageLoader stripeImageLoader = imageLoader;
                                                boolean z8 = z7;
                                                String str8 = str6;
                                                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                                PaymentMethodIconKt.PaymentMethodIcon(i12, str7, stripeImageLoader, z8, SizeKt.m1072widthInVpY3zN4$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, PaymentMethodUISpacing.INSTANCE.m8479getIconSizeD9Ej5fM()), 0.0f, Dp.m6117constructorimpl(36), 1, null), Alignment.INSTANCE.getCenterStart(), composer2, (StripeImageLoader.$stable << 6) | 221184, 0);
                                                composer2.startReplaceGroup(883394782);
                                                if (str8 != null) {
                                                    PromoBadgeKt.PromoBadge(str8, null, false, true, composer2, 3072, 6);
                                                }
                                                composer2.endReplaceGroup();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                composer2.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                                LpmSelectorTextKt.m8468LpmSelectorTextFU0evQE(null, title, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8728getOnComponent0d7_KjU(), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(6), 1, null), z6, false, composer2, 3072, 33);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i9 >> 18) & 14) | 12779520 | ((i9 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i8 << 9) & 7168), 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                }
                                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    final Modifier modifier4 = modifier2;
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return NewPaymentMethodTabKt.NewPaymentMethodTab_jFuDa88$lambda$0(f, i, str, imageLoader, title, z, z2, z3, str2, modifier4, onItemSelectedListener, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i5 |= 100663296;
                            str4 = str2;
                            i7 = i4 & 512;
                            if (i7 != 0) {
                            }
                            if ((i4 & 1024) != 0) {
                            }
                            if ((i5 & 306783379) != 306783378) {
                                if (i7 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                Modifier modifier32 = companion;
                                final String str52 = str3;
                                final String str62 = str4;
                                final boolean z62 = z4;
                                int i92 = i5;
                                final int i102 = i6;
                                final boolean z72 = z5;
                                RowButtonKt.RowButton(z2, z, false, onItemSelectedListener, PaddingKt.m1017PaddingValuesa9UjIt4$default(PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), PaymentMethodUISpacing.INSTANCE.m8478getCardPaddingD9Ej5fM(), 0.0f, 8, null), Arrangement.INSTANCE.getTop(), SizeKt.m1072widthInVpY3zN4$default(SizeKt.m1053heightInVpY3zN4$default(companion, Dp.m6117constructorimpl(60), 0.0f, 2, null), f, 0.0f, 2, null), ComposableLambdaKt.rememberComposableLambda(-1428691454, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.NewPaymentMethodTabKt$NewPaymentMethodTab$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                                        invoke(columnScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(ColumnScope RowButton, Composer composer2, int i11) {
                                        Intrinsics.checkNotNullParameter(RowButton, "$this$RowButton");
                                        if ((i11 & 17) != 16 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1428691454, i11, -1, "com.stripe.android.paymentsheet.ui.NewPaymentMethodTab.<anonymous> (NewPaymentMethodTab.kt:51)");
                                            }
                                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                            int i12 = i102;
                                            String str7 = str52;
                                            StripeImageLoader stripeImageLoader = imageLoader;
                                            boolean z8 = z72;
                                            String str8 = str62;
                                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                            Modifier.Companion companion2 = Modifier.INSTANCE;
                                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                            PaymentMethodIconKt.PaymentMethodIcon(i12, str7, stripeImageLoader, z8, SizeKt.m1072widthInVpY3zN4$default(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, PaymentMethodUISpacing.INSTANCE.m8479getIconSizeD9Ej5fM()), 0.0f, Dp.m6117constructorimpl(36), 1, null), Alignment.INSTANCE.getCenterStart(), composer2, (StripeImageLoader.$stable << 6) | 221184, 0);
                                            composer2.startReplaceGroup(883394782);
                                            if (str8 != null) {
                                                PromoBadgeKt.PromoBadge(str8, null, false, true, composer2, 3072, 6);
                                            }
                                            composer2.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            LpmSelectorTextKt.m8468LpmSelectorTextFU0evQE(null, title, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8728getOnComponent0d7_KjU(), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(6), 1, null), z62, false, composer2, 3072, 33);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i92 >> 18) & 14) | 12779520 | ((i92 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i8 << 9) & 7168), 4);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier2 = modifier32;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        z5 = z3;
                        if ((i4 & 256) != 0) {
                        }
                        str4 = str2;
                        i7 = i4 & 512;
                        if (i7 != 0) {
                        }
                        if ((i4 & 1024) != 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    z4 = z2;
                    if ((i4 & 128) != 0) {
                    }
                    z5 = z3;
                    if ((i4 & 256) != 0) {
                    }
                    str4 = str2;
                    i7 = i4 & 512;
                    if (i7 != 0) {
                    }
                    if ((i4 & 1024) != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i4 & 64) == 0) {
                }
                z4 = z2;
                if ((i4 & 128) != 0) {
                }
                z5 = z3;
                if ((i4 & 256) != 0) {
                }
                str4 = str2;
                i7 = i4 & 512;
                if (i7 != 0) {
                }
                if ((i4 & 1024) != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str3 = str;
            if ((i4 & 8) != 0) {
            }
            if ((i4 & 16) != 0) {
            }
            if ((i4 & 32) != 0) {
            }
            if ((i4 & 64) == 0) {
            }
            z4 = z2;
            if ((i4 & 128) != 0) {
            }
            z5 = z3;
            if ((i4 & 256) != 0) {
            }
            str4 = str2;
            i7 = i4 & 512;
            if (i7 != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i6 = i;
        if ((i4 & 4) == 0) {
        }
        str3 = str;
        if ((i4 & 8) != 0) {
        }
        if ((i4 & 16) != 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) == 0) {
        }
        z4 = z2;
        if ((i4 & 128) != 0) {
        }
        z5 = z3;
        if ((i4 & 256) != 0) {
        }
        str4 = str2;
        i7 = i4 & 512;
        if (i7 != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
