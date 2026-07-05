.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;
.super Ljava/lang/Object;
.source "DaggerFragmentComponent.java"

# interfaces
.implements Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    }
.end annotation


# instance fields
.field private final appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

.field private provideScreenProcessorProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;",
            ">;"
        }
    .end annotation
.end field

.field private provideScreenViewProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    .line 34
    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->initialize(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent-IA;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V

    return-void
.end method

.method public static builder()Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 2

    .line 38
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;-><init>(Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent-IA;)V

    return-object v0
.end method

.method private getScreenPresenter()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;
    .locals 3

    .line 42
    new-instance v0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    invoke-interface {v1}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->repository()Lcom/qonversion/android/sdk/internal/repository/QRepository;

    move-result-object v1

    const-string v2, "Cannot return null from a non-@Nullable component method"

    invoke-static {v1, v2}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/repository/QRepository;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenViewProvider:Ljavax/inject/Provider;

    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    invoke-direct {v0, v1, v2}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;-><init>(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V

    return-object v0
.end method

.method private initialize(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)V
    .locals 0

    .line 47
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenViewFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenViewFactory;

    move-result-object p2

    invoke-static {p2}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p2

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenViewProvider:Ljavax/inject/Provider;

    .line 48
    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenProcessorFactory;->create(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/module/FragmentModule_ProvideScreenProcessorFactory;

    move-result-object p1

    invoke-static {p1}, Ldagger/internal/DoubleCheck;->provider(Ljavax/inject/Provider;)Ljavax/inject/Provider;

    move-result-object p1

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenProcessorProvider:Ljavax/inject/Provider;

    return-void
.end method

.method private injectScreenFragment(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;
    .locals 2

    .line 56
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    invoke-interface {v0}, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;->automationsManager()Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectAutomationsManager(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V

    .line 57
    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->getScreenPresenter()Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectPresenter(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)V

    .line 58
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->provideScreenProcessorProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;

    invoke-static {p1, v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment_MembersInjector;->injectScreenProcessor(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;)V

    return-object p1
.end method


# virtual methods
.method public inject(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;->injectScreenFragment(Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;)Lcom/qonversion/android/sdk/automations/mvp/ScreenFragment;

    return-void
.end method
