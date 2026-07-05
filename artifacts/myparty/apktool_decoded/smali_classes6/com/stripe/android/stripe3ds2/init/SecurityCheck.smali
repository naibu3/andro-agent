.class public abstract Lcom/stripe/android/stripe3ds2/init/SecurityCheck;
.super Ljava/lang/Object;
.source "SecurityCheck.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;,
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;,
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;,
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;,
        Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0005\n\u000b\u000c\r\u000eB\u0011\u0008\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0008\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck;",
        "",
        "warning",
        "Lcom/stripe/android/stripe3ds2/init/Warning;",
        "<init>",
        "(Lcom/stripe/android/stripe3ds2/init/Warning;)V",
        "getWarning",
        "()Lcom/stripe/android/stripe3ds2/init/Warning;",
        "check",
        "",
        "RootedCheck",
        "Tampered",
        "Emulator",
        "DebuggerAttached",
        "UnsupportedOS",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$DebuggerAttached;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Emulator;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$RootedCheck;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$Tampered;",
        "Lcom/stripe/android/stripe3ds2/init/SecurityCheck$UnsupportedOS;",
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


# instance fields
.field private final warning:Lcom/stripe/android/stripe3ds2/init/Warning;


# direct methods
.method private constructor <init>(Lcom/stripe/android/stripe3ds2/init/Warning;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;->warning:Lcom/stripe/android/stripe3ds2/init/Warning;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/stripe3ds2/init/Warning;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;-><init>(Lcom/stripe/android/stripe3ds2/init/Warning;)V

    return-void
.end method


# virtual methods
.method public abstract check()Z
.end method

.method public final getWarning()Lcom/stripe/android/stripe3ds2/init/Warning;
    .locals 1

    .line 10
    iget-object v0, p0, Lcom/stripe/android/stripe3ds2/init/SecurityCheck;->warning:Lcom/stripe/android/stripe3ds2/init/Warning;

    return-object v0
.end method
