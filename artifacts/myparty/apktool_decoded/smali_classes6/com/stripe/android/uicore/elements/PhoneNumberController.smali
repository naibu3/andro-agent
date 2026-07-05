.class public final Lcom/stripe/android/uicore/elements/PhoneNumberController;
.super Ljava/lang/Object;
.source "PhoneNumberController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/InputController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPhoneNumberController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNumberController.kt\ncom/stripe/android/uicore/elements/PhoneNumberController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IBC\u0008\u0002\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0006\u00103\u001a\u00020\u0004J\u000e\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u0004J\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u00020\u0004J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0004J\u0010\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020\u0004H\u0016J\u000e\u0010=\u001a\u0002092\u0006\u0010>\u001a\u00020\tJ=\u0010?\u001a\u0002092\u0006\u0010@\u001a\u00020\t2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020F0\u00072\u0008\u0010G\u001a\u0004\u0018\u00010FH\u0017\u00a2\u0006\u0002\u0010HR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0008\u001a\u00020\tX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\"0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u0015R\u001a\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010\u0015R\u001a\u0010(\u001a\u0008\u0012\u0004\u0012\u00020)0\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\u0015R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0\u0012X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010\u0015R\u0017\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u0015R\u0017\u00100\u001a\u0008\u0012\u0004\u0012\u0002010\u0012\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u0010\u0015\u00a8\u0006J"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/PhoneNumberController;",
        "Lcom/stripe/android/uicore/elements/InputController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "initialPhoneNumber",
        "",
        "initiallySelectedCountryCode",
        "overrideCountryCodes",
        "",
        "showOptionalLabel",
        "",
        "acceptAnyInput",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V",
        "getInitialPhoneNumber",
        "()Ljava/lang/String;",
        "getShowOptionalLabel",
        "()Z",
        "label",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getLabel",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "_fieldValue",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "fieldValue",
        "getFieldValue",
        "_hasFocus",
        "countryConfig",
        "Lcom/stripe/android/uicore/elements/CountryConfig;",
        "countryDropdownController",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "getCountryDropdownController",
        "()Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "phoneNumberFormatter",
        "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
        "phoneNumberMinimumLength",
        "",
        "rawFieldValue",
        "getRawFieldValue",
        "isComplete",
        "formFieldValue",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValue",
        "error",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "placeholder",
        "getPlaceholder",
        "visualTransformation",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "getVisualTransformation",
        "getCountryCode",
        "getE164PhoneNumber",
        "phoneNumber",
        "getLocalNumber",
        "formatLocalNumber",
        "onValueChange",
        "",
        "displayFormatted",
        "onRawValueChange",
        "rawValue",
        "onFocusChange",
        "newHasFocus",
        "ComposeUI",
        "enabled",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "hiddenIdentifiers",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "lastTextFieldIdentifier",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
        "Companion",
        "stripe-ui-core_release"
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

.field public static final Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;


# instance fields
.field private final _fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final _hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final acceptAnyInput:Z

.field private final countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

.field private final countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private final fieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final formFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation
.end field

.field private final initialPhoneNumber:Ljava/lang/String;

.field private final isComplete:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final label:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;",
            ">;"
        }
    .end annotation
.end field

.field private final phoneNumberMinimumLength:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final placeholder:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final showOptionalLabel:Z

