package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcRecollectionScreen.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$CvcRecollectionScreenKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CvcRecollectionScreenKt$lambda2$1 INSTANCE = new ComposableSingletons$CvcRecollectionScreenKt$lambda2$1();

    ComposableSingletons$CvcRecollectionScreenKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1739181525, i, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt.lambda-2.<anonymous> (CvcRecollectionScreen.kt:275)");
            }
            CvcState cvcState = new CvcState("", CardBrand.Visa);
            composer.startReplaceGroup(-597678586);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.ComposableSingletons$CvcRecollectionScreenKt$lambda-2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ComposableSingletons$CvcRecollectionScreenKt$lambda2$1.invoke$lambda$1$lambda$0((CvcRecollectionViewAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            CvcRecollectionScreenKt.CvcRecollectionScreen("4242", false, cvcState, (Function1) objRememberedValue, composer, 3510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CvcRecollectionViewAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
