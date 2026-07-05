.class public final LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;
.super LFinancialConnectionsGenericInfoScreen$Body$Entry;
.source "FinancialConnectionsGenericInfoScreen.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LFinancialConnectionsGenericInfoScreen$Body$Entry;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Unknown"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer;,
        LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0007J%\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001\u00a2\u0006\u0002\u0008!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006$"
    }
    d2 = {
        "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;",
        "LFinancialConnectionsGenericInfoScreen$Body$Entry;",
        "id",
        "",
        "<init>",
        "(Ljava/lang/String;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getId",
        "()Ljava/lang/String;",
        "component1",
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
            "LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;


# instance fields
.field private final id:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->Companion:LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Companion;

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Creator;

    invoke-direct {v0}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->CREATOR:Landroid/os/Parcelable$Creator;

    const/16 v0, 0x8

    sput v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 74
    sget-object p3, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer;->INSTANCE:LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer;

    invoke-virtual {p3}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    const/4 p1, 0x0

    invoke-direct {p0, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p2, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 78
    invoke-direct {p0, v0}, LFinancialConnectionsGenericInfoScreen$Body$Entry;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 77
    iput-object p1, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;Ljava/lang/String;ILjava/lang/Object;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->copy(Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$financial_connections_release(LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 74
    invoke-virtual {p0}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->getId()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;)LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;
    .locals 1

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;

    invoke-direct {v0, p1}, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;

    iget-object v1, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    iget-object p1, p1, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown(id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, LFinancialConnectionsGenericInfoScreen$Body$Entry$Unknown;->id:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
