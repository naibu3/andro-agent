.class public final Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;
.super Ljava/lang/Object;
.source "Logger.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/transaction/Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0080\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;",
        "",
        "<init>",
        "()V",
        "get",
        "Lcom/stripe/android/stripe3ds2/transaction/Logger;",
        "enableLogging",
        "",
        "3ds2sdk_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/stripe3ds2/transaction/Logger$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final get(Z)Lcom/stripe/android/stripe3ds2/transaction/Logger;
    .locals 0

    if-eqz p1, :cond_0

    .line 32
    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;->INSTANCE:Lcom/stripe/android/stripe3ds2/transaction/Logger$Real;

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/Logger;

    return-object p1

    .line 34
    :cond_0
    sget-object p1, Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;->INSTANCE:Lcom/stripe/android/stripe3ds2/transaction/Logger$Noop;

    check-cast p1, Lcom/stripe/android/stripe3ds2/transaction/Logger;

    return-object p1
.end method
