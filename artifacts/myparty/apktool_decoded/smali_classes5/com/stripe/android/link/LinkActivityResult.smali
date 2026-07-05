.class public abstract Lcom/stripe/android/link/LinkActivityResult;
.super Ljava/lang/Object;
.source "LinkActivityResult.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/link/LinkActivityResult$Canceled;,
        Lcom/stripe/android/link/LinkActivityResult$Completed;,
        Lcom/stripe/android/link/LinkActivityResult$Failed;,
        Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0004\u0008\t\n\u000bB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/stripe/android/link/LinkActivityResult;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "linkAccountUpdate",
        "Lcom/stripe/android/link/LinkAccountUpdate;",
        "getLinkAccountUpdate",
        "()Lcom/stripe/android/link/LinkAccountUpdate;",
        "Completed",
        "PaymentMethodObtained",
        "Canceled",
        "Failed",
        "Lcom/stripe/android/link/LinkActivityResult$Canceled;",
        "Lcom/stripe/android/link/LinkActivityResult$Completed;",
        "Lcom/stripe/android/link/LinkActivityResult$Failed;",
        "Lcom/stripe/android/link/LinkActivityResult$PaymentMethodObtained;",
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

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/link/LinkActivityResult;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getLinkAccountUpdate()Lcom/stripe/android/link/LinkAccountUpdate;
.end method
