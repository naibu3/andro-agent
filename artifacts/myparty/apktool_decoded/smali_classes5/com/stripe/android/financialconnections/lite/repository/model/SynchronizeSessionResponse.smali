.class public final Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;
.super Ljava/lang/Object;
.source "SynchronizeSessionResponse.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$$serializer;,
        Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0081\u0008\u0018\u0000  2\u00020\u0001:\u0002\u001f B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B%\u0008\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0004\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J%\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0001\u00a2\u0006\u0002\u0008\u001eR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;",
        "",
        "manifest",
        "Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;",
        "<init>",
        "(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getManifest$annotations",
        "()V",
        "getManifest",
        "()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;",
        "component1",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$financial_connections_lite_release",
        "$serializer",
        "Companion",
        "financial-connections-lite_release"
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
.field public static final Companion:Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;


# instance fields
.field private final manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->Companion:Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p3, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p3, :cond_0

    .line 6
    sget-object p3, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$$serializer;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p3

    invoke-static {p1, v0, p3}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)V
    .locals 1

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;ILjava/lang/Object;)Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->copy(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getManifest$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "manifest"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$financial_connections_lite_release(Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 6
    sget-object v0, Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest$$serializer;->INSTANCE:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest$$serializer;

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    return-object v0
.end method

.method public final copy(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;
    .locals 1

    const-string v0, "manifest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;-><init>(Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;

    iget-object v1, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    iget-object p1, p1, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getManifest()Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/financialconnections/lite/repository/model/SynchronizeSessionResponse;->manifest:Lcom/stripe/android/financialconnections/lite/repository/model/FinancialConnectionsSessionManifest;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SynchronizeSessionResponse(manifest="

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
