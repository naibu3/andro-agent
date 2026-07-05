package com.stripe.android.core.networking;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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
import kotlinx.serialization.json.Json;

/* compiled from: AnalyticsRequestV2Storage.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\bJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096@¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/core/networking/RealAnalyticsRequestV2Storage;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "context", "Landroid/content/Context;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroid/content/Context;Lkotlinx/coroutines/CoroutineDispatcher;)V", "(Landroid/content/Context;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getSharedPrefs", "()Landroid/content/SharedPreferences;", "sharedPrefs$delegate", "Lkotlin/Lazy;", "store", "", "request", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieve", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealAnalyticsRequestV2Storage implements AnalyticsRequestV2Storage {
    private final Context context;
    private final CoroutineDispatcher dispatcher;

    /* renamed from: sharedPrefs$delegate, reason: from kotlin metadata */
    private final Lazy sharedPrefs;

    private RealAnalyticsRequestV2Storage(Context context, CoroutineDispatcher coroutineDispatcher) {
        this.context = context;
        this.dispatcher = coroutineDispatcher;
        this.sharedPrefs = LazyKt.lazy(new Function0() { // from class: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RealAnalyticsRequestV2Storage.sharedPrefs_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* synthetic */ RealAnalyticsRequestV2Storage(Context context, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPrefs() {
        return (SharedPreferences) this.sharedPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences sharedPrefs_delegate$lambda$0(RealAnalyticsRequestV2Storage realAnalyticsRequestV2Storage) {
        return realAnalyticsRequestV2Storage.context.getSharedPreferences("StripeAnalyticsRequestV2Storage", 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Inject
    public RealAnalyticsRequestV2Storage(Context context) {
        this(context, Dispatchers.getIO());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* compiled from: AnalyticsRequestV2Storage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$store$2", f = "AnalyticsRequestV2Storage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$store$2, reason: invalid class name and case insensitive filesystem */
    static final class C08062 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ AnalyticsRequestV2 $request;
        int label;
        final /* synthetic */ RealAnalyticsRequestV2Storage this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08062(AnalyticsRequestV2 analyticsRequestV2, RealAnalyticsRequestV2Storage realAnalyticsRequestV2Storage, Continuation<? super C08062> continuation) {
            super(2, continuation);
            this.$request = analyticsRequestV2;
            this.this$0 = realAnalyticsRequestV2Storage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C08062(this.$request, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((C08062) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            Json.Companion companion = Json.INSTANCE;
            AnalyticsRequestV2 analyticsRequestV2 = this.$request;
            companion.getSerializersModule();
            this.this$0.getSharedPrefs().edit().putString(string, companion.encodeToString(AnalyticsRequestV2.INSTANCE.serializer(), analyticsRequestV2)).apply();
            return string;
        }
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestV2Storage
    public Object store(AnalyticsRequestV2 analyticsRequestV2, Continuation<? super String> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C08062(analyticsRequestV2, this, null), continuation);
    }

    /* compiled from: AnalyticsRequestV2Storage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$retrieve$2", f = "AnalyticsRequestV2Storage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$retrieve$2, reason: invalid class name and case insensitive filesystem */
    static final class C08052 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AnalyticsRequestV2>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C08052(String str, Continuation<? super C08052> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAnalyticsRequestV2Storage.this.new C08052(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AnalyticsRequestV2> continuation) {
            return ((C08052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objM9118constructorimpl;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                String string = RealAnalyticsRequestV2Storage.this.getSharedPrefs().getString(this.$id, null);
                if (string == null) {
                    return null;
                }
                RealAnalyticsRequestV2Storage.this.getSharedPrefs().edit().remove(this.$id).apply();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Json.Companion companion2 = Json.INSTANCE;
                    companion2.getSerializersModule();
                    objM9118constructorimpl = Result.m9118constructorimpl((AnalyticsRequestV2) companion2.decodeFromString(AnalyticsRequestV2.INSTANCE.serializer(), string));
                } catch (Throwable th) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m9124isFailureimpl(objM9118constructorimpl)) {
                    return null;
                }
                return objM9118constructorimpl;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestV2Storage
    public Object retrieve(String str, Continuation<? super AnalyticsRequestV2> continuation) {
        return BuildersKt.withContext(this.dispatcher, new C08052(str, null), continuation);
    }

    /* compiled from: AnalyticsRequestV2Storage.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$delete$2", f = "AnalyticsRequestV2Storage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.stripe.android.core.networking.RealAnalyticsRequestV2Storage$delete$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$id = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RealAnalyticsRequestV2Storage.this.new AnonymousClass2(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                RealAnalyticsRequestV2Storage.this.getSharedPrefs().edit().remove(this.$id).apply();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.stripe.android.core.networking.AnalyticsRequestV2Storage
    public Object delete(String str, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(this.dispatcher, new AnonymousClass2(str, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
