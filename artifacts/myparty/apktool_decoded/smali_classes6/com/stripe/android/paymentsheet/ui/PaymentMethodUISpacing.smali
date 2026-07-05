.class final Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;
.super Ljava/lang/Object;
.source "NewPaymentMethodTab.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNewPaymentMethodTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,80:1\n149#2:81\n149#2:82\n*S KotlinDebug\n*F\n+ 1 NewPaymentMethodTab.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing\n*L\n20#1:81\n21#1:82\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;",
        "",
        "<init>",
        "()V",
        "cardPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getCardPadding-D9Ej5fM",
        "()F",
        "F",
        "iconSize",
        "getIconSize-D9Ej5fM",
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
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

.field private static final cardPadding:F

.field private static final iconSize:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 81
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 20
    sput v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->cardPadding:F

    const/16 v0, 0x10

    int-to-float v0, v0

    .line 82
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 21
    sput v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->iconSize:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCardPadding-D9Ej5fM()F
    .locals 1

    .line 20
    sget v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->cardPadding:F

    return v0
.end method

.method public final getIconSize-D9Ej5fM()F
    .locals 1

    .line 21
    sget v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodUISpacing;->iconSize:F

    return v0
.end method
