.class public final Lcom/stripe/android/uicore/elements/AddressElementKt;
.super Ljava/lang/Object;
.source "AddressElement.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0000\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u000c2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "updateLine1WithAutocompleteAffordance",
        "",
        "field",
        "Lcom/stripe/android/uicore/elements/SectionFieldElement;",
        "countryCode",
        "",
        "addressInputMode",
        "Lcom/stripe/android/uicore/elements/AddressInputMode;",
        "isPlacesAvailable",
        "",
        "updateLine1ConfigForAutocompleteAffordance",
        "textConfig",
        "Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;",
        "stripe-ui-core_release"
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
.method public static synthetic $r8$lambda$gJjeZfSzH-KWmwgBzKrYPTXfPis(Lcom/stripe/android/uicore/elements/AddressInputMode;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1ConfigForAutocompleteAffordance$lambda$0(Lcom/stripe/android/uicore/elements/AddressInputMode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressInputMode;Z)V
    .locals 3

    .line 268
    instance-of v0, p2, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    .line 269
    invoke-interface {v0, p1, p3}, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;->supportsAutoComplete(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    const/4 p3, 0x1

    .line 270
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 272
    sget p1, Lcom/stripe/android/uicore/R$drawable;->stripe_ic_search:I

    .line 274
    sget v0, Lcom/stripe/android/uicore/R$string;->stripe_address_search_content_description:I

    .line 271
    new-instance v1, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;

    .line 274
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    .line 270
    new-instance v2, Lcom/stripe/android/uicore/elements/AddressElementKt$$ExternalSyntheticLambda0;

    invoke-direct {v2, p2}, Lcom/stripe/android/uicore/elements/AddressElementKt$$ExternalSyntheticLambda0;-><init>(Lcom/stripe/android/uicore/elements/AddressInputMode;)V

    .line 271
    invoke-direct {v1, p1, v0, p3, v2}, Lcom/stripe/android/uicore/elements/TextFieldIcon$Trailing;-><init>(ILjava/lang/Integer;ZLkotlin/jvm/functions/Function0;)V

    .line 282
    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;->getTrailingIcon()Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p0

    invoke-interface {p0, v1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final updateLine1ConfigForAutocompleteAffordance$lambda$0(Lcom/stripe/android/uicore/elements/AddressInputMode;)Lkotlin/Unit;
    .locals 0

    .line 276
    check-cast p0, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;

    invoke-interface {p0}, Lcom/stripe/android/uicore/address/AutocompleteCapableInputMode;->getOnNavigation()Lkotlin/jvm/functions/Function0;

    move-result-object p0

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 277
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final updateLine1WithAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SectionFieldElement;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressInputMode;Z)V
    .locals 2

    const-string v0, "field"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "addressInputMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 247
    invoke-interface {p0}, Lcom/stripe/android/uicore/elements/SectionFieldElement;->getIdentifier()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v0

    sget-object v1, Lcom/stripe/android/uicore/elements/IdentifierSpec;->Companion:Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/elements/IdentifierSpec$Companion;->getLine1()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 248
    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/stripe/android/uicore/elements/SimpleTextElement;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextElement;->getController()Lcom/stripe/android/uicore/elements/TextFieldController;

    move-result-object p0

    goto :goto_1

    :cond_1
    move-object p0, v1

    .line 249
    :goto_1
    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;

    goto :goto_2

    :cond_2
    move-object p0, v1

    :goto_2
    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/stripe/android/uicore/elements/SimpleTextFieldController;->getTextFieldConfig()Lcom/stripe/android/uicore/elements/TextFieldConfig;

    move-result-object p0

    goto :goto_3

    :cond_3
    move-object p0, v1

    .line 250
    :goto_3
    instance-of v0, p0, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    if-eqz v0, :cond_4

    move-object v1, p0

    check-cast v1, Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;

    :cond_4
    if-eqz v1, :cond_5

    .line 252
    invoke-static {v1, p1, p2, p3}, Lcom/stripe/android/uicore/elements/AddressElementKt;->updateLine1ConfigForAutocompleteAffordance(Lcom/stripe/android/uicore/elements/SimpleTextFieldConfig;Ljava/lang/String;Lcom/stripe/android/uicore/elements/AddressInputMode;Z)V

    :cond_5
    return-void
.end method
