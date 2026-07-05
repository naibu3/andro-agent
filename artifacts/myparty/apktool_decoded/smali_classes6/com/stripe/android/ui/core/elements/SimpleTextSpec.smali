.class public final Lcom/stripe/android/ui/core/elements/SimpleTextSpec;
.super Lcom/stripe/android/ui/core/elements/FormItemSpec;
.source "SimpleTextSpec.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/ui/core/elements/SimpleTextSpec$$serializer;,
        Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;,
        Lcom/stripe/android/ui/core/elements/SimpleTextSpec$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002?@B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rBI\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\u001e\u0010\"\u001a\u00020#2\u0016\u0008\u0002\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010&0%J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\tH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J;\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0006\u0010-\u001a\u00020\u0005J\u0013\u0010.\u001a\u00020\u000b2\u0008\u0010/\u001a\u0004\u0018\u000100H\u00d6\u0003J\t\u00101\u001a\u00020\u0005H\u00d6\u0001J\t\u00102\u001a\u00020&H\u00d6\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0005J%\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001\u00a2\u0006\u0002\u0008>R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0013\u001a\u0004\u0008\u001a\u0010\u001bR\u001c\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001c\u0010\u0013\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0013\u001a\u0004\u0008 \u0010!\u00a8\u0006A"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;",
        "Lcom/stripe/android/ui/core/elements/FormItemSpec;",
        "apiPath",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "label",
        "",
        "capitalization",
        "Lcom/stripe/android/ui/core/elements/Capitalization;",
        "keyboardType",
        "Lcom/stripe/android/ui/core/elements/KeyboardType;",
        "showOptionalLabel",
        "",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V",
        "seen0",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getApiPath$annotations",
        "()V",
        "getApiPath",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getLabel$annotations",
        "getLabel",
        "()I",
        "getCapitalization$annotations",
        "getCapitalization",
        "()Lcom/stripe/android/ui/core/elements/Capitalization;",
        "getKeyboardType$annotations",
        "getKeyboardType",
        "()Lcom/stripe/android/ui/core/elements/KeyboardType;",
        "getShowOptionalLabel$annotations",
        "getShowOptionalLabel",
        "()Z",
        "transform",
        "Lcom/stripe/android/uicore/elements/SectionElement;",
        "initialValues",
        "",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "writeToParcel",
        "",
        "dest",
        "Landroid/os/Parcel;",
        "flags",
        "write$Self",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$payments_ui_core_release",
        "$serializer",
        "Companion",
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;


# instance fields
.field private final apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

.field private final keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

.field private final label:I

.field private final showOptionalLabel:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->Companion:Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Companion;

    new-instance v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Creator;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->CREATOR:Landroid/os/Parcelable$Creator;

    sget v0, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    sput v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->$stable:I

    const/4 v0, 0x5

    .line 57
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v2, Lcom/stripe/android/ui/core/elements/Capitalization;->Companion:Lcom/stripe/android/ui/core/elements/Capitalization$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/Capitalization$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v0, v3

    sget-object v2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Companion:Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/KeyboardType$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p7, :cond_0

    .line 57
    sget-object p7, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$$serializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/SimpleTextSpec$$serializer;

    invoke-virtual {p7}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 p7, 0x0

    invoke-direct {p0, p7}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iput p3, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_1

    .line 69
    sget-object p2, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 57
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    .line 72
    sget-object p2, Lcom/stripe/android/ui/core/elements/KeyboardType;->Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;

    .line 57
    iput-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    return-void

    :cond_3
    iput-boolean p6, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V
    .locals 1

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capitalization"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 76
    invoke-direct {p0, v0}, Lcom/stripe/android/ui/core/elements/FormItemSpec;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 64
    iput p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    .line 68
    iput-object p3, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 71
    iput-object p4, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    .line 74
    iput-boolean p5, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 69
    sget-object p3, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 72
    sget-object p4, Lcom/stripe/android/ui/core/elements/KeyboardType;->Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;

    :cond_1
    move-object v4, p4

    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p5

    .line 60
    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 57
    sget-object v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/ui/core/elements/SimpleTextSpec;Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;ZILjava/lang/Object;)Lcom/stripe/android/ui/core/elements/SimpleTextSpec;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    :cond_4
    move-object p6, p4

    move p7, p5

    move p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getApiPath$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "api_path"
    .end annotation

    return-void
.end method

.method public static synthetic getCapitalization$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "capitalization"
    .end annotation

    return-void
.end method

.method public static synthetic getKeyboardType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "keyboard_type"
    .end annotation

    return-void
.end method

.method public static synthetic getLabel$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "label"
    .end annotation

    return-void
.end method

.method public static synthetic getShowOptionalLabel$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "show_optional_label"
    .end annotation

    return-void
.end method

