package com.qonversion.android.sdk.automations.mvp;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.automations.dto.QActionResultType;
import com.qonversion.android.sdk.automations.mvp.ScreenContract;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.dto.automations.Screen;
import com.qonversion.android.sdk.internal.logger.ConsoleLogger;
import com.qonversion.android.sdk.internal.repository.QRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ScreenPresenter.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0016J\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u0004\u0018\u00010\f*\u00020\u0013H\u0002J\f\u0010\u0015\u001a\u00020\u000f*\u00020\u0013H\u0002J\f\u0010\u0016\u001a\u00020\u000f*\u00020\u0013H\u0002J\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/automations/mvp/ScreenPresenter;", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$Presenter;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "view", "Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/automations/mvp/ScreenContract$View;)V", "logger", "Lcom/qonversion/android/sdk/internal/logger/ConsoleLogger;", "confirmScreenView", "", ScreenActivity.INTENT_SCREEN_ID, "", "getHtmlPageForScreen", "shouldOverrideUrlLoading", "", "url", "getActionType", "Lcom/qonversion/android/sdk/automations/dto/QActionResultType;", "Landroid/net/Uri;", "getData", "isAutomationsHost", "isQScheme", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ScreenPresenter implements ScreenContract.Presenter {
    private static final String ACTION = "action";
    private static final String DATA = "data";
    private static final String HOST = "automation";
    private static final String REGEX = "qon-.+";
    private static final String SCHEMA = "qon-";
    private final ConsoleLogger logger;
    private final QRepository repository;
    private final ScreenContract.View view;

    /* compiled from: ScreenPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QActionResultType.values().length];
            try {
                iArr[QActionResultType.Url.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QActionResultType.DeepLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QActionResultType.Close.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[QActionResultType.CloseAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[QActionResultType.Navigation.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[QActionResultType.Purchase.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[QActionResultType.Restore.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public ScreenPresenter(QRepository repository, ScreenContract.View view) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(view, "view");
        this.repository = repository;
        this.view = view;
        this.logger = new ConsoleLogger();
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.Presenter
    public boolean shouldOverrideUrlLoading(String url) {
        this.logger.debug("shouldOverrideUrlLoading() -> url:" + url);
        if (url == null) {
            return true;
        }
        Uri uri = Uri.parse(url);
        Intrinsics.checkNotNull(uri);
        if (!shouldOverrideUrlLoading(uri)) {
            return true;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[getActionType(uri).ordinal()]) {
            case 1:
                String data = getData(uri);
                if (data != null) {
                    this.view.openLink(data);
                }
                return true;
            case 2:
                String data2 = getData(uri);
                if (data2 != null) {
                    this.view.openDeepLink(data2);
                }
                return true;
            case 3:
                ScreenContract.View.DefaultImpls.close$default(this.view, null, 1, null);
                return true;
            case 4:
                ScreenContract.View.DefaultImpls.closeAll$default(this.view, null, 1, null);
                return true;
            case 5:
                String data3 = getData(uri);
                if (data3 != null) {
                    getHtmlPageForScreen(data3);
                }
                return true;
            case 6:
                String data4 = getData(uri);
                if (data4 != null) {
                    this.view.purchase(data4);
                }
                return true;
            case 7:
                this.view.restore();
                return true;
            default:
                return true;
        }
    }

    @Override // com.qonversion.android.sdk.automations.mvp.ScreenContract.Presenter
    public void confirmScreenView(String screenId) {
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        this.repository.views(screenId);
    }

    private final QActionResultType getActionType(Uri uri) {
        return QActionResultType.INSTANCE.fromType(uri.getQueryParameter(ACTION));
    }

    private final String getData(Uri uri) {
        return uri.getQueryParameter("data");
    }

    private final boolean shouldOverrideUrlLoading(Uri uri) {
        return isAutomationsHost(uri) && isQScheme(uri);
    }

    private final boolean isQScheme(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            return new Regex(REGEX).matches(scheme);
        }
        return false;
    }

    private final boolean isAutomationsHost(Uri uri) {
        return StringsKt.equals$default(uri.getHost(), HOST, false, 2, null);
    }

    private final void getHtmlPageForScreen(final String screenId) {
        this.repository.screens(screenId, new Function1<Screen, Unit>() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenPresenter.getHtmlPageForScreen.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Screen screen) {
                invoke2(screen);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Screen screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                ScreenPresenter.this.view.openScreen(screenId, screen.getHtmlPage());
            }
        }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.automations.mvp.ScreenPresenter.getHtmlPageForScreen.2
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
                ScreenContract.View.DefaultImpls.onError$default(ScreenPresenter.this.view, it, false, 2, null);
            }
        });
    }
}
