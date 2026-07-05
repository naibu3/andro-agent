.class public final Lcom/stripe/android/model/ConsumerSession$VerificationSession;
.super Ljava/lang/Object;
.source "ConsumerSession.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/ConsumerSession;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "VerificationSession"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;,
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;,
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;,
        Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0087\u0008\u0018\u0000 +2\u00020\u0001:\u0004()*+B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B/\u0008\u0010\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u0006\u0010\u000cJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u0014\u001a\u00020\tJ\u0013\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\u0016\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\tJ%\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001\u00a2\u0006\u0002\u0008\'R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006,"
    }
    d2 = {
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "type",
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;",
        "state",
        "Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;",
        "<init>",
        "(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getType",
        "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;",
        "getState",
        "()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;",
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
        "write$Self$payments_model_release",
        "SessionType",
        "SessionState",
        "$serializer",
        "Companion",
        "payments-model_release"
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
            "Lcom/stripe/android/model/ConsumerSession$VerificationSession;",
            ">;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;


# instance fields
.field private final state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

.field private final type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->Companion:Lcom/stripe/android/model/ConsumerSession$VerificationSession$Companion;

    new-instance v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Creator;

    invoke-direct {v0}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$Creator;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x2

    .line 30
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    invoke-static {}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->values()[Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    move-result-object v1

    check-cast v1, [Ljava/lang/Enum;

    const-string v2, "com.stripe.android.model.ConsumerSession.VerificationSession.SessionType"

    invoke-static {v2, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->values()[Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    move-result-object v1

    check-cast v1, [Ljava/lang/Enum;

    const-string v2, "com.stripe.android.model.ConsumerSession.VerificationSession.SessionState"

    invoke-static {v2, v1}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p4, p1, 0x3

    const/4 v0, 0x3

    if-eq v0, p4, :cond_0

    .line 30
    sget-object p4, Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;->INSTANCE:Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;

    invoke-virtual {p4}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p4

    invoke-static {p1, v0, p4}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iput-object p3, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    .line 35
    iput-object p2, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 30
    sget-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/model/ConsumerSession$VerificationSession;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->copy(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$payments_model_release(Lcom/stripe/android/model/ConsumerSession$VerificationSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 30
    sget-object v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)Lcom/stripe/android/model/ConsumerSession$VerificationSession;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    invoke-direct {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession;-><init>(Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;)V

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
    instance-of v1, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iget-object v3, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    iget-object p1, p1, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getState()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    return-object v0
.end method

.method public final getType()Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;
    .locals 1

    .line 34
    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    invoke-virtual {v1}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    iget-object v1, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "VerificationSession(type="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", state="

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

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->type:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionType;->writeToParcel(Landroid/os/Parcel;I)V

    iget-object v0, p0, Lcom/stripe/android/model/ConsumerSession$VerificationSession;->state:Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;

    invoke-virtual {v0, p1, p2}, Lcom/stripe/android/model/ConsumerSession$VerificationSession$SessionState;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method
