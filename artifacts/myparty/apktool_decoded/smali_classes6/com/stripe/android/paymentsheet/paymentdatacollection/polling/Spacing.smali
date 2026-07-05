.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;
.super Ljava/lang/Object;
.source "PollingScreen.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPollingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,266:1\n149#2:267\n149#2:268\n*S KotlinDebug\n*F\n+ 1 PollingScreen.kt\ncom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing\n*L\n47#1:267\n48#1:268\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\u0008\u00c2\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005\u00a2\u0006\n\n\u0002\u0010\u0008\u001a\u0004\u0008\n\u0010\u0007R\u000e\u0010\u000b\u001a\u00020\u000cX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;",
        "",
        "<init>",
        "()V",
        "extended",
        "Landroidx/compose/ui/unit/Dp;",
        "getExtended-D9Ej5fM",
        "()F",
        "F",
        "normal",
        "getNormal-D9Ej5fM",
        "lineHeightMultiplier",
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
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

.field private static final extended:F

.field public static final lineHeightMultiplier:F = 1.3f

.field private static final normal:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->INSTANCE:Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;

    const/16 v0, 0xc

    int-to-float v0, v0

    .line 267
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 47
    sput v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->extended:F

    const/16 v0, 0x8

    int-to-float v0, v0

    .line 268
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 48
    sput v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->normal:F

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getExtended-D9Ej5fM()F
    .locals 1

    .line 47
    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->extended:F

    return v0
.end method

.method public final getNormal-D9Ej5fM()F
    .locals 1

    .line 48
    sget v0, Lcom/stripe/android/paymentsheet/paymentdatacollection/polling/Spacing;->normal:F

    return v0
.end method
