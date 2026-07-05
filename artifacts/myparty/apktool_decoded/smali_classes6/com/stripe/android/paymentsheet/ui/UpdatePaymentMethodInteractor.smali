.class public interface abstract Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;
.super Ljava/lang/Object;
.source "UpdatePaymentMethodInteractor.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Status;,
        Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008`\u0018\u0000 62\u00020\u0001:\u00043456J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\tR\u0012\u0010\u0017\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\tR\u0012\u0010\u0018\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\tR\u0012\u0010\u001a\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\tR\u0012\u0010\u001c\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\tR\u0012\u0010\u001e\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\tR\u0012\u0010 \u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\tR\u0012\u0010\"\u001a\u00020#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0012\u0010&\u001a\u00020\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0018\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;",
        "",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "getTopBarState",
        "()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "canRemove",
        "",
        "getCanRemove",
        "()Z",
        "displayableSavedPaymentMethod",
        "Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "getDisplayableSavedPaymentMethod",
        "()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;",
        "screenTitle",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getScreenTitle",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "cardBrandFilter",
        "Lcom/stripe/android/CardBrandFilter;",
        "getCardBrandFilter",
        "()Lcom/stripe/android/CardBrandFilter;",
        "isExpiredCard",
        "isModifiablePaymentMethod",
        "hasValidBrandChoices",
        "getHasValidBrandChoices",
        "shouldShowSetAsDefaultCheckbox",
        "getShouldShowSetAsDefaultCheckbox",
        "setAsDefaultCheckboxEnabled",
        "getSetAsDefaultCheckboxEnabled",
        "shouldShowSaveButton",
        "getShouldShowSaveButton",
        "canUpdateFullPaymentMethodDetails",
        "getCanUpdateFullPaymentMethodDetails",
        "addressCollectionMode",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "getAddressCollectionMode",
        "()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;",
        "editCardDetailsInteractor",
        "Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "getEditCardDetailsInteractor",
        "()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;",
        "state",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
        "getState",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "handleViewAction",
        "",
        "viewAction",
        "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;",
        "State",
        "Status",
        "ViewAction",
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
.field public static final Companion:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;->$$INSTANCE:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    sput-object v0, Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor;->Companion:Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$Companion;

    return-void
.end method


# virtual methods
.method public abstract getAddressCollectionMode()Lcom/stripe/android/paymentsheet/PaymentSheet$BillingDetailsCollectionConfiguration$AddressCollectionMode;
.end method

.method public abstract getCanRemove()Z
.end method

.method public abstract getCanUpdateFullPaymentMethodDetails()Z
.end method

.method public abstract getCardBrandFilter()Lcom/stripe/android/CardBrandFilter;
.end method

.method public abstract getDisplayableSavedPaymentMethod()Lcom/stripe/android/paymentsheet/DisplayableSavedPaymentMethod;
.end method

.method public abstract getEditCardDetailsInteractor()Lcom/stripe/android/paymentsheet/ui/EditCardDetailsInteractor;
.end method

.method public abstract getHasValidBrandChoices()Z
.end method

.method public abstract getScreenTitle()Lcom/stripe/android/core/strings/ResolvableString;
.end method

.method public abstract getSetAsDefaultCheckboxEnabled()Z
.end method

.method public abstract getShouldShowSaveButton()Z
.end method

.method public abstract getShouldShowSetAsDefaultCheckbox()Z
.end method

.method public abstract getState()Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$State;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getTopBarState()Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
.end method

.method public abstract handleViewAction(Lcom/stripe/android/paymentsheet/ui/UpdatePaymentMethodInteractor$ViewAction;)V
.end method

.method public abstract isExpiredCard()Z
.end method

.method public abstract isModifiablePaymentMethod()Z
.end method
