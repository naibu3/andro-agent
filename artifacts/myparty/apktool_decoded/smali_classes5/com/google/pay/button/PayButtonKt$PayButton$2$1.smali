.class final Lcom/google/pay/button/PayButtonKt$PayButton$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "PayButton.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/pay/button/PayButtonKt;->PayButton-PfoAEA0(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/google/pay/button/ButtonTheme;Lcom/google/pay/button/ButtonType;FZLandroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/wallet/button/PayButton;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $enabled:Z

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/google/pay/button/PayButtonKt$PayButton$2$1;->$enabled:Z

    iput-object p2, p0, Lcom/google/pay/button/PayButtonKt$PayButton$2$1;->$onClick:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 76
    check-cast p1, Lcom/google/android/gms/wallet/button/PayButton;

    invoke-virtual {p0, p1}, Lcom/google/pay/button/PayButtonKt$PayButton$2$1;->invoke(Lcom/google/android/gms/wallet/button/PayButton;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/google/android/gms/wallet/button/PayButton;)V
    .locals 3

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-boolean v0, p0, Lcom/google/pay/button/PayButtonKt$PayButton$2$1;->$enabled:Z

    iget-object v1, p0, Lcom/google/pay/button/PayButtonKt$PayButton$2$1;->$onClick:Lkotlin/jvm/functions/Function0;

    if-eqz v0, :cond_0

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/high16 v2, 0x3f000000    # 0.5f

    .line 78
    :goto_0
    invoke-virtual {p1, v2}, Lcom/google/android/gms/wallet/button/PayButton;->setAlpha(F)V

    .line 79
    invoke-virtual {p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;->setEnabled(Z)V

    if-eqz v0, :cond_1

    .line 82
    new-instance v0, Lcom/google/pay/button/PayButtonKt$PayButton$2$1$1$1;

    invoke-direct {v0, v1}, Lcom/google/pay/button/PayButtonKt$PayButton$2$1$1$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :cond_1
    const/4 v0, 0x0

    .line 84
    invoke-virtual {p1, v0}, Lcom/google/android/gms/wallet/button/PayButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
