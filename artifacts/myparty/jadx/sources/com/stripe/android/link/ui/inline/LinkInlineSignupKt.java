package com.stripe.android.link.ui.inline;

import androidx.autofill.HintConstants;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.material.ContentAlpha;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusEventModifierKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.link.ui.LinkTermsType;
import com.stripe.android.link.ui.inline.LinkInlineSignupKt;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionController;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.menu.CheckboxKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LinkInlineSignup.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u001a;\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u009d\u0001\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010!\u001a!\u0010\"\u001a\u00020\f*\u00020\f2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%H\u0003¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020%2\u0006\u0010#\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010(\u001aC\u0010)\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010#\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0003¢\u0006\u0002\u0010,\u001a=\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\f2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u001fH\u0001¢\u0006\u0002\u00101\u001a\u0087\u0001\u00102\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u00103\u001a\u0002042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u00105\u001a\r\u00106\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00107\u001a\r\u00109\u001a\u00020\u0003H\u0003¢\u0006\u0002\u00107\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006:²\u0006\n\u0010;\u001a\u00020\nX\u008a\u0084\u0002²\u0006\f\u0010\u001d\u001a\u0004\u0018\u00010<X\u008a\u0084\u0002²\u0006\n\u0010=\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\f\u0010>\u001a\u0004\u0018\u00010?X\u008a\u0084\u0002"}, d2 = {"ProgressIndicatorTestTag", "", "LinkInlineSignup", "", "viewModel", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", ViewProps.ENABLED, "", "onStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "merchantName", "sectionController", "Lcom/stripe/android/uicore/elements/SectionController;", "emailController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "phoneNumberController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "expanded", "requiresNameCollection", "allowsDefaultOptIn", "linkSignUpOptInFeatureEnabled", "didAskToChangeSignupDetails", "errorMessage", "toggleExpanded", "Lkotlin/Function0;", "changeSignupDetails", "(Ljava/lang/String;Lcom/stripe/android/uicore/elements/SectionController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/link/ui/signup/SignUpState;ZZZZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "applyBorders", "simplifiedCheckbox", "shape", "Landroidx/compose/ui/graphics/Shape;", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "boxShape", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "LinkCheckbox", "contentAlpha", "", "(Ljava/lang/String;ZZFZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "LinkDefaultOptIn", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "onChange", "(ZLjava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LinkFields", "emailFocusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(ZZLcom/stripe/android/link/ui/signup/SignUpState;ZZZLjava/lang/String;Lcom/stripe/android/uicore/elements/SectionController;Lcom/stripe/android/uicore/elements/TextFieldController;Lcom/stripe/android/uicore/elements/PhoneNumberController;Lcom/stripe/android/uicore/elements/TextFieldController;Landroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "PreviewDOI", "PreviewSignInFeature", "paymentsheet_release", "viewState", "Lcom/stripe/android/core/strings/ResolvableString;", "didShowAllFields", "sectionError", "Lcom/stripe/android/uicore/elements/FieldError;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkInlineSignupKt {
    public static final String ProgressIndicatorTestTag = "CircularProgressIndicator";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkCheckbox$lambda$19(String str, boolean z, boolean z2, float f, boolean z3, Function0 function0, int i, Composer composer, int i2) {
        LinkCheckbox(str, z, z2, f, z3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkDefaultOptIn$lambda$20(boolean z, String str, String str2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        LinkDefaultOptIn(z, str, str2, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkFields$lambda$26(boolean z, boolean z2, SignUpState signUpState, boolean z3, boolean z4, boolean z5, String str, SectionController sectionController, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, FocusRequester focusRequester, Function0 function0, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        LinkFields(z, z2, signUpState, z3, z4, z5, str, sectionController, textFieldController, phoneNumberController, textFieldController2, focusRequester, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkInlineSignup$lambda$14(String str, SectionController sectionController, TextFieldController textFieldController, PhoneNumberController phoneNumberController, TextFieldController textFieldController2, SignUpState signUpState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str2, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        LinkInlineSignup(str, sectionController, textFieldController, phoneNumberController, textFieldController2, signUpState, z, z2, z3, z4, z5, z6, str2, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkInlineSignup$lambda$6(InlineSignupViewModel inlineSignupViewModel, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkInlineSignup(inlineSignupViewModel, z, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$27(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewDOI$lambda$28(int i, Composer composer, int i2) {
        PreviewDOI(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewSignInFeature$lambda$29(int i, Composer composer, int i2) {
        PreviewSignInFeature(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkInlineSignup(final InlineSignupViewModel viewModel, final boolean z, final Function1<? super InlineSignupViewState, Unit> onStateChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        State stateCollectAsState;
        boolean zChanged;
        LinkInlineSignupKt$LinkInlineSignup$1$1 linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue;
        FocusManager focusManager;
        SoftwareKeyboardController softwareKeyboardController;
        boolean zChanged2;
        LinkInlineSignupKt$LinkInlineSignup$2$1 linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue;
        boolean zChangedInstance;
        LinkInlineSignupKt$LinkInlineSignup$3$1 linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue;
        boolean zChangedInstance2;
        LinkInlineSignupKt$LinkInlineSignup$4$1 linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onStateChanged, "onStateChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(762633745);
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
                    ComposerKt.traceEventStart(762633745, i3, -1, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:75)");
                }
                stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getViewState(), null, composerStartRestartGroup, 0, 1);
                State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(viewModel.getErrorMessage(), null, composerStartRestartGroup, 0, 1);
                InlineSignupViewState inlineSignupViewStateLinkInlineSignup$lambda$0 = LinkInlineSignup$lambda$0(stateCollectAsState);
                composerStartRestartGroup.startReplaceGroup(-98366800);
                zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & 896) == 256);
                linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$1$1(onStateChanged, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(inlineSignupViewStateLinkInlineSignup$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue, composerStartRestartGroup, 0);
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
                SignUpState signUpState$paymentsheet_release = LinkInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                composerStartRestartGroup.startReplaceGroup(-98360110);
                zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
                linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$2$1(focusManager, softwareKeyboardController, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(signUpState$paymentsheet_release, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue, composerStartRestartGroup, 0);
                String merchantName = LinkInlineSignup$lambda$0(stateCollectAsState).getMerchantName();
                SectionController sectionController = viewModel.getSectionController();
                SimpleTextFieldController emailController = viewModel.getEmailController();
                PhoneNumberController phoneController = viewModel.getPhoneController();
                SimpleTextFieldController nameController = viewModel.getNameController();
                SignUpState signUpState$paymentsheet_release2 = LinkInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                boolean zIsExpanded$paymentsheet_release = LinkInlineSignup$lambda$0(stateCollectAsState).isExpanded$paymentsheet_release();
                boolean requiresNameCollection = viewModel.getRequiresNameCollection();
                boolean allowsDefaultOptIn = LinkInlineSignup$lambda$0(stateCollectAsState).getAllowsDefaultOptIn();
                boolean linkSignUpOptInFeatureEnabled = LinkInlineSignup$lambda$0(stateCollectAsState).getLinkSignUpOptInFeatureEnabled();
                boolean didAskToChangeSignupDetails = LinkInlineSignup$lambda$0(stateCollectAsState).getDidAskToChangeSignupDetails();
                ResolvableString resolvableStringLinkInlineSignup$lambda$1 = LinkInlineSignup$lambda$1(stateCollectAsState2);
                composerStartRestartGroup.startReplaceGroup(-98330608);
                String strResolve = resolvableStringLinkInlineSignup$lambda$1 != null ? null : ResolvableStringComposeUtilsKt.resolve(resolvableStringLinkInlineSignup$lambda$1, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-98329440);
                zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
                linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$3$1(viewModel);
                    composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function0 = (Function0) ((KFunction) linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue);
                composerStartRestartGroup.startReplaceGroup(-98327611);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
                linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance2 || linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$4$1(viewModel);
                    composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                LinkInlineSignup(merchantName, sectionController, emailController, phoneController, nameController, signUpState$paymentsheet_release2, z2, zIsExpanded$paymentsheet_release, requiresNameCollection, allowsDefaultOptIn, linkSignUpOptInFeatureEnabled, didAskToChangeSignupDetails, strResolve, function0, (Function0) ((KFunction) linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue), modifier4, composer2, (SectionController.$stable << 3) | (SimpleTextFieldController.$stable << 6) | (PhoneNumberController.$stable << 9) | (SimpleTextFieldController.$stable << 12) | ((i3 << 15) & 3670016), (i3 << 6) & 458752, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkInlineSignupKt.LinkInlineSignup$lambda$6(viewModel, z, onStateChanged, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            InlineSignupViewState inlineSignupViewStateLinkInlineSignup$lambda$02 = LinkInlineSignup$lambda$0(stateCollectAsState);
            composerStartRestartGroup.startReplaceGroup(-98366800);
            zChanged = composerStartRestartGroup.changed(stateCollectAsState) | ((i3 & 896) == 256);
            linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$1$1(onStateChanged, stateCollectAsState, null);
                composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(inlineSignupViewStateLinkInlineSignup$lambda$02, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$1$1RememberedValue, composerStartRestartGroup, 0);
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
                SignUpState signUpState$paymentsheet_release3 = LinkInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                composerStartRestartGroup.startReplaceGroup(-98360110);
                zChanged2 = composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changedInstance(focusManager) | composerStartRestartGroup.changed(softwareKeyboardController);
                linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$2$1(focusManager, softwareKeyboardController, stateCollectAsState, null);
                    composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(signUpState$paymentsheet_release3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$2$1RememberedValue, composerStartRestartGroup, 0);
                    String merchantName2 = LinkInlineSignup$lambda$0(stateCollectAsState).getMerchantName();
                    SectionController sectionController2 = viewModel.getSectionController();
                    SimpleTextFieldController emailController2 = viewModel.getEmailController();
                    PhoneNumberController phoneController2 = viewModel.getPhoneController();
                    SimpleTextFieldController nameController2 = viewModel.getNameController();
                    SignUpState signUpState$paymentsheet_release22 = LinkInlineSignup$lambda$0(stateCollectAsState).getSignUpState$paymentsheet_release();
                    boolean zIsExpanded$paymentsheet_release2 = LinkInlineSignup$lambda$0(stateCollectAsState).isExpanded$paymentsheet_release();
                    boolean requiresNameCollection2 = viewModel.getRequiresNameCollection();
                    boolean allowsDefaultOptIn2 = LinkInlineSignup$lambda$0(stateCollectAsState).getAllowsDefaultOptIn();
                    boolean linkSignUpOptInFeatureEnabled2 = LinkInlineSignup$lambda$0(stateCollectAsState).getLinkSignUpOptInFeatureEnabled();
                    boolean didAskToChangeSignupDetails2 = LinkInlineSignup$lambda$0(stateCollectAsState).getDidAskToChangeSignupDetails();
                    ResolvableString resolvableStringLinkInlineSignup$lambda$12 = LinkInlineSignup$lambda$1(stateCollectAsState22);
                    composerStartRestartGroup.startReplaceGroup(-98330608);
                    if (resolvableStringLinkInlineSignup$lambda$12 != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-98329440);
                    zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
                    linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$3$1(viewModel);
                        composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Function0 function02 = (Function0) ((KFunction) linkInlineSignupKt$LinkInlineSignup$3$1RememberedValue);
                        composerStartRestartGroup.startReplaceGroup(-98327611);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
                        linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2) {
                            linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$4$1(viewModel);
                            composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            LinkInlineSignup(merchantName2, sectionController2, emailController2, phoneController2, nameController2, signUpState$paymentsheet_release22, z2, zIsExpanded$paymentsheet_release2, requiresNameCollection2, allowsDefaultOptIn2, linkSignUpOptInFeatureEnabled2, didAskToChangeSignupDetails2, strResolve, function02, (Function0) ((KFunction) linkInlineSignupKt$LinkInlineSignup$4$1RememberedValue), modifier4, composer2, (SectionController.$stable << 3) | (SimpleTextFieldController.$stable << 6) | (PhoneNumberController.$stable << 9) | (SimpleTextFieldController.$stable << 12) | ((i3 << 15) & 3670016), (i3 << 6) & 458752, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129 A[PHI: r28
      0x0129: PHI (r28v9 int) = (r28v0 int), (r28v3 int), (r28v4 int) binds: [B:80:0x0127, B:87:0x0139, B:86:0x0136] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkInlineSignup(final String merchantName, final SectionController sectionController, final TextFieldController emailController, final PhoneNumberController phoneNumberController, final TextFieldController nameController, final SignUpState signUpState, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final String str, final Function0<Unit> toggleExpanded, final Function0<Unit> changeSignupDetails, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object objRememberedValue;
        final CoroutineScope coroutineScope;
        Object objRememberedValue2;
        FocusRequester focusRequester;
        Object objRememberedValue3;
        final BringIntoViewRequester bringIntoViewRequester;
        boolean z7;
        boolean zChanged;
        LinkInlineSignupKt$LinkInlineSignup$6$1 linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue;
        float disabled;
        boolean zChangedInstance;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM3150constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        int i9;
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(sectionController, "sectionController");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Intrinsics.checkNotNullParameter(toggleExpanded, "toggleExpanded");
        Intrinsics.checkNotNullParameter(changeSignupDetails, "changeSignupDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(1893981652);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changed(merchantName) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? composerStartRestartGroup.changed(sectionController) : composerStartRestartGroup.changedInstance(sectionController) ? 32 : 16;
        }
        int i10 = i4;
        if ((i3 & 4) != 0) {
            i10 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(emailController) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i10 |= 3072;
        } else if ((i & 3072) == 0) {
            i10 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i10 |= 24576;
        } else if ((i & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(nameController) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i10 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i10 |= composerStartRestartGroup.changed(signUpState) ? 131072 : 65536;
        }
        if ((i3 & 64) == 0) {
            i9 = (1572864 & i) == 0 ? composerStartRestartGroup.changed(z) ? 1048576 : 524288 : 1572864;
            int i11 = 12582912;
            if ((i3 & 128) != 0) {
                i10 |= i11;
            } else if ((i & 12582912) == 0) {
                i11 = composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
                i10 |= i11;
            }
            if ((i3 & 256) == 0) {
                i10 |= 100663296;
            } else {
                if ((100663296 & i) == 0) {
                    i10 |= composerStartRestartGroup.changed(z3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 512) == 0) {
                    i8 = (805306368 & i) == 0 ? composerStartRestartGroup.changed(z4) ? 536870912 : 268435456 : 805306368;
                    i5 = i10;
                    if ((i3 & 1024) == 0) {
                        i6 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i6 = i2 | (composerStartRestartGroup.changed(z5) ? 4 : 2);
                    } else {
                        i6 = i2;
                    }
                    if ((i3 & 2048) == 0) {
                        i6 |= 48;
                    } else {
                        if ((i2 & 48) == 0) {
                            i6 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
                        }
                        if ((i3 & 4096) != 0) {
                            i6 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                        } else {
                            if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                                i6 |= composerStartRestartGroup.changed(str) ? 256 : 128;
                            }
                            if ((i3 & 8192) == 0) {
                                i6 |= 3072;
                            } else if ((i2 & 3072) == 0) {
                                i6 |= composerStartRestartGroup.changedInstance(toggleExpanded) ? 2048 : 1024;
                            }
                            if ((i3 & 16384) != 0) {
                                if ((i2 & 24576) == 0) {
                                    i6 |= composerStartRestartGroup.changedInstance(changeSignupDetails) ? 16384 : 8192;
                                }
                                i7 = i3 & 32768;
                                if (i7 != 0) {
                                    i6 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i6 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
                                }
                                if ((i5 & 306783379) != 306783378 || (74899 & i6) != 74898 || !composerStartRestartGroup.getSkipping()) {
                                    Modifier.Companion companion = i7 == 0 ? Modifier.INSTANCE : modifier;
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1893981652, i5, i6, "com.stripe.android.link.ui.inline.LinkInlineSignup (LinkInlineSignup.kt:132)");
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
                                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                    composerStartRestartGroup.startReplaceGroup(-98302332);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new FocusRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    focusRequester = (FocusRequester) objRememberedValue2;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(-98299988);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = BringIntoViewRequesterKt.BringIntoViewRequester();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    z7 = !z5 || z4;
                                    Boolean boolValueOf = Boolean.valueOf(z2);
                                    int i12 = i6;
                                    composerStartRestartGroup.startReplaceGroup(-98295146);
                                    int i13 = i5 & 29360128;
                                    zChanged = (i13 != 8388608) | composerStartRestartGroup.changed(z7);
                                    linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged || linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                                        linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$6$1(z2, z7, focusRequester, null);
                                        composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    int i14 = (i5 >> 21) & 14;
                                    EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue, composerStartRestartGroup, i14);
                                    if (z) {
                                        composerStartRestartGroup.startReplaceGroup(-98289329);
                                        disabled = ContentAlpha.INSTANCE.getDisabled(composerStartRestartGroup, ContentAlpha.$stable);
                                    } else {
                                        composerStartRestartGroup.startReplaceGroup(-98290069);
                                        disabled = ContentAlpha.INSTANCE.getHigh(composerStartRestartGroup, ContentAlpha.$stable);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Shape shapeBoxShape = boxShape(z7, composerStartRestartGroup, 0);
                                    Modifier modifierApplyBorders = applyBorders(companion, z7, shapeBoxShape, composerStartRestartGroup, (i12 >> 15) & 14);
                                    Modifier modifier3 = companion;
                                    composerStartRestartGroup.startReplaceGroup(-98282971);
                                    zChangedInstance = (i13 != 8388608) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bringIntoViewRequester);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new Function1() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return LinkInlineSignupKt.LinkInlineSignup$lambda$11$lambda$10(z2, coroutineScope, bringIntoViewRequester, (FocusState) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifierBringIntoViewRequester = BringIntoViewRequesterKt.bringIntoViewRequester(FocusEventModifierKt.onFocusEvent(modifierApplyBorders, (Function1) objRememberedValue4), bringIntoViewRequester);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBringIntoViewRequester);
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
                                    Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Modifier modifierAlpha = AlphaKt.alpha(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), shapeBoxShape), disabled);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                    currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                        composerStartRestartGroup.createNode(constructor2);
                                    } else {
                                        composerStartRestartGroup.useNode();
                                    }
                                    composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                                    Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (!composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    int i15 = i5 >> 12;
                                    float f = disabled;
                                    composer2 = composerStartRestartGroup;
                                    LinkCheckbox(merchantName, z2, z, f, z7, toggleExpanded, composer2, (i5 & 14) | ((i5 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i15 & 896) | ((i12 << 6) & 458752));
                                    composer2.startReplaceGroup(-152924492);
                                    if (!z5) {
                                        int i16 = i5 >> 15;
                                        int i17 = i12 << 12;
                                        int i18 = (i16 & 57344) | (i16 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | i14 | ((i5 >> 9) & 896) | (i16 & 7168) | (458752 & i17) | (i17 & 3670016) | (SectionController.$stable << 21);
                                        int i19 = i5 << 18;
                                        LinkFields(z2, z, signUpState, z3, z4, z6, str, sectionController, emailController, phoneNumberController, nameController, focusRequester, changeSignupDetails, null, composer2, i18 | (29360128 & i19) | (234881024 & i19) | (PhoneNumberController.$stable << 27) | (i19 & 1879048192), (i15 & 14) | 48 | ((i12 >> 6) & 896), 8192);
                                        composer2 = composer2;
                                    }
                                    composer2.endReplaceGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composer2.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = modifier3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    modifier2 = modifier;
                                    composer2 = composerStartRestartGroup;
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj, Object obj2) {
                                            return LinkInlineSignupKt.LinkInlineSignup$lambda$14(merchantName, sectionController, emailController, phoneNumberController, nameController, signUpState, z, z2, z3, z4, z5, z6, str, toggleExpanded, changeSignupDetails, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            i6 |= 24576;
                            i7 = i3 & 32768;
                            if (i7 != 0) {
                            }
                            if ((i5 & 306783379) != 306783378) {
                                if (i7 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                                composerStartRestartGroup.startReplaceGroup(-98302332);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                }
                                focusRequester = (FocusRequester) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-98299988);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                }
                                bringIntoViewRequester = (BringIntoViewRequester) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                if (z5) {
                                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                                    int i122 = i6;
                                    composerStartRestartGroup.startReplaceGroup(-98295146);
                                    int i132 = i5 & 29360128;
                                    zChanged = (i132 != 8388608) | composerStartRestartGroup.changed(z7);
                                    linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (!zChanged) {
                                        linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue = new LinkInlineSignupKt$LinkInlineSignup$6$1(z2, z7, focusRequester, null);
                                        composerStartRestartGroup.updateRememberedValue(linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue);
                                        composerStartRestartGroup.endReplaceGroup();
                                        int i142 = (i5 >> 21) & 14;
                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) linkInlineSignupKt$LinkInlineSignup$6$1RememberedValue, composerStartRestartGroup, i142);
                                        if (z) {
                                        }
                                        composerStartRestartGroup.endReplaceGroup();
                                        Shape shapeBoxShape2 = boxShape(z7, composerStartRestartGroup, 0);
                                        Modifier modifierApplyBorders2 = applyBorders(companion, z7, shapeBoxShape2, composerStartRestartGroup, (i122 >> 15) & 14);
                                        Modifier modifier32 = companion;
                                        composerStartRestartGroup.startReplaceGroup(-98282971);
                                        zChangedInstance = (i132 != 8388608) | composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(bringIntoViewRequester);
                                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance) {
                                            objRememberedValue4 = new Function1() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return LinkInlineSignupKt.LinkInlineSignup$lambda$11$lambda$10(z2, coroutineScope, bringIntoViewRequester, (FocusState) obj);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                            composerStartRestartGroup.endReplaceGroup();
                                            Modifier modifierBringIntoViewRequester2 = BringIntoViewRequesterKt.bringIntoViewRequester(FocusEventModifierKt.onFocusEvent(modifierApplyBorders2, (Function1) objRememberedValue4), bringIntoViewRequester);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierBringIntoViewRequester2);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (!composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM3150constructorimpl = Updater.m3150constructorimpl(composerStartRestartGroup);
                                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (!composerM3150constructorimpl.getInserting()) {
                                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                                Modifier modifierAlpha2 = AlphaKt.alpha(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), shapeBoxShape2), disabled);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                                currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier22 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlpha2);
                                                Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                                }
                                                composerStartRestartGroup.startReusableNode();
                                                if (!composerStartRestartGroup.getInserting()) {
                                                }
                                                composerM3150constructorimpl2 = Updater.m3150constructorimpl(composerStartRestartGroup);
                                                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (!composerM3150constructorimpl2.getInserting()) {
                                                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                                    Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                                                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                                    int i152 = i5 >> 12;
                                                    float f2 = disabled;
                                                    composer2 = composerStartRestartGroup;
                                                    LinkCheckbox(merchantName, z2, z, f2, z7, toggleExpanded, composer2, (i5 & 14) | ((i5 >> 18) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i152 & 896) | ((i122 << 6) & 458752));
                                                    composer2.startReplaceGroup(-152924492);
                                                    if (!z5) {
                                                    }
                                                    composer2.endReplaceGroup();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    composer2.endNode();
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    modifier2 = modifier32;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        if ((i3 & 8192) == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                        }
                        i7 = i3 & 32768;
                        if (i7 != 0) {
                        }
                        if ((i5 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    if ((i3 & 4096) != 0) {
                    }
                    if ((i3 & 8192) == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    i7 = i3 & 32768;
                    if (i7 != 0) {
                    }
                    if ((i5 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i10 |= i8;
                i5 = i10;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                if ((i3 & 4096) != 0) {
                }
                if ((i3 & 8192) == 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                i7 = i3 & 32768;
                if (i7 != 0) {
                }
                if ((i5 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i3 & 512) == 0) {
            }
            i10 |= i8;
            i5 = i10;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            if ((i3 & 8192) == 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            i7 = i3 & 32768;
            if (i7 != 0) {
            }
            if ((i5 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i10 |= i9;
        int i112 = 12582912;
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i10 |= i8;
        i5 = i10;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        if ((i3 & 8192) == 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        i7 = i3 & 32768;
        if (i7 != 0) {
        }
        if ((i5 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkInlineSignup$lambda$11$lambda$10(boolean z, CoroutineScope coroutineScope, BringIntoViewRequester bringIntoViewRequester, FocusState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getHasFocus() && z) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new LinkInlineSignupKt$LinkInlineSignup$7$1$1(bringIntoViewRequester, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final Modifier applyBorders(Modifier modifier, boolean z, Shape shape, Composer composer, int i) {
        composer.startReplaceGroup(-2065981761);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2065981761, i, -1, "com.stripe.android.link.ui.inline.applyBorders (LinkInlineSignup.kt:199)");
        }
        if (!z) {
            modifier = BackgroundKt.m574backgroundbw27NRU(BorderKt.border(modifier, StripeThemeKt.getBorderStroke(MaterialTheme.INSTANCE, false, composer, MaterialTheme.$stable | 48), shape), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8725getComponent0d7_KjU(), shape);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifier;
    }

    private static final Shape boxShape(boolean z, Composer composer, int i) {
        Shape roundedCornerShape;
        composer.startReplaceGroup(-198564372);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-198564372, i, -1, "com.stripe.android.link.ui.inline.boxShape (LinkInlineSignup.kt:213)");
        }
        if (z) {
            roundedCornerShape = RectangleShapeKt.getRectangleShape();
        } else {
            roundedCornerShape = StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getRoundedCornerShape();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return roundedCornerShape;
    }

    private static final void LinkCheckbox(String str, final boolean z, final boolean z2, final float f, final boolean z3, final Function0<Unit> function0, Composer composer, final int i) {
        final String str2;
        int i2;
        boolean z4;
        String strStringResource;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-655792615);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            z4 = z;
            i2 |= composerStartRestartGroup.changed(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-655792615, i2, -1, "com.stripe.android.link.ui.inline.LinkCheckbox (LinkInlineSignup.kt:228)");
            }
            if (z3) {
                composerStartRestartGroup.startReplaceGroup(92948400);
                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_inline_sign_up_header_default_opt_in, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(93042175);
                strStringResource = StringResources_androidKt.stringResource(R.string.stripe_inline_sign_up_header, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            String str3 = strStringResource;
            composerStartRestartGroup.startReplaceGroup(-1521016199);
            String strStringResource2 = !z3 ? StringResources_androidKt.stringResource(R.string.stripe_sign_up_message, new Object[]{str2}, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = z3 ? companion.getCenterVertically() : companion.getTop();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1521006451);
            boolean z5 = (458752 & i2) == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LinkInlineSignupKt.LinkCheckbox$lambda$16$lambda$15(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Alignment.Vertical vertical = centerVertically;
            Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(ClickableKt.m608clickableXHw0xAI$default(companion2, z2, null, null, (Function0) objRememberedValue, 6, null), Dp.m6117constructorimpl(z3 ? 0 : 16));
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), vertical, composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1020padding3ABfNKs);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CheckboxKt.Checkbox(z4, null, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 11, null), z2, composerStartRestartGroup, ((i2 >> 3) & 14) | 432 | ((i2 << 3) & 7168), 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2076Text4IGK_g(str3, (Modifier) null, Color.m3656copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1832getOnSurface0d7_KjU(), f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, TextStyle.m5615copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBody1(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, 0, 0, 65530);
            composerStartRestartGroup.startReplaceGroup(82409091);
            if (strStringResource2 != null) {
                composer2 = composerStartRestartGroup;
                TextKt.m2076Text4IGK_g(strStringResource2, PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(4), 0.0f, 0.0f, 13, null), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composerStartRestartGroup, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBody1(), composer2, 48, 0, 65528);
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkInlineSignupKt.LinkCheckbox$lambda$19(str2, z, z2, f, z3, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkCheckbox$lambda$16$lambda$15(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkDefaultOptIn(final boolean z, final String email, final String phoneNumber, Modifier modifier, final Function0<Unit> onChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-67187253);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(email) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changed(phoneNumber) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onChange) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-67187253, i3, -1, "com.stripe.android.link.ui.inline.LinkDefaultOptIn (LinkInlineSignup.kt:280)");
                }
                SectionUIKt.m8829SectionCardfWhpE4E(companion, null, false, 0L, null, ComposableLambdaKt.rememberComposableLambda(-883197552, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt.LinkDefaultOptIn.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-883197552, i5, -1, "com.stripe.android.link.ui.inline.LinkDefaultOptIn.<anonymous> (LinkInlineSignup.kt:282)");
                            }
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
                            Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16));
                            boolean z2 = z;
                            Function0<Unit> function0 = onChange;
                            String str = email;
                            String str2 = phoneNumber;
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composer2, 54);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1020padding3ABfNKs);
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
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2076Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1832getOnSurface0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 3120, 120826);
                            TextKt.m2076Text4IGK_g(str2, (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 3120, 120826);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(com.stripe.android.uicore.R.string.stripe_change, composer2, 0), ClickableKt.m608clickableXHw0xAI$default(Modifier.INSTANCE, z2, null, null, function0, 6, null), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getSubtitle1(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65496);
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
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = companion;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LinkInlineSignupKt.LinkDefaultOptIn$lambda$20(z, email, phoneNumber, modifier3, onChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SectionUIKt.m8829SectionCardfWhpE4E(companion, null, false, 0L, null, ComposableLambdaKt.rememberComposableLambda(-883197552, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt.LinkDefaultOptIn.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-883197552, i5, -1, "com.stripe.android.link.ui.inline.LinkDefaultOptIn.<anonymous> (LinkInlineSignup.kt:282)");
                        }
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM900spacedBy0680j_4 = Arrangement.INSTANCE.m900spacedBy0680j_4(Dp.m6117constructorimpl(8));
                        Modifier modifierM1020padding3ABfNKs = PaddingKt.m1020padding3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(16));
                        boolean z2 = z;
                        Function0<Unit> function0 = onChange;
                        String str = email;
                        String str2 = phoneNumber;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM900spacedBy0680j_4, centerVertically, composer2, 54);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1020padding3ABfNKs);
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
                        Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer2);
                        Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2076Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1832getOnSurface0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 3120, 120826);
                        TextKt.m2076Text4IGK_g(str2, (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer2, MaterialTheme.$stable).m8730getSubtitle0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6056getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 3120, 120826);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        TextKt.m2076Text4IGK_g(StringResources_androidKt.stringResource(com.stripe.android.uicore.R.string.stripe_change, composer2, 0), ClickableKt.m608clickableXHw0xAI$default(Modifier.INSTANCE, z2, null, null, function0, 6, null), MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable).m1833getPrimary0d7_KjU(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getSubtitle1(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65496);
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
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = companion;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkFields(final boolean z, final boolean z2, final SignUpState signUpState, final boolean z3, final boolean z4, final boolean z5, final String str, final SectionController sectionController, final TextFieldController emailController, final PhoneNumberController phoneNumberController, final TextFieldController nameController, final FocusRequester emailFocusRequester, final Function0<Unit> changeSignupDetails, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z6;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object objRememberedValue;
        Modifier.Companion companionM1024paddingqDBjuR0$default;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        Intrinsics.checkNotNullParameter(sectionController, "sectionController");
        Intrinsics.checkNotNullParameter(emailController, "emailController");
        Intrinsics.checkNotNullParameter(phoneNumberController, "phoneNumberController");
        Intrinsics.checkNotNullParameter(nameController, "nameController");
        Intrinsics.checkNotNullParameter(emailFocusRequester, "emailFocusRequester");
        Intrinsics.checkNotNullParameter(changeSignupDetails, "changeSignupDetails");
        Composer composerStartRestartGroup = composer.startRestartGroup(1327944439);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | (composerStartRestartGroup.changed(z) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
            z6 = z2;
        } else {
            z6 = z2;
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(z6) ? 32 : 16;
            }
        }
        int i10 = i4;
        if ((i3 & 4) != 0) {
            i5 = i10 | BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i5 = i10 | (composerStartRestartGroup.changed(signUpState) ? 256 : 128);
        } else {
            i5 = i10;
        }
        if ((i3 & 8) != 0) {
            i5 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            if ((i3 & 16) == 0) {
                i5 |= 24576;
            } else if ((i & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i5 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i5 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i5 |= 1572864;
            } else {
                if ((i & 1572864) == 0) {
                    i5 |= composerStartRestartGroup.changed(str) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i5 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    i5 |= (i & 16777216) == 0 ? composerStartRestartGroup.changed(sectionController) : composerStartRestartGroup.changedInstance(sectionController) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i5 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changedInstance(emailController) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                }
                if ((i3 & 512) != 0) {
                    i5 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    i5 |= (i & BasicMeasure.EXACTLY) == 0 ? composerStartRestartGroup.changed(phoneNumberController) : composerStartRestartGroup.changedInstance(phoneNumberController) ? 536870912 : 268435456;
                }
                i6 = i5;
                if ((i3 & 1024) != 0) {
                    i7 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    i7 = i2 | (composerStartRestartGroup.changedInstance(nameController) ? 4 : 2);
                } else {
                    i7 = i2;
                }
                if ((i3 & 2048) != 0) {
                    i7 |= 48;
                } else if ((i2 & 48) == 0) {
                    i7 |= composerStartRestartGroup.changed(emailFocusRequester) ? 32 : 16;
                }
                if ((i3 & 4096) != 0) {
                    i7 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
                } else if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                    i7 |= composerStartRestartGroup.changedInstance(changeSignupDetails) ? 256 : 128;
                }
                i8 = i3 & 8192;
                if (i8 == 0) {
                    i9 = i8;
                    if ((i2 & 3072) == 0) {
                        i7 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
                    }
                    if ((i6 & 306783379) == 306783378 || (i7 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i9 == 0 ? Modifier.INSTANCE : modifier;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1327944439, i6, i7, "com.stripe.android.link.ui.inline.LinkFields (LinkInlineSignup.kt:331)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(-183281912);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LinkInlineSignupKt.LinkFields$lambda$22$lambda$21();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        State stateCollectAsState = StateFlowsComposeKt.collectAsState(sectionController.getError(), null, composerStartRestartGroup, 0, 1);
                        if (!z4) {
                            companionM1024paddingqDBjuR0$default = Modifier.INSTANCE;
                        } else {
                            float f = 16;
                            companionM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6117constructorimpl(f), 0.0f, Dp.m6117constructorimpl(f), Dp.m6117constructorimpl(f), 2, null);
                        }
                        String initialValue = emailController.getInitialValue();
                        Modifier modifier3 = companion;
                        AnimatedVisibilityKt.AnimatedVisibility(z, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(760335823, true, new C10441(companionM1024paddingqDBjuR0$default, (z4 || !(initialValue == null && !StringsKt.isBlank(initialValue)) || StringsKt.isBlank(phoneNumberController.getInitialPhoneNumber()) || z5) ? false : true, emailController, phoneNumberController, z6, changeSignupDetails, z4, nameController, signUpState, z3, str, mutableState, emailFocusRequester, stateCollectAsState), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier2 = modifier;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return LinkInlineSignupKt.LinkFields$lambda$26(z, z2, signUpState, z3, z4, z5, str, sectionController, emailController, phoneNumberController, nameController, emailFocusRequester, changeSignupDetails, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i7 |= 3072;
                i9 = i8;
                if ((i6 & 306783379) == 306783378) {
                    if (i9 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(-183281912);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(sectionController.getError(), null, composerStartRestartGroup, 0, 1);
                    if (!z4) {
                    }
                    String initialValue2 = emailController.getInitialValue();
                    if (initialValue2 == null) {
                        if (z4) {
                            Modifier modifier32 = companion;
                            AnimatedVisibilityKt.AnimatedVisibility(z, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(760335823, true, new C10441(companionM1024paddingqDBjuR0$default, (z4 || !(initialValue2 == null && !StringsKt.isBlank(initialValue2)) || StringsKt.isBlank(phoneNumberController.getInitialPhoneNumber()) || z5) ? false : true, emailController, phoneNumberController, z6, changeSignupDetails, z4, nameController, signUpState, z3, str, mutableState2, emailFocusRequester, stateCollectAsState2), composerStartRestartGroup, 54), composerStartRestartGroup, (i6 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 28);
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier32;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 128) != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) != 0) {
            }
            i6 = i5;
            if ((i3 & 1024) != 0) {
            }
            if ((i3 & 2048) != 0) {
            }
            if ((i3 & 4096) != 0) {
            }
            i8 = i3 & 8192;
            if (i8 == 0) {
            }
            if ((i6 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 16) == 0) {
        }
        if ((i3 & 32) == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) != 0) {
        }
        i6 = i5;
        if ((i3 & 1024) != 0) {
        }
        if ((i3 & 2048) != 0) {
        }
        if ((i3 & 4096) != 0) {
        }
        i8 = i3 & 8192;
        if (i8 == 0) {
        }
        if ((i6 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState LinkFields$lambda$22$lambda$21() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LinkFields$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LinkFields$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: LinkInlineSignup.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkFields$1, reason: invalid class name and case insensitive filesystem */
    static final class C10441 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ boolean $allowsDefaultOptIn;
        final /* synthetic */ Function0<Unit> $changeSignupDetails;
        final /* synthetic */ Modifier $columnModifier;
        final /* synthetic */ MutableState<Boolean> $didShowAllFields$delegate;
        final /* synthetic */ TextFieldController $emailController;
        final /* synthetic */ FocusRequester $emailFocusRequester;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ String $errorMessage;
        final /* synthetic */ TextFieldController $nameController;
        final /* synthetic */ PhoneNumberController $phoneNumberController;
        final /* synthetic */ boolean $requiresNameCollection;
        final /* synthetic */ State<FieldError> $sectionError$delegate;
        final /* synthetic */ boolean $showDefaultOptIn;
        final /* synthetic */ SignUpState $signUpState;

        C10441(Modifier modifier, boolean z, TextFieldController textFieldController, PhoneNumberController phoneNumberController, boolean z2, Function0<Unit> function0, boolean z3, TextFieldController textFieldController2, SignUpState signUpState, boolean z4, String str, MutableState<Boolean> mutableState, FocusRequester focusRequester, State<FieldError> state) {
            this.$columnModifier = modifier;
            this.$showDefaultOptIn = z;
            this.$emailController = textFieldController;
            this.$phoneNumberController = phoneNumberController;
            this.$enabled = z2;
            this.$changeSignupDetails = function0;
            this.$allowsDefaultOptIn = z3;
            this.$nameController = textFieldController2;
            this.$signUpState = signUpState;
            this.$requiresNameCollection = z4;
            this.$errorMessage = str;
            this.$didShowAllFields$delegate = mutableState;
            this.$emailFocusRequester = focusRequester;
            this.$sectionError$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            boolean z;
            float fM6117constructorimpl;
            boolean z2;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(760335823, i, -1, "com.stripe.android.link.ui.inline.LinkFields.<anonymous> (LinkInlineSignup.kt:351)");
            }
            Modifier modifier = this.$columnModifier;
            boolean z3 = this.$showDefaultOptIn;
            TextFieldController textFieldController = this.$emailController;
            PhoneNumberController phoneNumberController = this.$phoneNumberController;
            boolean z4 = this.$enabled;
            Function0<Unit> function0 = this.$changeSignupDetails;
            final boolean z5 = this.$allowsDefaultOptIn;
            TextFieldController textFieldController2 = this.$nameController;
            SignUpState signUpState = this.$signUpState;
            boolean z6 = this.$requiresNameCollection;
            SignUpState signUpState2 = signUpState;
            String str = this.$errorMessage;
            final MutableState<Boolean> mutableState = this.$didShowAllFields$delegate;
            FocusRequester focusRequester = this.$emailFocusRequester;
            State<FieldError> state = this.$sectionError$delegate;
            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifier);
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
            if (z3) {
                composer2.startReplaceGroup(-613897911);
                String initialValue = textFieldController.getInitialValue();
                if (initialValue == null) {
                    initialValue = "";
                }
                LinkInlineSignupKt.LinkDefaultOptIn(z4, initialValue, phoneNumberController.formatLocalNumber(), PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), function0, composer2, 3072, 0);
                composer2.endReplaceGroup();
                z2 = false;
            } else {
                composer2.startReplaceGroup(-613513945);
                FieldError fieldErrorLinkFields$lambda$25 = LinkInlineSignupKt.LinkFields$lambda$25(state);
                Integer numValueOf = fieldErrorLinkFields$lambda$25 != null ? Integer.valueOf(fieldErrorLinkFields$lambda$25.getErrorMessage()) : null;
                boolean zLinkFields$lambda$23 = LinkInlineSignupKt.LinkFields$lambda$23(mutableState);
                Modifier.Companion companion = Modifier.INSTANCE;
                if (z5) {
                    fM6117constructorimpl = Dp.m6117constructorimpl(8);
                    z = false;
                } else {
                    z = false;
                    fM6117constructorimpl = Dp.m6117constructorimpl(0);
                }
                Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(companion, 0.0f, fM6117constructorimpl, 0.0f, 0.0f, 13, null);
                composer2.startReplaceGroup(-573956824);
                boolean zChanged = composer2.changed(mutableState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkFields$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LinkInlineSignupKt.C10441.invoke$lambda$2$lambda$1$lambda$0(mutableState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                z2 = z;
                LinkInlineSignupFieldsKt.LinkInlineSignupFields(numValueOf, textFieldController, phoneNumberController, textFieldController2, signUpState2, z4, false, z6, z5, str, zLinkFields$lambda$23, (Function0) objRememberedValue, modifierM1024paddingqDBjuR0$default, focusRequester, null, null, composer, (PhoneNumberController.$stable << 6) | 1572864, 0, 49152);
                signUpState2 = signUpState2;
                composer2 = composer;
                composer2.endReplaceGroup();
            }
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, (z5 || signUpState2 == SignUpState.InputtingRemainingFields) ? true : z2, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-2051000163, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$LinkFields$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                    invoke(animatedVisibilityScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility2, Composer composer3, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility2, "$this$AnimatedVisibility");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2051000163, i2, -1, "com.stripe.android.link.ui.inline.LinkFields.<anonymous>.<anonymous>.<anonymous> (LinkInlineSignup.kt:380)");
                    }
                    LinkTermsKt.m7870LinkTerms8iNrtrE(z5 ? LinkTermsType.InlineWithDefaultOptIn : LinkTermsType.Inline, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 0.0f, 0.0f, 13, null), TextAlign.INSTANCE.m6011getStarte0LSkKk(), composer3, 48, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), composer, 1572870, 30);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState mutableState) {
            LinkInlineSignupKt.LinkFields$lambda$24(mutableState, true);
            return Unit.INSTANCE;
        }
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1596812407);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1596812407, i, -1, "com.stripe.android.link.ui.inline.Preview (LinkInlineSignup.kt:392)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkInlineSignupKt.INSTANCE.m7877getLambda2$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkInlineSignupKt.Preview$lambda$27(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewDOI(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1996002719);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1996002719, i, -1, "com.stripe.android.link.ui.inline.PreviewDOI (LinkInlineSignup.kt:418)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkInlineSignupKt.INSTANCE.m7879getLambda4$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkInlineSignupKt.PreviewDOI$lambda$28(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewSignInFeature(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1326433463);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1326433463, i, -1, "com.stripe.android.link.ui.inline.PreviewSignInFeature (LinkInlineSignup.kt:444)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$LinkInlineSignupKt.INSTANCE.m7881getLambda6$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkInlineSignupKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LinkInlineSignupKt.PreviewSignInFeature$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InlineSignupViewState LinkInlineSignup$lambda$0(State<InlineSignupViewState> state) {
        return state.getValue();
    }

    private static final ResolvableString LinkInlineSignup$lambda$1(State<? extends ResolvableString> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError LinkFields$lambda$25(State<FieldError> state) {
        return state.getValue();
    }
}
