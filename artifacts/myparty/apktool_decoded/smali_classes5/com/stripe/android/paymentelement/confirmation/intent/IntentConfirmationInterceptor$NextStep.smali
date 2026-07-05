.class public interface abstract Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;
.super Ljava/lang/Object;
.source "IntentConfirmationInterceptor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "NextStep"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;,
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;,
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;,
        Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\u0008\tR\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\u000c\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep;",
        "",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "getDeferredIntentConfirmationType",
        "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "Fail",
        "Confirm",
        "HandleNextAction",
        "Complete",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Complete;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Confirm;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$Fail;",
        "Lcom/stripe/android/paymentelement/confirmation/intent/IntentConfirmationInterceptor$NextStep$HandleNextAction;",
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
.method public abstract getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;
.end method
