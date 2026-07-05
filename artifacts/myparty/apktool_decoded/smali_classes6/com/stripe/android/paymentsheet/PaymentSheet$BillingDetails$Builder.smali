.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3851:1\n1#2:3852\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\t\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007J\u0006\u0010\u000c\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;",
        "",
        "<init>",
        "()V",
        "address",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;",
        "email",
        "",
        "name",
        "phone",
        "addressBuilder",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

.field private email:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private phone:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2722
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final address(Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    const-string v0, "addressBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2730
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->build()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    return-object p0
.end method

.method public final address(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    .line 2728
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    return-object p0
.end method

.method public final build()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;
    .locals 5

    .line 2736
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->address:Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->email:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->name:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->phone:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final email(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    .line 2732
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->email:Ljava/lang/String;

    return-object p0
.end method

.method public final name(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    .line 2733
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final phone(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;
    .locals 1

    .line 2734
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetails$Builder;->phone:Ljava/lang/String;

    return-object p0
.end method
