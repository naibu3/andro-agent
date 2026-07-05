package com.stripe.android.link.ui.inline;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.imagepipeline.common.RotationOptions;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.account.LinkAccountManager;
import com.stripe.android.link.analytics.LinkEventsReporter;
import com.stripe.android.link.injection.LinkComponent;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.link.ui.signup.SignUpState;
import com.stripe.android.link.utils.ErrorsKt;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.NameConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import com.stripe.android.uicore.elements.SectionController;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.forms.FormFieldEntry;
import com.stripe.android.uicore.utils.StateFlowsKt;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: InlineSignupViewModel.kt */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0001dBC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011B?\b\u0017\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0012J\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020GJ\b\u0010I\u001a\u00020GH\u0002J\u000e\u0010J\u001a\u00020GH\u0082@¢\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u00020G2\b\b\u0002\u0010M\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010NJ0\u0010O\u001a\u0004\u0018\u00010\u00032\b\u0010P\u001a\u0004\u0018\u00010\u001a2\b\u0010Q\u001a\u0004\u0018\u00010\u001a2\b\u0010R\u001a\u0004\u0018\u00010\u001a2\u0006\u0010S\u001a\u00020\u0018H\u0002J\u0016\u0010T\u001a\u00020G2\u0006\u0010P\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010UJ\f\u0010P\u001a\u00020\u001a*\u00020\u0003H\u0002J\u000e\u0010V\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\u000e\u0010R\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\u000e\u0010W\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\b\u0010X\u001a\u00020GH\u0002J\u0010\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020[H\u0002J<\u0010\\\u001a\u00020]*\u00020\u00052\u0006\u0010^\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\u00182\u0006\u0010S\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\u0018H\u0002J\u0018\u0010c\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u0018H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0011\u00107\u001a\u000208¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0#¢\u0006\b\n\u0000\u001a\u0004\bA\u0010%R\u0011\u0010B\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u000e\u0010E\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, d2 = {"Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "Landroidx/lifecycle/ViewModel;", "initialUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "config", "Lcom/stripe/android/link/LinkConfiguration;", "linkAccountManager", "Lcom/stripe/android/link/account/LinkAccountManager;", "linkEventsReporter", "Lcom/stripe/android/link/analytics/LinkEventsReporter;", "logger", "Lcom/stripe/android/core/Logger;", "lookupDelay", "", "<init>", "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;J)V", "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V", "getInitialUserInput", "()Lcom/stripe/android/link/ui/inline/UserInput;", "getSignupMode", "()Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "hasInitialUserInput", "", "initialEmail", "", "initialPhone", "initialName", "initialCountry", "initialViewState", "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;", "_viewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "viewState", "Lkotlinx/coroutines/flow/StateFlow;", "getViewState", "()Lkotlinx/coroutines/flow/StateFlow;", "showOptionalLabel", "prefillEligibleFields", "", "Lcom/stripe/android/link/ui/inline/LinkSignupField;", "prefilledEmail", "prefilledPhone", "prefilledName", "emailController", "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "getEmailController", "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;", "phoneController", "Lcom/stripe/android/uicore/elements/PhoneNumberController;", "getPhoneController", "()Lcom/stripe/android/uicore/elements/PhoneNumberController;", "nameController", "getNameController", "sectionController", "Lcom/stripe/android/uicore/elements/SectionController;", "getSectionController", "()Lcom/stripe/android/uicore/elements/SectionController;", "consumerEmail", "consumerPhoneNumber", "consumerName", "_errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "errorMessage", "getErrorMessage", "requiresNameCollection", "getRequiresNameCollection", "()Z", "hasExpanded", "toggleExpanded", "", "changeSignupDetails", "watchUserInput", "watchPhoneInput", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "watchEmailInput", "dropFirst", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapToUserInput", "email", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "name", "userHasInteracted", "lookupConsumerEmail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "phone", "country", "clearError", "onError", "error", "", "toConsentAction", "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;", "hasPrefilledEmail", "hasPrefilledPhone", "defaultOptIn", "linkSignUpOptInFeatureEnabled", "linkSignUpInitialValue", "getDefaultOptInConsentAction", "Factory", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InlineSignupViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ResolvableString> _errorMessage;
    private final MutableStateFlow<InlineSignupViewState> _viewState;
    private final LinkConfiguration config;
    private final StateFlow<String> consumerEmail;
    private final StateFlow<String> consumerName;
    private final StateFlow<String> consumerPhoneNumber;
    private final SimpleTextFieldController emailController;
    private final StateFlow<ResolvableString> errorMessage;
    private boolean hasExpanded;
    private final boolean hasInitialUserInput;
    private final String initialCountry;
    private final String initialEmail;
    private final String initialName;
    private final String initialPhone;
    private final UserInput initialUserInput;
    private final InlineSignupViewState initialViewState;
    private final LinkAccountManager linkAccountManager;
    private final LinkEventsReporter linkEventsReporter;
    private final Logger logger;
    private final long lookupDelay;
    private final SimpleTextFieldController nameController;
    private final PhoneNumberController phoneController;
    private final Set<LinkSignupField> prefillEligibleFields;
    private final String prefilledEmail;
    private final String prefilledName;
    private final String prefilledPhone;
    private final SectionController sectionController;
    private final boolean showOptionalLabel;
    private final LinkSignupMode signupMode;
    private final StateFlow<InlineSignupViewState> viewState;

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SignUpState.values().length];
            try {
                iArr[SignUpState.InputtingPrimaryField.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SignUpState.VerifyingEmail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SignUpState.InputtingRemainingFields.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LinkSignupMode.values().length];
            try {
                iArr2[LinkSignupMode.AlongsideSaveForFutureUse.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LinkSignupMode.InsteadOfSaveForFutureUse.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", f = "InlineSignupViewModel.kt", i = {0, 0}, l = {RotationOptions.ROTATE_270}, m = "lookupConsumerEmail", n = {"this", "email"}, s = {"L$0", "L$1"})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$lookupConsumerEmail$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InlineSignupViewModel.this.lookupConsumerEmail(null, this);
        }
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel", f = "InlineSignupViewModel.kt", i = {0}, l = {198}, m = "watchPhoneInput", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchPhoneInput$1, reason: invalid class name and case insensitive filesystem */
    static final class C10391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C10391(Continuation<? super C10391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InlineSignupViewModel.this.watchPhoneInput(this);
        }
    }

    public /* synthetic */ InlineSignupViewModel(UserInput userInput, LinkSignupMode linkSignupMode, LinkConfiguration linkConfiguration, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInput, linkSignupMode, linkConfiguration, linkAccountManager, linkEventsReporter, logger, (i & 64) != 0 ? 1000L : j);
    }

    public final UserInput getInitialUserInput() {
        return this.initialUserInput;
    }

    public final LinkSignupMode getSignupMode() {
        return this.signupMode;
    }

    public InlineSignupViewModel(UserInput userInput, LinkSignupMode signupMode, LinkConfiguration config, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger, long j) {
        Intrinsics.checkNotNullParameter(signupMode, "signupMode");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.initialUserInput = userInput;
        this.signupMode = signupMode;
        this.config = config;
        this.linkAccountManager = linkAccountManager;
        this.linkEventsReporter = linkEventsReporter;
        this.logger = logger;
        this.lookupDelay = j;
        boolean z = userInput != null;
        this.hasInitialUserInput = z;
        String strEmail = userInput != null ? email(userInput) : null;
        this.initialEmail = strEmail;
        String strPhone = userInput != null ? phone(userInput) : null;
        this.initialPhone = strPhone;
        String strName = userInput != null ? name(userInput) : null;
        this.initialName = strName;
        String strCountry = userInput != null ? country(userInput) : null;
        this.initialCountry = strCountry;
        InlineSignupViewState inlineSignupViewStateCreate = InlineSignupViewState.INSTANCE.create(signupMode, config, strEmail, strPhone, config.getLinkSignUpOptInFeatureEnabled() ? config.getLinkSignUpOptInInitialValue() : z);
        this.initialViewState = inlineSignupViewStateCreate;
        MutableStateFlow<InlineSignupViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(inlineSignupViewStateCreate);
        this._viewState = MutableStateFlow;
        this.viewState = MutableStateFlow;
        boolean z2 = signupMode == LinkSignupMode.AlongsideSaveForFutureUse;
        this.showOptionalLabel = z2;
        Set<LinkSignupField> prefillEligibleFields = inlineSignupViewStateCreate.getPrefillEligibleFields();
        this.prefillEligibleFields = prefillEligibleFields;
        String email = prefillEligibleFields.contains(LinkSignupField.Email) ? config.getCustomerInfo().getEmail() : null;
        this.prefilledEmail = email;
        String phone = prefillEligibleFields.contains(LinkSignupField.Phone) ? config.getCustomerInfo().getPhone() : null;
        phone = phone == null ? "" : phone;
        this.prefilledPhone = phone;
        String name = prefillEligibleFields.contains(LinkSignupField.Name) ? config.getCustomerInfo().getName() : null;
        this.prefilledName = name;
        SimpleTextFieldController simpleTextFieldControllerCreateController = EmailConfig.INSTANCE.createController(strEmail == null ? email : strEmail, inlineSignupViewStateCreate.isShowingEmailFirst() && z2);
        this.emailController = simpleTextFieldControllerCreateController;
        PhoneNumberController phoneNumberControllerCreatePhoneNumberController$default = PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, strPhone == null ? phone : strPhone, strCountry == null ? config.getCustomerInfo().getBillingCountryCode() : strCountry, null, inlineSignupViewStateCreate.isShowingPhoneFirst() && z2, false, 20, null);
        this.phoneController = phoneNumberControllerCreatePhoneNumberController$default;
        SimpleTextFieldController simpleTextFieldControllerCreateController2 = NameConfig.INSTANCE.createController(strName == null ? name : strName);
        this.nameController = simpleTextFieldControllerCreateController2;
        this.sectionController = new SectionController(null, CollectionsKt.listOfNotNull(simpleTextFieldControllerCreateController, phoneNumberControllerCreatePhoneNumberController$default, getRequiresNameCollection() ? simpleTextFieldControllerCreateController2 : null));
        this.consumerEmail = StateFlowsKt.mapAsStateFlow(simpleTextFieldControllerCreateController.getFormFieldValue(), new Function1() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineSignupViewModel.consumerEmail$lambda$5((FormFieldEntry) obj);
            }
        });
        this.consumerPhoneNumber = StateFlowsKt.mapAsStateFlow(phoneNumberControllerCreatePhoneNumberController$default.getFormFieldValue(), new Function1() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineSignupViewModel.consumerPhoneNumber$lambda$7((FormFieldEntry) obj);
            }
        });
        this.consumerName = StateFlowsKt.mapAsStateFlow(simpleTextFieldControllerCreateController2.getFormFieldValue(), new Function1() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineSignupViewModel.consumerName$lambda$9((FormFieldEntry) obj);
            }
        });
        MutableStateFlow<ResolvableString> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._errorMessage = MutableStateFlow2;
        this.errorMessage = FlowKt.asStateFlow(MutableStateFlow2);
        this.hasExpanded = config.getLinkSignUpOptInFeatureEnabled() ? config.getLinkSignUpOptInInitialValue() : z;
        watchUserInput();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @AssistedInject
    public InlineSignupViewModel(@Assisted UserInput userInput, @Assisted LinkSignupMode signupMode, LinkConfiguration config, LinkAccountManager linkAccountManager, LinkEventsReporter linkEventsReporter, Logger logger) {
        this(userInput, signupMode, config, linkAccountManager, linkEventsReporter, logger, 1000L);
        Intrinsics.checkNotNullParameter(signupMode, "signupMode");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(linkAccountManager, "linkAccountManager");
        Intrinsics.checkNotNullParameter(linkEventsReporter, "linkEventsReporter");
        Intrinsics.checkNotNullParameter(logger, "logger");
    }

    public final StateFlow<InlineSignupViewState> getViewState() {
        return this.viewState;
    }

    public final SimpleTextFieldController getEmailController() {
        return this.emailController;
    }

    public final PhoneNumberController getPhoneController() {
        return this.phoneController;
    }

    public final SimpleTextFieldController getNameController() {
        return this.nameController;
    }

    public final SectionController getSectionController() {
        return this.sectionController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String consumerEmail$lambda$5(FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isComplete()) {
            it = null;
        }
        if (it != null) {
            return it.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String consumerPhoneNumber$lambda$7(FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isComplete()) {
            it = null;
        }
        if (it != null) {
            return it.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String consumerName$lambda$9(FormFieldEntry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isComplete()) {
            it = null;
        }
        if (it != null) {
            return it.getValue();
        }
        return null;
    }

    public final StateFlow<ResolvableString> getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getRequiresNameCollection() {
        return this.initialViewState.getFields().contains(LinkSignupField.Name);
    }

    public final void toggleExpanded() {
        InlineSignupViewState value;
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default(value, null, null, null, null, null, false, false, false, !r3.isExpanded$paymentsheet_release(), false, null, true, 1791, null)));
        if (!this._viewState.getValue().isExpanded$paymentsheet_release() || this.hasExpanded) {
            return;
        }
        this.hasExpanded = true;
        this.linkEventsReporter.onInlineSignupCheckboxChecked();
    }

    public final void changeSignupDetails() {
        InlineSignupViewState value;
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default(value, null, null, null, null, null, false, false, true, false, false, null, false, 3967, null)));
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$1", f = "InlineSignupViewModel.kt", i = {}, l = {175, 176, 178}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$1, reason: invalid class name and case insensitive filesystem */
    static final class C10411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10411(Continuation<? super C10411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InlineSignupViewModel.this.new C10411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (r5.this$0.watchEmailInput(true, r5) != r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
        
            if (com.stripe.android.link.ui.inline.InlineSignupViewModel.watchEmailInput$default(r5.this$0, false, r5, 1, null) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (InlineSignupViewModel.this.initialViewState.isShowingPhoneFirst()) {
                    this.label = 1;
                    if (InlineSignupViewModel.this.watchPhoneInput(this) != coroutine_suspended) {
                        this.label = 2;
                    }
                } else {
                    this.label = 3;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.label = 2;
        }
    }

    private final void watchUserInput() {
        InlineSignupViewModel inlineSignupViewModel = this;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(inlineSignupViewModel), null, null, new C10411(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(inlineSignupViewModel), null, null, new C10422(null), 3, null);
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2", f = "InlineSignupViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2, reason: invalid class name and case insensitive filesystem */
    static final class C10422 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C10422(Continuation<? super C10422> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InlineSignupViewModel.this.new C10422(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowCombine = FlowKt.combine(InlineSignupViewModel.this.consumerEmail, InlineSignupViewModel.this.consumerPhoneNumber, InlineSignupViewModel.this.consumerName, StateFlowsKt.mapAsStateFlow(InlineSignupViewModel.this._viewState, new Function1() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(((InlineSignupViewState) obj2).getUserHasInteracted$paymentsheet_release());
                    }
                }), new C01752(InlineSignupViewModel.this));
                final InlineSignupViewModel inlineSignupViewModel = InlineSignupViewModel.this;
                this.label = 1;
                if (flowCombine.collect(new FlowCollector() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel.watchUserInput.2.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((UserInput) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(UserInput userInput, Continuation<? super Unit> continuation) {
                        Object value;
                        MutableStateFlow mutableStateFlow = inlineSignupViewModel._viewState;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default((InlineSignupViewState) value, userInput, null, null, null, null, false, false, false, false, false, null, false, 4094, null)));
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
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

        /* compiled from: InlineSignupViewModel.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2$2, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C01752 extends AdaptedFunctionReference implements Function5<String, String, String, Boolean, Continuation<? super UserInput>, Object>, SuspendFunction {
            C01752(Object obj) {
                super(5, obj, InlineSignupViewModel.class, "mapToUserInput", "mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;", 4);
            }

            @Override // kotlin.jvm.functions.Function5
            public /* bridge */ /* synthetic */ Object invoke(String str, String str2, String str3, Boolean bool, Continuation<? super UserInput> continuation) {
                return invoke(str, str2, str3, bool.booleanValue(), continuation);
            }

            public final Object invoke(String str, String str2, String str3, boolean z, Continuation<? super UserInput> continuation) {
                return C10422.invokeSuspend$mapToUserInput((InlineSignupViewModel) this.receiver, str, str2, str3, z, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$mapToUserInput(InlineSignupViewModel inlineSignupViewModel, String str, String str2, String str3, boolean z, Continuation continuation) {
            return inlineSignupViewModel.mapToUserInput(str, str2, str3, z);
        }
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchPhoneInput$2", f = "InlineSignupViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchPhoneInput$2, reason: invalid class name and case insensitive filesystem */
    static final class C10402 extends SuspendLambda implements Function2<String, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C10402(Continuation<? super C10402> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10402 c10402 = new C10402(continuation);
            c10402.L$0 = obj;
            return c10402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Boolean> continuation) {
            return ((C10402) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            return Boxing.boxBoolean(!(str == null || StringsKt.isBlank(str)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object watchPhoneInput(Continuation<? super Unit> continuation) {
        C10391 c10391;
        InlineSignupViewModel inlineSignupViewModel;
        InlineSignupViewState value;
        if (continuation instanceof C10391) {
            c10391 = (C10391) continuation;
            if ((c10391.label & Integer.MIN_VALUE) != 0) {
                c10391.label -= Integer.MIN_VALUE;
            } else {
                c10391 = new C10391(continuation);
            }
        }
        Object obj = c10391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10391.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<String> stateFlow = this.consumerPhoneNumber;
            C10402 c10402 = new C10402(null);
            c10391.L$0 = this;
            c10391.label = 1;
            if (FlowKt.first(stateFlow, c10402, c10391) == coroutine_suspended) {
                return coroutine_suspended;
            }
            inlineSignupViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            inlineSignupViewModel = (InlineSignupViewModel) c10391.L$0;
            ResultKt.throwOnFailure(obj);
        }
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = inlineSignupViewModel._viewState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default(value, null, null, null, null, null, false, false, false, false, false, SignUpState.InputtingRemainingFields, false, 3071, null)));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object watchEmailInput$default(InlineSignupViewModel inlineSignupViewModel, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return inlineSignupViewModel.watchEmailInput(z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object watchEmailInput(boolean z, Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(FlowKt.drop(this.consumerEmail, z ? 1 : 0), new AnonymousClass2(new Function1() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InlineSignupViewModel.watchEmailInput$lambda$14(this.f$0, (SignUpState) obj);
            }
        }, null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit watchEmailInput$lambda$14(InlineSignupViewModel inlineSignupViewModel, SignUpState signUpState) {
        UserInput userInput;
        InlineSignupViewModel inlineSignupViewModel2 = inlineSignupViewModel;
        SignUpState signUpState2 = signUpState;
        Intrinsics.checkNotNullParameter(signUpState2, "signUpState");
        inlineSignupViewModel2.clearError();
        MutableStateFlow<InlineSignupViewState> mutableStateFlow = inlineSignupViewModel2._viewState;
        while (true) {
            InlineSignupViewState value = mutableStateFlow.getValue();
            InlineSignupViewState inlineSignupViewState = value;
            int i = WhenMappings.$EnumSwitchMapping$0[signUpState2.ordinal()];
            if (i == 1 || i == 2) {
                userInput = inlineSignupViewState.getUserInput();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                userInput = inlineSignupViewModel2.mapToUserInput(inlineSignupViewModel2.consumerEmail.getValue(), inlineSignupViewModel2.consumerPhoneNumber.getValue(), inlineSignupViewModel2.consumerName.getValue(), inlineSignupViewState.getUserHasInteracted$paymentsheet_release());
            }
            if (mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default(inlineSignupViewState, userInput, null, null, null, null, false, false, false, false, false, signUpState2, false, 3070, null))) {
                return Unit.INSTANCE;
            }
            inlineSignupViewModel2 = inlineSignupViewModel;
            signUpState2 = signUpState;
        }
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "email", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchEmailInput$2", f = "InlineSignupViewModel.kt", i = {0}, l = {228, 230}, m = "invokeSuspend", n = {"email"}, s = {"L$0"})
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchEmailInput$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<SignUpState, Unit> $onStateChanged;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function1<? super SignUpState, Unit> function1, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$onStateChanged = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = InlineSignupViewModel.this.new AnonymousClass2(this.$onStateChanged, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r6.this$0.lookupConsumerEmail(r1, r6) != r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                str = (String) this.L$0;
                String str2 = str;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    this.$onStateChanged.invoke(InlineSignupViewModel.this.initialViewState.getSignUpState$paymentsheet_release());
                    return Unit.INSTANCE;
                }
                this.L$0 = str;
                this.label = 1;
                if (DelayKt.delay(InlineSignupViewModel.this.lookupDelay, this) != coroutine_suspended) {
                    this.$onStateChanged.invoke(SignUpState.VerifyingEmail);
                    this.L$0 = null;
                    this.label = 2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
            this.$onStateChanged.invoke(SignUpState.VerifyingEmail);
            this.L$0 = null;
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInput mapToUserInput(String email, String phoneNumber, String name, boolean userHasInteracted) {
        String str;
        LinkSignupMode signupMode = this.initialViewState.getSignupMode();
        boolean z = this.initialViewState.getLinkSignUpOptInFeatureEnabled() || phoneNumber != null;
        if (email == null || !z || signupMode == null) {
            return null;
        }
        return !getRequiresNameCollection() || ((str = name) != null && !StringsKt.isBlank(str)) ? new UserInput.SignUp(email, phoneNumber, this.phoneController.getCountryCode(), name, toConsentAction(signupMode, this.prefilledEmail != null, !StringsKt.isBlank(this.prefilledPhone), this.initialViewState.getAllowsDefaultOptIn(), this.initialViewState.getLinkSignUpOptInFeatureEnabled(), userHasInteracted, this.config.getLinkSignUpOptInInitialValue())) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object lookupConsumerEmail(String str, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object objMo7714lookupConsumerBWLJW6A;
        InlineSignupViewModel inlineSignupViewModel;
        InlineSignupViewState value;
        boolean z;
        InlineSignupViewState value2;
        InlineSignupViewState value3;
        String str2 = str;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            clearError();
            LinkAccountManager linkAccountManager = this.linkAccountManager;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str2;
            anonymousClass1.label = 1;
            objMo7714lookupConsumerBWLJW6A = linkAccountManager.mo7714lookupConsumerBWLJW6A(str2, false, null, anonymousClass1);
            if (objMo7714lookupConsumerBWLJW6A == coroutine_suspended) {
                return coroutine_suspended;
            }
            inlineSignupViewModel = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) anonymousClass1.L$1;
            inlineSignupViewModel = (InlineSignupViewModel) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            objMo7714lookupConsumerBWLJW6A = ((Result) obj).getValue();
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objMo7714lookupConsumerBWLJW6A);
        if (thM9121exceptionOrNullimpl != null) {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow = inlineSignupViewModel._viewState;
            do {
                value = mutableStateFlow.getValue();
                z = thM9121exceptionOrNullimpl instanceof APIConnectionException;
            } while (!mutableStateFlow.compareAndSet(value, InlineSignupViewState.copy$default(value, null, null, null, null, null, false, false, false, false, z, SignUpState.InputtingPrimaryField, false, 2559, null)));
            if (!z) {
                inlineSignupViewModel.onError(thM9121exceptionOrNullimpl);
            }
        } else if (((LinkAccount) objMo7714lookupConsumerBWLJW6A) != null) {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow2 = inlineSignupViewModel._viewState;
            do {
                value3 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value3, InlineSignupViewState.copy$default(value3, new UserInput.SignIn(str2), null, null, null, null, false, false, false, false, false, SignUpState.InputtingPrimaryField, false, 2558, null)));
        } else {
            MutableStateFlow<InlineSignupViewState> mutableStateFlow3 = inlineSignupViewModel._viewState;
            do {
                value2 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value2, InlineSignupViewState.copy$default(value2, null, null, null, null, null, false, false, false, false, false, SignUpState.InputtingRemainingFields, false, 2559, null)));
            inlineSignupViewModel.linkEventsReporter.onSignupStarted(true);
        }
        return Unit.INSTANCE;
    }

    private final String email(UserInput userInput) {
        if (userInput instanceof UserInput.SignUp) {
            return ((UserInput.SignUp) userInput).getEmail();
        }
        if (userInput instanceof UserInput.SignIn) {
            return ((UserInput.SignIn) userInput).getEmail();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String phone(UserInput userInput) {
        if (userInput instanceof UserInput.SignUp) {
            return ((UserInput.SignUp) userInput).getPhone();
        }
        if (userInput instanceof UserInput.SignIn) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String name(UserInput userInput) {
        if (userInput instanceof UserInput.SignUp) {
            return ((UserInput.SignUp) userInput).getName();
        }
        if (userInput instanceof UserInput.SignIn) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final String country(UserInput userInput) {
        if (userInput instanceof UserInput.SignUp) {
            return ((UserInput.SignUp) userInput).getCountry();
        }
        if (userInput instanceof UserInput.SignIn) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void clearError() {
        this._errorMessage.setValue(null);
    }

    private final void onError(Throwable error) {
        ResolvableString errorMessage = ErrorsKt.getErrorMessage(error);
        this.logger.error("Error: ", error);
        this._errorMessage.setValue(errorMessage);
    }

    private final SignUpConsentAction toConsentAction(LinkSignupMode linkSignupMode, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        int i = WhenMappings.$EnumSwitchMapping$1[linkSignupMode.ordinal()];
        if (i == 1) {
            if (z) {
                return SignUpConsentAction.ImpliedWithPrefilledEmail;
            }
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            return SignUpConsentAction.Implied;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z4) {
            if (z6 && !z5) {
                return SignUpConsentAction.SignUpOptInMobilePrechecked;
            }
            return SignUpConsentAction.SignUpOptInMobileChecked;
        }
        if (z3) {
            return getDefaultOptInConsentAction(z, z2);
        }
        if (z && z2) {
            return SignUpConsentAction.CheckboxWithPrefilledEmailAndPhone;
        }
        if (z) {
            return SignUpConsentAction.CheckboxWithPrefilledEmail;
        }
        return SignUpConsentAction.Checkbox;
    }

    private final SignUpConsentAction getDefaultOptInConsentAction(boolean hasPrefilledEmail, boolean hasPrefilledPhone) {
        if (hasPrefilledEmail && hasPrefilledPhone) {
            return SignUpConsentAction.DefaultOptInWithAllPrefilled;
        }
        if (hasPrefilledEmail || hasPrefilledPhone) {
            return SignUpConsentAction.DefaultOptInWithSomePrefilled;
        }
        return SignUpConsentAction.DefaultOptInWithNonePrefilled;
    }

    /* compiled from: InlineSignupViewModel.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000eH\u0016¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "initialUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "linkComponent", "Lcom/stripe/android/link/injection/LinkComponent;", "<init>", "(Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/injection/LinkComponent;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements ViewModelProvider.Factory {
        public static final int $stable = 0;
        private final UserInput initialUserInput;
        private final LinkComponent linkComponent;
        private final LinkSignupMode signupMode;

        public Factory(LinkSignupMode signupMode, UserInput userInput, LinkComponent linkComponent) {
            Intrinsics.checkNotNullParameter(signupMode, "signupMode");
            Intrinsics.checkNotNullParameter(linkComponent, "linkComponent");
            this.signupMode = signupMode;
            this.initialUserInput = userInput;
            this.linkComponent = linkComponent;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            InlineSignupViewModel inlineSignupViewModelCreate = this.linkComponent.getInlineSignupViewModelFactory$paymentsheet_release().create(this.signupMode, this.initialUserInput);
            Intrinsics.checkNotNull(inlineSignupViewModelCreate, "null cannot be cast to non-null type T of com.stripe.android.link.ui.inline.InlineSignupViewModel.Factory.create");
            return inlineSignupViewModelCreate;
        }
    }
}
