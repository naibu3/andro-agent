.class public interface abstract Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;
.super Ljava/lang/Object;
.source "DefaultConfirmationModule.kt"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/challenge/PassiveChallengeConfirmationModule;,
        Lcom/stripe/android/paymentelement/confirmation/injection/ConfirmationHandlerModule;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0008a\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/injection/DefaultConfirmationModule;",
        "",
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
