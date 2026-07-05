.class public final Lcom/stripe/android/uicore/address/CountryAddressSchema;
.super Ljava/lang/Object;
.source "TransformAddressToElement.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;,
        Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \"2\u00020\u0001:\u0002!\"B%\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tB7\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001\u00a2\u0006\u0002\u0008 R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006#"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/CountryAddressSchema;",
        "",
        "type",
        "Lcom/stripe/android/uicore/address/FieldType;",
        "required",
        "",
        "schema",
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "<init>",
        "(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getType$annotations",
        "()V",
        "getType",
        "()Lcom/stripe/android/uicore/address/FieldType;",
        "getRequired$annotations",
        "getRequired",
        "()Z",
        "getSchema$annotations",
        "getSchema",
        "()Lcom/stripe/android/uicore/address/FieldSchema;",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$stripe_ui_core_release",
        "$serializer",
        "Companion",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field private static final $childSerializers:[Lkotlinx/serialization/KSerializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlinx/serialization/KSerializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;


# instance fields
.field private final required:Z

.field private final schema:Lcom/stripe/android/uicore/address/FieldSchema;

.field private final type:Lcom/stripe/android/uicore/address/FieldType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->Companion:Lcom/stripe/android/uicore/address/CountryAddressSchema$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$stable:I

    const/4 v0, 0x3

    .line 208
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Companion:Lcom/stripe/android/uicore/address/FieldType$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/address/FieldType$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p5, :cond_0

    .line 208
    sget-object p5, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/uicore/address/CountryAddressSchema$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    and-int/lit8 p1, p1, 0x4

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V
    .locals 0

    .line 210
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 211
    iput-object p1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    .line 213
    iput-boolean p2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    .line 215
    iput-object p3, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 210
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 208
    sget-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic getRequired$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "required"
    .end annotation

    return-void
.end method

.method public static synthetic getSchema$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "schema"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stripe_ui_core_release(Lcom/stripe/android/uicore/address/CountryAddressSchema;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 208
    sget-object v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x1

    iget-boolean v1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/FieldSchema$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final getRequired()Z
    .locals 1

    .line 213
    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->required:Z

    return v0
.end method

.method public final getSchema()Lcom/stripe/android/uicore/address/FieldSchema;
    .locals 1

    .line 215
    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->schema:Lcom/stripe/android/uicore/address/FieldSchema;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/uicore/address/FieldType;
    .locals 1

    .line 211
    iget-object v0, p0, Lcom/stripe/android/uicore/address/CountryAddressSchema;->type:Lcom/stripe/android/uicore/address/FieldType;

    return-object v0
.end method
