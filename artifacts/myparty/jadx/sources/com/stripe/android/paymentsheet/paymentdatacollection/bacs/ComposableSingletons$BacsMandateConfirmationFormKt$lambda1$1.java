package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.elements.BacsDebitAccountNumberConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BacsMandateConfirmationForm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$BacsMandateConfirmationFormKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BacsMandateConfirmationFormKt$lambda1$1 INSTANCE = new ComposableSingletons$BacsMandateConfirmationFormKt$lambda1$1();

    ComposableSingletons$BacsMandateConfirmationFormKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374230487, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.bacs.ComposableSingletons$BacsMandateConfirmationFormKt.lambda-1.<anonymous> (BacsMandateConfirmationForm.kt:238)");
            }
            BacsMandateConfirmationViewState bacsMandateConfirmationViewState = new BacsMandateConfirmationViewState("email@email.com", "John Doe", "10-88-00", BacsDebitAccountNumberConfig.PLACEHOLDER, ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_notice_default_payer), ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bacs_support_address_format, new Object[]{ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_address_line_one), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_address_line_two), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_email), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_support_default_email)}, null, 4, null), ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_bacs_guarantee_format, new Object[]{ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_guarantee_url), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_bacs_guarantee)}, null, 4, null));
            composer.startReplaceGroup(-319493519);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.bacs.ComposableSingletons$BacsMandateConfirmationFormKt$lambda-1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$BacsMandateConfirmationFormKt$lambda1$1.invoke$lambda$1$lambda$0((BacsMandateConfirmationViewAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BacsMandateConfirmationFormKt.BacsMandateConfirmationFormView(bacsMandateConfirmationViewState, (Function1) objRememberedValue, null, composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BacsMandateConfirmationViewAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
