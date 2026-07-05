.class public interface abstract Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule$Bindings;
.super Ljava/lang/Object;
.source "AddressElementViewModelModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Bindings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule$Bindings;",
        "",
        "bindsAddressElementNavigator",
        "Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;",
        "navigator",
        "Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract bindsAddressElementNavigator(Lcom/stripe/android/paymentsheet/addresselement/NavHostAddressElementNavigator;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
