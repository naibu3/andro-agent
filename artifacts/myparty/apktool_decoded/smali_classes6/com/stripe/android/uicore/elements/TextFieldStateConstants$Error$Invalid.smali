.class public final Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;
.super Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.source "TextFieldStateConstants.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Invalid"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000c\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0008H\u0016J\u0008\u0010\u0012\u001a\u00020\u0008H\u0016J\u0008\u0010\u0013\u001a\u00020\u0008H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR \u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\u0008\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;",
        "errorMessageResId",
        "",
        "formatArgs",
        "",
        "",
        "preventMoreInput",
        "",
        "<init>",
        "(I[Ljava/lang/Object;Z)V",
        "getErrorMessageResId",
        "()I",
        "getFormatArgs",
        "()[Ljava/lang/Object;",
        "[Ljava/lang/Object;",
        "shouldShowError",
        "hasFocus",
        "isBlank",
        "isFull",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final errorMessageResId:I

.field private final formatArgs:[Ljava/lang/Object;

.field private final preventMoreInput:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;Z)V
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-direct {p0, p1, p2, v0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 40
    iput p1, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->errorMessageResId:I

    .line 41
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->formatArgs:[Ljava/lang/Object;

    .line 42
    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->preventMoreInput:Z

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 39
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;-><init>(I[Ljava/lang/Object;Z)V

    return-void
.end method


# virtual methods
.method protected getErrorMessageResId()I
    .locals 1

    .line 40
    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->errorMessageResId:I

    return v0
.end method

.method protected getFormatArgs()[Ljava/lang/Object;
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->formatArgs:[Ljava/lang/Object;

    return-object v0
.end method

.method public isBlank()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isFull()Z
    .locals 1

    .line 46
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;->preventMoreInput:Z

    return v0
.end method

.method public shouldShowError(Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
