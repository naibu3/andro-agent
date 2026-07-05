.class public final Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
.super Ljava/lang/Object;
.source "PaymentMethodCreateParams.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u0015\u0010\u000e\u001a\u00020\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0012\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cJ\u0006\u0010\u0013\u001a\u00020\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0012\u0010\t\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0008R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;",
        "",
        "<init>",
        "()V",
        "number",
        "",
        "expiryMonth",
        "",
        "Ljava/lang/Integer;",
        "expiryYear",
        "cvc",
        "networks",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;",
        "setNumber",
        "setExpiryMonth",
        "(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;",
        "setExpiryYear",
        "setCvc",
        "setNetworks",
        "build",
        "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;",
        "payments-core_release"
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
.field private cvc:Ljava/lang/String;

.field private expiryMonth:Ljava/lang/Integer;

.field private expiryYear:Ljava/lang/Integer;

.field private networks:Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

.field private number:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 405
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final build()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;
    .locals 10

    .line 433
    new-instance v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;

    .line 434
    iget-object v1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->number:Ljava/lang/String;

    .line 435
    iget-object v2, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->expiryMonth:Ljava/lang/Integer;

    .line 436
    iget-object v3, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->expiryYear:Ljava/lang/Integer;

    .line 437
    iget-object v4, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->cvc:Ljava/lang/String;

    .line 438
    iget-object v7, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->networks:Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 433
    invoke-direct/range {v0 .. v9}, Lcom/stripe/android/model/PaymentMethodCreateParams$Card;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final setCvc(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
    .locals 1

    .line 424
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 425
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->cvc:Ljava/lang/String;

    return-object p0
.end method

.method public final setExpiryMonth(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
    .locals 1

    .line 416
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 417
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->expiryMonth:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setExpiryYear(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
    .locals 1

    .line 420
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 421
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->expiryYear:Ljava/lang/Integer;

    return-object p0
.end method

.method public final setNetworks(Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
    .locals 1

    .line 428
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 429
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->networks:Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Networks;

    return-object p0
.end method

.method public final setNumber(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;
    .locals 1

    .line 412
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;

    .line 413
    iput-object p1, p0, Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;->number:Ljava/lang/String;

    return-object p0
.end method
