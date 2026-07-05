.class public final Lcom/stripe/hcaptcha/HCaptcha$Companion;
.super Ljava/lang/Object;
.source "HCaptcha.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/hcaptcha/HCaptcha;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/hcaptcha/HCaptcha$Companion;",
        "",
        "<init>",
        "()V",
        "getClient",
        "Lcom/stripe/hcaptcha/HCaptcha;",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
        "internalConfig",
        "Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;",
        "hcaptcha_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/hcaptcha/HCaptcha$Companion;-><init>()V

    return-void
.end method

.method public static synthetic getClient$default(Lcom/stripe/hcaptcha/HCaptcha$Companion;Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;ILjava/lang/Object;)Lcom/stripe/hcaptcha/HCaptcha;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 131
    new-instance p2, Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;-><init>(Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 129
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/stripe/hcaptcha/HCaptcha$Companion;->getClient(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getClient(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;)Lcom/stripe/hcaptcha/HCaptcha;
    .locals 2

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "internalConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    new-instance v0, Lcom/stripe/hcaptcha/HCaptcha;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, Lcom/stripe/hcaptcha/HCaptcha;-><init>(Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
