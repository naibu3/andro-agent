.class public final Lcom/stripe/android/link/serialization/PopupPayload;
.super Ljava/lang/Object;
.source "PopupPayload.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/serialization/PopupPayload$$serializer;,
        Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;,
        Lcom/stripe/android/link/serialization/PopupPayload$Companion;,
        Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;,
        Lcom/stripe/android/link/serialization/PopupPayload$IntentMode;,
        Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;,
        Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008C\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0081\u0008\u0018\u0000 q2\u00020\u0001:\u0007lmnopqrB\u008f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0015\u0012\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00f7\u0001\u0008\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017\u0012\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\u0008\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0004\u0008\u0018\u0010\"J\u0006\u0010P\u001a\u00020\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0006H\u00c6\u0003J\t\u0010T\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010V\u001a\u00020\u0003H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0015\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0015H\u00c6\u0003J\u000f\u0010^\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u00c6\u0003J\u00ad\u0001\u0010_\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0014\u0008\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00152\u000e\u0008\u0002\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0017H\u00c6\u0001J\u0013\u0010`\u001a\u00020\u00112\u0008\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\u001bH\u00d6\u0001J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001J%\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020jH\u0001\u00a2\u0006\u0002\u0008kR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\'\u0010$\u001a\u0004\u0008(\u0010&R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008)\u0010$\u001a\u0004\u0008*\u0010+R\u001c\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008,\u0010$\u001a\u0004\u0008-\u0010.R\u001e\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008/\u0010$\u001a\u0004\u00080\u00101R\u001c\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00082\u0010$\u001a\u0004\u00083\u0010&R\u001c\u0010\u000c\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00084\u0010$\u001a\u0004\u00085\u0010&R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00086\u0010$\u001a\u0004\u00087\u0010&R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00088\u0010$\u001a\u0004\u00089\u0010&R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008:\u0010$\u001a\u0004\u0008;\u0010&R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008<\u0010$\u001a\u0004\u0008=\u0010>R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008?\u0010$\u001a\u0004\u0008@\u0010AR(\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008B\u0010$\u001a\u0004\u0008C\u0010DR\"\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00178\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008E\u0010$\u001a\u0004\u0008F\u0010GR\u001c\u0010\u001c\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008H\u0010$\u001a\u0004\u0008I\u0010&R\u001c\u0010\u001d\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008J\u0010$\u001a\u0004\u0008K\u0010&R(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008L\u0010$\u001a\u0004\u0008M\u0010DR(\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00158\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008N\u0010$\u001a\u0004\u0008O\u0010D\u00a8\u0006s"
    }
    d2 = {
        "Lcom/stripe/android/link/serialization/PopupPayload;",
        "",
        "publishableKey",
        "",
        "stripeAccount",
        "merchantInfo",
        "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
        "customerInfo",
        "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
        "paymentInfo",
        "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
        "appId",
        "locale",
        "paymentUserAgent",
        "paymentObject",
        "intentMode",
        "setupFutureUsage",
        "",
        "cardBrandChoice",
        "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
        "flags",
        "",
        "linkFundingSources",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;)V",
        "seen0",
        "",
        "path",
        "integrationType",
        "loggerMetadata",
        "experiments",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "getPublishableKey$annotations",
        "()V",
        "getPublishableKey",
        "()Ljava/lang/String;",
        "getStripeAccount$annotations",
        "getStripeAccount",
        "getMerchantInfo$annotations",
        "getMerchantInfo",
        "()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
        "getCustomerInfo$annotations",
        "getCustomerInfo",
        "()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
        "getPaymentInfo$annotations",
        "getPaymentInfo",
        "()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
        "getAppId$annotations",
        "getAppId",
        "getLocale$annotations",
        "getLocale",
        "getPaymentUserAgent$annotations",
        "getPaymentUserAgent",
        "getPaymentObject$annotations",
        "getPaymentObject",
        "getIntentMode$annotations",
        "getIntentMode",
        "getSetupFutureUsage$annotations",
        "getSetupFutureUsage",
        "()Z",
        "getCardBrandChoice$annotations",
        "getCardBrandChoice",
        "()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
        "getFlags$annotations",
        "getFlags",
        "()Ljava/util/Map;",
        "getLinkFundingSources$annotations",
        "getLinkFundingSources",
        "()Ljava/util/List;",
        "getPath$annotations",
        "getPath",
        "getIntegrationType$annotations",
        "getIntegrationType",
        "getLoggerMetadata$annotations",
        "getLoggerMetadata",
        "getExperiments$annotations",
        "getExperiments",
        "toUrl",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "copy",
        "equals",
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
        "write$Self$paymentsheet_release",
        "MerchantInfo",
        "CustomerInfo",
        "PaymentInfo",
        "CardBrandChoice",
        "IntentMode",
        "Companion",
        "$serializer",
        "paymentsheet_release"
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

