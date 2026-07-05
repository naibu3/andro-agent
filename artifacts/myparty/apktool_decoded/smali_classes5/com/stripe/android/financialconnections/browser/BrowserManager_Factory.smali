.class public final Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;
.super Ljava/lang/Object;
.source "BrowserManager_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/financialconnections/browser/BrowserManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;)V"
        }
    .end annotation

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;->contextProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;)Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;"
        }
    .end annotation

    .line 45
    new-instance v0, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/app/Application;",
            ">;)",
            "Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;"
        }
    .end annotation

    .line 41
    new-instance v0, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;-><init>(Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Landroid/app/Application;)Lcom/stripe/android/financialconnections/browser/BrowserManager;
    .locals 1

    .line 49
    new-instance v0, Lcom/stripe/android/financialconnections/browser/BrowserManager;

    invoke-direct {v0, p0}, Lcom/stripe/android/financialconnections/browser/BrowserManager;-><init>(Landroid/app/Application;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/financialconnections/browser/BrowserManager;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;->contextProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Application;

    invoke-static {v0}, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;->newInstance(Landroid/app/Application;)Lcom/stripe/android/financialconnections/browser/BrowserManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/browser/BrowserManager_Factory;->get()Lcom/stripe/android/financialconnections/browser/BrowserManager;

    move-result-object v0

    return-object v0
.end method
