package com.stripe.android.ui.core.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.R;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.ui.core.elements.CardBrandChoiceConfig;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporter;
import com.stripe.android.ui.core.elements.events.AnalyticsEventReporterKt;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporter;
import com.stripe.android.ui.core.elements.events.CardBrandDisallowedReporterKt;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporter;
import com.stripe.android.ui.core.elements.events.CardNumberCompletedEventReporterKt;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.TextFieldIcon;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.AccessibilityKt;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CardNumberController.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 w2\u00020\u0001:\u0001wBY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010_\u001a\u0004\u0018\u00010P2\u0006\u0010`\u001a\u00020\fH\u0016J\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\fH\u0016J\u0010\u0010d\u001a\u00020b2\u0006\u0010e\u001a\u00020\u000eH\u0016J\u0010\u0010f\u001a\u00020b2\u0006\u0010g\u001a\u00020hH\u0016J4\u0010i\u001a\u00020<2\b\u0010j\u001a\u0004\u0018\u00010<2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;J=\u0010l\u001a\u00020b2\u0006\u0010m\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020o2\u0006\u0010p\u001a\u00020q2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020t0s2\b\u0010u\u001a\u0004\u0018\u00010tH\u0017¢\u0006\u0002\u0010vR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001fX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001cR\u0014\u0010!\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020/0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0014\u00101\u001a\u000202X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010'R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020%0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010'R\u000e\u00109\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0;0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010'R\u0014\u0010A\u001a\b\u0012\u0004\u0012\u00020<0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020<0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010'R\u0014\u0010D\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0018R\u001c\u0010F\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001c\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010'R\u0014\u0010O\u001a\b\u0012\u0004\u0012\u00020P0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010'R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000e0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010'R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010'R\u001c\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010'R\u001a\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000e0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010'R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0$X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b^\u0010'¨\u0006x²\u0006\f\u0010y\u001a\u0004\u0018\u00010<X\u008a\u008e\u0002²\u0006\n\u0010z\u001a\u00020\u000eX\u008a\u008e\u0002"}, d2 = {"Lcom/stripe/android/ui/core/elements/DefaultCardNumberController;", "Lcom/stripe/android/ui/core/elements/CardNumberController;", "cardTextFieldConfig", "Lcom/stripe/android/ui/core/elements/CardNumberConfig;", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "initialValue", "", "showOptionalLabel", "", "cardBrandChoiceConfig", "Lcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;ZLcom/stripe/android/ui/core/elements/CardBrandChoiceConfig;Lcom/stripe/android/CardBrandFilter;)V", "getInitialValue", "()Ljava/lang/String;", "getShowOptionalLabel", "()Z", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "getCapitalization-IUNYP9k", "()I", "I", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE", "debugLabel", "getDebugLabel", "label", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/stripe/android/core/strings/ResolvableString;", "getLabel", "()Lkotlinx/coroutines/flow/StateFlow;", "_fieldValue", "Lkotlinx/coroutines/flow/MutableStateFlow;", "fieldValue", "getFieldValue", "latestBinBasedPanLength", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation", ViewProps.LAYOUT_DIRECTION, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "rawFieldValue", "getRawFieldValue", "contentDescription", "getContentDescription", "isEligibleForCardBrandChoice", "brandChoices", "", "Lcom/stripe/android/model/CardBrand;", "preferredBrands", "mostRecentUserSelectedBrand", "selectedCardBrandFlow", "getSelectedCardBrandFlow", "impliedCardBrand", "cardBrandFlow", "getCardBrandFlow", "cardScanEnabled", "getCardScanEnabled", "accountRangeService", "Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService$annotations", "()V", "getAccountRangeService", "()Lcom/stripe/android/cards/CardAccountRangeService;", "trailingIcon", "Lcom/stripe/android/uicore/elements/TextFieldIcon;", "getTrailingIcon", "_fieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "fieldState", "getFieldState", "_hasFocus", "loading", "getLoading", "visibleError", "getVisibleError", "error", "Lcom/stripe/android/uicore/elements/FieldError;", "getError", "isComplete", "formFieldValue", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "getFormFieldValue", "onValueChange", "displayFormatted", "onRawValueChange", "", "rawValue", "onFocusChange", "newHasFocus", "onDropdownItemClicked", "item", "Lcom/stripe/android/uicore/elements/TextFieldIcon$Dropdown$Item;", "determineSelectedBrand", "previous", "allChoices", "ComposeUI", ViewProps.ENABLED, "field", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "modifier", "Landroidx/compose/ui/Modifier;", "hiddenIdentifiers", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "lastTextFieldIdentifier", "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V", "Companion", "payments-ui-core_release", "lastLoggedCardBrand", "hasReportedIncompleteCardNumberRequiringMoreThan16Digits"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultCardNumberController extends CardNumberController {

    @Deprecated
    public static final int CARD_NUMBER_16_DIGITS = 16;

    @Deprecated
    public static final int STATIC_ICON_COUNT = 3;
    private final StateFlow<TextFieldState> _fieldState;
    private final MutableStateFlow<String> _fieldValue;
    private final MutableStateFlow<Boolean> _hasFocus;
    private final CardAccountRangeService accountRangeService;
    private final MutableStateFlow<List<CardBrand>> brandChoices;
    private final int capitalization;
    private final CardBrandChoiceConfig cardBrandChoiceConfig;
    private final CardBrandFilter cardBrandFilter;
    private final StateFlow<CardBrand> cardBrandFlow;
    private final boolean cardScanEnabled;
    private final CardNumberConfig cardTextFieldConfig;
    private final StateFlow<ResolvableString> contentDescription;
    private final String debugLabel;
    private final StateFlow<FieldError> error;
    private final StateFlow<TextFieldState> fieldState;
    private final StateFlow<String> fieldValue;
    private final StateFlow<FormFieldEntry> formFieldValue;
    private final StateFlow<CardBrand> impliedCardBrand;
    private final String initialValue;
    private final StateFlow<Boolean> isComplete;
    private final boolean isEligibleForCardBrandChoice;
    private final int keyboardType;
    private final StateFlow<ResolvableString> label;
    private final MutableStateFlow<Integer> latestBinBasedPanLength;
    private final LayoutDirection layoutDirection;
    private final StateFlow<Boolean> loading;
    private final MutableStateFlow<CardBrand> mostRecentUserSelectedBrand;
    private final List<CardBrand> preferredBrands;
    private final StateFlow<String> rawFieldValue;
    private final StateFlow<CardBrand> selectedCardBrandFlow;
    private final boolean showOptionalLabel;
    private final StateFlow<TextFieldIcon> trailingIcon;
    private final StateFlow<Boolean> visibleError;
    private final StateFlow<VisualTransformation> visualTransformation;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CardNumberController.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public /* synthetic */ DefaultCardNumberController(CardNumberConfig cardNumberConfig, CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z, CardBrandChoiceConfig cardBrandChoiceConfig, CardBrandFilter cardBrandFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cardNumberConfig, cardAccountRangeRepository, coroutineContext, coroutineContext2, (i & 16) != 0 ? new DefaultStaticCardAccountRanges() : staticCardAccountRanges, str, (i & 64) != 0 ? false : z, (i & 128) != 0 ? CardBrandChoiceConfig.Ineligible.INSTANCE : cardBrandChoiceConfig, (i & 256) != 0 ? DefaultCardBrandFilter.INSTANCE : cardBrandFilter);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getInitialValue() {
        return this.initialValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public boolean getShowOptionalLabel() {
        return this.showOptionalLabel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCardNumberController(CardNumberConfig cardTextFieldConfig, CardAccountRangeRepository cardAccountRangeRepository, CoroutineContext uiContext, CoroutineContext workContext, StaticCardAccountRanges staticCardAccountRanges, String str, boolean z, CardBrandChoiceConfig cardBrandChoiceConfig, CardBrandFilter cardBrandFilter) {
        List<CardBrand> listEmptyList;
        super(null);
        Intrinsics.checkNotNullParameter(cardTextFieldConfig, "cardTextFieldConfig");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(cardBrandChoiceConfig, "cardBrandChoiceConfig");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        CardBrand initialBrand = null;
        this.cardTextFieldConfig = cardTextFieldConfig;
        this.initialValue = str;
        this.showOptionalLabel = z;
        this.cardBrandChoiceConfig = cardBrandChoiceConfig;
        this.cardBrandFilter = cardBrandFilter;
        this.capitalization = cardTextFieldConfig.getCapitalization();
        this.keyboardType = cardTextFieldConfig.getKeyboard();
        this.debugLabel = cardTextFieldConfig.getDebugLabel();
        this.label = StateFlowsKt.stateFlowOf(cardTextFieldConfig.getLabel());
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this._fieldValue = MutableStateFlow;
        this.fieldValue = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.latestBinBasedPanLength = MutableStateFlow2;
        this.visualTransformation = StateFlowsKt.combineAsStateFlow(getFieldValue(), MutableStateFlow2, new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController.visualTransformation$lambda$0(this.f$0, (String) obj, (Integer) obj2);
            }
        });
        this.layoutDirection = LayoutDirection.Ltr;
        this.rawFieldValue = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCardNumberController.rawFieldValue$lambda$1(this.f$0, (String) obj);
            }
        });
        this.contentDescription = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCardNumberController.contentDescription$lambda$2((String) obj);
            }
        });
        boolean z2 = cardBrandChoiceConfig instanceof CardBrandChoiceConfig.Eligible;
        this.isEligibleForCardBrandChoice = z2;
        MutableStateFlow<List<CardBrand>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.brandChoices = MutableStateFlow3;
        if (cardBrandChoiceConfig instanceof CardBrandChoiceConfig.Eligible) {
            listEmptyList = ((CardBrandChoiceConfig.Eligible) cardBrandChoiceConfig).getPreferredBrands();
        } else {
            if (!(cardBrandChoiceConfig instanceof CardBrandChoiceConfig.Ineligible)) {
                throw new NoWhenBranchMatchedException();
            }
            listEmptyList = CollectionsKt.emptyList();
        }
        this.preferredBrands = listEmptyList;
        if (cardBrandChoiceConfig instanceof CardBrandChoiceConfig.Eligible) {
            initialBrand = ((CardBrandChoiceConfig.Eligible) cardBrandChoiceConfig).getInitialBrand();
        } else if (!(cardBrandChoiceConfig instanceof CardBrandChoiceConfig.Ineligible)) {
            throw new NoWhenBranchMatchedException();
        }
        MutableStateFlow<CardBrand> MutableStateFlow4 = StateFlowKt.MutableStateFlow(initialBrand);
        this.mostRecentUserSelectedBrand = MutableStateFlow4;
        this.selectedCardBrandFlow = StateFlowsKt.combineAsStateFlow(MutableStateFlow4, MutableStateFlow3, new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController.selectedCardBrandFlow$lambda$3(this.f$0, (CardBrand) obj, (List) obj2);
            }
        });
        StateFlow<CardBrand> stateFlowMapAsStateFlow = StateFlowsKt.mapAsStateFlow(MutableStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultCardNumberController.impliedCardBrand$lambda$4(this.f$0, (String) obj);
            }
        });
        this.impliedCardBrand = stateFlowMapAsStateFlow;
        this.cardBrandFlow = z2 ? StateFlowsKt.combineAsStateFlow(MutableStateFlow3, getSelectedCardBrandFlow(), new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController.cardBrandFlow$lambda$5((List) obj, (CardBrand) obj2);
            }
        }) : stateFlowMapAsStateFlow;
        this.cardScanEnabled = true;
        CardAccountRangeService cardAccountRangeService = new CardAccountRangeService(cardAccountRangeRepository, uiContext, workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangesResult(List<AccountRange> accountRanges, List<AccountRange> unfilteredAccountRanges) {
                Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
                Intrinsics.checkNotNullParameter(unfilteredAccountRanges, "unfilteredAccountRanges");
                AccountRange accountRange = (AccountRange) CollectionsKt.firstOrNull((List) accountRanges);
                if (accountRange != null) {
                    this.this$0.latestBinBasedPanLength.setValue(Integer.valueOf(accountRange.getPanLength()));
                }
                List<AccountRange> list = unfilteredAccountRanges;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountRange) it.next()).getBrand());
                }
                this.this$0.brandChoices.setValue(CollectionsKt.distinct(arrayList));
            }
        }, new Function0() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.isEligibleForCardBrandChoice);
            }
        }, cardBrandFilter);
        this.accountRangeService = cardAccountRangeService;
        this.trailingIcon = StateFlowsKt.combineAsStateFlow(MutableStateFlow, MutableStateFlow3, getSelectedCardBrandFlow(), new Function3() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DefaultCardNumberController.trailingIcon$lambda$11(this.f$0, (String) obj, (List) obj2, (CardBrand) obj3);
            }
        });
        StateFlow<TextFieldState> stateFlowCombineAsStateFlow = StateFlowsKt.combineAsStateFlow(stateFlowMapAsStateFlow, MutableStateFlow, new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController._fieldState$lambda$12(this.f$0, (CardBrand) obj, (String) obj2);
            }
        });
        this._fieldState = stateFlowCombineAsStateFlow;
        this.fieldState = stateFlowCombineAsStateFlow;
        MutableStateFlow<Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(false);
        this._hasFocus = MutableStateFlow5;
        this.loading = cardAccountRangeService.isLoading();
        this.visibleError = StateFlowsKt.combineAsStateFlow(stateFlowCombineAsStateFlow, MutableStateFlow5, new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(DefaultCardNumberController.visibleError$lambda$13((TextFieldState) obj, ((Boolean) obj2).booleanValue()));
            }
        });
        this.error = StateFlowsKt.combineAsStateFlow(getVisibleError(), stateFlowCombineAsStateFlow, new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController.error$lambda$15(((Boolean) obj).booleanValue(), (TextFieldState) obj2);
            }
        });
        this.isComplete = StateFlowsKt.mapAsStateFlow(stateFlowCombineAsStateFlow, new Function1() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DefaultCardNumberController.isComplete$lambda$16((TextFieldState) obj));
            }
        });
        this.formFieldValue = StateFlowsKt.combineAsStateFlow(isComplete(), getRawFieldValue(), new Function2() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DefaultCardNumberController.formFieldValue$lambda$17(((Boolean) obj).booleanValue(), (String) obj2);
            }
        });
        String initialValue = getInitialValue();
        onRawValueChange(initialValue != null ? initialValue : "");
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getCapitalization-IUNYP9k, reason: from getter */
    public int getCapitalization() {
        return this.capitalization;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    /* renamed from: getKeyboardType-PjHm6EE, reason: from getter */
    public int getKeyboardType() {
        return this.keyboardType;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public StateFlow<ResolvableString> getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<VisualTransformation> getVisualTransformation() {
        return this.visualTransformation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VisualTransformation visualTransformation$lambda$0(DefaultCardNumberController defaultCardNumberController, String number, Integer num) {
        int maxLengthForCardNumber;
        Intrinsics.checkNotNullParameter(number, "number");
        if (num != null) {
            maxLengthForCardNumber = num.intValue();
        } else {
            maxLengthForCardNumber = CardBrand.INSTANCE.fromCardNumber(number).getMaxLengthForCardNumber(number);
        }
        return defaultCardNumberController.cardTextFieldConfig.determineVisualTransformation(number, maxLengthForCardNumber);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<String> getRawFieldValue() {
        return this.rawFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String rawFieldValue$lambda$1(DefaultCardNumberController defaultCardNumberController, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return defaultCardNumberController.cardTextFieldConfig.convertToRaw(it);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<ResolvableString> getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString contentDescription$lambda$2(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ResolvableStringUtilsKt.getResolvableString(AccessibilityKt.asIndividualDigits(it));
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController
    public StateFlow<CardBrand> getSelectedCardBrandFlow() {
        return this.selectedCardBrandFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardBrand selectedCardBrandFlow$lambda$3(DefaultCardNumberController defaultCardNumberController, CardBrand cardBrand, List allChoices) {
        Intrinsics.checkNotNullParameter(allChoices, "allChoices");
        return defaultCardNumberController.determineSelectedBrand(cardBrand, allChoices, defaultCardNumberController.cardBrandFilter, defaultCardNumberController.preferredBrands);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardBrand impliedCardBrand$lambda$4(DefaultCardNumberController defaultCardNumberController, String it) {
        CardBrand brand;
        Intrinsics.checkNotNullParameter(it, "it");
        AccountRange accountRange = defaultCardNumberController.accountRangeService.getAccountRange();
        if (accountRange != null && (brand = accountRange.getBrand()) != null) {
            return brand;
        }
        CardBrand cardBrand = (CardBrand) CollectionsKt.firstOrNull((List) CardBrand.INSTANCE.getCardBrands(it));
        return cardBrand == null ? CardBrand.Unknown : cardBrand;
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController
    public StateFlow<CardBrand> getCardBrandFlow() {
        return this.cardBrandFlow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardBrand cardBrandFlow$lambda$5(List choices, CardBrand selected) {
        Intrinsics.checkNotNullParameter(choices, "choices");
        Intrinsics.checkNotNullParameter(selected, "selected");
        CardBrand cardBrand = (CardBrand) CollectionsKt.singleOrNull(choices);
        return cardBrand == null ? selected : cardBrand;
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController
    public boolean getCardScanEnabled() {
        return this.cardScanEnabled;
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<TextFieldIcon> getTrailingIcon() {
        return this.trailingIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldIcon trailingIcon$lambda$11(DefaultCardNumberController defaultCardNumberController, String number, List brands, CardBrand chosen) {
        TextFieldIcon.Dropdown.Item item;
        ResolvableString resolvableStringResolvableString$default;
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(brands, "brands");
        Intrinsics.checkNotNullParameter(chosen, "chosen");
        if (defaultCardNumberController.isEligibleForCardBrandChoice && number.length() > 0) {
            TextFieldIcon.Dropdown.Item item2 = new TextFieldIcon.Dropdown.Item(CardBrand.Unknown.getCode(), ResolvableStringUtilsKt.getResolvableString(R.string.stripe_card_brand_choice_no_selection), CardBrand.Unknown.getIcon(), false, 8, null);
            if (brands.size() == 1) {
                CardBrand cardBrand = (CardBrand) brands.get(0);
                item = new TextFieldIcon.Dropdown.Item(cardBrand.getCode(), ResolvableStringUtilsKt.getResolvableString(cardBrand.getDisplayName()), cardBrand.getIcon(), false, 8, null);
            } else {
                item = WhenMappings.$EnumSwitchMapping$0[chosen.ordinal()] == 1 ? null : new TextFieldIcon.Dropdown.Item(chosen.getCode(), ResolvableStringUtilsKt.getResolvableString(chosen.getDisplayName()), chosen.getIcon(), false, 8, null);
            }
            List<CardBrand> list = brands;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CardBrand cardBrand2 : list) {
                boolean zIsAccepted = defaultCardNumberController.cardBrandFilter.isAccepted(cardBrand2);
                String code = cardBrand2.getCode();
                if (zIsAccepted) {
                    resolvableStringResolvableString$default = ResolvableStringUtilsKt.getResolvableString(cardBrand2.getDisplayName());
                } else {
                    resolvableStringResolvableString$default = ResolvableStringUtilsKt.resolvableString$default(com.stripe.android.ui.core.R.string.stripe_card_brand_not_accepted_with_brand, new Object[]{cardBrand2.getDisplayName()}, null, 4, null);
                }
                arrayList.add(new TextFieldIcon.Dropdown.Item(code, resolvableStringResolvableString$default, cardBrand2.getIcon(), zIsAccepted));
            }
            ArrayList arrayList2 = arrayList;
            ResolvableString resolvableString = ResolvableStringUtilsKt.getResolvableString(R.string.stripe_card_brand_choice_selection_header);
            if (item != null) {
                item2 = item;
            }
            return new TextFieldIcon.Dropdown(resolvableString, brands.size() < 2, item2, arrayList2);
        }
        if (defaultCardNumberController.accountRangeService.getAccountRange() != null) {
            AccountRange accountRange = defaultCardNumberController.accountRangeService.getAccountRange();
            Intrinsics.checkNotNull(accountRange);
            return new TextFieldIcon.Trailing(accountRange.getBrand().getIcon(), null, false, null, 10, null);
        }
        List<CardBrand> cardBrands = CardBrand.INSTANCE.getCardBrands(number);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : cardBrands) {
            if (defaultCardNumberController.cardBrandFilter.isAccepted((CardBrand) obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(new TextFieldIcon.Trailing(((CardBrand) it.next()).getIcon(), null, false, null, 10, null));
        }
        List listTake = CollectionsKt.take(arrayList5, 3);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList6.add(new TextFieldIcon.Trailing(((CardBrand) it2.next()).getIcon(), null, false, null, 10, null));
        }
        return new TextFieldIcon.MultiTrailing(listTake, CollectionsKt.drop(arrayList6, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldState _fieldState$lambda$12(DefaultCardNumberController defaultCardNumberController, CardBrand brand, String fieldValue) {
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(fieldValue, "fieldValue");
        CardNumberConfig cardNumberConfig = defaultCardNumberController.cardTextFieldConfig;
        AccountRange accountRange = defaultCardNumberController.accountRangeService.getAccountRange();
        return cardNumberConfig.determineState(brand, fieldValue, accountRange != null ? accountRange.getPanLength() : brand.getMaxLengthForCardNumber(fieldValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<TextFieldState> getFieldState() {
        return this.fieldState;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<Boolean> getLoading() {
        return this.loading;
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public StateFlow<Boolean> getVisibleError() {
        return this.visibleError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean visibleError$lambda$13(TextFieldState fieldState, boolean z) {
        Intrinsics.checkNotNullParameter(fieldState, "fieldState");
        return fieldState.shouldShowError(z);
    }

    @Override // com.stripe.android.uicore.elements.SectionFieldErrorController
    public StateFlow<FieldError> getError() {
        return this.error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FieldError error$lambda$15(boolean z, TextFieldState fieldState) {
        Intrinsics.checkNotNullParameter(fieldState, "fieldState");
        FieldError error = fieldState.getError();
        if (error == null || !z) {
            return null;
        }
        return error;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isComplete$lambda$16(TextFieldState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.isValid();
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<Boolean> isComplete() {
        return this.isComplete;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public StateFlow<FormFieldEntry> getFormFieldValue() {
        return this.formFieldValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry formFieldValue$lambda$17(boolean z, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new FormFieldEntry(value, z);
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public TextFieldState onValueChange(String displayFormatted) {
        Intrinsics.checkNotNullParameter(displayFormatted, "displayFormatted");
        this._fieldValue.setValue(this.cardTextFieldConfig.filter(displayFormatted));
        this.accountRangeService.onCardNumberChanged(new CardNumber.Unvalidated(displayFormatted));
        return null;
    }

    @Override // com.stripe.android.uicore.elements.InputController
    public void onRawValueChange(String rawValue) {
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        onValueChange(this.cardTextFieldConfig.convertFromRaw(rawValue));
    }

    @Override // com.stripe.android.uicore.elements.TextFieldController
    public void onFocusChange(boolean newHasFocus) {
        this._hasFocus.setValue(Boolean.valueOf(newHasFocus));
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController, com.stripe.android.uicore.elements.TextFieldController
    public void onDropdownItemClicked(TextFieldIcon.Dropdown.Item item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.mostRecentUserSelectedBrand.setValue(CardBrand.INSTANCE.fromCode(item.getId()));
    }

    public final CardBrand determineSelectedBrand(CardBrand previous, List<? extends CardBrand> allChoices, CardBrandFilter cardBrandFilter, List<? extends CardBrand> preferredBrands) {
        Object next;
        Intrinsics.checkNotNullParameter(allChoices, "allChoices");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        Intrinsics.checkNotNullParameter(preferredBrands, "preferredBrands");
        List<? extends CardBrand> list = allChoices;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (cardBrandFilter.isAccepted((CardBrand) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 1 && allChoices.size() > 1) {
            return (CardBrand) CollectionsKt.single((List) arrayList2);
        }
        if (previous == CardBrand.Unknown) {
            return previous;
        }
        if (CollectionsKt.contains(list, previous)) {
            return previous == null ? CardBrand.Unknown : previous;
        }
        Iterator<T> it = preferredBrands.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (allChoices.contains((CardBrand) next)) {
                break;
            }
        }
        CardBrand cardBrand = (CardBrand) next;
        return cardBrand == null ? CardBrand.Unknown : cardBrand;
    }

    @Override // com.stripe.android.ui.core.elements.CardNumberController, com.stripe.android.uicore.elements.TextFieldController, com.stripe.android.uicore.elements.SectionFieldComposable
    public void ComposeUI(boolean z, SectionFieldElement field, Modifier modifier, Set<IdentifierSpec> hiddenIdentifiers, IdentifierSpec identifierSpec, Composer composer, int i) {
        Unit unit;
        DefaultCardNumberController defaultCardNumberController = this;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(hiddenIdentifiers, "hiddenIdentifiers");
        composer.startReplaceGroup(-1792651236);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1792651236, i, -1, "com.stripe.android.ui.core.elements.DefaultCardNumberController.ComposeUI (CardNumberController.kt:367)");
        }
        ProvidableCompositionLocal<CardNumberCompletedEventReporter> localCardNumberCompletedEventReporter = CardNumberCompletedEventReporterKt.getLocalCardNumberCompletedEventReporter();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composer.consume(localCardNumberCompletedEventReporter);
        ComposerKt.sourceInformationMarkerEnd(composer);
        CardNumberCompletedEventReporter cardNumberCompletedEventReporter = (CardNumberCompletedEventReporter) objConsume;
        ProvidableCompositionLocal<CardBrandDisallowedReporter> localCardBrandDisallowedReporter = CardBrandDisallowedReporterKt.getLocalCardBrandDisallowedReporter();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume2 = composer.consume(localCardBrandDisallowedReporter);
        ComposerKt.sourceInformationMarkerEnd(composer);
        CardBrandDisallowedReporter cardBrandDisallowedReporter = (CardBrandDisallowedReporter) objConsume2;
        ProvidableCompositionLocal<AnalyticsEventReporter> localAnalyticsEventReporter = AnalyticsEventReporterKt.getLocalAnalyticsEventReporter();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume3 = composer.consume(localAnalyticsEventReporter);
        ComposerKt.sourceInformationMarkerEnd(composer);
        AnalyticsEventReporter analyticsEventReporter = (AnalyticsEventReporter) objConsume3;
        Object[] objArr = new Object[0];
        composer.startReplaceGroup(-1824679965);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultCardNumberController.ComposeUI$lambda$21$lambda$20();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        MutableState mutableState = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composer, 3072, 6);
        Object[] objArr2 = new Object[0];
        composer.startReplaceGroup(-1824675924);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.stripe.android.ui.core.elements.DefaultCardNumberController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DefaultCardNumberController.ComposeUI$lambda$25$lambda$24();
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        MutableState mutableState2 = (MutableState) RememberSaveableKt.m3243rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composer, 3072, 6);
        Unit unit2 = Unit.INSTANCE;
        composer.startReplaceGroup(-1824672445);
        boolean zChangedInstance = composer.changedInstance(defaultCardNumberController) | composer.changedInstance(cardNumberCompletedEventReporter) | composer.changed(mutableState) | composer.changedInstance(cardBrandDisallowedReporter);
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            unit = unit2;
            defaultCardNumberController = this;
            objRememberedValue3 = (Function2) new DefaultCardNumberController$ComposeUI$1$1(this, cardNumberCompletedEventReporter, cardBrandDisallowedReporter, mutableState, null);
            composer.updateRememberedValue(objRememberedValue3);
        } else {
            unit = unit2;
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 6);
        Unit unit3 = Unit.INSTANCE;
        composer.startReplaceGroup(-1824636817);
        boolean zChangedInstance2 = composer.changedInstance(defaultCardNumberController) | composer.changed(mutableState2) | composer.changedInstance(analyticsEventReporter);
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = (Function2) new DefaultCardNumberController$ComposeUI$2$1(defaultCardNumberController, mutableState2, analyticsEventReporter, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 6);
        super.ComposeUI(z, field, modifier, hiddenIdentifiers, identifierSpec, composer, (i & 8190) | (IdentifierSpec.$stable << 12) | (57344 & i) | (458752 & i));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState ComposeUI$lambda$21$lambda$20() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardBrand ComposeUI$lambda$22(MutableState<CardBrand> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ComposeUI$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ComposeUI$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState ComposeUI$lambda$25$lambda$24() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* compiled from: CardNumberController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/DefaultCardNumberController$Companion;", "", "<init>", "()V", "STATIC_ICON_COUNT", "", "CARD_NUMBER_16_DIGITS", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
