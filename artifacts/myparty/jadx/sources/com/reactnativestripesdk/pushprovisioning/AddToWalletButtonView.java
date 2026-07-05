package com.reactnativestripesdk.pushprovisioning;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.URLUtil;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.share.internal.ShareConstants;
import com.reactnativestripesdk.PaymentSheetAppearanceKeys;
import com.reactnativestripesdk.utils.ErrorsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToWalletButtonView.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\tH\u0002J(\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0011H\u0014J\u0006\u0010\u001d\u001a\u00020\u0016J\u0010\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\tJ\u0010\u0010 \u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\tJ\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\tJ\u0010\u0010#\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\tJ\u0010\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/reactnativestripesdk/pushprovisioning/AddToWalletButtonView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "requestManager", "Lcom/bumptech/glide/RequestManager;", "<init>", "(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/bumptech/glide/RequestManager;)V", "cardDetails", "Lcom/facebook/react/bridge/ReadableMap;", "ephemeralKey", "", "sourceMap", "token", "loadedSource", "", "heightOverride", "", "widthOverride", "performClick", "", "onAfterUpdateTransaction", "", "getUrlOrResourceId", "onSizeChanged", "w", "h", "oldw", "oldh", "onDropViewInstance", "setSourceMap", "map", "setCardDetails", "detailsMap", "setEphemeralKey", "setToken", "dispatchEvent", "error", "Lcom/facebook/react/bridge/WritableMap;", "stripe_stripe-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AddToWalletButtonView extends AppCompatImageView {
    public static final int $stable = 8;
    private ReadableMap cardDetails;
    private final ThemedReactContext context;
    private String ephemeralKey;
    private int heightOverride;
    private Object loadedSource;
    private final RequestManager requestManager;
    private ReadableMap sourceMap;
    private ReadableMap token;
    private int widthOverride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToWalletButtonView(ThemedReactContext context, RequestManager requestManager) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        this.context = context;
        this.requestManager = requestManager;
        setOnTouchListener(new View.OnTouchListener() { // from class: com.reactnativestripesdk.pushprovisioning.AddToWalletButtonView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AddToWalletButtonView._init_$lambda$4(view, motionEvent);
            }
        });
    }

    @Override // android.view.View
    public boolean performClick() throws ClassNotFoundException {
        String string;
        super.performClick();
        ReadableMap readableMap = this.cardDetails;
        if (readableMap != null && (string = readableMap.getString("description")) != null) {
            String str = this.ephemeralKey;
            if (str != null) {
                PushProvisioningProxy.INSTANCE.invoke(this.context.getReactApplicationContext(), this, string, str, this.token);
                return true;
            }
            dispatchEvent(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Missing parameters. `ephemeralKey` must be supplied in the props to <AddToWalletButton />"));
            return true;
        }
        dispatchEvent(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Missing parameters. `cardDetails.cardDescription` must be supplied in the props to <AddToWalletButton />"));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$4(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        view.performClick();
        return true;
    }

    public final void onAfterUpdateTransaction() {
        final Object urlOrResourceId = getUrlOrResourceId(this.sourceMap);
        if (urlOrResourceId == null) {
            this.requestManager.clear(this);
            setImageDrawable(null);
            this.loadedSource = null;
        } else if (!Intrinsics.areEqual(urlOrResourceId, this.loadedSource) || this.heightOverride > 0 || this.widthOverride > 0) {
            this.loadedSource = urlOrResourceId;
            ReadableMap readableMap = this.sourceMap;
            double d = readableMap != null ? readableMap.getDouble(PaymentSheetAppearanceKeys.SCALE) : 1.0d;
            this.requestManager.load(urlOrResourceId).addListener(new RequestListener<Drawable>() { // from class: com.reactnativestripesdk.pushprovisioning.AddToWalletButtonView.onAfterUpdateTransaction.1
                @Override // com.bumptech.glide.request.RequestListener
                public boolean onLoadFailed(GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                    AddToWalletButtonView.this.dispatchEvent(ErrorsKt.createError(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, "Failed to load the source from " + urlOrResourceId));
                    return true;
                }

                @Override // com.bumptech.glide.request.RequestListener
                public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                    AddToWalletButtonView.this.setImageDrawable(new RippleDrawable(ColorStateList.valueOf(Color.parseColor("#e0e0e0")), resource, null));
                    return true;
                }
            }).centerCrop().override((int) (this.widthOverride * d), (int) (this.heightOverride * d)).into(this);
        }
    }

    private final Object getUrlOrResourceId(ReadableMap sourceMap) {
        String string;
        if (sourceMap == null || (string = sourceMap.getString(ShareConstants.MEDIA_URI)) == null) {
            return null;
        }
        if (URLUtil.isValidUrl(string)) {
            return new GlideUrl(string);
        }
        return Integer.valueOf(this.context.getResources().getIdentifier(string, "drawable", this.context.getPackageName()));
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0) {
            return;
        }
        this.heightOverride = h;
        this.widthOverride = w;
        onAfterUpdateTransaction();
        this.heightOverride = 0;
        this.widthOverride = 0;
    }

    public final void onDropViewInstance() {
        this.requestManager.clear(this);
    }

    public final void setSourceMap(ReadableMap map) {
        this.sourceMap = map;
    }

    public final void setCardDetails(ReadableMap detailsMap) {
        this.cardDetails = detailsMap;
    }

    public final void setEphemeralKey(ReadableMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.ephemeralKey = map.toHashMap().toString();
    }

    public final void setToken(ReadableMap map) {
        this.token = map;
    }

    public final void dispatchEvent(WritableMap error) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(this.context, getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new AddToWalletCompleteEvent(this.context.getSurfaceId(), getId(), error));
        }
    }
}
