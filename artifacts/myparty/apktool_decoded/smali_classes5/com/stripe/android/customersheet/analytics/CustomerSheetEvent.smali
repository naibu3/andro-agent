.class public abstract Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;
.super Ljava/lang/Object;
.source "CustomerSheetEvent.kt"

# interfaces
.implements Lcom/stripe/android/core/networking/AnalyticsEvent;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodCanceled;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodFailed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodSucceeded;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardBrandDisallowed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardNumberCompleted;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Companion;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodFailed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodSucceeded;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditCompleted;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditTapped;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadFailed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodFailed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodSucceeded;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenHidden;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenPresented;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$SelectPaymentMethod;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionFailed;,
        Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionSucceeded;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00081\u0018\u0000  2\u00020\u0001:\u0017\n\u000b\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R \u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u0082\u0001\u0016!\"#$%&\'()*+,-./0123456\u00a8\u00067"
    }
    d2 = {
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;",
        "Lcom/stripe/android/core/networking/AnalyticsEvent;",
        "<init>",
        "()V",
        "additionalParams",
        "",
        "",
        "",
        "getAdditionalParams",
        "()Ljava/util/Map;",
        "Init",
        "ScreenPresented",
        "ScreenHidden",
        "SelectPaymentMethod",
        "ConfirmPaymentMethodSucceeded",
        "ConfirmPaymentMethodFailed",
        "EditTapped",
        "EditCompleted",
        "RemovePaymentMethodSucceeded",
        "RemovePaymentMethodFailed",
        "AttachPaymentMethodSucceeded",
        "AttachPaymentMethodCanceled",
        "AttachPaymentMethodFailed",
        "ShowPaymentOptionBrands",
        "HidePaymentOptionBrands",
        "BrandChoiceSelected",
        "UpdatePaymentOptionSucceeded",
        "UpdatePaymentOptionFailed",
        "CardBrandDisallowed",
        "CardNumberCompleted",
        "LoadSucceeded",
        "LoadFailed",
        "Companion",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodCanceled;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodFailed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$AttachPaymentMethodSucceeded;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$BrandChoiceSelected;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardBrandDisallowed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$CardNumberCompleted;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodFailed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ConfirmPaymentMethodSucceeded;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditCompleted;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$EditTapped;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$HidePaymentOptionBrands;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Init;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadFailed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$LoadSucceeded;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodFailed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$RemovePaymentMethodSucceeded;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenHidden;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ScreenPresented;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$SelectPaymentMethod;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$ShowPaymentOptionBrands;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionFailed;",
        "Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$UpdatePaymentOptionSucceeded;",
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
.field public static final $stable:I = 0x0

.field public static final CS_ADD_PAYMENT_METHOD_SCREEN_PRESENTED:Ljava/lang/String; = "cs_add_payment_method_screen_presented"

.field public static final CS_ADD_PAYMENT_METHOD_VIA_CREATE_ATTACH_FAILED:Ljava/lang/String; = "cs_add_payment_method_via_createAttach_failure"

.field public static final CS_ADD_PAYMENT_METHOD_VIA_CREATE_ATTACH_SUCCEEDED:Ljava/lang/String; = "cs_add_payment_method_via_createAttach_success"

.field public static final CS_ADD_PAYMENT_METHOD_VIA_SETUP_INTENT_CANCELED:Ljava/lang/String; = "cs_add_payment_method_via_setupintent_canceled"

.field public static final CS_ADD_PAYMENT_METHOD_VIA_SETUP_INTENT_FAILED:Ljava/lang/String; = "cs_add_payment_method_via_setup_intent_failure"

.field public static final CS_ADD_PAYMENT_METHOD_VIA_SETUP_INTENT_SUCCEEDED:Ljava/lang/String; = "cs_add_payment_method_via_setup_intent_success"

.field public static final CS_CARD_BRAND_SELECTED:Ljava/lang/String; = "cs_cbc_selected"

.field public static final CS_CARD_NUMBER_COMPLETED:Ljava/lang/String; = "cs_card_number_completed"

.field public static final CS_DISALLOWED_CARD_BRAND:Ljava/lang/String; = "cs_disallowed_card_brand"

.field public static final CS_HIDE_EDITABLE_PAYMENT_OPTION:Ljava/lang/String; = "cs_cancel_edit_screen"

.field public static final CS_HIDE_PAYMENT_OPTION_BRANDS:Ljava/lang/String; = "cs_close_cbc_dropdown"

.field public static final CS_INIT_WITH_CUSTOMER_ADAPTER:Ljava/lang/String; = "cs_init_with_customer_adapter"

.field public static final CS_INIT_WITH_CUSTOMER_SESSION:Ljava/lang/String; = "cs_init_with_customer_session"

.field public static final CS_LOAD_FAILED:Ljava/lang/String; = "cs_load_failed"

.field public static final CS_LOAD_SUCCEEDED:Ljava/lang/String; = "cs_load_succeeded"

.field public static final CS_PAYMENT_METHOD_SELECTED:Ljava/lang/String; = "cs_carousel_payment_method_selected"

.field public static final CS_SELECT_PAYMENT_METHOD_CONFIRMED_SAVED_PM_FAILED:Ljava/lang/String; = "cs_select_payment_method_screen_confirmed_savedpm_failure"

.field public static final CS_SELECT_PAYMENT_METHOD_CONFIRMED_SAVED_PM_SUCCEEDED:Ljava/lang/String; = "cs_select_payment_method_screen_confirmed_savedpm_success"

.field public static final CS_SELECT_PAYMENT_METHOD_DONE_TAPPED:Ljava/lang/String; = "cs_select_payment_method_screen_done_tapped"

.field public static final CS_SELECT_PAYMENT_METHOD_EDIT_TAPPED:Ljava/lang/String; = "cs_select_payment_method_screen_edit_tapped"

.field public static final CS_SELECT_PAYMENT_METHOD_REMOVE_PM_FAILED:Ljava/lang/String; = "cs_select_payment_method_screen_removepm_failure"

.field public static final CS_SELECT_PAYMENT_METHOD_REMOVE_PM_SUCCEEDED:Ljava/lang/String; = "cs_select_payment_method_screen_removepm_success"

.field public static final CS_SELECT_PAYMENT_METHOD_SCREEN_PRESENTED:Ljava/lang/String; = "cs_select_payment_method_screen_presented"

.field public static final CS_SHOW_EDITABLE_PAYMENT_OPTION:Ljava/lang/String; = "cs_open_edit_screen"

.field public static final CS_SHOW_PAYMENT_OPTION_BRANDS:Ljava/lang/String; = "cs_open_cbc_dropdown"

.field public static final CS_UPDATE_PAYMENT_METHOD:Ljava/lang/String; = "cs_update_card"

.field public static final CS_UPDATE_PAYMENT_METHOD_FAILED:Ljava/lang/String; = "cs_update_card_failed"

.field public static final Companion:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Companion;

.field public static final FIELD_ALLOWS_REMOVAL_OF_LAST_SAVED_PAYMENT_METHOD:Ljava/lang/String; = "allows_removal_of_last_saved_payment_method"

.field public static final FIELD_APPEARANCE:Ljava/lang/String; = "appearance"

.field public static final FIELD_BILLING:Ljava/lang/String; = "default_billing_details"

.field public static final FIELD_BILLING_DETAILS_COLLECTION_CONFIGURATION:Ljava/lang/String; = "billing_details_collection_configuration"

.field public static final FIELD_CARD_BRAND_ACCEPTANCE:Ljava/lang/String; = "card_brand_acceptance"

.field public static final FIELD_CBC_EVENT_SOURCE:Ljava/lang/String; = "cbc_event_source"

.field public static final FIELD_CUSTOMER_ACCESS_PROVIDER:Ljava/lang/String; = "customer_access_provider"

.field public static final FIELD_CUSTOMER_SHEET_CONFIGURATION:Ljava/lang/String; = "cs_config"

.field public static final FIELD_ERROR_MESSAGE:Ljava/lang/String; = "error_message"

.field public static final FIELD_GOOGLE_PAY_ENABLED:Ljava/lang/String; = "google_pay_enabled"

.field public static final FIELD_HAS_DEFAULT_PAYMENT_METHOD:Ljava/lang/String; = "has_default_payment_method"

.field public static final FIELD_PAYMENT_METHOD_ORDER:Ljava/lang/String; = "payment_method_order"

.field public static final FIELD_PAYMENT_METHOD_TYPE:Ljava/lang/String; = "payment_method_type"

.field public static final FIELD_PREFERRED_NETWORKS:Ljava/lang/String; = "preferred_networks"

.field public static final FIELD_SELECTED_CARD_BRAND:Ljava/lang/String; = "selected_card_brand"

.field public static final FIELD_SELECTED_LPM:Ljava/lang/String; = "selected_lpm"

.field public static final FIELD_SYNC_DEFAULT_ENABLED:Ljava/lang/String; = "sync_default_enabled"

.field public static final VALUE_ADD_CBC_EVENT_SOURCE:Ljava/lang/String; = "add"

.field public static final VALUE_CARD_BRAND:Ljava/lang/String; = "brand"

.field public static final VALUE_EDIT_CBC_EVENT_SOURCE:Ljava/lang/String; = "edit"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;->Companion:Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/customersheet/analytics/CustomerSheetEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAdditionalParams()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method
