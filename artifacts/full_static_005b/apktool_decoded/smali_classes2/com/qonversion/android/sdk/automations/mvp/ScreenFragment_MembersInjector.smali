.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;
.super Ljava/lang/Object;
.source "ScreenFragment_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;",
        ">;"
    }
.end annotation


# instance fields
.field private final automationsManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
            ">;"
        }
    .end annotation
.end field

.field private final presenterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
            ">;"
        }
    .end annotation
.end field

.field private final screenProcessorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
            ">;)V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->automationsManagerProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->presenterProvider:Ljavax/inject/Provider;

    .line 29
    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->screenProcessorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;",
            ">;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->automationsManager:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    return-void
.end method

.method public static injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->presenter:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    return-void
.end method

.method public static injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;->screenProcessor:Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->automationsManagerProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 41
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->presenterProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    .line 42
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->screenProcessorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 9
    check-cast p1, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectMembers(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V

    return-void
.end method
