.class public final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$lambda$9$lambda$8$$inlined$onDispose$1;
.super Ljava/lang/Object;
.source "Effects.kt"

# interfaces
.implements Landroidx/compose/runtime/DisposableEffectResult;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt;->USBankAccountEmitters(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 USBankAccountEmitters.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt\n*L\n1#1,490:1\n56#2,3:491\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0008\u0010\u0002\u001a\u00020\u0003H\u0016\u00a8\u0006\u0004\u00b8\u0006\u0000"
    }
    d2 = {
        "androidx/compose/runtime/DisposableEffectScope$onDispose$1",
        "Landroidx/compose/runtime/DisposableEffectResult;",
        "dispose",
        "",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $usBankAccountFormArgs$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

.field final synthetic $viewModel$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$lambda$9$lambda$8$$inlined$onDispose$1;->$usBankAccountFormArgs$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$lambda$9$lambda$8$$inlined$onDispose$1;->$viewModel$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public dispose()V
    .locals 2

    .line 491
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$lambda$9$lambda$8$$inlined$onDispose$1;->$usBankAccountFormArgs$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->getOnUpdatePrimaryButtonUIState()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$6$1$1$1;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$6$1$1$1;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 492
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountEmittersKt$USBankAccountEmitters$lambda$9$lambda$8$$inlined$onDispose$1;->$viewModel$inlined:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormViewModel;->onDestroy()V

    return-void
.end method
