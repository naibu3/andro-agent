.class public final Lcom/stripe/android/link/LinkActivityContract_Factory;
.super Ljava/lang/Object;
.source "LinkActivityContract_Factory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/stripe/android/link/LinkActivityContract;",
        ">;"
    }
.end annotation


# instance fields
.field private final linkGateFactoryProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;"
        }
    .end annotation
.end field

.field private final nativeLinkActivityContractProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;"
        }
    .end annotation
.end field

.field private final webLinkActivityContractProvider:Ldagger/internal/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/WebLinkActivityContract;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/WebLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)V"
        }
    .end annotation

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->nativeLinkActivityContractProvider:Ldagger/internal/Provider;

    .line 40
    iput-object p2, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->webLinkActivityContractProvider:Ldagger/internal/Provider;

    .line 41
    iput-object p3, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    return-void
.end method

.method public static create(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)Lcom/stripe/android/link/LinkActivityContract_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/WebLinkActivityContract;",
            ">;",
            "Ldagger/internal/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)",
            "Lcom/stripe/android/link/LinkActivityContract_Factory;"
        }
    .end annotation

    .line 60
    new-instance v0, Lcom/stripe/android/link/LinkActivityContract_Factory;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/stripe/android/link/LinkActivityContract_Factory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/NativeLinkActivityContract;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/WebLinkActivityContract;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/stripe/android/link/gate/LinkGate$Factory;",
            ">;)",
            "Lcom/stripe/android/link/LinkActivityContract_Factory;"
        }
    .end annotation

    .line 53
    new-instance v0, Lcom/stripe/android/link/LinkActivityContract_Factory;

    invoke-static {p0}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p0

    invoke-static {p1}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p1

    invoke-static {p2}, Ldagger/internal/Providers;->asDaggerProvider(Ljavax/inject/Provider;)Ldagger/internal/Provider;

    move-result-object p2

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract_Factory;-><init>(Ldagger/internal/Provider;Ldagger/internal/Provider;Ldagger/internal/Provider;)V

    return-object v0
.end method

.method public static newInstance(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lcom/stripe/android/link/gate/LinkGate$Factory;)Lcom/stripe/android/link/LinkActivityContract;
    .locals 1

    .line 66
    new-instance v0, Lcom/stripe/android/link/LinkActivityContract;

    invoke-direct {v0, p0, p1, p2}, Lcom/stripe/android/link/LinkActivityContract;-><init>(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lcom/stripe/android/link/gate/LinkGate$Factory;)V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/stripe/android/link/LinkActivityContract;
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->nativeLinkActivityContractProvider:Ldagger/internal/Provider;

    invoke-interface {v0}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/link/NativeLinkActivityContract;

    iget-object v1, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->webLinkActivityContractProvider:Ldagger/internal/Provider;

    invoke-interface {v1}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/link/WebLinkActivityContract;

    iget-object v2, p0, Lcom/stripe/android/link/LinkActivityContract_Factory;->linkGateFactoryProvider:Ldagger/internal/Provider;

    invoke-interface {v2}, Ldagger/internal/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/link/gate/LinkGate$Factory;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/link/LinkActivityContract_Factory;->newInstance(Lcom/stripe/android/link/NativeLinkActivityContract;Lcom/stripe/android/link/WebLinkActivityContract;Lcom/stripe/android/link/gate/LinkGate$Factory;)Lcom/stripe/android/link/LinkActivityContract;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 12
    invoke-virtual {p0}, Lcom/stripe/android/link/LinkActivityContract_Factory;->get()Lcom/stripe/android/link/LinkActivityContract;

    move-result-object v0

    return-object v0
.end method
