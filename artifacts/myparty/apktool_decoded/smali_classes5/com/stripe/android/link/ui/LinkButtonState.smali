.class public abstract Lcom/stripe/android/link/ui/LinkButtonState;
.super Ljava/lang/Object;
.source "LinkButtonState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/ui/LinkButtonState$Companion;,
        Lcom/stripe/android/link/ui/LinkButtonState$Default;,
        Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;,
        Lcom/stripe/android/link/ui/LinkButtonState$Email;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000 \u00072\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/LinkButtonState;",
        "",
        "<init>",
        "()V",
        "DefaultPayment",
        "Email",
        "Default",
        "Companion",
        "Lcom/stripe/android/link/ui/LinkButtonState$Default;",
        "Lcom/stripe/android/link/ui/LinkButtonState$DefaultPayment;",
        "Lcom/stripe/android/link/ui/LinkButtonState$Email;",
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

.field public static final Companion:Lcom/stripe/android/link/ui/LinkButtonState$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/link/ui/LinkButtonState$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/link/ui/LinkButtonState$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/link/ui/LinkButtonState;->Companion:Lcom/stripe/android/link/ui/LinkButtonState$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/ui/LinkButtonState;-><init>()V

    return-void
.end method
