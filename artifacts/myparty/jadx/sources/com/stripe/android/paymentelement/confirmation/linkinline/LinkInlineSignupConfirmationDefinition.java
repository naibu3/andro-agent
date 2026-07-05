package com.stripe.android.paymentelement.confirmation.linkinline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultCaller;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.link.LinkConfiguration;
import com.stripe.android.link.LinkConfigurationCoordinator;
import com.stripe.android.link.LinkPaymentDetails;
import com.stripe.android.link.account.LinkStore;
import com.stripe.android.link.analytics.LinkAnalyticsHelper;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.wallets.Wallet;
import com.stripe.android.paymentelement.confirmation.ConfirmationDefinition;
import com.stripe.android.paymentelement.confirmation.ConfirmationHandler;
import com.stripe.android.paymentelement.confirmation.PaymentMethodConfirmationOption;
import com.stripe.android.paymentelement.confirmation.intent.DeferredIntentConfirmationType;
import com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationOption;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: LinkInlineSignupConfirmationDefinition.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0003@ABB\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@¢\u0006\u0002\u0010\u0019J$\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J(\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u0005H\u0016J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0002H\u0082@¢\u0006\u0002\u0010+J\u001e\u0010,\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010-\u001a\u00020.H\u0082@¢\u0006\u0002\u0010/J\u001c\u00100\u001a\u000201*\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J&\u00107\u001a\u000208*\u0002092\u0006\u00105\u001a\u0002062\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=H\u0002J\f\u00107\u001a\u000208*\u00020\u0002H\u0002J\f\u0010>\u001a\u00020?*\u000206H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006C"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;", "linkConfigurationCoordinator", "Lcom/stripe/android/link/LinkConfigurationCoordinator;", "linkAnalyticsHelper", "Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;", "linkStore", "Lcom/stripe/android/link/account/LinkStore;", "<init>", "(Lcom/stripe/android/link/LinkConfigurationCoordinator;Lcom/stripe/android/link/analytics/LinkAnalyticsHelper;Lcom/stripe/android/link/account/LinkStore;)V", SDKConstants.PARAM_KEY, "", "getKey", "()Ljava/lang/String;", "option", "confirmationOption", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationHandler$Option;", "action", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Action;", "confirmationParameters", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;", "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Parameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLauncher", "activityResultCaller", "Landroidx/activity/result/ActivityResultCaller;", "onResult", "Lkotlin/Function1;", "", "launch", "launcher", "arguments", "toResult", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition$Result;", "deferredIntentConfirmationType", "Lcom/stripe/android/paymentelement/confirmation/intent/DeferredIntentConfirmationType;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "createPaymentMethodConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "linkInlineSignupConfirmationOption", "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOptionAfterAttachingToLink", "userInput", "Lcom/stripe/android/link/ui/inline/UserInput;", "(Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption;Lcom/stripe/android/link/ui/inline/UserInput;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSavedOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$Saved;", "Lcom/stripe/android/link/LinkPaymentDetails$Saved;", "createParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "saveOption", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationOption$PaymentMethodSaveOption;", "toNewOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption$New;", "Lcom/stripe/android/link/LinkPaymentDetails$New;", "configuration", "Lcom/stripe/android/link/LinkConfiguration;", "extraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "shouldSave", "", "Result", "LauncherArguments", "Launcher", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LinkInlineSignupConfirmationDefinition implements ConfirmationDefinition<LinkInlineSignupConfirmationOption, Launcher, LauncherArguments, Result> {
    public static final int $stable = 8;
    private final String key;
    private final LinkAnalyticsHelper linkAnalyticsHelper;
    private final LinkConfigurationCoordinator linkConfigurationCoordinator;
    private final LinkStore linkStore;

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            try {
                iArr[AccountStatus.Verified.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountStatus.VerificationStarted.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountStatus.NeedsVerification.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountStatus.SignedOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountStatus.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition", f = "LinkInlineSignupConfirmationDefinition.kt", i = {}, l = {45}, m = "action", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition$action$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkInlineSignupConfirmationDefinition.this.action((LinkInlineSignupConfirmationOption) null, (ConfirmationDefinition.Parameters) null, (Continuation<? super ConfirmationDefinition.Action<LauncherArguments>>) this);
        }
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition", f = "LinkInlineSignupConfirmationDefinition.kt", i = {0, 0, 0, 0, 0, 0}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "createOptionAfterAttachingToLink", n = {"this", "linkInlineSignupConfirmationOption", "createParams", "saveOption", "extraParams", "configuration"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition$createOptionAfterAttachingToLink$1, reason: invalid class name and case insensitive filesystem */
    static final class C10781 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C10781(Continuation<? super C10781> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkInlineSignupConfirmationDefinition.this.createOptionAfterAttachingToLink(null, null, this);
        }
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition", f = "LinkInlineSignupConfirmationDefinition.kt", i = {0, 0, 0, 0, 2, 2}, l = {88, 89, 98, 101}, m = "createPaymentMethodConfirmationOption", n = {"this", "linkInlineSignupConfirmationOption", "configuration", "userInput", "this", "linkInlineSignupConfirmationOption"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    /* renamed from: com.stripe.android.paymentelement.confirmation.linkinline.LinkInlineSignupConfirmationDefinition$createPaymentMethodConfirmationOption$1, reason: invalid class name and case insensitive filesystem */
    static final class C10791 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C10791(Continuation<? super C10791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkInlineSignupConfirmationDefinition.this.createPaymentMethodConfirmationOption(null, this);
        }
    }

    public LinkInlineSignupConfirmationDefinition(LinkConfigurationCoordinator linkConfigurationCoordinator, LinkAnalyticsHelper linkAnalyticsHelper, LinkStore linkStore) {
        Intrinsics.checkNotNullParameter(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        Intrinsics.checkNotNullParameter(linkAnalyticsHelper, "linkAnalyticsHelper");
        Intrinsics.checkNotNullParameter(linkStore, "linkStore");
        this.linkConfigurationCoordinator = linkConfigurationCoordinator;
        this.linkAnalyticsHelper = linkAnalyticsHelper;
        this.linkStore = linkStore;
        this.key = "LinkInlineSignup";
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public boolean canConfirm(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption, ConfirmationDefinition.Parameters parameters) {
        return ConfirmationDefinition.DefaultImpls.canConfirm(this, linkInlineSignupConfirmationOption, parameters);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public /* bridge */ /* synthetic */ Launcher createLauncher(ActivityResultCaller activityResultCaller, Function1 function1) {
        return createLauncher(activityResultCaller, (Function1<? super Result, Unit>) function1);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void unregister(Launcher launcher) {
        ConfirmationDefinition.DefaultImpls.unregister(this, launcher);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public String getKey() {
        return this.key;
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public LinkInlineSignupConfirmationOption option(ConfirmationHandler.Option confirmationOption) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof LinkInlineSignupConfirmationOption) {
            return (LinkInlineSignupConfirmationOption) confirmationOption;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object action(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption, ConfirmationDefinition.Parameters parameters, Continuation<? super ConfirmationDefinition.Action<LauncherArguments>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objCreatePaymentMethodConfirmationOption = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
            anonymousClass1.label = 1;
            objCreatePaymentMethodConfirmationOption = createPaymentMethodConfirmationOption(linkInlineSignupConfirmationOption, anonymousClass1);
            if (objCreatePaymentMethodConfirmationOption == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
        }
        return new ConfirmationDefinition.Action.Launch(new LauncherArguments((PaymentMethodConfirmationOption) objCreatePaymentMethodConfirmationOption), true, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public Launcher createLauncher(ActivityResultCaller activityResultCaller, Function1<? super Result, Unit> onResult) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        return new Launcher(onResult);
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public void launch(Launcher launcher, LauncherArguments arguments, LinkInlineSignupConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters) {
        Intrinsics.checkNotNullParameter(launcher, "launcher");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        launcher.getOnResult().invoke(new Result(arguments.getNextConfirmationOption()));
    }

    @Override // com.stripe.android.paymentelement.confirmation.ConfirmationDefinition
    public ConfirmationDefinition.Result toResult(LinkInlineSignupConfirmationOption confirmationOption, ConfirmationDefinition.Parameters confirmationParameters, DeferredIntentConfirmationType deferredIntentConfirmationType, Result result) {
        Intrinsics.checkNotNullParameter(confirmationOption, "confirmationOption");
        Intrinsics.checkNotNullParameter(confirmationParameters, "confirmationParameters");
        Intrinsics.checkNotNullParameter(result, "result");
        return new ConfirmationDefinition.Result.NextStep(result.getNextConfirmationOption(), confirmationParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d8, code lost:
    
        if (r14 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createPaymentMethodConfirmationOption(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption, Continuation<? super PaymentMethodConfirmationOption> continuation) {
        C10791 c10791;
        UserInput userInput;
        Object objFirst;
        LinkConfiguration linkConfiguration;
        LinkInlineSignupConfirmationDefinition linkInlineSignupConfirmationDefinition;
        Object objMo7681signInWithUserInput0E7RQCE;
        if (continuation instanceof C10791) {
            c10791 = (C10791) continuation;
            if ((c10791.label & Integer.MIN_VALUE) != 0) {
                c10791.label -= Integer.MIN_VALUE;
            } else {
                c10791 = new C10791(continuation);
            }
        }
        Object objCreatePaymentMethodConfirmationOption = c10791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10791.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
            LinkConfiguration linkConfiguration2 = linkInlineSignupConfirmationOption.getLinkConfiguration();
            userInput = linkInlineSignupConfirmationOption.getUserInput();
            Flow<AccountStatus> accountStatusFlow = this.linkConfigurationCoordinator.getAccountStatusFlow(linkConfiguration2);
            c10791.L$0 = this;
            c10791.L$1 = linkInlineSignupConfirmationOption;
            c10791.L$2 = linkConfiguration2;
            c10791.L$3 = userInput;
            c10791.label = 1;
            objFirst = FlowKt.first(accountStatusFlow, c10791);
            if (objFirst != coroutine_suspended) {
                linkConfiguration = linkConfiguration2;
                linkInlineSignupConfirmationDefinition = this;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            UserInput userInput2 = (UserInput) c10791.L$3;
            LinkConfiguration linkConfiguration3 = (LinkConfiguration) c10791.L$2;
            LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption2 = (LinkInlineSignupConfirmationOption) c10791.L$1;
            LinkInlineSignupConfirmationDefinition linkInlineSignupConfirmationDefinition2 = (LinkInlineSignupConfirmationDefinition) c10791.L$0;
            ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
            userInput = userInput2;
            linkInlineSignupConfirmationOption = linkInlineSignupConfirmationOption2;
            objFirst = objCreatePaymentMethodConfirmationOption;
            linkConfiguration = linkConfiguration3;
            linkInlineSignupConfirmationDefinition = linkInlineSignupConfirmationDefinition2;
        } else {
            if (i == 2) {
                ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
                return objCreatePaymentMethodConfirmationOption;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
                return (PaymentMethodConfirmationOption) objCreatePaymentMethodConfirmationOption;
            }
            linkInlineSignupConfirmationOption = (LinkInlineSignupConfirmationOption) c10791.L$1;
            linkInlineSignupConfirmationDefinition = (LinkInlineSignupConfirmationDefinition) c10791.L$0;
            ResultKt.throwOnFailure(objCreatePaymentMethodConfirmationOption);
            objMo7681signInWithUserInput0E7RQCE = ((kotlin.Result) objCreatePaymentMethodConfirmationOption).getValue();
            if (kotlin.Result.m9121exceptionOrNullimpl(objMo7681signInWithUserInput0E7RQCE) != null) {
                ((Boolean) objMo7681signInWithUserInput0E7RQCE).booleanValue();
                c10791.L$0 = null;
                c10791.L$1 = null;
                c10791.label = 4;
                objCreatePaymentMethodConfirmationOption = linkInlineSignupConfirmationDefinition.createPaymentMethodConfirmationOption(linkInlineSignupConfirmationOption, c10791);
            } else {
                return linkInlineSignupConfirmationDefinition.toNewOption(linkInlineSignupConfirmationOption);
            }
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[((AccountStatus) objFirst).ordinal()];
        if (i2 == 1) {
            c10791.L$0 = null;
            c10791.L$1 = null;
            c10791.L$2 = null;
            c10791.L$3 = null;
            c10791.label = 2;
            Object objCreateOptionAfterAttachingToLink = linkInlineSignupConfirmationDefinition.createOptionAfterAttachingToLink(linkInlineSignupConfirmationOption, userInput, c10791);
            if (objCreateOptionAfterAttachingToLink != coroutine_suspended) {
                return objCreateOptionAfterAttachingToLink;
            }
        } else {
            if (i2 == 2 || i2 == 3) {
                linkInlineSignupConfirmationDefinition.linkAnalyticsHelper.onLinkPopupSkipped();
                return linkInlineSignupConfirmationDefinition.toNewOption(linkInlineSignupConfirmationOption);
            }
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            LinkConfigurationCoordinator linkConfigurationCoordinator = linkInlineSignupConfirmationDefinition.linkConfigurationCoordinator;
            c10791.L$0 = linkInlineSignupConfirmationDefinition;
            c10791.L$1 = linkInlineSignupConfirmationOption;
            c10791.L$2 = null;
            c10791.L$3 = null;
            c10791.label = 3;
            objMo7681signInWithUserInput0E7RQCE = linkConfigurationCoordinator.mo7681signInWithUserInput0E7RQCE(linkConfiguration, userInput, c10791);
            if (objMo7681signInWithUserInput0E7RQCE != coroutine_suspended) {
                if (kotlin.Result.m9121exceptionOrNullimpl(objMo7681signInWithUserInput0E7RQCE) != null) {
                }
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createOptionAfterAttachingToLink(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption, UserInput userInput, Continuation<? super PaymentMethodConfirmationOption> continuation) {
        C10781 c10781;
        PaymentMethodCreateParams createParams;
        LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption2;
        LinkInlineSignupConfirmationOption.PaymentMethodSaveOption paymentMethodSaveOption;
        PaymentMethodExtraParams paymentMethodExtraParams;
        Object value;
        LinkConfiguration linkConfiguration;
        LinkInlineSignupConfirmationDefinition linkInlineSignupConfirmationDefinition;
        if (continuation instanceof C10781) {
            c10781 = (C10781) continuation;
            if ((c10781.label & Integer.MIN_VALUE) != 0) {
                c10781.label -= Integer.MIN_VALUE;
            } else {
                c10781 = new C10781(continuation);
            }
        }
        Object obj = c10781.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c10781.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (userInput instanceof UserInput.SignIn) {
                this.linkAnalyticsHelper.onLinkPopupSkipped();
                return toNewOption(linkInlineSignupConfirmationOption);
            }
            createParams = linkInlineSignupConfirmationOption.getCreateParams();
            LinkInlineSignupConfirmationOption.PaymentMethodSaveOption saveOption = linkInlineSignupConfirmationOption.getSaveOption();
            PaymentMethodExtraParams extraParams = linkInlineSignupConfirmationOption.getExtraParams();
            LinkConfiguration linkConfiguration2 = linkInlineSignupConfirmationOption.getLinkConfiguration();
            LinkConfigurationCoordinator linkConfigurationCoordinator = this.linkConfigurationCoordinator;
            c10781.L$0 = this;
            c10781.L$1 = linkInlineSignupConfirmationOption;
            c10781.L$2 = createParams;
            c10781.L$3 = saveOption;
            c10781.L$4 = extraParams;
            c10781.L$5 = linkConfiguration2;
            c10781.label = 1;
            Object objMo7679attachNewCardToAccount0E7RQCE = linkConfigurationCoordinator.mo7679attachNewCardToAccount0E7RQCE(linkConfiguration2, createParams, c10781);
            if (objMo7679attachNewCardToAccount0E7RQCE == coroutine_suspended) {
                return coroutine_suspended;
            }
            linkInlineSignupConfirmationOption2 = linkInlineSignupConfirmationOption;
            paymentMethodSaveOption = saveOption;
            paymentMethodExtraParams = extraParams;
            value = objMo7679attachNewCardToAccount0E7RQCE;
            linkConfiguration = linkConfiguration2;
            linkInlineSignupConfirmationDefinition = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkConfiguration = (LinkConfiguration) c10781.L$5;
            paymentMethodExtraParams = (PaymentMethodExtraParams) c10781.L$4;
            paymentMethodSaveOption = (LinkInlineSignupConfirmationOption.PaymentMethodSaveOption) c10781.L$3;
            createParams = (PaymentMethodCreateParams) c10781.L$2;
            linkInlineSignupConfirmationOption2 = (LinkInlineSignupConfirmationOption) c10781.L$1;
            linkInlineSignupConfirmationDefinition = (LinkInlineSignupConfirmationDefinition) c10781.L$0;
            ResultKt.throwOnFailure(obj);
            value = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m9124isFailureimpl(value)) {
            value = null;
        }
        LinkPaymentDetails linkPaymentDetails = (LinkPaymentDetails) value;
        if (linkPaymentDetails instanceof LinkPaymentDetails.New) {
            linkInlineSignupConfirmationDefinition.linkStore.markLinkAsUsed();
            return linkInlineSignupConfirmationDefinition.toNewOption((LinkPaymentDetails.New) linkPaymentDetails, paymentMethodSaveOption, linkConfiguration, paymentMethodExtraParams);
        }
        if (linkPaymentDetails instanceof LinkPaymentDetails.Saved) {
            linkInlineSignupConfirmationDefinition.linkStore.markLinkAsUsed();
            return linkInlineSignupConfirmationDefinition.toSavedOption((LinkPaymentDetails.Saved) linkPaymentDetails, createParams, paymentMethodSaveOption);
        }
        if (linkPaymentDetails != null) {
            throw new NoWhenBranchMatchedException();
        }
        return linkInlineSignupConfirmationDefinition.toNewOption(linkInlineSignupConfirmationOption2);
    }

    private final PaymentMethodConfirmationOption.Saved toSavedOption(LinkPaymentDetails.Saved saved, PaymentMethodCreateParams paymentMethodCreateParams, LinkInlineSignupConfirmationOption.PaymentMethodSaveOption paymentMethodSaveOption) {
        String last4 = saved.getPaymentDetails().getLast4();
        PaymentMethod paymentMethodBuild = new PaymentMethod.Builder().setId(saved.getPaymentDetails().getPaymentMethodId()).setCode(paymentMethodCreateParams.getTypeCode()).setCard(new PaymentMethod.Card(null, null, null, null, null, null, null, last4, null, new Wallet.LinkWallet(last4), null, null, 3455, null)).setType(PaymentMethod.Type.Card).build();
        ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
        if (!shouldSave(paymentMethodSaveOption)) {
            setupFutureUsage = null;
        }
        if (setupFutureUsage == null) {
            setupFutureUsage = ConfirmPaymentIntentParams.SetupFutureUsage.Blank;
        }
        return new PaymentMethodConfirmationOption.Saved(paymentMethodBuild, new PaymentMethodOptionsParams.Card(null, null, setupFutureUsage, 3, null), true);
    }

    private final PaymentMethodConfirmationOption.New toNewOption(LinkPaymentDetails.New r10, LinkInlineSignupConfirmationOption.PaymentMethodSaveOption paymentMethodSaveOption, LinkConfiguration linkConfiguration, PaymentMethodExtraParams paymentMethodExtraParams) {
        PaymentMethodOptionsParams.Link link;
        if (linkConfiguration.getPassthroughModeEnabled()) {
            link = new PaymentMethodOptionsParams.Card(null, null, paymentMethodSaveOption.getSetupFutureUsage(), 3, null);
        } else {
            link = new PaymentMethodOptionsParams.Link(paymentMethodSaveOption.getSetupFutureUsage());
        }
        return new PaymentMethodConfirmationOption.New(r10.getPaymentMethodCreateParams(), link, paymentMethodExtraParams, shouldSave(paymentMethodSaveOption), null, 16, null);
    }

    private final PaymentMethodConfirmationOption.New toNewOption(LinkInlineSignupConfirmationOption linkInlineSignupConfirmationOption) {
        return new PaymentMethodConfirmationOption.New(linkInlineSignupConfirmationOption.getCreateParams(), linkInlineSignupConfirmationOption.getOptionsParams(), linkInlineSignupConfirmationOption.getExtraParams(), shouldSave(linkInlineSignupConfirmationOption.getSaveOption()), null, 16, null);
    }

    private final boolean shouldSave(LinkInlineSignupConfirmationOption.PaymentMethodSaveOption paymentMethodSaveOption) {
        return paymentMethodSaveOption == LinkInlineSignupConfirmationOption.PaymentMethodSaveOption.RequestedReuse;
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;", "Landroid/os/Parcelable;", "nextConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;)V", "getNextConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        private final PaymentMethodConfirmationOption nextConfirmationOption;

        /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Result((PaymentMethodConfirmationOption) parcel.readParcelable(Result.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentMethodConfirmationOption paymentMethodConfirmationOption, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethodConfirmationOption = result.nextConfirmationOption;
            }
            return result.copy(paymentMethodConfirmationOption);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethodConfirmationOption getNextConfirmationOption() {
            return this.nextConfirmationOption;
        }

        public final Result copy(PaymentMethodConfirmationOption nextConfirmationOption) {
            Intrinsics.checkNotNullParameter(nextConfirmationOption, "nextConfirmationOption");
            return new Result(nextConfirmationOption);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && Intrinsics.areEqual(this.nextConfirmationOption, ((Result) other).nextConfirmationOption);
        }

        public int hashCode() {
            return this.nextConfirmationOption.hashCode();
        }

        public String toString() {
            return "Result(nextConfirmationOption=" + this.nextConfirmationOption + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.nextConfirmationOption, flags);
        }

        public Result(PaymentMethodConfirmationOption nextConfirmationOption) {
            Intrinsics.checkNotNullParameter(nextConfirmationOption, "nextConfirmationOption");
            this.nextConfirmationOption = nextConfirmationOption;
        }

        public final PaymentMethodConfirmationOption getNextConfirmationOption() {
            return this.nextConfirmationOption;
        }
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$LauncherArguments;", "", "nextConfirmationOption", "Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "<init>", "(Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;)V", "getNextConfirmationOption", "()Lcom/stripe/android/paymentelement/confirmation/PaymentMethodConfirmationOption;", "component1", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LauncherArguments {
        public static final int $stable = 8;
        private final PaymentMethodConfirmationOption nextConfirmationOption;

        public static /* synthetic */ LauncherArguments copy$default(LauncherArguments launcherArguments, PaymentMethodConfirmationOption paymentMethodConfirmationOption, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethodConfirmationOption = launcherArguments.nextConfirmationOption;
            }
            return launcherArguments.copy(paymentMethodConfirmationOption);
        }

        /* renamed from: component1, reason: from getter */
        public final PaymentMethodConfirmationOption getNextConfirmationOption() {
            return this.nextConfirmationOption;
        }

        public final LauncherArguments copy(PaymentMethodConfirmationOption nextConfirmationOption) {
            Intrinsics.checkNotNullParameter(nextConfirmationOption, "nextConfirmationOption");
            return new LauncherArguments(nextConfirmationOption);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LauncherArguments) && Intrinsics.areEqual(this.nextConfirmationOption, ((LauncherArguments) other).nextConfirmationOption);
        }

        public int hashCode() {
            return this.nextConfirmationOption.hashCode();
        }

        public String toString() {
            return "LauncherArguments(nextConfirmationOption=" + this.nextConfirmationOption + ")";
        }

        public LauncherArguments(PaymentMethodConfirmationOption nextConfirmationOption) {
            Intrinsics.checkNotNullParameter(nextConfirmationOption, "nextConfirmationOption");
            this.nextConfirmationOption = nextConfirmationOption;
        }

        public final PaymentMethodConfirmationOption getNextConfirmationOption() {
            return this.nextConfirmationOption;
        }
    }

    /* compiled from: LinkInlineSignupConfirmationDefinition.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Launcher;", "", "onResult", "Lkotlin/Function1;", "Lcom/stripe/android/paymentelement/confirmation/linkinline/LinkInlineSignupConfirmationDefinition$Result;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "getOnResult", "()Lkotlin/jvm/functions/Function1;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Launcher {
        public static final int $stable = 0;
        private final Function1<Result, Unit> onResult;

        /* JADX WARN: Multi-variable type inference failed */
        public Launcher(Function1<? super Result, Unit> onResult) {
            Intrinsics.checkNotNullParameter(onResult, "onResult");
            this.onResult = onResult;
        }

        public final Function1<Result, Unit> getOnResult() {
            return this.onResult;
        }
    }
}
