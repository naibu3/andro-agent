.class public final Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;
.super Ljava/lang/Object;
.source "ActivityProvider_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;",
        ">;"
    }
.end annotation


# instance fields
.field private final applicationProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
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
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->applicationProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;"
        }
    .end annotation

    .line 29
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Landroid/app/Application;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 1

    .line 33
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    invoke-direct {v0, p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;-><init>(Landroid/app/Application;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;
    .locals 2

    .line 25
    new-instance v0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->applicationProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/app/Application;

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;-><init>(Landroid/app/Application;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider_Factory;->get()Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    move-result-object v0

    return-object v0
.end method
