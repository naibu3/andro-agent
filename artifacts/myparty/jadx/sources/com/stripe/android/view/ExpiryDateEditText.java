package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import com.facebook.appevents.AppEventsConstants;
import com.stripe.android.core.utils.DateUtils;
import com.stripe.android.model.ExpirationDate;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: ExpiryDateEditText.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0012H\u0007J#\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u00020\fH\u0002J-\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u0007H\u0001¢\u0006\u0002\b4J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u001a2\u0006\u00106\u001a\u00020\u001aH\u0002R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0012@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u001a8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010!R\u000e\u0010&\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "value", "", "isDateValid", "()Z", "validatedDate", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getValidatedDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "<set-?>", "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release", "setIncludeSeparatorGaps$payments_core_release", "(Z)V", "includeSeparatorGaps$delegate", "Lkotlin/properties/ReadWriteProperty;", "setIncludeSeparatorGaps", "include", "dateDigitsLength", "separator", "setText", "expiryMonth", "expiryYear", "setText$payments_core_release", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "updateSeparatorUi", "listenForTextChanges", "updateSelectionIndex", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "updateSelectionIndex$payments_core_release", "month", "year", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExpiryDateEditText extends StripeEditText {
    private static final boolean INCLUDE_SEPARATOR_GAPS_DEFAULT = false;
    private static final int INVALID_INPUT = -1;
    private static final String SEPARATOR_WITHOUT_GAPS = "/";
    private static final String SEPARATOR_WITH_GAPS = " / ";
    private /* synthetic */ Function0<Unit> completionCallback;
    private final int dateDigitsLength;

    /* renamed from: includeSeparatorGaps$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty includeSeparatorGaps;
    private boolean isDateValid;
    private String separator;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.completionCallback = new Function0() { // from class: com.stripe.android.view.ExpiryDateEditText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        Delegates delegates = Delegates.INSTANCE;
        final boolean z = false;
        this.includeSeparatorGaps = new ObservableProperty<Boolean>(z) { // from class: com.stripe.android.view.ExpiryDateEditText$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.updateSeparatorUi(zBooleanValue);
            }
        };
        this.dateDigitsLength = context.getResources().getInteger(com.stripe.android.R.integer.stripe_date_digits_length);
        this.separator = SEPARATOR_WITHOUT_GAPS;
        setNumberOnlyInputType();
        updateSeparatorUi$default(this, false, 1, null);
        listenForTextChanges();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.ExpiryDateEditText$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                ExpiryDateEditText._init_$lambda$2(this.f$0, view, z2);
            }
        });
        setLayoutDirection(0);
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    /* renamed from: isDateValid, reason: from getter */
    public final boolean getIsDateValid() {
        return this.isDateValid;
    }

    public final ExpirationDate.Validated getValidatedDate() {
        boolean z = this.isDateValid;
        if (z) {
            return ExpirationDate.Unvalidated.INSTANCE.create(getFieldText$payments_core_release()).validate();
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() throws Resources.NotFoundException {
        String string = getResources().getString(com.stripe.android.R.string.stripe_acc_label_expiry_date_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z) {
        this.includeSeparatorGaps.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setIncludeSeparatorGaps(boolean include) {
        setIncludeSeparatorGaps$payments_core_release(include);
    }

    public final void setText$payments_core_release(Integer expiryMonth, Integer expiryYear) {
        if (expiryMonth == null || expiryYear == null) {
            return;
        }
        setText(CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new String[]{StringsKt.padStart(expiryMonth.toString(), 2, '0'), StringsKt.padStart(StringsKt.takeLast(expiryYear.toString(), 2), 2, '0')}), this.separator, null, null, 0, null, null, 62, null));
    }

    static /* synthetic */ void updateSeparatorUi$default(ExpiryDateEditText expiryDateEditText, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        expiryDateEditText.updateSeparatorUi(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSeparatorUi(boolean includeSeparatorGaps) {
        String str;
        if (includeSeparatorGaps) {
            str = SEPARATOR_WITH_GAPS;
        } else {
            str = SEPARATOR_WITHOUT_GAPS;
        }
        this.separator = str;
        setFilters((InputFilter[]) CollectionsKt.listOf(new InputFilter.LengthFilter(this.dateDigitsLength + this.separator.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new StripeTextWatcher() { // from class: com.stripe.android.view.ExpiryDateEditText.listenForTextChanges.1
            private ExpirationDate.Unvalidated expirationDate = ExpirationDate.Unvalidated.INSTANCE.getEMPTY();
            private String formattedDate;
            private int latestChangeStart;
            private int latestInsertionSize;
            private Integer newCursorPosition;

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                this.latestChangeStart = start;
                this.latestInsertionSize = after;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) throws IOException {
                String string = s != null ? s.toString() : null;
                if (string == null) {
                    string = "";
                }
                String str = string;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string2 = sb.toString();
                if (string2.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
                    char cCharAt2 = string2.charAt(0);
                    if (cCharAt2 != '0' && cCharAt2 != '1') {
                        string2 = AppEventsConstants.EVENT_PARAM_VALUE_NO + string2;
                        this.latestInsertionSize++;
                    }
                } else if (string2.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
                    string2 = string2.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(string2, "substring(...)");
                }
                ExpirationDate.Unvalidated unvalidatedCreate = ExpirationDate.Unvalidated.INSTANCE.create(string2);
                this.expirationDate = unvalidatedCreate;
                boolean isMonthValid = unvalidatedCreate.getIsMonthValid();
                StringBuilder sbAppend = new StringBuilder().append(unvalidatedCreate.getMonth());
                if ((unvalidatedCreate.getMonth().length() == 2 && this.latestInsertionSize > 0 && isMonthValid) || string2.length() > 2) {
                    sbAppend.append(ExpiryDateEditText.this.separator);
                }
                sbAppend.append(unvalidatedCreate.getYear());
                String string3 = sbAppend.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                this.newCursorPosition = Integer.valueOf(ExpiryDateEditText.this.updateSelectionIndex$payments_core_release(string3.length(), this.latestChangeStart, this.latestInsertionSize, ExpiryDateEditText.this.dateDigitsLength + ExpiryDateEditText.this.separator.length()));
                this.formattedDate = string3;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                int i;
                String str = this.formattedDate;
                boolean z = false;
                if (str != null) {
                    ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                    Integer num = this.newCursorPosition;
                    if (num != null) {
                        ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                        expiryDateEditText.setSelection(RangesKt.coerceIn(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                    }
                }
                String month = this.expirationDate.getMonth();
                String year = this.expirationDate.getYear();
                boolean z2 = month.length() == 2 && !this.expirationDate.getIsMonthValid();
                if (month.length() != 2 || year.length() != 2) {
                    ExpiryDateEditText.this.isDateValid = false;
                } else {
                    boolean isDateValid = ExpiryDateEditText.this.getIsDateValid();
                    ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                    expiryDateEditText2.isDateValid = expiryDateEditText2.isDateValid(month, year);
                    boolean z3 = !ExpiryDateEditText.this.getIsDateValid();
                    if (!isDateValid && ExpiryDateEditText.this.getIsDateValid()) {
                        ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                    }
                    z2 = z3;
                }
                ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
                Resources resources = expiryDateEditText3.getResources();
                if (this.expirationDate.getIsPartialEntry()) {
                    i = com.stripe.android.uicore.R.string.stripe_incomplete_expiry_date;
                } else if (!this.expirationDate.getIsMonthValid()) {
                    i = com.stripe.android.uicore.R.string.stripe_invalid_expiry_month;
                } else {
                    i = com.stripe.android.uicore.R.string.stripe_invalid_expiry_year;
                }
                expiryDateEditText3.setErrorMessage(resources.getString(i));
                ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
                if (z2 && (this.expirationDate.getIsPartialEntry() || this.expirationDate.getIsComplete())) {
                    z = true;
                }
                expiryDateEditText4.setShouldShowError(z);
                this.formattedDate = null;
                this.newCursorPosition = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ExpiryDateEditText expiryDateEditText, View view, boolean z) {
        Editable text;
        if (z || (text = expiryDateEditText.getText()) == null || text.length() == 0 || expiryDateEditText.isDateValid) {
            return;
        }
        expiryDateEditText.setShouldShowError(true);
    }

    public final int updateSelectionIndex$payments_core_release(int newLength, int editActionStart, int editActionAddition, int maxInputLength) {
        int length = 0;
        int length2 = (editActionStart > 2 || editActionStart + editActionAddition < 2) ? 0 : this.separator.length();
        boolean z = editActionAddition == 0 && editActionStart == this.separator.length() + 2;
        int i = editActionStart + editActionAddition + length2;
        if (z && i > 0) {
            length = this.separator.length();
        }
        return Math.min(maxInputLength, Math.min(i - length, newLength));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDateValid(String month, String year) {
        Object objM9118constructorimpl;
        int iIntValue;
        Object objM9118constructorimpl2;
        int iIntValue2 = -1;
        if (month.length() != 2) {
            iIntValue = -1;
        } else {
            try {
                Result.Companion companion = Result.INSTANCE;
                ExpiryDateEditText expiryDateEditText = this;
                objM9118constructorimpl = Result.m9118constructorimpl(Integer.valueOf(Integer.parseInt(month)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = obj;
            }
            iIntValue = ((Number) objM9118constructorimpl).intValue();
        }
        if (year.length() == 2) {
            try {
                Result.Companion companion3 = Result.INSTANCE;
                ExpiryDateEditText expiryDateEditText2 = this;
                objM9118constructorimpl2 = Result.m9118constructorimpl(Integer.valueOf(DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(year))));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                objM9118constructorimpl2 = Result.m9118constructorimpl(ResultKt.createFailure(th2));
            }
            iIntValue2 = ((Number) (Result.m9124isFailureimpl(objM9118constructorimpl2) ? -1 : objM9118constructorimpl2)).intValue();
        }
        return DateUtils.isExpiryDataValid(iIntValue, iIntValue2);
    }

    /* compiled from: ExpiryDateEditText.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$Companion;", "", "<init>", "()V", "INVALID_INPUT", "", "SEPARATOR_WITHOUT_GAPS", "", "SEPARATOR_WITH_GAPS", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
