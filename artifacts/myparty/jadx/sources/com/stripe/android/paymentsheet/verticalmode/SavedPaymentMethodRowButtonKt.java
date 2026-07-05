package com.stripe.android.paymentsheet.verticalmode;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ui.AccessibilityKt;
import com.stripe.android.paymentsheet.ui.PaymentMethodIconKt;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.paymentsheet.utils.TestMetadataKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedPaymentMethodRowButton.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0014\"\u0010\u0010\u0016\u001a\u00020\u00178\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"SavedPaymentMethodRowButton", "", "displayableSavedPaymentMethod", "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;", "isEnabled", "", "isSelected", "modifier", "Landroidx/compose/ui/Modifier;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "trailingContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;ZZLandroidx/compose/ui/Modifier;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PreviewCardSavedPaymentMethodRowButton", "(Landroidx/compose/runtime/Composer;I)V", "PreviewCardDefaultSavedPaymentMethodRowButton", "TEST_TAG_SAVED_PAYMENT_METHOD_ROW_BUTTON", "", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SavedPaymentMethodRowButtonKt {
    public static final String TEST_TAG_SAVED_PAYMENT_METHOD_ROW_BUTTON = "saved_payment_method_row_button";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCardDefaultSavedPaymentMethodRowButton$lambda$4(int i, Composer composer, int i2) {
        PreviewCardDefaultSavedPaymentMethodRowButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCardSavedPaymentMethodRowButton$lambda$3(int i, Composer composer, int i2) {
        PreviewCardSavedPaymentMethodRowButton(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedPaymentMethodRowButton$lambda$2(DisplayableSavedPaymentMethod displayableSavedPaymentMethod, boolean z, boolean z2, Modifier modifier, PaymentSheet.Appearance.Embedded embedded, Function0 function0, Function3 function3, int i, int i2, Composer composer, int i3) {
        SavedPaymentMethodRowButton(displayableSavedPaymentMethod, z, z2, modifier, embedded, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SavedPaymentMethodRowButton(final DisplayableSavedPaymentMethod displayableSavedPaymentMethod, final boolean z, final boolean z2, Modifier modifier, PaymentSheet.Appearance.Embedded embedded, Function0<Unit> function0, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        boolean z4;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        PaymentSheet.Appearance.Embedded embedded2;
        Function0<Unit> function03;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        ResolvableString label;
        Composer composer2;
        final Modifier modifier3;
        final Function0<Unit> function04;
        final PaymentSheet.Appearance.Embedded embedded3;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        PaymentSheet.Appearance.Embedded embedded4 = embedded;
        Intrinsics.checkNotNullParameter(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
        Composer composerStartRestartGroup = composer.startRestartGroup(2142378004);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(displayableSavedPaymentMethod) ? 4 : 2) | i;
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
            z4 = z2;
        } else {
            z4 = z2;
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) != 0) {
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    if ((32768 & i) == 0 ? composerStartRestartGroup.changed(embedded4) : composerStartRestartGroup.changedInstance(embedded4)) {
                        i6 = 16384;
                    }
                    i3 |= i6;
                }
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else {
                if ((196608 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 16) != 0) {
                                embedded4 = new PaymentSheet.Appearance.Embedded(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault());
                                i3 &= -57345;
                            }
                            if (i4 != 0) {
                                composerStartRestartGroup.startReplaceGroup(418326587);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function02 = (Function0) objRememberedValue;
                            }
                            if (i5 == 0) {
                                embedded2 = embedded4;
                                function03 = function02;
                                function33 = null;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2142378004, i3, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:40)");
                            }
                            String numbersAsIndividualDigits = AccessibilityKt.readNumbersAsIndividualDigits(ResolvableStringComposeUtilsKt.resolve(displayableSavedPaymentMethod.getDescription(), composerStartRestartGroup, 0));
                            label = PaymentMethodsUiExtensionKt.getLabel(displayableSavedPaymentMethod.getPaymentMethod(), true);
                            if (label == null) {
                                label = displayableSavedPaymentMethod.getDisplayName();
                            }
                            String str = displayableSavedPaymentMethod.getPaymentMethod().id;
                            String strResolve = ResolvableStringComposeUtilsKt.resolve(label, composerStartRestartGroup, 0);
                            ResolvableString sublabel = PaymentMethodsUiExtensionKt.getSublabel(displayableSavedPaymentMethod.getPaymentMethod());
                            composerStartRestartGroup.startReplaceGroup(418365922);
                            String strResolve2 = sublabel != null ? ResolvableStringComposeUtilsKt.resolve(sublabel, composerStartRestartGroup, 0) : null;
                            composerStartRestartGroup.endReplaceGroup();
                            int i8 = i3 >> 3;
                            composer2 = composerStartRestartGroup;
                            PaymentMethodRowButtonKt.PaymentMethodRowButton(z3, z4, false, displayableSavedPaymentMethod.getShouldShowDefaultBadge(), ComposableLambdaKt.rememberComposableLambda(76300594, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton.2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope PaymentMethodRowButton, Composer composer3, int i9) {
                                    Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
                                    if ((i9 & 17) != 16 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(76300594, i9, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:54)");
                                        }
                                        PaymentMethod.Card card = displayableSavedPaymentMethod.getPaymentMethod().card;
                                        PaymentMethodIconKt.PaymentMethodIconFromResource(PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(displayableSavedPaymentMethod.getPaymentMethod(), true, (Boolean) null, 2, (Object) null), null, Alignment.INSTANCE.getCenter(), TestMetadataKt.testMetadata(SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, UIConstants.INSTANCE.m8589getIconHeightD9Ej5fM()), UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM()), card != null ? card.displayBrand : null), composer3, 432);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), strResolve, strResolve2, null, function03, numbersAsIndividualDigits, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str), embedded2, function33, composer2, (i8 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i8 & 14) | 12607488 | ((i3 << 9) & 234881024), ((i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 12) & 896), 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            function04 = function03;
                            embedded3 = embedded2;
                            function34 = function33;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                        }
                        embedded2 = embedded4;
                        function03 = function02;
                        function33 = function32;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String numbersAsIndividualDigits2 = AccessibilityKt.readNumbersAsIndividualDigits(ResolvableStringComposeUtilsKt.resolve(displayableSavedPaymentMethod.getDescription(), composerStartRestartGroup, 0));
                        label = PaymentMethodsUiExtensionKt.getLabel(displayableSavedPaymentMethod.getPaymentMethod(), true);
                        if (label == null) {
                        }
                        String str2 = displayableSavedPaymentMethod.getPaymentMethod().id;
                        String strResolve3 = ResolvableStringComposeUtilsKt.resolve(label, composerStartRestartGroup, 0);
                        ResolvableString sublabel2 = PaymentMethodsUiExtensionKt.getSublabel(displayableSavedPaymentMethod.getPaymentMethod());
                        composerStartRestartGroup.startReplaceGroup(418365922);
                        if (sublabel2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i82 = i3 >> 3;
                        composer2 = composerStartRestartGroup;
                        PaymentMethodRowButtonKt.PaymentMethodRowButton(z3, z4, false, displayableSavedPaymentMethod.getShouldShowDefaultBadge(), ComposableLambdaKt.rememberComposableLambda(76300594, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope PaymentMethodRowButton, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
                                if ((i9 & 17) != 16 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(76300594, i9, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:54)");
                                    }
                                    PaymentMethod.Card card = displayableSavedPaymentMethod.getPaymentMethod().card;
                                    PaymentMethodIconKt.PaymentMethodIconFromResource(PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(displayableSavedPaymentMethod.getPaymentMethod(), true, (Boolean) null, 2, (Object) null), null, Alignment.INSTANCE.getCenter(), TestMetadataKt.testMetadata(SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, UIConstants.INSTANCE.m8589getIconHeightD9Ej5fM()), UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM()), card != null ? card.displayBrand : null), composer3, 432);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), strResolve3, strResolve2, null, function03, numbersAsIndividualDigits2, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str2), embedded2, function33, composer2, (i82 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i82 & 14) | 12607488 | ((i3 << 9) & 234881024), ((i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 12) & 896), 4);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        function04 = function03;
                        embedded3 = embedded2;
                        function34 = function33;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        embedded3 = embedded4;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function04 = function02;
                        function34 = function32;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton$lambda$2(displayableSavedPaymentMethod, z, z2, modifier3, embedded3, function04, function34, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                function32 = function3;
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 16) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            embedded2 = embedded4;
                            function03 = function02;
                            function33 = function32;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String numbersAsIndividualDigits22 = AccessibilityKt.readNumbersAsIndividualDigits(ResolvableStringComposeUtilsKt.resolve(displayableSavedPaymentMethod.getDescription(), composerStartRestartGroup, 0));
                        label = PaymentMethodsUiExtensionKt.getLabel(displayableSavedPaymentMethod.getPaymentMethod(), true);
                        if (label == null) {
                        }
                        String str22 = displayableSavedPaymentMethod.getPaymentMethod().id;
                        String strResolve32 = ResolvableStringComposeUtilsKt.resolve(label, composerStartRestartGroup, 0);
                        ResolvableString sublabel22 = PaymentMethodsUiExtensionKt.getSublabel(displayableSavedPaymentMethod.getPaymentMethod());
                        composerStartRestartGroup.startReplaceGroup(418365922);
                        if (sublabel22 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i822 = i3 >> 3;
                        composer2 = composerStartRestartGroup;
                        PaymentMethodRowButtonKt.PaymentMethodRowButton(z3, z4, false, displayableSavedPaymentMethod.getShouldShowDefaultBadge(), ComposableLambdaKt.rememberComposableLambda(76300594, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                invoke(rowScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope PaymentMethodRowButton, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
                                if ((i9 & 17) != 16 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(76300594, i9, -1, "com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:54)");
                                    }
                                    PaymentMethod.Card card = displayableSavedPaymentMethod.getPaymentMethod().card;
                                    PaymentMethodIconKt.PaymentMethodIconFromResource(PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon$default(displayableSavedPaymentMethod.getPaymentMethod(), true, (Boolean) null, 2, (Object) null), null, Alignment.INSTANCE.getCenter(), TestMetadataKt.testMetadata(SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, UIConstants.INSTANCE.m8589getIconHeightD9Ej5fM()), UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM()), card != null ? card.displayBrand : null), composer3, 432);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composerStartRestartGroup, 54), strResolve32, strResolve2, null, function03, numbersAsIndividualDigits22, TestTagKt.testTag(modifier2, "saved_payment_method_row_button_" + str22), embedded2, function33, composer2, (i822 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i822 & 14) | 12607488 | ((i3 << 9) & 234881024), ((i3 >> 9) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i3 >> 12) & 896), 4);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        function04 = function03;
                        embedded3 = embedded2;
                        function34 = function33;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            function32 = function3;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewCardSavedPaymentMethodRowButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(851089713);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(851089713, i, -1, "com.stripe.android.paymentsheet.verticalmode.PreviewCardSavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:83)");
            }
            final DisplayableSavedPaymentMethod displayableSavedPaymentMethodCreate$default = DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("4242"), new PaymentMethod("001", null, false, PaymentMethod.Type.Card.code, PaymentMethod.Type.Card, null, null, new PaymentMethod.Card(CardBrand.Visa, null, null, null, null, null, null, "4242", null, null, null, null, 3966, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 2096992, null), false, false, 12, null);
            StripeThemeKt.DefaultStripeTheme(ComposableLambdaKt.rememberComposableLambda(-1377945543, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt.PreviewCardSavedPaymentMethodRowButton.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1377945543, i2, -1, "com.stripe.android.paymentsheet.verticalmode.PreviewCardSavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:100)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(10));
                        DisplayableSavedPaymentMethod displayableSavedPaymentMethod = displayableSavedPaymentMethodCreate$default;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, true, true, null, null, null, null, composer2, 432, 120);
                        SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, false, false, null, null, null, null, composer2, 432, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodRowButtonKt.PreviewCardSavedPaymentMethodRowButton$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewCardDefaultSavedPaymentMethodRowButton(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-603777730);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-603777730, i, -1, "com.stripe.android.paymentsheet.verticalmode.PreviewCardDefaultSavedPaymentMethodRowButton (SavedPaymentMethodRowButton.kt:120)");
            }
            final DisplayableSavedPaymentMethod displayableSavedPaymentMethodCreate$default = DisplayableSavedPaymentMethod.Companion.create$default(DisplayableSavedPaymentMethod.INSTANCE, ResolvableStringUtilsKt.getResolvableString("4242"), new PaymentMethod("002", null, false, PaymentMethod.Type.Card.code, PaymentMethod.Type.Card, null, null, new PaymentMethod.Card(CardBrand.AmericanExpress, null, null, null, null, null, null, "4444", null, null, null, null, 3966, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 2096992, null), false, true, 4, null);
            StripeThemeKt.DefaultStripeTheme(ComposableLambdaKt.rememberComposableLambda(1030225206, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt.PreviewCardDefaultSavedPaymentMethodRowButton.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1030225206, i2, -1, "com.stripe.android.paymentsheet.verticalmode.PreviewCardDefaultSavedPaymentMethodRowButton.<anonymous> (SavedPaymentMethodRowButton.kt:138)");
                        }
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(10));
                        DisplayableSavedPaymentMethod displayableSavedPaymentMethod = displayableSavedPaymentMethodCreate$default;
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, true, true, null, null, null, null, composer2, 432, 120);
                        SavedPaymentMethodRowButtonKt.SavedPaymentMethodRowButton(displayableSavedPaymentMethod, false, false, null, null, null, null, composer2, 432, 120);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.SavedPaymentMethodRowButtonKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedPaymentMethodRowButtonKt.PreviewCardDefaultSavedPaymentMethodRowButton$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
