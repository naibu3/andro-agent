.class public final Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;
.super Ljava/lang/Object;
.source "TextUpdate.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;,
        Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B/\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u0017\u001a\u00020\tJ\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\tJ%\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0001\u00a2\u0006\u0002\u0008)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;",
        "Landroid/os/Parcelable;",
        "subtitle",
        "",
        "body",
        "Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getSubtitle$annotations",
        "()V",
        "getSubtitle",
        "()Ljava/lang/String;",
        "getBody$annotations",
        "getBody",
        "()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;",
        "component1",
        "component2",
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
            "Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;


# instance fields
.field private final body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

.field private final subtitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->Companion:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 247
    sget-object p4, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V
    .locals 1

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 250
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    .line 253
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

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

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 247
    sget-object v0, Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/serializer/MarkdownToHtmlSerializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v0, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;
    .locals 1

    const-string v0, "subtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getBody()Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;
    .locals 1

    .line 253
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ConnectedAccessNotice(subtitle="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", body="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->subtitle:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ConnectedAccessNotice;->body:Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/DataAccessNoticeBody;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
