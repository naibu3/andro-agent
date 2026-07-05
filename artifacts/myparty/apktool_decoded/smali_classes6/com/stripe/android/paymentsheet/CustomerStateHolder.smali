.class public final Lcom/stripe/android/paymentsheet/CustomerStateHolder;
.super Ljava/lang/Object;
.source "CustomerStateHolder.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCustomerStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomerStateHolder.kt\ncom/stripe/android/paymentsheet/CustomerStateHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n295#2,2:95\n*S KotlinDebug\n*F\n+ 1 CustomerStateHolder.kt\ncom/stripe/android/paymentsheet/CustomerStateHolder\n*L\n65#1:95,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u000cJ\u0010\u0010\u001f\u001a\u00020\u001d2\u0008\u0010 \u001a\u0004\u0018\u00010\u0011J\u0010\u0010!\u001a\u00020\u001d2\u0008\u0010 \u001a\u0004\u0018\u00010\u0011R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00100\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000eR\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u000eR\u0017\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u000eR\u0017\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u000eR\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u000e\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/CustomerStateHolder;",
        "",
        "customerMetadataPermissions",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
        "savedStateHandle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "selection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "<init>",
        "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/flow/StateFlow;)V",
        "customer",
        "Lcom/stripe/android/paymentsheet/state/CustomerState;",
        "getCustomer",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "paymentMethods",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "getPaymentMethods",
        "mostRecentlySelectedSavedPaymentMethod",
        "getMostRecentlySelectedSavedPaymentMethod",
        "canRemoveDuplicate",
        "",
        "getCanRemoveDuplicate",
        "canRemove",
        "getCanRemove",
        "canUpdateFullPaymentMethodDetails",
        "getCanUpdateFullPaymentMethodDetails",
        "setCustomerState",
        "",
        "customerState",
        "setDefaultPaymentMethod",
        "paymentMethod",
        "updateMostRecentlySelectedSavedPaymentMethod",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;

.field public static final SAVED_CUSTOMER:Ljava/lang/String; = "customer_info"

.field public static final SAVED_PM_SELECTION:Ljava/lang/String; = "saved_selection"


# instance fields
.field private final canRemove:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final canRemoveDuplicate:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final canUpdateFullPaymentMethodDetails:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final customer:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;"
        }
    .end annotation
.end field

.field private final customerMetadataPermissions:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
            ">;"
        }
    .end annotation
.end field

.field private final mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethods:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field

.field private final savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

