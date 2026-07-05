.class public abstract Lcom/stripe/android/link/verification/VerificationState;
.super Ljava/lang/Object;
.source "LinkInlineState.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/verification/VerificationState$Loading;,
        Lcom/stripe/android/link/verification/VerificationState$Render2FA;,
        Lcom/stripe/android/link/verification/VerificationState$RenderButton;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0003\u0007\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/link/verification/VerificationState;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "Loading",
        "Render2FA",
        "RenderButton",
        "Lcom/stripe/android/link/verification/VerificationState$Loading;",
        "Lcom/stripe/android/link/verification/VerificationState$Render2FA;",
        "Lcom/stripe/android/link/verification/VerificationState$RenderButton;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/verification/VerificationState;-><init>()V

    return-void
.end method
