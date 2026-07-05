.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;
.super Ljava/lang/Object;
.source "ConfirmationDefinition.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Complete"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T",
        "LauncherArgs:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action<",
        "TT",
        "LauncherArgs;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u0000*\u0004\u0008\u0005\u0010\u00012\u0008\u0012\u0004\u0012\u0002H\u00010\u0002B)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\nH\u00c6\u0003J9\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00050\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;",
        "TLauncherArgs",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;",
        "intent",
        "Lcom/stripe/android/model/StripeIntent;",
        "confirmationOption",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "deferredIntentConfirmationType",
        "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "completedFullPaymentFlow",
        "",
        "<init>",
        "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V",
        "getIntent",
        "()Lcom/stripe/android/model/StripeIntent;",
        "getConfirmationOption",
        "()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
        "getDeferredIntentConfirmationType",
        "()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
        "getCompletedFullPaymentFlow",
        "()Z",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final completedFullPaymentFlow:Z

.field private final confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

.field private final deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

.field private final intent:Lcom/stripe/android/model/StripeIntent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationOption"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 231
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    .line 235
    iput-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    .line 239
    iput-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    .line 245
    iput-boolean p4, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;ZILjava/lang/Object;)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/StripeIntent;",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;",
            "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;",
            "Z)",
            "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete<",
            "TT",
            "LauncherArgs;",
            ">;"
        }
    .end annotation

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "confirmationOption"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;-><init>(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    iget-object v3, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    iget-boolean p1, p1, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCompletedFullPaymentFlow()Z
    .locals 1

    .line 245
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    return v0
.end method

.method public final getConfirmationOption()Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    return-object v0
.end method

.method public final getDeferredIntentConfirmationType()Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    return-object v0
.end method

.method public final getIntent()Lcom/stripe/android/model/StripeIntent;
    .locals 1

    .line 231
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->intent:Lcom/stripe/android/model/StripeIntent;

    iget-object v1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->confirmationOption:Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;

    iget-object v2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->deferredIntentConfirmationType:Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;

    iget-boolean v3, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action$Complete;->completedFullPaymentFlow:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Complete(intent="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", confirmationOption="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deferredIntentConfirmationType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", completedFullPaymentFlow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
