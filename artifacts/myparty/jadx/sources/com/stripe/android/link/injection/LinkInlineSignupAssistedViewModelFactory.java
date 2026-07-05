package com.stripe.android.link.injection;

import com.stripe.android.link.ui.inline.InlineSignupViewModel;
import com.stripe.android.link.ui.inline.LinkSignupMode;
import com.stripe.android.link.ui.inline.UserInput;
import dagger.assisted.AssistedFactory;
import kotlin.Metadata;

/* compiled from: LinkInlineSignupAssistedViewModelFactory.kt */
@AssistedFactory
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/stripe/android/link/injection/LinkInlineSignupAssistedViewModelFactory;", "", "create", "Lcom/stripe/android/link/ui/inline/InlineSignupViewModel;", "signupMode", "Lcom/stripe/android/link/ui/inline/LinkSignupMode;", "initialUserInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkInlineSignupAssistedViewModelFactory {
    InlineSignupViewModel create(LinkSignupMode signupMode, UserInput initialUserInput);
}
