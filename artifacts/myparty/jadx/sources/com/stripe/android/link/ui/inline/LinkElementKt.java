package com.stripe.android.link.ui.inline;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: LinkElement.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"LinkElement", "", "initialUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "linkSignupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", ViewProps.ENABLED, "", "onLinkSignupStateChanged", "Lkotlin/Function1;", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkElementKt {

    /* compiled from: LinkElement.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkSignupMode.values().length];
            try {
                iArr[LinkSignupMode.InsteadOfSaveForFutureUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LinkSignupMode.AlongsideSaveForFutureUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkElement$lambda$3(UserInput userInput, LinkConfigurationCoordinator linkConfigurationCoordinator, LinkConfiguration linkConfiguration, LinkSignupMode linkSignupMode, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkElement(userInput, linkConfigurationCoordinator, linkConfiguration, linkSignupMode, z, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LinkElement(final UserInput userInput, final LinkConfigurationCoordinator linkConfigurationCoordinator, final LinkConfiguration configuration, final LinkSignupMode linkSignupMode, final boolean z, final Function1<? super InlineSignupViewState, Unit> onLinkSignupStateChanged, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        ViewModelStoreOwner current;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(linkSignupMode, "linkSignupMode");
        Intrinsics.checkNotNullParameter(onLinkSignupStateChanged, "onLinkSignupStateChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(1303693800);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(userInput) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(linkConfigurationCoordinator) : composerStartRestartGroup.changedInstance(linkConfigurationCoordinator) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(configuration) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(linkSignupMode) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onLinkSignupStateChanged) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1303693800, i3, -1, "com.stripe.android.link.ui.inline.LinkElement (LinkElement.kt:24)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1371638852);
                    zChanged = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changed(linkConfigurationCoordinator))) | composerStartRestartGroup.changed(configuration);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = linkConfigurationCoordinator.getComponent(configuration);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    LinkComponent linkComponent = (LinkComponent) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Object[] objArr = {linkConfigurationCoordinator, configuration};
                    composerStartRestartGroup.startReplaceGroup(1371645330);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.stripe.android.link.ui.inline.LinkElementKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LinkElementKt.LinkElement$lambda$2$lambda$1();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = companion;
                    Object objM3243rememberSaveable = RememberSaveableKt.m3243rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                    Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable, "rememberSaveable(...)");
                    String str = (String) objM3243rememberSaveable;
                    InlineSignupViewModel.Factory factory = new InlineSignupViewModel.Factory(linkSignupMode, userInput, linkComponent);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                    current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                    if (current != null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InlineSignupViewModel.class), current, str, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    InlineSignupViewModel inlineSignupViewModel = (InlineSignupViewModel) viewModel;
                    int i5 = WhenMappings.$EnumSwitchMapping$0[inlineSignupViewModel.getSignupMode().ordinal()];
                    if (i5 == 1) {
                        modifier3 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(-428263860);
                        LinkInlineSignupKt.LinkInlineSignup(inlineSignupViewModel, z, onLinkSignupStateChanged, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), composerStartRestartGroup, (i3 >> 9) & PointerIconCompat.TYPE_TEXT, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i5 != 2) {
                            composerStartRestartGroup.startReplaceGroup(1371656123);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-427972956);
                        modifier3 = modifier5;
                        LinkOptionalInlineSignupKt.LinkOptionalInlineSignup(inlineSignupViewModel, z, onLinkSignupStateChanged, SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), composerStartRestartGroup, (i3 >> 9) & PointerIconCompat.TYPE_TEXT, 0);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.link.ui.inline.LinkElementKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return LinkElementKt.LinkElement$lambda$3(userInput, linkConfigurationCoordinator, configuration, linkSignupMode, z, onLinkSignupStateChanged, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            modifier2 = modifier;
            if ((599187 & i3) != 599186) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1371638852);
                if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) {
                    zChanged = ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changed(linkConfigurationCoordinator))) | composerStartRestartGroup.changed(configuration);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = linkConfigurationCoordinator.getComponent(configuration);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        LinkComponent linkComponent2 = (LinkComponent) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr2 = {linkConfigurationCoordinator, configuration};
                        composerStartRestartGroup.startReplaceGroup(1371645330);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = companion;
                        Object objM3243rememberSaveable2 = RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                        Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable2, "rememberSaveable(...)");
                        String str2 = (String) objM3243rememberSaveable2;
                        InlineSignupViewModel.Factory factory2 = new InlineSignupViewModel.Factory(linkSignupMode, userInput, linkComponent2);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
                        current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
                        if (current != null) {
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String LinkElement$lambda$2$lambda$1() {
        return UUID.randomUUID().toString();
    }
}
