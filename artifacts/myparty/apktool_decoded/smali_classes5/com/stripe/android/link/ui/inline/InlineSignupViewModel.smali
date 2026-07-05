.class public final Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "InlineSignupViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$Factory;,
        Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nInlineSignupViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,403:1\n1#2:404\n230#3,5:405\n230#3,5:410\n230#3,5:415\n230#3,5:420\n230#3,5:425\n230#3,5:430\n230#3,5:435\n*S KotlinDebug\n*F\n+ 1 InlineSignupViewModel.kt\ncom/stripe/android/link/ui/inline/InlineSignupViewModel\n*L\n152#1:405,5\n167#1:410,5\n199#1:415,5\n277#1:420,5\n285#1:425,5\n295#1:430,5\n207#1:435,5\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001:\u0001dBC\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011B?\u0008\u0017\u0012\n\u0008\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0012J\u0006\u0010F\u001a\u00020GJ\u0006\u0010H\u001a\u00020GJ\u0008\u0010I\u001a\u00020GH\u0002J\u000e\u0010J\u001a\u00020GH\u0082@\u00a2\u0006\u0002\u0010KJ\u0018\u0010L\u001a\u00020G2\u0008\u0008\u0002\u0010M\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0002\u0010NJ0\u0010O\u001a\u0004\u0018\u00010\u00032\u0008\u0010P\u001a\u0004\u0018\u00010\u001a2\u0008\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0008\u0010R\u001a\u0004\u0018\u00010\u001a2\u0006\u0010S\u001a\u00020\u0018H\u0002J\u0016\u0010T\u001a\u00020G2\u0006\u0010P\u001a\u00020\u001aH\u0082@\u00a2\u0006\u0002\u0010UJ\u000c\u0010P\u001a\u00020\u001a*\u00020\u0003H\u0002J\u000e\u0010V\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\u000e\u0010R\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\u000e\u0010W\u001a\u0004\u0018\u00010\u001a*\u00020\u0003H\u0002J\u0008\u0010X\u001a\u00020GH\u0002J\u0010\u0010Y\u001a\u00020G2\u0006\u0010Z\u001a\u00020[H\u0002J<\u0010\\\u001a\u00020]*\u00020\u00052\u0006\u0010^\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u00182\u0006\u0010`\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\u00182\u0006\u0010S\u001a\u00020\u00182\u0006\u0010b\u001a\u00020\u0018H\u0002J\u0018\u0010c\u001a\u00020]2\u0006\u0010^\u001a\u00020\u00182\u0006\u0010_\u001a\u00020\u0018H\u0002R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001f0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u000e\u0010&\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010-\u001a\u00020.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0011\u00101\u001a\u000202\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0011\u00105\u001a\u00020.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00100R\u0011\u00107\u001a\u000208\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0016\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010%R\u0011\u0010B\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\u0008C\u0010DR\u000e\u0010E\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006e"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "initialUserInput",
        "Lcom/stripe/android/link/ui/inline/UserInput;",
        "signupMode",
        "Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "config",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "linkAccountManager",
        "Lcom/stripe/android/link/account/LinkAccountManager;",
        "linkEventsReporter",
        "Lcom/stripe/android/link/analytics/LinkEventsReporter;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "lookupDelay",
        "",
        "<init>",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;J)V",
        "(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V",
        "getInitialUserInput",
        "()Lcom/stripe/android/link/ui/inline/UserInput;",
        "getSignupMode",
        "()Lcom/stripe/android/link/ui/inline/LinkSignupMode;",
        "hasInitialUserInput",
        "",
        "initialEmail",
        "",
        "initialPhone",
        "initialName",
        "initialCountry",
        "initialViewState",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "_viewState",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "viewState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getViewState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "showOptionalLabel",
        "prefillEligibleFields",
        "",
        "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
        "prefilledEmail",
        "prefilledPhone",
        "prefilledName",
        "emailController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getEmailController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "phoneController",
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "getPhoneController",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "nameController",
        "getNameController",
        "sectionController",
        "Lcom/stripe/android/uicore/elements/SectionController;",
        "getSectionController",
        "()Lcom/stripe/android/uicore/elements/SectionController;",
        "consumerEmail",
        "consumerPhoneNumber",
        "consumerName",
        "_errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "errorMessage",
        "getErrorMessage",
        "requiresNameCollection",
        "getRequiresNameCollection",
        "()Z",
        "hasExpanded",
        "toggleExpanded",
        "",
        "changeSignupDetails",
        "watchUserInput",
        "watchPhoneInput",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "watchEmailInput",
        "dropFirst",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "mapToUserInput",
        "email",
        "phoneNumber",
        "name",
        "userHasInteracted",
        "lookupConsumerEmail",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "phone",
        "country",
        "clearError",
        "onError",
        "error",
        "",
        "toConsentAction",
        "Lcom/stripe/android/link/ui/inline/SignUpConsentAction;",
        "hasPrefilledEmail",
        "hasPrefilledPhone",
        "defaultOptIn",
        "linkSignUpOptInFeatureEnabled",
        "linkSignUpInitialValue",
        "getDefaultOptInConsentAction",
        "Factory",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _errorMessage:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final _viewState:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/link/LinkConfiguration;

