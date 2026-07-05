.class public final Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;
.super Ljava/lang/Object;
.source "CheckboxFieldController.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/uicore/elements/CheckboxFieldController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LabelResource"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B%\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0005\"\u00020\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u001b\u0010\n\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;",
        "",
        "labelId",
        "",
        "args",
        "",
        "<init>",
        "(I[Ljava/lang/Object;)V",
        "getLabelId",
        "()I",
        "formatArgs",
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
.field private final formatArgs:[Ljava/lang/Object;

.field private final labelId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public varargs constructor <init>(I[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "args"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;->labelId:I

    .line 23
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;->formatArgs:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getFormatArgs()[Ljava/lang/Object;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;->formatArgs:[Ljava/lang/Object;

    return-object v0
.end method

.method public final getLabelId()I
    .locals 1

    .line 20
    iget v0, p0, Lcom/stripe/android/uicore/elements/CheckboxFieldController$LabelResource;->labelId:I

    return v0
.end method
