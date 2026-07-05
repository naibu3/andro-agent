.class public final Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;
.super Ljava/lang/Object;
.source "IntegrityVerdictManager.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;",
        "",
        "<init>",
        "()V",
        "verdictFailed",
        "",
        "setVerdictFailed",
        "",
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
.field public static final $stable:I = 0x8


# instance fields
.field private verdictFailed:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final setVerdictFailed()V
    .locals 1

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;->verdictFailed:Z

    return-void
.end method

.method public final verdictFailed()Z
    .locals 1

    .line 18
    iget-boolean v0, p0, Lcom/stripe/android/financialconnections/domain/IntegrityVerdictManager;->verdictFailed:Z

    return v0
.end method
