.class public interface abstract Lcom/stripe/android/link/LinkLaunchMode;
.super Ljava/lang/Object;
.source "LinkLaunchMode.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkLaunchMode$Authentication;,
        Lcom/stripe/android/link/LinkLaunchMode$Confirmation;,
        Lcom/stripe/android/link/LinkLaunchMode$DefaultImpls;,
        Lcom/stripe/android/link/LinkLaunchMode$Full;,
        Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkLaunchMode;",
        "Landroid/os/Parcelable;",
        "selectedPayment",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "PaymentMethodSelection",
        "Full",
        "Confirmation",
        "Authentication",
        "Lcom/stripe/android/link/LinkLaunchMode$Authentication;",
        "Lcom/stripe/android/link/LinkLaunchMode$Confirmation;",
        "Lcom/stripe/android/link/LinkLaunchMode$Full;",
        "Lcom/stripe/android/link/LinkLaunchMode$PaymentMethodSelection;",
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


# virtual methods
.method public abstract selectedPayment()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
.end method
