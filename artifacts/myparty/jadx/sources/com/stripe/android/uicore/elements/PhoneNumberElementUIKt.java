package com.stripe.android.uicore.elements;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.FormInsets;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PhoneNumberElementUI.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0004\u001a|\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a}\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0013\b\u0002\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010 \"\u0010\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\f\u0010\"\u001a\u0004\u0018\u00010#X\u008a\u0084\u0002²\u0006\n\u0010$\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010%\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010#X\u008a\u0084\u0002²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020\u0001X\u008a\u0084\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u0084\u0002²\u0006\n\u0010,\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"PHONE_NUMBER_TEXT_FIELD_TAG", "", "PhoneNumberCollectionPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "PhoneNumberCollectionSection", ViewProps.ENABLED, "", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "modifier", "Landroidx/compose/ui/Modifier;", "countryDropdown", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "isSelected", "sectionTitle", "", "requestFocusWhenShown", "moveToNextFieldOnceComplete", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "PhoneNumberCollectionSection-fhH9uAM", "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLjava/lang/Integer;ZZLandroidx/compose/ui/focus/FocusRequester;ILandroidx/compose/runtime/Composer;II)V", "PhoneNumberElementUI", "controller", "trailingIcon", "PhoneNumberElementUI-Rts_TWA", "(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;II)V", "CountryDropdown", "(Lcom/stripe/android/uicore/elements/PhoneNumberController;ZLandroidx/compose/runtime/Composer;I)V", "stripe-ui-core_release", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "value", "isComplete", "shouldShowError", "label", "Lcom/stripe/android/core/strings/ResolvableString;", ReactTextInputShadowNode.PROP_PLACEHOLDER, "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "hasFocus"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt {
    public static final String PHONE_NUMBER_TEXT_FIELD_TAG = "PhoneNumberTextField";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CountryDropdown$lambda$22(PhoneNumberController phoneNumberController, boolean z, int i, Composer composer, int i2) {
        CountryDropdown(phoneNumberController, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberCollectionPreview$lambda$0(int i, Composer composer, int i2) {
        PhoneNumberCollectionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberCollectionSection_fhH9uAM$lambda$6(boolean z, PhoneNumberController phoneNumberController, Modifier modifier, Function2 function2, boolean z2, Integer num, boolean z3, boolean z4, FocusRequester focusRequester, int i, int i2, int i3, Composer composer, int i4) {
        m8822PhoneNumberCollectionSectionfhH9uAM(z, phoneNumberController, modifier, function2, z2, num, z3, z4, focusRequester, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberElementUI_Rts_TWA$lambda$21(boolean z, PhoneNumberController phoneNumberController, Modifier modifier, Function2 function2, boolean z2, boolean z3, FocusRequester focusRequester, Function2 function22, int i, int i2, int i3, Composer composer, int i4) {
        m8823PhoneNumberElementUIRts_TWA(z, phoneNumberController, modifier, function2, z2, z3, focusRequester, function22, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    private static final void PhoneNumberCollectionPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2068137235);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2068137235, i, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionPreview (PhoneNumberElementUI.kt:56)");
            }
            m8822PhoneNumberCollectionSectionfhH9uAM(true, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "6508989787", null, null, false, false, 30, null), null, null, false, null, false, false, null, 0, composerStartRestartGroup, 6, PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhoneNumberElementUIKt.PhoneNumberCollectionPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* renamed from: PhoneNumberCollectionSection-fhH9uAM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8822PhoneNumberCollectionSectionfhH9uAM(final boolean z, final PhoneNumberController phoneNumberController, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, Integer num, boolean z3, boolean z4, FocusRequester focusRequester, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i6;
        boolean z5;
        int i7;
        Integer num2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        FocusRequester focusRequester2;
        FocusRequester focusRequester3;
        FieldError fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2;
        int i15;
        String strStringResource;
        String strStringResource2;
        final int i16;
        Composer composer2;
        final FocusRequester focusRequester4;
        final Modifier modifier3;
        final boolean z6;
        final boolean z7;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1253532877);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(phoneNumberController) ? 32 : 16;
        }
        int i17 = i3 & 4;
        if (i17 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function22 = function2;
                    i4 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        z5 = z2;
                        i4 |= composerStartRestartGroup.changed(z5) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else {
                        if ((196608 & i2) == 0) {
                            num2 = num;
                            i4 |= composerStartRestartGroup.changed(num2) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else {
                            if ((i2 & 12582912) == 0) {
                                i10 = i9;
                                i4 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                            }
                            i11 = i3 & 256;
                            if (i11 == 0) {
                                i4 |= 100663296;
                            } else {
                                if ((i2 & 100663296) == 0) {
                                    i12 = i11;
                                    i4 |= composerStartRestartGroup.changed(focusRequester) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                                }
                                i13 = i3 & 512;
                                if (i13 == 0) {
                                    if ((i2 & 805306368) == 0) {
                                        i14 = i13;
                                        i4 |= composerStartRestartGroup.changed(i) ? 536870912 : 268435456;
                                    }
                                    if ((i4 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                        if (i17 != 0) {
                                            modifier2 = Modifier.INSTANCE;
                                        }
                                        ComposableLambda composableLambdaRememberComposableLambda = i5 == 0 ? ComposableLambdaKt.rememberComposableLambda(1782499630, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberCollectionSection$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                                                invoke(composer3, num3.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i18) {
                                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1782499630, i18, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:69)");
                                                }
                                                PhoneNumberElementUIKt.CountryDropdown(phoneNumberController, z, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54) : function22;
                                        if (i6 != 0) {
                                            z5 = false;
                                        }
                                        if (i7 != 0) {
                                            num2 = null;
                                        }
                                        boolean z8 = i8 == 0 ? false : z3;
                                        boolean z9 = i10 == 0 ? false : z4;
                                        if (i12 == 0) {
                                            composerStartRestartGroup.startReplaceGroup(2009109340);
                                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue = new FocusRequester();
                                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                            }
                                            focusRequester2 = (FocusRequester) objRememberedValue;
                                            composerStartRestartGroup.endReplaceGroup();
                                        } else {
                                            focusRequester2 = focusRequester;
                                        }
                                        int iM5781getDoneeUduSuo = i14 == 0 ? ImeAction.INSTANCE.m5781getDoneeUduSuo() : i;
                                        if (ComposerKt.isTraceInProgress()) {
                                            focusRequester3 = focusRequester2;
                                        } else {
                                            focusRequester3 = focusRequester2;
                                            ComposerKt.traceEventStart(-1253532877, i4, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection (PhoneNumberElementUI.kt:76)");
                                        }
                                        fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2 = PhoneNumberCollectionSection_fhH9uAM$lambda$2(StateFlowsComposeKt.collectAsState(phoneNumberController.getError(), null, composerStartRestartGroup, 0, 1));
                                        composerStartRestartGroup.startReplaceGroup(2009115133);
                                        if (fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2 != null) {
                                            strStringResource2 = null;
                                        } else {
                                            Object[] formatArgs = fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2.getFormatArgs();
                                            composerStartRestartGroup.startReplaceGroup(2009115991);
                                            if (formatArgs == null) {
                                                strStringResource = null;
                                                i15 = 0;
                                            } else {
                                                i15 = 0;
                                                strStringResource = StringResources_androidKt.stringResource(fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2.getErrorMessage(), Arrays.copyOf(formatArgs, formatArgs.length), composerStartRestartGroup, 0);
                                            }
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup.startReplaceGroup(2009115561);
                                            strStringResource2 = strStringResource == null ? StringResources_androidKt.stringResource(fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2.getErrorMessage(), composerStartRestartGroup, i15) : strStringResource;
                                            composerStartRestartGroup.endReplaceGroup();
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        final FocusRequester focusRequester5 = focusRequester3;
                                        final int i18 = iM5781getDoneeUduSuo;
                                        final Function2<? super Composer, ? super Integer, Unit> function24 = composableLambdaRememberComposableLambda;
                                        final Modifier modifier4 = modifier2;
                                        final boolean z10 = z8;
                                        final boolean z11 = z9;
                                        i16 = i18;
                                        SectionUIKt.Section(num2 == null ? ResolvableStringUtilsKt.resolvableString$default(num2.intValue(), new Object[0], null, 4, null) : null, strStringResource2, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), z5, ComposableLambdaKt.rememberComposableLambda(-247884311, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberCollectionSection$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                                                invoke(composer3, num3.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i19) {
                                                if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-247884311, i19, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:94)");
                                                    }
                                                    PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z, phoneNumberController, modifier4, function24, z10, z11, focusRequester5, null, i18, composer3, 0, 128);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }
                                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 7168) | 24960, 0);
                                        composer2 = composerStartRestartGroup;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        focusRequester4 = focusRequester5;
                                        modifier3 = modifier2;
                                        z6 = z10;
                                        z7 = z11;
                                        function23 = composableLambdaRememberComposableLambda;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z7 = z4;
                                        i16 = i;
                                        composer2 = composerStartRestartGroup;
                                        modifier3 = modifier2;
                                        function23 = function22;
                                        z6 = z3;
                                        focusRequester4 = focusRequester;
                                    }
                                    final boolean z12 = z5;
                                    final Integer num3 = num2;
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return PhoneNumberElementUIKt.PhoneNumberCollectionSection_fhH9uAM$lambda$6(z, phoneNumberController, modifier3, function23, z12, num3, z6, z7, focusRequester4, i16, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i4 |= 805306368;
                                i14 = i13;
                                if ((i4 & 306783379) == 306783378) {
                                    if (i17 != 0) {
                                    }
                                    if (i5 == 0) {
                                    }
                                    if (i6 != 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i12 == 0) {
                                    }
                                    if (i14 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2 = PhoneNumberCollectionSection_fhH9uAM$lambda$2(StateFlowsComposeKt.collectAsState(phoneNumberController.getError(), null, composerStartRestartGroup, 0, 1));
                                    composerStartRestartGroup.startReplaceGroup(2009115133);
                                    if (fieldErrorPhoneNumberCollectionSection_fhH9uAM$lambda$2 != null) {
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    final FocusRequester focusRequester52 = focusRequester3;
                                    final int i182 = iM5781getDoneeUduSuo;
                                    final Function2<? super Composer, ? super Integer, Unit> function242 = composableLambdaRememberComposableLambda;
                                    final Modifier modifier42 = modifier2;
                                    final boolean z102 = z8;
                                    final boolean z112 = z9;
                                    i16 = i182;
                                    SectionUIKt.Section(num2 == null ? ResolvableStringUtilsKt.resolvableString$default(num2.intValue(), new Object[0], null, 4, null) : null, strStringResource2, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 1, null), z5, ComposableLambdaKt.rememberComposableLambda(-247884311, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberCollectionSection$4
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num32) {
                                            invoke(composer3, num32.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i19) {
                                            if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-247884311, i19, -1, "com.stripe.android.uicore.elements.PhoneNumberCollectionSection.<anonymous> (PhoneNumberElementUI.kt:94)");
                                                }
                                                PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z, phoneNumberController, modifier42, function242, z102, z112, focusRequester52, null, i182, composer3, 0, 128);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 7168) | 24960, 0);
                                    composer2 = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    focusRequester4 = focusRequester52;
                                    modifier3 = modifier2;
                                    z6 = z102;
                                    z7 = z112;
                                    function23 = composableLambdaRememberComposableLambda;
                                }
                                final boolean z122 = z5;
                                final Integer num32 = num2;
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i12 = i11;
                            i13 = i3 & 512;
                            if (i13 == 0) {
                            }
                            i14 = i13;
                            if ((i4 & 306783379) == 306783378) {
                            }
                            final boolean z1222 = z5;
                            final Integer num322 = num2;
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i10 = i9;
                        i11 = i3 & 256;
                        if (i11 == 0) {
                        }
                        i12 = i11;
                        i13 = i3 & 512;
                        if (i13 == 0) {
                        }
                        i14 = i13;
                        if ((i4 & 306783379) == 306783378) {
                        }
                        final boolean z12222 = z5;
                        final Integer num3222 = num2;
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    num2 = num;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i9;
                    i11 = i3 & 256;
                    if (i11 == 0) {
                    }
                    i12 = i11;
                    i13 = i3 & 512;
                    if (i13 == 0) {
                    }
                    i14 = i13;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    final boolean z122222 = z5;
                    final Integer num32222 = num2;
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z5 = z2;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                num2 = num;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i3 & 256;
                if (i11 == 0) {
                }
                i12 = i11;
                i13 = i3 & 512;
                if (i13 == 0) {
                }
                i14 = i13;
                if ((i4 & 306783379) == 306783378) {
                }
                final boolean z1222222 = z5;
                final Integer num322222 = num2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function22 = function2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            z5 = z2;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            num2 = num;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i3 & 256;
            if (i11 == 0) {
            }
            i12 = i11;
            i13 = i3 & 512;
            if (i13 == 0) {
            }
            i14 = i13;
            if ((i4 & 306783379) == 306783378) {
            }
            final boolean z12222222 = z5;
            final Integer num3222222 = num2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function22 = function2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        z5 = z2;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        num2 = num;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 256;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 512;
        if (i13 == 0) {
        }
        i14 = i13;
        if ((i4 & 306783379) == 306783378) {
        }
        final boolean z122222222 = z5;
        final Integer num32222222 = num2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f9  */
    /* renamed from: PhoneNumberElementUI-Rts_TWA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8823PhoneNumberElementUIRts_TWA(final boolean z, final PhoneNumberController controller, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, boolean z3, FocusRequester focusRequester, Function2<? super Composer, ? super Integer, Unit> function22, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        Function2<? super Composer, ? super Integer, Unit> function23;
        int i6;
        int i7;
        boolean z4;
        int i8;
        FocusRequester focusRequester2;
        int i9;
        int i10;
        int i11;
        boolean z5;
        boolean z6;
        FocusRequester focusRequester3;
        Object objRememberedValue;
        Object objRememberedValue2;
        State stateCollectAsState;
        Object obj;
        boolean z7;
        Object objRememberedValue3;
        State state;
        boolean z8;
        Composer composer2;
        final int i12;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z9;
        final boolean z10;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        PhoneNumberElementUIKt$PhoneNumberElementUI$3$1 phoneNumberElementUIKt$PhoneNumberElementUI$3$1;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(controller, "controller");
        Composer composerStartRestartGroup = composer.startRestartGroup(63118860);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(controller) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i2 & 3072) == 0) {
                    function23 = function2;
                    i4 |= composerStartRestartGroup.changedInstance(function23) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                } else {
                    if ((i2 & 24576) == 0) {
                        i4 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else {
                        if ((196608 & i2) == 0) {
                            z4 = z3;
                            i4 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                        }
                        i8 = i3 & 64;
                        if (i8 != 0) {
                            i4 |= 1572864;
                            focusRequester2 = focusRequester;
                        } else {
                            focusRequester2 = focusRequester;
                            if ((i2 & 1572864) == 0) {
                                i4 |= composerStartRestartGroup.changed(focusRequester2) ? 1048576 : 524288;
                            }
                        }
                        i9 = i3 & 128;
                        if (i9 != 0) {
                            i4 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        i10 = i3 & 256;
                        if (i10 == 0) {
                            if ((i2 & 100663296) == 0) {
                                i11 = i10;
                                i4 |= composerStartRestartGroup.changed(i) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier3 = i13 == 0 ? Modifier.INSTANCE : modifier2;
                                ComposableLambda composableLambdaRememberComposableLambda = i5 == 0 ? ComposableLambdaKt.rememberComposableLambda(-1195815929, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i14) {
                                        if ((i14 & 3) == 2 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1195815929, i14, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI.<anonymous> (PhoneNumberElementUI.kt:115)");
                                        }
                                        PhoneNumberElementUIKt.CountryDropdown(controller, z, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54) : function23;
                                z5 = i6 == 0 ? false : z2;
                                z6 = i7 == 0 ? false : z4;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(304103077);
                                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    focusRequester3 = (FocusRequester) objRememberedValue4;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    focusRequester3 = focusRequester2;
                                }
                                Function2<? super Composer, ? super Integer, Unit> function26 = i9 == 0 ? null : function22;
                                int iM5781getDoneeUduSuo = i11 == 0 ? ImeAction.INSTANCE.m5781getDoneeUduSuo() : i;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(63118860, i4, -1, "com.stripe.android.uicore.elements.PhoneNumberElementUI (PhoneNumberElementUI.kt:121)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.startReplaceGroup(304109901);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                BringIntoViewRequester bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                FocusManager focusManager = (FocusManager) objConsume;
                                State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(controller.getFieldValue(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(controller.isComplete(), null, composerStartRestartGroup, 0, 1);
                                stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.getError(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState4 = StateFlowsComposeKt.collectAsState(controller.getLabel(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState5 = StateFlowsComposeKt.collectAsState(controller.getPlaceholder(), null, composerStartRestartGroup, 0, 1);
                                State stateCollectAsState6 = StateFlowsComposeKt.collectAsState(controller.getVisualTransformation(), null, composerStartRestartGroup, 0, 1);
                                if (PhoneNumberElementUI_Rts_TWA$lambda$11(stateCollectAsState) == null) {
                                    obj = null;
                                    z7 = true;
                                } else {
                                    obj = null;
                                    z7 = false;
                                }
                                TextFieldColors textFieldColorsM8847TextFieldColorsGyCwops = TextFieldUIKt.m8847TextFieldColorsGyCwops(z7, 0L, 0L, 0L, composerStartRestartGroup, 0, 14);
                                Object[] objArr = new Object[0];
                                composerStartRestartGroup.startReplaceGroup(304127681);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$16$lambda$15();
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                                ProvidableCompositionLocal<FormInsets> localTextFieldInsets = StripeThemeKt.getLocalTextFieldInsets();
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                Object objConsume2 = composerStartRestartGroup.consume(localTextFieldInsets);
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                FormInsets formInsets = (FormInsets) objConsume2;
                                composerStartRestartGroup.startReplaceGroup(304130617);
                                if (z6) {
                                    state = stateCollectAsState4;
                                    z8 = false;
                                } else {
                                    Boolean boolValueOf = Boolean.valueOf(PhoneNumberElementUI_Rts_TWA$lambda$10(stateCollectAsState3));
                                    composerStartRestartGroup.startReplaceGroup(304132781);
                                    boolean zChanged = composerStartRestartGroup.changed(stateCollectAsState3) | composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(focusManager);
                                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged) {
                                        state = stateCollectAsState4;
                                    } else {
                                        state = stateCollectAsState4;
                                        if (objRememberedValue5 != Composer.INSTANCE.getEmpty()) {
                                            phoneNumberElementUIKt$PhoneNumberElementUI$3$1 = objRememberedValue5;
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        z8 = false;
                                        EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) phoneNumberElementUIKt$PhoneNumberElementUI$3$1, composerStartRestartGroup, 0);
                                    }
                                    phoneNumberElementUIKt$PhoneNumberElementUI$3$1 = new PhoneNumberElementUIKt$PhoneNumberElementUI$3$1(focusManager, stateCollectAsState3, mutableState, null);
                                    composerStartRestartGroup.updateRememberedValue(phoneNumberElementUIKt$PhoneNumberElementUI$3$1);
                                    composerStartRestartGroup.endReplaceGroup();
                                    z8 = false;
                                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) phoneNumberElementUIKt$PhoneNumberElementUI$3$1, composerStartRestartGroup, 0);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                int i14 = i4;
                                FocusRequester focusRequester4 = focusRequester3;
                                boolean z11 = z8;
                                Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                Function2<? super Composer, ? super Integer, Unit> function28 = composableLambdaRememberComposableLambda;
                                int i15 = iM5781getDoneeUduSuo;
                                composer2 = composerStartRestartGroup;
                                CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambdaKt.rememberComposableLambda(1206588108, true, new PhoneNumberElementUIKt$PhoneNumberElementUI$4(controller, modifier3, bringIntoViewRequester, focusRequester4, coroutineScope, mutableState, i15, focusManager, formInsets, z, function28, function27, textFieldColorsM8847TextFieldColorsGyCwops, stateCollectAsState2, stateCollectAsState6, state, stateCollectAsState5), composer2, 54), composer2, ProvidedValue.$stable | 48);
                                if (z5) {
                                    Unit unit = Unit.INSTANCE;
                                    composer2.startReplaceGroup(304212549);
                                    boolean z12 = (i14 & 3670016) != 1048576 ? z11 : true;
                                    PhoneNumberElementUIKt$PhoneNumberElementUI$5$1 phoneNumberElementUIKt$PhoneNumberElementUI$5$1RememberedValue = composer2.rememberedValue();
                                    if (z12 || phoneNumberElementUIKt$PhoneNumberElementUI$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                        phoneNumberElementUIKt$PhoneNumberElementUI$5$1RememberedValue = new PhoneNumberElementUIKt$PhoneNumberElementUI$5$1(focusRequester4, null);
                                        composer2.updateRememberedValue(phoneNumberElementUIKt$PhoneNumberElementUI$5$1RememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) phoneNumberElementUIKt$PhoneNumberElementUI$5$1RememberedValue, composer2, 6);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i12 = i15;
                                function24 = function27;
                                z9 = z5;
                                z10 = z6;
                                modifier2 = modifier3;
                                focusRequester2 = focusRequester4;
                                function25 = function28;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z9 = z2;
                                function24 = function22;
                                composer2 = composerStartRestartGroup;
                                function25 = function23;
                                z10 = z4;
                                i12 = i;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier2;
                                final FocusRequester focusRequester5 = focusRequester2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        return PhoneNumberElementUIKt.PhoneNumberElementUI_Rts_TWA$lambda$21(z, controller, modifier4, function25, z9, z10, focusRequester5, function24, i12, i2, i3, (Composer) obj2, ((Integer) obj3).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        i11 = i10;
                        if ((i4 & 38347923) == 38347922) {
                            if (i13 == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            composerStartRestartGroup.startReplaceGroup(304109901);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            }
                            BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume3 = composerStartRestartGroup.consume(localFocusManager2);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            FocusManager focusManager2 = (FocusManager) objConsume3;
                            State stateCollectAsState22 = StateFlowsComposeKt.collectAsState(controller.getFieldValue(), null, composerStartRestartGroup, 0, 1);
                            State stateCollectAsState32 = StateFlowsComposeKt.collectAsState(controller.isComplete(), null, composerStartRestartGroup, 0, 1);
                            stateCollectAsState = StateFlowsComposeKt.collectAsState(controller.getError(), null, composerStartRestartGroup, 0, 1);
                            State stateCollectAsState42 = StateFlowsComposeKt.collectAsState(controller.getLabel(), null, composerStartRestartGroup, 0, 1);
                            State stateCollectAsState52 = StateFlowsComposeKt.collectAsState(controller.getPlaceholder(), null, composerStartRestartGroup, 0, 1);
                            State stateCollectAsState62 = StateFlowsComposeKt.collectAsState(controller.getVisualTransformation(), null, composerStartRestartGroup, 0, 1);
                            if (PhoneNumberElementUI_Rts_TWA$lambda$11(stateCollectAsState) == null) {
                            }
                            TextFieldColors textFieldColorsM8847TextFieldColorsGyCwops2 = TextFieldUIKt.m8847TextFieldColorsGyCwops(z7, 0L, 0L, 0L, composerStartRestartGroup, 0, 14);
                            Object[] objArr2 = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(304127681);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                            ProvidableCompositionLocal<FormInsets> localTextFieldInsets2 = StripeThemeKt.getLocalTextFieldInsets();
                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                            Object objConsume22 = composerStartRestartGroup.consume(localTextFieldInsets2);
                            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                            FormInsets formInsets2 = (FormInsets) objConsume22;
                            composerStartRestartGroup.startReplaceGroup(304130617);
                            if (z6) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i142 = i4;
                            FocusRequester focusRequester42 = focusRequester3;
                            boolean z112 = z8;
                            Function2<? super Composer, ? super Integer, Unit> function272 = function26;
                            Function2<? super Composer, ? super Integer, Unit> function282 = composableLambdaRememberComposableLambda;
                            int i152 = iM5781getDoneeUduSuo;
                            composer2 = composerStartRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalLayoutDirection().provides(LayoutDirection.Ltr), ComposableLambdaKt.rememberComposableLambda(1206588108, true, new PhoneNumberElementUIKt$PhoneNumberElementUI$4(controller, modifier3, bringIntoViewRequester2, focusRequester42, coroutineScope2, mutableState2, i152, focusManager2, formInsets2, z, function282, function272, textFieldColorsM8847TextFieldColorsGyCwops2, stateCollectAsState22, stateCollectAsState62, state, stateCollectAsState52), composer2, 54), composer2, ProvidedValue.$stable | 48);
                            if (z5) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            i12 = i152;
                            function24 = function272;
                            z9 = z5;
                            z10 = z6;
                            modifier2 = modifier3;
                            focusRequester2 = focusRequester42;
                            function25 = function282;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    z4 = z3;
                    i8 = i3 & 64;
                    if (i8 != 0) {
                    }
                    i9 = i3 & 128;
                    if (i9 != 0) {
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                    }
                    i11 = i10;
                    if ((i4 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                z4 = z3;
                i8 = i3 & 64;
                if (i8 != 0) {
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i10;
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function23 = function2;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            z4 = z3;
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i10;
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function23 = function2;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        z4 = z3;
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i10;
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState PhoneNumberElementUI_Rts_TWA$lambda$16$lambda$15() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PhoneNumberElementUI_Rts_TWA$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PhoneNumberElementUI_Rts_TWA$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CountryDropdown(final PhoneNumberController phoneNumberController, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1587728102);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(phoneNumberController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587728102, i2, -1, "com.stripe.android.uicore.elements.CountryDropdown (PhoneNumberElementUI.kt:219)");
            }
            DropdownFieldUIKt.DropDown(phoneNumberController.getCountryDropdownController(), z, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl((float) 11.7d), 0.0f, Dp.m6117constructorimpl(8), 0.0f, 10, null), false, composerStartRestartGroup, (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.uicore.elements.PhoneNumberElementUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PhoneNumberElementUIKt.CountryDropdown$lambda$22(phoneNumberController, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final FieldError PhoneNumberCollectionSection_fhH9uAM$lambda$2(State<FieldError> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PhoneNumberElementUI_Rts_TWA$lambda$9(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PhoneNumberElementUI_Rts_TWA$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final FieldError PhoneNumberElementUI_Rts_TWA$lambda$11(State<FieldError> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString PhoneNumberElementUI_Rts_TWA$lambda$12(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PhoneNumberElementUI_Rts_TWA$lambda$13(State<String> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisualTransformation PhoneNumberElementUI_Rts_TWA$lambda$14(State<? extends VisualTransformation> state) {
        return state.getValue();
    }
}
