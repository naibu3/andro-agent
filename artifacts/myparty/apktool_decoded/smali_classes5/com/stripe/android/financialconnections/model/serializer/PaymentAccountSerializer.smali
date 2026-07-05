.class public final Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;
.super Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;
.source "PaymentAccountSerializer.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer<",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0014R\u001a\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;",
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;",
        "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
        "<init>",
        "()V",
        "selectDeserializer",
        "Lkotlinx/serialization/KSerializer;",
        "element",
        "Lkotlinx/serialization/json/JsonElement;",
        "objectValue",
        "",
        "getObjectValue",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;",
        "financial-connections-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 13
    const-class v0, Lcom/stripe/android/financialconnections/model/PaymentAccount;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method

.method private final getObjectValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;
    .locals 1

    .line 27
    invoke-static {p1}, Lkotlinx/serialization/json/JsonElementKt;->getJsonObject(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

    const-string v0, "object"

    invoke-virtual {p1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlinx/serialization/json/JsonElementKt;->getJsonPrimitive(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public bridge synthetic selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1
.end method

.method protected selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/KSerializer;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lkotlinx/serialization/KSerializer<",
            "+",
            "Lcom/stripe/android/financialconnections/model/PaymentAccount;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/model/serializer/PaymentAccountSerializer;->getObjectValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/String;

    move-result-object p1

    .line 17
    const-string v0, "linked_account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 18
    const-string v0, "financial_connections.account"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 19
    :cond_0
    sget-object p1, Lcom/stripe/android/financialconnections/model/BankAccount;->Companion:Lcom/stripe/android/financialconnections/model/BankAccount$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/BankAccount$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    return-object p1

    .line 18
    :cond_1
    :goto_0
    sget-object p1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;->Companion:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    return-object p1
.end method
