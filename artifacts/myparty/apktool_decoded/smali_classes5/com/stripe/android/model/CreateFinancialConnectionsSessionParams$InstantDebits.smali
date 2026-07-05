.class public final Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;
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
    name = "InstantDebits"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0014\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0011H\u0016J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;",
        "Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams;",
        "clientSecret",
        "",
        "customerEmailAddress",
        "hostedSurface",
        "linkMode",
        "Lcom/stripe/android/model/LinkMode;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V",
        "getClientSecret",
        "()Ljava/lang/String;",
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

.field private final hostedSurface:Ljava/lang/String;

.field private final linkMode:Lcom/stripe/android/model/LinkMode;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    .line 13
    iput-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    .line 14
    iput-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    .line 15
    iput-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;ILjava/lang/Object;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/model/LinkMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;
    .locals 1

    const-string v0, "clientSecret"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/LinkMode;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object p1, p1, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getClientSecret()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerEmailAddress()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    return-object v0
.end method

.method public final getHostedSurface()Ljava/lang/String;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkMode()Lcom/stripe/android/model/LinkMode;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

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
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 19
    new-instance v1, Lcom/stripe/android/model/PaymentMethodCreateParams;

    .line 20
    sget-object v2, Lcom/stripe/android/model/PaymentMethod$Type;->Link:Lcom/stripe/android/model/PaymentMethod$Type;

    .line 21
    new-instance v17, Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    .line 22
    iget-object v5, v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    const/16 v8, 0xd

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, v17

    .line 21
    invoke-direct/range {v3 .. v9}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v23, 0x1f7ffe

    const/16 v24, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 19
    invoke-direct/range {v1 .. v24}, Lcom/stripe/android/model/PaymentMethodCreateParams;-><init>(Lcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethodCreateParams$USBankAccount;Lcom/stripe/android/model/PaymentMethodCreateParams$Link;Lcom/stripe/android/model/PaymentMethodCreateParams$CashAppPay;Lcom/stripe/android/model/PaymentMethodCreateParams$Swish;Lcom/stripe/android/model/PaymentMethodCreateParams$ShopPay;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Lcom/stripe/android/model/RadarOptions;Ljava/util/Map;Ljava/util/Set;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x6

    .line 26
    new-array v2, v2, [Lkotlin/Pair;

    const-string v3, "client_secret"

    iget-object v4, v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 27
    const-string v3, "hosted_surface"

    iget-object v4, v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 28
    const-string v3, "product"

    const-string v5, "instant_debits"

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v2, v5

    .line 29
    const-string v3, "attach_required"

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x3

    aput-object v3, v2, v4

    .line 30
    iget-object v3, v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    iget-object v4, v0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    invoke-static {v3, v4}, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParamsKt;->access$valueForHostedSurface(Lcom/stripe/android/model/LinkMode;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "link_mode"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    const/4 v4, 0x4

    aput-object v3, v2, v4

    .line 31
    const-string v3, "payment_method_data"

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodCreateParams;->toParamMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x5

    aput-object v1, v2, v3

    .line 25
    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 32
    invoke-static {v1}, Lcom/stripe/android/utils/MapUtilsKt;->filterNotNullValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->clientSecret:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->customerEmailAddress:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->hostedSurface:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/model/CreateFinancialConnectionsSessionParams$InstantDebits;->linkMode:Lcom/stripe/android/model/LinkMode;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "InstantDebits(clientSecret="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", customerEmailAddress="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hostedSurface="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
