package com.stripe.android.uicore.elements;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CenteredTextLayout.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CenteredTextLayoutKt$CenteredTextLayout$1$1 implements MultiContentMeasurePolicy {
    public static final CenteredTextLayoutKt$CenteredTextLayout$1$1 INSTANCE = new CenteredTextLayoutKt$CenteredTextLayout$1$1();

    CenteredTextLayoutKt$CenteredTextLayout$1$1() {
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo968measure3p2s80s(MeasureScope Layout, List<? extends List<? extends Measurable>> list, long j) {
        int iMax;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(list, "<destruct>");
        List<? extends Measurable> list2 = list.get(0);
        List<? extends Measurable> list3 = list.get(1);
        if (list2.size() != 1) {
            throw new IllegalArgumentException("startContentMeasurables should only emit one composable".toString());
        }
        if (list3.size() != 1) {
            throw new IllegalArgumentException("textContentMeasurables should only emit one composable".toString());
        }
        final Placeable placeableMo4993measureBRTryo0 = ((Measurable) CollectionsKt.first((List) list2)).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j, 0, Integer.MAX_VALUE, 0, 0, 12, null));
        int iM6070getMaxWidthimpl = Constraints.m6070getMaxWidthimpl(j) - placeableMo4993measureBRTryo0.getWidth();
        final Placeable placeableMo4993measureBRTryo02 = ((Measurable) CollectionsKt.first((List) list3)).mo4993measureBRTryo0(Constraints.m6061copyZbe2FdA$default(j, iM6070getMaxWidthimpl, iM6070getMaxWidthimpl, 0, 0, 12, null));
        if (placeableMo4993measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()) == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("textContentPlaceable should have a first baseline".toString());
        }
        final int i = (int) (placeableMo4993measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()) * 1.2d);
        final int iAbs = Math.abs(placeableMo4993measureBRTryo0.getHeight() - i) / 2;
        int width = placeableMo4993measureBRTryo0.getWidth() + placeableMo4993measureBRTryo02.getWidth();
        if (i > placeableMo4993measureBRTryo0.getHeight()) {
            iMax = Math.max(placeableMo4993measureBRTryo0.getHeight() + iAbs, placeableMo4993measureBRTryo02.getHeight());
        } else {
            iMax = Math.max(placeableMo4993measureBRTryo0.getHeight(), placeableMo4993measureBRTryo02.getHeight() + iAbs);
        }
        return MeasureScope.layout$default(Layout, width, iMax, null, new Function1() { // from class: com.stripe.android.uicore.elements.CenteredTextLayoutKt$CenteredTextLayout$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CenteredTextLayoutKt$CenteredTextLayout$1$1.measure_3p2s80s$lambda$3(i, placeableMo4993measureBRTryo0, iAbs, placeableMo4993measureBRTryo02, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit measure_3p2s80s$lambda$3(int i, Placeable placeable, int i2, Placeable placeable2, Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (i > placeable.getHeight()) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, i2, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(layout, placeable2, placeable.getWidth(), 0, 0.0f, 4, null);
        } else {
            Placeable.PlacementScope.place$default(layout, placeable, 0, 0, 0.0f, 4, null);
            Placeable.PlacementScope.place$default(layout, placeable2, placeable.getWidth(), i2, 0.0f, 4, null);
        }
        return Unit.INSTANCE;
    }
}
