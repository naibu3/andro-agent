.class public final Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;
.super Ljava/lang/Object;
.source "GetFinancialConnectionsAvailability.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u0086\u0002J\u000e\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u0007H\u0002J\u000e\u0010\u000c\u001a\u00020\u000b*\u0004\u0018\u00010\u0007H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;",
        "",
        "<init>",
        "()V",
        "invoke",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "elementsSession",
        "Lcom/stripe/android/model/ElementsSession;",
        "isFullSdkAvailable",
        "Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;",
        "fcLiteKillSwitchEnabled",
        "",
        "preferLite",
        "payments-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    invoke-direct {v0}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->INSTANCE:Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final fcLiteKillSwitchEnabled(Lcom/stripe/android/model/ElementsSession;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 31
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getFlags()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_DISABLE_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static synthetic invoke$default(Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;ILjava/lang/Object;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 12
    sget-object p2, Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;->INSTANCE:Lcom/stripe/android/payments/financialconnections/DefaultIsFinancialConnectionsAvailable;

    check-cast p2, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->invoke(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    move-result-object p0

    return-object p0
.end method

.method private final preferLite(Lcom/stripe/android/model/ElementsSession;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 34
    invoke-virtual {p1}, Lcom/stripe/android/model/ElementsSession;->getFlags()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/stripe/android/model/ElementsSession$Flag;->ELEMENTS_PREFER_FC_LITE:Lcom/stripe/android/model/ElementsSession$Flag;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/model/ElementsSession;Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;)Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    const-string v0, "isFullSdkAvailable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->preferLite(Lcom/stripe/android/model/ElementsSession;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->fcLiteKillSwitchEnabled(Lcom/stripe/android/model/ElementsSession;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    sget-object p1, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->Lite:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object p1

    .line 18
    :cond_0
    invoke-interface {p2}, Lcom/stripe/android/payments/financialconnections/IsFinancialConnectionsSdkAvailable;->invoke()Z

    move-result p2

    if-eqz p2, :cond_1

    sget-object p2, Lcom/stripe/android/core/utils/FeatureFlags;->INSTANCE:Lcom/stripe/android/core/utils/FeatureFlags;

    invoke-virtual {p2}, Lcom/stripe/android/core/utils/FeatureFlags;->getFinancialConnectionsFullSdkUnavailable()Lcom/stripe/android/core/utils/FeatureFlag;

    move-result-object p2

    invoke-virtual {p2}, Lcom/stripe/android/core/utils/FeatureFlag;->isEnabled()Z

    move-result p2

    if-nez p2, :cond_1

    .line 19
    sget-object p1, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->Full:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object p1

    .line 21
    :cond_1
    invoke-direct {p0, p1}, Lcom/stripe/android/payments/financialconnections/GetFinancialConnectionsAvailability;->fcLiteKillSwitchEnabled(Lcom/stripe/android/model/ElementsSession;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 22
    sget-object p1, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->Lite:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
