package com.stripe.android.paymentsheet.ui;

import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material.DividerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.internal.ServerProtocol;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.paymentsheet.ui.CardDetailsUIKt;
import com.stripe.android.paymentsheet.ui.EditCardDetailsInteractor;
import com.stripe.android.ui.core.R;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionElementUIKt;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionUIKt;
import com.stripe.android.uicore.strings.ResolvableStringComposeUtilsKt;
import com.stripe.android.uicore.utils.StateFlowsComposeKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CardDetailsUI.kt */
@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0085\u0001\u0010\u0005\u001a\u00020\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a\u001b\u0010\u001d\u001a\u00020\u00012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001fH\u0003¢\u0006\u0002\u0010 \u001a\u0017\u0010!\u001a\u00020\"*\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0003¢\u0006\u0002\u0010#\u001aY\u0010$\u001a\u00020\u00012\b\u0010%\u001a\u0004\u0018\u00010\u00192\u0006\u0010&\u001a\u00020\u00102\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010*\u001a\u00020\"H\u0003¢\u0006\u0002\u0010+\u001a\u001d\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0003¢\u0006\u0002\u00101\"\u000e\u00102\u001a\u00020\u0019X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u00020\u0019X\u0080T¢\u0006\u0002\n\u0000¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002"}, d2 = {"CardDetailsEditUI", "", "editCardDetailsInteractor", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;", "(Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;Landroidx/compose/runtime/Composer;I)V", "CardDetailsFormUI", "billingDetailsForm", "Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;", "cardDetailsState", "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;", "payload", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", "paymentMethodIcon", "", "onBrandChoiceChanged", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;", "dividerHeight", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/Dp;", "hiddenBillingDetailsFields", "Landroidx/compose/runtime/State;", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "onExpDateChanged", "", "nameElementForCardSection", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "(Lcom/stripe/android/paymentsheet/ui/BillingDetailsForm;Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$CardDetailsState;Lcom/stripe/android/paymentsheet/ui/EditCardPayload;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/runtime/Composer;I)V", "ContactInformationSection", "contactElements", "", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "hasFocusableFields", "", "(Ljava/util/Set;Landroidx/compose/runtime/Composer;I)Z", "CardNumberField", "last4", "selectedBrand", "availableNetworks", "shouldShowCardBrandDropdown", "savedPaymentMethodIcon", "isFirstField", "(Ljava/lang/String;Lcom/stripe/android/paymentsheet/ui/CardBrandChoice;Ljava/util/List;ZILkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "CvcField", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/stripe/android/model/CardBrand;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "CARD_EDIT_UI_ERROR_MESSAGE", "CARD_EDIT_UI_FALLBACK_EXPIRY_DATE", "paymentsheet_release", ServerProtocol.DIALOG_PARAM_STATE, "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor$State;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsUIKt {
    public static final String CARD_EDIT_UI_ERROR_MESSAGE = "card_edit_ui_error_message";
    public static final String CARD_EDIT_UI_FALLBACK_EXPIRY_DATE = "•• / ••";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsEditUI$lambda$11(EditCardDetailsInteractor editCardDetailsInteractor, int i, Composer composer, int i2) {
        CardDetailsEditUI(editCardDetailsInteractor, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsFormUI$lambda$13(BillingDetailsForm billingDetailsForm, EditCardDetailsInteractor.CardDetailsState cardDetailsState, EditCardPayload editCardPayload, int i, Function1 function1, MutableState mutableState, State state, Function1 function12, SectionFieldElement sectionFieldElement, int i2, Composer composer, int i3) {
        CardDetailsFormUI(billingDetailsForm, cardDetailsState, editCardPayload, i, function1, mutableState, state, function12, sectionFieldElement, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardNumberField$lambda$16(String str, CardBrandChoice cardBrandChoice, List list, boolean z, int i, Function1 function1, boolean z2, int i2, Composer composer, int i3) {
        CardNumberField(str, cardBrandChoice, list, z, i, function1, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactInformationSection$lambda$14(List list, int i, Composer composer, int i2) {
        ContactInformationSection(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CvcField$lambda$19(CardBrand cardBrand, Modifier modifier, int i, Composer composer, int i2) {
        CvcField(cardBrand, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CardDetailsEditUI(final EditCardDetailsInteractor editCardDetailsInteractor, Composer composer, final int i) {
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(editCardDetailsInteractor, "editCardDetailsInteractor");
        Composer composerStartRestartGroup = composer.startRestartGroup(-17502265);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(editCardDetailsInteractor) : composerStartRestartGroup.changedInstance(editCardDetailsInteractor) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-17502265, i2, -1, "com.stripe.android.paymentsheet.ui.CardDetailsEditUI (CardDetailsUI.kt:45)");
            }
            State stateCollectAsState = StateFlowsComposeKt.collectAsState(editCardDetailsInteractor.getState(), null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.startReplaceGroup(1248790105);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6115boximpl(Dp.m6117constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BillingDetailsForm billingDetailsForm = CardDetailsEditUI$lambda$0(stateCollectAsState).getBillingDetailsForm();
            StateFlow<Set<IdentifierSpec>> hiddenElements = billingDetailsForm != null ? billingDetailsForm.getHiddenElements() : null;
            composerStartRestartGroup.startReplaceGroup(1248795240);
            State stateCollectAsState2 = hiddenElements != null ? StateFlowsComposeKt.collectAsState(hiddenElements, null, composerStartRestartGroup, 0, 1) : null;
            composerStartRestartGroup.endReplaceGroup();
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
            composerStartRestartGroup.startReplaceGroup(823481765);
            if (!CardDetailsEditUI$lambda$0(stateCollectAsState).getContactSectionElements().isEmpty()) {
                ContactInformationSection(CardDetailsEditUI$lambda$0(stateCollectAsState).getContactSectionElements(), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            EditCardDetailsInteractor.CardDetailsState cardDetailsState = CardDetailsEditUI$lambda$0(stateCollectAsState).getCardDetailsState();
            composerStartRestartGroup.startReplaceGroup(823490796);
            if (cardDetailsState == null) {
                z = true;
            } else {
                BillingDetailsForm billingDetailsForm2 = CardDetailsEditUI$lambda$0(stateCollectAsState).getBillingDetailsForm();
                EditCardPayload payload = CardDetailsEditUI$lambda$0(stateCollectAsState).getPayload();
                int paymentMethodIcon = CardDetailsEditUI$lambda$0(stateCollectAsState).getPaymentMethodIcon();
                composerStartRestartGroup.startReplaceGroup(-345783349);
                int i3 = i2 & 14;
                boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(editCardDetailsInteractor));
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CardDetailsUIKt.CardDetailsEditUI$lambda$10$lambda$6$lambda$3$lambda$2(editCardDetailsInteractor, (CardBrandChoice) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                Function1 function1 = (Function1) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-345774588);
                boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(editCardDetailsInteractor));
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CardDetailsUIKt.CardDetailsEditUI$lambda$10$lambda$6$lambda$5$lambda$4(editCardDetailsInteractor, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                z = true;
                CardDetailsFormUI(billingDetailsForm2, cardDetailsState, payload, paymentMethodIcon, function1, mutableState, stateCollectAsState2, (Function1) objRememberedValue3, CardDetailsEditUI$lambda$0(stateCollectAsState).getNameElementForCardSection(), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE);
            }
            composerStartRestartGroup.endReplaceGroup();
            BillingDetailsForm billingDetailsForm3 = CardDetailsEditUI$lambda$0(stateCollectAsState).getBillingDetailsForm();
            composerStartRestartGroup.startReplaceGroup(823518707);
            if (billingDetailsForm3 != null) {
                composerStartRestartGroup.startReplaceGroup(823519481);
                if (CardDetailsEditUI$lambda$0(stateCollectAsState).getNeedsSpacerBeforeBilling()) {
                    SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(32)), composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-345757202);
                boolean z4 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(editCardDetailsInteractor))) ? z : false;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CardDetailsUIKt.CardDetailsEditUI$lambda$10$lambda$9$lambda$8$lambda$7(editCardDetailsInteractor, (BillingDetailsFormState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                BillingDetailsFormUIKt.BillingDetailsFormUI(billingDetailsForm3, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardDetailsUIKt.CardDetailsEditUI$lambda$11(editCardDetailsInteractor, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsEditUI$lambda$10$lambda$6$lambda$3$lambda$2(EditCardDetailsInteractor editCardDetailsInteractor, CardBrandChoice it) {
        Intrinsics.checkNotNullParameter(it, "it");
        editCardDetailsInteractor.handleViewAction(new EditCardDetailsInteractor.ViewAction.BrandChoiceChanged(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsEditUI$lambda$10$lambda$6$lambda$5$lambda$4(EditCardDetailsInteractor editCardDetailsInteractor, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        editCardDetailsInteractor.handleViewAction(new EditCardDetailsInteractor.ViewAction.DateChanged(it));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CardDetailsEditUI$lambda$10$lambda$9$lambda$8$lambda$7(EditCardDetailsInteractor editCardDetailsInteractor, BillingDetailsFormState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        editCardDetailsInteractor.handleViewAction(new EditCardDetailsInteractor.ViewAction.BillingDetailsChanged(it));
        return Unit.INSTANCE;
    }

    private static final void CardDetailsFormUI(final BillingDetailsForm billingDetailsForm, final EditCardDetailsInteractor.CardDetailsState cardDetailsState, final EditCardPayload editCardPayload, final int i, final Function1<? super CardBrandChoice, Unit> function1, final MutableState<Dp> mutableState, final State<? extends Set<IdentifierSpec>> state, final Function1<? super String, Unit> function12, final SectionFieldElement sectionFieldElement, Composer composer, final int i2) {
        int i3;
        State<? extends Set<IdentifierSpec>> state2;
        Function1<? super String, Unit> function13;
        SectionFieldElement sectionFieldElement2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1429932356);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(billingDetailsForm) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(cardDetailsState) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(editCardPayload) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(mutableState) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            state2 = state;
            i3 |= composerStartRestartGroup.changed(state2) ? 1048576 : 524288;
        } else {
            state2 = state;
        }
        if ((12582912 & i2) == 0) {
            function13 = function12;
            i3 |= composerStartRestartGroup.changedInstance(function13) ? 8388608 : 4194304;
        } else {
            function13 = function12;
        }
        if ((100663296 & i2) == 0) {
            sectionFieldElement2 = sectionFieldElement;
            i3 |= composerStartRestartGroup.changedInstance(sectionFieldElement2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            sectionFieldElement2 = sectionFieldElement;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1429932356, i3, -1, "com.stripe.android.paymentsheet.ui.CardDetailsFormUI (CardDetailsUI.kt:106)");
            }
            ResolvableString resolvableStringResolvableString$default = billingDetailsForm != null ? ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_paymentsheet_add_payment_method_card_information, new Object[0], null, 4, null) : null;
            ResolvableString resolvableStringSectionError = cardDetailsState.getExpiryDateState().sectionError();
            composerStartRestartGroup.startReplaceGroup(120516411);
            String strResolve = resolvableStringSectionError != null ? ResolvableStringComposeUtilsKt.resolve(resolvableStringSectionError, composerStartRestartGroup, 0) : null;
            composerStartRestartGroup.endReplaceGroup();
            SectionUIKt.Section(resolvableStringResolvableString$default, strResolve, TestTagKt.testTag(Modifier.INSTANCE, UpdatePaymentMethodUIKt.UPDATE_PM_CARD_TEST_TAG), false, ComposableLambdaKt.rememberComposableLambda(-567887538, true, new AnonymousClass2(sectionFieldElement2, editCardPayload, cardDetailsState, i, function1, mutableState, state2, function13), composerStartRestartGroup, 54), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardDetailsUIKt.CardDetailsFormUI$lambda$13(billingDetailsForm, cardDetailsState, editCardPayload, i, function1, mutableState, state, function12, sectionFieldElement, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: CardDetailsUI.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$CardDetailsFormUI$2, reason: invalid class name */
    static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ EditCardDetailsInteractor.CardDetailsState $cardDetailsState;
        final /* synthetic */ MutableState<Dp> $dividerHeight;
        final /* synthetic */ State<Set<IdentifierSpec>> $hiddenBillingDetailsFields;
        final /* synthetic */ SectionFieldElement $nameElementForCardSection;
        final /* synthetic */ Function1<CardBrandChoice, Unit> $onBrandChoiceChanged;
        final /* synthetic */ Function1<String, Unit> $onExpDateChanged;
        final /* synthetic */ EditCardPayload $payload;
        final /* synthetic */ int $paymentMethodIcon;

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(SectionFieldElement sectionFieldElement, EditCardPayload editCardPayload, EditCardDetailsInteractor.CardDetailsState cardDetailsState, int i, Function1<? super CardBrandChoice, Unit> function1, MutableState<Dp> mutableState, State<? extends Set<IdentifierSpec>> state, Function1<? super String, Unit> function12) {
            this.$nameElementForCardSection = sectionFieldElement;
            this.$payload = editCardPayload;
            this.$cardDetailsState = cardDetailsState;
            this.$paymentMethodIcon = i;
            this.$onBrandChoiceChanged = function1;
            this.$dividerHeight = mutableState;
            this.$hiddenBillingDetailsFields = state;
            this.$onExpDateChanged = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            String str;
            String str2;
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-567887538, i, -1, "com.stripe.android.paymentsheet.ui.CardDetailsFormUI.<anonymous> (CardDetailsUI.kt:114)");
                }
                SectionFieldElement sectionFieldElement = this.$nameElementForCardSection;
                EditCardPayload editCardPayload = this.$payload;
                EditCardDetailsInteractor.CardDetailsState cardDetailsState = this.$cardDetailsState;
                int i2 = this.$paymentMethodIcon;
                Function1<CardBrandChoice, Unit> function1 = this.$onBrandChoiceChanged;
                final MutableState<Dp> mutableState = this.$dividerHeight;
                State<Set<IdentifierSpec>> state = this.$hiddenBillingDetailsFields;
                Function1<String, Unit> function12 = this.$onExpDateChanged;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                composer.startReplaceGroup(1048070604);
                if (sectionFieldElement == null) {
                    str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                } else {
                    str = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                    str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                    SectionElementUIKt.SectionElementUI(true, SectionElement.Companion.wrap$default(SectionElement.INSTANCE, sectionFieldElement, (ResolvableString) null, 2, (Object) null), SetsKt.emptySet(), null, null, composer, (SectionElement.$stable << 3) | 3462, 16);
                    DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer, 0, 9);
                }
                composer.endReplaceGroup();
                CardDetailsUIKt.CardNumberField(editCardPayload.getLast4(), cardDetailsState.getSelectedCardBrand(), cardDetailsState.getAvailableNetworks(), cardDetailsState.getShouldShowCardBrandDropdown(), i2, function1, sectionFieldElement == null, composer, 0);
                DividerKt.m1877DivideroMI9zvI(null, StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getBorderStrokeWidth()), 0.0f, composer, 0, 9);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str2);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str);
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM3150constructorimpl2 = Updater.m3150constructorimpl(composer);
                Updater.m3157setimpl(composerM3150constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3157setimpl(composerM3150constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3150constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3150constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3150constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3150constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3157setimpl(composerM3150constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance, TestTagKt.testTag(Modifier.INSTANCE, UpdatePaymentMethodUIKt.UPDATE_PM_EXPIRY_FIELD_TEST_TAG), 1.0f, false, 2, null);
                composer.startReplaceGroup(-258271014);
                boolean zChanged = composer.changed(mutableState);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$CardDetailsFormUI$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CardDetailsUIKt.AnonymousClass2.invoke$lambda$4$lambda$3$lambda$2$lambda$1(mutableState, (IntSize) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Modifier modifierOnSizeChanged = OnRemeasuredModifierKt.onSizeChanged(modifierWeight$default, (Function1) objRememberedValue);
                ExpiryDateState expiryDateState = cardDetailsState.getExpiryDateState();
                Set<IdentifierSpec> value = state != null ? state.getValue() : null;
                composer.startReplaceGroup(-258261405);
                Boolean boolValueOf = value == null ? null : Boolean.valueOf(CardDetailsUIKt.hasFocusableFields(value, composer, 0));
                composer.endReplaceGroup();
                ExpiryTextFieldKt.ExpiryTextField(modifierOnSizeChanged, expiryDateState, Intrinsics.areEqual((Object) boolValueOf, (Object) true), function12, null, composer, 0, 16);
                DividerKt.m1877DivideroMI9zvI(SizeKt.m1070width3ABfNKs(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, mutableState.getValue().m6131unboximpl()), Dp.m6117constructorimpl(StripeThemeKt.getStripeShapes(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).getBorderStrokeWidth())), StripeThemeKt.getStripeColors(MaterialTheme.INSTANCE, composer, MaterialTheme.$stable).m8727getComponentDivider0d7_KjU(), 0.0f, 0.0f, composer, 0, 12);
                CardDetailsUIKt.CvcField(editCardPayload.getBrand(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
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
        public static final Unit invoke$lambda$4$lambda$3$lambda$2$lambda$1(MutableState mutableState, IntSize intSize) {
            mutableState.setValue(Dp.m6115boximpl(Dp.m6117constructorimpl(IntSize.m6286getHeightimpl(intSize.getPackedValue()) / Resources.getSystem().getDisplayMetrics().density)));
            return Unit.INSTANCE;
        }
    }

    private static final void ContactInformationSection(final List<? extends SectionFieldElement> list, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-77061721);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-77061721, i2, -1, "com.stripe.android.paymentsheet.ui.ContactInformationSection (CardDetailsUI.kt:168)");
            }
            if (!list.isEmpty()) {
                SectionElementUIKt.SectionElementUI(true, SectionElement.INSTANCE.wrap(list, ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_contact_information, new Object[0], null, 4, null)), SetsKt.emptySet(), null, null, composerStartRestartGroup, (SectionElement.$stable << 3) | 3462, 16);
                SpacerKt.Spacer(SizeKt.m1051height3ABfNKs(Modifier.INSTANCE, Dp.m6117constructorimpl(32)), composerStartRestartGroup, 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardDetailsUIKt.ContactInformationSection$lambda$14(list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean hasFocusableFields(Set<IdentifierSpec> set, Composer composer, int i) {
        composer.startReplaceGroup(575533117);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(575533117, i, -1, "com.stripe.android.paymentsheet.ui.hasFocusableFields (CardDetailsUI.kt:187)");
        }
        List listListOf = CollectionsKt.listOf(IdentifierSpec.INSTANCE.getPostalCode());
        boolean z = true;
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (set.contains((IdentifierSpec) it.next())) {
                    z = false;
                    break;
                }
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CardNumberField(final String str, final CardBrandChoice cardBrandChoice, final List<CardBrandChoice> list, final boolean z, final int i, final Function1<? super CardBrandChoice, Unit> function1, final boolean z2, Composer composer, final int i2) {
        int i3;
        CornerBasedShape cornerBasedShapeCopy;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(107289708);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(cardBrandChoice) ? 32 : 16;
        }
        if ((i2 & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
        }
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(107289708, i3, -1, "com.stripe.android.paymentsheet.ui.CardNumberField (CardDetailsUI.kt:200)");
            }
            String str2 = "•••• •••• •••• " + (str == null ? "••••" : str);
            String strStringResource = StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_acc_label_card_number, composerStartRestartGroup, 0);
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-48270278);
                cornerBasedShapeCopy = CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall(), null, null, CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), 3, null);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-48103994);
                cornerBasedShapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall().copy(CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize());
                composerStartRestartGroup.endReplaceGroup();
            }
            composer2 = composerStartRestartGroup;
            CommonTextFieldKt.CommonTextField(str2, strStringResource, null, null, ComposableLambdaKt.rememberComposableLambda(-1508681761, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt.CardNumberField.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1508681761, i4, -1, "com.stripe.android.paymentsheet.ui.CardNumberField.<anonymous> (CardDetailsUI.kt:218)");
                        }
                        if (z) {
                            composer3.startReplaceGroup(560235913);
                            CardBrandDropdownKt.CardBrandDropdown(cardBrandChoice, list, function1, composer3, 0);
                            composer3.endReplaceGroup();
                        } else {
                            composer3.startReplaceGroup(560481681);
                            PaymentMethodIconKt.PaymentMethodIconFromResource(i, null, Alignment.INSTANCE.getCenter(), Modifier.INSTANCE, composer3, 3504);
                            composer3.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), false, false, null, null, null, cornerBasedShapeCopy, null, composer2, 24576, 0, 3052);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardDetailsUIKt.CardNumberField$lambda$16(str, cardBrandChoice, list, z, i, function1, z2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CvcField(final CardBrand cardBrand, final Modifier modifier, Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1148052424);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changed(cardBrand) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1148052424, i2, -1, "com.stripe.android.paymentsheet.ui.CvcField (CardDetailsUI.kt:237)");
            }
            StringBuilder sb = new StringBuilder();
            int maxCvcLength = cardBrand.getMaxCvcLength();
            for (int i3 = 0; i3 < maxCvcLength; i3++) {
                sb.append("•");
            }
            composer2 = composerStartRestartGroup;
            CommonTextFieldKt.CommonTextField(sb.toString(), StringResources_androidKt.stringResource(com.stripe.android.R.string.stripe_cvc_number_hint, composerStartRestartGroup, 0), TestTagKt.testTag(modifier, UpdatePaymentMethodUIKt.UPDATE_PM_CVC_FIELD_TEST_TAG), null, ComposableLambdaKt.rememberComposableLambda(296509563, true, new Function2<Composer, Integer, Unit>() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt.CvcField.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(296509563, i4, -1, "com.stripe.android.paymentsheet.ui.CvcField.<anonymous> (CardDetailsUI.kt:253)");
                        }
                        ImageKt.Image(PainterResources_androidKt.painterResource(cardBrand.getCvcIcon(), composer3, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 124);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), false, false, null, null, null, CornerBasedShape.copy$default(MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getSmall(), CornerSizeKt.getZeroCornerSize(), CornerSizeKt.getZeroCornerSize(), null, CornerSizeKt.getZeroCornerSize(), 4, null), null, composer2, 24576, 0, 3048);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.CardDetailsUIKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CardDetailsUIKt.CvcField$lambda$19(cardBrand, modifier, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final EditCardDetailsInteractor.State CardDetailsEditUI$lambda$0(State<EditCardDetailsInteractor.State> state) {
        return state.getValue();
    }
}
