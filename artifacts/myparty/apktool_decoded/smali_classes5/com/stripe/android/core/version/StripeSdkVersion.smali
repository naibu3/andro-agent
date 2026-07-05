.class public final Lcom/stripe/android/core/version/StripeSdkVersion;
.super Ljava/lang/Object;
.source "StripeSdkVersion.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/stripe/android/core/version/StripeSdkVersion;",
        "",
        "<init>",
        "()V",
        "VERSION_NAME",
        "",
        "VERSION",
        "stripe-core_release"
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
.field public static final INSTANCE:Lcom/stripe/android/core/version/StripeSdkVersion;

.field public static final VERSION:Ljava/lang/String; = "AndroidBindings/21.22.2"

.field public static final VERSION_NAME:Ljava/lang/String; = "21.22.2"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/core/version/StripeSdkVersion;

    invoke-direct {v0}, Lcom/stripe/android/core/version/StripeSdkVersion;-><init>()V

    sput-object v0, Lcom/stripe/android/core/version/StripeSdkVersion;->INSTANCE:Lcom/stripe/android/core/version/StripeSdkVersion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
