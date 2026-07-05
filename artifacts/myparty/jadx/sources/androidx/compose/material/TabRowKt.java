package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a©\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000123\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u009f\u0001\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r23\b\u0002\u0010\u0010\u001a-\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00070\u0011¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0018\b\u0002\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u001a¢\u0006\u0002\b\u0017¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", ViewProps.BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/ui/UiComposable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6117constructorimpl(90);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011e  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2046TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primarySurface;
        long jM1851contentColorForek8zF_U;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        final Function2<? super Composer, ? super Integer, Unit> function2M1872getLambda1$material_release;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        long j3;
        int i7;
        long j4;
        int i8;
        Composer composer2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-249175289);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)136@6719L6,137@6768L32,139@6907L139,154@7356L1387,150@7225L1518:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i10 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i10;
                } else {
                    primarySurface = j;
                }
                i4 |= i10;
            } else {
                primarySurface = j;
            }
            if ((i2 & 3072) != 0) {
                jM1851contentColorForek8zF_U = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(jM1851contentColorForek8zF_U)) ? 2048 : 1024;
            } else {
                jM1851contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    function3RememberComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                    }
                    if ((i4 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                        } else {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                i4 &= -7169;
                            }
                            if (i5 != 0) {
                                function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-553782708, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                        invoke((List<TabPosition>) list, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(List<TabPosition> list, Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "C140@6948L92:TabRow.kt#jmzs0o");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-553782708, i11, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:140)");
                                        }
                                        TabRowDefaults.INSTANCE.m2040Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54);
                            }
                            if (i6 == 0) {
                                int i11 = i4;
                                function2M1872getLambda1$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1872getLambda1$material_release();
                                function32 = function3RememberComposableLambda;
                                j3 = primarySurface;
                                i7 = i11;
                                j4 = jM1851contentColorForek8zF_U;
                                i8 = 54;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-249175289, i7, -1, "androidx.compose.material.TabRow (TabRow.kt:149)");
                            }
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2015SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i12) {
                                    ComposerKt.sourceInformation(composer3, "C155@7408L1329,155@7366L1371:TabRow.kt#jmzs0o");
                                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1961746365, i12, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:155)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    ComposerKt.sourceInformationMarkerStart(composer3, 463606619, "CC(remember):TabRow.kt#9igjgp");
                                    boolean zChanged = composer3.changed(function22) | composer3.changed(function2M1872getLambda1$material_release) | composer3.changed(function32);
                                    final Function2<Composer, Integer, Unit> function25 = function22;
                                    final Function2<Composer, Integer, Unit> function26 = function2M1872getLambda1$material_release;
                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function32;
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m2048invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m2048invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                                int i13;
                                                Object obj;
                                                final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                int size = listSubcompose.size();
                                                final int i14 = iM6070getMaxWidthimpl / size;
                                                ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                int size2 = listSubcompose.size();
                                                int i15 = 0;
                                                while (i15 < size2) {
                                                    Measurable measurable = listSubcompose.get(i15);
                                                    int i16 = i14;
                                                    long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i16, i14, 0, 0, 12, null);
                                                    i14 = i16;
                                                    arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                    i15++;
                                                    listSubcompose = listSubcompose;
                                                }
                                                final ArrayList arrayList2 = arrayList;
                                                if (arrayList2.isEmpty()) {
                                                    obj = null;
                                                    i13 = 0;
                                                } else {
                                                    i13 = 0;
                                                    obj = arrayList2.get(0);
                                                    int height = ((Placeable) obj).getHeight();
                                                    int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                                                    int i17 = 1;
                                                    if (1 <= lastIndex) {
                                                        while (true) {
                                                            Object obj2 = arrayList2.get(i17);
                                                            int height2 = ((Placeable) obj2).getHeight();
                                                            if (height < height2) {
                                                                obj = obj2;
                                                                height = height2;
                                                            }
                                                            if (i17 == lastIndex) {
                                                                break;
                                                            }
                                                            i17++;
                                                        }
                                                    }
                                                }
                                                Placeable placeable = (Placeable) obj;
                                                final int height3 = placeable != null ? placeable.getHeight() : i13;
                                                ArrayList arrayList3 = new ArrayList(size);
                                                for (int i18 = i13; i18 < size; i18++) {
                                                    arrayList3.add(new TabPosition(Dp.m6117constructorimpl(subcomposeMeasureScope.mo709toDpu2uoSUM(i14) * i18), subcomposeMeasureScope.mo709toDpu2uoSUM(i14), null));
                                                }
                                                final ArrayList arrayList4 = arrayList3;
                                                final Function2<Composer, Integer, Unit> function27 = function26;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                                return MeasureScope.layout$default(subcomposeMeasureScope, iM6070getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                        invoke2(placementScope);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                                        List<Placeable> list = arrayList2;
                                                        int i19 = i14;
                                                        int size3 = list.size();
                                                        for (int i20 = 0; i20 < size3; i20++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i20), i20 * i19, 0, 0.0f, 4, null);
                                                        }
                                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                        long j8 = j7;
                                                        int i21 = height3;
                                                        int size4 = listSubcompose2.size();
                                                        for (int i22 = 0; i22 < size4; i22++) {
                                                            Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i22).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, i21 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                        final List<TabPosition> list2 = arrayList4;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i23) {
                                                                ComposerKt.sourceInformation(composer4, "C181@8543L23:TabRow.kt#jmzs0o");
                                                                if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-641946361, i23, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:181)");
                                                                }
                                                                function36.invoke(list2, composer4, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        int i23 = iM6070getMaxWidthimpl;
                                                        int i24 = height3;
                                                        int size5 = listSubcompose3.size();
                                                        for (int i25 = 0; i25 < size5; i25++) {
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, i8), composer2, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function33 = function32;
                            function24 = function2M1872getLambda1$material_release;
                            modifier3 = modifier2;
                            j5 = j3;
                            j6 = j4;
                        }
                        function32 = function3RememberComposableLambda;
                        j3 = primarySurface;
                        i8 = 54;
                        i7 = i4;
                        function2M1872getLambda1$material_release = function23;
                        j4 = jM1851contentColorForek8zF_U;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m2015SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C155@7408L1329,155@7366L1371:TabRow.kt#jmzs0o");
                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1961746365, i12, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:155)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, 463606619, "CC(remember):TabRow.kt#9igjgp");
                                boolean zChanged = composer3.changed(function22) | composer3.changed(function2M1872getLambda1$material_release) | composer3.changed(function32);
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function2M1872getLambda1$material_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m2048invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m2048invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                            int i13;
                                            Object obj;
                                            final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                            int size = listSubcompose.size();
                                            final int i14 = iM6070getMaxWidthimpl / size;
                                            ArrayList arrayList = new ArrayList(listSubcompose.size());
                                            int size2 = listSubcompose.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Measurable measurable = listSubcompose.get(i15);
                                                int i16 = i14;
                                                long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i16, i14, 0, 0, 12, null);
                                                i14 = i16;
                                                arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                i15++;
                                                listSubcompose = listSubcompose;
                                            }
                                            final List<? extends Placeable> arrayList2 = arrayList;
                                            if (arrayList2.isEmpty()) {
                                                obj = null;
                                                i13 = 0;
                                            } else {
                                                i13 = 0;
                                                obj = arrayList2.get(0);
                                                int height = ((Placeable) obj).getHeight();
                                                int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                                                int i17 = 1;
                                                if (1 <= lastIndex) {
                                                    while (true) {
                                                        Object obj2 = arrayList2.get(i17);
                                                        int height2 = ((Placeable) obj2).getHeight();
                                                        if (height < height2) {
                                                            obj = obj2;
                                                            height = height2;
                                                        }
                                                        if (i17 == lastIndex) {
                                                            break;
                                                        }
                                                        i17++;
                                                    }
                                                }
                                            }
                                            Placeable placeable = (Placeable) obj;
                                            final int height3 = placeable != null ? placeable.getHeight() : i13;
                                            ArrayList arrayList3 = new ArrayList(size);
                                            for (int i18 = i13; i18 < size; i18++) {
                                                arrayList3.add(new TabPosition(Dp.m6117constructorimpl(subcomposeMeasureScope.mo709toDpu2uoSUM(i14) * i18), subcomposeMeasureScope.mo709toDpu2uoSUM(i14), null));
                                            }
                                            final List<TabPosition> arrayList4 = arrayList3;
                                            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                            return MeasureScope.layout$default(subcomposeMeasureScope, iM6070getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    List<Placeable> list = arrayList2;
                                                    int i19 = i14;
                                                    int size3 = list.size();
                                                    for (int i20 = 0; i20 < size3; i20++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i20), i20 * i19, 0, 0.0f, 4, null);
                                                    }
                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                    long j8 = j7;
                                                    int i21 = height3;
                                                    int size4 = listSubcompose2.size();
                                                    for (int i22 = 0; i22 < size4; i22++) {
                                                        Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i22).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, i21 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i23) {
                                                            ComposerKt.sourceInformation(composer4, "C181@8543L23:TabRow.kt#jmzs0o");
                                                            if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-641946361, i23, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:181)");
                                                            }
                                                            function36.invoke(list2, composer4, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i23 = iM6070getMaxWidthimpl;
                                                    int i24 = height3;
                                                    int size5 = listSubcompose3.size();
                                                    for (int i25 = 0; i25 < size5; i25++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, i8), composer2, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function33 = function32;
                        function24 = function2M1872getLambda1$material_release;
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        j5 = primarySurface;
                        j6 = jM1851contentColorForek8zF_U;
                        function33 = function3RememberComposableLambda;
                        function24 = function23;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                TabRowKt.m2046TabRowpAZo6Ak(i, modifier3, j5, j6, function33, function24, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function23 = function2;
                if ((i3 & 64) == 0) {
                }
                if ((i4 & 599187) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) == 0) {
                        if (i9 != 0) {
                        }
                        if ((i3 & 4) != 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                            function32 = function3RememberComposableLambda;
                            j3 = primarySurface;
                            i8 = 54;
                            i7 = i4;
                            function2M1872getLambda1$material_release = function23;
                            j4 = jM1851contentColorForek8zF_U;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m2015SurfaceFjzlyU(SelectableGroupKt.selectableGroup(modifier2), null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1961746365, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i12) {
                                ComposerKt.sourceInformation(composer3, "C155@7408L1329,155@7366L1371:TabRow.kt#jmzs0o");
                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1961746365, i12, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:155)");
                                }
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(composer3, 463606619, "CC(remember):TabRow.kt#9igjgp");
                                boolean zChanged = composer3.changed(function22) | composer3.changed(function2M1872getLambda1$material_release) | composer3.changed(function32);
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                final Function2<? super Composer, ? super Integer, Unit> function26 = function2M1872getLambda1$material_release;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m2048invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m2048invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j7) {
                                            int i13;
                                            Object obj;
                                            final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                            int size = listSubcompose.size();
                                            final int i14 = iM6070getMaxWidthimpl / size;
                                            ArrayList arrayList = new ArrayList(listSubcompose.size());
                                            int size2 = listSubcompose.size();
                                            int i15 = 0;
                                            while (i15 < size2) {
                                                Measurable measurable = listSubcompose.get(i15);
                                                int i16 = i14;
                                                long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i16, i14, 0, 0, 12, null);
                                                i14 = i16;
                                                arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                i15++;
                                                listSubcompose = listSubcompose;
                                            }
                                            final List<? extends Placeable> arrayList2 = arrayList;
                                            if (arrayList2.isEmpty()) {
                                                obj = null;
                                                i13 = 0;
                                            } else {
                                                i13 = 0;
                                                obj = arrayList2.get(0);
                                                int height = ((Placeable) obj).getHeight();
                                                int lastIndex = CollectionsKt.getLastIndex(arrayList2);
                                                int i17 = 1;
                                                if (1 <= lastIndex) {
                                                    while (true) {
                                                        Object obj2 = arrayList2.get(i17);
                                                        int height2 = ((Placeable) obj2).getHeight();
                                                        if (height < height2) {
                                                            obj = obj2;
                                                            height = height2;
                                                        }
                                                        if (i17 == lastIndex) {
                                                            break;
                                                        }
                                                        i17++;
                                                    }
                                                }
                                            }
                                            Placeable placeable = (Placeable) obj;
                                            final int height3 = placeable != null ? placeable.getHeight() : i13;
                                            ArrayList arrayList3 = new ArrayList(size);
                                            for (int i18 = i13; i18 < size; i18++) {
                                                arrayList3.add(new TabPosition(Dp.m6117constructorimpl(subcomposeMeasureScope.mo709toDpu2uoSUM(i14) * i18), subcomposeMeasureScope.mo709toDpu2uoSUM(i14), null));
                                            }
                                            final List<TabPosition> arrayList4 = arrayList3;
                                            final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                            return MeasureScope.layout$default(subcomposeMeasureScope, iM6070getMaxWidthimpl, height3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                    invoke2(placementScope);
                                                    return Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                                    List<Placeable> list = arrayList2;
                                                    int i19 = i14;
                                                    int size3 = list.size();
                                                    for (int i20 = 0; i20 < size3; i20++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i20), i20 * i19, 0, 0.0f, 4, null);
                                                    }
                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                    long j8 = j7;
                                                    int i21 = height3;
                                                    int size4 = listSubcompose2.size();
                                                    for (int i22 = 0; i22 < size4; i22++) {
                                                        Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i22).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, i21 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-641946361, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                            invoke(composer4, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer4, int i23) {
                                                            ComposerKt.sourceInformation(composer4, "C181@8543L23:TabRow.kt#jmzs0o");
                                                            if ((i23 & 3) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(-641946361, i23, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:181)");
                                                            }
                                                            function36.invoke(list2, composer4, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i23 = iM6070getMaxWidthimpl;
                                                    int i24 = height3;
                                                    int size5 = listSubcompose3.size();
                                                    for (int i25 = 0; i25 < size5; i25++) {
                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i25).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i23, i24)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }
                                            }, 4, null);
                                        }
                                    };
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, i8), composer2, (i7 & 896) | 1572864 | (i7 & 7168), 50);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function33 = function32;
                        function24 = function2M1872getLambda1$material_release;
                        modifier3 = modifier2;
                        j5 = j3;
                        j6 = j4;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function3RememberComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            function23 = function2;
            if ((i3 & 64) == 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3RememberComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        function23 = function2;
        if ((i3 & 64) == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2045ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long primarySurface;
        long jM1851contentColorForek8zF_U;
        int i5;
        float fM2043getScrollableTabRowPaddingD9Ej5fM;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3RememberComposableLambda;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M1873getLambda2$material_release;
        float f2;
        Modifier modifier3;
        int i8;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        long j3;
        int i9;
        long j4;
        int i10;
        Composer composer2;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier4;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473476840);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)230@11351L6,231@11400L32,234@11601L139,249@12032L2913,245@11919L3026:TabRow.kt#jmzs0o");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
                if ((i3 & 4) == 0) {
                    primarySurface = j;
                    int i12 = composerStartRestartGroup.changed(primarySurface) ? 256 : 128;
                    i4 |= i12;
                } else {
                    primarySurface = j;
                }
                i4 |= i12;
            } else {
                primarySurface = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    jM1851contentColorForek8zF_U = j2;
                    int i13 = composerStartRestartGroup.changed(jM1851contentColorForek8zF_U) ? 2048 : 1024;
                    i4 |= i13;
                } else {
                    jM1851contentColorForek8zF_U = j2;
                }
                i4 |= i13;
            } else {
                jM1851contentColorForek8zF_U = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    fM2043getScrollableTabRowPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM2043getScrollableTabRowPaddingD9Ej5fM) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((196608 & i2) == 0) {
                        function3RememberComposableLambda = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function3RememberComposableLambda) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                            } else {
                                if (i11 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if ((i3 & 4) != 0) {
                                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    jM1851contentColorForek8zF_U = ColorsKt.m1851contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i4 >> 6) & 14);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    fM2043getScrollableTabRowPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m2043getScrollableTabRowPaddingD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    function3RememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-655609869, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> list, Composer composer3, int i14) {
                                            ComposerKt.sourceInformation(composer3, "C235@11642L92:TabRow.kt#jmzs0o");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-655609869, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:235)");
                                            }
                                            TabRowDefaults.INSTANCE.m2040Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composerStartRestartGroup, 54);
                                }
                                if (i7 == 0) {
                                    Modifier modifier5 = modifier2;
                                    function2M1873getLambda2$material_release = ComposableSingletons$TabRowKt.INSTANCE.m1873getLambda2$material_release();
                                    f2 = fM2043getScrollableTabRowPaddingD9Ej5fM;
                                    modifier3 = modifier5;
                                    long j7 = primarySurface;
                                    i8 = i4;
                                    function32 = function3RememberComposableLambda;
                                    j3 = j7;
                                    i9 = 1572864;
                                    j4 = jM1851contentColorForek8zF_U;
                                    i10 = -1473476840;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(i10, i8, -1, "androidx.compose.material.ScrollableTabRow (TabRow.kt:244)");
                                }
                                final float f4 = f2;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = function2M1873getLambda2$material_release;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2015SurfaceFjzlyU(modifier3, null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        ComposerKt.sourceInformation(composer3, "C250@12060L21,251@12111L24,252@12168L185,264@12604L2335,258@12362L2577:TabRow.kt#jmzs0o");
                                        if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(1455860572, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:250)");
                                            }
                                            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                            ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                            ComposerKt.sourceInformationMarkerStart(composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
                                            Object objRememberedValue = composer3.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                                composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1241505110, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                            Object objRememberedValue2 = composer3.rememberedValue();
                                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                                composer3.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                            ComposerKt.sourceInformationMarkerStart(composer3, -1241489008, "CC(remember):TabRow.kt#9igjgp");
                                            boolean zChanged2 = composer3.changed(f4) | composer3.changed(function22) | composer3.changed(function24) | composer3.changed(function34) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                            final float f5 = f4;
                                            final Function2<Composer, Integer, Unit> function25 = function22;
                                            final Function2<Composer, Integer, Unit> function26 = function24;
                                            final int i15 = i;
                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                            Object objRememberedValue3 = composer3.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m2047invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m2047invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j8) {
                                                        int i16 = subcomposeMeasureScope.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int i17 = subcomposeMeasureScope.mo706roundToPx0680j_4(f5);
                                                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j8, i16, 0, 0, 0, 14, null);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                        int size = listSubcompose.size();
                                                        for (int i18 = 0; i18 < size; i18++) {
                                                            arrayList.add(listSubcompose.get(i18).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                        }
                                                        final ArrayList arrayList2 = arrayList;
                                                        final Ref.IntRef intRef = new Ref.IntRef();
                                                        intRef.element = i17 * 2;
                                                        final Ref.IntRef intRef2 = new Ref.IntRef();
                                                        int size2 = arrayList2.size();
                                                        for (int i19 = 0; i19 < size2; i19++) {
                                                            Placeable placeable = (Placeable) arrayList2.get(i19);
                                                            intRef.element += placeable.getWidth();
                                                            intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                        }
                                                        int i20 = intRef.element;
                                                        int i21 = intRef2.element;
                                                        final Function2<Composer, Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i22 = i15;
                                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                                                final ArrayList arrayList3 = new ArrayList();
                                                                int i23 = i17;
                                                                List<Placeable> list = arrayList2;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                int size3 = list.size();
                                                                int width = i23;
                                                                for (int i24 = 0; i24 < size3; i24++) {
                                                                    Placeable placeable2 = list.get(i24);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo709toDpu2uoSUM(width), subcomposeMeasureScope2.mo709toDpu2uoSUM(placeable2.getWidth()), null));
                                                                    width += placeable2.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j9 = j8;
                                                                Ref.IntRef intRef3 = intRef;
                                                                Ref.IntRef intRef4 = intRef2;
                                                                int size4 = listSubcompose2.size();
                                                                for (int i25 = 0; i25 < size4; i25++) {
                                                                    Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i25).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j9, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, intRef4.element - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function37 = function36;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    /* JADX WARN: Multi-variable type inference failed */
                                                                    {
                                                                        super(2);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function2
                                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                        invoke(composer4, num.intValue());
                                                                        return Unit.INSTANCE;
                                                                    }

                                                                    public final void invoke(Composer composer4, int i26) {
                                                                        ComposerKt.sourceInformation(composer4, "C306@14486L23:TabRow.kt#jmzs0o");
                                                                        if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                                            composer4.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(-411868839, i26, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:306)");
                                                                        }
                                                                        function37.invoke(arrayList3, composer4, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                Ref.IntRef intRef5 = intRef;
                                                                Ref.IntRef intRef6 = intRef2;
                                                                int size5 = listSubcompose3.size();
                                                                for (int i26 = 0; i26 < size5; i26++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i26).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, i17, arrayList3, i22);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer3.updateRememberedValue(objRememberedValue3);
                                            }
                                            ComposerKt.sourceInformationMarkerEnd(composer3);
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, ((i8 >> 3) & 14) | i9 | (i8 & 896) | (i8 & 7168), 50);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                f3 = f4;
                                function33 = function32;
                                function23 = function2M1873getLambda2$material_release;
                                modifier4 = modifier3;
                                j5 = j3;
                                j6 = j4;
                            }
                            long j8 = primarySurface;
                            i8 = i4;
                            function32 = function3RememberComposableLambda;
                            j3 = j8;
                            f2 = fM2043getScrollableTabRowPaddingD9Ej5fM;
                            i9 = 1572864;
                            modifier3 = modifier2;
                            j4 = jM1851contentColorForek8zF_U;
                            i10 = -1473476840;
                            function2M1873getLambda2$material_release = function2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float f42 = f2;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function342 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function242 = function2M1873getLambda2$material_release;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2015SurfaceFjzlyU(modifier3, null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    ComposerKt.sourceInformation(composer3, "C250@12060L21,251@12111L24,252@12168L185,264@12604L2335,258@12362L2577:TabRow.kt#jmzs0o");
                                    if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1455860572, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:250)");
                                        }
                                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                        ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                        ComposerKt.sourceInformationMarkerStart(composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1241505110, "CC(remember):TabRow.kt#9igjgp");
                                        boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1241489008, "CC(remember):TabRow.kt#9igjgp");
                                        boolean zChanged2 = composer3.changed(f42) | composer3.changed(function22) | composer3.changed(function242) | composer3.changed(function342) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                        final float f5 = f42;
                                        final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                        final int i15 = i;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function342;
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return m2047invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m2047invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j82) {
                                                    int i16 = subcomposeMeasureScope.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                    final int i17 = subcomposeMeasureScope.mo706roundToPx0680j_4(f5);
                                                    long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j82, i16, 0, 0, 0, 14, null);
                                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                    ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                    int size = listSubcompose.size();
                                                    for (int i18 = 0; i18 < size; i18++) {
                                                        arrayList.add(listSubcompose.get(i18).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                    }
                                                    final List<? extends Placeable> arrayList2 = arrayList;
                                                    final Ref.IntRef intRef = new Ref.IntRef();
                                                    intRef.element = i17 * 2;
                                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                                    int size2 = arrayList2.size();
                                                    for (int i19 = 0; i19 < size2; i19++) {
                                                        Placeable placeable = (Placeable) arrayList2.get(i19);
                                                        intRef.element += placeable.getWidth();
                                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                    }
                                                    int i20 = intRef.element;
                                                    int i21 = intRef2.element;
                                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                    final int i22 = i15;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                    return MeasureScope.layout$default(subcomposeMeasureScope, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                            final List<TabPosition> arrayList3 = new ArrayList();
                                                            int i23 = i17;
                                                            List<Placeable> list = arrayList2;
                                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                            int size3 = list.size();
                                                            int width = i23;
                                                            for (int i24 = 0; i24 < size3; i24++) {
                                                                Placeable placeable2 = list.get(i24);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                                arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo709toDpu2uoSUM(width), subcomposeMeasureScope2.mo709toDpu2uoSUM(placeable2.getWidth()), null));
                                                                width += placeable2.getWidth();
                                                            }
                                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                            long j9 = j82;
                                                            Ref.IntRef intRef3 = intRef;
                                                            Ref.IntRef intRef4 = intRef2;
                                                            int size4 = listSubcompose2.size();
                                                            for (int i25 = 0; i25 < size4; i25++) {
                                                                Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i25).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j9, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, intRef4.element - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    invoke(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer4, int i26) {
                                                                    ComposerKt.sourceInformation(composer4, "C306@14486L23:TabRow.kt#jmzs0o");
                                                                    if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                                        composer4.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-411868839, i26, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:306)");
                                                                    }
                                                                    function37.invoke(arrayList3, composer4, 0);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }));
                                                            Ref.IntRef intRef5 = intRef;
                                                            Ref.IntRef intRef6 = intRef2;
                                                            int size5 = listSubcompose3.size();
                                                            for (int i26 = 0; i26 < size5; i26++) {
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i26).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                            }
                                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, i17, arrayList3, i22);
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, ((i8 >> 3) & 14) | i9 | (i8 & 896) | (i8 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = f42;
                            function33 = function32;
                            function23 = function2M1873getLambda2$material_release;
                            modifier4 = modifier3;
                            j5 = j3;
                            j6 = j4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier4 = modifier2;
                            j5 = primarySurface;
                            j6 = jM1851contentColorForek8zF_U;
                            f3 = fM2043getScrollableTabRowPaddingD9Ej5fM;
                            function33 = function3RememberComposableLambda;
                            function23 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    TabRowKt.m2045ScrollableTabRowsKfQg0A(i, modifier4, j5, j6, f3, function33, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i4 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) == 0) {
                            if (i11 != 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                                long j82 = primarySurface;
                                i8 = i4;
                                function32 = function3RememberComposableLambda;
                                j3 = j82;
                                f2 = fM2043getScrollableTabRowPaddingD9Ej5fM;
                                i9 = 1572864;
                                modifier3 = modifier2;
                                j4 = jM1851contentColorForek8zF_U;
                                i10 = -1473476840;
                                function2M1873getLambda2$material_release = function2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final float f422 = f2;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3422 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function2422 = function2M1873getLambda2$material_release;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2015SurfaceFjzlyU(modifier3, null, j3, j4, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(1455860572, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i14) {
                                    ComposerKt.sourceInformation(composer3, "C250@12060L21,251@12111L24,252@12168L185,264@12604L2335,258@12362L2577:TabRow.kt#jmzs0o");
                                    if ((i14 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1455860572, i14, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:250)");
                                        }
                                        ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                        ComposerKt.sourceInformationMarkerStart(composer3, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                        ComposerKt.sourceInformationMarkerStart(composer3, -954367824, "CC(remember):Effects.kt#9igjgp");
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                            composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                            objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1241505110, "CC(remember):TabRow.kt#9igjgp");
                                        boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                        Object objRememberedValue2 = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                            composer3.updateRememberedValue(objRememberedValue2);
                                        }
                                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                        ComposerKt.sourceInformationMarkerStart(composer3, -1241489008, "CC(remember):TabRow.kt#9igjgp");
                                        boolean zChanged2 = composer3.changed(f422) | composer3.changed(function22) | composer3.changed(function2422) | composer3.changed(function3422) | composer3.changedInstance(scrollableTabData) | composer3.changed(i);
                                        final float f5 = f422;
                                        final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                        final int i15 = i;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function3422;
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return m2047invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m2047invoke0kLqBqw(final SubcomposeMeasureScope subcomposeMeasureScope, final long j822) {
                                                    int i16 = subcomposeMeasureScope.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                    final int i17 = subcomposeMeasureScope.mo706roundToPx0680j_4(f5);
                                                    long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j822, i16, 0, 0, 0, 14, null);
                                                    List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                    ArrayList arrayList = new ArrayList(listSubcompose.size());
                                                    int size = listSubcompose.size();
                                                    for (int i18 = 0; i18 < size; i18++) {
                                                        arrayList.add(listSubcompose.get(i18).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                    }
                                                    final List<? extends Placeable> arrayList2 = arrayList;
                                                    final Ref.IntRef intRef = new Ref.IntRef();
                                                    intRef.element = i17 * 2;
                                                    final Ref.IntRef intRef2 = new Ref.IntRef();
                                                    int size2 = arrayList2.size();
                                                    for (int i19 = 0; i19 < size2; i19++) {
                                                        Placeable placeable = (Placeable) arrayList2.get(i19);
                                                        intRef.element += placeable.getWidth();
                                                        intRef2.element = Math.max(intRef2.element, placeable.getHeight());
                                                    }
                                                    int i20 = intRef.element;
                                                    int i21 = intRef2.element;
                                                    final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                    final int i22 = i15;
                                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                    return MeasureScope.layout$default(subcomposeMeasureScope, i20, i21, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.TabRowKt$ScrollableTabRow$2$1$1.2
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                            invoke2(placementScope);
                                                            return Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(Placeable.PlacementScope placementScope) {
                                                            final List<TabPosition> arrayList3 = new ArrayList();
                                                            int i23 = i17;
                                                            List<Placeable> list = arrayList2;
                                                            SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                            int size3 = list.size();
                                                            int width = i23;
                                                            for (int i24 = 0; i24 < size3; i24++) {
                                                                Placeable placeable2 = list.get(i24);
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, width, 0, 0.0f, 4, null);
                                                                arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo709toDpu2uoSUM(width), subcomposeMeasureScope2.mo709toDpu2uoSUM(placeable2.getWidth()), null));
                                                                width += placeable2.getWidth();
                                                            }
                                                            List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                            long j9 = j822;
                                                            Ref.IntRef intRef3 = intRef;
                                                            Ref.IntRef intRef4 = intRef2;
                                                            int size4 = listSubcompose2.size();
                                                            for (int i25 = 0; i25 < size4; i25++) {
                                                                Placeable placeableMo4993measureBRTryo0 = listSubcompose2.get(i25).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j9, intRef3.element, intRef3.element, 0, 0, 8, null));
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo4993measureBRTryo0, 0, intRef4.element - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function37 = function36;
                                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-411868839, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TabRowKt.ScrollableTabRow.2.1.1.2.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function2
                                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                    invoke(composer4, num.intValue());
                                                                    return Unit.INSTANCE;
                                                                }

                                                                public final void invoke(Composer composer4, int i26) {
                                                                    ComposerKt.sourceInformation(composer4, "C306@14486L23:TabRow.kt#jmzs0o");
                                                                    if ((i26 & 3) == 2 && composer4.getSkipping()) {
                                                                        composer4.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-411868839, i26, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:306)");
                                                                    }
                                                                    function37.invoke(arrayList3, composer4, 0);
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }));
                                                            Ref.IntRef intRef5 = intRef;
                                                            Ref.IntRef intRef6 = intRef2;
                                                            int size5 = listSubcompose3.size();
                                                            for (int i26 = 0; i26 < size5; i26++) {
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i26).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(intRef5.element, intRef6.element)), 0, 0, 0.0f, 4, null);
                                                            }
                                                            scrollableTabData2.onLaidOut(subcomposeMeasureScope, i17, arrayList3, i22);
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        ComposerKt.sourceInformationMarkerEnd(composer3);
                                        SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer3, 0, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, ((i8 >> 3) & 14) | i9 | (i8 & 896) | (i8 & 7168), 50);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            f3 = f422;
                            function33 = function32;
                            function23 = function2M1873getLambda2$material_release;
                            modifier4 = modifier3;
                            j5 = j3;
                            j6 = j4;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3RememberComposableLambda = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i4 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM2043getScrollableTabRowPaddingD9Ej5fM = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function3RememberComposableLambda = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i4 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        fM2043getScrollableTabRowPaddingD9Ej5fM = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function3RememberComposableLambda = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
