.class final Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 41
    new-instance v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/customersheet/injection/CustomerSheetViewModelModule_Companion_ProvidesUserFacingLoggerFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
