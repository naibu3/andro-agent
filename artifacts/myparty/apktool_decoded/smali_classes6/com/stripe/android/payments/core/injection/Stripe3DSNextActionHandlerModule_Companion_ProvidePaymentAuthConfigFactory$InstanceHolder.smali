.class final Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder;
.super Ljava/lang/Object;
.source "Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "InstanceHolder"
.end annotation


# static fields
.field static final INSTANCE:Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 43
    new-instance v0, Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory;

    invoke-direct {v0}, Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory;-><init>()V

    sput-object v0, Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory$InstanceHolder;->INSTANCE:Lcom/stripe/android/payments/core/injection/Stripe3DSNextActionHandlerModule_Companion_ProvidePaymentAuthConfigFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
