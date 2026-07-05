package com.stripe.android.core.injection;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WeakMapInjectorRegistry.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0017J\u0006\u0010\u0018\u001a\u00020\u0011R(\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/core/injection/WeakMapInjectorRegistry;", "Lcom/stripe/android/core/injection/InjectorRegistry;", "<init>", "()V", "staticCacheMap", "Ljava/util/WeakHashMap;", "Lcom/stripe/android/core/injection/Injector;", "", "getStaticCacheMap$annotations", "getStaticCacheMap", "()Ljava/util/WeakHashMap;", "CURRENT_REGISTER_KEY", "Ljava/util/concurrent/atomic/AtomicInteger;", "getCURRENT_REGISTER_KEY$annotations", "getCURRENT_REGISTER_KEY", "()Ljava/util/concurrent/atomic/AtomicInteger;", "register", "", "injector", SDKConstants.PARAM_KEY, "retrieve", "injectorKey", "nextKey", "prefix", "clear", "stripe-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WeakMapInjectorRegistry implements InjectorRegistry {
    public static final WeakMapInjectorRegistry INSTANCE = new WeakMapInjectorRegistry();
    private static final WeakHashMap<Injector, String> staticCacheMap = new WeakHashMap<>();
    private static final AtomicInteger CURRENT_REGISTER_KEY = new AtomicInteger(0);

    public static /* synthetic */ void getCURRENT_REGISTER_KEY$annotations() {
    }

    public static /* synthetic */ void getStaticCacheMap$annotations() {
    }

    private WeakMapInjectorRegistry() {
    }

    public final WeakHashMap<Injector, String> getStaticCacheMap() {
        return staticCacheMap;
    }

    public final AtomicInteger getCURRENT_REGISTER_KEY() {
        return CURRENT_REGISTER_KEY;
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized void register(Injector injector, @InjectorKey String key) {
        Intrinsics.checkNotNullParameter(injector, "injector");
        Intrinsics.checkNotNullParameter(key, "key");
        staticCacheMap.put(injector, key);
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    public synchronized Injector retrieve(@InjectorKey String injectorKey) {
        Object next;
        Map.Entry entry;
        Intrinsics.checkNotNullParameter(injectorKey, "injectorKey");
        Set<Map.Entry<Injector, String>> setEntrySet = staticCacheMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Map.Entry) next).getValue(), injectorKey)) {
                break;
            }
        }
        entry = (Map.Entry) next;
        return entry != null ? (Injector) entry.getKey() : null;
    }

    @Override // com.stripe.android.core.injection.InjectorRegistry
    @InjectorKey
    public String nextKey(String prefix) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return prefix + CURRENT_REGISTER_KEY.incrementAndGet();
    }

    public final void clear() {
        WeakHashMap<Injector, String> weakHashMap = staticCacheMap;
        synchronized (weakHashMap) {
            weakHashMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
