.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Intent"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V",
        "getCreateIntentCallback",
        "()Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V
    .locals 1

    const-string v0, "createIntentCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-void
.end method


# virtual methods
.method public final getCreateIntentCallback()Lcom/stripe/android/paymentsheet/CreateIntentCallback;
    .locals 1

    .line 209
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;->createIntentCallback:Lcom/stripe/android/paymentsheet/CreateIntentCallback;

    return-object v0
.end method
