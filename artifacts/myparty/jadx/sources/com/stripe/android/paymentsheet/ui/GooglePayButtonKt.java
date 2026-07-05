package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.core.view.ViewGroupKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.wallet.button.ButtonOptions;
import com.google.android.gms.wallet.button.PayButton;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.reactnativestripesdk.GooglePayButtonManager;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.model.GooglePayButtonType;
import com.stripe.android.paymentsheet.ui.GooglePayButtonKt;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.ui.PrimaryButtonProcessingState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;

/* compiled from: GooglePayButton.kt */
@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001a\u001f\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0013\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0007H\u0002\u001ac\u0010\u001c\u001a\u00020\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u00152\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u0005H\u0003¢\u0006\u0004\b&\u0010'\u001a\u0016\u0010(\u001a\u0004\u0018\u00010)*\u00020*2\u0006\u0010+\u001a\u00020,H\u0002\"\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0017X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u001aX\u0082T¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {GooglePayButtonManager.REACT_CLASS, "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "allowCreditCards", "", "buttonType", "Lcom/stripe/android/paymentsheet/model/GooglePayButtonType;", "billingAddressParameters", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "isEnabled", "onPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;ZLcom/stripe/android/paymentsheet/model/GooglePayButtonType;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/stripe/android/CardBrandFilter;Landroidx/compose/runtime/Composer;II)V", "GooglePrimaryButton", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;Landroidx/compose/runtime/Composer;II)V", "toComposeButtonType", "Lcom/stripe/android/paymentsheet/ui/ButtonType;", "GOOGLE_PAY_BUTTON_TEST_TAG", "", "GOOGLE_PAY_PRIMARY_BUTTON_TEST_TAG", "FULL_ALPHA", "", "HALF_ALPHA", "PayButton", ViewProps.ON_CLICK, "allowedPaymentMethods", "theme", "Lcom/stripe/android/paymentsheet/ui/ButtonTheme;", "type", "height", "Landroidx/compose/ui/unit/Dp;", "radius", ViewProps.ENABLED, "PayButton-EKdrzYM", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/ui/ButtonTheme;Lcom/stripe/android/paymentsheet/ui/ButtonType;Landroidx/compose/ui/unit/Dp;FZLandroidx/compose/runtime/Composer;II)V", "nestedView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "depth", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GooglePayButtonKt {
    private static final float FULL_ALPHA = 1.0f;
    public static final String GOOGLE_PAY_BUTTON_TEST_TAG = "google-pay-button";
    public static final String GOOGLE_PAY_PRIMARY_BUTTON_TEST_TAG = "google-pay-primary-button";
    private static final float HALF_ALPHA = 0.5f;

    /* compiled from: GooglePayButton.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GooglePayButtonType.values().length];
            try {
                iArr[GooglePayButtonType.Book.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GooglePayButtonType.Buy.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GooglePayButtonType.Checkout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GooglePayButtonType.Donate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GooglePayButtonType.Order.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GooglePayButtonType.Pay.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GooglePayButtonType.Plain.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GooglePayButtonType.Subscribe.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GooglePayButton$lambda$4(PrimaryButton.State state, boolean z, GooglePayButtonType googlePayButtonType, GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, boolean z2, Function0 function0, Modifier modifier, CardBrandFilter cardBrandFilter, int i, int i2, Composer composer, int i3) {
        GooglePayButton(state, z, googlePayButtonType, billingAddressParameters, z2, function0, modifier, cardBrandFilter, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GooglePrimaryButton$lambda$5(Modifier modifier, PrimaryButton.State state, int i, int i2, Composer composer, int i3) {
        GooglePrimaryButton(modifier, state, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayButton_EKdrzYM$lambda$16(Function0 function0, String str, Modifier modifier, ButtonTheme buttonTheme, ButtonType buttonType, Dp dp, float f, boolean z, int i, int i2, Composer composer, int i3) {
        m8466PayButtonEKdrzYM(function0, str, modifier, buttonTheme, buttonType, dp, f, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17 */
    public static final void GooglePayButton(final PrimaryButton.State state, final boolean z, final GooglePayButtonType buttonType, final GooglePayJsonFactory.BillingAddressParameters billingAddressParameters, final boolean z2, final Function0<Unit> onPressed, Modifier modifier, final CardBrandFilter cardBrandFilter, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        Modifier modifier2;
        Modifier modifier3;
        int i4;
        int i5;
        boolean z4;
        Object string;
        ?? r10;
        ButtonTheme buttonTheme;
        Modifier modifier4;
        final Modifier modifier5;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        Intrinsics.checkNotNullParameter(onPressed, "onPressed");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1626492025);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(buttonType) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(billingAddressParameters) : composerStartRestartGroup.changedInstance(billingAddressParameters) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPressed) ? 131072 : 65536;
        }
        int i6 = i2 & 64;
        if (i6 != 0) {
            i3 |= 1572864;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(cardBrandFilter) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            Modifier.Companion companion = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1626492025, i3, -1, "com.stripe.android.paymentsheet.ui.GooglePayButton (GooglePayButton.kt:40)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            boolean zBooleanValue = ((Boolean) objConsume2).booleanValue();
            composerStartRestartGroup.startReplaceGroup(792249283);
            boolean zChanged = ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && composerStartRestartGroup.changed(billingAddressParameters))) | composerStartRestartGroup.changed(context) | composerStartRestartGroup.changed(zBooleanValue) | ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                if (zBooleanValue) {
                    string = "";
                    i5 = i3;
                    modifier3 = companion;
                    i4 = 1;
                    z4 = false;
                } else {
                    modifier3 = companion;
                    i4 = 1;
                    i5 = i3;
                    z4 = false;
                    string = new JSONArray().put(GooglePayJsonFactory.createCardPaymentMethod$default(new GooglePayJsonFactory(context, false, cardBrandFilter, 2, (DefaultConstructorMarker) null), billingAddressParameters, Boolean.valueOf(z3), false, 4, null)).toString();
                    Intrinsics.checkNotNull(string);
                }
                composerStartRestartGroup.updateRememberedValue(string);
                r10 = z4;
            } else {
                i5 = i3;
                modifier3 = companion;
                string = objRememberedValue;
                i4 = 1;
                r10 = 0;
            }
            String str = (String) string;
            composerStartRestartGroup.endReplaceGroup();
            if (DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, r10)) {
                buttonTheme = ButtonTheme.Light;
            } else {
                buttonTheme = ButtonTheme.Dark;
            }
            ButtonTheme buttonTheme2 = buttonTheme;
            if (state == null || (state instanceof PrimaryButton.State.Ready)) {
                composerStartRestartGroup.startReplaceGroup(-1209374843);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, i4, null);
                composerStartRestartGroup.startReplaceGroup(792274674);
                int i7 = (i5 & 458752) == 131072 ? i4 : r10;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (i7 != 0 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return GooglePayButtonKt.GooglePayButton$lambda$3$lambda$2(onPressed, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier4 = modifier3;
                m8466PayButtonEKdrzYM(onPressed, str, TestTagKt.testTag(SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, r10, (Function1) objRememberedValue2, i4, null), GOOGLE_PAY_BUTTON_TEST_TAG), buttonTheme2, toComposeButtonType(buttonType), Dp.m6115boximpl(PrimaryButtonTheme.INSTANCE.getShape(composerStartRestartGroup, 6).m8524getHeightD9Ej5fM()), PrimaryButtonTheme.INSTANCE.getShape(composerStartRestartGroup, 6).m8523getCornerRadiusD9Ej5fM(), z2, composerStartRestartGroup, ((i5 >> 15) & 14) | ((i5 << 9) & 29360128), 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(state instanceof PrimaryButton.State.StartProcessing) && !(state instanceof PrimaryButton.State.FinishProcessing)) {
                    composerStartRestartGroup.startReplaceGroup(792269958);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(792294659);
                GooglePrimaryButton(modifier3, state, composerStartRestartGroup, ((i5 >> 18) & 14) | ((i5 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS), r10);
                composerStartRestartGroup.endReplaceGroup();
                modifier4 = modifier3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier5 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GooglePayButtonKt.GooglePayButton$lambda$4(state, z, buttonType, billingAddressParameters, z2, onPressed, modifier5, cardBrandFilter, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GooglePayButton$lambda$3$lambda$2(final Function0 function0, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.onClick$default(semantics, null, new Function0() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(GooglePayButtonKt.GooglePayButton$lambda$3$lambda$2$lambda$1(function0));
            }
        }, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GooglePayButton$lambda$3$lambda$2$lambda$1(Function0 function0) {
        function0.invoke();
        return true;
    }

    private static final void GooglePrimaryButton(Modifier modifier, final PrimaryButton.State state, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        PrimaryButtonProcessingState.Processing processing;
        Composer composerStartRestartGroup = composer.startRestartGroup(206308520);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(206308520, i3, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton (GooglePayButton.kt:101)");
            }
            if (state instanceof PrimaryButton.State.FinishProcessing) {
                processing = PrimaryButtonProcessingState.Completed.INSTANCE;
            } else {
                processing = PrimaryButtonProcessingState.Processing.INSTANCE;
            }
            PrimaryButtonThemeKt.PrimaryButtonTheme(new PrimaryButtonColors(ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_googlepay_primary_button_background_color, composerStartRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_googlepay_primary_button_tint_color, composerStartRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_googlepay_primary_button_background_color, composerStartRestartGroup, 0), ColorResources_androidKt.colorResource(R.color.stripe_paymentsheet_googlepay_primary_button_tint_color, composerStartRestartGroup, 0), 0L, 16, null), null, null, ComposableLambdaKt.rememberComposableLambda(-1177645661, true, new AnonymousClass1(modifier3, processing, state), composerStartRestartGroup, 54), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GooglePayButtonKt.GooglePrimaryButton$lambda$5(modifier3, state, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: GooglePayButton.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePrimaryButton$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ PrimaryButtonProcessingState $processingState;
        final /* synthetic */ PrimaryButton.State $state;

        AnonymousClass1(Modifier modifier, PrimaryButtonProcessingState primaryButtonProcessingState, PrimaryButton.State state) {
            this.$modifier = modifier;
            this.$processingState = primaryButtonProcessingState;
            this.$state = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1177645661, i, -1, "com.stripe.android.paymentsheet.ui.GooglePrimaryButton.<anonymous> (GooglePayButton.kt:124)");
                }
                Modifier modifierTestTag = TestTagKt.testTag(this.$modifier, GooglePayButtonKt.GOOGLE_PAY_PRIMARY_BUTTON_TEST_TAG);
                PrimaryButtonProcessingState primaryButtonProcessingState = this.$processingState;
                final PrimaryButton.State state = this.$state;
                ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierTestTag);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composer.startReplaceGroup(-549758850);
                boolean zChanged = composer.changed(state);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePrimaryButton$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GooglePayButtonKt.AnonymousClass1.invoke$lambda$4$lambda$1$lambda$0(state);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-549753501);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$GooglePrimaryButton$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PrimaryButtonNewKt.PrimaryButton("", true, true, null, primaryButtonProcessingState, function0, (Function0) objRememberedValue2, composer, 1573302, 8);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(PrimaryButton.State state) {
            if (state instanceof PrimaryButton.State.FinishProcessing) {
                ((PrimaryButton.State.FinishProcessing) state).getOnComplete().invoke();
            }
            return Unit.INSTANCE;
        }
    }

    private static final ButtonType toComposeButtonType(GooglePayButtonType googlePayButtonType) {
        switch (WhenMappings.$EnumSwitchMapping$0[googlePayButtonType.ordinal()]) {
            case 1:
                return ButtonType.Book;
            case 2:
                return ButtonType.Buy;
            case 3:
                return ButtonType.Checkout;
            case 4:
                return ButtonType.Donate;
            case 5:
                return ButtonType.Order;
            case 6:
                return ButtonType.Pay;
            case 7:
                return ButtonType.Plain;
            case 8:
                return ButtonType.Subscribe;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* renamed from: PayButton-EKdrzYM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void m8466PayButtonEKdrzYM(final Function0<Unit> function0, final String str, Modifier modifier, ButtonTheme buttonTheme, ButtonType buttonType, Dp dp, float f, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final ButtonTheme buttonTheme2;
        int i5;
        int i6;
        Dp dp2;
        int i7;
        float f2;
        int i8;
        final ButtonType buttonType2;
        final boolean z2;
        final int iMo712toPx0680j_4;
        final Integer numValueOf;
        boolean zChanged;
        Object objRememberedValue;
        boolean zChanged2;
        Object objRememberedValue2;
        final float f3;
        final Dp dp3;
        final ButtonType buttonType3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(293499576);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    buttonTheme2 = buttonTheme;
                    i3 |= composerStartRestartGroup.changed(buttonTheme2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(buttonType) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        dp2 = dp;
                    } else {
                        dp2 = dp;
                        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                            i3 |= composerStartRestartGroup.changed(dp2) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(f2) ? 1048576 : 524288;
                        }
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i9 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            buttonTheme2 = ButtonTheme.Dark;
                        }
                        buttonType2 = i5 == 0 ? ButtonType.Buy : buttonType;
                        if (i6 != 0) {
                            dp2 = null;
                        }
                        float fM6117constructorimpl = i7 == 0 ? Dp.m6117constructorimpl(100) : f2;
                        z2 = i8 == 0 ? true : z;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(293499576, i3, -1, "com.stripe.android.paymentsheet.ui.PayButton (GooglePayButton.kt:187)");
                        }
                        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composerStartRestartGroup.consume(localDensity);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        iMo712toPx0680j_4 = (int) ((Density) objConsume).mo712toPx0680j_4(fM6117constructorimpl);
                        ProvidableCompositionLocal<Density> localDensity2 = CompositionLocalsKt.getLocalDensity();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume2 = composerStartRestartGroup.consume(localDensity2);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        numValueOf = dp2 == null ? Integer.valueOf((int) ((Density) objConsume2).mo712toPx0680j_4(dp2.m6131unboximpl())) : null;
                        composerStartRestartGroup.startReplaceGroup(1259042465);
                        int i10 = i3;
                        zChanged = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(iMo712toPx0680j_4) | ((i10 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GooglePayButtonKt.PayButton_EKdrzYM$lambda$10$lambda$9(buttonTheme2, buttonType2, iMo712toPx0680j_4, str, (Context) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1259058587);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf) | ((i10 & 29360128) != 8388608) | ((i10 & 14) != 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GooglePayButtonKt.PayButton_EKdrzYM$lambda$15$lambda$14(z2, numValueOf, function0, (PayButton) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        AndroidView_androidKt.AndroidView(function1, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i10 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Dp dp4 = dp2;
                        f3 = fM6117constructorimpl;
                        dp3 = dp4;
                        buttonType3 = buttonType2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        buttonType3 = buttonType;
                        z2 = z;
                        dp3 = dp2;
                        f3 = f2;
                    }
                    final ButtonTheme buttonTheme3 = buttonTheme2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier3 = modifier2;
                        final boolean z3 = z2;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GooglePayButtonKt.PayButton_EKdrzYM$lambda$16(function0, str, modifier3, buttonTheme3, buttonType3, dp3, f3, z3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i9 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ProvidableCompositionLocal<Density> localDensity3 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume3 = composerStartRestartGroup.consume(localDensity3);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    iMo712toPx0680j_4 = (int) ((Density) objConsume3).mo712toPx0680j_4(fM6117constructorimpl);
                    ProvidableCompositionLocal<Density> localDensity22 = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                    Object objConsume22 = composerStartRestartGroup.consume(localDensity22);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (dp2 == null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(1259042465);
                    if ((i3 & 7168) != 2048) {
                    }
                    int i102 = i3;
                    zChanged = ((57344 & i3) != 16384) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(iMo712toPx0680j_4) | ((i102 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return GooglePayButtonKt.PayButton_EKdrzYM$lambda$10$lambda$9(buttonTheme2, buttonType2, iMo712toPx0680j_4, str, (Context) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        Function1 function12 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1259058587);
                        zChanged2 = composerStartRestartGroup.changed(numValueOf) | ((i102 & 29360128) != 8388608) | ((i102 & 14) != 4);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged2) {
                            objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return GooglePayButtonKt.PayButton_EKdrzYM$lambda$15$lambda$14(z2, numValueOf, function0, (PayButton) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            AndroidView_androidKt.AndroidView(function12, modifier2, (Function1) objRememberedValue2, composerStartRestartGroup, (i102 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Dp dp42 = dp2;
                            f3 = fM6117constructorimpl;
                            dp3 = dp42;
                            buttonType3 = buttonType2;
                        }
                    }
                }
                final ButtonTheme buttonTheme32 = buttonTheme2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            buttonTheme2 = buttonTheme;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            final ButtonTheme buttonTheme322 = buttonTheme2;
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
        if (i5 == 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        final ButtonTheme buttonTheme3222 = buttonTheme2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PayButton PayButton_EKdrzYM$lambda$10$lambda$9(ButtonTheme buttonTheme, ButtonType buttonType, int i, String str, Context context) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        PayButton payButton = new PayButton(context);
        payButton.initialize(ButtonOptions.newBuilder().setButtonTheme(buttonTheme.getValue()).setButtonType(buttonType.getValue()).setCornerRadius(i).setAllowedPaymentMethods(str).build());
        return payButton;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PayButton_EKdrzYM$lambda$15$lambda$14(boolean z, Integer num, final Function0 function0, PayButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        View viewNestedView = nestedView(button, 2);
        if (viewNestedView != null) {
            viewNestedView.setMinimumHeight(num != null ? num.intValue() : viewNestedView.getMinimumHeight());
        }
        button.setAlpha(z ? 1.0f : 0.5f);
        button.setEnabled(z);
        if (z) {
            button.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.paymentsheet.ui.GooglePayButtonKt$$ExternalSyntheticLambda5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    function0.invoke();
                }
            });
        } else {
            button.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    private static final View nestedView(ViewGroup viewGroup, int i) {
        View view = (View) SequencesKt.firstOrNull(ViewGroupKt.getChildren(viewGroup));
        if (i == 0) {
            return view;
        }
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup2 != null) {
            return nestedView(viewGroup2, i - 1);
        }
        return null;
    }
}
