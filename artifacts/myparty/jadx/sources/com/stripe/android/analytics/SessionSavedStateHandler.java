package com.stripe.android.analytics;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.stripe.android.analytics.Session;
import com.stripe.android.core.networking.AnalyticsRequestFactory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SessionSavedStateHandler.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0007R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/analytics/SessionSavedStateHandler;", "", "<init>", "()V", "SESSION_KEY", "", "getSESSION_KEY$payments_core_release$annotations", "sessionLocked", "", "attachTo", "Lkotlin/Function0;", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "startSession", "restartSession", "clearSession", "clear", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SessionSavedStateHandler {
    public static final String SESSION_KEY = "STRIPE_ANALYTICS_LOCAL_SESSION";
    private static boolean sessionLocked;
    public static final SessionSavedStateHandler INSTANCE = new SessionSavedStateHandler();
    public static final int $stable = 8;

    public static /* synthetic */ void getSESSION_KEY$payments_core_release$annotations() {
    }

    private SessionSavedStateHandler() {
    }

    public final Function0<Unit> attachTo(ViewModel viewModel, final SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        startSession(savedStateHandle);
        viewModel.addCloseable(new AutoCloseable() { // from class: com.stripe.android.analytics.SessionSavedStateHandler$$ExternalSyntheticLambda0
            @Override // java.lang.AutoCloseable
            public final void close() {
                SessionSavedStateHandler.attachTo$lambda$0(savedStateHandle);
            }
        });
        return new Function0() { // from class: com.stripe.android.analytics.SessionSavedStateHandler$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SessionSavedStateHandler.attachTo$lambda$1(savedStateHandle);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void attachTo$lambda$0(SavedStateHandle savedStateHandle) {
        INSTANCE.clearSession(savedStateHandle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachTo$lambda$1(SavedStateHandle savedStateHandle) {
        INSTANCE.restartSession(savedStateHandle);
        return Unit.INSTANCE;
    }

    private final void startSession(SavedStateHandle savedStateHandle) {
        Parcelable parcelable;
        Session session = (Session) savedStateHandle.get(SESSION_KEY);
        if (session != null) {
            if (session instanceof Session.Owner) {
                AnalyticsRequestFactory.Companion companion = AnalyticsRequestFactory.INSTANCE;
                UUID uuidFromString = UUID.fromString(((Session.Owner) session).getId());
                Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
                companion.setSessionId(uuidFromString);
                sessionLocked = true;
                return;
            }
            if (!(session instanceof Session.Observer)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        if (!sessionLocked) {
            sessionLocked = true;
            UUID uuidRandomUUID = UUID.randomUUID();
            AnalyticsRequestFactory.Companion companion2 = AnalyticsRequestFactory.INSTANCE;
            Intrinsics.checkNotNull(uuidRandomUUID);
            companion2.setSessionId(uuidRandomUUID);
            String string = uuidRandomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            parcelable = (Session) new Session.Owner(string);
        } else {
            parcelable = (Session) Session.Observer.INSTANCE;
        }
        savedStateHandle.set(SESSION_KEY, parcelable);
    }

    private final void restartSession(SavedStateHandle savedStateHandle) {
        Session session = (Session) savedStateHandle.get(SESSION_KEY);
        if (session != null) {
            if (session instanceof Session.Owner) {
                UUID uuidRandomUUID = UUID.randomUUID();
                AnalyticsRequestFactory.Companion companion = AnalyticsRequestFactory.INSTANCE;
                Intrinsics.checkNotNull(uuidRandomUUID);
                companion.setSessionId(uuidRandomUUID);
                String string = uuidRandomUUID.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                savedStateHandle.set(SESSION_KEY, new Session.Owner(string));
                return;
            }
            if (!(session instanceof Session.Observer)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void clearSession(SavedStateHandle savedStateHandle) {
        Session session = (Session) savedStateHandle.get(SESSION_KEY);
        if (session != null) {
            if (session instanceof Session.Owner) {
                sessionLocked = false;
            } else if (!(session instanceof Session.Observer)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void clear() {
        sessionLocked = false;
    }
}
