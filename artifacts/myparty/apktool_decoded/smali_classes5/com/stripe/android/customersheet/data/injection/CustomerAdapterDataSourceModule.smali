.class public interface abstract Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceModule;
.super Ljava/lang/Object;
.source "CustomerAdapterDataSourceModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008a\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerAdapterDataSourceModule;",
        "",
        "bindsCustomerSheetPaymentMethodDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "impl",
        "Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;",
        "bindsCustomerSheetIntentDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "bindsCustomerSheetSavedSelectionDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "bindsCustomerSheetInitializationDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
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
.method public abstract bindsCustomerSheetInitializationDataSource(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetIntentDataSource(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetPaymentMethodDataSource(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetSavedSelectionDataSource(Lcom/stripe/android/customersheet/data/CustomerAdapterDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
