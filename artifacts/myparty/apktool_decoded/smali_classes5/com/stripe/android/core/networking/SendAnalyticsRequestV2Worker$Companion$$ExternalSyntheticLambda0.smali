.class public final synthetic Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;


# direct methods
.method public synthetic constructor <init>(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion$$ExternalSyntheticLambda0;->f$0:Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    check-cast p1, Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;->$r8$lambda$DWxaXYZvw00By3TqotHEwgg5hQs(Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;Landroid/content/Context;)Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;

    move-result-object p1

    return-object p1
.end method
