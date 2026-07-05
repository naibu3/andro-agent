.class public final Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;
.super Ljava/lang/Object;
.source "PaymentSheetAnalyticsListener.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0006\u0010#\u001a\u00020$J\u0012\u0010%\u001a\u00020$2\n\u0010&\u001a\u00060\rj\u0002`\u001aJ\u0010\u0010\'\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0008H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0011H\u0002J\u000e\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0008J\u0010\u0010,\u001a\u00020$2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00118B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0018\u0010\u0014\"\u0004\u0008\u0019\u0010\u0016R4\u0010\u001b\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a2\u000e\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR4\u0010 \u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a2\u000e\u0010\u0010\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u001a8B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008!\u0010\u001d\"\u0004\u0008\"\u0010\u001f\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;",
        "",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
        "currentScreen",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "currentPaymentMethodTypeProvider",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V",
        "value",
        "",
        "previouslySentDeepLinkEvent",
        "getPreviouslySentDeepLinkEvent",
        "()Z",
        "setPreviouslySentDeepLinkEvent",
        "(Z)V",
        "previouslyPresentedSheet",
        "getPreviouslyPresentedSheet",
        "setPreviouslyPresentedSheet",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "previouslyShownForm",
        "getPreviouslyShownForm",
        "()Ljava/lang/String;",
        "setPreviouslyShownForm",
        "(Ljava/lang/String;)V",
        "previouslyInteractedForm",
        "getPreviouslyInteractedForm",
        "setPreviouslyInteractedForm",
        "cannotProperlyReturnFromLinkAndOtherLPMs",
        "",
        "reportFieldInteraction",
        "code",
        "reportPaymentSheetShown",
        "reportPaymentOptions",
        "isSaved",
        "reportPaymentSheetHidden",
        "hiddenScreen",
        "reportFormShown",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$Companion;

.field public static final PREVIOUSLY_INTERACTION_PAYMENT_FORM:Ljava/lang/String; = "previously_interacted_payment_form"

.field public static final PREVIOUSLY_PRESENTED_SHEET:Ljava/lang/String; = "previously_presented_sheet"

.field public static final PREVIOUSLY_SENT_DEEP_LINK_EVENT:Ljava/lang/String; = "previously_sent_deep_link_event"

.field public static final PREVIOUSLY_SHOWN_PAYMENT_FORM:Ljava/lang/String; = "previously_shown_payment_form"


# instance fields
.field private final currentPaymentMethodTypeProvider:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->Companion:Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;Lcom/stripe/android/paymentsheet/analytics/EventReporter;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lcom/stripe/android/paymentsheet/analytics/EventReporter;",
            "Lkotlinx/coroutines/flow/Flow<",
            "+",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "savedStateHandle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentScreen"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentPaymentMethodTypeProvider"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    .line 18
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->currentPaymentMethodTypeProvider:Lkotlin/jvm/functions/Function0;

    .line 45
    new-instance p1, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$1;

    const/4 p2, 0x0

    invoke-direct {p1, p3, p0, p2}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;Lkotlin/coroutines/Continuation;)V

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p4

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public static final synthetic access$reportPaymentSheetShown(Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->reportPaymentSheetShown(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V

    return-void
.end method

.method private final getPreviouslyInteractedForm()Ljava/lang/String;
    .locals 2

    .line 39
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_interacted_payment_form"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final getPreviouslyPresentedSheet()Z
    .locals 2

    .line 27
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_presented_sheet"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final getPreviouslySentDeepLinkEvent()Z
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_sent_deep_link_event"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final getPreviouslyShownForm()Ljava/lang/String;
    .locals 2

    .line 33
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_shown_payment_form"

    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final reportFormShown(Ljava/lang/String;)V
    .locals 1

    .line 128
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->getPreviouslyShownForm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 129
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentMethodFormShown(Ljava/lang/String;)V

    .line 130
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslyShownForm(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final reportPaymentOptions(Z)V
    .locals 1

    .line 101
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->getPreviouslyPresentedSheet()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    .line 103
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowExistingPaymentOptions()V

    goto :goto_0

    .line 105
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowNewPaymentOptions()V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 108
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslyPresentedSheet(Z)V

    return-void
.end method

.method private final reportPaymentSheetShown(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V
    .locals 2

    .line 74
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;

    if-nez v0, :cond_7

    .line 75
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalModeForm;

    if-nez v0, :cond_7

    .line 76
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 79
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$ManageSavedPaymentMethods;

    if-eqz v0, :cond_1

    .line 80
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowManageSavedPaymentMethods()V

    return-void

    .line 82
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$UpdatePaymentMethod;

    if-eqz v0, :cond_2

    .line 83
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onShowEditablePaymentOption()V

    return-void

    .line 85
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    .line 86
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->reportPaymentOptions(Z)V

    const/4 p1, 0x0

    .line 87
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslyShownForm(Ljava/lang/String;)V

    .line 88
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslyInteractedForm(Ljava/lang/String;)V

    return-void

    .line 90
    :cond_3
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalMode;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 91
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->reportPaymentOptions(Z)V

    return-void

    .line 93
    :cond_4
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;

    if-nez v0, :cond_6

    instance-of p1, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;

    if-eqz p1, :cond_5

    goto :goto_0

    .line 73
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 94
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->currentPaymentMethodTypeProvider:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->reportFormShown(Ljava/lang/String;)V

    .line 95
    invoke-direct {p0, v1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->reportPaymentOptions(Z)V

    :cond_7
    :goto_1
    return-void
.end method

.method private final setPreviouslyInteractedForm(Ljava/lang/String;)V
    .locals 2

    .line 41
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_interacted_payment_form"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final setPreviouslyPresentedSheet(Z)V
    .locals 2

    .line 29
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_presented_sheet"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final setPreviouslySentDeepLinkEvent(Z)V
    .locals 2

    .line 23
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_sent_deep_link_event"

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method private final setPreviouslyShownForm(Ljava/lang/String;)V
    .locals 2

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "previously_shown_payment_form"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final cannotProperlyReturnFromLinkAndOtherLPMs()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->getPreviouslySentDeepLinkEvent()Z

    move-result v0

    if-nez v0, :cond_0

    .line 54
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onCannotProperlyReturnFromLinkAndOtherLPMs()V

    const/4 v0, 0x1

    .line 56
    invoke-direct {p0, v0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslySentDeepLinkEvent(Z)V

    :cond_0
    return-void
.end method

.method public final reportFieldInteraction(Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->getPreviouslyInteractedForm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onPaymentMethodFormInteraction(Ljava/lang/String;)V

    .line 68
    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->setPreviouslyInteractedForm(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final reportPaymentSheetHidden(Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;)V
    .locals 1

    const-string v0, "hiddenScreen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    instance-of p1, p1, Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$UpdatePaymentMethod;

    if-eqz p1, :cond_0

    .line 114
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/analytics/PaymentSheetAnalyticsListener;->eventReporter:Lcom/stripe/android/paymentsheet/analytics/EventReporter;

    invoke-interface {p1}, Lcom/stripe/android/paymentsheet/analytics/EventReporter;->onHideEditablePaymentOption()V

    :cond_0
    return-void
.end method
