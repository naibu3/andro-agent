package com.stripe.android.challenge;

import com.stripe.android.challenge.PassiveChallengeComponent;
import com.stripe.android.hcaptcha.HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory;
import com.stripe.android.hcaptcha.HCaptchaModule_ProvideHCaptchaServiceFactory;
import com.stripe.android.hcaptcha.HCaptchaService;
import com.stripe.android.model.PassiveCaptchaParams;
import dagger.internal.Preconditions;

/* loaded from: classes5.dex */
public final class DaggerPassiveChallengeComponent {
    private DaggerPassiveChallengeComponent() {
    }

    public static PassiveChallengeComponent.Builder builder() {
        return new Builder();
    }

    private static final class Builder implements PassiveChallengeComponent.Builder {
        private PassiveCaptchaParams passiveCaptchaParams;

        private Builder() {
        }

        @Override // com.stripe.android.challenge.PassiveChallengeComponent.Builder
        public Builder passiveCaptchaParams(PassiveCaptchaParams passiveCaptchaParams) {
            this.passiveCaptchaParams = (PassiveCaptchaParams) Preconditions.checkNotNull(passiveCaptchaParams);
            return this;
        }

        @Override // com.stripe.android.challenge.PassiveChallengeComponent.Builder
        public PassiveChallengeComponent build() {
            Preconditions.checkBuilderRequirement(this.passiveCaptchaParams, PassiveCaptchaParams.class);
            return new PassiveChallengeComponentImpl(this.passiveCaptchaParams);
        }
    }

    private static final class PassiveChallengeComponentImpl implements PassiveChallengeComponent {
        private final PassiveCaptchaParams passiveCaptchaParams;
        private final PassiveChallengeComponentImpl passiveChallengeComponentImpl;

        private PassiveChallengeComponentImpl(PassiveCaptchaParams passiveCaptchaParams) {
            this.passiveChallengeComponentImpl = this;
            this.passiveCaptchaParams = passiveCaptchaParams;
        }

        private HCaptchaService hCaptchaService() {
            return HCaptchaModule_ProvideHCaptchaServiceFactory.provideHCaptchaService(HCaptchaModule_ProvideHCaptchaProvider$payments_core_releaseFactory.provideHCaptchaProvider$payments_core_release());
        }

        @Override // com.stripe.android.challenge.PassiveChallengeComponent
        public PassiveChallengeViewModel getPassiveChallengeViewModel() {
            return new PassiveChallengeViewModel(this.passiveCaptchaParams, hCaptchaService());
        }
    }
}
