.class public interface abstract Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;
.super Ljava/lang/Object;
.source "BacsMandateConfirmationResult.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Cancelled;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Companion;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Confirmed;,
        Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$ModifyDetails;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;",
        "Landroid/os/Parcelable;",
        "Confirmed",
        "ModifyDetails",
        "Cancelled",
        "Companion",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Cancelled;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Confirmed;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$ModifyDetails;",
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
.field public static final Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Companion;

.field public static final EXTRA_RESULT:Ljava/lang/String; = "extra_activity_result"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Companion;->$$INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Companion;

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult;->Companion:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationResult$Companion;

    return-void
.end method
