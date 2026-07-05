package com.stripe.android.link.ui.verification;

import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.DialogWindowProvider;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.canhub.cropper.CropImageOptionsKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.link.ComposeExtensionsKt;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkActivityViewModel;
import com.stripe.android.link.injection.NativeLinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.model.LinkAppearance;
import com.stripe.android.link.theme.LinkTheme;
import com.stripe.android.link.theme.ThemeKt;
import com.stripe.android.uicore.elements.OTPElement;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: VerificationDialog.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000f\u001aw\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u001f\"\u000e\u0010\u001b\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u001cX\u0082T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, d2 = {"VerificationDialog", "", "modifier", "Landroidx/compose/ui/Modifier;", "linkAccount", "Lcom/stripe/android/link/model/LinkAccount;", "linkAppearance", "Lcom/stripe/android/link/model/LinkAppearance;", "onVerificationSucceeded", "Lkotlin/Function0;", "changeEmail", "onDismissClicked", "dismissWithResult", "Lkotlin/Function1;", "Lcom/stripe/android/link/LinkActivityResult;", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "VerificationDialogBody", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/link/ui/verification/VerificationViewState;", "otpElement", "Lcom/stripe/android/uicore/elements/OTPElement;", "onBack", "onFocusRequested", "didShowCodeSentNotification", "onChangeEmailClick", "onResendCodeClick", "(Landroidx/compose/ui/Modifier;Lcom/stripe/android/link/ui/verification/VerificationViewState;Lcom/stripe/android/uicore/elements/OTPElement;Lcom/stripe/android/link/model/LinkAppearance;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "DIM_LIGHT_THEME", "", "DIM_DARK_THEME", "VerificationDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationDialogKt {
    private static final float DIM_DARK_THEME = 0.3f;
    private static final float DIM_LIGHT_THEME = 0.8f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationDialog$lambda$7(Modifier modifier, LinkAccount linkAccount, LinkAppearance linkAppearance, Function0 function0, Function0 function02, Function0 function03, Function1 function1, int i, Composer composer, int i2) {
        VerificationDialog(modifier, linkAccount, linkAppearance, function0, function02, function03, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationDialogBody$lambda$9(Modifier modifier, VerificationViewState verificationViewState, OTPElement oTPElement, LinkAppearance linkAppearance, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, int i2, Composer composer, int i3) {
        VerificationDialogBody(modifier, verificationViewState, oTPElement, linkAppearance, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerificationDialogPreview$lambda$10(int i, Composer composer, int i2) {
        VerificationDialogPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void VerificationDialog(final Modifier modifier, final LinkAccount linkAccount, final LinkAppearance linkAppearance, final Function0<Unit> onVerificationSucceeded, final Function0<Unit> changeEmail, final Function0<Unit> onDismissClicked, final Function1<? super LinkActivityResult, Unit> dismissWithResult, Composer composer, final int i) {
        int i2;
        NativeLinkComponent activityRetainedComponent;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(linkAccount, "linkAccount");
        Intrinsics.checkNotNullParameter(onVerificationSucceeded, "onVerificationSucceeded");
        Intrinsics.checkNotNullParameter(changeEmail, "changeEmail");
        Intrinsics.checkNotNullParameter(onDismissClicked, "onDismissClicked");
        Intrinsics.checkNotNullParameter(dismissWithResult, "dismissWithResult");
        Composer composerStartRestartGroup = composer.startRestartGroup(1386896743);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(linkAccount) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(linkAppearance) : composerStartRestartGroup.changedInstance(linkAppearance) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onVerificationSucceeded) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(changeEmail) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismissClicked) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissWithResult) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1386896743, i3, -1, "com.stripe.android.link.ui.verification.VerificationDialog (VerificationDialog.kt:38)");
            }
            composerStartRestartGroup.startReplaceGroup(2047965416);
            LinkActivityViewModel viewModel = ComposeExtensionsKt.parentActivity(composerStartRestartGroup, 0).getViewModel();
            if (viewModel != null && (activityRetainedComponent = viewModel.getActivityRetainedComponent()) != null) {
                ViewModelProvider.Factory factory = VerificationViewModel.INSTANCE.factory(activityRetainedComponent, linkAccount, true, onVerificationSucceeded, changeEmail, onDismissClicked, dismissWithResult);
                composerStartRestartGroup.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(VerificationViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceGroup();
                VerificationViewModel verificationViewModel = (VerificationViewModel) viewModel2;
                VerificationViewState verificationViewStateVerificationDialog$lambda$1 = VerificationDialog$lambda$1(StateFlowsComposeKt.collectAsState(verificationViewModel.getViewState(), null, composerStartRestartGroup, 0, 1));
                OTPElement otpElement = verificationViewModel.getOtpElement();
                composerStartRestartGroup.startReplaceGroup(1364945390);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(verificationViewModel);
                VerificationDialogKt$VerificationDialog$1$1 verificationDialogKt$VerificationDialog$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || verificationDialogKt$VerificationDialog$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationDialogKt$VerificationDialog$1$1RememberedValue = new VerificationDialogKt$VerificationDialog$1$1(verificationViewModel);
                    composerStartRestartGroup.updateRememberedValue(verificationDialogKt$VerificationDialog$1$1RememberedValue);
                }
                KFunction kFunction = (KFunction) verificationDialogKt$VerificationDialog$1$1RememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1364946946);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(verificationViewModel);
                VerificationDialogKt$VerificationDialog$2$1 verificationDialogKt$VerificationDialog$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || verificationDialogKt$VerificationDialog$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationDialogKt$VerificationDialog$2$1RememberedValue = new VerificationDialogKt$VerificationDialog$2$1(verificationViewModel);
                    composerStartRestartGroup.updateRememberedValue(verificationDialogKt$VerificationDialog$2$1RememberedValue);
                }
                KFunction kFunction2 = (KFunction) verificationDialogKt$VerificationDialog$2$1RememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1364949074);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(verificationViewModel);
                VerificationDialogKt$VerificationDialog$3$1 verificationDialogKt$VerificationDialog$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || verificationDialogKt$VerificationDialog$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationDialogKt$VerificationDialog$3$1RememberedValue = new VerificationDialogKt$VerificationDialog$3$1(verificationViewModel);
                    composerStartRestartGroup.updateRememberedValue(verificationDialogKt$VerificationDialog$3$1RememberedValue);
                }
                KFunction kFunction3 = (KFunction) verificationDialogKt$VerificationDialog$3$1RememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1364950680);
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(verificationViewModel);
                VerificationDialogKt$VerificationDialog$4$1 verificationDialogKt$VerificationDialog$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || verificationDialogKt$VerificationDialog$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationDialogKt$VerificationDialog$4$1RememberedValue = new VerificationDialogKt$VerificationDialog$4$1(verificationViewModel);
                    composerStartRestartGroup.updateRememberedValue(verificationDialogKt$VerificationDialog$4$1RememberedValue);
                }
                KFunction kFunction4 = (KFunction) verificationDialogKt$VerificationDialog$4$1RememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1364952835);
                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(verificationViewModel);
                VerificationDialogKt$VerificationDialog$5$1 verificationDialogKt$VerificationDialog$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance5 || verificationDialogKt$VerificationDialog$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    verificationDialogKt$VerificationDialog$5$1RememberedValue = new VerificationDialogKt$VerificationDialog$5$1(verificationViewModel);
                    composerStartRestartGroup.updateRememberedValue(verificationDialogKt$VerificationDialog$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                VerificationDialogBody(modifier, verificationViewStateVerificationDialog$lambda$1, otpElement, linkAppearance, (Function0) kFunction, (Function0) kFunction4, (Function0) ((KFunction) verificationDialogKt$VerificationDialog$5$1RememberedValue), (Function0) kFunction2, (Function0) kFunction3, composer2, (i3 & 14) | (OTPElement.$stable << 6) | ((i3 << 3) & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("no viewmodel in parent activity");
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationDialogKt.VerificationDialog$lambda$7(modifier, linkAccount, linkAppearance, onVerificationSucceeded, changeEmail, onDismissClicked, dismissWithResult, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void VerificationDialogBody(Modifier modifier, final VerificationViewState state, final OTPElement otpElement, final LinkAppearance linkAppearance, final Function0<Unit> onBack, final Function0<Unit> onFocusRequested, final Function0<Unit> didShowCodeSentNotification, final Function0<Unit> onChangeEmailClick, final Function0<Unit> onResendCodeClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(otpElement, "otpElement");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onFocusRequested, "onFocusRequested");
        Intrinsics.checkNotNullParameter(didShowCodeSentNotification, "didShowCodeSentNotification");
        Intrinsics.checkNotNullParameter(onChangeEmailClick, "onChangeEmailClick");
        Intrinsics.checkNotNullParameter(onResendCodeClick, "onResendCodeClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1127768453);
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
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(otpElement) : composerStartRestartGroup.changedInstance(otpElement) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(linkAppearance) : composerStartRestartGroup.changedInstance(linkAppearance) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBack) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onFocusRequested) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(didShowCodeSentNotification) ? 1048576 : 524288;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onChangeEmailClick) ? 8388608 : 4194304;
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResendCodeClick) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i3) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127768453, i3, -1, "com.stripe.android.link.ui.verification.VerificationDialogBody (VerificationDialog.kt:77)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier2);
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
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(onBack, new DialogProperties(false, false, false, 3, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(1508638296, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt$VerificationDialogBody$1$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    Window window;
                    if ((i5 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1508638296, i5, -1, "com.stripe.android.link.ui.verification.VerificationDialogBody.<anonymous>.<anonymous> (VerificationDialog.kt:89)");
                        }
                        float f = DarkThemeKt.isSystemInDarkTheme(composer3, 0) ? 0.3f : 0.8f;
                        ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
                        ComposerKt.sourceInformationMarkerStart(composer3, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        Object objConsume = composer3.consume(localView);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ViewParent parent = ((View) objConsume).getParent();
                        DialogWindowProvider dialogWindowProvider = parent instanceof DialogWindowProvider ? (DialogWindowProvider) parent : null;
                        if (dialogWindowProvider != null && (window = dialogWindowProvider.getWindow()) != null) {
                            window.setDimAmount(f);
                        }
                        LinkAppearance linkAppearance2 = linkAppearance;
                        final VerificationViewState verificationViewState = state;
                        final OTPElement oTPElement = otpElement;
                        final Function0<Unit> function0 = onBack;
                        final Function0<Unit> function02 = onFocusRequested;
                        final Function0<Unit> function03 = didShowCodeSentNotification;
                        final Function0<Unit> function04 = onChangeEmailClick;
                        final Function0<Unit> function05 = onResendCodeClick;
                        ThemeKt.LinkAppearanceTheme(linkAppearance2, ComposableLambdaKt.rememberComposableLambda(1606764983, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt$VerificationDialogBody$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i6) {
                                if ((i6 & 3) != 2 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1606764983, i6, -1, "com.stripe.android.link.ui.verification.VerificationDialogBody.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:93)");
                                    }
                                    Modifier modifierM1070width3ABfNKs = SizeKt.m1070width3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(CropImageOptionsKt.DEGREES_360));
                                    RoundedCornerShape roundedCornerShapeM1303RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1303RoundedCornerShape0680j_4(Dp.m6117constructorimpl(24));
                                    long jM7805getSurfacePrimary0d7_KjU = LinkTheme.INSTANCE.getColors(composer4, 6).m7805getSurfacePrimary0d7_KjU();
                                    final VerificationViewState verificationViewState2 = verificationViewState;
                                    final OTPElement oTPElement2 = oTPElement;
                                    final Function0<Unit> function06 = function0;
                                    final Function0<Unit> function07 = function02;
                                    final Function0<Unit> function08 = function03;
                                    final Function0<Unit> function09 = function04;
                                    final Function0<Unit> function010 = function05;
                                    SurfaceKt.m2015SurfaceFjzlyU(modifierM1070width3ABfNKs, roundedCornerShapeM1303RoundedCornerShape0680j_4, jM7805getSurfacePrimary0d7_KjU, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(188596219, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt.VerificationDialogBody.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                            invoke(composer5, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer5, int i7) {
                                            if ((i7 & 3) != 2 || !composer5.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(188596219, i7, -1, "com.stripe.android.link.ui.verification.VerificationDialogBody.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VerificationDialog.kt:98)");
                                                }
                                                VerificationBodyKt.VerificationBody(verificationViewState2, oTPElement2, function06, function07, function08, function09, function010, composer5, OTPElement.$stable << 3);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer5.skipToGroupEnd();
                                        }
                                    }, composer4, 54), composer4, 1572870, 56);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 48, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), composer2, ((i3 >> 12) & 14) | 432, 0);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier3 = modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationDialogKt.VerificationDialogBody$lambda$9(modifier3, state, otpElement, linkAppearance, onBack, onFocusRequested, didShowCodeSentNotification, onChangeEmailClick, onResendCodeClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void VerificationDialogPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1339753938);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1339753938, i, -1, "com.stripe.android.link.ui.verification.VerificationDialogPreview (VerificationDialog.kt:118)");
            }
            ThemeKt.DefaultLinkTheme(false, ComposableSingletons$VerificationDialogKt.INSTANCE.m7928getLambda2$paymentsheet_release(), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.verification.VerificationDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return VerificationDialogKt.VerificationDialogPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final VerificationViewState VerificationDialog$lambda$1(State<VerificationViewState> state) {
        return state.getValue();
    }
}
