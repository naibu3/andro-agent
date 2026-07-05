package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import com.stripe.android.paymentsheet.model.SavedSelectionKt;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DefaultPrefsRepository.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000  2\u00020\u0001:\u0001 B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "context", "Landroid/content/Context;", "customerId", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "getSavedSelection", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "isGooglePayAvailable", "", "isLinkAvailable", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePaymentSelection", "", "paymentSelection", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "setSavedSelection", "savedSelection", "apply", "value", "commit", "getKey", "Companion", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultPrefsRepository implements PrefsRepository {
    public static final String PREF_FILE = "DefaultPrefsRepository";
    private final Context context;
    private final String customerId;

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;
    private final CoroutineContext workContext;
    public static final int $stable = 8;

    public DefaultPrefsRepository(Context context, String str, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.context = context;
        this.customerId = str;
        this.workContext = workContext;
        this.prefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.paymentsheet.DefaultPrefsRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultPrefsRepository.prefs_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        Object value = this.prefs.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (SharedPreferences) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(DefaultPrefsRepository defaultPrefsRepository) {
        return defaultPrefsRepository.context.getSharedPreferences(PREF_FILE, 0);
    }

    /* compiled from: DefaultPrefsRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2", f = "DefaultPrefsRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SavedSelection>, Object> {
        final /* synthetic */ boolean $isGooglePayAvailable;
        final /* synthetic */ boolean $isLinkAvailable;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(boolean z, boolean z2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$isGooglePayAvailable = z;
            this.$isLinkAvailable = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultPrefsRepository.this.new AnonymousClass2(this.$isGooglePayAvailable, this.$isLinkAvailable, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SavedSelection> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String string = DefaultPrefsRepository.this.getPrefs().getString(DefaultPrefsRepository.this.getKey(), null);
                if (string == null) {
                    string = "";
                }
                List listSplit$default = StringsKt.split$default((CharSequence) string, new String[]{":"}, false, 0, 6, (Object) null);
                String str = (String) CollectionsKt.firstOrNull(listSplit$default);
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != -1534821982) {
                        if (iHashCode != -1029412550) {
                            if (iHashCode == 3321850 && str.equals("link")) {
                                obj = (SavedSelection) (this.$isLinkAvailable ? SavedSelection.Link.INSTANCE : null);
                            }
                        } else if (str.equals("payment_method")) {
                            String str2 = (String) CollectionsKt.getOrNull(listSplit$default, 1);
                            obj = (SavedSelection) (str2 != null ? new SavedSelection.PaymentMethod(str2) : null);
                        }
                    } else if (str.equals("google_pay")) {
                        obj = (SavedSelection) (this.$isGooglePayAvailable ? SavedSelection.GooglePay.INSTANCE : null);
                    }
                }
                return obj == null ? SavedSelection.None.INSTANCE : obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public Object getSavedSelection(boolean z, boolean z2, Continuation<? super SavedSelection> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(z, z2, null), continuation);
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public void savePaymentSelection(PaymentSelection paymentSelection) {
        String str = null;
        SavedSelection savedSelection = paymentSelection != null ? SavedSelectionKt.toSavedSelection(paymentSelection) : null;
        if (Intrinsics.areEqual(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
            str = "google_pay";
        } else if (Intrinsics.areEqual(savedSelection, SavedSelection.Link.INSTANCE)) {
            str = "link";
        } else if (savedSelection instanceof SavedSelection.PaymentMethod) {
            str = "payment_method:" + ((SavedSelection.PaymentMethod) savedSelection).getId();
        }
        if (str != null) {
            apply(str);
        }
    }

    @Override // com.stripe.android.paymentsheet.PrefsRepository
    public boolean setSavedSelection(SavedSelection savedSelection) {
        String str;
        if (Intrinsics.areEqual(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
            str = "google_pay";
        } else if (Intrinsics.areEqual(savedSelection, SavedSelection.Link.INSTANCE)) {
            str = "link";
        } else if (savedSelection instanceof SavedSelection.PaymentMethod) {
            str = "payment_method:" + ((SavedSelection.PaymentMethod) savedSelection).getId();
        } else {
            str = "";
        }
        return commit(str);
    }

    private final void apply(String value) {
        getPrefs().edit().putString(getKey(), value).apply();
    }

    private final boolean commit(String value) {
        return getPrefs().edit().putString(getKey(), value).commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getKey() {
        String string;
        String str = this.customerId;
        return (str == null || (string = new StringBuilder("customer[").append(str).append("]").toString()) == null) ? "guest" : string;
    }
}
