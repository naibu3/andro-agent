.class public final Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;
.super Ljava/lang/Object;
.source "DisplayablePaymentMethod.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008)\u0008\u0081\u0008\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\t\u0012\n\u0008\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u0012\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010%\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010&J\u000f\u0010\'\u001a\u0004\u0018\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010(J\r\u0010)\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0007H\u00c6\u0003J\t\u0010,\u001a\u00020\tH\u00c2\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\tH\u00c2\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u000eH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\tH\u00c2\u0003\u00a2\u0006\u0002\u0010.J\u009c\u0001\u00106\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0003\u0010\u0008\u001a\u00020\t2\n\u0008\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\n\u0008\u0003\u0010\u0014\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u00107J\u0013\u00108\u001a\u00020\u000e2\u0008\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\tH\u00d6\u0001J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0018R\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010\u0018R\u0017\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010$R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001c\u00a8\u0006<"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;",
        "",
        "code",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "syntheticCode",
        "displayName",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "iconResource",
        "",
        "iconResourceNight",
        "lightThemeIconUrl",
        "darkThemeIconUrl",
        "iconRequiresTinting",
        "",
        "subtitle",
        "promoBadge",
        "onClick",
        "Lkotlin/Function0;",
        "",
        "outlinedIconResource",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V",
        "getCode",
        "()Ljava/lang/String;",
        "getSyntheticCode",
        "getDisplayName",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "Ljava/lang/Integer;",
        "getLightThemeIconUrl",
        "getDarkThemeIconUrl",
        "getIconRequiresTinting",
        "()Z",
        "getSubtitle",
        "getPromoBadge",
        "getOnClick",
        "()Lkotlin/jvm/functions/Function0;",
        "icon",
        "(Landroidx/compose/runtime/Composer;I)I",
        "iconUrl",
        "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "()Ljava/lang/Integer;",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;",
        "equals",
        "other",
        "hashCode",
        "toString",
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
.field private final code:Ljava/lang/String;

.field private final darkThemeIconUrl:Ljava/lang/String;

.field private final displayName:Lcom/stripe/android/core/strings/ResolvableString;

.field private final iconRequiresTinting:Z

.field private final iconResource:I

.field private final iconResourceNight:Ljava/lang/Integer;

.field private final lightThemeIconUrl:Ljava/lang/String;

.field private final onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final outlinedIconResource:Ljava/lang/Integer;

.field private final promoBadge:Ljava/lang/String;

.field private final subtitle:Lcom/stripe/android/core/strings/ResolvableString;

.field private final syntheticCode:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticCode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    .line 11
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    .line 12
    iput-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    .line 13
    iput p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    .line 14
    iput-object p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    .line 15
    iput-object p6, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    .line 16
    iput-object p7, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    .line 17
    iput-boolean p8, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    .line 18
    iput-object p9, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    .line 19
    iput-object p10, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    .line 20
    iput-object p11, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    .line 21
    iput-object p12, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_0

    move-object p2, p1

    :cond_0
    and-int/lit16 p14, p13, 0x100

    const/4 v0, 0x0

    if-eqz p14, :cond_1

    move-object p9, v0

    :cond_1
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_2

    move-object p10, v0

    :cond_2
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_3

    move-object p13, v0

    goto :goto_0

    :cond_3
    move-object p13, p12

    :goto_0
    move-object p12, p11

    move-object p11, p10

    move-object p10, p9

    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 9
    invoke-direct/range {p1 .. p13}, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V

    return-void
.end method

.method private final component12()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    return-object v0
.end method

.method private final component4()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    return v0
.end method

.method private final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-object p3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget p4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-boolean p8, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    return v0
.end method

.method public final component9()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "I",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;"
        }
    .end annotation

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticCode"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "displayName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;

    move-object v2, p1

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/strings/ResolvableString;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/core/strings/ResolvableString;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    iget v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    iget-boolean v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    iget-object v3, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    iget-object p1, p1, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCode()Ljava/lang/String;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    return-object v0
.end method

.method public final getDarkThemeIconUrl()Ljava/lang/String;
    .locals 1

    .line 16
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getDisplayName()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getIconRequiresTinting()Z
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    return v0
.end method

.method public final getLightThemeIconUrl()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnClick()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 20
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getPromoBadge()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubtitle()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getSyntheticCode()Ljava/lang/String;
    .locals 1

    .line 11
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    return v0
.end method

.method public final icon(Landroidx/compose/runtime/Composer;I)I
    .locals 9

    const v0, -0x5fe799d9

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.verticalmode.DisplayablePaymentMethod.icon (DisplayablePaymentMethod.kt:24)"

    .line 25
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object v3, Lcom/stripe/android/paymentsheet/ui/IconHelper;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/IconHelper;

    iget v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    const/16 v8, 0xc00

    move-object v7, p1

    invoke-virtual/range {v3 .. v8}, Lcom/stripe/android/paymentsheet/ui/IconHelper;->icon(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)I

    move-result p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return p1
.end method

.method public final iconUrl(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;
    .locals 3

    const v0, 0x1c5665b4

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.paymentsheet.verticalmode.DisplayablePaymentMethod.iconUrl (DisplayablePaymentMethod.kt:27)"

    .line 28
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object p2, Lcom/stripe/android/paymentsheet/ui/IconHelper;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/IconHelper;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    const/16 v2, 0x180

    invoke-virtual {p2, v0, v1, p1, v2}, Lcom/stripe/android/paymentsheet/ui/IconHelper;->iconUrl(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->code:Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->syntheticCode:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->displayName:Lcom/stripe/android/core/strings/ResolvableString;

    iget v3, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResource:I

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconResourceNight:Ljava/lang/Integer;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->lightThemeIconUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->darkThemeIconUrl:Ljava/lang/String;

    iget-boolean v7, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->iconRequiresTinting:Z

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->subtitle:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->promoBadge:Ljava/lang/String;

    iget-object v10, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->onClick:Lkotlin/jvm/functions/Function0;

    iget-object v11, p0, Lcom/stripe/android/paymentsheet/verticalmode/DisplayablePaymentMethod;->outlinedIconResource:Ljava/lang/Integer;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "DisplayablePaymentMethod(code="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v12, ", syntheticCode="

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconResourceNight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lightThemeIconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", darkThemeIconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", iconRequiresTinting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", subtitle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", promoBadge="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", onClick="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", outlinedIconResource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
