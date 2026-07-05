.class public interface abstract Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000fH\'\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;",
        "",
        "bindsCustomerSheetEventReporter",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
        "impl",
        "Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;",
        "bindsCustomerSheetLoader",
        "Lcom/stripe/android/customersheet/CustomerSheetLoader;",
        "Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;",
        "bindsAnalyticsRequestFactory",
        "Lcom/stripe/android/core/networking/AnalyticsRequestFactory;",
        "paymentAnalyticsRequestFactory",
        "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;",
        "bindsStripeIntentRepository",
        "Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;",
        "Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    sput-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule;->Companion:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsAnalyticsRequestFactory(Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;)Lcom/stripe/android/core/networking/AnalyticsRequestFactory;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetEventReporter(Lcom/stripe/android/customersheet/analytics/DefaultCustomerSheetEventReporter;)Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetLoader(Lcom/stripe/android/customersheet/DefaultCustomerSheetLoader;)Lcom/stripe/android/customersheet/CustomerSheetLoader;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsStripeIntentRepository(Lcom/stripe/android/paymentsheet/repositories/RealElementsSessionRepository;)Lcom/stripe/android/paymentsheet/repositories/ElementsSessionRepository;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
