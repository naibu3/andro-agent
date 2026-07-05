package androidx.compose.material3;

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
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: TabRow.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u009d\u0001\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00012.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0093\u0001\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2.\b\u0002\u0010\u0011\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u00182\u0011\u0010\u001b\u001a\r\u0012\u0004\u0012\u00020\b0\u001a¢\u0006\u0002\b\u0018H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowPadding", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "ScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "divider", "Lkotlin/Function0;", "tabs", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TabRow", "TabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = Dp.m6117constructorimpl(90);
    private static final float ScrollableTabRowPadding = Dp.m6117constructorimpl(52);
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:102:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0127  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2490TabRowpAZo6Ak(final int i, Modifier modifier, long j, long j2, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long containerColor;
        long contentColor;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function22;
        final int i7;
        long j3;
        final Function2<? super Composer, ? super Integer, Unit> function2M2254getLambda1$material3_release;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        long j4;
        Composer composer2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Modifier modifier3;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(TabRow)P(5,4,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3)128@6357L14,129@6414L12,140@6770L1732:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    containerColor = j;
                    int i10 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i4 |= i10;
                } else {
                    containerColor = j;
                }
                i4 |= i10;
            } else {
                containerColor = j;
            }
            if ((i2 & 7168) != 0) {
                contentColor = j2;
                i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(contentColor)) ? 2048 : 1024;
            } else {
                contentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((57344 & i2) == 0) {
                    function3ComposableLambda = function3;
                    i4 |= composerStartRestartGroup.changed(function3ComposableLambda) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else {
                    if ((458752 & i2) == 0) {
                        function22 = function2;
                        i4 |= composerStartRestartGroup.changed(function22) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        i8 = (i2 & 3670016) == 0 ? composerStartRestartGroup.changed(tabs) ? 1048576 : 524288 : 1572864;
                        if ((i4 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
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
                                    containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                }
                                if (i5 != 0) {
                                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(List<TabPosition> tabPositions, Composer composer3, int i11) {
                                            Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                            ComposerKt.sourceInformation(composer3, "C131@6552L92:TabRow.kt#uh7d8r");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2052073983, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                            }
                                            TabRowDefaults.INSTANCE.m2486Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                }
                                if (i6 == 0) {
                                    i7 = i4;
                                    j3 = contentColor;
                                    function2M2254getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2254getLambda1$material3_release();
                                    function32 = function3ComposableLambda;
                                    j4 = containerColor;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1199178586, i7, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                                }
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m2457SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                                    public final void invoke(Composer composer3, int i11) {
                                        ComposerKt.sourceInformation(composer3, "C145@6952L1544,145@6910L1586:TabRow.kt#uh7d8r");
                                        if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1273256619, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                        }
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final Function2<Composer, Integer, Unit> function24 = tabs;
                                        final Function2<Composer, Integer, Unit> function25 = function2M2254getLambda1$material3_release;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function32;
                                        final int i12 = i7;
                                        composer3.startReplaceableGroup(1618982084);
                                        ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                        boolean zChanged = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function34);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                    return m2492invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                }

                                                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                public final MeasureResult m2492invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                                    Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                    final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                    int size = listSubcompose.size();
                                                    final int i13 = iM6070getMaxWidthimpl / size;
                                                    List<Measurable> list = listSubcompose;
                                                    Iterator<T> it = list.iterator();
                                                    final int iMax = 0;
                                                    while (it.hasNext()) {
                                                        iMax = Math.max(((Measurable) it.next()).maxIntrinsicHeight(i13), iMax);
                                                    }
                                                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                    for (Measurable measurable : list) {
                                                        int i14 = i13;
                                                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i14, i13, iMax, 0, 8, null);
                                                        i13 = i14;
                                                        arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                    }
                                                    final ArrayList arrayList2 = arrayList;
                                                    ArrayList arrayList3 = new ArrayList(size);
                                                    for (int i15 = 0; i15 < size; i15++) {
                                                        arrayList3.add(new TabPosition(Dp.m6117constructorimpl(SubcomposeLayout.mo709toDpu2uoSUM(i13) * i15), SubcomposeLayout.mo709toDpu2uoSUM(i13), null));
                                                    }
                                                    final ArrayList arrayList4 = arrayList3;
                                                    final Function2<Composer, Integer, Unit> function26 = function25;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                                    final int i16 = i12;
                                                    return MeasureScope.layout$default(SubcomposeLayout, iM6070getMaxWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
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
                                                        public final void invoke2(Placeable.PlacementScope layout) {
                                                            Placeable.PlacementScope placementScope = layout;
                                                            Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                            List<Placeable> list2 = arrayList2;
                                                            int i17 = i13;
                                                            int i18 = 0;
                                                            for (Object obj : list2) {
                                                                int i19 = i18 + 1;
                                                                if (i18 < 0) {
                                                                    CollectionsKt.throwIndexOverflow();
                                                                }
                                                                Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                                placementScope = layout;
                                                                i18 = i19;
                                                            }
                                                            List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                            long j8 = j7;
                                                            int i20 = iMax;
                                                            Iterator<T> it2 = listSubcompose2.iterator();
                                                            while (it2.hasNext()) {
                                                                Placeable placeableMo4993measureBRTryo0 = ((Measurable) it2.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                                Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i20 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                                j8 = j8;
                                                            }
                                                            SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                            final List<TabPosition> list3 = arrayList4;
                                                            final int i21 = i16;
                                                            List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
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

                                                                public final void invoke(Composer composer4, int i22) {
                                                                    ComposerKt.sourceInformation(composer4, "C179@8306L23:TabRow.kt#uh7d8r");
                                                                    if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                                        composer4.skipToGroupEnd();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventStart(-976887453, i22, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                                    }
                                                                    function36.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                                    if (ComposerKt.isTraceInProgress()) {
                                                                        ComposerKt.traceEventEnd();
                                                                    }
                                                                }
                                                            }));
                                                            int i22 = iM6070getMaxWidthimpl;
                                                            int i23 = iMax;
                                                            Iterator<T> it3 = listSubcompose3.iterator();
                                                            while (it3.hasNext()) {
                                                                Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                            }
                                                        }
                                                    }, 4, null);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceableGroup();
                                        SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), composer2, 12582912 | (i7 & 896) | (i7 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function33 = function32;
                                function23 = function2M2254getLambda1$material3_release;
                                modifier3 = modifier2;
                                j5 = j4;
                                j6 = j3;
                            }
                            i7 = i4;
                            function32 = function3ComposableLambda;
                            function2M2254getLambda1$material3_release = function22;
                            j4 = containerColor;
                            j3 = contentColor;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2457SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    ComposerKt.sourceInformation(composer3, "C145@6952L1544,145@6910L1586:TabRow.kt#uh7d8r");
                                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1273256619, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                                    final Function2<? super Composer, ? super Integer, Unit> function25 = function2M2254getLambda1$material3_release;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                    final int i12 = i7;
                                    composer3.startReplaceableGroup(1618982084);
                                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                    boolean zChanged = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function34);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m2492invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m2492invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                int size = listSubcompose.size();
                                                final int i13 = iM6070getMaxWidthimpl / size;
                                                List<Measurable> list = listSubcompose;
                                                Iterator<T> it = list.iterator();
                                                final int iMax = 0;
                                                while (it.hasNext()) {
                                                    iMax = Math.max(((Measurable) it.next()).maxIntrinsicHeight(i13), iMax);
                                                }
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                for (Measurable measurable : list) {
                                                    int i14 = i13;
                                                    long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i14, i13, iMax, 0, 8, null);
                                                    i13 = i14;
                                                    arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                }
                                                final List<? extends Placeable> arrayList2 = arrayList;
                                                ArrayList arrayList3 = new ArrayList(size);
                                                for (int i15 = 0; i15 < size; i15++) {
                                                    arrayList3.add(new TabPosition(Dp.m6117constructorimpl(SubcomposeLayout.mo709toDpu2uoSUM(i13) * i15), SubcomposeLayout.mo709toDpu2uoSUM(i13), null));
                                                }
                                                final List<TabPosition> arrayList4 = arrayList3;
                                                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                final int i16 = i12;
                                                return MeasureScope.layout$default(SubcomposeLayout, iM6070getMaxWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
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
                                                    public final void invoke2(Placeable.PlacementScope layout) {
                                                        Placeable.PlacementScope placementScope = layout;
                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        List<Placeable> list2 = arrayList2;
                                                        int i17 = i13;
                                                        int i18 = 0;
                                                        for (Object obj : list2) {
                                                            int i19 = i18 + 1;
                                                            if (i18 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                            placementScope = layout;
                                                            i18 = i19;
                                                        }
                                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                        long j8 = j7;
                                                        int i20 = iMax;
                                                        Iterator<T> it2 = listSubcompose2.iterator();
                                                        while (it2.hasNext()) {
                                                            Placeable placeableMo4993measureBRTryo0 = ((Measurable) it2.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i20 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            j8 = j8;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                        final List<TabPosition> list3 = arrayList4;
                                                        final int i21 = i16;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
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

                                                            public final void invoke(Composer composer4, int i22) {
                                                                ComposerKt.sourceInformation(composer4, "C179@8306L23:TabRow.kt#uh7d8r");
                                                                if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-976887453, i22, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                                }
                                                                function36.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        int i22 = iM6070getMaxWidthimpl;
                                                        int i23 = iMax;
                                                        Iterator<T> it3 = listSubcompose3.iterator();
                                                        while (it3.hasNext()) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceableGroup();
                                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 12582912 | (i7 & 896) | (i7 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function33 = function32;
                            function23 = function2M2254getLambda1$material3_release;
                            modifier3 = modifier2;
                            j5 = j4;
                            j6 = j3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            composer2 = composerStartRestartGroup;
                            modifier3 = modifier2;
                            j5 = containerColor;
                            j6 = contentColor;
                            function33 = function3ComposableLambda;
                            function23 = function22;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
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

                            public final void invoke(Composer composer3, int i11) {
                                TabRowKt.m2490TabRowpAZo6Ak(i, modifier3, j5, j6, function33, function23, tabs, composer3, i2 | 1, i3);
                            }
                        });
                        return;
                    }
                    i4 |= i8;
                    if ((i4 & 2995931) != 599186) {
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
                                i7 = i4;
                                function32 = function3ComposableLambda;
                                function2M2254getLambda1$material3_release = function22;
                                j4 = containerColor;
                                j3 = contentColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m2457SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier2), null, j4, j3, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1273256619, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
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

                                public final void invoke(Composer composer3, int i11) {
                                    ComposerKt.sourceInformation(composer3, "C145@6952L1544,145@6910L1586:TabRow.kt#uh7d8r");
                                    if ((i11 & 11) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1273256619, i11, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                    }
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                                    final Function2<? super Composer, ? super Integer, Unit> function25 = function2M2254getLambda1$material3_release;
                                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function32;
                                    final int i12 = i7;
                                    composer3.startReplaceableGroup(1618982084);
                                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2,3):Composables.kt#9igjgp");
                                    boolean zChanged = composer3.changed(function24) | composer3.changed(function25) | composer3.changed(function34);
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function2) new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                return m2492invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                            }

                                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                            public final MeasureResult m2492invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                                Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                                final int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j7);
                                                List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                                int size = listSubcompose.size();
                                                final int i13 = iM6070getMaxWidthimpl / size;
                                                List<Measurable> list = listSubcompose;
                                                Iterator<T> it = list.iterator();
                                                final int iMax = 0;
                                                while (it.hasNext()) {
                                                    iMax = Math.max(((Measurable) it.next()).maxIntrinsicHeight(i13), iMax);
                                                }
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                                for (Measurable measurable : list) {
                                                    int i14 = i13;
                                                    long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i14, i13, iMax, 0, 8, null);
                                                    i13 = i14;
                                                    arrayList.add(measurable.mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                                }
                                                final List<? extends Placeable> arrayList2 = arrayList;
                                                ArrayList arrayList3 = new ArrayList(size);
                                                for (int i15 = 0; i15 < size; i15++) {
                                                    arrayList3.add(new TabPosition(Dp.m6117constructorimpl(SubcomposeLayout.mo709toDpu2uoSUM(i13) * i15), SubcomposeLayout.mo709toDpu2uoSUM(i13), null));
                                                }
                                                final List<TabPosition> arrayList4 = arrayList3;
                                                final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                                final int i16 = i12;
                                                return MeasureScope.layout$default(SubcomposeLayout, iM6070getMaxWidthimpl, iMax, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
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
                                                    public final void invoke2(Placeable.PlacementScope layout) {
                                                        Placeable.PlacementScope placementScope = layout;
                                                        Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                        List<Placeable> list2 = arrayList2;
                                                        int i17 = i13;
                                                        int i18 = 0;
                                                        for (Object obj : list2) {
                                                            int i19 = i18 + 1;
                                                            if (i18 < 0) {
                                                                CollectionsKt.throwIndexOverflow();
                                                            }
                                                            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) obj, i18 * i17, 0, 0.0f, 4, null);
                                                            placementScope = layout;
                                                            i18 = i19;
                                                        }
                                                        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                        long j8 = j7;
                                                        int i20 = iMax;
                                                        Iterator<T> it2 = listSubcompose2.iterator();
                                                        while (it2.hasNext()) {
                                                            Placeable placeableMo4993measureBRTryo0 = ((Measurable) it2.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, 0, 0, 0, 0, 11, null));
                                                            Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i20 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                            j8 = j8;
                                                        }
                                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                        final List<TabPosition> list3 = arrayList4;
                                                        final int i21 = i16;
                                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(-976887453, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
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

                                                            public final void invoke(Composer composer4, int i22) {
                                                                ComposerKt.sourceInformation(composer4, "C179@8306L23:TabRow.kt#uh7d8r");
                                                                if ((i22 & 11) == 2 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-976887453, i22, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                                }
                                                                function36.invoke(list3, composer4, Integer.valueOf(((i21 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }));
                                                        int i22 = iM6070getMaxWidthimpl;
                                                        int i23 = iMax;
                                                        Iterator<T> it3 = listSubcompose3.iterator();
                                                        while (it3.hasNext()) {
                                                            Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it3.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                        }
                                                    }
                                                }, 4, null);
                                            }
                                        };
                                        composer3.updateRememberedValue(objRememberedValue);
                                    }
                                    composer3.endReplaceableGroup();
                                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer3, 6, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }), composer2, 12582912 | (i7 & 896) | (i7 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function33 = function32;
                            function23 = function2M2254getLambda1$material3_release;
                            modifier3 = modifier2;
                            j5 = j4;
                            j6 = j3;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                function22 = function2;
                if ((i3 & 64) != 0) {
                }
                i4 |= i8;
                if ((i4 & 2995931) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function3ComposableLambda = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function22 = function2;
            if ((i3 & 64) != 0) {
            }
            i4 |= i8;
            if ((i4 & 2995931) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function3ComposableLambda = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function22 = function2;
        if ((i3 & 64) != 0) {
        }
        i4 |= i8;
        if ((i4 & 2995931) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011e  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2489ScrollableTabRowsKfQg0A(final int i, Modifier modifier, long j, long j2, float f, Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> tabs, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long containerColor;
        long contentColor;
        int i5;
        float f2;
        int i6;
        int i7;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M2255getLambda2$material3_release;
        Composer composer2;
        final float f3;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(ScrollableTabRow)P(6,5,0:c#ui.graphics.Color,1:c#ui.graphics.Color,3:c#ui.unit.Dp,4)224@10825L14,225@10882L12,237@11285L3200:TabRow.kt#uh7d8r");
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    containerColor = j;
                    int i9 = composerStartRestartGroup.changed(containerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    containerColor = j;
                }
                i4 |= i9;
            } else {
                containerColor = j;
            }
            if ((i2 & 7168) != 0) {
                if ((i3 & 8) == 0) {
                    contentColor = j2;
                    int i10 = composerStartRestartGroup.changed(contentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    contentColor = j2;
                }
                i4 |= i10;
            } else {
                contentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((57344 & i2) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i2 & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(function3) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(function2) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else if ((29360128 & i2) == 0) {
                    i4 |= composerStartRestartGroup.changed(tabs) ? 8388608 : 4194304;
                }
                if ((23967451 & i4) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            containerColor = TabRowDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            contentColor = TabRowDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            f2 = ScrollableTabRowPadding;
                        }
                        composableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                invoke((List<TabPosition>) list, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(List<TabPosition> tabPositions, Composer composer3, int i11) {
                                Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
                                ComposerKt.sourceInformation(composer3, "C228@11067L92:TabRow.kt#uh7d8r");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-913748678, i11, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults.INSTANCE.m2486Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, tabPositions.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }) : function3;
                        if (i7 == 0) {
                            function2M2255getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m2255getLambda2$material3_release();
                        }
                        Modifier modifier4 = modifier2;
                        long j5 = containerColor;
                        long j6 = contentColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-497821003, i4, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                        }
                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = composableLambda;
                        final int i11 = i4;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function2M2255getLambda2$material3_release;
                        final float f4 = f2;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m2457SurfaceT9BRK9s(modifier4, null, j5, j6, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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
                                ComposerKt.sourceInformation(composer3, "C242@11425L21,243@11476L24,244@11533L185,250@11727L2752:TabRow.kt#uh7d8r");
                                if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(286469328, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                                    }
                                    ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                    composer3.startReplaceableGroup(773894976);
                                    ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                                    composer3.startReplaceableGroup(-492369756);
                                    ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                    Object objRememberedValue = composer3.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                        composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                        objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                    }
                                    composer3.endReplaceableGroup();
                                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                    composer3.endReplaceableGroup();
                                    composer3.startReplaceableGroup(511388516);
                                    ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                    boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                    Object objRememberedValue2 = composer3.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                        composer3.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer3.endReplaceableGroup();
                                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                    Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                    final float f5 = f4;
                                    final Function2<Composer, Integer, Unit> function24 = tabs;
                                    final Function2<Composer, Integer, Unit> function25 = function23;
                                    final int i13 = i;
                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                    final int i14 = i11;
                                    SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                            return m2491invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                        }

                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                        public final MeasureResult m2491invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                            Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int i15 = SubcomposeLayout.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                            final int i16 = SubcomposeLayout.mo706roundToPx0680j_4(f5);
                                            List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                            Iterator<T> it = listSubcompose.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(iMax, ((Measurable) it.next()).maxIntrinsicHeight(Integer.MAX_VALUE));
                                            }
                                            long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i15, 0, iMax, 0, 10, null);
                                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
                                            Iterator<T> it2 = listSubcompose.iterator();
                                            while (it2.hasNext()) {
                                                arrayList.add(((Measurable) it2.next()).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                            }
                                            final ArrayList arrayList2 = arrayList;
                                            Iterator it3 = arrayList2.iterator();
                                            final int width = i16 * 2;
                                            while (it3.hasNext()) {
                                                width += ((Placeable) it3.next()).getWidth();
                                            }
                                            final Function2<Composer, Integer, Unit> function26 = function25;
                                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                            final int i17 = i13;
                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function35 = function34;
                                            final int i18 = i14;
                                            final int i19 = iMax;
                                            return MeasureScope.layout$default(SubcomposeLayout, width, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
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
                                                public final void invoke2(Placeable.PlacementScope layout) {
                                                    Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                    final ArrayList arrayList3 = new ArrayList();
                                                    int i20 = i16;
                                                    List<Placeable> list = arrayList2;
                                                    SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                    int width2 = i20;
                                                    for (Placeable placeable : list) {
                                                        Placeable.PlacementScope.placeRelative$default(layout, placeable, width2, 0, 0.0f, 4, null);
                                                        arrayList3.add(new TabPosition(subcomposeMeasureScope.mo709toDpu2uoSUM(width2), subcomposeMeasureScope.mo709toDpu2uoSUM(placeable.getWidth()), null));
                                                        width2 += placeable.getWidth();
                                                    }
                                                    List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                    long j8 = j7;
                                                    int i21 = width;
                                                    int i22 = i19;
                                                    Iterator<T> it4 = listSubcompose2.iterator();
                                                    while (it4.hasNext()) {
                                                        long j9 = j8;
                                                        Placeable placeableMo4993measureBRTryo0 = ((Measurable) it4.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, i21, i21, 0, 0, 8, null));
                                                        Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i22 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                        j8 = j9;
                                                        i21 = i21;
                                                    }
                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function36 = function35;
                                                    final int i23 = i18;
                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(963343607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
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

                                                        public final void invoke(Composer composer4, int i24) {
                                                            ComposerKt.sourceInformation(composer4, "C302@14030L23:TabRow.kt#uh7d8r");
                                                            if ((i24 & 11) == 2 && composer4.getSkipping()) {
                                                                composer4.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(963343607, i24, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                            }
                                                            function36.invoke(arrayList3, composer4, Integer.valueOf(((i23 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }));
                                                    int i24 = width;
                                                    int i25 = i19;
                                                    Iterator<T> it5 = listSubcompose3.iterator();
                                                    while (it5.hasNext()) {
                                                        Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it5.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i24, i25)), 0, 0, 0.0f, 4, null);
                                                    }
                                                    scrollableTabData2.onLaidOut(SubcomposeLayout, i16, arrayList3, i17);
                                                }
                                            }, 4, null);
                                        }
                                    }, composer3, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }), composer2, ((i4 >> 3) & 14) | 12582912 | (i4 & 896) | (i4 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f3 = f4;
                        function32 = function33;
                        function22 = function23;
                        modifier3 = modifier4;
                        j3 = j5;
                        j4 = j6;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        composableLambda = function3;
                    }
                    function2M2255getLambda2$material3_release = function2;
                    Modifier modifier42 = modifier2;
                    long j52 = containerColor;
                    long j62 = contentColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function332 = composableLambda;
                    final int i112 = i4;
                    final Function2<? super Composer, ? super Integer, Unit> function232 = function2M2255getLambda2$material3_release;
                    final float f42 = f2;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier42, null, j52, j62, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.sourceInformation(composer3, "C242@11425L21,243@11476L24,244@11533L185,250@11727L2752:TabRow.kt#uh7d8r");
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(286469328, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                                }
                                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                composer3.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue = composer3.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer3.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                final float f5 = f42;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function232;
                                final int i13 = i;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function332;
                                final int i14 = i112;
                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m2491invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m2491invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int i15 = SubcomposeLayout.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                        final int i16 = SubcomposeLayout.mo706roundToPx0680j_4(f5);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                        Iterator<T> it = listSubcompose.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(iMax, ((Measurable) it.next()).maxIntrinsicHeight(Integer.MAX_VALUE));
                                        }
                                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i15, 0, iMax, 0, 10, null);
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
                                        Iterator<T> it2 = listSubcompose.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((Measurable) it2.next()).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                        }
                                        final List<? extends Placeable> arrayList2 = arrayList;
                                        Iterator it3 = arrayList2.iterator();
                                        final int width = i16 * 2;
                                        while (it3.hasNext()) {
                                            width += ((Placeable) it3.next()).getWidth();
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i17 = i13;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                        final int i18 = i14;
                                        final int i19 = iMax;
                                        return MeasureScope.layout$default(SubcomposeLayout, width, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
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
                                            public final void invoke2(Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                int i20 = i16;
                                                List<Placeable> list = arrayList2;
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int width2 = i20;
                                                for (Placeable placeable : list) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable, width2, 0, 0.0f, 4, null);
                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope.mo709toDpu2uoSUM(width2), subcomposeMeasureScope.mo709toDpu2uoSUM(placeable.getWidth()), null));
                                                    width2 += placeable.getWidth();
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                long j8 = j7;
                                                int i21 = width;
                                                int i22 = i19;
                                                Iterator<T> it4 = listSubcompose2.iterator();
                                                while (it4.hasNext()) {
                                                    long j9 = j8;
                                                    Placeable placeableMo4993measureBRTryo0 = ((Measurable) it4.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, i21, i21, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i22 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    j8 = j9;
                                                    i21 = i21;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                final int i23 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(963343607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
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

                                                    public final void invoke(Composer composer4, int i24) {
                                                        ComposerKt.sourceInformation(composer4, "C302@14030L23:TabRow.kt#uh7d8r");
                                                        if ((i24 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(963343607, i24, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                        }
                                                        function36.invoke(arrayList3, composer4, Integer.valueOf(((i23 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i24 = width;
                                                int i25 = i19;
                                                Iterator<T> it5 = listSubcompose3.iterator();
                                                while (it5.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it5.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i24, i25)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, i16, arrayList3, i17);
                                            }
                                        }, 4, null);
                                    }
                                }, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i4 >> 3) & 14) | 12582912 | (i4 & 896) | (i4 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f3 = f42;
                    function32 = function332;
                    function22 = function232;
                    modifier3 = modifier42;
                    j3 = j52;
                    j4 = j62;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    j3 = containerColor;
                    j4 = contentColor;
                    f3 = f2;
                    function32 = function3;
                    function22 = function2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$3
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
                        TabRowKt.m2489ScrollableTabRowsKfQg0A(i, modifier3, j3, j4, f3, function32, function22, tabs, composer3, i2 | 1, i3);
                    }
                });
                return;
            }
            i4 |= 24576;
            f2 = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((23967451 & i4) != 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i8 != 0) {
                    }
                    if ((i3 & 4) != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                        function2M2255getLambda2$material3_release = function2;
                    }
                    Modifier modifier422 = modifier2;
                    long j522 = containerColor;
                    long j622 = contentColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3322 = composableLambda;
                    final int i1122 = i4;
                    final Function2<? super Composer, ? super Integer, Unit> function2322 = function2M2255getLambda2$material3_release;
                    final float f422 = f2;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m2457SurfaceT9BRK9s(modifier422, null, j522, j622, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286469328, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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
                            ComposerKt.sourceInformation(composer3, "C242@11425L21,243@11476L24,244@11533L185,250@11727L2752:TabRow.kt#uh7d8r");
                            if ((i12 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(286469328, i12, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                                }
                                ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer3, 0, 1);
                                composer3.startReplaceableGroup(773894976);
                                ComposerKt.sourceInformation(composer3, "C(rememberCoroutineScope)476@19869L144:Effects.kt#9igjgp");
                                composer3.startReplaceableGroup(-492369756);
                                ComposerKt.sourceInformation(composer3, "C(remember):Composables.kt#9igjgp");
                                Object objRememberedValue = composer3.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3));
                                    composer3.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composer3.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                composer3.endReplaceableGroup();
                                composer3.startReplaceableGroup(511388516);
                                ComposerKt.sourceInformation(composer3, "C(remember)P(1,2):Composables.kt#9igjgp");
                                boolean zChanged = composer3.changed(scrollStateRememberScrollState) | composer3.changed(coroutineScope);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, coroutineScope);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceableGroup();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
                                final float f5 = f422;
                                final Function2<? super Composer, ? super Integer, Unit> function24 = tabs;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function2322;
                                final int i13 = i;
                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function3322;
                                final int i14 = i1122;
                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                        return m2491invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                    }

                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                    public final MeasureResult m2491invoke0kLqBqw(final SubcomposeMeasureScope SubcomposeLayout, final long j7) {
                                        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int i15 = SubcomposeLayout.mo706roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                        final int i16 = SubcomposeLayout.mo706roundToPx0680j_4(f5);
                                        List<Measurable> listSubcompose = SubcomposeLayout.subcompose(TabSlots.Tabs, function24);
                                        Iterator<T> it = listSubcompose.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(iMax, ((Measurable) it.next()).maxIntrinsicHeight(Integer.MAX_VALUE));
                                        }
                                        long jM6061copyZbe2FdA$default = Constraints.m6061copyZbe2FdA$default(j7, i15, 0, iMax, 0, 10, null);
                                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSubcompose, 10));
                                        Iterator<T> it2 = listSubcompose.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((Measurable) it2.next()).mo4993measureBRTryo0(jM6061copyZbe2FdA$default));
                                        }
                                        final List<? extends Placeable> arrayList2 = arrayList;
                                        Iterator it3 = arrayList2.iterator();
                                        final int width = i16 * 2;
                                        while (it3.hasNext()) {
                                            width += ((Placeable) it3.next()).getWidth();
                                        }
                                        final Function2<? super Composer, ? super Integer, Unit> function26 = function25;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i17 = i13;
                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function35 = function34;
                                        final int i18 = i14;
                                        final int i19 = iMax;
                                        return MeasureScope.layout$default(SubcomposeLayout, width, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
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
                                            public final void invoke2(Placeable.PlacementScope layout) {
                                                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                int i20 = i16;
                                                List<Placeable> list = arrayList2;
                                                SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                                int width2 = i20;
                                                for (Placeable placeable : list) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeable, width2, 0, 0.0f, 4, null);
                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope.mo709toDpu2uoSUM(width2), subcomposeMeasureScope.mo709toDpu2uoSUM(placeable.getWidth()), null));
                                                    width2 += placeable.getWidth();
                                                }
                                                List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose(TabSlots.Divider, function26);
                                                long j8 = j7;
                                                int i21 = width;
                                                int i22 = i19;
                                                Iterator<T> it4 = listSubcompose2.iterator();
                                                while (it4.hasNext()) {
                                                    long j9 = j8;
                                                    Placeable placeableMo4993measureBRTryo0 = ((Measurable) it4.next()).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j8, i21, i21, 0, 0, 8, null));
                                                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo4993measureBRTryo0, 0, i22 - placeableMo4993measureBRTryo0.getHeight(), 0.0f, 4, null);
                                                    j8 = j9;
                                                    i21 = i21;
                                                }
                                                SubcomposeMeasureScope subcomposeMeasureScope2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function36 = function35;
                                                final int i23 = i18;
                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(963343607, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
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

                                                    public final void invoke(Composer composer4, int i24) {
                                                        ComposerKt.sourceInformation(composer4, "C302@14030L23:TabRow.kt#uh7d8r");
                                                        if ((i24 & 11) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(963343607, i24, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                        }
                                                        function36.invoke(arrayList3, composer4, Integer.valueOf(((i23 >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 8));
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }));
                                                int i24 = width;
                                                int i25 = i19;
                                                Iterator<T> it5 = listSubcompose3.iterator();
                                                while (it5.hasNext()) {
                                                    Placeable.PlacementScope.placeRelative$default(layout, ((Measurable) it5.next()).mo4993measureBRTryo0(Constraints.INSTANCE.m6080fixedJhjzzOo(i24, i25)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.onLaidOut(SubcomposeLayout, i16, arrayList3, i17);
                                            }
                                        }, 4, null);
                                    }
                                }, composer3, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ((i4 >> 3) & 14) | 12582912 | (i4 & 896) | (i4 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f3 = f422;
                    function32 = function3322;
                    function22 = function2322;
                    modifier3 = modifier422;
                    j3 = j522;
                    j4 = j622;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 896) != 0) {
        }
        if ((i2 & 7168) != 0) {
        }
        i5 = i3 & 16;
        if (i5 != 0) {
        }
        f2 = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((23967451 & i4) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
