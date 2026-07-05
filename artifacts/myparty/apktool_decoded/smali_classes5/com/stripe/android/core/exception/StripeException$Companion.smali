.class public final Lcom/stripe/android/core/exception/StripeException$Companion;
.super Ljava/lang/Object;
.source "StripeException.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/core/exception/StripeException;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0008\u001a\u00020\tH\u0002R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/core/exception/StripeException$Companion;",
        "",
        "<init>",
        "()V",
        "DEFAULT_STATUS_CODE",
        "",
        "create",
        "Lcom/stripe/android/core/exception/StripeException;",
        "throwable",
        "",
        "analyticsValueForThrowable",
        "",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/core/exception/StripeException$Companion;-><init>()V

    return-void
.end method

.method private final analyticsValueForThrowable(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 6

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "android."

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static {v0, v2, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "java."

    invoke-static {v0, v1, v3, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v5

    .line 73
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final create(Ljava/lang/Throwable;)Lcom/stripe/android/core/exception/StripeException;
    .locals 9

    const-string v0, "throwable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    instance-of v0, p1, Lcom/stripe/android/core/exception/StripeException;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/stripe/android/core/exception/StripeException;

    return-object p1

    .line 60
    :cond_0
    instance-of v0, p1, Lorg/json/JSONException;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/stripe/android/core/exception/APIException;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/exception/APIException;-><init>(Ljava/lang/Throwable;)V

    check-cast v0, Lcom/stripe/android/core/exception/StripeException;

    return-object v0

    .line 61
    :cond_1
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_2

    sget-object v0, Lcom/stripe/android/core/exception/APIConnectionException;->Companion:Lcom/stripe/android/core/exception/APIConnectionException$Companion;

    check-cast p1, Ljava/io/IOException;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/stripe/android/core/exception/APIConnectionException$Companion;->create$default(Lcom/stripe/android/core/exception/APIConnectionException$Companion;Ljava/io/IOException;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/core/exception/APIConnectionException;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/core/exception/StripeException;

    return-object p1

    .line 62
    :cond_2
    instance-of v0, p1, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_3

    new-instance v1, Lcom/stripe/android/core/exception/InvalidRequestException;

    .line 63
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, p1

    .line 62
    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/core/exception/InvalidRequestException;-><init>(Lcom/stripe/android/core/StripeError;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/core/exception/StripeException;

    return-object v1

    :cond_3
    move-object v6, p1

    .line 66
    new-instance p1, Lcom/stripe/android/core/exception/GenericStripeException;

    invoke-direct {p0, v6}, Lcom/stripe/android/core/exception/StripeException$Companion;->analyticsValueForThrowable(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v6, v0}, Lcom/stripe/android/core/exception/GenericStripeException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    check-cast p1, Lcom/stripe/android/core/exception/StripeException;

    return-object p1
.end method
