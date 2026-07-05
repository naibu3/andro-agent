.class final Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;
.super Ljava/lang/Object;
.source "NewPaymentMethodTabLayoutUI.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNewPaymentMethodTabLayoutUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewPaymentMethodTabLayoutUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,150:1\n149#2:151\n*S KotlinDebug\n*F\n+ 1 NewPaymentMethodTabLayoutUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing\n*L\n29#1:151\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;",
        "",
        "<init>",
        "()V",
        "carouselInnerPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getCarouselInnerPadding-D9Ej5fM",
        "()F",
        "F",
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
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;

.field private static final carouselInnerPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 151
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 29
    sput v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;->carouselInnerPadding:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCarouselInnerPadding-D9Ej5fM()F
    .locals 1

    .line 29
    sget v0, Lcom/stripe/android/paymentsheet/ui/PaymentMethodsUISpacing;->carouselInnerPadding:F

    return v0
.end method
