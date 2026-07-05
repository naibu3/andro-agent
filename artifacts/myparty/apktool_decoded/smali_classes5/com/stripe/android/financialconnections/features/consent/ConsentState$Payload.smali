.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;
.super Ljava/lang/Object;
.source "ConsentState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/consent/ConsentState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Payload"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J7\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00082\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;",
        "",
        "consent",
        "Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "merchantLogos",
        "",
        "",
        "shouldShowMerchantLogos",
        "",
        "showAnimatedDots",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V",
        "getConsent",
        "()Lcom/stripe/android/financialconnections/model/ConsentPane;",
        "getMerchantLogos",
        "()Ljava/util/List;",
        "getShouldShowMerchantLogos",
        "()Z",
        "getShowAnimatedDots",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "financial-connections_release"
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
.field private final consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

.field private final merchantLogos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final shouldShowMerchantLogos:Z

.field private final showAnimatedDots:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/ConsentPane;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    const-string v0, "consent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    .line 17
    iput-boolean p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    .line 18
    iput-boolean p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZILjava/lang/Object;)Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-boolean p3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->copy(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/model/ConsentPane;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;ZZ)",
            "Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;"
        }
    .end annotation

    const-string v0, "consent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantLogos"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;-><init>(Lcom/stripe/android/financialconnections/model/ConsentPane;Ljava/util/List;ZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    iget-boolean v3, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    iget-boolean p1, p1, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getConsent()Lcom/stripe/android/financialconnections/model/ConsentPane;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    return-object v0
.end method

.method public final getMerchantLogos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    return-object v0
.end method

.method public final getShouldShowMerchantLogos()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    return v0
.end method

.method public final getShowAnimatedDots()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ConsentPane;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->consent:Lcom/stripe/android/financialconnections/model/ConsentPane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->merchantLogos:Ljava/util/List;

    iget-boolean v2, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->shouldShowMerchantLogos:Z

    iget-boolean v3, p0, Lcom/stripe/android/financialconnections/features/consent/ConsentState$Payload;->showAnimatedDots:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Payload(consent="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", merchantLogos="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", shouldShowMerchantLogos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showAnimatedDots="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
