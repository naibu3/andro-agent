package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.GraphRequest;
import com.facebook.react.uimanager.ViewProps;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.cbc.CardBrandChoiceEligibility;
import com.stripe.android.ui.core.elements.CardBrandChoiceConfig;
import com.stripe.android.uicore.elements.DateConfig;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.InputController;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionFieldComposable;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionFieldErrorController;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: CardDetailsController.kt */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BW\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J=\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070:2\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0002\u0010<R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020+0(¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001c\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001000/X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102¨\u0006="}, d2 = {"Lcom/stripe/android/ui/core/elements/CardDetailsController;", "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;", "Lcom/stripe/android/uicore/elements/SectionFieldComposable;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", NamedConstantsKt.INITIAL_VALUES, "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "", "collectName", "", "cbcEligibility", "Lcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Ljava/util/Map;ZLcom/stripe/android/ui/core/cbc/CardBrandChoiceEligibility;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/CardBrandFilter;)V", "nameElement", "Lcom/stripe/android/uicore/elements/SimpleTextElement;", "getNameElement", "()Lcom/stripe/android/uicore/elements/SimpleTextElement;", "label", "", "getLabel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "numberElement", "Lcom/stripe/android/ui/core/elements/CardNumberElement;", "getNumberElement", "()Lcom/stripe/android/ui/core/elements/CardNumberElement;", "cvcElement", "Lcom/stripe/android/ui/core/elements/CvcElement;", "getCvcElement", "()Lcom/stripe/android/ui/core/elements/CvcElement;", "expirationDateElement", "getExpirationDateElement", "rowFields", "", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", GraphRequest.FIELDS_PARAM, "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "getFields", "()Ljava/util/List;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "ComposeUI", "", ViewProps.ENABLED, "field", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardDetailsController implements SectionFieldErrorController, SectionFieldComposable {
    public static final int $stable = 8;
    private final CvcElement cvcElement;
    private final StateFlow<FieldError> error;
    private final SimpleTextElement expirationDateElement;
    private final List<SectionFieldElement> fields;
    private final Integer label;
    private final SimpleTextElement nameElement;
    private final CardNumberElement numberElement;
    private final List<SectionSingleFieldElement> rowFields;

    public CardDetailsController(CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, Map<IdentifierSpec, String> initialValues, boolean z, CardBrandChoiceEligibility cbcEligibility, CoroutineContext uiContext, CoroutineContext workContext, CardBrandFilter cardBrandFilter) {
        CardBrandChoiceConfig.Ineligible eligible;
        Flow<FieldError> flowStateFlowOf;
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(initialValues, "initialValues");
        Intrinsics.checkNotNullParameter(cbcEligibility, "cbcEligibility");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        SimpleTextElement simpleTextElement = z ? new SimpleTextElement(IdentifierSpec.INSTANCE.getName(), new SimpleTextFieldController(new SimpleTextFieldConfig(ResolvableStringUtilsKt.resolvableString$default(R.string.stripe_name_on_card, new Object[0], null, 4, null), KeyboardCapitalization.INSTANCE.m5816getWordsIUNYP9k(), androidx.compose.ui.text.input.KeyboardType.INSTANCE.m5841getTextPjHm6EE(), null, 8, null), false, initialValues.get(IdentifierSpec.INSTANCE.getName()), null, 10, null)) : null;
        this.nameElement = simpleTextElement;
        IdentifierSpec cardNumber = IdentifierSpec.INSTANCE.getCardNumber();
        CardNumberConfig cardNumberConfig = new CardNumberConfig(!Intrinsics.areEqual(cbcEligibility, CardBrandChoiceEligibility.Ineligible.INSTANCE), cardBrandFilter);
        CardAccountRangeRepository cardAccountRangeRepositoryCreate = cardAccountRangeRepositoryFactory.create();
        String str = initialValues.get(IdentifierSpec.INSTANCE.getCardNumber());
        if (cbcEligibility instanceof CardBrandChoiceEligibility.Eligible) {
            List<CardBrand> preferredNetworks = ((CardBrandChoiceEligibility.Eligible) cbcEligibility).getPreferredNetworks();
            String str2 = initialValues.get(IdentifierSpec.INSTANCE.getPreferredCardBrand());
            eligible = new CardBrandChoiceConfig.Eligible(preferredNetworks, str2 != null ? CardBrand.INSTANCE.fromCode(str2) : null);
        } else {
            if (!(cbcEligibility instanceof CardBrandChoiceEligibility.Ineligible)) {
                throw new NoWhenBranchMatchedException();
            }
            eligible = CardBrandChoiceConfig.Ineligible.INSTANCE;
        }
        SimpleTextElement simpleTextElement2 = simpleTextElement;
        CardNumberElement cardNumberElement = new CardNumberElement(cardNumber, new DefaultCardNumberController(cardNumberConfig, cardAccountRangeRepositoryCreate, uiContext, workContext, null, str, false, eligible, cardBrandFilter, 80, null));
        this.numberElement = cardNumberElement;
        CvcElement cvcElement = new CvcElement(IdentifierSpec.INSTANCE.getCardCvc(), new CvcController(new CvcConfig(), cardNumberElement.getController().getCardBrandFlow(), initialValues.get(IdentifierSpec.INSTANCE.getCardCvc()), false, 8, null));
        this.cvcElement = cvcElement;
        IdentifierSpec identifierSpecGeneric = IdentifierSpec.INSTANCE.Generic("date");
        DateConfig dateConfig = new DateConfig();
        String str3 = initialValues.get(IdentifierSpec.INSTANCE.getCardExpMonth());
        String str4 = initialValues.get(IdentifierSpec.INSTANCE.getCardExpYear());
        SimpleTextElement simpleTextElement3 = new SimpleTextElement(identifierSpecGeneric, new SimpleTextFieldController(dateConfig, false, ((Object) str3) + (str4 != null ? StringsKt.takeLast(str4, 2) : null), CardDetailsController$expirationDateElement$1.INSTANCE, 2, null));
        this.expirationDateElement = simpleTextElement3;
        List<SectionSingleFieldElement> listListOf = CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{simpleTextElement3, cvcElement});
        this.rowFields = listListOf;
        this.fields = CollectionsKt.listOfNotNull((Object[]) new SectionFieldElement[]{simpleTextElement2, cardNumberElement, new RowElement(IdentifierSpec.INSTANCE.Generic("row_" + UUID.randomUUID().getLeastSignificantBits()), listListOf, new RowController(listListOf))});
        List listListOfNotNull = CollectionsKt.listOfNotNull((Object[]) new SectionSingleFieldElement[]{simpleTextElement2, cardNumberElement, simpleTextElement3, cvcElement});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOfNotNull, 10));
        Iterator it = listListOfNotNull.iterator();
        while (it.hasNext()) {
            arrayList.add(((SectionSingleFieldElement) it.next()).getController());
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InputController) it2.next()).getError());
        }
        final ArrayList arrayList4 = arrayList3;
        if (arrayList4.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf((FieldError) CollectionsKt.firstOrNull(CollectionsKt.filterNotNull(CollectionsKt.emptyList())));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList4).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<FieldError>() { // from class: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super FieldError> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<FieldError[]>() { // from class: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final FieldError[] invoke() {
                            return new FieldError[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$1$3", f = "CardDetailsController.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super FieldError>, FieldError[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super FieldError> flowCollector, FieldError[] fieldErrorArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = fieldErrorArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            FieldError fieldError = (FieldError) CollectionsKt.firstOrNull(CollectionsKt.filterNotNull(ArraysKt.toList((Object[]) this.L$1)));
                            this.label = 1;
                            if (flowCollector.emit(fieldError, this) == coroutine_suspended) {
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
        this.error = new FlowToStateFlow(flowStateFlowOf, new Function0<FieldError>() { // from class: com.stripe.android.ui.core.elements.CardDetailsController$special$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final FieldError invoke() {
                List list = arrayList4;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((StateFlow) it3.next()).getValue());
                }
                return (FieldError) CollectionsKt.firstOrNull(CollectionsKt.filterNotNull(arrayList5));
            }
        });
    }

    public /* synthetic */ CardDetailsController(CardAccountRangeRepository.Factory factory, Map map, boolean z, CardBrandChoiceEligibility.Ineligible ineligible, MainCoroutineDispatcher mainCoroutineDispatcher, CoroutineDispatcher coroutineDispatcher, CardBrandFilter cardBrandFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(factory, map, (i & 4) != 0 ? false : z, (i & 8) != 0 ? CardBrandChoiceEligibility.Ineligible.INSTANCE : ineligible, (i & 16) != 0 ? Dispatchers.getMain() : mainCoroutineDispatcher, (i & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 64) != 0 ? DefaultCardBrandFilter.INSTANCE : cardBrandFilter);
    }

    public final SimpleTextElement getNameElement() {
        return this.nameElement;
    }

    public final Integer getLabel() {
        return this.label;
    }

    public final CardNumberElement getNumberElement() {
        return this.numberElement;
    }

    public final CvcElement getCvcElement() {
        return this.cvcElement;
    }

    public final SimpleTextElement getExpirationDateElement() {
        return this.expirationDateElement;
    }

    public final List<SectionFieldElement> getFields() {
        return this.fields;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(-125603865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-125603865, i, -1, "com.stripe.android.ui.core.elements.CardDetailsController.ComposeUI (CardDetailsController.kt:130)");
        }
        int i2 = i >> 3;
        CardDetailsElementUIKt.CardDetailsElementUI(z, this, hiddenIdentifiers, identifierSpec, modifier, composer, (i & 14) | ((i >> 12) & OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS) | (i2 & 896) | (IdentifierSpec.$stable << 9) | (i2 & 7168) | ((i << 6) & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }
}
