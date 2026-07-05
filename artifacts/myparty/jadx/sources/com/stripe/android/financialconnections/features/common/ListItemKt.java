package com.stripe.android.financialconnections.features.common;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.financialconnections.R;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.ImageResource;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ListItem.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"ListItem", "", "bullet", "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "onClickableTextClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ListItemIcon", PaymentSheetAppearanceKeys.ICON, "Lcom/stripe/android/financialconnections/ui/ImageResource;", "(Lcom/stripe/android/financialconnections/ui/ImageResource;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ListItemKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItem$lambda$5(BulletUI bulletUI, Function1 function1, int i, Composer composer, int i2) {
        ListItem(bulletUI, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItemIcon$lambda$8(ImageResource imageResource, int i, Composer composer, int i2) {
        ListItemIcon(imageResource, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ListItem(final BulletUI bullet, Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        TextStyle bodyMedium;
        final Function1<? super String, Unit> onClickableTextClick = function1;
        Intrinsics.checkNotNullParameter(bullet, "bullet");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-635115962);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bullet) : composerStartRestartGroup.changedInstance(bullet) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-635115962, i2, -1, "com.stripe.android.financialconnections.features.common.ListItem (ListItem.kt:33)");
            }
            TextResource.Text title = bullet.getTitle();
            if (title == null && (title = bullet.getContent()) == null) {
                title = new TextResource.Text("");
            }
            composerStartRestartGroup.startReplaceGroup(978392729);
            boolean zChanged = composerStartRestartGroup.changed(title);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                TextResource content = bullet.getContent();
                objRememberedValue = null;
                if (content != null) {
                    if (bullet.getTitle() != null) {
                        objRememberedValue = content;
                    }
                }
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextResource textResource = (TextResource) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            if (textResource != null) {
                composerStartRestartGroup.startReplaceGroup(978396774);
                bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMediumEmphasized();
            } else {
                composerStartRestartGroup.startReplaceGroup(978397948);
                bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyMedium();
            }
            composerStartRestartGroup.endReplaceGroup();
            TextStyle textStyle = bodyMedium;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
            ListItemIcon(bullet.getImageResource(), composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextStyle textStyleM5615copyp1EtxEg$default = TextStyle.m5615copyp1EtxEg$default(textStyle, FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            int i3 = i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
            TextKt.m7586AnnotatedTextrm0N8CA(title, onClickableTextClick, textStyleM5615copyp1EtxEg$default, null, null, 0, 0, composerStartRestartGroup, i3, 120);
            composerStartRestartGroup.startReplaceGroup(1797801283);
            if (textResource == null) {
                onClickableTextClick = function1;
            } else {
                TextResource content2 = bullet.getContent();
                if (content2 != null) {
                    onClickableTextClick = function1;
                    TextKt.m7586AnnotatedTextrm0N8CA(content2, onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodySmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7647getTextSubdued0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), null, null, 0, 0, composerStartRestartGroup, i3, 120);
                    Unit unit = Unit.INSTANCE;
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            composerStartRestartGroup.endReplaceGroup();
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
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.ListItem$lambda$5(bullet, onClickableTextClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ListItemIcon(final ImageResource imageResource, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-57878957);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(imageResource) : composerStartRestartGroup.changedInstance(imageResource) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-57878957, i2, -1, "com.stripe.android.financialconnections.features.common.ListItemIcon (ListItem.kt:58)");
            }
            final long jM7635getIcon0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7635getIcon0d7_KjU();
            float fM6117constructorimpl = Dp.m6117constructorimpl(20);
            final Modifier modifierM981offsetVpY3zN4$default = OffsetKt.m981offsetVpY3zN4$default(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, fM6117constructorimpl), 0.0f, Dp.m6117constructorimpl(1), 1, null);
            if (imageResource == null) {
                composerStartRestartGroup.startReplaceGroup(440123861);
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(modifierM981offsetVpY3zN4$default, Dp.m6117constructorimpl(Dp.m6117constructorimpl(fM6117constructorimpl - Dp.m6117constructorimpl(8)) / 2));
                composerStartRestartGroup.startReplaceGroup(440126734);
                boolean zChanged = composerStartRestartGroup.changed(jM7635getIcon0d7_KjU);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ListItemKt.ListItemIcon$lambda$7$lambda$6(jM7635getIcon0d7_KjU, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                CanvasKt.Canvas(modifierM1020padding3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else if (imageResource instanceof ImageResource.Local) {
                composerStartRestartGroup.startReplaceGroup(759162183);
                ImageKt.Image(PainterResources_androidKt.painterResource(((ImageResource.Local) imageResource).getResId(), composerStartRestartGroup, 0), (String) null, modifierM981offsetVpY3zN4$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(imageResource instanceof ImageResource.Network)) {
                    composerStartRestartGroup.startReplaceGroup(440122610);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(759462945);
                String url = ((ImageResource.Network) imageResource).getUrl();
                Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.stripe_ic_check_circle, composerStartRestartGroup, 0);
                ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localImageLoader);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                StripeImageKt.StripeImage(url, (StripeImageLoader) objConsume, null, modifierM981offsetVpY3zN4$default, null, ColorFilter.Companion.m3698tintxETnrds$default(ColorFilter.INSTANCE, jM7635getIcon0d7_KjU, 0, 2, null), painterPainterResource, null, false, ComposableLambdaKt.rememberComposableLambda(-1932758438, true, new AnonymousClass2(modifierM981offsetVpY3zN4$default, fM6117constructorimpl, jM7635getIcon0d7_KjU), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1243576006, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt.ListItemIcon.3
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer2, Integer num) {
                        invoke(boxWithConstraintsScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
                        if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1243576006, i3, -1, "com.stripe.android.financialconnections.features.common.ListItemIcon.<anonymous> (ListItem.kt:89)");
                            }
                            final Modifier modifier = modifierM981offsetVpY3zN4$default;
                            LoadingContentKt.LoadingShimmerEffect(ComposableLambdaKt.rememberComposableLambda(-1295716665, true, new Function3<Brush, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt.ListItemIcon.3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Brush brush, Composer composer3, Integer num) {
                                    invoke(brush, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Brush shimmer, Composer composer3, int i4) {
                                    Intrinsics.checkNotNullParameter(shimmer, "shimmer");
                                    if ((i4 & 6) == 0) {
                                        i4 |= composer3.changed(shimmer) ? 4 : 2;
                                    }
                                    if ((i4 & 19) != 18 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1295716665, i4, -1, "com.stripe.android.financialconnections.features.common.ListItemIcon.<anonymous>.<anonymous> (ListItem.kt:90)");
                                        }
                                        SpacerKt.Spacer(BackgroundKt.background$default(ClipKt.clip(modifier, RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(4))), shimmer, null, 0.0f, 6, null), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (StripeImageLoader.$stable << 3) | 805309824, 6, 400);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ListItemKt.ListItemIcon$lambda$8(imageResource, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ListItemIcon$lambda$7$lambda$6(long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
        return Unit.INSTANCE;
    }

    /* compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.features.common.ListItemKt$ListItemIcon$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        final /* synthetic */ long $bulletColor;
        final /* synthetic */ float $iconSize;
        final /* synthetic */ Modifier $modifier;

        AnonymousClass2(Modifier modifier, float f, long j) {
            this.$modifier = modifier;
            this.$iconSize = f;
            this.$bulletColor = j;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxWithConstraintsScope StripeImage, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(StripeImage, "$this$StripeImage");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1932758438, i, -1, "com.stripe.android.financialconnections.features.common.ListItemIcon.<anonymous> (ListItem.kt:83)");
                }
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(this.$modifier, Dp.m6117constructorimpl(Dp.m6117constructorimpl(this.$iconSize - Dp.m6117constructorimpl(8)) / 2));
                composer.startReplaceGroup(-968090323);
                boolean zChanged = composer.changed(this.$bulletColor);
                final long j = this.$bulletColor;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.common.ListItemKt$ListItemIcon$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ListItemKt.AnonymousClass2.invoke$lambda$1$lambda$0(j, (DrawScope) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CanvasKt.Canvas(modifierM1020padding3ABfNKs, (Function1) objRememberedValue, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(long j, DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            DrawScope.m4194drawCircleVaOC9Bg$default(Canvas, j, 0.0f, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT, null);
            return Unit.INSTANCE;
        }
    }
}
