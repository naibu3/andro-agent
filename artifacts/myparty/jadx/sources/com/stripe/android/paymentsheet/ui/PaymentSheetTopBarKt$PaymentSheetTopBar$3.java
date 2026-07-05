package com.stripe.android.paymentsheet.ui;

import androidx.compose.material.IconButtonKt;
import androidx.compose.material.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import com.stripe.android.paymentsheet.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: PaymentSheetTopBar.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class PaymentSheetTopBarKt$PaymentSheetTopBar$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $canNavigateBack;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    final /* synthetic */ Function0<Unit> $onNavigationIconPressed;
    final /* synthetic */ long $tintColor;

    PaymentSheetTopBarKt$PaymentSheetTopBar$3(SoftwareKeyboardController softwareKeyboardController, Function0<Unit> function0, boolean z, boolean z2, long j) {
        this.$keyboardController = softwareKeyboardController;
        this.$onNavigationIconPressed = function0;
        this.$isEnabled = z;
        this.$canNavigateBack = z2;
        this.$tintColor = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1984190518, i, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous> (PaymentSheetTopBar.kt:79)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, PaymentSheetTopBarKt.SHEET_NAVIGATION_BUTTON_TAG);
            composer.startReplaceGroup(-1693973474);
            boolean zChanged = composer.changed(this.$keyboardController) | composer.changed(this.$onNavigationIconPressed);
            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            final Function0<Unit> function0 = this.$onNavigationIconPressed;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentSheetTopBarKt$PaymentSheetTopBar$3.invoke$lambda$1$lambda$0(softwareKeyboardController, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            boolean z = this.$isEnabled;
            final boolean z2 = this.$canNavigateBack;
            final long j = this.$tintColor;
            IconButtonKt.IconButton(function02, modifierTestTag, z, null, ComposableLambdaKt.rememberComposableLambda(951598290, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt$PaymentSheetTopBar$3.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    int i3;
                    int i4;
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(951598290, i2, -1, "com.stripe.android.paymentsheet.ui.PaymentSheetTopBar.<anonymous>.<anonymous> (PaymentSheetTopBar.kt:87)");
                        }
                        if (z2) {
                            i3 = R.drawable.stripe_ic_paymentsheet_back;
                        } else {
                            i3 = R.drawable.stripe_ic_paymentsheet_close;
                        }
                        if (z2) {
                            i4 = com.stripe.android.ui.core.R.string.stripe_back;
                        } else {
                            i4 = R.string.stripe_paymentsheet_close;
                        }
                        IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(i3, composer2, 0), StringResources_androidKt.stringResource(i4, composer2, 0), (Modifier) null, j, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composer, 54), composer, 24624, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SoftwareKeyboardController softwareKeyboardController, Function0 function0) {
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }
}
