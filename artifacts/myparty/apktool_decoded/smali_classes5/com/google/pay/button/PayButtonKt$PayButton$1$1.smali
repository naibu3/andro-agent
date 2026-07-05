.class final Lcom/google/pay/button/PayButtonKt$PayButton$1$1;
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
        "Landroid/content/Context;",
        "Lcom/google/android/gms/wallet/button/PayButton;",
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
.field final synthetic $allowedPaymentMethods:Ljava/lang/String;

.field final synthetic $radiusPixelValue:I

.field final synthetic $theme:Lcom/google/pay/button/ButtonTheme;

.field final synthetic $type:Lcom/google/pay/button/ButtonType;


# direct methods
.method constructor <init>(Lcom/google/pay/button/ButtonTheme;Lcom/google/pay/button/ButtonType;ILjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$theme:Lcom/google/pay/button/ButtonTheme;

    iput-object p2, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$type:Lcom/google/pay/button/ButtonType;

    iput p3, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$radiusPixelValue:I

    iput-object p4, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$allowedPaymentMethods:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Landroid/content/Context;)Lcom/google/android/gms/wallet/button/PayButton;
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    new-instance v0, Lcom/google/android/gms/wallet/button/PayButton;

    invoke-direct {v0, p1}, Lcom/google/android/gms/wallet/button/PayButton;-><init>(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$theme:Lcom/google/pay/button/ButtonTheme;

    iget-object v1, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$type:Lcom/google/pay/button/ButtonType;

    iget v2, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$radiusPixelValue:I

    iget-object v3, p0, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->$allowedPaymentMethods:Ljava/lang/String;

    .line 67
    invoke-static {}, Lcom/google/android/gms/wallet/button/ButtonOptions;->newBuilder()Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object v4

    .line 68
    invoke-virtual {p1}, Lcom/google/pay/button/ButtonTheme;->getValue()I

    move-result p1

    invoke-virtual {v4, p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonTheme(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p1

    .line 69
    invoke-virtual {v1}, Lcom/google/pay/button/ButtonType;->getValue()I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setButtonType(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p1

    .line 70
    invoke-virtual {p1, v2}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setCornerRadius(I)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p1

    .line 71
    invoke-virtual {p1, v3}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->setAllowedPaymentMethods(Ljava/lang/String;)Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;

    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/google/android/gms/wallet/button/ButtonOptions$Builder;->build()Lcom/google/android/gms/wallet/button/ButtonOptions;

    move-result-object p1

    .line 66
    invoke-virtual {v0, p1}, Lcom/google/android/gms/wallet/button/PayButton;->initialize(Lcom/google/android/gms/wallet/button/ButtonOptions;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 64
    check-cast p1, Landroid/content/Context;

    invoke-virtual {p0, p1}, Lcom/google/pay/button/PayButtonKt$PayButton$1$1;->invoke(Landroid/content/Context;)Lcom/google/android/gms/wallet/button/PayButton;

    move-result-object p1

    return-object p1
.end method
