.class public final Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;
.super Ljava/lang/Object;
.source "CreateFinancialConnectionsSessionParams.kt"

# interfaces
.implements Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "USBankAccount"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003JA\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
        "clientSecret",
        "",
        "customerName",
        "customerEmailAddress",
        "hostedSurface",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V",
        "getClientSecret",
        "()Ljava/lang/String;",
        "getCustomerName",
        "getCustomerEmailAddress",
        "getHostedSurface",
        "getLinkMode",
        "()Lcom/stripe/android/model/LinkMode;",
        "toMap",
        "",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final customerEmailAddress:Ljava/lang/String;

.field private final customerName:Ljava/lang/String;

.field private final hostedSurface:Ljava/lang/String;

.field private final linkMode:Lcom/stripe/android/model/LinkMode;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    .line 40
    iput-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    .line 41
    iput-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    .line 42
    iput-object p5, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ILjava/lang/Object;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/model/LinkMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;
    .locals 7

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object p1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerEmailAddress()Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    return-object v0
.end method

.method public final getHostedSurface()Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkMode()Lcom/stripe/android/model/LinkMode;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/model/LinkMode;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 45
    sget-object v0, Lcom/stripe/android/model/PaymentMethodCreateParams;->Companion:Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;

    .line 47
    iget-object v4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    .line 48
    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    .line 46
    new-instance v1, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    const/16 v6, 0x9

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x6

    const/4 v3, 0x0

    .line 45
    invoke-static/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;->createUSBankAccount$default(Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILjava/lang/Object;)Lcom/stripe/android/model/PaymentMethodCreateParams;

    move-result-object v0

    const/4 v1, 0x4

    .line 52
    new-array v1, v1, [Lkotlin/Pair;

    const-string v2, "client_secret"

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 53
    const-string v2, "hosted_surface"

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    .line 54
    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    invoke-static {v2, v3}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParamsKt;->access$valueForHostedSurface(Lcom/stripe/android/model/LinkMode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "link_mode"

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    .line 55
    const-string v2, "payment_method_data"

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    .line 51
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 56
    invoke-static {v0}, Lcom/stripe/android/utils/MapUtilsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->clientSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerName:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->customerEmailAddress:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->hostedSurface:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$USBankAccount;->linkMode:Lcom/stripe/android/model/LinkMode;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "USBankAccount(clientSecret="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", customerName="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customerEmailAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hostedSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
