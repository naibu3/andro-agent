package com.stripe.android.financialconnections.features.generic;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.features.common.ShapedIconKt;
import com.stripe.android.financialconnections.features.generic.GenericScreenKt;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.ui.CompositionLocalKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivityKt;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.components.TextKt;
import com.stripe.android.financialconnections.ui.sdui.BulletUI;
import com.stripe.android.financialconnections.ui.sdui.ServerDrivenUiKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.LayoutKt;
import com.stripe.android.uicore.image.StripeImageKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import defpackage.Alignment;
import defpackage.FinancialConnectionsGenericInfoScreen;
import defpackage.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GenericScreen.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001aE\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\f\u001a3\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00142\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0015\u001aO\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00172\b\b\u0002\u0010\u0010\u001a\u00020\u00112\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0001¢\u0006\u0002\u0010\u0018\u001a+\u0010\u0019\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\u001a\u0013\u0010 \u001a\u00020!*\u0004\u0018\u00010\"H\u0002¢\u0006\u0002\u0010#\u001a\u000e\u0010$\u001a\u00020%*\u0004\u0018\u00010\"H\u0002\u001a\u0013\u0010&\u001a\u00020'*\u0004\u0018\u00010(H\u0003¢\u0006\u0002\u0010)¨\u0006*"}, d2 = {"GenericScreenPreview", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;", "(Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;Landroidx/compose/runtime/Composer;I)V", "GenericScreen", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "onClickableTextClick", "Lkotlin/Function1;", "", "(Lcom/stripe/android/financialconnections/features/generic/GenericScreenState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "GenericBody", "payload", "LFinancialConnectionsGenericInfoScreen$Body;", "modifier", "Landroidx/compose/ui/Modifier;", "(LFinancialConnectionsGenericInfoScreen$Body;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GenericHeader", "LFinancialConnectionsGenericInfoScreen$Header;", "(LFinancialConnectionsGenericInfoScreen$Header;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "GenericFooter", "LFinancialConnectionsGenericInfoScreen$Footer;", "(LFinancialConnectionsGenericInfoScreen$Footer;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GenericButton", ViewProps.ON_CLICK, "type", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "action", "LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Landroidx/compose/runtime/Composer;I)V", "toComposeTextAlign", "Landroidx/compose/ui/text/style/TextAlign;", "LAlignment;", "(LAlignment;)I", "toComposeAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "toComposeSize", "Landroidx/compose/ui/text/TextStyle;", "LSize;", "(LSize;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "financial-connections_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GenericScreenKt {

    /* compiled from: GenericScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Alignment.values().length];
            try {
                iArr[Alignment.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Alignment.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Alignment.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Size.values().length];
            try {
                iArr2[Size.XSmall.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Size.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Size.Medium.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericBody$lambda$9(FinancialConnectionsGenericInfoScreen.Body body, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        GenericBody(body, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericButton$lambda$20(Function0 function0, FinancialConnectionsButton.Type type, FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction, int i, Composer composer, int i2) {
        GenericButton(function0, type, genericInfoAction, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericFooter$lambda$19(FinancialConnectionsGenericInfoScreen.Footer footer, Modifier modifier, Function0 function0, Function0 function02, Function1 function1, int i, int i2, Composer composer, int i3) {
        GenericFooter(footer, modifier, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericHeader$lambda$13(FinancialConnectionsGenericInfoScreen.Header header, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GenericHeader(header, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericScreen$lambda$2(GenericScreenState genericScreenState, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        GenericScreen(genericScreenState, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericScreenPreview$lambda$0(GenericScreenState genericScreenState, int i, Composer composer, int i2) {
        GenericScreenPreview(genericScreenState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GenericScreenPreview(@PreviewParameter(provider = GenericScreenPreviewParameterProvider.class) final GenericScreenState state, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1281428335);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1281428335, i2, -1, "com.stripe.android.financialconnections.features.generic.GenericScreenPreview (GenericScreen.kt:51)");
            }
            CompositionLocalKt.FinancialConnectionsPreview(null, false, ComposableLambdaKt.rememberComposableLambda(1444556096, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt.GenericScreenPreview.1

                /* compiled from: GenericScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.financialconnections.features.generic.GenericScreenKt$GenericScreenPreview$1$1, reason: invalid class name and collision with other inner class name */
                static final class C01491 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ GenericScreenState $state;

                    C01491(GenericScreenState genericScreenState) {
                        this.$state = genericScreenState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-932171388, i, -1, "com.stripe.android.financialconnections.features.generic.GenericScreenPreview.<anonymous>.<anonymous> (GenericScreen.kt:54)");
                            }
                            GenericScreenState genericScreenState = this.$state;
                            composer.startReplaceGroup(-116341538);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$GenericScreenPreview$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-116342914);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$GenericScreenPreview$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function02 = (Function0) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-116344354);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$GenericScreenPreview$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return GenericScreenKt.C08971.C01491.invoke$lambda$5$lambda$4((String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            GenericScreenKt.GenericScreen(genericScreenState, function0, function02, (Function1) objRememberedValue3, composer, 3504);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1444556096, i3, -1, "com.stripe.android.financialconnections.features.generic.GenericScreenPreview.<anonymous> (GenericScreen.kt:53)");
                        }
                        SurfaceKt.m2015SurfaceFjzlyU(null, null, FinancialConnectionsTheme.INSTANCE.getColors(composer2, 6).m7630getBackground0d7_KjU(), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-932171388, true, new C01491(state), composer2, 54), composer2, 1572864, 59);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericScreenKt.GenericScreenPreview$lambda$0(state, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void GenericScreen(final GenericScreenState state, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function1<? super String, Unit> onClickableTextClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(879041748);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(879041748, i2, -1, "com.stripe.android.financialconnections.features.generic.GenericScreen (GenericScreen.kt:70)");
            }
            PaddingValues paddingValuesM1015PaddingValuesYgX7TsA$default = PaddingKt.m1015PaddingValuesYgX7TsA$default(0.0f, Dp.m6117constructorimpl(16), 1, null);
            boolean inModal = state.getInModal();
            final FinancialConnectionsGenericInfoScreen.Footer footer = state.getScreen().getFooter();
            composerStartRestartGroup.startReplaceGroup(-372251889);
            ComposableLambda composableLambdaRememberComposableLambda = footer != null ? ComposableLambdaKt.rememberComposableLambda(1315710570, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$GenericScreen$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1315710570, i3, -1, "com.stripe.android.financialconnections.features.generic.GenericScreen.<anonymous>.<anonymous> (GenericScreen.kt:76)");
                        }
                        GenericScreenKt.GenericFooter(footer, null, onPrimaryButtonClick, onSecondaryButtonClick, onClickableTextClick, composer3, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54) : null;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LayoutKt.Layout(null, paddingValuesM1015PaddingValuesYgX7TsA$default, inModal, false, false, null, false, null, composableLambdaRememberComposableLambda, ComposableLambdaKt.rememberComposableLambda(1723222788, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt.GenericScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Layout, Composer composer3, int i3) {
                    Composer composer4;
                    Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
                    if ((i3 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1723222788, i3, -1, "com.stripe.android.financialconnections.features.generic.GenericScreen.<anonymous> (GenericScreen.kt:85)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(20));
                        GenericScreenState genericScreenState = state;
                        Function1<String, Unit> function1 = onClickableTextClick;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, companion);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer3);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        FinancialConnectionsGenericInfoScreen.Header header = genericScreenState.getScreen().getHeader();
                        composer3.startReplaceGroup(-1219937388);
                        if (header == null) {
                            composer4 = composer3;
                        } else {
                            composer4 = composer3;
                            GenericScreenKt.GenericHeader(header, function1, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(24), 0.0f, 2, null), composer4, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                        }
                        composer4.endReplaceGroup();
                        FinancialConnectionsGenericInfoScreen.Body body = genericScreenState.getScreen().getBody();
                        composer4.startReplaceGroup(-1219928851);
                        if (body != null) {
                            GenericScreenKt.GenericBody(body, null, function1, composer4, 0, 2);
                        }
                        composer4.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        composer4.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        ComposerKt.sourceInformationMarkerEnd(composer4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 249);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericScreenKt.GenericScreen$lambda$2(state, onPrimaryButtonClick, onSecondaryButtonClick, onClickableTextClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericBody(final FinancialConnectionsGenericInfoScreen.Body payload, Modifier modifier, final Function1<? super String, Unit> onClickableTextClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        int i4;
        Modifier modifier4;
        float f;
        String str;
        Composer composer3;
        String str2;
        char c;
        String str3;
        String str4;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-328976321);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-328976321, i3, -1, "com.stripe.android.financialconnections.features.generic.GenericBody (GenericScreen.kt:111)");
                }
                float f2 = 24;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f2));
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                int i7 = -1323940314;
                String str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                String str6 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                ?? r13 = 0;
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                String str7 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                String str8 = "C88@4444L9:Column.kt#2w3rfo";
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1673638667);
                for (FinancialConnectionsGenericInfoScreen.Body.Entry entry : payload.getEntries()) {
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r13);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, i7, str5);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r13);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, str7);
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
                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Image) {
                        composerStartRestartGroup.startReplaceGroup(-1918082994);
                        FinancialConnectionsGenericInfoScreen.Body.Entry.Image image = (FinancialConnectionsGenericInfoScreen.Body.Entry.Image) entry;
                        String str9 = image.getImage().getDefault();
                        if (str9 == null) {
                            str9 = "";
                        }
                        String alt = image.getAlt();
                        ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localImageLoader);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        modifier4 = companion;
                        f = f2;
                        String str10 = str5;
                        i4 = i3;
                        StripeImageKt.StripeImage(str9, (StripeImageLoader) objConsume, alt, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, null, null, composerStartRestartGroup, (StripeImageLoader.$stable << 3) | 3072, 0, 2032);
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        str = str6;
                        composer3 = composerStartRestartGroup;
                        str2 = str8;
                        str3 = str7;
                        str4 = str10;
                        i5 = -1323940314;
                        c = 43367;
                    } else {
                        i4 = i3;
                        String str11 = str8;
                        modifier4 = companion;
                        f = f2;
                        String str12 = str7;
                        String str13 = str5;
                        String str14 = str6;
                        if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Text) {
                            composerStartRestartGroup.startReplaceGroup(-1917691991);
                            FinancialConnectionsGenericInfoScreen.Body.Entry.Text text = (FinancialConnectionsGenericInfoScreen.Body.Entry.Text) entry;
                            str = str14;
                            composer3 = composerStartRestartGroup;
                            str2 = str11;
                            c = 43367;
                            TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(text.getText())), onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(toComposeSize(text.getSize(), composerStartRestartGroup, 0), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, toComposeTextAlign(text.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744446, null), PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), 0.0f, 2, null), null, 0, 0, composer3, ((i4 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                            composer3.endReplaceGroup();
                            Unit unit2 = Unit.INSTANCE;
                            str3 = str12;
                            str4 = str13;
                            i5 = -1323940314;
                        } else {
                            str = str14;
                            composer3 = composerStartRestartGroup;
                            str2 = str11;
                            c = 43367;
                            if (entry instanceof FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets) {
                                composer3.startReplaceGroup(-1917044029);
                                FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets bullets = (FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets) entry;
                                List<FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint> bullets2 = bullets.getBullets();
                                composer3.startReplaceGroup(1046539214);
                                boolean zChanged = composer3.changed(bullets2);
                                ArrayList arrayListRememberedValue = composer3.rememberedValue();
                                if (zChanged || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    List<FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint> bullets3 = bullets.getBullets();
                                    BulletUI.Companion companion3 = BulletUI.INSTANCE;
                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bullets3, 10));
                                    Iterator<T> it = bullets3.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(companion3.from((FinancialConnectionsGenericInfoScreen.Body.Entry.Bullets.GenericBulletPoint) it.next()));
                                    }
                                    arrayListRememberedValue = arrayList;
                                    composer3.updateRememberedValue(arrayListRememberedValue);
                                }
                                List list = (List) arrayListRememberedValue;
                                composer3.endReplaceGroup();
                                Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), 0.0f, 2, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, -483455358, str);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer3, 0);
                                str4 = str13;
                                i5 = -1323940314;
                                ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, str4);
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer3, modifierM1022paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                str3 = str12;
                                ComposerKt.sourceInformationMarkerStart(composer3, -692256719, str3);
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor3);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer3);
                                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer3, -384784025, str2);
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(-158634202);
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    ListItemKt.ListItem((BulletUI) it2.next(), onClickableTextClick, composer3, (i4 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                                    SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer3, 6);
                                }
                                composer3.endReplaceGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceGroup();
                                Unit unit3 = Unit.INSTANCE;
                            } else {
                                str3 = str12;
                                str4 = str13;
                                i5 = -1323940314;
                                composer3.startReplaceGroup(-1916333633);
                                composer3.endReplaceGroup();
                                Integer.valueOf(Log.e("GenericBody", "Unsupported entry type: " + entry));
                            }
                        }
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    i3 = i4;
                    composerStartRestartGroup = composer3;
                    str8 = str2;
                    str6 = str;
                    f2 = f;
                    r13 = 0;
                    str5 = str4;
                    i7 = i5;
                    str7 = str3;
                    companion = modifier4;
                }
                Modifier modifier5 = companion;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericScreenKt.GenericBody$lambda$9(payload, modifier3, onClickableTextClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            float f22 = 24;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(f22));
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            int i72 = -1323940314;
            String str52 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            String str62 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
            ?? r132 = 0;
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            String str72 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                String str82 = "C88@4444L9:Column.kt#2w3rfo";
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1673638667);
                while (r23.hasNext()) {
                }
                Modifier modifier52 = companion;
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericHeader(final FinancialConnectionsGenericInfoScreen.Header payload, final Function1<? super String, Unit> onClickableTextClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean zChanged;
        Object objRememberedValue;
        String str;
        boolean zBooleanValue;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companionM574backgroundbw27NRU;
        String str2;
        Composer composer2;
        int i5;
        float f;
        int i6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-363842843);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-363842843, i4, -1, "com.stripe.android.financialconnections.features.generic.GenericHeader (GenericScreen.kt:171)");
                }
                Image icon = payload.getIcon();
                String str3 = icon == null ? icon.getDefault() : null;
                composerStartRestartGroup.startReplaceGroup(-1075794961);
                zChanged = composerStartRestartGroup.changed(str3);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Image icon2 = payload.getIcon();
                    objRememberedValue = Boolean.valueOf(icon2 == null && (str = icon2.getDefault()) != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "BrandIcon", false, 2, (Object) null));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(20));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = !zBooleanValue ? RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(12)) : RoundedCornerShapeKt.getCircleShape();
                composerStartRestartGroup.startReplaceGroup(-826908642);
                if (!zBooleanValue) {
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM1303RoundedCornerShape0680j_4;
                    companionM574backgroundbw27NRU = BackgroundKt.m574backgroundbw27NRU(ClipKt.clip(ShadowKt.m3321shadows4CzXII$default(Modifier.INSTANCE, Dp.m6117constructorimpl(8), roundedCornerShape, false, 0L, 0L, 28, null), roundedCornerShape), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7632getBackgroundSecondary0d7_KjU(), roundedCornerShape);
                } else {
                    companionM574backgroundbw27NRU = Modifier.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                Image icon3 = payload.getIcon();
                str2 = icon3 == null ? icon3.getDefault() : null;
                composerStartRestartGroup.startReplaceGroup(-826899606);
                if (str2 != null) {
                    composer2 = composerStartRestartGroup;
                    i5 = 6;
                } else {
                    composer2 = composerStartRestartGroup;
                    i5 = 6;
                    ShapedIconKt.ShapedIcon(str2, columnScopeInstance.align(companionM574backgroundbw27NRU, toComposeAlignment(payload.getAlignment())), payload.getAlignment() == Alignment.Center ? IconSize.Large : IconSize.Medium, roundedCornerShapeM1303RoundedCornerShape0680j_4, null, null, zBooleanValue, composer2, 24576, 32);
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-826885940);
                if (payload.getTitle() == null) {
                    i6 = 1;
                    Composer composer3 = composer2;
                    f = 0.0f;
                    TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(payload.getTitle()), onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, i5).getHeadingXLarge(), FinancialConnectionsTheme.INSTANCE.getColors(composer2, i5).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, toComposeTextAlign(payload.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744446, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0, 0, composer3, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                    composer2 = composer3;
                } else {
                    f = 0.0f;
                    i6 = 1;
                }
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(-826871207);
                if (payload.getSubtitle() != null) {
                    Composer composer4 = composer2;
                    TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(payload.getSubtitle())), onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, i5).getBodyMedium(), FinancialConnectionsTheme.INSTANCE.getColors(composer2, i5).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, toComposeTextAlign(payload.getAlignment()), 0, 0L, null, null, null, 0, 0, null, 16744446, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i6, null), null, 0, 0, composer4, (i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                    composer2 = composer4;
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
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericScreenKt.GenericHeader$lambda$13(payload, onClickableTextClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Image icon4 = payload.getIcon();
            if (icon4 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-1075794961);
            zChanged = composerStartRestartGroup.changed(str3);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                Image icon22 = payload.getIcon();
                if (icon22 == null) {
                    objRememberedValue = Boolean.valueOf(icon22 == null && (str = icon22.getDefault()) != null && StringsKt.contains$default((CharSequence) str, (CharSequence) "BrandIcon", false, 2, (Object) null));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    zBooleanValue = ((Boolean) objRememberedValue).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(20));
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting()) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        if (!zBooleanValue) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-826908642);
                        if (!zBooleanValue) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Image icon32 = payload.getIcon();
                        if (icon32 == null) {
                        }
                        composerStartRestartGroup.startReplaceGroup(-826899606);
                        if (str2 != null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-826885940);
                        if (payload.getTitle() == null) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-826871207);
                        if (payload.getSubtitle() != null) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericFooter(final FinancialConnectionsGenericInfoScreen.Footer payload, Modifier modifier, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onSecondaryButtonClick, final Function1<? super String, Unit> onClickableTextClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String disclaimer;
        Modifier modifier3;
        Object obj;
        float f;
        int i5;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction primaryCta;
        FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction secondaryCta;
        String belowCta;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onSecondaryButtonClick, "onSecondaryButtonClick");
        Intrinsics.checkNotNullParameter(onClickableTextClick, "onClickableTextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(713895287);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(payload) : composerStartRestartGroup.changedInstance(payload) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onSecondaryButtonClick) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClickableTextClick) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(713895287, i4, -1, "com.stripe.android.financialconnections.features.generic.GenericFooter (GenericScreen.kt:235)");
                }
                Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                disclaimer = payload.getDisclaimer();
                composerStartRestartGroup.startReplaceGroup(-759973057);
                if (disclaimer != null) {
                    modifier3 = companion;
                    obj = null;
                    f = 0.0f;
                    i5 = 1;
                } else {
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    TextResource.Text text = new TextResource.Text(ServerDrivenUiKt.fromHtml(disclaimer));
                    modifier3 = companion;
                    obj = null;
                    f = 0.0f;
                    i5 = 1;
                    TextKt.m7586AnnotatedTextrm0N8CA(text, onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), modifierFillMaxWidth$default, null, 0, 0, composerStartRestartGroup, ((i4 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                }
                composerStartRestartGroup.endReplaceGroup();
                primaryCta = payload.getPrimaryCta();
                composerStartRestartGroup.startReplaceGroup(-759958773);
                if (primaryCta != null) {
                    GenericButton(onPrimaryButtonClick, FinancialConnectionsButton.Type.Primary.INSTANCE, primaryCta, composerStartRestartGroup, ((i4 >> 6) & 14) | 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                secondaryCta = payload.getSecondaryCta();
                composerStartRestartGroup.startReplaceGroup(-759950981);
                if (secondaryCta != null) {
                    GenericButton(onSecondaryButtonClick, FinancialConnectionsButton.Type.Secondary.INSTANCE, secondaryCta, composerStartRestartGroup, ((i4 >> 9) & 14) | 48);
                }
                composerStartRestartGroup.endReplaceGroup();
                belowCta = payload.getBelowCta();
                composerStartRestartGroup.startReplaceGroup(-759942629);
                if (belowCta != null) {
                    TextKt.m7586AnnotatedTextrm0N8CA(new TextResource.Text(ServerDrivenUiKt.fromHtml(belowCta)), onClickableTextClick, TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getLabelSmall(), FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7645getTextDefault0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m6006getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744446, null), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i5, obj), null, 0, 0, composerStartRestartGroup, ((i4 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 3072, OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return GenericScreenKt.GenericFooter$lambda$19(payload, modifier4, onPrimaryButtonClick, onSecondaryButtonClick, onClickableTextClick, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_42 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_42, androidx.compose.ui.Alignment.INSTANCE.getStart(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                disclaimer = payload.getDisclaimer();
                composerStartRestartGroup.startReplaceGroup(-759973057);
                if (disclaimer != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                primaryCta = payload.getPrimaryCta();
                composerStartRestartGroup.startReplaceGroup(-759958773);
                if (primaryCta != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                secondaryCta = payload.getSecondaryCta();
                composerStartRestartGroup.startReplaceGroup(-759950981);
                if (secondaryCta != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                belowCta = payload.getBelowCta();
                composerStartRestartGroup.startReplaceGroup(-759942629);
                if (belowCta != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void GenericButton(Function0<Unit> function0, FinancialConnectionsButton.Type type, final FinancialConnectionsGenericInfoScreen.Footer.GenericInfoAction genericInfoAction, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function02;
        final FinancialConnectionsButton.Type type2;
        Composer composerStartRestartGroup = composer.startRestartGroup(947913752);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(type) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(genericInfoAction) : composerStartRestartGroup.changedInstance(genericInfoAction) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947913752, i2, -1, "com.stripe.android.financialconnections.features.generic.GenericButton (GenericScreen.kt:287)");
            }
            function02 = function0;
            type2 = type;
            ButtonKt.FinancialConnectionsButton(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), type2, null, false, false, ComposableLambdaKt.rememberComposableLambda(1060370143, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt.GenericButton.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                    invoke(rowScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope FinancialConnectionsButton, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(FinancialConnectionsButton, "$this$FinancialConnectionsButton");
                    if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1060370143, i3, -1, "com.stripe.android.financialconnections.features.generic.GenericButton.<anonymous> (GenericScreen.kt:294)");
                        }
                        androidx.compose.material.TextKt.m2076Text4IGK_g(genericInfoAction.getLabel(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        Image icon = genericInfoAction.getIcon();
                        String str = icon != null ? icon.getDefault() : null;
                        if (str != null) {
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composer2, 6);
                            ProvidableCompositionLocal<StripeImageLoader> localImageLoader = FinancialConnectionsSheetNativeActivityKt.getLocalImageLoader();
                            ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composer2.consume(localImageLoader);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            StripeImageKt.StripeImage(str, (StripeImageLoader) objConsume, null, SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16)), null, null, null, null, false, null, null, composer2, (StripeImageLoader.$stable << 3) | 3456, 0, 2032);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 1769520 | ((i2 << 3) & 896), 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function02 = function0;
            type2 = type;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.features.generic.GenericScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GenericScreenKt.GenericButton$lambda$20(function02, type2, genericInfoAction, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final int toComposeTextAlign(Alignment alignment) {
        int i = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == -1) {
            return TextAlign.INSTANCE.m6011getStarte0LSkKk();
        }
        if (i == 1) {
            return TextAlign.INSTANCE.m6011getStarte0LSkKk();
        }
        if (i == 2) {
            return TextAlign.INSTANCE.m6006getCentere0LSkKk();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return TextAlign.INSTANCE.m6007getEnde0LSkKk();
    }

    private static final Alignment.Horizontal toComposeAlignment(defpackage.Alignment alignment) {
        int i = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i == -1) {
            return androidx.compose.ui.Alignment.INSTANCE.getStart();
        }
        if (i == 1) {
            return androidx.compose.ui.Alignment.INSTANCE.getStart();
        }
        if (i == 2) {
            return androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return androidx.compose.ui.Alignment.INSTANCE.getEnd();
    }

    private static final TextStyle toComposeSize(Size size, Composer composer, int i) {
        TextStyle bodyMedium;
        composer.startReplaceGroup(-1614047151);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1614047151, i, -1, "com.stripe.android.financialconnections.features.generic.toComposeSize (GenericScreen.kt:323)");
        }
        int i2 = size == null ? -1 : WhenMappings.$EnumSwitchMapping$1[size.ordinal()];
        if (i2 == -1) {
            composer.startReplaceGroup(-1358210167);
            bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getBodyMedium();
            composer.endReplaceGroup();
        } else if (i2 == 1) {
            composer.startReplaceGroup(-1358213815);
            bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getLabelSmall();
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(-1358212536);
            bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getBodySmall();
            composer.endReplaceGroup();
        } else {
            if (i2 != 3) {
                composer.startReplaceGroup(-1358215063);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-1358211255);
            bodyMedium = FinancialConnectionsTheme.INSTANCE.getTypography(composer, 6).getBodyMedium();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bodyMedium;
    }
}
