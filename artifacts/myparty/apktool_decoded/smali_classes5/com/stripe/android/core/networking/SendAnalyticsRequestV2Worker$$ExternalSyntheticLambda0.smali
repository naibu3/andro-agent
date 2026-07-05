.class public final synthetic Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 0
    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;->$r8$lambda$b6FpNSQS29e-iAEzCIjxjZgdzXo(Landroid/content/Context;)Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;

    move-result-object p1

    return-object p1
.end method
