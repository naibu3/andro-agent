package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.internal.ServerProtocol;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.CardBrandFilter;
import com.stripe.android.DefaultCardBrandFilter;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.cards.CardAccountRangeRepository;
import com.stripe.android.cards.CardAccountRangeService;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.DefaultCardAccountRangeRepositoryFactory;
import com.stripe.android.cards.DefaultStaticCardAccountRanges;
import com.stripe.android.cards.StaticCardAccountRanges;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AccountRange;
import com.stripe.android.model.CardBrand;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import expo.modules.notifications.notifications.channels.serializers.NotificationsChannelSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* compiled from: CardNumberEditText.kt */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002z{Bo\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0019BI\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0006\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u001dJ\b\u0010g\u001a\u000201H\u0014J\b\u0010k\u001a\u000201H\u0014J\u0017\u0010l\u001a\u0002012\b\b\u0002\u0010m\u001a\u00020\u0007H\u0000¢\u0006\u0002\bnJ/\u0010o\u001a\u00020\u00072\u0006\u0010p\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u00072\u0006\u0010r\u001a\u00020\u00072\b\b\u0002\u0010K\u001a\u00020\u0007H\u0000¢\u0006\u0002\bsJ\r\u0010t\u001a\u000201H\u0000¢\u0006\u0002\buJ\b\u0010v\u001a\u00020wH\u0016J\u0012\u0010x\u001a\u0002012\b\u0010y\u001a\u0004\u0018\u00010wH\u0016R\u001c\u0010\n\u001a\u00020\t8GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020'8\u0006@@X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R<\u00102\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u000201002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020100@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u00020'2\u0006\u0010&\u001a\u00020'@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010,\"\u0004\b9\u0010.R<\u0010:\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u000201002\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020100@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R0\u0010>\u001a\b\u0012\u0004\u0012\u00020'0=2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020'0=@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BRH\u0010C\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0=\u0012\u0004\u0012\u000201002\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0=\u0012\u0004\u0012\u00020100@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00104\"\u0004\bE\u00106R \u0010F\u001a\b\u0012\u0004\u0012\u0002010\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010MR\u001e\u0010Q\u001a\u00020P2\u0006\u0010&\u001a\u00020P@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010S\u001a\u0004\u0018\u00010T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020X8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020P8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010RR\u000e\u0010\\\u001a\u00020PX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010]\u001a\u00020^8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b_\u0010*\u001a\u0004\b`\u0010aR&\u0010b\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020100X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00104\"\u0004\bd\u00106R\u0010\u0010e\u001a\u0004\u0018\u00010fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010h\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006|"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "workContext", "cardAccountRangeRepository", "Lcom/stripe/android/cards/CardAccountRangeRepository;", "staticCardAccountRanges", "Lcom/stripe/android/cards/StaticCardAccountRanges;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "cardBrandFilter", "Lcom/stripe/android/CardBrandFilter;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/CardAccountRangeRepository;Lcom/stripe/android/cards/StaticCardAccountRanges;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Landroidx/lifecycle/ViewModelStoreOwner;Lcom/stripe/android/CardBrandFilter;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "publishableKeySupplier", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroid/util/AttributeSet;ILkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/CardBrandFilter;)V", "getWorkContext", "()Lkotlin/coroutines/CoroutineContext;", "setWorkContext", "(Lkotlin/coroutines/CoroutineContext;)V", "getViewModelStoreOwner$payments_core_release", "()Landroidx/lifecycle/ViewModelStoreOwner;", "setViewModelStoreOwner$payments_core_release", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "value", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "getCardBrand$annotations", "()V", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "setCardBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;)V", "callback", "Lkotlin/Function1;", "", "brandChangeCallback", "getBrandChangeCallback$payments_core_release", "()Lkotlin/jvm/functions/Function1;", "setBrandChangeCallback$payments_core_release", "(Lkotlin/jvm/functions/Function1;)V", "implicitCardBrandForCbc", "getImplicitCardBrandForCbc$payments_core_release", "setImplicitCardBrandForCbc$payments_core_release", "implicitCardBrandChangeCallback", "getImplicitCardBrandChangeCallback$payments_core_release", "setImplicitCardBrandChangeCallback$payments_core_release", "", "possibleCardBrands", "getPossibleCardBrands$payments_core_release", "()Ljava/util/List;", "setPossibleCardBrands$payments_core_release", "(Ljava/util/List;)V", "possibleCardBrandsCallback", "getPossibleCardBrandsCallback$payments_core_release", "setPossibleCardBrandsCallback$payments_core_release", "completionCallback", "getCompletionCallback$payments_core_release", "()Lkotlin/jvm/functions/Function0;", "setCompletionCallback$payments_core_release", "(Lkotlin/jvm/functions/Function0;)V", "panLength", "getPanLength$payments_core_release", "()I", "formattedPanLength", "getFormattedPanLength", "", "isCardNumberValid", "()Z", "validatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Validated;", "getValidatedCardNumber$payments_core_release", "()Lcom/stripe/android/cards/CardNumber$Validated;", "unvalidatedCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "getUnvalidatedCardNumber", "()Lcom/stripe/android/cards/CardNumber$Unvalidated;", "isValid", "isCbcEligible", "accountRangeService", "Lcom/stripe/android/cards/CardAccountRangeService;", "getAccountRangeService$annotations", "getAccountRangeService", "()Lcom/stripe/android/cards/CardAccountRangeService;", "isLoadingCallback", "isLoadingCallback$payments_core_release", "setLoadingCallback$payments_core_release", "loadingJob", "Lkotlinx/coroutines/Job;", "onAttachedToWindow", "accessibilityText", "getAccessibilityText", "()Ljava/lang/String;", "onDetachedFromWindow", "updateLengthFilter", "maxLength", "updateLengthFilter$payments_core_release", "calculateCursorPosition", "newFormattedLength", ViewProps.START, "addedDigits", "calculateCursorPosition$payments_core_release", "onCardMetadataLoadedTooSlow", "onCardMetadataLoadedTooSlow$payments_core_release", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", ServerProtocol.DIALOG_PARAM_STATE, "SavedState", "CardNumberTextWatcher", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CardNumberEditText extends StripeEditText {
    public static final int $stable = 8;
    private final CardAccountRangeService accountRangeService;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private /* synthetic */ Function1<? super CardBrand, Unit> brandChangeCallback;
    private final CardAccountRangeRepository cardAccountRangeRepository;
    private CardBrand cardBrand;
    private CardBrandFilter cardBrandFilter;
    private /* synthetic */ Function0<Unit> completionCallback;
    private Function1<? super CardBrand, Unit> implicitCardBrandChangeCallback;
    private CardBrand implicitCardBrandForCbc;
    private boolean isCardNumberValid;
    private boolean isCbcEligible;
    private /* synthetic */ Function1<? super Boolean, Unit> isLoadingCallback;
    private Job loadingJob;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private List<? extends CardBrand> possibleCardBrands;
    private /* synthetic */ Function1<? super List<? extends CardBrand>, Unit> possibleCardBrandsCallback;
    private ViewModelStoreOwner viewModelStoreOwner;
    private CoroutineContext workContext;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getAccountRangeService$annotations() {
    }

    public static /* synthetic */ void getCardBrand$annotations() {
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, CardAccountRangeRepository cardAccountRangeRepository, DefaultStaticCardAccountRanges defaultStaticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, DefaultCardBrandFilter defaultCardBrandFilter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i, coroutineContext, coroutineContext2, cardAccountRangeRepository, (i2 & 64) != 0 ? new DefaultStaticCardAccountRanges() : defaultStaticCardAccountRanges, analyticsRequestExecutor, paymentAnalyticsRequestFactory, (i2 & 512) != 0 ? null : viewModelStoreOwner, (i2 & 1024) != 0 ? DefaultCardBrandFilter.INSTANCE : defaultCardBrandFilter);
    }

    public final CoroutineContext getWorkContext() {
        return this.workContext;
    }

    public final void setWorkContext(CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<set-?>");
        this.workContext = coroutineContext;
    }

    /* renamed from: getViewModelStoreOwner$payments_core_release, reason: from getter */
    public final ViewModelStoreOwner getViewModelStoreOwner() {
        return this.viewModelStoreOwner;
    }

    public final void setViewModelStoreOwner$payments_core_release(ViewModelStoreOwner viewModelStoreOwner) {
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext uiContext, CoroutineContext workContext, CardAccountRangeRepository cardAccountRangeRepository, StaticCardAccountRanges staticCardAccountRanges, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, ViewModelStoreOwner viewModelStoreOwner, CardBrandFilter cardBrandFilter) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(cardAccountRangeRepository, "cardAccountRangeRepository");
        Intrinsics.checkNotNullParameter(staticCardAccountRanges, "staticCardAccountRanges");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(cardBrandFilter, "cardBrandFilter");
        this.workContext = workContext;
        this.cardAccountRangeRepository = cardAccountRangeRepository;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.viewModelStoreOwner = viewModelStoreOwner;
        this.cardBrandFilter = cardBrandFilter;
        this.cardBrand = CardBrand.Unknown;
        this.brandChangeCallback = new Function1() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardNumberEditText.brandChangeCallback$lambda$2((CardBrand) obj);
            }
        };
        this.implicitCardBrandForCbc = CardBrand.Unknown;
        this.implicitCardBrandChangeCallback = new Function1() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardNumberEditText.implicitCardBrandChangeCallback$lambda$3((CardBrand) obj);
            }
        };
        this.possibleCardBrands = CollectionsKt.emptyList();
        this.possibleCardBrandsCallback = new Function1() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardNumberEditText.possibleCardBrandsCallback$lambda$4((List) obj);
            }
        };
        this.completionCallback = new Function0() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.accountRangeService = new CardAccountRangeService(cardAccountRangeRepository, uiContext, this.workContext, staticCardAccountRanges, new CardAccountRangeService.AccountRangeResultListener() { // from class: com.stripe.android.view.CardNumberEditText$accountRangeService$1
            @Override // com.stripe.android.cards.CardAccountRangeService.AccountRangeResultListener
            public void onAccountRangesResult(List<AccountRange> accountRanges, List<AccountRange> unfilteredAccountRanges) {
                Intrinsics.checkNotNullParameter(accountRanges, "accountRanges");
                Intrinsics.checkNotNullParameter(unfilteredAccountRanges, "unfilteredAccountRanges");
                CardNumberEditText.updateLengthFilter$payments_core_release$default(this.this$0, 0, 1, null);
                List<AccountRange> list = accountRanges;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AccountRange) it.next()).getBrand());
                }
                List listDistinct = CollectionsKt.distinct(arrayList);
                CardNumberEditText cardNumberEditText = this.this$0;
                CardBrand cardBrand = (CardBrand) CollectionsKt.singleOrNull(listDistinct);
                if (cardBrand == null) {
                    cardBrand = CardBrand.Unknown;
                }
                cardNumberEditText.setCardBrand$payments_core_release(cardBrand);
                if (this.this$0.isCbcEligible) {
                    CardNumberEditText cardNumberEditText2 = this.this$0;
                    CardBrand cardBrand2 = (CardBrand) CollectionsKt.firstOrNull(listDistinct);
                    if (cardBrand2 == null) {
                        cardBrand2 = CardBrand.Unknown;
                    }
                    cardNumberEditText2.setImplicitCardBrandForCbc$payments_core_release(cardBrand2);
                    CardNumberEditText cardNumberEditText3 = this.this$0;
                    List<AccountRange> list2 = unfilteredAccountRanges;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((AccountRange) it2.next()).getBrand());
                    }
                    cardNumberEditText3.setPossibleCardBrands$payments_core_release(CollectionsKt.distinct(arrayList2));
                }
            }
        }, new Function0() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.f$0.isCbcEligible);
            }
        }, null, 64, null);
        this.isLoadingCallback = new Function1() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardNumberEditText.isLoadingCallback$lambda$7(((Boolean) obj).booleanValue());
            }
        };
        setNumberOnlyInputType();
        setErrorMessage(getResources().getString(com.stripe.android.R.string.stripe_invalid_card_number));
        addTextChangedListener(new CardNumberTextWatcher());
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda9
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                CardNumberEditText._init_$lambda$8(this.f$0, view, z);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_NUMBER});
        }
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        setLayoutDirection(0);
    }

    public /* synthetic */ CardNumberEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText(final Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, Dispatchers.getMain(), Dispatchers.getIO(), new Function0() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardNumberEditText._init_$lambda$0(context);
            }
        }, DefaultCardBrandFilter.INSTANCE);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Context context) {
        return PaymentConfiguration.INSTANCE.getInstance(context).getPublishableKey();
    }

    private CardNumberEditText(Context context, AttributeSet attributeSet, int i, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final Function0<String> function0, CardBrandFilter cardBrandFilter) {
        this(context, attributeSet, i, coroutineContext, coroutineContext2, new DefaultCardAccountRangeRepositoryFactory(context, null, 2, null).create(), new DefaultStaticCardAccountRanges(), new DefaultAnalyticsRequestExecutor(), new PaymentAnalyticsRequestFactory(context, new Provider() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda1
            @Override // javax.inject.Provider
            public final Object get() {
                return CardNumberEditText._init_$lambda$1(function0);
            }
        }), null, cardBrandFilter, 512, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$1(Function0 function0) {
        return (String) function0.invoke();
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final void setCardBrand$payments_core_release(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CardBrand cardBrand = this.cardBrand;
        this.cardBrand = value;
        if (value != cardBrand) {
            this.brandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    public final Function1<CardBrand, Unit> getBrandChangeCallback$payments_core_release() {
        return this.brandChangeCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit brandChangeCallback$lambda$2(CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void setBrandChangeCallback$payments_core_release(Function1<? super CardBrand, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.brandChangeCallback = callback;
        callback.invoke(this.cardBrand);
    }

    /* renamed from: getImplicitCardBrandForCbc$payments_core_release, reason: from getter */
    public final CardBrand getImplicitCardBrandForCbc() {
        return this.implicitCardBrandForCbc;
    }

    public final void setImplicitCardBrandForCbc$payments_core_release(CardBrand value) {
        Intrinsics.checkNotNullParameter(value, "value");
        CardBrand cardBrand = this.implicitCardBrandForCbc;
        this.implicitCardBrandForCbc = value;
        if (value != cardBrand) {
            this.implicitCardBrandChangeCallback.invoke(value);
            updateLengthFilter$payments_core_release$default(this, 0, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit implicitCardBrandChangeCallback$lambda$3(CardBrand it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<CardBrand, Unit> getImplicitCardBrandChangeCallback$payments_core_release() {
        return this.implicitCardBrandChangeCallback;
    }

    public final void setImplicitCardBrandChangeCallback$payments_core_release(Function1<? super CardBrand, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.implicitCardBrandChangeCallback = callback;
        callback.invoke(this.implicitCardBrandForCbc);
    }

    public final List<CardBrand> getPossibleCardBrands$payments_core_release() {
        return this.possibleCardBrands;
    }

    public final void setPossibleCardBrands$payments_core_release(List<? extends CardBrand> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List<? extends CardBrand> list = this.possibleCardBrands;
        this.possibleCardBrands = value;
        if (Intrinsics.areEqual(value, list)) {
            return;
        }
        this.possibleCardBrandsCallback.invoke(value);
        updateLengthFilter$payments_core_release$default(this, 0, 1, null);
    }

    public final Function1<List<? extends CardBrand>, Unit> getPossibleCardBrandsCallback$payments_core_release() {
        return this.possibleCardBrandsCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit possibleCardBrandsCallback$lambda$4(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void setPossibleCardBrandsCallback$payments_core_release(Function1<? super List<? extends CardBrand>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.possibleCardBrandsCallback = callback;
        callback.invoke(this.possibleCardBrands);
    }

    public final Function0<Unit> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final void setCompletionCallback$payments_core_release(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.completionCallback = function0;
    }

    public final int getPanLength$payments_core_release() {
        AccountRange accountRange = this.accountRangeService.getAccountRange();
        if (accountRange != null) {
            return accountRange.getPanLength();
        }
        AccountRange accountRangeFirst = this.accountRangeService.getStaticCardAccountRanges().first(getUnvalidatedCardNumber());
        if (accountRangeFirst != null) {
            return accountRangeFirst.getPanLength();
        }
        return 16;
    }

    private final int getFormattedPanLength() {
        return getPanLength$payments_core_release() + CardNumber.INSTANCE.getSpacePositions(getPanLength$payments_core_release()).size();
    }

    /* renamed from: isCardNumberValid, reason: from getter */
    public final boolean getIsCardNumberValid() {
        return this.isCardNumberValid;
    }

    public final CardNumber.Validated getValidatedCardNumber$payments_core_release() {
        return getUnvalidatedCardNumber().validate(getPanLength$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardNumber.Unvalidated getUnvalidatedCardNumber() {
        return new CardNumber.Unvalidated(getFieldText$payments_core_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isValid() {
        return getValidatedCardNumber$payments_core_release() != null;
    }

    public final CardAccountRangeService getAccountRangeService() {
        return this.accountRangeService;
    }

    public final Function1<Boolean, Unit> isLoadingCallback$payments_core_release() {
        return this.isLoadingCallback;
    }

    public final void setLoadingCallback$payments_core_release(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.isLoadingCallback = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isLoadingCallback$lambda$7(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$8(CardNumberEditText cardNumberEditText, View view, boolean z) {
        if (z || !cardNumberEditText.getUnvalidatedCardNumber().isPartialEntry(cardNumberEditText.getPanLength$payments_core_release())) {
            return;
        }
        cardNumberEditText.setShouldShowError(true);
    }

    @Override // com.google.android.material.textfield.TextInputEditText, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.loadingJob = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.workContext), null, null, new AnonymousClass1(null), 3, null);
        CardWidgetViewModelKt.doWithCardWidgetViewModel(this, this.viewModelStoreOwner, new Function2() { // from class: com.stripe.android.view.CardNumberEditText$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CardNumberEditText.onAttachedToWindow$lambda$11(this.f$0, (LifecycleOwner) obj, (CardWidgetViewModel) obj2);
            }
        });
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1", f = "CardNumberEditText.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CardNumberEditText.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loading = CardNumberEditText.this.cardAccountRangeRepository.getLoading();
                final CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                this.label = 1;
                if (loading.collect(new FlowCollector() { // from class: com.stripe.android.view.CardNumberEditText.onAttachedToWindow.1.1

                    /* compiled from: CardNumberEditText.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                    @DebugMetadata(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1", f = "CardNumberEditText.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C02331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ boolean $it;
                        int label;
                        final /* synthetic */ CardNumberEditText this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02331(CardNumberEditText cardNumberEditText, boolean z, Continuation<? super C02331> continuation) {
                            super(2, continuation);
                            this.this$0 = cardNumberEditText;
                            this.$it = z;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C02331(this.this$0, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C02331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.this$0.isLoadingCallback$payments_core_release().invoke(Boxing.boxBoolean(this.$it));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C02331(cardNumberEditText, z, null), continuation);
                        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$11(CardNumberEditText cardNumberEditText, LifecycleOwner doWithCardWidgetViewModel, CardWidgetViewModel viewModel) {
        Intrinsics.checkNotNullParameter(doWithCardWidgetViewModel, "$this$doWithCardWidgetViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        StateFlow<Boolean> stateFlowIsCbcEligible = viewModel.isCbcEligible();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(doWithCardWidgetViewModel), null, null, new CardNumberEditText$onAttachedToWindow$lambda$11$$inlined$launchAndCollect$default$1(doWithCardWidgetViewModel, Lifecycle.State.STARTED, stateFlowIsCbcEligible, null, cardNumberEditText), 3, null);
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() throws Resources.NotFoundException {
        String string = getResources().getString(com.stripe.android.R.string.stripe_acc_label_card_number_node, getText());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.view.View
    protected void onDetachedFromWindow() {
        Job job = this.loadingJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.loadingJob = null;
        this.accountRangeService.cancelAccountRangeRepositoryJob();
        super.onDetachedFromWindow();
    }

    public static /* synthetic */ void updateLengthFilter$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardNumberEditText.getFormattedPanLength();
        }
        cardNumberEditText.updateLengthFilter$payments_core_release(i);
    }

    public final /* synthetic */ void updateLengthFilter$payments_core_release(int maxLength) {
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(maxLength)});
    }

    public static /* synthetic */ int calculateCursorPosition$payments_core_release$default(CardNumberEditText cardNumberEditText, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = cardNumberEditText.getPanLength$payments_core_release();
        }
        return cardNumberEditText.calculateCursorPosition$payments_core_release(i, i2, i3, i4);
    }

    public final /* synthetic */ int calculateCursorPosition$payments_core_release(int newFormattedLength, int start, int addedDigits, int panLength) {
        int i;
        Set<Integer> spacePositions = CardNumber.INSTANCE.getSpacePositions(panLength);
        boolean z = spacePositions instanceof Collection;
        boolean z2 = false;
        if (z && spacePositions.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = spacePositions.iterator();
            i = 0;
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (start <= iIntValue && start + addedDigits >= iIntValue && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (!z || !spacePositions.isEmpty()) {
            Iterator<T> it2 = spacePositions.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                int iIntValue2 = ((Number) it2.next()).intValue();
                if (addedDigits == 0 && start == iIntValue2 + 1) {
                    z2 = true;
                    break;
                }
            }
        }
        int i2 = start + addedDigits + i;
        if (z2 && i2 > 0) {
            i2--;
        }
        return i2 <= newFormattedLength ? i2 : newFormattedLength;
    }

    public final /* synthetic */ void onCardMetadataLoadedTooSlow$payments_core_release() {
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.CardMetadataLoadedTooSlow, null, null, null, null, null, 62, null));
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.isCbcEligible);
    }

    @Override // com.stripe.android.view.StripeEditText, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Parcelable superState;
        SavedState savedState = state instanceof SavedState ? (SavedState) state : null;
        this.isCbcEligible = savedState != null ? savedState.isCbcEligible() : false;
        if (savedState != null && (superState = savedState.getSuperState()) != null) {
            state = superState;
        }
        super.onRestoreInstanceState(state);
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$SavedState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "superSavedState", "isCbcEligible", "", "<init>", "(Landroid/os/Parcelable;Z)V", "getSuperSavedState", "()Landroid/os/Parcelable;", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", NotificationsChannelSerializer.AUDIO_ATTRIBUTES_FLAGS_KEY, "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SavedState extends View.BaseSavedState implements Parcelable {
        private final boolean isCbcEligible;
        private final Parcelable superSavedState;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: CardNumberEditText.kt */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public static /* synthetic */ SavedState copy$default(SavedState savedState, Parcelable parcelable, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                parcelable = savedState.superSavedState;
            }
            if ((i & 2) != 0) {
                z = savedState.isCbcEligible;
            }
            return savedState.copy(parcelable, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Parcelable getSuperSavedState() {
            return this.superSavedState;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsCbcEligible() {
            return this.isCbcEligible;
        }

        public final SavedState copy(Parcelable superSavedState, boolean isCbcEligible) {
            return new SavedState(superSavedState, isCbcEligible);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) other;
            return Intrinsics.areEqual(this.superSavedState, savedState.superSavedState) && this.isCbcEligible == savedState.isCbcEligible;
        }

        public int hashCode() {
            Parcelable parcelable = this.superSavedState;
            return ((parcelable == null ? 0 : parcelable.hashCode()) * 31) + Boolean.hashCode(this.isCbcEligible);
        }

        public String toString() {
            return "SavedState(superSavedState=" + this.superSavedState + ", isCbcEligible=" + this.isCbcEligible + ")";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.superSavedState, flags);
            dest.writeInt(this.isCbcEligible ? 1 : 0);
        }

        public final Parcelable getSuperSavedState() {
            return this.superSavedState;
        }

        public final boolean isCbcEligible() {
            return this.isCbcEligible;
        }

        public SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.superSavedState = parcelable;
            this.isCbcEligible = z;
        }
    }

    /* compiled from: CardNumberEditText.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J*\u0010\u0016\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0002J(\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001c¨\u0006%"}, d2 = {"Lcom/stripe/android/view/CardNumberEditText$CardNumberTextWatcher;", "Lcom/stripe/android/view/StripeTextWatcher;", "<init>", "(Lcom/stripe/android/view/CardNumberEditText;)V", "latestChangeStart", "", "latestInsertionSize", "newCursorPosition", "Ljava/lang/Integer;", "formattedNumber", "", "beforeCardNumber", "Lcom/stripe/android/cards/CardNumber$Unvalidated;", "isPastedPan", "", "beforeTextChanged", "", "s", "", ViewProps.START, NewHtcHomeBadger.COUNT, "after", "onTextChanged", "before", "afterTextChanged", "Landroid/text/Editable;", "shouldUpdateAfterChange", "getShouldUpdateAfterChange", "()Z", "digitsAdded", "getDigitsAdded", "isComplete", "wasCardNumberValid", "startPosition", "previousCount", "currentCount", "cardNumber", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class CardNumberTextWatcher extends StripeTextWatcher {
        private CardNumber.Unvalidated beforeCardNumber;
        private String formattedNumber;
        private boolean isPastedPan;
        private int latestChangeStart;
        private int latestInsertionSize;
        private Integer newCursorPosition;

        public CardNumberTextWatcher() {
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            this.isPastedPan = false;
            this.beforeCardNumber = CardNumberEditText.this.getUnvalidatedCardNumber();
            this.latestChangeStart = start;
            this.latestInsertionSize = after;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            int panLength$payments_core_release;
            String string = s != null ? s.toString() : null;
            if (string == null) {
                string = "";
            }
            CardNumber.Unvalidated unvalidated = new CardNumber.Unvalidated(string);
            CardNumberEditText.this.getAccountRangeService().onCardNumberChanged(unvalidated);
            boolean zIsPastedPan = isPastedPan(start, before, count, unvalidated);
            this.isPastedPan = zIsPastedPan;
            if (zIsPastedPan) {
                CardNumberEditText.this.updateLengthFilter$payments_core_release(unvalidated.getFormatted(unvalidated.getLength()).length());
            }
            if (this.isPastedPan) {
                panLength$payments_core_release = unvalidated.getLength();
            } else {
                panLength$payments_core_release = CardNumberEditText.this.getPanLength$payments_core_release();
            }
            CardNumberEditText cardNumberEditText = CardNumberEditText.this;
            String formatted = unvalidated.getFormatted(panLength$payments_core_release);
            this.newCursorPosition = Integer.valueOf(cardNumberEditText.calculateCursorPosition$payments_core_release(formatted.length(), this.latestChangeStart, this.latestInsertionSize, panLength$payments_core_release));
            this.formattedNumber = formatted;
        }

        @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            if (getShouldUpdateAfterChange()) {
                CardNumberEditText.this.setTextSilent$payments_core_release(this.formattedNumber);
                Integer num = this.newCursorPosition;
                if (num != null) {
                    CardNumberEditText cardNumberEditText = CardNumberEditText.this;
                    cardNumberEditText.setSelection(RangesKt.coerceIn(num.intValue(), 0, cardNumberEditText.getFieldText$payments_core_release().length()));
                }
            }
            this.formattedNumber = null;
            this.newCursorPosition = null;
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getLength() != CardNumberEditText.this.getPanLength$payments_core_release()) {
                if (CardNumberEditText.this.getUnvalidatedCardNumber().isPartialEntry(CardNumberEditText.this.getPanLength$payments_core_release()) && !CardNumberEditText.this.getUnvalidatedCardNumber().isPossibleCardBrand()) {
                    CardNumberEditText cardNumberEditText2 = CardNumberEditText.this;
                    cardNumberEditText2.isCardNumberValid = cardNumberEditText2.isValid();
                    CardNumberEditText.this.setShouldShowError(true);
                    return;
                } else {
                    CardNumberEditText cardNumberEditText3 = CardNumberEditText.this;
                    cardNumberEditText3.isCardNumberValid = cardNumberEditText3.isValid();
                    CardNumberEditText.this.setShouldShowError(false);
                    return;
                }
            }
            boolean isCardNumberValid = CardNumberEditText.this.getIsCardNumberValid();
            CardNumberEditText cardNumberEditText4 = CardNumberEditText.this;
            cardNumberEditText4.isCardNumberValid = cardNumberEditText4.isValid();
            CardNumberEditText.this.setShouldShowError(!r0.isValid());
            if (CardNumberEditText.this.getAccountRangeService().getAccountRange() == null && CardNumberEditText.this.getUnvalidatedCardNumber().getIsValidLuhn()) {
                CardNumberEditText.this.onCardMetadataLoadedTooSlow$payments_core_release();
            }
            if (isComplete(isCardNumberValid)) {
                CardNumberEditText.this.getCompletionCallback$payments_core_release().invoke();
            }
        }

        private final boolean getShouldUpdateAfterChange() {
            return (getDigitsAdded() || !CardNumberEditText.this.getIsLastKeyDelete()) && this.formattedNumber != null;
        }

        private final boolean getDigitsAdded() {
            return CardNumberEditText.this.getUnvalidatedCardNumber().getLength() > this.beforeCardNumber.getLength();
        }

        private final boolean isComplete(boolean wasCardNumberValid) {
            if (wasCardNumberValid) {
                return false;
            }
            if (CardNumberEditText.this.getUnvalidatedCardNumber().getIsMaxLength()) {
                return true;
            }
            return CardNumberEditText.this.isValid() && CardNumberEditText.this.getAccountRangeService().getAccountRange() != null;
        }

        private final boolean isPastedPan(int startPosition, int previousCount, int currentCount, CardNumber.Unvalidated cardNumber) {
            return currentCount > previousCount && startPosition == 0 && cardNumber.getNormalized().length() >= 14;
        }
    }
}
