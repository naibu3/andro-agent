package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.cards.Cvc;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CvcEditText.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0002\b$J\u001b\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¢\u0006\u0002\u0010(R\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "unvalidatedCvc", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "getUnvalidatedCvc", "()Lcom/stripe/android/cards/Cvc$Unvalidated;", "cvc", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc$payments_core_release", "()Lcom/stripe/android/cards/Cvc$Validated;", "cardBrand", "Lcom/stripe/android/model/CardBrand;", "completionCallback", "Lkotlin/Function0;", "", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "accessibilityText", "", "getAccessibilityText", "()Ljava/lang/String;", "updateBrand", "customHintText", "customPlaceholderText", "textInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "updateBrand$payments_core_release", "createFilters", "", "Landroid/text/InputFilter;", "(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CvcEditText extends StripeEditText {
    public static final int $stable = 8;
    private CardBrand cardBrand;
    private /* synthetic */ Function0<Unit> completionCallback;

    /* compiled from: CvcEditText.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            try {
                iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cardBrand = CardBrand.Unknown;
        this.completionCallback = new Function0() { // from class: com.stripe.android.view.CvcEditText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        setErrorMessage(getResources().getString(com.stripe.android.R.string.stripe_invalid_cvc));
        setHint(com.stripe.android.R.string.stripe_cvc_number_hint);
        setMaxLines(1);
        setFilters(createFilters(CardBrand.Unknown));
        setNumberOnlyInputType();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_SECURITY_CODE});
        }
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CvcEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.this$0.setShouldShowError(false);
                if (this.this$0.cardBrand.isMaxCvc(this.this$0.getUnvalidatedCvc().getNormalized())) {
                    this.this$0.getCompletionCallback$payments_core_release().invoke();
                }
            }
        });
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CvcEditText$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CvcEditText._init_$lambda$2(this.f$0, view, z);
            }
        });
        setLayoutDirection(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Cvc.Unvalidated getUnvalidatedCvc() {
        return new Cvc.Unvalidated(getFieldText$payments_core_release());
    }

    public final Cvc.Validated getCvc$payments_core_release() {
        return getUnvalidatedCvc().validate(this.cardBrand.getMaxCvcLength());
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(CvcEditText cvcEditText, View view, boolean z) {
        if (z || !cvcEditText.getUnvalidatedCvc().isPartialEntry(cvcEditText.cardBrand.getMaxCvcLength())) {
            return;
        }
        cvcEditText.setShouldShowError(true);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() throws Resources.NotFoundException {
        String string = getResources().getString(com.stripe.android.R.string.stripe_acc_label_cvc_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public static /* synthetic */ void updateBrand$payments_core_release$default(CvcEditText cvcEditText, CardBrand cardBrand, String str, String str2, TextInputLayout textInputLayout, int i, Object obj) throws Resources.NotFoundException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            textInputLayout = null;
        }
        cvcEditText.updateBrand$payments_core_release(cardBrand, str, str2, textInputLayout);
    }

    public final /* synthetic */ void updateBrand$payments_core_release(CardBrand cardBrand, String customHintText, String customPlaceholderText, TextInputLayout textInputLayout) throws Resources.NotFoundException {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(cardBrand, "cardBrand");
        this.cardBrand = cardBrand;
        setFilters(createFilters(cardBrand));
        if (customHintText == null) {
            if (cardBrand == CardBrand.AmericanExpress) {
                customHintText = getResources().getString(com.stripe.android.R.string.stripe_cvc_amex_hint);
            } else {
                customHintText = getResources().getString(com.stripe.android.R.string.stripe_cvc_number_hint);
            }
            Intrinsics.checkNotNull(customHintText);
        }
        if (getUnvalidatedCvc().getNormalized().length() > 0) {
            setShouldShowError(getUnvalidatedCvc().validate(cardBrand.getMaxCvcLength()) == null);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint(customHintText);
            if (customPlaceholderText != null) {
                str = customPlaceholderText;
            } else {
                Resources resources = getResources();
                if (WhenMappings.$EnumSwitchMapping$0[cardBrand.ordinal()] == 1) {
                    i = com.stripe.android.R.string.stripe_cvc_multiline_helper_amex;
                } else {
                    i = com.stripe.android.R.string.stripe_cvc_multiline_helper;
                }
                String string = resources.getString(i);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                str = string;
            }
            textInputLayout.setPlaceholderText(str);
            return;
        }
        setHint(customHintText);
    }

    private final InputFilter[] createFilters(CardBrand cardBrand) {
        return new InputFilter[]{new InputFilter.LengthFilter(cardBrand.getMaxCvcLength())};
    }
}
