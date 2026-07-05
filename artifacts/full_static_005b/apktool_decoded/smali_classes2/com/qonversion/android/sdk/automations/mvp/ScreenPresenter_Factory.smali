.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;
.super Ljava/lang/Object;
.source "ScreenPresenter_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
        ">;"
    }
.end annotation


# instance fields
.field private final repositoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;"
        }
    .end annotation
.end field

.field private final viewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
            ">;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;->repositoryProvider:Ljavax/inject/Provider;

    .line 24
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;->viewProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/internal/repository/QRepository;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
            ">;)",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;"
        }
    .end annotation

    .line 34
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 1

    .line 38
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    invoke-direct {v0, p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 3

    .line 29
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;->repositoryProvider:Ljavax/inject/Provider;

    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;->viewProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 8
    invoke-virtual {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter_Factory;->get()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    move-result-object v0

    return-object v0
.end method
