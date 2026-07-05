.class final Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "LinkPassthroughConfirmationDefinition.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;->action(Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stripe.android.paymentelement.confirmation.link.LinkPassthroughConfirmationDefinition"
    f = "LinkPassthroughConfirmationDefinition.kt"
    i = {}
    l = {
        0x24
    }
    m = "action"
    n = {}
    s = {}
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;


# direct methods
.method constructor <init>(Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;->this$0:Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;

    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;->result:Ljava/lang/Object;

    iget p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;->label:I

    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition$action$1;->this$0:Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;

    const/4 v0, 0x0

    move-object v1, p0

    check-cast v1, Lkotlin/coroutines/Continuation;

    invoke-virtual {p1, v0, v0, v1}, Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationDefinition;->action(Lcom/stripe/android/paymentelement/confirmation/link/LinkPassthroughConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
