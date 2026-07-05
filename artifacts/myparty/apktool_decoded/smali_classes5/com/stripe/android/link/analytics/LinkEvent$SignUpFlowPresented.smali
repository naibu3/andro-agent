.class public final Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;
.super Lcom/stripe/android/link/analytics/LinkEvent;
.source "LinkEvent.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/analytics/LinkEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SignUpFlowPresented"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0005H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;",
        "Lcom/stripe/android/link/analytics/LinkEvent;",
        "<init>",
        "()V",
        "eventName",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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

.field public static final INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

.field private static final eventName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    invoke-direct {v0}, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;-><init>()V

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;->INSTANCE:Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    .line 12
    const-string v0, "link.signup.flow_presented"

    sput-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;->eventName:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-direct {p0, v0}, Lcom/stripe/android/link/analytics/LinkEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;

    return v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 12
    sget-object v0, Lcom/stripe/android/link/analytics/LinkEvent$SignUpFlowPresented;->eventName:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x6735aae3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "SignUpFlowPresented"

    return-object v0
.end method
