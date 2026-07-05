.class public final Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;
.super Ljava/lang/Object;
.source "AddressElementUiRegistry.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressElementUiRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementUiRegistry.kt\ncom/stripe/android/uicore/elements/AddressElementUiRegistry\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,23:1\n462#2:24\n412#2:25\n1246#3,4:26\n*S KotlinDebug\n*F\n+ 1 AddressElementUiRegistry.kt\ncom/stripe/android/uicore/elements/AddressElementUiRegistry\n*L\n11#1:24\n11#1:25\n11#1:26,4\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0008\u0010\r\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;",
        "",
        "schemaRegistry",
        "Lcom/stripe/android/uicore/address/AddressSchemaRegistry;",
        "<init>",
        "(Lcom/stripe/android/uicore/address/AddressSchemaRegistry;)V",
        "defaultElements",
        "",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "elements",
        "",
        "",
        "get",
        "countryCode",
        "stripe-ui-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final defaultElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation
.end field

.field private final elements:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/address/AddressSchemaRegistry;)V
    .locals 4

    const-string v0, "schemaRegistry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    invoke-virtual {p1}, Lcom/stripe/android/uicore/address/AddressSchemaRegistry;->getDefaultSchema$stripe_ui_core_release()Lcom/stripe/android/uicore/address/schemas/ZzAddressSchemaDefinition;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/address/schemas/ZzAddressSchemaDefinition;->schemaElements()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/stripe/android/uicore/address/AddressSchemaRegistry;->getDefaultSchema$stripe_ui_core_release()Lcom/stripe/android/uicore/address/schemas/ZzAddressSchemaDefinition;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/schemas/ZzAddressSchemaDefinition;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->transformToElementList(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;->defaultElements:Ljava/util/List;

    .line 11
    invoke-virtual {p1}, Lcom/stripe/android/uicore/address/AddressSchemaRegistry;->getAll$stripe_ui_core_release()Ljava/util/Map;

    move-result-object p1

    .line 24
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v0, Ljava/util/Map;

    .line 25
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 26
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 27
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    .line 11
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/address/AddressSchemaDefinition;

    .line 12
    invoke-interface {v1}, Lcom/stripe/android/uicore/address/AddressSchemaDefinition;->schemaElements()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/stripe/android/uicore/address/TransformAddressToElementKt;->transformToElementList(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 27
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 11
    :cond_0
    iput-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;->elements:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final get(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 17
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;->elements:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    .line 19
    :cond_0
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;->defaultElements:Ljava/util/List;

    return-object p1
.end method
