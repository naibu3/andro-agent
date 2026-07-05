package com.stripe.android.core.frauddetection;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONObject;

/* compiled from: FraudDetectionDataStore.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore;", "Lcom/stripe/android/core/frauddetection/FraudDetectionDataStore;", "context", "Landroid/content/Context;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "fraudDetectionData", "Companion", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DefaultFraudDetectionDataStore implements FraudDetectionDataStore {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_DATA = "key_fraud_detection_data";
    private static final String PREF_FILE = "FraudDetectionDataStore";

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    private final Lazy prefs;
    private final CoroutineContext workContext;

    public DefaultFraudDetectionDataStore(final Context context, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.workContext = workContext;
        this.prefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultFraudDetectionDataStore.prefs_delegate$lambda$0(context);
            }
        });
    }

    public /* synthetic */ DefaultFraudDetectionDataStore(Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences prefs_delegate$lambda$0(Context context) {
        return context.getSharedPreferences(PREF_FILE, 0);
    }

    /* compiled from: FraudDetectionDataStore.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/core/frauddetection/FraudDetectionData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$get$2", f = "FraudDetectionDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$get$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FraudDetectionData>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = DefaultFraudDetectionDataStore.this.new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super FraudDetectionData> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DefaultFraudDetectionDataStore defaultFraudDetectionDataStore = DefaultFraudDetectionDataStore.this;
            try {
                Result.Companion companion = Result.INSTANCE;
                String string = defaultFraudDetectionDataStore.getPrefs().getString(DefaultFraudDetectionDataStore.KEY_DATA, null);
                if (string == null) {
                    string = "";
                }
                final JSONObject jSONObject = new JSONObject(string);
                objM9118constructorimpl = Result.m9118constructorimpl(new FraudDetectionDataJsonParser(new Function0() { // from class: com.stripe.android.core.frauddetection.DefaultFraudDetectionDataStore$get$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Long.valueOf(DefaultFraudDetectionDataStore.AnonymousClass2.invokeSuspend$lambda$1$lambda$0(jSONObject));
                    }
                }).parse(jSONObject));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                return null;
            }
            return objM9118constructorimpl;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invokeSuspend$lambda$1$lambda$0(JSONObject jSONObject) {
            return jSONObject.optLong("timestamp", -1L);
        }
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataStore
    public Object get(Continuation<? super FraudDetectionData> continuation) {
        return BuildersKt.withContext(this.workContext, new AnonymousClass2(null), continuation);
    }

    @Override // com.stripe.android.core.frauddetection.FraudDetectionDataStore
    public void save(FraudDetectionData fraudDetectionData) {
        Intrinsics.checkNotNullParameter(fraudDetectionData, "fraudDetectionData");
        getPrefs().edit().putString(KEY_DATA, fraudDetectionData.toJson().toString()).apply();
    }

    /* compiled from: FraudDetectionDataStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/core/frauddetection/DefaultFraudDetectionDataStore$Companion;", "", "<init>", "()V", "PREF_FILE", "", "KEY_DATA", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
