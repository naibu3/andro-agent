.class final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;
.super Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
.source "EmbeddedPaymentElement.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Default"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
        "<init>",
        "()V",
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
.field public static final INSTANCE:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;->INSTANCE:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Default;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 636
    invoke-direct {p0}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;-><init>()V

    return-void
.end method
