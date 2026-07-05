.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvideProductUsageTokensFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Set<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;

    return-object v0
.end method

.method public static provideProductUsageTokens()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 38
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;->get()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public get()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 30
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvideProductUsageTokensFactory;->provideProductUsageTokens()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
