.class public final Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;
.super Ljava/lang/Object;
.source "ApiErrorMapper_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;",
        ">;"
    }
.end annotation


# instance fields
.field private final helperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->helperProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/api/ApiHelper;",
            ">;)",
            "Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;"
        }
    .end annotation

    .line 28
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 1

    .line 32
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;
    .locals 2

    .line 24
    new-instance v0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->helperProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/api/ApiHelper;

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;-><init>(Lcom/qonversion/android/sdk/internal/api/ApiHelper;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 7
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper_Factory;->get()Lcom/qonversion/android/sdk/internal/api/ApiErrorMapper;

    move-result-object v0

    return-object v0
.end method
