.class public final Lio/qonversion/sandwich/SandwichError;
.super Ljava/lang/Object;
.source "SandwichError.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0018\u00002\u00020\u0001B\u000f\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/qonversion/sandwich/SandwichError;",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "(Lcom/qonversion/android/sdk/dto/QonversionError;)V",
        "code",
        "",
        "description",
        "additionalMessage",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getAdditionalMessage",
        "()Ljava/lang/String;",
        "getCode",
        "getDescription",
        "sandwich_release"
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
.field private final additionalMessage:Ljava/lang/String;

.field private final code:Ljava/lang/String;

.field private final description:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getCode()Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getDescription()Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/dto/QonversionError;->getAdditionalMessage()Ljava/lang/String;

    move-result-object p1

    .line 10
    invoke-direct {p0, v0, v1, p1}, Lio/qonversion/sandwich/SandwichError;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "description"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "additionalMessage"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lio/qonversion/sandwich/SandwichError;->code:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lio/qonversion/sandwich/SandwichError;->description:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lio/qonversion/sandwich/SandwichError;->additionalMessage:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAdditionalMessage()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lio/qonversion/sandwich/SandwichError;->additionalMessage:Ljava/lang/String;

    return-object v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 6
    iget-object v0, p0, Lio/qonversion/sandwich/SandwichError;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    .line 7
    iget-object v0, p0, Lio/qonversion/sandwich/SandwichError;->description:Ljava/lang/String;

    return-object v0
.end method
