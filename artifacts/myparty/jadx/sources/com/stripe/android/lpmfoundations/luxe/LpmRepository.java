package com.stripe.android.lpmfoundations.luxe;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.ui.core.elements.LpmSerializer;
import com.stripe.android.ui.core.elements.SharedDataSpec;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: LpmRepository.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/LpmRepository;", "", "<init>", "()V", "getSharedDataSpecs", "Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;", "stripeIntent", "Lcom/stripe/android/model/StripeIntent;", "serverLpmSpecs", "", "readFromDisk", "", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "parseLpms", "inputStream", "Ljava/io/InputStream;", "getJsonStringFromInputStream", "Result", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LpmRepository {
    public static final int $stable = 0;

    @Inject
    public LpmRepository() {
    }

    public final Result getSharedDataSpecs(StripeIntent stripeIntent, String serverLpmSpecs) {
        boolean zM9124isFailureimpl;
        Intrinsics.checkNotNullParameter(stripeIntent, "stripeIntent");
        List<String> paymentMethodTypes = stripeIntent.getPaymentMethodTypes();
        ArrayList arrayList = new ArrayList();
        String str = serverLpmSpecs;
        if (str == null || str.length() == 0) {
            zM9124isFailureimpl = false;
        } else {
            Object objM8656deserializeListIoAF18A = LpmSerializer.INSTANCE.m8656deserializeListIoAF18A(serverLpmSpecs);
            zM9124isFailureimpl = kotlin.Result.m9124isFailureimpl(objM8656deserializeListIoAF18A);
            Throwable thM9121exceptionOrNullimpl = kotlin.Result.m9121exceptionOrNullimpl(objM8656deserializeListIoAF18A);
            message = thM9121exceptionOrNullimpl != null ? thM9121exceptionOrNullimpl.getMessage() : null;
            ArrayList arrayList2 = arrayList;
            if (kotlin.Result.m9121exceptionOrNullimpl(objM8656deserializeListIoAF18A) != null) {
                objM8656deserializeListIoAF18A = CollectionsKt.emptyList();
            }
            CollectionsKt.addAll(arrayList2, (Iterable) objM8656deserializeListIoAF18A);
        }
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(((SharedDataSpec) it.next()).getType());
        }
        Set set = CollectionsKt.toSet(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : paymentMethodTypes) {
            if (!set.contains((String) obj)) {
                arrayList5.add(obj);
            }
        }
        ArrayList arrayList6 = arrayList5;
        if (!arrayList6.isEmpty()) {
            ArrayList arrayList7 = arrayList;
            List<SharedDataSpec> fromDisk = readFromDisk();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj2 : fromDisk) {
                if (arrayList6.contains(((SharedDataSpec) obj2).getType())) {
                    arrayList8.add(obj2);
                }
            }
            CollectionsKt.addAll(arrayList7, arrayList8);
        }
        return new Result(arrayList, zM9124isFailureimpl, message);
    }

    private final List<SharedDataSpec> readFromDisk() {
        ClassLoader classLoader = LpmRepository.class.getClassLoader();
        Intrinsics.checkNotNull(classLoader);
        return parseLpms(classLoader.getResourceAsStream("lpms.json"));
    }

    private final List<SharedDataSpec> parseLpms(InputStream inputStream) {
        List<SharedDataSpec> list;
        String jsonStringFromInputStream = getJsonStringFromInputStream(inputStream);
        if (jsonStringFromInputStream != null) {
            Object objM8656deserializeListIoAF18A = LpmSerializer.INSTANCE.m8656deserializeListIoAF18A(jsonStringFromInputStream);
            if (kotlin.Result.m9121exceptionOrNullimpl(objM8656deserializeListIoAF18A) != null) {
                objM8656deserializeListIoAF18A = CollectionsKt.emptyList();
            }
            list = (List) objM8656deserializeListIoAF18A;
        } else {
            list = null;
        }
        return list == null ? CollectionsKt.emptyList() : list;
    }

    private final String getJsonStringFromInputStream(InputStream inputStream) {
        BufferedReader bufferedReader;
        if (inputStream != null) {
            Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
            bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        } else {
            bufferedReader = null;
        }
        BufferedReader bufferedReader2 = bufferedReader;
        try {
            BufferedReader bufferedReader3 = bufferedReader2;
            String text = bufferedReader3 != null ? TextStreamsKt.readText(bufferedReader3) : null;
            CloseableKt.closeFinally(bufferedReader2, null);
            return text;
        } finally {
        }
    }

    /* compiled from: LpmRepository.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/lpmfoundations/luxe/LpmRepository$Result;", "", "sharedDataSpecs", "", "Lcom/stripe/android/ui/core/elements/SharedDataSpec;", "failedToParseServerResponse", "", "failedToParseServerErrorMessage", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getSharedDataSpecs", "()Ljava/util/List;", "getFailedToParseServerResponse", "()Z", "getFailedToParseServerErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {
        public static final int $stable = 8;
        private final String failedToParseServerErrorMessage;
        private final boolean failedToParseServerResponse;
        private final List<SharedDataSpec> sharedDataSpecs;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, List list, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                list = result.sharedDataSpecs;
            }
            if ((i & 2) != 0) {
                z = result.failedToParseServerResponse;
            }
            if ((i & 4) != 0) {
                str = result.failedToParseServerErrorMessage;
            }
            return result.copy(list, z, str);
        }

        public final List<SharedDataSpec> component1() {
            return this.sharedDataSpecs;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFailedToParseServerResponse() {
            return this.failedToParseServerResponse;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFailedToParseServerErrorMessage() {
            return this.failedToParseServerErrorMessage;
        }

        public final Result copy(List<SharedDataSpec> sharedDataSpecs, boolean failedToParseServerResponse, String failedToParseServerErrorMessage) {
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            return new Result(sharedDataSpecs, failedToParseServerResponse, failedToParseServerErrorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return Intrinsics.areEqual(this.sharedDataSpecs, result.sharedDataSpecs) && this.failedToParseServerResponse == result.failedToParseServerResponse && Intrinsics.areEqual(this.failedToParseServerErrorMessage, result.failedToParseServerErrorMessage);
        }

        public int hashCode() {
            int iHashCode = ((this.sharedDataSpecs.hashCode() * 31) + Boolean.hashCode(this.failedToParseServerResponse)) * 31;
            String str = this.failedToParseServerErrorMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Result(sharedDataSpecs=" + this.sharedDataSpecs + ", failedToParseServerResponse=" + this.failedToParseServerResponse + ", failedToParseServerErrorMessage=" + this.failedToParseServerErrorMessage + ")";
        }

        public Result(List<SharedDataSpec> sharedDataSpecs, boolean z, String str) {
            Intrinsics.checkNotNullParameter(sharedDataSpecs, "sharedDataSpecs");
            this.sharedDataSpecs = sharedDataSpecs;
            this.failedToParseServerResponse = z;
            this.failedToParseServerErrorMessage = str;
        }

        public final List<SharedDataSpec> getSharedDataSpecs() {
            return this.sharedDataSpecs;
        }

        public final boolean getFailedToParseServerResponse() {
            return this.failedToParseServerResponse;
        }

        public final String getFailedToParseServerErrorMessage() {
            return this.failedToParseServerErrorMessage;
        }
    }
}
