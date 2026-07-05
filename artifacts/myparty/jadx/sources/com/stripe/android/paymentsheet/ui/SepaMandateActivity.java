package com.stripe.android.paymentsheet.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.WindowCompat;
import com.stripe.android.common.ui.ElementsBottomSheetLayoutKt;
import com.stripe.android.paymentsheet.ui.SepaMandateActivity;
import com.stripe.android.paymentsheet.ui.SepaMandateContract;
import com.stripe.android.paymentsheet.ui.SepaMandateResult;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetState;
import com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetStateKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: SepaMandateActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/SepaMandateActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SepaMandateActivity extends AppCompatActivity {
    public static final int $stable = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM9118constructorimpl;
        SepaMandateContract.Args argsFromIntent$paymentsheet_release;
        super.onCreate(savedInstanceState);
        try {
            Result.Companion companion = Result.INSTANCE;
            SepaMandateActivity sepaMandateActivity = this;
            SepaMandateContract.Args.Companion companion2 = SepaMandateContract.Args.INSTANCE;
            Intent intent = getIntent();
            Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
            argsFromIntent$paymentsheet_release = companion2.fromIntent$paymentsheet_release(intent);
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        if (argsFromIntent$paymentsheet_release != null) {
            objM9118constructorimpl = Result.m9118constructorimpl(argsFromIntent$paymentsheet_release);
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = null;
            }
            SepaMandateContract.Args args = (SepaMandateContract.Args) objM9118constructorimpl;
            final String merchantName = args != null ? args.getMerchantName() : null;
            if (merchantName == null) {
                finish();
                return;
            } else {
                WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(2089289300, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) != 2 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2089289300, i, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous> (SepaMandateActivity.kt:51)");
                            }
                            final SepaMandateActivity sepaMandateActivity2 = SepaMandateActivity.this;
                            final String str = merchantName;
                            StripeThemeKt.StripeTheme(null, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(324657918, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i2) {
                                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(324657918, i2, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous> (SepaMandateActivity.kt:52)");
                                        }
                                        StripeBottomSheetState stripeBottomSheetStateRememberStripeBottomSheetState = StripeBottomSheetStateKt.rememberStripeBottomSheetState(null, null, composer2, 0, 3);
                                        SepaMandateActivity sepaMandateActivity3 = sepaMandateActivity2;
                                        composer2.startReplaceGroup(-934017577);
                                        boolean zChanged = composer2.changed(sepaMandateActivity3);
                                        SepaMandateActivity$onCreate$1$1$1$1 sepaMandateActivity$onCreate$1$1$1$1RememberedValue = composer2.rememberedValue();
                                        if (zChanged || sepaMandateActivity$onCreate$1$1$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                            sepaMandateActivity$onCreate$1$1$1$1RememberedValue = new SepaMandateActivity$onCreate$1$1$1$1(sepaMandateActivity3);
                                            composer2.updateRememberedValue(sepaMandateActivity$onCreate$1$1$1$1RememberedValue);
                                        }
                                        composer2.endReplaceGroup();
                                        ElementsBottomSheetLayoutKt.m7218ElementsBottomSheetLayoutTN_CM5M(stripeBottomSheetStateRememberStripeBottomSheetState, null, 0.0f, (Function0) ((KFunction) sepaMandateActivity$onCreate$1$1$1$1RememberedValue), ComposableLambdaKt.rememberComposableLambda(740170406, true, new AnonymousClass2(str, sepaMandateActivity2), composer2, 54), composer2, StripeBottomSheetState.$stable | 24576, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer2.skipToGroupEnd();
                                }

                                /* compiled from: SepaMandateActivity.kt */
                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                /* renamed from: com.stripe.android.paymentsheet.ui.SepaMandateActivity$onCreate$1$1$2, reason: invalid class name */
                                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ String $merchantName;
                                    final /* synthetic */ SepaMandateActivity this$0;

                                    AnonymousClass2(String str, SepaMandateActivity sepaMandateActivity) {
                                        this.$merchantName = str;
                                        this.this$0 = sepaMandateActivity;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer, int i) {
                                        if ((i & 3) != 2 || !composer.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(740170406, i, -1, "com.stripe.android.paymentsheet.ui.SepaMandateActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SepaMandateActivity.kt:58)");
                                            }
                                            String str = this.$merchantName;
                                            composer.startReplaceGroup(-3848641);
                                            boolean zChanged = composer.changed(this.this$0);
                                            final SepaMandateActivity sepaMandateActivity = this.this$0;
                                            Object objRememberedValue = composer.rememberedValue();
                                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return SepaMandateActivity.AnonymousClass1.C02181.AnonymousClass2.invoke$lambda$1$lambda$0(sepaMandateActivity);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue);
                                            }
                                            Function0 function0 = (Function0) objRememberedValue;
                                            composer.endReplaceGroup();
                                            composer.startReplaceGroup(-3836662);
                                            boolean zChanged2 = composer.changed(this.this$0);
                                            final SepaMandateActivity sepaMandateActivity2 = this.this$0;
                                            Object objRememberedValue2 = composer.rememberedValue();
                                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.SepaMandateActivity$onCreate$1$1$2$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return SepaMandateActivity.AnonymousClass1.C02181.AnonymousClass2.invoke$lambda$3$lambda$2(sepaMandateActivity2);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue2);
                                            }
                                            composer.endReplaceGroup();
                                            SepaMandateActivityKt.SepaMandateScreen(str, function0, (Function0) objRememberedValue2, composer, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer.skipToGroupEnd();
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(SepaMandateActivity sepaMandateActivity) {
                                        Intent intentPutExtra = new Intent().putExtra("extra_activity_result", SepaMandateResult.Acknowledged.INSTANCE);
                                        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
                                        sepaMandateActivity.setResult(-1, intentPutExtra);
                                        sepaMandateActivity.finish();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(SepaMandateActivity sepaMandateActivity) {
                                        sepaMandateActivity.finish();
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composer, 54), composer, 12582912, 127);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer.skipToGroupEnd();
                    }
                }), 1, null);
                return;
            }
        }
        throw new IllegalArgumentException("SepaMandateActivity was started without arguments.".toString());
    }
}
