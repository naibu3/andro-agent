.class public final Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;
.super Ljava/lang/Object;
.source "GooglePayRepository.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/googlepaylauncher/GooglePayRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\u0008\u0087\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u000c\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;",
        "",
        "<init>",
        "()V",
        "defaultFactory",
        "Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;",
        "googlePayAvailabilityClientFactory",
        "Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;",
        "getGooglePayAvailabilityClientFactory",
        "()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;",
        "setGooglePayAvailabilityClientFactory",
        "(Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;)V",
        "resetFactory",
        "",
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
.field static final synthetic $$INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;

.field private static final defaultFactory:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;

.field private static volatile googlePayAvailabilityClientFactory:Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;

    invoke-direct {v0}, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;-><init>()V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->$$INSTANCE:Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;

    .line 28
    new-instance v0, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;

    invoke-direct {v0}, Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;-><init>()V

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->defaultFactory:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;

    .line 31
    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->googlePayAvailabilityClientFactory:Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getGooglePayAvailabilityClientFactory()Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;
    .locals 1

    .line 30
    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->googlePayAvailabilityClientFactory:Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    return-object v0
.end method

.method public final resetFactory()V
    .locals 1

    .line 34
    sget-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->defaultFactory:Lcom/stripe/android/googlepaylauncher/DefaultGooglePayAvailabilityClient$Factory;

    check-cast v0, Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    sput-object v0, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->googlePayAvailabilityClientFactory:Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    return-void
.end method

.method public final setGooglePayAvailabilityClientFactory(Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    sput-object p1, Lcom/stripe/android/googlepaylauncher/GooglePayRepository$Companion;->googlePayAvailabilityClientFactory:Lcom/stripe/android/googlepaylauncher/GooglePayAvailabilityClient$Factory;

    return-void
.end method
