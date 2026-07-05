.class public interface abstract Lcom/stripe/android/paymentsheet/FormHelper;
.super Ljava/lang/Object;
.source "FormHelper.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/paymentsheet/FormHelper$FormType;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008`\u0018\u00002\u00020\u0001:\u0001\u0014J\u0016\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0014\u0010\u0007\u001a\u00020\u00082\n\u0010\t\u001a\u00060\u0006j\u0002`\nH&J\u001a\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H&J\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H&J\u0014\u0010\u0012\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0006j\u0002`\nH&\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/FormHelper;",
        "",
        "formElementsForCode",
        "",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "code",
        "",
        "createFormArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "paymentMethodCode",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "onFormFieldValuesChanged",
        "",
        "formValues",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "selectedPaymentMethodCode",
        "getPaymentMethodParams",
        "Lcom/stripe/android/model/PaymentMethodCreateParams;",
        "formTypeForCode",
        "Lcom/stripe/android/paymentsheet/FormHelper$FormType;",
        "FormType",
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
.method public abstract createFormArguments(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
.end method

.method public abstract formElementsForCode(Ljava/lang/String;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end method

.method public abstract formTypeForCode(Ljava/lang/String;)Lcom/stripe/android/paymentsheet/FormHelper$FormType;
.end method

.method public abstract getPaymentMethodParams(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams;
.end method

.method public abstract onFormFieldValuesChanged(Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/lang/String;)V
.end method
