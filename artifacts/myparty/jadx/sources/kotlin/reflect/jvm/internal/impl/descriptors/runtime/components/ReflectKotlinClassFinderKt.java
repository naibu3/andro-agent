package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import org.apache.commons.io.FilenameUtils;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes7.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strReplace$default = StringsKt.replace$default(classId.getRelativeClassName().asString(), FilenameUtils.EXTENSION_SEPARATOR, Typography.dollar, false, 4, (Object) null);
        return classId.getPackageFqName().isRoot() ? strReplace$default : classId.getPackageFqName() + FilenameUtils.EXTENSION_SEPARATOR + strReplace$default;
    }
}
