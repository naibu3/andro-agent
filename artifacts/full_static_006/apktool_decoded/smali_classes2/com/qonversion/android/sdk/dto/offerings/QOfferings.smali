.class public final Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
.super Ljava/lang/Object;
.source "QOfferings.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQOfferings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QOfferings.kt\ncom/qonversion/android/sdk/dto/offerings/QOfferings\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n288#2,2:25\n*S KotlinDebug\n*F\n+ 1 QOfferings.kt\ncom/qonversion/android/sdk/dto/offerings/QOfferings\n*L\n10#1:25,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J%\u0010\r\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;",
        "",
        "main",
        "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "availableOfferings",
        "",
        "(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V",
        "getAvailableOfferings",
        "()Ljava/util/List;",
        "getMain",
        "()Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "offeringForID",
        "id",
        "",
        "toString",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final availableOfferings:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation
.end field

.field private final main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)V"
        }
    .end annotation

    const-string v0, "availableOfferings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 7
    iput-object p2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 7
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/qonversion/android/sdk/dto/offerings/QOfferings;Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;ILjava/lang/Object;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->copy(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 1

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)Lcom/qonversion/android/sdk/dto/offerings/QOfferings;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;)",
            "Lcom/qonversion/android/sdk/dto/offerings/QOfferings;"
        }
    .end annotation

    const-string v0, "availableOfferings"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    invoke-direct {v0, p1, p2}, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;-><init>(Lcom/qonversion/android/sdk/dto/offerings/QOffering;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 18
    instance-of v0, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    if-eqz v0, :cond_1

    if-eq p1, p0, :cond_0

    .line 20
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    check-cast p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;

    iget-object v1, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    iget-object p1, p1, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/qonversion/android/sdk/internal/ExtensionsKt;->equalsIgnoreOrder(Ljava/util/List;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final getAvailableOfferings()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/dto/offerings/QOffering;",
            ">;"
        }
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    return-object v0
.end method

.method public final getMain()Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 14
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final offeringForID(Ljava/lang/String;)Lcom/qonversion/android/sdk/dto/offerings/QOffering;
    .locals 3

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 25
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    .line 10
    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/offerings/QOffering;->getOfferingID()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->main:Lcom/qonversion/android/sdk/dto/offerings/QOffering;

    iget-object v1, p0, Lcom/qonversion/android/sdk/dto/offerings/QOfferings;->availableOfferings:Ljava/util/List;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "QOfferings(main="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", availableOfferings="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
