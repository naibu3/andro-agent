.class public final Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;
.super Lcom/stripe/android/stripe3ds2/init/SecurityCheck;
.source "SecurityCheck.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/stripe3ds2/init/SecurityCheck;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DebuggerAttached"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0011\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
        "isDebuggerConnected",
        "",
        "<init>",
        "(Z)V",
        "()Z",
        "check",
        "Companion",
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
.field private static final Companion:Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;

.field private static final WARNING:Lcom/stripe/android/stripe3ds2/init/Warning;


# instance fields
.field private final isDebuggerConnected:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->Companion:Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached$Companion;

    .line 104
    new-instance v0, Lcom/stripe/android/stripe3ds2/init/Warning;

    .line 106
    const-string v1, "A debugger is attached to the App."

    .line 107
    sget-object v2, Lcom/stripe/android/stripe3ds2/init/Warning$Severity;->MEDIUM:Lcom/stripe/android/stripe3ds2/init/Warning$Severity;

    .line 104
    const-string v3, "SW04"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/stripe3ds2/init/Warning;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/Warning$Severity;)V

    sput-object v0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->WARNING:Lcom/stripe/android/stripe3ds2/init/Warning;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, v2, v0, v1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;-><init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 2

    .line 100
    sget-object v0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->WARNING:Lcom/stripe/android/stripe3ds2/init/Warning;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;-><init>(Lcom/stripe/android/stripe3ds2/init/Warning;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 99
    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->isDebuggerConnected:Z

    return-void
.end method

.method public synthetic constructor <init>(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 99
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result p1

    .line 98
    :cond_0
    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public check()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->isDebuggerConnected:Z

    return v0
.end method

.method public final isDebuggerConnected()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;->isDebuggerConnected:Z

    return v0
.end method
