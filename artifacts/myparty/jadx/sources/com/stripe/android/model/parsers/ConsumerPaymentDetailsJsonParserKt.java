package com.stripe.android.model.parsers;

import kotlin.Metadata;

/* compiled from: ConsumerPaymentDetailsJsonParser.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"FIELD_PAYMENT_DETAILS", "", "FIELD_TYPE", "FIELD_ID", "FIELD_CARD_DETAILS", "FIELD_CARD_LAST_4", "FIELD_BANK_ACCOUNT_DETAILS", "FIELD_BANK_ACCOUNT_LAST_4", "FIELD_BANK_ACCOUNT_BANK_NAME", "FIELD_BILLING_ADDRESS", "FIELD_BILLING_EMAIL_ADDRESS", "FIELD_ADDRESS_COUNTRY_CODE", "FIELD_ADDRESS_POSTAL_CODE", "FIELD_ADDRESS_NAME", "FIELD_ADDRESS_LINE_1", "FIELD_ADDRESS_LINE_2", "FIELD_ADDRESS_LOCALITY", "FIELD_ADDRESS_ADMINISTRATIVE_AREA", "FIELD_CARD_EXPIRY_YEAR", "FIELD_CARD_EXPIRY_MONTH", "FIELD_CARD_BRAND", "FIELD_CARD_NETWORKS", "FIELD_CARD_CHECKS", "FIELD_CARD_CVC_CHECK", "FIELD_BANK_ACCOUNT_BANK_ICON_CODE", "FIELD_IS_DEFAULT", "FIELD_NICKNAME", "FIELD_FUNDING", "payments-model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConsumerPaymentDetailsJsonParserKt {
    private static final String FIELD_ADDRESS_ADMINISTRATIVE_AREA = "administrative_area";
    private static final String FIELD_ADDRESS_COUNTRY_CODE = "country_code";
    private static final String FIELD_ADDRESS_LINE_1 = "line_1";
    private static final String FIELD_ADDRESS_LINE_2 = "line_2";
    private static final String FIELD_ADDRESS_LOCALITY = "locality";
    private static final String FIELD_ADDRESS_NAME = "name";
    private static final String FIELD_ADDRESS_POSTAL_CODE = "postal_code";
    private static final String FIELD_BANK_ACCOUNT_BANK_ICON_CODE = "bank_icon_code";
    private static final String FIELD_BANK_ACCOUNT_BANK_NAME = "bank_name";
    private static final String FIELD_BANK_ACCOUNT_DETAILS = "bank_account_details";
    private static final String FIELD_BANK_ACCOUNT_LAST_4 = "last4";
    private static final String FIELD_BILLING_ADDRESS = "billing_address";
    private static final String FIELD_BILLING_EMAIL_ADDRESS = "billing_email_address";
    private static final String FIELD_CARD_BRAND = "brand";
    private static final String FIELD_CARD_CHECKS = "checks";
    private static final String FIELD_CARD_CVC_CHECK = "cvc_check";
    private static final String FIELD_CARD_DETAILS = "card_details";
    private static final String FIELD_CARD_EXPIRY_MONTH = "exp_month";
    private static final String FIELD_CARD_EXPIRY_YEAR = "exp_year";
    private static final String FIELD_CARD_LAST_4 = "last4";
    private static final String FIELD_CARD_NETWORKS = "networks";
    private static final String FIELD_FUNDING = "funding";
    private static final String FIELD_ID = "id";
    private static final String FIELD_IS_DEFAULT = "is_default";
    private static final String FIELD_NICKNAME = "nickname";
    private static final String FIELD_PAYMENT_DETAILS = "redacted_payment_details";
    private static final String FIELD_TYPE = "type";
}
