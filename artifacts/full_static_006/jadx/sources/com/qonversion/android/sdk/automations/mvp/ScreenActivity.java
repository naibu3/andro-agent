package com.qonversion.android.sdk.automations.mvp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import com.qonversion.android.sdk.R;
import com.qonversion.android.sdk.automations.dto.QScreenPresentationStyle;
import com.qonversion.android.sdk.automations.internal.UtilsKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenActivity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\r\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ\u0012\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\tH\u0002J+\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity;", "Landroidx/fragment/app/FragmentActivity;", "()V", "presentationStyle", "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "getPresentationStyle$annotations", "getPresentationStyle", "()Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "finish", "", "goBack", "", "goBack$sdk_release", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "playCloseAnimation", "showScreen", ScreenActivity.INTENT_SCREEN_ID, "", ScreenActivity.INTENT_HTML_PAGE, "addToBackStack", "showScreen$sdk_release", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScreenActivity extends FragmentActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String INTENT_HTML_PAGE = "htmlPage";
    public static final String INTENT_SCREEN_ID = "screenId";
    public static final String INTENT_SCREEN_PRESENTATION_STYLE = "screenPresentationStyle";

    private static /* synthetic */ void getPresentationStyle$annotations() {
    }

    public ScreenActivity() {
        super(R.layout.q_activity_screen);
    }

    private final QScreenPresentationStyle getPresentationStyle() {
        Serializable serializableExtra = getIntent().getSerializableExtra(INTENT_SCREEN_PRESENTATION_STYLE);
        if (serializableExtra instanceof QScreenPresentationStyle) {
            return (QScreenPresentationStyle) serializableExtra;
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            showScreen$sdk_release(getIntent().getStringExtra(INTENT_SCREEN_ID), getIntent().getStringExtra(INTENT_HTML_PAGE), false);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        playCloseAnimation();
    }

    public static /* synthetic */ void showScreen$sdk_release$default(ScreenActivity screenActivity, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        screenActivity.showScreen$sdk_release(str, str2, z);
    }

    public final void showScreen$sdk_release(String screenId, String htmlPage, boolean addToBackStack) {
        Bundle arguments = ScreenFragment.INSTANCE.getArguments(screenId, htmlPage);
        ScreenFragment screenFragment = new ScreenFragment();
        screenFragment.setArguments(arguments);
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
        if (addToBackStack) {
            fragmentTransactionBeginTransaction.setCustomAnimations(R.anim.q_slide_in_from_left, R.anim.q_fade_out, R.anim.q_fade_in, R.anim.q_slide_out_to_left).addToBackStack(null);
        }
        fragmentTransactionBeginTransaction.replace(R.id.fragment_container_view, screenFragment).commit();
    }

    public final boolean goBack$sdk_release() {
        boolean z = getSupportFragmentManager().getBackStackEntryCount() == 0;
        if (z) {
            finish();
        } else {
            getSupportFragmentManager().popBackStack();
        }
        return z;
    }

    private final void playCloseAnimation() {
        Pair<Integer, Integer> screenTransactionAnimations = UtilsKt.getScreenTransactionAnimations(getPresentationStyle());
        if (screenTransactionAnimations != null) {
            overridePendingTransition(screenTransactionAnimations.component1().intValue(), screenTransactionAnimations.component2().intValue());
        }
    }

    /* compiled from: ScreenActivity.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0002R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenActivity$Companion;", "", "()V", "INTENT_HTML_PAGE", "", "getINTENT_HTML_PAGE$annotations", "INTENT_SCREEN_ID", "getINTENT_SCREEN_ID$annotations", "INTENT_SCREEN_PRESENTATION_STYLE", "getINTENT_SCREEN_PRESENTATION_STYLE$annotations", "getCallingIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", ScreenActivity.INTENT_SCREEN_ID, ScreenActivity.INTENT_HTML_PAGE, ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, "Lcom/qonversion/android/sdk/automations/dto/QScreenPresentationStyle;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getINTENT_HTML_PAGE$annotations() {
        }

        public static /* synthetic */ void getINTENT_SCREEN_ID$annotations() {
        }

        public static /* synthetic */ void getINTENT_SCREEN_PRESENTATION_STYLE$annotations() {
        }

        private Companion() {
        }

        public final Intent getCallingIntent(Context context, String screenId, String htmlPage, QScreenPresentationStyle screenPresentationStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            Intrinsics.checkNotNullParameter(htmlPage, "htmlPage");
            Intrinsics.checkNotNullParameter(screenPresentationStyle, "screenPresentationStyle");
            Intent intent = new Intent(context, (Class<?>) ScreenActivity.class);
            intent.putExtra(ScreenActivity.INTENT_SCREEN_ID, screenId);
            intent.putExtra(ScreenActivity.INTENT_HTML_PAGE, htmlPage);
            intent.putExtra(ScreenActivity.INTENT_SCREEN_PRESENTATION_STYLE, screenPresentationStyle);
            return intent;
        }
    }
}
