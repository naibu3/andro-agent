.class public final Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;
.super Ljava/lang/Object;
.source "UserFacingEventResponse.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$$serializer;,
        Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;,
        Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;,
        Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;,
        Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0081\u0008\u0018\u0000 42\u00020\u0001:\u000501234B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\n\u0010\u000bBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tH\u00c6\u0003J7\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\rH\u00d6\u0001J\t\u0010\'\u001a\u00020\u0003H\u00d6\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001\u00a2\u0006\u0002\u0008/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0015\u0010\u0012\u001a\u0004\u0008\u0016\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u001aR\u001e\u0010\u0008\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001b\u0010\u0012\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u00065"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;",
        "",
        "type",
        "",
        "institutionSelected",
        "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;",
        "error",
        "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;",
        "success",
        "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getType$annotations",
        "()V",
        "getType",
        "()Ljava/lang/String;",
        "getInstitutionSelected$annotations",
        "getInstitutionSelected",
        "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;",
        "getError$annotations",
        "getError",
        "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;",
        "getSuccess$annotations",
        "getSuccess",
        "()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$financial_connections_release",
        "InstitutionSelected",
        "Error",
        "Success",
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

.field public static final Companion:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;


# instance fields
.field private final error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

.field private final institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

.field private final success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->Companion:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p6, :cond_0

    .line 6
    sget-object p6, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$$serializer;

    invoke-virtual {p6}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    const/4 p6, 0x0

    if-nez p2, :cond_1

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    :goto_1
    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_3

    iput-object p6, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    return-void

    :cond_3
    iput-object p5, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    .line 14
    iput-object p4, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getError$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "error"
    .end annotation

    return-void
.end method

.method public static synthetic getInstitutionSelected$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "institution_selected"
    .end annotation

    return-void
.end method

.method public static synthetic getSuccess$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "success"
    .end annotation

    return-void
.end method

.method public static synthetic getType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "type"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_release(Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const/4 v0, 0x0

    .line 6
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    if-eqz v1, :cond_3

    :goto_1
    sget-object v1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    invoke-interface {p1, p2, v0, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    if-eqz v1, :cond_5

    :goto_2
    sget-object v1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    invoke-interface {p1, p2, v0, v1, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    iget-object v3, p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getError()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    return-object v0
.end method

.method public final getInstitutionSelected()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    return-object v0
.end method

.method public final getSuccess()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->type:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->institutionSelected:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->error:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->success:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "UserFacingEventResponse(type="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ", institutionSelected="

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", error="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", success="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
