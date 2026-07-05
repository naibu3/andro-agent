.class public final Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;
.super Lcom/stripe/android/core/exception/StripeException;
.source "IntentConfirmationInterceptor.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016R\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;",
        "Lcom/stripe/android/core/exception/StripeException;",
        "<init>",
        "()V",
        "analyticsValue",
        "",
        "message",
        "getMessage",
        "()Ljava/lang/String;",
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


# instance fields
.field private final message:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    .line 120
    invoke-direct/range {v0 .. v7}, Lcom/stripe/android/core/exception/StripeException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/Throwable;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 127
    const-string v1, "The payment method on the intent doesn\'t match the one provided in the createIntentCallback. When using deferred\nintent creation, ensure you\'re either creating a new intent with the correct payment method or updating an\nexisting intent with the new payment method ID."

    iput-object v1, v0, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;->message:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public analyticsValue()Ljava/lang/String;
    .locals 1

    .line 121
    const-string v0, "invalidDeferredIntentUsage"

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/intent/InvalidDeferredIntentUsageException;->message:Ljava/lang/String;

    return-object v0
.end method
