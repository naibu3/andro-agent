.class public interface abstract Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
.super Ljava/lang/Object;
.source "CustomerAdapterDataSourceComponent.kt"


# annotations
.annotation runtime Ldagger/Component$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008g\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0008\u0010\u0007\u001a\u00020\u0008H&\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;",
        "",
        "application",
        "Landroid/app/Application;",
        "adapter",
        "customerAdapter",
        "Lcom/stripe/android/customersheet/CustomerAdapter;",
        "build",
        "Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent;",
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


# virtual methods
.method public abstract adapter(Lcom/stripe/android/customersheet/CustomerAdapter;)Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract application(Landroid/app/Application;)Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent$Builder;
    .annotation runtime Ldagger/BindsInstance;
    .end annotation
.end method

.method public abstract build()Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceComponent;
.end method
