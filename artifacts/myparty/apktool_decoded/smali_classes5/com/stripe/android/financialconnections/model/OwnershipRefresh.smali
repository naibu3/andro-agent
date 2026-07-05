.class public final Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
.super Ljava/lang/Object;
.source "OwnershipRefresh.kt"

# interfaces
.implements Landroid/os/Parcelable;
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;,
        Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;,
        Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0003+,-B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008B-\u0008\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0007\u0010\u000cJ\t\u0010\u0014\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0006\u0010\u0017\u001a\u00020\u0004J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0004J%\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0001\u00a2\u0006\u0002\u0008*R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006."
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
        "Landroid/os/Parcelable;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "lastAttemptedAt",
        "",
        "status",
        "Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;",
        "<init>",
        "(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V",
        "seen0",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(IILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getLastAttemptedAt$annotations",
        "()V",
        "getLastAttemptedAt",
        "()I",
        "getStatus$annotations",
        "getStatus",
        "()Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;",
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
        "",
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
        "write$Self$financial_connections_core_release",
        "Status",
        "$serializer",
        "Companion",
        "financial-connections-core_release"
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

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/OwnershipRefresh;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;


# instance fields
.field private final lastAttemptedAt:I

.field private final status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->Companion:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x2

    .line 16
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->Companion:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p4, :cond_0

    .line 16
    sget-object p4, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_1

    .line 26
    sget-object p1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    .line 16
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    return-void

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    return-void
.end method

.method public constructor <init>(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    .line 25
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 26
    sget-object p2, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    .line 19
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;-><init>(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 16
    sget-object v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/OwnershipRefresh;ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget p1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->copy(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getLastAttemptedAt$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "last_attempted_at"
    .end annotation

    return-void
.end method

.method public static synthetic getStatus$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "status"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/OwnershipRefresh;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 16
    sget-object v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    iget v2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeIntElement(Lkotlinx/serialization/descriptors/SerialDescriptor;II)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    .line 26
    sget-object v3, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->UNKNOWN:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    if-eq v2, v3, :cond_1

    .line 16
    :goto_0
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    return v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    return-object v0
.end method

.method public final copy(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)Lcom/stripe/android/financialconnections/model/OwnershipRefresh;
    .locals 1

    const-string v0, "status"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;-><init>(ILcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;

    iget v1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    iget v3, p1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLastAttemptedAt()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    return v0
.end method

.method public final getStatus()Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "OwnershipRefresh(lastAttemptedAt="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", status="

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
    .locals 0

    const-string p2, "dest"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->lastAttemptedAt:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/OwnershipRefresh;->status:Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/OwnershipRefresh$Status;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
