.class public final Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;
.super Ljava/lang/Object;
.source "CoreCommonModule_ProvideLocaleFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Locale;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/core/injection/CoreCommonModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/core/injection/CoreCommonModule;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->module:Lcom/stripe/android/core/injection/CoreCommonModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/core/injection/CoreCommonModule;)Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;
    .locals 1

    .line 39
    new-instance v0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;-><init>(Lcom/stripe/android/core/injection/CoreCommonModule;)V

    return-object v0
.end method

.method public static provideLocale(Lcom/stripe/android/core/injection/CoreCommonModule;)Ljava/util/Locale;
    .locals 0

    .line 43
    invoke-virtual {p0}, Lcom/stripe/android/core/injection/CoreCommonModule;->provideLocale()Ljava/util/Locale;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->get()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Locale;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->module:Lcom/stripe/android/core/injection/CoreCommonModule;

    invoke-static {v0}, Lcom/stripe/android/core/injection/CoreCommonModule_ProvideLocaleFactory;->provideLocale(Lcom/stripe/android/core/injection/CoreCommonModule;)Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method
