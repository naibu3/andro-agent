package com.stripe.android.ui.core.elements;

import android.os.Parcelable;
import com.stripe.android.core.strings.ResolvableString;
import com.stripe.android.uicore.elements.IdentifierSpec;
import com.stripe.android.uicore.elements.SectionElement;
import com.stripe.android.uicore.elements.SectionFieldElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;

/* compiled from: FormItemSpec.kt */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u000fJ'\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b\u000fR\u001a\u0010\u0004\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0018\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*¨\u0006+"}, d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpec;", "Landroid/os/Parcelable;", "<init>", "()V", "apiPath", "Lcom/stripe/android/uicore/elements/IdentifierSpec;", "getApiPath$annotations", "getApiPath", "()Lcom/stripe/android/uicore/elements/IdentifierSpec;", "createSectionElement", "Lcom/stripe/android/uicore/elements/SectionElement;", "sectionFieldElement", "Lcom/stripe/android/uicore/elements/SectionFieldElement;", "label", "Lcom/stripe/android/core/strings/ResolvableString;", "createSectionElement$payments_ui_core_release", "sectionFieldElements", "", "Companion", "Lcom/stripe/android/ui/core/elements/AddressSpec;", "Lcom/stripe/android/ui/core/elements/AffirmTextSpec;", "Lcom/stripe/android/ui/core/elements/AfterpayClearpayTextSpec;", "Lcom/stripe/android/ui/core/elements/AuBankAccountNumberSpec;", "Lcom/stripe/android/ui/core/elements/AuBecsDebitMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/BacsDebitBankAccountSpec;", "Lcom/stripe/android/ui/core/elements/BacsDebitConfirmSpec;", "Lcom/stripe/android/ui/core/elements/BsbSpec;", "Lcom/stripe/android/ui/core/elements/CashAppPayMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/CountrySpec;", "Lcom/stripe/android/ui/core/elements/DropdownSpec;", "Lcom/stripe/android/ui/core/elements/EmailSpec;", "Lcom/stripe/android/ui/core/elements/EmptyFormSpec;", "Lcom/stripe/android/ui/core/elements/IbanSpec;", "Lcom/stripe/android/ui/core/elements/KlarnaHeaderStaticTextSpec;", "Lcom/stripe/android/ui/core/elements/KlarnaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/MandateTextSpec;", "Lcom/stripe/android/ui/core/elements/NameSpec;", "Lcom/stripe/android/ui/core/elements/OTPSpec;", "Lcom/stripe/android/ui/core/elements/PhoneSpec;", "Lcom/stripe/android/ui/core/elements/PlaceholderSpec;", "Lcom/stripe/android/ui/core/elements/SepaMandateTextSpec;", "Lcom/stripe/android/ui/core/elements/SimpleTextSpec;", "Lcom/stripe/android/ui/core/elements/StaticTextSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable(with = FormItemSpecSerializer.class)
/* loaded from: classes6.dex */
public abstract class FormItemSpec implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ FormItemSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @SerialName("api_path")
    public static /* synthetic */ void getApiPath$annotations() {
    }

    public abstract IdentifierSpec getApiPath();

    /* compiled from: FormItemSpec.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/ui/core/elements/FormItemSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/ui/core/elements/FormItemSpec;", "payments-ui-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FormItemSpec> serializer() {
            return FormItemSpecSerializer.INSTANCE;
        }
    }

    private FormItemSpec() {
    }

    public static /* synthetic */ SectionElement createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, SectionFieldElement sectionFieldElement, ResolvableString resolvableString, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
        }
        if ((i & 2) != 0) {
            resolvableString = null;
        }
        return formItemSpec.createSectionElement$payments_ui_core_release(sectionFieldElement, resolvableString);
    }

    public final SectionElement createSectionElement$payments_ui_core_release(SectionFieldElement sectionFieldElement, ResolvableString label) {
        Intrinsics.checkNotNullParameter(sectionFieldElement, "sectionFieldElement");
        return SectionElement.INSTANCE.wrap(sectionFieldElement, label);
    }

    public static /* synthetic */ SectionElement createSectionElement$payments_ui_core_release$default(FormItemSpec formItemSpec, List list, ResolvableString resolvableString, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSectionElement");
        }
        if ((i & 2) != 0) {
            resolvableString = null;
        }
        return formItemSpec.createSectionElement$payments_ui_core_release((List<? extends SectionFieldElement>) list, resolvableString);
    }

    public final SectionElement createSectionElement$payments_ui_core_release(List<? extends SectionFieldElement> sectionFieldElements, ResolvableString label) {
        Intrinsics.checkNotNullParameter(sectionFieldElements, "sectionFieldElements");
        return SectionElement.INSTANCE.wrap(sectionFieldElements, label);
    }
}
