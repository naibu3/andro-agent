.class public final synthetic Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$$ExternalSyntheticLambda9;->f$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity$$ExternalSyntheticLambda9;->f$0:Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;

    check-cast p1, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;

    invoke-static {v0, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;->$r8$lambda$Dx44XHOmjoBNHtkkX_589oRk5ow(Lcom/stripe/android/stripe3ds2/views/ChallengeActivity;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
