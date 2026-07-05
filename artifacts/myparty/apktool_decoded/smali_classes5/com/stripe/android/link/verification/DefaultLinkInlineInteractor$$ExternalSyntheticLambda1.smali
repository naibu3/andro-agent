.class public final synthetic Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

.field public final synthetic f$1:Lcom/stripe/android/link/model/LinkAccount;

.field public final synthetic f$2:Lcom/stripe/android/link/LinkConfiguration;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    iput-object p2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iput-object p3, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/LinkConfiguration;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$0:Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;

    iget-object v1, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iget-object v2, p0, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor$$ExternalSyntheticLambda1;->f$2:Lcom/stripe/android/link/LinkConfiguration;

    check-cast p1, Lcom/stripe/android/link/verification/LinkInlineState;

    invoke-static {v0, v1, v2, p1}, Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;->$r8$lambda$U87yBeAILTZqgJWui7juTYJM1g4(Lcom/stripe/android/link/verification/DefaultLinkInlineInteractor;Lcom/stripe/android/link/model/LinkAccount;Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/link/verification/LinkInlineState;)Lcom/stripe/android/link/verification/LinkInlineState;

    move-result-object p1

    return-object p1
.end method
