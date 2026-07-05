.class final Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;
.super Ljava/lang/Object;
.source "MultipleEventsCutter.kt"

# interfaces
.implements Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000cH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;",
        "Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutter;",
        "<init>",
        "()V",
        "now",
        "",
        "getNow",
        "()J",
        "lastEventTimeMs",
        "processEvent",
        "",
        "event",
        "Lkotlin/Function0;",
        "Companion",
        "financial-connections_release"
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
.field public static final Companion:Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl$Companion;

.field private static final DEBOUNCE_MS:J = 0x1f4L


# instance fields
.field private lastEventTimeMs:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;->Companion:Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl$Companion;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getNow()J
    .locals 2

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public processEvent(Lkotlin/jvm/functions/Function0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;->getNow()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;->lastEventTimeMs:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1f4

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 34
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 36
    :cond_0
    invoke-direct {p0}, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;->getNow()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/stripe/android/financialconnections/ui/components/MultipleEventsCutterImpl;->lastEventTimeMs:J

    return-void
.end method