.field private final consumerEmail:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final consumerName:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final consumerPhoneNumber:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final errorMessage:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private hasExpanded:Z

.field private final hasInitialUserInput:Z

.field private final initialCountry:Ljava/lang/String;

.field private final initialEmail:Ljava/lang/String;

.field private final initialName:Ljava/lang/String;

.field private final initialPhone:Ljava/lang/String;

.field private final initialUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

.field private final initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

.field private final linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

.field private final linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

.field private final logger:Lcom/stripe/android/core/Logger;

.field private final lookupDelay:J

.field private final nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

.field private final phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

.field private final prefillEligibleFields:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/stripe/android/link/ui/inline/LinkSignupField;",
            ">;"
        }
    .end annotation
.end field

.field private final prefilledEmail:Ljava/lang/String;

.field private final prefilledName:Ljava/lang/String;

.field private final prefilledPhone:Ljava/lang/String;

.field private final sectionController:Lcom/stripe/android/uicore/elements/SectionController;

.field private final showOptionalLabel:Z

.field private final signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

.field private final viewState:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$L21dfo1jWskIJeWI0cV0A8O3O_w(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName$lambda$9(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$PEpsEcs26WOqnOob2nV50JI4jpI(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchEmailInput$lambda$14(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$crnXpdMieHvbHlReot7iJ7Q4lWw(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail$lambda$5(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$dzGOJ5gg1vk8lE4p1ieFrtwO-tI(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber$lambda$7(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;)V
    .locals 10
    .param p1    # Lcom/stripe/android/link/ui/inline/UserInput;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .param p2    # Lcom/stripe/android/link/ui/inline/LinkSignupMode;
        .annotation runtime Ldagger/assisted/Assisted;
        .end annotation
    .end param
    .annotation runtime Ldagger/assisted/AssistedInject;
    .end annotation

    const-string v0, "signupMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "config"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkAccountManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkEventsReporter"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v8, 0x3e8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    .line 55
    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;J)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;J)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "signupMode"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "config"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkAccountManager"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "linkEventsReporter"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    invoke-direct {v0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 39
    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

    .line 40
    iput-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    .line 41
    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->config:Lcom/stripe/android/link/LinkConfiguration;

    .line 42
    iput-object v4, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    .line 43
    iput-object v5, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    .line 44
    iput-object v6, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    move-wide/from16 v4, p7

    .line 45
    iput-wide v4, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->lookupDelay:J

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_0

    move v9, v7

    goto :goto_0

    :cond_0
    move v9, v8

    .line 65
    :goto_0
    iput-boolean v9, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasInitialUserInput:Z

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    .line 67
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->email(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v10

    :goto_1
    iput-object v4, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialEmail:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 68
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phone(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v10

    :goto_2
    iput-object v5, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialPhone:Ljava/lang/String;

    if-eqz v1, :cond_3

    .line 69
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->name(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;

    move-result-object v6

    move-object v11, v6

    goto :goto_3

    :cond_3
    move-object v11, v10

    :goto_3
    iput-object v11, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialName:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 70
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->country(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_4

    :cond_4
    move-object v12, v10

    :goto_4
    iput-object v12, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialCountry:Ljava/lang/String;

    .line 72
    sget-object v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->Companion:Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;

    .line 77
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkConfiguration;->getLinkSignUpOptInFeatureEnabled()Z

    move-result v6

    if-eqz v6, :cond_5

    .line 78
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkConfiguration;->getLinkSignUpOptInInitialValue()Z

    move-result v6

    goto :goto_5

    :cond_5
    move v6, v9

    .line 72
    :goto_5
    invoke-virtual/range {v1 .. v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState$Companion;->create(Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 83
    invoke-static {v1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 84
    check-cast v3, Lkotlinx/coroutines/flow/StateFlow;

    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    .line 86
    sget-object v3, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->AlongsideSaveForFutureUse:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    if-ne v2, v3, :cond_6

    move v2, v7

    goto :goto_6

    :cond_6
    move v2, v8

    :goto_6
    iput-boolean v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->showOptionalLabel:Z

    .line 87
    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getPrefillEligibleFields()Ljava/util/Set;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefillEligibleFields:Ljava/util/Set;

    .line 89
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getEmail()Ljava/lang/String;

    move-result-object v6

    sget-object v13, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Email:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    invoke-interface {v3, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_7

    goto :goto_7

    :cond_7
    move-object v6, v10

    :goto_7
    iput-object v6, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledEmail:Ljava/lang/String;

    .line 90
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getPhone()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Phone:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    invoke-interface {v3, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    goto :goto_8

    :cond_8
    move-object v13, v10

    :goto_8
    if-nez v13, :cond_9

    const-string v13, ""

    :cond_9
    iput-object v13, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledPhone:Ljava/lang/String;

    .line 91
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v14

    invoke-virtual {v14}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getName()Ljava/lang/String;

    move-result-object v14

    sget-object v15, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Name:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    invoke-interface {v3, v15}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_9

    :cond_a
    move-object v14, v10

    :goto_9
    iput-object v14, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledName:Ljava/lang/String;

    .line 93
    sget-object v3, Lcom/stripe/android/uicore/elements/EmailConfig;->Companion:Lcom/stripe/android/uicore/elements/EmailConfig$Companion;

    if-nez v4, :cond_b

    move-object v4, v6

    .line 95
    :cond_b
    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isShowingEmailFirst()Z

    move-result v6

    if-eqz v6, :cond_c

    if-eqz v2, :cond_c

    move v6, v7

    goto :goto_a

    :cond_c
    move v6, v8

    .line 93
    :goto_a
    invoke-virtual {v3, v4, v6}, Lcom/stripe/android/uicore/elements/EmailConfig$Companion;->createController(Ljava/lang/String;Z)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 98
    sget-object v15, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    if-nez v5, :cond_d

    move-object/from16 v16, v13

    goto :goto_b

    :cond_d
    move-object/from16 v16, v5

    :goto_b
    if-nez v12, :cond_e

    .line 100
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getCustomerInfo()Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;->getBillingCountryCode()Ljava/lang/String;

    move-result-object v12

    :cond_e
    move-object/from16 v17, v12

    .line 101
    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isShowingPhoneFirst()Z

    move-result v1

    if-eqz v1, :cond_f

    if-eqz v2, :cond_f

    move/from16 v19, v7

    goto :goto_c

    :cond_f
    move/from16 v19, v8

    :goto_c
    const/16 v21, 0x14

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    .line 98
    invoke-static/range {v15 .. v22}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    .line 104
    sget-object v2, Lcom/stripe/android/uicore/elements/NameConfig;->Companion:Lcom/stripe/android/uicore/elements/NameConfig$Companion;

    if-nez v11, :cond_10

    move-object v11, v14

    :cond_10
    invoke-virtual {v2, v11}, Lcom/stripe/android/uicore/elements/NameConfig$Companion;->createController(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 111
    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getRequiresNameCollection()Z

    move-result v4

    if-eqz v4, :cond_11

    move-object v4, v2

    goto :goto_d

    :cond_11
    move-object v4, v10

    :goto_d
    filled-new-array {v3, v1, v4}, [Ljava/lang/Object;

    move-result-object v4

    .line 108
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 106
    new-instance v5, Lcom/stripe/android/uicore/elements/SectionController;

    invoke-direct {v5, v10, v4}, Lcom/stripe/android/uicore/elements/SectionController;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V

    iput-object v5, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->sectionController:Lcom/stripe/android/uicore/elements/SectionController;

    .line 119
    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    new-instance v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v3, v4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:Lkotlinx/coroutines/flow/StateFlow;

    .line 127
    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda2;

    invoke-direct {v3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {v1, v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:Lkotlinx/coroutines/flow/StateFlow;

    .line 133
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda3;

    invoke-direct {v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v1, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName:Lkotlinx/coroutines/flow/StateFlow;

    .line 135
    invoke-static {v10}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 136
    invoke-static {v1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->errorMessage:Lkotlinx/coroutines/flow/StateFlow;

    .line 141
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getLinkSignUpOptInFeatureEnabled()Z

    move-result v1

    if-eqz v1, :cond_12

    .line 142
    invoke-virtual/range {p3 .. p3}, Lcom/stripe/android/link/LinkConfiguration;->getLinkSignUpOptInInitialValue()Z

    move-result v9

    .line 141
    :cond_12
    iput-boolean v9, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasExpanded:Z

    .line 148
    invoke-direct {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchUserInput()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    and-int/lit8 v0, p9, 0x40

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x3e8

    move-wide v9, v0

    goto :goto_0

    :cond_0
    move-wide/from16 v9, p7

    :goto_0
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    .line 38
    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;-><init>(Lcom/stripe/android/link/ui/inline/UserInput;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/account/LinkAccountManager;Lcom/stripe/android/link/analytics/LinkEventsReporter;Lcom/stripe/android/core/Logger;J)V

    return-void
.end method

.method public static final synthetic access$getConsumerEmail$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getConsumerName$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getConsumerPhoneNumber$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$getInitialViewState$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    return-object p0
.end method

.method public static final synthetic access$getLookupDelay$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)J
    .locals 2

    .line 38
    iget-wide v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->lookupDelay:J

    return-wide v0
.end method

.method public static final synthetic access$get_viewState$p(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 38
    iget-object p0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$lookupConsumerEmail(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$mapToUserInput(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$watchEmailInput(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchEmailInput(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$watchPhoneInput(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 38
    invoke-direct {p0, p1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchPhoneInput(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final clearError()V
    .locals 2

    .line 337
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final consumerEmail$lambda$5(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private static final consumerName$lambda$9(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private static final consumerPhoneNumber$lambda$7(Lcom/stripe/android/uicore/forms/FormFieldEntry;)Ljava/lang/String;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method private final country(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;
    .locals 1

    .line 331
    instance-of v0, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getCountry()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 332
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 330
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final email(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;
    .locals 1

    .line 310
    instance-of v0, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getEmail()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 311
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;->getEmail()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 309
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getDefaultOptInConsentAction(ZZ)Lcom/stripe/android/link/ui/inline/SignUpConsentAction;
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 385
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->DefaultOptInWithAllPrefilled:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    :cond_0
    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 389
    :cond_1
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->DefaultOptInWithNonePrefilled:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    .line 387
    :cond_2
    :goto_0
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->DefaultOptInWithSomePrefilled:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1
.end method

.method private final lookupConsumerEmail(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    instance-of v3, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    iget v4, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v2, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    sub-int/2addr v2, v5

    iput v2, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;

    invoke-direct {v3, v0, v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v2, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 268
    iget v5, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/4 v6, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v3, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast v2, Lkotlin/Result;

    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 269
    invoke-direct {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->clearError()V

    .line 270
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkAccountManager:Lcom/stripe/android/link/account/LinkAccountManager;

    iput-object v0, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->L$1:Ljava/lang/Object;

    iput v6, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$lookupConsumerEmail$1;->label:I

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-interface {v2, v1, v5, v7, v3}, Lcom/stripe/android/link/account/LinkAccountManager;->lookupConsumer-BWLJW6A(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_3

    return-object v4

    :cond_3
    move-object v3, v0

    .line 274
    :goto_1
    invoke-static {v2}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v4

    if-nez v4, :cond_7

    check-cast v2, Lcom/stripe/android/link/model/LinkAccount;

    if-eqz v2, :cond_5

    .line 277
    iget-object v2, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 421
    :cond_4
    invoke-interface {v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v3

    .line 422
    move-object v4, v3

    check-cast v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 279
    new-instance v5, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    invoke-direct {v5, v1}, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;-><init>(Ljava/lang/String;)V

    .line 280
    sget-object v15, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    .line 279
    check-cast v5, Lcom/stripe/android/link/ui/inline/UserInput;

    const/16 v17, 0x9fe

    const/16 v18, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    .line 278
    invoke-static/range {v4 .. v18}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v4

    .line 423
    invoke-interface {v2, v3, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    .line 285
    :cond_5
    iget-object v1, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 426
    :cond_6
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 427
    move-object v7, v2

    check-cast v7, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 287
    sget-object v18, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    const/16 v20, 0x9ff

    const/16 v21, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    .line 286
    invoke-static/range {v7 .. v21}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v4

    .line 428
    invoke-interface {v1, v2, v4}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 291
    iget-object v1, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v1, v6}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onSignupStarted(Z)V

    goto :goto_2

    .line 295
    :cond_7
    iget-object v1, v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 431
    :cond_8
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 432
    move-object v5, v2

    check-cast v5, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 297
    sget-object v16, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingPrimaryField:Lcom/stripe/android/link/ui/signup/SignUpState;

    .line 298
    instance-of v15, v4, Lcom/stripe/android/core/exception/APIConnectionException;

    const/16 v18, 0x9ff

    const/16 v19, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    .line 296
    invoke-static/range {v5 .. v19}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v5

    .line 433
    invoke-interface {v1, v2, v5}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    if-nez v15, :cond_9

    .line 302
    invoke-direct {v3, v4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->onError(Ljava/lang/Throwable;)V

    .line 306
    :cond_9
    :goto_2
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 16

    move-object/from16 v0, p0

    .line 243
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getSignupMode()Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    move-result-object v1

    .line 244
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getLinkSignUpOptInFeatureEnabled()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    const/4 v8, 0x0

    if-eqz p1, :cond_6

    if-eqz v2, :cond_6

    if-eqz v1, :cond_6

    .line 247
    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getRequiresNameCollection()Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v2, p3

    check-cast v2, Ljava/lang/CharSequence;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_3

    :cond_2
    move v9, v3

    goto :goto_2

    :cond_3
    move v9, v4

    .line 248
    :goto_2
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryCode()Ljava/lang/String;

    move-result-object v13

    .line 249
    new-instance v10, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    .line 255
    iget-object v2, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledEmail:Ljava/lang/String;

    if-eqz v2, :cond_4

    move v2, v4

    goto :goto_3

    :cond_4
    move v2, v3

    .line 256
    :goto_3
    iget-object v3, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->prefilledPhone:Ljava/lang/String;

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/2addr v3, v4

    .line 257
    iget-object v4, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v4}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getAllowsDefaultOptIn()Z

    move-result v4

    .line 258
    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v5}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getLinkSignUpOptInFeatureEnabled()Z

    move-result v5

    .line 259
    iget-object v6, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->config:Lcom/stripe/android/link/LinkConfiguration;

    invoke-virtual {v6}, Lcom/stripe/android/link/LinkConfiguration;->getLinkSignUpOptInInitialValue()Z

    move-result v7

    move/from16 v6, p4

    .line 254
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->toConsentAction(Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZZZZZZ)Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    move-result-object v15

    move-object/from16 v11, p1

    move-object/from16 v12, p2

    move-object/from16 v14, p3

    .line 249
    invoke-direct/range {v10 .. v15}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/SignUpConsentAction;)V

    if-eqz v9, :cond_5

    move-object v8, v10

    .line 262
    :cond_5
    check-cast v8, Lcom/stripe/android/link/ui/inline/UserInput;

    :cond_6
    return-object v8
.end method

.method private final name(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;
    .locals 1

    .line 324
    instance-of v0, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 325
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 323
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final onError(Ljava/lang/Throwable;)V
    .locals 3

    .line 340
    invoke-static {p1}, Lcom/stripe/android/link/utils/ErrorsKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 341
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->logger:Lcom/stripe/android/core/Logger;

    const-string v2, "Error: "

    invoke-interface {v1, v2, p1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    iget-object p1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_errorMessage:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final phone(Lcom/stripe/android/link/ui/inline/UserInput;)Ljava/lang/String;
    .locals 1

    .line 317
    instance-of v0, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/UserInput$SignUp;->getPhone()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 318
    :cond_0
    instance-of p1, p1, Lcom/stripe/android/link/ui/inline/UserInput$SignIn;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 316
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toConsentAction(Lcom/stripe/android/link/ui/inline/LinkSignupMode;ZZZZZZ)Lcom/stripe/android/link/ui/inline/SignUpConsentAction;
    .locals 1

    .line 353
    sget-object v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Lcom/stripe/android/link/ui/inline/LinkSignupMode;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    if-eqz p5, :cond_1

    if-eqz p7, :cond_0

    if-nez p6, :cond_0

    .line 364
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->SignUpOptInMobilePrechecked:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    .line 366
    :cond_0
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->SignUpOptInMobileChecked:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    :cond_1
    if-eqz p4, :cond_2

    .line 369
    invoke-direct {p0, p2, p3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->getDefaultOptInConsentAction(ZZ)Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    move-result-object p1

    return-object p1

    :cond_2
    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    .line 371
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->CheckboxWithPrefilledEmailAndPhone:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    :cond_3
    if-eqz p2, :cond_4

    .line 373
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->CheckboxWithPrefilledEmail:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    .line 375
    :cond_4
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->Checkbox:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    .line 353
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    if-ne p2, v0, :cond_7

    .line 356
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->ImpliedWithPrefilledEmail:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    :cond_7
    if-nez p2, :cond_8

    .line 357
    sget-object p1, Lcom/stripe/android/link/ui/inline/SignUpConsentAction;->Implied:Lcom/stripe/android/link/ui/inline/SignUpConsentAction;

    return-object p1

    .line 355
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final watchEmailInput(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 205
    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;)V

    .line 226
    iget-object v1, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:Lkotlinx/coroutines/flow/StateFlow;

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    invoke-static {v1, p1}, Lkotlinx/coroutines/flow/FlowKt;->drop(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    new-instance v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchEmailInput$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchEmailInput$2;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {p1, v1, p2}, Lkotlinx/coroutines/flow/FlowKt;->collectLatest(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method static synthetic watchEmailInput$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    .line 204
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->watchEmailInput(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final watchEmailInput$lambda$14(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lcom/stripe/android/link/ui/signup/SignUpState;)Lkotlin/Unit;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "signUpState"

    move-object/from16 v13, p1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    invoke-direct {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->clearError()V

    .line 207
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 436
    :goto_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    .line 437
    move-object v2, v3

    check-cast v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 210
    sget-object v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v13}, Lcom/stripe/android/link/ui/signup/SignUpState;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_1

    const/4 v5, 0x2

    if-eq v4, v5, :cond_1

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    .line 214
    iget-object v4, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerEmail:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v4}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 215
    iget-object v5, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v5}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 216
    iget-object v6, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerName:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v6}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 217
    invoke-virtual {v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUserHasInteracted$paymentsheet_release()Z

    move-result v7

    .line 213
    invoke-direct {v0, v4, v5, v6, v7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->mapToUserInput(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object v4

    goto :goto_1

    .line 210
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    .line 211
    :cond_1
    invoke-virtual {v2}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getUserInput()Lcom/stripe/android/link/ui/inline/UserInput;

    move-result-object v4

    :goto_1
    const/16 v15, 0xbfe

    const/16 v16, 0x0

    move-object v5, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v0, v17

    .line 208
    invoke-static/range {v2 .. v16}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v2

    .line 438
    invoke-interface {v1, v0, v2}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 222
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v13, p1

    goto :goto_0
.end method

.method private final watchPhoneInput(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;

    iget v3, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v1, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->label:I

    sub-int/2addr v1, v4

    iput v1, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;

    invoke-direct {v2, v0, v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object v1, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v3

    .line 197
    iget v4, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 198
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->consumerPhoneNumber:Lkotlinx/coroutines/flow/StateFlow;

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    new-instance v4, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$2;

    const/4 v6, 0x0

    invoke-direct {v4, v6}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$2;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v4, Lkotlin/jvm/functions/Function2;

    iput-object v0, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->L$0:Ljava/lang/Object;

    iput v5, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchPhoneInput$1;->label:I

    invoke-static {v1, v4, v2}, Lkotlinx/coroutines/flow/FlowKt;->first(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    move-object v2, v0

    .line 199
    :goto_1
    iget-object v1, v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 416
    :cond_4
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 417
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 200
    sget-object v14, Lcom/stripe/android/link/ui/signup/SignUpState;->InputtingRemainingFields:Lcom/stripe/android/link/ui/signup/SignUpState;

    const/16 v16, 0xbff

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v3 .. v17}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v3

    .line 418
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 202
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method

.method private final watchUserInput()V
    .locals 14

    .line 173
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1;

    const/4 v7, 0x0

    invoke-direct {v2, p0, v7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$1;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 182
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v8

    new-instance v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$2;

    invoke-direct {v0, p0, v7}, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel$watchUserInput$2;-><init>(Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v11, v0

    check-cast v11, Lkotlin/jvm/functions/Function2;

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method


# virtual methods
.method public final changeSignupDetails()V
    .locals 18

    move-object/from16 v0, p0

    .line 167
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 411
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 412
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    const/16 v16, 0xf7f

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    .line 168
    invoke-static/range {v3 .. v17}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v3

    .line 413
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void
.end method

.method public final getEmailController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->emailController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getErrorMessage()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 136
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->errorMessage:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getInitialUserInput()Lcom/stripe/android/link/ui/inline/UserInput;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialUserInput:Lcom/stripe/android/link/ui/inline/UserInput;

    return-object v0
.end method

.method public final getNameController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->nameController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final getPhoneController()Lcom/stripe/android/uicore/elements/PhoneNumberController;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->phoneController:Lcom/stripe/android/uicore/elements/PhoneNumberController;

    return-object v0
.end method

.method public final getRequiresNameCollection()Z
    .locals 2

    .line 139
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->initialViewState:Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v0}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->getFields()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/link/ui/inline/LinkSignupField;->Name:Lcom/stripe/android/link/ui/inline/LinkSignupField;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final getSectionController()Lcom/stripe/android/uicore/elements/SectionController;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->sectionController:Lcom/stripe/android/uicore/elements/SectionController;

    return-object v0
.end method

.method public final getSignupMode()Lcom/stripe/android/link/ui/inline/LinkSignupMode;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->signupMode:Lcom/stripe/android/link/ui/inline/LinkSignupMode;

    return-object v0
.end method

.method public final getViewState()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->viewState:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final toggleExpanded()V
    .locals 19

    move-object/from16 v0, p0

    .line 152
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 406
    :cond_0
    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 407
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    .line 154
    invoke-virtual {v3}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$paymentsheet_release()Z

    move-result v4

    const/4 v5, 0x1

    xor-int/lit8 v12, v4, 0x1

    const/16 v16, 0x6ff

    const/16 v17, 0x0

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const/4 v15, 0x1

    .line 153
    invoke-static/range {v3 .. v17}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->copy$default(Lcom/stripe/android/link/ui/inline/InlineSignupViewState;Lcom/stripe/android/link/ui/inline/UserInput;Ljava/lang/String;Lcom/stripe/android/link/ui/inline/LinkSignupMode;Ljava/util/List;Ljava/util/Set;ZZZZZLcom/stripe/android/link/ui/signup/SignUpState;ZILjava/lang/Object;)Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    move-result-object v3

    .line 408
    invoke-interface {v1, v2, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 160
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->_viewState:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {v1}, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;->isExpanded$paymentsheet_release()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasExpanded:Z

    if-nez v1, :cond_1

    const/4 v15, 0x1

    .line 161
    iput-boolean v15, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->hasExpanded:Z

    .line 162
    iget-object v1, v0, Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;->linkEventsReporter:Lcom/stripe/android/link/analytics/LinkEventsReporter;

    invoke-interface {v1}, Lcom/stripe/android/link/analytics/LinkEventsReporter;->onInlineSignupCheckboxChecked()V

    :cond_1
    return-void
.end method
