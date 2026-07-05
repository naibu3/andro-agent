.class public final Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;
.super Lcom/stripe/android/customersheet/CustomerSheetViewState;
.source "CustomerSheetViewState.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/customersheet/CustomerSheetViewState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AddPaymentMethod"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u00cb\u0001\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u0013\u0012\u0008\u0010 \u001a\u0004\u0018\u00010!\u0012\u0006\u0010\"\u001a\u00020#\u00a2\u0006\u0004\u0008$\u0010%J\u0016\u0010B\u001a\u00020C2\u000c\u0010D\u001a\u0008\u0012\u0004\u0012\u00020F0EH\u0016J\r\u0010G\u001a\u00060\u0003j\u0002`\u0004H\u00c6\u0003J\u000f\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000f\u0010J\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003J\t\u0010K\u001a\u00020\rH\u00c6\u0003J\t\u0010L\u001a\u00020\u000fH\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\t\u0010N\u001a\u00020\u0013H\u00c6\u0003J\t\u0010O\u001a\u00020\u0013H\u00c6\u0003J\t\u0010P\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\t\u0010R\u001a\u00020\u0013H\u00c6\u0003J\t\u0010S\u001a\u00020\u0017H\u00c6\u0003J\t\u0010T\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\t\u0010W\u001a\u00020\u0013H\u00c6\u0003J\t\u0010X\u001a\u00020\u0013H\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010!H\u00c6\u0003J\t\u0010Z\u001a\u00020#H\u00c6\u0003J\u00ed\u0001\u0010[\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t2\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00062\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00132\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00172\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u00132\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00132\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00132\n\u0008\u0002\u0010 \u001a\u0004\u0018\u00010!2\u0008\u0008\u0002\u0010\"\u001a\u00020#H\u00c6\u0001J\u0013\u0010\\\u001a\u00020\u00132\u0008\u0010]\u001a\u0004\u0018\u00010^H\u00d6\u0003J\t\u0010_\u001a\u00020`H\u00d6\u0001J\t\u0010a\u001a\u00020\u0003H\u00d6\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010)R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u00100R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u00102R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u00104R\u0014\u0010\u0014\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u00104R\u0014\u0010\u0015\u001a\u00020\u0013X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u00104R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u00106R\u0011\u0010\u0018\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u00104R\u0011\u0010\u0019\u001a\u00020\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00106R\u0011\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u00106R\u0011\u0010\u001e\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008<\u00104R\u0011\u0010\u001f\u001a\u00020\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008=\u00104R\u0013\u0010 \u001a\u0004\u0018\u00010!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010?R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008@\u0010A\u00a8\u0006b"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;",
        "Lcom/stripe/android/customersheet/CustomerSheetViewState;",
        "paymentMethodCode",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "supportedPaymentMethods",
        "",
        "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
        "formFieldValues",
        "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "formElements",
        "Lcom/stripe/android/uicore/elements/FormElement;",
        "formArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "usBankAccountFormArguments",
        "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
        "draftPaymentSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "enabled",
        "",
        "isLiveMode",
        "isProcessing",
        "errorMessage",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "isFirstPaymentMethod",
        "primaryButtonLabel",
        "primaryButtonEnabled",
        "customPrimaryButtonUiState",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "mandateText",
        "showMandateAbovePrimaryButton",
        "displayDismissConfirmationModal",
        "bankAccountSelection",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "errorReporter",
        "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V",
        "getPaymentMethodCode",
        "()Ljava/lang/String;",
        "getSupportedPaymentMethods",
        "()Ljava/util/List;",
        "getFormFieldValues",
        "()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
        "getFormElements",
        "getFormArguments",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
        "getUsBankAccountFormArguments",
        "()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
        "getDraftPaymentSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "getEnabled",
        "()Z",
        "getErrorMessage",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "getPrimaryButtonLabel",
        "getPrimaryButtonEnabled",
        "getCustomPrimaryButtonUiState",
        "()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "getMandateText",
        "getShowMandateAbovePrimaryButton",
        "getDisplayDismissConfirmationModal",
        "getBankAccountSelection",
        "()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
        "getErrorReporter",
        "()Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
        "topBarState",
        "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;",
        "onEditIconPressed",
        "Lkotlin/Function0;",
        "",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "component17",
        "component18",
        "component19",
        "component20",
        "copy",
        "equals",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

.field private final customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

.field private final displayDismissConfirmationModal:Z

.field private final draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

.field private final enabled:Z

.field private final errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

.field private final errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

.field private final formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

.field private final formElements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation
.end field

.field private final formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

.field private final isFirstPaymentMethod:Z

.field private final isLiveMode:Z

.field private final isProcessing:Z

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;

.field private final paymentMethodCode:Ljava/lang/String;

.field private final primaryButtonEnabled:Z

.field private final primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

.field private final showMandateAbovePrimaryButton:Z

