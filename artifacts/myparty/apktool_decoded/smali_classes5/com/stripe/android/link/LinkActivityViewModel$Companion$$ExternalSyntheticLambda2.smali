.class public final synthetic Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda2;->f$0:Landroidx/lifecycle/SavedStateHandle;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityViewModel$Companion$$ExternalSyntheticLambda2;->f$0:Landroidx/lifecycle/SavedStateHandle;

    check-cast p1, Landroidx/lifecycle/viewmodel/CreationExtras;

    invoke-static {v0, p1}, Lcom/stripe/android/link/LinkActivityViewModel$Companion;->$r8$lambda$ozEhpFLwt6rKtiJD9e4ukwGDenQ(Landroidx/lifecycle/SavedStateHandle;Landroidx/lifecycle/viewmodel/CreationExtras;)Lcom/stripe/android/link/LinkActivityViewModel;

    move-result-object p1

    return-object p1
.end method
