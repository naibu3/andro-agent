.class public final Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;
.super Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;
.source "AddPaymentMethodOption.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Bank"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;",
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
        "financialConnectionsAvailability",
        "Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "<init>",
        "(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V",
        "getFinancialConnectionsAvailability",
        "()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;",
        "component1",
        "copy",
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


# instance fields
.field private final financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V
    .locals 4

    const-string v0, "financialConnectionsAvailability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget v0, Lcom/stripe/android/ui/core/R$string;->stripe_payment_method_bank:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v0

    .line 16
    const-string v1, "Bank"

    invoke-direct {p0, v1, v0, v3}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->copy(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;
    .locals 1

    const-string v0, "financialConnectionsAvailability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;-><init>(Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    iget-object p1, p1, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getFinancialConnectionsAvailability()Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    invoke-virtual {v0}, Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;->financialConnectionsAvailability:Lcom/stripe/android/payments/financialconnections/FinancialConnectionsAvailability;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Bank(financialConnectionsAvailability="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
