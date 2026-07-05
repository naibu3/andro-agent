.class public final synthetic Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;->$r8$lambda$l3XhYZtWWprMgAxvHk2pOpNHSIg(Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;Lcom/stripe/android/paymentsheet/addresselement/AutocompleteContract$Result;)V

    return-void
.end method
