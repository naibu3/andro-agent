.class public final Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent;
.super Ljava/lang/Object;
.source "DaggerCustomerSheetViewModelComponent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;,
        Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$CustomerSheetViewModelComponentImpl;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelComponent$Builder;
    .locals 2

    .line 75
    new-instance v0, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent$Builder;-><init>(Lcom/stripe/android/customersheet/injection/DaggerCustomerSheetViewModelComponent-IA;)V

    return-object v0
.end method
