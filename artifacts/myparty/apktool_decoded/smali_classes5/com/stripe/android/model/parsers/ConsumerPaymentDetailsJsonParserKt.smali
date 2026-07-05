.class public final Lcom/stripe/android/model/parsers/ConsumerPaymentDetailsJsonParserKt;
.super Ljava/lang/Object;
.source "ConsumerPaymentDetailsJsonParser.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0008\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000c\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"
    }
    d2 = {
        "FIELD_PAYMENT_DETAILS",
        "",
        "FIELD_TYPE",
        "FIELD_ID",
        "FIELD_CARD_DETAILS",
        "FIELD_CARD_LAST_4",
        "FIELD_BANK_ACCOUNT_DETAILS",
        "FIELD_BANK_ACCOUNT_LAST_4",
        "FIELD_BANK_ACCOUNT_BANK_NAME",
        "FIELD_BILLING_ADDRESS",
        "FIELD_BILLING_EMAIL_ADDRESS",
        "FIELD_ADDRESS_COUNTRY_CODE",
        "FIELD_ADDRESS_POSTAL_CODE",
        "FIELD_ADDRESS_NAME",
        "FIELD_ADDRESS_LINE_1",
        "FIELD_ADDRESS_LINE_2",
        "FIELD_ADDRESS_LOCALITY",
        "FIELD_ADDRESS_ADMINISTRATIVE_AREA",
        "FIELD_CARD_EXPIRY_YEAR",
        "FIELD_CARD_EXPIRY_MONTH",
        "FIELD_CARD_BRAND",
        "FIELD_CARD_NETWORKS",
        "FIELD_CARD_CHECKS",
        "FIELD_CARD_CVC_CHECK",
        "FIELD_BANK_ACCOUNT_BANK_ICON_CODE",
        "FIELD_IS_DEFAULT",
        "FIELD_NICKNAME",
        "FIELD_FUNDING",
        "payments-model_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FIELD_ADDRESS_ADMINISTRATIVE_AREA:Ljava/lang/String; = "administrative_area"

.field private static final FIELD_ADDRESS_COUNTRY_CODE:Ljava/lang/String; = "country_code"

.field private static final FIELD_ADDRESS_LINE_1:Ljava/lang/String; = "line_1"

.field private static final FIELD_ADDRESS_LINE_2:Ljava/lang/String; = "line_2"

.field private static final FIELD_ADDRESS_LOCALITY:Ljava/lang/String; = "locality"

.field private static final FIELD_ADDRESS_NAME:Ljava/lang/String; = "name"

.field private static final FIELD_ADDRESS_POSTAL_CODE:Ljava/lang/String; = "postal_code"

.field private static final FIELD_BANK_ACCOUNT_BANK_ICON_CODE:Ljava/lang/String; = "bank_icon_code"

.field private static final FIELD_BANK_ACCOUNT_BANK_NAME:Ljava/lang/String; = "bank_name"

.field private static final FIELD_BANK_ACCOUNT_DETAILS:Ljava/lang/String; = "bank_account_details"

.field private static final FIELD_BANK_ACCOUNT_LAST_4:Ljava/lang/String; = "last4"

.field private static final FIELD_BILLING_ADDRESS:Ljava/lang/String; = "billing_address"

.field private static final FIELD_BILLING_EMAIL_ADDRESS:Ljava/lang/String; = "billing_email_address"

.field private static final FIELD_CARD_BRAND:Ljava/lang/String; = "brand"

.field private static final FIELD_CARD_CHECKS:Ljava/lang/String; = "checks"

.field private static final FIELD_CARD_CVC_CHECK:Ljava/lang/String; = "cvc_check"

.field private static final FIELD_CARD_DETAILS:Ljava/lang/String; = "card_details"

.field private static final FIELD_CARD_EXPIRY_MONTH:Ljava/lang/String; = "exp_month"

.field private static final FIELD_CARD_EXPIRY_YEAR:Ljava/lang/String; = "exp_year"

.field private static final FIELD_CARD_LAST_4:Ljava/lang/String; = "last4"

.field private static final FIELD_CARD_NETWORKS:Ljava/lang/String; = "networks"

.field private static final FIELD_FUNDING:Ljava/lang/String; = "funding"

.field private static final FIELD_ID:Ljava/lang/String; = "id"

.field private static final FIELD_IS_DEFAULT:Ljava/lang/String; = "is_default"

.field private static final FIELD_NICKNAME:Ljava/lang/String; = "nickname"

.field private static final FIELD_PAYMENT_DETAILS:Ljava/lang/String; = "redacted_payment_details"

.field private static final FIELD_TYPE:Ljava/lang/String; = "type"
