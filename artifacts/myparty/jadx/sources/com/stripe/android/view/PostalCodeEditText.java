package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import com.google.android.material.textfield.TextInputLayout;
import com.nimbusds.jose.jwk.gen.OctetSequenceKeyGenerator;
import com.stripe.android.view.PostalCodeEditText;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* compiled from: PostalCodeEditText.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\u0012\u0010\u001b\u001a\u00020\u00182\b\b\u0001\u0010\u001c\u001a\u00020\u0007H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\r\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!R+\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/stripe/android/view/PostalCodeEditText$Config;", "config", "getConfig$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText$Config;", "setConfig$payments_core_release", "(Lcom/stripe/android/view/PostalCodeEditText$Config;)V", "config$delegate", "Lkotlin/properties/ReadWriteProperty;", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "", "getPostalCode$payments_core_release", "()Ljava/lang/String;", "onFinishInflate", "", "configureForUs", "configureForGlobal", "updateHint", "hintRes", "getTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "hasValidPostal", "", "hasValidPostal$payments_core_release", "Config", "Companion", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PostalCodeEditText extends StripeEditText {
    private static final int MAX_LENGTH_US = 5;

    /* renamed from: config$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty config;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("^[0-9]{5}$");

    /* compiled from: PostalCodeEditText.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Config.values().length];
            try {
                iArr[Config.Global.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Config.US.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Delegates delegates = Delegates.INSTANCE;
        final Config config = Config.Global;
        this.config = new ObservableProperty<Config>(config) { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, PostalCodeEditText.Config oldValue, PostalCodeEditText.Config newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                int i2 = PostalCodeEditText.WhenMappings.$EnumSwitchMapping$0[newValue.ordinal()];
                if (i2 == 1) {
                    this.configureForGlobal();
                } else {
                    if (i2 == 2) {
                        this.configureForUs();
                        return;
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
        };
        setErrorMessage(getResources().getString(com.stripe.android.R.string.stripe_invalid_zip));
        setMaxLines(1);
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.PostalCodeEditText$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                this.this$0.setShouldShowError(false);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
        }
    }

    public final Config getConfig$payments_core_release() {
        return (Config) this.config.getValue(this, $$delegatedProperties[0]);
    }

    public final void setConfig$payments_core_release(Config config) {
        Intrinsics.checkNotNullParameter(config, "<set-?>");
        this.config.setValue(this, $$delegatedProperties[0], config);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == Config.US) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
                return fieldText$payments_core_release;
            }
            return null;
        }
        return getFieldText$payments_core_release();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        configureForGlobal();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForUs() {
        updateHint(com.stripe.android.core.R.string.stripe_address_label_zip_code);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        setNumberOnlyInputType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureForGlobal() {
        updateHint(com.stripe.android.core.R.string.stripe_address_label_postal_code);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(OctetSequenceKeyGenerator.MIN_KEY_SIZE_BITS);
        setFilters(new InputFilter[0]);
    }

    private final void updateHint(int hintRes) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            if (textInputLayout.isHintEnabled()) {
                textInputLayout.setHint(getResources().getString(hintRes));
            } else {
                setHint(hintRes);
            }
        }
    }

    private final TextInputLayout getTextInputLayout() {
        for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PostalCodeEditText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Config;", "", "<init>", "(Ljava/lang/String;I)V", "Global", "US", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        public static final Config Global = new Config("Global", 0);
        public static final Config US = new Config("US", 1);

        private static final /* synthetic */ Config[] $values() {
            return new Config[]{Global, US};
        }

        public static EnumEntries<Config> getEntries() {
            return $ENTRIES;
        }

        private Config(String str, int i) {
        }

        static {
            Config[] configArr$values = $values();
            $VALUES = configArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(configArr$values);
        }

        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }
    }

    public final boolean hasValidPostal$payments_core_release() {
        if (getConfig$payments_core_release() == Config.US && ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
            return true;
        }
        return getConfig$payments_core_release() == Config.Global && getFieldText$payments_core_release().length() > 0;
    }

    /* compiled from: PostalCodeEditText.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Companion;", "", "<init>", "()V", "MAX_LENGTH_US", "", "ZIP_CODE_PATTERN", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
