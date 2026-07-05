.class public final Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;
.super Ljava/lang/Object;
.source "ExpiryDateState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;",
        "",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;",
        "editPayload",
        "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;",
        "enabled",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final create(Lcom/stripe/android/paymentsheet/ui/EditCardPayload;Z)Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;
    .locals 7

    const-string v0, "editPayload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getExpiryMonth()Ljava/lang/Integer;

    move-result-object v0

    .line 94
    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/ui/EditCardPayload;->getExpiryYear()Ljava/lang/Integer;

    move-result-object p1

    .line 92
    invoke-static {v0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateStateKt;->access$formattedExpiryDate(Ljava/lang/Integer;Ljava/lang/Integer;Z)Ljava/lang/String;

    move-result-object v2

    .line 97
    new-instance v1, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;-><init>(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
