package com.stripe.android.uicore.elements;

import com.stripe.android.uicore.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextFieldStateConstants.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants;", "", "<init>", "()V", "Valid", "Error", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldStateConstants {
    public static final int $stable = 0;

    /* compiled from: TextFieldStateConstants.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "Lcom/stripe/android/uicore/elements/TextFieldState;", "<init>", "()V", "shouldShowError", "", "hasFocus", "isValid", "getError", "Lcom/stripe/android/uicore/elements/FieldError;", "isBlank", "Full", "Limitless", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Valid implements TextFieldState {
        public static final int $stable = 0;

        public /* synthetic */ Valid(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public FieldError getError() {
            return null;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isBlank() {
            return false;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isValid() {
            return true;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean shouldShowError(boolean hasFocus) {
            return false;
        }

        private Valid() {
        }

        /* compiled from: TextFieldStateConstants.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Full;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "<init>", "()V", "isFull", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Full extends Valid {
            public static final int $stable = 0;
            public static final Full INSTANCE = new Full();

            @Override // com.stripe.android.uicore.elements.TextFieldState
            /* renamed from: isFull */
            public boolean getPreventMoreInput() {
                return true;
            }

            private Full() {
                super(null);
            }
        }

        /* compiled from: TextFieldStateConstants.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid$Limitless;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Valid;", "<init>", "()V", "isFull", "", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Limitless extends Valid {
            public static final int $stable = 0;
            public static final Limitless INSTANCE = new Limitless();

            @Override // com.stripe.android.uicore.elements.TextFieldState
            /* renamed from: isFull */
            public boolean getPreventMoreInput() {
                return false;
            }

            private Limitless() {
                super(null);
            }
        }
    }

    /* compiled from: TextFieldStateConstants.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B'\b\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0003\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "Lcom/stripe/android/uicore/elements/TextFieldState;", "errorMessageResId", "", "formatArgs", "", "", "<init>", "(I[Ljava/lang/Object;)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "isValid", "", "isFull", "getError", "Lcom/stripe/android/uicore/elements/FieldError;", "Incomplete", "Invalid", "Blank", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Error implements TextFieldState {
        public static final int $stable = 8;
        private final int errorMessageResId;
        private final Object[] formatArgs;

        public /* synthetic */ Error(int i, Object[] objArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, objArr);
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        /* renamed from: isFull */
        public boolean getPreventMoreInput() {
            return false;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public boolean isValid() {
            return false;
        }

        private Error(int i, Object[] objArr) {
            this.errorMessageResId = i;
            this.formatArgs = objArr;
        }

        public /* synthetic */ Error(int i, Object[] objArr, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? null : objArr, null);
        }

        protected int getErrorMessageResId() {
            return this.errorMessageResId;
        }

        protected Object[] getFormatArgs() {
            return this.formatArgs;
        }

        @Override // com.stripe.android.uicore.elements.TextFieldState
        public FieldError getError() {
            return new FieldError(getErrorMessageResId(), getFormatArgs());
        }

        /* compiled from: TextFieldStateConstants.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Incomplete;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "<init>", "(I)V", "getErrorMessageResId", "()I", "shouldShowError", "", "hasFocus", "isBlank", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Incomplete extends Error {
            public static final int $stable = 0;
            private final int errorMessageResId;

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean hasFocus) {
                return !hasFocus;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            protected int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Incomplete(int i) {
                super(i, null, 2, 0 == true ? 1 : 0);
                this.errorMessageResId = i;
            }
        }

        /* compiled from: TextFieldStateConstants.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u0094\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Invalid;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "errorMessageResId", "", "formatArgs", "", "", "preventMoreInput", "", "<init>", "(I[Ljava/lang/Object;Z)V", "getErrorMessageResId", "()I", "getFormatArgs", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "shouldShowError", "hasFocus", "isBlank", "isFull", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Invalid extends Error {
            public static final int $stable = 8;
            private final int errorMessageResId;
            private final Object[] formatArgs;
            private final boolean preventMoreInput;

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return false;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean hasFocus) {
                return true;
            }

            public /* synthetic */ Invalid(int i, Object[] objArr, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(i, (i2 & 2) != 0 ? null : objArr, (i2 & 4) != 0 ? false : z);
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            protected int getErrorMessageResId() {
                return this.errorMessageResId;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error
            protected Object[] getFormatArgs() {
                return this.formatArgs;
            }

            public Invalid(int i, Object[] objArr, boolean z) {
                super(i, objArr, null);
                this.errorMessageResId = i;
                this.formatArgs = objArr;
                this.preventMoreInput = z;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldStateConstants.Error, com.stripe.android.uicore.elements.TextFieldState
            /* renamed from: isFull, reason: from getter */
            public boolean getPreventMoreInput() {
                return this.preventMoreInput;
            }
        }

        /* compiled from: TextFieldStateConstants.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error$Blank;", "Lcom/stripe/android/uicore/elements/TextFieldStateConstants$Error;", "<init>", "()V", "shouldShowError", "", "hasFocus", "isBlank", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Blank extends Error {
            public static final int $stable = 0;
            public static final Blank INSTANCE = new Blank();

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean isBlank() {
                return true;
            }

            @Override // com.stripe.android.uicore.elements.TextFieldState
            public boolean shouldShowError(boolean hasFocus) {
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private Blank() {
                super(R.string.stripe_blank_and_required, null, 2, 0 == true ? 1 : 0);
            }
        }
    }
}
