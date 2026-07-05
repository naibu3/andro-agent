.class public final Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;
.super Ljava/lang/Object;
.source "WalletButtonsInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\'\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;",
        "",
        "link2FAState",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;",
        "walletButtons",
        "",
        "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;",
        "buttonsEnabled",
        "",
        "<init>",
        "(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;Ljava/util/List;Z)V",
        "getLink2FAState",
        "()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;",
        "getWalletButtons",
        "()Ljava/util/List;",
        "getButtonsEnabled",
        "()Z",
        "hasContent",
        "getHasContent",
        "LinkOtpState",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final buttonsEnabled:Z

.field private final link2FAState:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

.field private final walletButtons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "walletButtons"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->link2FAState:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    .line 52
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->walletButtons:Ljava/util/List;

    .line 53
    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->buttonsEnabled:Z

    return-void
.end method


# virtual methods
.method public final getButtonsEnabled()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->buttonsEnabled:Z

    return v0
.end method

.method public final getHasContent()Z
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->walletButtons:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->link2FAState:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final getLink2FAState()Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->link2FAState:Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State$LinkOtpState;

    return-object v0
.end method

.method public final getWalletButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$WalletButton;",
            ">;"
        }
    .end annotation

    .line 52
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/WalletButtonsInteractor$State;->walletButtons:Ljava/util/List;

    return-object v0
.end method
