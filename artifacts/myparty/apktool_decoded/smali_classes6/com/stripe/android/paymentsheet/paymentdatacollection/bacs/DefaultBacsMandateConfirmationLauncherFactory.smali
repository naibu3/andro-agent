.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;
.super Ljava/lang/Object;
.source "BacsMandateConfirmationLauncherFactory.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;",
        "<init>",
        "()V",
        "create",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;",
        "activityResultLauncher",
        "Landroidx/activity/result/ActivityResultLauncher;",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Landroidx/activity/result/ActivityResultLauncher;)Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/activity/result/ActivityResultLauncher<",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$Args;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;"
        }
    .end annotation

    const-string v0, "activityResultLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncher;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncher;-><init>(Landroidx/activity/result/ActivityResultLauncher;)V

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncher;

    return-object v0
.end method
