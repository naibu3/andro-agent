.class public interface abstract Lcom/stripe/android/customersheet/data/injection/CustomerSheetDataSourceCommonModule;
.super Ljava/lang/Object;
.source "CustomerSheetDataSourceCommonModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\'\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerSheetDataSourceCommonModule;",
        "",
        "bindsElementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "elementsSessionRepository",
        "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
        "bindsApplicationContext",
        "Landroid/content/Context;",
        "application",
        "Landroid/app/Application;",
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
.method public abstract bindsApplicationContext(Landroid/app/Application;)Landroid/content/Context;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsElementsSessionRepository(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
