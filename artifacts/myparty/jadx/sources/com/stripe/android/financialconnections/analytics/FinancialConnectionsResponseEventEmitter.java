package com.stripe.android.financialconnections.analytics;

import com.stripe.android.core.Logger;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.ResponseJsonKt;
import com.stripe.android.core.networking.StripeResponse;
import com.stripe.android.financialconnections.FinancialConnections;
import com.stripe.android.financialconnections.analytics.FinancialConnectionsEvent;
import com.stripe.android.financialconnections.model.UserFacingEventResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.json.JSONObject;

/* compiled from: FinancialConnectionsResponseEventEmitter.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u000e\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsResponseEventEmitter;", "", "json", "Lkotlinx/serialization/json/Json;", "logger", "Lcom/stripe/android/core/Logger;", "<init>", "(Lkotlinx/serialization/json/Json;Lcom/stripe/android/core/Logger;)V", "emitIfPresent", "", "response", "Lcom/stripe/android/core/networking/StripeResponse;", "", "(Lcom/stripe/android/core/networking/StripeResponse;)Lkotlin/Unit;", "eventsToEmit", "toEvent", "Lcom/stripe/android/financialconnections/analytics/FinancialConnectionsEvent;", "Lcom/stripe/android/financialconnections/model/UserFacingEventResponse;", "Companion", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FinancialConnectionsResponseEventEmitter {
    public static final String EVENTS_TO_EMIT = "events_to_emit";
    private final Json json;
    private final Logger logger;
    public static final int $stable = 8;

    @Inject
    public FinancialConnectionsResponseEventEmitter(Json json, Logger logger) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.json = json;
        this.logger = logger;
    }

    public final Unit emitIfPresent(StripeResponse<String> response) {
        Object objM9118constructorimpl;
        Unit unit;
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            Result.Companion companion = Result.INSTANCE;
            FinancialConnectionsResponseEventEmitter financialConnectionsResponseEventEmitter = this;
            String strEventsToEmit = eventsToEmit(response);
            if (strEventsToEmit != null) {
                Iterable iterable = (Iterable) this.json.decodeFromString(BuiltinSerializersKt.ListSerializer(UserFacingEventResponse.INSTANCE.serializer()), strEventsToEmit);
                ArrayList<FinancialConnectionsEvent> arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    FinancialConnectionsEvent event = toEvent((UserFacingEventResponse) it.next());
                    if (event != null) {
                        arrayList.add(event);
                    }
                }
                for (FinancialConnectionsEvent financialConnectionsEvent : arrayList) {
                    this.logger.debug("Emitting event " + financialConnectionsEvent.getName() + " with metadata " + financialConnectionsEvent.getMetadata());
                    FinancialConnections.INSTANCE.m7282emitEventgIAlus$financial_connections_release(financialConnectionsEvent.getName(), financialConnectionsEvent.getMetadata());
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            objM9118constructorimpl = Result.m9118constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl != null) {
            this.logger.error("Error decoding event response", thM9121exceptionOrNullimpl);
        }
        return (Unit) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
    }

    private final String eventsToEmit(StripeResponse<String> stripeResponse) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = (!stripeResponse.getIsError() || (jSONObjectOptJSONObject = ResponseJsonKt.responseJson(stripeResponse).optJSONObject("error")) == null) ? null : jSONObjectOptJSONObject.optJSONObject(StripeErrorJsonParser.FIELD_EXTRA_FIELDS);
        if (jSONObjectOptJSONObject2 == null || (strOptString = jSONObjectOptJSONObject2.optString(EVENTS_TO_EMIT)) == null || strOptString.length() <= 0) {
            return null;
        }
        return strOptString;
    }

    private final FinancialConnectionsEvent toEvent(UserFacingEventResponse userFacingEventResponse) {
        Object objM9118constructorimpl;
        FinancialConnectionsEvent.ErrorCode errorCode;
        String errorCode2;
        FinancialConnectionsEvent.ErrorCode next;
        try {
            Result.Companion companion = Result.INSTANCE;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
        }
        for (FinancialConnectionsEvent.Name name : FinancialConnectionsEvent.Name.getEntries()) {
            if (Intrinsics.areEqual(name.getValue(), userFacingEventResponse.getType())) {
                FinancialConnectionsEvent.Name name2 = name;
                UserFacingEventResponse.Error error = userFacingEventResponse.getError();
                if (error == null || (errorCode2 = error.getErrorCode()) == null) {
                    errorCode = null;
                } else {
                    Iterator<FinancialConnectionsEvent.ErrorCode> it = FinancialConnectionsEvent.ErrorCode.getEntries().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (Intrinsics.areEqual(next.getValue(), errorCode2)) {
                            break;
                        }
                    }
                    errorCode = next;
                    if (errorCode == null) {
                        errorCode = FinancialConnectionsEvent.ErrorCode.UNEXPECTED_ERROR;
                    }
                }
                UserFacingEventResponse.InstitutionSelected institutionSelected = userFacingEventResponse.getInstitutionSelected();
                String institutionName = institutionSelected != null ? institutionSelected.getInstitutionName() : null;
                UserFacingEventResponse.Success success = userFacingEventResponse.getSuccess();
                objM9118constructorimpl = Result.m9118constructorimpl(new FinancialConnectionsEvent(name2, new FinancialConnectionsEvent.Metadata(institutionName, success != null ? Boolean.valueOf(success.getManualEntry()) : null, errorCode)));
                Throwable thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl != null) {
                    this.logger.error("Error mapping event response", thM9121exceptionOrNullimpl);
                }
                return (FinancialConnectionsEvent) (Result.m9124isFailureimpl(objM9118constructorimpl) ? null : objM9118constructorimpl);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
