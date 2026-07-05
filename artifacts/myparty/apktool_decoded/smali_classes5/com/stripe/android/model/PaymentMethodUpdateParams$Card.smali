.class public final Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;
.super Lcom/stripe/android/model/PaymentMethodUpdateParams;
.source "PaymentMethodUpdateParams.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethodUpdateParams;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;,
        Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentMethodUpdateParams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodUpdateParams.kt\ncom/stripe/android/model/PaymentMethodUpdateParams$Card\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,163:1\n1611#2,9:164\n1863#2:173\n1864#2:175\n1620#2:176\n1#3:174\n*S KotlinDebug\n*F\n+ 1 PaymentMethodUpdateParams.kt\ncom/stripe/android/model/PaymentMethodUpdateParams$Card\n*L\n52#1:164,9\n52#1:173\n52#1:175\n52#1:176\n52#1:174\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 ,2\u00020\u0001:\u0002+,BS\u0008\u0000\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0010\u00a2\u0006\u0002\u0008\u001fJ\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\u0008\u0010#\u001a\u00020\u0003H\u0016J\u0008\u0010$\u001a\u00020\u000bH\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0003R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nX\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0090\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006-"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams;",
        "expiryMonth",
        "",
        "expiryYear",
        "networks",
        "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
        "billingDetails",
        "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "productUsageTokens",
        "",
        "",
        "allowRedisplay",
        "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V",
        "getExpiryMonth",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getExpiryYear",
        "getNetworks",
        "()Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
        "getBillingDetails$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
        "getProductUsageTokens$payments_core_release",
        "()Ljava/util/Set;",
        "getAllowRedisplay$payments_core_release",
        "()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
        "generateTypeParams",
        "",
        "",
        "generateTypeParams$payments_core_release",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "describeContents",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "Networks",
        "Companion",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;",
            ">;"
        }
    .end annotation
.end field

.field private static final Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;

.field private static final PARAM_EXP_MONTH:Ljava/lang/String; = "exp_month"

.field private static final PARAM_EXP_YEAR:Ljava/lang/String; = "exp_year"

.field private static final PARAM_NETWORKS:Ljava/lang/String; = "networks"


# instance fields
.field private final allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

.field private final billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

.field private final expiryMonth:Ljava/lang/Integer;

.field private final expiryYear:Ljava/lang/Integer;

.field private final networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

.field private final productUsageTokens:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->Companion:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Companion;

    new-instance v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;",
            "Lcom/stripe/android/model/PaymentMethod$BillingDetails;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;",
            ")V"
        }
    .end annotation

    const-string v0, "productUsageTokens"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    sget-object v0, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/model/PaymentMethodUpdateParams;-><init>(Lcom/stripe/android/model/PaymentMethod$Type;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    .line 42
    iput-object p4, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    .line 43
    iput-object p5, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->productUsageTokens:Ljava/util/Set;

    .line 44
    iput-object p6, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_3

    .line 43
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p5

    :cond_3
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_4

    move-object p7, v0

    goto :goto_0

    :cond_4
    move-object p7, p6

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 38
    invoke-direct/range {p1 .. p7}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 60
    instance-of v0, p1, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;

    if-eqz v0, :cond_0

    .line 61
    check-cast p1, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object p1

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public generateTypeParams$payments_core_release()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x3

    .line 49
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "exp_month"

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 50
    const-string v1, "exp_year"

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 51
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;->toParamMap()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "networks"

    invoke-static {v3, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v3, 0x2

    aput-object v1, v0, v3

    .line 48
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 164
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 173
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 172
    check-cast v3, Lkotlin/Pair;

    .line 53
    invoke-virtual {v3}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 54
    invoke-virtual {v3}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v2

    :goto_2
    if-eqz v3, :cond_1

    .line 172
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 176
    :cond_3
    check-cast v1, Ljava/util/List;

    .line 164
    check-cast v1, Ljava/lang/Iterable;

    .line 56
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public getAllowRedisplay$payments_core_release()Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    return-object v0
.end method

.method public getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    return-object v0
.end method

.method public final getExpiryMonth()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getExpiryYear()Ljava/lang/Integer;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getNetworks()Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    return-object v0
.end method

.method public getProductUsageTokens$payments_core_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->productUsageTokens:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v3

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 73
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    .line 74
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    .line 75
    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->getBillingDetails$payments_core_release()Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "PaymentMethodCreateParams.Card.(expiryMonth="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", expiryYear="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", networks="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", billingDetails="

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

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryMonth:Ljava/lang/Integer;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->expiryYear:Ljava/lang/Integer;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->networks:Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card$Networks;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->billingDetails:Lcom/stripe/android/model/PaymentMethod$BillingDetails;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$BillingDetails;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_3
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->productUsageTokens:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/stripe/android/model/PaymentMethodUpdateParams$Card;->allowRedisplay:Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;

    if-nez v0, :cond_5

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_5
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
