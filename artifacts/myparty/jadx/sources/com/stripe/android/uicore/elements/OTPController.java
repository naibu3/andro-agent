package com.stripe.android.uicore.elements;

import androidx.compose.ui.text.input.KeyboardType;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.react.uimanager.ViewProps;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.android.uicore.utils.StateFlowsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

/* compiled from: OTPController.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\tJ\u0006\u0010\u001d\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\f\u0010\u0007R \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00100\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/stripe/android/uicore/elements/OTPController;", "Lcom/stripe/android/uicore/elements/Controller;", "otpLength", "", "<init>", "(I)V", "getOtpLength", "()I", "autofillAccumulator", "", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "getKeyboardType-PjHm6EE$stripe_ui_core_release", "I", "fieldValues", "", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getFieldValues$stripe_ui_core_release", "()Ljava/util/List;", "fieldValue", "Lkotlinx/coroutines/flow/StateFlow;", "getFieldValue", "()Lkotlinx/coroutines/flow/StateFlow;", "onValueChanged", "index", "text", "onAutofillDigit", "", "digit", "reset", ViewProps.FILTER, "userTyped", "Companion", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OTPController implements Controller {
    private String autofillAccumulator;
    private final StateFlow<String> fieldValue;
    private final List<MutableStateFlow<String>> fieldValues;
    private final int keyboardType;
    private final int otpLength;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final CharRange VALID_INPUT_RANGES = new CharRange('0', '9');

    public OTPController() {
        this(0, 1, null);
    }

    public OTPController(int i) {
        Flow<String> flowStateFlowOf;
        this.otpLength = i;
        this.autofillAccumulator = "";
        this.keyboardType = KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
        IntRange intRangeUntil = RangesKt.until(0, i);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(StateFlowKt.MutableStateFlow(""));
        }
        final ArrayList arrayList2 = arrayList;
        this.fieldValues = arrayList2;
        if (arrayList2.isEmpty()) {
            flowStateFlowOf = StateFlowsKt.stateFlowOf(CollectionsKt.joinToString$default(CollectionsKt.emptyList(), "", null, null, 0, null, null, 62, null));
        } else {
            final Flow[] flowArr = (Flow[]) CollectionsKt.toList(arrayList2).toArray(new Flow[0]);
            flowStateFlowOf = new Flow<String>() { // from class: com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                    Flow[] flowArr2 = flowArr;
                    final Flow[] flowArr3 = flowArr;
                    Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr2, new Function0<String[]>() { // from class: com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public final String[] invoke() {
                            return new String[flowArr3.length];
                        }
                    }, new AnonymousClass3(null), continuation);
                    return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : Unit.INSTANCE;
                }

                /* compiled from: Zip.kt */
                @Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\b"}, d2 = {"<anonymous>", "", "R", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2", "com/stripe/android/uicore/utils/StateFlowsKt$combineAsStateFlow$$inlined$combine$1$3"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$1$3", f = "OTPController.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$1$3, reason: invalid class name */
                public static final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super String>, String[], Continuation<? super Unit>, Object> {
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    public AnonymousClass3(Continuation continuation) {
                        super(3, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(FlowCollector<? super String> flowCollector, String[] strArr, Continuation<? super Unit> continuation) {
                        AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                        anonymousClass3.L$0 = flowCollector;
                        anonymousClass3.L$1 = strArr;
                        return anonymousClass3.invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            FlowCollector flowCollector = (FlowCollector) this.L$0;
                            String strJoinToString$default = CollectionsKt.joinToString$default(ArraysKt.toList((Object[]) this.L$1), "", null, null, 0, null, null, 62, null);
                            this.label = 1;
                            if (flowCollector.emit(strJoinToString$default, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
        }
        this.fieldValue = new FlowToStateFlow(flowStateFlowOf, new Function0<String>() { // from class: com.stripe.android.uicore.elements.OTPController$special$$inlined$combineAsStateFlow$2
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                List list = arrayList2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StateFlow) it2.next()).getValue());
                }
                return CollectionsKt.joinToString$default(arrayList3, "", null, null, 0, null, null, 62, null);
            }
        });
    }

    public /* synthetic */ OTPController(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final int getOtpLength() {
        return this.otpLength;
    }

    /* renamed from: getKeyboardType-PjHm6EE$stripe_ui_core_release, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    public final List<MutableStateFlow<String>> getFieldValues$stripe_ui_core_release() {
        return this.fieldValues;
    }

    public final StateFlow<String> getFieldValue() {
        return this.fieldValue;
    }

    public final int onValueChanged(int index, String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        if (Intrinsics.areEqual(text, this.fieldValues.get(index).getValue())) {
            return 1;
        }
        if (text.length() == 0) {
            this.fieldValues.get(index).setValue("");
            return 0;
        }
        String strFilter = filter(text);
        int length = strFilter.length();
        int i = this.otpLength;
        if (length == i) {
            index = 0;
        }
        int iMin = Math.min(i, strFilter.length());
        Iterator<Integer> it = RangesKt.until(0, iMin).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            this.fieldValues.get(index + iNextInt).setValue(String.valueOf(strFilter.charAt(iNextInt)));
        }
        return iMin;
    }

    public final void onAutofillDigit(String digit) throws IOException {
        Intrinsics.checkNotNullParameter(digit, "digit");
        String str = this.autofillAccumulator + digit;
        this.autofillAccumulator = str;
        if (str.length() == this.otpLength) {
            onValueChanged(0, this.autofillAccumulator);
            this.autofillAccumulator = "";
        }
    }

    public final void reset() {
        Iterator<T> it = this.fieldValues.iterator();
        while (it.hasNext()) {
            ((MutableStateFlow) it.next()).setValue("");
        }
    }

    /* compiled from: OTPController.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/uicore/elements/OTPController$Companion;", "", "<init>", "()V", "VALID_INPUT_RANGES", "Lkotlin/ranges/CharRange;", "getVALID_INPUT_RANGES", "()Lkotlin/ranges/CharRange;", "stripe-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CharRange getVALID_INPUT_RANGES() {
            return OTPController.VALID_INPUT_RANGES;
        }
    }

    private final String filter(String userTyped) throws IOException {
        String str = userTyped;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (VALID_INPUT_RANGES.contains(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
