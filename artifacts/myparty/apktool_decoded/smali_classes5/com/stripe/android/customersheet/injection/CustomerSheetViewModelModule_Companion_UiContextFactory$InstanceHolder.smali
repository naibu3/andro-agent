.class final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_UiContextFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_UiContextFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
