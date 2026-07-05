.class public final synthetic Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda4;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel$$ExternalSyntheticLambda4;->f$0:Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;

    check-cast p1, Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    invoke-static {v0, p1}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthViewModel;->$r8$lambda$2Z4ld5U006K2BmLjggNDGCzrNL8(Lcom/stripe/android/financialconnections/exception/WebAuthFlowFailedException;Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;)Lcom/stripe/android/financialconnections/features/partnerauth/SharedPartnerAuthState;

    move-result-object p1

    return-object p1
.end method
