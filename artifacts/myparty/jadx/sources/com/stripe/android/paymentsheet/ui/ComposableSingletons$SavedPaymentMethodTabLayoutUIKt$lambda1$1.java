package com.stripe.android.paymentsheet.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedPaymentMethodTabLayoutUI.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1 INSTANCE = new ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1();

    ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-641270447, i, -1, "com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabLayoutUIKt.lambda-1.<anonymous> (SavedPaymentMethodTabLayoutUI.kt:233)");
            }
            List list = SavedPaymentMethodTabLayoutUIKt.PREVIEW_PAYMENT_OPTION_ITEMS;
            PaymentOptionsItem.AddCard addCard = PaymentOptionsItem.AddCard.INSTANCE;
            composer.startReplaceGroup(2108450358);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(2108451446);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda-1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1.invoke$lambda$3$lambda$2((PaymentSelection) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(2108452470);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda-1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$SavedPaymentMethodTabLayoutUIKt$lambda1$1.invoke$lambda$5$lambda$4((DisplayableSavedPaymentMethod) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI(list, addCard, false, false, function0, function1, (Function1) objRememberedValue3, null, null, composer, 1797552, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(PaymentSelection paymentSelection) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
