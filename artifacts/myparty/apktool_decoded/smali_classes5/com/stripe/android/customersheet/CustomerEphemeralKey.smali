.class public final Lcom/stripe/android/customersheet/CustomerEphemeralKey;
.super Ljava/lang/Object;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerEphemeralKey;",
        "",
        "customerId",
        "",
        "ephemeralKey",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getCustomerId$paymentsheet_release",
        "()Ljava/lang/String;",
        "getEphemeralKey$paymentsheet_release",
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

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;


# instance fields
.field private final customerId:Ljava/lang/String;

.field private final ephemeralKey:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->Companion:Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "customerId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ephemeralKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->customerId:Ljava/lang/String;

    .line 251
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->ephemeralKey:Ljava/lang/String;

    return-void
.end method

.method public static final create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerEphemeralKey;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->Companion:Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/stripe/android/customersheet/CustomerEphemeralKey$Companion;->create(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerEphemeralKey;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCustomerId$paymentsheet_release()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->customerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getEphemeralKey$paymentsheet_release()Ljava/lang/String;
    .locals 1

    .line 251
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerEphemeralKey;->ephemeralKey:Ljava/lang/String;

    return-object v0
.end method
