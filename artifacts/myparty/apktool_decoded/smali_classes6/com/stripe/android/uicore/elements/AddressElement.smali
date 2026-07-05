.class public final Lcom/stripe/android/uicore/elements/AddressElement;
.super Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;
.source "AddressElement.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/AddressFieldsElement;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAddressElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 StateFlows.kt\ncom/stripe/android/uicore/utils/StateFlowsKt\n+ 6 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 7 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 8 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 9 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,284:1\n2642#2:285\n1246#2,4:290\n1863#2,2:294\n1557#2:296\n1628#2,3:297\n1187#2,2:313\n1261#2,4:315\n1557#2:322\n1628#2,3:323\n1557#2:339\n1628#2,3:340\n1#3:286\n1#3:287\n462#4:288\n412#4:289\n203#5,5:300\n211#5:312\n203#5,5:326\n211#5:338\n203#5,5:343\n211#5:355\n283#6:305\n284#6:310\n283#6:331\n284#6:336\n283#6:348\n284#6:353\n37#7:306\n36#7,3:307\n37#7:332\n36#7,3:333\n37#7:349\n36#7,3:350\n105#8:311\n105#8:337\n105#8:354\n168#9,3:319\n*S KotlinDebug\n*F\n+ 1 AddressElement.kt\ncom/stripe/android/uicore/elements/AddressElement\n*L\n75#1:285\n112#1:290,4\n120#1:294,2\n132#1:296\n132#1:297,3\n144#1:313,2\n144#1:315,4\n217#1:322\n217#1:323,3\n228#1:339\n228#1:340,3\n75#1:286\n112#1:288\n112#1:289\n130#1:300,5\n130#1:312\n215#1:326,5\n215#1:338\n226#1:343,5\n226#1:355\n130#1:305\n130#1:310\n215#1:331\n215#1:336\n226#1:348\n226#1:353\n130#1:306\n130#1:307,3\n215#1:332\n215#1:333,3\n226#1:349\n226#1:350,3\n130#1:311\n215#1:337\n226#1:354\n148#1:319,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0008\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0008\u0010?\u001a\u00020@H\u0016J \u0010A\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020C0B0100H\u0016J\u0014\u0010D\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040100H\u0016J\u001e\u0010E\u001a\u0002062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u000c\u001a\u00020\rX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u0012X\u0096D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u00020&8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001c\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002020100X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00103\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u00104R\u0016\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010600X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010600X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00108\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002020100\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00089\u0010:R\u000e\u0010;\u001a\u00020<X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u0008\u0012\u0004\u0012\u00020<00X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008>\u0010:\u00a8\u0006F"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AddressElement;",
        "Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;",
        "Lcom/stripe/android/uicore/elements/AddressFieldsElement;",
        "_identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "rawValuesMap",
        "",
        "",
        "addressInputMode",
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "countryCodes",
        "",
        "countryElement",
        "Lcom/stripe/android/uicore/elements/CountryElement;",
        "sameAsShippingElement",
        "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "shippingValuesMap",
        "isPlacesAvailable",
        "",
        "hideCountry",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZ)V",
        "getAddressInputMode",
        "()Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "getCountryElement",
        "()Lcom/stripe/android/uicore/elements/CountryElement;",
        "allowsUserInteraction",
        "getAllowsUserInteraction",
        "()Z",
        "mandateText",
        "Lcom/stripe/android/core/strings/ResolvableString;",
        "getMandateText",
        "()Lcom/stripe/android/core/strings/ResolvableString;",
        "nameElement",
        "Lcom/stripe/android/uicore/elements/SimpleTextElement;",
        "addressAutoCompleteElement",
        "Lcom/stripe/android/uicore/elements/AddressTextFieldElement;",
        "phoneNumberElement",
        "Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "getPhoneNumberElement$annotations",
        "()V",
        "getPhoneNumberElement",
        "()Lcom/stripe/android/uicore/elements/PhoneNumberElement;",
        "currentValuesMap",
        "",
        "elementsRegistry",
        "Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;",
        "otherFields",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "lastSameAsShipping",
        "Ljava/lang/Boolean;",
        "sameAsShippingUpdatedFlow",
        "",
        "fieldsUpdatedFlow",
        "fields",
        "getFields",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "controller",
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "addressController",
        "getAddressController",
        "sectionFieldErrorController",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "getFormFieldValueFlow",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getTextFieldIdentifiers",
        "setRawValue",
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
.field public static final $stable:I = 0x8


