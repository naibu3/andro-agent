.class public final Lcom/stripe/android/uicore/elements/FieldError;
.super Ljava/lang/Object;
.source "SectionFieldErrorController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0008\u0002\u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0001\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001d\u0010\u0004\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0001\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u000c\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "",
        "errorMessage",
        "",
        "formatArgs",
        "",
        "<init>",
        "(I[Ljava/lang/Object;)V",
        "getErrorMessage",
        "()I",
        "getFormatArgs",
        "()[Ljava/lang/Object;",
        "[Ljava/lang/Object;",
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
.field private final errorMessage:I

.field private final formatArgs:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput p1, p0, Lcom/stripe/android/uicore/elements/FieldError;->errorMessage:I

    .line 23
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/FieldError;->formatArgs:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 21
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getErrorMessage()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/stripe/android/uicore/elements/FieldError;->errorMessage:I

    return v0
.end method

.method public final getFormatArgs()[Ljava/lang/Object;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/FieldError;->formatArgs:[Ljava/lang/Object;

    return-object v0
.end method
