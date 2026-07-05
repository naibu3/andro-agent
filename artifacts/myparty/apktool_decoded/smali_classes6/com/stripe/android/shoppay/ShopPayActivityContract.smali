.class public final Lcom/stripe/android/shoppay/ShopPayActivityContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "ShopPayActivityContract.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;,
        Lcom/stripe/android/shoppay/ShopPayActivityContract$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;",
        "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u0012B\u0013\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/shoppay/ShopPayActivityContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;",
        "Lcom/stripe/android/shoppay/ShopPayActivityResult;",
        "paymentElementCallbackIdentifier",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "Args",
        "Companion",
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
.field public static final $stable:I = 0x0

.field public static final Companion:Lcom/stripe/android/shoppay/ShopPayActivityContract$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "com.stripe.android.shoppay.ShopPayActivityContract.extra_result"


# instance fields
.field private final paymentElementCallbackIdentifier:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/shoppay/ShopPayActivityContract$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/shoppay/ShopPayActivityContract$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/shoppay/ShopPayActivityContract;->Companion:Lcom/stripe/android/shoppay/ShopPayActivityContract$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation runtime Lcom/stripe/android/paymentelement/callbacks/PaymentElementCallbackIdentifier;
        .end annotation
    .end param
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "paymentElementCallbackIdentifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract;->paymentElementCallbackIdentifier:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;)Landroid/content/Intent;
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    sget-object v0, Lcom/stripe/android/PaymentConfiguration;->Companion:Lcom/stripe/android/PaymentConfiguration$Companion;

    invoke-virtual {v0, p1}, Lcom/stripe/android/PaymentConfiguration$Companion;->getInstance(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;

    move-result-object v0

    .line 19
    sget-object v1, Lcom/stripe/android/shoppay/ShopPayActivity;->Companion:Lcom/stripe/android/shoppay/ShopPayActivity$Companion;

    .line 21
    new-instance v2, Lcom/stripe/android/shoppay/ShopPayArgs;

    .line 22
    invoke-virtual {p2}, Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;->getShopPayConfiguration()Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;

    move-result-object v3

    .line 23
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getPublishableKey()Ljava/lang/String;

    move-result-object v4

    .line 24
    invoke-virtual {v0}, Lcom/stripe/android/PaymentConfiguration;->getStripeAccountId()Ljava/lang/String;

    move-result-object v5

    .line 25
    iget-object v6, p0, Lcom/stripe/android/shoppay/ShopPayActivityContract;->paymentElementCallbackIdentifier:Ljava/lang/String;

    .line 26
    invoke-virtual {p2}, Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;->getCustomerSessionClientSecret()Ljava/lang/String;

    move-result-object v7

    .line 27
    invoke-virtual {p2}, Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;->getBusinessName()Ljava/lang/String;

    move-result-object v8

    .line 21
    invoke-direct/range {v2 .. v8}, Lcom/stripe/android/shoppay/ShopPayArgs;-><init>(Lcom/stripe/android/paymentsheet/PaymentSheet$ShopPayConfiguration;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1, p1, v2}, Lcom/stripe/android/shoppay/ShopPayActivity$Companion;->createIntent$paymentsheet_release(Landroid/content/Context;Lcom/stripe/android/shoppay/ShopPayArgs;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 12
    check-cast p2, Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivityContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/shoppay/ShopPayActivityResult;
    .locals 1

    if-eqz p2, :cond_0

    .line 33
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 34
    const-string p2, "com.stripe.android.shoppay.ShopPayActivityContract.extra_result"

    const-class v0, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    invoke-static {p1, p2, v0}, Landroidx/core/os/BundleCompat;->getParcelable(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    .line 36
    new-instance p1, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;

    new-instance p2, Ljava/lang/Throwable;

    const-string v0, "No result"

    invoke-direct {p2, v0}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivityResult$Failed;-><init>(Ljava/lang/Throwable;)V

    check-cast p1, Lcom/stripe/android/shoppay/ShopPayActivityResult;

    :cond_1
    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/shoppay/ShopPayActivityContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/shoppay/ShopPayActivityResult;

    move-result-object p1

    return-object p1
.end method
