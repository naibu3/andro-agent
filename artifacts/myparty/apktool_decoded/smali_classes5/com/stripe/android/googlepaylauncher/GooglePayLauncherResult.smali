.class public abstract Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;
.super Ljava/lang/Object;
.source "GooglePayLauncherResult.kt"

# interfaces
.implements Lcom/stripe/android/view/ActivityStarter$Result;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;,
        Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \n2\u00020\u0001:\u0005\u0006\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0004\u001a\u00020\u0005H\u0016\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;",
        "Lcom/stripe/android/view/ActivityStarter$Result;",
        "<init>",
        "()V",
        "toBundle",
        "Landroid/os/Bundle;",
        "Error",
        "PaymentData",
        "Canceled",
        "Unavailable",
        "Companion",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Canceled;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Error;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$PaymentData;",
        "Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Unavailable;",
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

.field public static final Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;-><init>()V

    return-void
.end method

.method public static final fromIntent(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;
    .locals 1
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;->Companion:Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;

    invoke-virtual {v0, p0}, Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/googlepaylauncher/GooglePayLauncherResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public toBundle()Landroid/os/Bundle;
    .locals 3

    const/4 v0, 0x1

    .line 16
    new-array v0, v0, [Lkotlin/Pair;

    const-string v1, "extra_activity_result"

    invoke-static {v1, p0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
