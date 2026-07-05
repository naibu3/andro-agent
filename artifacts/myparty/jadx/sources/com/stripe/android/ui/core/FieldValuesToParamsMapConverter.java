package com.stripe.android.ui.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.stripe.android.model.Address;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodExtraParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.ui.core.FieldValuesToParamsMapConverter;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.ParameterDestination;
import com.stripe.android.uicore.forms.FormFieldEntry;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;

/* compiled from: FieldValuesToParamsMapConverter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter;", "", "<init>", "()V", "Companion", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FieldValuesToParamsMapConverter {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: FieldValuesToParamsMapConverter.kt */
    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J\u001c\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0002J6\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J*\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0007J6\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\n\u0010\n\u001a\u00060\u000bj\u0002`\fH\u0002J@\u0010\u001d\u001a\u00020\u001e2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H\u0002J;\u0010!\u001a\u00020\u001e2\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001c2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0$2\b\u0010%\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\b&J\u001b\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0$2\u0006\u0010(\u001a\u00020\u000bH\u0001¢\u0006\u0002\b)¨\u0006*"}, d2 = {"Lcom/stripe/android/ui/core/FieldValuesToParamsMapConverter$Companion;", "", "<init>", "()V", "transformToPaymentMethodCreateParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "fieldValuePairs", "", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "Lcom/stripe/android/uicore/forms/FormFieldEntry;", "code", "", "Lcom/stripe/android/model/PaymentMethodCode;", "requiresMandate", "", "allowRedisplay", "Lcom/stripe/android/model/PaymentMethod$AllowRedisplay;", "createBillingDetails", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "createAddress", "Lcom/stripe/android/model/Address;", "transformToPaymentMethodOptionsParams", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "transformToPaymentMethodExtraParams", "Lcom/stripe/android/model/PaymentMethodExtraParams;", "transformToParamsMap", "", "createMap", "", "dest", "formFieldKeyValues", "addPath", "map", "keys", "", "value", "addPath$payments_ui_core_release", "getKeys", TypedValues.Custom.S_STRING, "getKeys$payments_ui_core_release", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ PaymentMethodCreateParams transformToPaymentMethodCreateParams$default(Companion companion, Map map, String str, boolean z, PaymentMethod.AllowRedisplay allowRedisplay, int i, Object obj) {
            if ((i & 8) != 0) {
                allowRedisplay = null;
            }
            return companion.transformToPaymentMethodCreateParams(map, str, z, allowRedisplay);
        }

        private final PaymentMethod.BillingDetails createBillingDetails(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs) {
            PaymentMethod.BillingDetails.Builder builder = new PaymentMethod.BillingDetails.Builder();
            FormFieldEntry formFieldEntry = fieldValuePairs.get(IdentifierSpec.INSTANCE.getName());
            builder.setName(formFieldEntry != null ? formFieldEntry.getValue() : null);
            FormFieldEntry formFieldEntry2 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getEmail());
            builder.setEmail(formFieldEntry2 != null ? formFieldEntry2.getValue() : null);
            FormFieldEntry formFieldEntry3 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getPhone());
            builder.setPhone(formFieldEntry3 != null ? formFieldEntry3.getValue() : null);
            builder.setAddress(createAddress(fieldValuePairs));
            PaymentMethod.BillingDetails billingDetailsBuild = builder.build();
            if (billingDetailsBuild.isFilledOut()) {
                return billingDetailsBuild;
            }
            return null;
        }

        private final Address createAddress(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs) {
            Address.Builder builder = new Address.Builder();
            FormFieldEntry formFieldEntry = fieldValuePairs.get(IdentifierSpec.INSTANCE.getLine1());
            builder.setLine1(formFieldEntry != null ? formFieldEntry.getValue() : null);
            FormFieldEntry formFieldEntry2 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getLine2());
            builder.setLine2(formFieldEntry2 != null ? formFieldEntry2.getValue() : null);
            FormFieldEntry formFieldEntry3 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getCity());
            builder.setCity(formFieldEntry3 != null ? formFieldEntry3.getValue() : null);
            FormFieldEntry formFieldEntry4 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getState());
            builder.setState(formFieldEntry4 != null ? formFieldEntry4.getValue() : null);
            FormFieldEntry formFieldEntry5 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getCountry());
            builder.setCountry(formFieldEntry5 != null ? formFieldEntry5.getValue() : null);
            FormFieldEntry formFieldEntry6 = fieldValuePairs.get(IdentifierSpec.INSTANCE.getPostalCode());
            builder.setPostalCode(formFieldEntry6 != null ? formFieldEntry6.getValue() : null);
            return builder.build();
        }

        public static /* synthetic */ PaymentMethodOptionsParams transformToPaymentMethodOptionsParams$default(Companion companion, Map map, String str, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 4) != 0) {
                setupFutureUsage = null;
            }
            return companion.transformToPaymentMethodOptionsParams(map, str, setupFutureUsage);
        }

        private final Map<String, Object> transformToParamsMap(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code) {
            Map<String, Object> linkedHashMap = new LinkedHashMap<>();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (!entry.getKey().getIgnoreField()) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                linkedHashMap3.put(entry2.getKey(), ((FormFieldEntry) entry2.getValue()).getValue());
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap3.size()));
            for (Map.Entry entry3 : linkedHashMap3.entrySet()) {
                linkedHashMap4.put(((IdentifierSpec) entry3.getKey()).getV1(), entry3.getValue());
            }
            createMap(code, linkedHashMap, linkedHashMap4);
            return linkedHashMap;
        }

        private final void createMap(String code, Map<String, Object> dest, Map<String, String> formFieldKeyValues) {
            addPath$payments_ui_core_release(dest, CollectionsKt.listOf("type"), code);
            Iterator<T> it = formFieldKeyValues.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                FieldValuesToParamsMapConverter.INSTANCE.addPath$payments_ui_core_release(dest, FieldValuesToParamsMapConverter.INSTANCE.getKeys$payments_ui_core_release((String) entry.getKey()), (String) entry.getValue());
            }
        }

        public final void addPath$payments_ui_core_release(Map<String, Object> map, List<String> keys, String value) {
            Intrinsics.checkNotNullParameter(map, "map");
            Intrinsics.checkNotNullParameter(keys, "keys");
            if (keys.isEmpty()) {
                return;
            }
            String str = keys.get(0);
            if (keys.size() == 1) {
                map.put(str, value);
                return;
            }
            Object obj = map.get(str);
            LinkedHashMap linkedHashMap = TypeIntrinsics.isMutableMap(obj) ? (Map) obj : null;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                map.put(str, linkedHashMap);
            }
            addPath$payments_ui_core_release(linkedHashMap, keys.subList(1, keys.size()), value);
        }

        public final List<String> getKeys$payments_ui_core_release(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            return SequencesKt.toList(SequencesKt.filterNot(SequencesKt.flattenSequenceOfIterable(SequencesKt.map(Regex.findAll$default(new Regex("[*([A-Za-z_0-9]+)]*"), string, 0, 2, null), new Function1() { // from class: com.stripe.android.ui.core.FieldValuesToParamsMapConverter$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FieldValuesToParamsMapConverter.Companion.getKeys$lambda$11((MatchResult) obj);
                }
            })), new Function1() { // from class: com.stripe.android.ui.core.FieldValuesToParamsMapConverter$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(FieldValuesToParamsMapConverter.Companion.getKeys$lambda$12((String) obj));
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List getKeys$lambda$11(MatchResult it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getGroupValues();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean getKeys$lambda$12(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.length() == 0;
        }

        public final PaymentMethodCreateParams transformToPaymentMethodCreateParams(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code, boolean requiresMandate, PaymentMethod.AllowRedisplay allowRedisplay) {
            Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
            Intrinsics.checkNotNullParameter(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == ParameterDestination.Api.Params) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                if (!Intrinsics.areEqual(entry2.getKey(), IdentifierSpec.INSTANCE.getSaveForFutureUse()) && !Intrinsics.areEqual(entry2.getKey(), IdentifierSpec.INSTANCE.getCardBrand())) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            return PaymentMethodCreateParams.INSTANCE.createWithOverride(code, FieldValuesToParamsMapConverter.INSTANCE.createBillingDetails(linkedHashMap2), requiresMandate, MapsKt.toMap(FieldValuesToParamsMapConverterKt.filterOutNullValues(transformToParamsMap(linkedHashMap2, code))), SetsKt.emptySet(), allowRedisplay);
        }

        public final PaymentMethodOptionsParams transformToPaymentMethodOptionsParams(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
            Intrinsics.checkNotNullParameter(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == ParameterDestination.Api.Options) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.Card.code)) {
                return new PaymentMethodOptionsParams.Card(null, null, setupFutureUsage, 3, null);
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.Blik.code)) {
                FormFieldEntry formFieldEntry = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getBlikCode());
                String value = formFieldEntry != null ? formFieldEntry.getValue() : null;
                return value != null ? new PaymentMethodOptionsParams.Blik(value) : null;
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.Konbini.code)) {
                FormFieldEntry formFieldEntry2 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getKonbiniConfirmationNumber());
                String value2 = formFieldEntry2 != null ? formFieldEntry2.getValue() : null;
                return value2 != null ? new PaymentMethodOptionsParams.Konbini(value2) : null;
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.WeChatPay.code)) {
                return PaymentMethodOptionsParams.WeChatPayH5.INSTANCE;
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.SepaDebit.code)) {
                return new PaymentMethodOptionsParams.SepaDebit(setupFutureUsage);
            }
            return null;
        }

        public final PaymentMethodExtraParams transformToPaymentMethodExtraParams(Map<IdentifierSpec, FormFieldEntry> fieldValuePairs, String code) {
            String value;
            String value2;
            String value3;
            String value4;
            String value5;
            Intrinsics.checkNotNullParameter(fieldValuePairs, "fieldValuePairs");
            Intrinsics.checkNotNullParameter(code, "code");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<IdentifierSpec, FormFieldEntry> entry : fieldValuePairs.entrySet()) {
                if (entry.getKey().getDestination() == ParameterDestination.Local.Extras) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Boolean boolValueOf = null;
            if (Intrinsics.areEqual(code, PaymentMethod.Type.BacsDebit.code)) {
                FormFieldEntry formFieldEntry = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getBacsDebitConfirmed());
                if (formFieldEntry != null && (value5 = formFieldEntry.getValue()) != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value5));
                }
                return new PaymentMethodExtraParams.BacsDebit(boolValueOf);
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.Card.code)) {
                FormFieldEntry formFieldEntry2 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getSetAsDefaultPaymentMethod());
                if (formFieldEntry2 != null && (value4 = formFieldEntry2.getValue()) != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value4));
                }
                return new PaymentMethodExtraParams.Card(boolValueOf);
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.Link.code)) {
                FormFieldEntry formFieldEntry3 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getSetAsDefaultPaymentMethod());
                if (formFieldEntry3 != null && (value3 = formFieldEntry3.getValue()) != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value3));
                }
                return new PaymentMethodExtraParams.Link(boolValueOf);
            }
            if (Intrinsics.areEqual(code, PaymentMethod.Type.USBankAccount.code)) {
                FormFieldEntry formFieldEntry4 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getSetAsDefaultPaymentMethod());
                if (formFieldEntry4 != null && (value2 = formFieldEntry4.getValue()) != null) {
                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value2));
                }
                return new PaymentMethodExtraParams.USBankAccount(boolValueOf);
            }
            if (!Intrinsics.areEqual(code, PaymentMethod.Type.SepaDebit.code)) {
                return null;
            }
            FormFieldEntry formFieldEntry5 = (FormFieldEntry) linkedHashMap.get(IdentifierSpec.INSTANCE.getSetAsDefaultPaymentMethod());
            if (formFieldEntry5 != null && (value = formFieldEntry5.getValue()) != null) {
                boolValueOf = Boolean.valueOf(Boolean.parseBoolean(value));
            }
            return new PaymentMethodExtraParams.SepaDebit(boolValueOf);
        }
    }
}
