.class public abstract Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;
.super Ljava/lang/Object;
.source "WalletPaymentMethodMenuItem.kt"

# interfaces
.implements Lcom/stripe/android/link/ui/menu/LinkMenuItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;,
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;,
        Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B#\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000e\u0082\u0001\u0003\u0012\u0013\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;",
        "Lcom/stripe/android/link/ui/menu/LinkMenuItem;",
        "text",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "testTag",
        "",
        "isDestructive",
        "",
        "<init>",
        "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Z)V",
        "getText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getTestTag",
        "()Ljava/lang/String;",
        "()Z",
        "RemoveItem",
        "SetAsDefault",
        "Update",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$RemoveItem;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$SetAsDefault;",
        "Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem$Update;",
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
.field private final isDestructive:Z

.field private final testTag:Ljava/lang/String;

.field private final text:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->text:Lcom/stripe/android/core/strings/ResolvableString;

    .line 10
    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->testTag:Ljava/lang/String;

    .line 11
    iput-boolean p3, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->isDestructive:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    const/4 p4, 0x0

    .line 8
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;-><init>(Lcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public getTestTag()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->testTag:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public isDestructive()Z
    .locals 1

    .line 11
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuItem;->isDestructive:Z

    return v0
.end method
