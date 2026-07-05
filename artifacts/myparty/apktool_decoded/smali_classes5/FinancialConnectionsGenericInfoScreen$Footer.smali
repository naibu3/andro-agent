.class public final LFinancialConnectionsGenericInfoScreen$Footer;
.super Ljava/lang/Object;
.source "FinancialConnectionsGenericInfoScreen.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFinancialConnectionsGenericInfoScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Footer"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFinancialConnectionsGenericInfoScreen$Footer$$serializer;,
        LFinancialConnectionsGenericInfoScreen$Footer$Companion;,
        LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0081\u0008\u0018\u0000 42\u00020\u0001:\u0003234B7\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\tBC\u0008\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u0008\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J9\u0010\u001e\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0006\u0010\u001f\u001a\u00020\u000bJ\u0013\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u000bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000bJ%\u0010+\u001a\u00020\'2\u0006\u0010,\u001a\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0001\u00a2\u0006\u0002\u00081R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0013\u0010\u0010\u001a\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0010\u001a\u0004\u0008\u0017\u0010\u0015R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0010\u001a\u0004\u0008\u0019\u0010\u0012\u00a8\u00065"
    }
    d2 = {
        "LFinancialConnectionsGenericInfoScreen$Footer;",
        "Landroid/os/Parcelable;",
        "disclaimer",
        "",
        "primaryCta",
        "LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;",
        "secondaryCta",
        "belowCta",
        "<init>",
        "(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getDisclaimer$annotations",
        "()V",
        "getDisclaimer",
        "()Ljava/lang/String;",
        "getPrimaryCta$annotations",
        "getPrimaryCta",
        "()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;",
        "getSecondaryCta$annotations",
        "getSecondaryCta",
        "getBelowCta$annotations",
        "getBelowCta",
        "component1",
        "component2",
        "component3",
        "component4",
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
        "GenericInfoAction",
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
            "LFinancialConnectionsGenericInfoScreen$Footer;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:LFinancialConnectionsGenericInfoScreen$Footer$Companion;


# instance fields
.field private final belowCta:Ljava/lang/String;

.field private final disclaimer:Ljava/lang/String;

.field private final primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

.field private final secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Footer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFinancialConnectionsGenericInfoScreen$Footer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFinancialConnectionsGenericInfoScreen$Footer;->Companion:LFinancialConnectionsGenericInfoScreen$Footer$Companion;

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Footer$Creator;

    invoke-direct {v0}, LFinancialConnectionsGenericInfoScreen$Footer$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, LFinancialConnectionsGenericInfoScreen$Footer;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, LFinancialConnectionsGenericInfoScreen$Footer;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x0

    if-nez p6, :cond_0

    iput-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    goto :goto_1

    :cond_1
    iput-object p3, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    goto :goto_2

    :cond_2
    iput-object p4, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    :goto_2
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    return-void

    :cond_3
    iput-object p5, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    .line 89
    iput-object p2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    .line 91
    iput-object p3, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    .line 93
    iput-object p4, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 86
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, LFinancialConnectionsGenericInfoScreen$Footer;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(LFinancialConnectionsGenericInfoScreen$Footer;Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen$Footer;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LFinancialConnectionsGenericInfoScreen$Footer;->copy(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen$Footer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBelowCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "below_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getDisclaimer$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getPrimaryCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "primary_cta"
    .end annotation

    return-void
.end method

.method public static synthetic getSecondaryCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "secondary_cta"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(LFinancialConnectionsGenericInfoScreen$Footer;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 84
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    return-object v0
.end method

.method public final component3()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen$Footer;
    .locals 1

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Footer;

    invoke-direct {v0, p1, p2, p3, p4}, LFinancialConnectionsGenericInfoScreen$Footer;-><init>(Ljava/lang/String;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;Ljava/lang/String;)V

    return-object v0
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
    instance-of v1, p1, LFinancialConnectionsGenericInfoScreen$Footer;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LFinancialConnectionsGenericInfoScreen$Footer;

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iget-object v3, p1, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    iget-object p1, p1, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBelowCta()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryCta()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;
    .locals 1

    .line 89
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    return-object v0
.end method

.method public final getSecondaryCta()LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;
    .locals 1

    .line 91
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iget-object v2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    iget-object v3, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Footer(disclaimer="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", primaryCta="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", secondaryCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", belowCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->disclaimer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->primaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Footer;->secondaryCta:LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, LFinancialConnectionsGenericInfoScreen$Footer$GenericInfoAction;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object p2, p0, LFinancialConnectionsGenericInfoScreen$Footer;->belowCta:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
