.class public final LFinancialConnectionsGenericInfoScreen;
.super Ljava/lang/Object;
.source "FinancialConnectionsGenericInfoScreen.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFinancialConnectionsGenericInfoScreen$$serializer;,
        LFinancialConnectionsGenericInfoScreen$Body;,
        LFinancialConnectionsGenericInfoScreen$Companion;,
        LFinancialConnectionsGenericInfoScreen$Footer;,
        LFinancialConnectionsGenericInfoScreen$Header;,
        LFinancialConnectionsGenericInfoScreen$Options;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0081\u0008\u0018\u0000 ;2\u00020\u0001:\u00066789:;B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rBM\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003JC\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001J\u0006\u0010#\u001a\u00020\u000fJ\u0013\u0010$\u001a\u00020%2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u000fH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u000fJ%\u0010/\u001a\u00020+2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001\u00a2\u0006\u0002\u00085R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006<"
    }
    d2 = {
        "LFinancialConnectionsGenericInfoScreen;",
        "Landroid/os/Parcelable;",
        "id",
        "",
        "header",
        "LFinancialConnectionsGenericInfoScreen$Header;",
        "body",
        "LFinancialConnectionsGenericInfoScreen$Body;",
        "footer",
        "LFinancialConnectionsGenericInfoScreen$Footer;",
        "options",
        "LFinancialConnectionsGenericInfoScreen$Options;",
        "<init>",
        "(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getId",
        "()Ljava/lang/String;",
        "getHeader",
        "()LFinancialConnectionsGenericInfoScreen$Header;",
        "getBody",
        "()LFinancialConnectionsGenericInfoScreen$Body;",
        "getFooter",
        "()LFinancialConnectionsGenericInfoScreen$Footer;",
        "getOptions",
        "()LFinancialConnectionsGenericInfoScreen$Options;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "describeContents",
        "equals",
        "",
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
        "write$Self$financial_connections_release",
        "Header",
        "Body",
        "Footer",
        "Options",
        "$serializer",
        "Companion",
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

.annotation runtime Lkotlinx/serialization/Serializable;
.end annotation


# static fields
.field public static final $stable:I

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "LFinancialConnectionsGenericInfoScreen;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:LFinancialConnectionsGenericInfoScreen$Companion;


# instance fields
.field private final body:LFinancialConnectionsGenericInfoScreen$Body;

.field private final footer:LFinancialConnectionsGenericInfoScreen$Footer;

.field private final header:LFinancialConnectionsGenericInfoScreen$Header;

.field private final id:Ljava/lang/String;

.field private final options:LFinancialConnectionsGenericInfoScreen$Options;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFinancialConnectionsGenericInfoScreen$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFinancialConnectionsGenericInfoScreen;->Companion:LFinancialConnectionsGenericInfoScreen$Companion;

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Creator;

    invoke-direct {v0}, LFinancialConnectionsGenericInfoScreen$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, LFinancialConnectionsGenericInfoScreen;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, LFinancialConnectionsGenericInfoScreen;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p7, :cond_0

    .line 10
    sget-object p7, LFinancialConnectionsGenericInfoScreen$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$$serializer;

    invoke-virtual {p7}, LFinancialConnectionsGenericInfoScreen$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p7, 0x0

    if-nez p2, :cond_1

    iput-object p7, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    goto :goto_0

    :cond_1
    iput-object p3, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p7, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    goto :goto_1

    :cond_2
    iput-object p4, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p7, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    goto :goto_2

    :cond_3
    iput-object p5, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p7, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    return-void

    :cond_4
    iput-object p6, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    .line 14
    iput-object p2, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    .line 15
    iput-object p3, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    .line 16
    iput-object p4, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    .line 17
    iput-object p5, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p6, v0

    goto :goto_0

    :cond_3
    move-object p6, p5

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 12
    invoke-direct/range {p1 .. p6}, LFinancialConnectionsGenericInfoScreen;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V

    return-void
.end method

.method public static synthetic copy$default(LFinancialConnectionsGenericInfoScreen;Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, LFinancialConnectionsGenericInfoScreen;->copy(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)LFinancialConnectionsGenericInfoScreen;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$financial_connections_release(LFinancialConnectionsGenericInfoScreen;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Header$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Header$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Body$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Body$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Footer$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Footer$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Options$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Options$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()LFinancialConnectionsGenericInfoScreen$Header;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    return-object v0
.end method

.method public final component3()LFinancialConnectionsGenericInfoScreen$Body;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    return-object v0
.end method

.method public final component4()LFinancialConnectionsGenericInfoScreen$Footer;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    return-object v0
.end method

.method public final component5()LFinancialConnectionsGenericInfoScreen$Options;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)LFinancialConnectionsGenericInfoScreen;
    .locals 7

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LFinancialConnectionsGenericInfoScreen;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LFinancialConnectionsGenericInfoScreen;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Header;LFinancialConnectionsGenericInfoScreen$Body;LFinancialConnectionsGenericInfoScreen$Footer;LFinancialConnectionsGenericInfoScreen$Options;)V

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
    instance-of v1, p1, LFinancialConnectionsGenericInfoScreen;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LFinancialConnectionsGenericInfoScreen;

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    iget-object p1, p1, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getBody()LFinancialConnectionsGenericInfoScreen$Body;
    .locals 1

    .line 15
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    return-object v0
.end method

.method public final getFooter()LFinancialConnectionsGenericInfoScreen$Footer;
    .locals 1

    .line 16
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    return-object v0
.end method

.method public final getHeader()LFinancialConnectionsGenericInfoScreen$Header;
    .locals 1

    .line 14
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 13
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptions()LFinancialConnectionsGenericInfoScreen$Options;
    .locals 1

    .line 17
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, LFinancialConnectionsGenericInfoScreen$Header;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, LFinancialConnectionsGenericInfoScreen$Body;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, LFinancialConnectionsGenericInfoScreen$Footer;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, LFinancialConnectionsGenericInfoScreen$Options;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    iget-object v3, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    iget-object v4, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "FinancialConnectionsGenericInfoScreen(id="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", header="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->id:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->header:LFinancialConnectionsGenericInfoScreen$Header;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Header;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->body:LFinancialConnectionsGenericInfoScreen$Body;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Body;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->footer:LFinancialConnectionsGenericInfoScreen$Footer;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Footer;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen;->options:LFinancialConnectionsGenericInfoScreen$Options;

    if-nez v0, :cond_3

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_3
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Options;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
