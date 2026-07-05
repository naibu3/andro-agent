.class public final Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;
.super Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;
.source "AddPaymentMethodOption.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Card"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u0008\u001a\u00020\tH\u00d6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;",
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
        "<init>",
        "()V",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;->INSTANCE:Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 23
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_payment_method_debit_or_credit_card:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 21
    const-string v1, "DebitOrCreditCard"

    invoke-direct {p0, v1, v0, v3}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x5b265639

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Card"

    return-object v0
.end method
