package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoadStoreProductsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/internal/LoadStoreProductsState;", "", "(Ljava/lang/String;I)V", "NotStartedYet", "Loading", "Loaded", "Failed", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class LoadStoreProductsState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoadStoreProductsState[] $VALUES;
    public static final LoadStoreProductsState NotStartedYet = new LoadStoreProductsState("NotStartedYet", 0);
    public static final LoadStoreProductsState Loading = new LoadStoreProductsState("Loading", 1);
    public static final LoadStoreProductsState Loaded = new LoadStoreProductsState("Loaded", 2);
    public static final LoadStoreProductsState Failed = new LoadStoreProductsState("Failed", 3);

    private static final /* synthetic */ LoadStoreProductsState[] $values() {
        return new LoadStoreProductsState[]{NotStartedYet, Loading, Loaded, Failed};
    }

    public static EnumEntries<LoadStoreProductsState> getEntries() {
        return $ENTRIES;
    }

    public static LoadStoreProductsState valueOf(String str) {
        return (LoadStoreProductsState) Enum.valueOf(LoadStoreProductsState.class, str);
    }

    public static LoadStoreProductsState[] values() {
        return (LoadStoreProductsState[]) $VALUES.clone();
    }

    private LoadStoreProductsState(String str, int i) {
    }

    static {
        LoadStoreProductsState[] loadStoreProductsStateArr$values = $values();
        $VALUES = loadStoreProductsStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(loadStoreProductsStateArr$values);
    }
}
