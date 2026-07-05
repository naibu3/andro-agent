.class public final Lcom/stripe/hcaptcha/config/HCaptchaConfig;
.super Ljava/lang/Object;
.source "HCaptchaConfig.kt"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;,
        Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u00088\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u0000 f2\u00020\u0001:\u0002fgB\u00e5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u001c\u0008\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u001d\u0010\u001eB\u00c7\u0001\u0008\u0010\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0008\u0010!\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008\u001d\u0010#J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0010H\u00c6\u0003J\t\u0010N\u001a\u00020\u0012H\u00c6\u0003J\t\u0010O\u001a\u00020\u0014H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001d\u0010R\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0018H\u00c6\u0003J\u0010\u0010S\u001a\u00020\u001bH\u00c6\u0003\u00a2\u0006\u0004\u0008T\u0010?J\t\u0010U\u001a\u00020\u0005H\u00c6\u0003J\u00f0\u0001\u0010V\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u001c\u0008\u0002\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00182\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\u0008W\u0010XJ\u0013\u0010Y\u001a\u00020\u00052\u0008\u0010Z\u001a\u0004\u0018\u00010[H\u00d6\u0003J\t\u0010\\\u001a\u00020 H\u00d6\u0001J\t\u0010]\u001a\u00020\u0003H\u00d6\u0001J%\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020dH\u0001\u00a2\u0006\u0002\u0008eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010\'R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010\'R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010%R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010%R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010%R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010%R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010%R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010%R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010%R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010%R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010%R0\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u00089\u0010:\u001a\u0004\u0008;\u0010<R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010@\u0012\u0004\u0008=\u0010:\u001a\u0004\u0008>\u0010?R\u0011\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010\'\u00a8\u0006h"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "Ljava/io/Serializable;",
        "siteKey",
        "",
        "sentry",
        "",
        "loading",
        "hideDialog",
        "rqdata",
        "jsSrc",
        "endpoint",
        "reportapi",
        "assethost",
        "imghost",
        "locale",
        "size",
        "Lcom/stripe/hcaptcha/config/HCaptchaSize;",
        "orientation",
        "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
        "theme",
        "Lcom/stripe/hcaptcha/config/HCaptchaTheme;",
        "host",
        "customTheme",
        "retryPredicate",
        "Lkotlin/Function2;",
        "Lcom/stripe/hcaptcha/HCaptchaException;",
        "tokenExpiration",
        "Lkotlin/time/Duration;",
        "disableHardwareAcceleration",
        "<init>",
        "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "seen0",
        "",
        "serializationConstructorMarker",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V",
        "getSiteKey",
        "()Ljava/lang/String;",
        "getSentry",
        "()Z",
        "getLoading",
        "getHideDialog",
        "getRqdata",
        "getJsSrc",
        "getEndpoint",
        "getReportapi",
        "getAssethost",
        "getImghost",
        "getLocale",
        "getSize",
        "()Lcom/stripe/hcaptcha/config/HCaptchaSize;",
        "getOrientation",
        "()Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
        "getTheme",
        "()Lcom/stripe/hcaptcha/config/HCaptchaTheme;",
        "getHost",
        "getCustomTheme",
        "getRetryPredicate$annotations",
        "()V",
        "getRetryPredicate",
        "()Lkotlin/jvm/functions/Function2;",
        "getTokenExpiration-UwyO8pc$annotations",
        "getTokenExpiration-UwyO8pc",
        "()J",
        "J",
        "getDisableHardwareAcceleration",
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
        "component15",
        "component16",
        "component17",
        "component18",
        "component18-UwyO8pc",
        "component19",
        "copy",
        "copy-ZIzw2bI",
        "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
        "equals",
        "other",
        "",
        "hashCode",
        "toString",
        "write$Self",
        "",
        "self",
        "output",
        "Lkotlinx/serialization/encoding/CompositeEncoder;",
        "serialDesc",
        "Lkotlinx/serialization/descriptors/SerialDescriptor;",
        "write$Self$hcaptcha_release",
        "Companion",
        "$serializer",
        "hcaptcha_release"
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

