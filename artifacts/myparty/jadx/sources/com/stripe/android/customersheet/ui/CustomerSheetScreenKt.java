package com.stripe.android.customersheet.ui;

import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
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
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.common.ui.BottomSheetScaffoldKt;
import com.stripe.android.common.ui.LoadingIndicatorKt;
import com.stripe.android.common.ui.PrimaryButtonKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.customersheet.CustomerSheetViewAction;
import com.stripe.android.customersheet.CustomerSheetViewModel;
import com.stripe.android.customersheet.CustomerSheetViewState;
import com.stripe.android.customersheet.ui.CustomerSheetScreenKt;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.paymentsheet.DisplayableSavedPaymentMethod;
import com.stripe.android.paymentsheet.PaymentOptionsItem;
import com.stripe.android.paymentsheet.PaymentOptionsState;
import com.stripe.android.paymentsheet.PaymentOptionsStateFactory;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.ui.ErrorMessageKt;
import com.stripe.android.paymentsheet.ui.PaymentElementKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarKt;
import com.stripe.android.paymentsheet.ui.PaymentSheetTopBarState;
import com.stripe.android.paymentsheet.ui.SavedPaymentMethodTabLayoutUIKt;
import com.stripe.android.paymentsheet.ui.UpdatePaymentMethodUIKt;
import com.stripe.android.paymentsheet.utils.ComposeUtilsKt;
import com.stripe.android.ui.core.elements.H4TextKt;
import com.stripe.android.ui.core.elements.MandateTextUIKt;
import com.stripe.android.ui.core.elements.SimpleDialogElementUIKt;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporterKt;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporterKt;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporterKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: CustomerSheetScreen.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a[\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\u00110\fH\u0001¢\u0006\u0002\u0010\u0012\u001aO\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00142\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u001a\u0010\u000e\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\u00110\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u0015\u001a1\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00172\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0018\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u001b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001c\"\u0010\u0010\u001d\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0002\n\u0000\"\u0010\u0010\u001e\u001a\u00020\u000f8\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002"}, d2 = {"CustomerSheetScreen", "", "viewModel", "Lcom/stripe/android/customersheet/CustomerSheetViewModel;", "(Lcom/stripe/android/customersheet/CustomerSheetViewModel;Landroidx/compose/runtime/Composer;I)V", "viewState", "Lcom/stripe/android/customersheet/CustomerSheetViewState;", "displayAddForm", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewActionHandler", "Lkotlin/Function1;", "Lcom/stripe/android/customersheet/CustomerSheetViewAction;", "paymentMethodNameProvider", "", "Lcom/stripe/android/model/PaymentMethodCode;", "Lcom/stripe/android/core/strings/ResolvableString;", "(Lcom/stripe/android/customersheet/CustomerSheetViewState;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SelectPaymentMethod", "Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;", "(Lcom/stripe/android/customersheet/CustomerSheetViewState$SelectPaymentMethod;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddPaymentMethod", "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;", "displayForm", "(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "UpdatePaymentMethod", "Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;", "(Lcom/stripe/android/customersheet/CustomerSheetViewState$UpdatePaymentMethod;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CUSTOMER_SHEET_CONFIRM_BUTTON_TEST_TAG", "CUSTOMER_SHEET_SAVE_BUTTON_TEST_TAG", "paymentsheet_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CustomerSheetScreenKt {
    public static final String CUSTOMER_SHEET_CONFIRM_BUTTON_TEST_TAG = "CustomerSheetConfirmButton";
    public static final String CUSTOMER_SHEET_SAVE_BUTTON_TEST_TAG = "CustomerSheetSaveButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$29(CustomerSheetViewState.AddPaymentMethod addPaymentMethod, Function1 function1, boolean z, int i, Composer composer, int i2) {
        AddPaymentMethod(addPaymentMethod, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomerSheetScreen$lambda$3(CustomerSheetViewModel customerSheetViewModel, int i, Composer composer, int i2) {
        CustomerSheetScreen(customerSheetViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomerSheetScreen$lambda$6(CustomerSheetViewState customerSheetViewState, boolean z, Modifier modifier, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        CustomerSheetScreen(customerSheetViewState, z, modifier, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectPaymentMethod$lambda$17(CustomerSheetViewState.SelectPaymentMethod selectPaymentMethod, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SelectPaymentMethod(selectPaymentMethod, function1, function12, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePaymentMethod$lambda$32(CustomerSheetViewState.UpdatePaymentMethod updatePaymentMethod, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UpdatePaymentMethod(updatePaymentMethod, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CustomerSheetScreen(final CustomerSheetViewModel viewModel, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1645160815);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1645160815, i2, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen (CustomerSheetScreen.kt:52)");
            }
            CustomerSheetViewState customerSheetViewStateCustomerSheetScreen$lambda$0 = CustomerSheetScreen$lambda$0(StateFlowsComposeKt.collectAsState(viewModel.getViewState(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(1917976334);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(viewModel);
            CustomerSheetScreenKt$CustomerSheetScreen$1$1 customerSheetScreenKt$CustomerSheetScreen$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || customerSheetScreenKt$CustomerSheetScreen$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                customerSheetScreenKt$CustomerSheetScreen$1$1RememberedValue = new CustomerSheetScreenKt$CustomerSheetScreen$1$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(customerSheetScreenKt$CustomerSheetScreen$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) customerSheetScreenKt$CustomerSheetScreen$1$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(1917978422);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(viewModel);
            CustomerSheetScreenKt$CustomerSheetScreen$2$1 customerSheetScreenKt$CustomerSheetScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || customerSheetScreenKt$CustomerSheetScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                customerSheetScreenKt$CustomerSheetScreen$2$1RememberedValue = new CustomerSheetScreenKt$CustomerSheetScreen$2$1(viewModel);
                composerStartRestartGroup.updateRememberedValue(customerSheetScreenKt$CustomerSheetScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            CustomerSheetScreen(customerSheetViewStateCustomerSheetScreen$lambda$0, false, null, function1, (Function1) ((KFunction) customerSheetScreenKt$CustomerSheetScreen$2$1RememberedValue), composerStartRestartGroup, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomerSheetScreenKt.CustomerSheetScreen$lambda$3(viewModel, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CustomerSheetScreen$lambda$5$lambda$4(CustomerSheetViewAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CustomerSheetScreen(final CustomerSheetViewState viewState, final boolean z, Modifier modifier, Function1<? super CustomerSheetViewAction, Unit> function1, final Function1<? super String, ? extends ResolvableString> paymentMethodNameProvider, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super CustomerSheetViewAction, Unit> function12;
        final Function1<? super CustomerSheetViewAction, Unit> function13;
        final Function1<? super CustomerSheetViewAction, Unit> function14;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(paymentMethodNameProvider, "paymentMethodNameProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(-19930224);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else {
            if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(paymentMethodNameProvider) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i5 != 0) {
                        z = true;
                    }
                    Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1917986741);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CustomerSheetScreenKt.CustomerSheetScreen$lambda$5$lambda$4((CustomerSheetViewAction) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function13 = (Function1) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        function13 = function12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-19930224, i3, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen (CustomerSheetScreen.kt:69)");
                    }
                    Modifier modifier4 = companion;
                    BottomSheetScaffoldKt.BottomSheetScaffold(ComposableLambdaKt.rememberComposableLambda(960460561, true, new AnonymousClass5(viewState, function13), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1539226706, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt.CustomerSheetScreen.6
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            Composer composer3;
                            if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1539226706, i7, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:86)");
                                }
                                Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                                CustomerSheetViewState customerSheetViewState = viewState;
                                Function1<CustomerSheetViewAction, Unit> function15 = function13;
                                Function1<String, ResolvableString> function16 = paymentMethodNameProvider;
                                boolean z2 = z;
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
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
                                if (customerSheetViewState instanceof CustomerSheetViewState.Loading) {
                                    composer2.startReplaceGroup(-386360348);
                                    LoadingIndicatorKt.BottomSheetLoadingIndicator(null, composer2, 0, 1);
                                    composer2.endReplaceGroup();
                                    composer3 = composer2;
                                } else if (customerSheetViewState instanceof CustomerSheetViewState.SelectPaymentMethod) {
                                    composer2.startReplaceGroup(-386206123);
                                    composer3 = composer2;
                                    CustomerSheetScreenKt.SelectPaymentMethod((CustomerSheetViewState.SelectPaymentMethod) customerSheetViewState, function15, function16, null, composer3, 0, 8);
                                    ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3 = composer2;
                                    if (customerSheetViewState instanceof CustomerSheetViewState.AddPaymentMethod) {
                                        composer3.startReplaceGroup(-385795311);
                                        CustomerSheetScreenKt.AddPaymentMethod((CustomerSheetViewState.AddPaymentMethod) customerSheetViewState, function15, z2, composer3, 0);
                                        ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                        composer3.endReplaceGroup();
                                    } else if (customerSheetViewState instanceof CustomerSheetViewState.UpdatePaymentMethod) {
                                        composer3.startReplaceGroup(-385412213);
                                        CustomerSheetScreenKt.UpdatePaymentMethod((CustomerSheetViewState.UpdatePaymentMethod) customerSheetViewState, null, composer3, 0, 2);
                                        ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                        composer3.endReplaceGroup();
                                    } else {
                                        composer3.startReplaceGroup(-982295827);
                                        composer3.endReplaceGroup();
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composerStartRestartGroup, 54), modifier4, null, composerStartRestartGroup, (i3 & 896) | 54, 8);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function13;
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function14 = function12;
                }
                final boolean z2 = z;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CustomerSheetScreenKt.CustomerSheetScreen$lambda$6(viewState, z2, modifier3, function14, paymentMethodNameProvider, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier42 = companion;
                BottomSheetScaffoldKt.BottomSheetScaffold(ComposableLambdaKt.rememberComposableLambda(960460561, true, new AnonymousClass5(viewState, function13), composerStartRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1539226706, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt.CustomerSheetScreen.6
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        Composer composer3;
                        if ((i7 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1539226706, i7, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:86)");
                            }
                            Modifier modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(Modifier.INSTANCE, null, null, 3, null);
                            CustomerSheetViewState customerSheetViewState = viewState;
                            Function1<CustomerSheetViewAction, Unit> function15 = function13;
                            Function1<String, ResolvableString> function16 = paymentMethodNameProvider;
                            boolean z22 = z;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierAnimateContentSize$default);
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
                            if (customerSheetViewState instanceof CustomerSheetViewState.Loading) {
                                composer2.startReplaceGroup(-386360348);
                                LoadingIndicatorKt.BottomSheetLoadingIndicator(null, composer2, 0, 1);
                                composer2.endReplaceGroup();
                                composer3 = composer2;
                            } else if (customerSheetViewState instanceof CustomerSheetViewState.SelectPaymentMethod) {
                                composer2.startReplaceGroup(-386206123);
                                composer3 = composer2;
                                CustomerSheetScreenKt.SelectPaymentMethod((CustomerSheetViewState.SelectPaymentMethod) customerSheetViewState, function15, function16, null, composer3, 0, 8);
                                ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                composer3.endReplaceGroup();
                            } else {
                                composer3 = composer2;
                                if (customerSheetViewState instanceof CustomerSheetViewState.AddPaymentMethod) {
                                    composer3.startReplaceGroup(-385795311);
                                    CustomerSheetScreenKt.AddPaymentMethod((CustomerSheetViewState.AddPaymentMethod) customerSheetViewState, function15, z22, composer3, 0);
                                    ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                    composer3.endReplaceGroup();
                                } else if (customerSheetViewState instanceof CustomerSheetViewState.UpdatePaymentMethod) {
                                    composer3.startReplaceGroup(-385412213);
                                    CustomerSheetScreenKt.UpdatePaymentMethod((CustomerSheetViewState.UpdatePaymentMethod) customerSheetViewState, null, composer3, 0, 2);
                                    ComposeUtilsKt.m8559PaymentSheetContentPaddingkHDZbjc(0.0f, composer3, 0, 1);
                                    composer3.endReplaceGroup();
                                } else {
                                    composer3.startReplaceGroup(-982295827);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composerStartRestartGroup, 54), modifier42, null, composerStartRestartGroup, (i3 & 896) | 54, 8);
                if (ComposerKt.isTraceInProgress()) {
                }
                function14 = function13;
                modifier3 = modifier42;
            }
            final boolean z22 = z;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        final boolean z222 = z;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: CustomerSheetScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$CustomerSheetScreen$5, reason: invalid class name */
    static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<CustomerSheetViewAction, Unit> $viewActionHandler;
        final /* synthetic */ CustomerSheetViewState $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass5(CustomerSheetViewState customerSheetViewState, Function1<? super CustomerSheetViewAction, Unit> function1) {
            this.$viewState = customerSheetViewState;
            this.$viewActionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(960460561, i, -1, "com.stripe.android.customersheet.ui.CustomerSheetScreen.<anonymous> (CustomerSheetScreen.kt:72)");
                }
                CustomerSheetViewState customerSheetViewState = this.$viewState;
                composer.startReplaceGroup(-1288155406);
                boolean zChanged = composer.changed(this.$viewActionHandler);
                final Function1<CustomerSheetViewAction, Unit> function1 = this.$viewActionHandler;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.AnonymousClass5.invoke$lambda$1$lambda$0(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                PaymentSheetTopBarState paymentSheetTopBarState = customerSheetViewState.topBarState((Function0) objRememberedValue);
                boolean canNavigateBack = this.$viewState.getCanNavigateBack();
                boolean z = !this.$viewState.getIsProcessing();
                composer.startReplaceGroup(-1288147424);
                boolean zChanged2 = composer.changed(this.$viewActionHandler);
                final Function1<CustomerSheetViewAction, Unit> function12 = this.$viewActionHandler;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$CustomerSheetScreen$5$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.AnonymousClass5.invoke$lambda$3$lambda$2(function12);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PaymentSheetTopBarKt.m8492PaymentSheetTopBarFJfuzF0(paymentSheetTopBarState, canNavigateBack, z, (Function0) objRememberedValue2, 0.0f, composer, 0, 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
            function1.invoke(CustomerSheetViewAction.OnEditPressed.INSTANCE);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1) {
            function1.invoke(CustomerSheetViewAction.OnBackPressed.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SelectPaymentMethod(final CustomerSheetViewState.SelectPaymentMethod viewState, final Function1<? super CustomerSheetViewAction, Unit> viewActionHandler, final Function1<? super String, ? extends ResolvableString> paymentMethodNameProvider, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String title;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        String errorMessage;
        PaddingValues paddingValues;
        int i5;
        int i6;
        Composer composer2;
        PaddingValues paddingValues2;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        Intrinsics.checkNotNullParameter(paymentMethodNameProvider, "paymentMethodNameProvider");
        Composer composerStartRestartGroup = composer.startRestartGroup(1248593812);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(viewActionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(paymentMethodNameProvider) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1248593812, i4, -1, "com.stripe.android.customersheet.ui.SelectPaymentMethod (CustomerSheetScreen.kt:126)");
                }
                PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
                title = viewState.getTitle();
                composerStartRestartGroup.startReplaceGroup(2144051726);
                if (title == null) {
                    title = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_manage_your_payment_methods, composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                float f = 20;
                H4TextKt.H4Text(title, PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f), 7, null), outerFormInsets), composerStartRestartGroup, 0, 0);
                PaymentOptionsState paymentOptionsStateCreate = PaymentOptionsStateFactory.INSTANCE.create(viewState.getSavedPaymentMethods(), viewState.getShowGooglePay(), false, viewState.getPaymentSelection(), paymentMethodNameProvider, viewState.isCbcEligible(), null);
                List<PaymentOptionsItem> items = paymentOptionsStateCreate.getItems();
                PaymentOptionsItem selectedItem = paymentOptionsStateCreate.getSelectedItem();
                boolean zIsEditing = viewState.isEditing();
                boolean isProcessing = viewState.getIsProcessing();
                composerStartRestartGroup.startReplaceGroup(2144083311);
                int i8 = i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                z = i8 != 32;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$8$lambda$7(viewActionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2144086321);
                z2 = i8 != 32;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$10$lambda$9(viewActionHandler, (PaymentSelection) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2144089327);
                z3 = i8 != 32;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$12$lambda$11(viewActionHandler, (DisplayableSavedPaymentMethod) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                float f2 = 2;
                Modifier modifier5 = modifier4;
                SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI(items, selectedItem, zIsEditing, isProcessing, function0, function1, (Function1) objRememberedValue3, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f2), 7, null), null, composerStartRestartGroup, 12582912, 256);
                errorMessage = viewState.getErrorMessage();
                composerStartRestartGroup.startReplaceGroup(2144094738);
                if (errorMessage != null) {
                    paddingValues = outerFormInsets;
                    i5 = 0;
                } else {
                    paddingValues = outerFormInsets;
                    i5 = 0;
                    ErrorMessageKt.ErrorMessage(errorMessage, PaddingKt.padding(PaddingKt.m1022paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(f2), 1, null), paddingValues), composerStartRestartGroup, 0, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(2144102663);
                if (viewState.getPrimaryButtonVisible()) {
                    i6 = i5;
                    composer2 = composerStartRestartGroup;
                    paddingValues2 = paddingValues;
                } else {
                    String strResolve = ResolvableStringComposeUtilsKt.resolve(viewState.getPrimaryButtonLabel(), composerStartRestartGroup, i5);
                    boolean primaryButtonEnabled = viewState.getPrimaryButtonEnabled();
                    int i9 = i5;
                    boolean isProcessing2 = viewState.getIsProcessing();
                    Modifier modifierPadding = PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(TestTagKt.testTag(Modifier.INSTANCE, CUSTOMER_SHEET_CONFIRM_BUTTON_TEST_TAG), 0.0f, Dp.m6117constructorimpl(f), 0.0f, 0.0f, 13, null), paddingValues);
                    composerStartRestartGroup.startReplaceGroup(2144110905);
                    int i10 = i8 == 32 ? 1 : i9;
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (i10 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$15$lambda$14(viewActionHandler);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    paddingValues2 = paddingValues;
                    i6 = i9;
                    PrimaryButtonKt.PrimaryButton(strResolve, primaryButtonEnabled, (Function0) objRememberedValue4, modifierPadding, isProcessing2, false, composerStartRestartGroup, 0, 32);
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceGroup();
                ResolvableString mandateText = viewState.getMandateText();
                composer2.startReplaceGroup(2144123417);
                String strResolve2 = mandateText != null ? null : ResolvableStringComposeUtilsKt.resolve(mandateText, composer2, i6);
                composer2.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve2, PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), paddingValues2), 0, 0, null, composer2, 0, 28);
                composer3 = composer2;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CustomerSheetScreenKt.SelectPaymentMethod$lambda$17(viewState, viewActionHandler, paymentMethodNameProvider, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i7 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            PaddingValues outerFormInsets2 = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
                title = viewState.getTitle();
                composerStartRestartGroup.startReplaceGroup(2144051726);
                if (title == null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                float f3 = 20;
                H4TextKt.H4Text(title, PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f3), 7, null), outerFormInsets2), composerStartRestartGroup, 0, 0);
                PaymentOptionsState paymentOptionsStateCreate2 = PaymentOptionsStateFactory.INSTANCE.create(viewState.getSavedPaymentMethods(), viewState.getShowGooglePay(), false, viewState.getPaymentSelection(), paymentMethodNameProvider, viewState.isCbcEligible(), null);
                List<PaymentOptionsItem> items2 = paymentOptionsStateCreate2.getItems();
                PaymentOptionsItem selectedItem2 = paymentOptionsStateCreate2.getSelectedItem();
                boolean zIsEditing2 = viewState.isEditing();
                boolean isProcessing3 = viewState.getIsProcessing();
                composerStartRestartGroup.startReplaceGroup(2144083311);
                int i82 = i4 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                if (i82 != 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$8$lambda$7(viewActionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    Function0 function02 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(2144086321);
                    if (i82 != 32) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$10$lambda$9(viewActionHandler, (PaymentSelection) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        Function1 function12 = (Function1) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(2144089327);
                        if (i82 != 32) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z3) {
                            objRememberedValue3 = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CustomerSheetScreenKt.SelectPaymentMethod$lambda$16$lambda$12$lambda$11(viewActionHandler, (DisplayableSavedPaymentMethod) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            float f22 = 2;
                            Modifier modifier52 = modifier4;
                            SavedPaymentMethodTabLayoutUIKt.SavedPaymentMethodTabLayoutUI(items2, selectedItem2, zIsEditing2, isProcessing3, function02, function12, (Function1) objRememberedValue3, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(f22), 7, null), null, composerStartRestartGroup, 12582912, 256);
                            errorMessage = viewState.getErrorMessage();
                            composerStartRestartGroup.startReplaceGroup(2144094738);
                            if (errorMessage != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(2144102663);
                            if (viewState.getPrimaryButtonVisible()) {
                            }
                            composer2.endReplaceGroup();
                            ResolvableString mandateText2 = viewState.getMandateText();
                            composer2.startReplaceGroup(2144123417);
                            if (mandateText2 != null) {
                            }
                            composer2.endReplaceGroup();
                            MandateTextUIKt.m8662MandateJ7GKdg(strResolve2, PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), paddingValues2), 0, 0, null, composer2, 0, 28);
                            composer3 = composer2;
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectPaymentMethod$lambda$16$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(CustomerSheetViewAction.OnAddCardPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectPaymentMethod$lambda$16$lambda$10$lambda$9(Function1 function1, PaymentSelection paymentSelection) {
        function1.invoke(new CustomerSheetViewAction.OnItemSelected(paymentSelection));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectPaymentMethod$lambda$16$lambda$12$lambda$11(Function1 function1, DisplayableSavedPaymentMethod it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(new CustomerSheetViewAction.OnModifyItem(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectPaymentMethod$lambda$16$lambda$15$lambda$14(Function1 function1) {
        function1.invoke(CustomerSheetViewAction.OnPrimaryButtonPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    public static final void AddPaymentMethod(final CustomerSheetViewState.AddPaymentMethod viewState, final Function1<? super CustomerSheetViewAction, Unit> viewActionHandler, final boolean z, Composer composer, final int i) {
        int i2;
        int i3;
        int i4;
        Composer composer2;
        int i5;
        Composer composer3;
        float fM6117constructorimpl;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(viewActionHandler, "viewActionHandler");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1037362630);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(viewActionHandler) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1037362630, i2, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod (CustomerSheetScreen.kt:202)");
            }
            PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(1183645541);
            if (viewState.getDisplayDismissConfirmationModal()) {
                String strStringResource = StringResources_androidKt.stringResource(R.string.stripe_confirm_close_form_title, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.stripe_confirm_close_form_body, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_close, composerStartRestartGroup, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_cancel, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1183664342);
                int i6 = i2 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
                boolean z2 = i6 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.AddPaymentMethod$lambda$19$lambda$18(viewActionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1183660440);
                boolean z3 = i6 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CustomerSheetScreenKt.AddPaymentMethod$lambda$21$lambda$20(viewActionHandler);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                i3 = i2;
                i4 = 0;
                SimpleDialogElementUIKt.SimpleDialogElementUI(strStringResource, strStringResource2, strStringResource3, strStringResource4, true, function0, (Function0) objRememberedValue2, composer2, 24576, 0);
            } else {
                i3 = i2;
                i4 = 0;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            H4TextKt.H4Text(StringResources_androidKt.stringResource(R.string.stripe_paymentsheet_save_a_new_payment_method, composer2, i4), PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(4), 7, null), outerFormInsets), composer2, i4, i4);
            composer2.startReplaceGroup(1183677958);
            int i7 = i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS;
            int i8 = i7 == 32 ? 1 : i4;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (i8 != 0 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new DefaultCardNumberCompletedEventReporter(viewActionHandler);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            DefaultCardNumberCompletedEventReporter defaultCardNumberCompletedEventReporter = (DefaultCardNumberCompletedEventReporter) objRememberedValue3;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1183682209);
            int i9 = i7 == 32 ? 1 : i4;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (i9 != 0 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new DefaultCardBrandDisallowedReporter(viewActionHandler);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            DefaultCardBrandDisallowedReporter defaultCardBrandDisallowedReporter = (DefaultCardBrandDisallowedReporter) objRememberedValue4;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1183686428);
            int i10 = i7 == 32 ? 1 : i4;
            Object objRememberedValue5 = composer2.rememberedValue();
            if (i10 != 0 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new DefaultAnalyticsEventReporter(viewActionHandler);
                composer2.updateRememberedValue(objRememberedValue5);
            }
            DefaultAnalyticsEventReporter defaultAnalyticsEventReporter = (DefaultAnalyticsEventReporter) objRememberedValue5;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1183690626);
            if (z) {
                ProvidedValue[] providedValueArr = new ProvidedValue[3];
                providedValueArr[i4] = CardNumberCompletedEventReporterKt.getLocalCardNumberCompletedEventReporter().provides(defaultCardNumberCompletedEventReporter);
                ProvidedValue<CardBrandDisallowedReporter> providedValueProvides = CardBrandDisallowedReporterKt.getLocalCardBrandDisallowedReporter().provides(defaultCardBrandDisallowedReporter);
                i5 = 1;
                providedValueArr[1] = providedValueProvides;
                providedValueArr[2] = AnalyticsEventReporterKt.getLocalAnalyticsEventReporter().provides(defaultAnalyticsEventReporter);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(778901608, true, new AnonymousClass3(viewState, viewActionHandler), composer2, 54), composer2, ProvidedValue.$stable | 48);
            } else {
                i5 = 1;
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6117constructorimpl(24), 0.0f, 0.0f, 13, null), composer2, 6);
            ResolvableString errorMessage = viewState.getErrorMessage();
            composer2.startReplaceGroup(1183729236);
            if (errorMessage != null) {
                ErrorMessageKt.ErrorMessage(ResolvableStringComposeUtilsKt.resolve(errorMessage, composer2, i4), PaddingKt.padding(Modifier.INSTANCE, outerFormInsets), composer2, i4, i4);
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1183734423);
            if (viewState.getShowMandateAbovePrimaryButton()) {
                ResolvableString mandateText = viewState.getMandateText();
                composer2.startReplaceGroup(1183737641);
                String strResolve = mandateText == null ? null : ResolvableStringComposeUtilsKt.resolve(mandateText, composer2, i4);
                composer2.endReplaceGroup();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i5, null);
                if (viewState.getErrorMessage() != null) {
                    fM6117constructorimpl = Dp.m6117constructorimpl(8);
                } else {
                    fM6117constructorimpl = Dp.m6117constructorimpl(i4);
                }
                Modifier modifierPadding = PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, fM6117constructorimpl, 0.0f, 0.0f, 13, null), outerFormInsets);
                Composer composer4 = composer2;
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve, modifierPadding, 0, 0, null, composer4, 0, 28);
                composer2 = composer4;
            }
            composer2.endReplaceGroup();
            String strResolve2 = ResolvableStringComposeUtilsKt.resolve(viewState.getPrimaryButtonLabel(), composer2, i4);
            boolean primaryButtonEnabled = viewState.getPrimaryButtonEnabled();
            boolean isProcessing = viewState.getIsProcessing();
            Modifier modifierPadding2 = PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(TestTagKt.testTag(Modifier.INSTANCE, CUSTOMER_SHEET_SAVE_BUTTON_TEST_TAG), 0.0f, Dp.m6117constructorimpl(10), 0.0f, 0.0f, 13, null), outerFormInsets);
            composer2.startReplaceGroup(1183754457);
            int i11 = i7 == 32 ? 1 : i4;
            Object objRememberedValue6 = composer2.rememberedValue();
            if (i11 != 0 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CustomerSheetScreenKt.AddPaymentMethod$lambda$28$lambda$27(viewActionHandler);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue6);
            }
            Function0 function02 = (Function0) objRememberedValue6;
            composer2.endReplaceGroup();
            Composer composer5 = composer2;
            PrimaryButtonKt.PrimaryButton(strResolve2, primaryButtonEnabled, function02, modifierPadding2, isProcessing, true, composer5, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            composer3 = composer5;
            if (!viewState.getShowMandateAbovePrimaryButton()) {
                ResolvableString mandateText2 = viewState.getMandateText();
                composer3.startReplaceGroup(1183766441);
                String strResolve3 = mandateText2 == null ? null : ResolvableStringComposeUtilsKt.resolve(mandateText2, composer3, i4);
                composer3.endReplaceGroup();
                MandateTextUIKt.m8662MandateJ7GKdg(strResolve3, PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6117constructorimpl(8), 0.0f, 0.0f, 13, null), outerFormInsets), 0, 0, null, composer3, 0, 28);
                composer3 = composer3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CustomerSheetScreenKt.AddPaymentMethod$lambda$29(viewState, viewActionHandler, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$21$lambda$20(Function1 function1) {
        function1.invoke(CustomerSheetViewAction.OnCancelClose.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$19$lambda$18(Function1 function1) {
        function1.invoke(CustomerSheetViewAction.OnDismissed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: CustomerSheetScreen.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$AddPaymentMethod$3, reason: invalid class name */
    static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function1<CustomerSheetViewAction, Unit> $viewActionHandler;
        final /* synthetic */ CustomerSheetViewState.AddPaymentMethod $viewState;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(CustomerSheetViewState.AddPaymentMethod addPaymentMethod, Function1<? super CustomerSheetViewAction, Unit> function1) {
            this.$viewState = addPaymentMethod;
            this.$viewActionHandler = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(778901608, i, -1, "com.stripe.android.customersheet.ui.AddPaymentMethod.<anonymous> (CustomerSheetScreen.kt:247)");
                }
                boolean enabled = this.$viewState.getEnabled();
                List<SupportedPaymentMethod> supportedPaymentMethods = this.$viewState.getSupportedPaymentMethods();
                String paymentMethodCode = this.$viewState.getPaymentMethodCode();
                List<FormElement> formElements = this.$viewState.getFormElements();
                FormArguments formArguments = this.$viewState.getFormArguments();
                USBankAccountFormArguments usBankAccountFormArguments = this.$viewState.getUsBankAccountFormArguments();
                composer.startReplaceGroup(936347635);
                boolean zChanged = composer.changed(this.$viewActionHandler);
                final Function1<CustomerSheetViewAction, Unit> function1 = this.$viewActionHandler;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomerSheetScreenKt.AnonymousClass3.invoke$lambda$1$lambda$0(function1, (SupportedPaymentMethod) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function12 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(936358432);
                boolean zChanged2 = composer.changed(this.$viewActionHandler);
                final Function1<CustomerSheetViewAction, Unit> function13 = this.$viewActionHandler;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$AddPaymentMethod$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CustomerSheetScreenKt.AnonymousClass3.invoke$lambda$3$lambda$2(function13, (FormFieldValues) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                PaymentElementKt.PaymentElement(enabled, supportedPaymentMethods, paymentMethodCode, null, formElements, function12, formArguments, usBankAccountFormArguments, (Function1) objRememberedValue2, null, null, composer, 3072, 0, 1536);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SupportedPaymentMethod it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(new CustomerSheetViewAction.OnAddPaymentMethodItemChanged(it));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, FormFieldValues formFieldValues) {
            function1.invoke(new CustomerSheetViewAction.OnFormFieldValuesCompleted(formFieldValues));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddPaymentMethod$lambda$28$lambda$27(Function1 function1) {
        function1.invoke(CustomerSheetViewAction.OnPrimaryButtonPressed.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdatePaymentMethod(final CustomerSheetViewState.UpdatePaymentMethod updatePaymentMethod, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM3150constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ResolvableString screenTitle;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1607914208);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(updatePaymentMethod) : composerStartRestartGroup.changedInstance(updatePaymentMethod) ? 4 : 2) | i;
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
                companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1607914208, i3, -1, "com.stripe.android.customersheet.ui.UpdatePaymentMethod (CustomerSheetScreen.kt:318)");
                }
                PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
                screenTitle = updatePaymentMethod.getUpdatePaymentMethodInteractor().getScreenTitle();
                composerStartRestartGroup.startReplaceGroup(1302793370);
                if (screenTitle != null) {
                    H4TextKt.H4Text(ResolvableStringComposeUtilsKt.resolve(screenTitle, composerStartRestartGroup, 0), PaddingKt.padding(PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(20), 7, null), outerFormInsets), composerStartRestartGroup, 0, 0);
                }
                composerStartRestartGroup.endReplaceGroup();
                UpdatePaymentMethodUIKt.UpdatePaymentMethodUI(updatePaymentMethod.getUpdatePaymentMethodInteractor(), companion, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.customersheet.ui.CustomerSheetScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CustomerSheetScreenKt.UpdatePaymentMethod$lambda$32(updatePaymentMethod, companion, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            PaddingValues outerFormInsets2 = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m3157setimpl(composerM3150constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3157setimpl(composerM3150constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3150constructorimpl.getInserting()) {
                composerM3150constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3150constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3157setimpl(composerM3150constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                screenTitle = updatePaymentMethod.getUpdatePaymentMethodInteractor().getScreenTitle();
                composerStartRestartGroup.startReplaceGroup(1302793370);
                if (screenTitle != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                UpdatePaymentMethodUIKt.UpdatePaymentMethodUI(updatePaymentMethod.getUpdatePaymentMethodInteractor(), companion, composerStartRestartGroup, i3 & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final CustomerSheetViewState CustomerSheetScreen$lambda$0(State<? extends CustomerSheetViewState> state) {
        return state.getValue();
    }
}
