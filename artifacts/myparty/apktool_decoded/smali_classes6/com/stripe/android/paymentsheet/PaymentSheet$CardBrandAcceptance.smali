.class public abstract Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "CardBrandAcceptance"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;,
        Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00052\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\u0008B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "BrandCategory",
        "Companion",
        "All",
        "Allowed",
        "Disallowed",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$All;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Allowed;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Disallowed;",
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

.field public static final Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2874
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;-><init>()V

    return-void
.end method

.method public static final all()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;->all()Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object v0

    return-object v0
.end method

.method public static final allowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
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

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;->allowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p0

    return-object p0
.end method

.method public static final disallowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;
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

    sget-object v0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;->Companion:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$Companion;->disallowed(Ljava/util/List;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance;

    move-result-object p0

    return-object p0
.end method
