.class public final Lcom/stripe/android/paymentsheet/forms/FormViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "FormViewModel.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/forms/FormViewModel$Factory;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFormViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 7 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 8 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,124:1\n808#2,11:125\n1368#2:136\n1454#2,5:137\n808#2,11:142\n1557#2:163\n1628#2,3:164\n1557#2:180\n1628#2,3:181\n543#2,6:191\n49#3:153\n51#3:157\n49#3:158\n51#3:162\n46#4:154\n51#4:156\n46#4:159\n51#4:161\n105#5:155\n105#5:160\n105#5:178\n105#5:190\n203#6,5:167\n211#6:179\n283#7:172\n284#7:177\n283#7:184\n284#7:189\n37#8:173\n36#8,3:174\n37#8:185\n36#8,3:186\n*S KotlinDebug\n*F\n+ 1 FormViewModel.kt\ncom/stripe/android/paymentsheet/forms/FormViewModel\n*L\n50#1:125,11\n51#1:136\n51#1:137,5\n52#1:142,11\n111#1:163\n111#1:164,3\n102#1:180\n102#1:181,3\n119#1:191,6\n76#1:153\n76#1:157\n91#1:158\n91#1:162\n76#1:154\n76#1:156\n91#1:159\n91#1:161\n76#1:155\n91#1:160\n111#1:178\n101#1:190\n111#1:167,5\n111#1:179\n111#1:172\n111#1:177\n101#1:184\n101#1:189\n111#1:173\n111#1:174,3\n101#1:185\n101#1:186,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0001(B\u001d\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u0013\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0001\u00a2\u0006\u0002\u0008\u0016J \u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020$0#0\u00030\u001cH\u0002R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00110\u0018X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u001a\u0010%\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00120\u00030\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0018\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u001a\u00a8\u0006)"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/forms/FormViewModel;",
        "Landroidx/lifecycle/ViewModel;",
        "elements",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "formArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "<init>",
        "(Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V",
        "getElements",
        "()Ljava/util/List;",
        "getFormArguments",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "cardBillingElement",
        "Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;",
        "externalHiddenIdentifiers",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "addHiddenIdentifiers",
        "",
        "identifierSpecs",
        "addHiddenIdentifiers$paymentsheet_release",
        "hiddenIdentifiers",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "getHiddenIdentifiers$paymentsheet_release",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "userRequestedReuse",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
        "completeFormValues",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "getCompleteFormValues",
        "()Lkotlinx/coroutines/flow/Flow;",
        "currentFieldValues",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "textFieldControllerIdsFlow",
        "lastTextFieldIdentifier",
        "getLastTextFieldIdentifier",
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
.field private final cardBillingElement:Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

.field private final completeFormValues:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation
.end field

.field private final elements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field

.field private externalHiddenIdentifiers:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field private final hiddenIdentifiers:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final textFieldControllerIdsFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field

