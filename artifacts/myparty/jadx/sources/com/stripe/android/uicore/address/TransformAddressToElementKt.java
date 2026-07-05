package com.stripe.android.uicore.address;

import androidx.compose.ui.text.input.KeyboardType;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.core.strings.ResolvableStringUtilsKt;
import com.stripe.android.uicore.elements.AdministrativeAreaConfig;
import com.stripe.android.uicore.elements.AdministrativeAreaElement;
import com.stripe.android.uicore.elements.DropdownFieldController;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.PostalCodeConfig;
import com.stripe.android.uicore.elements.RowController;
import com.stripe.android.uicore.elements.RowElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import com.stripe.android.uicore.elements.SectionSingleFieldElement;
import com.stripe.android.uicore.elements.SimpleTextElement;
import com.stripe.android.uicore.elements.SimpleTextFieldConfig;
import com.stripe.android.uicore.elements.SimpleTextFieldController;
import com.stripe.android.uicore.elements.TextFieldConfig;
import com.stripe.android.uicore.utils.AccessibilityKt;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: TransformAddressToElement.kt */
@Metadata(d1 = {"\u0000t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007\u001a\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0002\u001aC\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\u001c*\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a)\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110\b¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020$\u0018\u00010 *\u00020\u000eH\u0002\u001a\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\u0001H\u0002\u001a\u0018\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\rH\u0002\u001a\u0010\u0010*\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\u0017\u0010+\u001a\u00020\u00162\b\u0010,\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0002\u0010.\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"parseAddressesSchema", "", "Lcom/stripe/android/uicore/address/CountryAddressSchema;", "inputStream", "Ljava/io/InputStream;", "transformToElementList", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "countryCode", "", "format", "Lkotlinx/serialization/json/Json;", "getJsonStringFromInputStream", "toElement", "Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "Lcom/stripe/android/uicore/address/FieldType;", "identifierSpec", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "label", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "showOptionalLabel", "", "toElement-96KqDgQ", "(Lcom/stripe/android/uicore/address/FieldType;Lcom/stripe/android/uicore/elements/IdentifierSpec;IIILjava/lang/String;Z)Lcom/stripe/android/uicore/elements/SectionSingleFieldElement;", "toConfig", "Lcom/stripe/android/uicore/elements/TextFieldConfig;", "toConfig-25FCGzQ", "(Lcom/stripe/android/uicore/address/FieldType;IIILjava/lang/String;)Lcom/stripe/android/uicore/elements/TextFieldConfig;", "getOverrideContentDescription", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "fieldValue", "Lcom/stripe/android/core/strings/ResolvableString;", "combineCityAndPostal", "countryAddressElements", "isPostalNextToCity", "element1", "element2", "isCityOrPostal", "getKeyboard", "fieldSchema", "Lcom/stripe/android/uicore/address/FieldSchema;", "(Lcom/stripe/android/uicore/address/FieldSchema;)I", "stripe-ui-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransformAddressToElementKt {
    private static final Json format = JsonKt.Json$default(null, new Function1() { // from class: com.stripe.android.uicore.address.TransformAddressToElementKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return TransformAddressToElementKt.format$lambda$3((JsonBuilder) obj);
        }
    }, 1, null);

    /* compiled from: TransformAddressToElement.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldType.values().length];
            try {
                iArr[FieldType.AdministrativeArea.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldType.PostalCode.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<CountryAddressSchema> parseAddressesSchema(InputStream inputStream) {
        String jsonStringFromInputStream = getJsonStringFromInputStream(inputStream);
        if (jsonStringFromInputStream != null) {
            return (List) format.decodeFromString(BuiltinSerializersKt.ListSerializer(CountryAddressSchema.INSTANCE.serializer()), jsonStringFromInputStream);
        }
        return null;
    }

    public static final List<SectionFieldElement> transformToElementList(List<CountryAddressSchema> list, String countryCode) {
        String str;
        SectionSingleFieldElement sectionSingleFieldElementM8765toElement96KqDgQ;
        NameType nameType;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ArrayList<CountryAddressSchema> arrayList = new ArrayList();
        for (Object obj : list) {
            CountryAddressSchema countryAddressSchema = (CountryAddressSchema) obj;
            if (countryAddressSchema.getType() != FieldType.SortingCode && countryAddressSchema.getType() != FieldType.DependentLocality) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (CountryAddressSchema countryAddressSchema2 : arrayList) {
            FieldType type = countryAddressSchema2.getType();
            if (type != null) {
                IdentifierSpec identifierSpec = countryAddressSchema2.getType().getIdentifierSpec();
                FieldSchema schema = countryAddressSchema2.getSchema();
                str = countryCode;
                sectionSingleFieldElementM8765toElement96KqDgQ = m8765toElement96KqDgQ(type, identifierSpec, (schema == null || (nameType = schema.getNameType()) == null) ? countryAddressSchema2.getType().getDefaultLabel() : nameType.getStringResId(), countryAddressSchema2.getType().mo8760capitalizationIUNYP9k(), getKeyboard(countryAddressSchema2.getSchema()), str, !countryAddressSchema2.getRequired());
            } else {
                str = countryCode;
                sectionSingleFieldElementM8765toElement96KqDgQ = null;
            }
            if (sectionSingleFieldElementM8765toElement96KqDgQ != null) {
                arrayList2.add(sectionSingleFieldElementM8765toElement96KqDgQ);
            }
            countryCode = str;
        }
        return combineCityAndPostal(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit format$lambda$3(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    private static final String getJsonStringFromInputStream(InputStream inputStream) {
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

    /* renamed from: toElement-96KqDgQ, reason: not valid java name */
    private static final SectionSingleFieldElement m8765toElement96KqDgQ(FieldType fieldType, IdentifierSpec identifierSpec, int i, int i2, int i3, String str, boolean z) {
        AdministrativeAreaConfig.Country.US us;
        SimpleTextElement simpleTextElement = new SimpleTextElement(identifierSpec, new SimpleTextFieldController(m8764toConfig25FCGzQ(fieldType, i, i2, i3, str), z, null, getOverrideContentDescription(fieldType), 4, null));
        if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 1) {
            if (CollectionsKt.listOf((Object[]) new String[]{"CA", "US"}).contains(str)) {
                if (Intrinsics.areEqual(str, "CA")) {
                    us = new AdministrativeAreaConfig.Country.Canada(0, null, 3, null);
                } else {
                    if (!Intrinsics.areEqual(str, "US")) {
                        throw new IllegalArgumentException();
                    }
                    us = new AdministrativeAreaConfig.Country.US(0, null, 3, null);
                }
                return new AdministrativeAreaElement(identifierSpec, new DropdownFieldController(new AdministrativeAreaConfig(us), null, 2, null));
            }
            return simpleTextElement;
        }
        return simpleTextElement;
    }

    /* renamed from: toConfig-25FCGzQ, reason: not valid java name */
    private static final TextFieldConfig m8764toConfig25FCGzQ(FieldType fieldType, int i, int i2, int i3, String str) {
        if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 2) {
            return new PostalCodeConfig(ResolvableStringUtilsKt.resolvableString$default(i, new Object[0], null, 4, null), null, str, 2, null);
        }
        return new SimpleTextFieldConfig(ResolvableStringUtilsKt.resolvableString$default(i, new Object[0], null, 4, null), i2, i3, null, 8, null);
    }

    private static final Function1<String, ResolvableString> getOverrideContentDescription(FieldType fieldType) {
        if (WhenMappings.$EnumSwitchMapping$0[fieldType.ordinal()] == 2) {
            return new Function1() { // from class: com.stripe.android.uicore.address.TransformAddressToElementKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransformAddressToElementKt.getOverrideContentDescription$lambda$5((String) obj);
                }
            };
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ResolvableString getOverrideContentDescription$lambda$5(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ResolvableStringUtilsKt.getResolvableString(AccessibilityKt.asIndividualDigits(it));
    }

    private static final List<SectionFieldElement> combineCityAndPostal(List<? extends SectionSingleFieldElement> list) {
        List listEmptyList = CollectionsKt.emptyList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SectionSingleFieldElement sectionSingleFieldElement = (SectionSingleFieldElement) obj;
            if (i2 < list.size() && isPostalNextToCity(list.get(i), list.get(i2))) {
                List listListOf = CollectionsKt.listOf((Object[]) new SectionSingleFieldElement[]{list.get(i), list.get(i2)});
                listEmptyList = CollectionsKt.plus((Collection<? extends RowElement>) listEmptyList, new RowElement(IdentifierSpec.INSTANCE.Generic("row_" + UUID.randomUUID().getLeastSignificantBits()), listListOf, new RowController(listListOf)));
            } else if (CollectionsKt.lastOrNull(listEmptyList) instanceof RowElement) {
                listEmptyList = CollectionsKt.plus((Collection<? extends Object>) listEmptyList, (Object) null);
            } else {
                listEmptyList = CollectionsKt.plus((Collection<? extends SectionSingleFieldElement>) listEmptyList, sectionSingleFieldElement);
            }
            i = i2;
        }
        return CollectionsKt.filterNotNull(listEmptyList);
    }

    private static final boolean isPostalNextToCity(SectionSingleFieldElement sectionSingleFieldElement, SectionSingleFieldElement sectionSingleFieldElement2) {
        return isCityOrPostal(sectionSingleFieldElement.getIdentifier()) && isCityOrPostal(sectionSingleFieldElement2.getIdentifier());
    }

    private static final boolean isCityOrPostal(IdentifierSpec identifierSpec) {
        return Intrinsics.areEqual(identifierSpec, IdentifierSpec.INSTANCE.getPostalCode()) || Intrinsics.areEqual(identifierSpec, IdentifierSpec.INSTANCE.getCity());
    }

    private static final int getKeyboard(FieldSchema fieldSchema) {
        if (fieldSchema != null && fieldSchema.getIsNumeric()) {
            return KeyboardType.INSTANCE.m5838getNumberPasswordPjHm6EE();
        }
        return KeyboardType.INSTANCE.m5841getTextPjHm6EE();
    }
}
