.class public final Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;
.super Ljava/lang/Object;
.source "AutomationsSandwich.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/qonversion/sandwich/AutomationsSandwich;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "io/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1",
        "Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;",
        "getPresentationConfigurationForScreen",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;",
        "screenId",
        "",
        "sandwich_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lio/qonversion/sandwich/AutomationsSandwich;


# direct methods
.method constructor <init>(Lio/qonversion/sandwich/AutomationsSandwich;)V
    .locals 0

    iput-object p1, p0, Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;->this$0:Lio/qonversion/sandwich/AutomationsSandwich;

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPresentationConfigurationForScreen(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;
    .locals 2

    const-string v0, "screenId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    iget-object v0, p0, Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;->this$0:Lio/qonversion/sandwich/AutomationsSandwich;

    invoke-static {v0}, Lio/qonversion/sandwich/AutomationsSandwich;->access$getScreenPresentationConfigs$p(Lio/qonversion/sandwich/AutomationsSandwich;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    if-nez p1, :cond_0

    iget-object p1, p0, Lio/qonversion/sandwich/AutomationsSandwich$screenCustomizationDelegate$1;->this$0:Lio/qonversion/sandwich/AutomationsSandwich;

    invoke-static {p1}, Lio/qonversion/sandwich/AutomationsSandwich;->access$getDefaultPresentationConfig$p(Lio/qonversion/sandwich/AutomationsSandwich;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p1, v1, v0, v1}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;-><init>(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    return-object p1
.end method
