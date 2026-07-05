package com.stripe.android.uicore.elements;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: DropdownFieldUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DropdownFieldUIKt$DropDown$1$6 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ DropdownFieldController $controller;
    final /* synthetic */ long $currentTextColor;
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ List<String> $items;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ State<Integer> $selectedIndex$delegate;

    DropdownFieldUIKt$DropDown$1$6(List<String> list, long j, DropdownFieldController dropdownFieldController, State<Integer> state, MutableState<Boolean> mutableState, ScrollState scrollState) {
        this.$items = list;
        this.$currentTextColor = j;
        this.$controller = dropdownFieldController;
        this.$selectedIndex$delegate = state;
        this.$expanded$delegate = mutableState;
        this.$scrollState = scrollState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 17) != 16 || !composer2.getSkipping()) {
            int i2 = -1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362403838, i, -1, "com.stripe.android.uicore.elements.DropDown.<anonymous>.<anonymous> (DropdownFieldUI.kt:171)");
            }
            final Ref.IntRef intRef = new Ref.IntRef();
            List<String> list = this.$items;
            long j = this.$currentTextColor;
            final DropdownFieldController dropdownFieldController = this.$controller;
            State<Integer> state = this.$selectedIndex$delegate;
            final MutableState<Boolean> mutableState = this.$expanded$delegate;
            ScrollState scrollState = this.$scrollState;
            int i3 = 0;
            final int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Integer numDropDown$lambda$3 = DropdownFieldUIKt.DropDown$lambda$3(state);
                booleanRef.element = i4 >= (numDropDown$lambda$3 != null ? numDropDown$lambda$3.intValue() : i2) - 1 ? 1 : i3;
                composer2.startReplaceGroup(646400103);
                Integer numDropDown$lambda$32 = DropdownFieldUIKt.DropDown$lambda$3(state);
                if (numDropDown$lambda$32 != null && i4 == numDropDown$lambda$32.intValue()) {
                    EffectsKt.LaunchedEffect(Boolean.valueOf(DropdownFieldUIKt.DropDown$lambda$5(mutableState)), new DropdownFieldUIKt$DropDown$1$6$1$1(scrollState, intRef, null), composer2, i3);
                }
                composer2.endReplaceGroup();
                Integer numDropDown$lambda$33 = DropdownFieldUIKt.DropDown$lambda$3(state);
                int i6 = (numDropDown$lambda$33 != null && i4 == numDropDown$lambda$33.intValue()) ? 1 : i3;
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(Modifier.INSTANCE, new Function1() { // from class: com.stripe.android.uicore.elements.DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DropdownFieldUIKt$DropDown$1$6.invoke$lambda$3$lambda$0(booleanRef, intRef, (LayoutCoordinates) obj2);
                    }
                });
                composer2.startReplaceGroup(255114965);
                boolean zChangedInstance = composer2.changedInstance(dropdownFieldController) | composer2.changed(i4);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.elements.DropdownFieldUIKt$DropDown$1$6$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DropdownFieldUIKt$DropDown$1$6.invoke$lambda$3$lambda$2$lambda$1(dropdownFieldController, i4, mutableState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                DropdownFieldUIKt.m8793DropdownMenuItemT042LqI(str, i6, j, modifierOnGloballyPositioned, (Function0) objRememberedValue, composer2, 0, 0);
                composer2 = composer;
                i3 = i3;
                i4 = i5;
                i2 = -1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2$lambda$1(DropdownFieldController dropdownFieldController, int i, MutableState mutableState) {
        DropdownFieldUIKt.DropDown$lambda$6(mutableState, false);
        dropdownFieldController.onValueChange(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$0(Ref.BooleanRef booleanRef, Ref.IntRef intRef, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        if (!booleanRef.element) {
            intRef.element += IntSize.m6286getHeightimpl(layoutCoordinates.mo5001getSizeYbymL2g());
            booleanRef.element = true;
        }
        return Unit.INSTANCE;
    }
}
