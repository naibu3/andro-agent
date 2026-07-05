.class public final Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;
.super Ljava/lang/Object;
.source "NativeLinkModule_Companion_ProvidesEnableLoggingFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;
    .locals 1

    .line 32
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;

    return-object v0
.end method

.method public static providesEnableLogging()Z
    .locals 1

    .line 36
    sget-object v0, Lcom/stripe/android/link/injection/NativeLinkModule;->Companion:Lcom/stripe/android/link/injection/NativeLinkModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/link/injection/NativeLinkModule$Companion;->providesEnableLogging()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public get()Ljava/lang/Boolean;
    .locals 1

    .line 28
    invoke-static {}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;->providesEnableLogging()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 9
    invoke-virtual {p0}, Lcom/stripe/android/link/injection/NativeLinkModule_Companion_ProvidesEnableLoggingFactory;->get()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
