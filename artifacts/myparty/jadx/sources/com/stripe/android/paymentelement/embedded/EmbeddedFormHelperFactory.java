package com.stripe.android.paymentelement.embedded;

import androidx.lifecycle.SavedStateHandle;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.lpmfoundations.paymentmethod.PaymentMethodMetadata;
import com.stripe.android.paymentsheet.DefaultFormHelper;
import com.stripe.android.paymentsheet.FormHelper;
import com.stripe.android.paymentsheet.LinkInlineHandler;
import com.stripe.android.paymentsheet.NewPaymentOptionSelection;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmbeddedFormHelperFactory.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00190\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/paymentelement/embedded/EmbeddedFormHelperFactory;", "", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "embeddedSelectionHolder", "Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;", "cardAccountRangeRepositoryFactory", "Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/paymentelement/embedded/EmbeddedSelectionHolder;Lcom/stripe/android/cards/CardAccountRangeRepository$Factory;Landroidx/lifecycle/SavedStateHandle;)V", "create", "Lcom/stripe/android/paymentsheet/FormHelper;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "setAsDefaultMatchesSaveForFutureUse", "", "paymentMethodMetadata", "Lcom/stripe/android/lpmfoundations/paymentmethod/PaymentMethodMetadata;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "selectionUpdater", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EmbeddedFormHelperFactory {
    public static final int $stable = 8;
    private final CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory;
    private final EmbeddedSelectionHolder embeddedSelectionHolder;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final SavedStateHandle savedStateHandle;

    @Inject
    public EmbeddedFormHelperFactory(LinkConfigurationCoordinator linkConfigurationCoordinator, EmbeddedSelectionHolder embeddedSelectionHolder, CardAccountRangeRepository.Factory cardAccountRangeRepositoryFactory, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(embeddedSelectionHolder, "embeddedSelectionHolder");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.embeddedSelectionHolder = embeddedSelectionHolder;
        this.cardAccountRangeRepositoryFactory = cardAccountRangeRepositoryFactory;
        this.savedStateHandle = savedStateHandle;
    }

    public final FormHelper create(CoroutineScope coroutineScope, boolean setAsDefaultMatchesSaveForFutureUse, PaymentMethodMetadata paymentMethodMetadata, EventReporter eventReporter, Function1<? super PaymentSelection, Unit> selectionUpdater) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(paymentMethodMetadata, "paymentMethodMetadata");
        Intrinsics.checkNotNullParameter(eventReporter, "eventReporter");
        Intrinsics.checkNotNullParameter(selectionUpdater, "selectionUpdater");
        return new DefaultFormHelper(coroutineScope, LinkInlineHandler.INSTANCE.create(), this.cardAccountRangeRepositoryFactory, paymentMethodMetadata, new Function0() { // from class: com.stripe.android.paymentelement.embedded.EmbeddedFormHelperFactory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EmbeddedFormHelperFactory.create$lambda$0(this.f$0);
            }
        }, selectionUpdater, this.linkConfigurationCoordinator, setAsDefaultMatchesSaveForFutureUse, eventReporter, this.savedStateHandle, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NewPaymentOptionSelection create$lambda$0(EmbeddedFormHelperFactory embeddedFormHelperFactory) {
        PaymentSelection value = embeddedFormHelperFactory.embeddedSelectionHolder.getSelection().getValue();
        if (value instanceof PaymentSelection.ExternalPaymentMethod) {
            return new NewPaymentOptionSelection.External((PaymentSelection.ExternalPaymentMethod) value);
        }
        if (value instanceof PaymentSelection.CustomPaymentMethod) {
            return new NewPaymentOptionSelection.Custom((PaymentSelection.CustomPaymentMethod) value);
        }
        if (value instanceof PaymentSelection.New) {
            return new NewPaymentOptionSelection.New((PaymentSelection.New) value);
        }
        return null;
    }
}
