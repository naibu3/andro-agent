.class public final Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;
.super Ljava/lang/Object;
.source "FraudDetectionDataRequestFactory.kt"

# interfaces
.implements Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0008\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0012\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestFactory;",
        "fraudDetectionDataRequestParamsFactory",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;",
        "<init>",
        "(Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;)V",
        "context",
        "Landroid/content/Context;",
        "(Landroid/content/Context;)V",
        "create",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;",
        "arg",
        "Lcom/stripe/android/core/frauddetection/FraudDetectionData;",
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


# instance fields
.field private final fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v0, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;

    invoke-direct {v0, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;-><init>(Landroid/content/Context;)V

    .line 17
    invoke-direct {p0, v0}, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;-><init>(Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;)V
    .locals 1

    const-string v0, "fraudDetectionDataRequestParamsFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;->fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;
    .locals 2

    .line 22
    new-instance v0, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;

    .line 23
    iget-object v1, p0, Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataRequestFactory;->fraudDetectionDataRequestParamsFactory:Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;

    invoke-virtual {v1, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequestParamsFactory;->createParams$stripe_core_release(Lcom/stripe/android/core/frauddetection/FraudDetectionData;)Ljava/util/Map;

    move-result-object v1

    if-eqz p1, :cond_0

    .line 24
    invoke-virtual {p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionData;->getGuid()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    const-string p1, ""

    .line 22
    :cond_1
    invoke-direct {v0, v1, p1}, Lcom/stripe/android/core/frauddetection/FraudDetectionDataRequest;-><init>(Ljava/util/Map;Ljava/lang/String;)V

    return-object v0
.end method
