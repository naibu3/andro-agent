.class public interface abstract Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
.super Ljava/lang/Object;
.source "ErrorReporter.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0018\u0010\u0004\u001a\u00020\u00002\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0008\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;",
        "",
        "context",
        "Landroid/content/Context;",
        "productUsage",
        "",
        "",
        "build",
        "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract build()Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent;
.end method

.method public abstract context(Landroid/content/Context;)Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract productUsage(Ljava/util/Set;)Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;
    .param p1    # Ljava/util/Set;
        .annotation runtime Ljavax/inject/Named;
            value = "productUsage"
        .end annotation
    .end param
    .annotation runtime Ldagger/BindsInstance;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterComponent$Builder;"
        }
    .end annotation
.end method
