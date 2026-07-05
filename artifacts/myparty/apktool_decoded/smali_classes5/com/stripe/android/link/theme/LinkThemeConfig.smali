.class public final Lcom/stripe/android/link/theme/LinkThemeConfig;
.super Ljava/lang/Object;
.source "Color.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00020\u000b*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\rR\u0018\u0010\u0010\u001a\u00020\u0011*\u00020\u00058AX\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/link/theme/LinkThemeConfig;",
        "",
        "<init>",
        "()V",
        "colors",
        "Lcom/stripe/android/link/theme/LinkColors;",
        "isDark",
        "",
        "colorsLight",
        "colorsDark",
        "contentOnPrimaryButton",
        "Landroidx/compose/ui/graphics/Color;",
        "getContentOnPrimaryButton-vNxB06k$paymentsheet_release",
        "(Lcom/stripe/android/link/theme/LinkColors;)J",
        "separatorOnPrimaryButton",
        "getSeparatorOnPrimaryButton-vNxB06k$paymentsheet_release",
        "radioButtonColors",
        "Landroidx/compose/material/RadioButtonColors;",
        "getRadioButtonColors",
        "(Lcom/stripe/android/link/theme/LinkColors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RadioButtonColors;",
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

.field public static final INSTANCE:Lcom/stripe/android/link/theme/LinkThemeConfig;

.field private static final colorsDark:Lcom/stripe/android/link/theme/LinkColors;

.field private static final colorsLight:Lcom/stripe/android/link/theme/LinkColors;


