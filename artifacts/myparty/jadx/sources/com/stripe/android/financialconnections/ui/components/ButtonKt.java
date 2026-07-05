package com.stripe.android.financialconnections.ui.components;

import android.os.Build;
import android.view.View;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonElevation;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.material.RippleDefaults;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.financialconnections.features.common.LoadingContentKt;
import com.stripe.android.financialconnections.ui.components.ButtonKt;
import com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton;
import com.stripe.android.financialconnections.ui.theme.ColorKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTheme;
import com.stripe.android.financialconnections.ui.theme.Theme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Button.kt */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\u001ak\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0002\b\u0013¢\u0006\u0002\b\u0014H\u0001¢\u0006\u0002\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0017*\u00020\nH\u0003¢\u0006\u0002\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00042\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0001¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u001d²\u0006\n\u0010\u001e\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, d2 = {"DefaultSpinnerHeight", "Landroidx/compose/ui/unit/Dp;", "F", "FinancialConnectionsButton", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "type", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;", "size", "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;", ViewProps.ENABLED, "", "loading", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "rippleConfiguration", "Landroidx/compose/material/RippleConfiguration;", "(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RippleConfiguration;", "FinancialConnectionsButtonPreview", "theme", "Lcom/stripe/android/financialconnections/ui/theme/Theme;", "(Lcom/stripe/android/financialconnections/ui/theme/Theme;Landroidx/compose/runtime/Composer;I)V", "financial-connections_release", "spinnerHeight", "loadingIndicatorAlpha", ""}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ButtonKt {
    private static final float DefaultSpinnerHeight = Dp.m6117constructorimpl(24);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsButton$lambda$6(Function0 function0, Modifier modifier, FinancialConnectionsButton.Type type, FinancialConnectionsButton.Size size, boolean z, boolean z2, Function3 function3, int i, int i2, Composer composer, int i3) {
        FinancialConnectionsButton(function0, modifier, type, size, z, z2, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinancialConnectionsButtonPreview$lambda$7(Theme theme, int i, Composer composer, int i2) {
        FinancialConnectionsButtonPreview(theme, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinancialConnectionsButton(final Function0<Unit> onClick, Modifier modifier, FinancialConnectionsButton.Type type, FinancialConnectionsButton.Size size, boolean z, boolean z2, final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        FinancialConnectionsButton.Type type2;
        int i5;
        FinancialConnectionsButton.Size size2;
        int i6;
        boolean z3;
        int i7;
        Object objRememberedValue;
        Object objRememberedValue2;
        Modifier modifier3;
        Composer composer2;
        Object objRememberedValue3;
        final FinancialConnectionsButton.Type type3;
        final boolean z4;
        final boolean z5;
        final FinancialConnectionsButton.Size size3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1838012725);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    type2 = type;
                    i3 |= composerStartRestartGroup.changed(type2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        size2 = size;
                        i3 |= composerStartRestartGroup.changed(size2) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            z3 = z;
                            i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                        }
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(content) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                type2 = FinancialConnectionsButton.Type.Primary.INSTANCE;
                            }
                            if (i5 != 0) {
                                size2 = FinancialConnectionsButton.Size.Regular.INSTANCE;
                            }
                            boolean z6 = i6 == 0 ? true : z3;
                            boolean z7 = i7 == 0 ? false : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1838012725, i3, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton (Button.kt:72)");
                            }
                            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localView);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            View view = (View) objConsume;
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume2 = composerStartRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            Density density = (Density) objConsume2;
                            FinancialConnectionsColors colors = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
                            composerStartRestartGroup.startReplaceGroup(1062058194);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = MultipleEventsCutterKt.get(MultipleEventsCutter.INSTANCE);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            MultipleEventsCutter multipleEventsCutter = (MultipleEventsCutter) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1062060284);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                                modifier3 = companion;
                                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6115boximpl(DefaultSpinnerHeight), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            } else {
                                modifier3 = companion;
                            }
                            MutableState mutableState = (MutableState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z7 ? 1.0f : 0.0f, null, 0.0f, "LoadingIndicatorAlpha", null, composerStartRestartGroup, 3072, 22);
                            composer2 = composerStartRestartGroup;
                            composer2.startReplaceGroup(1062067780);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                if (Intrinsics.areEqual(type2, FinancialConnectionsButton.Type.Primary.INSTANCE)) {
                                    objRememberedValue3 = Brush.Companion.m3612sweepGradientUv8p0NA$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(colors.m7639getPrimary0d7_KjU()), Color.m3647boximpl(colors.m7640getPrimaryAccent0d7_KjU())}), 0L, 2, (Object) null);
                                } else {
                                    if (!Intrinsics.areEqual(type2, FinancialConnectionsButton.Type.Secondary.INSTANCE)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    objRememberedValue3 = Brush.Companion.m3612sweepGradientUv8p0NA$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m3647boximpl(colors.m7632getBackgroundSecondary0d7_KjU()), Color.m3647boximpl(colors.m7645getTextDefault0d7_KjU())}), 0L, 2, (Object) null);
                                }
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            ProvidedValue<RippleConfiguration> providedValueProvides = RippleKt.getLocalRippleConfiguration().provides(rippleConfiguration(type2, composer2, (i3 >> 6) & 14));
                            FinancialConnectionsButton.Size size4 = size2;
                            boolean z8 = z7;
                            FinancialConnectionsButton.Type type4 = type2;
                            Modifier modifier5 = modifier3;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.rememberComposableLambda(1423326091, true, new AnonymousClass1(type4, size4, multipleEventsCutter, z8, view, onClick, modifier5, z6, density, content, (Brush) objRememberedValue3, stateAnimateFloatAsState, mutableState), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            type3 = type4;
                            z4 = z8;
                            z5 = z6;
                            size3 = size4;
                            modifier4 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z4 = z2;
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            type3 = type2;
                            size3 = size2;
                            z5 = z3;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ButtonKt.FinancialConnectionsButton$lambda$6(onClick, modifier4, type3, size3, z5, z4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    z3 = z;
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    if ((i2 & 64) != 0) {
                    }
                    if ((i3 & 599187) != 599186) {
                        if (i8 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<View> localView2 = AndroidCompositionLocals_androidKt.getLocalView();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume3 = composerStartRestartGroup.consume(localView2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        View view2 = (View) objConsume3;
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume22 = composerStartRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        Density density2 = (Density) objConsume22;
                        FinancialConnectionsColors colors2 = FinancialConnectionsTheme.INSTANCE.getColors(composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(1062058194);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        MultipleEventsCutter multipleEventsCutter2 = (MultipleEventsCutter) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1062060284);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 != Composer.INSTANCE.getEmpty()) {
                        }
                        MutableState mutableState2 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        State<Float> stateAnimateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(!z7 ? 1.0f : 0.0f, null, 0.0f, "LoadingIndicatorAlpha", null, composerStartRestartGroup, 3072, 22);
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceGroup(1062067780);
                        objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composer2.endReplaceGroup();
                        ProvidedValue<RippleConfiguration> providedValueProvides2 = RippleKt.getLocalRippleConfiguration().provides(rippleConfiguration(type2, composer2, (i3 >> 6) & 14));
                        FinancialConnectionsButton.Size size42 = size2;
                        boolean z82 = z7;
                        FinancialConnectionsButton.Type type42 = type2;
                        Modifier modifier52 = modifier3;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides2, ComposableLambdaKt.rememberComposableLambda(1423326091, true, new AnonymousClass1(type42, size42, multipleEventsCutter2, z82, view2, onClick, modifier52, z6, density2, content, (Brush) objRememberedValue3, stateAnimateFloatAsState2, mutableState2), composer2, 54), composer2, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        type3 = type42;
                        z4 = z82;
                        z5 = z6;
                        size3 = size42;
                        modifier4 = modifier52;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                size2 = size;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                z3 = z;
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i3 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            type2 = type;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            size2 = size;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            z3 = z;
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i3 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        type2 = type;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        size2 = size;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        z3 = z;
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinancialConnectionsButton$lambda$2(MutableState<Dp> mutableState) {
        return mutableState.getValue().m6131unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FinancialConnectionsButton$lambda$3(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m6115boximpl(f));
    }

    /* compiled from: Button.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
        final /* synthetic */ Density $density;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ boolean $loading;
        final /* synthetic */ State<Float> $loadingIndicatorAlpha$delegate;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ MultipleEventsCutter $multipleEventsCutter;
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ FinancialConnectionsButton.Size $size;
        final /* synthetic */ Brush $spinnerBrush;
        final /* synthetic */ MutableState<Dp> $spinnerHeight$delegate;
        final /* synthetic */ FinancialConnectionsButton.Type $type;
        final /* synthetic */ View $view;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(FinancialConnectionsButton.Type type, FinancialConnectionsButton.Size size, MultipleEventsCutter multipleEventsCutter, boolean z, View view, Function0<Unit> function0, Modifier modifier, boolean z2, Density density, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Brush brush, State<Float> state, MutableState<Dp> mutableState) {
            this.$type = type;
            this.$size = size;
            this.$multipleEventsCutter = multipleEventsCutter;
            this.$loading = z;
            this.$view = view;
            this.$onClick = function0;
            this.$modifier = modifier;
            this.$enabled = z2;
            this.$density = density;
            this.$content = function3;
            this.$spinnerBrush = brush;
            this.$loadingIndicatorAlpha$delegate = state;
            this.$spinnerHeight$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1423326091, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous> (Button.kt:95)");
                }
                ButtonElevation buttonElevationElevation = this.$type.elevation(composer, 0);
                RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(this.$size.mo7577getRadiusD9Ej5fM());
                PaddingValues paddingValuesM1013PaddingValues0680j_4 = PaddingKt.m1013PaddingValues0680j_4(Dp.m6117constructorimpl(0));
                ButtonColors buttonColors = this.$type.buttonColors(composer, 0);
                composer.startReplaceGroup(1663769326);
                boolean zChangedInstance = composer.changedInstance(this.$multipleEventsCutter) | composer.changed(this.$loading) | composer.changedInstance(this.$view) | composer.changed(this.$onClick);
                final MultipleEventsCutter multipleEventsCutter = this.$multipleEventsCutter;
                final boolean z = this.$loading;
                final View view = this.$view;
                final Function0<Unit> function0 = this.$onClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ButtonKt.AnonymousClass1.invoke$lambda$2$lambda$1(multipleEventsCutter, z, view, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifier = this.$modifier;
                boolean z2 = this.$enabled;
                RoundedCornerShape roundedCornerShape = roundedCornerShapeM1303RoundedCornerShape0680j_4;
                final FinancialConnectionsButton.Size size = this.$size;
                final Density density = this.$density;
                final Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                final Brush brush = this.$spinnerBrush;
                final State<Float> state = this.$loadingIndicatorAlpha$delegate;
                final MutableState<Dp> mutableState = this.$spinnerHeight$delegate;
                androidx.compose.material.ButtonKt.Button((Function0) objRememberedValue, modifier, z2, null, buttonElevationElevation, roundedCornerShape, null, buttonColors, paddingValuesM1013PaddingValues0680j_4, ComposableLambdaKt.rememberComposableLambda(-2052120709, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt.FinancialConnectionsButton.1.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                        invoke(rowScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i2 & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2052120709, i2, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous>.<anonymous> (Button.kt:111)");
                            }
                            androidx.compose.material.TextKt.ProvideTextStyle(TextStyle.m5615copyp1EtxEg$default(FinancialConnectionsTheme.INSTANCE.getTypography(composer2, 6).getLabelLargeEmphasized(), 0L, 0L, null, null, null, null, null, TextUnitKt.getSp(0), null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777087, null), ComposableLambdaKt.rememberComposableLambda(1138396394, true, new C01631(size, density, function3, brush, state, mutableState), composer2, 54), composer2, 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* compiled from: Button.kt */
                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    /* renamed from: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$2$1, reason: invalid class name and collision with other inner class name */
                    static final class C01631 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> $content;
                        final /* synthetic */ Density $density;
                        final /* synthetic */ State<Float> $loadingIndicatorAlpha$delegate;
                        final /* synthetic */ FinancialConnectionsButton.Size $size;
                        final /* synthetic */ Brush $spinnerBrush;
                        final /* synthetic */ MutableState<Dp> $spinnerHeight$delegate;

                        /* JADX WARN: Multi-variable type inference failed */
                        C01631(FinancialConnectionsButton.Size size, Density density, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Brush brush, State<Float> state, MutableState<Dp> mutableState) {
                            this.$size = size;
                            this.$density = density;
                            this.$content = function3;
                            this.$spinnerBrush = brush;
                            this.$loadingIndicatorAlpha$delegate = state;
                            this.$spinnerHeight$delegate = mutableState;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) != 2 || !composer.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1138396394, i, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous>.<anonymous>.<anonymous> (Button.kt:117)");
                                }
                                Alignment center = Alignment.INSTANCE.getCenter();
                                FinancialConnectionsButton.Size size = this.$size;
                                final Density density = this.$density;
                                Function3<RowScope, Composer, Integer, Unit> function3 = this.$content;
                                Brush brush = this.$spinnerBrush;
                                State<Float> state = this.$loadingIndicatorAlpha$delegate;
                                final MutableState<Dp> mutableState = this.$spinnerHeight$delegate;
                                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierPadding = PaddingKt.padding(AlphaKt.alpha(Modifier.INSTANCE, 1.0f - ButtonKt.FinancialConnectionsButton$lambda$4(state)), size.paddingValues(composer, 0));
                                composer.startReplaceGroup(-1561727237);
                                boolean zChanged = composer.changed(density);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ButtonKt.AnonymousClass1.AnonymousClass2.C01631.invoke$lambda$3$lambda$2$lambda$1(density, mutableState, (IntSize) obj);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierPadding, (Function1) objRememberedValue);
                                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierOnSizeChanged);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer.startReusableNode();
                                if (composer.getInserting()) {
                                    composer.createNode(constructor2);
                                } else {
                                    composer.useNode();
                                }
                                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer);
                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                function3.invoke(RowScopeInstance.INSTANCE, composer, 6);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                composer.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                ComposerKt.sourceInformationMarkerEnd(composer);
                                LoadingContentKt.m7359LoadingSpinneruFdPcIQ(AlphaKt.alpha(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, ButtonKt.FinancialConnectionsButton$lambda$2(mutableState)), ButtonKt.FinancialConnectionsButton$lambda$4(state)), Dp.m6117constructorimpl(2), brush, composer, 432, 0);
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
                        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Density density, MutableState mutableState, IntSize intSize) {
                            ButtonKt.FinancialConnectionsButton$lambda$3(mutableState, density.mo709toDpu2uoSUM(IntSize.m6286getHeightimpl(intSize.getPackedValue())));
                            return Unit.INSTANCE;
                        }
                    }
                }, composer, 54), composer, 905969664, 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(MultipleEventsCutter multipleEventsCutter, final boolean z, final View view, final Function0 function0) {
            multipleEventsCutter.processEvent(new Function0() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$FinancialConnectionsButton$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ButtonKt.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(z, view, function0);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(boolean z, View view, Function0 function0) {
            if (!z) {
                if (Build.VERSION.SDK_INT >= 30) {
                    view.performHapticFeedback(16);
                }
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static final RippleConfiguration rippleConfiguration(FinancialConnectionsButton.Type type, Composer composer, int i) {
        long jM7645getTextDefault0d7_KjU;
        composer.startReplaceGroup(383518925);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(383518925, i, -1, "com.stripe.android.financialconnections.ui.components.rippleConfiguration (Button.kt:145)");
        }
        composer.startReplaceGroup(-2142688400);
        if (Intrinsics.areEqual(type, FinancialConnectionsButton.Type.Primary.INSTANCE)) {
            jM7645getTextDefault0d7_KjU = ColorKt.getNeutral0();
        } else {
            if (!Intrinsics.areEqual(type, FinancialConnectionsButton.Type.Secondary.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            jM7645getTextDefault0d7_KjU = FinancialConnectionsTheme.INSTANCE.getColors(composer, 6).m7645getTextDefault0d7_KjU();
        }
        composer.endReplaceGroup();
        RippleConfiguration rippleConfiguration = new RippleConfiguration(jM7645getTextDefault0d7_KjU, RippleDefaults.INSTANCE.m1979rippleAlphaDxMtmZc(type.buttonColors(composer, i & 14).contentColor(true, composer, 6).getValue().m3667unboximpl(), true), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return rippleConfiguration;
    }

    public static final void FinancialConnectionsButtonPreview(@PreviewParameter(provider = ThemePreviewParameterProvider.class) Theme theme, Composer composer, final int i) {
        int i2;
        final Theme theme2;
        Intrinsics.checkNotNullParameter(theme, "theme");
        Composer composerStartRestartGroup = composer.startRestartGroup(1585021474);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(theme) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1585021474, i2, -1, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButtonPreview (Button.kt:230)");
            }
            theme2 = theme;
            com.stripe.android.financialconnections.ui.CompositionLocalKt.FinancialConnectionsPreview(theme2, false, ComposableSingletons$ButtonKt.INSTANCE.m7564getLambda7$financial_connections_release(), composerStartRestartGroup, (i2 & 14) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            theme2 = theme;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.financialconnections.ui.components.ButtonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ButtonKt.FinancialConnectionsButtonPreview$lambda$7(theme2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float FinancialConnectionsButton$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }
}
