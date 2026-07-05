.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/core/utils/UserFacingLogger;",
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

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;
    .locals 1

    .line 33
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;

    return-object v0
.end method

.method public static providesUserFacingLogger()Lcom/stripe/android/core/utils/UserFacingLogger;
    .locals 1

    .line 37
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->providesUserFacingLogger()Lcom/stripe/android/core/utils/UserFacingLogger;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/core/utils/UserFacingLogger;
    .locals 1

    .line 29
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;->providesUserFacingLogger()Lcom/stripe/android/core/utils/UserFacingLogger;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;->get()Lcom/stripe/android/core/utils/UserFacingLogger;

    move-result-object v0

    return-object v0
.end method