.field private final userRequestedReuse:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$9XUL8lfEP5EG0Ro6hSoT5T1h2YA(Ljava/util/Set;Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->lastTextFieldIdentifier$lambda$12(Ljava/util/Set;Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$CwCRFgeoOs55b8YAXE0lA4hvgP8(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers$lambda$1(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            ")V"
        }
    .end annotation

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formArguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elements:Ljava/util/List;

    .line 34
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    .line 50
    check-cast p1, Ljava/lang/Iterable;

    .line 125
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 134
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/uicore/elements/SectionElement;

    if-eqz v1, :cond_0

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 135
    :cond_1
    check-cast p2, Ljava/util/List;

    .line 125
    check-cast p2, Ljava/lang/Iterable;

    .line 136
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    check-cast p1, Ljava/util/Collection;

    .line 137
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 138
    check-cast v0, Lcom/stripe/android/uicore/elements/SectionElement;

    .line 51
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/SectionElement;->getFields()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 139
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    goto :goto_1

    .line 141
    :cond_2
    check-cast p1, Ljava/util/List;

    .line 136
    check-cast p1, Ljava/lang/Iterable;

    .line 142
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/util/Collection;

    .line 151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    if-eqz v1, :cond_3

    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 152
    :cond_4
    check-cast p2, Ljava/util/List;

    .line 53
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->cardBillingElement:Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;

    .line 55
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p2

    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 58
    move-object p2, p0

    check-cast p2, Landroidx/lifecycle/ViewModel;

    invoke-static {p2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/CoroutineScope;

    move-result-object v0

    new-instance p2, Lcom/stripe/android/paymentsheet/forms/FormViewModel$1;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$1;-><init>(Lcom/stripe/android/paymentsheet/forms/FormViewModel;Lkotlin/coroutines/Continuation;)V

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    if-eqz p1, :cond_5

    .line 69
    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CardBillingAddressElement;->getHiddenIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    if-nez p1, :cond_6

    :cond_5
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p1

    invoke-static {p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    .line 70
    :cond_6
    iget-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:Lkotlinx/coroutines/flow/MutableStateFlow;

    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$$ExternalSyntheticLambda0;-><init>()V

    .line 68
    invoke-static {p1, p2, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers:Lkotlinx/coroutines/flow/StateFlow;

    .line 76
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->currentFieldValues()Lkotlinx/coroutines/flow/Flow;

    move-result-object p2

    .line 155
    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$1;

    invoke-direct {v0, p2}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 76
    iput-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->userRequestedReuse:Lkotlinx/coroutines/flow/Flow;

    .line 90
    new-instance p2, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;

    .line 91
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->currentFieldValues()Lkotlinx/coroutines/flow/Flow;

    move-result-object v1

    .line 160
    new-instance v2, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$2;

    invoke-direct {v2, v1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$map$2;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v2, Lkotlinx/coroutines/flow/Flow;

    .line 92
    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 94
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->getDefaultFormValues()Ljava/util/Map;

    move-result-object v1

    .line 90
    invoke-direct {p2, v2, p1, v0, v1}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Ljava/util/Map;)V

    .line 95
    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/forms/CompleteFormFieldValueFilter;->filterFlow()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->completeFormValues:Lkotlinx/coroutines/flow/Flow;

    .line 111
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elements:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    .line 163
    new-instance p2, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 165
    check-cast v0, Lcom/stripe/android/uicore/elements/FormElement;

    .line 111
    invoke-interface {v0}, Lcom/stripe/android/uicore/elements/FormElement;->getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    .line 165
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 166
    :cond_7
    check-cast p2, Ljava/util/List;

    .line 168
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 169
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    .line 112
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 169
    invoke-static {p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    goto :goto_4

    .line 172
    :cond_8
    move-object p1, p2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 176
    new-array v0, v0, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p1, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    .line 172
    check-cast p1, [Lkotlinx/coroutines/flow/Flow;

    .line 178
    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$combineAsStateFlow$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p1, v0

    check-cast p1, Lkotlinx/coroutines/flow/Flow;

    .line 179
    :goto_4
    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$combineAsStateFlow$2;

    invoke-direct {v0, p2}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$special$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 167
    new-instance p2, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {p2, p1, v0}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    .line 111
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->textFieldControllerIdsFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 116
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers:Lkotlinx/coroutines/flow/StateFlow;

    .line 117
    new-instance v0, Lcom/stripe/android/paymentsheet/forms/FormViewModel$$ExternalSyntheticLambda1;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$$ExternalSyntheticLambda1;-><init>()V

    .line 115
    invoke-static {p1, p2, v0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method private final currentFieldValues()Lkotlinx/coroutines/flow/Flow;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elements:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0

    .line 102
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elements:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 180
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 181
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 182
    check-cast v2, Lcom/stripe/android/uicore/elements/FormElement;

    .line 103
    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/FormElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 182
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 183
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 180
    check-cast v1, Ljava/lang/Iterable;

    .line 184
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 188
    new-array v1, v1, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    .line 184
    check-cast v0, [Lkotlinx/coroutines/flow/Flow;

    .line 190
    new-instance v1, Lcom/stripe/android/paymentsheet/forms/FormViewModel$currentFieldValues$$inlined$combine$1;

    invoke-direct {v1, v0}, Lcom/stripe/android/paymentsheet/forms/FormViewModel$currentFieldValues$$inlined$combine$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    check-cast v1, Lkotlinx/coroutines/flow/Flow;

    return-object v1
.end method

.method private static final hiddenIdentifiers$lambda$1(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;
    .locals 1

    const-string v0, "cardBillingIdentifiers"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalHiddenIdentifiers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p1, p0}, Lkotlin/collections/SetsKt;->plus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method private static final lastTextFieldIdentifier$lambda$12(Ljava/util/Set;Ljava/util/List;)Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 2

    const-string v0, "hiddenIds"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textFieldControllerIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    .line 192
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 193
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    .line 194
    move-object v1, v0

    check-cast v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 120
    invoke-interface {p0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 196
    :goto_0
    check-cast v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method


# virtual methods
.method public final addHiddenIdentifiers$paymentsheet_release(Ljava/util/Set;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;)V"
        }
    .end annotation

    const-string v0, "identifierSpecs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->externalHiddenIdentifiers:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final getCompleteFormValues()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            ">;"
        }
    .end annotation

    .line 89
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->completeFormValues:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method

.method public final getElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->elements:Ljava/util/List;

    return-object v0
.end method

.method public final getFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method public final getHiddenIdentifiers$paymentsheet_release()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->hiddenIdentifiers:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLastTextFieldIdentifier()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;"
        }
    .end annotation

    .line 115
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/forms/FormViewModel;->lastTextFieldIdentifier:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method
