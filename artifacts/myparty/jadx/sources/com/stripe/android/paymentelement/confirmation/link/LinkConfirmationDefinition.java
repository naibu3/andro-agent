package com.stripe.android.paymentelement.confirmation.link;

import androidx.activity.result.ActivityResultCaller;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.common.exception.ExceptionKtKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkAccountUpdate;
import com.stripe.android.link.LinkActivityResult;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.account.LinkAccountHolder;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00040\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@¢\u0006\u0002\u0010\u001fJ-\u0010 \u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001eH\u0016¢\u0006\u0002\u0010\"J*\u0010#\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u0005H\u0016J\f\u0010(\u001a\u00020\u0004*\u00020)H\u0002R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006*"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;", "Lcom/stripe/android/link/LinkPaymentLauncher;", "", "Lcom/stripe/android/link/LinkActivityResult;", "linkPaymentLauncher", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "linkAccountHolder", "Lcom/stripe/android/link/account/LinkAccountHolder;", "<init>", "(Lcom/stripe/android/link/LinkPaymentLauncher;Lcom/stripe/android/link/account/LinkStore;Lcom/stripe/android/link/account/LinkAccountHolder;)V", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "unregister", "launcher", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "arguments", "(Lcom/stripe/android/link/LinkPaymentLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/link/LinkConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "updateLinkAccount", "Lcom/stripe/android/link/LinkAccountUpdate;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkConfirmationDefinition implements ConfirmationDefinition<LinkConfirmationOption, LinkPaymentLauncher, Unit, LinkActivityResult> {
    public static final int $stable = 8;
    private final String key;
    private final LinkAccountHolder linkAccountHolder;
    private final LinkPaymentLauncher linkPaymentLauncher;
    private final LinkStore linkStore;

    @Inject
    public LinkConfirmationDefinition(LinkPaymentLauncher linkPaymentLauncher, LinkStore linkStore, LinkAccountHolder linkAccountHolder) {
        Intrinsics.checkNotNullParameter(linkPaymentLauncher, "linkPaymentLauncher");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        Intrinsics.checkNotNullParameter(linkAccountHolder, "linkAccountHolder");
        this.linkPaymentLauncher = linkPaymentLauncher;
        this.linkStore = linkStore;
        this.linkAccountHolder = linkAccountHolder;
        this.key = "Link";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(LinkConfirmationOption linkConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, linkConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ LinkPaymentLauncher createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super LinkActivityResult, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public LinkConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof LinkConfirmationOption) {
            return (LinkConfirmationOption) confirmationOption;
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public LinkPaymentLauncher createLauncher(ActivityResultCaller activityResultCaller, Function1<? super LinkActivityResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        LinkPaymentLauncher linkPaymentLauncher = this.linkPaymentLauncher;
        linkPaymentLauncher.register(activityResultCaller, onResult);
        return linkPaymentLauncher;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(LinkPaymentLauncher launcher) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        launcher.unregister();
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public Object action(LinkConfirmationOption linkConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<Unit>> continuation) {
        return new ConfirmationDefinition.Action.Launch(Unit.INSTANCE, false, null);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(LinkPaymentLauncher launcher, Unit arguments, LinkConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        launcher.present(confirmationOption.getConfiguration(), this.linkAccountHolder.getLinkAccountInfo().getValue(), confirmationOption.getLinkLaunchMode(), confirmationOption.getLinkExpressMode());
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(LinkConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, LinkActivityResult result) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean z = result instanceof LinkActivityResult.Canceled;
        if (!z || ((LinkActivityResult.Canceled) result).getReason() != LinkActivityResult.Canceled.Reason.BackPressed) {
            this.linkStore.markLinkAsUsed();
        }
        if (result instanceof LinkActivityResult.PaymentMethodObtained) {
            return new ConfirmationDefinition.Result.NextStep(new PaymentMethodConfirmationOption.Saved(((LinkActivityResult.PaymentMethodObtained) result).getPaymentMethod(), null, true), confirmationParameters);
        }
        if (result instanceof LinkActivityResult.Failed) {
            LinkActivityResult.Failed failed = (LinkActivityResult.Failed) result;
            updateLinkAccount(failed.getLinkAccountUpdate());
            return new ConfirmationDefinition.Result.Failed(failed.getError(), ExceptionKtKt.stripeErrorMessage(failed.getError()), ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE);
        }
        if (z) {
            updateLinkAccount(((LinkActivityResult.Canceled) result).getLinkAccountUpdate());
            return new ConfirmationDefinition.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.InformCancellation);
        }
        if (!(result instanceof LinkActivityResult.Completed)) {
            throw new NoWhenBranchMatchedException();
        }
        updateLinkAccount(((LinkActivityResult.Completed) result).getLinkAccountUpdate());
        return new ConfirmationDefinition.Result.Succeeded(confirmationParameters.getIntent(), deferredIntentConfirmationType, false, 4, null);
    }

    private final void updateLinkAccount(LinkAccountUpdate linkAccountUpdate) {
        if (linkAccountUpdate instanceof LinkAccountUpdate.Value) {
            this.linkAccountHolder.set((LinkAccountUpdate.Value) linkAccountUpdate);
        } else if (!Intrinsics.areEqual(linkAccountUpdate, LinkAccountUpdate.None.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }
}
