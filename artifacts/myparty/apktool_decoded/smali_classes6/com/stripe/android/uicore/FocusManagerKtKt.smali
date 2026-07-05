.class public final Lcom/stripe/android/uicore/FocusManagerKtKt;
.super Ljava/lang/Object;
.source "FocusManagerKt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "moveFocusSafely",
        "",
        "Landroidx/compose/ui/focus/FocusManager;",
        "focusDirection",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "moveFocusSafely-Mxy_nc0",
        "(Landroidx/compose/ui/focus/FocusManager;I)Z",
        "stripe-ui-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final moveFocusSafely-Mxy_nc0(Landroidx/compose/ui/focus/FocusManager;I)Z
    .locals 1

    const-string v0, "$this$moveFocusSafely"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    :try_start_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/focus/FocusManager;->moveFocus-3ESFkO8(I)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    .line 25
    check-cast p0, Ljava/lang/Exception;

    invoke-static {p0}, Lcom/stripe/android/uicore/FocusManagerKtKt;->moveFocusSafely_Mxy_nc0$logError(Ljava/lang/Exception;)V

    return v0

    :catch_1
    move-exception p0

    .line 21
    check-cast p0, Ljava/lang/Exception;

    invoke-static {p0}, Lcom/stripe/android/uicore/FocusManagerKtKt;->moveFocusSafely_Mxy_nc0$logError(Ljava/lang/Exception;)V

    return v0
.end method

.method private static final moveFocusSafely_Mxy_nc0$logError(Ljava/lang/Exception;)V
    .locals 3

    .line 15
    sget-object v0, Lcom/stripe/android/core/Logger;->Companion:Lcom/stripe/android/core/Logger$Companion;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/stripe/android/core/Logger$Companion;->getInstance(Z)Lcom/stripe/android/core/Logger;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Skipping moving focus due to exception: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Lcom/stripe/android/core/Logger;->warning(Ljava/lang/String;)V

    return-void
.end method
