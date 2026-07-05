.class final Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;
.super Lkotlin/jvm/internal/Lambda;
.source "DefaultRepository.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1;->invoke(Lcom/qonversion/android/sdk/internal/CallBackKt;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Throwable;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;

.field final synthetic this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 255
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;->invoke(Ljava/lang/Throwable;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/lang/Throwable;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;->this$0:Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;

    invoke-static {v0}, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;->access$getLogger$p(Lcom/qonversion/android/sdk/internal/repository/DefaultRepository;)Lcom/qonversion/android/sdk/internal/logger/Logger;

    move-result-object v0

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Ljava/lang/Throwable;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "detachUserFromRemoteConfigurationRequest - failure - "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/qonversion/android/sdk/internal/logger/Logger;->error(Ljava/lang/String;)V

    .line 257
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/repository/DefaultRepository$detachUserFromRemoteConfiguration$1$2;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;

    invoke-static {p1}, Lcom/qonversion/android/sdk/internal/ErrorsKt;->toQonversionError(Ljava/lang/Throwable;)Lcom/qonversion/android/sdk/dto/QonversionError;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionRemoteConfigurationAttachCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method
