.class public final Lcom/stripe/android/paymentelement/embedded/form/FormContract;
.super Landroidx/activity/result/contract/ActivityResultContract;
.source "FormContract.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/activity/result/contract/ActivityResultContract<",
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormResult;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0008\u00c1\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract;",
        "Landroidx/activity/result/contract/ActivityResultContract;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;",
        "Lcom/stripe/android/paymentelement/embedded/form/FormResult;",
        "<init>",
        "()V",
        "EXTRA_ARGS",
        "",
        "createIntent",
        "Landroid/content/Intent;",
        "context",
        "Landroid/content/Context;",
        "input",
        "parseResult",
        "resultCode",
        "",
        "intent",
        "Args",
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
.field public static final $stable:I = 0x0

.field public static final EXTRA_ARGS:Ljava/lang/String; = "extra_activity_args"

.field public static final INSTANCE:Lcom/stripe/android/paymentelement/embedded/form/FormContract;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentelement/embedded/form/FormContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentelement/embedded/form/FormContract;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentelement/embedded/form/FormContract;->INSTANCE:Lcom/stripe/android/paymentelement/embedded/form/FormContract;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 43
    invoke-direct {p0}, Landroidx/activity/result/contract/ActivityResultContract;-><init>()V

    return-void
.end method


# virtual methods
.method public createIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;)Landroid/content/Intent;
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stripe/android/paymentelement/embedded/form/FormActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 48
    const-string p1, "extra_activity_args"

    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "putExtra(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public bridge synthetic createIntent(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    .line 43
    check-cast p2, Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormContract;->createIntent(Landroid/content/Context;Lcom/stripe/android/paymentelement/embedded/form/FormContract$Args;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public parseResult(ILandroid/content/Intent;)Lcom/stripe/android/paymentelement/embedded/form/FormResult;
    .locals 0

    .line 52
    sget-object p1, Lcom/stripe/android/paymentelement/embedded/form/FormResult;->Companion:Lcom/stripe/android/paymentelement/embedded/form/FormResult$Companion;

    invoke-virtual {p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormResult$Companion;->fromIntent(Landroid/content/Intent;)Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic parseResult(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    .line 43
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentelement/embedded/form/FormContract;->parseResult(ILandroid/content/Intent;)Lcom/stripe/android/paymentelement/embedded/form/FormResult;

    move-result-object p1

    return-object p1
.end method
