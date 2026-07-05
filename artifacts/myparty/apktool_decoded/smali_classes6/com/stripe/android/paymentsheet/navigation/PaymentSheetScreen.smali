.class public interface abstract Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;
.super Ljava/lang/Object;
.source "PaymentSheetScreen.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AnimationStyle;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$DefaultImpls;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$ManageSavedPaymentMethods;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$UpdatePaymentMethod;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalMode;,
        Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalModeForm;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008p\u0018\u00002\u00020\u0001:\n%&\'()*+,-.J\u0010\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0003H&J \u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00032\u0006\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u0008H&J\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00032\u0006\u0010\u001d\u001a\u00020\u0008H&J\u0015\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\'\u00a2\u0006\u0002\u0010$R\u0018\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u000eR\u0012\u0010\u0011\u001a\u00020\u000cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0008X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\n\u0082\u0001\t/01234567\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "",
        "buyButtonState",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;",
        "getBuyButtonState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "showsContinueButton",
        "",
        "getShowsContinueButton",
        "()Z",
        "topContentPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "getTopContentPadding-D9Ej5fM",
        "()F",
        "bottomContentPadding",
        "getBottomContentPadding-D9Ej5fM",
        "walletsDividerSpacing",
        "getWalletsDividerSpacing-D9Ej5fM",
        "animationStyle",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AnimationStyle;",
        "getAnimationStyle",
        "()Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AnimationStyle;",
        "showsPaymentConfirmationMandates",
        "getShowsPaymentConfirmationMandates",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "title",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isCompleteFlow",
        "isWalletEnabled",
        "showsWalletsHeader",
        "Content",
        "",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V",
        "AnimationStyle",
        "Loading",
        "SelectSavedPaymentMethods",
        "AddAnotherPaymentMethod",
        "AddFirstPaymentMethod",
        "VerticalMode",
        "VerticalModeForm",
        "ManageSavedPaymentMethods",
        "CvcRecollection",
        "UpdatePaymentMethod",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddAnotherPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AddFirstPaymentMethod;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$CvcRecollection;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$Loading;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$ManageSavedPaymentMethods;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$SelectSavedPaymentMethods;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$UpdatePaymentMethod;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalMode;",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$VerticalModeForm;",
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


# virtual methods
.method public abstract Content(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
.end method

.method public abstract getAnimationStyle()Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen$AnimationStyle;
.end method

.method public abstract getBottomContentPadding-D9Ej5fM()F
.end method

.method public abstract getBuyButtonState()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/navigation/BuyButtonState;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getShowsContinueButton()Z
.end method

.method public abstract getShowsPaymentConfirmationMandates()Z
.end method

.method public abstract getTopContentPadding-D9Ej5fM()F
.end method

.method public abstract getWalletsDividerSpacing-D9Ej5fM()F
.end method

.method public abstract showsWalletsHeader(Z)Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end method

.method public abstract title(ZZ)Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end method

.method public abstract topBarState()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
            ">;"
        }
    .end annotation
.end method
