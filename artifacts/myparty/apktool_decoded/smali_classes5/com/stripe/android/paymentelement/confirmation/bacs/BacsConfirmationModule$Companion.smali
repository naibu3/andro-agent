.class public final Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;
.super Ljava/lang/Object;
.source "BacsConfirmationModule.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;",
        "",
        "<init>",
        "()V",
        "providesBacsMandateConfirmationLauncherFactory",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/confirmation/bacs/BacsConfirmationModule$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final providesBacsMandateConfirmationLauncherFactory()Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 23
    sget-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/DefaultBacsMandateConfirmationLauncherFactory;

    check-cast v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationLauncherFactory;

    return-object v0
.end method
