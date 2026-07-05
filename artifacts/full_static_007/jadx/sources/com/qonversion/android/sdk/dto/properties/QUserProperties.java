package com.qonversion.android.sdk.dto.properties;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: QUserProperties.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0011J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\rJ\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\rHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\b¨\u0006!"}, d2 = {"Lcom/qonversion/android/sdk/dto/properties/QUserProperties;", "", "properties", "", "Lcom/qonversion/android/sdk/dto/properties/QUserProperty;", "(Ljava/util/List;)V", "customProperties", "getCustomProperties", "()Ljava/util/List;", "definedProperties", "getDefinedProperties", "flatCustomPropertiesMap", "", "", "getFlatCustomPropertiesMap", "()Ljava/util/Map;", "flatDefinedPropertiesMap", "Lcom/qonversion/android/sdk/dto/properties/QUserPropertyKey;", "getFlatDefinedPropertiesMap", "flatPropertiesMap", "getFlatPropertiesMap", "getProperties", "component1", "copy", "equals", "", "other", "getDefinedProperty", "key", "getProperty", "hashCode", "", "toString", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class QUserProperties {
    private final List<QUserProperty> customProperties;
    private final List<QUserProperty> definedProperties;
    private final Map<String, String> flatCustomPropertiesMap;
    private final Map<QUserPropertyKey, String> flatDefinedPropertiesMap;
    private final Map<String, String> flatPropertiesMap;
    private final List<QUserProperty> properties;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QUserProperties copy$default(QUserProperties qUserProperties, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = qUserProperties.properties;
        }
        return qUserProperties.copy(list);
    }

    public final List<QUserProperty> component1() {
        return this.properties;
    }

    public final QUserProperties copy(List<QUserProperty> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new QUserProperties(properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QUserProperties) && Intrinsics.areEqual(this.properties, ((QUserProperties) other).properties);
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    public String toString() {
        return "QUserProperties(properties=" + this.properties + ")";
    }

    public QUserProperties(List<QUserProperty> properties) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.properties = properties;
        ArrayList arrayList = new ArrayList();
        for (Object obj : properties) {
            if (((QUserProperty) obj).getDefinedKey() != QUserPropertyKey.Custom) {
                arrayList.add(obj);
            }
        }
        this.definedProperties = arrayList;
        List<QUserProperty> list = this.properties;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((QUserProperty) obj2).getDefinedKey() == QUserPropertyKey.Custom) {
                arrayList2.add(obj2);
            }
        }
        this.customProperties = arrayList2;
        List<QUserProperty> list2 = this.properties;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (QUserProperty qUserProperty : list2) {
            Pair pair = TuplesKt.to(qUserProperty.getKey(), qUserProperty.getValue());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        this.flatPropertiesMap = linkedHashMap;
        List<QUserProperty> list3 = this.definedProperties;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
        for (QUserProperty qUserProperty2 : list3) {
            Pair pair2 = TuplesKt.to(qUserProperty2.getDefinedKey(), qUserProperty2.getValue());
            linkedHashMap2.put(pair2.getFirst(), pair2.getSecond());
        }
        this.flatDefinedPropertiesMap = linkedHashMap2;
        List<QUserProperty> list4 = this.customProperties;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list4, 10)), 16));
        for (QUserProperty qUserProperty3 : list4) {
            Pair pair3 = TuplesKt.to(qUserProperty3.getKey(), qUserProperty3.getValue());
            linkedHashMap3.put(pair3.getFirst(), pair3.getSecond());
        }
        this.flatCustomPropertiesMap = linkedHashMap3;
    }

    public final List<QUserProperty> getProperties() {
        return this.properties;
    }

    public final List<QUserProperty> getDefinedProperties() {
        return this.definedProperties;
    }

    public final List<QUserProperty> getCustomProperties() {
        return this.customProperties;
    }

    public final Map<String, String> getFlatPropertiesMap() {
        return this.flatPropertiesMap;
    }

    public final Map<QUserPropertyKey, String> getFlatDefinedPropertiesMap() {
        return this.flatDefinedPropertiesMap;
    }

    public final Map<String, String> getFlatCustomPropertiesMap() {
        return this.flatCustomPropertiesMap;
    }

    public final QUserProperty getProperty(String key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.properties.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((QUserProperty) next).getKey(), key)) {
                break;
            }
        }
        return (QUserProperty) next;
    }

    public final QUserProperty getDefinedProperty(QUserPropertyKey key) {
        Object next;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.definedProperties.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((QUserProperty) next).getDefinedKey() == key) {
                break;
            }
        }
        return (QUserProperty) next;
    }
}
