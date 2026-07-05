.class public final Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;
.super Landroidx/lifecycle/AndroidViewModel;
.source "AutocompleteViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;,
        Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\n\u0008\u0001\u0018\u0000 32\u00020\u0001:\u0005/0123B+\u0008\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020*J\u0006\u0010-\u001a\u00020*J\u0006\u0010.\u001a\u00020*R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000c\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0010\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00150\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00118F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010!\u001a\u00020\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0014\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;",
        "Landroidx/lifecycle/AndroidViewModel;",
        "placesClient",
        "Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;",
        "autocompleteArgs",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;",
        "eventReporter",
        "Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;",
        "application",
        "Landroid/app/Application;",
        "<init>",
        "(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V",
        "_predictions",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
        "predictions",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getPredictions",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_loading",
        "",
        "loading",
        "getLoading",
        "_event",
        "Lkotlinx/coroutines/flow/MutableSharedFlow;",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
        "event",
        "Lkotlinx/coroutines/flow/SharedFlow;",
        "getEvent",
        "()Lkotlinx/coroutines/flow/SharedFlow;",
        "config",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
        "textFieldController",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "getTextFieldController",
        "()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;",
        "queryFlow",
        "",
        "debouncer",
        "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;",
        "selectPrediction",
        "",
        "prediction",
        "onBackPressed",
        "onEnterAddressManually",
        "clearQuery",
        "Debouncer",
        "Factory",
        "Event",
        "Args",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

.field public static final MAX_DISPLAYED_RESULTS:I = 0x4

.field public static final MIN_CHARS_AUTOCOMPLETE:I = 0x3

.field public static final SEARCH_DEBOUNCE_MS:J = 0x3e8L


# instance fields
.field private final _event:Lkotlinx/coroutines/flow/MutableSharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableSharedFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
            ">;"
        }
    .end annotation
.end field

.field private final _loading:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final _predictions:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;"
        }
    .end annotation
.end field

.field private final autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

.field private final config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

.field private final debouncer:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

.field private final event:Lkotlinx/coroutines/flow/SharedFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
            ">;"
        }
    .end annotation
.end field

.field private final eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

.field private final placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

.field private final queryFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;


# direct methods
.method public static synthetic $r8$lambda$0q3m7KJO2vzVm-HEJZxxkw44Er8(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_init_$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->Companion:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;Landroid/app/Application;)V
    .locals 10
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "autocompleteArgs"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventReporter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "application"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0, p4}, Landroidx/lifecycle/AndroidViewModel;-><init>(Landroid/app/Application;)V

    .line 37
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    .line 38
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    .line 39
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->eventReporter:Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;

    const/4 p1, 0x0

    .line 42
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 p4, 0x0

    .line 46
    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 v0, 0x7

    .line 50
    invoke-static {p4, p4, p1, v0, p1}, Lkotlinx/coroutines/flow/SharedFlowKt;->MutableSharedFlow$default(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/MutableSharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_event:Lkotlinx/coroutines/flow/MutableSharedFlow;

    .line 51
    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->asSharedFlow(Lkotlinx/coroutines/flow/MutableSharedFlow;)Lkotlinx/coroutines/flow/SharedFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->event:Lkotlinx/coroutines/flow/SharedFlow;

    .line 53
    new-instance v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    .line 54
    sget v0, Lcom/stripe/android/uicore/R$string;->stripe_address_label_address:I

    new-array p4, p4, [Ljava/lang/Object;

    const/4 v2, 0x4

    invoke-static {v0, p4, p1, v2, p1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    .line 55
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 53
    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    .line 58
    new-instance v2, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 60
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 62
    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->debouncer:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;

    .line 66
    move-object v1, p0

    check-cast v1, Landroidx/lifecycle/ViewModel;

    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v2

    .line 65
    new-instance v3, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v3, p0}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)V

    invoke-virtual {v0, v2, p4, v3}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Debouncer;->startWatching(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)V

    .line 87
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v4

    new-instance p4, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2;

    invoke-direct {p4, p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$2;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v7, p4

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 104
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;->getCountry()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 105
    invoke-interface {p3, p1}, Lcom/stripe/android/paymentsheet/addresselement/analytics/AddressLauncherEventReporter;->onShow(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final _init_$lambda$0(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$1$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$1$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 85
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$getAutocompleteArgs$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->autocompleteArgs:Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Args;

    return-object p0
.end method

.method public static final synthetic access$getConfig$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->config:Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    return-object p0
.end method

.method public static final synthetic access$getPlacesClient$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->placesClient:Lcom/stripe/android/ui/core/elements/autocomplete/PlacesClientProxy;

    return-object p0
.end method

.method public static final synthetic access$getQueryFlow$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->queryFlow:Lkotlinx/coroutines/flow/StateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_event$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lkotlinx/coroutines/flow/MutableSharedFlow;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_event:Lkotlinx/coroutines/flow/MutableSharedFlow;

    return-object p0
.end method

.method public static final synthetic access$get_loading$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method

.method public static final synthetic access$get_predictions$p(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object p0
.end method


# virtual methods
.method public final clearQuery()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 168
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:Lkotlinx/coroutines/flow/MutableStateFlow;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getEvent()Lkotlinx/coroutines/flow/SharedFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/SharedFlow<",
            "Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$Event;",
            ">;"
        }
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->event:Lkotlinx/coroutines/flow/SharedFlow;

    return-object v0
.end method

.method public final getLoading()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_loading:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPredictions()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;",
            ">;>;"
        }
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->_predictions:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getTextFieldController()Lcom/stripe/android/uicore/elements/SimpleTextFieldController;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;->textFieldController:Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    return-object v0
.end method

.method public final onBackPressed()V
    .locals 7

    .line 143
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$onBackPressed$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$onBackPressed$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final onEnterAddressManually()V
    .locals 7

    .line 149
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$onEnterAddressManually$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$onEnterAddressManually$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method

.method public final selectPrediction(Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;)V
    .locals 7

    const-string v0, "prediction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    move-object v0, p0

    check-cast v0, Landroidx/lifecycle/ViewModel;

    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v1

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel$selectPrediction$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AutocompleteViewModel;Lcom/stripe/android/ui/core/elements/autocomplete/model/AutocompletePrediction;Lkotlin/coroutines/Continuation;)V

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void
.end method
