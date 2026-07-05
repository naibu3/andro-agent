.class public final Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;
.super Lcom/stripe/android/link/analytics/LinkEvent;
.source "LinkEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/analytics/LinkEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TwoFAStartFailure"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;",
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "<init>",
        "()V",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
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

.field public static final INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;

.field private static final eventName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;

    invoke-direct {v0}, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;-><init>()V

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;

    .line 40
    const-string v0, "link.2fa.start_failure"

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;->eventName:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 39
    invoke-direct {p0, v0}, Lcom/stripe/android/link/analytics/LinkEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 40
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$TwoFAStartFailure;->eventName:Ljava/lang/String;

    return-object v0
.end method
