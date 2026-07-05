.class public final Lcom/stripe/android/uicore/elements/AutocompleteAddressController;
.super Ljava/lang/Object;
.source "AutocompleteAddressController.kt"

# interfaces
.implements Lcom/stripe/android/uicore/elements/SectionFieldErrorController;
.implements Lcom/stripe/android/uicore/elements/SectionFieldComposable;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAutocompleteAddressController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutocompleteAddressController.kt\ncom/stripe/android/uicore/elements/AutocompleteAddressController\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,155:1\n462#2:156\n412#2:157\n1246#3,4:158\n81#4:162\n*S KotlinDebug\n*F\n+ 1 AutocompleteAddressController.kt\ncom/stripe/android/uicore/elements/AutocompleteAddressController\n*L\n132#1:156\n132#1:157\n132#1:158,4\n144#1:162\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J&\u00109\u001a\u00020,2\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010;\u001a\u00020<H\u0002J&\u0010=\u001a\u00020<2\u0006\u0010 \u001a\u00020\u00152\u0014\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J\u0016\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002J=\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020\u00152\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b2\u0008\u0010G\u001a\u0004\u0018\u00010\u0004H\u0017\u00a2\u0006\u0002\u0010HR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0011\u0010&\u001a\u00020\'\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0017\u0010*\u001a\u0008\u0012\u0004\u0012\u00020,0+\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010.R)\u0010/\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020201000\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00083\u0010%R\u001d\u00104\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u0004000\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00085\u0010%R\u0017\u00106\u001a\u0008\u0012\u0004\u0012\u0002070\"\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010%\u00a8\u0006I\u00b2\u0006\n\u0010J\u001a\u000207X\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldErrorController;",
        "Lcom/stripe/android/uicore/elements/SectionFieldComposable;",
        "identifier",
        "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "initialValues",
        "",
        "",
        "interactorFactory",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
        "countryCodes",
        "",
        "countryDropdownFieldController",
        "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
        "phoneNumberConfig",
        "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
        "nameConfig",
        "sameAsShippingElement",
        "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
        "shippingValuesMap",
        "hideCountry",
        "",
        "<init>",
        "(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Z)V",
        "getIdentifier",
        "()Lcom/stripe/android/uicore/elements/IdentifierSpec;",
        "getInitialValues",
        "()Ljava/util/Map;",
        "interactor",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;",
        "config",
        "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;",
        "expandForm",
        "error",
        "Lkotlinx/coroutines/flow/StateFlow;",
        "Lcom/stripe/android/uicore/elements/FieldError;",
        "getError",
        "()Lkotlinx/coroutines/flow/StateFlow;",
        "countryElement",
        "Lcom/stripe/android/uicore/elements/CountryElement;",
        "getCountryElement",
        "()Lcom/stripe/android/uicore/elements/CountryElement;",
        "addressElementFlow",
        "Lkotlinx/coroutines/flow/MutableStateFlow;",
        "Lcom/stripe/android/uicore/elements/AddressElement;",
        "getAddressElementFlow",
        "()Lkotlinx/coroutines/flow/MutableStateFlow;",
        "formFieldValues",
        "",
        "Lkotlin/Pair;",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getFormFieldValues",
        "textFieldIdentifiers",
        "getTextFieldIdentifiers",
        "addressController",
        "Lcom/stripe/android/uicore/elements/AddressController;",
        "getAddressController",
        "createAddressElement",
        "values",
        "addressInputMode",
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "toAddressInputMode",
        "getCurrentValues",
        "ComposeUI",
        "",
        "enabled",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "hiddenIdentifiers",
        "lastTextFieldIdentifier",
        "(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V",
        "stripe-ui-core_release",
        "controller"
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
.field private final addressController:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;"
        }
    .end annotation
.end field

.field private final addressElementFlow:Lkotlinx/coroutines/flow/MutableStateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressElement;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

.field private final countryDropdownFieldController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

.field private final countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

.field private final error:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/FieldError;",
            ">;"
        }
    .end annotation
.end field

.field private expandForm:Z

.field private final formFieldValues:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            ">;>;>;"
        }
    .end annotation
.end field

.field private final hideCountry:Z

.field private final identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

.field private final initialValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final interactor:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

.field private final nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field private final phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

.field private final sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

