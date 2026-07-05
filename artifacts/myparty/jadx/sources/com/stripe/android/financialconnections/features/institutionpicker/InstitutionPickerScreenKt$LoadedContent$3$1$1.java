package com.stripe.android.financialconnections.features.institutionpicker;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstitutionPickerScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class InstitutionPickerScreenKt$LoadedContent$3$1$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $input$delegate;
    final /* synthetic */ Function1<String, Unit> $onQueryChanged;
    final /* synthetic */ FocusRequester $searchInputFocusRequester;

    /* JADX WARN: Multi-variable type inference failed */
    InstitutionPickerScreenKt$LoadedContent$3$1$1(FocusRequester focusRequester, MutableState<String> mutableState, Function1<? super String, Unit> function1) {
        this.$searchInputFocusRequester = focusRequester;
        this.$input$delegate = mutableState;
        this.$onQueryChanged = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope stickyHeader, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1698365372, i, -1, "com.stripe.android.financialconnections.features.institutionpicker.LoadedContent.<anonymous>.<anonymous>.<anonymous> (InstitutionPickerScreen.kt:181)");
            }
            FocusRequester focusRequester = this.$searchInputFocusRequester;
            String strLoadedContent$lambda$11 = InstitutionPickerScreenKt.LoadedContent$lambda$11(this.$input$delegate);
            composer.startReplaceGroup(556101315);
            boolean zChanged = composer.changed(this.$input$delegate) | composer.changed(this.$onQueryChanged);
            final Function1<String, Unit> function1 = this.$onQueryChanged;
            final MutableState<String> mutableState = this.$input$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.financialconnections.features.institutionpicker.InstitutionPickerScreenKt$LoadedContent$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstitutionPickerScreenKt$LoadedContent$3$1$1.invoke$lambda$1$lambda$0(function1, mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InstitutionPickerScreenKt.SearchRow(null, focusRequester, strLoadedContent$lambda$11, (Function1) objRememberedValue, composer, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        function1.invoke(InstitutionPickerScreenKt.LoadedContent$lambda$11(mutableState));
        return Unit.INSTANCE;
    }
}
