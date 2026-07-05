.class public final Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;
.super Ljava/lang/Object;
.source "CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Long;",
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

.method public static create()Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;

    return-object v0
.end method

.method public static provideTimeProvider()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 38
    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;

    invoke-virtual {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule$Companion;->provideTimeProvider()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    invoke-static {v0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/jvm/functions/Function0;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;->get()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method

.method public get()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 30
    invoke-static {}, Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule_Companion_ProvideTimeProviderFactory;->provideTimeProvider()Lkotlin/jvm/functions/Function0;

    move-result-object v0

    return-object v0
.end method
