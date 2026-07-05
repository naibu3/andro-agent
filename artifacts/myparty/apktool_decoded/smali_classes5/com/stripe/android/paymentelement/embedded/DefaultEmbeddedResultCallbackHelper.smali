.class public final Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;
.super Ljava/lang/Object;
.source "DefaultEmbeddedResultCallbackHelper.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;


# annotations
.annotation runtime Lcom/stripe/android/paymentelement/embedded/content/EmbeddedPaymentElementScope;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;",
        "Lcom/stripe/android/paymentelement/embedded/EmbeddedResultCallbackHelper;",
        "resultCallback",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
        "stateHelper",
        "Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V",
        "setResult",
        "",
        "result",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;",
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
.field private final resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

.field private final stateHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "resultCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;->resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    .line 15
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;->stateHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    return-void
.end method


# virtual methods
.method public setResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;->resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;->onResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    .line 20
    instance-of p1, p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result$Completed;

    if-eqz p1, :cond_0

    .line 21
    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/DefaultEmbeddedResultCallbackHelper;->stateHelper:Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/stripe/android/paymentelement/embedded/content/EmbeddedStateHelper;->setState(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$State;)V

    :cond_0
    return-void
.end method
