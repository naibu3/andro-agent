package com.stripe.android.model;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SignUpParams.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010'\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030(J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0098\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016¨\u0006="}, d2 = {"Lcom/stripe/android/model/SignUpParams;", "", "email", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "country", "name", "locale", "Ljava/util/Locale;", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "currency", "incentiveEligibilitySession", "Lcom/stripe/android/model/IncentiveEligibilitySession;", "requestSurface", "consentAction", "Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "verificationToken", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPhoneNumber", "getCountry", "getName", "getLocale", "()Ljava/util/Locale;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getIncentiveEligibilitySession", "()Lcom/stripe/android/model/IncentiveEligibilitySession;", "getRequestSurface", "getConsentAction", "()Lcom/stripe/android/model/ConsumerSignUpConsentAction;", "getVerificationToken", "getAppId", "toParamMap", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/String;Lcom/stripe/android/model/IncentiveEligibilitySession;Ljava/lang/String;Lcom/stripe/android/model/ConsumerSignUpConsentAction;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/SignUpParams;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "payments-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SignUpParams {
    private final Long amount;
    private final String appId;
    private final ConsumerSignUpConsentAction consentAction;
    private final String country;
    private final String currency;
    private final String email;
    private final IncentiveEligibilitySession incentiveEligibilitySession;
    private final Locale locale;
    private final String name;
    private final String phoneNumber;
    private final String requestSurface;
    private final String verificationToken;

    public static /* synthetic */ SignUpParams copy$default(SignUpParams signUpParams, String str, String str2, String str3, String str4, Locale locale, Long l, String str5, IncentiveEligibilitySession incentiveEligibilitySession, String str6, ConsumerSignUpConsentAction consumerSignUpConsentAction, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpParams.email;
        }
        if ((i & 2) != 0) {
            str2 = signUpParams.phoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = signUpParams.country;
        }
        if ((i & 8) != 0) {
            str4 = signUpParams.name;
        }
        if ((i & 16) != 0) {
            locale = signUpParams.locale;
        }
        if ((i & 32) != 0) {
            l = signUpParams.amount;
        }
        if ((i & 64) != 0) {
            str5 = signUpParams.currency;
        }
        if ((i & 128) != 0) {
            incentiveEligibilitySession = signUpParams.incentiveEligibilitySession;
        }
        if ((i & 256) != 0) {
            str6 = signUpParams.requestSurface;
        }
        if ((i & 512) != 0) {
            consumerSignUpConsentAction = signUpParams.consentAction;
        }
        if ((i & 1024) != 0) {
            str7 = signUpParams.verificationToken;
        }
        if ((i & 2048) != 0) {
            str8 = signUpParams.appId;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        ConsumerSignUpConsentAction consumerSignUpConsentAction2 = consumerSignUpConsentAction;
        String str12 = str5;
        IncentiveEligibilitySession incentiveEligibilitySession2 = incentiveEligibilitySession;
        Locale locale2 = locale;
        Long l2 = l;
        return signUpParams.copy(str, str2, str3, str4, locale2, l2, str12, incentiveEligibilitySession2, str11, consumerSignUpConsentAction2, str9, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component10, reason: from getter */
    public final ConsumerSignUpConsentAction getConsentAction() {
        return this.consentAction;
    }

    /* renamed from: component11, reason: from getter */
    public final String getVerificationToken() {
        return this.verificationToken;
    }

    /* renamed from: component12, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final Locale getLocale() {
        return this.locale;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* renamed from: component8, reason: from getter */
    public final IncentiveEligibilitySession getIncentiveEligibilitySession() {
        return this.incentiveEligibilitySession;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRequestSurface() {
        return this.requestSurface;
    }

    public final SignUpParams copy(String email, String phoneNumber, String country, String name, Locale locale, Long amount, String currency, IncentiveEligibilitySession incentiveEligibilitySession, String requestSurface, ConsumerSignUpConsentAction consentAction, String verificationToken, String appId) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(requestSurface, "requestSurface");
        Intrinsics.checkNotNullParameter(consentAction, "consentAction");
        return new SignUpParams(email, phoneNumber, country, name, locale, amount, currency, incentiveEligibilitySession, requestSurface, consentAction, verificationToken, appId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpParams)) {
            return false;
        }
        SignUpParams signUpParams = (SignUpParams) other;
        return Intrinsics.areEqual(this.email, signUpParams.email) && Intrinsics.areEqual(this.phoneNumber, signUpParams.phoneNumber) && Intrinsics.areEqual(this.country, signUpParams.country) && Intrinsics.areEqual(this.name, signUpParams.name) && Intrinsics.areEqual(this.locale, signUpParams.locale) && Intrinsics.areEqual(this.amount, signUpParams.amount) && Intrinsics.areEqual(this.currency, signUpParams.currency) && Intrinsics.areEqual(this.incentiveEligibilitySession, signUpParams.incentiveEligibilitySession) && Intrinsics.areEqual(this.requestSurface, signUpParams.requestSurface) && this.consentAction == signUpParams.consentAction && Intrinsics.areEqual(this.verificationToken, signUpParams.verificationToken) && Intrinsics.areEqual(this.appId, signUpParams.appId);
    }

    public int hashCode() {
        int iHashCode = this.email.hashCode() * 31;
        String str = this.phoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.country;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Locale locale = this.locale;
        int iHashCode5 = (iHashCode4 + (locale == null ? 0 : locale.hashCode())) * 31;
        Long l = this.amount;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.currency;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        IncentiveEligibilitySession incentiveEligibilitySession = this.incentiveEligibilitySession;
        int iHashCode8 = (((((iHashCode7 + (incentiveEligibilitySession == null ? 0 : incentiveEligibilitySession.hashCode())) * 31) + this.requestSurface.hashCode()) * 31) + this.consentAction.hashCode()) * 31;
        String str5 = this.verificationToken;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.appId;
        return iHashCode9 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SignUpParams(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", country=" + this.country + ", name=" + this.name + ", locale=" + this.locale + ", amount=" + this.amount + ", currency=" + this.currency + ", incentiveEligibilitySession=" + this.incentiveEligibilitySession + ", requestSurface=" + this.requestSurface + ", consentAction=" + this.consentAction + ", verificationToken=" + this.verificationToken + ", appId=" + this.appId + ")";
    }

    public SignUpParams(String email, String str, String str2, String str3, Locale locale, Long l, String str4, IncentiveEligibilitySession incentiveEligibilitySession, String requestSurface, ConsumerSignUpConsentAction consentAction, String str5, String str6) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(requestSurface, "requestSurface");
        Intrinsics.checkNotNullParameter(consentAction, "consentAction");
        this.email = email;
        this.phoneNumber = str;
        this.country = str2;
        this.name = str3;
        this.locale = locale;
        this.amount = l;
        this.currency = str4;
        this.incentiveEligibilitySession = incentiveEligibilitySession;
        this.requestSurface = requestSurface;
        this.consentAction = consentAction;
        this.verificationToken = str5;
        this.appId = str6;
    }

    public /* synthetic */ SignUpParams(String str, String str2, String str3, String str4, Locale locale, Long l, String str5, IncentiveEligibilitySession incentiveEligibilitySession, String str6, ConsumerSignUpConsentAction consumerSignUpConsentAction, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, locale, l, str5, incentiveEligibilitySession, str6, consumerSignUpConsentAction, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getName() {
        return this.name;
    }

    public final Locale getLocale() {
        return this.locale;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final IncentiveEligibilitySession getIncentiveEligibilitySession() {
        return this.incentiveEligibilitySession;
    }

    public final String getRequestSurface() {
        return this.requestSurface;
    }

    public final ConsumerSignUpConsentAction getConsentAction() {
        return this.consentAction;
    }

    public final String getVerificationToken() {
        return this.verificationToken;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Map<String, ?> toParamMap() {
        String lowerCase = this.email.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Map mapMutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("email_address", lowerCase), TuplesKt.to(CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, this.amount), TuplesKt.to("currency", this.currency), TuplesKt.to("consent_action", this.consentAction.getValue()), TuplesKt.to("request_surface", this.requestSurface));
        Locale locale = this.locale;
        if (locale != null) {
            mapMutableMapOf.put("locale", locale.toLanguageTag());
        }
        String str = this.phoneNumber;
        if (str != null) {
            if (StringsKt.isBlank(str)) {
                str = null;
            }
            if (str != null) {
                mapMutableMapOf.put("phone_number", str);
                mapMutableMapOf.put("country_inferring_method", "PHONE_NUMBER");
            }
        }
        String str2 = this.country;
        if (str2 != null) {
            if (StringsKt.isBlank(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                mapMutableMapOf.put("country", str2);
            }
        }
        String str3 = this.name;
        if (str3 != null) {
            if (StringsKt.isBlank(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                mapMutableMapOf.put("legal_name", str3);
            }
        }
        String str4 = this.verificationToken;
        if (str4 != null) {
            mapMutableMapOf.put("android_verification_token", str4);
        }
        String str5 = this.appId;
        if (str5 != null) {
            mapMutableMapOf.put("app_id", str5);
        }
        IncentiveEligibilitySession incentiveEligibilitySession = this.incentiveEligibilitySession;
        Map<String, String> paramMap = incentiveEligibilitySession != null ? incentiveEligibilitySession.toParamMap() : null;
        if (paramMap == null) {
            paramMap = MapsKt.emptyMap();
        }
        mapMutableMapOf.putAll(paramMap);
        return MapsKt.toMap(mapMutableMapOf);
    }
}
