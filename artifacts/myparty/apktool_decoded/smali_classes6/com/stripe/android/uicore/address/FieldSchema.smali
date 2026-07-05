.class public final Lcom/stripe/android/uicore/address/FieldSchema;
.super Ljava/lang/Object;
.source "TransformAddressToElement.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/address/FieldSchema$$serializer;,
        Lcom/stripe/android/uicore/address/FieldSchema$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B3\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0008\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bB=\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0010J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001\u00a2\u0006\u0002\u0008!R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0002\u0010\u0013R,\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\u0008\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0014\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0016R\u001c\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0017\u0010\u0012\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006$"
    }
    d2 = {
        "Lcom/stripe/android/uicore/address/FieldSchema;",
        "",
        "isNumeric",
        "",
        "examples",
        "Ljava/util/ArrayList;",
        "",
        "Lkotlin/collections/ArrayList;",
        "nameType",
        "Lcom/stripe/android/uicore/address/NameType;",
        "<init>",
        "(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "isNumeric$annotations",
        "()V",
        "()Z",
        "getExamples$annotations",
        "getExamples",
        "()Ljava/util/ArrayList;",
        "getNameType$annotations",
        "getNameType",
        "()Lcom/stripe/android/uicore/address/NameType;",
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

.field public static final Companion:Lcom/stripe/android/uicore/address/FieldSchema$Companion;


# instance fields
.field private final examples:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isNumeric:Z

.field private final nameType:Lcom/stripe/android/uicore/address/NameType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/uicore/address/FieldSchema$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/address/FieldSchema$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/address/FieldSchema;->Companion:Lcom/stripe/android/uicore/address/FieldSchema$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/address/FieldSchema;->$stable:I

    const/4 v0, 0x3

    .line 197
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/KSerializer;

    invoke-direct {v1, v2}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/uicore/address/NameType;->Companion:Lcom/stripe/android/uicore/address/NameType$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/address/NameType$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/uicore/address/FieldSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p1, 0x4

    const/4 v0, 0x4

    if-eq v0, p5, :cond_0

    .line 197
    sget-object p5, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->INSTANCE:Lcom/stripe/android/uicore/address/FieldSchema$$serializer;

    invoke-virtual {p5}, Lcom/stripe/android/uicore/address/FieldSchema$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p5

    invoke-static {p1, v0, p5}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p5, p1, 0x1

    if-nez p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    iput-boolean p2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_2

    .line 203
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 197
    iput-object p1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    goto :goto_0

    :cond_2
    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    :goto_0
    iput-object p4, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-void
.end method

.method public constructor <init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/address/NameType;",
            ")V"
        }
    .end annotation

    const-string v0, "examples"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 200
    iput-boolean p1, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    .line 202
    iput-object p2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    .line 204
    iput-object p3, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    .line 203
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 199
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 197
    sget-object v0, Lcom/stripe/android/uicore/address/FieldSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic getExamples$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "examples"
    .end annotation

    return-void
.end method

.method public static synthetic getNameType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "nameType"
    .end annotation

    return-void
.end method

.method public static synthetic isNumeric$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "isNumeric"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$stripe_ui_core_release(Lcom/stripe/android/uicore/address/FieldSchema;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 197
    sget-object v0, Lcom/stripe/android/uicore/address/FieldSchema;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    if-eqz v2, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    .line 203
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 197
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x2

    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getExamples()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->examples:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getNameType()Lcom/stripe/android/uicore/address/NameType;
    .locals 1

    .line 204
    iget-object v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->nameType:Lcom/stripe/android/uicore/address/NameType;

    return-object v0
.end method

.method public final isNumeric()Z
    .locals 1

    .line 200
    iget-boolean v0, p0, Lcom/stripe/android/uicore/address/FieldSchema;->isNumeric:Z

    return v0
.end method
