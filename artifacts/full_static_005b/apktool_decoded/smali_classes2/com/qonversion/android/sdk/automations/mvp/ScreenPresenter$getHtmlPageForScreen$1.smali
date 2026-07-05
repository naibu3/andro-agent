.class final Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;
.super Lkotlin/jvm/internal/Lambda;
.source "ScreenPresenter.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->getHtmlPageForScreen(Ljava/lang/String;)V
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
.field final synthetic $screenId:Ljava/lang/String;

.field final synthetic this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->$screenId:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 92
    check-cast p1, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/internal/dto/automations/Screen;)V
    .locals 2

    const-string v0, "screen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->this$0:Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;

    invoke-static {v0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;->access$getView$p(Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;)Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;

    move-result-object v0

    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter$getHtmlPageForScreen$1;->$screenId:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/qonversion/android/sdk/internal/dto/automations/Screen;->getHtmlPage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;->openScreen(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
