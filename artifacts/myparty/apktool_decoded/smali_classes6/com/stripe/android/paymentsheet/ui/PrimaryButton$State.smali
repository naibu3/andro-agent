.class public abstract Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;
.super Ljava/lang/Object;
.source "PrimaryButton.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;,
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;,
        Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u00002\u00020\u0001:\u0003\u0007\u0008\tB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0006\u0082\u0001\u0003\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;",
        "",
        "isProcessing",
        "",
        "<init>",
        "(Z)V",
        "()Z",
        "Ready",
        "StartProcessing",
        "FinishProcessing",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;",
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


# instance fields
.field private final isProcessing:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Z)V
    .locals 0

    .line 287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;->isProcessing:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final isProcessing()Z
    .locals 1

    .line 288
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;->isProcessing:Z

    return v0
.end method
