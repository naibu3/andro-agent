package com.stripe.android.ui.core.elements;

import androidx.exifinterface.media.ExifInterface;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.SectionMultiFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import expo.modules.notifications.service.NotificationsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: CardDetailsElement.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001e\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030$0#H\u0016J \u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0&0$0#H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsElement;", "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;", NotificationsService.IDENTIFIER_KEY, "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", NamedConstantsKt.INITIAL_VALUES, "", "", "collectName", "", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "controller", "Lcom/stripe/android/ui/core/elements/CardDetailsController;", "<init>", "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lcom/stripe/android/CardBrandFilter;Lcom/stripe/android/ui/core/elements/CardDetailsController;)V", "getController", "()Lcom/stripe/android/ui/core/elements/CardDetailsController;", "isCardScanEnabled", "()Z", "allowsUserInteraction", "getAllowsUserInteraction", "mandateText", "Lcom/stripe/android/core/strings/ResolvableString;", "getMandateText", "()Lcom/stripe/android/core/strings/ResolvableString;", "sectionFieldErrorController", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "setRawValue", "", "rawValuesMap", "getTextFieldIdentifiers", "Lkotlinx/coroutines/flow/StateFlow;", "", "getFormFieldValueFlow", "Lkotlin/Pair;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsElement extends SectionMultiFieldElement {
    public static final int $stable = 8;
    private final boolean allowsUserInteraction;
    private final CardBrandFilter cardBrandFilter;
    private final CardBrandChoiceEligibility cbcEligibility;
    private final CardDetailsController controller;
    private final boolean isCardScanEnabled;
    private final ResolvableString mandateText;

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public void setRawValue(Map<IdentifierSpec, String> rawValuesMap) {
        Intrinsics.checkNotNullParameter(rawValuesMap, "rawValuesMap");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ CardDetailsElement(com.stripe.android.uicore.elements.IdentifierSpec r11, com.stripe.android.cards.CardAccountRangeRepository.Factory r12, java.util.Map r13, boolean r14, com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility r15, com.stripe.android.CardBrandFilter r16, com.stripe.android.ui.core.elements.CardDetailsController r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 8
            if (r0 == 0) goto L5
            r14 = 0
        L5:
            r3 = r14
            r14 = r18 & 16
            if (r14 == 0) goto L10
            com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility$Ineligible r14 = com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility.Ineligible.INSTANCE
            com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility r14 = (com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility) r14
            r4 = r14
            goto L11
        L10:
            r4 = r15
        L11:
            r14 = r18 & 32
            if (r14 == 0) goto L1b
            com.stripe.android.DefaultCardBrandFilter r14 = com.stripe.android.DefaultCardBrandFilter.INSTANCE
            com.stripe.android.CardBrandFilter r14 = (com.stripe.android.CardBrandFilter) r14
            r6 = r14
            goto L1d
        L1b:
            r6 = r16
        L1d:
            r14 = r18 & 64
            if (r14 == 0) goto L36
            com.stripe.android.ui.core.elements.CardDetailsController r0 = new com.stripe.android.ui.core.elements.CardDetailsController
            r8 = 48
            r9 = 0
            r5 = 0
            r7 = r6
            r6 = 0
            r1 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r7
            r7 = r0
            r1 = r11
            r2 = r12
            r5 = r4
            r4 = r3
            r0 = r10
            goto L3d
        L36:
            r7 = r17
            r0 = r10
            r1 = r11
            r2 = r12
            r5 = r4
            r4 = r3
        L3d:
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.ui.core.elements.CardDetailsElement.<init>(com.stripe.android.uicore.elements.IdentifierSpec, com.stripe.android.cards.CardAccountRangeRepository$Factory, java.util.Map, boolean, com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility, com.stripe.android.CardBrandFilter, com.stripe.android.ui.core.elements.CardDetailsController, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final CardDetailsController getController() {
        return this.controller;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsElement(IdentifierSpec identifier, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z, CardBrandChoiceEligibility cbcEligibility, CardBrandFilter cardBrandFilter, CardDetailsController controller) {
        super(identifier);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.cbcEligibility = cbcEligibility;
        this.cardBrandFilter = cardBrandFilter;
        this.controller = controller;
        this.isCardScanEnabled = controller.getNumberElement().getController().getCardScanEnabled();
        this.allowsUserInteraction = true;
    }

    /* renamed from: isCardScanEnabled, reason: from getter */
    public final boolean getIsCardScanEnabled() {
        return this.isCardScanEnabled;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public boolean getAllowsUserInteraction() {
        return this.allowsUserInteraction;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public ResolvableString getMandateText() {
        return this.mandateText;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public SectionFieldErrorController sectionFieldErrorController() {
        return this.controller;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<IdentifierSpec>> getTextFieldIdentifiers() {
        IdentifierSpec[] identifierSpecArr = new IdentifierSpec[6];
        SimpleTextElement nameElement = this.controller.getNameElement();
        identifierSpecArr[0] = nameElement != null ? nameElement.getIdentifier() : null;
        identifierSpecArr[1] = this.controller.getNumberElement().getIdentifier();
        identifierSpecArr[2] = this.controller.getExpirationDateElement().getIdentifier();
        identifierSpecArr[3] = this.controller.getCvcElement().getIdentifier();
        identifierSpecArr[4] = IdentifierSpec.INSTANCE.getCardBrand();
        identifierSpecArr[5] = this.cbcEligibility instanceof CardBrandChoiceEligibility.Eligible ? IdentifierSpec.INSTANCE.getPreferredCardBrand() : null;
        return StateFlowsKt.stateFlowOf(CollectionsKt.listOfNotNull((Object[]) identifierSpecArr));
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldElement
    public StateFlow<List<Pair<IdentifierSpec, FormFieldEntry>>> getFormFieldValueFlow() {
        Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowStateFlowOf;
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        if (this.controller.getNameElement() != null) {
            listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getNameElement().getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$1(this.f$0, (FormFieldEntry) obj);
                }
            }));
        }
        listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getNumberElement().getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$2(this.f$0, (FormFieldEntry) obj);
            }
        }));
        listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getCvcElement().getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$3(this.f$0, (FormFieldEntry) obj);
            }
        }));
        listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getNumberElement().getController().getCardBrandFlow(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$4((CardBrand) obj);
            }
        }));
        if (this.cbcEligibility instanceof CardBrandChoiceEligibility.Eligible) {
            listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getNumberElement().getController().getSelectedCardBrandFlow(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$6((CardBrand) obj);
                }
            }));
        }
        listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getExpirationDateElement().getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$7((FormFieldEntry) obj);
            }
        }));
        listCreateListBuilder.add(StateFlowsKt.mapAsStateFlow(this.controller.getExpirationDateElement().getController().getFormFieldValue(), new Function1() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardDetailsElement.getFormFieldValueFlow$lambda$9$lambda$8((FormFieldEntry) obj);
            }
        }));
        final List listBuild = CollectionsKt.build(listCreateListBuilder);
        if (listBuild.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf(CollectionsKt.toList(CollectionsKt.emptyList()));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(listBuild).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[]>() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[] invoke() {
                            return new Pair[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3", f = "CardDetailsElement.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>> flowCollector, Pair<? extends IdentifierSpec, ? extends FormFieldEntry>[] pairArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = pairArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            List list = CollectionsKt.toList(ArraysKt.toList((Object[]) this.L$1));
                            this.label = 1;
                            if (flowCollector.emit(list, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }
        return new FlowToStateFlow(flowStateFlowOf, new Function0<List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>>>() { // from class: com.stripe.android.ui.core.elements.CardDetailsElement$getFormFieldValueFlow$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Pair<? extends IdentifierSpec, ? extends FormFieldEntry>> invoke() {
                List list = listBuild;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((StateFlow) it.next()).getValue());
                }
                return CollectionsKt.toList(arrayList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$1(CardDetailsElement cardDetailsElement, FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(cardDetailsElement.controller.getNameElement().getIdentifier(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$2(CardDetailsElement cardDetailsElement, FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(cardDetailsElement.controller.getNumberElement().getIdentifier(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$3(CardDetailsElement cardDetailsElement, FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(cardDetailsElement.controller.getCvcElement().getIdentifier(), it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$4(CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(IdentifierSpec.INSTANCE.getCardBrand(), new FormFieldEntry(it.getCode(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$6(CardBrand brand) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        IdentifierSpec preferredCardBrand = IdentifierSpec.INSTANCE.getPreferredCardBrand();
        String code = brand.getCode();
        if (brand == CardBrand.Unknown) {
            code = null;
        }
        return TuplesKt.to(preferredCardBrand, new FormFieldEntry(code, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$7(FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(IdentifierSpec.INSTANCE.getCardExpMonth(), CardDetailsUtil.INSTANCE.getExpiryMonthFormFieldEntry$payments_ui_core_release(it));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair getFormFieldValueFlow$lambda$9$lambda$8(FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return TuplesKt.to(IdentifierSpec.INSTANCE.getCardExpYear(), CardDetailsUtil.INSTANCE.getExpiryYearFormFieldEntry$payments_ui_core_release(it));
    }
}
