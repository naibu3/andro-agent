.class public final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;
.super Ljava/lang/Object;
.source "PrimaryButtonNew.kt"

# interfaces
.implements Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Processing"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState;",
        "<init>",
        "()V",
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

.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PrimaryButtonProcessingState$Processing;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
