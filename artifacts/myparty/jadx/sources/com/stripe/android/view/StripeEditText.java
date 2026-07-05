package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import androidx.appcompat.R;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.stripe.android.view.StripeEditText;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeEditText.kt */
@Metadata(d1 = {"\u0000\u0091\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\b*\u00012\b\u0017\u0018\u00002\u00020\u0001:\u0005fghijB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010>\u001a\u00020?2\u0006\u0010A\u001a\u00020\u0007H\u0016J\u0012\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020?2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010G\u001a\u00020?2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010H\u001a\u00020?2\b\u0010/\u001a\u0004\u0018\u000100J\u0010\u0010I\u001a\u00020?2\b\u0010'\u001a\u0004\u0018\u00010(J\u0010\u0010J\u001a\u00020?2\b\b\u0001\u0010K\u001a\u00020\u0007J\u0010\u0010L\u001a\u00020?2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020?H\u0002J\b\u0010P\u001a\u00020?H\u0002J\b\u0010Q\u001a\u00020?H\u0002J\u0010\u0010R\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020\u0007H\u0002J\b\u0010T\u001a\u00020UH\u0016J\u0012\u0010V\u001a\u00020?2\b\u0010W\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010X\u001a\u00020?2\b\u0010Y\u001a\u0004\u0018\u000108J\n\u0010Z\u001a\u0004\u0018\u000108H\u0016J\u0015\u0010[\u001a\n \\*\u0004\u0018\u00010808H\u0007¢\u0006\u0002\u0010]J\u0012\u0010^\u001a\u00020?2\b\u0010_\u001a\u0004\u0018\u00010#H\u0016J\u0012\u0010`\u001a\u00020?2\b\u0010_\u001a\u0004\u0018\u00010#H\u0016J\u0017\u0010a\u001a\u00020?2\b\u0010b\u001a\u0004\u0018\u00010cH\u0000¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020?H\u0007R$\u0010\n\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0017@AX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0016\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000f\"\u0004\b&\u0010\u0011R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020(8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b.\u0010*R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0004\n\u0002\u00103R\u0011\u00104\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b5\u00106R\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002080\"8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u000108X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010<\u001a\u0004\u0018\u00010(X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010*¨\u0006k"}, d2 = {"Lcom/stripe/android/view/StripeEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isLastKeyDelete", "", "isLastKeyDelete$payments_core_release$annotations", "()V", "isLastKeyDelete$payments_core_release", "()Z", "setLastKeyDelete$payments_core_release", "(Z)V", "afterTextChangedListener", "Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "value", "Landroid/content/res/ColorStateList;", "defaultColorStateList", "getDefaultColorStateList$payments_core_release", "()Landroid/content/res/ColorStateList;", "setDefaultColorStateList$payments_core_release", "(Landroid/content/res/ColorStateList;)V", "externalColorStateList", "defaultErrorColor", "externalErrorColor", "Ljava/lang/Integer;", "textWatchers", "", "Landroid/text/TextWatcher;", "shouldShowError", "getShouldShowError", "setShouldShowError", "errorMessage", "", "getErrorMessage$payments_core_release", "()Ljava/lang/String;", "setErrorMessage$payments_core_release", "(Ljava/lang/String;)V", "fieldText", "getFieldText$payments_core_release", "errorMessageListener", "Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "isLastKeyDeleteTextWatcher", "com/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1", "Lcom/stripe/android/view/StripeEditText$isLastKeyDeleteTextWatcher$1;", "defaultErrorColorInt", "getDefaultErrorColorInt", "()I", "internalFocusChangeListeners", "Landroid/view/View$OnFocusChangeListener;", "getInternalFocusChangeListeners", "()Ljava/util/List;", "externalFocusChangeListener", "accessibilityText", "getAccessibilityText", "setTextColor", "", PaymentSheetAppearanceKeys.COLORS, "color", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "setAfterTextChangedListener", "setDeleteEmptyListener", "setErrorMessageListener", "setErrorMessage", "setErrorColor", "errorColor", "onInitializeAccessibilityNodeInfo", "info", "Landroid/view/accessibility/AccessibilityNodeInfo;", "determineDefaultErrorColor", "listenForTextChanges", "listenForDeleteEmpty", "isDeleteKey", "keyCode", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "setOnFocusChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getOnFocusChangeListener", "getParentOnFocusChangeListener", "kotlin.jvm.PlatformType", "()Landroid/view/View$OnFocusChangeListener;", "addTextChangedListener", "watcher", "removeTextChangedListener", "setTextSilent", "text", "", "setTextSilent$payments_core_release", "setNumberOnlyInputType", "DeleteEmptyListener", "AfterTextChangedListener", "ErrorMessageListener", "SoftDeleteInputConnection", "StripeEditTextState", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public class StripeEditText extends TextInputEditText {
    public static final int $stable = 8;
    private final String accessibilityText;
    private AfterTextChangedListener afterTextChangedListener;
    private ColorStateList defaultColorStateList;
    private int defaultErrorColor;
    private DeleteEmptyListener deleteEmptyListener;
    private String errorMessage;
    private ErrorMessageListener errorMessageListener;
    private ColorStateList externalColorStateList;
    private Integer externalErrorColor;
    private View.OnFocusChangeListener externalFocusChangeListener;
    private final List<View.OnFocusChangeListener> internalFocusChangeListeners;
    private boolean isLastKeyDelete;
    private final StripeEditText$isLastKeyDeleteTextWatcher$1 isLastKeyDeleteTextWatcher;
    private boolean shouldShowError;
    private List<TextWatcher> textWatchers;

    /* compiled from: StripeEditText.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/StripeEditText$AfterTextChangedListener;", "", "onTextChanged", "", "text", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AfterTextChangedListener {
        void onTextChanged(String text);
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "", "onDeleteEmpty", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DeleteEmptyListener {
        void onDeleteEmpty();
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/StripeEditText$ErrorMessageListener;", "", "displayErrorMessage", "", "message", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ErrorMessageListener {
        void displayErrorMessage(String message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StripeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final boolean isDeleteKey(int keyCode) {
        return keyCode == 67;
    }

    public static /* synthetic */ void isLastKeyDelete$payments_core_release$annotations() {
    }

    public /* synthetic */ StripeEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1] */
    public StripeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isLastKeyDeleteTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.StripeEditText$isLastKeyDeleteTextWatcher$1
            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                this.this$0.setLastKeyDelete$payments_core_release(count == 0);
            }
        };
        this.textWatchers = new ArrayList();
        setMaxLines(1);
        listenForTextChanges();
        listenForDeleteEmpty();
        this.defaultColorStateList = getTextColors();
        determineDefaultErrorColor();
        setOnFocusChangeListener(null);
        this.internalFocusChangeListeners = new ArrayList();
    }

    /* renamed from: isLastKeyDelete$payments_core_release, reason: from getter */
    public final boolean getIsLastKeyDelete() {
        return this.isLastKeyDelete;
    }

    public final void setLastKeyDelete$payments_core_release(boolean z) {
        this.isLastKeyDelete = z;
    }

    /* renamed from: getDefaultColorStateList$payments_core_release, reason: from getter */
    public final ColorStateList getDefaultColorStateList() {
        return this.defaultColorStateList;
    }

    public final void setDefaultColorStateList$payments_core_release(ColorStateList colorStateList) {
        Intrinsics.checkNotNullParameter(colorStateList, "<set-?>");
        this.defaultColorStateList = colorStateList;
    }

    public final boolean getShouldShowError() {
        return this.shouldShowError;
    }

    public final void setShouldShowError(boolean z) {
        ErrorMessageListener errorMessageListener;
        String str = this.errorMessage;
        if (str != null && (errorMessageListener = this.errorMessageListener) != null) {
            if (!Boolean.valueOf(z).booleanValue()) {
                str = null;
            }
            errorMessageListener.displayErrorMessage(str);
        }
        if (this.shouldShowError != z) {
            if (z) {
                Integer num = this.externalErrorColor;
                super.setTextColor(num != null ? num.intValue() : this.defaultErrorColor);
            } else {
                ColorStateList colorStateList = this.externalColorStateList;
                if (colorStateList == null) {
                    colorStateList = this.defaultColorStateList;
                }
                super.setTextColor(colorStateList);
            }
            refreshDrawableState();
        }
        this.shouldShowError = z;
    }

    /* renamed from: getErrorMessage$payments_core_release, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final void setErrorMessage$payments_core_release(String str) {
        this.errorMessage = str;
    }

    public final String getFieldText$payments_core_release() {
        Editable text = getText();
        String string = text != null ? text.toString() : null;
        return string == null ? "" : string;
    }

    public final int getDefaultErrorColorInt() {
        determineDefaultErrorColor();
        return this.defaultErrorColor;
    }

    public final List<View.OnFocusChangeListener> getInternalFocusChangeListeners() {
        return this.internalFocusChangeListeners;
    }

    protected String getAccessibilityText() {
        return this.accessibilityText;
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colors) {
        super.setTextColor(colors);
        this.externalColorStateList = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(int color) {
        setTextColor(ColorStateList.valueOf(color));
    }

    @Override // com.google.android.material.textfield.TextInputEditText, androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo outAttrs) {
        Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(outAttrs);
        return inputConnectionOnCreateInputConnection != null ? new SoftDeleteInputConnection(inputConnectionOnCreateInputConnection, true, this.deleteEmptyListener) : null;
    }

    public final void setAfterTextChangedListener(AfterTextChangedListener afterTextChangedListener) {
        this.afterTextChangedListener = afterTextChangedListener;
    }

    public final void setDeleteEmptyListener(DeleteEmptyListener deleteEmptyListener) {
        this.deleteEmptyListener = deleteEmptyListener;
    }

    public final void setErrorMessageListener(ErrorMessageListener errorMessageListener) {
        this.errorMessageListener = errorMessageListener;
    }

    public final void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public final void setErrorColor(int errorColor) {
        this.externalErrorColor = Integer.valueOf(errorColor);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setContentInvalid(this.shouldShowError);
        String accessibilityText = getAccessibilityText();
        if (accessibilityText != null) {
            info.setText(accessibilityText);
        }
        String str = this.errorMessage;
        if (!this.shouldShowError) {
            str = null;
        }
        info.setError(str);
    }

    private final void determineDefaultErrorColor() {
        int i;
        Context context = getContext();
        if (StripeColorUtils.INSTANCE.isColorDark(this.defaultColorStateList.getDefaultColor())) {
            i = com.stripe.android.R.color.stripe_error_text_light_theme;
        } else {
            i = com.stripe.android.R.color.stripe_error_text_dark_theme;
        }
        this.defaultErrorColor = ContextCompat.getColor(context, i);
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.StripeEditText$listenForTextChanges$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                StripeEditText.AfterTextChangedListener afterTextChangedListener = this.this$0.afterTextChangedListener;
                if (afterTextChangedListener != null) {
                    String string = s != null ? s.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    afterTextChangedListener.onTextChanged(string);
                }
            }
        });
    }

    private final void listenForDeleteEmpty() {
        List<TextWatcher> listEmptyList = this.textWatchers;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        if (!listEmptyList.contains(this.isLastKeyDeleteTextWatcher)) {
            addTextChangedListener(this.isLastKeyDeleteTextWatcher);
        }
        setOnKeyListener(new View.OnKeyListener() { // from class: com.stripe.android.view.StripeEditText$$ExternalSyntheticLambda0
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return StripeEditText.listenForDeleteEmpty$lambda$6(this.f$0, view, i, keyEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean listenForDeleteEmpty$lambda$6(StripeEditText stripeEditText, View view, int i, KeyEvent keyEvent) {
        DeleteEmptyListener deleteEmptyListener;
        if (keyEvent.getAction() != 0) {
            return false;
        }
        boolean zIsDeleteKey = stripeEditText.isDeleteKey(i);
        stripeEditText.isLastKeyDelete = zIsDeleteKey;
        if (!zIsDeleteKey || stripeEditText.length() != 0 || (deleteEmptyListener = stripeEditText.deleteEmptyListener) == null) {
            return false;
        }
        deleteEmptyListener.onDeleteEmpty();
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new StripeEditTextState(super.onSaveInstanceState(), this.errorMessage, this.shouldShowError);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        if (state instanceof StripeEditTextState) {
            StripeEditTextState stripeEditTextState = (StripeEditTextState) state;
            super.onRestoreInstanceState(stripeEditTextState.getSuperState());
            this.errorMessage = stripeEditTextState.getErrorMessage();
            setShouldShowError(stripeEditTextState.getShouldShowError());
            return;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/StripeEditText$SoftDeleteInputConnection;", "Landroid/view/inputmethod/InputConnectionWrapper;", TypedValues.AttributesType.S_TARGET, "Landroid/view/inputmethod/InputConnection;", "mutable", "", "deleteEmptyListener", "Lcom/stripe/android/view/StripeEditText$DeleteEmptyListener;", "<init>", "(Landroid/view/inputmethod/InputConnection;ZLcom/stripe/android/view/StripeEditText$DeleteEmptyListener;)V", "deleteSurroundingText", "beforeLength", "", "afterLength", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class SoftDeleteInputConnection extends InputConnectionWrapper {
        private final DeleteEmptyListener deleteEmptyListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SoftDeleteInputConnection(InputConnection target, boolean z, DeleteEmptyListener deleteEmptyListener) {
            super(target, z);
            Intrinsics.checkNotNullParameter(target, "target");
            this.deleteEmptyListener = deleteEmptyListener;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean deleteSurroundingText(int beforeLength, int afterLength) {
            DeleteEmptyListener deleteEmptyListener;
            CharSequence textBeforeCursor = getTextBeforeCursor(1, 0);
            if (textBeforeCursor != null && textBeforeCursor.length() == 0 && (deleteEmptyListener = this.deleteEmptyListener) != null) {
                deleteEmptyListener.onDeleteEmpty();
            }
            return super.deleteSurroundingText(beforeLength, afterLength);
        }
    }

    @Override // android.view.View
    public final void setOnFocusChangeListener(View.OnFocusChangeListener listener) {
        super.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.StripeEditText$$ExternalSyntheticLambda1
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                StripeEditText.setOnFocusChangeListener$lambda$8(this.f$0, view, z);
            }
        });
        this.externalFocusChangeListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnFocusChangeListener$lambda$8(StripeEditText stripeEditText, View view, boolean z) {
        Iterator<T> it = stripeEditText.internalFocusChangeListeners.iterator();
        while (it.hasNext()) {
            ((View.OnFocusChangeListener) it.next()).onFocusChange(view, z);
        }
        View.OnFocusChangeListener onFocusChangeListener = stripeEditText.externalFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z);
        }
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.externalFocusChangeListener;
    }

    public final View.OnFocusChangeListener getParentOnFocusChangeListener() {
        return super.getOnFocusChangeListener();
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.addTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.add(watcher);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher watcher) {
        List<TextWatcher> list;
        super.removeTextChangedListener(watcher);
        if (watcher == null || (list = this.textWatchers) == null) {
            return;
        }
        list.remove(watcher);
    }

    public final void setTextSilent$payments_core_release(CharSequence text) {
        List<TextWatcher> list = this.textWatchers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener((TextWatcher) it.next());
            }
        }
        setText(text);
        List<TextWatcher> list2 = this.textWatchers;
        if (list2 != null) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                super.addTextChangedListener((TextWatcher) it2.next());
            }
        }
    }

    public final void setNumberOnlyInputType() {
        Typeface typeface = getTypeface();
        setInputType(18);
        setTypeface(typeface);
        setTransformationMethod(HideReturnsTransformationMethod.getInstance());
    }

    /* compiled from: StripeEditText.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/StripeEditText$StripeEditTextState;", "Landroid/os/Parcelable;", "superState", "errorMessage", "", "shouldShowError", "", "<init>", "(Landroid/os/Parcelable;Ljava/lang/String;Z)V", "getSuperState", "()Landroid/os/Parcelable;", "getErrorMessage", "()Ljava/lang/String;", "getShouldShowError", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StripeEditTextState implements Parcelable {
        private final String errorMessage;
        private final boolean shouldShowError;
        private final Parcelable superState;
        public static final Parcelable.Creator<StripeEditTextState> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: StripeEditText.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<StripeEditTextState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StripeEditTextState(parcel.readParcelable(StripeEditTextState.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StripeEditTextState[] newArray(int i) {
                return new StripeEditTextState[i];
            }
        }

        public static /* synthetic */ StripeEditTextState copy$default(StripeEditTextState stripeEditTextState, Parcelable parcelable, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = stripeEditTextState.superState;
            }
            if ((i & 2) != 0) {
                str = stripeEditTextState.errorMessage;
            }
            if ((i & 4) != 0) {
                z = stripeEditTextState.shouldShowError;
            }
            return stripeEditTextState.copy(parcelable, str, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperState() {
            return this.superState;
        }

        /* renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }

        public final StripeEditTextState copy(Parcelable superState, String errorMessage, boolean shouldShowError) {
            return new StripeEditTextState(superState, errorMessage, shouldShowError);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StripeEditTextState)) {
                return false;
            }
            StripeEditTextState stripeEditTextState = (StripeEditTextState) other;
            return Intrinsics.areEqual(this.superState, stripeEditTextState.superState) && Intrinsics.areEqual(this.errorMessage, stripeEditTextState.errorMessage) && this.shouldShowError == stripeEditTextState.shouldShowError;
        }

        public int hashCode() {
            Parcelable parcelable = this.superState;
            int iHashCode = (parcelable == null ? 0 : parcelable.hashCode()) * 31;
            String str = this.errorMessage;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowError);
        }

        public String toString() {
            return "StripeEditTextState(superState=" + this.superState + ", errorMessage=" + this.errorMessage + ", shouldShowError=" + this.shouldShowError + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superState, flags);
            dest.writeString(this.errorMessage);
            dest.writeInt(this.shouldShowError ? 1 : 0);
        }

        public StripeEditTextState(Parcelable parcelable, String str, boolean z) {
            this.superState = parcelable;
            this.errorMessage = str;
            this.shouldShowError = z;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final boolean getShouldShowError() {
            return this.shouldShowError;
        }
    }
}