.method public static synthetic transform$default(Lcom/stripe/android/ui/core/elements/SimpleTextSpec;Ljava/util/Map;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 78
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    .line 77
    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_ui_core_release(Lcom/stripe/android/ui/core/elements/SimpleTextSpec;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 57
    sget-object v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;->INSTANCE:Lcom/stripe/android/uicore/elements/IdentifierSpec$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget v2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeIntElement(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    .line 69
    sget-object v3, Lcom/stripe/android/ui/core/elements/Capitalization;->None:Lcom/stripe/android/ui/core/elements/Capitalization;

    if-eq v2, v3, :cond_1

    .line 57
    :goto_0
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    .line 72
    sget-object v3, Lcom/stripe/android/ui/core/elements/KeyboardType;->Ascii:Lcom/stripe/android/ui/core/elements/KeyboardType;

    if-eq v2, v3, :cond_3

    .line 57
    :goto_1
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    if-eqz v1, :cond_5

    :goto_2
    iget-boolean p0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    return v0
.end method

.method public final component3()Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/ui/core/elements/KeyboardType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    return v0
.end method

.method public final copy(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)Lcom/stripe/android/ui/core/elements/SimpleTextSpec;
    .locals 7

    const-string v0, "apiPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "capitalization"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "keyboardType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;ILcom/stripe/android/ui/core/elements/Capitalization;Lcom/stripe/android/ui/core/elements/KeyboardType;Z)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    iget v3, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    iget-object v3, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    iget-boolean p1, p1, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getCapitalization()Lcom/stripe/android/ui/core/elements/Capitalization;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    return-object v0
.end method

.method public final getKeyboardType()Lcom/stripe/android/ui/core/elements/KeyboardType;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    return-object v0
.end method

.method public final getLabel()I
    .locals 1

    .line 64
    iget v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    return v0
.end method

.method public final getShowOptionalLabel()Z
    .locals 1

    .line 74
    iget-boolean v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/IdentifierSpec;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/Capitalization;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-virtual {v1}, Lcom/stripe/android/ui/core/elements/KeyboardType;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    iget v1, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    iget-object v2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    iget-object v3, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    iget-boolean v4, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "SimpleTextSpec(apiPath="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", label="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", capitalization="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", keyboardType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showOptionalLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transform(Ljava/util/Map;)Lcom/stripe/android/uicore/elements/SectionElement;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/SectionElement;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "initialValues"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    move-object v2, v0

    check-cast v2, Lcom/stripe/android/ui/core/elements/FormItemSpec;

    .line 80
    new-instance v3, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 81
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    .line 83
    new-instance v5, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    .line 84
    iget v6, v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v12, 0x0

    const/4 v8, 0x4

    invoke-static {v6, v7, v12, v8, v12}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v6

    .line 85
    iget-object v7, v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    sget-object v9, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v7}, Lcom/stripe/android/ui/core/elements/Capitalization;->ordinal()I

    move-result v7

    aget v7, v9, v7

    const/4 v9, 0x1

    const/4 v13, 0x2

    if-eq v7, v9, :cond_3

    if-eq v7, v13, :cond_2

    const/4 v9, 0x3

    if-eq v7, v9, :cond_1

    if-ne v7, v8, :cond_0

    .line 89
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getSentences-IUNYP9k()I

    move-result v7

    goto :goto_0

    .line 85
    :cond_0
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 88
    :cond_1
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getWords-IUNYP9k()I

    move-result v7

    goto :goto_0

    .line 87
    :cond_2
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getCharacters-IUNYP9k()I

    move-result v7

    goto :goto_0

    .line 86
    :cond_3
    sget-object v7, Landroidx/compose/ui/text/input/KeyboardCapitalization;->Companion:Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/input/KeyboardCapitalization$Companion;->getNone-IUNYP9k()I

    move-result v7

    .line 91
    :goto_0
    iget-object v8, v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    sget-object v9, Lcom/stripe/android/ui/core/elements/SimpleTextSpec$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v8}, Lcom/stripe/android/ui/core/elements/KeyboardType;->ordinal()I

    move-result v8

    aget v8, v9, v8

    packed-switch v8, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 99
    :pswitch_0
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumberPassword-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 98
    :pswitch_1
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 97
    :pswitch_2
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getEmail-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 96
    :pswitch_3
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getUri-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 95
    :pswitch_4
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPhone-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 94
    :pswitch_5
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getNumber-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 93
    :pswitch_6
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getAscii-PjHm6EE()I

    move-result v8

    goto :goto_1

    .line 92
    :pswitch_7
    sget-object v8, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getText-PjHm6EE()I

    move-result v8

    :goto_1
    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    .line 83
    invoke-direct/range {v5 .. v11}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 102
    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->getApiPath()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    invoke-interface {v1, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Ljava/lang/String;

    .line 103
    iget-boolean v1, v0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    .line 82
    new-instance v14, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 83
    move-object v15, v5

    check-cast v15, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    const/16 v19, 0x8

    const/16 v20, 0x0

    const/16 v18, 0x0

    move/from16 v16, v1

    .line 82
    invoke-direct/range {v14 .. v20}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v14, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 80
    invoke-direct {v3, v4, v14}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    check-cast v3, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 79
    invoke-static {v2, v3, v12, v13, v12}, Lcom/stripe/android/ui/core/elements/FormItemSpec;->createSectionElement$payments_ui_core_release$default(Lcom/stripe/android/ui/core/elements/FormItemSpec;Lcom/stripe/android/uicore/elements/SectionFieldElement;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Object;)Lcom/stripe/android/uicore/elements/SectionElement;

    move-result-object v1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->apiPath:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    check-cast v0, Landroid/os/Parcelable;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    iget p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->label:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->capitalization:Lcom/stripe/android/ui/core/elements/Capitalization;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/Capitalization;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->keyboardType:Lcom/stripe/android/ui/core/elements/KeyboardType;

    invoke-virtual {p2}, Lcom/stripe/android/ui/core/elements/KeyboardType;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-boolean p2, p0, Lcom/stripe/android/ui/core/elements/SimpleTextSpec;->showOptionalLabel:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
