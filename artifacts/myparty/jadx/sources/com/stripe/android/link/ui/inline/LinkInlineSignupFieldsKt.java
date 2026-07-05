package com.stripe.android.link.ui.inline;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.elements.HyperlinkedTextKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.PhoneNumberElementUIKt;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkInlineSignupFields.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u009f\u0001\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"LinkLogoModifier", "Landroidx/compose/ui/Modifier;", "LinkInlineSignupFields", "", "sectionError", "", "emailController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", ViewProps.ENABLED, "", "isShowingPhoneFirst", "requiresNameCollection", "allowsDefaultOptIn", "errorMessage", "", "didShowAllFields", "onShowingAllFields", "Lkotlin/Function0;", "modifier", "emailFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "phoneFocusRequester", "nameFocusRequester", "(Ljava/lang/Integer;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;III)V", "LinkInlineErrorText", "text", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewLinkInlineSignupFields", "(Landroidx/compose/runtime/Composer;I)V", "LINK_INLINE_SIGNUP_REMAINING_FIELDS_TEST_TAG", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkInlineSignupFieldsKt {
    public static final String LINK_INLINE_SIGNUP_REMAINING_FIELDS_TEST_TAG = "LinkInlineSignupRemainingFields";
    private static final Modifier LinkLogoModifier = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 11, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkInlineErrorText$lambda$6(String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkInlineErrorText(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkInlineSignupFields$lambda$4(Integer num, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, SignUpState signUpState, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, Function0 function0, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, int i, int i2, int i3, Composer composer, int i4) {
        LinkInlineSignupFields(num, textFieldController, phoneNumberController, textFieldController2, signUpState, z, z2, z3, z4, str, z5, function0, modifier, focusRequester, focusRequester2, focusRequester3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLinkInlineSignupFields$lambda$9(int i, Composer composer, int i2) {
        PreviewLinkInlineSignupFields(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkInlineSignupFields(final Integer num, final TextFieldController emailController, final PhoneNumberController phoneNumberController, final TextFieldController nameController, final SignUpState signUpState, final boolean z, final boolean z2, final boolean z3, final boolean z4, final String str, final boolean z5, final Function0<Unit> onShowingAllFields, Modifier modifier, FocusRequester focusRequester, FocusRequester focusRequester2, FocusRequester focusRequester3, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        Modifier modifier2;
        FocusRequester focusRequester4;
        FocusRequester focusRequester5;
        FocusRequester focusRequester6;
        FocusRequester focusRequester7;
        final FocusRequester focusRequester8;
        Modifier modifier3;
        Composer composer2;
        final FocusRequester focusRequester9;
        final FocusRequester focusRequester10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Intrinsics.checkNotNullParameter(onShowingAllFields, "onShowingAllFields");
        Composer composerStartRestartGroup = composer.startRestartGroup(515001021);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(num) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(emailController) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= (i & 512) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(nameController) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(signUpState) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                z6 = z;
                i4 |= composerStartRestartGroup.changed(z6) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
                z7 = z2;
            } else {
                z7 = z2;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z7) ? 1048576 : 524288;
                }
            }
            if ((i3 & 128) == 0) {
                i4 |= 12582912;
            } else {
                if ((12582912 & i) == 0) {
                    z8 = z3;
                    i4 |= composerStartRestartGroup.changed(z8) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i4 |= 100663296;
                } else {
                    if ((100663296 & i) == 0) {
                        z9 = z4;
                        i4 |= composerStartRestartGroup.changed(z9) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    if ((i3 & 512) == 0) {
                        i4 |= 805306368;
                    } else {
                        if ((805306368 & i) == 0) {
                            str2 = str;
                            i4 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 1024) != 0) {
                            i5 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i5 = i2 | (composerStartRestartGroup.changed(z5) ? 4 : 2);
                        } else {
                            i5 = i2;
                        }
                        if ((i3 & 2048) != 0) {
                            i5 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i5 |= composerStartRestartGroup.changedInstance(onShowingAllFields) ? 32 : 16;
                        }
                        int i14 = i5;
                        i6 = i3 & 4096;
                        if (i6 != 0) {
                            i7 = i14 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else {
                            int i15 = i14;
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i15 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
                            }
                            i7 = i15;
                        }
                        i8 = i3 & 8192;
                        if (i8 != 0) {
                            i9 = i7 | 3072;
                        } else {
                            int i16 = i7;
                            if ((i2 & 3072) == 0) {
                                i16 |= composerStartRestartGroup.changed(focusRequester) ? 2048 : 1024;
                            }
                            i9 = i16;
                        }
                        i10 = i3 & 16384;
                        if (i10 == 0) {
                            i11 = i9;
                            if ((i2 & 24576) == 0) {
                                i11 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
                            }
                            i12 = i3 & 32768;
                            if (i12 == 0) {
                                i11 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i11 |= composerStartRestartGroup.changed(focusRequester3) ? 131072 : 65536;
                            }
                            i13 = i11;
                            if ((i4 & 306783379) == 306783378 || (74899 & i13) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier;
                                if (i8 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(-280033539);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    modifier2 = companion;
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    focusRequester4 = (FocusRequester) objRememberedValue;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    modifier2 = companion;
                                    focusRequester4 = focusRequester;
                                }
                                if (i10 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(-280031203);
                                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    focusRequester5 = focusRequester4;
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    focusRequester6 = (FocusRequester) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    focusRequester5 = focusRequester4;
                                    focusRequester6 = focusRequester2;
                                }
                                if (i12 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(-280028899);
                                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    focusRequester7 = focusRequester6;
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    focusRequester8 = (FocusRequester) objRememberedValue3;
                                } else {
                                    focusRequester7 = focusRequester6;
                                    focusRequester8 = focusRequester3;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(515001021, i4, i13, "com.stripe.android.link.ui.inline.LinkInlineSignupFields (LinkInlineSignupFields.kt:61)");
                                }
                                composerStartRestartGroup.startReplaceGroup(-280025702);
                                String strStringResource = num != null ? null : StringResources_androidKt.stringResource(num.intValue(), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                final boolean z10 = z6;
                                final boolean z11 = z9;
                                final boolean z12 = z8;
                                final String str3 = str2;
                                final boolean z13 = z7;
                                final FocusRequester focusRequester11 = focusRequester5;
                                final FocusRequester focusRequester12 = focusRequester7;
                                modifier3 = modifier2;
                                composer2 = composerStartRestartGroup;
                                SectionUIKt.Section(null, strStringResource, modifier3, false, ComposableLambdaKt.rememberComposableLambda(212828019, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                        invoke(composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i17) {
                                        int iM5781getDoneeUduSuo;
                                        Composer composer4;
                                        int iM5781getDoneeUduSuo2;
                                        if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(212828019, i17, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:67)");
                                            }
                                            if (z13) {
                                                composer3.startReplaceGroup(1695073760);
                                                if (signUpState == SignUpState.InputtingRemainingFields) {
                                                    iM5781getDoneeUduSuo2 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                } else {
                                                    iM5781getDoneeUduSuo2 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                }
                                                PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z10, phoneNumberController, null, null, false, true, focusRequester12, !z11 ? ComposableSingletons$LinkInlineSignupFieldsKt.INSTANCE.m7874getLambda1$paymentsheet_release() : null, iM5781getDoneeUduSuo2, composer3, (PhoneNumberController.$stable << 3) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                                composer4 = composer3;
                                                composer4.endReplaceGroup();
                                            } else {
                                                composer3.startReplaceGroup(1695748847);
                                                boolean z14 = z10;
                                                TextFieldController textFieldController = emailController;
                                                SignUpState signUpState2 = signUpState;
                                                if (signUpState2 == SignUpState.InputtingRemainingFields) {
                                                    iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                } else {
                                                    iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                }
                                                LinkOptionalInlineSignupKt.m7901EmailCollection7FxtGnE(z14, textFieldController, signUpState2, iM5781getDoneeUduSuo, focusRequester11, false, !z11 ? ComposableSingletons$LinkInlineSignupFieldsKt.INSTANCE.m7875getLambda2$paymentsheet_release() : null, composer3, 0, 32);
                                                composer4 = composer3;
                                                composer4.endReplaceGroup();
                                            }
                                            boolean z15 = (signUpState == SignUpState.InputtingRemainingFields || str3 == null) ? false : true;
                                            final String str4 = str3;
                                            AnimatedVisibilityKt.AnimatedVisibility(z15, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1176669595, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.1
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num2) {
                                                    invoke(animatedVisibilityScope, composer5, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i18) {
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1176669595, i18, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:110)");
                                                    }
                                                    final String str5 = str4;
                                                    ThemeKt.DefaultLinkTheme(false, ComposableLambdaKt.rememberComposableLambda(1195680927, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.1.1
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num2) {
                                                            invoke(composer6, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(Composer composer6, int i19) {
                                                            if ((i19 & 3) != 2 || !composer6.getSkipping()) {
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(1195680927, i19, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:111)");
                                                                }
                                                                String str6 = str5;
                                                                if (str6 == null) {
                                                                    str6 = "";
                                                                }
                                                                LinkInlineSignupFieldsKt.LinkInlineErrorText(str6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer6, 48, 0);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            composer6.skipToGroupEnd();
                                                        }
                                                    }, composer5, 54), composer5, 48, 1);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                            boolean z16 = z5 || signUpState == SignUpState.InputtingRemainingFields;
                                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            final Function0<Unit> function0 = onShowingAllFields;
                                            final boolean z17 = z13;
                                            final boolean z18 = z10;
                                            final TextFieldController textFieldController2 = emailController;
                                            final SignUpState signUpState3 = signUpState;
                                            final boolean z19 = z12;
                                            final FocusRequester focusRequester13 = focusRequester11;
                                            final boolean z20 = z11;
                                            final PhoneNumberController phoneNumberController2 = phoneNumberController;
                                            final FocusRequester focusRequester14 = focusRequester12;
                                            final TextFieldController textFieldController3 = nameController;
                                            boolean z21 = z16;
                                            final FocusRequester focusRequester15 = focusRequester8;
                                            final String str5 = str3;
                                            AnimatedVisibilityKt.AnimatedVisibility(z21, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(252279748, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.2
                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num2) {
                                                    invoke(animatedVisibilityScope, composer5, num2.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i18) {
                                                    int iM5781getDoneeUduSuo3;
                                                    boolean z22;
                                                    Composer composer6;
                                                    boolean z23;
                                                    boolean z24;
                                                    int iM5781getDoneeUduSuo4;
                                                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(252279748, i18, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:122)");
                                                    }
                                                    Unit unit = Unit.INSTANCE;
                                                    composer5.startReplaceGroup(-1787576622);
                                                    boolean zChanged = composer5.changed(function0);
                                                    Function0<Unit> function02 = function0;
                                                    LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1 linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue = composer5.rememberedValue();
                                                    if (zChanged || linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                                        linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue = new LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1(function02, null);
                                                        composer5.updateRememberedValue(linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue);
                                                    }
                                                    composer5.endReplaceGroup();
                                                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue, composer5, 6);
                                                    Modifier modifierTestTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), LinkInlineSignupFieldsKt.LINK_INLINE_SIGNUP_REMAINING_FIELDS_TEST_TAG);
                                                    boolean z25 = z17;
                                                    boolean z26 = z18;
                                                    TextFieldController textFieldController4 = textFieldController2;
                                                    SignUpState signUpState4 = signUpState3;
                                                    boolean z27 = z19;
                                                    FocusRequester focusRequester16 = focusRequester13;
                                                    boolean z28 = z20;
                                                    PhoneNumberController phoneNumberController3 = phoneNumberController2;
                                                    FocusRequester focusRequester17 = focusRequester14;
                                                    TextFieldController textFieldController5 = textFieldController3;
                                                    FocusRequester focusRequester18 = focusRequester15;
                                                    final String str6 = str5;
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierTestTag);
                                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                    if (!(composer5.getApplier() instanceof Applier)) {
                                                        ComposablesKt.invalidApplier();
                                                    }
                                                    composer5.startReusableNode();
                                                    if (composer5.getInserting()) {
                                                        composer5.createNode(constructor);
                                                    } else {
                                                        composer5.useNode();
                                                    }
                                                    Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                    if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                    }
                                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                    DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer5, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer5, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer5, 0, 9);
                                                    if (z25) {
                                                        composer5.startReplaceGroup(1069130156);
                                                        if (z27) {
                                                            iM5781getDoneeUduSuo4 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                        } else {
                                                            iM5781getDoneeUduSuo4 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                        }
                                                        LinkOptionalInlineSignupKt.m7901EmailCollection7FxtGnE(z26, textFieldController4, signUpState4, iM5781getDoneeUduSuo4, focusRequester16, false, null, composer5, 0, 96);
                                                        composer6 = composer5;
                                                        composer6.endReplaceGroup();
                                                        z22 = z27;
                                                        z23 = z26;
                                                    } else {
                                                        composer5.startReplaceGroup(1069642772);
                                                        boolean z29 = !z28 && phoneNumberController3.getInitialPhoneNumber().length() == 0;
                                                        if (z27) {
                                                            iM5781getDoneeUduSuo3 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                        } else {
                                                            iM5781getDoneeUduSuo3 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                        }
                                                        PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z26, phoneNumberController3, null, null, z29, z27, focusRequester17, null, iM5781getDoneeUduSuo3, composer5, PhoneNumberController.$stable << 3, 140);
                                                        z22 = z27;
                                                        composer6 = composer5;
                                                        z23 = z26;
                                                        composer6.endReplaceGroup();
                                                    }
                                                    DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer6, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer6, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer6, 0, 9);
                                                    composer6.startReplaceGroup(588722523);
                                                    if (z22) {
                                                        z24 = false;
                                                        TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController5, z23, ImeAction.INSTANCE.m5781getDoneeUduSuo(), null, null, 0, 0, focusRequester18, false, false, composer5, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 888);
                                                        composer6 = composer5;
                                                    } else {
                                                        z24 = false;
                                                    }
                                                    composer6.endReplaceGroup();
                                                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, str6 != null ? true : z24, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1949761462, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$2$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer7, Integer num2) {
                                                            invoke(animatedVisibilityScope, composer7, num2.intValue());
                                                            return Unit.INSTANCE;
                                                        }

                                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility2, Composer composer7, int i19) {
                                                            Intrinsics.checkNotNullParameter(AnimatedVisibility2, "$this$AnimatedVisibility");
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1949761462, i19, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:179)");
                                                            }
                                                            String str7 = str6;
                                                            if (str7 == null) {
                                                                str7 = "";
                                                            }
                                                            LinkInlineSignupFieldsKt.LinkInlineErrorText(str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer7, 48, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }, composer6, 54), composer5, 1572870, 30);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    composer5.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    ComposerKt.sourceInformationMarkerEnd(composer5);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }, composer4, 54), composer4, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }, composerStartRestartGroup, 54), composer2, (i13 & 896) | 24582, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                focusRequester9 = focusRequester12;
                                focusRequester10 = focusRequester11;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                focusRequester10 = focusRequester;
                                focusRequester9 = focusRequester2;
                                focusRequester8 = focusRequester3;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final Modifier modifier4 = modifier3;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return LinkInlineSignupFieldsKt.LinkInlineSignupFields$lambda$4(num, emailController, phoneNumberController, nameController, signUpState, z, z2, z3, z4, str, z5, onShowingAllFields, modifier4, focusRequester10, focusRequester9, focusRequester8, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i11 = i9 | 24576;
                        i12 = i3 & 32768;
                        if (i12 == 0) {
                        }
                        i13 = i11;
                        if ((i4 & 306783379) == 306783378) {
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceGroup(-280025702);
                            if (num != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            final boolean z102 = z6;
                            final boolean z112 = z9;
                            final boolean z122 = z8;
                            final String str32 = str2;
                            final boolean z132 = z7;
                            final FocusRequester focusRequester112 = focusRequester5;
                            final FocusRequester focusRequester122 = focusRequester7;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            SectionUIKt.Section(null, strStringResource, modifier3, false, ComposableLambdaKt.rememberComposableLambda(212828019, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                    invoke(composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i17) {
                                    int iM5781getDoneeUduSuo;
                                    Composer composer4;
                                    int iM5781getDoneeUduSuo2;
                                    if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(212828019, i17, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous> (LinkInlineSignupFields.kt:67)");
                                        }
                                        if (z132) {
                                            composer3.startReplaceGroup(1695073760);
                                            if (signUpState == SignUpState.InputtingRemainingFields) {
                                                iM5781getDoneeUduSuo2 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                            } else {
                                                iM5781getDoneeUduSuo2 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                            }
                                            PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z102, phoneNumberController, null, null, false, true, focusRequester122, !z112 ? ComposableSingletons$LinkInlineSignupFieldsKt.INSTANCE.m7874getLambda1$paymentsheet_release() : null, iM5781getDoneeUduSuo2, composer3, (PhoneNumberController.$stable << 3) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                                            composer4 = composer3;
                                            composer4.endReplaceGroup();
                                        } else {
                                            composer3.startReplaceGroup(1695748847);
                                            boolean z14 = z102;
                                            TextFieldController textFieldController = emailController;
                                            SignUpState signUpState2 = signUpState;
                                            if (signUpState2 == SignUpState.InputtingRemainingFields) {
                                                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                            } else {
                                                iM5781getDoneeUduSuo = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                            }
                                            LinkOptionalInlineSignupKt.m7901EmailCollection7FxtGnE(z14, textFieldController, signUpState2, iM5781getDoneeUduSuo, focusRequester112, false, !z112 ? ComposableSingletons$LinkInlineSignupFieldsKt.INSTANCE.m7875getLambda2$paymentsheet_release() : null, composer3, 0, 32);
                                            composer4 = composer3;
                                            composer4.endReplaceGroup();
                                        }
                                        boolean z15 = (signUpState == SignUpState.InputtingRemainingFields || str32 == null) ? false : true;
                                        final String str4 = str32;
                                        AnimatedVisibilityKt.AnimatedVisibility(z15, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1176669595, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.1
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num2) {
                                                invoke(animatedVisibilityScope, composer5, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i18) {
                                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1176669595, i18, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:110)");
                                                }
                                                final String str5 = str4;
                                                ThemeKt.DefaultLinkTheme(false, ComposableLambdaKt.rememberComposableLambda(1195680927, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num2) {
                                                        invoke(composer6, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer6, int i19) {
                                                        if ((i19 & 3) != 2 || !composer6.getSkipping()) {
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventStart(1195680927, i19, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:111)");
                                                            }
                                                            String str6 = str5;
                                                            if (str6 == null) {
                                                                str6 = "";
                                                            }
                                                            LinkInlineSignupFieldsKt.LinkInlineErrorText(str6, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer6, 48, 0);
                                                            if (ComposerKt.isTraceInProgress()) {
                                                                ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer6.skipToGroupEnd();
                                                    }
                                                }, composer5, 54), composer5, 48, 1);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                        boolean z16 = z5 || signUpState == SignUpState.InputtingRemainingFields;
                                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                        final Function0<Unit> function0 = onShowingAllFields;
                                        final boolean z17 = z132;
                                        final boolean z18 = z102;
                                        final TextFieldController textFieldController2 = emailController;
                                        final SignUpState signUpState3 = signUpState;
                                        final boolean z19 = z122;
                                        final FocusRequester focusRequester13 = focusRequester112;
                                        final boolean z20 = z112;
                                        final PhoneNumberController phoneNumberController2 = phoneNumberController;
                                        final FocusRequester focusRequester14 = focusRequester122;
                                        final TextFieldController textFieldController3 = nameController;
                                        boolean z21 = z16;
                                        final FocusRequester focusRequester15 = focusRequester8;
                                        final String str5 = str32;
                                        AnimatedVisibilityKt.AnimatedVisibility(z21, modifierFillMaxWidth$default, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(252279748, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt.LinkInlineSignupFields.5.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer5, Integer num2) {
                                                invoke(animatedVisibilityScope, composer5, num2.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer5, int i18) {
                                                int iM5781getDoneeUduSuo3;
                                                boolean z22;
                                                Composer composer6;
                                                boolean z23;
                                                boolean z24;
                                                int iM5781getDoneeUduSuo4;
                                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(252279748, i18, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:122)");
                                                }
                                                Unit unit = Unit.INSTANCE;
                                                composer5.startReplaceGroup(-1787576622);
                                                boolean zChanged = composer5.changed(function0);
                                                Function0<Unit> function02 = function0;
                                                LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1 linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue = composer5.rememberedValue();
                                                if (zChanged || linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue = new LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1(function02, null);
                                                    composer5.updateRememberedValue(linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue);
                                                }
                                                composer5.endReplaceGroup();
                                                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$1$1RememberedValue, composer5, 6);
                                                Modifier modifierTestTag = TestTagKt.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), LinkInlineSignupFieldsKt.LINK_INLINE_SIGNUP_REMAINING_FIELDS_TEST_TAG);
                                                boolean z25 = z17;
                                                boolean z26 = z18;
                                                TextFieldController textFieldController4 = textFieldController2;
                                                SignUpState signUpState4 = signUpState3;
                                                boolean z27 = z19;
                                                FocusRequester focusRequester16 = focusRequester13;
                                                boolean z28 = z20;
                                                PhoneNumberController phoneNumberController3 = phoneNumberController2;
                                                FocusRequester focusRequester17 = focusRequester14;
                                                TextFieldController textFieldController5 = textFieldController3;
                                                FocusRequester focusRequester18 = focusRequester15;
                                                final String str6 = str5;
                                                ComposerKt.sourceInformationMarkerStart(composer5, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer5, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer5, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer5, modifierTestTag);
                                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer5, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composer5.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer5.startReusableNode();
                                                if (composer5.getInserting()) {
                                                    composer5.createNode(constructor);
                                                } else {
                                                    composer5.useNode();
                                                }
                                                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composer5);
                                                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                }
                                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer5, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                                DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer5, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer5, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer5, 0, 9);
                                                if (z25) {
                                                    composer5.startReplaceGroup(1069130156);
                                                    if (z27) {
                                                        iM5781getDoneeUduSuo4 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                    } else {
                                                        iM5781getDoneeUduSuo4 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                    }
                                                    LinkOptionalInlineSignupKt.m7901EmailCollection7FxtGnE(z26, textFieldController4, signUpState4, iM5781getDoneeUduSuo4, focusRequester16, false, null, composer5, 0, 96);
                                                    composer6 = composer5;
                                                    composer6.endReplaceGroup();
                                                    z22 = z27;
                                                    z23 = z26;
                                                } else {
                                                    composer5.startReplaceGroup(1069642772);
                                                    boolean z29 = !z28 && phoneNumberController3.getInitialPhoneNumber().length() == 0;
                                                    if (z27) {
                                                        iM5781getDoneeUduSuo3 = ImeAction.INSTANCE.m5783getNexteUduSuo();
                                                    } else {
                                                        iM5781getDoneeUduSuo3 = ImeAction.INSTANCE.m5781getDoneeUduSuo();
                                                    }
                                                    PhoneNumberElementUIKt.m8823PhoneNumberElementUIRts_TWA(z26, phoneNumberController3, null, null, z29, z27, focusRequester17, null, iM5781getDoneeUduSuo3, composer5, PhoneNumberController.$stable << 3, 140);
                                                    z22 = z27;
                                                    composer6 = composer5;
                                                    z23 = z26;
                                                    composer6.endReplaceGroup();
                                                }
                                                DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer6, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer6, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer6, 0, 9);
                                                composer6.startReplaceGroup(588722523);
                                                if (z22) {
                                                    z24 = false;
                                                    TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController5, z23, ImeAction.INSTANCE.m5781getDoneeUduSuo(), null, null, 0, 0, focusRequester18, false, false, composer5, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 888);
                                                    composer6 = composer5;
                                                } else {
                                                    z24 = false;
                                                }
                                                composer6.endReplaceGroup();
                                                AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, str6 != null ? true : z24, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1949761462, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$LinkInlineSignupFields$5$2$2$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer7, Integer num2) {
                                                        invoke(animatedVisibilityScope, composer7, num2.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility2, Composer composer7, int i19) {
                                                        Intrinsics.checkNotNullParameter(AnimatedVisibility2, "$this$AnimatedVisibility");
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(1949761462, i19, -1, "com.stripe.android.link.ui.inline.LinkInlineSignupFields.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignupFields.kt:179)");
                                                        }
                                                        String str7 = str6;
                                                        if (str7 == null) {
                                                            str7 = "";
                                                        }
                                                        LinkInlineSignupFieldsKt.LinkInlineErrorText(str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer7, 48, 0);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer6, 54), composer5, 1572870, 30);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                composer5.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                ComposerKt.sourceInformationMarkerEnd(composer5);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer4, 54), composer4, 196656, 28);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composerStartRestartGroup, 54), composer2, (i13 & 896) | 24582, 8);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            focusRequester9 = focusRequester122;
                            focusRequester10 = focusRequester112;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str2 = str;
                    if ((i3 & 1024) != 0) {
                    }
                    if ((i3 & 2048) != 0) {
                    }
                    int i142 = i5;
                    i6 = i3 & 4096;
                    if (i6 != 0) {
                    }
                    i8 = i3 & 8192;
                    if (i8 != 0) {
                    }
                    i10 = i3 & 16384;
                    if (i10 == 0) {
                    }
                    i12 = i3 & 32768;
                    if (i12 == 0) {
                    }
                    i13 = i11;
                    if ((i4 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z9 = z4;
                if ((i3 & 512) == 0) {
                }
                str2 = str;
                if ((i3 & 1024) != 0) {
                }
                if ((i3 & 2048) != 0) {
                }
                int i1422 = i5;
                i6 = i3 & 4096;
                if (i6 != 0) {
                }
                i8 = i3 & 8192;
                if (i8 != 0) {
                }
                i10 = i3 & 16384;
                if (i10 == 0) {
                }
                i12 = i3 & 32768;
                if (i12 == 0) {
                }
                i13 = i11;
                if ((i4 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z8 = z3;
            if ((i3 & 256) != 0) {
            }
            z9 = z4;
            if ((i3 & 512) == 0) {
            }
            str2 = str;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            int i14222 = i5;
            i6 = i3 & 4096;
            if (i6 != 0) {
            }
            i8 = i3 & 8192;
            if (i8 != 0) {
            }
            i10 = i3 & 16384;
            if (i10 == 0) {
            }
            i12 = i3 & 32768;
            if (i12 == 0) {
            }
            i13 = i11;
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z6 = z;
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        z8 = z3;
        if ((i3 & 256) != 0) {
        }
        z9 = z4;
        if ((i3 & 512) == 0) {
        }
        str2 = str;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        int i142222 = i5;
        i6 = i3 & 4096;
        if (i6 != 0) {
        }
        i8 = i3 & 8192;
        if (i8 != 0) {
        }
        i10 = i3 & 16384;
        if (i10 == 0) {
        }
        i12 = i3 & 32768;
        if (i12 == 0) {
        }
        i13 = i11;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkInlineErrorText(final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1453253792);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1453253792, i3, -1, "com.stripe.android.link.ui.inline.LinkInlineErrorText (LinkInlineSignupFields.kt:193)");
                }
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                float f = 12;
                IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_sail_warning_circle, composerStartRestartGroup, 0), (String) null, SizeKt.m1065size3ABfNKs(PaddingKt.m1021paddingVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(10), Dp.m6117constructorimpl(f)), Dp.m6117constructorimpl(20)), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU(), composerStartRestartGroup, 432, 0);
                Modifier modifier3 = companion;
                HyperlinkedTextKt.m8654HyperlinkedTextcf5BqRc(str, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 1, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU(), new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily.INSTANCE.getDefault(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i3 & 14) | 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkInlineSignupFieldsKt.LinkInlineErrorText$lambda$6(str, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                float f2 = 12;
                IconKt.m1925Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.stripe_ic_sail_warning_circle, composerStartRestartGroup, 0), (String) null, SizeKt.m1065size3ABfNKs(PaddingKt.m1021paddingVpY3zN4(Modifier.INSTANCE, Dp.m6117constructorimpl(10), Dp.m6117constructorimpl(f2)), Dp.m6117constructorimpl(20)), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU(), composerStartRestartGroup, 432, 0);
                Modifier modifier32 = companion;
                HyperlinkedTextKt.m8654HyperlinkedTextcf5BqRc(str, PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f2), 1, null), MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1827getError0d7_KjU(), new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), (FontStyle) null, (FontSynthesis) null, FontFamily.INSTANCE.getDefault(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null), composerStartRestartGroup, (i3 & 14) | 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier32;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void PreviewLinkInlineSignupFields(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1447765844);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1447765844, i, -1, "com.stripe.android.link.ui.inline.PreviewLinkInlineSignupFields (LinkInlineSignupFields.kt:223)");
            }
            SimpleTextFieldController simpleTextFieldControllerCreateController$default = EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "test@test.com", false, 2, null);
            PhoneNumberController phoneNumberControllerCreatePhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, null, null, null, false, false, 31, null);
            SimpleTextFieldController simpleTextFieldControllerCreateController = NameConfig.INSTANCE.createController(null);
            SignUpState signUpState = SignUpState.InputtingRemainingFields;
            SimpleTextFieldController simpleTextFieldController = simpleTextFieldControllerCreateController$default;
            SimpleTextFieldController simpleTextFieldController2 = simpleTextFieldControllerCreateController;
            composerStartRestartGroup.startReplaceGroup(744187762);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LinkInlineSignupFields(null, simpleTextFieldController, phoneNumberControllerCreatePhoneNumberController$default, simpleTextFieldController2, signUpState, true, false, false, false, "This is a large error!", false, (Function0) objRememberedValue, null, null, null, null, composer2, (SimpleTextFieldController.$stable << 3) | 920346630 | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9), 54, 61440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupFieldsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkInlineSignupFieldsKt.PreviewLinkInlineSignupFields$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
