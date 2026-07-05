package com.stripe.android.paymentsheet.verticalmode;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.ui.PaymentMethodIconKt;
import com.stripe.android.uicore.image.StripeImageLoader;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: NewPaymentMethodRowButton.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ac\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001a\u009f\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\b\b\u0002\u0010\u000b\u001a\u00020\f2 \b\u0002\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\u0010\u001e\"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {NewPaymentMethodRowButtonKt.TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON, "", "NewPaymentMethodRowButton", "", "isEnabled", "", "isSelected", "displayablePaymentMethod", "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;", "imageLoader", "Lcom/stripe/android/uicore/image/StripeImageLoader;", "modifier", "Landroidx/compose/ui/Modifier;", "trailingContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "appearance", "Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;", "(ZZLcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;Lcom/stripe/android/uicore/image/StripeImageLoader;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;II)V", "iconRes", "", "iconUrl", "title", "subtitle", "promoText", "iconRequiresTinting", ViewProps.ON_CLICK, "Lkotlin/Function0;", "(ZZILjava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lcom/stripe/android/paymentsheet/PaymentSheet$Appearance$Embedded;Landroidx/compose/runtime/Composer;III)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NewPaymentMethodRowButtonKt {
    public static final String TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON = "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewPaymentMethodRowButton$lambda$2(boolean z, boolean z2, DisplayablePaymentMethod displayablePaymentMethod, StripeImageLoader stripeImageLoader, Modifier modifier, Function3 function3, PaymentSheet.Appearance.Embedded embedded, int i, int i2, Composer composer, int i3) {
        NewPaymentMethodRowButton(z, z2, displayablePaymentMethod, stripeImageLoader, modifier, function3, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewPaymentMethodRowButton$lambda$3(boolean z, boolean z2, int i, String str, StripeImageLoader stripeImageLoader, String str2, String str3, String str4, boolean z3, Function0 function0, Modifier modifier, Function3 function3, PaymentSheet.Appearance.Embedded embedded, int i2, int i3, int i4, Composer composer, int i5) {
        NewPaymentMethodRowButton(z, z2, i, str, stripeImageLoader, str2, str3, str4, z3, function0, modifier, function3, embedded, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewPaymentMethodRowButton(final boolean z, final boolean z2, final DisplayablePaymentMethod displayablePaymentMethod, final StripeImageLoader imageLoader, Modifier modifier, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, PaymentSheet.Appearance.Embedded embedded, Composer composer, final int i, final int i2) {
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        int i5;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        PaymentSheet.Appearance.Embedded embedded2;
        Modifier modifier3;
        ResolvableString subtitle;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier4;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33;
        final PaymentSheet.Appearance.Embedded embedded3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        PaymentSheet.Appearance.Embedded embedded4 = embedded;
        Intrinsics.checkNotNullParameter(displayablePaymentMethod, "displayablePaymentMethod");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Composer composerStartRestartGroup = composer.startRestartGroup(805862142);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z3 = z;
        } else if ((i & 6) == 0) {
            z3 = z;
            i3 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z4 = z2;
                i3 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(displayablePaymentMethod) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        function32 = function3;
                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        if ((i2 & 64) != 0) {
                            i6 = 524288;
                            i3 |= i6;
                        } else {
                            if ((2097152 & i) == 0 ? composerStartRestartGroup.changed(embedded4) : composerStartRestartGroup.changedInstance(embedded4)) {
                                i6 = 1048576;
                            }
                            i3 |= i6;
                        }
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                function32 = null;
                            }
                            if ((i2 & 64) != 0) {
                                embedded4 = new PaymentSheet.Appearance.Embedded(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault());
                                i3 &= -3670017;
                            }
                            embedded2 = embedded4;
                            modifier3 = companion;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 64) != 0) {
                                i3 &= -3670017;
                            }
                            embedded2 = embedded4;
                            modifier3 = modifier2;
                        }
                        String strResolve = null;
                        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function34 = function32;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(805862142, i3, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:29)");
                        }
                        int i7 = (i3 >> 6) & 14;
                        int i8 = i3;
                        int iIcon = displayablePaymentMethod.icon(composerStartRestartGroup, i7);
                        String strIconUrl = displayablePaymentMethod.iconUrl(composerStartRestartGroup, i7);
                        String strResolve2 = ResolvableStringComposeUtilsKt.resolve(displayablePaymentMethod.getDisplayName(), composerStartRestartGroup, 0);
                        subtitle = displayablePaymentMethod.getSubtitle();
                        composerStartRestartGroup.startReplaceGroup(-1560062245);
                        if (subtitle != null) {
                            strResolve = ResolvableStringComposeUtilsKt.resolve(subtitle, composerStartRestartGroup, 0);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        String str = strResolve;
                        String promoBadge = displayablePaymentMethod.getPromoBadge();
                        boolean iconRequiresTinting = displayablePaymentMethod.getIconRequiresTinting();
                        Modifier modifierTestTag = TestTagKt.testTag(modifier3, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.getCode());
                        composerStartRestartGroup.startReplaceGroup(-1560057012);
                        zChangedInstance = composerStartRestartGroup.changedInstance(displayablePaymentMethod);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton$lambda$1$lambda$0(displayablePaymentMethod);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        NewPaymentMethodRowButton(z3, z4, iIcon, strIconUrl, imageLoader, strResolve2, str, promoBadge, iconRequiresTinting, (Function0) objRememberedValue, modifierTestTag, function34, embedded2, composer2, (i8 & WebSocketProtocol.PAYLOAD_SHORT) | (StripeImageLoader.$stable << 12) | ((i8 << 3) & 57344), (i8 >> 12) & PointerIconCompat.TYPE_TEXT, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        function33 = function34;
                        embedded3 = embedded2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        embedded3 = embedded4;
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        function33 = function32;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton$lambda$2(z, z2, displayablePaymentMethod, imageLoader, modifier4, function33, embedded3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function32 = function3;
                if ((1572864 & i) == 0) {
                }
                if ((599187 & i3) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if ((i2 & 64) != 0) {
                        }
                        embedded2 = embedded4;
                        modifier3 = companion;
                        String strResolve3 = null;
                        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function342 = function32;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i72 = (i3 >> 6) & 14;
                        int i82 = i3;
                        int iIcon2 = displayablePaymentMethod.icon(composerStartRestartGroup, i72);
                        String strIconUrl2 = displayablePaymentMethod.iconUrl(composerStartRestartGroup, i72);
                        String strResolve22 = ResolvableStringComposeUtilsKt.resolve(displayablePaymentMethod.getDisplayName(), composerStartRestartGroup, 0);
                        subtitle = displayablePaymentMethod.getSubtitle();
                        composerStartRestartGroup.startReplaceGroup(-1560062245);
                        if (subtitle != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        String str2 = strResolve3;
                        String promoBadge2 = displayablePaymentMethod.getPromoBadge();
                        boolean iconRequiresTinting2 = displayablePaymentMethod.getIconRequiresTinting();
                        Modifier modifierTestTag2 = TestTagKt.testTag(modifier3, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_" + displayablePaymentMethod.getCode());
                        composerStartRestartGroup.startReplaceGroup(-1560057012);
                        zChangedInstance = composerStartRestartGroup.changedInstance(displayablePaymentMethod);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton$lambda$1$lambda$0(displayablePaymentMethod);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            NewPaymentMethodRowButton(z3, z4, iIcon2, strIconUrl2, imageLoader, strResolve22, str2, promoBadge2, iconRequiresTinting2, (Function0) objRememberedValue, modifierTestTag2, function342, embedded2, composer2, (i82 & WebSocketProtocol.PAYLOAD_SHORT) | (StripeImageLoader.$stable << 12) | ((i82 << 3) & 57344), (i82 >> 12) & PointerIconCompat.TYPE_TEXT, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            function33 = function342;
                            embedded3 = embedded2;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            function32 = function3;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z4 = z2;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewPaymentMethodRowButton$lambda$1$lambda$0(DisplayablePaymentMethod displayablePaymentMethod) {
        displayablePaymentMethod.getOnClick().invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NewPaymentMethodRowButton(final boolean z, final boolean z2, final int i, final String str, final StripeImageLoader imageLoader, final String title, final String str2, final String str3, final boolean z3, final Function0<Unit> onClick, Modifier modifier, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, PaymentSheet.Appearance.Embedded embedded, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        String str4;
        String str5;
        String str6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function32;
        PaymentSheet.Appearance.Embedded embedded2;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        final PaymentSheet.Appearance.Embedded embedded3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(55108718);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            int i14 = 256;
            if ((i4 & 4) == 0) {
                i5 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
            } else {
                if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i6 = i;
                    i5 |= composerStartRestartGroup.changed(i6) ? 256 : 128;
                }
                if ((i4 & 8) != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 3072) == 0) {
                        str4 = str;
                        i5 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                    }
                    if ((i4 & 16) == 0) {
                        i5 |= 24576;
                    } else if ((i2 & 24576) == 0) {
                        i5 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(imageLoader) : composerStartRestartGroup.changedInstance(imageLoader) ? 16384 : 8192;
                    }
                    if ((i4 & 32) == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        i5 |= composerStartRestartGroup.changed(title) ? 131072 : 65536;
                    }
                    if ((i4 & 64) == 0) {
                        i5 |= 1572864;
                    } else {
                        if ((i2 & 1572864) == 0) {
                            str5 = str2;
                            i5 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                        }
                        if ((i4 & 128) != 0) {
                            i5 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                str6 = str3;
                                i5 |= composerStartRestartGroup.changed(str6) ? 8388608 : 4194304;
                            }
                            if ((i4 & 256) == 0) {
                                i5 |= 100663296;
                            } else {
                                if ((i2 & 100663296) == 0) {
                                    i5 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                if ((i4 & 512) == 0) {
                                    i13 = (805306368 & i2) == 0 ? composerStartRestartGroup.changedInstance(onClick) ? 536870912 : 268435456 : 805306368;
                                    i7 = i5;
                                    i8 = i4 & 1024;
                                    if (i8 == 0) {
                                        i10 = i3 | 6;
                                        i9 = i8;
                                    } else if ((i3 & 6) == 0) {
                                        i9 = i8;
                                        i10 = i3 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
                                    } else {
                                        i9 = i8;
                                        i10 = i3;
                                    }
                                    i11 = i4 & 2048;
                                    if (i11 != 0) {
                                        if ((i3 & 48) == 0) {
                                            i12 = i11;
                                            i10 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
                                        }
                                        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                            if ((i4 & 4096) != 0) {
                                                i14 = 128;
                                                i10 |= i14;
                                            } else {
                                                if (!((i3 & 512) == 0 ? composerStartRestartGroup.changed(embedded) : composerStartRestartGroup.changedInstance(embedded))) {
                                                }
                                                i10 |= i14;
                                            }
                                        }
                                        int i15 = i10;
                                        if ((i7 & 306783379) != 306783378 || (i15 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.startDefaults();
                                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                                Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                                                Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function33 = i12 == 0 ? null : function3;
                                                modifier = companion;
                                                if ((i4 & 4096) == 0) {
                                                    i15 &= -897;
                                                    function32 = function33;
                                                    embedded2 = new PaymentSheet.Appearance.Embedded(PaymentSheet.Appearance.Embedded.RowStyle.FloatingButton.INSTANCE.getDefault());
                                                    modifier2 = modifier;
                                                    composerStartRestartGroup.endDefaults();
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        modifier3 = modifier2;
                                                    } else {
                                                        modifier3 = modifier2;
                                                        ComposerKt.traceEventStart(55108718, i7, i15, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton (NewPaymentMethodRowButton.kt:64)");
                                                    }
                                                    int i16 = i15;
                                                    final int i17 = i6;
                                                    final String str7 = str4;
                                                    final Modifier modifier5 = modifier3;
                                                    PaymentMethodRowButtonKt.PaymentMethodRowButton(z, z2, false, false, ComposableLambdaKt.rememberComposableLambda(1411453836, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton.3
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                                            invoke(rowScope, composer3, num.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(RowScope PaymentMethodRowButton, Composer composer3, int i18) {
                                                            Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
                                                            if ((i18 & 17) != 16 || !composer3.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1411453836, i18, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:70)");
                                                                }
                                                                PaymentMethodIconKt.PaymentMethodIcon(i17, str7, imageLoader, z3, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(modifier5, UIConstants.INSTANCE.m8589getIconHeightD9Ej5fM()), UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM()), Alignment.INSTANCE.getCenter(), composer3, (StripeImageLoader.$stable << 6) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer3.skipToGroupEnd();
                                                        }
                                                    }, composerStartRestartGroup, 54), title, str5, str6, onClick, null, modifier5, embedded2, function32, composerStartRestartGroup, (i7 & 14) | 27648 | (i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (234881024 & (i7 >> 3)), (i16 & 14) | ((i16 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i16 << 3) & 896), 516);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                    composer2 = composerStartRestartGroup;
                                                    embedded3 = embedded2;
                                                    modifier4 = modifier5;
                                                } else {
                                                    function3 = function33;
                                                }
                                            } else {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                if ((i4 & 4096) != 0) {
                                                    i15 &= -897;
                                                }
                                            }
                                            modifier2 = modifier;
                                            function32 = function3;
                                            embedded2 = embedded;
                                            composerStartRestartGroup.endDefaults();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            int i162 = i15;
                                            final int i172 = i6;
                                            final String str72 = str4;
                                            final Modifier modifier52 = modifier3;
                                            PaymentMethodRowButtonKt.PaymentMethodRowButton(z, z2, false, false, ComposableLambdaKt.rememberComposableLambda(1411453836, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton.3
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                                    invoke(rowScope, composer3, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(RowScope PaymentMethodRowButton, Composer composer3, int i18) {
                                                    Intrinsics.checkNotNullParameter(PaymentMethodRowButton, "$this$PaymentMethodRowButton");
                                                    if ((i18 & 17) != 16 || !composer3.getSkipping()) {
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1411453836, i18, -1, "com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButton.<anonymous> (NewPaymentMethodRowButton.kt:70)");
                                                        }
                                                        PaymentMethodIconKt.PaymentMethodIcon(i172, str72, imageLoader, z3, SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(modifier52, UIConstants.INSTANCE.m8589getIconHeightD9Ej5fM()), UIConstants.INSTANCE.m8590getIconWidthD9Ej5fM()), Alignment.INSTANCE.getCenter(), composer3, (StripeImageLoader.$stable << 6) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer3.skipToGroupEnd();
                                                }
                                            }, composerStartRestartGroup, 54), title, str5, str6, onClick, null, modifier52, embedded2, function32, composerStartRestartGroup, (i7 & 14) | 27648 | (i7 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (234881024 & (i7 >> 3)), (i162 & 14) | ((i162 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | ((i162 << 3) & 896), 516);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            composer2 = composerStartRestartGroup;
                                            embedded3 = embedded2;
                                            modifier4 = modifier52;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            modifier4 = modifier;
                                            function32 = function3;
                                            composer2 = composerStartRestartGroup;
                                            embedded3 = embedded;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.verticalmode.NewPaymentMethodRowButtonKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function2
                                                public final Object invoke(Object obj, Object obj2) {
                                                    return NewPaymentMethodRowButtonKt.NewPaymentMethodRowButton$lambda$3(z, z2, i, str, imageLoader, title, str2, str3, z3, onClick, modifier4, function32, embedded3, i2, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i10 |= 48;
                                    i12 = i11;
                                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                    }
                                    int i152 = i10;
                                    if ((i7 & 306783379) != 306783378) {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i2 & 1) != 0) {
                                            if (i9 == 0) {
                                            }
                                            if (i12 == 0) {
                                            }
                                            modifier = companion;
                                            if ((i4 & 4096) == 0) {
                                            }
                                        }
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                i5 |= i13;
                                i7 = i5;
                                i8 = i4 & 1024;
                                if (i8 == 0) {
                                }
                                i11 = i4 & 2048;
                                if (i11 != 0) {
                                }
                                i12 = i11;
                                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                }
                                int i1522 = i10;
                                if ((i7 & 306783379) != 306783378) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            if ((i4 & 512) == 0) {
                            }
                            i5 |= i13;
                            i7 = i5;
                            i8 = i4 & 1024;
                            if (i8 == 0) {
                            }
                            i11 = i4 & 2048;
                            if (i11 != 0) {
                            }
                            i12 = i11;
                            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                            }
                            int i15222 = i10;
                            if ((i7 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        str6 = str3;
                        if ((i4 & 256) == 0) {
                        }
                        if ((i4 & 512) == 0) {
                        }
                        i5 |= i13;
                        i7 = i5;
                        i8 = i4 & 1024;
                        if (i8 == 0) {
                        }
                        i11 = i4 & 2048;
                        if (i11 != 0) {
                        }
                        i12 = i11;
                        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                        }
                        int i152222 = i10;
                        if ((i7 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    str5 = str2;
                    if ((i4 & 128) != 0) {
                    }
                    str6 = str3;
                    if ((i4 & 256) == 0) {
                    }
                    if ((i4 & 512) == 0) {
                    }
                    i5 |= i13;
                    i7 = i5;
                    i8 = i4 & 1024;
                    if (i8 == 0) {
                    }
                    i11 = i4 & 2048;
                    if (i11 != 0) {
                    }
                    i12 = i11;
                    if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    }
                    int i1522222 = i10;
                    if ((i7 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str4 = str;
                if ((i4 & 16) == 0) {
                }
                if ((i4 & 32) == 0) {
                }
                if ((i4 & 64) == 0) {
                }
                str5 = str2;
                if ((i4 & 128) != 0) {
                }
                str6 = str3;
                if ((i4 & 256) == 0) {
                }
                if ((i4 & 512) == 0) {
                }
                i5 |= i13;
                i7 = i5;
                i8 = i4 & 1024;
                if (i8 == 0) {
                }
                i11 = i4 & 2048;
                if (i11 != 0) {
                }
                i12 = i11;
                if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                }
                int i15222222 = i10;
                if ((i7 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i6 = i;
            if ((i4 & 8) != 0) {
            }
            str4 = str;
            if ((i4 & 16) == 0) {
            }
            if ((i4 & 32) == 0) {
            }
            if ((i4 & 64) == 0) {
            }
            str5 = str2;
            if ((i4 & 128) != 0) {
            }
            str6 = str3;
            if ((i4 & 256) == 0) {
            }
            if ((i4 & 512) == 0) {
            }
            i5 |= i13;
            i7 = i5;
            i8 = i4 & 1024;
            if (i8 == 0) {
            }
            i11 = i4 & 2048;
            if (i11 != 0) {
            }
            i12 = i11;
            if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            }
            int i152222222 = i10;
            if ((i7 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        int i142 = 256;
        if ((i4 & 4) == 0) {
        }
        i6 = i;
        if ((i4 & 8) != 0) {
        }
        str4 = str;
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        str5 = str2;
        if ((i4 & 128) != 0) {
        }
        str6 = str3;
        if ((i4 & 256) == 0) {
        }
        if ((i4 & 512) == 0) {
        }
        i5 |= i13;
        i7 = i5;
        i8 = i4 & 1024;
        if (i8 == 0) {
        }
        i11 = i4 & 2048;
        if (i11 != 0) {
        }
        i12 = i11;
        if ((i3 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
        }
        int i1522222222 = i10;
        if ((i7 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
