.class public final Lcom/stripe/android/financialconnections/model/OauthPrepane;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;,
        Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 G2\u00020\u0001:\u0002FGBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Ba\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0015J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u00100\u001a\u00020\rH\u00c6\u0003J\t\u00101\u001a\u00020\rH\u00c6\u0003JU\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u00c6\u0001J\u0006\u00103\u001a\u00020\u0012J\u0013\u00104\u001a\u0002052\u0008\u00106\u001a\u0004\u0018\u000107H\u00d6\u0003J\t\u00108\u001a\u00020\u0012H\u00d6\u0001J\t\u00109\u001a\u00020\rH\u00d6\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0012J%\u0010?\u001a\u00020;2\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001\u00a2\u0006\u0002\u0008ER\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001a\u0010\u0017\u001a\u0004\u0008\u001b\u0010\u001cR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001d\u0010\u0017\u001a\u0004\u0008\u001e\u0010\u001fR\u001e\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008 \u0010\u0017\u001a\u0004\u0008!\u0010\"R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010\u0017\u001a\u0004\u0008$\u0010%R\u001c\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008&\u0010\u0017\u001a\u0004\u0008\'\u0010(R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008)\u0010\u0017\u001a\u0004\u0008*\u0010(\u00a8\u0006H"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/OauthPrepane;",
        "Landroid/os/Parcelable;",
        "body",
        "Lcom/stripe/android/financialconnections/model/Body;",
        "cta",
        "Lcom/stripe/android/financialconnections/model/Cta;",
        "institutionIcon",
        "Lcom/stripe/android/financialconnections/model/Image;",
        "partnerNotice",
        "Lcom/stripe/android/financialconnections/model/PartnerNotice;",
        "dataAccessNotice",
        "Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "title",
        "",
        "subtitle",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getBody$annotations",
        "()V",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/Body;",
        "getCta$annotations",
        "getCta",
        "()Lcom/stripe/android/financialconnections/model/Cta;",
        "getInstitutionIcon$annotations",
        "getInstitutionIcon",
        "()Lcom/stripe/android/financialconnections/model/Image;",
        "getPartnerNotice$annotations",
        "getPartnerNotice",
        "()Lcom/stripe/android/financialconnections/model/PartnerNotice;",
        "getDataAccessNotice$annotations",
        "getDataAccessNotice",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNotice;",
        "getTitle$annotations",
        "getTitle",
        "()Ljava/lang/String;",
        "getSubtitle$annotations",
        "getSubtitle",
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
            "Lcom/stripe/android/financialconnections/model/OauthPrepane;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;


# instance fields
.field private final body:Lcom/stripe/android/financialconnections/model/Body;

.field private final cta:Lcom/stripe/android/financialconnections/model/Cta;

.field private final dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

.field private final institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

.field private final partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

.field private final subtitle:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->Companion:Lcom/stripe/android/financialconnections/model/OauthPrepane$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/OauthPrepane$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/OauthPrepane$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x63

    const/16 v0, 0x63

    if-eq v0, p9, :cond_0

    .line 83
    sget-object p9, Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;

    invoke-virtual {p9}, Lcom/stripe/android/financialconnections/model/OauthPrepane$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_1

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    goto :goto_0

    :cond_1
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    :goto_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    goto :goto_1

    :cond_2
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    :goto_1
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_3

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    goto :goto_2

    :cond_3
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :goto_2
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    .line 88
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    .line 90
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    .line 92
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    .line 94
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    .line 96
    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    .line 99
    iput-object p7, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p8, p8, 0x10

    if-eqz p8, :cond_2

    move-object p8, p7

    move-object p7, p6

    move-object p6, v0

    goto :goto_0

    :cond_2
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 85
    invoke-direct/range {p1 .. p8}, Lcom/stripe/android/financialconnections/model/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/OauthPrepane;Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/OauthPrepane;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/stripe/android/financialconnections/model/OauthPrepane;->copy(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/OauthPrepane;

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

.method public static synthetic getCta$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "cta"
    .end annotation

    return-void
.end method

.method public static synthetic getDataAccessNotice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "data_access_notice"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionIcon$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "institution_icon"
    .end annotation

    return-void
.end method

.method public static synthetic getPartnerNotice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "partner_notice"
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

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/OauthPrepane;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 83
    sget-object v0, Lcom/stripe/android/financialconnections/model/Body$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Body$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/Cta$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Cta$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/Image$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/Image$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/PartnerNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/PartnerNotice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNotice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    const/4 v1, 0x6

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/Body;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/Cta;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/PartnerNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/OauthPrepane;
    .locals 9

    const-string v0, "body"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cta"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/financialconnections/model/OauthPrepane;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/financialconnections/model/OauthPrepane;-><init>(Lcom/stripe/android/financialconnections/model/Body;Lcom/stripe/android/financialconnections/model/Cta;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/PartnerNotice;Lcom/stripe/android/financialconnections/model/DataAccessNotice;Ljava/lang/String;Ljava/lang/String;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/Body;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    return-object v0
.end method

.method public final getCta()Lcom/stripe/android/financialconnections/model/Cta;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    return-object v0
.end method

.method public final getDataAccessNotice()Lcom/stripe/android/financialconnections/model/DataAccessNotice;
    .locals 1

    .line 94
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    return-object v0
.end method

.method public final getInstitutionIcon()Lcom/stripe/android/financialconnections/model/Image;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    return-object v0
.end method

.method public final getPartnerNotice()Lcom/stripe/android/financialconnections/model/PartnerNotice;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Body;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Cta;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/Image;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/PartnerNotice;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    iget-object v4, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    iget-object v5, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "OauthPrepane(body="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, ", cta="

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", institutionIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", partnerNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataAccessNotice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

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

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->body:Lcom/stripe/android/financialconnections/model/Body;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Body;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->cta:Lcom/stripe/android/financialconnections/model/Cta;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Cta;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->institutionIcon:Lcom/stripe/android/financialconnections/model/Image;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/Image;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->partnerNotice:Lcom/stripe/android/financialconnections/model/PartnerNotice;

    if-nez v0, :cond_1

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/PartnerNotice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->dataAccessNotice:Lcom/stripe/android/financialconnections/model/DataAccessNotice;

    if-nez v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNotice;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_2
    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/OauthPrepane;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
