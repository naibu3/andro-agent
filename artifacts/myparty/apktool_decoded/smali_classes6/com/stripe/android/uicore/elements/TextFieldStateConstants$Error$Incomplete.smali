.class public final Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;
.super Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.source "TextFieldStateConstants.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Incomplete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;",
        "errorMessageResId",
        "",
        "<init>",
        "(I)V",
        "getErrorMessageResId",
        "()I",
        "shouldShowError",
        "",
        "hasFocus",
        "isBlank",
        "stripe-ui-core_release"
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
.field private final errorMessageResId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 34
    invoke-direct {p0, p1, v0, v1, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 33
    iput p1, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;->errorMessageResId:I

    return-void
.end method


# virtual methods
.method protected getErrorMessageResId()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;->errorMessageResId:I

    return v0
.end method

.method public isBlank()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldShowError(Z)Z
    .locals 0

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
