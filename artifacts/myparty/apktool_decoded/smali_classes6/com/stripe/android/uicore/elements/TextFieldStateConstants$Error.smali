.class public abstract Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;
.super Ljava/lang/Object;
.source "TextFieldStateConstants.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/TextFieldState;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/TextFieldStateConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Error"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;,
        Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;,
        Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\'\u0008\u0004\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016J\u0008\u0010\u0010\u001a\u00020\u000fH\u0016J\u0008\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR \u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000c\u0082\u0001\u0003\u0016\u0017\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;",
        "Lcom/stripe/android/uicore/elements/TextFieldState;",
        "errorMessageResId",
        "",
        "formatArgs",
        "",
        "",
        "<init>",
        "(I[Ljava/lang/Object;)V",
        "getErrorMessageResId",
        "()I",
        "getFormatArgs",
        "()[Ljava/lang/Object;",
        "[Ljava/lang/Object;",
        "isValid",
        "",
        "isFull",
        "getError",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "Incomplete",
        "Invalid",
        "Blank",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;",
        "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;",
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->errorMessageResId:I

    .line 26
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->formatArgs:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    move-object p2, p4

    .line 24
    :cond_0
    invoke-direct {p0, p1, p2, p4}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;-><init>(I[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getError()Lcom/stripe/android/uicore/elements/FieldError;
    .locals 3

    .line 30
    new-instance v0, Lcom/stripe/android/uicore/elements/FieldError;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->getErrorMessageResId()I

    move-result v1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->getFormatArgs()[Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;)V

    return-object v0
.end method

.method protected getErrorMessageResId()I
    .locals 1

    .line 25
    iget v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->errorMessageResId:I

    return v0
.end method

.method protected getFormatArgs()[Ljava/lang/Object;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;->formatArgs:[Ljava/lang/Object;

    return-object v0
.end method

.method public isFull()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isValid()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
