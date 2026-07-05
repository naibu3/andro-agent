.class public final Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;
.super Ljava/lang/Object;
.source "DefaultLinkConfirmationHandler.kt"

# interfaces
.implements Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler$Factory;",
        "configuration",
        "Lcom/stripe/android/link/LinkConfiguration;",
        "logger",
        "Lcom/stripe/android/core/Logger;",
        "<init>",
        "(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)V",
        "create",
        "Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;",
        "confirmationHandler",
        "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;",
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
.field private final configuration:Lcom/stripe/android/link/LinkConfiguration;

.field private final logger:Lcom/stripe/android/core/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 188
    iput-object p1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 189
    iput-object p2, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;->logger:Lcom/stripe/android/core/Logger;

    return-void
.end method


# virtual methods
.method public create(Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;
    .locals 3

    const-string v0, "confirmationHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    iget-object v0, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;->logger:Lcom/stripe/android/core/Logger;

    .line 195
    iget-object v1, p0, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler$Factory;->configuration:Lcom/stripe/android/link/LinkConfiguration;

    .line 192
    new-instance v2, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;

    invoke-direct {v2, v1, v0, p1}, Lcom/stripe/android/link/confirmation/DefaultLinkConfirmationHandler;-><init>(Lcom/stripe/android/link/LinkConfiguration;Lcom/stripe/android/core/Logger;Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler;)V

    check-cast v2, Lcom/stripe/android/link/confirmation/LinkConfirmationHandler;

    return-object v2
.end method
