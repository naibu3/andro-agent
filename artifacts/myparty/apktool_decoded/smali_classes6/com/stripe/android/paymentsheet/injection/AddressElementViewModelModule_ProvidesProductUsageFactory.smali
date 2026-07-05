.class public final Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;
.super Ljava/lang/Object;
.source "AddressElementViewModelModule_ProvidesProductUsageFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Ljava/util/Set<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    return-void
.end method

.method public static create(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;)Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;

    invoke-direct {v0, p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;-><init>(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;)V

    return-object v0
.end method

.method public static providesProductUsage(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;)Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 46
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;->providesProductUsage()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ldagger/internal/Preconditions;->checkNotNullFromProvides(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;->get()Ljava/util/Set;

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

    .line 37
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;->module:Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule_ProvidesProductUsageFactory;->providesProductUsage(Lcom/stripe/android/paymentsheet/injection/AddressElementViewModelModule;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
