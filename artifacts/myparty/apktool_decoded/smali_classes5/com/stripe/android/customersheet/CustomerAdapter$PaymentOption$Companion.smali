.class public final Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;
.super Ljava/lang/Object;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005*\u00020\tH\u0000\u00a2\u0006\u0002\u0008\nJ\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0005*\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;",
        "",
        "<init>",
        "()V",
        "fromId",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
        "id",
        "",
        "toPaymentOption",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "toPaymentOption$paymentsheet_release",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
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

    .line 173
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromId(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    const-string v0, "google_pay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object p1

    .line 179
    :cond_0
    const-string v0, "link"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object p1

    .line 180
    :cond_1
    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object v0
.end method

.method public final toPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object p1

    .line 196
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;->getPaymentMethod()Lcom/stripe/android/model/PaymentMethod;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final toPaymentOption$paymentsheet_release(Lcom/stripe/android/paymentsheet/model/SavedSelection;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    if-eqz v0, :cond_0

    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object p1

    .line 187
    :cond_0
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    if-eqz v0, :cond_1

    sget-object p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    check-cast p1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object p1

    .line 188
    :cond_1
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$None;

    if-eqz v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    .line 189
    :cond_2
    instance-of v0, p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    return-object v0

    .line 185
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
