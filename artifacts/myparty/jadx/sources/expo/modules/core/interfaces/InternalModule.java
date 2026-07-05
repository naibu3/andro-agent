package expo.modules.core.interfaces;

import java.util.List;

/* loaded from: classes6.dex */
public interface InternalModule extends RegistryLifecycleListener {
    List<? extends Class> getExportedInterfaces();
}
