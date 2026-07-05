package com.stripe.android.paymentsheet.verticalmode;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutInteractor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodVerticalLayoutUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaymentMethodVerticalLayoutUIKt$PaymentMethodVerticalLayoutUI$5$2 implements Function3<RowScope, Composer, Integer, Unit> {
    final /* synthetic */ DisplayableSavedPaymentMethod $displayedSavedPaymentMethod;
    final /* synthetic */ Function1<DisplayableSavedPaymentMethod, Unit> $onManageOneSavedPaymentMethod;
    final /* synthetic */ Function0<Unit> $onViewMorePaymentMethods;
    final /* synthetic */ PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction $savedPaymentMethodAction;

    /* JADX WARN: Multi-variable type inference failed */
    PaymentMethodVerticalLayoutUIKt$PaymentMethodVerticalLayoutUI$5$2(PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction, Function0<Unit> function0, Function1<? super DisplayableSavedPaymentMethod, Unit> function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        this.$savedPaymentMethodAction = savedPaymentMethodAction;
        this.$onViewMorePaymentMethods = function0;
        this.$onManageOneSavedPaymentMethod = function1;
        this.$displayedSavedPaymentMethod = displayableSavedPaymentMethod;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope SavedPaymentMethodRowButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(SavedPaymentMethodRowButton, "$this$SavedPaymentMethodRowButton");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1223590933, i, -1, "com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUI.<anonymous>.<anonymous> (PaymentMethodVerticalLayoutUI.kt:123)");
            }
            PaymentMethodVerticalLayoutInteractor.SavedPaymentMethodAction savedPaymentMethodAction = this.$savedPaymentMethodAction;
            Function0<Unit> function0 = this.$onViewMorePaymentMethods;
            composer.startReplaceGroup(-2113831228);
            boolean zChanged = composer.changed(this.$onManageOneSavedPaymentMethod) | composer.changedInstance(this.$displayedSavedPaymentMethod);
            final Function1<DisplayableSavedPaymentMethod, Unit> function1 = this.$onManageOneSavedPaymentMethod;
            final DisplayableSavedPaymentMethod displayableSavedPaymentMethod = this.$displayedSavedPaymentMethod;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.PaymentMethodVerticalLayoutUIKt$PaymentMethodVerticalLayoutUI$5$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentMethodVerticalLayoutUIKt$PaymentMethodVerticalLayoutUI$5$2.invoke$lambda$1$lambda$0(function1, displayableSavedPaymentMethod);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            PaymentMethodVerticalLayoutUIKt.SavedPaymentMethodTrailingContent(false, savedPaymentMethodAction, function0, (Function0) objRememberedValue, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, DisplayableSavedPaymentMethod displayableSavedPaymentMethod) {
        function1.invoke(displayableSavedPaymentMethod);
        return Unit.INSTANCE;
    }
}
