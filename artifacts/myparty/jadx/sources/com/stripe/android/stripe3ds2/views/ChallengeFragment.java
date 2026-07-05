package com.stripe.android.stripe3ds2.views;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeFragmentBinding;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ChallengeAction;
import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeResult;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transaction.IntentData;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import com.stripe.android.stripe3ds2.utils.AnalyticsDelegate;
import com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* compiled from: ChallengeFragment.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u0000 l2\u00020\u0001:\u0001lBS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J\b\u0010W\u001a\u00020RH\u0016J\b\u0010X\u001a\u00020RH\u0016J\b\u0010Y\u001a\u00020RH\u0016J \u0010Z\u001a\u00020R2\u0006\u00107\u001a\u0002082\u0006\u0010<\u001a\u00020=2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010[\u001a\u00020RH\u0002J\b\u0010\\\u001a\u00020RH\u0002J\b\u0010]\u001a\u00020RH\u0002J\u0006\u0010^\u001a\u00020RJ\u0010\u0010_\u001a\u00020R2\u0006\u0010`\u001a\u00020aH\u0002J\u0018\u0010b\u001a\u00020R2\u0006\u0010c\u001a\u00020d2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010e\u001a\u00020R2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010h\u001a\u00020R2\u0006\u0010f\u001a\u00020gH\u0002J\u0010\u0010e\u001a\u00020R2\u0006\u0010i\u001a\u00020jH\u0002J\u0006\u0010k\u001a\u00020RR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u001f8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010&R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020)8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001b\u0010-\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\u001d\u001a\u0004\b/\u00100R\u001b\u00102\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b4\u00105R\u001b\u00107\u001a\u0002088FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u001d\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u001d\u001a\u0004\b>\u0010?R\u001b\u0010A\u001a\u00020B8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010\u001d\u001a\u0004\bC\u0010DR\u001b\u0010F\u001a\u00020G8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010\u001d\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00198AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001bR\u0014\u0010M\u001a\u00020N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006m"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeFragment;", "Landroidx/fragment/app/Fragment;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;", "analyticsDelegate", "Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;", "transactionTimer", "Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "errorRequestExecutor", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "challengeActionHandler", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;", "initialUiType", "Lcom/stripe/android/stripe3ds2/transactions/UiType;", "intentData", "Lcom/stripe/android/stripe3ds2/transaction/IntentData;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/ui/StripeUiCustomization;Lcom/stripe/android/stripe3ds2/utils/AnalyticsDelegate;Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler;Lcom/stripe/android/stripe3ds2/transactions/UiType;Lcom/stripe/android/stripe3ds2/transaction/IntentData;Lkotlin/coroutines/CoroutineContext;)V", "cresData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "uiTypeCode", "", "getUiTypeCode", "()Ljava/lang/String;", "uiTypeCode$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "getViewModel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ChallengeActivityViewModel;", "viewModel$delegate", "challengeEntryViewFactory", "Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "getChallengeEntryViewFactory", "()Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "challengeEntryViewFactory$delegate", "_viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "viewBinding", "getViewBinding$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/databinding/StripeChallengeFragmentBinding;", "challengeZoneView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "getChallengeZoneView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "challengeZoneView$delegate", "brandZoneView", "Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "getBrandZoneView", "()Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "brandZoneView$delegate", "challengeZoneTextView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "getChallengeZoneTextView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "challengeZoneTextView$delegate", "challengeZoneSelectView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "getChallengeZoneSelectView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeZoneSelectView$delegate", "challengeZoneWebView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "getChallengeZoneWebView", "()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "challengeZoneWebView$delegate", "informationZoneView", "Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "getInformationZoneView", "()Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "informationZoneView$delegate", "userEntry", "getUserEntry$3ds2sdk_release", "challengeAction", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "getChallengeAction", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeAction;", "onViewCreated", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "onDestroyView", "configure", "updateBrandZoneImages", "configureInformationZoneView", "configureChallengeZoneView", "refreshUi", "onChallengeRequestResult", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "onSuccess", "creqData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "onError", "data", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "onTimeout", "throwable", "", "clickSubmitButton", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChallengeFragment extends Fragment {
    public static final String ARG_CRES = "arg_cres";
    private StripeChallengeFragmentBinding _viewBinding;
    private final AnalyticsDelegate analyticsDelegate;

    /* renamed from: brandZoneView$delegate, reason: from kotlin metadata */
    private final Lazy brandZoneView;
    private final ChallengeActionHandler challengeActionHandler;

    /* renamed from: challengeEntryViewFactory$delegate, reason: from kotlin metadata */
    private final Lazy challengeEntryViewFactory;

    /* renamed from: challengeZoneSelectView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneSelectView;

    /* renamed from: challengeZoneTextView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneTextView;

    /* renamed from: challengeZoneView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneView;

    /* renamed from: challengeZoneWebView$delegate, reason: from kotlin metadata */
    private final Lazy challengeZoneWebView;
    private ChallengeResponseData cresData;
    private final ErrorReporter errorReporter;
    private final ErrorRequestExecutor errorRequestExecutor;

    /* renamed from: informationZoneView$delegate, reason: from kotlin metadata */
    private final Lazy informationZoneView;
    private final UiType initialUiType;
    private final IntentData intentData;
    private final TransactionTimer transactionTimer;
    private final StripeUiCustomization uiCustomization;

    /* renamed from: uiTypeCode$delegate, reason: from kotlin metadata */
    private final Lazy uiTypeCode;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final Lazy viewModel;
    private final CoroutineContext workContext;

    /* compiled from: ChallengeFragment.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UiType.values().length];
            try {
                iArr[UiType.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UiType.SingleSelect.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UiType.MultiSelect.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UiType.Html.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UiType.OutOfBand.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeFragment(StripeUiCustomization uiCustomization, AnalyticsDelegate analyticsDelegate, TransactionTimer transactionTimer, ErrorRequestExecutor errorRequestExecutor, ErrorReporter errorReporter, ChallengeActionHandler challengeActionHandler, UiType uiType, IntentData intentData, CoroutineContext workContext) {
        super(R.layout.stripe_challenge_fragment);
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        Intrinsics.checkNotNullParameter(transactionTimer, "transactionTimer");
        Intrinsics.checkNotNullParameter(errorRequestExecutor, "errorRequestExecutor");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(challengeActionHandler, "challengeActionHandler");
        Intrinsics.checkNotNullParameter(intentData, "intentData");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.uiCustomization = uiCustomization;
        this.analyticsDelegate = analyticsDelegate;
        this.transactionTimer = transactionTimer;
        this.errorRequestExecutor = errorRequestExecutor;
        this.errorReporter = errorReporter;
        this.challengeActionHandler = challengeActionHandler;
        this.initialUiType = uiType;
        this.intentData = intentData;
        this.workContext = workContext;
        this.uiTypeCode = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.uiTypeCode_delegate$lambda$0(this.f$0);
            }
        });
        final ChallengeFragment challengeFragment = this;
        final Function0 function0 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(challengeFragment, Reflection.getOrCreateKotlinClass(ChallengeActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return challengeFragment.requireActivity().getStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? challengeFragment.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.viewModel_delegate$lambda$1(this.f$0);
            }
        });
        this.challengeEntryViewFactory = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.challengeEntryViewFactory_delegate$lambda$2(this.f$0);
            }
        });
        this.challengeZoneView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.challengeZoneView_delegate$lambda$3(this.f$0);
            }
        });
        this.brandZoneView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.brandZoneView_delegate$lambda$4(this.f$0);
            }
        });
        this.challengeZoneTextView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.challengeZoneTextView_delegate$lambda$5(this.f$0);
            }
        });
        this.challengeZoneSelectView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.challengeZoneSelectView_delegate$lambda$6(this.f$0);
            }
        });
        this.challengeZoneWebView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.challengeZoneWebView_delegate$lambda$7(this.f$0);
            }
        });
        this.informationZoneView = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ChallengeFragment.informationZoneView_delegate$lambda$8(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String uiTypeCode_delegate$lambda$0(ChallengeFragment challengeFragment) {
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        String code = uiType != null ? uiType.getCode() : null;
        return code == null ? "" : code;
    }

    public final String getUiTypeCode() {
        return (String) this.uiTypeCode.getValue();
    }

    public final ChallengeActivityViewModel getViewModel$3ds2sdk_release() {
        return (ChallengeActivityViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory viewModel_delegate$lambda$1(ChallengeFragment challengeFragment) {
        return new ChallengeActivityViewModel.Factory(challengeFragment.challengeActionHandler, challengeFragment.transactionTimer, challengeFragment.errorReporter, challengeFragment.workContext);
    }

    private final ChallengeEntryViewFactory getChallengeEntryViewFactory() {
        return (ChallengeEntryViewFactory) this.challengeEntryViewFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeEntryViewFactory challengeEntryViewFactory_delegate$lambda$2(ChallengeFragment challengeFragment) {
        FragmentActivity fragmentActivityRequireActivity = challengeFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new ChallengeEntryViewFactory(fragmentActivityRequireActivity);
    }

    public final StripeChallengeFragmentBinding getViewBinding$3ds2sdk_release() {
        StripeChallengeFragmentBinding stripeChallengeFragmentBinding = this._viewBinding;
        if (stripeChallengeFragmentBinding != null) {
            return stripeChallengeFragmentBinding;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeZoneView challengeZoneView_delegate$lambda$3(ChallengeFragment challengeFragment) {
        ChallengeZoneView caChallengeZone = challengeFragment.getViewBinding$3ds2sdk_release().caChallengeZone;
        Intrinsics.checkNotNullExpressionValue(caChallengeZone, "caChallengeZone");
        return caChallengeZone;
    }

    public final ChallengeZoneView getChallengeZoneView() {
        return (ChallengeZoneView) this.challengeZoneView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BrandZoneView brandZoneView_delegate$lambda$4(ChallengeFragment challengeFragment) {
        BrandZoneView caBrandZone = challengeFragment.getViewBinding$3ds2sdk_release().caBrandZone;
        Intrinsics.checkNotNullExpressionValue(caBrandZone, "caBrandZone");
        return caBrandZone;
    }

    private final BrandZoneView getBrandZoneView() {
        return (BrandZoneView) this.brandZoneView.getValue();
    }

    public final ChallengeZoneTextView getChallengeZoneTextView() {
        return (ChallengeZoneTextView) this.challengeZoneTextView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeZoneTextView challengeZoneTextView_delegate$lambda$5(ChallengeFragment challengeFragment) {
        ChallengeEntryViewFactory challengeEntryViewFactory = challengeFragment.getChallengeEntryViewFactory();
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        return challengeEntryViewFactory.createChallengeEntryTextView(challengeResponseData, challengeFragment.uiCustomization);
    }

    public final ChallengeZoneSelectView getChallengeZoneSelectView() {
        return (ChallengeZoneSelectView) this.challengeZoneSelectView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeZoneSelectView challengeZoneSelectView_delegate$lambda$6(ChallengeFragment challengeFragment) {
        ChallengeEntryViewFactory challengeEntryViewFactory = challengeFragment.getChallengeEntryViewFactory();
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        return challengeEntryViewFactory.createChallengeEntrySelectView(challengeResponseData, challengeFragment.uiCustomization);
    }

    public final ChallengeZoneWebView getChallengeZoneWebView() {
        return (ChallengeZoneWebView) this.challengeZoneWebView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChallengeZoneWebView challengeZoneWebView_delegate$lambda$7(ChallengeFragment challengeFragment) {
        ChallengeEntryViewFactory challengeEntryViewFactory = challengeFragment.getChallengeEntryViewFactory();
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        return challengeEntryViewFactory.createChallengeEntryWebView(challengeResponseData);
    }

    public final InformationZoneView getInformationZoneView() {
        return (InformationZoneView) this.informationZoneView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InformationZoneView informationZoneView_delegate$lambda$8(ChallengeFragment challengeFragment) {
        InformationZoneView caInformationZone = challengeFragment.getViewBinding$3ds2sdk_release().caInformationZone;
        Intrinsics.checkNotNullExpressionValue(caInformationZone, "caInformationZone");
        return caInformationZone;
    }

    public final String getUserEntry$3ds2sdk_release() {
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 1) {
            return getChallengeZoneTextView().getUserEntry();
        }
        if (i == 2 || i == 3) {
            return getChallengeZoneSelectView().getUserEntry();
        }
        if (i == 4) {
            return getChallengeZoneWebView().getUserEntry();
        }
        return "";
    }

    private final ChallengeAction getChallengeAction() {
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        String whitelistingInfoText = challengeResponseData.getWhitelistingInfoText();
        Boolean boolValueOf = (whitelistingInfoText == null || whitelistingInfoText.length() == 0) ? null : Boolean.valueOf(getChallengeZoneView().getWhitelistingSelection$3ds2sdk_release());
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        UiType uiType = challengeResponseData2.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 4) {
            return new ChallengeAction.HtmlForm(getUserEntry$3ds2sdk_release());
        }
        if (i == 5) {
            return new ChallengeAction.Oob(boolValueOf);
        }
        return new ChallengeAction.NativeForm(getUserEntry$3ds2sdk_release(), boolValueOf);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        ChallengeResponseData challengeResponseData = null;
        ChallengeResponseData challengeResponseData2 = arguments != null ? (ChallengeResponseData) BundleCompat.getParcelable(arguments, ARG_CRES, ChallengeResponseData.class) : null;
        if (challengeResponseData2 == null) {
            onError(new IllegalArgumentException("Could not start challenge screen. Challenge response data was null."));
            return;
        }
        this.cresData = challengeResponseData2;
        AnalyticsDelegate analyticsDelegate = this.analyticsDelegate;
        if (analyticsDelegate != null) {
            if (challengeResponseData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData = challengeResponseData2;
            }
            analyticsDelegate.didReceiveChallengeResponseWithTransactionId(challengeResponseData.getServerTransId(), getUiTypeCode());
        }
        this._viewBinding = StripeChallengeFragmentBinding.bind(view);
        getViewModel$3ds2sdk_release().getChallengeText().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeFragment.onViewCreated$lambda$10(this.f$0, (String) obj);
            }
        }));
        getViewModel$3ds2sdk_release().getRefreshUi().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeFragment.onViewCreated$lambda$11(this.f$0, (Unit) obj);
            }
        }));
        getViewModel$3ds2sdk_release().getChallengeRequestResult().observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChallengeFragment.onViewCreated$lambda$12(this.f$0, (ChallengeRequestResult) obj);
            }
        }));
        updateBrandZoneImages();
        configure(getChallengeZoneTextView(), getChallengeZoneSelectView(), getChallengeZoneWebView());
        configureInformationZoneView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$10(ChallengeFragment challengeFragment, String str) {
        ChallengeZoneTextView challengeZoneTextView = challengeFragment.getChallengeZoneTextView();
        Intrinsics.checkNotNull(str);
        challengeZoneTextView.setText(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(ChallengeFragment challengeFragment, Unit unit) {
        challengeFragment.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(ChallengeFragment challengeFragment, ChallengeRequestResult challengeRequestResult) {
        if (challengeRequestResult != null) {
            challengeFragment.onChallengeRequestResult(challengeRequestResult);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        AnalyticsDelegate analyticsDelegate;
        super.onResume();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            ChallengeResponseData challengeResponseData2 = null;
            if (challengeResponseData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData = null;
            }
            if (challengeResponseData.getUiType() != UiType.OutOfBand || (analyticsDelegate = this.analyticsDelegate) == null) {
                return;
            }
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData3;
            }
            analyticsDelegate.oobFlowDidResume(challengeResponseData2.getServerTransId());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        AnalyticsDelegate analyticsDelegate;
        super.onPause();
        ChallengeResponseData challengeResponseData = this.cresData;
        if (challengeResponseData != null) {
            ChallengeResponseData challengeResponseData2 = null;
            if (challengeResponseData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData = null;
            }
            if (challengeResponseData.getUiType() != UiType.OutOfBand || (analyticsDelegate = this.analyticsDelegate) == null) {
                return;
            }
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData3;
            }
            analyticsDelegate.oobFlowDidPause(challengeResponseData2.getServerTransId());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._viewBinding = null;
    }

    private final void configure(ChallengeZoneTextView challengeZoneTextView, ChallengeZoneSelectView challengeZoneSelectView, ChallengeZoneWebView challengeZoneWebView) {
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i == 1) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneTextView);
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData3 = null;
            }
            challengeZoneView.setSubmitButton(challengeResponseData3.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SUBMIT));
            ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData4 = this.cresData;
            if (challengeResponseData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData4;
            }
            challengeZoneView2.setResendButtonLabel(challengeResponseData2.getResendInformationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.RESEND));
        } else if (i == 2 || i == 3) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneSelectView);
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData5;
            }
            challengeZoneView3.setSubmitButton(challengeResponseData2.getSubmitAuthenticationLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.NEXT));
        } else if (i == 4) {
            getChallengeZoneView().setChallengeEntryView(challengeZoneWebView);
            getChallengeZoneView().setInfoHeaderText(null, null);
            getChallengeZoneView().setInfoText(null, null);
            getChallengeZoneView().setSubmitButton(null, null);
            challengeZoneWebView.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ChallengeFragment.configure$lambda$13(this.f$0, view);
                }
            });
            getBrandZoneView().setVisibility(8);
        } else if (i == 5) {
            ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData6;
            }
            challengeZoneView4.setSubmitButton(challengeResponseData2.getOobContinueLabel(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.CONTINUE));
        }
        configureChallengeZoneView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$13(ChallengeFragment challengeFragment, View view) {
        challengeFragment.getViewModel$3ds2sdk_release().onSubmitClicked(challengeFragment.getChallengeAction());
    }

    private final void updateBrandZoneImages() {
        BrandZoneView caBrandZone = getViewBinding$3ds2sdk_release().caBrandZone;
        Intrinsics.checkNotNullExpressionValue(caBrandZone, "caBrandZone");
        Pair[] pairArr = new Pair[2];
        ImageView issuerImageView = caBrandZone.getIssuerImageView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        pairArr[0] = TuplesKt.to(issuerImageView, challengeResponseData.getIssuerImage());
        ImageView paymentSystemImageView = caBrandZone.getPaymentSystemImageView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData3;
        }
        pairArr[1] = TuplesKt.to(paymentSystemImageView, challengeResponseData2.getPaymentSystemImage());
        for (Map.Entry entry : MapsKt.mapOf(pairArr).entrySet()) {
            final ImageView imageView = (ImageView) entry.getKey();
            getViewModel$3ds2sdk_release().getImage((ChallengeResponseData.Image) entry.getValue(), getResources().getDisplayMetrics().densityDpi).observe(getViewLifecycleOwner(), new ChallengeFragment$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChallengeFragment.updateBrandZoneImages$lambda$15$lambda$14(imageView, (Bitmap) obj);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateBrandZoneImages$lambda$15$lambda$14(ImageView imageView, Bitmap bitmap) {
        if (bitmap != null) {
            imageView.setVisibility(0);
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private final void configureInformationZoneView() {
        InformationZoneView caInformationZone = getViewBinding$3ds2sdk_release().caInformationZone;
        Intrinsics.checkNotNullExpressionValue(caInformationZone, "caInformationZone");
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        String whyInfoLabel = challengeResponseData.getWhyInfoLabel();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        caInformationZone.setWhyInfo(whyInfoLabel, challengeResponseData3.getWhyInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        String expandInfoLabel = challengeResponseData4.getExpandInfoLabel();
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData5;
        }
        caInformationZone.setExpandInfo(expandInfoLabel, challengeResponseData2.getExpandInfoText(), this.uiCustomization.getLabelCustomization());
        String accentColor = this.uiCustomization.getAccentColor();
        if (accentColor != null) {
            caInformationZone.setToggleColor$3ds2sdk_release(Color.parseColor(accentColor));
        }
    }

    private final void configureChallengeZoneView() {
        ChallengeZoneView challengeZoneView = getChallengeZoneView();
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        challengeZoneView.setInfoHeaderText(challengeResponseData.getChallengeInfoHeader(), this.uiCustomization.getLabelCustomization());
        ChallengeZoneView challengeZoneView2 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData3 = this.cresData;
        if (challengeResponseData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData3 = null;
        }
        challengeZoneView2.setInfoText(challengeResponseData3.getChallengeInfoText(), this.uiCustomization.getLabelCustomization());
        ChallengeResponseData challengeResponseData4 = this.cresData;
        if (challengeResponseData4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData4 = null;
        }
        if (challengeResponseData4.getUiType() == UiType.OutOfBand) {
            ChallengeZoneView challengeZoneView3 = getChallengeZoneView();
            ChallengeResponseData challengeResponseData5 = this.cresData;
            if (challengeResponseData5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData5 = null;
            }
            challengeZoneView3.setInfoLabel(challengeResponseData5.getChallengeInfoLabel(), this.uiCustomization.getLabelCustomization());
        }
        ChallengeZoneView challengeZoneView4 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData6 = this.cresData;
        if (challengeResponseData6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData6 = null;
        }
        challengeZoneView4.setInfoTextIndicator(challengeResponseData6.getShouldShowChallengeInfoTextIndicator() ? R.drawable.stripe_3ds2_ic_indicator : 0);
        ChallengeZoneView challengeZoneView5 = getChallengeZoneView();
        ChallengeResponseData challengeResponseData7 = this.cresData;
        if (challengeResponseData7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
        } else {
            challengeResponseData2 = challengeResponseData7;
        }
        challengeZoneView5.setWhitelistingLabel(challengeResponseData2.getWhitelistingInfoText(), this.uiCustomization.getLabelCustomization(), this.uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        getChallengeZoneView().setSubmitButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$17(this.f$0, view);
            }
        });
        getChallengeZoneView().setResendButtonClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.ChallengeFragment$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChallengeFragment.configureChallengeZoneView$lambda$18(this.f$0, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$17(ChallengeFragment challengeFragment, View view) {
        challengeFragment.getViewModel$3ds2sdk_release().onSubmitClicked(challengeFragment.getChallengeAction());
        ChallengeResponseData challengeResponseData = challengeFragment.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        UiType uiType = challengeResponseData.getUiType();
        int i = uiType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[uiType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                AnalyticsDelegate analyticsDelegate = challengeFragment.analyticsDelegate;
                if (analyticsDelegate != null) {
                    ChallengeResponseData challengeResponseData3 = challengeFragment.cresData;
                    if (challengeResponseData3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("cresData");
                    } else {
                        challengeResponseData2 = challengeResponseData3;
                    }
                    analyticsDelegate.otpSubmitButtonTappedWithTransactionID(challengeResponseData2.getServerTransId());
                    return;
                }
                return;
            }
            if (i == 2 || i == 3 || i == 4) {
                return;
            }
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticsDelegate analyticsDelegate2 = challengeFragment.analyticsDelegate;
            if (analyticsDelegate2 != null) {
                ChallengeResponseData challengeResponseData4 = challengeFragment.cresData;
                if (challengeResponseData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData4;
                }
                analyticsDelegate2.oobContinueButtonTappedWithTransactionID(challengeResponseData2.getServerTransId());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configureChallengeZoneView$lambda$18(ChallengeFragment challengeFragment, View view) {
        challengeFragment.getViewModel$3ds2sdk_release().submit(ChallengeAction.Resend.INSTANCE);
    }

    public final void refreshUi() {
        ChallengeResponseData challengeResponseData = this.cresData;
        ChallengeResponseData challengeResponseData2 = null;
        if (challengeResponseData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData = null;
        }
        if (challengeResponseData.getUiType() == UiType.Html) {
            ChallengeResponseData challengeResponseData3 = this.cresData;
            if (challengeResponseData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData3 = null;
            }
            String acsHtmlRefresh = challengeResponseData3.getAcsHtmlRefresh();
            if (acsHtmlRefresh != null && !StringsKt.isBlank(acsHtmlRefresh)) {
                ChallengeZoneWebView challengeZoneWebView = getChallengeZoneWebView();
                ChallengeResponseData challengeResponseData4 = this.cresData;
                if (challengeResponseData4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cresData");
                } else {
                    challengeResponseData2 = challengeResponseData4;
                }
                challengeZoneWebView.loadHtml(challengeResponseData2.getAcsHtmlRefresh());
                return;
            }
        }
        ChallengeResponseData challengeResponseData5 = this.cresData;
        if (challengeResponseData5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cresData");
            challengeResponseData5 = null;
        }
        if (challengeResponseData5.getUiType() == UiType.OutOfBand) {
            ChallengeResponseData challengeResponseData6 = this.cresData;
            if (challengeResponseData6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
                challengeResponseData6 = null;
            }
            String challengeAdditionalInfoText = challengeResponseData6.getChallengeAdditionalInfoText();
            if (challengeAdditionalInfoText == null || StringsKt.isBlank(challengeAdditionalInfoText)) {
                return;
            }
            ChallengeZoneView challengeZoneView = getChallengeZoneView();
            ChallengeResponseData challengeResponseData7 = this.cresData;
            if (challengeResponseData7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cresData");
            } else {
                challengeResponseData2 = challengeResponseData7;
            }
            challengeZoneView.setInfoText(challengeResponseData2.getChallengeAdditionalInfoText(), this.uiCustomization.getLabelCustomization());
            getChallengeZoneView().setInfoTextIndicator(0);
        }
    }

    private final void onChallengeRequestResult(ChallengeRequestResult result) {
        if (result instanceof ChallengeRequestResult.Success) {
            ChallengeRequestResult.Success success = (ChallengeRequestResult.Success) result;
            onSuccess(success.getCreqData(), success.getCresData());
        } else if (result instanceof ChallengeRequestResult.ProtocolError) {
            onError(((ChallengeRequestResult.ProtocolError) result).getData());
        } else if (result instanceof ChallengeRequestResult.RuntimeError) {
            onError(((ChallengeRequestResult.RuntimeError) result).getThrowable());
        } else {
            if (!(result instanceof ChallengeRequestResult.Timeout)) {
                throw new NoWhenBranchMatchedException();
            }
            onTimeout(((ChallengeRequestResult.Timeout) result).getData());
        }
    }

    private final void onSuccess(ChallengeRequestData creqData, ChallengeResponseData cresData) {
        ChallengeResult.Failed failed;
        if (cresData.isChallengeCompleted()) {
            getViewModel$3ds2sdk_release().stopTimer();
            if (creqData.getCancelReason() != null) {
                failed = new ChallengeResult.Canceled(getUiTypeCode(), this.initialUiType, this.intentData);
            } else {
                String transStatus = cresData.getTransStatus();
                if (transStatus == null) {
                    transStatus = "";
                }
                if (Intrinsics.areEqual(ChallengeRequestData.YES_VALUE, transStatus)) {
                    failed = new ChallengeResult.Succeeded(getUiTypeCode(), this.initialUiType, this.intentData);
                } else {
                    failed = new ChallengeResult.Failed(getUiTypeCode(), this.initialUiType, this.intentData);
                }
            }
            getViewModel$3ds2sdk_release().onFinish(failed);
        } else if (creqData.getCancelReason() != null) {
            getViewModel$3ds2sdk_release().stopTimer();
            getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Canceled(getUiTypeCode(), this.initialUiType, this.intentData));
        } else {
            getViewModel$3ds2sdk_release().onNextScreen(cresData);
        }
        AnalyticsDelegate analyticsDelegate = this.analyticsDelegate;
        if (analyticsDelegate != null) {
            analyticsDelegate.didReceiveChallengeResponseWithTransactionId(cresData.getServerTransId(), getUiTypeCode());
        }
    }

    private final void onError(ErrorData data) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.ProtocolError(data, this.initialUiType, this.intentData));
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(data);
    }

    private final void onTimeout(ErrorData data) {
        getViewModel$3ds2sdk_release().stopTimer();
        this.errorRequestExecutor.executeAsync(data);
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.Timeout(getUiTypeCode(), this.initialUiType, this.intentData));
    }

    private final void onError(Throwable throwable) {
        getViewModel$3ds2sdk_release().onFinish(new ChallengeResult.RuntimeError(throwable, this.initialUiType, this.intentData));
    }

    public final void clickSubmitButton() {
        getViewModel$3ds2sdk_release().submit(getChallengeAction());
    }
}
