package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.LocaleListCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.Locale;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* compiled from: CountryTextInputLayout.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 K2\u00020\u0001:\u0002KLB'\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u001c\u001a\u0004\u0018\u00010\u0013H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0007J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u000202H\u0016J\n\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020\u001e2\b\u00106\u001a\u0004\u0018\u000104H\u0014J\u0015\u00107\u001a\u00020\u001e2\u0006\u00106\u001a\u000208H\u0001¢\u0006\u0002\b9J\b\u0010:\u001a\u00020\rH\u0002J\b\u0010;\u001a\u00020\u001eH\u0002J\u001b\u0010<\u001a\u00020\u001e2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>H\u0000¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0001¢\u0006\u0002\bBJ\u0015\u0010A\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020?H\u0001¢\u0006\u0002\bBJ\u0010\u0010C\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0007J\u0015\u0010D\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013H\u0000¢\u0006\u0002\bEJ\r\u0010F\u001a\u00020\u001eH\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020\u001eH\u0002J\b\u0010I\u001a\u00020JH\u0002R\u0012\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R5\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00138@@@X\u0081\u008e\u0002¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010 \u001a\u0004\u0018\u00010!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R0\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e0%8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b&\u0010\u000f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001e0%8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006M"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "countryAutoCompleteStyleRes", "itemLayoutRes", "countryAutocomplete", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$annotations", "()V", "getCountryAutocomplete", "()Landroid/widget/AutoCompleteTextView;", "<set-?>", "Lcom/stripe/android/core/model/CountryCode;", "selectedCountryCode", "getSelectedCountryCode$payments_core_release$annotations", "getSelectedCountryCode$payments_core_release", "()Lcom/stripe/android/core/model/CountryCode;", "setSelectedCountryCode$payments_core_release", "(Lcom/stripe/android/core/model/CountryCode;)V", "selectedCountryCode$delegate", "Lkotlin/properties/ReadWriteProperty;", "getSelectedCountryCode", "setSelectedCountryCode", "", "countryCode", "selectedCountry", "Lcom/stripe/android/core/model/Country;", "getSelectedCountry$payments_core_release", "()Lcom/stripe/android/core/model/Country;", "countryChangeCallback", "Lkotlin/Function1;", "getCountryChangeCallback$payments_core_release$annotations", "getCountryChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setCountryChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "countryCodeChangeCallback", "getCountryCodeChangeCallback", "setCountryCodeChangeCallback", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "setEnabled", ViewProps.ENABLED, "", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "restoreSelectedCountry", "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "restoreSelectedCountry$payments_core_release", "initializeCountryAutoCompleteWithStyle", "updateInitialCountry", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "setAllowedCountryCodes$payments_core_release", "setCountrySelected", "setCountrySelected$payments_core_release", "updateUiForCountryEntered", "updatedSelectedCountryCode", "updatedSelectedCountryCode$payments_core_release", "validateCountry", "validateCountry$payments_core_release", "clearError", "getLocale", "Ljava/util/Locale;", "Companion", "SelectedCountryState", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CountryTextInputLayout extends TextInputLayout {

    @Deprecated
    public static final int INVALID_COUNTRY_AUTO_COMPLETE_STYLE = 0;
    private CountryAdapter countryAdapter;
    private int countryAutoCompleteStyleRes;
    private final AutoCompleteTextView countryAutocomplete;
    private /* synthetic */ Function1<? super Country, Unit> countryChangeCallback;
    private /* synthetic */ Function1<? super CountryCode, Unit> countryCodeChangeCallback;
    private int itemLayoutRes;

    /* renamed from: selectedCountryCode$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty selectedCountryCode;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode$payments_core_release()Lcom/stripe/android/core/model/CountryCode;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_ITEM_LAYOUT = R.layout.stripe_country_text_view;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getCountryAutocomplete$annotations() {
    }

    @Deprecated(message = "Will be removed in a future version", replaceWith = @ReplaceWith(expression = "countryCodeChangeCallback", imports = {}))
    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getSelectedCountryCode$payments_core_release$annotations() {
    }

    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? com.google.android.material.R.attr.textInputStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(final Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int i2 = DEFAULT_ITEM_LAYOUT;
        this.itemLayoutRes = i2;
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.selectedCountryCode = new ObservableProperty<CountryCode>(obj) { // from class: com.stripe.android.view.CountryTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, CountryCode oldValue, CountryCode newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                CountryCode countryCode = newValue;
                if (countryCode != null) {
                    this.getCountryCodeChangeCallback().invoke(countryCode);
                    Country countryByCode = CountryUtils.INSTANCE.getCountryByCode(countryCode, this.getLocale());
                    if (countryByCode != null) {
                        this.getCountryChangeCallback$payments_core_release().invoke(countryByCode);
                    }
                }
            }
        };
        this.countryChangeCallback = new Function1() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CountryTextInputLayout.countryChangeCallback$lambda$4((Country) obj2);
            }
        };
        this.countryCodeChangeCallback = new Function1() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CountryTextInputLayout.countryCodeChangeCallback$lambda$5((CountryCode) obj2);
            }
        };
        int[] StripeCountryAutoCompleteTextInputLayout = R.styleable.StripeCountryAutoCompleteTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(StripeCountryAutoCompleteTextInputLayout, "StripeCountryAutoCompleteTextInputLayout");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StripeCountryAutoCompleteTextInputLayout, 0, 0);
        this.countryAutoCompleteStyleRes = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryAutoCompleteStyle, 0);
        this.itemLayoutRes = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout, i2);
        typedArrayObtainStyledAttributes.recycle();
        AutoCompleteTextView autoCompleteTextViewInitializeCountryAutoCompleteWithStyle = initializeCountryAutoCompleteWithStyle();
        this.countryAutocomplete = autoCompleteTextViewInitializeCountryAutoCompleteWithStyle;
        addView(autoCompleteTextViewInitializeCountryAutoCompleteWithStyle, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new CountryAdapter(context, CountryUtils.INSTANCE.getOrderedCountries(getLocale()), this.itemLayoutRes, new Function1() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CountryTextInputLayout._init_$lambda$7(context, this, (ViewGroup) obj2);
            }
        });
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setThreshold(0);
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setAdapter(this.countryAdapter);
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda3
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i3, long j) {
                CountryTextInputLayout._init_$lambda$8(this.f$0, adapterView, view, i3, j);
            }
        });
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CountryTextInputLayout._init_$lambda$11(this.f$0, view, z);
            }
        });
        setSelectedCountryCode$payments_core_release(this.countryAdapter.getFirstItem$payments_core_release().getCode());
        updateInitialCountry();
        final String string = getResources().getString(R.string.stripe_address_country_invalid);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        autoCompleteTextViewInitializeCountryAutoCompleteWithStyle.setValidator(new CountryAutoCompleteTextViewValidator(this.countryAdapter, new Function1() { // from class: com.stripe.android.view.CountryTextInputLayout$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return CountryTextInputLayout._init_$lambda$12(this.f$0, string, (Country) obj2);
            }
        }));
    }

    public final AutoCompleteTextView getCountryAutocomplete() {
        return this.countryAutocomplete;
    }

    public final CountryCode getSelectedCountryCode$payments_core_release() {
        return (CountryCode) this.selectedCountryCode.getValue(this, $$delegatedProperties[0]);
    }

    public final void setSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        this.selectedCountryCode.setValue(this, $$delegatedProperties[0], countryCode);
    }

    public final CountryCode getSelectedCountryCode() {
        return getSelectedCountryCode$payments_core_release();
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final Country getSelectedCountry$payments_core_release() {
        CountryCode selectedCountryCode$payments_core_release = getSelectedCountryCode$payments_core_release();
        if (selectedCountryCode$payments_core_release != null) {
            return CountryUtils.INSTANCE.getCountryByCode(selectedCountryCode$payments_core_release, getLocale());
        }
        return null;
    }

    public final Function1<Country, Unit> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final void setCountryChangeCallback$payments_core_release(Function1<? super Country, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryChangeCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit countryChangeCallback$lambda$4(Country it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<CountryCode, Unit> getCountryCodeChangeCallback() {
        return this.countryCodeChangeCallback;
    }

    public final void setCountryCodeChangeCallback(Function1<? super CountryCode, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.countryCodeChangeCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit countryCodeChangeCallback$lambda$5(CountryCode it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView _init_$lambda$7(Context context, CountryTextInputLayout countryTextInputLayout, ViewGroup it) {
        Intrinsics.checkNotNullParameter(it, "it");
        View viewInflate = LayoutInflater.from(context).inflate(countryTextInputLayout.itemLayoutRes, it, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        return (TextView) viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CountryTextInputLayout countryTextInputLayout, AdapterView adapterView, View view, int i, long j) {
        countryTextInputLayout.updatedSelectedCountryCode$payments_core_release(countryTextInputLayout.countryAdapter.getItem(i).getCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$11(CountryTextInputLayout countryTextInputLayout, View view, boolean z) {
        if (z) {
            countryTextInputLayout.countryAutocomplete.showDropDown();
            return;
        }
        String string = countryTextInputLayout.countryAutocomplete.getText().toString();
        CountryCode countryCodeByName = CountryUtils.INSTANCE.getCountryCodeByName(string, countryTextInputLayout.getLocale());
        if (countryCodeByName != null) {
            countryTextInputLayout.updateUiForCountryEntered(countryCodeByName);
        } else if (CountryUtils.INSTANCE.getCountryByCode(CountryCode.INSTANCE.create(string), countryTextInputLayout.getLocale()) != null) {
            countryTextInputLayout.updateUiForCountryEntered(CountryCode.INSTANCE.create(string));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$12(CountryTextInputLayout countryTextInputLayout, String str, Country country) {
        countryTextInputLayout.setSelectedCountryCode$payments_core_release(country != null ? country.getCode() : null);
        if (country != null) {
            countryTextInputLayout.clearError();
        } else {
            countryTextInputLayout.setError(str);
            countryTextInputLayout.setErrorEnabled(true);
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                view.removeOnLayoutChangeListener(this);
                this.this$0.getCountryAutocomplete().setEnabled(enabled);
            }
        });
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        Country selectedCountry$payments_core_release = getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            return new SelectedCountryState(selectedCountry$payments_core_release.getCode(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof SelectedCountryState) {
            restoreSelectedCountry$payments_core_release((SelectedCountryState) state);
        } else {
            super.onRestoreInstanceState(state);
        }
    }

    public final void restoreSelectedCountry$payments_core_release(SelectedCountryState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onRestoreInstanceState(state.getSuperState());
        CountryCode countryCode = state.getCountryCode();
        updatedSelectedCountryCode$payments_core_release(countryCode);
        updateUiForCountryEntered(countryCode);
        requestLayout();
    }

    private final AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        if (this.countryAutoCompleteStyleRes == 0) {
            return new AutoCompleteTextView(getContext(), null, androidx.appcompat.R.attr.autoCompleteTextViewStyle);
        }
        return new AutoCompleteTextView(getContext(), null, 0, this.countryAutoCompleteStyleRes);
    }

    private final void updateInitialCountry() {
        Country firstItem$payments_core_release = this.countryAdapter.getFirstItem$payments_core_release();
        this.countryAutocomplete.setText(firstItem$payments_core_release.getName());
        setSelectedCountryCode$payments_core_release(firstItem$payments_core_release.getCode());
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        if (this.countryAdapter.updateUnfilteredCountries$payments_core_release(allowedCountryCodes)) {
            updateInitialCountry();
        }
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(countryCode);
    }

    @Deprecated(message = "This will be removed in a future version", replaceWith = @ReplaceWith(expression = "setCountrySelected(CountryCode.create(countryCode))", imports = {"com.stripe.android.model.CountryCode"}))
    public final void setCountrySelected$payments_core_release(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        updateUiForCountryEntered(CountryCode.INSTANCE.create(countryCode));
    }

    public final void updateUiForCountryEntered(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Country countryByCode = CountryUtils.INSTANCE.getCountryByCode(countryCode, getLocale());
        if (countryByCode != null) {
            updatedSelectedCountryCode$payments_core_release(countryCode);
        } else {
            countryByCode = CountryUtils.INSTANCE.getCountryByCode(getSelectedCountryCode$payments_core_release(), getLocale());
        }
        this.countryAutocomplete.setText(countryByCode != null ? countryByCode.getName() : null);
    }

    public final void updatedSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        clearError();
        if (Intrinsics.areEqual(getSelectedCountryCode$payments_core_release(), countryCode)) {
            return;
        }
        setSelectedCountryCode$payments_core_release(countryCode);
    }

    public final void validateCountry$payments_core_release() {
        this.countryAutocomplete.performValidation();
    }

    private final void clearError() {
        setError(null);
        setErrorEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Locale getLocale() {
        Locale locale = LocaleListCompat.getAdjustedDefault().get(0);
        Intrinsics.checkNotNull(locale);
        return locale;
    }

    /* compiled from: CountryTextInputLayout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$Companion;", "", "<init>", "()V", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "", "DEFAULT_ITEM_LAYOUT", "getDEFAULT_ITEM_LAYOUT", "()I", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getDEFAULT_ITEM_LAYOUT() {
            return CountryTextInputLayout.DEFAULT_ITEM_LAYOUT;
        }
    }

    /* compiled from: CountryTextInputLayout.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "Landroid/os/Parcelable;", "countryCode", "Lcom/stripe/android/core/model/CountryCode;", "superState", "<init>", "(Lcom/stripe/android/core/model/CountryCode;Landroid/os/Parcelable;)V", "getCountryCode", "()Lcom/stripe/android/core/model/CountryCode;", "getSuperState", "()Landroid/os/Parcelable;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SelectedCountryState implements Parcelable {
        private final CountryCode countryCode;
        private final Parcelable superState;
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CountryTextInputLayout.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SelectedCountryState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectedCountryState((CountryCode) parcel.readParcelable(SelectedCountryState.class.getClassLoader()), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SelectedCountryState[] newArray(int i) {
                return new SelectedCountryState[i];
            }
        }

        public static /* synthetic */ SelectedCountryState copy$default(SelectedCountryState selectedCountryState, CountryCode countryCode, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode = selectedCountryState.countryCode;
            }
            if ((i & 2) != 0) {
                parcelable = selectedCountryState.superState;
            }
            return selectedCountryState.copy(countryCode, parcelable);
        }

        /* renamed from: component1, reason: from getter */
        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component2, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final SelectedCountryState copy(CountryCode countryCode, Parcelable superState) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            return new SelectedCountryState(countryCode, superState);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectedCountryState)) {
                return false;
            }
            SelectedCountryState selectedCountryState = (SelectedCountryState) other;
            return Intrinsics.areEqual(this.countryCode, selectedCountryState.countryCode) && Intrinsics.areEqual(this.superState, selectedCountryState.superState);
        }

        public int hashCode() {
            int iHashCode = this.countryCode.hashCode() * 31;
            Parcelable parcelable = this.superState;
            return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
        }

        public String toString() {
            return "SelectedCountryState(countryCode=" + this.countryCode + ", superState=" + this.superState + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.countryCode, flags);
            dest.writeParcelable(this.superState, flags);
        }

        public SelectedCountryState(CountryCode countryCode, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.countryCode = countryCode;
            this.superState = parcelable;
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }
    }
}
