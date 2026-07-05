package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import com.stripe.android.core.model.Country;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CountryAutoCompleteTextViewValidator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/view/CountryAutoCompleteTextViewValidator;", "Landroid/widget/AutoCompleteTextView$Validator;", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "onCountrySelected", "Lkotlin/Function1;", "Lcom/stripe/android/core/model/Country;", "", "<init>", "(Lcom/stripe/android/view/CountryAdapter;Lkotlin/jvm/functions/Function1;)V", "fixText", "", "invalidText", "isValid", "", "text", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CountryAutoCompleteTextViewValidator implements AutoCompleteTextView.Validator {
    public static final int $stable = 8;
    private final CountryAdapter countryAdapter;
    private final Function1<Country, Unit> onCountrySelected;

    /* JADX WARN: Multi-variable type inference failed */
    public CountryAutoCompleteTextViewValidator(CountryAdapter countryAdapter, Function1<? super Country, Unit> onCountrySelected) {
        Intrinsics.checkNotNullParameter(countryAdapter, "countryAdapter");
        Intrinsics.checkNotNullParameter(onCountrySelected, "onCountrySelected");
        this.countryAdapter = countryAdapter;
        this.onCountrySelected = onCountrySelected;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public CharSequence fixText(CharSequence invalidText) {
        return invalidText == null ? "" : invalidText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AutoCompleteTextView.Validator
    public boolean isValid(CharSequence text) {
        Object next;
        Iterator<T> it = this.countryAdapter.getUnfilteredCountries$payments_core_release().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Country) next).getName(), String.valueOf(text))) {
                break;
            }
        }
        this.onCountrySelected.invoke(next);
        return ((Country) next) != null;
    }
}
