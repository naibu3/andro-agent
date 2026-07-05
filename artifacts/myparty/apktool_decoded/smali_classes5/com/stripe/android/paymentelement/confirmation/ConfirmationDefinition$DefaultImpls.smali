.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$DefaultImpls;
.super Ljava/lang/Object;
.source "ConfirmationDefinition.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static canConfirm(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TConfirmationOption::",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
            "T",
            "Launcher:Ljava/lang/Object;",
            "T",
            "LauncherArgs:Ljava/lang/Object;",
            "T",
            "LauncherResult::Landroid/os/Parcelable;",
            ">(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "TTConfirmationOption;TT",
            "Launcher;",
            "TT",
            "LauncherArgs;",
            "TT",
            "LauncherResult;",
            ">;TTConfirmationOption;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;",
            ")Z"
        }
    .end annotation

    const-string p0, "confirmationOption"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "confirmationParameters"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static unregister(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<TConfirmationOption::",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
            "T",
            "Launcher:Ljava/lang/Object;",
            "T",
            "LauncherArgs:Ljava/lang/Object;",
            "T",
            "LauncherResult::Landroid/os/Parcelable;",
            ">(",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition<",
            "TTConfirmationOption;TT",
            "Launcher;",
            "TT",
            "LauncherArgs;",
            "TT",
            "LauncherResult;",
            ">;TT",
            "Launcher;",
            ")V"
        }
    .end annotation

    return-void
.end method
