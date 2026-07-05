.class public final synthetic Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

.field public final synthetic f$1:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function1;

.field public final synthetic f$3:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/link/injection/NativeLinkComponent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

    iput-object p2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/link/injection/NativeLinkComponent;

    iget-object v1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$1:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$2:Lkotlin/jvm/functions/Function1;

    iget-object v3, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion$$ExternalSyntheticLambda0;->f$3:Lkotlin/jvm/functions/Function1;

    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel$Companion;->$r8$lambda$a5gFBOViOn5q5j23vmHadpBMd3Q(Lcom/stripe/android/link/injection/NativeLinkComponent;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/ui/signup/SignUpViewModel;

    move-result-object p1

    return-object p1
.end method
