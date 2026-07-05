.class public final Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;
.super Ljava/lang/Object;
.source "QHandledPurchasesCache_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;-><init>()V

    sput-object v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;
    .locals 1

    .line 23
    sget-object v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->INSTANCE:Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;

    return-object v0
.end method

.method public static newInstance()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 27
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;
    .locals 1

    .line 19
    new-instance v0, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    invoke-direct {v0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;-><init>()V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 6
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache_Factory;->get()Lcom/qonversion/android/sdk/internal/QHandledPurchasesCache;

    move-result-object v0

    return-object v0
.end method