.field public static final Companion:Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;

.field private static final serialVersionUID:J = 0x571f272b4a5c8824L


# instance fields
.field private final assethost:Ljava/lang/String;

.field private final customTheme:Ljava/lang/String;

.field private final disableHardwareAcceleration:Z

.field private final endpoint:Ljava/lang/String;

.field private final hideDialog:Z

.field private final host:Ljava/lang/String;

.field private final imghost:Ljava/lang/String;

.field private final jsSrc:Ljava/lang/String;

.field private final loading:Z

.field private final locale:Ljava/lang/String;

.field private final orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

.field private final reportapi:Ljava/lang/String;

.field private final retryPredicate:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
            "Lcom/stripe/hcaptcha/HCaptchaException;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final rqdata:Ljava/lang/String;

.field private final sentry:Z

.field private final siteKey:Ljava/lang/String;

.field private final size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

.field private final theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

.field private final tokenExpiration:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->Companion:Lcom/stripe/hcaptcha/config/HCaptchaConfig$Companion;

    const/16 v0, 0x12

    .line 125
    new-array v0, v0, [Lkotlinx/serialization/KSerializer;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v2, Lcom/stripe/hcaptcha/config/HCaptchaSize;->Companion:Lcom/stripe/hcaptcha/config/HCaptchaSize$Companion;

    invoke-virtual {v2}, Lcom/stripe/hcaptcha/config/HCaptchaSize$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/16 v3, 0xb

    aput-object v2, v0, v3

    sget-object v2, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->Companion:Lcom/stripe/hcaptcha/config/HCaptchaOrientation$Companion;

    invoke-virtual {v2}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/16 v3, 0xc

    aput-object v2, v0, v3

    sget-object v2, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->Companion:Lcom/stripe/hcaptcha/config/HCaptchaTheme$Companion;

    invoke-virtual {v2}, Lcom/stripe/hcaptcha/config/HCaptchaTheme$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    const/16 v3, 0xd

    aput-object v2, v0, v3

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const/16 v2, 0x11

    aput-object v1, v0, v2

    sput-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-void
.end method

.method private synthetic constructor <init>(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    and-int/lit8 v0, p1, 0x1

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    .line 16
    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->INSTANCE:Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;

    invoke-virtual {v0}, Lcom/stripe/hcaptcha/config/HCaptchaConfig$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    goto :goto_0

    :cond_1
    iput-boolean p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    goto :goto_1

    :cond_2
    iput-boolean p4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    goto :goto_2

    :cond_3
    iput-boolean p5, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    :goto_2
    and-int/lit8 p2, p1, 0x10

    const/4 p3, 0x0

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    .line 50
    const-string p2, "https://js.hcaptcha.com/1/api.js"

    .line 16
    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    goto :goto_7

    :cond_8
    iput-object p10, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iput-object p11, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    .line 80
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p2

    .line 16
    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    goto :goto_9

    :cond_a
    iput-object p12, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    :goto_9
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    .line 85
    sget-object p2, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    .line 16
    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    goto :goto_a

    :cond_b
    iput-object p13, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    :goto_a
    and-int/lit16 p2, p1, 0x1000

    if-nez p2, :cond_c

    .line 90
    sget-object p2, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    goto :goto_b

    :cond_c
    move-object/from16 p2, p14

    .line 16
    :goto_b
    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    .line 95
    sget-object p2, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->LIGHT:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    goto :goto_c

    :cond_d
    move-object/from16 p2, p15

    .line 16
    :goto_c
    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    goto :goto_d

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    :goto_d
    const p2, 0x8000

    and-int/2addr p2, p1

    if-nez p2, :cond_f

    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    goto :goto_e

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    :goto_e
    iput-object p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    const/high16 p2, 0x10000

    and-int/2addr p2, p1

    if-nez p2, :cond_10

    .line 117
    sget-object p2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 p2, 0x78

    sget-object p3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p2, p3}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide p2

    goto :goto_f

    .line 16
    :cond_10
    invoke-virtual/range {p18 .. p18}, Lkotlin/time/Duration;->unbox-impl()J

    move-result-wide p2

    :goto_f
    iput-wide p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    const/high16 p2, 0x20000

    and-int/2addr p1, p2

    if-nez p1, :cond_11

    iput-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    return-void

    :cond_11
    move/from16 p1, p19

    iput-boolean p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p20}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/hcaptcha/config/HCaptchaSize;",
            "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
            "Lcom/stripe/hcaptcha/config/HCaptchaTheme;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
            "-",
            "Lcom/stripe/hcaptcha/HCaptchaException;",
            "Ljava/lang/Boolean;",
            ">;JZ)V"
        }
    .end annotation

    move-object/from16 v0, p11

    move-object/from16 v1, p12

    move-object/from16 v2, p13

    move-object/from16 v3, p14

    const-string v4, "siteKey"

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "jsSrc"

    invoke-static {p6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "locale"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "size"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "orientation"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "theme"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    .line 28
    iput-boolean p2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    .line 33
    iput-boolean p3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    .line 39
    iput-boolean p4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    .line 44
    iput-object p5, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    .line 50
    iput-object p6, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    .line 56
    iput-object p7, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    .line 62
    iput-object p8, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    .line 68
    iput-object p9, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    .line 74
    iput-object p10, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    .line 80
    iput-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    .line 85
    iput-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    .line 90
    iput-object v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    .line 95
    iput-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    move-object/from16 p1, p15

    .line 100
    iput-object p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 105
    iput-object p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 110
    iput-object p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    move-wide/from16 p1, p18

    .line 116
    iput-wide p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    move/from16 p1, p20

    .line 122
    iput-boolean p1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 25

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v5, v2

    goto :goto_0

    :cond_0
    move/from16 v5, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    move v6, v2

    goto :goto_1

    :cond_1
    move/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    move v7, v1

    goto :goto_2

    :cond_2
    move/from16 v7, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    move-object v8, v3

    goto :goto_3

    :cond_3
    move-object/from16 v8, p5

    :goto_3
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_4

    .line 50
    const-string v1, "https://js.hcaptcha.com/1/api.js"

    move-object v9, v1

    goto :goto_4

    :cond_4
    move-object/from16 v9, p6

    :goto_4
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_5

    move-object v10, v3

    goto :goto_5

    :cond_5
    move-object/from16 v10, p7

    :goto_5
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_6

    move-object v11, v3

    goto :goto_6

    :cond_6
    move-object/from16 v11, p8

    :goto_6
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_7

    move-object v12, v3

    goto :goto_7

    :cond_7
    move-object/from16 v12, p9

    :goto_7
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_8

    move-object v13, v3

    goto :goto_8

    :cond_8
    move-object/from16 v13, p10

    :goto_8
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_9

    .line 80
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    move-object v14, v1

    goto :goto_9

    :cond_9
    move-object/from16 v14, p11

    :goto_9
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_a

    .line 85
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    move-object v15, v1

    goto :goto_a

    :cond_a
    move-object/from16 v15, p12

    :goto_a
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_b

    .line 90
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    move-object/from16 v16, v1

    goto :goto_b

    :cond_b
    move-object/from16 v16, p13

    :goto_b
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_c

    .line 95
    sget-object v1, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->LIGHT:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    move-object/from16 v17, v1

    goto :goto_c

    :cond_c
    move-object/from16 v17, p14

    :goto_c
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_d

    move-object/from16 v18, v3

    goto :goto_d

    :cond_d
    move-object/from16 v18, p15

    :goto_d
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v19, v3

    goto :goto_e

    :cond_e
    move-object/from16 v19, p16

    :goto_e
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v20, v3

    goto :goto_f

    :cond_f
    move-object/from16 v20, p17

    :goto_f
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    .line 117
    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v1, 0x78

    sget-object v3, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v1, v3}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v3

    move-wide/from16 v21, v3

    goto :goto_10

    :cond_10
    move-wide/from16 v21, p18

    :goto_10
    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    if-eqz v0, :cond_11

    move/from16 v23, v2

    goto :goto_11

    :cond_11
    move/from16 v23, p20

    :goto_11
    const/16 v24, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    .line 18
    invoke-direct/range {v3 .. v24}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p20}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)V

    return-void
