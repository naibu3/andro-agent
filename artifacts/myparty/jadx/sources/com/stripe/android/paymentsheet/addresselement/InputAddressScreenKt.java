package com.stripe.android.paymentsheet.addresselement;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.stripe.android.common.ui.PrimaryButtonKt;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.addresselement.AddressElementNavigator;
import com.stripe.android.paymentsheet.addresselement.AddressLauncher;
import com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt;
import com.stripe.android.paymentsheet.addresselement.InputAddressViewModel;
import com.stripe.android.paymentsheet.injection.InputAddressViewModelSubcomponent;
import com.stripe.android.paymentsheet.ui.AddressOptionsAppBarKt;
import com.stripe.android.ui.core.FormUIKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.CheckboxElementUIKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InputAddressScreen.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u001c\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000e2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0001¢\u0006\u0002\u0010\u0011\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0018\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"InputAddressScreen", "", "primaryButtonEnabled", "", "primaryButtonText", "", "title", "onPrimaryButtonClick", "Lkotlin/Function0;", "onCloseClick", "topContent", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "formContent", "bottomContent", "(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "inputAddressViewModelSubcomponentBuilderProvider", "Ljavax/inject/Provider;", "Lcom/stripe/android/paymentsheet/injection/InputAddressViewModelSubcomponent$Builder;", "(Ljavax/inject/Provider;Landroidx/compose/runtime/Composer;I)V", "paymentsheet_release", "completeValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "formEnabled", "checkboxChecked", "billingSameAsShippingState", "Lcom/stripe/android/paymentsheet/addresselement/InputAddressViewModel$ShippingSameAsBillingState;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputAddressScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputAddressScreen$lambda$0(boolean z, String str, String str2, Function0 function0, Function0 function02, Function3 function3, Function3 function32, Function3 function33, int i, Composer composer, int i2) {
        InputAddressScreen(z, str, str2, function0, function02, function3, function32, function33, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputAddressScreen$lambda$9(Provider provider, int i, Composer composer, int i2) {
        InputAddressScreen(provider, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void InputAddressScreen(final boolean z, final String primaryButtonText, final String title, final Function0<Unit> onPrimaryButtonClick, final Function0<Unit> onCloseClick, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> topContent, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> formContent, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> bottomContent, Composer composer, final int i) {
        boolean z2;
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(topContent, "topContent");
        Intrinsics.checkNotNullParameter(formContent, "formContent");
        Intrinsics.checkNotNullParameter(bottomContent, "bottomContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-792464202);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(primaryButtonText) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(topContent) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(formContent) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(bottomContent) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792464202, i2, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:42)");
            }
            ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localFocusManager);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final FocusManager focusManager = (FocusManager) objConsume;
            final boolean z3 = z2;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m1986Scaffold27mzLpw(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null)), null, ComposableLambdaKt.rememberComposableLambda(-340151621, true, new AnonymousClass1(focusManager, onCloseClick), composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m1837getSurface0d7_KjU(), 0L, ComposableLambdaKt.rememberComposableLambda(-1627884300, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt.InputAddressScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues it, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if ((i3 & 6) == 0) {
                        i3 |= composer3.changed(it) ? 4 : 2;
                    }
                    if ((i3 & 19) != 18 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1627884300, i3, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:59)");
                        }
                        AddressUtilsKt.ScrollableColumn(PaddingKt.padding(Modifier.INSTANCE, it), null, ComposableLambdaKt.rememberComposableLambda(1302516336, true, new AnonymousClass1(title, topContent, formContent, bottomContent, primaryButtonText, z3, focusManager, onPrimaryButtonClick), composer3, 54), composer3, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }

                /* compiled from: InputAddressScreen.kt */
                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<ColumnScope, Composer, Integer, Unit> {
                    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $bottomContent;
                    final /* synthetic */ FocusManager $focusManager;
                    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $formContent;
                    final /* synthetic */ Function0<Unit> $onPrimaryButtonClick;
                    final /* synthetic */ boolean $primaryButtonEnabled;
                    final /* synthetic */ String $primaryButtonText;
                    final /* synthetic */ String $title;
                    final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> $topContent;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(String str, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function32, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function33, String str2, boolean z, FocusManager focusManager, Function0<Unit> function0) {
                        this.$title = str;
                        this.$topContent = function3;
                        this.$formContent = function32;
                        this.$bottomContent = function33;
                        this.$primaryButtonText = str2;
                        this.$primaryButtonEnabled = z;
                        this.$focusManager = focusManager;
                        this.$onPrimaryButtonClick = function0;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                        invoke(columnScope, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope ScrollableColumn, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(ScrollableColumn, "$this$ScrollableColumn");
                        if ((i & 17) != 16 || !composer.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1302516336, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous>.<anonymous> (InputAddressScreen.kt:62)");
                            }
                            Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(PaddingKt.padding(Modifier.INSTANCE, StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE)), 0.0f, Dp.m6117constructorimpl(StripeTheme.INSTANCE.getFormInsets().getTop()), 0.0f, 0.0f, 13, null);
                            String str = this.$title;
                            Function3<ColumnScope, Composer, Integer, Unit> function3 = this.$topContent;
                            Function3<ColumnScope, Composer, Integer, Unit> function32 = this.$formContent;
                            Function3<ColumnScope, Composer, Integer, Unit> function33 = this.$bottomContent;
                            String str2 = this.$primaryButtonText;
                            boolean z = this.$primaryButtonEnabled;
                            final FocusManager focusManager = this.$focusManager;
                            final Function0<Unit> function0 = this.$onPrimaryButtonClick;
                            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM1024paddingqDBjuR0$default);
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
                            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3150constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2076Text4IGK_g(str, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), composer, 48, 0, 65532);
                            function3.invoke(columnScopeInstance, composer, 6);
                            function32.invoke(columnScopeInstance, composer, 6);
                            function33.invoke(columnScopeInstance, composer, 6);
                            Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(16), 1, null);
                            composer.startReplaceGroup(1192580623);
                            boolean zChangedInstance = composer.changedInstance(focusManager) | composer.changed(function0);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InputAddressScreenKt.AnonymousClass2.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(focusManager, function0);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            PrimaryButtonKt.PrimaryButton(str2, z, (Function0) objRememberedValue, modifierM1022paddingVpY3zN4$default, false, false, composer, 3072, 48);
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
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(FocusManager focusManager, Function0 function0) {
                        FocusManager.clearFocus$default(focusManager, false, 1, null);
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composer2, BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT, 12582912, 98298);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InputAddressScreenKt.InputAddressScreen$lambda$0(z, primaryButtonText, title, onPrimaryButtonClick, onCloseClick, topContent, formContent, bottomContent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InputAddressScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$1, reason: invalid class name */
    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ Function0<Unit> $onCloseClick;

        AnonymousClass1(FocusManager focusManager, Function0<Unit> function0) {
            this.$focusManager = focusManager;
            this.$onCloseClick = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-340151621, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:50)");
                }
                composer.startReplaceGroup(365170269);
                boolean zChangedInstance = composer.changedInstance(this.$focusManager) | composer.changed(this.$onCloseClick);
                final FocusManager focusManager = this.$focusManager;
                final Function0<Unit> function0 = this.$onCloseClick;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InputAddressScreenKt.AnonymousClass1.invoke$lambda$1$lambda$0(focusManager, function0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                AddressOptionsAppBarKt.AddressOptionsAppBar(true, (Function0) objRememberedValue, composer, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(FocusManager focusManager, Function0 function0) {
            FocusManager.clearFocus$default(focusManager, false, 1, null);
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void InputAddressScreen(final Provider<InputAddressViewModelSubcomponent.Builder> inputAddressViewModelSubcomponentBuilderProvider, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(1998888381);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(inputAddressViewModelSubcomponentBuilderProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1998888381, i2, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen (InputAddressScreen.kt:90)");
            }
            InputAddressViewModel.Factory factory = new InputAddressViewModel.Factory(inputAddressViewModelSubcomponentBuilderProvider);
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
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InputAddressViewModel.class), current, (String) null, factory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final InputAddressViewModel inputAddressViewModel = (InputAddressViewModel) viewModel;
            final AddressFormController addressFormController = inputAddressViewModel.getAddressFormController();
            final State stateCollectAsState = StateFlowsComposeKt.collectAsState(addressFormController.getCompleteFormValues(), null, composerStartRestartGroup, 0, 1);
            AddressLauncher.Configuration config$paymentsheet_release = inputAddressViewModel.getArgs().getConfig$paymentsheet_release();
            String buttonTitle = config$paymentsheet_release != null ? config$paymentsheet_release.getButtonTitle() : null;
            composerStartRestartGroup.startReplaceGroup(-1988496391);
            if (buttonTitle == null) {
                buttonTitle = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_address_element_primary_button, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            AddressLauncher.Configuration config$paymentsheet_release2 = inputAddressViewModel.getArgs().getConfig$paymentsheet_release();
            String title = config$paymentsheet_release2 != null ? config$paymentsheet_release2.getTitle() : null;
            composerStartRestartGroup.startReplaceGroup(-1988491659);
            if (title == null) {
                title = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_address_element_shipping_address, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            State stateCollectAsState2 = StateFlowsComposeKt.collectAsState(inputAddressViewModel.getFormEnabled(), null, composerStartRestartGroup, 0, 1);
            final State stateCollectAsState3 = StateFlowsComposeKt.collectAsState(inputAddressViewModel.getCheckboxChecked(), null, composerStartRestartGroup, 0, 1);
            State stateCollectAsState4 = StateFlowsComposeKt.collectAsState(inputAddressViewModel.getShippingSameAsBillingState(), null, composerStartRestartGroup, 0, 1);
            boolean z = InputAddressScreen$lambda$1(stateCollectAsState) != null;
            composerStartRestartGroup.startReplaceGroup(-1988474819);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(inputAddressViewModel) | composerStartRestartGroup.changed(stateCollectAsState) | composerStartRestartGroup.changed(stateCollectAsState3);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InputAddressScreenKt.InputAddressScreen$lambda$6$lambda$5(inputAddressViewModel, stateCollectAsState, stateCollectAsState3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1988469925);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(inputAddressViewModel);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InputAddressScreenKt.InputAddressScreen$lambda$8$lambda$7(inputAddressViewModel);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = z;
            InputAddressScreen(z2, buttonTitle, title, function0, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(-2084438075, true, new AnonymousClass6(inputAddressViewModel, stateCollectAsState4, stateCollectAsState2), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(268350756, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt.InputAddressScreen.7
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope InputAddressScreen, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(InputAddressScreen, "$this$InputAddressScreen");
                    if ((i3 & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(268350756, i3, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:138)");
                        }
                        composer2.startReplaceGroup(365272737);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = StateFlowsKt.stateFlowOf(SetsKt.emptySet());
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        StateFlow stateFlow = (StateFlow) objRememberedValue3;
                        composer2.endReplaceGroup();
                        StateFlow<Boolean> formEnabled = inputAddressViewModel.getFormEnabled();
                        List<FormElement> elements = addressFormController.getElements();
                        composer2.startReplaceGroup(365277831);
                        boolean zChanged = composer2.changed(elements);
                        AddressFormController addressFormController2 = addressFormController;
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = StateFlowsKt.stateFlowOf(addressFormController2.getElements());
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        FormUIKt.FormUI((StateFlow<? extends Set<IdentifierSpec>>) stateFlow, formEnabled, (StateFlow<? extends List<? extends FormElement>>) objRememberedValue4, addressFormController.getLastTextFieldIdentifier(), (Modifier) null, composer2, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1673827709, true, new AnonymousClass8(inputAddressViewModel, stateCollectAsState3, stateCollectAsState2), composerStartRestartGroup, 54), composerStartRestartGroup, 14352384);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InputAddressScreenKt.InputAddressScreen$lambda$9(inputAddressViewModelSubcomponentBuilderProvider, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputAddressScreen$lambda$6$lambda$5(InputAddressViewModel inputAddressViewModel, State state, State state2) {
        inputAddressViewModel.clickPrimaryButton(InputAddressScreen$lambda$1(state), InputAddressScreen$lambda$3(state2));
        return Unit.INSTANCE;
    }

    /* compiled from: InputAddressScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$6, reason: invalid class name */
    static final class AnonymousClass6 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ State<InputAddressViewModel.ShippingSameAsBillingState> $billingSameAsShippingState$delegate;
        final /* synthetic */ State<Boolean> $formEnabled$delegate;
        final /* synthetic */ InputAddressViewModel $viewModel;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(InputAddressViewModel inputAddressViewModel, State<? extends InputAddressViewModel.ShippingSameAsBillingState> state, State<Boolean> state2) {
            this.$viewModel = inputAddressViewModel;
            this.$billingSameAsShippingState$delegate = state;
            this.$formEnabled$delegate = state2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(InputAddressScreen, "$this$InputAddressScreen");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2084438075, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:121)");
                }
                InputAddressViewModel.ShippingSameAsBillingState shippingSameAsBillingStateInputAddressScreen$lambda$4 = InputAddressScreenKt.InputAddressScreen$lambda$4(this.$billingSameAsShippingState$delegate);
                if (shippingSameAsBillingStateInputAddressScreen$lambda$4 instanceof InputAddressViewModel.ShippingSameAsBillingState.Show) {
                    Modifier modifierM1024paddingqDBjuR0$default = PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(8), 7, null);
                    boolean zIsChecked = ((InputAddressViewModel.ShippingSameAsBillingState.Show) shippingSameAsBillingStateInputAddressScreen$lambda$4).isChecked();
                    String strResolve = ResolvableStringComposeUtilsKt.resolve(ResolvableStringUtilsKt.getResolvableString(R.string.stripe_paymentsheet_address_element_use_billing_as_shipping), composer, 0);
                    boolean zInputAddressScreen$lambda$2 = InputAddressScreenKt.InputAddressScreen$lambda$2(this.$formEnabled$delegate);
                    composer.startReplaceGroup(365265841);
                    boolean zChangedInstance = composer.changedInstance(this.$viewModel);
                    final InputAddressViewModel inputAddressViewModel = this.$viewModel;
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$6$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InputAddressScreenKt.AnonymousClass6.invoke$lambda$1$lambda$0(inputAddressViewModel, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CheckboxElementUIKt.CheckboxElementUI(modifierM1024paddingqDBjuR0$default, null, zIsChecked, strResolve, zInputAddressScreen$lambda$2, (Function1) objRememberedValue, composer, 6, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InputAddressViewModel inputAddressViewModel, boolean z) {
            inputAddressViewModel.clickBillingSameAsShipping(z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputAddressScreen$lambda$8$lambda$7(InputAddressViewModel inputAddressViewModel) {
        AddressElementNavigator.DefaultImpls.dismiss$default(inputAddressViewModel.getNavigator(), null, 1, null);
        return Unit.INSTANCE;
    }

    /* compiled from: InputAddressScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$8, reason: invalid class name */
    static final class AnonymousClass8 implements Function3<ColumnScope, Composer, Integer, Unit> {
        final /* synthetic */ State<Boolean> $checkboxChecked$delegate;
        final /* synthetic */ State<Boolean> $formEnabled$delegate;
        final /* synthetic */ InputAddressViewModel $viewModel;

        AnonymousClass8(InputAddressViewModel inputAddressViewModel, State<Boolean> state, State<Boolean> state2) {
            this.$viewModel = inputAddressViewModel;
            this.$checkboxChecked$delegate = state;
            this.$formEnabled$delegate = state2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope InputAddressScreen, Composer composer, int i) {
            AddressLauncher.AdditionalFieldsConfiguration additionalFields;
            Intrinsics.checkNotNullParameter(InputAddressScreen, "$this$InputAddressScreen");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1673827709, i, -1, "com.stripe.android.paymentsheet.addresselement.InputAddressScreen.<anonymous> (InputAddressScreen.kt:150)");
                }
                AddressLauncher.Configuration config$paymentsheet_release = this.$viewModel.getArgs().getConfig$paymentsheet_release();
                String checkboxLabel = (config$paymentsheet_release == null || (additionalFields = config$paymentsheet_release.getAdditionalFields()) == null) ? null : additionalFields.getCheckboxLabel();
                if (checkboxLabel != null) {
                    final InputAddressViewModel inputAddressViewModel = this.$viewModel;
                    final State<Boolean> state = this.$checkboxChecked$delegate;
                    State<Boolean> state2 = this.$formEnabled$delegate;
                    Modifier modifierM1022paddingVpY3zN4$default = PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(4), 1, null);
                    boolean zInputAddressScreen$lambda$3 = InputAddressScreenKt.InputAddressScreen$lambda$3(state);
                    boolean zInputAddressScreen$lambda$2 = InputAddressScreenKt.InputAddressScreen$lambda$2(state2);
                    composer.startReplaceGroup(-1424141903);
                    boolean zChangedInstance = composer.changedInstance(inputAddressViewModel) | composer.changed(state);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.addresselement.InputAddressScreenKt$InputAddressScreen$8$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InputAddressScreenKt.AnonymousClass8.invoke$lambda$2$lambda$1$lambda$0(inputAddressViewModel, state, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    CheckboxElementUIKt.CheckboxElementUI(modifierM1022paddingVpY3zN4$default, null, zInputAddressScreen$lambda$3, checkboxLabel, zInputAddressScreen$lambda$2, (Function1) objRememberedValue, composer, 6, 2);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(InputAddressViewModel inputAddressViewModel, State state, boolean z) {
            inputAddressViewModel.clickCheckbox(!InputAddressScreenKt.InputAddressScreen$lambda$3(state));
            return Unit.INSTANCE;
        }
    }

    private static final Map<IdentifierSpec, FormFieldEntry> InputAddressScreen$lambda$1(State<? extends Map<IdentifierSpec, FormFieldEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputAddressScreen$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InputAddressScreen$lambda$3(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputAddressViewModel.ShippingSameAsBillingState InputAddressScreen$lambda$4(State<? extends InputAddressViewModel.ShippingSameAsBillingState> state) {
        return state.getValue();
    }
}
