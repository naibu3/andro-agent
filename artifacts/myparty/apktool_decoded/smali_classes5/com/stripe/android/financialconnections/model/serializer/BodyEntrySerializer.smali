.class public final Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;
.super Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;
.source "BodyEntrySerializer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer<",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c1\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;",
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry;",
        "<init>",
        "()V",
        "selectDeserializer",
        "Lkotlinx/serialization/DeserializationStrategy;",
        "element",
        "Lkotlinx/serialization/json/JsonElement;",
        "financial-connections_release"
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/BodyEntrySerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 10
    const-class v0, LFinancialConnectionsGenericInfoScreen$Body$Entry;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method


# virtual methods
.method protected selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "LFinancialConnectionsGenericInfoScreen$Body$Entry;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-static {p1}, Lkotlinx/serialization/json/JsonElementKt;->getJsonObject(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    .line 13
    const-string v0, "type"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlinx/serialization/json/JsonElementKt;->getJsonPrimitive(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x36452d

    if-eq v0, v1, :cond_5

    const v1, 0x5faa95b

    if-eq v0, v1, :cond_3

    const v1, 0xdee3bb1

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const-string v0, "bullets"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    .line 16
    :cond_2
    sget-object p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$Companion;

    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Bullets$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 13
    :cond_3
    const-string v0, "image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_1

    .line 15
    :cond_4
    sget-object p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Image;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Image$Companion;

    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Image$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 13
    :cond_5
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    .line 14
    :cond_6
    sget-object p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Text;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Text$Companion;

    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Text$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 17
    :cond_7
    :goto_1
    sget-object p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;

    invoke-virtual {p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1
.end method
