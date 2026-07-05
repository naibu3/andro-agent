.class public interface abstract Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElementSubcomponent.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\rH\'\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule;",
        "",
        "bindsSheetLauncher",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;",
        "launcher",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;",
        "bindsConfirmationHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;",
        "confirmationHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;",
        "bindsEmbeddedResultCallbackHelper",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;",
        "helper",
        "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;",
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
.field public static final Companion:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;->$$INSTANCE:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule;->Companion:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsConfirmationHelper(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfirmationHelper;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedConfirmationHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsEmbeddedResultCallbackHelper(Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;)Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsSheetLauncher(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedSheetLauncher;)Lcom/stripe/android/paymentelement/embedded/content/EmbeddedSheetLauncher;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
