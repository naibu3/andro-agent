.class final Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;
.super Ljava/lang/Object;
.source "EmbeddedConfigurationHandler.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InFlightRequest"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\"\u0010\u0004\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J*\u0010\u0016\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0011J\u000f\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JN\u0010\u0018\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032$\u0008\u0002\u0010\u0004\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR/\u0010\u0004\u001a\u001e\u0008\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;",
        "",
        "arguments",
        "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
        "result",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
        "cancellationHandle",
        "Lkotlin/Function0;",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V",
        "getArguments",
        "()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
        "getResult",
        "()Lkotlin/jvm/functions/Function1;",
        "Lkotlin/jvm/functions/Function1;",
        "getCancellationHandle",
        "()Lkotlin/jvm/functions/Function0;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

.field private final cancellationHandle:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final result:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 154
    iput-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    .line 155
    iput-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    .line 156
    iput-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->copy(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    return-object v0
.end method

.method public final component2()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final component3()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;"
        }
    .end annotation

    const-string v0, "arguments"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationHandle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;

    invoke-direct {v0, p1, p2, p3}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;-><init>(Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    iget-object p1, p1, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getArguments()Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    return-object v0
.end method

.method public final getCancellationHandle()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getResult()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Lcom/stripe/android/paymentsheet/state/PaymentElementLoader$State;",
            ">;>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 155
    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    invoke-virtual {v0}, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->arguments:Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$Arguments;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->result:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/embedded/content/DefaultEmbeddedConfigurationHandler$InFlightRequest;->cancellationHandle:Lkotlin/jvm/functions/Function0;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "InFlightRequest(arguments="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", result="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cancellationHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