.end method

.method public static final synthetic access$get$childSerializers$cp()[Lkotlinx/serialization/KSerializer;
    .locals 1

    .line 16
    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    return-object v0
.end method

.method public static synthetic copy-ZIzw2bI$default(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZILjava/lang/Object;)Lcom/stripe/hcaptcha/config/HCaptchaConfig;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-boolean v3, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-boolean v4, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-object v1, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    goto :goto_10

    :cond_10
    move-object/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move-object/from16 p4, v1

    move-object/from16 p3, v2

    if-eqz v16, :cond_11

    iget-wide v1, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    goto :goto_11

    :cond_11
    move-wide/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    if-eqz v16, :cond_12

    move-wide/from16 p5, v1

    iget-boolean v1, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    move-wide/from16 p19, p5

    move/from16 p21, v1

    goto :goto_12

    :cond_12
    move/from16 p21, p20

    move-wide/from16 p19, v1

    :goto_12
    move-object/from16 p17, p2

    move-object/from16 p16, p3

    move-object/from16 p18, p4

    move/from16 p3, v3

    move/from16 p4, v4

    move/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p21}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->copy-ZIzw2bI(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getRetryPredicate$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/Transient;
    .end annotation

    return-void
.end method

.method public static synthetic getTokenExpiration-UwyO8pc$annotations()V
    .locals 0
    .annotation runtime Lkotlinx/serialization/Serializable;
        with = Lcom/stripe/hcaptcha/encode/DurationSerializer;
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$hcaptcha_release(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V
    .locals 6
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 16
    sget-object v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->$childSerializers:[Lkotlinx/serialization/KSerializer;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    if-eq v2, v1, :cond_1

    :goto_0
    iget-boolean v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    invoke-interface {p1, p2, v1, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_1
    const/4 v2, 0x2

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    iget-boolean v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    if-eq v3, v1, :cond_3

    :goto_1
    iget-boolean v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_3
    const/4 v2, 0x3

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    if-eqz v3, :cond_5

    :goto_2
    iget-boolean v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_5
    const/4 v2, 0x4

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_3

    :cond_6
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    if-eqz v3, :cond_7

    :goto_3
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_7
    const/4 v2, 0x5

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_4

    :cond_8
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    .line 50
    const-string v4, "https://js.hcaptcha.com/1/api.js"

    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :goto_4
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_9
    const/4 v2, 0x6

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_5

    :cond_a
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    if-eqz v3, :cond_b

    :goto_5
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_b
    const/4 v2, 0x7

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_c

    goto :goto_6

    :cond_c
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    if-eqz v3, :cond_d

    :goto_6
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_d
    const/16 v2, 0x8

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_7

    :cond_e
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    if-eqz v3, :cond_f

    :goto_7
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_f
    const/16 v2, 0x9

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_8

    :cond_10
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    if-eqz v3, :cond_11

    :goto_8
    sget-object v3, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_11
    const/16 v2, 0xa

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_9

    :cond_12
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    .line 80
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    .line 16
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :goto_9
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeStringElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILjava/lang/String;)V

    :cond_13
    const/16 v2, 0xb

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_14

    goto :goto_a

    :cond_14
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    .line 85
    sget-object v4, Lcom/stripe/hcaptcha/config/HCaptchaSize;->INVISIBLE:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-eq v3, v4, :cond_15

    .line 16
    :goto_a
    aget-object v3, v0, v2

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_15
    const/16 v2, 0xc

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_b

    :cond_16
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    .line 90
    sget-object v4, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->PORTRAIT:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    if-eq v3, v4, :cond_17

    .line 16
    :goto_b
    aget-object v3, v0, v2

    check-cast v3, Lkotlinx/serialization/SerializationStrategy;

    iget-object v4, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-interface {p1, p2, v2, v3, v4}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_17
    const/16 v2, 0xd

    invoke-interface {p1, p2, v2}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_c

    :cond_18
    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    .line 95
    sget-object v4, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->LIGHT:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    if-eq v3, v4, :cond_19

    .line 16
    :goto_c
    aget-object v0, v0, v2

    check-cast v0, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    invoke-interface {p1, p2, v2, v0, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    if-eqz v2, :cond_1b

    :goto_d
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1b
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    if-eqz v2, :cond_1d

    :goto_e
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-object v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeNullableSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_f

    :cond_1e
    iget-wide v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    .line 117
    sget-object v4, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v4, 0x78

    sget-object v5, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, v5}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v4

    .line 16
    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v2

    if-nez v2, :cond_1f

    :goto_f
    sget-object v2, Lcom/stripe/hcaptcha/encode/DurationSerializer;->INSTANCE:Lcom/stripe/hcaptcha/encode/DurationSerializer;

    check-cast v2, Lkotlinx/serialization/SerializationStrategy;

    iget-wide v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    invoke-static {v3, v4}, Lkotlin/time/Duration;->box-impl(J)Lkotlin/time/Duration;

    move-result-object v3

    invoke-interface {p1, p2, v0, v2, v3}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeSerializableElement(Lkotlinx/serialization/descriptors/SerialDescriptor;ILkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)V

    :cond_1f
    const/16 v0, 0x11

    invoke-interface {p1, p2, v0}, Lkotlinx/serialization/encoding/CompositeEncoder;->shouldEncodeElementDefault(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_10

    :cond_20
    iget-boolean v2, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    if-eq v2, v1, :cond_21

    :goto_10
    iget-boolean p0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    invoke-interface {p1, p2, v0, p0}, Lkotlinx/serialization/encoding/CompositeEncoder;->encodeBooleanElement(Lkotlinx/serialization/descriptors/SerialDescriptor;IZ)V

    :cond_21
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final component12()Lcom/stripe/hcaptcha/config/HCaptchaSize;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    return-object v0
.end method

.method public final component13()Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    return-object v0
.end method

.method public final component14()Lcom/stripe/hcaptcha/config/HCaptchaTheme;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    return-object v0
.end method

.method public final component17()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
            "Lcom/stripe/hcaptcha/HCaptchaException;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final component18-UwyO8pc()J
    .locals 2

    iget-wide v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    return-wide v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    return-object v0
.end method

.method public final copy-ZIzw2bI(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZ)Lcom/stripe/hcaptcha/config/HCaptchaConfig;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "ZZZ",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/hcaptcha/config/HCaptchaSize;",
            "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;",
            "Lcom/stripe/hcaptcha/config/HCaptchaTheme;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
            "-",
            "Lcom/stripe/hcaptcha/HCaptchaException;",
            "Ljava/lang/Boolean;",
            ">;JZ)",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;"
        }
    .end annotation

    const-string v0, "siteKey"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jsSrc"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "size"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "orientation"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    const/16 v22, 0x0

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-wide/from16 v19, p18

    move/from16 v21, p20

    invoke-direct/range {v1 .. v22}, Lcom/stripe/hcaptcha/config/HCaptchaConfig;-><init>(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    iget-boolean v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    iget-boolean v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    iget-boolean v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    if-eq v1, v3, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    iget-object v3, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    return v2

    :cond_12
    iget-wide v3, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    iget-wide v5, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    invoke-static {v3, v4, v5, v6}, Lkotlin/time/Duration;->equals-impl0(JJ)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    iget-boolean p1, p1, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    if-eq v1, p1, :cond_14

    return v2

    :cond_14
    return v0
.end method

.method public final getAssethost()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    return-object v0
.end method

.method public final getCustomTheme()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisableHardwareAcceleration()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    return v0
.end method

.method public final getEndpoint()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    return-object v0
.end method

.method public final getHideDialog()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    return v0
.end method

.method public final getHost()Ljava/lang/String;
    .locals 1

    .line 100
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    return-object v0
.end method

.method public final getImghost()Ljava/lang/String;
    .locals 1

    .line 74
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    return-object v0
.end method

.method public final getJsSrc()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    return-object v0
.end method

.method public final getLoading()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    return v0
.end method

.method public final getLocale()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    return-object v0
.end method

.method public final getOrientation()Lcom/stripe/hcaptcha/config/HCaptchaOrientation;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    return-object v0
.end method

.method public final getReportapi()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    return-object v0
.end method

.method public final getRetryPredicate()Lkotlin/jvm/functions/Function2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/stripe/hcaptcha/config/HCaptchaConfig;",
            "Lcom/stripe/hcaptcha/HCaptchaException;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 110
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    return-object v0
.end method

.method public final getRqdata()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    return-object v0
.end method

.method public final getSentry()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    return v0
.end method

.method public final getSiteKey()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    return-object v0
.end method

.method public final getSize()Lcom/stripe/hcaptcha/config/HCaptchaSize;
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    return-object v0
.end method

.method public final getTheme()Lcom/stripe/hcaptcha/config/HCaptchaTheme;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    return-object v0
.end method

.method public final getTokenExpiration-UwyO8pc()J
    .locals 2

    .line 116
    iget-wide v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

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

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaSize;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaOrientation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    invoke-virtual {v1}, Lcom/stripe/hcaptcha/config/HCaptchaTheme;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    invoke-static {v1, v2}, Lkotlin/time/Duration;->hashCode-impl(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->siteKey:Ljava/lang/String;

    iget-boolean v2, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->sentry:Z

    iget-boolean v3, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->loading:Z

    iget-boolean v4, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->hideDialog:Z

    iget-object v5, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->rqdata:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->jsSrc:Ljava/lang/String;

    iget-object v7, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->endpoint:Ljava/lang/String;

    iget-object v8, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->reportapi:Ljava/lang/String;

    iget-object v9, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->assethost:Ljava/lang/String;

    iget-object v10, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->imghost:Ljava/lang/String;

    iget-object v11, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->locale:Ljava/lang/String;

    iget-object v12, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->size:Lcom/stripe/hcaptcha/config/HCaptchaSize;

    iget-object v13, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->orientation:Lcom/stripe/hcaptcha/config/HCaptchaOrientation;

    iget-object v14, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->theme:Lcom/stripe/hcaptcha/config/HCaptchaTheme;

    iget-object v15, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->host:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->customTheme:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->retryPredicate:Lkotlin/jvm/functions/Function2;

    move-object/from16 v18, v14

    move-object/from16 v19, v15

    iget-wide v14, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->tokenExpiration:J

    invoke-static {v14, v15}, Lkotlin/time/Duration;->toString-impl(J)Ljava/lang/String;

    move-result-object v14

    iget-boolean v15, v0, Lcom/stripe/hcaptcha/config/HCaptchaConfig;->disableHardwareAcceleration:Z

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v20, v15

    const-string v15, "HCaptchaConfig(siteKey="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sentry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", loading="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", hideDialog="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rqdata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", jsSrc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endpoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportapi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", assethost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", imghost="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", locale="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", orientation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", theme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", host="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customTheme="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", retryPredicate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tokenExpiration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disableHardwareAcceleration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
