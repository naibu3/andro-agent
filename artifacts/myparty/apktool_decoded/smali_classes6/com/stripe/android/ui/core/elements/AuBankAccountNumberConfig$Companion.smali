.class final Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;
.super Ljava/lang/Object;
.source "AuBankAccountNumberConfig.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;",
        "",
        "<init>",
        "()V",
        "MINIMUM_LENGTH",
        "",
        "MAXIMUM_LENGTH",
        "VALID_INPUT_RANGES",
        "Lkotlin/ranges/CharRange;",
        "getVALID_INPUT_RANGES",
        "()Lkotlin/ranges/CharRange;",
        "payments-ui-core_release"
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

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getVALID_INPUT_RANGES()Lkotlin/ranges/CharRange;
    .locals 1

    .line 59
    invoke-static {}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberConfig;->access$getVALID_INPUT_RANGES$cp()Lkotlin/ranges/CharRange;

    move-result-object v0

    return-object v0
.end method
