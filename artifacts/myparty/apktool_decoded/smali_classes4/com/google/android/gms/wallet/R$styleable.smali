.class public final Lcom/google/android/gms/wallet/R$styleable;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static CustomWalletTheme:[I = null

.field public static CustomWalletTheme_customThemeStyle:I = 0x0

.field public static CustomWalletTheme_toolbarTextColorStyle:I = 0x1

.field public static CustomWalletTheme_windowTransitionStyle:I = 0x2

.field public static PayButtonAttributes:[I = null

.field public static PayButtonAttributes_buttonTheme:I = 0x0

.field public static PayButtonAttributes_cornerRadius:I = 0x1

.field public static WalletFragmentOptions:[I = null

.field public static WalletFragmentOptions_appTheme:I = 0x0

.field public static WalletFragmentOptions_environment:I = 0x1

.field public static WalletFragmentOptions_fragmentMode:I = 0x2

.field public static WalletFragmentOptions_fragmentStyle:I = 0x3

.field public static WalletFragmentStyle:[I = null

.field public static WalletFragmentStyle_buyButtonAppearance:I = 0x0

.field public static WalletFragmentStyle_buyButtonHeight:I = 0x1

.field public static WalletFragmentStyle_buyButtonText:I = 0x2

.field public static WalletFragmentStyle_buyButtonWidth:I = 0x3

.field public static WalletFragmentStyle_maskedWalletDetailsBackground:I = 0x4

.field public static WalletFragmentStyle_maskedWalletDetailsButtonBackground:I = 0x5

.field public static WalletFragmentStyle_maskedWalletDetailsButtonTextAppearance:I = 0x6

.field public static WalletFragmentStyle_maskedWalletDetailsHeaderTextAppearance:I = 0x7

.field public static WalletFragmentStyle_maskedWalletDetailsLogoImageType:I = 0x8

.field public static WalletFragmentStyle_maskedWalletDetailsLogoTextColor:I = 0x9

.field public static WalletFragmentStyle_maskedWalletDetailsTextAppearance:I = 0xa


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const v0, 0x7f04057d

    const v1, 0x7f0405cc

    const v2, 0x7f0401c8

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->CustomWalletTheme:[I

    const v0, 0x7f0400a8

    const v1, 0x7f040182

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->PayButtonAttributes:[I

    const v0, 0x7f040276

    const v1, 0x7f040277

    const v2, 0x7f04003c

    const v3, 0x7f04020e

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentOptions:[I

    const/16 v0, 0xb

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/android/gms/wallet/R$styleable;->WalletFragmentStyle:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0400ab
        0x7f0400ac
        0x7f0400ad
        0x7f0400ae
        0x7f04036e
        0x7f04036f
        0x7f040370
        0x7f040371
        0x7f040372
        0x7f040373
        0x7f040374
    .end array-data
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
