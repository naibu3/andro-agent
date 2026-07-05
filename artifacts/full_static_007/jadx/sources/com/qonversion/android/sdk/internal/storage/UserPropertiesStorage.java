package com.qonversion.android.sdk.internal.storage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserPropertiesStorage.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0014\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u0016J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/qonversion/android/sdk/internal/storage/UserPropertiesStorage;", "Lcom/qonversion/android/sdk/internal/storage/PropertiesStorage;", "()V", "userProperties", "", "", "clear", "", "properties", "", "getProperties", "save", "key", AppMeasurementSdk.ConditionalUserProperty.VALUE, "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class UserPropertiesStorage implements PropertiesStorage {
    private final Map<String, String> userProperties = new ConcurrentHashMap();

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    public void save(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.userProperties.put(key, value);
    }

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    public void clear(Map<String, String> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Set<String> setKeySet = properties.keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(this.userProperties.remove((String) it.next()));
        }
    }

    @Override // com.qonversion.android.sdk.internal.storage.PropertiesStorage
    public Map<String, String> getProperties() {
        return MapsKt.toMap(this.userProperties);
    }
}
