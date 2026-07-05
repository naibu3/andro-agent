package com.qonversion.android.sdk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.qonversion.android.sdk.R;

/* loaded from: classes2.dex */
public final class QFragmentScreenBinding implements ViewBinding {
    public final QProgressBarBinding progressBarLayout;
    private final RelativeLayout rootView;
    public final RelativeLayout screen;
    public final WebView webView;

    private QFragmentScreenBinding(RelativeLayout relativeLayout, QProgressBarBinding qProgressBarBinding, RelativeLayout relativeLayout2, WebView webView) {
        this.rootView = relativeLayout;
        this.progressBarLayout = qProgressBarBinding;
        this.screen = relativeLayout2;
        this.webView = webView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static QFragmentScreenBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static QFragmentScreenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.q_fragment_screen, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    public static QFragmentScreenBinding bind(View view) {
        int i = R.id.progressBarLayout;
        View viewFindChildViewById = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById != null) {
            QProgressBarBinding qProgressBarBindingBind = QProgressBarBinding.bind(viewFindChildViewById);
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.webView;
            WebView webView = (WebView) ViewBindings.findChildViewById(view, i2);
            if (webView != null) {
                return new QFragmentScreenBinding(relativeLayout, qProgressBarBindingBind, relativeLayout, webView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
