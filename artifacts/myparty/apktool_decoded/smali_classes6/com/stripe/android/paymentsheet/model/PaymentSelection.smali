.class public abstract Lcom/stripe/android/paymentsheet/model/PaymentSelection;
.super Ljava/lang/Object;
.source "PaymentSelection.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomerRequestedSave;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;,
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001a\u0010\u000c\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u0007\u0082\u0001\u0007\u001a\u001b\u001c\u001d\u001e\u001f \u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "hasAcknowledgedSepaMandate",
        "",
        "getHasAcknowledgedSepaMandate",
        "()Z",
        "setHasAcknowledgedSepaMandate",
        "(Z)V",
        "requiresConfirmation",
        "getRequiresConfirmation",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "merchantName",
        "",
        "isSetupFlow",
        "GooglePay",
        "Link",
        "ShopPay",
        "ExternalPaymentMethod",
        "CustomPaymentMethod",
        "Saved",
        "CustomerRequestedSave",
        "New",
        "IconLoader",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$CustomPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ExternalPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$GooglePay;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Link;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$Saved;",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$ShopPay;",
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
.field private hasAcknowledgedSepaMandate:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;-><init>()V

    return-void
.end method


# virtual methods
.method public final getHasAcknowledgedSepaMandate()Z
    .locals 1

    .line 48
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->hasAcknowledgedSepaMandate:Z

    return v0
.end method

.method public abstract getRequiresConfirmation()Z
.end method

.method public abstract mandateText(Ljava/lang/String;Z)Lcom/stripe/android/core/strings/ResolvableString;
.end method

.method public final setHasAcknowledgedSepaMandate(Z)V
    .locals 0

    .line 48
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->hasAcknowledgedSepaMandate:Z

    return-void
.end method
