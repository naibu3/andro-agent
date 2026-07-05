package com.stripe.android.view;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStub;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeActivityBinding;
import com.stripe.android.view.AlertDisplayer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StripeActivity.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0014J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010/\u001a\u00020%H$J\u0010\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u0015H\u0014J\u0010\u00102\u001a\u00020%2\u0006\u00103\u001a\u000204H\u0004R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\t\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\t\u001a\u0004\b!\u0010\"¨\u00065"}, d2 = {"Lcom/stripe/android/view/StripeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "viewBinding", "Lcom/stripe/android/databinding/StripeActivityBinding;", "getViewBinding", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding$delegate", "Lkotlin/Lazy;", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar$payments_core_release", "()Landroid/widget/ProgressBar;", "progressBar$delegate", "viewStub", "Landroid/view/ViewStub;", "getViewStub$payments_core_release", "()Landroid/view/ViewStub;", "viewStub$delegate", "value", "", "isProgressBarVisible", "()Z", "setProgressBarVisible", "(Z)V", "alertDisplayer", "Lcom/stripe/android/view/AlertDisplayer;", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "stripeColorUtils", "Lcom/stripe/android/view/StripeColorUtils;", "getStripeColorUtils", "()Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onActionSave", "onProgressBarVisibilityChanged", ViewProps.VISIBLE, "showError", "error", "", "payments-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class StripeActivity extends AppCompatActivity {
    public static final int $stable = 8;
    private boolean isProgressBarVisible;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Lazy viewBinding = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.StripeActivity$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeActivity.viewBinding_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: progressBar$delegate, reason: from kotlin metadata */
    private final Lazy progressBar = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.StripeActivity$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeActivity.progressBar_delegate$lambda$1(this.f$0);
        }
    });

    /* renamed from: viewStub$delegate, reason: from kotlin metadata */
    private final Lazy viewStub = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.StripeActivity$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeActivity.viewStub_delegate$lambda$2(this.f$0);
        }
    });

    /* renamed from: alertDisplayer$delegate, reason: from kotlin metadata */
    private final Lazy alertDisplayer = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.StripeActivity$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeActivity.alertDisplayer_delegate$lambda$3(this.f$0);
        }
    });

    /* renamed from: stripeColorUtils$delegate, reason: from kotlin metadata */
    private final Lazy stripeColorUtils = LazyKt.lazy(new Function0() { // from class: com.stripe.android.view.StripeActivity$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return StripeActivity.stripeColorUtils_delegate$lambda$4(this.f$0);
        }
    });

    protected abstract void onActionSave();

    protected void onProgressBarVisibilityChanged(boolean visible) {
    }

    private final StripeActivityBinding getViewBinding() {
        return (StripeActivityBinding) this.viewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeActivityBinding viewBinding_delegate$lambda$0(StripeActivity stripeActivity) {
        StripeActivityBinding stripeActivityBindingInflate = StripeActivityBinding.inflate(stripeActivity.getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(stripeActivityBindingInflate, "inflate(...)");
        return stripeActivityBindingInflate;
    }

    public final ProgressBar getProgressBar$payments_core_release() {
        Object value = this.progressBar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ProgressBar) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearProgressIndicator progressBar_delegate$lambda$1(StripeActivity stripeActivity) {
        return stripeActivity.getViewBinding().progressBar;
    }

    public final ViewStub getViewStub$payments_core_release() {
        return (ViewStub) this.viewStub.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewStub viewStub_delegate$lambda$2(StripeActivity stripeActivity) {
        ViewStub viewStub = stripeActivity.getViewBinding().viewStub;
        Intrinsics.checkNotNullExpressionValue(viewStub, "viewStub");
        return viewStub;
    }

    /* renamed from: isProgressBarVisible, reason: from getter */
    protected final boolean getIsProgressBarVisible() {
        return this.isProgressBarVisible;
    }

    protected final void setProgressBarVisible(boolean z) {
        getProgressBar$payments_core_release().setVisibility(z ? 0 : 8);
        invalidateOptionsMenu();
        onProgressBarVisibilityChanged(z);
        this.isProgressBarVisible = z;
    }

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDisplayer.DefaultAlertDisplayer alertDisplayer_delegate$lambda$3(StripeActivity stripeActivity) {
        return new AlertDisplayer.DefaultAlertDisplayer(stripeActivity);
    }

    private final StripeColorUtils getStripeColorUtils() {
        return (StripeColorUtils) this.stripeColorUtils.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StripeColorUtils stripeColorUtils_delegate$lambda$4(StripeActivity stripeActivity) {
        return new StripeColorUtils(stripeActivity);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        getMenuInflater().inflate(R.menu.stripe_add_payment_method, menu);
        menu.findItem(R.id.action_save).setEnabled(!this.isProgressBarVisible);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == R.id.action_save) {
            onActionSave();
            return true;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
        if (!zOnOptionsItemSelected) {
            getOnBackPressedDispatcher().onBackPressed();
        }
        return zOnOptionsItemSelected;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        MenuItem menuItemFindItem = menu.findItem(R.id.action_save);
        StripeColorUtils stripeColorUtils = getStripeColorUtils();
        Resources.Theme theme = getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        menuItemFindItem.setIcon(stripeColorUtils.getTintedIconWithAttribute(theme, androidx.appcompat.R.attr.titleTextColor, R.drawable.stripe_ic_checkmark));
        return super.onPrepareOptionsMenu(menu);
    }

    protected final void showError(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        getAlertDisplayer().show(error);
    }
}
