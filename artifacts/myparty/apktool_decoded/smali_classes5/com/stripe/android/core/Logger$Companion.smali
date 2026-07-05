.class public final Lcom/stripe/android/core/Logger$Companion;
.super Ljava/lang/Object;
.source "Logger.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/Logger;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0008\u0003\n\u0002\u0008\u0005*\u0002\u000b\u000e\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0008\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000cR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/core/Logger$Companion;",
        "",
        "<init>",
        "()V",
        "getInstance",
        "Lcom/stripe/android/core/Logger;",
        "enableLogging",
        "",
        "TAG",
        "",
        "REAL_LOGGER",
        "com/stripe/android/core/Logger$Companion$REAL_LOGGER$1",
        "Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;",
        "NOOP_LOGGER",
        "com/stripe/android/core/Logger$Companion$NOOP_LOGGER$1",
        "Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;",
        "real",
        "noop",
        "stripe-core_release"
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/core/Logger$Companion;

.field private static final NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

.field private static final REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

.field private static final TAG:Ljava/lang/String; = "StripeSdk"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/Logger$Companion;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->$$INSTANCE:Lcom/stripe/android/core/Logger$Companion;

    .line 29
    new-instance v0, Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    .line 47
    new-instance v0, Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    invoke-direct {v0}, Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;-><init>()V

    sput-object v0, Lcom/stripe/android/core/Logger$Companion;->NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getInstance(Z)Lcom/stripe/android/core/Logger;
    .locals 0

    if-eqz p1, :cond_0

    .line 21
    invoke-virtual {p0}, Lcom/stripe/android/core/Logger$Companion;->real()Lcom/stripe/android/core/Logger;

    move-result-object p1

    return-object p1

    .line 23
    :cond_0
    invoke-virtual {p0}, Lcom/stripe/android/core/Logger$Companion;->noop()Lcom/stripe/android/core/Logger;

    move-result-object p1

    return-object p1
.end method

.method public final noop()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 66
    sget-object v0, Lcom/stripe/android/core/Logger$Companion;->NOOP_LOGGER:Lcom/stripe/android/core/Logger$Companion$NOOP_LOGGER$1;

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method

.method public final real()Lcom/stripe/android/core/Logger;
    .locals 1

    .line 62
    sget-object v0, Lcom/stripe/android/core/Logger$Companion;->REAL_LOGGER:Lcom/stripe/android/core/Logger$Companion$REAL_LOGGER$1;

    check-cast v0, Lcom/stripe/android/core/Logger;

    return-object v0
.end method
