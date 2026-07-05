.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvideLocaleFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;

    return-object v0
.end method

.method public static provideLocale()Ljava/util/Locale;
    .locals 1

    .line 37
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->provideLocale()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;->get()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Locale;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideLocaleFactory;->provideLocale()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method
