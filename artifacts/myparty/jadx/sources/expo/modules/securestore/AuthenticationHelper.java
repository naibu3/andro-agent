package expo.modules.securestore;

import android.app.Activity;
import android.content.Context;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.interfaces.ActivityProvider;
import javax.crypto.Cipher;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* compiled from: AuthenticationHelper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lexpo/modules/securestore/AuthenticationHelper;", "", "context", "Landroid/content/Context;", "moduleRegistry", "Lexpo/modules/core/ModuleRegistry;", "<init>", "(Landroid/content/Context;Lexpo/modules/core/ModuleRegistry;)V", "isAuthenticating", "", "authenticateCipher", "Ljavax/crypto/Cipher;", "cipher", "requiresAuthentication", "title", "", "(Ljavax/crypto/Cipher;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openAuthenticationPrompt", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "(Ljavax/crypto/Cipher;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "assertBiometricsSupport", "", "getCurrentActivity", "Landroid/app/Activity;", "Companion", "expo-secure-store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthenticationHelper {
    public static final String REQUIRE_AUTHENTICATION_PROPERTY = "requireAuthentication";
    private final Context context;
    private boolean isAuthenticating;
    private final ModuleRegistry moduleRegistry;

    /* compiled from: AuthenticationHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.securestore.AuthenticationHelper", f = "AuthenticationHelper.kt", i = {}, l = {24}, m = "authenticateCipher", n = {}, s = {})
    /* renamed from: expo.modules.securestore.AuthenticationHelper$authenticateCipher$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationHelper.this.authenticateCipher(null, false, null, this);
        }
    }

    /* compiled from: AuthenticationHelper.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.securestore.AuthenticationHelper", f = "AuthenticationHelper.kt", i = {}, l = {50}, m = "openAuthenticationPrompt", n = {}, s = {})
    /* renamed from: expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$1, reason: invalid class name and case insensitive filesystem */
    static final class C12301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C12301(Continuation<? super C12301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthenticationHelper.this.openAuthenticationPrompt(null, null, this);
        }
    }

    public AuthenticationHelper(Context context, ModuleRegistry moduleRegistry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moduleRegistry, "moduleRegistry");
        this.context = context;
        this.moduleRegistry = moduleRegistry;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticateCipher(Cipher cipher, boolean z, String str, Continuation<? super Cipher> continuation) throws AuthenticationException {
        AnonymousClass1 anonymousClass1;
        Cipher cipher2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objOpenAuthenticationPrompt = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objOpenAuthenticationPrompt);
            if (!z) {
                return cipher;
            }
            anonymousClass1.label = 1;
            objOpenAuthenticationPrompt = openAuthenticationPrompt(cipher, str, anonymousClass1);
            if (objOpenAuthenticationPrompt == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOpenAuthenticationPrompt);
        }
        BiometricPrompt.CryptoObject cryptoObject = ((BiometricPrompt.AuthenticationResult) objOpenAuthenticationPrompt).getCryptoObject();
        if (cryptoObject == null || (cipher2 = cryptoObject.getCipher()) == null) {
            throw new AuthenticationException("Couldn't get cipher from authentication result", null, 2, null);
        }
        return cipher2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object openAuthenticationPrompt(Cipher cipher, String str, Continuation<? super BiometricPrompt.AuthenticationResult> continuation) throws AuthenticationException {
        C12301 c12301;
        if (continuation instanceof C12301) {
            c12301 = (C12301) continuation;
            if ((c12301.label & Integer.MIN_VALUE) != 0) {
                c12301.label -= Integer.MIN_VALUE;
            } else {
                c12301 = new C12301(continuation);
            }
        }
        Object objWithContext = c12301.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c12301.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(objWithContext);
                if (this.isAuthenticating) {
                    throw new AuthenticationException("Authentication is already in progress", null, 2, null);
                }
                this.isAuthenticating = true;
                assertBiometricsSupport();
                Activity currentActivity = getCurrentActivity();
                FragmentActivity fragmentActivity = currentActivity instanceof FragmentActivity ? (FragmentActivity) currentActivity : null;
                if (fragmentActivity == null) {
                    throw new AuthenticationException("Cannot display biometric prompt when the app is not in the foreground", null, 2, null);
                }
                AuthenticationPrompt authenticationPrompt = new AuthenticationPrompt(fragmentActivity, this.context, str);
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(authenticationPrompt, cipher, null);
                c12301.label = 1;
                objWithContext = BuildersKt.withContext(immediate, anonymousClass2, c12301);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return objWithContext;
        } finally {
            this.isAuthenticating = false;
        }
    }

    /* compiled from: AuthenticationHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$2", f = "AuthenticationHelper.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.securestore.AuthenticationHelper$openAuthenticationPrompt$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BiometricPrompt.AuthenticationResult>, Object> {
        final /* synthetic */ AuthenticationPrompt $authenticationPrompt;
        final /* synthetic */ Cipher $cipher;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(AuthenticationPrompt authenticationPrompt, Cipher cipher, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$authenticationPrompt = authenticationPrompt;
            this.$cipher = cipher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$authenticationPrompt, this.$cipher, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super BiometricPrompt.AuthenticationResult> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws AuthenticationException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = this.$authenticationPrompt.authenticate(this.$cipher, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BiometricPrompt.AuthenticationResult authenticationResult = (BiometricPrompt.AuthenticationResult) obj;
            if (authenticationResult != null) {
                return authenticationResult;
            }
            throw new AuthenticationException("Couldn't get the authentication result", null, 2, null);
        }
    }

    public final void assertBiometricsSupport() throws AuthenticationException {
        BiometricManager biometricManagerFrom = BiometricManager.from(this.context);
        Intrinsics.checkNotNullExpressionValue(biometricManagerFrom, "from(...)");
        int iCanAuthenticate = biometricManagerFrom.canAuthenticate(15);
        if (iCanAuthenticate == -2) {
            throw new AuthenticationException("Biometric authentication is unsupported", null, 2, null);
        }
        if (iCanAuthenticate != -1) {
            if (iCanAuthenticate != 1) {
                if (iCanAuthenticate == 15) {
                    throw new AuthenticationException("An update is required before the biometrics can be used", null, 2, null);
                }
                if (iCanAuthenticate == 11) {
                    throw new AuthenticationException("No biometrics are currently enrolled", null, 2, null);
                }
                if (iCanAuthenticate != 12) {
                    return;
                }
            }
            throw new AuthenticationException("No hardware available for biometric authentication. Use expo-local-authentication to check if the device supports it", null, 2, null);
        }
        throw new AuthenticationException("Biometric authentication status is unknown", null, 2, null);
    }

    private final Activity getCurrentActivity() {
        Object module = this.moduleRegistry.getModule(ActivityProvider.class);
        Intrinsics.checkNotNullExpressionValue(module, "getModule(...)");
        return ((ActivityProvider) module).getCurrentActivity();
    }
}
