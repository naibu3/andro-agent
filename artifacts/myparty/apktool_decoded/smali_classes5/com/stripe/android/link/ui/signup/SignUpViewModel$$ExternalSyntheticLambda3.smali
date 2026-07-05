.class public final synthetic Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/ui/signup/SignUpViewModel$$ExternalSyntheticLambda3;->f$0:Lcom/stripe/android/core/strings/ResolvableString;

    check-cast p1, Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    invoke-static {v0, p1}, Lcom/stripe/android/link/ui/signup/SignUpViewModel;->$r8$lambda$kRwgsk6IzAu_rNrIHV4eZMXqHyk(Lcom/stripe/android/core/strings/ResolvableString;Lcom/stripe/android/link/ui/signup/SignUpScreenState;)Lcom/stripe/android/link/ui/signup/SignUpScreenState;

    move-result-object p1

    return-object p1
.end method
