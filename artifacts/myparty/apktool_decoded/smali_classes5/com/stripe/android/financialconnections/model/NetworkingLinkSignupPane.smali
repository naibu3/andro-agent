.class public final Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;,
        Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 =2\u00020\u0001:\u0002<=B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cBW\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\nH\u00c6\u0003JG\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0006\u0010)\u001a\u00020\u000eJ\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u000eH\u00d6\u0001J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u000eJ%\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001\u00a2\u0006\u0002\u0008;R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u0013\u001a\u0004\u0008\u001a\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0013\u001a\u0004\u0008\u001c\u0010\u0015R\u001c\u0010\u0008\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u0015R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u0013\u001a\u0004\u0008 \u0010!\u00a8\u0006>"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;",
        "Landroid/os/Parcelable;",
        "title",
        "",
        "body",
        "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;",
        "aboveCta",
        "cta",
        "skipCta",
        "legalDetailsNotice",
        "Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getTitle$annotations",
        "()V",
        "getTitle",
        "()Ljava/lang/String;",
        "getBody$annotations",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;",
        "getAboveCta$annotations",
        "getAboveCta",
        "getCta$annotations",
        "getCta",
        "getSkipCta$annotations",
        "getSkipCta",
        "getLegalDetailsNotice$annotations",
        "getLegalDetailsNotice",
        "()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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
            "Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;


# instance fields
.field private final aboveCta:Ljava/lang/String;

.field private final body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

.field private final cta:Ljava/lang/String;

.field private final legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

.field private final skipCta:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->Companion:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p8, :cond_0

    .line 152
    sget-object p8, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;

    invoke-virtual {p8}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    and-int/lit8 p1, p1, 0x20

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-void

    :cond_1
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboveCta"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skipCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    .line 158
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    .line 160
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    .line 163
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    .line 166
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    .line 169
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    const/4 p6, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 154
    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAboveCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "above_cta"
    .end annotation

    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;
    .end annotation

    return-void
.end method

.method public static synthetic getBody$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "body"
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

.method public static synthetic getLegalDetailsNotice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "legal_details_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getSkipCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "skip_cta"
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

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 152
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "aboveCta"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skipCta"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAboveCta()Ljava/lang/String;
    .locals 1

    .line 160
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    return-object v0
.end method

.method public final getCta()Ljava/lang/String;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    return-object v0
.end method

.method public final getLegalDetailsNotice()Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    return-object v0
.end method

.method public final getSkipCta()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "NetworkingLinkSignupPane(title="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", body="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aboveCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", skipCta="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", legalDetailsNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->title:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->body:Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupBody;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->aboveCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->cta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->skipCta:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/NetworkingLinkSignupPane;->legalDetailsNotice:Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;

    if-nez v0, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/LegalDetailsNotice;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
