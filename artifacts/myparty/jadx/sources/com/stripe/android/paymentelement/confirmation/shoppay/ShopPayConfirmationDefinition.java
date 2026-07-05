package com.stripe.android.paymentelement.confirmation.shoppay;

import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.shoppay.ShopPayActivityContract;
import com.stripe.android.shoppay.ShopPayActivityResult;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShopPayConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J*\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0006H\u0016J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u001dH\u0016J3\u0010\u001e\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010!J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@¢\u0006\u0002\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/shoppay/ShopPayActivityContract$Args;", "", "Lcom/stripe/android/shoppay/ShopPayActivityResult;", "shopPayActivityContract", "Lcom/stripe/android/shoppay/ShopPayActivityContract;", "<init>", "(Lcom/stripe/android/shoppay/ShopPayActivityContract;)V", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "launch", "launcher", "arguments", "(Landroidx/activity/result/ActivityResultLauncher;Lkotlin/Unit;Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;)V", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "(Lcom/stripe/android/paymentelement/confirmation/shoppay/ShopPayConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ShopPayConfirmationDefinition implements ConfirmationDefinition<ShopPayConfirmationOption, ActivityResultLauncher<ShopPayActivityContract.Args>, Unit, ShopPayActivityResult> {
    public static final int $stable = 0;
    private final String key;
    private final ShopPayActivityContract shopPayActivityContract;

    @Inject
    public ShopPayConfirmationDefinition(ShopPayActivityContract shopPayActivityContract) {
        Intrinsics.checkNotNullParameter(shopPayActivityContract, "shopPayActivityContract");
        this.shopPayActivityContract = shopPayActivityContract;
        this.key = "ShopPay";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(ShopPayConfirmationOption shopPayConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, shopPayConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ ActivityResultLauncher<ShopPayActivityContract.Args> createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super ShopPayActivityResult, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(ActivityResultLauncher<ShopPayActivityContract.Args> activityResultLauncher) {
        ConfirmationDefinition.DefaultImpls.unregister(this, activityResultLauncher);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ShopPayConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof ShopPayConfirmationOption) {
            return (ShopPayConfirmationOption) confirmationOption;
        }
        return null;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(ShopPayConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, ShopPayActivityResult result) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.areEqual(result, ShopPayActivityResult.Canceled.INSTANCE)) {
            return new ConfirmationDefinition.Result.Canceled(ConfirmationHandler.Result.Canceled.Action.None);
        }
        if (result instanceof ShopPayActivityResult.Completed) {
            return new ConfirmationDefinition.Result.Succeeded(confirmationParameters.getIntent(), deferredIntentConfirmationType, false);
        }
        if (!(result instanceof ShopPayActivityResult.Failed)) {
            throw new NoWhenBranchMatchedException();
        }
        ShopPayActivityResult.Failed failed = (ShopPayActivityResult.Failed) result;
        Throwable error = failed.getError();
        String message = failed.getError().getMessage();
        if (message == null) {
            message = "";
        }
        return new ConfirmationDefinition.Result.Failed(error, ResolvableStringUtilsKt.getResolvableString(message), ConfirmationHandler.Result.Failed.ErrorType.Payment.INSTANCE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ActivityResultLauncher<ShopPayActivityContract.Args> createLauncher(ActivityResultCaller activityResultCaller, Function1<? super ShopPayActivityResult, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        return activityResultCaller.registerForActivityResult(this.shopPayActivityContract, new ShopPayConfirmationDefinition$sam$androidx_activity_result_ActivityResultCallback$0(onResult));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(ActivityResultLauncher<ShopPayActivityContract.Args> launcher, Unit arguments, ShopPayConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        launcher.launch(new ShopPayActivityContract.Args(confirmationOption.getShopPayConfiguration(), confirmationOption.getCustomerSessionClientSecret(), confirmationOption.getBusinessName()));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public Object action(ShopPayConfirmationOption shopPayConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<Unit>> continuation) {
        return new ConfirmationDefinition.Action.Launch(Unit.INSTANCE, false, null);
    }
}
