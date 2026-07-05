.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007J\u0016\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007J\u0016\u0010\n\u001a\u00020\u00052\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;",
        "",
        "<init>",
        "()V",
        "all",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "allowed",
        "brands",
        "",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
        "disallowed",
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

    .line 2903
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final all()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 2908
    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object v0
.end method

.method public final allowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "brands"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2916
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;-><init>(Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object v0
.end method

.method public final disallowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;"
        }
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "brands"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2925
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;-><init>(Ljava/util/List;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    return-object v0
.end method
