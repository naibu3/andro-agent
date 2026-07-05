.class public interface abstract Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;
.super Ljava/lang/Object;
.source "ScreenContract.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qonversion/android/sdk/automations/mvp/ScreenContract;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "View"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\u000c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eH&J\u0008\u0010\u0015\u001a\u00020\u0003H&\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;",
        "",
        "close",
        "",
        "actionResult",
        "Lcom/qonversion/android/sdk/automations/dto/QActionResult;",
        "closeAll",
        "onError",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "shouldCloseScreen",
        "",
        "openDeepLink",
        "url",
        "",
        "openLink",
        "openScreen",
        "screenId",
        "htmlPage",
        "purchase",
        "productId",
        "restore",
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


# virtual methods
.method public abstract close(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
.end method

.method public abstract closeAll(Lcom/qonversion/android/sdk/automations/dto/QActionResult;)V
.end method

.method public abstract onError(Lcom/qonversion/android/sdk/dto/QonversionError;Z)V
.end method

.method public abstract openDeepLink(Ljava/lang/String;)V
.end method

.method public abstract openLink(Ljava/lang/String;)V
.end method

.method public abstract openScreen(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract purchase(Ljava/lang/String;)V
.end method

.method public abstract restore()V
.end method
