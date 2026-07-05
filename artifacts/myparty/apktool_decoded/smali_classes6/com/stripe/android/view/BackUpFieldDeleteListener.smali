.class public final Lcom/stripe/android/view/BackUpFieldDeleteListener;
.super Ljava/lang/Object;
.source "BackUpFieldDeleteListener.kt"

# interfaces
.implements Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/stripe/android/view/BackUpFieldDeleteListener;",
        "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;",
        "backUpTarget",
        "Lcom/stripe/android/view/StripeEditText;",
        "<init>",
        "(Lcom/stripe/android/view/StripeEditText;)V",
        "onDeleteEmpty",
        "",
        "payments-core_release"
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
.field private final backUpTarget:Lcom/stripe/android/view/StripeEditText;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/view/StripeEditText;)V
    .locals 1

    const-string v0, "backUpTarget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/stripe/android/view/BackUpFieldDeleteListener;->backUpTarget:Lcom/stripe/android/view/StripeEditText;

    return-void
.end method


# virtual methods
.method public onDeleteEmpty()V
    .locals 4

    .line 16
    iget-object v0, p0, Lcom/stripe/android/view/BackUpFieldDeleteListener;->backUpTarget:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    const-string v0, ""

    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_2

    .line 18
    iget-object v1, p0, Lcom/stripe/android/view/BackUpFieldDeleteListener;->backUpTarget:Lcom/stripe/android/view/StripeEditText;

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "substring(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    .line 18
    invoke-virtual {v1, v0}, Lcom/stripe/android/view/StripeEditText;->setText(Ljava/lang/CharSequence;)V

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/stripe/android/view/BackUpFieldDeleteListener;->backUpTarget:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->requestFocus()Z

    .line 23
    iget-object v0, p0, Lcom/stripe/android/view/BackUpFieldDeleteListener;->backUpTarget:Lcom/stripe/android/view/StripeEditText;

    invoke-virtual {v0}, Lcom/stripe/android/view/StripeEditText;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/stripe/android/view/StripeEditText;->setSelection(I)V

    return-void
.end method
