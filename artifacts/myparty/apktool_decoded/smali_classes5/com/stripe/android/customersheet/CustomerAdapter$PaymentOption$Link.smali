.class public final Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;
.super Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
.source "CustomerAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Link"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;",
        "Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;",
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
.field public static final $stable:I

.field public static final INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    invoke-direct {v0}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;-><init>()V

    sput-object v0, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;->INSTANCE:Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption$Link;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 141
    const-string v0, "link"

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/customersheet/CustomerAdapter$PaymentOption;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method
