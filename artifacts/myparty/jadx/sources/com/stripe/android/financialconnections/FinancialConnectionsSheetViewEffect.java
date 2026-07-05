package com.stripe.android.financialconnections;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetFlowType;
import com.stripe.android.financialconnections.model.SynchronizeSessionResponse;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FinancialConnectionsSheetState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "", "<init>", "()V", "OpenNativeAuthFlow", "OpenAuthFlowWithUrl", "FinishWithResult", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class FinancialConnectionsSheetViewEffect {
    public static final int $stable = 0;

    public /* synthetic */ FinancialConnectionsSheetViewEffect(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FinancialConnectionsSheetViewEffect() {
    }

    /* compiled from: FinancialConnectionsSheetState.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenNativeAuthFlow;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "flowType", "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "configuration", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "initialSyncResponse", "Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "elementsSessionContext", "Lcom/stripe/android/financialconnections/ElementsSessionContext;", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;Lcom/stripe/android/financialconnections/ElementsSessionContext;)V", "getFlowType", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetFlowType;", "getConfiguration", "()Lcom/stripe/android/financialconnections/FinancialConnectionsSheetConfiguration;", "getInitialSyncResponse", "()Lcom/stripe/android/financialconnections/model/SynchronizeSessionResponse;", "getElementsSessionContext", "()Lcom/stripe/android/financialconnections/ElementsSessionContext;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenNativeAuthFlow extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 8;
        private final FinancialConnectionsSheetConfiguration configuration;
        private final ElementsSessionContext elementsSessionContext;
        private final FinancialConnectionsSheetFlowType flowType;
        private final SynchronizeSessionResponse initialSyncResponse;

        public static /* synthetic */ OpenNativeAuthFlow copy$default(OpenNativeAuthFlow openNativeAuthFlow, FinancialConnectionsSheetFlowType financialConnectionsSheetFlowType, FinancialConnectionsSheetConfiguration financialConnectionsSheetConfiguration, SynchronizeSessionResponse synchronizeSessionResponse, ElementsSessionContext elementsSessionContext, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetFlowType = openNativeAuthFlow.flowType;
            }
            if ((i & 2) != 0) {
                financialConnectionsSheetConfiguration = openNativeAuthFlow.configuration;
            }
            if ((i & 4) != 0) {
                synchronizeSessionResponse = openNativeAuthFlow.initialSyncResponse;
            }
            if ((i & 8) != 0) {
                elementsSessionContext = openNativeAuthFlow.elementsSessionContext;
            }
            return openNativeAuthFlow.copy(financialConnectionsSheetFlowType, financialConnectionsSheetConfiguration, synchronizeSessionResponse, elementsSessionContext);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetFlowType getFlowType() {
            return this.flowType;
        }

        /* renamed from: component2, reason: from getter */
        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        /* renamed from: component3, reason: from getter */
        public final SynchronizeSessionResponse getInitialSyncResponse() {
            return this.initialSyncResponse;
        }

        /* renamed from: component4, reason: from getter */
        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        public final OpenNativeAuthFlow copy(FinancialConnectionsSheetFlowType flowType, FinancialConnectionsSheetConfiguration configuration, SynchronizeSessionResponse initialSyncResponse, ElementsSessionContext elementsSessionContext) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
            return new OpenNativeAuthFlow(flowType, configuration, initialSyncResponse, elementsSessionContext);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OpenNativeAuthFlow)) {
                return false;
            }
            OpenNativeAuthFlow openNativeAuthFlow = (OpenNativeAuthFlow) other;
            return this.flowType == openNativeAuthFlow.flowType && Intrinsics.areEqual(this.configuration, openNativeAuthFlow.configuration) && Intrinsics.areEqual(this.initialSyncResponse, openNativeAuthFlow.initialSyncResponse) && Intrinsics.areEqual(this.elementsSessionContext, openNativeAuthFlow.elementsSessionContext);
        }

        public int hashCode() {
            int iHashCode = ((((this.flowType.hashCode() * 31) + this.configuration.hashCode()) * 31) + this.initialSyncResponse.hashCode()) * 31;
            ElementsSessionContext elementsSessionContext = this.elementsSessionContext;
            return iHashCode + (elementsSessionContext == null ? 0 : elementsSessionContext.hashCode());
        }

        public String toString() {
            return "OpenNativeAuthFlow(flowType=" + this.flowType + ", configuration=" + this.configuration + ", initialSyncResponse=" + this.initialSyncResponse + ", elementsSessionContext=" + this.elementsSessionContext + ")";
        }

        public final FinancialConnectionsSheetFlowType getFlowType() {
            return this.flowType;
        }

        public final FinancialConnectionsSheetConfiguration getConfiguration() {
            return this.configuration;
        }

        public final SynchronizeSessionResponse getInitialSyncResponse() {
            return this.initialSyncResponse;
        }

        public final ElementsSessionContext getElementsSessionContext() {
            return this.elementsSessionContext;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenNativeAuthFlow(FinancialConnectionsSheetFlowType flowType, FinancialConnectionsSheetConfiguration configuration, SynchronizeSessionResponse initialSyncResponse, ElementsSessionContext elementsSessionContext) {
            super(null);
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(initialSyncResponse, "initialSyncResponse");
            this.flowType = flowType;
            this.configuration = configuration;
            this.initialSyncResponse = initialSyncResponse;
            this.elementsSessionContext = elementsSessionContext;
        }
    }

    /* compiled from: FinancialConnectionsSheetState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$OpenAuthFlowWithUrl;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenAuthFlowWithUrl extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 0;
        private final String url;

        public static /* synthetic */ OpenAuthFlowWithUrl copy$default(OpenAuthFlowWithUrl openAuthFlowWithUrl, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openAuthFlowWithUrl.url;
            }
            return openAuthFlowWithUrl.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final OpenAuthFlowWithUrl copy(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new OpenAuthFlowWithUrl(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OpenAuthFlowWithUrl) && Intrinsics.areEqual(this.url, ((OpenAuthFlowWithUrl) other).url);
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        public String toString() {
            return "OpenAuthFlowWithUrl(url=" + this.url + ")";
        }

        public final String getUrl() {
            return this.url;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenAuthFlowWithUrl(String url) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }
    }

    /* compiled from: FinancialConnectionsSheetState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;", "Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect;", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "finishToast", "", "<init>", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)V", "getResult", "()Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;", "getFinishToast", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetActivityResult;Ljava/lang/Integer;)Lcom/stripe/android/financialconnections/FinancialConnectionsSheetViewEffect$FinishWithResult;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FinishWithResult extends FinancialConnectionsSheetViewEffect {
        public static final int $stable = 8;
        private final Integer finishToast;
        private final FinancialConnectionsSheetActivityResult result;

        public static /* synthetic */ FinishWithResult copy$default(FinishWithResult finishWithResult, FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                financialConnectionsSheetActivityResult = finishWithResult.result;
            }
            if ((i & 2) != 0) {
                num = finishWithResult.finishToast;
            }
            return finishWithResult.copy(financialConnectionsSheetActivityResult, num);
        }

        /* renamed from: component1, reason: from getter */
        public final FinancialConnectionsSheetActivityResult getResult() {
            return this.result;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getFinishToast() {
            return this.finishToast;
        }

        public final FinishWithResult copy(FinancialConnectionsSheetActivityResult result, Integer finishToast) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new FinishWithResult(result, finishToast);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FinishWithResult)) {
                return false;
            }
            FinishWithResult finishWithResult = (FinishWithResult) other;
            return Intrinsics.areEqual(this.result, finishWithResult.result) && Intrinsics.areEqual(this.finishToast, finishWithResult.finishToast);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            Integer num = this.finishToast;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "FinishWithResult(result=" + this.result + ", finishToast=" + this.finishToast + ")";
        }

        public /* synthetic */ FinishWithResult(FinancialConnectionsSheetActivityResult financialConnectionsSheetActivityResult, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(financialConnectionsSheetActivityResult, (i & 2) != 0 ? null : num);
        }

        public final FinancialConnectionsSheetActivityResult getResult() {
            return this.result;
        }

        public final Integer getFinishToast() {
            return this.finishToast;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinishWithResult(FinancialConnectionsSheetActivityResult result, Integer num) {
            super(null);
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.finishToast = num;
        }
    }
}
