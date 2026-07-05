.class public final Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;
.super Ljava/lang/Object;
.source "ScreenActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\u0007\u0010\u0002R\u0016\u0010\u0008\u001a\u00020\u00048\u0006X\u0087T\u00a2\u0006\u0008\n\u0000\u0012\u0004\u0008\t\u0010\u0002\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;",
        "",
        "()V",
        "INTENT_HTML_PAGE",
        "",
        "getINTENT_HTML_PAGE$annotations",
        "INTENT_SCREEN_ID",
        "getINTENT_SCREEN_ID$annotations",
        "INTENT_SCREEN_PRESENTATION_STYLE",
        "getINTENT_SCREEN_PRESENTATION_STYLE$annotations",
        "getCallingIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "screenId",
        "htmlPage",
        "screenPresentationStyle",
        "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getINTENT_HTML_PAGE$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getINTENT_SCREEN_ID$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getINTENT_SCREEN_PRESENTATION_STYLE$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final getCallingIntent(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;)Landroid/content/Intent;
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "htmlPage"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "screenPresentationStyle"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    new-instance v3, Landroid/content/Intent;

    const-class v4, Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;

    invoke-direct {v3, p1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 89
    invoke-virtual {v3, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    invoke-virtual {v3, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    check-cast p4, Ljava/io/Serializable;

    invoke-virtual {v3, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object v3
.end method
