.class public final synthetic Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    invoke-static {v0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncher;->$r8$lambda$ZMgakPX_Jfilv2kF6R8Ch9KIaNg(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResultCallback;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void
.end method
