.class public final Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerFragmentComponent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

.field private fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public appComponent(Lcom/qonversion/android/sdk/internal/di/component/AppComponent;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 0

    .line 76
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    return-object p0
.end method

.method public build()Lcom/qonversion/android/sdk/internal/di/component/FragmentComponent;
    .locals 4

    .line 81
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    const-class v1, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 82
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    const-class v1, Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 83
    new-instance v0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;

    iget-object v1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->appComponent:Lcom/qonversion/android/sdk/internal/di/component/AppComponent;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent;-><init>(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;Lcom/qonversion/android/sdk/internal/di/component/AppComponent;Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent-IA;)V

    return-object v0
.end method

.method public fragmentModule(Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;)Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;
    .locals 0

    .line 71
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/di/component/DaggerFragmentComponent$Builder;->fragmentModule:Lcom/qonversion/android/sdk/internal/di/module/FragmentModule;

    return-object p0
.end method
