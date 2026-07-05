.class final Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "DefaultErrorReporterModule_Companion_ProvideLoggerFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/core/analytics/DefaultErrorReporterModule_Companion_ProvideLoggerFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
