package com.stripe.android.ui.core.elements;

import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;

/* compiled from: FormItemSpec.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpecSerializer;", "Lkotlinx/serialization/json/JsonContentPolymorphicSerializer;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "<init>", "()V", "selectDeserializer", "Lkotlinx/serialization/DeserializationStrategy;", "element", "Lkotlinx/serialization/json/JsonElement;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FormItemSpecSerializer extends JsonContentPolymorphicSerializer<FormItemSpec> {
    public static final int $stable = 0;
    public static final FormItemSpecSerializer INSTANCE = new FormItemSpecSerializer();

    private FormItemSpecSerializer() {
        super(Reflection.getOrCreateKotlinClass(FormItemSpec.class));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    protected DeserializationStrategy<FormItemSpec> selectDeserializer(JsonElement element) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(element, "element");
        JsonElement jsonElement = (JsonElement) JsonElementKt.getJsonObject(element).get((Object) "type");
        String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            switch (content.hashCode()) {
                case -1922029177:
                    if (content.equals("klarna_header")) {
                        return KlarnaHeaderStaticTextSpec.INSTANCE.serializer();
                    }
                    break;
                case -1884659095:
                    if (content.equals("affirm_header")) {
                        return AffirmTextSpec.INSTANCE.serializer();
                    }
                    break;
                case -910686504:
                    if (content.equals("au_becs_bsb_number")) {
                        return BsbSpec.INSTANCE.serializer();
                    }
                    break;
                case -516244944:
                    if (content.equals("billing_address")) {
                        return AddressSpec.INSTANCE.serializer();
                    }
                    break;
                case -185531168:
                    if (content.equals("afterpay_header")) {
                        return AfterpayClearpayTextSpec.INSTANCE.serializer();
                    }
                    break;
                case -9348212:
                    if (content.equals("sepa_mandate")) {
                        return SepaMandateTextSpec.INSTANCE.serializer();
                    }
                    break;
                case 3225350:
                    if (content.equals("iban")) {
                        return IbanSpec.INSTANCE.serializer();
                    }
                    break;
                case 3373707:
                    if (content.equals("name")) {
                        return NameSpec.INSTANCE.serializer();
                    }
                    break;
                case 3556653:
                    if (content.equals("text")) {
                        return SimpleTextSpec.INSTANCE.serializer();
                    }
                    break;
                case 40435420:
                    if (content.equals("au_becs_account_number")) {
                        return AuBankAccountNumberSpec.INSTANCE.serializer();
                    }
                    break;
                case 96619420:
                    if (content.equals("email")) {
                        return EmailSpec.INSTANCE.serializer();
                    }
                    break;
                case 598246771:
                    if (content.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                        return PlaceholderSpec.INSTANCE.serializer();
                    }
                    break;
                case 709160924:
                    if (content.equals("klarna_country")) {
                        return CountrySpec.INSTANCE.serializer();
                    }
                    break;
                case 835344392:
                    if (content.equals("mandate")) {
                        return MandateTextSpec.INSTANCE.serializer();
                    }
                    break;
                case 885589086:
                    if (content.equals("static_text")) {
                        return StaticTextSpec.INSTANCE.serializer();
                    }
                    break;
                case 957831062:
                    if (content.equals("country")) {
                        return CountrySpec.INSTANCE.serializer();
                    }
                    break;
                case 1191572447:
                    if (content.equals("selector")) {
                        return DropdownSpec.INSTANCE.serializer();
                    }
                    break;
                case 1255817703:
                    if (content.equals("au_becs_mandate")) {
                        return AuBecsDebitMandateTextSpec.INSTANCE.serializer();
                    }
                    break;
            }
        }
        return EmptyFormSpec.INSTANCE.serializer();
    }
}
