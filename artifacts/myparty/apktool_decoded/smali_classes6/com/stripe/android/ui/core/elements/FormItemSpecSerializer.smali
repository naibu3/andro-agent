.class public final Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;
.super Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;
.source "FormItemSpec.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer<",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0014\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;",
        "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "<init>",
        "()V",
        "selectDeserializer",
        "Lkotlinx/serialization/DeserializationStrategy;",
        "element",
        "Lkotlinx/serialization/json/JsonElement;",
        "payments-ui-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 38
    const-class v0, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v0

    invoke-direct {p0, v0}, Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;-><init>(Lkotlin/reflect/KClass;)V

    return-void
.end method


# virtual methods
.method protected selectDeserializer(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/DeserializationStrategy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            ")",
            "Lkotlinx/serialization/DeserializationStrategy<",
            "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
            ">;"
        }
    .end annotation

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    invoke-static {p1}, Lkotlinx/serialization/json/JsonElementKt;->getJsonObject(Lkotlinx/serialization/json/JsonElement;)Lkotlinx/serialization/json/JsonObject;

    move-result-object p1

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
    if-eqz p1, :cond_13

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v0, "au_becs_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_1

    .line 46
    :cond_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_1
    const-string v0, "selector"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_1

    .line 48
    :cond_2
    sget-object p1, Lcom/stripe/android/ui/core/elements/DropdownSpec;->Companion:Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/DropdownSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_2
    const-string v0, "country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_1

    .line 47
    :cond_3
    sget-object p1, Lcom/stripe/android/ui/core/elements/CountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_3
    const-string v0, "static_text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_1

    .line 53
    :cond_4
    sget-object p1, Lcom/stripe/android/ui/core/elements/StaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/StaticTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/StaticTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_4
    const-string v0, "mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_1

    .line 55
    :cond_5
    sget-object p1, Lcom/stripe/android/ui/core/elements/MandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/MandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/MandateTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_5
    const-string v0, "klarna_country"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_1

    .line 51
    :cond_6
    sget-object p1, Lcom/stripe/android/ui/core/elements/CountrySpec;->Companion:Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/CountrySpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_6
    const-string v0, "placeholder"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_1

    .line 58
    :cond_7
    sget-object p1, Lcom/stripe/android/ui/core/elements/PlaceholderSpec;->Companion:Lcom/stripe/android/ui/core/elements/PlaceholderSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/PlaceholderSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_7
    const-string v0, "email"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_1

    .line 49
    :cond_8
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmailSpec;->Companion:Lcom/stripe/android/ui/core/elements/EmailSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmailSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_8
    const-string v0, "au_becs_account_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_1

    .line 45
    :cond_9
    sget-object p1, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;->Companion:Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_9
    const-string v0, "text"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_1

    .line 57
    :cond_a
    sget-object p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_a
    const-string v0, "name"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_1

    .line 54
    :cond_b
    sget-object p1, Lcom/stripe/android/ui/core/elements/NameSpec;->Companion:Lcom/stripe/android/ui/core/elements/NameSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/NameSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_b
    const-string v0, "iban"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_1

    .line 50
    :cond_c
    sget-object p1, Lcom/stripe/android/ui/core/elements/IbanSpec;->Companion:Lcom/stripe/android/ui/core/elements/IbanSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/IbanSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_c
    const-string v0, "sepa_mandate"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_1

    .line 56
    :cond_d
    sget-object p1, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_d
    const-string v0, "afterpay_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_1

    .line 43
    :cond_e
    sget-object p1, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_e
    const-string v0, "billing_address"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto :goto_1

    .line 41
    :cond_f
    sget-object p1, Lcom/stripe/android/ui/core/elements/AddressSpec;->Companion:Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AddressSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_f
    const-string v0, "au_becs_bsb_number"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_1

    .line 44
    :cond_10
    sget-object p1, Lcom/stripe/android/ui/core/elements/BsbSpec;->Companion:Lcom/stripe/android/ui/core/elements/BsbSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/BsbSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_10
    const-string v0, "affirm_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_1

    .line 42
    :cond_11
    sget-object p1, Lcom/stripe/android/ui/core/elements/AffirmTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/AffirmTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/AffirmTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 40
    :sswitch_11
    const-string v0, "klarna_header"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_1

    .line 52
    :cond_12
    sget-object p1, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    .line 59
    :cond_13
    :goto_1
    sget-object p1, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->INSTANCE:Lcom/stripe/android/ui/core/elements/EmptyFormSpec;

    invoke-virtual {p1}, Lcom/stripe/android/ui/core/elements/EmptyFormSpec;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/DeserializationStrategy;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x728fd679 -> :sswitch_11
        -0x70559d97 -> :sswitch_10
        -0x3647f928 -> :sswitch_f
        -0x1ec545d0 -> :sswitch_e
        -0xb0efb20 -> :sswitch_d
        -0x8ea474 -> :sswitch_c
        0x313706 -> :sswitch_b
        0x337a8b -> :sswitch_a
        0x36452d -> :sswitch_9
        0x268fedc -> :sswitch_8
        0x5c24b9c -> :sswitch_7
        0x23a88573 -> :sswitch_6
        0x2a44efdc -> :sswitch_5
        0x31ca5808 -> :sswitch_4
        0x34c9045e -> :sswitch_3
        0x39175796 -> :sswitch_2
        0x4705f3df -> :sswitch_1
        0x4ada41e7 -> :sswitch_0
    .end sparse-switch
.end method
