.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;

    return-object v0
.end method

.method public static provideAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;
    .locals 1

    .line 38
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->provideAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;
    .locals 1

    .line 30
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;->provideAutocompleteLauncher()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideAutocompleteLauncherFactory;->get()Lcom/stripe/android/paymentsheet/addresselement/DefaultAutocompleteLauncher;

    move-result-object v0

    return-object v0
.end method