.field private final supportedPaymentMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private final usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "ZZZ",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "ZZ",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")V"
        }
    .end annotation

    move/from16 v0, p9

    move/from16 v1, p10

    move/from16 v2, p12

    move-object/from16 v3, p13

    move-object/from16 v4, p20

    const-string v5, "paymentMethodCode"

    invoke-static {p1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "supportedPaymentMethods"

    invoke-static {p2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "formElements"

    invoke-static {p4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "formArguments"

    invoke-static {p5, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "usBankAccountFormArguments"

    invoke-static {p6, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "primaryButtonLabel"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "errorReporter"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v5, v2, 0x1

    const/4 v6, 0x0

    .line 113
    invoke-direct {p0, v0, v1, v5, v6}, Lcom/stripe/android/customersheet/CustomerSheetViewState;-><init>(ZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 93
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    .line 94
    iput-object p2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    .line 95
    iput-object p3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    .line 96
    iput-object p4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    .line 97
    iput-object p5, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    .line 98
    iput-object p6, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    move-object p1, p7

    .line 99
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    move p1, p8

    .line 100
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    .line 101
    iput-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    .line 102
    iput-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    move-object/from16 p1, p11

    .line 103
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    .line 104
    iput-boolean v2, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    .line 105
    iput-object v3, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    move/from16 p1, p14

    .line 106
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    move-object/from16 p1, p15

    .line 107
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-object/from16 p1, p16

    .line 108
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    move/from16 p1, p17

    .line 109
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    move/from16 p1, p18

    .line 110
    iput-boolean p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    move-object/from16 p1, p19

    .line 111
    iput-object p1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    .line 112
    iput-object v4, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 24

    move/from16 v0, p21

    and-int/lit16 v1, v0, 0x400

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v14, v2

    goto :goto_0

    :cond_0
    move-object/from16 v14, p11

    :goto_0
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_1

    move-object/from16 v19, v2

    goto :goto_1

    :cond_1
    move-object/from16 v19, p16

    :goto_1
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move/from16 v20, v2

    goto :goto_2

    :cond_2
    move/from16 v20, p17

    :goto_2
    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    move/from16 v21, v2

    goto :goto_3

    :cond_3
    move/from16 v21, p18

    :goto_3
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move-object/from16 v10, p7

    move/from16 v11, p8

    move/from16 v12, p9

    move/from16 v13, p10

    move/from16 v15, p12

    move-object/from16 v16, p13

    move/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v22, p19

    move-object/from16 v23, p20

    .line 92
    invoke-direct/range {v3 .. v23}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;ILjava/lang/Object;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p21

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-boolean v13, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-boolean v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    goto :goto_d

    :cond_d
    move/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p21, v16

    move-object/from16 p2, v1

    if-eqz v16, :cond_10

    iget-boolean v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    goto :goto_10

    :cond_10
    move/from16 v1, p17

    :goto_10
    const/high16 v16, 0x20000

    and-int v16, p21, v16

    move/from16 p3, v1

    if-eqz v16, :cond_11

    iget-boolean v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    goto :goto_11

    :cond_11
    move/from16 v1, p18

    :goto_11
    const/high16 v16, 0x40000

    and-int v16, p21, v16

    move/from16 p4, v1

    if-eqz v16, :cond_12

    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    goto :goto_12

    :cond_12
    move-object/from16 v1, p19

    :goto_12
    const/high16 v16, 0x80000

    and-int v16, p21, v16

    if-eqz v16, :cond_13

    move-object/from16 p5, v1

    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    move-object/from16 p20, p5

    move-object/from16 p21, v1

    goto :goto_13

    :cond_13
    move-object/from16 p21, p20

    move-object/from16 p20, v1

    :goto_13
    move-object/from16 p17, p2

    move/from16 p18, p3

    move/from16 p19, p4

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move/from16 p15, v15

    move-object/from16 p2, p1

    move-object/from16 p1, v0

    invoke-virtual/range {p1 .. p21}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->copy(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    return v0
.end method

.method public final component11()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    return v0
.end method

.method public final component13()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component14()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    return v0
.end method

.method public final component15()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    return-object v0
.end method

.method public final component16()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final component17()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    return v0
.end method

.method public final component18()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    return v0
.end method

.method public final component19()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final component20()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method public final component6()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    return-object v0
.end method

.method public final component7()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/forms/FormFieldValues;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "ZZZ",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "Z",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            "ZZ",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;",
            "Lcom/stripe/android/payments/core/analytics/ErrorReporter;",
            ")",
            "Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;"
        }
    .end annotation

    const-string v0, "paymentMethodCode"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supportedPaymentMethods"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formElements"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formArguments"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usBankAccountFormArguments"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryButtonLabel"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    move-object/from16 v1, p20

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    move-object/from16 v4, p3

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    invoke-direct/range {v1 .. v21}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;-><init>(Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/paymentsheet/forms/FormFieldValues;Ljava/util/List;Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;Lcom/stripe/android/paymentsheet/model/PaymentSelection;ZZZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/core/strings/ResolvableString;ZLcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;Lcom/stripe/android/core/strings/ResolvableString;ZZLcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;Lcom/stripe/android/payments/core/analytics/ErrorReporter;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    iget-boolean v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    if-eq v1, v3, :cond_13

    return v2

    :cond_13
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    iget-object v3, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    iget-object p1, p1, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    return v2

    :cond_15
    return v0
.end method

.method public final getBankAccountSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;
    .locals 1

    .line 111
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    return-object v0
.end method

.method public final getCustomPrimaryButtonUiState()Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    return-object v0
.end method

.method public final getDisplayDismissConfirmationModal()Z
    .locals 1

    .line 110
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    return v0
.end method

.method public final getDraftPaymentSelection()Lcom/stripe/android/paymentsheet/model/PaymentSelection;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    return-object v0
.end method

.method public final getEnabled()Z
    .locals 1

    .line 100
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    return v0
.end method

.method public final getErrorMessage()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getErrorReporter()Lcom/stripe/android/payments/core/analytics/ErrorReporter;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    return-object v0
.end method

.method public final getFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    return-object v0
.end method

.method public final getFormElements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/FormElement;",
            ">;"
        }
    .end annotation

    .line 96
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    return-object v0
.end method

.method public final getFormFieldValues()Lcom/stripe/android/paymentsheet/forms/FormFieldValues;
    .locals 1

    .line 95
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    return-object v0
.end method

.method public final getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getPaymentMethodCode()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButtonEnabled()Z
    .locals 1

    .line 106
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    return v0
.end method

.method public final getPrimaryButtonLabel()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getShowMandateAbovePrimaryButton()Z
    .locals 1

    .line 109
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    return v0
.end method

.method public final getSupportedPaymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/lpmfoundations/luxe/SupportedPaymentMethod;",
            ">;"
        }
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getUsBankAccountFormArguments()Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/forms/FormFieldValues;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    if-nez v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isFirstPaymentMethod()Z
    .locals 1

    .line 104
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    return v0
.end method

.method public isLiveMode()Z
    .locals 1

    .line 101
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    return v0
.end method

.method public isProcessing()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->paymentMethodCode:Ljava/lang/String;

    iget-object v2, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->supportedPaymentMethods:Ljava/util/List;

    iget-object v3, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formFieldValues:Lcom/stripe/android/paymentsheet/forms/FormFieldValues;

    iget-object v4, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formElements:Ljava/util/List;

    iget-object v5, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->formArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/FormArguments;

    iget-object v6, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->usBankAccountFormArguments:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormArguments;

    iget-object v7, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->draftPaymentSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection;

    iget-boolean v8, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->enabled:Z

    iget-boolean v9, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode:Z

    iget-boolean v10, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isProcessing:Z

    iget-object v11, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorMessage:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v12, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isFirstPaymentMethod:Z

    iget-object v13, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonLabel:Lcom/stripe/android/core/strings/ResolvableString;

    iget-boolean v14, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->primaryButtonEnabled:Z

    iget-object v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->customPrimaryButtonUiState:Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    move-object/from16 v17, v15

    iget-boolean v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->showMandateAbovePrimaryButton:Z

    move/from16 v18, v15

    iget-boolean v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->displayDismissConfirmationModal:Z

    move/from16 v19, v15

    iget-object v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->bankAccountSelection:Lcom/stripe/android/paymentsheet/model/PaymentSelection$New$USBankAccount;

    move-object/from16 v20, v15

    iget-object v15, v0, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->errorReporter:Lcom/stripe/android/payments/core/analytics/ErrorReporter;

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v21, v15

    const-string v15, "AddPaymentMethod(paymentMethodCode="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", supportedPaymentMethods="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formFieldValues="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formElements="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", formArguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", usBankAccountFormArguments="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", draftPaymentSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isLiveMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isProcessing="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorMessage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isFirstPaymentMethod="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryButtonLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", primaryButtonEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", customPrimaryButtonUiState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mandateText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", showMandateAbovePrimaryButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", displayDismissConfirmationModal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bankAccountSelection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", errorReporter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    move-object/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public topBarState(Lkotlin/jvm/functions/Function0;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;"
        }
    .end annotation

    const-string v0, "onEditIconPressed"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    sget-object p1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;

    .line 120
    invoke-virtual {p0}, Lcom/stripe/android/customersheet/CustomerSheetViewState$AddPaymentMethod;->isLiveMode()Z

    move-result v0

    .line 121
    sget-object v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable$Never;

    check-cast v1, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;

    .line 119
    invoke-virtual {p1, v0, v1}, Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarStateFactory;->create(ZLcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState$Editable;)Lcom/stripe/android/paymentsheet/ui/PaymentSheetTopBarState;

    move-result-object p1

    return-object p1
.end method
