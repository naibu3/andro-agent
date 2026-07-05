.class public abstract Lcom/stripe/android/model/PaymentMethod$TypeData;
.super Ljava/lang/Object;
.source "PaymentMethod.kt"

# interfaces
.implements Lcom/stripe/android/core/model/StripeModel;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/model/PaymentMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "TypeData"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u000b\u0008\t\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/model/PaymentMethod$TypeData;",
        "Lcom/stripe/android/core/model/StripeModel;",
        "<init>",
        "()V",
        "type",
        "Lcom/stripe/android/model/PaymentMethod$Type;",
        "getType",
        "()Lcom/stripe/android/model/PaymentMethod$Type;",
        "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;",
        "Lcom/stripe/android/model/PaymentMethod$BacsDebit;",
        "Lcom/stripe/android/model/PaymentMethod$Card;",
        "Lcom/stripe/android/model/PaymentMethod$CardPresent;",
        "Lcom/stripe/android/model/PaymentMethod$Fpx;",
        "Lcom/stripe/android/model/PaymentMethod$Ideal;",
        "Lcom/stripe/android/model/PaymentMethod$Netbanking;",
        "Lcom/stripe/android/model/PaymentMethod$SepaDebit;",
        "Lcom/stripe/android/model/PaymentMethod$Sofort;",
        "Lcom/stripe/android/model/PaymentMethod$USBankAccount;",
        "Lcom/stripe/android/model/PaymentMethod$Upi;",
        "payments-core_release"
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 847
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/model/PaymentMethod$TypeData;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getType()Lcom/stripe/android/model/PaymentMethod$Type;
.end method
