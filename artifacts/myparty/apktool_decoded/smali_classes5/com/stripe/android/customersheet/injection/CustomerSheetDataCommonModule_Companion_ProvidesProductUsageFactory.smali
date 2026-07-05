.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;
.super Ljava/lang/Object;
.source "CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory$InstanceHolder;
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

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;

    return-object v0
.end method

.method public static providesProductUsage()Ljava/util/Set;
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
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->providesProductUsage()Ljava/util/Set;

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
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->get()Ljava/util/Set;

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
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvidesProductUsageFactory;->providesProductUsage()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
