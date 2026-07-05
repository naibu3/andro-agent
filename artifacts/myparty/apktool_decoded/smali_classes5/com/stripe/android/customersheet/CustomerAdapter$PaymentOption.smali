.class public abstract Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
.super Ljava/lang/Object;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "PaymentOption"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;,
        Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;,
        Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;,
        Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u00172\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J4\u0010\u0008\u001a\u0004\u0018\u00010\t2#\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\u000c\u0008\u000c\u0012\u0008\u0008\r\u0012\u0004\u0008\u0008(\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0000\u00a2\u0006\u0002\u0008\u0010J\r\u0010\u0011\u001a\u00020\u0012H\u0000\u00a2\u0006\u0002\u0008\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0003\u0018\u0019\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
        "",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "getId",
        "()Ljava/lang/String;",
        "toPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "paymentMethodProvider",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "paymentMethodId",
        "Lcom/stripe/android/model/PaymentMethod;",
        "toPaymentSelection$paymentsheet_release",
        "toSavedSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "toSavedSelection$paymentsheet_release",
        "GooglePay",
        "Link",
        "StripeId",
        "Companion",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;",
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

.field public static final Companion:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->id:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static final fromId(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->Companion:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Companion;->fromId(Ljava/lang/String;)Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 1

    .line 136
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final toPaymentSelection$paymentsheet_release(Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;"
        }
    .end annotation

    const-string v0, "paymentMethodProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;

    if-eqz v0, :cond_0

    .line 150
    sget-object p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object p1

    .line 153
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    if-eqz v0, :cond_1

    .line 154
    new-instance v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;-><init>(Lcom/stripe/android/link/LinkExpressMode;Lcom/stripe/android/link/LinkPaymentMethod;Lcom/stripe/android/model/ConsumerShippingAddress;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v1

    .line 157
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    if-eqz v0, :cond_3

    .line 158
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/PaymentMethod;

    if-eqz v1, :cond_2

    .line 159
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;-><init>(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;Lcom/stripe/android/model/PaymentMethodOptionsParams;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 158
    :goto_0
    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0

    .line 148
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final toSavedSelection$paymentsheet_release()Lcom/stripe/android/paymentsheet/model/SavedSelection;
    .locals 2

    .line 167
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$GooglePay;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$GooglePay;

    check-cast v0, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0

    .line 168
    :cond_0
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    if-eqz v0, :cond_1

    sget-object v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;->INSTANCE:Lcom/stripe/android/paymentsheet/model/SavedSelection$Link;

    check-cast v0, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0

    .line 169
    :cond_1
    instance-of v0, p0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;

    invoke-virtual {v1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$StripeId;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/model/SavedSelection$PaymentMethod;-><init>(Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/model/SavedSelection;

    return-object v0

    .line 166
    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
