package com.stripe.android.paymentsheet.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentSheetViewState.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "", "errorMessage", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;)V", "getErrorMessage", "()Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;", "Reset", "StartProcessing", "FinishProcessing", "UserErrorMessage", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PaymentSheetViewState {
    public static final int $stable = 8;
    private final UserErrorMessage errorMessage;

    public /* synthetic */ PaymentSheetViewState(UserErrorMessage userErrorMessage, DefaultConstructorMarker defaultConstructorMarker) {
        this(userErrorMessage);
    }

    private PaymentSheetViewState(UserErrorMessage userErrorMessage) {
        this.errorMessage = userErrorMessage;
    }

    public /* synthetic */ PaymentSheetViewState(UserErrorMessage userErrorMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userErrorMessage, null);
    }

    public final UserErrorMessage getErrorMessage() {
        return this.errorMessage;
    }

    /* compiled from: PaymentSheetViewState.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$Reset;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "message", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;", "<init>", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Reset extends PaymentSheetViewState {
        public static final int $stable = 8;
        private final UserErrorMessage message;

        /* JADX WARN: Multi-variable type inference failed */
        public Reset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* renamed from: component1, reason: from getter */
        private final UserErrorMessage getMessage() {
            return this.message;
        }

        public static /* synthetic */ Reset copy$default(Reset reset, UserErrorMessage userErrorMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                userErrorMessage = reset.message;
            }
            return reset.copy(userErrorMessage);
        }

        public final Reset copy(UserErrorMessage message) {
            return new Reset(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Reset) && Intrinsics.areEqual(this.message, ((Reset) other).message);
        }

        public int hashCode() {
            UserErrorMessage userErrorMessage = this.message;
            if (userErrorMessage == null) {
                return 0;
            }
            return userErrorMessage.hashCode();
        }

        public String toString() {
            return "Reset(message=" + this.message + ")";
        }

        public /* synthetic */ Reset(UserErrorMessage userErrorMessage, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : userErrorMessage);
        }

        public Reset(UserErrorMessage userErrorMessage) {
            super(userErrorMessage, null);
            this.message = userErrorMessage;
        }
    }

    /* compiled from: PaymentSheetViewState.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$StartProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StartProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        public static final StartProcessing INSTANCE = new StartProcessing();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StartProcessing)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1787228877;
        }

        public String toString() {
            return "StartProcessing";
        }

        /* JADX WARN: Multi-variable type inference failed */
        private StartProcessing() {
            super(null, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: PaymentSheetViewState.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$FinishProcessing;", "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "onComplete", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "getOnComplete", "()Lkotlin/jvm/functions/Function0;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FinishProcessing extends PaymentSheetViewState {
        public static final int $stable = 0;
        private final Function0<Unit> onComplete;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = finishProcessing.onComplete;
            }
            return finishProcessing.copy(function0);
        }

        public final Function0<Unit> component1() {
            return this.onComplete;
        }

        public final FinishProcessing copy(Function0<Unit> onComplete) {
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            return new FinishProcessing(onComplete);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FinishProcessing) && Intrinsics.areEqual(this.onComplete, ((FinishProcessing) other).onComplete);
        }

        public int hashCode() {
            return this.onComplete.hashCode();
        }

        public String toString() {
            return "FinishProcessing(onComplete=" + this.onComplete + ")";
        }

        public final Function0<Unit> getOnComplete() {
            return this.onComplete;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FinishProcessing(Function0<Unit> onComplete) {
            super(null, 1, 0 == true ? 1 : 0);
            Intrinsics.checkNotNullParameter(onComplete, "onComplete");
            this.onComplete = onComplete;
        }
    }

    /* compiled from: PaymentSheetViewState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState$UserErrorMessage;", "", "message", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;)V", "getMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UserErrorMessage {
        public static final int $stable = 8;
        private final ResolvableString message;

        public static /* synthetic */ UserErrorMessage copy$default(UserErrorMessage userErrorMessage, ResolvableString resolvableString, int i, Object obj) {
            if ((i & 1) != 0) {
                resolvableString = userErrorMessage.message;
            }
            return userErrorMessage.copy(resolvableString);
        }

        /* renamed from: component1, reason: from getter */
        public final ResolvableString getMessage() {
            return this.message;
        }

        public final UserErrorMessage copy(ResolvableString message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new UserErrorMessage(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UserErrorMessage) && Intrinsics.areEqual(this.message, ((UserErrorMessage) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "UserErrorMessage(message=" + this.message + ")";
        }

        public UserErrorMessage(ResolvableString message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final ResolvableString getMessage() {
            return this.message;
        }
    }
}
