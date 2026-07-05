.class final Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "FlowControllerModule_ProvideProductUsageTokensFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    new-instance v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/paymentsheet/flowcontroller/FlowControllerModule_ProvideProductUsageTokensFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
