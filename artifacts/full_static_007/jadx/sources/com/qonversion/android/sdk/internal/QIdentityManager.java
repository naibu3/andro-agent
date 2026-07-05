package com.qonversion.android.sdk.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.qonversion.android.sdk.internal.services.QUserInfoService;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QIdentityManager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/internal/QIdentityManager;", "", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "userInfoService", "Lcom/qonversion/android/sdk/internal/services/QUserInfoService;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/services/QUserInfoService;)V", "currentPartnersIdentityId", "", "getCurrentPartnersIdentityId", "()Ljava/lang/String;", "identify", "", "userID", "callback", "Lcom/qonversion/android/sdk/internal/IdentityManagerCallback;", "logoutIfNeeded", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QIdentityManager {
    private final QRepository repository;
    private final QUserInfoService userInfoService;

    @Inject
    public QIdentityManager(QRepository repository, QUserInfoService userInfoService) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInfoService, "userInfoService");
        this.repository = repository;
        this.userInfoService = userInfoService;
    }

    public final String getCurrentPartnersIdentityId() {
        return this.userInfoService.getPartnersIdentityId();
    }

    public final void identify(final String userID, final IdentityManagerCallback callback) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.repository.identify(userID, this.userInfoService.obtainUserID(), new Function1<String, Unit>() { // from class: com.qonversion.android.sdk.internal.QIdentityManager.identify.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String resultUserID) {
                Intrinsics.checkNotNullParameter(resultUserID, "resultUserID");
                QIdentityManager.this.userInfoService.storePartnersIdentityId(userID);
                if (resultUserID.length() > 0) {
                    QIdentityManager.this.userInfoService.storeQonversionUserId(resultUserID);
                }
                callback.onSuccess(resultUserID);
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.QIdentityManager.identify.2
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
                callback.onError(it);
            }
        });
    }

    public final boolean logoutIfNeeded() {
        return this.userInfoService.logoutIfNeeded();
    }
}
