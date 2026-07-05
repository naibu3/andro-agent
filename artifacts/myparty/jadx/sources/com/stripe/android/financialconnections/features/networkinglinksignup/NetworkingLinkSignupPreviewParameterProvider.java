package com.stripe.android.financialconnections.features.networkinglinksignup;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import com.facebook.hermes.intl.Constants;
import com.stripe.android.financialconnections.features.networkinglinksignup.NetworkingLinkSignupState;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.model.LegalDetailsNotice;
import com.stripe.android.financialconnections.model.LinkLoginPane;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupBody;
import com.stripe.android.financialconnections.model.NetworkingLinkSignupPane;
import com.stripe.android.financialconnections.presentation.Async;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.DisplayablePaymentDetails;
import com.stripe.android.uicore.elements.EmailConfig;
import com.stripe.android.uicore.elements.PhoneNumberController;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: NetworkingLinkSignupPreviewParameterProvider.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", Constants.COLLATION_DEFAULT, "emailEntered", "invalidEmail", "instantDebits", "networkingLinkSignupPane", "Lcom/stripe/android/financialconnections/features/networkinglinksignup/NetworkingLinkSignupState$Content;", "linkLoginPane", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NetworkingLinkSignupPreviewParameterProvider implements PreviewParameterProvider<NetworkingLinkSignupState> {
    public static final int $stable = 8;
    private final Sequence<NetworkingLinkSignupState> values = SequencesKt.sequenceOf(m7446default(), emailEntered(), invalidEmail(), instantDebits());

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<NetworkingLinkSignupState> getValues() {
        return this.values;
    }

    /* renamed from: default, reason: not valid java name */
    private final NetworkingLinkSignupState m7446default() {
        return new NetworkingLinkSignupState(new Async.Success(new NetworkingLinkSignupState.Payload("Test", EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "", false, 2, null), false, null, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 28, null), false, networkingLinkSignupPane(), "fcsess_1234")), null, null, Async.Uninitialized.INSTANCE, Async.Uninitialized.INSTANCE, null, false, 96, null);
    }

    private final NetworkingLinkSignupState emailEntered() {
        return new NetworkingLinkSignupState(new Async.Success(new NetworkingLinkSignupState.Payload("Test", EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "valid@email.com", false, 2, null), false, null, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 28, null), false, networkingLinkSignupPane(), "fcsess_1234")), "test@test.com", null, Async.Uninitialized.INSTANCE, new Async.Success(new ConsumerSessionLookup(false, (ConsumerSession) null, (String) null, (String) null, (DisplayablePaymentDetails) null, 24, (DefaultConstructorMarker) null)), null, false, 96, null);
    }

    private final NetworkingLinkSignupState invalidEmail() {
        return new NetworkingLinkSignupState(new Async.Success(new NetworkingLinkSignupState.Payload("Test", EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, "invalid_email.com", false, 2, null), false, null, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 28, null), false, networkingLinkSignupPane(), "fcsess_1234")), "test@test.com", null, Async.Uninitialized.INSTANCE, new Async.Success(new ConsumerSessionLookup(false, (ConsumerSession) null, (String) null, (String) null, (DisplayablePaymentDetails) null, 24, (DefaultConstructorMarker) null)), null, false, 96, null);
    }

    private final NetworkingLinkSignupState instantDebits() {
        return new NetworkingLinkSignupState(new Async.Success(new NetworkingLinkSignupState.Payload("Test", EmailConfig.Companion.createController$default(EmailConfig.INSTANCE, null, false, 2, null), false, null, PhoneNumberController.Companion.createPhoneNumberController$default(PhoneNumberController.INSTANCE, "", null, null, false, false, 28, null), true, linkLoginPane(), "fcsess_1234")), null, null, Async.Uninitialized.INSTANCE, Async.Uninitialized.INSTANCE, null, true, 32, null);
    }

    private final NetworkingLinkSignupState.Content networkingLinkSignupPane() {
        return NetworkingLinkSignupViewModelKt.toContent(new NetworkingLinkSignupPane("Save account with Link", new NetworkingLinkSignupBody(CollectionsKt.listOf((Object[]) new Bullet[]{new Bullet((String) null, (Image) null, "Connect your account faster everywhere Link is accepted.", 3, (DefaultConstructorMarker) null), new Bullet((String) null, (Image) null, "Link encrypts your data and never shares your login details.", 3, (DefaultConstructorMarker) null)})), "By saving your account to Link, you agree to Link’s Terms and Privacy Policy", "Save with Link", "Not now", (LegalDetailsNotice) null, 32, (DefaultConstructorMarker) null));
    }

    private final NetworkingLinkSignupState.Content linkLoginPane() {
        return NetworkingLinkSignupViewModelKt.toContent(new LinkLoginPane("Sign up or log in", "Connect your account to RandomBusiness using Link.", "By using Link, you authorize debits under these Terms.", "Continue with Link"));
    }
}
