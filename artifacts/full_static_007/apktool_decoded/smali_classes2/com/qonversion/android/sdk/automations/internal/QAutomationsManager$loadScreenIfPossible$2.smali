.class final Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QAutomationsManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->loadScreenIfPossible()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
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
        "it",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
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
.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 160
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 169
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager$loadScreenIfPossible$2;->this$0:Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;

    invoke-static {p1}, Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;->access$getLogger$p(Lcom/qonversion/android/sdk/automations/internal/QAutomationsManager;)Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;

    move-result-object p1

    const-string v0, "loadScreenIfPossible() -> Failed to retrieve screenId to show"

    invoke-virtual {p1, v0}, Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;->error(Ljava/lang/String;)V

    return-void
.end method
