.class public interface abstract Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;
.super Ljava/lang/Object;
.source "CustomerSheetEventReporter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001:\u0003345J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0008\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0002\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0018H&\u00a2\u0006\u0002\u0010\u0019J\u0008\u0010\u001b\u001a\u00020\u0003H&J\u0008\u0010\u001c\u001a\u00020\u0003H&J\u0008\u0010\u001d\u001a\u00020\u0003H&J\u0008\u0010\u001e\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0010\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H&J\u001a\u0010)\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010(H&J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H&J\u0012\u0010+\u001a\u00020\u00032\u0008\u0010\'\u001a\u0004\u0018\u00010(H&J\u001a\u0010,\u001a\u00020\u00032\u0008\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010\u000c\u001a\u00020\rH&J\u0008\u0010-\u001a\u00020\u0003H&J\u0010\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020(H&J\u0010\u00100\u001a\u00020\u00032\u0006\u00101\u001a\u000202H&\u00a8\u00066"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter;",
        "",
        "onInit",
        "",
        "configuration",
        "Lcom/stripe/android/customersheet/CustomerSheet$Configuration;",
        "integrationType",
        "Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;",
        "onLoadSucceeded",
        "customerSheetSession",
        "Lcom/stripe/android/customersheet/data/CustomerSheetSession;",
        "onLoadFailed",
        "error",
        "",
        "onScreenPresented",
        "screen",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;",
        "onScreenHidden",
        "onPaymentMethodSelected",
        "code",
        "",
        "onConfirmPaymentMethodSucceeded",
        "type",
        "syncDefaultEnabled",
        "",
        "(Ljava/lang/String;Ljava/lang/Boolean;)V",
        "onConfirmPaymentMethodFailed",
        "onEditTapped",
        "onEditCompleted",
        "onRemovePaymentMethodSucceeded",
        "onRemovePaymentMethodFailed",
        "onAttachPaymentMethodSucceeded",
        "style",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;",
        "onAttachPaymentMethodCanceled",
        "onAttachPaymentMethodFailed",
        "onShowPaymentOptionBrands",
        "source",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;",
        "selectedBrand",
        "Lcom/stripe/android/model/CardBrand;",
        "onHidePaymentOptionBrands",
        "onBrandChoiceSelected",
        "onUpdatePaymentMethodSucceeded",
        "onUpdatePaymentMethodFailed",
        "onCardNumberCompleted",
        "onDisallowedCardBrandEntered",
        "brand",
        "onAnalyticsEvent",
        "event",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "Screen",
        "AddPaymentMethodStyle",
        "CardBrandChoiceEventSource",
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
.method public abstract onAnalyticsEvent(Lcom/stripe/android/core/networking/AnalyticsEvent;)V
.end method

.method public abstract onAttachPaymentMethodCanceled(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
.end method

.method public abstract onAttachPaymentMethodFailed(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
.end method

.method public abstract onAttachPaymentMethodSucceeded(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$AddPaymentMethodStyle;)V
.end method

.method public abstract onBrandChoiceSelected(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onCardNumberCompleted()V
.end method

.method public abstract onConfirmPaymentMethodFailed(Ljava/lang/String;Ljava/lang/Boolean;)V
.end method

.method public abstract onConfirmPaymentMethodSucceeded(Ljava/lang/String;Ljava/lang/Boolean;)V
.end method

.method public abstract onDisallowedCardBrandEntered(Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onEditCompleted()V
.end method

.method public abstract onEditTapped()V
.end method

.method public abstract onHidePaymentOptionBrands(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onInit(Lcom/stripe/android/customersheet/CustomerSheet$Configuration;Lcom/stripe/android/customersheet/CustomerSheetIntegration$Type;)V
.end method

.method public abstract onLoadFailed(Ljava/lang/Throwable;)V
.end method

.method public abstract onLoadSucceeded(Lcom/stripe/android/customersheet/data/CustomerSheetSession;)V
.end method

.method public abstract onPaymentMethodSelected(Ljava/lang/String;)V
.end method

.method public abstract onRemovePaymentMethodFailed()V
.end method

.method public abstract onRemovePaymentMethodSucceeded()V
.end method

.method public abstract onScreenHidden(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V
.end method

.method public abstract onScreenPresented(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$Screen;)V
.end method

.method public abstract onShowPaymentOptionBrands(Lcom/stripe/android/customersheet/analytics/CustomerSheetEventReporter$CardBrandChoiceEventSource;Lcom/stripe/android/model/CardBrand;)V
.end method

.method public abstract onUpdatePaymentMethodFailed(Lcom/stripe/android/model/CardBrand;Ljava/lang/Throwable;)V
.end method

.method public abstract onUpdatePaymentMethodSucceeded(Lcom/stripe/android/model/CardBrand;)V
.end method
