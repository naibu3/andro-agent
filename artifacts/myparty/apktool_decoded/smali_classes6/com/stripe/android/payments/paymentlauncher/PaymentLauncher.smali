.class public interface abstract Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
.super Ljava/lang/Object;
.source "PaymentLauncher.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;,
        Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$InternalPaymentResultCallback;,
        Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008f\u0018\u0000 \u000f2\u00020\u0001:\u0003\r\u000e\u000fJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\tH\'\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;",
        "",
        "confirm",
        "",
        "params",
        "Lcom/stripe/android/model/ConfirmPaymentIntentParams;",
        "Lcom/stripe/android/model/ConfirmSetupIntentParams;",
        "handleNextActionForPaymentIntent",
        "clientSecret",
        "",
        "handleNextActionForSetupIntent",
        "handleNextActionForHashedPaymentIntent",
        "hashedValue",
        "PaymentResultCallback",
        "InternalPaymentResultCallback",
        "Companion",
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
.field public static final Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->$$INSTANCE:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    sput-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    return-void
.end method

.method public static create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method

.method public static create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/activity/ComponentActivity;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method

.method public static create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method

.method public static create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;->Companion:Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$Companion;->create(Landroidx/fragment/app/Fragment;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher$PaymentResultCallback;)Lcom/stripe/android/payments/paymentlauncher/PaymentLauncher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract confirm(Lcom/stripe/android/model/ConfirmPaymentIntentParams;)V
.end method

.method public abstract confirm(Lcom/stripe/android/model/ConfirmSetupIntentParams;)V
.end method

.method public abstract handleNextActionForHashedPaymentIntent(Ljava/lang/String;)V
.end method

.method public abstract handleNextActionForPaymentIntent(Ljava/lang/String;)V
.end method

.method public abstract handleNextActionForSetupIntent(Ljava/lang/String;)V
.end method
