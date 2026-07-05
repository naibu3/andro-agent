.class public interface abstract Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;
.super Ljava/lang/Object;
.source "CustomerSessionDataSourceComponent.kt"


# annotations
.annotation runtime Ldagger/Component;
    modules = {
        Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;,
        Lcom/stripe/android/customersheet/data/injection/CustomerSheetDataSourceCommonModule;,
        Lcom/stripe/android/customersheet/injection/CustomerSheetDataCommonModule;,
        Lcom/stripe/android/payments/core/injection/StripeRepositoryModule;,
        Lcom/stripe/android/core/injection/CoroutineContextModule;,
        Lcom/stripe/android/core/injection/CoreCommonModule;,
        Lcom/stripe/android/common/di/ApplicationIdModule;,
        Lcom/stripe/android/common/di/MobileSessionIdModule;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent$Builder;
    }
.end annotation

.annotation runtime Ljavax/inject/Singleton;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008a\u0018\u00002\u00020\u0001:\u0001\u0012R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceComponent;",
        "",
        "customerSheetPaymentMethodDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "getCustomerSheetPaymentMethodDataSource",
        "()Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "customerSheetSavedSelectionDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "getCustomerSheetSavedSelectionDataSource",
        "()Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "customerSheetIntentDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "getCustomerSheetIntentDataSource",
        "()Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "customerSheetInitializationDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
        "getCustomerSheetInitializationDataSource",
        "()Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
        "Builder",
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
.method public abstract getCustomerSheetInitializationDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;
.end method

.method public abstract getCustomerSheetIntentDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;
.end method

.method public abstract getCustomerSheetPaymentMethodDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;
.end method

.method public abstract getCustomerSheetSavedSelectionDataSource()Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;
.end method
