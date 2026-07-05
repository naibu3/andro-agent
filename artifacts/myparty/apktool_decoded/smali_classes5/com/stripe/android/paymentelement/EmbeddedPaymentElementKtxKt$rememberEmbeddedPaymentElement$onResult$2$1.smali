.class final synthetic Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "EmbeddedPaymentElementKtx.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt;->rememberEmbeddedPaymentElement(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;",
        "Lkotlin/Unit;",
        ">;"
    }
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
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-class v3, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    const-string v5, "onResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V"

    const/4 v6, 0x0

    const/4 v1, 0x1

    const-string v4, "onResult"

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 40
    check-cast p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1;->invoke(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElementKtxKt$rememberEmbeddedPaymentElement$onResult$2$1;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    invoke-interface {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;->onResult(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Result;)V

    return-void
.end method
