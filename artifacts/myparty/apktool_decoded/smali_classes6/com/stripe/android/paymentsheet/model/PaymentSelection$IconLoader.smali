.class public final Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;
.super Ljava/lang/Object;
.source "PaymentSelection.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/paymentsheet/model/PaymentSelection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconLoader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010\u0008\u001a\u00020\tH\u0002J,\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "imageLoader",
        "Lcom/stripe/android/uicore/image/StripeImageLoader;",
        "<init>",
        "(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V",
        "isDarkTheme",
        "",
        "load",
        "Landroid/graphics/drawable/Drawable;",
        "drawableResourceId",
        "",
        "lightThemeIconUrl",
        "",
        "darkThemeIconUrl",
        "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Companion",
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
.field public static final $stable:I

.field public static final Companion:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;

.field private static final emptyDrawable:Landroid/graphics/drawable/ShapeDrawable;


# instance fields
.field private final imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

.field private final resources:Landroid/content/res/Resources;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->Companion:Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->$stable:I

    .line 341
    new-instance v0, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->emptyDrawable:Landroid/graphics/drawable/ShapeDrawable;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;Lcom/stripe/android/uicore/image/StripeImageLoader;)V
    .locals 1
    .annotation runtime Ljavax/inject/Inject;
    .end annotation

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 298
    iput-object p1, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->resources:Landroid/content/res/Resources;

    .line 299
    iput-object p2, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    return-void
.end method

.method public static final synthetic access$getEmptyDrawable$cp()Landroid/graphics/drawable/ShapeDrawable;
    .locals 1

    .line 297
    sget-object v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->emptyDrawable:Landroid/graphics/drawable/ShapeDrawable;

    return-object v0
.end method

.method public static final synthetic access$load$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 297
    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final isDarkTheme()Z
    .locals 3

    .line 302
    iget-object v0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->resources:Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v0, v0, 0x30

    const/16 v2, 0x20

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method private static final load$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;",
            "I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;

    iget v1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget p3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->label:I

    sub-int/2addr p3, v2

    iput p3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;

    invoke-direct {v0, p3}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 322
    iget v2, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->I$0:I

    iget-object p0, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    check-cast p3, Lkotlin/Result;

    invoke-virtual {p3}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p2

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 323
    iget-object p3, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->imageLoader:Lcom/stripe/android/uicore/image/StripeImageLoader;

    iput-object p0, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->L$0:Ljava/lang/Object;

    iput p1, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->I$0:I

    iput v3, v0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader$load$loadIcon$1;->label:I

    invoke-virtual {p3, p2, v0}, Lcom/stripe/android/uicore/image/StripeImageLoader;->load-gIAlu-s(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-static {p2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_4

    const/4 p2, 0x0

    :cond_4
    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_5

    .line 324
    new-instance p1, Landroid/graphics/drawable/BitmapDrawable;

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->resources:Landroid/content/res/Resources;

    invoke-direct {p1, p0, p2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 323
    check-cast p1, Landroid/graphics/drawable/Drawable;

    return-object p1

    .line 325
    :cond_5
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method private static final load$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;I)Landroid/graphics/drawable/Drawable;
    .locals 2

    const/4 v0, 0x0

    .line 313
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 315
    iget-object p0, p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->resources:Landroid/content/res/Resources;

    .line 314
    invoke-static {p0, p1, v0}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 313
    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    .line 319
    :goto_0
    invoke-static {p0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    move-object v0, p0

    :goto_1
    check-cast v0, Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    sget-object p0, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->emptyDrawable:Landroid/graphics/drawable/ShapeDrawable;

    move-object v0, p0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final load(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 330
    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->isDarkTheme()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p3, :cond_0

    .line 331
    invoke-static {p0, p1, p3, p4}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    .line 333
    invoke-static {p0, p1, p2, p4}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load$loadIcon(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 335
    :cond_1
    invoke-static {p0, p1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;->load$loadResource(Lcom/stripe/android/paymentsheet/model/PaymentSelection$IconLoader;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method
