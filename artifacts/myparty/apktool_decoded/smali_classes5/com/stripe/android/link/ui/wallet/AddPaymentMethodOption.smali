.class public abstract Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;
.super Ljava/lang/Object;
.source "AddPaymentMethodOption.kt"

# interfaces
.implements Lcom/stripe/android/link/ui/menu/LinkMenuItem;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;,
        Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0002\u000f\u0010B\u0019\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u00020\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\u000e\u0082\u0001\u0002\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;",
        "Lcom/stripe/android/link/ui/menu/LinkMenuItem;",
        "testTag",
        "",
        "text",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "<init>",
        "(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;)V",
        "getTestTag",
        "()Ljava/lang/String;",
        "getText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "isDestructive",
        "",
        "()Z",
        "Bank",
        "Card",
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Bank;",
        "Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption$Card;",
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
.field private final testTag:Ljava/lang/String;

.field private final text:Lcom/stripe/android/core/strings/ResolvableString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;->testTag:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;-><init>(Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;)V

    return-void
.end method


# virtual methods
.method public getTestTag()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;->testTag:Ljava/lang/String;

    return-object v0
.end method

.method public getText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/AddPaymentMethodOption;->text:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public isDestructive()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
