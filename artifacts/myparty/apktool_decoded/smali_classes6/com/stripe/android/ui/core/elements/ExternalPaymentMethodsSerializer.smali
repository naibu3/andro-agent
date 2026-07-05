.class public final Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;
.super Ljava/lang/Object;
.source "ExternalPaymentMethodsSerializer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;",
        "",
        "<init>",
        "()V",
        "format",
        "Lkotlinx/serialization/json/Json;",
        "deserializeList",
        "Lkotlin/Result;",
        "",
        "Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;",
        "str",
        "",
        "deserializeList-IoAF18A",
        "(Ljava/lang/String;)Ljava/lang/Object;",
        "payments-ui-core_release"
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

.field public static final INSTANCE:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;

.field private static final format:Lkotlinx/serialization/json/Json;


# direct methods
.method public static synthetic $r8$lambda$s-4ix61Rq_VHjZACF3D459xISKM(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;->format$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;-><init>()V

    sput-object v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;->INSTANCE:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;

    .line 11
    new-instance v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer$$ExternalSyntheticLambda0;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lkotlinx/serialization/json/JsonKt;->Json$default(Lkotlinx/serialization/json/Json;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lkotlinx/serialization/json/Json;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;->format:Lkotlinx/serialization/json/Json;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final format$lambda$0(Lkotlinx/serialization/json/JsonBuilder;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$Json"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Lkotlinx/serialization/json/JsonBuilder;->setIgnoreUnknownKeys(Z)V

    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final deserializeList-IoAF18A(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    const-string v0, "str"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;

    .line 18
    sget-object v0, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodsSerializer;->format:Lkotlinx/serialization/json/Json;

    new-instance v1, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v2, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec;->Companion:Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/ui/core/elements/ExternalPaymentMethodSpec$Companion;->serializer()Lkotlinx/serialization/KSerializer;

    move-result-object v2

    invoke-direct {v1, v2}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lkotlinx/serialization/KSerializer;)V

    check-cast v1, Lkotlinx/serialization/DeserializationStrategy;

    invoke-virtual {v0, v1, p1}, Lkotlinx/serialization/json/Json;->decodeFromString(Lkotlinx/serialization/DeserializationStrategy;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    .line 17
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
