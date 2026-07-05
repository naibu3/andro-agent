package com.stripe.android.paymentelement.confirmation;

import androidx.lifecycle.SavedStateHandle;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmationRegistry.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b0\u00032\u0006\u0010\t\u001a\u00020\nR$\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentelement/confirmation/ConfirmationRegistry;", "", "confirmationDefinitions", "", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationDefinition;", "<init>", "(Ljava/util/List;)V", "createConfirmationMediators", "Lcom/stripe/android/paymentelement/confirmation/ConfirmationMediator;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmationRegistry {
    public static final int $stable = 8;
    private final List<ConfirmationDefinition<?, ?, ?, ?>> confirmationDefinitions;

    /* JADX WARN: Multi-variable type inference failed */
    public ConfirmationRegistry(List<? extends ConfirmationDefinition<?, ?, ?, ?>> confirmationDefinitions) {
        Intrinsics.checkNotNullParameter(confirmationDefinitions, "confirmationDefinitions");
        this.confirmationDefinitions = confirmationDefinitions;
    }

    public final List<ConfirmationMediator<?, ?, ?, ?>> createConfirmationMediators(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        List listSortedWith = CollectionsKt.sortedWith(this.confirmationDefinitions, new Comparator() { // from class: com.stripe.android.paymentelement.confirmation.ConfirmationRegistry$createConfirmationMediators$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((ConfirmationDefinition) t).getKey(), ((ConfirmationDefinition) t2).getKey());
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSortedWith, 10));
        Iterator it = listSortedWith.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConfirmationMediator(savedStateHandle, (ConfirmationDefinition) it.next()));
        }
        return arrayList;
    }
}