# direct methods
.method static constructor <clinit>()V
    .locals 50

    new-instance v0, Lcom/stripe/android/link/theme/LinkThemeConfig;

    invoke-direct {v0}, Lcom/stripe/android/link/theme/LinkThemeConfig;-><init>()V

    sput-object v0, Lcom/stripe/android/link/theme/LinkThemeConfig;->INSTANCE:Lcom/stripe/android/link/theme/LinkThemeConfig;

    .line 63
    new-instance v1, Lcom/stripe/android/link/theme/LinkColors;

    .line 64
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v2

    .line 65
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral100$p()J

    move-result-wide v4

    .line 66
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral200$p()J

    move-result-wide v6

    .line 67
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v8

    .line 68
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral300$p()J

    move-result-wide v10

    .line 69
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v12

    .line 70
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical500$p()J

    move-result-wide v14

    .line 71
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v16

    .line 72
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v18

    .line 73
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v20

    .line 74
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical500$p()J

    move-result-wide v22

    .line 75
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v24

    .line 76
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral700$p()J

    move-result-wide v26

    .line 77
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral500$p()J

    move-result-wide v28

    .line 78
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v30

    .line 79
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand600$p()J

    move-result-wide v32

    .line 80
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical600$p()J

    move-result-wide v34

    .line 81
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v36

    .line 82
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral700$p()J

    move-result-wide v38

    .line 83
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral500$p()J

    move-result-wide v40

    .line 84
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v42

    .line 85
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v44

    .line 86
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical500$p()J

    move-result-wide v46

    const/16 v48, 0x0

    .line 63
    invoke-direct/range {v1 .. v48}, Lcom/stripe/android/link/theme/LinkColors;-><init>(JJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsLight:Lcom/stripe/android/link/theme/LinkColors;

    .line 89
    new-instance v2, Lcom/stripe/android/link/theme/LinkColors;

    .line 90
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v3

    .line 91
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral800$p()J

    move-result-wide v5

    .line 92
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral700$p()J

    move-result-wide v7

    .line 93
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v9

    .line 94
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v11

    .line 95
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v13

    .line 96
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical500$p()J

    move-result-wide v15

    .line 97
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral200$p()J

    move-result-wide v17

    .line 98
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral800$p()J

    move-result-wide v19

    .line 99
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v21

    .line 100
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical600$p()J

    move-result-wide v23

    .line 101
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v25

    .line 102
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral300$p()J

    move-result-wide v27

    .line 103
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral400$p()J

    move-result-wide v29

    .line 104
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v31

    .line 105
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v33

    .line 106
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical400$p()J

    move-result-wide v35

    .line 107
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral100$p()J

    move-result-wide v37

    .line 108
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral500$p()J

    move-result-wide v39

    .line 109
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral500$p()J

    move-result-wide v41

    .line 110
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral0$p()J

    move-result-wide v43

    .line 111
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand200$p()J

    move-result-wide v45

    .line 112
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getCritical500$p()J

    move-result-wide v47

    const/16 v49, 0x0

    .line 89
    invoke-direct/range {v2 .. v49}, Lcom/stripe/android/link/theme/LinkColors;-><init>(JJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v2, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsDark:Lcom/stripe/android/link/theme/LinkColors;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final colors(Z)Lcom/stripe/android/link/theme/LinkColors;
    .locals 0

    if-eqz p1, :cond_0

    .line 60
    sget-object p1, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsDark:Lcom/stripe/android/link/theme/LinkColors;

    return-object p1

    :cond_0
    sget-object p1, Lcom/stripe/android/link/theme/LinkThemeConfig;->colorsLight:Lcom/stripe/android/link/theme/LinkColors;

    return-object p1
.end method

.method public final getContentOnPrimaryButton-vNxB06k$paymentsheet_release(Lcom/stripe/android/link/theme/LinkColors;)J
    .locals 2

    const-string v0, "$this$contentOnPrimaryButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral900$p()J

    move-result-wide v0

    return-wide v0
.end method

.method public final getRadioButtonColors(Lcom/stripe/android/link/theme/LinkColors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material/RadioButtonColors;
    .locals 12

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p1, 0x39b9deb4

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.link.theme.LinkThemeConfig.<get-radioButtonColors> (Color.kt:136)"

    .line 137
    invoke-static {p1, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, Landroidx/compose/material/RadioButtonDefaults;->INSTANCE:Landroidx/compose/material/RadioButtonDefaults;

    .line 138
    sget-object p1, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    const/4 p3, 0x6

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/theme/LinkColors;->getButtonBrand-0d7_KjU()J

    move-result-wide v3

    const p1, -0x22d8206

    invoke-interface {p2, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 p1, 0x0

    .line 139
    invoke-static {p2, p1}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getNeutral700$p()J

    move-result-wide v0

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/stripe/android/link/theme/LinkTheme;->INSTANCE:Lcom/stripe/android/link/theme/LinkTheme;

    invoke-virtual {p1, p2, p3}, Lcom/stripe/android/link/theme/LinkTheme;->getColors(Landroidx/compose/runtime/Composer;I)Lcom/stripe/android/link/theme/LinkColors;

    move-result-object p1

    invoke-virtual {p1}, Lcom/stripe/android/link/theme/LinkColors;->getBorderDefault-0d7_KjU()J

    move-result-wide v0

    :goto_0
    move-wide v5, v0

    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget p1, Landroidx/compose/material/RadioButtonDefaults;->$stable:I

    shl-int/lit8 v10, p1, 0x9

    const/4 v11, 0x4

    const-wide/16 v7, 0x0

    move-object v9, p2

    .line 137
    invoke-virtual/range {v2 .. v11}, Landroidx/compose/material/RadioButtonDefaults;->colors-RGew2ao(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/RadioButtonColors;

    move-result-object p1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-object p1
.end method

.method public final getSeparatorOnPrimaryButton-vNxB06k$paymentsheet_release(Lcom/stripe/android/link/theme/LinkColors;)J
    .locals 2

    const-string v0, "$this$separatorOnPrimaryButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    invoke-static {}, Lcom/stripe/android/link/theme/ColorKt;->access$getBrand400$p()J

    move-result-wide v0

    return-wide v0
.end method
