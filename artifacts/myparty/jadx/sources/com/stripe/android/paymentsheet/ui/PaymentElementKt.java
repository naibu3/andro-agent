package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.facebook.imagepipeline.memory.BitmapCounterConfig;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.lpmfoundations.luxe.SupportedPaymentMethod;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.model.PaymentMethodIncentive;
import com.stripe.android.paymentsheet.paymentdatacollection.FormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormKt;
import com.stripe.android.uicore.StripeTheme;
import com.stripe.android.uicore.StripeThemeKt;
import com.stripe.android.uicore.elements.FormElement;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: PaymentElement.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\u0010\u0007\u001a\u00060\bj\u0002`\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0001¢\u0006\u0002\u0010\u001a\u001ak\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\bj\u0002`\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0001¢\u0006\u0002\u0010\u001f\"\u0010\u0010 \u001a\u00020\b8\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006!²\u0006\n\u0010\"\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"PaymentElement", "", ViewProps.ENABLED, "", "supportedPaymentMethods", "", "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;", "selectedItemCode", "", "Lcom/stripe/android/model/PaymentMethodCode;", "incentive", "Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;", "formElements", "Lcom/stripe/android/uicore/elements/FormElement;", "onItemSelectedListener", "Lkotlin/Function1;", "formArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;", "usBankAccountFormArguments", "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;", "onFormFieldValuesChanged", "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;", "modifier", "Landroidx/compose/ui/Modifier;", "onInteractionEvent", "Lkotlin/Function0;", "(ZLjava/util/List;Ljava/lang/String;Lcom/stripe/android/paymentsheet/model/PaymentMethodIncentive;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "FormElement", "selectedPaymentMethodCode", "horizontalPaddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZLjava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FORM_ELEMENT_TEST_TAG", "paymentsheet_release", "previouslyCompletedUSBankAccountForm"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PaymentElementKt {
    public static final String FORM_ELEMENT_TEST_TAG = "FORM_ELEMENT_UI";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormElement$lambda$20(boolean z, String str, List list, FormArguments formArguments, USBankAccountFormArguments uSBankAccountFormArguments, PaddingValues paddingValues, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        FormElement(z, str, list, formArguments, uSBankAccountFormArguments, paddingValues, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentElement$lambda$7(boolean z, List list, String str, PaymentMethodIncentive paymentMethodIncentive, List list2, Function1 function1, FormArguments formArguments, USBankAccountFormArguments uSBankAccountFormArguments, Function1 function12, Modifier modifier, Function0 function0, int i, int i2, int i3, Composer composer, int i4) {
        PaymentElement(z, list, str, paymentMethodIncentive, list2, function1, formArguments, uSBankAccountFormArguments, function12, modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void PaymentElement(final boolean z, final List<SupportedPaymentMethod> supportedPaymentMethods, final String selectedItemCode, final PaymentMethodIncentive paymentMethodIncentive, final List<? extends FormElement> formElements, final Function1<? super SupportedPaymentMethod, Unit> onItemSelectedListener, final FormArguments formArguments, final USBankAccountFormArguments usBankAccountFormArguments, final Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2, final int i3) {
        boolean z2;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function0<Unit> function02;
        int i7;
        Modifier modifier3;
        int i8;
        final Function0<Unit> function03;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(supportedPaymentMethods, "supportedPaymentMethods");
        Intrinsics.checkNotNullParameter(selectedItemCode, "selectedItemCode");
        Intrinsics.checkNotNullParameter(formElements, "formElements");
        Intrinsics.checkNotNullParameter(onItemSelectedListener, "onItemSelectedListener");
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(usBankAccountFormArguments, "usBankAccountFormArguments");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Composer composerStartRestartGroup = composer.startRestartGroup(-948981);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(supportedPaymentMethods) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT;
        } else if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i4 |= composerStartRestartGroup.changed(selectedItemCode) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(paymentMethodIncentive) : composerStartRestartGroup.changedInstance(paymentMethodIncentive) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(formElements) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onItemSelectedListener) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(formArguments) ? 1048576 : 524288;
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(usBankAccountFormArguments) ? 8388608 : 4194304;
        }
        if ((i3 & 256) != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onFormFieldValuesChanged) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i & 805306368) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        int i10 = i3 & 1024;
        if (i10 != 0) {
            i5 = i9;
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = i9;
            i6 = i2 | (composerStartRestartGroup.changedInstance(function0) ? 4 : 2);
        } else {
            i5 = i9;
            i6 = i2;
        }
        if ((i4 & 306783379) != 306783378 || (i6 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(-779272080);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function02 = (Function0) objRememberedValue;
            } else {
                function02 = function0;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-948981, i4, i6, "com.stripe.android.paymentsheet.ui.PaymentElement (PaymentElement.kt:50)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            composerStartRestartGroup.startReplaceGroup(-779269804);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                objRememberedValue2 = new StripeImageLoader(applicationContext, null, null, null, null, 30, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            StripeImageLoader stripeImageLoader = (StripeImageLoader) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            PaddingValues outerFormInsets = StripeThemeKt.getOuterFormInsets(StripeTheme.INSTANCE);
            composerStartRestartGroup.startReplaceGroup(-779264685);
            boolean zChanged = ((i4 & 896) == 256) | composerStartRestartGroup.changed(supportedPaymentMethods);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                List<SupportedPaymentMethod> list = supportedPaymentMethods;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SupportedPaymentMethod) it.next()).getCode());
                }
                objRememberedValue3 = Integer.valueOf(arrayList.indexOf(selectedItemCode));
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            int iIntValue = ((Number) objRememberedValue3).intValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-779259691);
            boolean zChanged2 = composerStartRestartGroup.changed(iIntValue) | composerStartRestartGroup.changed(supportedPaymentMethods);
            SupportedPaymentMethod supportedPaymentMethodRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || supportedPaymentMethodRememberedValue == Composer.INSTANCE.getEmpty()) {
                supportedPaymentMethodRememberedValue = supportedPaymentMethods.get(iIntValue);
                composerStartRestartGroup.updateRememberedValue(supportedPaymentMethodRememberedValue);
            }
            SupportedPaymentMethod supportedPaymentMethod = (SupportedPaymentMethod) supportedPaymentMethodRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier modifier5 = companion;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
            composerStartRestartGroup.startReplaceGroup(1771959155);
            if (supportedPaymentMethods.size() > 1) {
                int i11 = i4 >> 3;
                i7 = i4;
                modifier3 = modifier5;
                i8 = i6;
                NewPaymentMethodTabLayoutUIKt.NewPaymentMethodTabLayoutUI(supportedPaymentMethods, iIntValue, z2, paymentMethodIncentive, onItemSelectedListener, stripeImageLoader, PaddingKt.m1024paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6117constructorimpl(12), 7, null), null, composerStartRestartGroup, (i11 & 57344) | (i11 & 14) | 1572864 | ((i4 << 6) & 896) | (i4 & 7168) | (StripeImageLoader.$stable << 15), 128);
            } else {
                i7 = i4;
                modifier3 = modifier5;
                i8 = i6;
            }
            composerStartRestartGroup.endReplaceGroup();
            int i12 = i7 >> 6;
            int i13 = i7 >> 9;
            Function0<Unit> function04 = function02;
            FormElement(z, supportedPaymentMethod.getCode(), formElements, formArguments, usBankAccountFormArguments, outerFormInsets, onFormFieldValuesChanged, function04, composerStartRestartGroup, (i7 & 14) | (i12 & 896) | (i13 & 7168) | (i13 & 57344) | (i12 & 3670016) | ((i8 << 21) & 29360128));
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function03 = function04;
            modifier4 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function0;
            modifier4 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentElementKt.PaymentElement$lambda$7(z, supportedPaymentMethods, selectedItemCode, paymentMethodIncentive, formElements, onItemSelectedListener, formArguments, usBankAccountFormArguments, onFormFieldValuesChanged, modifier4, function03, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void FormElement(final boolean z, final String selectedPaymentMethodCode, final List<? extends FormElement> formElements, final FormArguments formArguments, final USBankAccountFormArguments usBankAccountFormArguments, final PaddingValues horizontalPaddingValues, final Function1<? super FormFieldValues, Unit> onFormFieldValuesChanged, final Function0<Unit> onInteractionEvent, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(selectedPaymentMethodCode, "selectedPaymentMethodCode");
        Intrinsics.checkNotNullParameter(formElements, "formElements");
        Intrinsics.checkNotNullParameter(formArguments, "formArguments");
        Intrinsics.checkNotNullParameter(usBankAccountFormArguments, "usBankAccountFormArguments");
        Intrinsics.checkNotNullParameter(horizontalPaddingValues, "horizontalPaddingValues");
        Intrinsics.checkNotNullParameter(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        Intrinsics.checkNotNullParameter(onInteractionEvent, "onInteractionEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(768610840);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(selectedPaymentMethodCode) ? 32 : 16;
        }
        if ((i & BitmapCounterConfig.DEFAULT_MAX_BITMAP_COUNT) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(formElements) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(formArguments) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(usBankAccountFormArguments) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(horizontalPaddingValues) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onFormFieldValuesChanged) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onInteractionEvent) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(768610840, i2, -1, "com.stripe.android.paymentsheet.ui.FormElement (PaymentElement.kt:101)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1853088352);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentElementKt.FormElement$lambda$9$lambda$8();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Object objM3243rememberSaveable = RememberSaveableKt.m3243rememberSaveable(objArr, (Saver<Object, ? extends Object>) null, (String) null, (Function0<? extends Object>) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Intrinsics.checkNotNullExpressionValue(objM3243rememberSaveable, "rememberSaveable(...)");
            String str = (String) objM3243rememberSaveable;
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(-1853076231);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PaymentElementKt.FormElement$lambda$11$lambda$10();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Modifier modifierTestTag = TestTagKt.testTag(Modifier.INSTANCE, FORM_ELEMENT_TEST_TAG);
            composerStartRestartGroup.startReplaceGroup(-1853071033);
            int i3 = 29360128 & i2;
            boolean z2 = i3 == 8388608;
            PaymentElementKt$FormElement$1$1 paymentElementKt$FormElement$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || paymentElementKt$FormElement$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                paymentElementKt$FormElement$1$1RememberedValue = new PaymentElementKt$FormElement$1$1(onInteractionEvent, null);
                composerStartRestartGroup.updateRememberedValue(paymentElementKt$FormElement$1$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(modifierTestTag, "AddPaymentMethod", (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) paymentElementKt$FormElement$1$1RememberedValue);
            composerStartRestartGroup.startReplaceGroup(-1853060839);
            boolean z3 = i3 == 8388608;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PaymentElementKt.FormElement$lambda$16$lambda$15(onInteractionEvent, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifierKt.onFocusChanged(modifierPointerInput, (Function1) objRememberedValue3);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierOnFocusChanged);
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
            if (Intrinsics.areEqual(selectedPaymentMethodCode, PaymentMethod.Type.USBankAccount.code) || Intrinsics.areEqual(selectedPaymentMethodCode, PaymentMethod.Type.Link.code)) {
                composerStartRestartGroup.startReplaceGroup(-754200154);
                composerStartRestartGroup.startReplaceGroup(1361149518);
                boolean zChanged = composerStartRestartGroup.changed(mutableState) | composerStartRestartGroup.changedInstance(usBankAccountFormArguments);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PaymentElementKt.FormElement$lambda$19$lambda$18$lambda$17(usBankAccountFormArguments, mutableState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                USBankAccountFormKt.USBankAccountForm(formArguments, usBankAccountFormArguments, (Function0) objRememberedValue4, PaddingKt.padding(Modifier.INSTANCE, horizontalPaddingValues), z, composerStartRestartGroup, ((i2 >> 9) & WebSocketProtocol.PAYLOAD_SHORT) | (57344 & (i2 << 12)), 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-753663730);
                int i4 = i2 << 6;
                PaymentMethodFormKt.PaymentMethodForm(str, formArguments, z, onFormFieldValuesChanged, formElements, PaddingKt.padding(Modifier.INSTANCE, horizontalPaddingValues), composerStartRestartGroup, ((i2 >> 6) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i4 & 896) | ((i2 >> 9) & 7168) | (57344 & i4), 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
            }
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.stripe.android.paymentsheet.ui.PaymentElementKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PaymentElementKt.FormElement$lambda$20(z, selectedPaymentMethodCode, formElements, formArguments, usBankAccountFormArguments, horizontalPaddingValues, onFormFieldValuesChanged, onInteractionEvent, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FormElement$lambda$9$lambda$8() {
        return UUID.randomUUID().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState FormElement$lambda$11$lambda$10() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean FormElement$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FormElement$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormElement$lambda$16$lambda$15(Function0 function0, FocusState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.getHasFocus()) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FormElement$lambda$19$lambda$18$lambda$17(USBankAccountFormArguments uSBankAccountFormArguments, MutableState mutableState) {
        if (!FormElement$lambda$12(mutableState)) {
            uSBankAccountFormArguments.getOnFormCompleted().invoke();
        }
        FormElement$lambda$13(mutableState, true);
        return Unit.INSTANCE;
    }
}
