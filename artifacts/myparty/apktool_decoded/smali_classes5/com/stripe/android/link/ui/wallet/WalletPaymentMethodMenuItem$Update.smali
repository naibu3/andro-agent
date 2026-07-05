.class public final Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;
.super Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.source "WalletPaymentMethodMenuItem.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Update"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u0008\u001a\u00020\tH\u00d6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;",
        "<init>",
        "()V",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;

    invoke-direct {v0}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;-><init>()V

    sput-object v0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;->INSTANCE:Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;

    return-void
.end method

.method private constructor <init>()V
    .locals 7

    .line 27
    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_link_wallet_menu_action_update_card:I

    invoke-static {v0}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->getResolvableString(I)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    .line 26
    const-string v3, "WALLET_MENU_UPDATE_TAG"

    const/4 v4, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;

    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x12c21c2d

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Update"

    return-object v0
.end method
