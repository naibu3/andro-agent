.class final Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;
.super Ljava/lang/Object;
.source "DaggerDefaultErrorReporterComponent.java"

# interfaces
.implements Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Builder"
.end annotation


# instance fields
.field private context:Landroid/content/Context;

.field private productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent-IA;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;
    .locals 4

    .line 53
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->context:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 54
    iget-object v0, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->productUsage:Ljava/util/Set;

    const-class v1, Ljava/util/Set;

    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkBuilderRequirement(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 55
    new-instance v0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;

    iget-object v1, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->productUsage:Ljava/util/Set;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$DefaultErrorReporterComponentImpl;-><init>(Landroid/content/Context;Ljava/util/Set;Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent-IA;)V

    return-object v0
.end method

.method public context(Landroid/content/Context;)Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;
    .locals 0

    .line 41
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->context:Landroid/content/Context;

    return-object p0
.end method

.method public bridge synthetic context(Landroid/content/Context;)Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
    .locals 0

    .line 34
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->context(Landroid/content/Context;)Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;

    move-result-object p1

    return-object p1
.end method

.method public productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;"
        }
    .end annotation

    .line 47
    invoke-static {p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Set;

    iput-object p1, p0, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->productUsage:Ljava/util/Set;

    return-object p0
.end method

.method public bridge synthetic productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
    .locals 0

    .line 34
    invoke-virtual {p0, p1}, Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;->productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/DaggerDefaultErrorReporterComponent$Builder;

    move-result-object p1

    return-object p1
.end method
