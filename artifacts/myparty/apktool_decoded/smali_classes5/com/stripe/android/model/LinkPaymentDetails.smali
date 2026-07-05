.class public interface abstract Lcom/stripe/android/model/LinkPaymentDetails;
.super Ljava/lang/Object;
.source "LinkPaymentDetails.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;,
        Lcom/stripe/android/model/LinkPaymentDetails$Card;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008w\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/model/LinkPaymentDetails;",
        "Landroid/os/Parcelable;",
        "last4",
        "",
        "getLast4",
        "()Ljava/lang/String;",
        "Card",
        "BankAccount",
        "Lcom/stripe/android/model/LinkPaymentDetails$BankAccount;",
        "Lcom/stripe/android/model/LinkPaymentDetails$Card;",
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


# virtual methods
.method public abstract getLast4()Ljava/lang/String;
.end method
