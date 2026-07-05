.class public final Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;
.super Ljava/lang/Object;
.source "ConfirmationMediator.kt"

# interfaces
.implements Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Launch"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action;",
        "launch",
        "Lkotlin/Function0;",
        "",
        "receivesResultInProcess",
        "",
        "<init>",
        "(Lkotlin/jvm/functions/Function0;Z)V",
        "getLaunch",
        "()Lkotlin/jvm/functions/Function0;",
        "getReceivesResultInProcess",
        "()Z",
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
.field private final launch:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final receivesResultInProcess:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "launch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    iput-object p1, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->launch:Lkotlin/jvm/functions/Function0;

    .line 149
    iput-boolean p2, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->receivesResultInProcess:Z

    return-void
.end method


# virtual methods
.method public final getLaunch()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 148
    iget-object v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->launch:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final getReceivesResultInProcess()Z
    .locals 1

    .line 149
    iget-boolean v0, p0, Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator$Action$Launch;->receivesResultInProcess:Z

    return v0
.end method
