.class final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;
.super Lkotlin/jvm/internal/Lambda;
.source "QAutomationsManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreen(Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "screen",
        "Lcom/qonversion/android/sdk/internal/dto/automations/Screen;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

.field final synthetic $screenId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;Ljava/lang/String;Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 76
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V
    .locals 7

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getActivityProvider$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/internal/ActivityProvider;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getAppContext$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Landroid/app/Application;

    move-result-object v0

    :goto_0
    check-cast v0, Landroid/content/Context;

    .line 80
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->getScreenCustomizationDelegate()Ljava/lang/ref/WeakReference;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;

    if-eqz v1, :cond_1

    .line 81
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/qonversion/android/sdk/automations/ScreenCustomizationDelegate;->getPresentationConfigurationForScreen(Ljava/lang/String;)Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    move-result-object v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;-><init>(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 82
    :goto_1
    sget-object v2, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;->Companion:Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;

    .line 84
    iget-object v3, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    .line 85
    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getHtmlPage()Ljava/lang/String;

    move-result-object p1

    .line 86
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object v4

    .line 82
    invoke-virtual {v2, v0, v3, p1, v4}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;->getCallingIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Landroid/content/Intent;

    move-result-object p1

    .line 88
    instance-of v2, v0, Landroid/app/Activity;

    if-nez v2, :cond_2

    const/high16 v2, 0x10000000

    .line 89
    invoke-virtual {p1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 90
    iget-object v2, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {v2}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object v2

    const-string v3, "loadScreen() -> Screen intent will process with a non-Activity context"

    invoke-virtual {v2, v3}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 94
    :cond_2
    :try_start_0
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 95
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationConfig;->getPresentationStyle()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;

    move-result-object p1

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/UtilsKt;->getScreenTransactionAnimations(Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Lkotlin/Pair;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    .line 96
    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_3

    .line 97
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 98
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    goto :goto_2

    .line 100
    :cond_3
    invoke-static {v1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    .line 101
    const-string v0, "Can\'t use transition animations, cause the provided context is not an activity. To override default animation, please, provide an activity context to AutomationsDelegate.contextForScreenIntent"

    .line 100
    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->debug(Ljava/lang/String;)V

    .line 106
    :cond_4
    :goto_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;->onSuccess()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    .line 108
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$screenId:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to start screen with id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " with exception: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 109
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadScreen() -> "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    .line 110
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreen$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;

    if-eqz p1, :cond_5

    .line 111
    new-instance v6, Lcom/qonversion/android/sdk/dto/QonversionError;

    .line 112
    sget-object v1, Lcom/qonversion/android/sdk/dto/QonversionErrorCode;->Unknown:Lcom/qonversion/android/sdk/dto/QonversionErrorCode;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    .line 111
    invoke-direct/range {v0 .. v5}, Lcom/qonversion/android/sdk/dto/QonversionError;-><init>(Lcom/qonversion/android/sdk/dto/QonversionErrorCode;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 110
    invoke-interface {p1, v6}, Lcom/qonversion/android/sdk/listeners/QonversionShowScreenCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    :cond_5
    :goto_3
    return-void
.end method
