.class public final Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;
.super Ljava/lang/Object;
.source "QProductCenterManager.kt"

# interfaces
.implements Lcom/qonversion/android/sdk/listeners/QonversionProductsCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qonversion/android/sdk/internal/QProductCenterManager;->checkTrialIntroEligibilityForProductIds(Ljava/util/List;Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQProductCenterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1124:1\n526#2:1125\n511#2,6:1126\n453#2:1132\n403#2:1133\n1238#3,4:1134\n*S KotlinDebug\n*F\n+ 1 QProductCenterManager.kt\ncom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1\n*L\n265#1:1125\n265#1:1126,6\n265#1:1132\n265#1:1133\n265#1:1134,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0016\u00a8\u0006\u000b"
    }
    d2 = {
        "com/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1",
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
.field final synthetic $callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

.field final synthetic $productIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    iput-object p2, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;->$productIds:Ljava/util/List;

    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 278
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;->onError(Lcom/qonversion/android/sdk/dto/QonversionError;)V

    return-void
.end method

.method public onSuccess(Ljava/util/Map;)V
    .locals 5
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

    .line 265
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;->$productIds:Ljava/util/List;

    .line 1125
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 1126
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 265
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 1128
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 1132
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast p1, Ljava/util/Map;

    .line 1133
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 1134
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 1135
    check-cast v1, Ljava/util/Map$Entry;

    .line 1133
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 266
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/dto/products/QProduct;

    .line 268
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getStoreDetails()Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/qonversion/android/sdk/dto/products/QProductStoreDetails;->isPrepaid()Z

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    .line 269
    new-instance v1, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;

    sget-object v3, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->NonIntroOrTrialProduct:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    invoke-direct {v1, v3}, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;-><init>(Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V

    goto :goto_2

    .line 271
    :cond_2
    new-instance v3, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;

    sget-object v4, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;->Companion:Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getType()Lcom/qonversion/android/sdk/dto/products/QProductType;

    move-result-object v1

    invoke-virtual {v4, v1}, Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus$Companion;->fromProductType(Lcom/qonversion/android/sdk/dto/products/QProductType;)Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;-><init>(Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V

    move-object v1, v3

    .line 1135
    :goto_2
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 275
    :cond_3
    iget-object v0, p0, Lcom/qonversion/android/sdk/internal/QProductCenterManager$checkTrialIntroEligibilityForProductIds$1;->$callback:Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;

    invoke-interface {v0, p1}, Lcom/qonversion/android/sdk/listeners/QonversionEligibilityCallback;->onSuccess(Ljava/util/Map;)V

    return-void
.end method
