package com.google.pay.button;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PayButton.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a]\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"FULL_ALPHA", "", "HALF_ALPHA", "PayButton", "", ViewProps.ON_CLICK, "Lkotlin/Function0;", "allowedPaymentMethods", "", "modifier", "Landroidx/compose/ui/Modifier;", "theme", "Lcom/google/pay/button/ButtonTheme;", "type", "Lcom/google/pay/button/ButtonType;", "radius", "Landroidx/compose/ui/unit/Dp;", ViewProps.ENABLED, "", "PayButton-PfoAEA0", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/google/pay/button/ButtonTheme;Lcom/google/pay/button/ButtonType;FZLandroidx/compose/runtime/Composer;II)V", "compose-pay-button_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PayButtonKt {
    private static final float FULL_ALPHA = 1.0f;
    private static final float HALF_ALPHA = 0.5f;

    /* JADX WARN: Removed duplicated region for block: B:100:0x015f A[LOOP:0: B:99:0x015d->B:100:0x015f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /* renamed from: PayButton-PfoAEA0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7163PayButtonPfoAEA0(final Function0<Unit> onClick, final String allowedPaymentMethods, Modifier modifier, ButtonTheme buttonTheme, ButtonType buttonType, float f, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final ButtonTheme buttonTheme2;
        int i5;
        final ButtonType buttonType2;
        int i6;
        float fM6117constructorimpl;
        int i7;
        final boolean z2;
        final int iMo712toPx0680j_4;
        int i8;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(allowedPaymentMethods, "allowedPaymentMethods");
        Composer composerStartRestartGroup = composer.startRestartGroup(-101155437);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PayButton)P(3!1,2,5,6,4:c#ui.unit.Dp)");
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 0) {
            i3 |= composerStartRestartGroup.changed(allowedPaymentMethods) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & 896) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    buttonTheme2 = buttonTheme;
                    i3 |= composerStartRestartGroup.changed(buttonTheme2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((57344 & i) == 0) {
                        buttonType2 = buttonType;
                        i3 |= composerStartRestartGroup.changed(buttonType2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((458752 & i) == 0) {
                            fM6117constructorimpl = f;
                            i3 |= composerStartRestartGroup.changed(fM6117constructorimpl) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 3670016) == 0) {
                            i3 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
                        }
                        if ((i3 & 2995931) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i9 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                buttonTheme2 = ButtonTheme.Dark;
                            }
                            if (i5 != 0) {
                                buttonType2 = ButtonType.Buy;
                            }
                            if (i6 != 0) {
                                fM6117constructorimpl = Dp.m6117constructorimpl(100);
                            }
                            z2 = i7 == 0 ? true : z;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-101155437, i3, -1, "com.google.pay.button.PayButton (PayButton.kt:49)");
                            }
                            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume = composerStartRestartGroup.consume(localDensity);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            iMo712toPx0680j_4 = (int) ((Density) objConsume).mo712toPx0680j_4(fM6117constructorimpl);
                            Object[] objArr = {buttonTheme2, buttonType2, Integer.valueOf(iMo712toPx0680j_4), allowedPaymentMethods};
                            composerStartRestartGroup.startReplaceableGroup(-568225417);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                            zChanged = false;
                            for (i8 = 0; i8 < 4; i8++) {
                                zChanged |= composerStartRestartGroup.changed(objArr[i8]);
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function1) new Function1<Context, PayButton>() { // from class: com.google.pay.button.PayButtonKt$PayButton$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final PayButton invoke(Context context) throws Resources.NotFoundException {
                                        Intrinsics.checkNotNullParameter(context, "context");
                                        PayButton payButton = new PayButton(context);
                                        ButtonTheme buttonTheme3 = buttonTheme2;
                                        ButtonType buttonType3 = buttonType2;
                                        int i10 = iMo712toPx0680j_4;
                                        payButton.initialize(ButtonOptions.newBuilder().setButtonTheme(buttonTheme3.getValue()).setButtonType(buttonType3.getValue()).setCornerRadius(i10).setAllowedPaymentMethods(allowedPaymentMethods).build());
                                        return payButton;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1 function1 = (Function1) objRememberedValue;
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(onClick);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<PayButton, Unit>() { // from class: com.google.pay.button.PayButtonKt$PayButton$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PayButton payButton) {
                                        invoke2(payButton);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PayButton button) {
                                        Intrinsics.checkNotNullParameter(button, "button");
                                        boolean z3 = z2;
                                        final Function0<Unit> function0 = onClick;
                                        button.setAlpha(z3 ? 1.0f : 0.5f);
                                        button.setEnabled(z3);
                                        if (z3) {
                                            button.setOnClickListener(new View.OnClickListener() { // from class: com.google.pay.button.PayButtonKt$PayButton$2$1$1$1
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    function0.invoke();
                                                }
                                            });
                                        } else {
                                            button.setOnClickListener(null);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            z2 = z;
                        }
                        final ButtonTheme buttonTheme3 = buttonTheme2;
                        final ButtonType buttonType3 = buttonType2;
                        final float f2 = fM6117constructorimpl;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        final Modifier modifier3 = modifier2;
                        final boolean z3 = z2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.pay.button.PayButtonKt$PayButton$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                PayButtonKt.m7163PayButtonPfoAEA0(onClick, allowedPaymentMethods, modifier3, buttonTheme3, buttonType3, f2, z3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    fM6117constructorimpl = f;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i3 & 2995931) != 599186) {
                        if (i9 != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        iMo712toPx0680j_4 = (int) ((Density) objConsume2).mo712toPx0680j_4(fM6117constructorimpl);
                        Object[] objArr2 = {buttonTheme2, buttonType2, Integer.valueOf(iMo712toPx0680j_4), allowedPaymentMethods};
                        composerStartRestartGroup.startReplaceableGroup(-568225417);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
                        zChanged = false;
                        while (i8 < 4) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue = (Function1) new Function1<Context, PayButton>() { // from class: com.google.pay.button.PayButtonKt$PayButton$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final PayButton invoke(Context context) throws Resources.NotFoundException {
                                    Intrinsics.checkNotNullParameter(context, "context");
                                    PayButton payButton = new PayButton(context);
                                    ButtonTheme buttonTheme32 = buttonTheme2;
                                    ButtonType buttonType32 = buttonType2;
                                    int i10 = iMo712toPx0680j_4;
                                    payButton.initialize(ButtonOptions.newBuilder().setButtonTheme(buttonTheme32.getValue()).setButtonType(buttonType32.getValue()).setCornerRadius(i10).setAllowedPaymentMethods(allowedPaymentMethods).build());
                                    return payButton;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceableGroup();
                            Function1 function12 = (Function1) objRememberedValue;
                            Boolean boolValueOf2 = Boolean.valueOf(z2);
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "CC(remember)P(1,2):Composables.kt#9igjgp");
                            zChanged2 = composerStartRestartGroup.changed(boolValueOf2) | composerStartRestartGroup.changed(onClick);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2) {
                                objRememberedValue2 = (Function1) new Function1<PayButton, Unit>() { // from class: com.google.pay.button.PayButtonKt$PayButton$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PayButton payButton) {
                                        invoke2(payButton);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PayButton button) {
                                        Intrinsics.checkNotNullParameter(button, "button");
                                        boolean z32 = z2;
                                        final Function0<Unit> function0 = onClick;
                                        button.setAlpha(z32 ? 1.0f : 0.5f);
                                        button.setEnabled(z32);
                                        if (z32) {
                                            button.setOnClickListener(new View.OnClickListener() { // from class: com.google.pay.button.PayButtonKt$PayButton$2$1$1$1
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    function0.invoke();
                                                }
                                            });
                                        } else {
                                            button.setOnClickListener(null);
                                        }
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(function12, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                            }
                        }
                    }
                    final ButtonTheme buttonTheme32 = buttonTheme2;
                    final ButtonType buttonType32 = buttonType2;
                    final float f22 = fM6117constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                buttonType2 = buttonType;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                fM6117constructorimpl = f;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i3 & 2995931) != 599186) {
                }
                final ButtonTheme buttonTheme322 = buttonTheme2;
                final ButtonType buttonType322 = buttonType2;
                final float f222 = fM6117constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            buttonTheme2 = buttonTheme;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            buttonType2 = buttonType;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            fM6117constructorimpl = f;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i3 & 2995931) != 599186) {
            }
            final ButtonTheme buttonTheme3222 = buttonTheme2;
            final ButtonType buttonType3222 = buttonType2;
            final float f2222 = fM6117constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        buttonTheme2 = buttonTheme;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        buttonType2 = buttonType;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        fM6117constructorimpl = f;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i3 & 2995931) != 599186) {
        }
        final ButtonTheme buttonTheme32222 = buttonTheme2;
        final ButtonType buttonType32222 = buttonType2;
        final float f22222 = fM6117constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
