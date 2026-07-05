package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleChoiceDropdownUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SingleChoiceDropdownUIKt$SingleChoiceDropdown$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ List<TDropdownChoice> $choices;

    /* JADX INFO: Incorrect field signature: TTDropdownChoice; */
    final /* synthetic */ SingleChoiceDropdownItem $currentChoice;
    final /* synthetic */ long $headerTextColor;
    final /* synthetic */ Function1<TDropdownChoice, Unit> $onChoiceSelected;
    final /* synthetic */ long $optionTextColor;
    final /* synthetic */ ResolvableString $title;

    /* JADX WARN: Incorrect types in method signature: (Lcom/stripe/android/core/strings/ResolvableString;JLjava/util/List<+TTDropdownChoice;>;TTDropdownChoice;JLkotlin/jvm/functions/Function1<-TTDropdownChoice;Lkotlin/Unit;>;)V */
    SingleChoiceDropdownUIKt$SingleChoiceDropdown$1(ResolvableString resolvableString, long j, List list, SingleChoiceDropdownItem singleChoiceDropdownItem, long j2, Function1 function1) {
        this.$title = resolvableString;
        this.$headerTextColor = j;
        this.$choices = list;
        this.$currentChoice = singleChoiceDropdownItem;
        this.$optionTextColor = j2;
        this.$onChoiceSelected = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2072682231, i, -1, "com.stripe.android.uicore.elements.SingleChoiceDropdown.<anonymous> (SingleChoiceDropdownUI.kt:49)");
            }
            TextKt.m2076Text4IGK_g(ResolvableStringComposeUtilsKt.resolve(this.$title, composer, 0), PaddingKt.m1021paddingVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(13), Dp.m6117constructorimpl(5)), this.$headerTextColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131064);
            Composer composer2 = composer;
            Iterable<SingleChoiceDropdownItem> iterable = this.$choices;
            SingleChoiceDropdownItem singleChoiceDropdownItem = this.$currentChoice;
            long j = this.$optionTextColor;
            final Function1<TDropdownChoice, Unit> function1 = this.$onChoiceSelected;
            for (final SingleChoiceDropdownItem singleChoiceDropdownItem2 : iterable) {
                String strResolve = ResolvableStringComposeUtilsKt.resolve(singleChoiceDropdownItem2.getLabel(), composer2, 0);
                Integer icon = singleChoiceDropdownItem2.getIcon();
                boolean zAreEqual = Intrinsics.areEqual(singleChoiceDropdownItem2, singleChoiceDropdownItem);
                boolean enabled = singleChoiceDropdownItem2.getEnabled();
                composer2.startReplaceGroup(-2060552121);
                boolean zChanged = composer2.changed(function1) | composer2.changedInstance(singleChoiceDropdownItem2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.uicore.elements.SingleChoiceDropdownUIKt$SingleChoiceDropdown$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SingleChoiceDropdownUIKt$SingleChoiceDropdown$1.invoke$lambda$2$lambda$1$lambda$0(function1, singleChoiceDropdownItem2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                SingleChoiceDropdownUIKt.m8834ChoicefWhpE4E(strResolve, icon, zAreEqual, j, enabled, (Function0) objRememberedValue, composer2, 0, 0);
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, SingleChoiceDropdownItem singleChoiceDropdownItem) {
        function1.invoke(singleChoiceDropdownItem);
        return Unit.INSTANCE;
    }
}
