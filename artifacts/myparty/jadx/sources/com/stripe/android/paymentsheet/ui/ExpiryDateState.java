package com.stripe.android.paymentsheet.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.ui.core.elements.CardDetailsUtil;
import com.stripe.android.uicore.elements.DateConfig;
import com.stripe.android.uicore.elements.FieldError;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.TextFieldState;
import com.stripe.android.uicore.elements.TextFieldStateConstants;
import com.stripe.android.uicore.elements.TextFieldStateKt;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ExpiryDateState.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0081\b\u0018\u0000 ,2\u00020\u0001:\u0001,B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u001a\u001a\u00020\u0005J\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003J7\u0010\u001f\u001a\u0004\u0018\u00010\u0015*\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0002¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÂ\u0003J'\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010(\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0015HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "", "text", "", ViewProps.ENABLED, "", "dateConfig", "Lcom/stripe/android/uicore/elements/DateConfig;", "<init>", "(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/DateConfig;)V", "getText", "()Ljava/lang/String;", "getEnabled", "()Z", "textFieldState", "Lcom/stripe/android/uicore/elements/TextFieldState;", "formFieldValues", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "expiryMonth", "", "getExpiryMonth", "()Ljava/lang/Integer;", "expiryYear", "getExpiryYear", "shouldShowError", "sectionError", "Lcom/stripe/android/core/strings/ResolvableString;", "onDateChanged", "proposedValue", "toIntOrNull", SDKConstants.PARAM_KEY, "min", "max", "(Ljava/util/Map;Lcom/stripe/android/uicore/elements/IdentifierSpec;II)Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ExpiryDateState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DateConfig dateConfig;
    private final boolean enabled;
    private final Map<IdentifierSpec, FormFieldEntry> formFieldValues;
    private final String text;
    private final TextFieldState textFieldState;

    /* renamed from: component3, reason: from getter */
    private final DateConfig getDateConfig() {
        return this.dateConfig;
    }

    public static /* synthetic */ ExpiryDateState copy$default(ExpiryDateState expiryDateState, String str, boolean z, DateConfig dateConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = expiryDateState.text;
        }
        if ((i & 2) != 0) {
            z = expiryDateState.enabled;
        }
        if ((i & 4) != 0) {
            dateConfig = expiryDateState.dateConfig;
        }
        return expiryDateState.copy(str, z, dateConfig);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final ExpiryDateState copy(String text, boolean enabled, DateConfig dateConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dateConfig, "dateConfig");
        return new ExpiryDateState(text, enabled, dateConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryDateState)) {
            return false;
        }
        ExpiryDateState expiryDateState = (ExpiryDateState) other;
        return Intrinsics.areEqual(this.text, expiryDateState.text) && this.enabled == expiryDateState.enabled && Intrinsics.areEqual(this.dateConfig, expiryDateState.dateConfig);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + Boolean.hashCode(this.enabled)) * 31) + this.dateConfig.hashCode();
    }

    public String toString() {
        return "ExpiryDateState(text=" + this.text + ", enabled=" + this.enabled + ", dateConfig=" + this.dateConfig + ")";
    }

    public ExpiryDateState(String text, boolean z, DateConfig dateConfig) {
        TextFieldStateConstants.Error.Blank blankDetermineState;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(dateConfig, "dateConfig");
        this.text = text;
        this.enabled = z;
        this.dateConfig = dateConfig;
        if (Intrinsics.areEqual(this.text, CardDetailsUIKt.CARD_EDIT_UI_FALLBACK_EXPIRY_DATE)) {
            blankDetermineState = TextFieldStateConstants.Error.Blank.INSTANCE;
        } else {
            blankDetermineState = this.dateConfig.determineState(this.text);
        }
        this.textFieldState = blankDetermineState;
        this.formFieldValues = this.textFieldState.isValid() ? CardDetailsUtil.INSTANCE.createExpiryDateFormFieldValues(new FormFieldEntry(this.text, false, 2, null)) : null;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public /* synthetic */ ExpiryDateState(String str, boolean z, DateConfig dateConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, (i & 4) != 0 ? new DateConfig() : dateConfig);
    }

    public final Integer getExpiryMonth() {
        Map<IdentifierSpec, FormFieldEntry> map = this.formFieldValues;
        if (map != null) {
            return toIntOrNull(map, IdentifierSpec.INSTANCE.getCardExpMonth(), 1, 12);
        }
        return null;
    }

    public final Integer getExpiryYear() {
        Map<IdentifierSpec, FormFieldEntry> map = this.formFieldValues;
        if (map != null) {
            return toIntOrNull(map, IdentifierSpec.INSTANCE.getCardExpYear(), 2000, 2100);
        }
        return null;
    }

    public final boolean shouldShowError() {
        return this.textFieldState.shouldShowError(true);
    }

    public final ResolvableString sectionError() {
        boolean zShouldShowError = this.textFieldState.shouldShowError(true);
        FieldError error = this.textFieldState.getError();
        if (error != null) {
            if (!zShouldShowError || !this.enabled) {
                error = null;
            }
            if (error != null) {
                int errorMessage = error.getErrorMessage();
                Object[] formatArgs = error.getFormatArgs();
                if (formatArgs == null) {
                    formatArgs = new Object[0];
                }
                return ResolvableStringUtilsKt.resolvableString$default(errorMessage, Arrays.copyOf(formatArgs, formatArgs.length), null, 4, null);
            }
        }
        return null;
    }

    public final ExpiryDateState onDateChanged(String proposedValue) {
        Intrinsics.checkNotNullParameter(proposedValue, "proposedValue");
        return !TextFieldStateKt.canAcceptInput(this.textFieldState, this.text, proposedValue) ? this : copy$default(this, proposedValue, false, null, 6, null);
    }

    private final Integer toIntOrNull(Map<IdentifierSpec, FormFieldEntry> map, IdentifierSpec identifierSpec, int i, int i2) {
        String value;
        Integer intOrNull;
        int iIntValue;
        FormFieldEntry formFieldEntry = map.get(identifierSpec);
        if (formFieldEntry == null || (value = formFieldEntry.getValue()) == null || (intOrNull = StringsKt.toIntOrNull(value)) == null || i > (iIntValue = intOrNull.intValue()) || iIntValue > i2) {
            return null;
        }
        return intOrNull;
    }

    /* compiled from: ExpiryDateState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/ExpiryDateState$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/paymentsheet/ui/ExpiryDateState;", "editPayload", "Lcom/stripe/android/paymentsheet/ui/EditCardPayload;", ViewProps.ENABLED, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ExpiryDateState create(EditCardPayload editPayload, boolean enabled) {
            Intrinsics.checkNotNullParameter(editPayload, "editPayload");
            return new ExpiryDateState(ExpiryDateStateKt.formattedExpiryDate(editPayload.getExpiryMonth(), editPayload.getExpiryYear(), enabled), enabled, null, 4, null);
        }
    }
}
