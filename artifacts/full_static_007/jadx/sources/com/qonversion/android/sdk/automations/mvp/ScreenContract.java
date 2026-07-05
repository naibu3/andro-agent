package com.qonversion.android.sdk.automations.mvp;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import com.qonversion.android.sdk.automations.dto.QActionResultType;
import com.qonversion.android.sdk.dto.QonversionError;
import kotlin.Metadata;

/* compiled from: ScreenContract.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenContract;", "", "()V", "Presenter", "View", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScreenContract {

    /* compiled from: ScreenContract.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0005H&¨\u0006\t"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;", "", "confirmScreenView", "", ScreenActivity.INTENT_SCREEN_ID, "", "shouldOverrideUrlLoading", "", "url", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Presenter {
        void confirmScreenView(String screenId);

        boolean shouldOverrideUrlLoading(String url);
    }

    /* compiled from: ScreenContract.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u000eH&J\b\u0010\u0015\u001a\u00020\u0003H&¨\u0006\u0016"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "", "close", "", "actionResult", "Lcom/qonversion/android/sdk/automations/dto/QActionResult;", "closeAll", "onError", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Lcom/qonversion/android/sdk/dto/QonversionError;", "shouldCloseScreen", "", "openDeepLink", "url", "", "openLink", "openScreen", ScreenActivity.INTENT_SCREEN_ID, ScreenActivity.INTENT_HTML_PAGE, "purchase", "productId", "restore", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface View {
        void close(QActionResult actionResult);

        void closeAll(QActionResult actionResult);

        void onError(QonversionError error, boolean shouldCloseScreen);

        void openDeepLink(String url);

        void openLink(String url);

        void openScreen(String screenId, String htmlPage);

        void purchase(String productId);

        void restore();

        /* compiled from: ScreenContract.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class DefaultImpls {
            public static /* synthetic */ void close$default(View view, QActionResult qActionResult, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
                }
                if ((i & 1) != 0) {
                    qActionResult = new QActionResult(QActionResultType.Close, null, 2, null);
                }
                view.close(qActionResult);
            }

            public static /* synthetic */ void closeAll$default(View view, QActionResult qActionResult, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: closeAll");
                }
                if ((i & 1) != 0) {
                    qActionResult = new QActionResult(QActionResultType.Close, null, 2, null);
                }
                view.closeAll(qActionResult);
            }

            public static /* synthetic */ void onError$default(View view, QonversionError qonversionError, boolean z, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
                }
                if ((i & 2) != 0) {
                    z = false;
                }
                view.onError(qonversionError, z);
            }
        }
    }
}
