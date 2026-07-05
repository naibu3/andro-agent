.class public abstract Lcom/stripe/android/model/PaymentMethodUpdateParams;
.super Ljava/lang/Object;
.source "PaymentMethodUpdateParams.kt"

# interfaces
.implements Lcom/stripe/android/model/StripeParamsModel;
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;,
        Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001b\u001cB\u0011\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u0017H \u00a2\u0006\u0002\u0008\u0019J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00180\u0017H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000eX\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0001\u0001\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "Lcom/stripe/android/model/StripeParamsModel;",
        "Landroid/os/Parcelable;",
        "type",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "<init>",
        "(Lcom/stripe/android/model/PaymentMethod$Type;)V",
        "getType$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$Type;",
        "allowRedisplay",
        "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "getAllowRedisplay$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "getBillingDetails$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "productUsageTokens",
        "",
        "",
        "getProductUsageTokens$payments_core_release",
        "()Ljava/util/Set;",
        "generateTypeParams",
        "",
        "",
        "generateTypeParams$payments_core_release",
        "toParamMap",
        "Card",
        "Companion",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

.field private static final PARAM_ALLOW_REDISPLAY:Ljava/lang/String; = "allow_redisplay"

.field private static final PARAM_BILLING_DETAILS:Ljava/lang/String; = "billing_details"


# instance fields
.field private final type:Lcom/stripe/android/model/PaymentMethod$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/model/PaymentMethod$Type;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/model/PaymentMethod$Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams;-><init>(Lcom/stripe/android/model/PaymentMethod$Type;)V

    return-void
.end method

.method public static final createCard()Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard()Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object v0

    return-object v0
.end method

.method public static final createCard(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 6
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/lang/Integer;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/lang/Integer;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method

.method public static final createCard(Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Companion;->createCard(Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodUpdateParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract generateTypeParams$payments_core_release()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAllowRedisplay$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
.end method

.method public abstract getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
.end method

.method public abstract getProductUsageTokens$payments_core_release()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public final getType$payments_core_release()Lcom/stripe/android/model/PaymentMethod$Type;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    return-object v0
.end method

.method public toParamMap()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams;->type:Lcom/stripe/android/model/PaymentMethod$Type;

    iget-object v0, v0, Lcom/stripe/android/model/PaymentMethod$Type;->code:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->generateTypeParams$payments_core_release()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .line 26
    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 27
    const-string v3, "billing_details"

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->toParamMap()Ljava/util/Map;

    move-result-object v1

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_1

    .line 28
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams;->getAllowRedisplay$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 31
    const-string v2, "allow_redisplay"

    invoke-virtual {v3}, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    :cond_2
    if-nez v2, :cond_3

    .line 32
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v2

    .line 34
    :cond_3
    invoke-static {v1, v2}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
