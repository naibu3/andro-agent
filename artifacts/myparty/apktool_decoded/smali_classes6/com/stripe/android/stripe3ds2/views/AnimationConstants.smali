.class public final Lcom/stripe/android/stripe3ds2/views/AnimationConstants;
.super Ljava/lang/Object;
.source "AnimationConstants.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0016\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/views/AnimationConstants;",
        "",
        "<init>",
        "()V",
        "SLIDE_IN",
        "",
        "getSLIDE_IN",
        "()I",
        "SLIDE_OUT",
        "getSLIDE_OUT",
        "3ds2sdk_release"
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
.field public static final INSTANCE:Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

.field private static final SLIDE_IN:I

.field private static final SLIDE_OUT:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

    invoke-direct {v0}, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;-><init>()V

    sput-object v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->INSTANCE:Lcom/stripe/android/stripe3ds2/views/AnimationConstants;

    .line 8
    sget v0, Lcom/stripe/android/stripe3ds2/R$anim;->stripe_3ds2_challenge_transition_slide_in:I

    sput v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_IN:I

    .line 11
    sget v0, Lcom/stripe/android/stripe3ds2/R$anim;->stripe_3ds2_challenge_transition_slide_out:I

    sput v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_OUT:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getSLIDE_IN()I
    .locals 1

    .line 7
    sget v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_IN:I

    return v0
.end method

.method public final getSLIDE_OUT()I
    .locals 1

    .line 10
    sget v0, Lcom/stripe/android/stripe3ds2/views/AnimationConstants;->SLIDE_OUT:I

    return v0
.end method
