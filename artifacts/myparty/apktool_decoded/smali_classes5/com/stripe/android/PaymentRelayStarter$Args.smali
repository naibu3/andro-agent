.class public abstract Lcom/stripe/android/PaymentRelayStarter$Args;
.super Ljava/lang/Object;
.source "PaymentRelayStarter.kt"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/PaymentRelayStarter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Args"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/PaymentRelayStarter$Args$Companion;,
        Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;,
        Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;,
        Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;,
        Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u0000 \u000e2\u00020\u0001:\u0005\n\u000b\u000c\r\u000eB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0008\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0004\u000f\u0010\u0011\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/PaymentRelayStarter$Args;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "requestCode",
        "",
        "getRequestCode",
        "()I",
        "toResult",
        "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;",
        "PaymentIntentArgs",
        "SetupIntentArgs",
        "SourceArgs",
        "ErrorArgs",
        "Companion",
        "Lcom/stripe/android/PaymentRelayStarter$Args$ErrorArgs;",
        "Lcom/stripe/android/PaymentRelayStarter$Args$PaymentIntentArgs;",
        "Lcom/stripe/android/PaymentRelayStarter$Args$SetupIntentArgs;",
        "Lcom/stripe/android/PaymentRelayStarter$Args$SourceArgs;",
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

.field public static final Companion:Lcom/stripe/android/PaymentRelayStarter$Args$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/PaymentRelayStarter$Args$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/PaymentRelayStarter$Args$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/PaymentRelayStarter$Args;->Companion:Lcom/stripe/android/PaymentRelayStarter$Args$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/PaymentRelayStarter$Args;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getRequestCode()I
.end method

.method public abstract toResult()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;
.end method
