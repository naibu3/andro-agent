.class public final Lcom/stripe/android/financialconnections/features/consent/ConsentViewModelKt;
.super Ljava/lang/Object;
.source "ConsentViewModel.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "showAnimatedDots",
        "",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;",
        "getShowAnimatedDots",
        "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z",
        "financial-connections_release"
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
.method public static final synthetic access$getShowAnimatedDots(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/stripe/android/financialconnections/features/consent/ConsentViewModelKt;->getShowAnimatedDots(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z

    move-result p0

    return p0
.end method

.method private static final getShowAnimatedDots(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;)Z
    .locals 0

    .line 234
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsSessionManifest;->isLinkWithStripe()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
