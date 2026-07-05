.class public final Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;
.super Ljava/lang/Object;
.source "FinancialConnectionsResponseEventEmitter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFinancialConnectionsResponseEventEmitter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinancialConnectionsResponseEventEmitter.kt\ncom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1611#2,9:77\n1863#2:86\n1864#2:88\n1620#2:89\n1863#2,2:90\n230#2,2:93\n295#2,2:95\n1#3:87\n1#3:92\n*S KotlinDebug\n*F\n+ 1 FinancialConnectionsResponseEventEmitter.kt\ncom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter\n*L\n32#1:77,9\n32#1:86\n32#1:88\n32#1:89\n33#1:90,2\n56#1:93,2\n61#1:95,2\n32#1:87\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u0008\u001a\u0004\u0018\u00010\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000c*\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;",
        "",
        "json",
        "Lkotlinx/serialization/json/Json;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V",
        "emitIfPresent",
        "",
        "response",
        "Lcom/stripe/android/core/networking/StripeResponse;",
        "",
        "(Lcom/stripe/android/core/networking/StripeResponse;)Lkotlin/Unit;",
        "eventsToEmit",
        "toEvent",
        "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;",
        "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;",
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


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter$Companion;

.field public static final EVENTS_TO_EMIT:Ljava/lang/String; = "events_to_emit"


# instance fields
.field private final json:Lkotlinx/serialization/json/Json;

.field private final logger:Lcom/stripe/android/core/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->Companion:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->json:Lkotlinx/serialization/json/Json;

    .line 20
    iput-object p2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method

.method private final eventsToEmit(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 44
    invoke-virtual {p1}, Lcom/stripe/android/core/networking/StripeResponse;->isError()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lcom/stripe/android/core/networking/ResponseJsonKt;->responseJson(Lcom/stripe/android/core/networking/StripeResponse;)Lorg/json/JSONObject;

    move-result-object p1

    .line 45
    const-string v0, "error"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 46
    const-string v0, "extra_fields"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    if-eqz p1, :cond_1

    .line 51
    const-string v0, "events_to_emit"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 52
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method

.method private final toEvent(Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;
    .locals 6

    const/4 v0, 0x0

    .line 54
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 56
    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .line 93
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 56
    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 94
    check-cast v2, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    .line 58
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->getError()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Error;->getErrorCode()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 60
    invoke-static {}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    .line 95
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    .line 61
    invoke-virtual {v5}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_0

    :cond_2
    move-object v4, v0

    :goto_0
    check-cast v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    if-nez v4, :cond_4

    .line 62
    sget-object v4, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;->UNEXPECTED_ERROR:Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;

    goto :goto_1

    :cond_3
    move-object v4, v0

    .line 64
    :cond_4
    :goto_1
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->getInstitutionSelected()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$InstitutionSelected;->getInstitutionName()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_5
    move-object v1, v0

    .line 65
    :goto_2
    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->getSuccess()Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Success;->getManualEntry()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_3

    :cond_6
    move-object p1, v0

    .line 57
    :goto_3
    new-instance v3, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    invoke-direct {v3, v1, p1, v4}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;-><init>(Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$ErrorCode;)V

    .line 55
    new-instance p1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    invoke-direct {p1, v2, v3}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;-><init>(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)V

    .line 54
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_4

    .line 94
    :cond_7
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {p1, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p1

    .line 54
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 68
    :goto_4
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 69
    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->logger:Lcom/stripe/android/core/Logger;

    const-string v3, "Error mapping event response"

    invoke-interface {v2, v3, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    :cond_8
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    goto :goto_5

    :cond_9
    move-object v0, p1

    :goto_5
    check-cast v0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    return-object v0
.end method


# virtual methods
.method public final emitIfPresent(Lcom/stripe/android/core/networking/StripeResponse;)Lkotlin/Unit;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/core/networking/StripeResponse<",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/Unit;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 25
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;

    .line 26
    invoke-direct {p0, p1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->eventsToEmit(Lcom/stripe/android/core/networking/StripeResponse;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 28
    iget-object v1, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->json:Lkotlinx/serialization/json/Json;

    .line 29
    sget-object v2, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;->Companion:Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    invoke-static {v2}, Lkotlinx/serialization/builtins/BuiltinSerializersKt;->ListSerializer(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/DeserializationStrategy;

    .line 28
    invoke-virtual {v1, v2, p1}, Lkotlinx/serialization/json/Json;->decodeFromString(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 86
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 85
    check-cast v2, Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;

    .line 32
    invoke-direct {p0, v2}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->toEvent(Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;)Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 85
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 89
    :cond_1
    check-cast v1, Ljava/util/List;

    .line 77
    check-cast v1, Ljava/lang/Iterable;

    .line 90
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;

    .line 34
    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->logger:Lcom/stripe/android/core/Logger;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getName()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getMetadata()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Emitting event "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, " with metadata "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/stripe/android/core/Logger;->debug(Ljava/lang/String;)V

    .line 35
    sget-object v2, Lcom/stripe/android/financialconnections/FinancialConnections;->INSTANCE:Lcom/stripe/android/financialconnections/FinancialConnections;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getName()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;

    move-result-object v3

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;->getMetadata()Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Lcom/stripe/android/financialconnections/FinancialConnections;->emitEvent-gIAlu-s$financial_connections_release(Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Name;Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent$Metadata;)Ljava/lang/Object;

    goto :goto_1

    .line 27
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_2

    :cond_3
    move-object p1, v0

    .line 25
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 38
    :goto_3
    invoke-static {p1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 39
    iget-object v2, p0, Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;->logger:Lcom/stripe/android/core/Logger;

    const-string v3, "Error decoding event response"

    invoke-interface {v2, v3, v1}, Lcom/stripe/android/core/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    :cond_4
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_4

    :cond_5
    move-object v0, p1

    :goto_4
    check-cast v0, Lkotlin/Unit;

    return-object v0
.end method
