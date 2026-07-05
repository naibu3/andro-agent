.class public interface abstract Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;
.super Ljava/lang/Object;
.source "CustomerSessionDataSourceModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008a\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0008H\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH\'J\u0010\u0010\u000c\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0011H\'\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;",
        "",
        "bindsCustomerSheetPaymentMethodDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;",
        "impl",
        "Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;",
        "bindsCustomerSheetIntentDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;",
        "bindsCustomerSheetSavedSelectionDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;",
        "bindsCustomerSheetInitializationDataSource",
        "Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;",
        "Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;",
        "bindsCustomerSessionElementsSessionManager",
        "Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;",
        "Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;",
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
.field public static final Companion:Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;->$$INSTANCE:Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;

    sput-object v0, Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule;->Companion:Lcom/stripe/android/customersheet/data/injection/CustomerSessionDataSourceModule$Companion;

    return-void
.end method


# virtual methods
.method public abstract bindsCustomerSessionElementsSessionManager(Lcom/stripe/android/customersheet/data/DefaultCustomerSessionElementsSessionManager;)Lcom/stripe/android/customersheet/data/CustomerSessionElementsSessionManager;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetInitializationDataSource(Lcom/stripe/android/customersheet/data/CustomerSessionInitializationDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetInitializationDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetIntentDataSource(Lcom/stripe/android/customersheet/data/CustomerSessionIntentDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetIntentDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetPaymentMethodDataSource(Lcom/stripe/android/customersheet/data/CustomerSessionPaymentMethodDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetPaymentMethodDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method

.method public abstract bindsCustomerSheetSavedSelectionDataSource(Lcom/stripe/android/customersheet/data/CustomerSessionSavedSelectionDataSource;)Lcom/stripe/android/customersheet/data/CustomerSheetSavedSelectionDataSource;
    .annotation runtime Ldagger/Binds;
    .end annotation
.end method
