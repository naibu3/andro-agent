.class public final Lcom/stripe/android/financialconnections/model/DataAccessNotice;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;,
        Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 C2\u00020\u0001:\u0002BCBO\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\r\u0010\u000eBa\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\r\u0010\u0013J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003JW\u0010.\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010/\u001a\u00020\u0010J\u0013\u00100\u001a\u0002012\u0008\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\t\u00104\u001a\u00020\u0010H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0010J%\u0010;\u001a\u0002072\u0006\u0010<\u001a\u00020\u00002\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@H\u0001\u00a2\u0006\u0002\u0008AR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0015\u001a\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0015\u001a\u0004\u0008\u001c\u0010\u001aR\u001c\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u0015\u001a\u0004\u0008\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u0015\u001a\u0004\u0008!\u0010\"R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u0015\u001a\u0004\u0008$\u0010\u001aR\u001c\u0010\u000c\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008%\u0010\u0015\u001a\u0004\u0008&\u0010\u001a\u00a8\u0006D"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "Landroid/os/Parcelable;",
        "icon",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "title",
        "",
        "subtitle",
        "body",
        "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "connectedAccountNotice",
        "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;",
        "disclaimer",
        "cta",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getIcon$annotations",
        "()V",
        "getIcon",
        "()Lcom/stripe/android/financialconnections/model/Image;",
        "getTitle$annotations",
        "getTitle",
        "()Ljava/lang/String;",
        "getSubtitle$annotations",
        "getSubtitle",
        "getBody$annotations",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "getConnectedAccountNotice$annotations",
        "getConnectedAccountNotice",
        "()Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;",
        "getDisclaimer$annotations",
        "getDisclaimer",
        "getCta$annotations",
        "getCta",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
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
            "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;


# instance fields
.field private final body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

.field private final connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

.field private final cta:Ljava/lang/String;

.field private final disclaimer:Ljava/lang/String;

.field private final icon:Lcom/stripe/android/financialconnections/model/Image;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->Companion:Lcom/stripe/android/financialconnections/model/DataAccessNotice$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x4a

    const/16 v0, 0x4a

    if-eq v0, p9, :cond_0

    .line 224
    sget-object p9, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    invoke-virtual {p9}, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p9, p1, 0x1

    const/4 v0, 0x0

    if-nez p9, :cond_1

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    :goto_0
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    :goto_1
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_3

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    :goto_2
    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_4

    iput-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    :goto_3
    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    .line 229
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    .line 232
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    .line 235
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    .line 237
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    .line 239
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    .line 242
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x1

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move-object p5, v0

    :cond_2
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_3

    move-object p8, p7

    move-object p7, v0

    goto :goto_0

    :cond_3
    move-object p8, p7

    move-object p7, p6

    :goto_0
    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 226
    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->copy(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getBody$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "body"
    .end annotation

    return-void
.end method

.method public static synthetic getConnectedAccountNotice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "connected_account_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "cta"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getDisclaimer$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "disclaimer"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getIcon$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "icon"
    .end annotation

    return-void
.end method

.method public static synthetic getSubtitle$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "subtitle"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getTitle$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "title"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/DataAccessNotice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 224
    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    sget-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 9

    const-string v0, "title"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;-><init>(Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    .line 235
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final getConnectedAccountNotice()Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisclaimer()Ljava/lang/String;
    .locals 1

    .line 239
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    .line 232
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 229
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "DataAccessNotice(icon="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", title="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", body="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connectedAccountNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disclaimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->icon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->connectedAccountNotice:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->disclaimer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->cta:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
