package com.stripe.android.link.ui.signup;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.link.LinkConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: SignUpScreenState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0001(BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003JQ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012¨\u0006)"}, d2 = {"Lcom/stripe/android/link/ui/signup/SignUpScreenState;", "", "merchantName", "", "signUpEnabled", "", "requiresNameCollection", "canEditEmail", "signUpState", "Lcom/stripe/android/link/ui/signup/SignUpState;", "isSubmitting", "errorMessage", "Lcom/stripe/android/core/strings/ResolvableString;", "<init>", "(Ljava/lang/String;ZZZLcom/stripe/android/link/ui/signup/SignUpState;ZLcom/stripe/android/core/strings/ResolvableString;)V", "getMerchantName", "()Ljava/lang/String;", "getSignUpEnabled", "()Z", "getRequiresNameCollection", "getCanEditEmail", "getSignUpState", "()Lcom/stripe/android/link/ui/signup/SignUpState;", "getErrorMessage", "()Lcom/stripe/android/core/strings/ResolvableString;", "canEditForm", "getCanEditForm", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SignUpScreenState {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean canEditEmail;
    private final ResolvableString errorMessage;
    private final boolean isSubmitting;
    private final String merchantName;
    private final boolean requiresNameCollection;
    private final boolean signUpEnabled;
    private final SignUpState signUpState;

    public static /* synthetic */ SignUpScreenState copy$default(SignUpScreenState signUpScreenState, String str, boolean z, boolean z2, boolean z3, SignUpState signUpState, boolean z4, ResolvableString resolvableString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = signUpScreenState.merchantName;
        }
        if ((i & 2) != 0) {
            z = signUpScreenState.signUpEnabled;
        }
        if ((i & 4) != 0) {
            z2 = signUpScreenState.requiresNameCollection;
        }
        if ((i & 8) != 0) {
            z3 = signUpScreenState.canEditEmail;
        }
        if ((i & 16) != 0) {
            signUpState = signUpScreenState.signUpState;
        }
        if ((i & 32) != 0) {
            z4 = signUpScreenState.isSubmitting;
        }
        if ((i & 64) != 0) {
            resolvableString = signUpScreenState.errorMessage;
        }
        boolean z5 = z4;
        ResolvableString resolvableString2 = resolvableString;
        SignUpState signUpState2 = signUpState;
        boolean z6 = z2;
        return signUpScreenState.copy(str, z, z6, z3, signUpState2, z5, resolvableString2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSignUpEnabled() {
        return this.signUpEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getRequiresNameCollection() {
        return this.requiresNameCollection;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCanEditEmail() {
        return this.canEditEmail;
    }

    /* renamed from: component5, reason: from getter */
    public final SignUpState getSignUpState() {
        return this.signUpState;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    /* renamed from: component7, reason: from getter */
    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    public final SignUpScreenState copy(String merchantName, boolean signUpEnabled, boolean requiresNameCollection, boolean canEditEmail, SignUpState signUpState, boolean isSubmitting, ResolvableString errorMessage) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        return new SignUpScreenState(merchantName, signUpEnabled, requiresNameCollection, canEditEmail, signUpState, isSubmitting, errorMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpScreenState)) {
            return false;
        }
        SignUpScreenState signUpScreenState = (SignUpScreenState) other;
        return Intrinsics.areEqual(this.merchantName, signUpScreenState.merchantName) && this.signUpEnabled == signUpScreenState.signUpEnabled && this.requiresNameCollection == signUpScreenState.requiresNameCollection && this.canEditEmail == signUpScreenState.canEditEmail && this.signUpState == signUpScreenState.signUpState && this.isSubmitting == signUpScreenState.isSubmitting && Intrinsics.areEqual(this.errorMessage, signUpScreenState.errorMessage);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.merchantName.hashCode() * 31) + Boolean.hashCode(this.signUpEnabled)) * 31) + Boolean.hashCode(this.requiresNameCollection)) * 31) + Boolean.hashCode(this.canEditEmail)) * 31) + this.signUpState.hashCode()) * 31) + Boolean.hashCode(this.isSubmitting)) * 31;
        ResolvableString resolvableString = this.errorMessage;
        return iHashCode + (resolvableString == null ? 0 : resolvableString.hashCode());
    }

    public String toString() {
        return "SignUpScreenState(merchantName=" + this.merchantName + ", signUpEnabled=" + this.signUpEnabled + ", requiresNameCollection=" + this.requiresNameCollection + ", canEditEmail=" + this.canEditEmail + ", signUpState=" + this.signUpState + ", isSubmitting=" + this.isSubmitting + ", errorMessage=" + this.errorMessage + ")";
    }

    public SignUpScreenState(String merchantName, boolean z, boolean z2, boolean z3, SignUpState signUpState, boolean z4, ResolvableString resolvableString) {
        Intrinsics.checkNotNullParameter(merchantName, "merchantName");
        Intrinsics.checkNotNullParameter(signUpState, "signUpState");
        this.merchantName = merchantName;
        this.signUpEnabled = z;
        this.requiresNameCollection = z2;
        this.canEditEmail = z3;
        this.signUpState = signUpState;
        this.isSubmitting = z4;
        this.errorMessage = resolvableString;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final boolean getSignUpEnabled() {
        return this.signUpEnabled;
    }

    public final boolean getRequiresNameCollection() {
        return this.requiresNameCollection;
    }

    public final boolean getCanEditEmail() {
        return this.canEditEmail;
    }

    public /* synthetic */ SignUpScreenState(String str, boolean z, boolean z2, boolean z3, SignUpState signUpState, boolean z4, ResolvableString resolvableString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, z3, (i & 16) != 0 ? SignUpState.InputtingPrimaryField : signUpState, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : resolvableString);
    }

    public final SignUpState getSignUpState() {
        return this.signUpState;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final ResolvableString getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean getCanEditForm() {
        return !this.isSubmitting;
    }

    /* compiled from: SignUpScreenState.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/link/ui/signup/SignUpScreenState$Companion;", "", "<init>", "()V", "create", "Lcom/stripe/android/link/ui/signup/SignUpScreenState;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "customerInfo", "Lcom/stripe/android/link/LinkConfiguration$CustomerInfo;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SignUpScreenState create(LinkConfiguration configuration, LinkConfiguration.CustomerInfo customerInfo) {
            String email;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new SignUpScreenState(configuration.getMerchantName(), customerInfo != null && SignUpScreenStateKt.isComplete(customerInfo, SignUpScreenStateKt.getRequiresNameCollection(configuration)), SignUpScreenStateKt.getRequiresNameCollection(configuration), configuration.getAllowUserEmailEdits(), (customerInfo == null || (email = customerInfo.getEmail()) == null || StringsKt.isBlank(email)) ? SignUpState.InputtingPrimaryField : SignUpState.InputtingRemainingFields, false, null, 96, null);
        }
    }
}
