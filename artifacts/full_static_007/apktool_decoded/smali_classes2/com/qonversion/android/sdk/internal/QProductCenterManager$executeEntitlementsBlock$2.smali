.class final Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;
.super Lkotlin/jvm/internal/Lambda;
.source "QProductCenterManager.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->executeEntitlementsBlock(Lcom/qonversion/android/sdk/dto/QonversionError;)V
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

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProductCenterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n1855#2,2:1125\n*S KotlinDebug\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2\n*L\n892#1:1125,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "error",
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
.field final synthetic $callbacks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;->$callbacks:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 883
    check-cast p1, Lcom/qonversion/android/sdk/dto/QonversionError;

    invoke-virtual {p0, p1}, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;->invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 892
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$executeEntitlementsBlock$2;->$callbacks:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 1125
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;

    if-eqz v1, :cond_0

    .line 895
    invoke-interface {v1, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEntitlementsCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    goto :goto_0

    :cond_1
    return-void
.end method
