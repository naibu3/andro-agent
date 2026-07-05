.class public final Lcom/stripe/android/financialconnections/model/ManualEntry;
.super Ljava/lang/Object;
.source "ManualEntry.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;,
        Lcom/stripe/android/financialconnections/model/ManualEntry$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 $2\u00020\u0001:\u0002#$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0006\u0010\u000f\u001a\u00020\u0007J\u0013\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007J%\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001\u00a2\u0006\u0002\u0008\"R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006%"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/ManualEntry;",
        "Landroid/os/Parcelable;",
        "mode",
        "Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/model/ManualEntryMode;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getMode",
        "()Lcom/stripe/android/financialconnections/model/ManualEntryMode;",
        "component1",
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/stripe/android/financialconnections/model/ManualEntry;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/ManualEntry$Companion;


# instance fields
.field private final mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/ManualEntry$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/ManualEntry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/ManualEntry;->Companion:Lcom/stripe/android/financialconnections/model/ManualEntry$Companion;

    new-instance v0, Lcom/stripe/android/financialconnections/model/ManualEntry$Creator;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/model/ManualEntry$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/financialconnections/model/ManualEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/model/ManualEntryMode;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 9
    sget-object p3, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/model/ManualEntry$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)V
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/ManualEntry;Lcom/stripe/android/financialconnections/model/ManualEntryMode;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/model/ManualEntry;->copy(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)Lcom/stripe/android/financialconnections/model/ManualEntry;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$financial_connections_core_release(Lcom/stripe/android/financialconnections/model/ManualEntry;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 9
    sget-object v0, Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/ManualEntryMode$Serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)Lcom/stripe/android/financialconnections/model/ManualEntry;
    .locals 1

    const-string v0, "mode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/ManualEntry;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/model/ManualEntry;-><init>(Lcom/stripe/android/financialconnections/model/ManualEntryMode;)V

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
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/ManualEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/ManualEntry;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getMode()Lcom/stripe/android/financialconnections/model/ManualEntryMode;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ManualEntry(mode="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

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

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/ManualEntry;->mode:Lcom/stripe/android/financialconnections/model/ManualEntryMode;

    invoke-virtual {p2}, Lcom/stripe/android/financialconnections/model/ManualEntryMode;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
