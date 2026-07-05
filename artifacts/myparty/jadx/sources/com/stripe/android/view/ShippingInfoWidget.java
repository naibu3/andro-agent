package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.autofill.HintConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryCode;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.databinding.StripeAddressWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.ShippingInformation;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ShippingInfoWidget.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001PB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00105\u001a\u0002062\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u00107\u001a\u0002062\u0006\u00108\u001a\u000209H\u0002J\u0014\u0010:\u001a\u0002062\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<J\u0006\u0010>\u001a\u00020?J\u0010\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0014H\u0002J\u0010\u0010B\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0014H\u0002J\u0010\u0010C\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0014H\u0002J\b\u0010D\u001a\u000206H\u0002J\b\u0010E\u001a\u000206H\u0002J\b\u0010F\u001a\u000206H\u0002J\b\u0010G\u001a\u000206H\u0002J\u0010\u0010H\u001a\u0002062\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010K\u001a\u0002062\u0006\u0010I\u001a\u00020JH\u0002J\b\u0010L\u001a\u000206H\u0002J\b\u0010M\u001a\u000206H\u0002J\b\u0010N\u001a\u000206H\u0002J\b\u0010O\u001a\u000206H\u0002R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010/\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u0006Q"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "viewBinding", "Lcom/stripe/android/databinding/StripeAddressWidgetBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeAddressWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "value", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "optionalFields", "getOptionalFields", "()Ljava/util/List;", "setOptionalFields", "(Ljava/util/List;)V", "hiddenFields", "getHiddenFields", "setHiddenFields", "countryAutoCompleteTextView", "Lcom/stripe/android/view/CountryTextInputLayout;", "addressLine1TextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "addressLine2TextInputLayout", "cityTextInputLayout", "nameTextInputLayout", "postalCodeTextInputLayout", "stateTextInputLayout", "phoneNumberTextInputLayout", "addressEditText", "Lcom/stripe/android/view/StripeEditText;", "addressEditText2", "cityEditText", "nameEditText", "postalCodeEditText", "stateEditText", "phoneNumberEditText", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "rawShippingInformation", "getRawShippingInformation", "populateShippingInfo", "", "populateAddressFields", "address", "Lcom/stripe/android/model/Address;", "setAllowedCountryCodes", "allowedCountryCodes", "", "", "validateAllFields", "", "isFieldRequired", "field", "isFieldOptional", "isFieldHidden", "initView", "setupErrorHandling", "renderLabels", "hideHiddenFields", "updateConfigForCountry", "country", "Lcom/stripe/android/core/model/Country;", "updatePostalCodeInputFilter", "renderUSForm", "renderGreatBritainForm", "renderCanadianForm", "renderInternationalForm", "CustomizableShippingField", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShippingInfoWidget extends LinearLayout {
    public static final int $stable = 8;
    private final StripeEditText addressEditText;
    private final StripeEditText addressEditText2;
    private final TextInputLayout addressLine1TextInputLayout;
    private final TextInputLayout addressLine2TextInputLayout;
    private final StripeEditText cityEditText;
    private final TextInputLayout cityTextInputLayout;
    private final CountryTextInputLayout countryAutoCompleteTextView;
    private List<? extends CustomizableShippingField> hiddenFields;
    private final StripeEditText nameEditText;
    private final TextInputLayout nameTextInputLayout;
    private List<? extends CustomizableShippingField> optionalFields;
    private final StripeEditText phoneNumberEditText;
    private final TextInputLayout phoneNumberTextInputLayout;
    private final StripeEditText postalCodeEditText;
    private final TextInputLayout postalCodeTextInputLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText stateEditText;
    private final TextInputLayout stateTextInputLayout;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(final Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.ShippingInfoWidget$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShippingInfoWidget.viewBinding_delegate$lambda$0(context, this);
            }
        });
        this.postalCodeValidator = new PostalCodeValidator();
        this.optionalFields = CollectionsKt.emptyList();
        this.hiddenFields = CollectionsKt.emptyList();
        CountryTextInputLayout countryAutocompleteAaw = getViewBinding().countryAutocompleteAaw;
        Intrinsics.checkNotNullExpressionValue(countryAutocompleteAaw, "countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryAutocompleteAaw;
        TextInputLayout tlAddressLine1Aaw = getViewBinding().tlAddressLine1Aaw;
        Intrinsics.checkNotNullExpressionValue(tlAddressLine1Aaw, "tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = tlAddressLine1Aaw;
        TextInputLayout tlAddressLine2Aaw = getViewBinding().tlAddressLine2Aaw;
        Intrinsics.checkNotNullExpressionValue(tlAddressLine2Aaw, "tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = tlAddressLine2Aaw;
        TextInputLayout tlCityAaw = getViewBinding().tlCityAaw;
        Intrinsics.checkNotNullExpressionValue(tlCityAaw, "tlCityAaw");
        this.cityTextInputLayout = tlCityAaw;
        TextInputLayout tlNameAaw = getViewBinding().tlNameAaw;
        Intrinsics.checkNotNullExpressionValue(tlNameAaw, "tlNameAaw");
        this.nameTextInputLayout = tlNameAaw;
        TextInputLayout tlPostalCodeAaw = getViewBinding().tlPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(tlPostalCodeAaw, "tlPostalCodeAaw");
        this.postalCodeTextInputLayout = tlPostalCodeAaw;
        TextInputLayout tlStateAaw = getViewBinding().tlStateAaw;
        Intrinsics.checkNotNullExpressionValue(tlStateAaw, "tlStateAaw");
        this.stateTextInputLayout = tlStateAaw;
        TextInputLayout tlPhoneNumberAaw = getViewBinding().tlPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(tlPhoneNumberAaw, "tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = tlPhoneNumberAaw;
        StripeEditText etAddressLineOneAaw = getViewBinding().etAddressLineOneAaw;
        Intrinsics.checkNotNullExpressionValue(etAddressLineOneAaw, "etAddressLineOneAaw");
        this.addressEditText = etAddressLineOneAaw;
        StripeEditText etAddressLineTwoAaw = getViewBinding().etAddressLineTwoAaw;
        Intrinsics.checkNotNullExpressionValue(etAddressLineTwoAaw, "etAddressLineTwoAaw");
        this.addressEditText2 = etAddressLineTwoAaw;
        StripeEditText etCityAaw = getViewBinding().etCityAaw;
        Intrinsics.checkNotNullExpressionValue(etCityAaw, "etCityAaw");
        this.cityEditText = etCityAaw;
        StripeEditText etNameAaw = getViewBinding().etNameAaw;
        Intrinsics.checkNotNullExpressionValue(etNameAaw, "etNameAaw");
        this.nameEditText = etNameAaw;
        StripeEditText etPostalCodeAaw = getViewBinding().etPostalCodeAaw;
        Intrinsics.checkNotNullExpressionValue(etPostalCodeAaw, "etPostalCodeAaw");
        this.postalCodeEditText = etPostalCodeAaw;
        StripeEditText etStateAaw = getViewBinding().etStateAaw;
        Intrinsics.checkNotNullExpressionValue(etStateAaw, "etStateAaw");
        this.stateEditText = etStateAaw;
        StripeEditText etPhoneNumberAaw = getViewBinding().etPhoneNumberAaw;
        Intrinsics.checkNotNullExpressionValue(etPhoneNumberAaw, "etPhoneNumberAaw");
        this.phoneNumberEditText = etPhoneNumberAaw;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            etNameAaw.setAutofillHints(new String[]{"name"});
            tlAddressLine1Aaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_ADDRESS});
            etPostalCodeAaw.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
            etPhoneNumberAaw.setAutofillHints(new String[]{"phone"});
        }
        initView();
    }

    private final StripeAddressWidgetBinding getViewBinding() {
        return (StripeAddressWidgetBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeAddressWidgetBinding viewBinding_delegate$lambda$0(Context context, ShippingInfoWidget shippingInfoWidget) {
        StripeAddressWidgetBinding stripeAddressWidgetBindingInflate = StripeAddressWidgetBinding.inflate(LayoutInflater.from(context), shippingInfoWidget);
        Intrinsics.checkNotNullExpressionValue(stripeAddressWidgetBindingInflate, "inflate(...)");
        return stripeAddressWidgetBindingInflate;
    }

    public final List<CustomizableShippingField> getOptionalFields() {
        return this.optionalFields;
    }

    public final void setOptionalFields(List<? extends CustomizableShippingField> value) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.optionalFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final List<CustomizableShippingField> getHiddenFields() {
        return this.hiddenFields;
    }

    public final void setHiddenFields(List<? extends CustomizableShippingField> value) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.hiddenFields = value;
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    public final ShippingInformation getShippingInformation() {
        if (validateAllFields()) {
            return getRawShippingInformation();
        }
        return null;
    }

    private final ShippingInformation getRawShippingInformation() {
        Address.Builder city = new Address.Builder().setCity(this.cityEditText.getFieldText$payments_core_release());
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        return new ShippingInformation(city.setCountryCode(selectedCountry$payments_core_release != null ? selectedCountry$payments_core_release.getCode() : null).setLine1(this.addressEditText.getFieldText$payments_core_release()).setLine2(this.addressEditText2.getFieldText$payments_core_release()).setPostalCode(this.postalCodeEditText.getFieldText$payments_core_release()).setState(this.stateEditText.getFieldText$payments_core_release()).build(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShippingInfoWidget.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "", "<init>", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomizableShippingField {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CustomizableShippingField[] $VALUES;
        public static final CustomizableShippingField Line1 = new CustomizableShippingField("Line1", 0);
        public static final CustomizableShippingField Line2 = new CustomizableShippingField("Line2", 1);
        public static final CustomizableShippingField City = new CustomizableShippingField("City", 2);
        public static final CustomizableShippingField PostalCode = new CustomizableShippingField("PostalCode", 3);
        public static final CustomizableShippingField State = new CustomizableShippingField("State", 4);
        public static final CustomizableShippingField Phone = new CustomizableShippingField("Phone", 5);

        private static final /* synthetic */ CustomizableShippingField[] $values() {
            return new CustomizableShippingField[]{Line1, Line2, City, PostalCode, State, Phone};
        }

        public static EnumEntries<CustomizableShippingField> getEntries() {
            return $ENTRIES;
        }

        private CustomizableShippingField(String str, int i) {
        }

        static {
            CustomizableShippingField[] customizableShippingFieldArr$values = $values();
            $VALUES = customizableShippingFieldArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(customizableShippingFieldArr$values);
        }

        public static CustomizableShippingField valueOf(String str) {
            return (CustomizableShippingField) Enum.valueOf(CustomizableShippingField.class, str);
        }

        public static CustomizableShippingField[] values() {
            return (CustomizableShippingField[]) $VALUES.clone();
        }
    }

    public final void populateShippingInfo(ShippingInformation shippingInformation) {
        if (shippingInformation == null) {
            return;
        }
        Address address = shippingInformation.getAddress();
        if (address != null) {
            populateAddressFields(address);
        }
        this.nameEditText.setText(shippingInformation.getName());
        this.phoneNumberEditText.setText(shippingInformation.getPhone());
    }

    private final void populateAddressFields(Address address) {
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null && country.length() > 0) {
            this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    public final void setAllowedCountryCodes(Set<String> allowedCountryCodes) {
        Intrinsics.checkNotNullParameter(allowedCountryCodes, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(allowedCountryCodes);
    }

    public final boolean validateAllFields() {
        String string;
        Editable text;
        String string2;
        Editable text2;
        String string3;
        Editable text3;
        String string4;
        Editable text4;
        String string5;
        Editable text5;
        String string6;
        CountryCode code;
        Editable text6 = this.addressEditText.getText();
        if (text6 != null && (string = text6.toString()) != null && (text = this.nameEditText.getText()) != null && (string2 = text.toString()) != null && (text2 = this.cityEditText.getText()) != null && (string3 = text2.toString()) != null && (text3 = this.stateEditText.getText()) != null && (string4 = text3.toString()) != null && (text4 = this.postalCodeEditText.getText()) != null && (string5 = text4.toString()) != null && (text5 = this.phoneNumberEditText.getText()) != null && (string6 = text5.toString()) != null) {
            this.countryAutoCompleteTextView.validateCountry$payments_core_release();
            Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
            boolean zIsValid$payments_core_release = this.postalCodeValidator.isValid$payments_core_release(string5, (selectedCountry$payments_core_release == null || (code = selectedCountry$payments_core_release.getCode()) == null) ? null : code.getValue(), this.optionalFields, this.hiddenFields);
            this.postalCodeEditText.setShouldShowError(!zIsValid$payments_core_release);
            boolean z = StringsKt.isBlank(string) && isFieldRequired(CustomizableShippingField.Line1);
            this.addressEditText.setShouldShowError(z);
            boolean z2 = StringsKt.isBlank(string3) && isFieldRequired(CustomizableShippingField.City);
            this.cityEditText.setShouldShowError(z2);
            boolean zIsBlank = StringsKt.isBlank(string2);
            this.nameEditText.setShouldShowError(zIsBlank);
            boolean z3 = StringsKt.isBlank(string4) && isFieldRequired(CustomizableShippingField.State);
            this.stateEditText.setShouldShowError(z3);
            boolean z4 = StringsKt.isBlank(string6) && isFieldRequired(CustomizableShippingField.Phone);
            this.phoneNumberEditText.setShouldShowError(z4);
            if (zIsValid$payments_core_release && !z && !z2 && !z3 && !zIsBlank && !z4 && selectedCountry$payments_core_release != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean isFieldRequired(CustomizableShippingField field) {
        return (isFieldOptional(field) || isFieldHidden(field)) ? false : true;
    }

    private final boolean isFieldOptional(CustomizableShippingField field) {
        return this.optionalFields.contains(field);
    }

    private final boolean isFieldHidden(CustomizableShippingField field) {
        return this.hiddenFields.contains(field);
    }

    /* compiled from: ShippingInfoWidget.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.stripe.android.view.ShippingInfoWidget$initView$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Country, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Country country) throws Resources.NotFoundException {
            invoke2(country);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Country p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((ShippingInfoWidget) this.receiver).updateConfigForCountry(p0);
        }
    }

    private final void initView() throws Resources.NotFoundException {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new AnonymousClass1(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        setupErrorHandling();
        renderLabels();
        Country selectedCountry$payments_core_release = this.countryAutoCompleteTextView.getSelectedCountry$payments_core_release();
        if (selectedCountry$payments_core_release != null) {
            updateConfigForCountry(selectedCountry$payments_core_release);
        }
    }

    private final void setupErrorHandling() {
        this.addressEditText.setErrorMessageListener(new ErrorListener(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new ErrorListener(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new ErrorListener(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new ErrorListener(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new ErrorListener(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new ErrorListener(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(R.string.stripe_address_required));
        this.cityEditText.setErrorMessage(getResources().getString(R.string.stripe_address_city_required));
        this.nameEditText.setErrorMessage(getResources().getString(R.string.stripe_address_name_required));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(R.string.stripe_address_phone_number_required));
    }

    private final void renderLabels() throws Resources.NotFoundException {
        String string;
        String string2;
        this.nameTextInputLayout.setHint(getResources().getString(com.stripe.android.core.R.string.stripe_address_label_full_name));
        TextInputLayout textInputLayout = this.cityTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.City)) {
            string = getResources().getString(R.string.stripe_address_label_city_optional);
        } else {
            string = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_city);
        }
        textInputLayout.setHint(string);
        TextInputLayout textInputLayout2 = this.phoneNumberTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Phone)) {
            string2 = getResources().getString(R.string.stripe_address_label_phone_number_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_phone_number);
        }
        textInputLayout2.setHint(string2);
        hideHiddenFields();
    }

    private final void hideHiddenFields() {
        if (isFieldHidden(CustomizableShippingField.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConfigForCountry(Country country) throws Resources.NotFoundException {
        String value = country.getCode().getValue();
        if (Intrinsics.areEqual(value, Locale.US.getCountry())) {
            renderUSForm();
        } else if (Intrinsics.areEqual(value, Locale.UK.getCountry())) {
            renderGreatBritainForm();
        } else if (Intrinsics.areEqual(value, Locale.CANADA.getCountry())) {
            renderCanadianForm();
        } else {
            renderInternationalForm();
        }
        updatePostalCodeInputFilter(country);
        this.postalCodeTextInputLayout.setVisibility((!CountryUtils.INSTANCE.doesCountryUsePostalCode(country.getCode()) || isFieldHidden(CustomizableShippingField.PostalCode)) ? 8 : 0);
    }

    private final void updatePostalCodeInputFilter(Country country) {
        this.postalCodeEditText.setFilters(Intrinsics.areEqual(country.getCode().getValue(), Locale.CANADA.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    private final void renderUSForm() throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.stripe_address_label_address_optional);
        } else {
            string = getResources().getString(com.stripe.android.uicore.R.string.stripe_address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.stripe_address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.stripe_address_label_zip_code_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_zip_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.stripe_address_label_state_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_state);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(com.stripe.android.uicore.R.string.stripe_address_zip_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.stripe_address_state_required));
    }

    private final void renderGreatBritainForm() throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.stripe_address_label_address_line1_optional);
        } else {
            string = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.stripe_address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.stripe_address_label_postcode_optional);
        } else {
            string2 = getResources().getString(R.string.stripe_address_label_postcode);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.stripe_address_label_county_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_county);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.stripe_address_postcode_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.stripe_address_county_required));
    }

    private final void renderCanadianForm() throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.stripe_address_label_address_optional);
        } else {
            string = getResources().getString(com.stripe.android.uicore.R.string.stripe_address_label_address);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.stripe_address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.stripe_address_label_postal_code_optional);
        } else {
            string2 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.stripe_address_label_province_optional);
        } else {
            string3 = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_province);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(com.stripe.android.uicore.R.string.stripe_address_postal_code_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.stripe_address_province_required));
    }

    private final void renderInternationalForm() throws Resources.NotFoundException {
        String string;
        String string2;
        String string3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            string = getResources().getString(R.string.stripe_address_label_address_line1_optional);
        } else {
            string = getResources().getString(com.stripe.android.core.R.string.stripe_address_label_address_line1);
        }
        textInputLayout.setHint(string);
        this.addressLine2TextInputLayout.setHint(getResources().getString(R.string.stripe_address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            string2 = getResources().getString(R.string.stripe_address_label_zip_postal_code_optional);
        } else {
            string2 = getResources().getString(R.string.stripe_address_label_zip_postal_code);
        }
        textInputLayout2.setHint(string2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            string3 = getResources().getString(R.string.stripe_address_label_region_generic_optional);
        } else {
            string3 = getResources().getString(R.string.stripe_address_label_region_generic);
        }
        textInputLayout3.setHint(string3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(com.stripe.android.uicore.R.string.stripe_address_zip_or_postal_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.stripe_address_region_generic_required));
    }
}
