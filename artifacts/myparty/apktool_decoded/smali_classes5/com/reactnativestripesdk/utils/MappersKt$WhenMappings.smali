.class public final synthetic Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;
.super Ljava/lang/Object;
.source "Mappers.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/reactnativestripesdk/utils/MappersKt;
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

.field public static final synthetic $EnumSwitchMapping$10:[I

.field public static final synthetic $EnumSwitchMapping$11:[I

.field public static final synthetic $EnumSwitchMapping$12:[I

.field public static final synthetic $EnumSwitchMapping$13:[I

.field public static final synthetic $EnumSwitchMapping$14:[I

.field public static final synthetic $EnumSwitchMapping$15:[I

.field public static final synthetic $EnumSwitchMapping$2:[I

.field public static final synthetic $EnumSwitchMapping$3:[I

.field public static final synthetic $EnumSwitchMapping$4:[I

.field public static final synthetic $EnumSwitchMapping$5:[I

.field public static final synthetic $EnumSwitchMapping$6:[I

.field public static final synthetic $EnumSwitchMapping$7:[I

.field public static final synthetic $EnumSwitchMapping$8:[I

.field public static final synthetic $EnumSwitchMapping$9:[I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    invoke-static {}, Lcom/stripe/android/model/StripeIntent$Status;->values()[Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/stripe/android/model/StripeIntent$Status;->Succeeded:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v2}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/stripe/android/model/StripeIntent$Status;->RequiresPaymentMethod:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v3}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/stripe/android/model/StripeIntent$Status;->RequiresConfirmation:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v4}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lcom/stripe/android/model/StripeIntent$Status;->Canceled:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v5}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    const/4 v5, 0x5

    :try_start_4
    sget-object v6, Lcom/stripe/android/model/StripeIntent$Status;->Processing:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v6}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    const/4 v6, 0x6

    :try_start_5
    sget-object v7, Lcom/stripe/android/model/StripeIntent$Status;->RequiresAction:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v7}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    const/4 v7, 0x7

    :try_start_6
    sget-object v8, Lcom/stripe/android/model/StripeIntent$Status;->RequiresCapture:Lcom/stripe/android/model/StripeIntent$Status;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$Status;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->values()[Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_7
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->Automatic:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->Manual:Lcom/stripe/android/model/PaymentIntent$CaptureMethod;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$CaptureMethod;->ordinal()I

    move-result v8

    aput v2, v0, v8
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->values()[Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_9
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->Automatic:Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    :catch_9
    :try_start_a
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->Manual:Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;->ordinal()I

    move-result v8

    aput v2, v0, v8
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    :catch_a
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-static {}, Lcom/stripe/android/model/CardBrand;->values()[Lcom/stripe/android/model/CardBrand;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_b
    sget-object v8, Lcom/stripe/android/model/CardBrand;->AmericanExpress:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    :catch_b
    :try_start_c
    sget-object v8, Lcom/stripe/android/model/CardBrand;->DinersClub:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v2, v0, v8
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    :catch_c
    :try_start_d
    sget-object v8, Lcom/stripe/android/model/CardBrand;->Discover:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v3, v0, v8
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    :catch_d
    :try_start_e
    sget-object v8, Lcom/stripe/android/model/CardBrand;->JCB:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v4, v0, v8
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    :catch_e
    :try_start_f
    sget-object v8, Lcom/stripe/android/model/CardBrand;->MasterCard:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v5, v0, v8
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    :catch_f
    :try_start_10
    sget-object v8, Lcom/stripe/android/model/CardBrand;->UnionPay:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v6, v0, v8
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    :catch_10
    :try_start_11
    sget-object v8, Lcom/stripe/android/model/CardBrand;->Visa:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v8}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    :catch_11
    const/16 v8, 0x8

    :try_start_12
    sget-object v9, Lcom/stripe/android/model/CardBrand;->Unknown:Lcom/stripe/android/model/CardBrand;

    invoke-virtual {v9}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result v9

    aput v8, v0, v9
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    :catch_12
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$Type;->values()[Lcom/stripe/android/model/PaymentMethod$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_13
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->AfterpayClearpay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v1, v0, v9
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    :catch_13
    :try_start_14
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Alipay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v2, v0, v9
    :try_end_14
    .catch Ljava/lang/NoSuchFieldError; {:try_start_14 .. :try_end_14} :catch_14

    :catch_14
    :try_start_15
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->AuBecsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v3, v0, v9
    :try_end_15
    .catch Ljava/lang/NoSuchFieldError; {:try_start_15 .. :try_end_15} :catch_15

    :catch_15
    :try_start_16
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->BacsDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v4, v0, v9
    :try_end_16
    .catch Ljava/lang/NoSuchFieldError; {:try_start_16 .. :try_end_16} :catch_16

    :catch_16
    :try_start_17
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Bancontact:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v5, v0, v9
    :try_end_17
    .catch Ljava/lang/NoSuchFieldError; {:try_start_17 .. :try_end_17} :catch_17

    :catch_17
    :try_start_18
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v6, v0, v9
    :try_end_18
    .catch Ljava/lang/NoSuchFieldError; {:try_start_18 .. :try_end_18} :catch_18

    :catch_18
    :try_start_19
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->CardPresent:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v7, v0, v9
    :try_end_19
    .catch Ljava/lang/NoSuchFieldError; {:try_start_19 .. :try_end_19} :catch_19

    :catch_19
    :try_start_1a
    sget-object v9, Lcom/stripe/android/model/PaymentMethod$Type;->Eps:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v9}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v9

    aput v8, v0, v9
    :try_end_1a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1a .. :try_end_1a} :catch_1a

    :catch_1a
    const/16 v9, 0x9

    :try_start_1b
    sget-object v10, Lcom/stripe/android/model/PaymentMethod$Type;->Fpx:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v10}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v10

    aput v9, v0, v10
    :try_end_1b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1b .. :try_end_1b} :catch_1b

    :catch_1b
    const/16 v10, 0xa

    :try_start_1c
    sget-object v11, Lcom/stripe/android/model/PaymentMethod$Type;->Giropay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v11}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v11

    aput v10, v0, v11
    :try_end_1c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1c .. :try_end_1c} :catch_1c

    :catch_1c
    const/16 v11, 0xb

    :try_start_1d
    sget-object v12, Lcom/stripe/android/model/PaymentMethod$Type;->GrabPay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v12}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v12

    aput v11, v0, v12
    :try_end_1d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1d .. :try_end_1d} :catch_1d

    :catch_1d
    const/16 v12, 0xc

    :try_start_1e
    sget-object v13, Lcom/stripe/android/model/PaymentMethod$Type;->Ideal:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v13}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v13

    aput v12, v0, v13
    :try_end_1e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1e .. :try_end_1e} :catch_1e

    :catch_1e
    const/16 v13, 0xd

    :try_start_1f
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Netbanking:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    aput v13, v0, v14
    :try_end_1f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1f .. :try_end_1f} :catch_1f

    :catch_1f
    :try_start_20
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Oxxo:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0xe

    aput v15, v0, v14
    :try_end_20
    .catch Ljava/lang/NoSuchFieldError; {:try_start_20 .. :try_end_20} :catch_20

    :catch_20
    :try_start_21
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->P24:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0xf

    aput v15, v0, v14
    :try_end_21
    .catch Ljava/lang/NoSuchFieldError; {:try_start_21 .. :try_end_21} :catch_21

    :catch_21
    :try_start_22
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->SepaDebit:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x10

    aput v15, v0, v14
    :try_end_22
    .catch Ljava/lang/NoSuchFieldError; {:try_start_22 .. :try_end_22} :catch_22

    :catch_22
    :try_start_23
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Upi:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x11

    aput v15, v0, v14
    :try_end_23
    .catch Ljava/lang/NoSuchFieldError; {:try_start_23 .. :try_end_23} :catch_23

    :catch_23
    :try_start_24
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->WeChatPay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x12

    aput v15, v0, v14
    :try_end_24
    .catch Ljava/lang/NoSuchFieldError; {:try_start_24 .. :try_end_24} :catch_24

    :catch_24
    :try_start_25
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Klarna:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x13

    aput v15, v0, v14
    :try_end_25
    .catch Ljava/lang/NoSuchFieldError; {:try_start_25 .. :try_end_25} :catch_25

    :catch_25
    :try_start_26
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->USBankAccount:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x14

    aput v15, v0, v14
    :try_end_26
    .catch Ljava/lang/NoSuchFieldError; {:try_start_26 .. :try_end_26} :catch_26

    :catch_26
    :try_start_27
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->PayPal:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x15

    aput v15, v0, v14
    :try_end_27
    .catch Ljava/lang/NoSuchFieldError; {:try_start_27 .. :try_end_27} :catch_27

    :catch_27
    :try_start_28
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->Affirm:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x16

    aput v15, v0, v14
    :try_end_28
    .catch Ljava/lang/NoSuchFieldError; {:try_start_28 .. :try_end_28} :catch_28

    :catch_28
    :try_start_29
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->CashAppPay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x17

    aput v15, v0, v14
    :try_end_29
    .catch Ljava/lang/NoSuchFieldError; {:try_start_29 .. :try_end_29} :catch_29

    :catch_29
    :try_start_2a
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$Type;->RevolutPay:Lcom/stripe/android/model/PaymentMethod$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$Type;->ordinal()I

    move-result v14

    const/16 v15, 0x18

    aput v15, v0, v14
    :try_end_2a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2a .. :try_end_2a} :catch_2a

    :catch_2a
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$4:[I

    invoke-static {}, Lcom/stripe/android/model/Token$Type;->values()[Lcom/stripe/android/model/Token$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_2b
    sget-object v14, Lcom/stripe/android/model/Token$Type;->Account:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_2b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2b .. :try_end_2b} :catch_2b

    :catch_2b
    :try_start_2c
    sget-object v14, Lcom/stripe/android/model/Token$Type;->BankAccount:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_2c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2c .. :try_end_2c} :catch_2c

    :catch_2c
    :try_start_2d
    sget-object v14, Lcom/stripe/android/model/Token$Type;->Card:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v3, v0, v14
    :try_end_2d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2d .. :try_end_2d} :catch_2d

    :catch_2d
    :try_start_2e
    sget-object v14, Lcom/stripe/android/model/Token$Type;->CvcUpdate:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v4, v0, v14
    :try_end_2e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2e .. :try_end_2e} :catch_2e

    :catch_2e
    :try_start_2f
    sget-object v14, Lcom/stripe/android/model/Token$Type;->Person:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v5, v0, v14
    :try_end_2f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2f .. :try_end_2f} :catch_2f

    :catch_2f
    :try_start_30
    sget-object v14, Lcom/stripe/android/model/Token$Type;->Pii:Lcom/stripe/android/model/Token$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/Token$Type;->ordinal()I

    move-result v14

    aput v6, v0, v14
    :try_end_30
    .catch Ljava/lang/NoSuchFieldError; {:try_start_30 .. :try_end_30} :catch_30

    :catch_30
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$5:[I

    invoke-static {}, Lcom/stripe/android/model/BankAccount$Type;->values()[Lcom/stripe/android/model/BankAccount$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_31
    sget-object v14, Lcom/stripe/android/model/BankAccount$Type;->Company:Lcom/stripe/android/model/BankAccount$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Type;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_31
    .catch Ljava/lang/NoSuchFieldError; {:try_start_31 .. :try_end_31} :catch_31

    :catch_31
    :try_start_32
    sget-object v14, Lcom/stripe/android/model/BankAccount$Type;->Individual:Lcom/stripe/android/model/BankAccount$Type;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Type;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_32
    .catch Ljava/lang/NoSuchFieldError; {:try_start_32 .. :try_end_32} :catch_32

    :catch_32
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$6:[I

    invoke-static {}, Lcom/stripe/android/model/BankAccount$Status;->values()[Lcom/stripe/android/model/BankAccount$Status;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_33
    sget-object v14, Lcom/stripe/android/model/BankAccount$Status;->Errored:Lcom/stripe/android/model/BankAccount$Status;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Status;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_33
    .catch Ljava/lang/NoSuchFieldError; {:try_start_33 .. :try_end_33} :catch_33

    :catch_33
    :try_start_34
    sget-object v14, Lcom/stripe/android/model/BankAccount$Status;->New:Lcom/stripe/android/model/BankAccount$Status;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Status;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_34
    .catch Ljava/lang/NoSuchFieldError; {:try_start_34 .. :try_end_34} :catch_34

    :catch_34
    :try_start_35
    sget-object v14, Lcom/stripe/android/model/BankAccount$Status;->Validated:Lcom/stripe/android/model/BankAccount$Status;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Status;->ordinal()I

    move-result v14

    aput v3, v0, v14
    :try_end_35
    .catch Ljava/lang/NoSuchFieldError; {:try_start_35 .. :try_end_35} :catch_35

    :catch_35
    :try_start_36
    sget-object v14, Lcom/stripe/android/model/BankAccount$Status;->VerificationFailed:Lcom/stripe/android/model/BankAccount$Status;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Status;->ordinal()I

    move-result v14

    aput v4, v0, v14
    :try_end_36
    .catch Ljava/lang/NoSuchFieldError; {:try_start_36 .. :try_end_36} :catch_36

    :catch_36
    :try_start_37
    sget-object v14, Lcom/stripe/android/model/BankAccount$Status;->Verified:Lcom/stripe/android/model/BankAccount$Status;

    invoke-virtual {v14}, Lcom/stripe/android/model/BankAccount$Status;->ordinal()I

    move-result v14

    aput v5, v0, v14
    :try_end_37
    .catch Ljava/lang/NoSuchFieldError; {:try_start_37 .. :try_end_37} :catch_37

    :catch_37
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$7:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_38
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->COMPANY:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_38
    .catch Ljava/lang/NoSuchFieldError; {:try_start_38 .. :try_end_38} :catch_38

    :catch_38
    :try_start_39
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->INDIVIDUAL:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountHolderType;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_39
    .catch Ljava/lang/NoSuchFieldError; {:try_start_39 .. :try_end_39} :catch_39

    :catch_39
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$8:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->values()[Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3a
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->CHECKING:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_3a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3a .. :try_end_3a} :catch_3a

    :catch_3a
    :try_start_3b
    sget-object v14, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->SAVINGS:Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;

    invoke-virtual {v14}, Lcom/stripe/android/model/PaymentMethod$USBankAccount$USBankAccountType;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_3b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3b .. :try_end_3b} :catch_3b

    :catch_3b
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$9:[I

    invoke-static {}, Lcom/stripe/android/model/MicrodepositType;->values()[Lcom/stripe/android/model/MicrodepositType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3c
    sget-object v14, Lcom/stripe/android/model/MicrodepositType;->AMOUNTS:Lcom/stripe/android/model/MicrodepositType;

    invoke-virtual {v14}, Lcom/stripe/android/model/MicrodepositType;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_3c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3c .. :try_end_3c} :catch_3c

    :catch_3c
    :try_start_3d
    sget-object v14, Lcom/stripe/android/model/MicrodepositType;->DESCRIPTOR_CODE:Lcom/stripe/android/model/MicrodepositType;

    invoke-virtual {v14}, Lcom/stripe/android/model/MicrodepositType;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_3d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3d .. :try_end_3d} :catch_3d

    :catch_3d
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$10:[I

    invoke-static {}, Lcom/stripe/android/model/StripeIntent$NextActionType;->values()[Lcom/stripe/android/model/StripeIntent$NextActionType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_3e
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->RedirectToUrl:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v1, v0, v14
    :try_end_3e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3e .. :try_end_3e} :catch_3e

    :catch_3e
    :try_start_3f
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->VerifyWithMicrodeposits:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v2, v0, v14
    :try_end_3f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3f .. :try_end_3f} :catch_3f

    :catch_3f
    :try_start_40
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayOxxoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v3, v0, v14
    :try_end_40
    .catch Ljava/lang/NoSuchFieldError; {:try_start_40 .. :try_end_40} :catch_40

    :catch_40
    :try_start_41
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->WeChatPayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v4, v0, v14
    :try_end_41
    .catch Ljava/lang/NoSuchFieldError; {:try_start_41 .. :try_end_41} :catch_41

    :catch_41
    :try_start_42
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->AlipayRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v5, v0, v14
    :try_end_42
    .catch Ljava/lang/NoSuchFieldError; {:try_start_42 .. :try_end_42} :catch_42

    :catch_42
    :try_start_43
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->CashAppRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v6, v0, v14
    :try_end_43
    .catch Ljava/lang/NoSuchFieldError; {:try_start_43 .. :try_end_43} :catch_43

    :catch_43
    :try_start_44
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->BlikAuthorize:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v7, v0, v14
    :try_end_44
    .catch Ljava/lang/NoSuchFieldError; {:try_start_44 .. :try_end_44} :catch_44

    :catch_44
    :try_start_45
    sget-object v14, Lcom/stripe/android/model/StripeIntent$NextActionType;->UseStripeSdk:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v14}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v14

    aput v8, v0, v14
    :try_end_45
    .catch Ljava/lang/NoSuchFieldError; {:try_start_45 .. :try_end_45} :catch_45

    :catch_45
    :try_start_46
    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->UpiAwaitNotification:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v8

    aput v9, v0, v8
    :try_end_46
    .catch Ljava/lang/NoSuchFieldError; {:try_start_46 .. :try_end_46} :catch_46

    :catch_46
    :try_start_47
    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayBoletoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v8

    aput v10, v0, v8
    :try_end_47
    .catch Ljava/lang/NoSuchFieldError; {:try_start_47 .. :try_end_47} :catch_47

    :catch_47
    :try_start_48
    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayKonbiniDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v8

    aput v11, v0, v8
    :try_end_48
    .catch Ljava/lang/NoSuchFieldError; {:try_start_48 .. :try_end_48} :catch_48

    :catch_48
    :try_start_49
    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->SwishRedirect:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v8

    aput v12, v0, v8
    :try_end_49
    .catch Ljava/lang/NoSuchFieldError; {:try_start_49 .. :try_end_49} :catch_49

    :catch_49
    :try_start_4a
    sget-object v8, Lcom/stripe/android/model/StripeIntent$NextActionType;->DisplayMultibancoDetails:Lcom/stripe/android/model/StripeIntent$NextActionType;

    invoke-virtual {v8}, Lcom/stripe/android/model/StripeIntent$NextActionType;->ordinal()I

    move-result v8

    aput v13, v0, v8
    :try_end_4a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4a .. :try_end_4a} :catch_4a

    :catch_4a
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$11:[I

    invoke-static {}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->values()[Lcom/stripe/android/model/PaymentIntent$Error$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_4b
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ApiConnectionError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_4b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4b .. :try_end_4b} :catch_4b

    :catch_4b
    :try_start_4c
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->AuthenticationError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v2, v0, v8
    :try_end_4c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4c .. :try_end_4c} :catch_4c

    :catch_4c
    :try_start_4d
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ApiError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v3, v0, v8
    :try_end_4d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4d .. :try_end_4d} :catch_4d

    :catch_4d
    :try_start_4e
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->CardError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v4, v0, v8
    :try_end_4e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4e .. :try_end_4e} :catch_4e

    :catch_4e
    :try_start_4f
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->IdempotencyError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v5, v0, v8
    :try_end_4f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4f .. :try_end_4f} :catch_4f

    :catch_4f
    :try_start_50
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->InvalidRequestError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v6, v0, v8
    :try_end_50
    .catch Ljava/lang/NoSuchFieldError; {:try_start_50 .. :try_end_50} :catch_50

    :catch_50
    :try_start_51
    sget-object v8, Lcom/stripe/android/model/PaymentIntent$Error$Type;->RateLimitError:Lcom/stripe/android/model/PaymentIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/PaymentIntent$Error$Type;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_51
    .catch Ljava/lang/NoSuchFieldError; {:try_start_51 .. :try_end_51} :catch_51

    :catch_51
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$12:[I

    invoke-static {}, Lcom/stripe/android/model/SetupIntent$Error$Type;->values()[Lcom/stripe/android/model/SetupIntent$Error$Type;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_52
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiConnectionError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_52
    .catch Ljava/lang/NoSuchFieldError; {:try_start_52 .. :try_end_52} :catch_52

    :catch_52
    :try_start_53
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->AuthenticationError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v2, v0, v8
    :try_end_53
    .catch Ljava/lang/NoSuchFieldError; {:try_start_53 .. :try_end_53} :catch_53

    :catch_53
    :try_start_54
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->ApiError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v3, v0, v8
    :try_end_54
    .catch Ljava/lang/NoSuchFieldError; {:try_start_54 .. :try_end_54} :catch_54

    :catch_54
    :try_start_55
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->CardError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v4, v0, v8
    :try_end_55
    .catch Ljava/lang/NoSuchFieldError; {:try_start_55 .. :try_end_55} :catch_55

    :catch_55
    :try_start_56
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->IdempotencyError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v5, v0, v8
    :try_end_56
    .catch Ljava/lang/NoSuchFieldError; {:try_start_56 .. :try_end_56} :catch_56

    :catch_56
    :try_start_57
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->InvalidRequestError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v6, v0, v8
    :try_end_57
    .catch Ljava/lang/NoSuchFieldError; {:try_start_57 .. :try_end_57} :catch_57

    :catch_57
    :try_start_58
    sget-object v8, Lcom/stripe/android/model/SetupIntent$Error$Type;->RateLimitError:Lcom/stripe/android/model/SetupIntent$Error$Type;

    invoke-virtual {v8}, Lcom/stripe/android/model/SetupIntent$Error$Type;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_58
    .catch Ljava/lang/NoSuchFieldError; {:try_start_58 .. :try_end_58} :catch_58

    :catch_58
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$13:[I

    invoke-static {}, Lcom/stripe/android/model/StripeIntent$Usage;->values()[Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_59
    sget-object v7, Lcom/stripe/android/model/StripeIntent$Usage;->OffSession:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v7}, Lcom/stripe/android/model/StripeIntent$Usage;->ordinal()I

    move-result v7

    aput v1, v0, v7
    :try_end_59
    .catch Ljava/lang/NoSuchFieldError; {:try_start_59 .. :try_end_59} :catch_59

    :catch_59
    :try_start_5a
    sget-object v7, Lcom/stripe/android/model/StripeIntent$Usage;->OnSession:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v7}, Lcom/stripe/android/model/StripeIntent$Usage;->ordinal()I

    move-result v7

    aput v2, v0, v7
    :try_end_5a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5a .. :try_end_5a} :catch_5a

    :catch_5a
    :try_start_5b
    sget-object v7, Lcom/stripe/android/model/StripeIntent$Usage;->OneTime:Lcom/stripe/android/model/StripeIntent$Usage;

    invoke-virtual {v7}, Lcom/stripe/android/model/StripeIntent$Usage;->ordinal()I

    move-result v7

    aput v3, v0, v7
    :try_end_5b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5b .. :try_end_5b} :catch_5b

    :catch_5b
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$14:[I

    invoke-static {}, Lcom/facebook/react/bridge/ReadableType;->values()[Lcom/facebook/react/bridge/ReadableType;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_5c
    sget-object v7, Lcom/facebook/react/bridge/ReadableType;->Null:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v7}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v7

    aput v1, v0, v7
    :try_end_5c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5c .. :try_end_5c} :catch_5c

    :catch_5c
    :try_start_5d
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Boolean:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_5d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5d .. :try_end_5d} :catch_5d

    :catch_5d
    :try_start_5e
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_5e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5e .. :try_end_5e} :catch_5e

    :catch_5e
    :try_start_5f
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_5f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5f .. :try_end_5f} :catch_5f

    :catch_5f
    :try_start_60
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Map:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v1

    aput v5, v0, v1
    :try_end_60
    .catch Ljava/lang/NoSuchFieldError; {:try_start_60 .. :try_end_60} :catch_60

    :catch_60
    :try_start_61
    sget-object v1, Lcom/facebook/react/bridge/ReadableType;->Array:Lcom/facebook/react/bridge/ReadableType;

    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReadableType;->ordinal()I

    move-result v1

    aput v6, v0, v1
    :try_end_61
    .catch Ljava/lang/NoSuchFieldError; {:try_start_61 .. :try_end_61} :catch_61

    :catch_61
    sput-object v0, Lcom/reactnativestripesdk/utils/MappersKt$WhenMappings;->$EnumSwitchMapping$15:[I

    return-void
.end method
