.class public final Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;
.super Ljava/lang/Object;
.source "QonversionInternal.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QonversionInternal;->mainUserCallback(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H\u0016\u00a8\u0006\t"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "user",
        "Lcom/qonversion/android/sdk/dto/QUser;",
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


# instance fields
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    .line 424
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 3

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 429
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1$onError$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1$onError$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;Lcom/qonversion/android/sdk/dto/QonversionError;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public onSuccess(Lcom/qonversion/android/sdk/dto/QUser;)V
    .locals 3

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 426
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->this$0:Lcom/qonversion/android/sdk/internal/QonversionInternal;

    new-instance v1, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1$onSuccess$1;

    iget-object v2, p0, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;

    invoke-direct {v1, v2, p1}, Lcom/qonversion/android/sdk/internal/QonversionInternal$mainUserCallback$1$onSuccess$1;-><init>(Lcom/qonversion/android/sdk/listeners/QonversionUserCallback;Lcom/qonversion/android/sdk/dto/QUser;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/qonversion/android/sdk/internal/QonversionInternal;->access$postToMainThread(Lcom/qonversion/android/sdk/internal/QonversionInternal;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
