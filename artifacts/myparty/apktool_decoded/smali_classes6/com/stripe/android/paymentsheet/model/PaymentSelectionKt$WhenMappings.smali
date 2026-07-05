.class public final synthetic Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt$WhenMappings;
.super Ljava/lang/Object;
.source "PaymentSelection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->values()[Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->Link:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v2, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->GooglePay:Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;

    invoke-virtual {v2}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved$WalletType;->ordinal()I

    move-result v2

    const/4 v3, 0x2

    aput v3, v0, v2
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->values()[Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2
    sget-object v2, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->OffSession:Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;

    invoke-virtual {v2}, Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelectionKt$WhenMappings;->$EnumSwitchMapping$1:[I

    return-void
.end method
