package by.chemerisuk.cordova.support;

import android.util.Pair;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;

/* loaded from: classes.dex */
public class ReflectiveCordovaPlugin extends CordovaPlugin {
    private static final String TAG = "ReflectiveCordovaPlugin";
    private Map<String, Pair<Method, ExecutionThread>> commandFactories;

    @Override // org.apache.cordova.CordovaPlugin
    public final void initialize(CordovaInterface cordovaInterface, CordovaWebView cordovaWebView) throws SecurityException {
        boolean zEquals;
        this.commandFactories = new HashMap();
        for (Method method : getClass().getDeclaredMethods()) {
            CordovaMethod cordovaMethod = (CordovaMethod) method.getAnnotation(CordovaMethod.class);
            if (cordovaMethod != null) {
                String strAction = cordovaMethod.action();
                if (strAction.isEmpty()) {
                    strAction = method.getName();
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    zEquals = CallbackContext.class.equals(parameterTypes[0]);
                } else {
                    zEquals = parameterTypes.length == 2 && CordovaArgs.class.equals(parameterTypes[0]) && CallbackContext.class.equals(parameterTypes[1]);
                }
                if (!zEquals) {
                    throw new RuntimeException("Cordova method " + strAction + " does not have valid parameters");
                }
                this.commandFactories.put(strAction, new Pair<>(method, cordovaMethod.value()));
                method.setAccessible(true);
            }
        }
    }

    @Override // org.apache.cordova.CordovaPlugin
    public final boolean execute(String str, CordovaArgs cordovaArgs, CallbackContext callbackContext) {
        Pair<Method, ExecutionThread> pair = this.commandFactories.get(str);
        if (pair == null) {
            return false;
        }
        Runnable runnableCreateCommand = createCommand((Method) pair.first, cordovaArgs, callbackContext);
        ExecutionThread executionThread = (ExecutionThread) pair.second;
        if (executionThread == ExecutionThread.WORKER) {
            this.f9cordova.getThreadPool().execute(runnableCreateCommand);
            return true;
        }
        if (executionThread == ExecutionThread.UI) {
            this.f9cordova.getActivity().runOnUiThread(runnableCreateCommand);
            return true;
        }
        runnableCreateCommand.run();
        return true;
    }

    private Runnable createCommand(final Method method, final CordovaArgs cordovaArgs, final CallbackContext callbackContext) {
        return new Runnable() { // from class: by.chemerisuk.cordova.support.ReflectiveCordovaPlugin.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (CordovaArgs.class.isAssignableFrom(method.getParameterTypes()[0])) {
                        method.invoke(ReflectiveCordovaPlugin.this, cordovaArgs, callbackContext);
                    } else {
                        method.invoke(ReflectiveCordovaPlugin.this, callbackContext);
                    }
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof InvocationTargetException) {
                        th = ((InvocationTargetException) th).getTargetException();
                    }
                    LOG.e(ReflectiveCordovaPlugin.TAG, "Uncaught exception at " + getClass().getSimpleName() + "#" + method.getName(), th);
                    callbackContext.error(th.getMessage());
                }
            }
        };
    }
}
