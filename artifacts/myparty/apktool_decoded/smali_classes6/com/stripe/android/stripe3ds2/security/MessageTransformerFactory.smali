.class public final Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;
.super Ljava/lang/Object;
.source "MessageTransformerFactory.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;",
        "",
        "isLiveMode",
        "",
        "<init>",
        "(Z)V",
        "create",
        "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;",
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
.field private final isLiveMode:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-boolean p1, p0, Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;->isLiveMode:Z

    return-void
.end method


# virtual methods
.method public final create()Lcom/stripe/android/stripe3ds2/security/MessageTransformer;
    .locals 2

    .line 7
    new-instance v0, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;

    iget-boolean v1, p0, Lcom/stripe/android/stripe3ds2/security/MessageTransformerFactory;->isLiveMode:Z

    invoke-direct {v0, v1}, Lcom/stripe/android/stripe3ds2/security/DefaultMessageTransformer;-><init>(Z)V

    check-cast v0, Lcom/stripe/android/stripe3ds2/security/MessageTransformer;

    return-object v0
.end method
