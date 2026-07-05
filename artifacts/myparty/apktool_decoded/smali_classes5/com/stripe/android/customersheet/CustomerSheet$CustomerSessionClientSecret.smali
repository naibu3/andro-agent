.class public final Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;
.super Ljava/lang/Object;
.source "CustomerSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CustomerSessionClientSecret"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;",
        "",
        "customerId",
        "",
        "clientSecret",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getCustomerId$paymentsheet_release",
        "()Ljava/lang/String;",
        "getClientSecret$paymentsheet_release",
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

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;


# instance fields
.field private final clientSecret:Ljava/lang/String;

.field private final customerId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientSecret"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 396
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    .line 397
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    return-void
.end method

.method public static final create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->Companion:Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret$Companion;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getClientSecret$paymentsheet_release()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomerId$paymentsheet_release()Ljava/lang/String;
    .locals 1

    .line 396
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->customerId:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheet$CustomerSessionClientSecret;->clientSecret:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "CustomerSessionClientSecret(customerId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", clientSecret="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
