package com.stripe.android.challenge;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.stripe.android.hcaptcha.HCaptchaModule;
import com.stripe.android.model.PassiveCaptchaParams;
import dagger.BindsInstance;
import dagger.Component;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: PassiveChallengeComponent.kt */
@Component(modules = {HCaptchaModule.class})
@Singleton
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeComponent;", "", "passiveChallengeViewModel", "Lcom/stripe/android/challenge/PassiveChallengeViewModel;", "getPassiveChallengeViewModel", "()Lcom/stripe/android/challenge/PassiveChallengeViewModel;", "Builder", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PassiveChallengeComponent {

    /* compiled from: PassiveChallengeComponent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/challenge/PassiveChallengeComponent$Builder;", "", "passiveCaptchaParams", "Lcom/stripe/android/model/PassiveCaptchaParams;", InAppPurchaseConstants.METHOD_BUILD, "Lcom/stripe/android/challenge/PassiveChallengeComponent;", "paymentsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Component.Builder
    public interface Builder {
        PassiveChallengeComponent build();

        @BindsInstance
        Builder passiveCaptchaParams(PassiveCaptchaParams passiveCaptchaParams);
    }

    PassiveChallengeViewModel getPassiveChallengeViewModel();
}
