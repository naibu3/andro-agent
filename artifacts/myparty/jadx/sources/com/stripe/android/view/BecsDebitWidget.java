package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.autofill.HintConstants;
import com.facebook.internal.NativeProtocol;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeBecsDebitWidgetBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitBanks;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: BecsDebitWidget.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002R\u001b\u0010\f\u001a\u00020\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001aR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "companyName", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "viewBinding", "Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/StripeBecsDebitWidgetBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "validParamsCallback", "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "getValidParamsCallback", "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "setValidParamsCallback", "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V", "isInputValid", "", "()Z", "verifyCompanyName", "", "applyAttributes", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "ValidParamsCallback", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BecsDebitWidget extends FrameLayout {
    public static final int $stable = 8;
    private ValidParamsCallback validParamsCallback;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding;

    /* compiled from: BecsDebitWidget.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "", "onInputChanged", "", "isValid", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ValidParamsCallback {
        void onInputChanged(boolean isValid);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context) {
        this(context, null, 0, null, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BecsDebitWidget(Context context, AttributeSet attributeSet, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(final Context context, AttributeSet attributeSet, int i, String companyName) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.BecsDebitWidget$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BecsDebitWidget.viewBinding_delegate$lambda$0(context, this);
            }
        });
        this.validParamsCallback = new ValidParamsCallback() { // from class: com.stripe.android.view.BecsDebitWidget$validParamsCallback$1
            @Override // com.stripe.android.view.BecsDebitWidget.ValidParamsCallback
            public void onInputChanged(boolean isValid) {
            }
        };
        if (Build.VERSION.SDK_INT >= 26) {
            getViewBinding$payments_core_release().nameEditText.setAutofillHints(new String[]{"name"});
            getViewBinding$payments_core_release().emailEditText.setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS});
        }
        for (StripeEditText stripeEditText : SetsKt.setOf((Object[]) new StripeEditText[]{getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText, getViewBinding$payments_core_release().bsbEditText, getViewBinding$payments_core_release().accountNumberEditText})) {
            Intrinsics.checkNotNull(stripeEditText);
            stripeEditText.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda$2$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    this.this$0.getValidParamsCallback().onInputChanged(this.this$0.isInputValid());
                }
            });
        }
        getViewBinding$payments_core_release().bsbEditText.setOnBankChangedCallback(new Function1() { // from class: com.stripe.android.view.BecsDebitWidget$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BecsDebitWidget._init_$lambda$3(this.f$0, (BecsDebitBanks.Bank) obj);
            }
        });
        getViewBinding$payments_core_release().bsbEditText.setOnCompletedCallback(new Function0() { // from class: com.stripe.android.view.BecsDebitWidget$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BecsDebitWidget._init_$lambda$4(this.f$0);
            }
        });
        EmailEditText emailEditText = getViewBinding$payments_core_release().emailEditText;
        StripeEditText nameEditText = getViewBinding$payments_core_release().nameEditText;
        Intrinsics.checkNotNullExpressionValue(nameEditText, "nameEditText");
        emailEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(nameEditText));
        BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().bsbEditText;
        EmailEditText emailEditText2 = getViewBinding$payments_core_release().emailEditText;
        Intrinsics.checkNotNullExpressionValue(emailEditText2, "emailEditText");
        becsDebitBsbEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(emailEditText2));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().accountNumberEditText;
        BecsDebitBsbEditText bsbEditText = getViewBinding$payments_core_release().bsbEditText;
        Intrinsics.checkNotNullExpressionValue(bsbEditText, "bsbEditText");
        becsDebitAccountNumberEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(bsbEditText));
        getViewBinding$payments_core_release().nameEditText.setErrorMessage$payments_core_release(getResources().getString(R.string.stripe_becs_widget_name_required));
        StripeEditText stripeEditText2 = getViewBinding$payments_core_release().nameEditText;
        TextInputLayout nameTextInputLayout = getViewBinding$payments_core_release().nameTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(nameTextInputLayout, "nameTextInputLayout");
        stripeEditText2.setErrorMessageListener(new ErrorListener(nameTextInputLayout));
        EmailEditText emailEditText3 = getViewBinding$payments_core_release().emailEditText;
        TextInputLayout emailTextInputLayout = getViewBinding$payments_core_release().emailTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(emailTextInputLayout, "emailTextInputLayout");
        emailEditText3.setErrorMessageListener(new ErrorListener(emailTextInputLayout));
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().bsbEditText;
        TextInputLayout bsbTextInputLayout = getViewBinding$payments_core_release().bsbTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(bsbTextInputLayout, "bsbTextInputLayout");
        becsDebitBsbEditText2.setErrorMessageListener(new ErrorListener(bsbTextInputLayout));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().accountNumberEditText;
        TextInputLayout accountNumberTextInputLayout = getViewBinding$payments_core_release().accountNumberTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(accountNumberTextInputLayout, "accountNumberTextInputLayout");
        becsDebitAccountNumberEditText2.setErrorMessageListener(new ErrorListener(accountNumberTextInputLayout));
        for (final StripeEditText stripeEditText3 : SetsKt.setOf((Object[]) new StripeEditText[]{getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText})) {
            Intrinsics.checkNotNull(stripeEditText3);
            stripeEditText3.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.BecsDebitWidget$_init_$lambda$6$$inlined$doAfterTextChanged$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    stripeEditText3.setShouldShowError(false);
                }
            });
        }
        companyName = StringsKt.isBlank(companyName) ? null : companyName;
        if (companyName != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(companyName);
        }
        applyAttributes(attributeSet);
        verifyCompanyName();
    }

    public final StripeBecsDebitWidgetBinding getViewBinding$payments_core_release() {
        return (StripeBecsDebitWidgetBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeBecsDebitWidgetBinding viewBinding_delegate$lambda$0(Context context, BecsDebitWidget becsDebitWidget) {
        StripeBecsDebitWidgetBinding stripeBecsDebitWidgetBindingInflate = StripeBecsDebitWidgetBinding.inflate(LayoutInflater.from(context), becsDebitWidget);
        Intrinsics.checkNotNullExpressionValue(stripeBecsDebitWidgetBindingInflate, "inflate(...)");
        return stripeBecsDebitWidgetBindingInflate;
    }

    public final ValidParamsCallback getValidParamsCallback() {
        return this.validParamsCallback;
    }

    public final void setValidParamsCallback(ValidParamsCallback validParamsCallback) {
        Intrinsics.checkNotNullParameter(validParamsCallback, "<set-?>");
        this.validParamsCallback = validParamsCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isInputValid() {
        String str;
        String str2;
        String str3;
        return (StringsKt.isBlank(getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release()) || (str = getViewBinding$payments_core_release().emailEditText.getEmail()) == null || StringsKt.isBlank(str) || (str2 = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release()) == null || StringsKt.isBlank(str2) || (str3 = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber()) == null || StringsKt.isBlank(str3)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit _init_$lambda$3(BecsDebitWidget becsDebitWidget, BecsDebitBanks.Bank bank) {
        int i;
        String prefix;
        String strTake = null;
        if (bank != null) {
            becsDebitWidget.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperText(bank.getName());
            becsDebitWidget.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperTextEnabled(true);
        } else {
            becsDebitWidget.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperText(null);
            becsDebitWidget.getViewBinding$payments_core_release().bsbTextInputLayout.setHelperTextEnabled(false);
        }
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = becsDebitWidget.getViewBinding$payments_core_release().accountNumberEditText;
        if (bank != null && (prefix = bank.getPrefix()) != null) {
            strTake = StringsKt.take(prefix, 2);
        }
        if (strTake != null) {
            int iHashCode = strTake.hashCode();
            i = 9;
            if (iHashCode != 1536) {
                if (iHashCode != 1537) {
                    if (iHashCode != 1539) {
                        if (iHashCode != 1542) {
                            if (iHashCode != 1544) {
                                if (iHashCode != 1756) {
                                    if (iHashCode == 1784 && strTake.equals("80")) {
                                        i = 4;
                                    }
                                } else if (strTake.equals("73")) {
                                    i = 6;
                                }
                                i = 5;
                            } else if (!strTake.equals("08")) {
                                i = 5;
                            }
                        } else if (strTake.equals("06")) {
                            i = 8;
                        }
                    } else if (!strTake.equals("03")) {
                    }
                } else if (!strTake.equals("01")) {
                }
            } else if (!strTake.equals("00")) {
            }
        }
        becsDebitAccountNumberEditText.setMinLength(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$4(BecsDebitWidget becsDebitWidget) {
        becsDebitWidget.getViewBinding$payments_core_release().accountNumberTextInputLayout.requestFocus();
        return Unit.INSTANCE;
    }

    private final void verifyCompanyName() {
        if (!getViewBinding$payments_core_release().mandateAcceptanceTextView.isValid$payments_core_release()) {
            throw new IllegalArgumentException("A company name is required to render a BecsDebitWidget.".toString());
        }
    }

    private final void applyAttributes(AttributeSet attrs) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] BecsDebitWidget = R.styleable.BecsDebitWidget;
        Intrinsics.checkNotNullExpressionValue(BecsDebitWidget, "BecsDebitWidget");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, BecsDebitWidget, 0, 0);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.BecsDebitWidget_companyName);
        if (string != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(string);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final PaymentMethodCreateParams getParams() throws Resources.NotFoundException, IOException {
        String fieldText$payments_core_release = getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().emailEditText.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber();
        String str = fieldText$payments_core_release;
        getViewBinding$payments_core_release().nameEditText.setShouldShowError(StringsKt.isBlank(str));
        String str2 = email;
        getViewBinding$payments_core_release().emailEditText.setShouldShowError(str2 == null || StringsKt.isBlank(str2));
        String str3 = bsb$payments_core_release;
        getViewBinding$payments_core_release().bsbEditText.setShouldShowError(str3 == null || StringsKt.isBlank(str3));
        String str4 = accountNumber;
        getViewBinding$payments_core_release().accountNumberEditText.setShouldShowError(str4 == null || StringsKt.isBlank(str4));
        if (StringsKt.isBlank(str) || str2 == null || StringsKt.isBlank(str2) || str3 == null || StringsKt.isBlank(str3) || str4 == null || StringsKt.isBlank(str4)) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.AuBecsDebit(bsb$payments_core_release, accountNumber), new PaymentMethod.BillingDetails(null, email, fieldText$payments_core_release, null, 9, null), (Map) null, (PaymentMethod.AllowRedisplay) null, 12, (Object) null);
    }
}