# instance fields
.field private final addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

.field private final addressController:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;"
        }
    .end annotation
.end field

.field private final addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

.field private final allowsUserInteraction:Z

.field private final controller:Lcom/stripe/android/uicore/elements/AddressController;

.field private final countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

.field private final currentValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final elementsRegistry:Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;

.field private final fields:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final fieldsUpdatedFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final hideCountry:Z

.field private final isPlacesAvailable:Z

.field private lastSameAsShipping:Ljava/lang/Boolean;

.field private final mandateText:Lcom/stripe/android/core/strings/ResolvableString;

.field private final nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

.field private final otherFields:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation
.end field

.field private final phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

.field private rawValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sameAsShippingUpdatedFlow:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$3AX1CUsVEGkfZcTsK5dcRf3rGCc(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressElement;->fieldsUpdatedFlow$lambda$14(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ATZOhCSw28aWha_jvHf4ghpJ3V4(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getTextFieldIdentifiers$lambda$27(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$NPXwG3urGUgZinpY5SksDGsxUtE(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->fieldsUpdatedFlow$lambda$10(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$SAt0rO4vYEDaWbuWh2m8aU9wWvo(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;Ljava/util/List;Lkotlin/Unit;Lkotlin/Unit;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/stripe/android/uicore/elements/AddressElement;->fields$lambda$21(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;Ljava/util/List;Lkotlin/Unit;Lkotlin/Unit;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$YnYANMYnd1qaoL3B_U_wmX5UjSM(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getFormFieldValueFlow$lambda$24(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ttZdrQr40y1l4ekbdOrzHn5Eid4(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AddressElement;->otherFields$lambda$2(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zPc1f8k0wgK9QHz8hVlM9GTmAg4(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressElement;->sameAsShippingUpdatedFlow$lambda$7(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZ)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AddressInputMode;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/CountryElement;",
            "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    move-object/from16 v5, p7

    const-string v6, "_identifier"

    move-object/from16 v7, p1

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "rawValuesMap"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "addressInputMode"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "countryCodes"

    move-object/from16 v8, p4

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "countryElement"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct/range {p0 .. p1}, Lcom/stripe/android/uicore/elements/SectionMultiFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;)V

    .line 20
    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    .line 21
    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    .line 23
    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    move/from16 v1, p8

    .line 32
    iput-boolean v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->isPlacesAvailable:Z

    move/from16 v1, p9

    .line 33
    iput-boolean v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->hideCountry:Z

    const/4 v1, 0x1

    .line 36
    iput-boolean v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->allowsUserInteraction:Z

    .line 39
    new-instance v3, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 40
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 41
    new-instance v7, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    .line 42
    new-instance v8, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    .line 43
    sget v9, Lcom/stripe/android/core/R$string;->stripe_address_label_full_name:I

    const/4 v15, 0x0

    new-array v10, v15, [Ljava/lang/Object;

    const/4 v11, 0x0

    const/4 v12, 0x4

    invoke-static {v9, v10, v11, v12, v11}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v1, v16

    .line 42
    invoke-direct/range {v8 .. v14}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v8, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 45
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/AddressInputMode;->getNameConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v9

    sget-object v10, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-ne v9, v10, :cond_0

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    move v9, v15

    .line 46
    :goto_0
    iget-object v10, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    sget-object v11, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v11}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getName()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    .line 41
    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;-><init>(Lcom/stripe/android/uicore/elements/TextFieldConfig;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v7, Lcom/stripe/android/uicore/elements/TextFieldController;

    .line 39
    invoke-direct {v3, v6, v7}, Lcom/stripe/android/uicore/elements/SimpleTextElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldController;)V

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    .line 50
    new-instance v3, Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    .line 51
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getOneLineAddress()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 52
    new-instance v7, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    sget v8, Lcom/stripe/android/uicore/R$string;->stripe_address_label_address:I

    new-array v9, v15, [Ljava/lang/Object;

    const/4 v10, 0x4

    invoke-static {v8, v9, v1, v10, v1}, Lcom/stripe/android/core/strings/ResolvableStringUtilsKt;->resolvableString$default(I[Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;)Lcom/stripe/android/core/strings/ResolvableString;

    move-result-object v8

    const/16 v12, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v13}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;-><init>(Lcom/stripe/android/core/strings/ResolvableString;IILkotlinx/coroutines/flow/MutableStateFlow;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v7, Lcom/stripe/android/uicore/elements/TextFieldConfig;

    .line 53
    instance-of v8, v2, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    if-eqz v8, :cond_1

    move-object v11, v2

    check-cast v11, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    goto :goto_1

    :cond_1
    move-object v11, v1

    :goto_1
    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object v11

    goto :goto_2

    :cond_2
    move-object v11, v1

    .line 50
    :goto_2
    invoke-direct {v3, v6, v7, v11}, Lcom/stripe/android/uicore/elements/AddressTextFieldElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/TextFieldConfig;Lkotlin/jvm/functions/Function0;)V

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    .line 57
    new-instance v3, Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    .line 58
    sget-object v6, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v6}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v6

    .line 59
    sget-object v7, Lcom/stripe/android/uicore/elements/PhoneNumberController;->Companion:Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;

    .line 60
    iget-object v8, v0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    sget-object v9, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v9}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getPhone()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_3

    const-string v8, ""

    .line 61
    :cond_3
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/AddressInputMode;->getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v9

    sget-object v10, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->OPTIONAL:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-ne v9, v10, :cond_4

    const/4 v11, 0x1

    goto :goto_3

    :cond_4
    move v11, v15

    .line 62
    :goto_3
    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/AddressInputMode;->getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object v2

    sget-object v9, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->REQUIRED:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq v2, v9, :cond_5

    const/4 v12, 0x1

    goto :goto_4

    :cond_5
    move v12, v15

    :goto_4
    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 59
    invoke-static/range {v7 .. v14}, Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;->createPhoneNumberController$default(Lcom/stripe/android/uicore/elements/PhoneNumberController$Companion;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;ZZILjava/lang/Object;)Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v2

    .line 57
    invoke-direct {v3, v6, v2}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/PhoneNumberController;)V

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    .line 66
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v2, Ljava/util/Map;

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    .line 68
    new-instance v2, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;

    sget-object v3, Lcom/stripe/android/uicore/address/AddressSchemaRegistry;->INSTANCE:Lcom/stripe/android/uicore/address/AddressSchemaRegistry;

    invoke-direct {v2, v3}, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;-><init>(Lcom/stripe/android/uicore/address/AddressSchemaRegistry;)V

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->elementsRegistry:Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;

    .line 70
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    .line 71
    new-instance v3, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda1;

    invoke-direct {v3, v0}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;)V

    invoke-static {v2, v3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->mapAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v2

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->otherFields:Lkotlinx/coroutines/flow/StateFlow;

    if-eqz v4, :cond_6

    .line 95
    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->getController()Lcom/stripe/android/uicore/elements/SameAsShippingController;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/SameAsShippingController;->getValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    invoke-static {v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 93
    :cond_7
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda2;

    invoke-direct {v1, v0, v5}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda2;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;)V

    invoke-static {v2, v3, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->sameAsShippingUpdatedFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 128
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    .line 129
    new-instance v6, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda3;

    invoke-direct {v6}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {v2, v6}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v6

    .line 127
    new-instance v7, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda4;

    invoke-direct {v7, v0, v4, v5}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda4;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;)V

    invoke-static {v3, v6, v7}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v3

    iput-object v3, v0, Lcom/stripe/android/uicore/elements/AddressElement;->fieldsUpdatedFlow:Lkotlinx/coroutines/flow/StateFlow;

    .line 158
    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/CountryElement;->getController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v4

    .line 157
    new-instance v5, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda5;

    invoke-direct {v5, v0}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/uicore/elements/AddressElement;)V

    invoke-static {v4, v2, v1, v3, v5}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->combineAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:Lkotlinx/coroutines/flow/StateFlow;

    .line 204
    new-instance v2, Lcom/stripe/android/uicore/elements/AddressController;

    invoke-direct {v2, v1}, Lcom/stripe/android/uicore/elements/AddressController;-><init>(Lkotlinx/coroutines/flow/StateFlow;)V

    iput-object v2, v0, Lcom/stripe/android/uicore/elements/AddressElement;->controller:Lcom/stripe/android/uicore/elements/AddressController;

    .line 206
    invoke-static {v2}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/uicore/elements/AddressElement;->addressController:Lkotlinx/coroutines/flow/StateFlow;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 20
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    .line 21
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v1, v3, v3, v2, v3}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v1, Lcom/stripe/android/uicore/elements/AddressInputMode;

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    .line 22
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object/from16 v6, p4

    :goto_2
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_3

    .line 23
    new-instance v1, Lcom/stripe/android/uicore/elements/CountryElement;

    .line 24
    sget-object v2, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v2

    .line 25
    new-instance v3, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-object v7, v6

    .line 26
    new-instance v6, Lcom/stripe/android/uicore/elements/CountryConfig;

    const/16 v13, 0x3e

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v14}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v6, Lcom/stripe/android/uicore/elements/DropdownConfig;

    .line 27
    sget-object v8, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v8}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v8

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 25
    invoke-direct {v3, v6, v8}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    .line 23
    invoke-direct {v1, v2, v3}, Lcom/stripe/android/uicore/elements/CountryElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    goto :goto_3

    :cond_3
    move-object v7, v6

    move-object/from16 v1, p5

    :goto_3
    and-int/lit16 v2, v0, 0x80

    if-eqz v2, :cond_4

    .line 32
    new-instance v2, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;

    invoke-direct {v2}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;-><init>()V

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/DefaultIsPlacesAvailable;->invoke()Z

    move-result v2

    move v10, v2

    goto :goto_4

    :cond_4
    move/from16 v10, p8

    :goto_4
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    move v11, v0

    goto :goto_5

    :cond_5
    move/from16 v11, p9

    :goto_5
    move-object v2, p0

    move-object/from16 v3, p1

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object v6, v7

    move-object v7, v1

    .line 18
    invoke-direct/range {v2 .. v11}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZ)V

    return-void
.end method

.method private static final fields$lambda$21(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;Ljava/util/List;Lkotlin/Unit;Lkotlin/Unit;)Ljava/util/List;
    .locals 7

    const-string p3, "otherFields"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    iget-object p3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    invoke-virtual {p3}, Lcom/stripe/android/uicore/elements/AddressInputMode;->getNameConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object p3

    sget-object p4, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p3, p4, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    const/4 p4, 0x3

    .line 166
    new-array p4, p4, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    const/4 v3, 0x0

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v3

    :goto_1
    aput-object v2, p4, v1

    .line 167
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v2

    iget-boolean v4, p0, Lcom/stripe/android/uicore/elements/AddressElement;->hideCountry:Z

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    move-object v2, v3

    :goto_2
    aput-object v2, p4, v0

    .line 168
    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressAutoCompleteElement:Lcom/stripe/android/uicore/elements/AddressTextFieldElement;

    const/4 v4, 0x2

    aput-object v2, p4, v4

    .line 165
    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    .line 171
    new-array v2, v4, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    if-nez p3, :cond_3

    goto :goto_3

    :cond_3
    move-object v5, v3

    :goto_3
    aput-object v5, v2, v1

    .line 172
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v5

    iget-boolean v6, p0, Lcom/stripe/android/uicore/elements/AddressElement;->hideCountry:Z

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    move-object v5, v3

    :goto_4
    aput-object v5, v2, v0

    .line 170
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    .line 173
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    .line 174
    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    .line 175
    instance-of v6, v5, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    if-eqz v6, :cond_5

    .line 178
    check-cast v5, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    iget-boolean p2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->isPlacesAvailable:Z

    invoke-virtual {v5, p1, p2}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;->supportsAutoComplete(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_6

    .line 184
    :cond_5
    instance-of p1, v5, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    if-eqz p1, :cond_7

    :cond_6
    move-object p4, v2

    goto :goto_6

    .line 189
    :cond_7
    new-array p1, v4, [Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;

    iget-object p4, p0, Lcom/stripe/android/uicore/elements/AddressElement;->nameElement:Lcom/stripe/android/uicore/elements/SimpleTextElement;

    if-nez p3, :cond_8

    goto :goto_5

    :cond_8
    move-object p4, v3

    :goto_5
    aput-object p4, p1, v1

    .line 190
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object p3

    iget-boolean p4, p0, Lcom/stripe/android/uicore/elements/AddressElement;->hideCountry:Z

    if-nez p4, :cond_9

    move-object v3, p3

    :cond_9
    aput-object v3, p1, v0

    .line 188
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 191
    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p4

    .line 195
    :goto_6
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AddressInputMode;->getPhoneNumberConfig()Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    move-result-object p1

    sget-object p2, Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;->HIDDEN:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    if-eq p1, p2, :cond_a

    .line 196
    check-cast p4, Ljava/util/Collection;

    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    invoke-static {p4, p0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_a
    return-object p4
.end method

.method private static final fieldsUpdatedFlow$lambda$10(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 2

    const-string v0, "fieldElements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    check-cast p0, Ljava/lang/Iterable;

    .line 296
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 297
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 298
    check-cast v1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 133
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 298
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 299
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 301
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 302
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    .line 136
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    .line 302
    invoke-static {p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_1

    .line 305
    :cond_1
    move-object p0, v0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 309
    new-array v1, v1, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 305
    check-cast p0, [Lkotlinx/coroutines/flow/Flow;

    .line 311
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$lambda$10$$inlined$combineAsStateFlow$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$lambda$10$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p0, v1

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    .line 312
    :goto_1
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$lambda$10$$inlined$combineAsStateFlow$2;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/AddressElement$fieldsUpdatedFlow$lambda$10$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 300
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method private static final fieldsUpdatedFlow$lambda$14(Lcom/stripe/android/uicore/elements/AddressElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lkotlin/Unit;
    .locals 4

    const-string v0, "values"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_0

    .line 141
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    :cond_0
    iget-object p3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    .line 144
    check-cast p4, Ljava/lang/Iterable;

    const/16 v0, 0xa

    .line 313
    invoke-static {p4, v0}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v0

    .line 314
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v1, Ljava/util/Map;

    .line 315
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 316
    check-cast v0, Lkotlin/Pair;

    .line 145
    new-instance v2, Lkotlin/Pair;

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    invoke-virtual {v2}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_1
    invoke-interface {p3, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 148
    iget-object p3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    .line 319
    invoke-interface {p3}, Ljava/util/Map;->isEmpty()Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_2

    goto :goto_1

    .line 320
    :cond_2
    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result p4

    if-eqz p4, :cond_6

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/Map$Entry;

    if-eqz p2, :cond_4

    .line 149
    invoke-interface {p4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_5

    :cond_4
    const-string v1, ""

    :cond_5
    invoke-interface {p4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p4

    invoke-static {v1, p4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_3

    const/4 v0, 0x0

    .line 151
    :cond_6
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->lastSameAsShipping:Ljava/lang/Boolean;

    if-eqz p1, :cond_7

    .line 153
    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    invoke-static {p0}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p0

    .line 152
    invoke-virtual {p1, p0}, Lcom/stripe/android/uicore/elements/SameAsShippingElement;->setRawValue(Ljava/util/Map;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method

.method private static final getFormFieldValueFlow$lambda$24(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 2

    const-string v0, "fieldElements"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    check-cast p0, Ljava/lang/Iterable;

    .line 322
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 323
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 324
    check-cast v1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 218
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 324
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 325
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 327
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 328
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    .line 221
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    .line 328
    invoke-static {p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_1

    .line 331
    :cond_1
    move-object p0, v0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 335
    new-array v1, v1, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 331
    check-cast p0, [Lkotlinx/coroutines/flow/Flow;

    .line 337
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$lambda$24$$inlined$combineAsStateFlow$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$lambda$24$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p0, v1

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    .line 338
    :goto_1
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$lambda$24$$inlined$combineAsStateFlow$2;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/AddressElement$getFormFieldValueFlow$lambda$24$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 326
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public static synthetic getPhoneNumberElement$annotations()V
    .locals 0

    return-void
.end method

.method private static final getTextFieldIdentifiers$lambda$27(Ljava/util/List;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 2

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    check-cast p0, Ljava/lang/Iterable;

    .line 339
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 340
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 341
    check-cast v1, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 229
    invoke-interface {v1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    .line 341
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 342
    :cond_0
    check-cast v0, Ljava/util/List;

    .line 344
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    .line 345
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p0

    .line 232
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->flatten(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    .line 345
    invoke-static {p0}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    goto :goto_1

    .line 348
    :cond_1
    move-object p0, v0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    const/4 v1, 0x0

    .line 352
    new-array v1, v1, [Lkotlinx/coroutines/flow/Flow;

    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    .line 348
    check-cast p0, [Lkotlinx/coroutines/flow/Flow;

    .line 354
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$lambda$27$$inlined$combineAsStateFlow$1;

    invoke-direct {v1, p0}, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$lambda$27$$inlined$combineAsStateFlow$1;-><init>([Lkotlinx/coroutines/flow/Flow;)V

    move-object p0, v1

    check-cast p0, Lkotlinx/coroutines/flow/Flow;

    .line 355
    :goto_1
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$lambda$27$$inlined$combineAsStateFlow$2;

    invoke-direct {v1, v0}, Lcom/stripe/android/uicore/elements/AddressElement$getTextFieldIdentifiers$lambda$27$$inlined$combineAsStateFlow$2;-><init>(Ljava/util/List;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 343
    new-instance v0, Lcom/stripe/android/uicore/utils/FlowToStateFlow;

    invoke-direct {v0, p0, v1}, Lcom/stripe/android/uicore/utils/FlowToStateFlow;-><init>(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;)V

    check-cast v0, Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method private static final otherFields$lambda$2(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/lang/String;)Ljava/util/List;
    .locals 5

    if-eqz p1, :cond_0

    .line 73
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberElement;->getController()Lcom/stripe/android/uicore/elements/PhoneNumberController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/PhoneNumberController;->getCountryDropdownController()Lcom/stripe/android/uicore/elements/DropdownFieldController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->elementsRegistry:Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/AddressElementUiRegistry;->get(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    :cond_1
    check-cast v0, Ljava/lang/Iterable;

    .line 285
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 79
    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    .line 80
    iget-boolean v4, p0, Lcom/stripe/android/uicore/elements/AddressElement;->isPlacesAvailable:Z

    .line 76
    invoke-static {v2, p1, v3, v4}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1WithAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressInputMode;Z)V

    .line 82
    iget-object v3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    invoke-interface {v2, v3}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->setRawValue(Ljava/util/Map;)V

    goto :goto_0

    .line 285
    :cond_2
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private static final sameAsShippingUpdatedFlow$lambda$7(Lcom/stripe/android/uicore/elements/AddressElement;Ljava/util/Map;Ljava/util/List;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 4

    const-string v0, "fields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->lastSameAsShipping:Ljava/lang/Boolean;

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 98
    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AddressElement;->lastSameAsShipping:Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move-object p3, v1

    .line 105
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;

    move-result-object v0

    iget-boolean v2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->hideCountry:Z

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    .line 104
    :goto_1
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 106
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    if-eqz p3, :cond_8

    .line 108
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_2

    if-nez p1, :cond_6

    .line 110
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    goto :goto_4

    .line 112
    :cond_2
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement;->currentValuesMap:Ljava/util/Map;

    .line 288
    new-instance p3, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v0

    invoke-direct {p3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast p3, Ljava/util/Map;

    .line 289
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 290
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 291
    check-cast v0, Ljava/util/Map$Entry;

    .line 289
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 113
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 114
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_3

    .line 116
    :cond_3
    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, ""

    .line 291
    :cond_4
    :goto_3
    invoke-interface {p3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_5
    move-object p1, p3

    .line 120
    :cond_6
    :goto_4
    check-cast p2, Ljava/lang/Iterable;

    .line 294
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/stripe/android/uicore/elements/SectionFieldElement;

    .line 121
    invoke-interface {p2, p1}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->setRawValue(Ljava/util/Map;)V

    goto :goto_5

    .line 108
    :cond_7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    :cond_8
    return-object v1
.end method


# virtual methods
.method public getAddressController()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;"
        }
    .end annotation

    .line 206
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressController:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getAddressInputMode()Lcom/stripe/android/uicore/elements/AddressInputMode;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->addressInputMode:Lcom/stripe/android/uicore/elements/AddressInputMode;

    return-object v0
.end method

.method public getAllowsUserInteraction()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->allowsUserInteraction:Z

    return v0
.end method

.method public getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    return-object v0
.end method

.method public final getFields()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
            ">;>;"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation

    .line 214
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda0;-><init>()V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public getMandateText()Lcom/stripe/android/core/strings/ResolvableString;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->mandateText:Lcom/stripe/android/core/strings/ResolvableString;

    return-object v0
.end method

.method public final getPhoneNumberElement()Lcom/stripe/android/uicore/elements/PhoneNumberElement;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->phoneNumberElement:Lcom/stripe/android/uicore/elements/PhoneNumberElement;

    return-object v0
.end method

.method public getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    .line 225
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->fields:Lkotlinx/coroutines/flow/StateFlow;

    new-instance v1, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda6;

    invoke-direct {v1}, Lcom/stripe/android/uicore/elements/AddressElement$$ExternalSyntheticLambda6;-><init>()V

    invoke-static {v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    return-object v0
.end method

.method public sectionFieldErrorController()Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
    .locals 1

    .line 212
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AddressElement;->controller:Lcom/stripe/android/uicore/elements/AddressController;

    check-cast v0, Lcom/stripe/android/uicore/elements/SectionFieldErrorController;

    return-object v0
.end method

.method public setRawValue(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "rawValuesMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AddressElement;->rawValuesMap:Ljava/util/Map;

    return-void
.end method
