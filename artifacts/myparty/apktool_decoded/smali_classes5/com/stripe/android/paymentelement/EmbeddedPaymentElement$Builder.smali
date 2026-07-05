.class public final Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;
.super Ljava/lang/Object;
.source "EmbeddedPaymentElement.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentelement/EmbeddedPaymentElement;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001:\u0001*B\u0019\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B\u0019\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\nB\u0019\u0008\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\rJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0013J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0017H\u0007J\u0010\u0010\u001e\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001dH\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0080\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0017@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR(\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u001d@BX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u001f\u0010\u001a\u001a\u0004\u0008 \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'\u00a8\u0006+"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;",
        "",
        "deferredHandler",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;",
        "resultCallback",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
        "<init>",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V",
        "createIntentCallback",
        "Lcom/stripe/android/paymentsheet/CreateIntentCallback;",
        "(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V",
        "preparePaymentMethodHandler",
        "Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;",
        "(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V",
        "getDeferredHandler$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;",
        "getResultCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;",
        "value",
        "Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "externalPaymentMethodConfirmHandler",
        "getExternalPaymentMethodConfirmHandler$paymentsheet_release",
        "()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;",
        "Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "confirmCustomPaymentMethodCallback",
        "getConfirmCustomPaymentMethodCallback$paymentsheet_release$annotations",
        "()V",
        "getConfirmCustomPaymentMethodCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;",
        "Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "analyticEventCallback",
        "getAnalyticEventCallback$paymentsheet_release$annotations",
        "getAnalyticEventCallback$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/AnalyticEventCallback;",
        "rowSelectionBehavior",
        "Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
        "getRowSelectionBehavior$paymentsheet_release",
        "()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;",
        "setRowSelectionBehavior$paymentsheet_release",
        "(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;)V",
        "handler",
        "callback",
        "DeferredHandler",
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
.field public static final $stable:I = 0x8


# instance fields
.field private analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

.field private confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

.field private final deferredHandler:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

.field private externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

.field private final resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

.field private rowSelectionBehavior:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V
    .locals 1

    const-string v0, "deferredHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->deferredHandler:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

    .line 129
    iput-object p2, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    .line 172
    sget-object p1, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;->Companion:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior$Companion;->default()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->rowSelectionBehavior:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V
    .locals 1

    const-string v0, "preparePaymentMethodHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 157
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$SharedPaymentToken;-><init>(Lcom/stripe/android/paymentelement/PreparePaymentMethodHandler;)V

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

    .line 156
    invoke-direct {p0, v0, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V
    .locals 1

    const-string v0, "createIntentCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resultCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    new-instance v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;

    invoke-direct {v0, p1}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler$Intent;-><init>(Lcom/stripe/android/paymentsheet/CreateIntentCallback;)V

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

    .line 140
    invoke-direct {p0, v0, p2}, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;-><init>(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;)V

    return-void
.end method

.method public static synthetic getAnalyticEventCallback$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic getConfirmCustomPaymentMethodCallback$paymentsheet_release$annotations()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final analyticEventCallback(Lcom/stripe/android/paymentelement/AnalyticEventCallback;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 193
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    .line 194
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    return-object p0
.end method

.method public final confirmCustomPaymentMethodCallback(Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    .line 186
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    return-object p0
.end method

.method public final externalPaymentMethodConfirmHandler(Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;
    .locals 1

    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    .line 178
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    return-object p0
.end method

.method public final getAnalyticEventCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/AnalyticEventCallback;
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->analyticEventCallback:Lcom/stripe/android/paymentelement/AnalyticEventCallback;

    return-object v0
.end method

.method public final getConfirmCustomPaymentMethodCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;
    .locals 1

    .line 164
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->confirmCustomPaymentMethodCallback:Lcom/stripe/android/paymentelement/ConfirmCustomPaymentMethodCallback;

    return-object v0
.end method

.method public final getDeferredHandler$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->deferredHandler:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder$DeferredHandler;

    return-object v0
.end method

.method public final getExternalPaymentMethodConfirmHandler$paymentsheet_release()Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->externalPaymentMethodConfirmHandler:Lcom/stripe/android/paymentsheet/ExternalPaymentMethodConfirmHandler;

    return-object v0
.end method

.method public final getResultCallback$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->resultCallback:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$ResultCallback;

    return-object v0
.end method

.method public final getRowSelectionBehavior$paymentsheet_release()Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->rowSelectionBehavior:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-object v0
.end method

.method public final rowSelectionBehavior(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;)Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;
    .locals 1

    const-string v0, "rowSelectionBehavior"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 203
    move-object v0, p0

    check-cast v0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;

    .line 204
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->rowSelectionBehavior:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-object p0
.end method

.method public final setRowSelectionBehavior$paymentsheet_release(Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    iput-object p1, p0, Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$Builder;->rowSelectionBehavior:Lcom/stripe/android/paymentelement/EmbeddedPaymentElement$RowSelectionBehavior;

    return-void
.end method
