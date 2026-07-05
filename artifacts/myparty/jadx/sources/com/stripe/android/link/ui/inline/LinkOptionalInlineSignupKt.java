package com.stripe.android.link.ui.inline;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.link.ui.LinkTermsType;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.ui.core.CircularProgressIndicatorKt;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkOptionalInlineSignup.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0019\u001aZ\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\u0015\b\u0002\u0010 \u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010!¢\u0006\u0002\b\"H\u0001¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010&\u001a\r\u0010'\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(\u001a\r\u0010)\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(\u001a\r\u0010*\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010(¨\u0006+²\u0006\n\u0010,\u001a\u00020\bX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u000100X\u008a\u0084\u0002"}, d2 = {"LinkOptionalInlineSignup", "", "viewModel", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", ViewProps.ENABLED, "", "onStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "sectionController", "Lcom/stripe/android/uicore/elements/SectionController;", "emailController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "isShowingPhoneFirst", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "requiresNameCollection", "errorMessage", "", "(Lcom/stripe/android/uicore/elements/SectionController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;ZLcom/stripe/android/link/ui/signup/SignUpState;ZZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EmailCollection", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "requestFocusWhenShown", "trailingIcon", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "EmailCollection-7FxtGnE", "(ZLcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ILandroidx/compose/ui/focus/FocusRequester;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "LinkLogo", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewInitial", "(Landroidx/compose/runtime/Composer;I)V", "PreviewInitialWithPhoneFirst", "PreviewFilledOut", "paymentsheet_release", "viewState", "Lcom/stripe/android/core/strings/ResolvableString;", "didShowAllFields", "sectionError", "Lcom/stripe/android/uicore/elements/FieldError;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkOptionalInlineSignupKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailCollection_7FxtGnE$lambda$24(boolean z, TextFieldController textFieldController, SignUpState signUpState, int i, FocusRequester focusRequester, boolean z2, Function2 function2, int i2, int i3, Composer composer, int i4) {
        m7901EmailCollection7FxtGnE(z, textFieldController, signUpState, i, focusRequester, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkLogo$lambda$27(Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkLogo(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkOptionalInlineSignup$lambda$18(SectionController sectionController, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, boolean z, SignUpState signUpState, boolean z2, boolean z3, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkOptionalInlineSignup(sectionController, textFieldController, phoneNumberController, textFieldController2, z, signUpState, z2, z3, str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkOptionalInlineSignup$lambda$4(InlineSignupViewModel inlineSignupViewModel, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkOptionalInlineSignup(inlineSignupViewModel, z, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFilledOut$lambda$30(int i, Composer composer, int i2) {
        PreviewFilledOut(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInitial$lambda$28(int i, Composer composer, int i2) {
        PreviewInitial(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewInitialWithPhoneFirst$lambda$29(int i, Composer composer, int i2) {
        PreviewInitialWithPhoneFirst(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkOptionalInlineSignup(final InlineSignupViewModel viewModel, final boolean z, final Function1<? super InlineSignupViewState, Unit> onStateChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        State stateCollectAsState;
        boolean zChanged;
        LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1 linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue;
        FocusManager focusManager;
        SoftwareKeyboardController softwareKeyboardController;
        boolean zChanged2;
        LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1 linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1868616687);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onStateChanged) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1868616687, i3, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:62)");
                }
                stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getViewState(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(viewModel.getErrorMessage(), null, composerStartRestartGroup, 0, 1);
                InlineSignupViewState inlineSignupViewStateLinkOptionalInlineSignup$lambda$0 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState);
                composerStartRestartGroup.startReplaceGroup(-233531408);
                zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & 896) == 256);
                linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue = new LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1(onStateChanged, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(inlineSignupViewStateLinkOptionalInlineSignup$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue, composerStartRestartGroup, 0);
                ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume = composerStartRestartGroup.consume(localFocusManager);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                focusManager = (FocusManager) objConsume;
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume2 = composerStartRestartGroup.consume(localSoftwareKeyboardController);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                softwareKeyboardController = (SoftwareKeyboardController) objConsume2;
                SignUpState signUpState$paymentsheet_release = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                composerStartRestartGroup.startReplaceGroup(-233524718);
                zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
                linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue = new LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1(focusManager, softwareKeyboardController, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(signUpState$paymentsheet_release, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue, composerStartRestartGroup, 0);
                SectionController sectionController = viewModel.getSectionController();
                SimpleTextFieldController emailController = viewModel.getEmailController();
                PhoneNumberController phoneController = viewModel.getPhoneController();
                SimpleTextFieldController nameController = viewModel.getNameController();
                SignUpState signUpState$paymentsheet_release2 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                boolean zIsShowingPhoneFirst = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).isShowingPhoneFirst();
                boolean requiresNameCollection = viewModel.getRequiresNameCollection();
                ResolvableString resolvableStringLinkOptionalInlineSignup$lambda$1 = LinkOptionalInlineSignup$lambda$1(stateCollectAsState2);
                composerStartRestartGroup.startReplaceGroup(-233502768);
                String strResolve = resolvableStringLinkOptionalInlineSignup$lambda$1 != null ? null : ResolvableStringComposeUtilsKt.resolve(resolvableStringLinkOptionalInlineSignup$lambda$1, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                LinkOptionalInlineSignup(sectionController, emailController, phoneController, nameController, zIsShowingPhoneFirst, signUpState$paymentsheet_release2, z2, requiresNameCollection, strResolve, modifier4, composer2, SectionController.$stable | (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9) | ((i3 << 15) & 3670016) | ((i3 << 18) & 1879048192), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkOptionalInlineSignupKt.LinkOptionalInlineSignup$lambda$4(viewModel, z, onStateChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getViewState(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState22 = StateFlowsComposeKt.collectAsState(viewModel.getErrorMessage(), null, composerStartRestartGroup, 0, 1);
            InlineSignupViewState inlineSignupViewStateLinkOptionalInlineSignup$lambda$02 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(-233531408);
            zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & 896) == 256);
            linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue = new LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1(onStateChanged, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(inlineSignupViewStateLinkOptionalInlineSignup$lambda$02, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$LinkOptionalInlineSignup$1$1RememberedValue, composerStartRestartGroup, 0);
                ProvidableCompositionLocal<FocusManager> localFocusManager2 = CompositionLocalsKt.getLocalFocusManager();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume3 = composerStartRestartGroup.consume(localFocusManager2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                focusManager = (FocusManager) objConsume3;
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController2 = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object objConsume22 = composerStartRestartGroup.consume(localSoftwareKeyboardController2);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                softwareKeyboardController = (SoftwareKeyboardController) objConsume22;
                SignUpState signUpState$paymentsheet_release3 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                composerStartRestartGroup.startReplaceGroup(-233524718);
                zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
                linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue = new LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1(focusManager, softwareKeyboardController, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(signUpState$paymentsheet_release3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$LinkOptionalInlineSignup$2$1RememberedValue, composerStartRestartGroup, 0);
                    SectionController sectionController2 = viewModel.getSectionController();
                    SimpleTextFieldController emailController2 = viewModel.getEmailController();
                    PhoneNumberController phoneController2 = viewModel.getPhoneController();
                    SimpleTextFieldController nameController2 = viewModel.getNameController();
                    SignUpState signUpState$paymentsheet_release22 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                    boolean zIsShowingPhoneFirst2 = LinkOptionalInlineSignup$lambda$0(stateCollectAsState).isShowingPhoneFirst();
                    boolean requiresNameCollection2 = viewModel.getRequiresNameCollection();
                    ResolvableString resolvableStringLinkOptionalInlineSignup$lambda$12 = LinkOptionalInlineSignup$lambda$1(stateCollectAsState22);
                    composerStartRestartGroup.startReplaceGroup(-233502768);
                    if (resolvableStringLinkOptionalInlineSignup$lambda$12 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    LinkOptionalInlineSignup(sectionController2, emailController2, phoneController2, nameController2, zIsShowingPhoneFirst2, signUpState$paymentsheet_release22, z2, requiresNameCollection2, strResolve, modifier4, composer2, SectionController.$stable | (SimpleTextFieldController.$stable << 3) | (PhoneNumberController.$stable << 6) | (SimpleTextFieldController.$stable << 9) | ((i3 << 15) & 3670016) | ((i3 << 18) & 1879048192), 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkOptionalInlineSignup(final SectionController sectionController, final TextFieldController emailController, final PhoneNumberController phoneNumberController, final TextFieldController nameController, final boolean z, final SignUpState signUpState, final boolean z2, final boolean z3, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z4;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        BringIntoViewRequester bringIntoViewRequester;
        final MutableState mutableState;
        FocusRequester focusRequester;
        FocusRequester focusRequester2;
        int i5;
        boolean zChanged;
        Object objRememberedValue6;
        Composer composer2;
        LinkTermsType linkTermsType;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(sectionController, "sectionController");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Composer composerStartRestartGroup = composer.startRestartGroup(1871214805);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(sectionController) : composerStartRestartGroup.changedInstance(sectionController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(emailController) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(nameController) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changed(signUpState) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    z4 = z3;
                    i3 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                }
                if ((i2 & 256) == 0) {
                    if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changed(str) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                    }
                    i4 = i2 & 512;
                    if (i4 == 0) {
                        i3 |= 805306368;
                        modifier2 = modifier;
                    } else {
                        modifier2 = modifier;
                        if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                        }
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1871214805, i3, -1, "com.stripe.android.link.ui.inline.LinkOptionalInlineSignup (LinkOptionalInlineSignup.kt:107)");
                        }
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                        Modifier modifier4 = companion;
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i6 = i3;
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
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(726212203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = BringIntoViewRequesterKt.BringIntoViewRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        BringIntoViewRequester bringIntoViewRequester2 = (BringIntoViewRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726214499);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        FocusRequester focusRequester3 = (FocusRequester) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726216547);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        FocusRequester focusRequester4 = (FocusRequester) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726218563);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        FocusRequester focusRequester5 = (FocusRequester) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(726221119);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LinkOptionalInlineSignupKt.LinkOptionalInlineSignup$lambda$17$lambda$10$lambda$9();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                        State stateCollectAsState = StateFlowsComposeKt.collectAsState(sectionController.getError(), null, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(726225175);
                        if (signUpState != SignUpState.InputtingRemainingFields) {
                            composerStartRestartGroup.startReplaceGroup(726228234);
                            boolean zChangedInstance = ((i6 & 57344) == 16384) | composerStartRestartGroup.changedInstance(bringIntoViewRequester2) | composerStartRestartGroup.changedInstance(emailController) | ((i6 & 29360128) == 8388608);
                            LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1 linkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || linkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                mutableState = mutableState2;
                                focusRequester = focusRequester3;
                                focusRequester2 = focusRequester4;
                                bringIntoViewRequester = bringIntoViewRequester2;
                                i5 = i6;
                                linkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1RememberedValue = new LinkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1(bringIntoViewRequester, emailController, z, focusRequester, focusRequester2, focusRequester5, z4, null);
                                composerStartRestartGroup.updateRememberedValue(linkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1RememberedValue);
                            } else {
                                bringIntoViewRequester = bringIntoViewRequester2;
                                mutableState = mutableState2;
                                focusRequester = focusRequester3;
                                focusRequester2 = focusRequester4;
                                i5 = i6;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(signUpState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$LinkOptionalInlineSignup$4$1$1RememberedValue, composerStartRestartGroup, (i5 >> 15) & 14);
                        } else {
                            bringIntoViewRequester = bringIntoViewRequester2;
                            mutableState = mutableState2;
                            focusRequester = focusRequester3;
                            focusRequester2 = focusRequester4;
                            i5 = i6;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        FieldError fieldErrorLinkOptionalInlineSignup$lambda$17$lambda$13 = LinkOptionalInlineSignup$lambda$17$lambda$13(stateCollectAsState);
                        Integer numValueOf = fieldErrorLinkOptionalInlineSignup$lambda$17$lambda$13 == null ? Integer.valueOf(fieldErrorLinkOptionalInlineSignup$lambda$17$lambda$13.getErrorMessage()) : null;
                        boolean zLinkOptionalInlineSignup$lambda$17$lambda$11 = LinkOptionalInlineSignup$lambda$17$lambda$11(mutableState);
                        composerStartRestartGroup.startReplaceGroup(726272609);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LinkOptionalInlineSignupKt.LinkOptionalInlineSignup$lambda$17$lambda$16$lambda$15(mutableState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        int i7 = i5 >> 3;
                        int i8 = (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 100663296 | (PhoneNumberController.$stable << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i7) | (i7 & 458752) | ((i5 << 6) & 3670016) | (29360128 & i5) | ((i5 << 3) & 1879048192);
                        BringIntoViewRequester bringIntoViewRequester3 = bringIntoViewRequester;
                        LinkInlineSignupFieldsKt.LinkInlineSignupFields(numValueOf, emailController, phoneNumberController, nameController, signUpState, z2, z, z3, false, str, zLinkOptionalInlineSignup$lambda$17$lambda$11, (Function0) objRememberedValue6, null, focusRequester, focusRequester2, focusRequester5, composerStartRestartGroup, i8, 224256, 4096);
                        composer2 = composerStartRestartGroup;
                        if (!z) {
                            linkTermsType = LinkTermsType.InlineOptionalWithPhoneFirst;
                        } else {
                            linkTermsType = LinkTermsType.InlineOptional;
                        }
                        LinkTermsKt.m7870LinkTerms8iNrtrE(linkTermsType, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester3), TextAlign.INSTANCE.m6011getStarte0LSkKk(), composer2, 0, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LinkOptionalInlineSignupKt.LinkOptionalInlineSignup$lambda$18(sectionController, emailController, phoneNumberController, nameController, z, signUpState, z2, z3, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 100663296;
                i4 = i2 & 512;
                if (i4 == 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
                    Modifier modifier42 = companion;
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i62 = i3;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3150constructorimpl.getInserting()) {
                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(726212203);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        }
                        BringIntoViewRequester bringIntoViewRequester22 = (BringIntoViewRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726214499);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        FocusRequester focusRequester32 = (FocusRequester) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726216547);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        FocusRequester focusRequester42 = (FocusRequester) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(726218563);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        }
                        FocusRequester focusRequester52 = (FocusRequester) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr2 = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(726221119);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState22 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                        State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(sectionController.getError(), null, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(726225175);
                        if (signUpState != SignUpState.InputtingRemainingFields) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        FieldError fieldErrorLinkOptionalInlineSignup$lambda$17$lambda$132 = LinkOptionalInlineSignup$lambda$17$lambda$13(stateCollectAsState2);
                        if (fieldErrorLinkOptionalInlineSignup$lambda$17$lambda$132 == null) {
                        }
                        boolean zLinkOptionalInlineSignup$lambda$17$lambda$112 = LinkOptionalInlineSignup$lambda$17$lambda$11(mutableState);
                        composerStartRestartGroup.startReplaceGroup(726272609);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue6 = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LinkOptionalInlineSignupKt.LinkOptionalInlineSignup$lambda$17$lambda$16$lambda$15(mutableState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            composerStartRestartGroup.endReplaceGroup();
                            int i72 = i5 >> 3;
                            int i82 = (i5 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | 100663296 | (PhoneNumberController.$stable << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i72) | (i72 & 458752) | ((i5 << 6) & 3670016) | (29360128 & i5) | ((i5 << 3) & 1879048192);
                            BringIntoViewRequester bringIntoViewRequester32 = bringIntoViewRequester;
                            LinkInlineSignupFieldsKt.LinkInlineSignupFields(numValueOf, emailController, phoneNumberController, nameController, signUpState, z2, z, z3, false, str, zLinkOptionalInlineSignup$lambda$17$lambda$112, (Function0) objRememberedValue6, null, focusRequester, focusRequester2, focusRequester52, composerStartRestartGroup, i82, 224256, 4096);
                            composer2 = composerStartRestartGroup;
                            if (!z) {
                            }
                            LinkTermsKt.m7870LinkTerms8iNrtrE(linkTermsType, BringIntoViewRequesterKt.bringIntoViewRequester(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), bringIntoViewRequester32), TextAlign.INSTANCE.m6011getStarte0LSkKk(), composer2, 0, 0);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier42;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z3;
            if ((i2 & 256) == 0) {
            }
            i4 = i2 & 512;
            if (i4 == 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 128) == 0) {
        }
        z4 = z3;
        if ((i2 & 256) == 0) {
        }
        i4 = i2 & 512;
        if (i4 == 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState LinkOptionalInlineSignup$lambda$17$lambda$10$lambda$9() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean LinkOptionalInlineSignup$lambda$17$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LinkOptionalInlineSignup$lambda$17$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkOptionalInlineSignup$lambda$17$lambda$16$lambda$15(MutableState mutableState) {
        LinkOptionalInlineSignup$lambda$17$lambda$12(mutableState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0127  */
    /* renamed from: EmailCollection-7FxtGnE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m7901EmailCollection7FxtGnE(final boolean z, final TextFieldController emailController, final SignUpState signUpState, final int i, FocusRequester focusRequester, boolean z2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        boolean z3;
        int i4;
        int i5;
        FocusRequester focusRequester2;
        int i6;
        boolean z4;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function22;
        FocusRequester focusRequester3;
        boolean z5;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Composer composer2;
        Continuation continuation;
        boolean z6;
        boolean z7;
        FocusRequester focusRequester4;
        final FocusRequester focusRequester5;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1449184955);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
            z3 = z;
        } else if ((i2 & 6) == 0) {
            z3 = z;
            i4 = (composerStartRestartGroup.changed(z3) ? 4 : 2) | i2;
        } else {
            z3 = z;
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(emailController) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(signUpState) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else {
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i2 & 24576) == 0) {
                    focusRequester2 = focusRequester;
                    i4 |= composerStartRestartGroup.changed(focusRequester2) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i2) == 0) {
                        z4 = z2;
                        i4 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        function22 = function2;
                    } else {
                        function22 = function2;
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                    }
                    if ((i4 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(-1492088325);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new FocusRequester();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            focusRequester3 = (FocusRequester) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            focusRequester3 = focusRequester2;
                        }
                        z5 = i6 == 0 ? false : z4;
                        if (i7 != 0) {
                            function22 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1449184955, i4, -1, "com.stripe.android.link.ui.inline.EmailCollection (LinkOptionalInlineSignup.kt:177)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                        int i8 = i4 >> 3;
                        function23 = function22;
                        FocusRequester focusRequester6 = focusRequester3;
                        composer2 = composerStartRestartGroup;
                        int i9 = i4;
                        TextFieldUIKt.m8846TextFieldZkbtPhE(emailController, z3, i, FocusRequesterModifierKt.focusRequester(RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), focusRequester3), null, 0, 0, null, false, false, composer2, (i8 & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i8 & 896), PointerIconCompat.TYPE_TEXT);
                        composer2.startReplaceGroup(-1293860752);
                        if (signUpState != SignUpState.VerifyingEmail) {
                            float f = 8;
                            Modifier modifierM1023paddingqDBjuR0 = PaddingKt.m1023paddingqDBjuR0(SizeKt.m1065size3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(32)), Dp.m6117constructorimpl(0), Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(16), Dp.m6117constructorimpl(f));
                            composer2.startReplaceGroup(-1293852465);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return LinkOptionalInlineSignupKt.EmailCollection_7FxtGnE$lambda$22$lambda$21$lambda$20((SemanticsPropertyReceiver) obj);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            continuation = null;
                            z6 = false;
                            z7 = true;
                            CircularProgressIndicatorKt.m8618CircularProgressIndicatorLxG7B9w(SemanticsModifierKt.semantics$default(modifierM1023paddingqDBjuR0, false, (Function1) objRememberedValue2, 1, null), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), Dp.m6117constructorimpl(2), 0L, 0, composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 24);
                            composer2 = composer2;
                        } else {
                            continuation = null;
                            z6 = false;
                            z7 = true;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1293845499);
                        if (function23 != null) {
                            function23.invoke(composer2, Integer.valueOf((i9 >> 18) & 14));
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (z5) {
                            focusRequester4 = focusRequester6;
                        } else {
                            Unit unit = Unit.INSTANCE;
                            composer2.startReplaceGroup(-1492053701);
                            boolean z9 = (i9 & 57344) == 16384 ? z7 : z6;
                            LinkOptionalInlineSignupKt$EmailCollection$3$1 linkOptionalInlineSignupKt$EmailCollection$3$1RememberedValue = composer2.rememberedValue();
                            if (z9 || linkOptionalInlineSignupKt$EmailCollection$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                focusRequester4 = focusRequester6;
                                linkOptionalInlineSignupKt$EmailCollection$3$1RememberedValue = new LinkOptionalInlineSignupKt$EmailCollection$3$1(focusRequester4, continuation);
                                composer2.updateRememberedValue(linkOptionalInlineSignupKt$EmailCollection$3$1RememberedValue);
                            } else {
                                focusRequester4 = focusRequester6;
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkOptionalInlineSignupKt$EmailCollection$3$1RememberedValue, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        focusRequester5 = focusRequester4;
                        function24 = function23;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function24 = function22;
                        focusRequester5 = focusRequester2;
                        z8 = z4;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LinkOptionalInlineSignupKt.EmailCollection_7FxtGnE$lambda$24(z, emailController, signUpState, i, focusRequester5, z8, function24, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z4 = z2;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i4 & 599187) == 599186) {
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default2);
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
                        int i82 = i4 >> 3;
                        function23 = function22;
                        FocusRequester focusRequester62 = focusRequester3;
                        composer2 = composerStartRestartGroup;
                        int i92 = i4;
                        TextFieldUIKt.m8846TextFieldZkbtPhE(emailController, z3, i, FocusRequesterModifierKt.focusRequester(RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), focusRequester3), null, 0, 0, null, false, false, composer2, (i82 & 14) | ((i4 << 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i82 & 896), PointerIconCompat.TYPE_TEXT);
                        composer2.startReplaceGroup(-1293860752);
                        if (signUpState != SignUpState.VerifyingEmail) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1293845499);
                        if (function23 != null) {
                        }
                        composer2.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (z5) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        focusRequester5 = focusRequester4;
                        function24 = function23;
                        z8 = z5;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            focusRequester2 = focusRequester;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            z4 = z2;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i4 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        focusRequester2 = focusRequester;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        z4 = z2;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i4 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailCollection_7FxtGnE$lambda$22$lambda$21$lambda$20(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, "CircularProgressIndicator");
        return Unit.INSTANCE;
    }

    public static final void LinkLogo(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-572223225);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-572223225, i3, -1, "com.stripe.android.link.ui.inline.LinkLogo (LinkOptionalInlineSignup.kt:219)");
            }
            if (StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8725getComponent0d7_KjU())) {
                i4 = R.drawable.stripe_link_logo_knockout_black;
            } else {
                i4 = R.drawable.stripe_link_logo_knockout_white;
            }
            Painter painterPainterResource = PainterResources_androidKt.painterResource(i4, composerStartRestartGroup, 0);
            String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_link, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-881755055);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LinkOptionalInlineSignupKt.LinkLogo$lambda$26$lambda$25((SemanticsPropertyReceiver) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            IconKt.m1925Iconww6aTOc(painterPainterResource, strStringResource, SemanticsModifierKt.semantics$default(modifier, false, (Function1) objRememberedValue, 1, null), Color.INSTANCE.m3693getUnspecified0d7_KjU(), composerStartRestartGroup, 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkOptionalInlineSignupKt.LinkLogo$lambda$27(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkLogo$lambda$26$lambda$25(SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTestTag(semantics, "LinkLogoIcon");
        return Unit.INSTANCE;
    }

    private static final void PreviewInitial(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1641812953);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1641812953, i, -1, "com.stripe.android.link.ui.inline.PreviewInitial (LinkOptionalInlineSignup.kt:238)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7886getLambda2$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkOptionalInlineSignupKt.PreviewInitial$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewInitialWithPhoneFirst(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1540164879);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1540164879, i, -1, "com.stripe.android.link.ui.inline.PreviewInitialWithPhoneFirst (LinkOptionalInlineSignup.kt:259)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7888getLambda4$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkOptionalInlineSignupKt.PreviewInitialWithPhoneFirst$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewFilledOut(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(234525457);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(234525457, i, -1, "com.stripe.android.link.ui.inline.PreviewFilledOut (LinkOptionalInlineSignup.kt:280)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkOptionalInlineSignupKt.INSTANCE.m7890getLambda6$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkOptionalInlineSignupKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkOptionalInlineSignupKt.PreviewFilledOut$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState LinkOptionalInlineSignup$lambda$0(State<InlineSignupViewState> state) {
        return state.getValue();
    }

    private static final ResolvableString LinkOptionalInlineSignup$lambda$1(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    private static final FieldError LinkOptionalInlineSignup$lambda$17$lambda$13(State<FieldError> state) {
        return state.getValue();
    }
}
