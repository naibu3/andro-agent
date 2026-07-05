.class public final Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
.super Ljava/lang/Object;
.source "PaymentSheet.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/PaymentSheet$Address;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPaymentSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentSheet.kt\ncom/stripe/android/paymentsheet/PaymentSheet$Address$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3851:1\n1#2:3852\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0006\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0007\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0008\u001a\u00020\u00002\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\t\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\n\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000b\u001a\u00020\u000cR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;",
        "",
        "<init>",
        "()V",
        "city",
        "",
        "country",
        "line1",
        "line2",
        "postalCode",
        "state",
        "build",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Address;",
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
.field private city:Ljava/lang/String;

.field private country:Ljava/lang/String;

.field private line1:Ljava/lang/String;

.field private line2:Ljava/lang/String;

.field private postalCode:Ljava/lang/String;

.field private state:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/paymentsheet/PaymentSheet$Address;
    .locals 7

    .line 2687
    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->city:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->country:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->line1:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->line2:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->postalCode:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->state:Ljava/lang/String;

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/paymentsheet/PaymentSheet$Address;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final city(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2680
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->city:Ljava/lang/String;

    return-object p0
.end method

.method public final country(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2681
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->country:Ljava/lang/String;

    return-object p0
.end method

.method public final line1(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2682
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->line1:Ljava/lang/String;

    return-object p0
.end method

.method public final line2(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2683
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->line2:Ljava/lang/String;

    return-object p0
.end method

.method public final postalCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2684
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->postalCode:Ljava/lang/String;

    return-object p0
.end method

.method public final state(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;
    .locals 1

    .line 2685
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentSheet$Address$Builder;->state:Ljava/lang/String;

    return-object p0
.end method
