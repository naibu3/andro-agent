.class public final Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;
.super Ljava/lang/Object;
.source "ScreenProcessor.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;->processMacroses(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nScreenProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenProcessor.kt\ncom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,117:1\n1855#2,2:118\n*S KotlinDebug\n*F\n+ 1 ScreenProcessor.kt\ncom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1\n*L\n83#1:118,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1",
        "Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;",
        "onError",
        "",
        "error",
        "Lcom/qonversion/android/sdk/dto/QonversionError;",
        "onSuccess",
        "products",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/products/QProduct;",
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
.field final synthetic $macroses:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onComplete:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onError:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $originalHtml:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/qonversion/android/sdk/dto/QonversionError;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$originalHtml:Ljava/lang/String;

    iput-object p2, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$macroses:Ljava/util/List;

    iput-object p3, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$onComplete:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$onError:Lkotlin/jvm/functions/Function1;

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$onError:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/products/QProduct;",
            ">;)V"
        }
    .end annotation

    const-string v0, "products"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$originalHtml:Ljava/lang/String;

    .line 83
    iget-object v1, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$macroses:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 118
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;

    .line 84
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;->getProductID()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/qonversion/android/sdk/dto/products/QProduct;

    if-nez v3, :cond_1

    goto :goto_0

    .line 86
    :cond_1
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;->getType()Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;

    move-result-object v4

    sget-object v5, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Lcom/qonversion/android/sdk/automations/internal/macros/MacrosType;->ordinal()I

    move-result v4

    aget v4, v5, v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    .line 88
    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getPrettyPrice()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 90
    invoke-virtual {v0}, Lcom/qonversion/android/sdk/automations/internal/macros/Macros;->getOriginalMacrosString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 96
    :cond_2
    iget-object p1, p0, Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$processMacroses$1;->$onComplete:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