.field private final shippingValuesMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final textFieldIdentifiers:Lkotlinx/coroutines/flow/StateFlow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$6D3yCPuOXvhA3vfIOrdhnU1nvPI(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->textFieldIdentifiers$lambda$1(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$6_Q4UxTDz4kGcR_FAYQ6v0IKTm4(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->formFieldValues$lambda$0(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$D1ihKgh84Xi0e84Ou0NaIy-DI9I(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->toAddressInputMode$lambda$6(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$DmDMPNBwzkoDD-ElcbatUZxqLpw(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressController$lambda$2(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$X2XyyygbvcCX7JNeOZmMsYfUPQs(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->_init_$lambda$4(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$ZUEd6-pnxkGBID5BHTtfVtnLFIA(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->toAddressInputMode$lambda$5(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/DropdownFieldController;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;",
            "Lcom/stripe/android/uicore/elements/SameAsShippingElement;",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialValues"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interactorFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "countryCodes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "countryDropdownFieldController"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "phoneNumberConfig"

    invoke-static {p6, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "nameConfig"

    invoke-static {p7, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 16
    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->initialValues:Ljava/util/Map;

    .line 19
    iput-object p5, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryDropdownFieldController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    .line 23
    iput-object p6, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 24
    iput-object p7, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 25
    iput-object p8, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    .line 26
    iput-object p9, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->shippingValuesMap:Ljava/util/Map;

    .line 27
    iput-boolean p10, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->hideCountry:Z

    .line 29
    invoke-interface {p3}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;->create()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->interactor:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    .line 31
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;->getAutocompleteConfig()Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    const/4 p3, 0x0

    .line 35
    invoke-static {p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->stateFlowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->error:Lkotlinx/coroutines/flow/StateFlow;

    .line 37
    new-instance p3, Lcom/stripe/android/uicore/elements/CountryElement;

    .line 38
    sget-object p4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p4

    .line 37
    invoke-direct {p3, p4, p5}, Lcom/stripe/android/uicore/elements/CountryElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Lcom/stripe/android/uicore/elements/DropdownFieldController;)V

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    .line 43
    iget-boolean p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->expandForm:Z

    invoke-direct {p0, p3, p2}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->toAddressInputMode(ZLjava/util/Map;)Lcom/stripe/android/uicore/elements/AddressInputMode;

    move-result-object p3

    invoke-direct {p0, p2, p3}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->createAddressElement(Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;)Lcom/stripe/android/uicore/elements/AddressElement;

    move-result-object p2

    .line 42
    invoke-static {p2}, Lkotlinx/coroutines/flow/StateFlowKt;->MutableStateFlow(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressElementFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 46
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda2;

    invoke-direct {p4}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda2;-><init>()V

    invoke-static {p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->formFieldValues:Lkotlinx/coroutines/flow/StateFlow;

    .line 50
    move-object p3, p2

    check-cast p3, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p4, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda3;

    invoke-direct {p4}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda3;-><init>()V

    invoke-static {p3, p4}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p3

    iput-object p3, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->textFieldIdentifiers:Lkotlinx/coroutines/flow/StateFlow;

    .line 54
    check-cast p2, Lkotlinx/coroutines/flow/StateFlow;

    new-instance p3, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda4;

    invoke-direct {p3}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda4;-><init>()V

    invoke-static {p2, p3}, Lcom/stripe/android/uicore/utils/StateFlowsKt;->flatMapLatestAsStateFlow(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressController:Lkotlinx/coroutines/flow/StateFlow;

    .line 59
    new-instance p2, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda5;

    invoke-direct {p2, p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda5;-><init>(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)V

    invoke-interface {p1, p2}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;->register(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_0

    .line 18
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    .line 19
    new-instance v1, Lcom/stripe/android/uicore/elements/DropdownFieldController;

    .line 20
    new-instance v2, Lcom/stripe/android/uicore/elements/CountryConfig;

    const/16 v9, 0x3e

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/uicore/elements/CountryConfig;-><init>(Ljava/util/Set;Ljava/util/Locale;Lcom/stripe/android/uicore/elements/DropdownConfig$Mode;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast v2, Lcom/stripe/android/uicore/elements/DropdownConfig;

    .line 21
    sget-object v4, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v4}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 19
    invoke-direct {v1, v2, v4}, Lcom/stripe/android/uicore/elements/DropdownFieldController;-><init>(Lcom/stripe/android/uicore/elements/DropdownConfig;Ljava/lang/String;)V

    move-object v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v7, p5

    :goto_1
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move v12, v0

    goto :goto_2

    :cond_2
    move/from16 v12, p10

    :goto_2
    move-object v2, p0

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move-object/from16 v11, p9

    move-object v6, v3

    move-object v3, p1

    .line 14
    invoke-direct/range {v2 .. v12}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Factory;Ljava/util/Set;Lcom/stripe/android/uicore/elements/DropdownFieldController;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;Z)V

    return-void
.end method

.method private static final ComposeUI$lambda$8(Landroidx/compose/runtime/State;)Lcom/stripe/android/uicore/elements/AddressController;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/AddressController;"
        }
    .end annotation

    .line 162
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/uicore/elements/AddressController;

    return-object p0
.end method

.method private static final _init_$lambda$4(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;)Lkotlin/Unit;
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    invoke-direct {p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->getCurrentValues()Ljava/util/Map;

    move-result-object v0

    .line 61
    invoke-interface {p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event;->getValues()Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_0

    move-object v1, v0

    .line 64
    :cond_0
    instance-of v2, p1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnValues;

    if-nez v2, :cond_2

    .line 65
    instance-of p1, p1, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Event$OnExpandForm;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->expandForm:Z

    goto :goto_0

    .line 63
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    .line 68
    :cond_2
    :goto_0
    iget-boolean p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->expandForm:Z

    invoke-direct {p0, p1, v1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->toAddressInputMode(ZLjava/util/Map;)Lcom/stripe/android/uicore/elements/AddressInputMode;

    move-result-object p1

    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressElementFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/uicore/elements/AddressElement;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AddressElement;->getAddressInputMode()Lcom/stripe/android/uicore/elements/AddressInputMode;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    .line 71
    :cond_3
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getCountry()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_4

    .line 72
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryDropdownFieldController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    invoke-virtual {v0, p1}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->onRawValueChange(Ljava/lang/String;)V

    .line 75
    :cond_4
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressElementFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 76
    iget-boolean v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->expandForm:Z

    invoke-direct {p0, v0, v1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->toAddressInputMode(ZLjava/util/Map;)Lcom/stripe/android/uicore/elements/AddressInputMode;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->createAddressElement(Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;)Lcom/stripe/android/uicore/elements/AddressElement;

    move-result-object p0

    .line 75
    invoke-interface {p1, p0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 78
    :cond_5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final addressController$lambda$2(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getAddressController()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private final createAddressElement(Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;)Lcom/stripe/android/uicore/elements/AddressElement;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stripe/android/uicore/elements/AddressInputMode;",
            ")",
            "Lcom/stripe/android/uicore/elements/AddressElement;"
        }
    .end annotation

    .line 85
    new-instance v0, Lcom/stripe/android/uicore/elements/AddressElement;

    .line 86
    iget-object v1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    .line 89
    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    .line 90
    iget-object v6, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->sameAsShippingElement:Lcom/stripe/android/uicore/elements/SameAsShippingElement;

    .line 91
    iget-object v7, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->shippingValuesMap:Ljava/util/Map;

    .line 92
    iget-object v2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->isPlacesAvailable()Z

    move-result v8

    .line 93
    iget-boolean v9, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->hideCountry:Z

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p2

    .line 85
    invoke-direct/range {v0 .. v11}, Lcom/stripe/android/uicore/elements/AddressElement;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Map;Lcom/stripe/android/uicore/elements/AddressInputMode;Ljava/util/Set;Lcom/stripe/android/uicore/elements/CountryElement;Lcom/stripe/android/uicore/elements/SameAsShippingElement;Ljava/util/Map;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final formFieldValues$lambda$0(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    const-string v0, "addressElement"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getFormFieldValueFlow()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private final getCurrentValues()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 132
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->formFieldValues:Lkotlinx/coroutines/flow/StateFlow;

    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    .line 156
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lkotlin/collections/MapsKt;->mapCapacity(I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    check-cast v1, Ljava/util/Map;

    .line 157
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 158
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 159
    check-cast v2, Ljava/util/Map$Entry;

    .line 157
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    .line 133
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->getValue()Ljava/lang/String;

    move-result-object v2

    .line 159
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static final textFieldIdentifiers$lambda$1(Lcom/stripe/android/uicore/elements/AddressElement;)Lkotlinx/coroutines/flow/StateFlow;
    .locals 1

    const-string v0, "addressElement"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/AddressElement;->getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    return-object p0
.end method

.method private final toAddressInputMode(ZLjava/util/Map;)Lcom/stripe/android/uicore/elements/AddressInputMode;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/stripe/android/uicore/elements/AddressInputMode;"
        }
    .end annotation

    .line 101
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    invoke-virtual {v0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->getGooglePlacesApiKey()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    .line 104
    new-instance p1, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;

    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    invoke-direct {p1, p2, v0}, Lcom/stripe/android/uicore/elements/AddressInputMode$NoAutocomplete;-><init>(Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;)V

    check-cast p1, Lcom/stripe/android/uicore/elements/AddressInputMode;

    return-object p1

    :cond_0
    if-nez p1, :cond_2

    .line 105
    sget-object p1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_0

    .line 118
    :cond_1
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;

    .line 120
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v3

    .line 121
    iget-object v4, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 122
    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 123
    new-instance v6, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda1;

    invoke-direct {v6, p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda1;-><init>(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)V

    .line 118
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteCondensed;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lcom/stripe/android/uicore/elements/AddressInputMode;

    return-object v1

    .line 106
    :cond_2
    :goto_0
    new-instance v1, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;

    .line 108
    iget-object p1, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->config:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;

    invoke-virtual {p1}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor$Config;->getAutocompleteCountries()Ljava/util/Set;

    move-result-object v3

    .line 109
    iget-object v4, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->phoneNumberConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 110
    iget-object v5, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->nameConfig:Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;

    .line 111
    new-instance v6, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda0;

    invoke-direct {v6, p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)V

    .line 106
    invoke-direct/range {v1 .. v6}, Lcom/stripe/android/uicore/elements/AddressInputMode$AutocompleteExpanded;-><init>(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lcom/stripe/android/uicore/elements/AddressFieldConfiguration;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Lcom/stripe/android/uicore/elements/AddressInputMode;

    return-object v1
.end method

.method private static final toAddressInputMode$lambda$5(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->interactor:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    .line 113
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryDropdownFieldController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    const-string p0, ""

    .line 112
    :cond_0
    invoke-interface {v0, p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;->onAutocomplete(Ljava/lang/String;)V

    .line 115
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final toAddressInputMode$lambda$6(Lcom/stripe/android/uicore/elements/AutocompleteAddressController;)Lkotlin/Unit;
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->interactor:Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;

    .line 125
    iget-object p0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryDropdownFieldController:Lcom/stripe/android/uicore/elements/DropdownFieldController;

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/DropdownFieldController;->getRawFieldValue()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object p0

    invoke-interface {p0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_0

    const-string p0, ""

    .line 124
    :cond_0
    invoke-interface {v0, p0}, Lcom/stripe/android/uicore/elements/AutocompleteAddressInteractor;->onAutocomplete(Ljava/lang/String;)V

    .line 127
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public ComposeUI(ZLcom/stripe/android/uicore/elements/SectionFieldElement;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;I)V
    .locals 8
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

    const-string v0, "field"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "modifier"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "hiddenIdentifiers"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x6480b3d9

    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.uicore.elements.AutocompleteAddressController.ComposeUI (AutocompleteAddressController.kt:142)"

    .line 143
    invoke-static {p2, p7, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 144
    :cond_0
    iget-object p2, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressController:Lkotlinx/coroutines/flow/StateFlow;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p2, v2, p6, v0, v1}, Lcom/stripe/android/uicore/utils/StateFlowsComposeKt;->collectAsState(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    .line 148
    invoke-static {p2}, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->ComposeUI$lambda$8(Landroidx/compose/runtime/State;)Lcom/stripe/android/uicore/elements/AddressController;

    move-result-object v1

    and-int/lit8 p2, p7, 0xe

    .line 151
    sget v0, Lcom/stripe/android/uicore/elements/AddressController;->$stable:I

    shl-int/lit8 v0, v0, 0x3

    or-int/2addr p2, v0

    shr-int/lit8 v0, p7, 0x3

    and-int/lit16 v2, v0, 0x380

    or-int/2addr p2, v2

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr p2, v0

    shl-int/lit8 p7, p7, 0x6

    const v0, 0xe000

    and-int/2addr p7, v0

    or-int v6, p2, p7

    const/4 v7, 0x0

    move v0, p1

    move-object v4, p3

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    .line 146
    invoke-static/range {v0 .. v7}, Lcom/stripe/android/uicore/elements/AddressElementUIKt;->AddressElementUI(ZLcom/stripe/android/uicore/elements/AddressController;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    return-void
.end method

.method public final getAddressController()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressController;",
            ">;"
        }
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressController:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getAddressElementFlow()Lkotlinx/coroutines/flow/MutableStateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/MutableStateFlow<",
            "Lcom/stripe/android/uicore/elements/AddressElement;",
            ">;"
        }
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->addressElementFlow:Lkotlinx/coroutines/flow/MutableStateFlow;

    return-object v0
.end method

.method public final getCountryElement()Lcom/stripe/android/uicore/elements/CountryElement;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->countryElement:Lcom/stripe/android/uicore/elements/CountryElement;

    return-object v0
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

    .line 35
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->error:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getFormFieldValues()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
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

    .line 46
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->formFieldValues:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method

.method public final getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->identifier:Lcom/stripe/android/uicore/elements/IdentifierSpec;

    return-object v0
.end method

.method public final getInitialValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 16
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->initialValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getTextFieldIdentifiers()Lkotlinx/coroutines/flow/StateFlow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/StateFlow<",
            "Ljava/util/List<",
            "Lcom/stripe/android/uicore/elements/IdentifierSpec;",
            ">;>;"
        }
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/stripe/android/uicore/elements/AutocompleteAddressController;->textFieldIdentifiers:Lkotlinx/coroutines/flow/StateFlow;

    return-object v0
.end method
