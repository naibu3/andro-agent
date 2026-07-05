.class public final Lcom/stripe/android/hcaptcha/DefaultHCaptchaProvider;
.super Ljava/lang/Object;
.source "HCaptchaProvider.kt"

# interfaces
.implements Lcom/stripe/android/hcaptcha/HCaptchaProvider;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/hcaptcha/DefaultHCaptchaProvider;",
        "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
        "<init>",
        "()V",
        "get",
        "Lcom/stripe/hcaptcha/HCaptcha;",
        "activity",
        "Landroidx/fragment/app/FragmentActivity;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public get(Landroidx/fragment/app/FragmentActivity;)Lcom/stripe/hcaptcha/HCaptcha;
    .locals 3

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/stripe/hcaptcha/HCaptcha;->Companion:Lcom/stripe/hcaptcha/HCaptcha$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/stripe/hcaptcha/HCaptcha$Companion;->getClient$default(Lcom/stripe/hcaptcha/HCaptcha$Companion;Landroidx/fragment/app/FragmentActivity;Lcom/stripe/hcaptcha/config/HCaptchaInternalConfig;ILjava/lang/Object;)Lcom/stripe/hcaptcha/HCaptcha;

    move-result-object p1

    return-object p1
.end method
