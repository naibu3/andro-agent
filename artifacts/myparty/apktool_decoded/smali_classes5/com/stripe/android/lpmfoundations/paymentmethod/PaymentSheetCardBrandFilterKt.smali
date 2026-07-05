.class public final Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilterKt;
.super Ljava/lang/Object;
.source "PaymentSheetCardBrandFilter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilterKt$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toBrandCategory",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;",
        "Lcom/stripe/android/model/CardBrand;",
        "paymentsheet_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toBrandCategory(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    sget-object v0, Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentSheetCardBrandFilterKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p0}, Lcom/stripe/android/model/CardBrand;->ordinal()I

    move-result p0

    aget p0, v0, p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 51
    :pswitch_0
    sget-object p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Discover:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object p0

    .line 47
    :pswitch_1
    sget-object p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Amex:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object p0

    .line 46
    :pswitch_2
    sget-object p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Mastercard:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object p0

    .line 45
    :pswitch_3
    sget-object p0, Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;->Visa:Lcom/stripe/android/paymentsheet/PaymentSheet$CardBrandAcceptance$BrandCategory;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
