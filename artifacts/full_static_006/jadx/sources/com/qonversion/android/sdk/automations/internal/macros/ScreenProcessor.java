package com.qonversion.android.sdk.automations.internal.macros;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.Qonversion;
import com.qonversion.android.sdk.automations.internal.macros.MacrosType;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.dto.products.QProduct;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.listeners.QonversionProductsCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ScreenProcessor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0002Jd\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u00102!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000b0\u0010H\u0002JT\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b0\u00102!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u000b0\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor;", "", "()V", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "convertMatchResultToMacros", "", "Lcom/qonversion/android/sdk/automations/internal/macros/Macros;", "matchResults", "Lkotlin/text/MatchResult;", "processMacroses", "", "originalHtml", "", "macroses", "onComplete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "processedHtml", "onError", "Lcom/qonversion/android/sdk/dto/QonversionError;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "processScreen", "html", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScreenProcessor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int MACROS_BRACKETS_NUMBER = 2;
    private static final String MACROS_CATEGORY_KEY = "category";
    private static final String MACROS_ID_KEY = "uid";
    private static final String MACROS_PRODUCT_CATEGORY = "product";
    private static final String MACROS_REGEX = "\\[\\[.*?\\]\\]";
    private static final String MACROS_TYPE_KEY = "type";
    private final ConsoleLogger logger = new ConsoleLogger();

    public final void processScreen(String html, final Function1<? super String, Unit> onComplete, final Function1<? super QonversionError, Unit> onError) {
        Intrinsics.checkNotNullParameter(html, "html");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        Intrinsics.checkNotNullParameter(onError, "onError");
        processMacroses(html, convertMatchResultToMacros(SequencesKt.toList(new Regex(MACROS_REGEX).findAll(html, 0))), new Function1<String, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor.processScreen.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onComplete.invoke(it);
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor.processScreen.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                invoke2(qonversionError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(QonversionError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onError.invoke(it);
            }
        });
    }

    private final List<Macros> convertMatchResultToMacros(List<? extends MatchResult> matchResults) throws JSONException {
        String string;
        String string2;
        String string3;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = matchResults.iterator();
        while (it.hasNext()) {
            String str = (String) CollectionsKt.first((List) ((MatchResult) it.next()).getGroupValues());
            try {
                JSONObject jSONObject = new JSONObject(StringsKt.dropLast(StringsKt.drop(str, 2), 2));
                string = jSONObject.getString(MACROS_CATEGORY_KEY);
                string2 = jSONObject.getString(MACROS_TYPE_KEY);
                string3 = jSONObject.getString(MACROS_ID_KEY);
            } catch (JSONException e) {
                this.logger.error("Failed to parse screen macros. " + e);
            }
            if (Intrinsics.areEqual(string, MACROS_PRODUCT_CATEGORY)) {
                Intrinsics.checkNotNull(string3);
                if (string3.length() != 0) {
                    MacrosType.Companion companion = MacrosType.INSTANCE;
                    Intrinsics.checkNotNull(string2);
                    arrayList.add(new Macros(companion.fromType(string2), string3, str));
                }
            }
            this.logger.error("Invalid macros value");
        }
        return arrayList;
    }

    private final void processMacroses(final String originalHtml, final List<Macros> macroses, final Function1<? super String, Unit> onComplete, final Function1<? super QonversionError, Unit> onError) {
        if (macroses.isEmpty()) {
            onComplete.invoke(originalHtml);
        } else {
            Qonversion.INSTANCE.getSharedInstance().products(new QonversionProductsCallback() { // from class: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor.processMacroses.1

                /* compiled from: ScreenProcessor.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                /* renamed from: com.qonversion.android.sdk.automations.internal.macros.ScreenProcessor$processMacroses$1$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[MacrosType.values().length];
                        try {
                            iArr[MacrosType.Price.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onSuccess(Map<String, QProduct> products) {
                    String prettyPrice;
                    Intrinsics.checkNotNullParameter(products, "products");
                    String str = originalHtml;
                    String strReplace$default = str;
                    for (Macros macros : macroses) {
                        QProduct qProduct = products.get(macros.getProductID());
                        if (qProduct != null) {
                            if (WhenMappings.$EnumSwitchMapping$0[macros.getType().ordinal()] == 1 && (prettyPrice = qProduct.getPrettyPrice()) != null) {
                                strReplace$default = StringsKt.replace$default(strReplace$default, macros.getOriginalMacrosString(), prettyPrice, false, 4, (Object) null);
                            }
                        }
                    }
                    onComplete.invoke(strReplace$default);
                }

                @Override // com.qonversion.android.sdk.listeners.QonversionProductsCallback
                public void onError(QonversionError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    onError.invoke(error);
                }
            });
        }
    }

    /* compiled from: ScreenProcessor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0002R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/qonversion/android/sdk/automations/internal/macros/ScreenProcessor$Companion;", "", "()V", "MACROS_BRACKETS_NUMBER", "", "MACROS_CATEGORY_KEY", "", "MACROS_ID_KEY", "MACROS_PRODUCT_CATEGORY", "MACROS_REGEX", "getMACROS_REGEX$annotations", "MACROS_TYPE_KEY", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void getMACROS_REGEX$annotations() {
        }

        private Companion() {
        }
    }
}
