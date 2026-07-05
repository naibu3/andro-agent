.class public final Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;
.super Ljava/lang/Object;
.source "QonversionMappingAdapters.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nQonversionMappingAdapters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QEligibilityAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,266:1\n1855#2,2:267\n*S KotlinDebug\n*F\n+ 1 QonversionMappingAdapters.kt\ncom/qonversion/android/sdk/internal/dto/QEligibilityAdapter\n*L\n260#1:267,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007J\"\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/qonversion/android/sdk/internal/dto/QEligibilityAdapter;",
        "",
        "()V",
        "fromJson",
        "",
        "",
        "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
        "eligibilities",
        "",
        "Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;",
        "toJson",
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
.method public constructor <init>()V
    .locals 0

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final toJson(Ljava/util/Map;)Ljava/util/List;
    .locals 0
    .annotation runtime Lcom/squareup/moshi/ToJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;",
            ">;"
        }
    .end annotation

    .line 254
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final fromJson(Ljava/util/List;)Ljava/util/Map;
    .locals 4
    .annotation runtime Lcom/squareup/moshi/FromJson;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;",
            ">;"
        }
    .end annotation

    const-string v0, "eligibilities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 259
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 260
    check-cast p1, Ljava/lang/Iterable;

    .line 267
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;

    .line 261
    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;->getProduct()Lcom/qonversion/android/sdk/dto/products/QProduct;

    move-result-object v2

    invoke-virtual {v2}, Lcom/qonversion/android/sdk/dto/products/QProduct;->getQonversionID()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;

    invoke-virtual {v1}, Lcom/qonversion/android/sdk/internal/dto/eligibility/ProductEligibility;->getEligibilityStatus()Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;

    move-result-object v1

    invoke-direct {v3, v1}, Lcom/qonversion/android/sdk/dto/eligibility/QEligibility;-><init>(Lcom/qonversion/android/sdk/dto/eligibility/QIntroEligibilityStatus;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method
