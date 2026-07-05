.class public final Lexpo/modules/systemui/singletons/SystemUI;
.super Ljava/lang/Object;
.source "SystemUI.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JC\u0010\u0006\u001a\u00020\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u000f\u0012\u0004\u0012\u00020\u00070\u000cH\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/systemui/singletons/SystemUI;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "setUserInterfaceStyle",
        "",
        "style",
        "successCallback",
        "Lkotlin/Function0;",
        "failureCallback",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "reason",
        "expo-system-ui_release"
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
.field public static final INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

.field private static final TAG:Ljava/lang/String; = "SystemUI"


# direct methods
.method public static synthetic $r8$lambda$Nt1Gh79riYDclAd_ngJkVdxvDSI()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle$lambda$0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic $r8$lambda$q8X13EhyJxszn69dQN2IX7v_8I4(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle$lambda$1(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lexpo/modules/systemui/singletons/SystemUI;

    invoke-direct {v0}, Lexpo/modules/systemui/singletons/SystemUI;-><init>()V

    sput-object v0, Lexpo/modules/systemui/singletons/SystemUI;->INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final setUserInterfaceStyle(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    sget-object v0, Lexpo/modules/systemui/singletons/SystemUI;->INSTANCE:Lexpo/modules/systemui/singletons/SystemUI;

    new-instance v1, Lexpo/modules/systemui/singletons/SystemUI$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lexpo/modules/systemui/singletons/SystemUI$$ExternalSyntheticLambda0;-><init>()V

    new-instance v2, Lexpo/modules/systemui/singletons/SystemUI$$ExternalSyntheticLambda1;

    invoke-direct {v2}, Lexpo/modules/systemui/singletons/SystemUI$$ExternalSyntheticLambda1;-><init>()V

    invoke-direct {v0, p0, v1, v2}, Lexpo/modules/systemui/singletons/SystemUI;->setUserInterfaceStyle(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final setUserInterfaceStyle(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const/4 v0, -0x1

    if-nez p1, :cond_0

    goto :goto_1

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v1

    if-eqz v1, :cond_5

    const v2, 0x2eef76

    if-eq v1, v2, :cond_3

    const v2, 0x6233516

    if-eq v1, v2, :cond_2

    const v2, 0x63c2322b

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    const-string v1, "automatic"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 20
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1c

    if-ge p1, p3, :cond_8

    const/4 v0, 0x3

    goto :goto_1

    .line 18
    :cond_2
    const-string v0, "light"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_3
    const-string v0, "dark"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    goto :goto_1

    :cond_5
    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 28
    :cond_6
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Invalid user interface style: \""

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string p2, "\""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_7
    const/4 v0, 0x1

    .line 31
    :cond_8
    :goto_1
    invoke-static {v0}, Landroidx/appcompat/app/AppCompatDelegate;->setDefaultNightMode(I)V

    .line 32
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method private static final setUserInterfaceStyle$lambda$0()Lkotlin/Unit;
    .locals 1

    .line 37
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final setUserInterfaceStyle$lambda$1(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "m"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    const-string v0, "SystemUI"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