.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/link/serialization/PopupPayload$Companion;

.field private static final MOBILE_SESSION_ID_KEY:Ljava/lang/String; = "mobile_session_id"

.field private static final PopupPayloadJson:Lkotlinx/serialization/json/Json;

.field private static final baseUrl:Ljava/lang/String; = "https://checkout.link.com/#"


# instance fields
.field private final appId:Ljava/lang/String;

.field private final cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

.field private final customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

.field private final experiments:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final flags:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final integrationType:Ljava/lang/String;

.field private final intentMode:Ljava/lang/String;

.field private final linkFundingSources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final locale:Ljava/lang/String;

.field private final loggerMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

.field private final path:Ljava/lang/String;

.field private final paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

.field private final paymentObject:Ljava/lang/String;

.field private final paymentUserAgent:Ljava/lang/String;

.field private final publishableKey:Ljava/lang/String;

.field private final setupFutureUsage:Z

.field private final stripeAccount:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$h5POw6NeL6RN2y0nEYWJzZf8y3c(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/stripe/android/link/serialization/PopupPayload$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/serialization/PopupPayload$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/PopupPayload$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/link/serialization/PopupPayload;->$stable:I

    const/16 v2, 0x12

    .line 120
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v4, 0x2

    aput-object v1, v2, v4

    const/4 v4, 0x3

    aput-object v1, v2, v4

    const/4 v4, 0x4

    aput-object v1, v2, v4

    const/4 v4, 0x5

    aput-object v1, v2, v4

    const/4 v4, 0x6

    aput-object v1, v2, v4

    const/4 v4, 0x7

    aput-object v1, v2, v4

    aput-object v1, v2, v0

    const/16 v0, 0x9

    aput-object v1, v2, v0

    const/16 v0, 0xa

    aput-object v1, v2, v0

    const/16 v0, 0xb

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    sget-object v5, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    check-cast v5, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v4, v5}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v4, 0xc

    aput-object v0, v2, v4

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v4}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    const/16 v4, 0xd

    aput-object v0, v2, v4

    const/16 v0, 0xe

    aput-object v1, v2, v0

    const/16 v0, 0xf

    aput-object v1, v2, v0

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v5, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v4, v5}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v4, 0x10

    aput-object v0, v2, v4

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v4, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v4, Lkotlinx/serialization/KSerializer;

    sget-object v5, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v5, Lkotlinx/serialization/KSerializer;

    invoke-direct {v0, v4, v5}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V

    const/16 v4, 0x11

    aput-object v0, v2, v4

    sput-object v2, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    .line 125
    new-instance v0, Lcom/stripe/android/link/serialization/PopupPayload$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/link/serialization/PopupPayload$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v1, v0, v3, v1}, Lkotlinx/serialization/json/JsonKt;->Json$default(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lkotlinx/serialization/json/Json;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit16 v0, p1, 0x3fff

    const/16 v1, 0x3fff

    if-eq v1, v0, :cond_0

    .line 16
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$$serializer;

    invoke-virtual {v0}, Lcom/stripe/android/link/serialization/PopupPayload$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iput-object p5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iput-object p6, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iput-object p7, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iput-object p8, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iput-object p9, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iput-object p10, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iput-object p11, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iput-boolean p12, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iput-object p13, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    move-object/from16 p2, p14

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    move-object/from16 p2, p15

    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_1

    .line 61
    const-string p2, "mobile_pay"

    goto :goto_0

    :cond_1
    move-object/from16 p2, p16

    .line 16
    :goto_0
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_2

    .line 64
    const-string p2, "mobile"

    goto :goto_1

    :cond_2
    move-object/from16 p2, p17

    .line 16
    :goto_1
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_3

    .line 68
    sget-object p2, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    invoke-virtual {p2}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->getSessionId()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "mobile_session_id"

    invoke-static {p3, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    .line 67
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p2

    goto :goto_2

    :cond_3
    move-object/from16 p2, p18

    .line 16
    :goto_2
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_4

    .line 72
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    .line 16
    :goto_3
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-void

    :cond_4
    move-object/from16 p1, p19

    goto :goto_3
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "publishableKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantInfo"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerInfo"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentUserAgent"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentObject"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentMode"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flags"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkFundingSources"

    invoke-static {p14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    .line 27
    iput-object p4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    .line 30
    iput-object p5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    .line 33
    iput-object p6, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    .line 36
    iput-object p7, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    .line 39
    iput-object p8, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    .line 42
    iput-object p9, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    .line 45
    iput-object p10, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    .line 48
    iput-boolean p11, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    .line 51
    iput-object p12, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    .line 54
    iput-object p13, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    .line 57
    iput-object p14, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    .line 61
    const-string p1, "mobile_pay"

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    .line 64
    const-string p1, "mobile"

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    .line 68
    sget-object p1, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->getSessionId()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "mobile_session_id"

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 67
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    .line 72
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-void
.end method

.method private static final PopupPayloadJson$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 125
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonBuilder;->setEncodeDefaults(Z)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 16
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static final synthetic access$getPopupPayloadJson$cp()Lkotlinx/serialization/json/Json;
    .locals 1

    .line 16
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lkotlinx/serialization/json/Json;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/serialization/PopupPayload;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/link/serialization/PopupPayload;
    .locals 14

    move/from16 v0, p15

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    iget-object v6, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v6, p6

    :goto_5
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    iget-object v7, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v7, p7

    :goto_6
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_7

    iget-object v8, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v8, p8

    :goto_7
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_8

    iget-object v9, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v9, p9

    :goto_8
    and-int/lit16 v10, v0, 0x200

    if-eqz v10, :cond_9

    iget-object v10, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v10, p10

    :goto_9
    and-int/lit16 v11, v0, 0x400

    if-eqz v11, :cond_a

    iget-boolean v11, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    goto :goto_a

    :cond_a
    move/from16 v11, p11

    :goto_a
    and-int/lit16 v12, v0, 0x800

    if-eqz v12, :cond_b

    iget-object v12, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    goto :goto_b

    :cond_b
    move-object/from16 v12, p12

    :goto_b
    and-int/lit16 v13, v0, 0x1000

    if-eqz v13, :cond_c

    iget-object v13, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    goto :goto_c

    :cond_c
    move-object/from16 v13, p13

    :goto_c
    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_d

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    move-object/from16 p15, v0

    goto :goto_d

    :cond_d
    move-object/from16 p15, p14

    :goto_d
    move-object p1, p0

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v10

    move/from16 p12, v11

    move-object/from16 p13, v12

    move-object/from16 p14, v13

    invoke-virtual/range {p1 .. p15}, Lcom/stripe/android/link/serialization/PopupPayload;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;)Lcom/stripe/android/link/serialization/PopupPayload;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getAppId$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "appId"
    .end annotation

    return-void
.end method

.method public static synthetic getCardBrandChoice$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "cardBrandChoice"
    .end annotation

    return-void
.end method

.method public static synthetic getCustomerInfo$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "customerInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getExperiments$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "experiments"
    .end annotation

    return-void
.end method

.method public static synthetic getFlags$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "flags"
    .end annotation

    return-void
.end method

.method public static synthetic getIntegrationType$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "integrationType"
    .end annotation

    return-void
.end method

.method public static synthetic getIntentMode$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "intentMode"
    .end annotation

    return-void
.end method

.method public static synthetic getLinkFundingSources$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "linkFundingSources"
    .end annotation

    return-void
.end method

.method public static synthetic getLocale$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "locale"
    .end annotation

    return-void
.end method

.method public static synthetic getLoggerMetadata$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "loggerMetadata"
    .end annotation

    return-void
.end method

.method public static synthetic getMerchantInfo$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "merchantInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getPath$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "path"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentInfo$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "paymentInfo"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentObject$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "paymentObject"
    .end annotation

    return-void
.end method

.method public static synthetic getPaymentUserAgent$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "paymentUserAgent"
    .end annotation

    return-void
.end method

.method public static synthetic getPublishableKey$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "publishableKey"
    .end annotation

    return-void
.end method

.method public static synthetic getSetupFutureUsage$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "setupFutureUsage"
    .end annotation

    return-void
.end method

.method public static synthetic getStripeAccount$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/SerialName;
        value = "stripeAccount"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$paymentsheet_release(Lcom/stripe/android/link/serialization/PopupPayload;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 5
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 16
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/16 v1, 0xa

    iget-boolean v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;->INSTANCE:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice$$serializer;

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    const/16 v3, 0xb

    invoke-interface {p1, p2, v3, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0xc

    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0xd

    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    const/16 v1, 0xe

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    .line 61
    const-string v3, "mobile_pay"

    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_1
    const/16 v1, 0xf

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    .line 64
    const-string v3, "mobile"

    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_3
    const/16 v1, 0x10

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    .line 68
    sget-object v3, Lcom/stripe/android/core/networking/AnalyticsRequestFactory;->Companion:Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;->getSessionId()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mobile_session_id"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    .line 67
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    :goto_2
    aget-object v2, v0, v1

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_5
    const/16 v1, 0x11

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    .line 72
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v0, v0, v1

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object p0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    return v0
.end method

.method public final component12()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    return-object v0
.end method

.method public final component13()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final component14()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    return-object v0
.end method

.method public final component4()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;)Lcom/stripe/android/link/serialization/PopupPayload;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;",
            "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/link/serialization/PopupPayload;"
        }
    .end annotation

    const-string v0, "publishableKey"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "merchantInfo"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customerInfo"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appId"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentUserAgent"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentObject"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentMode"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "flags"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkFundingSources"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/link/serialization/PopupPayload;

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v15}, Lcom/stripe/android/link/serialization/PopupPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/serialization/PopupPayload;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/serialization/PopupPayload;

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    iget-object v3, p1, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    iget-object p1, p1, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    return v2

    :cond_f
    return v0
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    .line 33
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final getCardBrandChoice()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    return-object v0
.end method

.method public final getCustomerInfo()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    return-object v0
.end method

.method public final getExperiments()Ljava/util/Map;
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

    .line 71
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->experiments:Ljava/util/Map;

    return-object v0
.end method

.method public final getFlags()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    return-object v0
.end method

.method public final getIntegrationType()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->integrationType:Ljava/lang/String;

    return-object v0
.end method

.method public final getIntentMode()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    return-object v0
.end method

.method public final getLinkFundingSources()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 57
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    return-object v0
.end method

.method public final getLocale()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoggerMetadata()Ljava/util/Map;
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

    .line 66
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->loggerMetadata:Ljava/util/Map;

    return-object v0
.end method

.method public final getMerchantInfo()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    return-object v0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->path:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentInfo()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;
    .locals 1

    .line 30
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    return-object v0
.end method

.method public final getPaymentObject()Ljava/lang/String;
    .locals 1

    .line 42
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    return-object v0
.end method

.method public final getPaymentUserAgent()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    return-object v0
.end method

.method public final getPublishableKey()Ljava/lang/String;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSetupFutureUsage()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    return v0
.end method

.method public final getStripeAccount()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/link/serialization/PopupPayload;->publishableKey:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/link/serialization/PopupPayload;->stripeAccount:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/link/serialization/PopupPayload;->merchantInfo:Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;

    iget-object v4, v0, Lcom/stripe/android/link/serialization/PopupPayload;->customerInfo:Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;

    iget-object v5, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentInfo:Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;

    iget-object v6, v0, Lcom/stripe/android/link/serialization/PopupPayload;->appId:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/android/link/serialization/PopupPayload;->locale:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentUserAgent:Ljava/lang/String;

    iget-object v9, v0, Lcom/stripe/android/link/serialization/PopupPayload;->paymentObject:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/android/link/serialization/PopupPayload;->intentMode:Ljava/lang/String;

    iget-boolean v11, v0, Lcom/stripe/android/link/serialization/PopupPayload;->setupFutureUsage:Z

    iget-object v12, v0, Lcom/stripe/android/link/serialization/PopupPayload;->cardBrandChoice:Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;

    iget-object v13, v0, Lcom/stripe/android/link/serialization/PopupPayload;->flags:Ljava/util/Map;

    iget-object v14, v0, Lcom/stripe/android/link/serialization/PopupPayload;->linkFundingSources:Ljava/util/List;

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v0, "PopupPayload(publishableKey="

    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stripeAccount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", merchantInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customerInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", locale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentUserAgent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", paymentObject="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", intentMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", setupFutureUsage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cardBrandChoice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", flags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", linkFundingSources="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toUrl()Ljava/lang/String;
    .locals 3

    .line 116
    sget-object v0, Lcom/stripe/android/link/serialization/PopupPayload;->PopupPayloadJson:Lkotlinx/serialization/json/Json;

    sget-object v1, Lcom/stripe/android/link/serialization/PopupPayload;->Companion:Lcom/stripe/android/link/serialization/PopupPayload$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/link/serialization/PopupPayload$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/SerializationStrategy;

    invoke-virtual {v0, v1, p0}, Lkotlinx/serialization/json/Json;->encodeToString(Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 117
    invoke-static {v0}, Lkotlin/text/StringsKt;->encodeToByteArray(Ljava/lang/String;)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "https://checkout.link.com/#"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