.field private final visualTransformation:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$Djy4rZ91jAAH5lRVP8tDYjUO-LI(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig$lambda$2(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$Jk2SGjbB2GI_UO-8Wh_cIeTzNqg(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig$lambda$1(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$LgjsAcgUtDNLzv8eKDACjQaQfKM(Ljava/lang/String;ZZ)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->error$lambda$8(Ljava/lang/String;ZZ)Lcom/stripe/android/uicore/elements/FieldError;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$T6TjMQGhZx4hAfTVPCXsIlaAUeI(Ljava/lang/String;Z)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->formFieldValue$lambda$7(Ljava/lang/String;Z)Lcom/stripe/android/uicore/forms/FormFieldEntry;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$anNB-coslQKbShgPTrlDrpEwyY8(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete$lambda$6(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/String;Ljava/lang/Integer;)Z

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$eyiZRdurljpv2tAurMTxUmf1W9w(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->visualTransformation$lambda$10(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$t3cIMKWgN-fAFQ5r7IWOs46Y8zw(Ljava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->rawFieldValue$lambda$5(Ljava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$x-obZwSaxJgI9BAJZ3oLl0dXBsA(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter$lambda$3(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$xIum3DsI1bXMuIL4UMJ7r011_B0(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->placeholder$lambda$9(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$z7Gh0fQMsmxIz7etg0KTOLR2yj4(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberMinimumLength$lambda$4(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->$stable:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->initialPhoneNumber:Ljava/lang/String;

    .line 23
    iput-boolean p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->showOptionalLabel:Z

    .line 24
    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->acceptAnyInput:Z

    .line 27
    sget p4, Lcom/stripe/android/core/R$string;->stripe_address_label_phone_number:I

    const/4 p5, 0x0

    new-array v0, p5, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-static {p4, v0, v1, v2, v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object p4

    .line 26
    invoke-static {p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->label:Lkotlinx/coroutines/flow/StateFlow;

    .line 30
    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 35
    invoke-static {p1}, Lkotlinx/coroutines/flow/FlowKt;->asStateFlow(Lkotlinx/coroutines/flow/MutableStateFlow;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    invoke-static {p5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 41
    sget-object p4, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Condensed;->INSTANCE:Lcom/stripe/android/uicore/elements/DropdownConfig$Mode$Condensed;

    .line 39
    new-instance v0, Lcom/stripe/android/uicore/elements/CountryConfig;

    .line 41
    move-object v3, p4

    check-cast v3, Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;

    .line 39
    new-instance v5, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda0;

    invoke-direct {v5}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda0;-><init>()V

    new-instance v6, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda1;

    invoke-direct {v6}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda1;-><init>()V

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p3

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    .line 56
    new-instance p3, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    .line 57
    check-cast v0, Lcom/stripe/android/uicore/elements/DropdownConfig;

    .line 56
    invoke-direct {p3, v0, p2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    .line 61
    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getSelectedIndex()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    new-instance p4, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda2;

    invoke-direct {p4, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    invoke-static {p2, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    .line 67
    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getSelectedIndex()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    new-instance p4, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda3;

    invoke-direct {p4, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda3;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    invoke-static {p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberMinimumLength:Lkotlinx/coroutines/flow/StateFlow;

    .line 76
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    new-instance p5, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda4;

    invoke-direct {p5}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {p4, p2, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    iput-object p4, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 79
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    new-instance p5, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda5;

    invoke-direct {p5, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    invoke-static {p4, p3, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    .line 82
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    new-instance p5, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda6;

    invoke-direct {p5}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda6;-><init>()V

    invoke-static {p3, p4, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    .line 87
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    .line 88
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p4

    .line 89
    check-cast p1, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p5, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda7;

    invoke-direct {p5}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda7;-><init>()V

    .line 86
    invoke-static {p3, p4, p1, p5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 98
    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda8;

    invoke-direct {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda8;-><init>()V

    invoke-static {p2, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->placeholder:Lkotlinx/coroutines/flow/StateFlow;

    .line 100
    new-instance p1, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda9;

    invoke-direct {p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController$$ExternalSyntheticLambda9;-><init>()V

    invoke-static {p2, p1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 20
    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    .line 22
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object p3

    :cond_2
    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    move p7, v0

    move-object p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    goto :goto_0

    :cond_4
    move p7, p5

    move p6, p4

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 19
    :goto_0
    invoke-direct/range {p2 .. p7}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZLkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/uicore/elements/PhoneNumberController;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZ)V

    return-void
.end method

.method private static final countryConfig$lambda$1(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;
    .locals 9

    const-string v0, "country"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    .line 51
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/stripe/android/uicore/elements/CountryConfig;->Companion:Lcom/stripe/android/uicore/elements/CountryConfig$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/uicore/elements/CountryConfig$Companion;->countryCodeToEmoji$stripe_ui_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 52
    sget-object v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->prefixForCountry$stripe_ui_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v1, 0x1

    aput-object p0, v0, v1

    .line 50
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .line 53
    const-string p0, ""

    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final countryConfig$lambda$2(Lcom/stripe/android/core/model/Country;)Ljava/lang/String;
    .locals 9

    const-string v0, "country"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    .line 44
    new-array v0, v0, [Ljava/lang/String;

    sget-object v1, Lcom/stripe/android/uicore/elements/CountryConfig;->Companion:Lcom/stripe/android/uicore/elements/CountryConfig$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/stripe/android/uicore/elements/CountryConfig$Companion;->countryCodeToEmoji$stripe_ui_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    .line 45
    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 46
    sget-object v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->prefixForCountry$stripe_ui_core_release(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x2

    aput-object p0, v0, v1

    .line 43
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    .line 47
    const-string p0, " "

    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    const/16 v7, 0x3e

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final error$lambda$8(Ljava/lang/String;ZZ)Lcom/stripe/android/uicore/elements/FieldError;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    check-cast p0, Ljava/lang/CharSequence;

    invoke-static {p0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    .line 92
    new-instance p0, Lcom/stripe/android/uicore/elements/FieldError;

    sget p1, Lcom/stripe/android/uicore/R$string;->stripe_incomplete_phone_number:I

    const/4 p2, 0x2

    invoke-direct {p0, p1, v0, p2, v0}, Lcom/stripe/android/uicore/elements/FieldError;-><init>(I[Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_0
    return-object v0
.end method

.method private static final formFieldValue$lambda$7(Ljava/lang/String;Z)Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    const-string v0, "rawFieldValue"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    new-instance v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;Z)V

    return-object v0
.end method

.method private static final isComplete$lambda$6(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/String;Ljava/lang/Integer;)Z
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    if-ge p1, p2, :cond_2

    iget-boolean p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->acceptAnyInput:Z

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final phoneNumberFormatter$lambda$3(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;
    .locals 1

    .line 62
    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    .line 63
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/CountryConfig;->getCountries$stripe_ui_core_release()Ljava/util/List;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p0

    .line 62
    invoke-virtual {v0, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->forCountry(Ljava/lang/String;)Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    move-result-object p0

    return-object p0
.end method

.method private static final phoneNumberMinimumLength$lambda$4(Lcom/stripe/android/uicore/elements/PhoneNumberController;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    .line 68
    sget-object v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;

    .line 69
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryConfig:Lcom/stripe/android/uicore/elements/CountryConfig;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/CountryConfig;->getCountries$stripe_ui_core_release()Ljava/util/List;

    move-result-object p0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/core/model/Country;

    invoke-virtual {p0}, Lcom/stripe/android/core/model/Country;->getCode()Lcom/stripe/android/core/model/CountryCode;

    move-result-object p0

    invoke-virtual {p0}, Lcom/stripe/android/core/model/CountryCode;->getValue()Ljava/lang/String;

    move-result-object p0

    .line 68
    invoke-virtual {v0, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$Companion;->lengthForCountry(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final placeholder$lambda$9(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getPlaceholder()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final rawFieldValue$lambda$5(Ljava/lang/String;Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Ljava/lang/String;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    invoke-virtual {p1, p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->toE164Format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final visualTransformation$lambda$10(Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;)Landroidx/compose/ui/text/input/VisualTransformation;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getVisualTransformation()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/util/Set<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p7

    const-string v1, "field"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "modifier"

    move-object/from16 v4, p3

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hiddenIdentifiers"

    move-object/from16 v3, p4

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x50125283

    move-object/from16 v11, p6

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v5, "com.stripe.android.uicore.elements.PhoneNumberController.ComposeUI (PhoneNumberController.kt:186)"

    .line 187
    invoke-static {v1, v0, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 192
    :cond_0
    invoke-interface {v2}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    move-object/from16 v2, p5

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 193
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNext-eUduSuo()I

    move-result v1

    goto :goto_0

    .line 195
    :cond_1
    sget-object v1, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDone-eUduSuo()I

    move-result v1

    :goto_0
    move v10, v1

    and-int/lit8 v1, v0, 0xe

    shr-int/lit8 v2, v0, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x380

    or-int v12, v1, v0

    const/16 v13, 0xf8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v3, p0

    move v2, p1

    .line 188
    invoke-static/range {v2 .. v13}, Lcom/stripe/android/uicore/elements/PhoneNumberElementUIKt;->PhoneNumberElementUI-Rts_TWA(ZLcom/stripe/android/uicore/elements/PhoneNumberController;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/focus/FocusRequester;Lkotlin/jvm/functions/Function2;ILandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2
    invoke-interface/range {p6 .. p6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final formatLocalNumber()Ljava/lang/String;
    .locals 3

    .line 110
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getLocalNumber()Ljava/lang/String;

    move-result-object v0

    .line 111
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    .line 112
    invoke-virtual {v1, v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter$WithRegion;->formatNumberNational(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    return-object v1

    :cond_2
    :goto_1
    return-object v0
.end method

.method public final getCountryCode()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getCountryCode()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->countryDropdownController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    return-object v0
.end method

.method public final getE164PhoneNumber(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "phoneNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->toE164Format(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getError()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->fieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFormFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->formFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getInitialPhoneNumber()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->initialPhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getLabel()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/core/strings/ResolvableString;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->label:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getLocalNumber()Ljava/lang/String;
    .locals 2

    .line 107
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->getPrefix()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPlaceholder()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->placeholder:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->rawFieldValue:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getShowOptionalLabel()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->showOptionalLabel:Z

    return v0
.end method

.method public final getVisualTransformation()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            ">;"
        }
    .end annotation

    .line 100
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->visualTransformation:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public isComplete()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->isComplete:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final onFocusChange(Z)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_hasFocus:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public onRawValueChange(Ljava/lang/String;)V
    .locals 1

    const-string v0, "rawValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    invoke-virtual {p0, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->onValueChange(Ljava/lang/String;)V

    return-void
.end method

.method public final onValueChange(Ljava/lang/String;)V
    .locals 2

    const-string v0, "displayFormatted"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->_fieldValue:Lkotlinx/coroutines/flow/MutableStateFlow;

    iget-object v1, p0, Lcom/stripe/android/uicore/elements/PhoneNumberController;->phoneNumberFormatter:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;

    invoke-virtual {v1, p1}, Lcom/stripe/android/uicore/elements/PhoneNumberFormatter;->userInputFilter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method
