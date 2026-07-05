.class public final Lcom/stripe/android/core/networking/AnalyticsRequestV2;
.super Lcom/stripe/android/core/networking/StripeRequest;
.source "AnalyticsRequestV2.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;,
        Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;,
        Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAnalyticsRequestV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRequestV2.kt\ncom/stripe/android/core/networking/AnalyticsRequestV2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,251:1\n216#2,2:252\n216#2,2:254\n*S KotlinDebug\n*F\n+ 1 AnalyticsRequestV2.kt\ncom/stripe/android/core/networking/AnalyticsRequestV2\n*L\n95#1:252,2\n116#1:254,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0012\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u0000 O2\u00020\u0001:\u0003NOPB1\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bB\u0099\u0001\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0016\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\n\u0010\u001aJ\u0008\u0010&\u001a\u00020\u0003H\u0002J\"\u0010\'\u001a\u00020\u00032\u000e\u0010(\u001a\n\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u00030\u00102\u0008\u0008\u0002\u0010)\u001a\u00020\rH\u0002J\u0014\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020+0\u0010H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u000e\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020\rJ\u001a\u0010;\u001a\u000c\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u00030\u00102\u0006\u0010:\u001a\u00020\rH\u0002J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c2\u0003J\t\u0010>\u001a\u00020\u0003H\u00c2\u0003J\t\u0010?\u001a\u00020\u0007H\u00c2\u0003J\t\u0010@\u001a\u00020\tH\u00c6\u0003J;\u0010A\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c2\u0001J\u0013\u0010B\u001a\u00020C2\u0008\u0010D\u001a\u0004\u0018\u00010+H\u00d6\u0003J\t\u0010E\u001a\u00020\rH\u00d6\u0001J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J%\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020\u00002\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0001\u00a2\u0006\u0002\u0008MR\u0013\u0010\u0002\u001a\u00020\u00038G\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u0008\u001a\u00020\t8G\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u00020\u00038\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\u001cR\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u00101R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0016X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107R\u0014\u0010\u0017\u001a\u00020\u0003X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010\u001c\u00a8\u0006Q"
    }
    d2 = {
        "Lcom/stripe/android/core/networking/AnalyticsRequestV2;",
        "Lcom/stripe/android/core/networking/StripeRequest;",
        "eventName",
        "",
        "clientId",
        "origin",
        "created",
        "",
        "params",
        "Lkotlinx/serialization/json/JsonElement;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V",
        "seen0",
        "",
        "postParameters",
        "headers",
        "",
        "method",
        "Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "mimeType",
        "Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "retryResponseCodes",
        "",
        "url",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/StripeRequest$Method;Lcom/stripe/android/core/networking/StripeRequest$MimeType;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getEventName",
        "()Ljava/lang/String;",
        "getParams",
        "()Lkotlinx/serialization/json/JsonElement;",
        "getPostParameters$stripe_core_release$annotations",
        "()V",
        "getPostParameters$stripe_core_release",
        "postBodyBytes",
        "",
        "getPostBodyBytes",
        "()[B",
        "createPostParams",
        "encodeMapParam",
        "map",
        "level",
        "analyticParams",
        "",
        "writePostBody",
        "",
        "outputStream",
        "Ljava/io/OutputStream;",
        "getHeaders",
        "()Ljava/util/Map;",
        "getMethod",
        "()Lcom/stripe/android/core/networking/StripeRequest$Method;",
        "getMimeType",
        "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;",
        "getRetryResponseCodes",
        "()Ljava/lang/Iterable;",
        "getUrl",
        "withWorkManagerParams",
        "runAttemptCount",
        "createWorkManagerParams",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "write$Self",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$stripe_core_release",
        "Parameter",
        "Companion",
        "$serializer",
        "stripe-core_release"
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

.field public static final ANALYTICS_HOST:Ljava/lang/String; = "https://r.stripe.com/0"

.field public static final Companion:Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;

.field public static final HEADER_ORIGIN:Ljava/lang/String; = "origin"

.field private static final INDENTATION:Ljava/lang/String; = "  "

.field public static final PARAM_CLIENT_ID:Ljava/lang/String; = "client_id"

.field public static final PARAM_CREATED:Ljava/lang/String; = "created"

.field private static final PARAM_DELAYED:Ljava/lang/String; = "delayed"

.field public static final PARAM_EVENT_ID:Ljava/lang/String; = "event_id"

.field public static final PARAM_EVENT_NAME:Ljava/lang/String; = "event_name"

.field private static final PARAM_IS_RETRY:Ljava/lang/String; = "is_retry"

.field private static final PARAM_USES_WORK_MANAGER:Ljava/lang/String; = "uses_work_manager"


# instance fields
.field private final clientId:Ljava/lang/String;

.field private final created:D

.field private final eventName:Ljava/lang/String;

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final method:Lcom/stripe/android/core/networking/StripeRequest$Method;

.field private final mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

.field private final origin:Ljava/lang/String;

.field private final params:Lkotlinx/serialization/json/JsonElement;

.field private final postParameters:Ljava/lang/String;

.field private final retryResponseCodes:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final url:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$3xIdz34FhhMUuihUCJuUDUUgkik(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam$lambda$2(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$zJn0qtfUXPQ_Op0smekMmpO0czs(Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams$lambda$1(Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;

    const/16 v0, 0xb

    .line 194
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    new-instance v3, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v5, Lkotlinx/serialization/KSerializer;

    invoke-direct {v3, v4, v5}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/4 v4, 0x6

    aput-object v3, v0, v4

    invoke-static {}, Lcom/stripe/android/core/networking/StripeRequest$Method;->values()[Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v3

    check-cast v3, [Ljava/lang/Enum;

    const-string v4, "com.stripe.android.core.networking.StripeRequest.Method"

    invoke-static {v4, v3}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;

    move-result-object v3

    const/4 v4, 0x7

    aput-object v3, v0, v4

    invoke-static {}, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->values()[Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    move-result-object v3

    check-cast v3, [Ljava/lang/Enum;

    const-string v4, "com.stripe.android.core.networking.StripeRequest.MimeType"

    invoke-static {v4, v3}, Lkotlinx/serialization/internal/EnumsKt;->createSimpleEnumSerializer(Ljava/lang/String;[Ljava/lang/Enum;)Lkotlinx/serialization/KSerializer;

    move-result-object v3

    const/16 v4, 0x8

    aput-object v3, v0, v4

    new-instance v3, Lkotlinx/serialization/PolymorphicSerializer;

    const-class v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v4

    new-array v2, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v3, v4, v2}, Lkotlinx/serialization/PolymorphicSerializer;-><init>(Lkotlin/reflect/KClass;[Ljava/lang/annotation/Annotation;)V

    const/16 v2, 0x9

    aput-object v3, v0, v2

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/StripeRequest$Method;Lcom/stripe/android/core/networking/StripeRequest$MimeType;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p14, :cond_0

    .line 42
    sget-object p14, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->INSTANCE:Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;

    invoke-virtual {p14}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeRequest;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iput-wide p5, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iput-object p7, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_1

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object p2

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p8, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_2

    const/4 p2, 0x3

    .line 158
    new-array p2, p2, [Lkotlin/Pair;

    sget-object p3, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    invoke-virtual {p3}, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->getCode()Ljava/lang/String;

    move-result-object p3

    sget-object p5, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p5}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p5

    new-instance p6, Ljava/lang/StringBuilder;

    invoke-direct {p6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    const-string p6, "; charset="

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p5, "Content-Type"

    invoke-static {p5, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p5, 0x0

    aput-object p3, p2, p5

    .line 159
    const-string p3, "origin"

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x1

    aput-object p3, p2, p4

    .line 160
    const-string p3, "User-Agent"

    const-string p4, "Stripe/v1 android/21.22.2"

    invoke-static {p3, p4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p3

    const/4 p4, 0x2

    aput-object p3, p2, p4

    .line 157
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p9, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    :goto_1
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_3

    .line 163
    sget-object p2, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    goto :goto_2

    :cond_3
    iput-object p10, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    :goto_2
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_4

    .line 165
    sget-object p2, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    goto :goto_3

    :cond_4
    iput-object p11, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    :goto_3
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_5

    .line 167
    new-instance p2, Lkotlin/ranges/IntRange;

    const/16 p3, 0x1ad

    invoke-direct {p2, p3, p3}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast p2, Ljava/lang/Iterable;

    .line 42
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    goto :goto_4

    :cond_5
    iput-object p12, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    :goto_4
    and-int/lit16 p1, p1, 0x400

    if-nez p1, :cond_6

    .line 169
    const-string p1, "https://r.stripe.com/0"

    .line 42
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void

    :cond_6
    iput-object p13, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V
    .locals 0

    .line 53
    invoke-direct {p0}, Lcom/stripe/android/core/networking/StripeRequest;-><init>()V

    .line 46
    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    .line 49
    iput-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    .line 50
    iput-wide p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    .line 51
    iput-object p6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    const/4 p1, 0x3

    .line 158
    new-array p1, p1, [Lkotlin/Pair;

    sget-object p2, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->getCode()Ljava/lang/String;

    move-result-object p2

    sget-object p4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    const-string p5, "; charset="

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, "Content-Type"

    invoke-static {p4, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p4, 0x0

    aput-object p2, p1, p4

    .line 159
    const-string p2, "origin"

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x1

    aput-object p2, p1, p3

    .line 160
    const-string p2, "User-Agent"

    const-string p3, "Stripe/v1 android/21.22.2"

    invoke-static {p2, p3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    const/4 p3, 0x2

    aput-object p2, p1, p3

    .line 157
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    .line 163
    sget-object p1, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    .line 165
    sget-object p1, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    .line 167
    new-instance p1, Lkotlin/ranges/IntRange;

    const/16 p2, 0x1ad

    invoke-direct {p1, p2, p2}, Lkotlin/ranges/IntRange;-><init>(II)V

    check-cast p1, Ljava/lang/Iterable;

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    .line 169
    const-string p1, "https://r.stripe.com/0"

    iput-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 42
    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method private final analyticParams()Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x4

    .line 144
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "client_id"

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 145
    iget-wide v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const-string v2, "created"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 146
    const-string v1, "event_name"

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 147
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "event_id"

    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    .line 143
    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    return-object v0
.end method

.method private final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    return-object v0
.end method

.method private final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    return-wide v0
.end method

.method private final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 7

    new-instance v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V

    return-object v0
.end method

.method static synthetic copy$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-wide p4, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    :cond_3
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_4

    iget-object p6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    :cond_4
    move-object p8, p6

    move-wide p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-direct/range {p2 .. p8}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p0

    return-object p0
.end method

.method private final createPostParams()Ljava/lang/String;
    .locals 14

    .line 93
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v0}, Lcom/stripe/android/core/networking/JsonUtilsKt;->toMap(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->analyticParams()Ljava/util/Map;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 94
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/List;

    .line 95
    sget-object v2, Lcom/stripe/android/core/networking/QueryStringFactory;->INSTANCE:Lcom/stripe/android/core/networking/QueryStringFactory;

    invoke-virtual {v2, v0}, Lcom/stripe/android/core/networking/QueryStringFactory;->compactParams(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 252
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 95
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 97
    instance-of v4, v2, Ljava/util/Map;

    if-eqz v4, :cond_0

    .line 98
    new-instance v4, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;

    check-cast v2, Ljava/util/Map;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {p0, v2, v7, v5, v6}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v3, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 101
    :cond_0
    new-instance v4, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v3, v2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 105
    :cond_1
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    const-string v0, "&"

    move-object v6, v0

    check-cast v6, Ljava/lang/CharSequence;

    new-instance v11, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$ExternalSyntheticLambda1;

    invoke-direct {v11}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$ExternalSyntheticLambda1;-><init>()V

    const/16 v12, 0x1e

    const/4 v13, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v13}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static final createPostParams$lambda$1(Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;)Ljava/lang/CharSequence;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;->toString()Ljava/lang/String;

    move-result-object p0

    check-cast p0, Ljava/lang/CharSequence;

    return-object p0
.end method

.method private final createWorkManagerParams(I)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation

    .line 181
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    sget-object v2, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/Duration;->toDouble-impl(JLkotlin/time/DurationUnit;)D

    move-result-wide v0

    .line 185
    iget-wide v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    sub-double/2addr v0, v2

    const-wide/high16 v2, 0x4014000000000000L    # 5.0

    cmpl-double v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const/4 v3, 0x3

    .line 188
    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "uses_work_manager"

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v1

    if-lez p1, :cond_1

    move v1, v2

    .line 189
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "is_retry"

    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    aput-object p1, v3, v2

    .line 190
    const-string p1, "delayed"

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    const/4 v0, 0x2

    aput-object p1, v3, v0

    .line 187
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method private final encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;I)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 114
    new-instance v1, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {p1, v1}, Lkotlin/collections/MapsKt;->toSortedMap(Ljava/util/Map;Ljava/util/Comparator;)Ljava/util/SortedMap;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    .line 254
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, "  "

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 116
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 119
    instance-of v5, v2, Ljava/util/Map;

    if-eqz v5, :cond_1

    .line 120
    check-cast v2, Ljava/util/Map;

    add-int/lit8 v5, p2, 0x1

    invoke-direct {p0, v2, v5}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    .line 122
    const-string v2, ""

    goto :goto_1

    .line 123
    :cond_2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "\""

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 125
    :goto_1
    move-object v5, v2

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 126
    const-string v5, "\": "

    const-string v6, "  \""

    if-eqz v1, :cond_3

    .line 127
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3, p2}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    goto :goto_0

    .line 130
    :cond_3
    const-string v7, ",\n"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3, p2}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    .line 131
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_4
    const/16 p1, 0xa

    .line 135
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 136
    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3, p2}, Lkotlin/text/StringsKt;->repeat(Ljava/lang/CharSequence;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "}"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method static synthetic encodeMapParam$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 110
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->encodeMapParam(Ljava/util/Map;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final encodeMapParam$lambda$2(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 115
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private final getPostBodyBytes()[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic getPostParameters$stripe_core_release$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$stripe_core_release(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 10
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 42
    sget-object v0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    const/4 v4, 0x2

    invoke-interface {p1, p2, v4, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    iget-wide v5, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v5, v6}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeDoubleElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ID)V

    sget-object v5, Lkotlinx/serialization/json/JsonElementSerializer;->INSTANCE:Lkotlinx/serialization/json/JsonElementSerializer;

    check-cast v5, Lkotlinx/serialization/SerializationStrategy;

    iget-object v6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    const/4 v7, 0x4

    invoke-interface {p1, p2, v7, v5, v6}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v5, 0x5

    invoke-interface {p1, p2, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_0

    :cond_0
    iget-object v6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    .line 66
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createPostParams()Ljava/lang/String;

    move-result-object v7

    .line 42
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    :goto_0
    iget-object v6, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    invoke-interface {p1, p2, v5, v6}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_1
    const/4 v5, 0x6

    invoke-interface {p1, p2, v5}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v6

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getHeaders()Ljava/util/Map;

    move-result-object v6

    .line 158
    new-array v1, v1, [Lkotlin/Pair;

    sget-object v7, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    invoke-virtual {v7}, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->getCode()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v8}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v9, "; charset="

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v8, "Content-Type"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v1, v2

    .line 159
    const-string v2, "origin"

    .line 42
    iget-object v7, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    .line 159
    invoke-static {v2, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v3

    .line 160
    const-string v2, "User-Agent"

    const-string v3, "Stripe/v1 android/21.22.2"

    invoke-static {v2, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v1, v4

    .line 157
    invoke-static {v1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    .line 42
    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_1
    aget-object v1, v0, v5

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getHeaders()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v5, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v2

    .line 163
    sget-object v3, Lcom/stripe/android/core/networking/StripeRequest$Method;->POST:Lcom/stripe/android/core/networking/StripeRequest$Method;

    if-eq v2, v3, :cond_5

    .line 42
    :goto_2
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;

    move-result-object v3

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMimeType()Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    move-result-object v2

    .line 165
    sget-object v3, Lcom/stripe/android/core/networking/StripeRequest$MimeType;->Form:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    if-eq v2, v3, :cond_7

    .line 42
    :goto_3
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getMimeType()Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    move-result-object v3

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/16 v1, 0x9

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v2

    .line 167
    new-instance v3, Lkotlin/ranges/IntRange;

    const/16 v4, 0x1ad

    invoke-direct {v3, v4, v4}, Lkotlin/ranges/IntRange;-><init>(II)V

    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :goto_4
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getRetryResponseCodes()Ljava/lang/Iterable;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_9
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v1

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 169
    const-string v2, "https://r.stripe.com/0"

    .line 42
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :goto_5
    invoke-virtual {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getUrl()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_b
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iget-wide v5, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    iget-object p1, p1, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEventName()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->headers:Ljava/util/Map;

    return-object v0
.end method

.method public getMethod()Lcom/stripe/android/core/networking/StripeRequest$Method;
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->method:Lcom/stripe/android/core/networking/StripeRequest$Method;

    return-object v0
.end method

.method public getMimeType()Lcom/stripe/android/core/networking/StripeRequest$MimeType;
    .locals 1

    .line 165
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->mimeType:Lcom/stripe/android/core/networking/StripeRequest$MimeType;

    return-object v0
.end method

.method public final getParams()Lkotlinx/serialization/json/JsonElement;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    return-object v0
.end method

.method public final getPostParameters$stripe_core_release()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->postParameters:Ljava/lang/String;

    return-object v0
.end method

.method public getRetryResponseCodes()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 167
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->retryResponseCodes:Ljava/lang/Iterable;

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->url:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-virtual {v1}, Lkotlinx/serialization/json/JsonElement;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->eventName:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->clientId:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->origin:Ljava/lang/String;

    iget-wide v3, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->created:D

    iget-object v5, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "AnalyticsRequestV2(eventName="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v6, ", clientId="

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", origin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", created="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", params="

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

.method public final withWorkManagerParams(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;
    .locals 9

    .line 174
    iget-object v0, p0, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->params:Lkotlinx/serialization/json/JsonElement;

    invoke-static {v0}, Lcom/stripe/android/core/networking/JsonUtilsKt;->toMap(Lkotlinx/serialization/json/JsonElement;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->createWorkManagerParams(I)Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    .line 176
    invoke-static {p1}, Lcom/stripe/android/core/networking/AnalyticsRequestV2Kt;->access$toJsonElement(Ljava/util/Map;)Lkotlinx/serialization/json/JsonElement;

    move-result-object v6

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    .line 175
    invoke-static/range {v0 .. v8}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->copy$default(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;ILjava/lang/Object;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;

    move-result-object p1

    return-object p1
.end method

.method public writePostBody(Ljava/io/OutputStream;)V
    .locals 1

    const-string v0, "outputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    invoke-direct {p0}, Lcom/stripe/android/core/networking/AnalyticsRequestV2;->getPostBodyBytes()[B

    move-result-object v0

    .line 152
    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 153
    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V

    return-void
.end method
