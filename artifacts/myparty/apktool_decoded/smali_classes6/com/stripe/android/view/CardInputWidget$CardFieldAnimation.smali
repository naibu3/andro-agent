.class abstract Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;
.super Landroid/view/animation/Animation;
.source "CardInputWidget.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/CardInputWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "CardFieldAnimation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\"\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;",
        "Landroid/view/animation/Animation;",
        "<init>",
        "()V",
        "Companion",
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
.field private static final ANIMATION_LENGTH:J = 0x96L

.field private static final Companion:Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;->Companion:Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1088
    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    const-wide/16 v0, 0x96

    .line 1090
    invoke-virtual {p0, v0, v1}, Lcom/stripe/android/view/CardInputWidget$CardFieldAnimation;->setDuration(J)V

    return-void
.end method
