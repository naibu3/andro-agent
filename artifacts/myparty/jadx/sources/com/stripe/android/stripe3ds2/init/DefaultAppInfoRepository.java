package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.webkit.Profile;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: DefaultAppInfoRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B!\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\fB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository;", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "store", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "appVersion", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;ILkotlin/coroutines/CoroutineContext;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initAppInfo", "Store", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DefaultAppInfoRepository implements AppInfoRepository {
    private static final Companion Companion = new Companion(null);
    private static final int INVALID_VERSION_CODE = -1;
    private final int appVersion;
    private final Store store;

    /* compiled from: DefaultAppInfoRepository.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository", f = "DefaultAppInfoRepository.kt", i = {0}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT}, m = "get", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$get$1, reason: invalid class name and case insensitive filesystem */
    static final class C11611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C11611(Continuation<? super C11611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultAppInfoRepository.this.get(this);
        }
    }

    public DefaultAppInfoRepository(Store store, int i, CoroutineContext workContext) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        this.store = store;
        this.appVersion = i;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(workContext), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, CoroutineContext workContext) {
        this(context, Companion.getAppVersion(context), workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository(Context context, int i, CoroutineContext workContext) {
        this(new Store.Default(context, i, workContext), i, workContext);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
    }

    /* compiled from: DefaultAppInfoRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1", f = "DefaultAppInfoRepository.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultAppInfoRepository.this.new AnonymousClass1(continuation);
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
                this.label = 1;
                obj = DefaultAppInfoRepository.this.store.get(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AppInfo appInfo = (AppInfo) obj;
            if (appInfo == null || DefaultAppInfoRepository.this.appVersion != appInfo.getVersion()) {
                DefaultAppInfoRepository.this.initAppInfo();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // com.stripe.android.stripe3ds2.init.AppInfoRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object get(Continuation<? super AppInfo> continuation) {
        C11611 c11611;
        DefaultAppInfoRepository defaultAppInfoRepository;
        if (continuation instanceof C11611) {
            c11611 = (C11611) continuation;
            if ((c11611.label & Integer.MIN_VALUE) != 0) {
                c11611.label -= Integer.MIN_VALUE;
            } else {
                c11611 = new C11611(continuation);
            }
        }
        Object obj = c11611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c11611.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Store store = this.store;
            c11611.L$0 = this;
            c11611.label = 1;
            obj = store.get(c11611);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            defaultAppInfoRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defaultAppInfoRepository = (DefaultAppInfoRepository) c11611.L$0;
            ResultKt.throwOnFailure(obj);
        }
        AppInfo appInfo = (AppInfo) obj;
        return appInfo == null ? defaultAppInfoRepository.initAppInfo() : appInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppInfo initAppInfo() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        AppInfo appInfo = new AppInfo(string, this.appVersion);
        this.store.save(appInfo);
        return appInfo;
    }

    /* compiled from: DefaultAppInfoRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "appInfo", Profile.DEFAULT_PROFILE_NAME, "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Store {
        Object get(Continuation<? super AppInfo> continuation);

        void save(AppInfo appInfo);

        /* compiled from: DefaultAppInfoRepository.kt */
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default;", "Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store;", "context", "Landroid/content/Context;", "appVersion", "", "workContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;ILkotlin/coroutines/CoroutineContext;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "get", "Lcom/stripe/android/stripe3ds2/init/AppInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "save", "", "appInfo", "Companion", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Default implements Store {
            private static final Companion Companion = new Companion(null);
            private static final String KEY_APP_VERSION = "app_version";
            private static final String KEY_SDK_APP_ID = "sdk_app_id";
            private static final String PREFS_NAME = "app_info";
            private final int appVersion;

            /* renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
            private final Lazy sharedPrefs;
            private final CoroutineContext workContext;

            public Default(final Context context, int i, CoroutineContext workContext) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(workContext, "workContext");
                this.appVersion = i;
                this.workContext = workContext;
                this.sharedPrefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository$Store$Default$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DefaultAppInfoRepository.Store.Default.sharedPrefs_delegate$lambda$0(context);
                    }
                });
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final SharedPreferences getSharedPrefs() {
                Object value = this.sharedPrefs.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                return (SharedPreferences) value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final SharedPreferences sharedPrefs_delegate$lambda$0(Context context) {
                return context.getSharedPreferences(PREFS_NAME, 0);
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public Object get(Continuation<? super AppInfo> continuation) {
                return BuildersKt.withContext(this.workContext, new DefaultAppInfoRepository$Store$Default$get$2(this, null), continuation);
            }

            @Override // com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository.Store
            public void save(AppInfo appInfo) {
                Intrinsics.checkNotNullParameter(appInfo, "appInfo");
                getSharedPrefs().edit().putInt("app_version", this.appVersion).putString(KEY_SDK_APP_ID, appInfo.getSdkAppId()).apply();
            }

            /* compiled from: DefaultAppInfoRepository.kt */
            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Store$Default$Companion;", "", "<init>", "()V", "PREFS_NAME", "", "KEY_APP_VERSION", "KEY_SDK_APP_ID", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            private static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }
            }
        }
    }

    /* compiled from: DefaultAppInfoRepository.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/init/DefaultAppInfoRepository$Companion;", "", "<init>", "()V", "INVALID_VERSION_CODE", "", "getAppVersion", "context", "Landroid/content/Context;", "3ds2sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getAppVersion(Context context) {
            Object objM9118constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Companion companion2 = this;
                objM9118constructorimpl = Result.m9118constructorimpl(Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            } catch (Throwable th) {
                Result.Companion companion3 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                objM9118constructorimpl = -1;
            }
            return ((Number) objM9118constructorimpl).intValue();
        }
    }
}
