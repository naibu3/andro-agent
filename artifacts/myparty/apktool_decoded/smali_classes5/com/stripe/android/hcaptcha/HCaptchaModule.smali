.class public final Lcom/stripe/android/hcaptcha/HCaptchaModule;
.super Ljava/lang/Object;
.source "HCaptchaModule.kt"


# annotations
.annotation runtime Ldagger/Module;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0001\u00a2\u0006\u0002\u0008\u0006J\u0010\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0005H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/hcaptcha/HCaptchaModule;",
        "",
        "<init>",
        "()V",
        "provideHCaptchaProvider",
        "Lcom/stripe/android/hcaptcha/HCaptchaProvider;",
        "provideHCaptchaProvider$payments_core_release",
        "provideHCaptchaService",
        "Lcom/stripe/android/hcaptcha/HCaptchaService;",
        "hCaptchaProvider",
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

.field public static final INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaModule;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/hcaptcha/HCaptchaModule;

    invoke-direct {v0}, Lcom/stripe/android/hcaptcha/HCaptchaModule;-><init>()V

    sput-object v0, Lcom/stripe/android/hcaptcha/HCaptchaModule;->INSTANCE:Lcom/stripe/android/hcaptcha/HCaptchaModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final provideHCaptchaProvider$payments_core_release()Lcom/stripe/android/hcaptcha/HCaptchaProvider;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    .line 12
    new-instance v0, Lcom/stripe/android/hcaptcha/DefaultHCaptchaProvider;

    invoke-direct {v0}, Lcom/stripe/android/hcaptcha/DefaultHCaptchaProvider;-><init>()V

    check-cast v0, Lcom/stripe/android/hcaptcha/HCaptchaProvider;

    return-object v0
.end method

.method public final provideHCaptchaService(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)Lcom/stripe/android/hcaptcha/HCaptchaService;
    .locals 1
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "hCaptchaProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    new-instance v0, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;

    invoke-direct {v0, p1}, Lcom/stripe/android/hcaptcha/DefaultHCaptchaService;-><init>(Lcom/stripe/android/hcaptcha/HCaptchaProvider;)V

    check-cast v0, Lcom/stripe/android/hcaptcha/HCaptchaService;

    return-object v0
.end method
