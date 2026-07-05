.class public final synthetic Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

.field public final synthetic f$1:Lcom/stripe/android/link/model/LinkAccount;

.field public final synthetic f$2:Z

.field public final synthetic f$3:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$6:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

    iput-object p2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$2:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

    iget-object v1, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Lcom/stripe/android/link/model/LinkAccount;

    iget-boolean v2, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$2:Z

    iget-object v3, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function0;

    iget-object v4, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v5, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion$$ExternalSyntheticLambda0;->f$6:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/lifecycle/viewmodel/CreationExtras;

    invoke-static/range {v0 .. v7}, Lcom/stripe/android/link/ui/verification/VerificationViewModel$Companion;->$r8$lambda$_JH4FreG8UWa7rFdMCXLy4wkyh8(Lcom/stripe/android/link/injection/NativeLinkComponent;Lcom/stripe/android/link/model/LinkAccount;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/ui/verification/VerificationViewModel;

    move-result-object p1

    return-object p1
.end method
