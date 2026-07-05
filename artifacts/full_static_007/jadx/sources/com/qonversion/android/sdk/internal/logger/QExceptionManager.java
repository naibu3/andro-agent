package com.qonversion.android.sdk.internal.logger;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.qonversion.android.sdk.dto.QonversionError;
import com.qonversion.android.sdk.internal.Constants;
import com.qonversion.android.sdk.internal.ExtensionsKt;
import com.qonversion.android.sdk.internal.InternalConfig;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.qonversion.android.sdk.internal.dto.request.CrashRequest;
import com.qonversion.android.sdk.internal.repository.QRepository;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: QExceptionManager.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/qonversion/android/sdk/internal/logger/QExceptionManager;", "Lcom/qonversion/android/sdk/internal/logger/ExceptionManager;", "repository", "Lcom/qonversion/android/sdk/internal/repository/QRepository;", "intervalConfig", "Lcom/qonversion/android/sdk/internal/InternalConfig;", "headersProvider", "Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/qonversion/android/sdk/internal/repository/QRepository;Lcom/qonversion/android/sdk/internal/InternalConfig;Lcom/qonversion/android/sdk/internal/api/ApiHeadersProvider;Lcom/squareup/moshi/Moshi;)V", "contextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "exceptionAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest$ExceptionInfo;", "reportsDir", "Ljava/io/File;", "getAvailableReportNames", "", "", "getContentOfCrashReport", "filename", "initialize", "", "context", "prepareCrashData", "Lcom/qonversion/android/sdk/internal/dto/request/CrashRequest;", "exception", "sendCrashReportsInBackground", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class QExceptionManager implements ExceptionManager {
    private WeakReference<Context> contextRef;
    private final JsonAdapter<CrashRequest.ExceptionInfo> exceptionAdapter;
    private final ApiHeadersProvider headersProvider;
    private final InternalConfig intervalConfig;
    private File reportsDir;
    private final QRepository repository;

    @Inject
    public QExceptionManager(QRepository repository, InternalConfig intervalConfig, ApiHeadersProvider headersProvider, Moshi moshi) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(intervalConfig, "intervalConfig");
        Intrinsics.checkNotNullParameter(headersProvider, "headersProvider");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.repository = repository;
        this.intervalConfig = intervalConfig;
        this.headersProvider = headersProvider;
        JsonAdapter<CrashRequest.ExceptionInfo> jsonAdapterAdapter = moshi.adapter(CrashRequest.ExceptionInfo.class);
        Intrinsics.checkNotNullExpressionValue(jsonAdapterAdapter, "adapter(...)");
        this.exceptionAdapter = jsonAdapterAdapter;
    }

    @Override // com.qonversion.android.sdk.internal.logger.ExceptionManager
    public void initialize(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File filesDir = context.getFilesDir();
        Intrinsics.checkNotNullExpressionValue(filesDir, "getFilesDir(...)");
        this.reportsDir = filesDir;
        this.contextRef = new WeakReference<>(context);
        if (ExtensionsKt.isDebuggable(context)) {
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        File file = this.reportsDir;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportsDir");
            file = null;
        }
        Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(packageName, defaultUncaughtExceptionHandler, file));
        sendCrashReportsInBackground();
    }

    private final void sendCrashReportsInBackground() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.qonversion.android.sdk.internal.logger.QExceptionManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                QExceptionManager.sendCrashReportsInBackground$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendCrashReportsInBackground$lambda$2(final QExceptionManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        for (final String str : this$0.getAvailableReportNames()) {
            CrashRequest.ExceptionInfo contentOfCrashReport = this$0.getContentOfCrashReport(str);
            if (contentOfCrashReport != null) {
                this$0.repository.crashReport(this$0.prepareCrashData(contentOfCrashReport), new Function0<Unit>() { // from class: com.qonversion.android.sdk.internal.logger.QExceptionManager$sendCrashReportsInBackground$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        WeakReference weakReference = this.this$0.contextRef;
                        if (weakReference == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("contextRef");
                            weakReference = null;
                        }
                        Context context = (Context) weakReference.get();
                        if (context != null) {
                            context.deleteFile(str);
                        }
                    }
                }, new Function1<QonversionError, Unit>() { // from class: com.qonversion.android.sdk.internal.logger.QExceptionManager$sendCrashReportsInBackground$1$1$1$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(QonversionError qonversionError) {
                        invoke2(qonversionError);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(QonversionError error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        Log.e("QExceptionManager", "Failed to send crash report to API - " + error);
                    }
                });
            }
        }
    }

    private final List<String> getAvailableReportNames() {
        List<String> list;
        File file = this.reportsDir;
        File file2 = null;
        if (file == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportsDir");
            file = null;
        }
        if (!file.exists()) {
            File file3 = this.reportsDir;
            if (file3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reportsDir");
                file3 = null;
            }
            if (!file3.mkdir()) {
                return CollectionsKt.emptyList();
            }
        }
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: com.qonversion.android.sdk.internal.logger.QExceptionManager$$ExternalSyntheticLambda1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file4, String str) {
                return QExceptionManager.getAvailableReportNames$lambda$3(file4, str);
            }
        };
        File file4 = this.reportsDir;
        if (file4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("reportsDir");
        } else {
            file2 = file4;
        }
        String[] list2 = file2.list(filenameFilter);
        return (list2 == null || (list = ArraysKt.toList(list2)) == null) ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getAvailableReportNames$lambda$3(File file, String str) {
        Intrinsics.checkNotNull(str);
        return StringsKt.endsWith$default(str, Constants.CRASH_LOG_FILE_SUFFIX, false, 2, (Object) null);
    }

    private final CrashRequest.ExceptionInfo getContentOfCrashReport(String filename) {
        WeakReference<Context> weakReference = this.contextRef;
        if (weakReference == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contextRef");
            weakReference = null;
        }
        Context context = weakReference.get();
        if (context == null) {
            return null;
        }
        File fileStreamPath = context.getFileStreamPath(filename);
        if (fileStreamPath != null) {
            if (!fileStreamPath.exists()) {
                fileStreamPath = null;
            }
            if (fileStreamPath != null) {
                StringBuilder sb = new StringBuilder();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(filename)));
                    try {
                        BufferedReader bufferedReader2 = bufferedReader;
                        while (true) {
                            String line = bufferedReader2.readLine();
                            if (line == null) {
                                break;
                            }
                            StringBuilder sbAppend = sb.append(line);
                            Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
                            Intrinsics.checkNotNullExpressionValue(sbAppend.append('\n'), "append(...)");
                        }
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(bufferedReader, null);
                    } finally {
                    }
                } catch (IOException e) {
                    Log.e("QExceptionManager", "Failed to read crash report from the file", e);
                }
                try {
                    return this.exceptionAdapter.fromJson(sb.toString());
                } catch (Exception e2) {
                    Log.e("QExceptionManager", "Failed to parse JSON from the crash report file", e2);
                    return null;
                }
            }
        }
        return null;
    }

    private final CrashRequest prepareCrashData(CrashRequest.ExceptionInfo exception) {
        return new CrashRequest(exception, new CrashRequest.DeviceInfo(this.headersProvider.getPlatform(), this.headersProvider.getPlatformVersion(), this.headersProvider.getSource(), this.headersProvider.getSourceVersion(), this.headersProvider.getProjectKey(), this.intervalConfig.getUid()));
    }
}
