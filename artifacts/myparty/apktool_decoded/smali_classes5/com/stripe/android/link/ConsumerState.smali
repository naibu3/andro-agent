.class public final Lcom/stripe/android/link/ConsumerState;
.super Ljava/lang/Object;
.source "ConsumerState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ConsumerState$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConsumerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsumerState.kt\ncom/stripe/android/link/ConsumerState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1202#2,2:79\n1230#2,4:81\n1557#2:85\n1628#2,3:86\n1557#2:89\n1628#2,3:90\n*S KotlinDebug\n*F\n+ 1 ConsumerState.kt\ncom/stripe/android/link/ConsumerState\n*L\n25#1:79,2\n25#1:81,4\n27#1:85\n27#1:86,3\n50#1:89\n50#1:90,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u0081\u0008\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0015\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\u000c\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\u0012\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0010H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/stripe/android/link/ConsumerState;",
        "",
        "paymentDetails",
        "",
        "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
        "<init>",
        "(Ljava/util/List;)V",
        "getPaymentDetails",
        "()Ljava/util/List;",
        "withPaymentDetailsResponse",
        "response",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "withUpdatedPaymentDetail",
        "updatedPayment",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "billingPhone",
        "",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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

.field public static final Companion:Lcom/stripe/android/link/ConsumerState$Companion;


# instance fields
.field private final paymentDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ConsumerState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ConsumerState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ConsumerState;->Companion:Lcom/stripe/android/link/ConsumerState$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/ConsumerState;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;)V"
        }
    .end annotation

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ConsumerState;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/link/ConsumerState;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ConsumerState;->copy(Ljava/util/List;)Lcom/stripe/android/link/ConsumerState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/stripe/android/link/ConsumerState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;)",
            "Lcom/stripe/android/link/ConsumerState;"
        }
    .end annotation

    const-string v0, "paymentDetails"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/ConsumerState;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ConsumerState;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ConsumerState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ConsumerState;

    iget-object v1, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getPaymentDetails()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ConsumerState(paymentDetails="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withPaymentDetailsResponse(Lcom/stripe/android/model/ConsumerPaymentDetails;)Lcom/stripe/android/link/ConsumerState;
    .locals 10

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    .line 79
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    const/16 v3, 0x10

    invoke-static {v2, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    .line 80
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v3, Ljava/util/Map;

    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 82
    move-object v4, v2

    check-cast v4, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    .line 25
    invoke-virtual {v4}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    .line 82
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 87
    move-object v5, v1

    check-cast v5, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    .line 28
    invoke-virtual {v5}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    if-eqz v4, :cond_1

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 29
    invoke-static/range {v4 .. v9}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->copy$default(Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 30
    :cond_1
    new-instance v1, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    const/4 v2, 0x0

    invoke-direct {v1, v5, v2, v2}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :goto_2
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 88
    :cond_2
    check-cast v0, Ljava/util/List;

    .line 26
    invoke-virtual {p0, v0}, Lcom/stripe/android/link/ConsumerState;->copy(Ljava/util/List;)Lcom/stripe/android/link/ConsumerState;

    move-result-object p1

    return-object p1
.end method

.method public final withUpdatedPaymentDetail(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;)Lcom/stripe/android/link/ConsumerState;
    .locals 9

    const-string v0, "updatedPayment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    iget-object v0, p0, Lcom/stripe/android/link/ConsumerState;->paymentDetails:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 89
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v1, Ljava/util/Collection;

    .line 90
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 91
    move-object v3, v2

    check-cast v3, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    .line 51
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getDetails()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-nez p2, :cond_0

    .line 55
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object v2

    move-object v6, v2

    goto :goto_1

    :cond_0
    move-object v6, p2

    :goto_1
    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v4, p1

    .line 53
    invoke-static/range {v3 .. v8}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->copy$default(Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    move-result-object p1

    move-object v2, v4

    goto :goto_3

    :cond_1
    move-object v2, p1

    .line 59
    invoke-virtual {v3}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->getBillingPhone()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    move-object v6, p2

    goto :goto_2

    :cond_2
    move-object v6, p1

    :goto_2
    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;->copy$default(Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/LinkPaymentMethod$ConsumerPaymentDetails;

    move-result-object p1

    .line 91
    :goto_3
    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object p1, v2

    goto :goto_0

    .line 92
    :cond_3
    check-cast v1, Ljava/util/List;

    .line 49
    invoke-virtual {p0, v1}, Lcom/stripe/android/link/ConsumerState;->copy(Ljava/util/List;)Lcom/stripe/android/link/ConsumerState;

    move-result-object p1

    return-object p1
.end method
