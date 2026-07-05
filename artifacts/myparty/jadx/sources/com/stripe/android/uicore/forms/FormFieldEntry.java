package com.stripe.android.uicore.forms;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FormFieldEntry.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/uicore/forms/FormFieldEntry;", "", "value", "", "isComplete", "", "<init>", "(Ljava/lang/String;Z)V", "getValue", "()Ljava/lang/String;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FormFieldEntry {
    public static final int $stable = 0;
    private final boolean isComplete;
    private final String value;

    public static /* synthetic */ FormFieldEntry copy$default(FormFieldEntry formFieldEntry, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formFieldEntry.value;
        }
        if ((i & 2) != 0) {
            z = formFieldEntry.isComplete;
        }
        return formFieldEntry.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    public final FormFieldEntry copy(String value, boolean isComplete) {
        return new FormFieldEntry(value, isComplete);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormFieldEntry)) {
            return false;
        }
        FormFieldEntry formFieldEntry = (FormFieldEntry) other;
        return Intrinsics.areEqual(this.value, formFieldEntry.value) && this.isComplete == formFieldEntry.isComplete;
    }

    public int hashCode() {
        String str = this.value;
        return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.isComplete);
    }

    public String toString() {
        return "FormFieldEntry(value=" + this.value + ", isComplete=" + this.isComplete + ")";
    }

    public FormFieldEntry(String str, boolean z) {
        this.value = str;
        this.isComplete = z;
    }

    public /* synthetic */ FormFieldEntry(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isComplete() {
        return this.isComplete;
    }
}
