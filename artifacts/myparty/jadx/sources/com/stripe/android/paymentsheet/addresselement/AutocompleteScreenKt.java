package com.stripe.android.paymentsheet.addresselement;

import android.text.SpannableString;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.actions.SearchIntents;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.LoadingIndicatorKt;
import com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt;
import com.stripe.android.paymentsheet.addresselement.AutocompleteViewModel;
import com.stripe.android.paymentsheet.injection.AutocompleteViewModelSubcomponent;
import com.stripe.android.ui.core.elements.autocomplete.PlacesClientProxy;
import com.stripe.android.ui.core.elements.autocomplete.model.AutocompletePrediction;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldController;
import com.stripe.android.uicore.elements.TextFieldUIKt;
import com.stripe.android.uicore.text.HtmlKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AutocompleteScreen.kt */
@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0002\u0010\f\u001a)\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a/\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\u0010\u0017\u001at\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192A\u0010\u001a\u001a=\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b H\u0001¢\u0006\u0004\b!\u0010\"\u001aw\u0010\r\u001a\u00020\u00052\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050,H\u0001¢\u0006\u0002\u0010-\u001a¼\u0001\u0010\r\u001a\u00020\u00052\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020(2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00162A\u0010\u001a\u001a=\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u001e¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00050\u001b¢\u0006\u0002\b 2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00050,H\u0001¢\u0006\u0004\b.\u0010/\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u00060²\u0006\u0012\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\u0012\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$X\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u0016X\u008a\u0084\u0002²\u0006\n\u00101\u001a\u00020\u0001X\u008a\u0084\u0002"}, d2 = {"TEST_TAG_ATTRIBUTION_DRAWABLE", "", "getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations", "()V", "AutocompleteScreen", "", "autoCompleteViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/AutocompleteViewModelSubcomponent$Builder;", "navigator", "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;", "country", "(Ljavax/inject/Provider;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "AutocompleteScreenUI", "viewModel", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;", "attributionDrawable", "", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "appearanceContext", "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;", "isRootScreen", "", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;Ljava/lang/Integer;ZLandroidx/compose/runtime/Composer;I)V", ViewProps.BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "appBar", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/Function0;", "onBack", "Landroidx/compose/runtime/Composable;", "AutocompleteScreenUI-ww6aTOc", "(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Ljava/lang/Integer;ZJLkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;I)V", "predictions", "", "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;", "loading", "queryController", "Lcom/stripe/android/uicore/elements/TextFieldController;", "onBackPressed", "onEnterManually", "onSelectPrediction", "Lkotlin/Function1;", "(Ljava/util/List;ZLcom/stripe/android/uicore/elements/TextFieldController;Ljava/lang/Integer;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteAppearanceContext;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AutocompleteScreenUI-mxsUjTo", "(Ljava/util/List;ZLcom/stripe/android/uicore/elements/TextFieldController;Ljava/lang/Integer;JZLkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", SearchIntents.EXTRA_QUERY}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteScreenKt {
    public static final String TEST_TAG_ATTRIBUTION_DRAWABLE = "AutocompleteAttributionDrawable";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreen$lambda$0(Provider provider, AddressElementNavigator addressElementNavigator, String str, int i, Composer composer, int i2) {
        AutocompleteScreen(provider, addressElementNavigator, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreenUI$lambda$15(List list, boolean z, TextFieldController textFieldController, Integer num, AutocompleteAppearanceContext autocompleteAppearanceContext, boolean z2, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        AutocompleteScreenUI(list, z, textFieldController, num, autocompleteAppearanceContext, z2, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreenUI$lambda$2(AutocompleteViewModel autocompleteViewModel, AddressElementNavigator addressElementNavigator, Integer num, int i, int i2, Composer composer, int i3) {
        AutocompleteScreenUI(autocompleteViewModel, addressElementNavigator, num, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreenUI$lambda$8(AutocompleteViewModel autocompleteViewModel, AutocompleteAppearanceContext autocompleteAppearanceContext, Integer num, boolean z, int i, Composer composer, int i2) {
        AutocompleteScreenUI(autocompleteViewModel, autocompleteAppearanceContext, num, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreenUI_mxsUjTo$lambda$17(List list, boolean z, TextFieldController textFieldController, Integer num, long j, boolean z2, Function4 function4, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        m8249AutocompleteScreenUImxsUjTo(list, z, textFieldController, num, j, z2, function4, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AutocompleteScreenUI_ww6aTOc$lambda$14(AutocompleteViewModel autocompleteViewModel, Integer num, boolean z, long j, Function4 function4, int i, Composer composer, int i2) {
        m8250AutocompleteScreenUIww6aTOc(autocompleteViewModel, num, z, j, function4, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTEST_TAG_ATTRIBUTION_DRAWABLE$annotations() {
    }

    public static final void AutocompleteScreen(final Provider<AutocompleteViewModelSubcomponent.Builder> autoCompleteViewModelSubcomponentBuilderProvider, AddressElementNavigator navigator, final String str, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        final AddressElementNavigator addressElementNavigator;
        Intrinsics.checkNotNullParameter(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-597861359);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(autoCompleteViewModelSubcomponentBuilderProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(navigator) : composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-597861359, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreen (AutocompleteScreen.kt:62)");
            }
            AutocompleteViewModel.Factory factory = new AutocompleteViewModel.Factory(autoCompleteViewModelSubcomponentBuilderProvider, new AutocompleteViewModel.Args(str));
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(AutocompleteViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceableGroup();
            addressElementNavigator = navigator;
            AutocompleteScreenUI((AutocompleteViewModel) viewModel, addressElementNavigator, (Integer) null, composerStartRestartGroup, i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            addressElementNavigator = navigator;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreen$lambda$0(autoCompleteViewModelSubcomponentBuilderProvider, addressElementNavigator, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutocompleteScreenUI(AutocompleteViewModel viewModel, final AddressElementNavigator navigator, Integer num, Composer composer, final int i, final int i2) {
        int i3;
        boolean z;
        AutocompleteScreenKt$AutocompleteScreenUI$1$1 autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue;
        AutocompleteViewModel autocompleteViewModel;
        final Integer num2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1164200668);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(navigator) : composerStartRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(num)) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            boolean z2 = false;
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                Integer num3 = num;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(703915947);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
                if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32) {
                    z2 = true;
                    z = zChangedInstance | z2;
                    autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$1$1(viewModel, navigator, null);
                        composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue, composerStartRestartGroup, 6);
                        autocompleteViewModel = viewModel;
                        m8250AutocompleteScreenUIww6aTOc(autocompleteViewModel, num3, false, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU(), ComposableSingletons$AutocompleteScreenKt.INSTANCE.m8253getLambda1$paymentsheet_release(), composerStartRestartGroup, (i3 & 14) | 24960 | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        num2 = num3;
                    }
                }
            } else {
                if ((i2 & 4) != 0) {
                    num = PlacesClientProxy.Companion.getPlacesPoweredByGoogleDrawable$default(PlacesClientProxy.INSTANCE, DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0), null, 2, null);
                    i3 &= -897;
                }
                Integer num32 = num;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164200668, i3, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:82)");
                }
                Unit unit2 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(703915947);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
                if ((i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) != 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(navigator))) {
                    z2 = true;
                }
                z = zChangedInstance2 | z2;
                autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$1$1(viewModel, navigator, null);
                    composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) autocompleteScreenKt$AutocompleteScreenUI$1$1RememberedValue, composerStartRestartGroup, 6);
                autocompleteViewModel = viewModel;
                m8250AutocompleteScreenUIww6aTOc(autocompleteViewModel, num32, false, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU(), ComposableSingletons$AutocompleteScreenKt.INSTANCE.m8253getLambda1$paymentsheet_release(), composerStartRestartGroup, (i3 & 14) | 24960 | ((i3 >> 3) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                num2 = num32;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            autocompleteViewModel = viewModel;
            num2 = num;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final AutocompleteViewModel autocompleteViewModel2 = autocompleteViewModel;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreenUI$lambda$2(autocompleteViewModel2, navigator, num2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutocompleteScreenUI(final AutocompleteViewModel viewModel, final AutocompleteAppearanceContext appearanceContext, final Integer num, final boolean z, Composer composer, final int i) {
        int i2;
        Integer num2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
        Composer composerStartRestartGroup = composer.startRestartGroup(154747508);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(appearanceContext) : composerStartRestartGroup.changedInstance(appearanceContext) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            num2 = num;
            i2 |= composerStartRestartGroup.changed(num2) ? 256 : 128;
        } else {
            num2 = num;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154747508, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:123)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getPredictions(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(viewModel.getLoading(), null, composerStartRestartGroup, 0, 1);
            List<AutocompletePrediction> listAutocompleteScreenUI$lambda$3 = AutocompleteScreenUI$lambda$3(stateCollectAsState);
            boolean zAutocompleteScreenUI$lambda$4 = AutocompleteScreenUI$lambda$4(stateCollectAsState2);
            SimpleTextFieldController textFieldController = viewModel.getTextFieldController();
            composerStartRestartGroup.startReplaceGroup(703970852);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$3$1 autocompleteScreenKt$AutocompleteScreenUI$3$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || autocompleteScreenKt$AutocompleteScreenUI$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$3$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$3$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$3$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) autocompleteScreenKt$AutocompleteScreenUI$3$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(703972525);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$4$1 autocompleteScreenKt$AutocompleteScreenUI$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || autocompleteScreenKt$AutocompleteScreenUI$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$4$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$4$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function02 = (Function0) ((KFunction) autocompleteScreenKt$AutocompleteScreenUI$4$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(703974567);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$5$1 autocompleteScreenKt$AutocompleteScreenUI$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || autocompleteScreenKt$AutocompleteScreenUI$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$5$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$5$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AutocompleteScreenUI(listAutocompleteScreenUI$lambda$3, zAutocompleteScreenUI$lambda$4, textFieldController, num2, appearanceContext, z, function0, function02, (Function1) ((KFunction) autocompleteScreenKt$AutocompleteScreenUI$5$1RememberedValue), composerStartRestartGroup, (SimpleTextFieldController.$stable << 6) | ((i2 << 3) & 7168) | ((i2 << 9) & 57344) | ((i2 << 6) & 458752));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreenUI$lambda$8(viewModel, appearanceContext, num, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: AutocompleteScreenUI-ww6aTOc, reason: not valid java name */
    public static final void m8250AutocompleteScreenUIww6aTOc(final AutocompleteViewModel viewModel, final Integer num, final boolean z, final long j, final Function4<? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> appBar, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Composer composerStartRestartGroup = composer.startRestartGroup(1283797203);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(appBar) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1283797203, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:147)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(viewModel.getPredictions(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(viewModel.getLoading(), null, composerStartRestartGroup, 0, 1);
            List<AutocompletePrediction> listAutocompleteScreenUI_ww6aTOc$lambda$9 = AutocompleteScreenUI_ww6aTOc$lambda$9(stateCollectAsState);
            boolean zAutocompleteScreenUI_ww6aTOc$lambda$10 = AutocompleteScreenUI_ww6aTOc$lambda$10(stateCollectAsState2);
            SimpleTextFieldController textFieldController = viewModel.getTextFieldController();
            composerStartRestartGroup.startReplaceGroup(703997988);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$7$1 autocompleteScreenKt$AutocompleteScreenUI$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || autocompleteScreenKt$AutocompleteScreenUI$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$7$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$7$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$7$1RememberedValue);
            }
            KFunction kFunction = (KFunction) autocompleteScreenKt$AutocompleteScreenUI$7$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(703999661);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$8$1 autocompleteScreenKt$AutocompleteScreenUI$8$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || autocompleteScreenKt$AutocompleteScreenUI$8$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$8$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$8$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$8$1RememberedValue);
            }
            KFunction kFunction2 = (KFunction) autocompleteScreenKt$AutocompleteScreenUI$8$1RememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(704001703);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(viewModel);
            AutocompleteScreenKt$AutocompleteScreenUI$9$1 autocompleteScreenKt$AutocompleteScreenUI$9$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || autocompleteScreenKt$AutocompleteScreenUI$9$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                autocompleteScreenKt$AutocompleteScreenUI$9$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$9$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$9$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i3 = i2 << 6;
            m8249AutocompleteScreenUImxsUjTo(listAutocompleteScreenUI_ww6aTOc$lambda$9, zAutocompleteScreenUI_ww6aTOc$lambda$10, textFieldController, num, j, z, appBar, (Function0) kFunction, (Function0) kFunction2, (Function1) ((KFunction) autocompleteScreenKt$AutocompleteScreenUI$9$1RememberedValue), composerStartRestartGroup, (i3 & 7168) | (SimpleTextFieldController.$stable << 6) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752) | (i3 & 3670016));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreenUI_ww6aTOc$lambda$14(viewModel, num, z, j, appBar, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AutocompleteScreenUI(final List<AutocompletePrediction> list, final boolean z, final TextFieldController queryController, final Integer num, final AutocompleteAppearanceContext appearanceContext, final boolean z2, final Function0<Unit> onBackPressed, final Function0<Unit> onEnterManually, final Function1<? super AutocompletePrediction, Unit> onSelectPrediction, Composer composer, final int i) {
        int i2;
        boolean z3;
        Integer num2;
        boolean z4;
        Intrinsics.checkNotNullParameter(queryController, "queryController");
        Intrinsics.checkNotNullParameter(appearanceContext, "appearanceContext");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onEnterManually, "onEnterManually");
        Intrinsics.checkNotNullParameter(onSelectPrediction, "onSelectPrediction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1440495536);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(queryController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            num2 = num;
            i2 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
        } else {
            num2 = num;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(appearanceContext) : composerStartRestartGroup.changedInstance(appearanceContext) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            z4 = z2;
            i2 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
        } else {
            z4 = z2;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterManually) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectPrediction) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i2) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1440495536, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:176)");
            }
            long backgroundColor = appearanceContext.getBackgroundColor(composerStartRestartGroup, (i2 >> 12) & 14);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(847752627, true, new Function4<Boolean, Function0<? extends Unit>, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt.AutocompleteScreenUI.11
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Function0<? extends Unit> function0, Composer composer2, Integer num3) {
                    invoke(bool.booleanValue(), (Function0<Unit>) function0, composer2, num3.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z5, Function0<Unit> onBack, Composer composer2, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(onBack, "onBack");
                    if ((i3 & 6) == 0) {
                        i4 = (composer2.changed(z5) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i4 |= composer2.changedInstance(onBack) ? 32 : 16;
                    }
                    if ((i4 & 147) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(847752627, i4, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:188)");
                    }
                    appearanceContext.AppBar(z5, onBack, composer2, i4 & WebSocketProtocol.PAYLOAD_SHORT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            int i3 = (i2 & 14) | 1572864 | (i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i2 & 896) | (i2 & 7168) | (458752 & i2);
            int i4 = i2 << 3;
            m8249AutocompleteScreenUImxsUjTo(list, z3, queryController, num2, backgroundColor, z4, composableLambdaRememberComposableLambda, onBackPressed, onEnterManually, onSelectPrediction, composerStartRestartGroup, i3 | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreenUI$lambda$15(list, z, queryController, num, appearanceContext, z2, onBackPressed, onEnterManually, onSelectPrediction, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: AutocompleteScreenUI-mxsUjTo, reason: not valid java name */
    public static final void m8249AutocompleteScreenUImxsUjTo(final List<AutocompletePrediction> list, final boolean z, final TextFieldController queryController, final Integer num, final long j, final boolean z2, final Function4<? super Boolean, ? super Function0<Unit>, ? super Composer, ? super Integer, Unit> appBar, final Function0<Unit> onBackPressed, final Function0<Unit> onEnterManually, final Function1<? super AutocompletePrediction, Unit> onSelectPrediction, Composer composer, final int i) {
        int i2;
        boolean z3;
        final Integer num2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(queryController, "queryController");
        Intrinsics.checkNotNullParameter(appBar, "appBar");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onEnterManually, "onEnterManually");
        Intrinsics.checkNotNullParameter(onSelectPrediction, "onSelectPrediction");
        Composer composerStartRestartGroup = composer.startRestartGroup(266972303);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(queryController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            num2 = num;
            i2 |= composerStartRestartGroup.changed(num2) ? 2048 : 1024;
        } else {
            num2 = num;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(appBar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEnterManually) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSelectPrediction) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(266972303, i2, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI (AutocompleteScreen.kt:205)");
            }
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(queryController.getFieldValue(), null, composerStartRestartGroup, 0, 1);
            final boolean z4 = z3;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m1986Scaffold27mzLpw(null, null, ComposableLambdaKt.rememberComposableLambda(1403760426, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt.AutocompleteScreenUI.13
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num3) {
                    invoke(composer3, num3.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1403760426, i3, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:210)");
                    }
                    appBar.invoke(Boolean.valueOf(z2), onBackPressed, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-200243447, true, new AnonymousClass14(onEnterManually), composerStartRestartGroup, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, j, 0L, ComposableLambdaKt.rememberComposableLambda(138753041, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt.AutocompleteScreenUI.15
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num3) {
                    invoke(paddingValues, composer3, num3.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i4 = i3 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(138753041, i4, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:235)");
                    }
                    composer3.startReplaceGroup(-1597847512);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                    composer3.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceGroup(-1597845465);
                    AutocompleteScreenKt$AutocompleteScreenUI$15$1$1 autocompleteScreenKt$AutocompleteScreenUI$15$1$1RememberedValue = composer3.rememberedValue();
                    if (autocompleteScreenKt$AutocompleteScreenUI$15$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        autocompleteScreenKt$AutocompleteScreenUI$15$1$1RememberedValue = new AutocompleteScreenKt$AutocompleteScreenUI$15$1$1(focusRequester, null);
                        composer3.updateRememberedValue(autocompleteScreenKt$AutocompleteScreenUI$15$1$1RememberedValue);
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) autocompleteScreenKt$AutocompleteScreenUI$15$1$1RememberedValue, composer3, 6);
                    AddressUtilsKt.ScrollableColumn(PaddingKt.padding(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null)), paddingValues), null, ComposableLambdaKt.rememberComposableLambda(786859541, true, new AnonymousClass2(z4, list, queryController, focusRequester, stateCollectAsState, num2, onSelectPrediction), composer3, 54), composer3, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AutocompleteScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$15$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ Integer $attributionDrawable;
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ boolean $loading;
                    final /* synthetic */ Function1<AutocompletePrediction, Unit> $onSelectPrediction;
                    final /* synthetic */ List<AutocompletePrediction> $predictions;
                    final /* synthetic */ State<String> $query$delegate;
                    final /* synthetic */ TextFieldController $queryController;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass2(boolean z, List<AutocompletePrediction> list, TextFieldController textFieldController, FocusRequester focusRequester, State<String> state, Integer num, Function1<? super AutocompletePrediction, Unit> function1) {
                        this.$loading = z;
                        this.$predictions = list;
                        this.$queryController = textFieldController;
                        this.$focusRequester = focusRequester;
                        this.$query$delegate = state;
                        this.$attributionDrawable = num;
                        this.$onSelectPrediction = function1;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i) {
                        int i2;
                        Composer composer2 = composer;
                        Intrinsics.checkNotNullParameter(ScrollableColumn, "$this$ScrollableColumn");
                        if ((i & 17) != 16 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(786859541, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous> (AutocompleteScreen.kt:251)");
                            }
                            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getTop()), 0.0f, 0.0f, 13, null);
                            boolean z = this.$loading;
                            List<AutocompletePrediction> list = this.$predictions;
                            final TextFieldController textFieldController = this.$queryController;
                            final FocusRequester focusRequester = this.$focusRequester;
                            State<String> state = this.$query$delegate;
                            Integer num = this.$attributionDrawable;
                            Function1<AutocompletePrediction, Unit> function1 = this.$onSelectPrediction;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1024paddingqDBjuR0$default);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            State<String> state2 = state;
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
                            String str2 = "C88@4444L9:Column.kt#2w3rfo";
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            float f = 8;
                            Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(f), 1, null);
                            ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingVpY3zN4$default);
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
                            Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            String str3 = "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo";
                            final Function1<AutocompletePrediction, Unit> function12 = function1;
                            String str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                            TextFieldUIKt.TextFieldSection(PaddingKt.padding(Modifier.INSTANCE, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), textFieldController, false, null, ComposableLambdaKt.rememberComposableLambda(271462224, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$15$2$1$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                    invoke(composer3, num2.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(271462224, i3, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AutocompleteScreen.kt:263)");
                                        }
                                        Modifier modifierFocusRequester = FocusRequesterModifierKt.focusRequester(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), focusRequester);
                                        TextFieldUIKt.m8846TextFieldZkbtPhE(textFieldController, true, ImeAction.INSTANCE.m5781getDoneeUduSuo(), modifierFocusRequester, null, 0, 0, null, false, false, composer3, 432, PointerIconCompat.TYPE_TEXT);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }, composer2, 54), composer2, 24576, 12);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (!z) {
                                if (!StringsKt.isBlank(AutocompleteScreenKt.AutocompleteScreenUI_mxsUjTo$lambda$16(state2))) {
                                    composer2.startReplaceGroup(-1854470597);
                                    if (list != null) {
                                        composer2.startReplaceGroup(-1854469250);
                                        if (list.isEmpty()) {
                                            i2 = 0;
                                        } else {
                                            float f2 = f;
                                            DividerKt.m1877DivideroMI9zvI(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f), 1, null), 0L, 0.0f, 0.0f, composer2, 6, 14);
                                            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE));
                                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str3);
                                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierPadding);
                                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                                            if (!(composer2.getApplier() instanceof Applier)) {
                                                ComposablesKt.invalidApplier();
                                            }
                                            composer2.startReusableNode();
                                            if (composer2.getInserting()) {
                                                composer2.createNode(constructor3);
                                            } else {
                                                composer2.useNode();
                                            }
                                            Composer composerM3150constructorimpl3 = Updater.m3150constructorimpl(composer2);
                                            Updater.m3157setimpl(composerM3150constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                            Updater.m3157setimpl(composerM3150constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                            if (composerM3150constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                                composerM3150constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                                composerM3150constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            Updater.m3157setimpl(composerM3150constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                            composer2.startReplaceGroup(-915633239);
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                final AutocompletePrediction autocompletePrediction = (AutocompletePrediction) it.next();
                                                SpannableString primaryText = autocompletePrediction.getPrimaryText();
                                                SpannableString secondaryText = autocompletePrediction.getSecondaryText();
                                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                composer2.startReplaceGroup(-411929372);
                                                boolean zChanged = composer2.changed(function12) | composer2.changedInstance(autocompletePrediction);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$15$2$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return AutocompleteScreenKt.AnonymousClass15.AnonymousClass2.invoke$lambda$11$lambda$10$lambda$8$lambda$7$lambda$2$lambda$1(function12, autocompletePrediction);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue);
                                                }
                                                composer2.endReplaceGroup();
                                                Modifier modifierM1022paddingVpY3zN4$default2 = PaddingKt.m1022paddingVpY3zN4$default(ClickableKt.m608clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), 0.0f, Dp.m6117constructorimpl(f2), 1, null);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, str3);
                                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str);
                                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM1022paddingVpY3zN4$default2);
                                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str4);
                                                if (!(composer2.getApplier() instanceof Applier)) {
                                                    ComposablesKt.invalidApplier();
                                                }
                                                composer2.startReusableNode();
                                                if (composer2.getInserting()) {
                                                    composer2.createNode(constructor4);
                                                } else {
                                                    composer2.useNode();
                                                }
                                                Composer composerM3150constructorimpl4 = Updater.m3150constructorimpl(composer2);
                                                Updater.m3157setimpl(composerM3150constructorimpl4, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                                Updater.m3157setimpl(composerM3150constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                                if (composerM3150constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                                    composerM3150constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                                    composerM3150constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                Updater.m3157setimpl(composerM3150constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, str2);
                                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                                List list2 = SequencesKt.toList(Regex.findAll$default(new Regex(StringsKt.replace$default(AutocompleteScreenKt.AutocompleteScreenUI_mxsUjTo$lambda$16(state2), " ", "|", false, 4, (Object) null), RegexOption.IGNORE_CASE), primaryText, 0, 2, null));
                                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                                                Iterator it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                    arrayList.add(((MatchResult) it2.next()).getValue());
                                                }
                                                ArrayList<String> arrayList2 = new ArrayList();
                                                for (Object obj : arrayList) {
                                                    if (!StringsKt.isBlank((String) obj)) {
                                                        arrayList2.add(obj);
                                                    }
                                                }
                                                String string = primaryText.toString();
                                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                                String strReplace$default = string;
                                                for (String str5 : arrayList2) {
                                                    strReplace$default = StringsKt.replace$default(strReplace$default, str5, "<b>" + str5 + "</b>", false, 4, (Object) null);
                                                }
                                                TextKt.m2077TextIbK3jfQ(HtmlKt.annotatedStringResource(strReplace$default, null, null, composer, 0, 6), null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8728getOnComponent0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBody1(), composer, 0, 0, 131066);
                                                String string2 = secondaryText.toString();
                                                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                TextKt.m2076Text4IGK_g(string2, (Modifier) null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8728getOnComponent0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBody1(), composer, 0, 0, 65530);
                                                ComposerKt.sourceInformationMarkerEnd(composer);
                                                composer.endNode();
                                                ComposerKt.sourceInformationMarkerEnd(composer);
                                                ComposerKt.sourceInformationMarkerEnd(composer);
                                                ComposerKt.sourceInformationMarkerEnd(composer);
                                                composer2 = composer;
                                                DividerKt.m1877DivideroMI9zvI(null, 0L, 0.0f, 0.0f, composer2, 0, 15);
                                                it = it;
                                                str3 = str3;
                                                str4 = str4;
                                                str2 = str2;
                                                str = str;
                                                f2 = f2;
                                                state2 = state2;
                                                function12 = function12;
                                            }
                                            i2 = 0;
                                            composer2.endReplaceGroup();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            composer2.endNode();
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                            ComposerKt.sourceInformationMarkerEnd(composer2);
                                        }
                                        composer2.endReplaceGroup();
                                        composer2.startReplaceGroup(-1854383186);
                                        if (num != null) {
                                            ImageKt.Image(PainterResources_androidKt.painterResource(num.intValue(), composer2, i2), (String) null, TestTagKt.testTag(PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 1, null), StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), AutocompleteScreenKt.TEST_TAG_ATTRIBUTION_DRAWABLE), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
                                            composer2 = composer;
                                            Unit unit = Unit.INSTANCE;
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        composer2.endReplaceGroup();
                                        Unit unit3 = Unit.INSTANCE;
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-1650705895);
                                    composer2.endReplaceGroup();
                                }
                            } else {
                                composer2.startReplaceGroup(-1654282737);
                                LoadingIndicatorKt.m7225LoadingIndicatoriJQMabo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, composer, 6, 2);
                                composer2 = composer;
                                composer2.endReplaceGroup();
                            }
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

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$11$lambda$10$lambda$8$lambda$7$lambda$2$lambda$1(Function1 function1, AutocompletePrediction autocompletePrediction) {
                        function1.invoke(autocompletePrediction);
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 3456, ((i2 << 3) & 458752) | 12582912, 98291);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AutocompleteScreenKt.AutocompleteScreenUI_mxsUjTo$lambda$17(list, z, queryController, num, j, z2, appBar, onBackPressed, onEnterManually, onSelectPrediction, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AutocompleteScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$14, reason: invalid class name */
    static final class AnonymousClass14 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onEnterManually;

        AnonymousClass14(Function0<Unit> function0) {
            this.$onEnterManually = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM3656copywmQWz5c$default;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-200243447, i, -1, "com.stripe.android.paymentsheet.addresselement.AutocompleteScreenUI.<anonymous> (AutocompleteScreen.kt:213)");
                }
                if (StripeThemeKt.m8745shouldUseDarkDynamicColor8_81llA(StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getMaterialColors().m1837getSurface0d7_KjU())) {
                    jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(Color.INSTANCE.m3683getBlack0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM3656copywmQWz5c$default = Color.m3656copywmQWz5c$default(Color.INSTANCE.m3694getWhite0d7_KjU(), 0.07f, 0.0f, 0.0f, 0.0f, 14, null);
                }
                long j = jM3656copywmQWz5c$default;
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxWidth$default(BackgroundKt.m575backgroundbw27NRU$default(Modifier.INSTANCE, j, null, 2, null), 0.0f, 1, null))), 0.0f, Dp.m6117constructorimpl(8), 1, null);
                final Function0<Unit> function0 = this.$onEnterManually;
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1022paddingVpY3zN4$default);
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
                Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer.startReplaceGroup(1929055043);
                boolean zChanged = composer.changed(function0);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.AutocompleteScreenKt$AutocompleteScreenUI$14$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AutocompleteScreenKt.AnonymousClass14.invoke$lambda$2$lambda$1$lambda$0(function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EnterManuallyTextKt.EnterManuallyText((Function0) objRememberedValue, composer, 0);
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
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final List<AutocompletePrediction> AutocompleteScreenUI$lambda$3(State<? extends List<AutocompletePrediction>> state) {
        return state.getValue();
    }

    private static final boolean AutocompleteScreenUI$lambda$4(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final List<AutocompletePrediction> AutocompleteScreenUI_ww6aTOc$lambda$9(State<? extends List<AutocompletePrediction>> state) {
        return state.getValue();
    }

    private static final boolean AutocompleteScreenUI_ww6aTOc$lambda$10(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AutocompleteScreenUI_mxsUjTo$lambda$16(State<String> state) {
        return state.getValue();
    }
}
