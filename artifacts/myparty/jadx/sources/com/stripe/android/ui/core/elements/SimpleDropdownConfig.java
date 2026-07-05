package com.stripe.android.ui.core.elements;

import com.facebook.react.modules.dialog.AlertFragment;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.DropdownConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleDropdownConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/ui/core/elements/SimpleDropdownConfig;", "Lcom/stripe/android/uicore/elements/DropdownConfig;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", AlertFragment.ARG_ITEMS, "", "Lcom/stripe/android/ui/core/elements/DropdownItemSpec;", "<init>", "(Lcom/stripe/android/core/strings/ResolvableString;Ljava/util/List;)V", "getLabel", "()Lcom/stripe/android/core/strings/ResolvableString;", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "rawItems", "getRawItems", "()Ljava/util/List;", "displayItems", "getDisplayItems", "getSelectedItemLabel", "index", "", "convertFromRaw", "rawValue", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SimpleDropdownConfig implements DropdownConfig {
    public static final int $stable = 8;
    private final String debugLabel;
    private final List<String> displayItems;
    private final List<DropdownItemSpec> items;
    private final ResolvableString label;
    private final List<String> rawItems;

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public boolean getDisableDropdownWithSingleElement() {
        return DropdownConfig.DefaultImpls.getDisableDropdownWithSingleElement(this);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public DropdownConfig.Mode getMode() {
        return DropdownConfig.DefaultImpls.getMode(this);
    }

    public SimpleDropdownConfig(ResolvableString label, List<DropdownItemSpec> items) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(items, "items");
        this.label = label;
        this.items = items;
        this.debugLabel = "simple_dropdown";
        List<DropdownItemSpec> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DropdownItemSpec) it.next()).getApiValue());
        }
        this.rawItems = arrayList;
        List<DropdownItemSpec> list2 = this.items;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DropdownItemSpec) it2.next()).getDisplayText());
        }
        this.displayItems = arrayList2;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public ResolvableString getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getDebugLabel() {
        return this.debugLabel;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getRawItems() {
        return this.rawItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public List<String> getDisplayItems() {
        return this.displayItems;
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String getSelectedItemLabel(int index) {
        return getDisplayItems().get(index);
    }

    @Override // com.stripe.android.uicore.elements.DropdownConfig
    public String convertFromRaw(String rawValue) {
        Object next;
        String displayText;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((DropdownItemSpec) next).getApiValue(), rawValue)) {
                break;
            }
        }
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) next;
        return (dropdownItemSpec == null || (displayText = dropdownItemSpec.getDisplayText()) == null) ? this.items.get(0).getDisplayText() : displayText;
    }
}