.field private final selection:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$M_iTGFiNzIgEV2Cz-xCY85RTaq4(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemoveDuplicate$lambda$1(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$Mr16c5-P556THRuDeCM2yBFdfak(Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canUpdateFullPaymentMethodDetails$lambda$4(Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$OdmwxIsa9YNwHKF2PXEvsKSGUk8(Lcom/stripe/android/paymentsheet/state/CustomerState;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->paymentMethods$lambda$0(Lcom/stripe/android/paymentsheet/state/CustomerState;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$YvNbD0Z-csQwyUdoUuCteUmaQ58(Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemove$lambda$3(Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z

    move-result p0

    return p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->Companion:Lcom/stripe/android/paymentsheet/CustomerStateHolder$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/SavedStateHandle;Lkotlinx/coroutines/flow/StateFlow;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;",
            ">;",
            "Landroidx/lifecycle/SavedStateHandle;",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;)V"
        }
    .end annotation

    const-string v0, "customerMetadataPermissions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->customerMetadataPermissions:Lkotlinx/coroutines/flow/StateFlow;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    .line 16
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->selection:Lkotlinx/coroutines/flow/StateFlow;

    .line 19
    const-string v0, "customer_info"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->customer:Lkotlinx/coroutines/flow/StateFlow;

    .line 25
    new-instance v2, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda0;

    invoke-direct {v2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda0;-><init>()V

    .line 26
    invoke-static {v0, v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->paymentMethods:Lkotlinx/coroutines/flow/StateFlow;

    .line 32
    invoke-interface {p3}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p3

    instance-of v3, p3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v3, :cond_0

    check-cast p3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    goto :goto_0

    :cond_0
    move-object p3, v1

    :goto_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object v1

    .line 30
    :cond_1
    const-string p3, "saved_selection"

    invoke-virtual {p2, p3, v1}, Landroidx/lifecycle/SavedStateHandle;->getStateFlow(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    new-instance p2, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda1;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda1;-><init>()V

    .line 35
    invoke-static {v0, p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemoveDuplicate:Lkotlinx/coroutines/flow/StateFlow;

    .line 44
    new-instance p2, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda2;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda2;-><init>()V

    .line 42
    invoke-static {v2, p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemove:Lkotlinx/coroutines/flow/StateFlow;

    .line 57
    new-instance p2, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda3;

    invoke-direct {p2}, Lcom/stripe/android/paymentsheet/CustomerStateHolder$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {p1, p2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canUpdateFullPaymentMethodDetails:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method private static final canRemove$lambda$3(Ljava/util/List;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 3

    const-string v0, "paymentMethods"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 47
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->getCanRemovePaymentMethods()Z

    move-result v1

    .line 48
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->getCanRemoveLastPaymentMethod()Z

    move-result p1

    .line 49
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    if-eqz p0, :cond_1

    const/4 v2, 0x1

    if-eq p0, v2, :cond_0

    return v1

    :cond_0
    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    return v0
.end method

.method private static final canRemoveDuplicate$lambda$1(Lcom/stripe/android/paymentsheet/state/CustomerState;Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 39
    invoke-virtual {p1}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->getCanRemoveDuplicates()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final canUpdateFullPaymentMethodDetails$lambda$4(Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;)Z
    .locals 0

    if-eqz p0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/stripe/android/lpmfoundations/paymentmethod/CustomerMetadata$Permissions;->getCanUpdateFullPaymentMethodDetails()Z

    move-result p0

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final paymentMethods$lambda$0(Lcom/stripe/android/paymentsheet/state/CustomerState;)Ljava/util/List;
    .locals 0

    if-eqz p0, :cond_1

    .line 27
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCanRemove()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemove:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getCanRemoveDuplicate()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canRemoveDuplicate:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getCanUpdateFullPaymentMethodDetails()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->canUpdateFullPaymentMethodDetails:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getCustomer()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/state/CustomerState;",
            ">;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->customer:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getMostRecentlySelectedSavedPaymentMethod()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;"
        }
    .end annotation

    .line 30
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getPaymentMethods()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->paymentMethods:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final setCustomerState(Lcom/stripe/android/paymentsheet/state/CustomerState;)V
    .locals 5

    .line 62
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "customer_info"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->mostRecentlySelectedSavedPaymentMethod:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/PaymentMethod;

    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 65
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/state/CustomerState;->getPaymentMethods()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_3

    check-cast p1, Ljava/lang/Iterable;

    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/model/PaymentMethod;

    .line 65
    iget-object v3, v3, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v4, v0, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    goto :goto_0

    :cond_1
    move-object v4, v1

    :goto_0
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v1, v2

    .line 96
    :cond_2
    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    .line 66
    :cond_3
    invoke-virtual {p0, v1}, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->updateMostRecentlySelectedSavedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method

.method public final setDefaultPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 9

    .line 70
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->customer:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/stripe/android/paymentsheet/state/CustomerState;

    const/4 v0, 0x0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    :cond_0
    move-object v6, v0

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/paymentsheet/state/CustomerState;->copy$default(Lcom/stripe/android/paymentsheet/state/CustomerState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/state/CustomerState;

    move-result-object v0

    .line 72
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "customer_info"

    invoke-virtual {p1, v1, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final updateMostRecentlySelectedSavedPaymentMethod(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 2

    .line 76
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/CustomerStateHolder;->savedStateHandle:Landroidx/lifecycle/SavedStateHandle;

    const-string v1, "saved_selection"

    invoke-virtual {v0, v1, p1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
