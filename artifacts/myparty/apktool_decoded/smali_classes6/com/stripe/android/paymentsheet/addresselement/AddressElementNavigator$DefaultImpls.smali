.class public final Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator$DefaultImpls;
.super Ljava/lang/Object;
.source "AddressElementNavigator.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic dismiss$default(Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;ILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 24
    sget-object p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;->INSTANCE:Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult$Canceled;

    check-cast p1, Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;

    :cond_0
    invoke-interface {p0, p1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->dismiss(Lcom/stripe/android/paymentsheet/addresselement/AddressLauncherResult;)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: dismiss"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
