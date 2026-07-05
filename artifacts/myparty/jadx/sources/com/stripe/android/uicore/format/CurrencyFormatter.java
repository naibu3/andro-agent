package com.stripe.android.uicore.format;

import com.stripe.android.model.CreateFinancialConnectionsSessionForDeferredPaymentParams;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.codec.language.bm.Rule;

/* compiled from: CurrencyFormatter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/uicore/format/CurrencyFormatter;", "", "<init>", "()V", "MAJOR_UNIT_BASE", "", "SERVER_DECIMAL_DIGITS", "", "", "", "", "format", CreateFinancialConnectionsSessionForDeferredPaymentParams.PARAM_AMOUNT, "", "amountCurrencyCode", "targetLocale", "Ljava/util/Locale;", "amountCurrency", "Ljava/util/Currency;", "getDefaultDecimalDigits", "currency", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurrencyFormatter {
    private static final double MAJOR_UNIT_BASE = 10.0d;
    public static final CurrencyFormatter INSTANCE = new CurrencyFormatter();
    private static final Map<Set<String>, Integer> SERVER_DECIMAL_DIGITS = MapsKt.mapOf(TuplesKt.to(SetsKt.setOf((Object[]) new String[]{"UGX", "AFN", Rule.ALL, "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"}), 2));
    public static final int $stable = 8;

    private CurrencyFormatter() {
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, String str, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
        }
        return currencyFormatter.format(j, str, locale);
    }

    public final String format(long amount, String amountCurrencyCode, Locale targetLocale) {
        Intrinsics.checkNotNullParameter(amountCurrencyCode, "amountCurrencyCode");
        Intrinsics.checkNotNullParameter(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
        return format(amount, currency, targetLocale);
    }

    public static /* synthetic */ String format$default(CurrencyFormatter currencyFormatter, long j, Currency currency, Locale locale, int i, Object obj) {
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
        }
        return currencyFormatter.format(j, currency, locale);
    }

    public final String format(long amount, Currency amountCurrency, Locale targetLocale) {
        Intrinsics.checkNotNullParameter(amountCurrency, "amountCurrency");
        Intrinsics.checkNotNullParameter(targetLocale, "targetLocale");
        int defaultDecimalDigits = getDefaultDecimalDigits(amountCurrency);
        double dPow = amount / Math.pow(MAJOR_UNIT_BASE, defaultDecimalDigits);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            Result.Companion companion = Result.INSTANCE;
            CurrencyFormatter currencyFormatter = this;
            Intrinsics.checkNotNull(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(defaultDecimalDigits);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            Result.m9118constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        String str = currencyInstance.format(dPow);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final int getDefaultDecimalDigits(Currency currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Map<Set<String>, Integer> map = SERVER_DECIMAL_DIGITS;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Set<String>, Integer> entry : map.entrySet()) {
            Set<String> key = entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (key.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) CollectionsKt.firstOrNull((List) arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
