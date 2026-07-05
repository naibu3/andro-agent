package com.stripe.android.financialconnections.domain;

import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.financialconnections.repository.FinancialConnectionsConsumerSessionRepository;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.VerificationType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmVerification.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000bJ\u0014\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/financialconnections/domain/ConfirmVerification;", "", "consumerSessionRepository", "Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;", "<init>", "(Lcom/stripe/android/financialconnections/repository/FinancialConnectionsConsumerSessionRepository;)V", "sms", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "", "verificationCode", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "email", "toDomainException", "", "Lcom/stripe/android/model/VerificationType;", "OTPError", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ConfirmVerification {
    public static final int $stable = 8;
    private final FinancialConnectionsConsumerSessionRepository consumerSessionRepository;

    /* compiled from: ConfirmVerification.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationType.values().length];
            try {
                iArr[VerificationType.EMAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationType.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ConfirmVerification.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.ConfirmVerification", f = "ConfirmVerification.kt", i = {0}, l = {31}, m = "email", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.ConfirmVerification$email$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmVerification.this.email(null, null, this);
        }
    }

    /* compiled from: ConfirmVerification.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.financialconnections.domain.ConfirmVerification", f = "ConfirmVerification.kt", i = {0}, l = {17}, m = "sms", n = {"this"}, s = {"L$0"})
    /* renamed from: com.stripe.android.financialconnections.domain.ConfirmVerification$sms$1, reason: invalid class name and case insensitive filesystem */
    static final class C08581 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C08581(Continuation<? super C08581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConfirmVerification.this.sms(null, null, this);
        }
    }

    @Inject
    public ConfirmVerification(FinancialConnectionsConsumerSessionRepository consumerSessionRepository) {
        Intrinsics.checkNotNullParameter(consumerSessionRepository, "consumerSessionRepository");
        this.consumerSessionRepository = consumerSessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sms(String str, String str2, Continuation<? super ConsumerSession> continuation) throws Throwable {
        C08581 c08581;
        ConfirmVerification confirmVerification;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof C08581) {
            c08581 = (C08581) continuation;
            if ((c08581.label & Integer.MIN_VALUE) != 0) {
                c08581.label -= Integer.MIN_VALUE;
            } else {
                c08581 = new C08581(continuation);
            }
        }
        Object objConfirmConsumerVerification = c08581.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c08581.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objConfirmConsumerVerification);
            try {
                Result.Companion companion = Result.INSTANCE;
                FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = this.consumerSessionRepository;
                VerificationType verificationType = VerificationType.SMS;
                c08581.L$0 = this;
                c08581.label = 1;
                objConfirmConsumerVerification = financialConnectionsConsumerSessionRepository.confirmConsumerVerification(str, str2, verificationType, c08581);
                if (objConfirmConsumerVerification == coroutine_suspended) {
                    return coroutine_suspended;
                }
                confirmVerification = this;
            } catch (Throwable th) {
                th = th;
                confirmVerification = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmVerification = (ConfirmVerification) c08581.L$0;
            try {
                ResultKt.throwOnFailure(objConfirmConsumerVerification);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        objM9118constructorimpl = Result.m9118constructorimpl((ConsumerSession) objConfirmConsumerVerification);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return (ConsumerSession) objM9118constructorimpl;
        }
        throw confirmVerification.toDomainException(thM9121exceptionOrNullimpl, VerificationType.SMS);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object email(String str, String str2, Continuation<? super ConsumerSession> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        ConfirmVerification confirmVerification;
        Object objM9118constructorimpl;
        Throwable thM9121exceptionOrNullimpl;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objConfirmConsumerVerification = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objConfirmConsumerVerification);
            try {
                Result.Companion companion = Result.INSTANCE;
                FinancialConnectionsConsumerSessionRepository financialConnectionsConsumerSessionRepository = this.consumerSessionRepository;
                VerificationType verificationType = VerificationType.EMAIL;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objConfirmConsumerVerification = financialConnectionsConsumerSessionRepository.confirmConsumerVerification(str, str2, verificationType, anonymousClass1);
                if (objConfirmConsumerVerification == coroutine_suspended) {
                    return coroutine_suspended;
                }
                confirmVerification = this;
            } catch (Throwable th) {
                th = th;
                confirmVerification = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            confirmVerification = (ConfirmVerification) anonymousClass1.L$0;
            try {
                ResultKt.throwOnFailure(objConfirmConsumerVerification);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion22 = Result.INSTANCE;
                objM9118constructorimpl = Result.m9118constructorimpl(ResultKt.createFailure(th));
                thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
                if (thM9121exceptionOrNullimpl == null) {
                }
            }
        }
        objM9118constructorimpl = Result.m9118constructorimpl((ConsumerSession) objConfirmConsumerVerification);
        thM9121exceptionOrNullimpl = Result.m9121exceptionOrNullimpl(objM9118constructorimpl);
        if (thM9121exceptionOrNullimpl == null) {
            return (ConsumerSession) objM9118constructorimpl;
        }
        throw confirmVerification.toDomainException(thM9121exceptionOrNullimpl, VerificationType.EMAIL);
    }

    private final Throwable toDomainException(Throwable th, VerificationType verificationType) {
        String code;
        OTPError oTPError;
        StripeError stripeError;
        StripeException stripeException = th instanceof StripeException ? (StripeException) th : null;
        if (stripeException == null || (stripeError = stripeException.getStripeError()) == null || (code = stripeError.getCode()) == null) {
            code = "";
        }
        switch (code.hashCode()) {
            case -1200814029:
                if (!code.equals("consumer_session_expired")) {
                    return th;
                }
                break;
            case -743856726:
                if (!code.equals("consumer_verification_expired")) {
                    return th;
                }
                break;
            case -446933440:
                return !code.equals("consumer_verification_code_invalid") ? th : new OTPError(code, OTPError.Type.CODE_INVALID);
            case 1449761750:
                if (!code.equals("consumer_verification_max_attempts_exceeded")) {
                    return th;
                }
                break;
            default:
                return th;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[verificationType.ordinal()];
        if (i == 1) {
            oTPError = new OTPError(code, OTPError.Type.EMAIL_CODE_EXPIRED);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            oTPError = new OTPError(code, OTPError.Type.SMS_CODE_EXPIRED);
        }
        return oTPError;
    }

    /* compiled from: ConfirmVerification.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError;", "", "message", "", "type", "Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;", "<init>", "(Ljava/lang/String;Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;)V", "getType", "()Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;", "supportUrl", "getSupportUrl", "()Ljava/lang/String;", "Type", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OTPError extends Throwable {
        public static final int $stable = 0;
        private final Type type;

        public final Type getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OTPError(String message, Type type) {
            super(message);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
        }

        public final String getSupportUrl() {
            return "https://support.link.co/contact/email?skipVerification=true";
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ConfirmVerification.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/financialconnections/domain/ConfirmVerification$OTPError$Type;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL_CODE_EXPIRED", "SMS_CODE_EXPIRED", "CODE_INVALID", "financial-connections_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Type {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type EMAIL_CODE_EXPIRED = new Type("EMAIL_CODE_EXPIRED", 0);
            public static final Type SMS_CODE_EXPIRED = new Type("SMS_CODE_EXPIRED", 1);
            public static final Type CODE_INVALID = new Type("CODE_INVALID", 2);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{EMAIL_CODE_EXPIRED, SMS_CODE_EXPIRED, CODE_INVALID};
            }

            public static EnumEntries<Type> getEntries() {
                return $ENTRIES;
            }

            private Type(String str, int i) {
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }
    }
}
