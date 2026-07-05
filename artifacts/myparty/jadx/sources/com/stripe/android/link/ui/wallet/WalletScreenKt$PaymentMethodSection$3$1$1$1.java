package com.stripe.android.link.ui.wallet;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import com.stripe.android.model.ConsumerPaymentDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WalletScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class WalletScreenKt$PaymentMethodSection$3$1$1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ Function1<Continuation<? super Unit>, Object> $hideBottomSheetContent;
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $it;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onRemoveClicked;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onSetDefaultClicked;
    final /* synthetic */ Function1<ConsumerPaymentDetails.PaymentDetails, Unit> $onUpdateClicked;

    /* JADX WARN: Multi-variable type inference failed */
    WalletScreenKt$PaymentMethodSection$3$1$1$1(ConsumerPaymentDetails.PaymentDetails paymentDetails, CoroutineScope coroutineScope, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function12, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function13, Function1<? super ConsumerPaymentDetails.PaymentDetails, Unit> function14) {
        this.$it = paymentDetails;
        this.$coroutineScope = coroutineScope;
        this.$hideBottomSheetContent = function1;
        this.$onSetDefaultClicked = function12;
        this.$onRemoveClicked = function13;
        this.$onUpdateClicked = function14;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope showBottomSheetContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(showBottomSheetContent, "$this$showBottomSheetContent");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(900402308, i, -1, "com.stripe.android.link.ui.wallet.PaymentMethodSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:371)");
            }
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, WalletScreenKt.WALLET_SCREEN_MENU_SHEET_TAG);
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.$it;
            composer.startReplaceGroup(1401388104);
            boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent) | composer.changed(this.$onSetDefaultClicked) | composer.changedInstance(this.$it);
            final CoroutineScope coroutineScope = this.$coroutineScope;
            final Function1<Continuation<? super Unit>, Object> function1 = this.$hideBottomSheetContent;
            final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function12 = this.$onSetDefaultClicked;
            final ConsumerPaymentDetails.PaymentDetails paymentDetails2 = this.$it;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletScreenKt$PaymentMethodSection$3$1$1$1.invoke$lambda$1$lambda$0(coroutineScope, function1, function12, paymentDetails2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1401397316);
            boolean zChangedInstance2 = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent) | composer.changed(this.$onRemoveClicked) | composer.changedInstance(this.$it);
            final CoroutineScope coroutineScope2 = this.$coroutineScope;
            final Function1<Continuation<? super Unit>, Object> function13 = this.$hideBottomSheetContent;
            final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function14 = this.$onRemoveClicked;
            final ConsumerPaymentDetails.PaymentDetails paymentDetails3 = this.$it;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletScreenKt$PaymentMethodSection$3$1$1$1.invoke$lambda$3$lambda$2(coroutineScope2, function13, function14, paymentDetails3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function02 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1401406404);
            boolean zChangedInstance3 = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$hideBottomSheetContent) | composer.changed(this.$onUpdateClicked) | composer.changedInstance(this.$it);
            final CoroutineScope coroutineScope3 = this.$coroutineScope;
            final Function1<Continuation<? super Unit>, Object> function15 = this.$hideBottomSheetContent;
            final Function1<ConsumerPaymentDetails.PaymentDetails, Unit> function16 = this.$onUpdateClicked;
            final ConsumerPaymentDetails.PaymentDetails paymentDetails4 = this.$it;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.stripe.android.link.ui.wallet.WalletScreenKt$PaymentMethodSection$3$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WalletScreenKt$PaymentMethodSection$3$1$1$1.invoke$lambda$5$lambda$4(coroutineScope3, function15, function16, paymentDetails4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            WalletPaymentMethodMenuKt.WalletPaymentMethodMenu(modifierTestTag, paymentDetails, function0, function02, (Function0) objRememberedValue3, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, Function1 function1, Function1 function12, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WalletScreenKt$PaymentMethodSection$3$1$1$1$1$1$1(function1, function12, paymentDetails, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(CoroutineScope coroutineScope, Function1 function1, Function1 function12, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WalletScreenKt$PaymentMethodSection$3$1$1$1$2$1$1(function1, function12, paymentDetails, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(CoroutineScope coroutineScope, Function1 function1, Function1 function12, ConsumerPaymentDetails.PaymentDetails paymentDetails) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WalletScreenKt$PaymentMethodSection$3$1$1$1$3$1$1(function1, function12, paymentDetails, null), 3, null);
        return Unit.INSTANCE;
    }
}
