package com.stripe.android.link.ui.verification;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.ErrorTextKt;
import com.stripe.android.link.ui.LinkAppBarKt;
import com.stripe.android.link.ui.ScrollableTopLevelColumnKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.SectionStyle;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.elements.OTPElementColors;
import com.stripe.android.uicore.elements.OTPElementUIKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VerificationBody.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\f\u001aS\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0016\u001aA\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u001c\u0010\u001b\u001a\u0018\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u001c¢\u0006\u0002\b\u001e¢\u0006\u0002\b\u001fH\u0003¢\u0006\u0002\u0010 \u001a\u0015\u0010!\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0003¢\u0006\u0002\u0010\"\u001a+\u0010#\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00192\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010'\u001a+\u0010(\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00192\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010+\u001a\r\u0010,\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010-\"\u000e\u0010.\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010/\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00100\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00101\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00105\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00106\u001a\u00020%X\u0080T¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"VerificationBody", "", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "onBack", "Lkotlin/Function0;", "onFocusRequested", "didShowCodeSentNotification", "onChangeEmailClick", "onResendCodeClick", "(Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LaunchedEffects", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "context", "Landroid/content/Context;", "(Lcom/stripe/android/link/ui/verification/VerificationViewState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VerificationBodyContainer", "isDialog", "", "onBackClicked", UriUtil.LOCAL_CONTENT_SCHEME, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Title", "(ZLandroidx/compose/runtime/Composer;I)V", "ChangeEmailRow", "email", "", "isProcessing", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ResendCodeButton", "isSendingNewCode", ViewProps.ON_CLICK, "(ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "VERIFICATION_TITLE_TAG", "VERIFICATION_SUBTITLE_TAG", "VERIFICATION_OTP_TAG", "VERIFICATION_CHANGE_EMAIL_TAG", "VERIFICATION_ERROR_TAG", "VERIFICATION_RESEND_LOADER_TAG", "VERIFICATION_RESEND_CODE_BUTTON_TAG", "VERIFICATION_HEADER_IMAGE_TAG", "VERIFICATION_HEADER_BUTTON_TAG", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationBodyKt {
    public static final String VERIFICATION_CHANGE_EMAIL_TAG = "verification_change_email_tag";
    public static final String VERIFICATION_ERROR_TAG = "verification_error_tag";
    public static final String VERIFICATION_HEADER_BUTTON_TAG = "verification_header_button_tag";
    public static final String VERIFICATION_HEADER_IMAGE_TAG = "verification_header_image_tag";
    public static final String VERIFICATION_OTP_TAG = "verification_otp_tag";
    public static final String VERIFICATION_RESEND_CODE_BUTTON_TAG = "verification_resend_code_button_tag";
    public static final String VERIFICATION_RESEND_LOADER_TAG = "verification_resend_loader_tag";
    public static final String VERIFICATION_SUBTITLE_TAG = "verification_subtitle";
    public static final String VERIFICATION_TITLE_TAG = "verification_title";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeEmailRow$lambda$13(String str, boolean z, Function0 function0, int i, Composer composer, int i2) {
        ChangeEmailRow(str, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LaunchedEffects$lambda$7(VerificationViewState verificationViewState, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, FocusRequester focusRequester, Function0 function0, Context context, Function0 function02, int i, Composer composer, int i2) {
        LaunchedEffects(verificationViewState, focusManager, softwareKeyboardController, focusRequester, function0, context, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$16(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResendCodeButton$lambda$15(boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        ResendCodeButton(z, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Title$lambda$11(boolean z, int i, Composer composer, int i2) {
        Title(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationBody$lambda$3(VerificationViewState verificationViewState, OTPElement oTPElement, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, Composer composer, int i2) {
        VerificationBody(verificationViewState, oTPElement, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationBodyContainer$lambda$10(boolean z, Function0 function0, Function3 function3, int i, Composer composer, int i2) {
        VerificationBodyContainer(z, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void VerificationBody(final VerificationViewState state, final OTPElement otpElement, final Function0<Unit> onBack, final Function0<Unit> onFocusRequested, final Function0<Unit> didShowCodeSentNotification, final Function0<Unit> onChangeEmailClick, final Function0<Unit> onResendCodeClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(otpElement, "otpElement");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onFocusRequested, "onFocusRequested");
        Intrinsics.checkNotNullParameter(didShowCodeSentNotification, "didShowCodeSentNotification");
        Intrinsics.checkNotNullParameter(onChangeEmailClick, "onChangeEmailClick");
        Intrinsics.checkNotNullParameter(onResendCodeClick, "onResendCodeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-439079412);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(otpElement) : composerStartRestartGroup.changedInstance(otpElement) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBack) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFocusRequested) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(didShowCodeSentNotification) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onChangeEmailClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onResendCodeClick) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-439079412, i3, -1, "com.stripe.android.link.ui.verification.VerificationBody (VerificationBody.kt:69)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final FocusManager focusManager = (FocusManager) objConsume2;
            composerStartRestartGroup.startReplaceGroup(1393476276);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume3 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            LaunchedEffects(state, focusManager, (SoftwareKeyboardController) objConsume3, focusRequester, onFocusRequested, context, didShowCodeSentNotification, composerStartRestartGroup, (i3 & 14) | 3072 | ((i3 << 3) & 57344) | ((i3 << 6) & 3670016));
            boolean zIsDialog = state.isDialog();
            composerStartRestartGroup.startReplaceGroup(1393492509);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(focusManager) | ((i3 & 896) == 256);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return VerificationBodyKt.VerificationBody$lambda$2$lambda$1(focusManager, onBack);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            VerificationBodyContainer(zIsDialog, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-1943501069, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt.VerificationBody.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope VerificationBodyContainer, Composer composer2, int i4) {
                    int i5;
                    Intrinsics.checkNotNullParameter(VerificationBodyContainer, "$this$VerificationBodyContainer");
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer2.changed(VerificationBodyContainer) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 19) != 18 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1943501069, i5, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous> (VerificationBody.kt:92)");
                        }
                        VerificationBodyKt.Title(state.isDialog(), composer2, 0);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(8)), composer2, 6);
                        int i6 = i5;
                        TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_link_verification_message_short, new Object[]{state.getRedactedPhoneNumber()}, composer2, 0), SizeKt.fillMaxWidth$default(TestTagKt.testTag(Modifier.INSTANCE, VerificationBodyKt.VERIFICATION_SUBTITLE_TAG), 0.0f, 1, null), LinkTheme.INSTANCE.getColors(composer2, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composer2, 6).getBody(), composer2, 48, 0, 65016);
                        float f = 24;
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer2, 6);
                        SectionStyle sectionStyle = SectionStyle.Bordered;
                        final VerificationViewState verificationViewState = state;
                        final OTPElement oTPElement = otpElement;
                        final FocusRequester focusRequester2 = focusRequester;
                        ColorKt.StripeThemeForLink(sectionStyle, ComposableLambdaKt.rememberComposableLambda(-7029826, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt.VerificationBody.2.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-7029826, i7, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous>.<anonymous> (VerificationBody.kt:111)");
                                    }
                                    boolean z = !verificationViewState.isProcessing();
                                    float f2 = 8;
                                    float fM6117constructorimpl = Dp.m6117constructorimpl(f2);
                                    float fM6117constructorimpl2 = Dp.m6117constructorimpl(f2);
                                    OTPElementUIKt.m8812OTPElementUIRE_urrM(z, oTPElement, TestTagKt.testTag(SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(328)), VerificationBodyKt.VERIFICATION_OTP_TAG), LinkTheme.INSTANCE.getShapes(composer3, 6).getDefault(), null, fM6117constructorimpl2, fM6117constructorimpl, " ", new OTPElementColors(LinkTheme.INSTANCE.getColors(composer3, 6).m7793getBorderSelected0d7_KjU(), LinkTheme.INSTANCE.getColors(composer3, 6).m7810getTextPrimary0d7_KjU(), LinkTheme.INSTANCE.getColors(composer3, 6).m7806getSurfaceSecondary0d7_KjU(), LinkTheme.INSTANCE.getColors(composer3, 6).m7805getSurfacePrimary0d7_KjU(), LinkTheme.INSTANCE.getColors(composer3, 6).m7806getSurfaceSecondary0d7_KjU(), null), Dp.m6117constructorimpl((float) 1.5d), focusRequester2, composer3, (OTPElement.$stable << 3) | 819659136 | (OTPElementColors.$stable << 24), 6, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, composer2, 54), composer2, 54, 0);
                        boolean z = state.getErrorMessage() != null;
                        final VerificationViewState verificationViewState2 = state;
                        AnimatedVisibilityKt.AnimatedVisibility(VerificationBodyContainer, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(1613991707, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt.VerificationBody.2.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                                invoke(animatedVisibilityScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i7) {
                                String strResolve;
                                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1613991707, i7, -1, "com.stripe.android.link.ui.verification.VerificationBody.<anonymous>.<anonymous> (VerificationBody.kt:135)");
                                }
                                ResolvableString errorMessage = verificationViewState2.getErrorMessage();
                                if (errorMessage == null) {
                                    strResolve = null;
                                } else {
                                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                                    ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                                    Object objConsume4 = composer3.consume(localContext2);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    strResolve = errorMessage.resolve((Context) objConsume4);
                                }
                                if (strResolve == null) {
                                    strResolve = "";
                                }
                                ErrorTextKt.ErrorText(strResolve, SizeKt.fillMaxWidth$default(TestTagKt.testTag(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), VerificationBodyKt.VERIFICATION_ERROR_TAG), 0.0f, 1, null), null, composer3, 48, 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, (i6 & 14) | 1572864, 30);
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(36)), composer2, 6);
                        VerificationBodyKt.ResendCodeButton(state.isProcessing(), state.isSendingNewCode(), onResendCodeClick, composer2, 0);
                        composer2.startReplaceGroup(-733336985);
                        if (state.getAllowLogout()) {
                            SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(f)), composer2, 6);
                            VerificationBodyKt.ChangeEmailRow(state.getEmail(), state.isProcessing(), onChangeEmailClick, composer2, 0);
                        }
                        composer2.endReplaceGroup();
                        SpacerKt.Spacer(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(12)), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.VerificationBody$lambda$3(state, otpElement, onBack, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationBody$lambda$2$lambda$1(FocusManager focusManager, Function0 function0) {
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    private static final void LaunchedEffects(final VerificationViewState verificationViewState, final FocusManager focusManager, final SoftwareKeyboardController softwareKeyboardController, final FocusRequester focusRequester, final Function0<Unit> function0, final Context context, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        FocusRequester focusRequester2;
        Function0<Unit> function03;
        Boolean bool;
        ?? r11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473149422);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(verificationViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(focusManager) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            focusRequester2 = focusRequester;
            i2 |= composerStartRestartGroup.changed(focusRequester2) ? 2048 : 1024;
        } else {
            focusRequester2 = focusRequester;
        }
        if ((i & 24576) == 0) {
            function03 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 16384 : 8192;
        } else {
            function03 = function0;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(context) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473149422, i3, -1, "com.stripe.android.link.ui.verification.LaunchedEffects (VerificationBody.kt:173)");
            }
            Boolean boolValueOf = Boolean.valueOf(verificationViewState.isProcessing());
            composerStartRestartGroup.startReplaceGroup(-258501830);
            int i4 = i3 & 14;
            int i5 = i3 & 896;
            boolean zChangedInstance = (i4 == 4) | composerStartRestartGroup.changedInstance(focusManager) | (i5 == 256);
            VerificationBodyKt$LaunchedEffects$1$1 verificationBodyKt$LaunchedEffects$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || verificationBodyKt$LaunchedEffects$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationBodyKt$LaunchedEffects$1$1RememberedValue = new VerificationBodyKt$LaunchedEffects$1$1(verificationViewState, focusManager, softwareKeyboardController, null);
                composerStartRestartGroup.updateRememberedValue(verificationBodyKt$LaunchedEffects$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) verificationBodyKt$LaunchedEffects$1$1RememberedValue, composerStartRestartGroup, 0);
            Boolean boolValueOf2 = Boolean.valueOf(verificationViewState.getRequestFocus());
            composerStartRestartGroup.startReplaceGroup(-258496208);
            boolean z = ((i3 & 7168) == 2048) | (i4 == 4) | (i5 == 256) | ((57344 & i3) == 16384);
            VerificationBodyKt$LaunchedEffects$2$1 verificationBodyKt$LaunchedEffects$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || verificationBodyKt$LaunchedEffects$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                bool = boolValueOf2;
                r11 = 0;
                verificationBodyKt$LaunchedEffects$2$1RememberedValue = new VerificationBodyKt$LaunchedEffects$2$1(verificationViewState, focusRequester2, softwareKeyboardController, function03, null);
                composerStartRestartGroup.updateRememberedValue(verificationBodyKt$LaunchedEffects$2$1RememberedValue);
            } else {
                bool = boolValueOf2;
                r11 = 0;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) verificationBodyKt$LaunchedEffects$2$1RememberedValue, composerStartRestartGroup, (int) r11);
            Boolean boolValueOf3 = Boolean.valueOf(verificationViewState.getDidSendNewCode());
            composerStartRestartGroup.startReplaceGroup(-258487876);
            boolean zChangedInstance2 = (i4 == 4 ? true : r11) | composerStartRestartGroup.changedInstance(context) | ((3670016 & i3) != 1048576 ? r11 : true);
            VerificationBodyKt$LaunchedEffects$3$1 verificationBodyKt$LaunchedEffects$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || verificationBodyKt$LaunchedEffects$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                verificationBodyKt$LaunchedEffects$3$1RememberedValue = new VerificationBodyKt$LaunchedEffects$3$1(verificationViewState, context, function02, null);
                composerStartRestartGroup.updateRememberedValue(verificationBodyKt$LaunchedEffects$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) verificationBodyKt$LaunchedEffects$3$1RememberedValue, composerStartRestartGroup, (int) r11);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.LaunchedEffects$lambda$7(verificationViewState, focusManager, softwareKeyboardController, focusRequester, function0, context, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void VerificationBodyContainer(final boolean z, final Function0<Unit> function0, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-157383319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-157383319, i2, -1, "com.stripe.android.link.ui.verification.VerificationBodyContainer (VerificationBody.kt:209)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-71154665);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                float f = 24;
                Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6117constructorimpl(f));
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.stripe_link_logo, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_HEADER_IMAGE_TAG), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 120);
                SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                int i3 = i2;
                LinkAppBarKt.AppBarIcon(R.drawable.stripe_link_close, StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_close, composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_HEADER_BUTTON_TAG), function0, composerStartRestartGroup, ((i2 << 6) & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                Modifier modifierM1023paddingqDBjuR0 = PaddingKt.m1023paddingqDBjuR0(Modifier.INSTANCE, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(2), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                int i4 = ((i3 << 3) & 7168) | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1023paddingqDBjuR0);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composerStartRestartGroup);
                Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                function3.invoke(ColumnScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i4 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 6));
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-69885091);
                ScrollableTopLevelColumnKt.ScrollableTopLevelColumn(null, function3, composerStartRestartGroup, (i2 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 1);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.VerificationBodyContainer$lambda$10(z, function0, function3, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Title(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1246127343);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1246127343, i2, -1, "com.stripe.android.link.ui.verification.Title (VerificationBody.kt:254)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1584015599);
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_verification_dialog_header, composerStartRestartGroup, 0), TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_TITLE_TAG), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTitle(), composer2, 48, 0, 65016);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1584361125);
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_verification_dialog_header, composerStartRestartGroup, 0), PaddingKt.m1022paddingVpY3zN4$default(TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_TITLE_TAG), 0.0f, Dp.m6117constructorimpl(4), 1, null), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7810getTextPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m5999boximpl(TextAlign.INSTANCE.m6006getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getTitle(), composer2, 48, 0, 65016);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.Title$lambda$11(z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangeEmailRow(String str, boolean z, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        final String str2 = str;
        final boolean z2 = z;
        final Function0<Unit> function02 = function0;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1123540244);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1123540244, i2, -1, "com.stripe.android.link.ui.verification.ChangeEmailRow (VerificationBody.kt:282)");
            }
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), composerStartRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            TextKt.m2076Text4IGK_g(str2, RowScopeInstance.INSTANCE.weight(Modifier.INSTANCE, 1.0f, false), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7812getTextTertiary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBody(), composerStartRestartGroup, i2 & 14, 3120, 55288);
            function02 = function0;
            str2 = str;
            z2 = z;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_verification_change_email_new, composerStartRestartGroup, 0), ClickableKt.m608clickableXHw0xAI$default(PaddingKt.m1024paddingqDBjuR0$default(TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_CHANGE_EMAIL_TAG), Dp.m6117constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), !z, null, null, function0, 6, null), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7808getTextBrand0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composerStartRestartGroup, 0, 3072, 57336);
            composer2 = composerStartRestartGroup;
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.ChangeEmailRow$lambda$13(str2, z2, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ResendCodeButton(final boolean z, final boolean z2, Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        float high;
        Composer composer2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1362496471);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1362496471, i3, -1, "com.stripe.android.link.ui.verification.ResendCodeButton (VerificationBody.kt:315)");
            }
            Modifier modifierM608clickableXHw0xAI$default = ClickableKt.m608clickableXHw0xAI$default(TestTagKt.testTag(Modifier.INSTANCE, VERIFICATION_RESEND_CODE_BUTTON_TAG), (z || z2) ? false : true, null, null, onClick, 6, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM608clickableXHw0xAI$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-192139486);
                high = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                composerStartRestartGroup.endReplaceGroup();
            } else if (z2) {
                composerStartRestartGroup.startReplaceGroup(-192067659);
                composerStartRestartGroup.endReplaceGroup();
                high = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(-192035450);
                high = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(R.string.stripe_verification_resend, composerStartRestartGroup, 0), AlphaKt.alpha(Modifier.INSTANCE, high), LinkTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m7808getTextBrand0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, LinkTheme.INSTANCE.getTypography(composerStartRestartGroup, 6).getBodyEmphasized(), composer2, 0, 0, 65528);
            Function3<AnimatedVisibilityScope, Composer, Integer, Unit> function3M7920getLambda1$paymentsheet_release = ComposableSingletons$VerificationBodyKt.INSTANCE.m7920getLambda1$paymentsheet_release();
            int i4 = ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function0 = onClick;
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, function3M7920getLambda1$paymentsheet_release, composer2, i4, 30);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = onClick;
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.ResendCodeButton$lambda$15(z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2120650453);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2120650453, i, -1, "com.stripe.android.link.ui.verification.Preview (VerificationBody.kt:357)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$VerificationBodyKt.INSTANCE.m7923getLambda4$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationBodyKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationBodyKt.Preview$lambda$16(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
